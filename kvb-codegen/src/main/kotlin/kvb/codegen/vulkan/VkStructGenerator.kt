package kvb.codegen.vulkan

import kvb.codegen.*
import kvb.codegen.vulkan.VkDocUtils.docStrings
import kvb.codegen.vulkan.scraper.element.VkVar
import kvb.codegen.vulkan.scraper.type.*
import kvb.codegen.writer.KWriter
import kvb.codegen.writer.procedural.Primitive
import kvb.core.memory.Addressable
import kvb.core.memory.Allocator
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

object VkStructGenerator {


	fun generate(structs: Iterable<VkTypeStruct>) {
		for(s in structs)
			printStruct(s)
	}



	/*
	Member generation
	 */



	private val VkVar.memString get() = "address + ${struct!!.layout64.offsets[index]}"

	private val VkVar.unsafeGetter get() = "Unsafe.${type.primitive.unsafeGetter}"

	private val VkVar.unsafeSetter get() = "Unsafe.${type.primitive.unsafeSetter}"

	private val pointerGetter get() = "Unsafe.getLong"

	private val pointerSetter get() = "Unsafe.setLong"
	
	private val pointerBuffer get() = "DirectLongBuffer"



	private val VkVar.memberString: String get() = when {
		// sType is set in malloc and calloc, so it only takes raw ints.
		name == "sType" -> """
			var $name: Int
				get()      = $unsafeGetter($memString)
				set(value) = $unsafeSetter($memString, value)
		"""

		isPointer -> """
			var $name: Long
				get()      = $pointerGetter($memString)
				set(value) = $pointerSetter($memString, value)
		"""
		
		isArray -> when(type) {
			is VkTypeStruct -> """
				var $name: $typeName.Buffer
					get()      = $typeName.Buffer($memString, $constLen)
					set(value) = Unsafe.copy(value.address, $memString, value.byteSize)
			"""
			
			else -> """
				var $name: $primitiveBufferName
					get()      = $primitiveBufferName($memString, $constLen)
					set(value) = Unsafe.copy(value.address, $memString, value.byteSize)
			"""
		}
		
		else -> when(type) {
			is VkTypeStruct -> """
				var $name: $typeName
					get()      = $typeName($memString)
					set(value) = Unsafe.copy(value.address, $memString, ${type.size64})
			"""

			is VkTypeEnum -> when {
				!type.shouldGen -> """
					var $name: $typeName
						get()      = $unsafeGetter($memString)
						set(value) = $unsafeSetter($memString, value)
				"""

				type.isFlagBits -> """
					var $name: $typeName
						get()      = $typeName($unsafeGetter($memString))
						set(value) = $unsafeSetter($memString, value.value)
				"""

				type.isExtraGen ->	"""
					var $name: $typeName
						get()      = $typeName($unsafeGetter($memString))
						set(value) = $unsafeSetter($memString, value.value)
				"""

				else -> """
					var $name: $typeName
						get()      = _$typeName($unsafeGetter($memString))
						set(value) = $unsafeSetter($memString, value.value)
				"""
			}

			is VkTypeBitmask -> when {
				!type.shouldGen -> """
					var $name: $typeName
						get() = $unsafeGetter($memString)
						set(value) = $unsafeSetter($memString, value)
				"""

				else -> """
					var $name: $typeName
						get()      = $typeName($unsafeGetter($memString))
						set(value) = $unsafeSetter($memString, value.value)
				"""
			}
			
			is VkTypeHandle -> """
				var $name: $typeName
					get()      = $typeName($pointerGetter($memString))
					set(value) = $pointerSetter($memString, value.address)
			"""
			
			else -> """
				var $name: $typeName
					get()      = $unsafeGetter($memString)
					set(value) = $unsafeSetter($memString, value)
			"""
		}
	}
	
	
	
	/*
	Convenience member generation
	 */



	private val VkVar.setterLengthString: String get() = when {
		varLen == null                                -> ""
		varLenVariable.type.primitive.kName == "Long" -> "; $varLen = value.capacity.toLong()"
		varLenVariable.type.primitive.kName == "Int"  -> "; $varLen = value.capacity"
		else                                          -> throw RuntimeException("Invalid variable array length.")
	}



