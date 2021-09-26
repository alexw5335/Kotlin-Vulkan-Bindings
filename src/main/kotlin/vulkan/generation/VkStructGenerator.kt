package vulkan.generation

import codegen.CodeWriter.Companion.with
import codegen.KWriter
import memory.NativeSizes
import memory.Primitive
import memory.Unsafe
import memory.allocation.Allocator
import memory.struct.LayoutBuilder
import memory.type.Addressable
import memory.type.DirectBuffer
import vulkan.generation.VkDocUtils.formatDoc
import vulkan.scraper.element.VkVar
import vulkan.scraper.type.*
import java.lang.IllegalStateException
import java.nio.file.Path
import kotlin.io.path.div

object VkStructGenerator {


	fun generate(directory: Path, packageName: String, structs: Iterable<VkTypeStruct>) {
		for(s in structs)
			if(!s.aliased)
				printStruct(directory, packageName, s)
	}



	/*
	Member generation
	 */



	private val VkVar.unsafeGetter get() = "Unsafe.${type.primitive.unsafeGetter}"

	private val VkVar.unsafeSetter get() = "Unsafe.${type.primitive.unsafeSetter}"
	
	private val VkVar.memString get() = "address + LAYOUT.offsets[${index}]"

	private val pointerGetter = "Unsafe.${Primitive.POINTER.unsafeGetter}"

	private val pointerSetter = "Unsafe.${Primitive.POINTER.unsafeSetter}"

	private val pointerBuffer = Primitive.POINTER.bufferName

	
	
	private val VkVar.memberString: String get() = when {
		// Edge-case for VkDisplayPropertiesKHR and VkPerformanceValueDataINTEL.
		// These are char pointers but for some reason are not prefixed with 'p'.
		// Given that convenience members are created by removing the 'p' in order to differentiate them from their
		// pointers, these variables are instead replaced by their convenience members.
		isStringPointer && !name.startsWith("p") -> """
			var $validName: ${Primitive.BYTE.bufferName}
				get()      = Unsafe.getBytesNT($pointerGetter($memString))
				set(value) { $pointerSetter($memString, value.address) }
		"""

		isPointer -> """
			var $validName: Long
				get()      = $pointerGetter($memString)
				set(value) { $pointerSetter($memString, value) }
		"""

		isArray -> when(type) {
			// 4 occurrences in: VkImageBlit and VkPhysicalDeviceMemoryProperties
			is VkTypeStruct -> """
				var $validName: $typeName.Buffer
					get()      = $typeName.Buffer($memString, $constLen)
					set(value) { Unsafe.copy(value.address, $memString, value.byteSize) }
			"""

			else -> """
				var $validName: $primitiveBufferName
					get()      = $primitiveBufferName($memString, $constLen)
					set(value) { Unsafe.copy(value.address, $memString, value.byteSize) }
			"""
		}

		else -> when(type) {
			is VkTypeStruct -> """
				var $validName: $typeName
					get()      = $typeName($memString)
					set(value) { Unsafe.copy(value.address, $memString, value.structSize) }
			"""

			is VkTypeEnum -> {
				"""
				var $validName: $typeName
					get()      = $typeName($unsafeGetter($memString))
					set(value) { $unsafeSetter($memString, value.${type.valueString}) }
			"""}

			is VkTypeBitmask -> """
				var $validName: $typeName
					get()      = $typeName($unsafeGetter($memString))
					set(value) { $unsafeSetter($memString, value.bitfield) }
			"""

			is VkTypeHandle -> """
				var $validName: $typeName
					get()      = $typeName($pointerGetter($memString))
					set(value) { $pointerSetter($memString, value.address) }
			"""

			else -> """
				var $validName: $typeName
					get()      = $unsafeGetter($memString)
					set(value) { $unsafeSetter($memString, value) }
			"""
		}
	}



	/*
	Layout generation
	 */