	private val VkVar.arrayLengthString: String get() = when {
		constLen != null                              -> constLen.toString()
		varLen == null                                -> throw RuntimeException("No array length specified: $this")
		varLenVariable.type.primitive.kName == "Long" -> "$varLen.toInt()"
		varLenVariable.type.primitive.kName == "Int"  -> "$varLen"
		else                                          -> throw RuntimeException("Invalid variable array length.")
	}
	
	
	
	private val VkVar.hasConvenienceMember get() = when {
		// All string pointers that are prefixed with 'p' are generated.
		// Edge-case for VkDisplayPropertiesKHR and VkPerformanceValueDataINTEL.
		// These are char pointers but for some reason are not prefixed with 'p'.
		// Convenience members are created by removing the 'p' in order to differentiate them from their pointers
		// So, no convenience members are generated as this would cause naming conflicts.
		isStringPointer -> name.startsWith('p')

		// All pointer pointer arrays are generated except ppGeometries due to naming conflicts with pGeometries.
		isPointerToPointerArray -> name != "ppGeometries"

		// Pointers to arrays have convenience members unless they don't have an easily determined length.
		isPointerToArray -> constLen != null || varLen != null

		// All struct pointers have convenience members except pNext values.
		isPointer -> name != "pNext" && type is VkTypeStruct

		// Only pointers may have convenience members.
		else -> false
	}



	private val VkVar.convenienceMemberString: String get() = when {
		// Null-terminated UTF8-8 char*.
		isStringPointer -> """
			var $nonPointerName:  ${Primitive.BYTE.bufferName}
				get()      = Unsafe.getBytesNT($pointerGetter($memString))
				set(value) = $pointerSetter($memString, value.address)
		"""

		// There are only two of these, so they are hardcoded.
		// ppGeometries should not have a convenience member.
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

		// Only struct pointers have convenience members.
		isPointer -> when(type) {
			is VkTypeStruct	-> """
				var $nonPointerName: $typeName
					get()      = $typeName($pointerGetter($memString))
					set(value) { $pointerSetter($memString, value.address) }
			"""

			else -> throw RuntimeException("Unexpected convenience member: $name")
		}

		else -> throw RuntimeException("Unexpected convenience member: $name")
	}



	/*
	Generation
	 */



	private fun printStruct(struct: VkTypeStruct) = KWriter.write(vulkanDir, struct.genName) {
		start {
			autogenComment()
			package_(vulkanPackage)

			imports(
				DirectBuffer::class,
				Allocator::class,
				Unsafe::class,
				Addressable::class,
				"$primitivePackage.*"
			)
		}

		val name = struct.genName

		doc(struct.docStrings)
		annotation("JvmInline")
		class_("value class $name(override val address: Long) : Addressable") {
			// Members
			group(1) {
				for(m in struct.members)
					multilineDeclaration(m.memberString)
			}

			// Convenience members
			if(struct.members.any { it.hasConvenienceMember } ) {
				group(1) {
					for(m in struct.members)
						if(m.hasConvenienceMember)
							multilineDeclaration(m.convenienceMemberString)
				}
			}

			// Buffer
			if(struct.requiresBuffer) {
				class_("class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer", style(1, 1)) {
					declaration("constructor(address: Long, capacity: Long) : this(address, capacity.toInt())")
					declaration("override val elementSize get() = ${struct.size64}")
					declaration("val asList get() = List(capacity, ::get)")
					declaration("operator fun get(index: Int) = $name(offset(index))")
					declaration("operator fun set(index: Int, value: $name) = Unsafe.copy(value.address, offset(index), ${struct.size64})")
					declaration("inline fun forEach(block: ($name) -> Unit) = repeat(capacity) { block(get(it)) }")
					declaration("inline fun<R> map(block: ($name) -> R) = List(capacity) { block(get(it)) }")
					declaration("inline fun<R> mapIndexed(block: (Int, $name) -> R) = List(capacity) { block(it, get(it)) }")
				}

				declaration("val asBuffer get() = Buffer(address, 1)")
			}
		}
	}

	
}