	private val VkVar.sizeString: String get() = when {
		isPointer -> "member(${Primitive.POINTER.sizeString})"

		// Struct arrays (that aren't pointers) always include a constant length.
		isArray -> when(type) {
			is VkTypeStruct 	-> "array(${type.shortName}.LAYOUT, $constLen)"
			else  				-> "array(${type.primitive.sizeString}, $constLen)"
		}

		else -> when(type) {
			is VkTypeStruct		-> "member(${type.shortName}.LAYOUT)"
			else				-> "member(${type.primitive.sizeString})"
		}
	}



	/*
	Convenience variable generation
	 */



	private val VkVar.setterLengthString: String get() = when {
		varLen != null 	-> "; $varLen = " + if(varLenIsLong) "value.capacity.toLong()" else "value.capacity"
		else 			-> ""
	}



	private val VkVar.arrayLengthString: String get() = when {
		constLen != null	-> constLen.toString()
		varLen != null 		-> if(varLenIsLong) "$varLen.toInt()" else varLen
		else 				-> throw RuntimeException("No array length specified: $this")
	}



	private val VkVar.canHaveConvenienceMember get() = when {
		// Edge case. Naming conflict with pGeometries.
		name == "ppGeometries" 	-> false

		name == "pNext" -> false

		// Edge case for VkDisplayPropertiesKHR and VkPerformanceValueDataINTEL.
		// char* members that are not suffixed by 'p'. Their normal members are replaced by convenience members.
		isStringPointer && !name.startsWith("p") -> false

		// No easily determined array length.
		isPointerToArray &&
			constLen == null &&
			varLen == null &&
			!isStringPointer -> false

		// Otherwise, this is not a pointer. Only pointers may have convenience members.
		else -> isPointer
	}



	private val VkVar.convenienceMemberString: String? get() = when {
		!canHaveConvenienceMember -> null

		// Null-terminated UTF-8 char pointer.
		isStringPointer -> """
			var $nonPointerName: ${Primitive.BYTE.bufferName}
				get()      = Unsafe.getBytesNT($pointerGetter($memString))
				set(value) { $pointerSetter($memString, value.address) }
		"""

		// There are only two of these, so they are hardcoded.
		isPointerToPointerArray -> when(name) {
			"ppEnabledLayerNames" -> """
				var enabledLayerNames: $pointerBuffer
					get()      = $pointerBuffer($pointerGetter($memString), enabledLayerCount)
					set(value) { ppEnabledLayerNames = value.address; enabledLayerCount = value.capacity }
			"""

			"ppEnabledExtensionNames" -> """
				var enabledExtensionNames: $pointerBuffer
					get()      = $pointerBuffer($pointerGetter($memString), enabledExtensionCount)
					set(value) { ppEnabledExtensionNames = value.address; enabledExtensionCount = value.capacity }
			"""

			// Exception since 'ppGeometries' would be shortened to 'pGeometries', which is already another variable.
			"ppGeometries" -> null

			else -> throw RuntimeException("Unaccounted-for pointer to array of pointers variable: $name")
		}

		isPointerToArray -> when(type) {
			is VkTypeStruct -> """
				var $nonPointerName: $typeName.Buffer
					get()      = $typeName.Buffer($pointerGetter($memString), $arrayLengthString)
					set(value) { $pointerSetter($memString, value.address)$setterLengthString }
			"""

			else -> """
				var $nonPointerName: $primitiveBufferName
					get()      = $primitiveBufferName($pointerGetter($memString), $arrayLengthString)
					set(value) { $pointerSetter($memString, value.address)$setterLengthString }
			"""
		}

		isPointer -> when(type) {
			is VkTypeStruct	-> """
				var $nonPointerName: $typeName
					get()      = $typeName($pointerGetter($memString))
					set(value) { $pointerSetter($memString, value.address) }
			"""

			else -> null
		}

		else -> null
	}



	/*
	Persistent member generation
	 */



	private val VkVar.canHavePersistentMember: Boolean get() = when {
		// void pointers cannot be de-referenced as there is no way to decode their information.
		type is VkTypeVoid -> false

		// Edge-case for VkBaseInStructure and VKBaseOutStructure. Their pNext values are not void*.
		name == "pNext" -> false

		// Null-terminated UTF-8 char* is decoded into a string.
		isStringPointer -> true

		// No easily determined array length.
		isPointerToArray && !canHaveConvenienceMember -> false

		// Edge-cases for VkInstanceCreateInfo and VkDeviceCreateInfo.
		name.startsWith("pp") -> false

		// Only dereference struct pointers.
		isPointer && type !is VkTypeStruct -> false

		// Any primitives, enums, and bitmasks can be easily made persistent.
		else -> true
	}



	private val VkVar.persistentMemberString: String? get() = when {
		!canHavePersistentMember -> null

		isStringPointer -> "$nonPointerName: String"

		// Special case for char arrays (not pointers), that would otherwise be given as a ByteArray.
		isArray &&
			!isPointer &&
			type.name == "char" -> "$validName: String"

		isArray -> when(type) {
			is VkTypeStruct 	-> "$nonPointerName: List<$typeName.Persistent>"
			is VkTypeEnum 		-> "$nonPointerName: List<$typeName>"
			is VkTypeBitmask 	-> "$nonPointerName: List<$typeName>"
			is VkTypeHandle 	-> "$nonPointerName: List<$typeName>"
			is VkTypePrimitive 	-> "$nonPointerName: ${type.primitive.arrayName}"
			else 				-> "$nonPointerName: ${type.primitive.arrayName}"
		}

		// Only dereference struct pointers.
		isPointer -> when(type) {
			is VkTypeStruct -> "$nonPointerName: $typeName.Persistent"
			else -> null
		}

		else -> when(type) {
			is VkTypeStruct 	-> "$validName: $typeName.Persistent"
			is VkTypeEnum 		-> "$validName: $typeName"
			is VkTypeBitmask 	-> "$validName: $typeName"
			is VkTypeHandle 	-> "$validName: $typeName"
			is VkTypePrimitive 	-> "$validName: $typeName"
			else 				-> "$validName: $typeName"
		}
	}



	private val VkVar.persistentArgumentString: String? get() = when {
		!canHavePersistentMember -> null

		// Edge-case for VkDisplayPropertiesKHR and VkPerformanceValueDataINTEL.
		// See the memberString function for more details.
		isStringPointer && !name.startsWith("p") -> "Unsafe.decodeUtf8NT($pointerGetter($memString))"

		isStringPointer -> "Unsafe.decodeUtf8NT($validName)"

		// Special case for char arrays (not pointers), that would otherwise be given as a ByteArray.
		isArray &&
			!isPointer &&
			type.name == "char" -> "Unsafe.decodeUtf8($validName)"

		isArray -> when(type) {
			is VkTypeStruct 	-> "$nonPointerName.asPersistentList"
			is VkTypeEnum 		-> "$nonPointerName.map { $typeName(it) }"
			is VkTypeBitmask 	-> "$nonPointerName.map { $typeName(it) }"
			is VkTypeHandle 	-> "$nonPointerName.map { $typeName(it) }"
			is VkTypePrimitive 	-> "$nonPointerName.asArray"
			else 				-> "$nonPointerName.asArray"
		}

		isPointer -> when(type) {
			is VkTypeStruct -> "$typeName($validName).asPersistent"
			else -> null
		}

		else -> when(type) {
			is VkTypeStruct -> "$validName.asPersistent"
			else -> validName
		}
	}



	private fun printStruct(
		directory	: Path,
		packageName	: String,
		struct		: VkTypeStruct
	) = KWriter(directory/"${struct.genName}.kt").with {

		val name = struct.genName

		start {
			autogenComment()
			package_(packageName)

			qualifiedImports(
				NativeSizes::class,
				DirectBuffer::class,
				LayoutBuilder::class,
				Allocator::class,
				Unsafe::class,
				Addressable::class
			)

			imports(
				"vulkan.generated.enumeration.*",
				"memory.primitive.*",
				"vulkan.generated.handle.*"
			)
		}

		doc(struct.formatDoc)
		annotation("JvmInline")
		class_("value class $name(override val address: Long) : Addressable") {
			group(1) {
				for(m in struct.members) 
					declaration { 
						m.memberString.trimIndent().lines().forEach(::writeln) 
					}
			}

			if(struct.members.any { it.canHaveConvenienceMember }) {
				group(1) {
					for(m in struct.members) {
						val string = m.convenienceMemberString ?: continue

						declaration {
							string.trimIndent().lines().forEach(::writeln)
						}
					}
				}
			}

			if(struct.usedInArray) {
				class_("class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer", style(1, 1)) {
					declaration("constructor(address: Long, capacity: Long) : this(address, capacity.toInt())")
					declaration("override val elementSize get() = SIZE")
					if(struct.hasPersistent)
						declaration("val asPersistentList get() = List(capacity) { get(it).asPersistent }")
					declaration("operator fun get(index: Int) = $name(offset(index))")
					declaration("operator fun set(index: Int, value: $name) = Unsafe.copy(value.address, offset(index), SIZE)")
					declaration("inline fun forEach(block: ($name) -> Unit) = repeat(capacity) { block(get(it)) }")
					declaration("inline fun<R> map(block: ($name) -> R) = List(capacity) { block(get(it)) }")
					declaration("override fun toString() = \"$name[\$capacity]\"")
				}
			}

			if(struct.hasPersistent) {
				val persistentMembers = struct.members.filter { it.canHavePersistentMember }

				declaration {
					writeln("class Persistent(")
					indented {
						for(m in persistentMembers) m.persistentMemberString?.let {
							writeln("val $it,")
						}
					}
					writeln(") {")
					indented {
						writeln("override fun toString() = \"${struct.genName}(\" + ")

						for((i, m) in persistentMembers.withIndex()) {
							write("\t\"${m.nonPointerName}=\$${m.nonPointerName}")
							if(i == persistentMembers.lastIndex) writeln(")\"") else writeln(", \" +")
						}
					}
					writeln("}")
				}

				declaration {
					writeln("val asPersistent get() = Persistent(")
					indented {
						for(m in struct.members) m.persistentArgumentString?.let {
							writeln("$it, ")
						}
					}
					writeln(')')
				}
			}

			group(1) {
				if(struct.usedInArray)
					declaration("val asBuffer get() = Buffer(address, 1)")
				declaration("val structSize get() = SIZE")
				declaration("val structAlignment get() = ALIGNMENT")
			}

			companion_ {
				declaration {
					val layoutString = if(struct.isUnion) "buildUnion" else "buildStruct"
					writeln("val LAYOUT = LayoutBuilder.$layoutString {")
					indented {
						for(m in struct.members)
							writeln(m.sizeString)
					}
					writeln('}')
				}

				declaration("val SIZE = LAYOUT.size")
				declaration("val ALIGNMENT = LAYOUT.alignment")
				declaration("val NULL = $name(0)")

				if(struct.usedInArray)
					declaration("val EMPTY = Buffer(0, 0)")

				if(struct.sTypeValue != null) {
					function("fun malloc(allocator: Allocator) = ${struct.genName}(allocator.malloc(SIZE, ALIGNMENT)).also") {
						writeln("it.sType = StructureType.${struct.sTypeValue}")
					}

					function("fun calloc(allocator: Allocator) = ${struct.genName}(allocator.calloc(SIZE, ALIGNMENT)).also") {
						writeln("it.sType = StructureType.${struct.sTypeValue}")
					}

					if(struct.usedInArray) {
						function("fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply") {
							writeln("forEach { it.sType = StructureType.${struct.sTypeValue} }")
						}

						function("fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply") {
							writeln("forEach { it.sType = StructureType.${struct.sTypeValue} }")
						}
					}
				} else {
					declaration("fun malloc(allocator: Allocator) = ${struct.genName}(allocator.malloc(SIZE, ALIGNMENT))")
					declaration("fun calloc(allocator: Allocator) = ${struct.genName}(allocator.calloc(SIZE, ALIGNMENT))")

					if(struct.usedInArray) {
						declaration("fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)")
						declaration("fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)")
					}
				}
			}
		}
	}


}