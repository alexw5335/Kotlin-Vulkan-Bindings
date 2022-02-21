package codegen.vulkan

import codegen.vulkan.parse.CommandElement
import codegen.vulkan.scrape.*
import codegen.writer.*
import kvb.core.memory.*
import java.nio.file.Files
import java.nio.file.Path

class VulkanGenerator(
	private val registry: ScrapedRegistry,
	private val directory: Path,
	private val cDirectory: Path,
	private val packageName: String,
) {


	init {
		Files.createDirectories(directory)
		Files.createDirectories(cDirectory)
	}



	private val enums = registry.types.filterIsInstance<EnumType>()

	private val bitmasks = registry.types.filterIsInstance<BitmaskType>()

	private val structs = registry.types.filterIsInstance<StructType>()

	private val handles = registry.types.filterIsInstance<HandleType>()


	
	/*
	Writer utils
	 */



	private inline fun write(name: String, block: KWriter.() -> Unit) = KWriter.write(directory, name, block)

	private fun KWriter.vulkanPackage() = package_(packageName)

	private fun KWriter.topLevelFileComment() = comment(
		"This file's name has been prefixed with '_' so that it appears at the top of the package."
	)

	private val primitivePackage = "kvb.core.memory.direct"



	/*
	Documentation
	 */



	private val Var.docType: String get() = when {
		isPointerToPointerArray -> type.name + "**"
		isPointer               -> type.name + "*"
		else                    -> type.name
	}



	private val Var.docName: String get() = when {
		isPointer && mustBeNull -> "$name (must be null)"
		mustBeNull              -> "$name (reserved, must be zero)"

		isPointerToArray -> name

		isArray -> when {
			constLen != null -> "$name[$constLen]"
			varLen != null   -> "$name[$varLen]"
			altLen != null   -> "$name[$altLen]"
			else             -> "$name[]"
		}

		else -> name
	}



	val StructType.docStrings get() = ArrayList<String>().also { list ->
		val maxLength = members.maxOfOrNull { it.docType.length + 2 } ?: 0

		list.add("    // provided by ${registry.namesToProviders[name]!!.name}\n")

		if(isUnion)
			list.add("    union $name {")
		else
			list.add("    struct $name {")

		for(m in members) {
			val type = m.docType
			var string = "        ${m.docType}"
			repeat(maxLength - type.length) { string += ' ' }
			string += m.docName
			list.add(string)
		}

		list.add("    }")

		if(pNext.isNotEmpty()) {
			list.add("")
			list.add("    Valid pNext types:")
			for(v in pNext) {
				list.add("        - ${v.name}")
			}
		}
	}



	val EnumType.docStrings get() = ArrayList<String>().also { list ->
		val maxLength = entries.maxOfOrNull { it.name.length + 2} ?: 0

		list.add("    // provided by ${registry.namesToProviders[name]!!.name}\n")
		list.add("    enum $name {")

		for(e in entries) {
			var string = "        ${e.name}"
			repeat(maxLength - e.name.length) { string += ' ' }
			string += "= ${e.value}"
			list.add(string)
		}

		list.add("    }")
	}



	/*
	Constants
	 */



	fun genConstants() = write("_Constants") {
		start {
			autogenComment()
			topLevelFileComment()
			suppressFile("Unused")
			vulkanPackage()
		}

		group(1) {
			for(constant in registry.constants)
				if(constant.shouldGen)
					declaration("const val ${constant.genName} = ${constant.value}")
			declaration("fun VK_BOOL(value: Boolean) = if(value) VK_TRUE else VK_FALSE")
		}
	}



	/*
	Enums
	 */



	private val EnumType.isValue get() = name == "VkResult" || name == "VkObjectType" || name == "VkFormat"



	fun genEnums() {
		genEnumConstructors()
		genBitmaskBlocks()

		for(enum in enums)
			if(!enum.isFlagBits)
				if(enum.isValue)
					genValueEnum(enum)
				else
					genEnum(enum)

		for(bitmask in bitmasks)
			genBitmask(bitmask)
	}



	private fun genEnumConstructors() = write("_Enums") {
		start {
			autogenComment()
			topLevelFileComment()
			suppressFile("Unused", "FunctionName")
			vulkanPackage()
		}

		styled(style(1, 0)) {
			for(enum in enums) {
				if(enum.isFlagBits || enum.isValue) continue

				declaration {
					write("internal fun _${enum.genName}(value: Int) = when(value)")
					braced {
						for(entry in enum.entries) {
							if(!entry.shouldGen) continue
							writeln("${entry.value} -> ${enum.genName}.${entry.genName}")
						}

						writeln("else -> throw RuntimeException(\"Invalid enum: \$value\")")
					}
				}
			}
		}
	}



	private fun genEnum(enum: EnumType) = write(enum.genName) {
		start {
			autogenComment()
			vulkanPackage()
		}

		val entries = enum.entries.filter { it.shouldGen }

		doc(enum.docStrings)
		suppress("unused")
		class_("enum class ${enum.genName}(val value: Int)") {
			enums(entries.map {
				"${it.genName}(${it.value})"
			})
		}
	}



	private fun genValueEnum(enum: EnumType) = write(enum.genName) {
		start {
			autogenComment()
			vulkanPackage()
		}

		val entries = enum.entries.filter { it.shouldGen }

		doc(enum.docStrings)
		suppress("unused")
		annotation("JvmInline")
		class_("value class ${enum.genName}(val value: Int)") {
			companion_ {
				for(entry in entries)
					declaration("val ${entry.genName} = ${enum.genName}(${entry.value})")
			}

			function("override fun toString() = when(value)") {
				for(entry in entries)
					writeln("${entry.value} -> \"${entry.genName}\"")
				writeln("else -> \"*INVALID*\"")
			}
		}
	}



	/*
	Bitmasks
	 */



	private fun genBitmaskBlocks() = write("_Bitmasks") {
		start {
			autogenComment()
			topLevelFileComment()
			suppressFile("Unused", "FunctionName")
			vulkanPackage()
		}

		styled(style(1, 0)) {
			for(b in bitmasks) {
				if(!b.shouldGen) continue
				declaration("inline fun ${b.genName}(block: ${b.genName}.Companion.() -> ${b.genName}) = block(${b.genName})")
			}
		}
	}



	private fun genBitmask(bitmask: BitmaskType) = write(bitmask.genName) {
		start {
			autogenComment()
			vulkanPackage()
		}

		val name = bitmask.genName
		val primitive = if(bitmask.is64Bit) "Long" else "Int"
		val enum = enums.first { it.name == bitmask.enumName }
		val entries = enum.entries.filter { it.shouldGen }

		doc(enum.docStrings)
		suppress("unused")
		annotation("JvmInline")
		class_("value class $name(val value: $primitive)") {
			companion_ {
				for(entry in entries)
					declaration("val ${entry.genName} = $name(${entry.value})")
			}

			group(1) {
				declaration("operator fun plus(mask: $name) = $name(value or mask.value)")
				declaration("operator fun contains(mask: $name) = value and mask.value == mask.value")
			}
		}
	}



	/*
	Handles
	 */



	fun genHandles() = write("_Handles") {
		start {
			autogenComment()
			topLevelFileComment()
			vulkanPackage()
			imports(Addressable::class)
		}

		for(handle in handles) {
			doc("Implementation of ${handle.name}")
			declaration("open class ${handle.genName}(override val address: Long) : Addressable")
		}
	}



	fun genUtilClasses() = write("_Utils") {
		start {
			autogenComment()
			topLevelFileComment()
			vulkanPackage()
		}

		doc("An abstraction of the macros VK_VERSION_MAJOR, VK_VERSION_MINOR, and VK_VERSION_PATCH.")
		annotation("JvmInline")
		class_("value class Version(val value: Int)") {
			declaration("constructor(major: Int, minor: Int, patch: Int) : this((major shl 22) or (minor shl 12) or patch)")
			declaration("val major get() = value shr 22")
			declaration("val minor get() = value shr 12 and 0x3FF")
			declaration("val patch get() = value and 0xFFF")
			declaration("override fun toString() = \"Version(\$major, \$minor, \$patch)\"")
		}
	}



	/*
	Structs
	 */



	fun genStructs() {
		for(s in structs)
			genStruct(s)
	}



	/*
	Member generation
	 */



	private val Var.memString get() = "address + ${struct!!.layout64.offsets[index]}"

	private val Var.unsafeGetter get() = "Unsafe.${type.primitive.unsafeGetter}"

	private val Var.unsafeSetter get() = "Unsafe.${type.primitive.unsafeSetter}"

	private val pointerGetter get() = "Unsafe.getLong"

	private val pointerSetter get() = "Unsafe.setLong"

	private val pointerBuffer get() = "DirectLongBuffer"



	private val Var.memberString: String get() = when {
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
			is StructType -> """
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
			is StructType -> """
				var $name: $typeName
					get()      = $typeName($memString)
					set(value) = Unsafe.copy(value.address, $memString, ${type.size64})
			"""

			is EnumType -> when {
				!type.shouldGen -> """
					var $name: $typeName
						get()      = $unsafeGetter($memString)
						set(value) = $unsafeSetter($memString, value)
				"""

				type.isFlagBits || type.isValue -> """
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

			is BitmaskType -> when {
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

			is HandleType -> """
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



	private val Var.setterLengthString: String get() = when {
		varLen == null                                  -> ""
		varLenVariable.type.primitive == Primitive.LONG -> "; $varLen = value.capacity.toLong()"
		varLenVariable.type.primitive == Primitive.BYTE -> "; $varLen = value.capacity.toByte()"
		else                                            -> "; $varLen = value.capacity"
	}



	private val Var.arrayLengthString: String get() = when {
		constLen != null                                -> constLen.toString()
		varLen == null                                  -> throw RuntimeException("No array length specified: $this")
		varLenVariable.type.primitive == Primitive.LONG -> "$varLen.toInt()"
		varLenVariable.type.primitive == Primitive.BYTE -> "$varLen.toInt()"
		else                                            -> "$varLen"
	}



	private val Var.hasConvenienceMember get() = when {
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
		isPointer -> name != "pNext" && type is StructType

		// Only pointers may have convenience members.
		else -> false
	}



	private val Var.convenienceMemberString: String get() = when {
		// Null-terminated UTF8-8 char*.
		isStringPointer -> """
			var $nonPointerName:  ${Primitive.BYTE.bufferName}
				get()      = Unsafe.getBytesNT($pointerGetter($memString))
				set(value) = $pointerSetter($memString, value.address)
		"""

		// Hardcoded
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

			"pParams" -> """
				var params: $pointerBuffer
					get()      = $pointerBuffer($pointerGetter($memString), paramCount)
					set(value) { pParams = value.address; paramCount = value.capacity.toLong() }
			"""

			"pExtras" -> """
				var extras: $pointerBuffer
					get()      = $pointerBuffer($pointerGetter($memString), extraCount)
					set(value) { pExtras = value.address; extraCount = value.capacity.toLong() }
			"""

			else -> throw RuntimeException("Unaccounted-for pointer to array of pointers variable: ${struct!!.name}::$name")
		}

		isPointerToArray -> when(type) {
			is StructType -> """
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
			is StructType	-> """
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



	private fun genStruct(struct: StructType) = write(struct.genName) {
		start {
			autogenComment()
			vulkanPackage()

			imports(
				if(struct.requiresBuffer) DirectBuffer::class else null,
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
	
	
	
	/*
	Struct allocations
	 */
	
	
	
	fun genStructAllocations() = write("_Allocations") {
		start {
			autogenComment()
			topLevelFileComment()
			suppressFile("Unused", "FunctionName")
			vulkanPackage()
			imports(Allocator::class)
		}

		currentStyle = style(decSpacing = 1)

		for(s in structs) {
			if(!s.shouldGen) continue

			val type = s.genName

			if(s.sType != null) {
				declaration("inline fun Allocator.$type(block: ($type) -> Unit) = $type(calloc(${s.size64})).apply(block).also { it.sType = ${s.sType} }")

				if(s.requiresBuffer)
					declaration("inline fun Allocator.$type(capacity: Int, block: ($type.Buffer) -> Unit) = $type.Buffer(calloc(capacity * ${s.size64}), capacity).apply(block).apply { forEach { it.sType = ${s.sType} } }")
			} else {
				declaration("inline fun Allocator.$type(block: ($type) -> Unit) = $type(calloc(${s.size64})).apply(block)")

				if(s.requiresBuffer)
					declaration("inline fun Allocator.$type(capacity: Int, block: ($type.Buffer) -> Unit) = $type.Buffer(calloc(capacity * ${s.size64}), capacity).apply(block)")
			}
		}
	}


	
	/*
	Commands
	 */
	


	/*
	Parameter and argument strings
	 */



	private val Var.paramType: String get() = when {
		isArray -> when(type) {
			is EnumType      -> primitiveBufferName.makeOptional
			is BitmaskType   -> primitiveBufferName.makeOptional
			is StructType    -> "$typeName.Buffer".makeOptional
			is HandleType    -> primitiveBufferName.makeOptional
			is PrimitiveType -> primitiveBufferName.makeOptional
			else               -> Primitive.LONG.directName.makeOptional
		}

		isStringPointer -> type.primitive.bufferName.makeOptional

		isPointer -> when(type) {
			is StructType    -> typeName.makeOptional
			is PrimitiveType -> type.primitive.directName.makeOptional
			else               -> Primitive.LONG.directName.makeOptional
		}

		else -> when(type) {
			is StructType    -> throw RuntimeException("Non-pointer struct parameter")
			is HandleType    -> typeName.makeOptional
			else               -> typeName
		}
	}



	private val Var.argument: String get() = when {
		isArray -> when(type) {
			is EnumType       -> addressString
			is BitmaskType 	  -> addressString
			is StructType     -> addressString
			is HandleType 	  -> addressString
			is PrimitiveType  -> addressString
			is VoidType       -> addressString
			else              -> addressString
		}

		isStringPointer -> addressString

		isPointer -> when(type) {
			is EnumType       -> addressString
			is BitmaskType    -> addressString
			is StructType     -> addressString
			is HandleType     -> addressString
			is PrimitiveType  -> addressString
			is VoidType       -> addressString
			else              -> addressString
		}

		type is EnumType       -> if(type.shouldGen) "$name.value" else if(type.is64Bit) "0L" else "0"
		type is BitmaskType    -> if(type.shouldGen) "$name.value" else if(type.is64Bit) "0L" else "0"
		type is StructType     -> addressString
		type is HandleType     -> addressString
		type is PrimitiveType  -> name
		type is VoidType       -> addressString
		else                   -> name
	}



	/*
	Jni generation utils
	 */



	private val Var.castName get() = "(${modifier.castName(type.name)}) $name"



	private val Command.jniContents get() = buildString {
		if(returnType != null)
			append("return (${returnType.primitive.jniName}) ")

		append("((PFN_$name) address) (")

		for(i in params.indices) {
			append(params[i].castName)
			if(i != params.lastIndex) append(", ")
		}

		append(");")
	}



	private val Var.cType get() = if(isPointer || isArray)
		Primitive.LONG.jniName
	else
		type.primitive.jniName



	private val Var.kType get() = if(isPointer || isArray)
		Primitive.LONG.kName
	else
		type.primitive.kName



	private val Command.asCFunction get() = JniGeneration.createCFunction(
		packageName  = packageName,
		className    = "Commands",
		functionName = genName,
		returnType   = returnType?.primitive?.jniName,
		params       = listOf("jlong" to "address") + params.map { Pair(it.cType, it.name) },
		contents     = jniContents
	)



	private val Command.asKFunction get() = KFunction(
		name       = genName,
		returnType = returnType?.primitive?.kName,
		params     = listOf("address" to "Long") + params.map { Pair(it.name, it.kType) },
		modifiers  = listOf("external"),
	)



	/*
	Wrapper generation utils
	 */



	private val Var.shouldGenWrapperParam get() = when(type) {
		is EnumType    -> type.shouldGen
		is BitmaskType -> type.shouldGen
		else             -> true
	}



	private val Command.kReturnType get(): String? {
		if(returnType == null)
			return null

		return if(returnType.name == "VkResult")
			"Result"
		else
			returnType.primitive.kName
	}



	private val Command.kContents get() = buildString {
		returnType?.let {
			append("return ")
			if(it.name == "VkResult")
				append("Result(")
		}

		append("Commands.")
		append(genName)
		append('(')

		append(genName)
		append("Addr")

		if(params.isNotEmpty()) {
			append(", ")

			for(i in params.indices) {
				append(params[i].argument)
				if(i != params.lastIndex) append(", ")
			}
		}

		append(')')

		if(returnType?.name == "VkResult") append(')')
	}



	private val Command.asInstanceFunction get() = KFunction(
		name 		= genName,
		returnType 	= kReturnType,
		params 		= params
			.filter { it.name != "instance" && it.shouldGenWrapperParam }
			.map    { Pair(it.name, it.paramType) },
		contents 	= kContents
	)



	private val Command.asDeviceFunction get() = KFunction(
		name 		= genName,
		returnType 	= kReturnType,
		params 		= params
			.filter { it.name != "device" && it.shouldGenWrapperParam }
			.map    { Pair(it.name, it.paramType) },
		contents 	= kContents
	)



	private val Command.asStandaloneFunction get() = KFunction(
		name 		= genName,
		returnType 	= kReturnType,
		params 		= params.map { Pair(it.name, it.paramType) },
		contents 	= kContents
	)



	/*
	Jni generation
	 */



	fun genCommandsKotlin() = write("_Commands") {
		start {
			autogenComment()
			topLevelFileComment()
			suppressFile("Unused", "FunctionName")
			vulkanPackage()
			imports(
				MemStacks::class.qualifiedName + ".default",
				Addressable::class.qualifiedName + ".Companion.addressOrNULL",
				"$primitivePackage.*"
			)
		}

		val instanceCommands = ArrayList<Command>()
		val deviceCommands = ArrayList<Command>()
		val standaloneCommands = ArrayList<Command>()

		for(c in registry.commands) {
			if(c.name == "vkGetDeviceProcAddr") {
				instanceCommands.add(c)
				continue
			}

			when(c.params.first().type.name) {
				"VkInstance",
				"VkPhysicalDevice" -> instanceCommands.add(c)

				"VkDevice",
				"VkQueue",
				"VkCommandBuffer" -> deviceCommands.add(c)

				else -> standaloneCommands.add(c)
			}
		}

		currentStyle = style(decSpacing = 3)

		class_("object Commands") {
			group(spacing = 1) {
				declaration("private external fun init(): Boolean")
				declaration("init { init() }")
				declaration("external fun getInstanceProcAddr(instance: Long, pname: Long): Long")
			}

			group(spacing = 1) {
				for(c in registry.commands)
					function(c.asKFunction)
			}
		}


		class_("class InstanceCommands(private val instance: InstanceH)") {
			declaration("private fun addr(name: String) = Commands.getInstanceProcAddr(instance.address, default.encodeUtf8NT(name).address)")

			declaration(noStyle) {
				writeln("private val stackPointer = default.push()")
				for(c in instanceCommands)
					writeln("private val ${c.genName}Addr = addr(\"${c.name}\")")
				writeln("init { default.pop(stackPointer) }")
			}

			group(spacing = 1) {
				for(c in instanceCommands)
					function(c.asInstanceFunction)
			}
		}


		class_("class DeviceCommands(private val device: DeviceH, private val instanceCommands: InstanceCommands)") {
			declaration("private fun addr(name: String) = instanceCommands.getDeviceProcAddr(device, default.encodeUtf8NT(name))")

			declaration(noStyle) {
				writeln("private val stackPointer = default.push()")
				for(c in deviceCommands)
					writeln("private val ${c.genName}Addr = addr(\"${c.name}\")")
				writeln("init { default.pop(stackPointer) }")
			}

			group(spacing = 1) {
				for(c in deviceCommands)
					function(c.asDeviceFunction)
			}
		}


		class_("object StandaloneCommands") {
			declaration("private fun addr(name: String) = Commands.getInstanceProcAddr(0L, default.encodeUtf8NT(name).address)")

			declaration(noStyle) {
				writeln("private val stackPointer = default.push()")
				for(c in standaloneCommands)
					writeln("private val ${c.genName}Addr = addr(\"${c.name}\")")
				writeln("init { default.pop(stackPointer) }")
			}

			group(spacing = 1) {
				for(c in standaloneCommands)
					function(c.asStandaloneFunction)
			}
		}
	}



	fun genCommandsKotlin2() = write("_Vk") {
		start {
			autogenComment()
			topLevelFileComment()
			suppressFile("Unused", "FunctionName")
			vulkanPackage()
		}

		class_("object Vk") {
			for(command in registry.commands) {
				function(KFunction(
					command.genName,
					command.returnType?.primitive?.kName,
				))
			}
		}
	}



	fun genCommandsC2() = CWriter.write(cDirectory, "vk") {
		currentStyle = style(3)

		includes("jni.h")

		group("Command types", spacing = 0) {
			for(command in registry.commands) {
				write("typedef ${command.returnType?.primitive?.jniName ?: "void"} (__stdcall* PFN_${command.name})(")
				for((index, param) in command.params.withIndex()) {
					if(index != 0) write(' ')
					val typeName = when {
						command.name == "vkGetInstanceProcAddr" && param.name == "pName" -> "char*"
						command.name == "vkGetDeviceProcAddr" && param.name == "pName" -> "char*"
						param.isPointer -> "jlong"
						else -> param.type.primitive.jniName
					}
					write("$typeName ${param.name}")
					if(index != command.params.size - 1) write(',')
				}
				writeln(");")
			}
		}

		group("Command addresses", spacing = 0) {
			for(command in registry.commands) {
				declaration("PFN_${command.name} ${command.name};")
			}
		}

		declaration("jlong globalInstance;")
		declaration("jlong globalDevice;")

		function("void loadInstance(jlong instance)") {
			writeln("globalInstance = instance;")
			for(c in registry.commands) {
				if(c.type == CommandType.INSTANCE) {
					writeln("${c.name} = (PFN_${c.name}) vkGetInstanceProcAddr(instance, \"${c.name}\");")
				}
			}
		}

		function("void loadDevice(jlong device)") {
			writeln("globalDevice = device;")
			for(c in registry.commands) {
				if(c.type == CommandType.DEVICE) {
					writeln("${c.name} = (PFN_${c.name}) vkGetDeviceProcAddr(device, \"${c.name}\");")
				}
			}
		}

		multilineDeclaration("""
			#ifdef WIN32
				#include <windef.h>
				#include <winbase.h>
			#else
				#include <dlfcn.h>
			#endif
		""")

		multilineDeclaration("""
			int load() {
			#ifdef WIN32
				HMODULE module = LoadLibrary("vulkan-1.dll");
				vkGetInstanceProcAddr = (PFN_vkGetInstanceProcAddr) GetProcAddress(module, "vkGetInstanceProcAddr");
			#elif defined(__APPLE__)
				void* module = dlopen("libMoltenVK.dylib", RTLD_NOW | RTLD_LOCAL);
				vkGetInstanceProcAddr = (PFN_vkGetInstanceProcAddr)dlsym(module, "vkGetInstanceProcAddr");
			#else
				void* module = dlopen("libvulkan.so", RTLD_NOW | RTLD_LOCAL);
				vkGetInstanceProcAddr = (PFN_vkGetInstanceProcAddr)dlsym(module, "vkGetInstanceProcAddr");
			#endif
				
				if(vkGetInstanceProcAddr == NULL) return 0;
	
				vkEnumerateInstanceVersion = (PFN_vkEnumerateInstanceVersion) vkGetInstanceProcAddr(0, "vkEnumerateInstanceVersion");
				vkEnumerateInstanceExtensionProperties = (PFN_vkEnumerateInstanceExtensionProperties) vkGetInstanceProcAddr(0, "vkEnumerateInstanceExtensionProperties");
				vkCreateInstance = (PFN_vkCreateInstance) vkGetInstanceProcAddr(0, "vkCreateInstance");
				vkEnumerateInstanceLayerProperties = (PFN_vkEnumerateInstanceLayerProperties) vkGetInstanceProcAddr(0, "vkEnumerateInstanceLayerProperties");
	
				return 1;
			}
		""")

		function(JniGeneration.createCFunction(
			packageName,
			"Vk",
			"load",
			"jint",
			emptyList(),
			"return load();"
		))

		group("JNI functions", spacing = 1) {
			for(command in registry.commands) {
				if(command.name == "vkGetDeviceProcAddr" || command.name == "vkGetInstanceProcAddr") continue

				var params = command.params.map { it.cType to it.name }

				val first = command.params[0].type.name

				if(first == "VkInstance" || first == "VkDevice") params = params.drop(1)

				function(JniGeneration.createCFunction(
					packageName,
					"Vk",
					command.genName,
					command.returnType?.primitive?.jniName,
					params,
					buildString {
						if(command.returnType != null)
							append("return ")

						append("${command.name}(")

						when(first) {
							"VkInstance"       -> { append("globalInstance"); if(params.isNotEmpty()) append(", ") }
							"VkDevice"         -> { append("globalDevice");   if (params.isNotEmpty()) append(", ") }
						}

						for(i in params.indices) {
							append(params[i].second)
							if(i != params.lastIndex) append(", ")
						}

						append(");")
					}
				))
			}
		}
	}



	fun genCommandsC() = CWriter.write(cDirectory, "vk_commands") {
		currentStyle = style(3, 0)

		autogenComment()
		includes("jni.h")

		define("VK_NO_PROTOTYPES")

		multilineDeclaration("""
				#ifdef WIN32
					#include <windef.h>
					#include <winbase.h>
					#ifdef VK_USE_PLATFORM_WIN32_KHR
						#include <vk_platform.h>
						#include <vulkan_core.h>
						#include <vulkan_win32.h>
					#else
						#include <vulkan.h>
					#endif
				#else
					#include <vulkan.h>
					#include <dlfcn.h>
				#endif
		""")

		declaration("PFN_vkGetInstanceProcAddr getInstanceProcAddr;")

		multilineDeclaration("""
			int initVulkan() {
				#ifdef WIN32
					HMODULE module = LoadLibrary("vulkan-1.dll");
					getInstanceProcAddr = (PFN_vkGetInstanceProcAddr) GetProcAddress(module, "vkGetInstanceProcAddr");
					if(module == NULL) return 0;
				#elif defined(__APPLE__)
					void* module = dlopen("libMoltenVK.dylib", RTLD_NOW | RTLD_LOCAL);
					getInstanceProcAddr = dlsym(module, "vkGetInstanceProcAddr");
					if(module == NULL) return 0;
				#else
					void* module = dlopen("libvulkan.so", RTLD_NOW | RTLD_LOCAL);
					getInstanceProcAddr = dlsym(module, "vkGetInstanceProcAddr");
					if(module == NULL) return 0;
				#endif
				if(getInstanceProcAddr == NULL) return 0;
				return 1;
			}
		""")

		// init function, gets the address of vkGetInstanceProcAddr. Must be called before using getInstanceProcAddr.
		function(
			JniGeneration.createCFunction(
				packageName  = packageName,
				className    = "Commands",
				functionName = "init",
				returnType   = "jboolean",
				params       = emptyList(),
				contents     = "return (jboolean) initVulkan();"
			)
		)

		// getInstanceProcAddr function, used to get the function addresses of all other Vulkan functions.
		function(
			JniGeneration.createCFunction(
				packageName  = packageName,
				className    = "Commands",
				functionName = "getInstanceProcAddr",
				returnType   = "jlong",
				params       = listOf("jlong" to "instance", "jlong" to "pName"),
				contents     = "return (jlong) getInstanceProcAddr((VkInstance) instance, (const char*) pName);"
			)
		)

		for(p in registry.providers) {
			if(p.commands.isEmpty()) continue

			group("Provided by ${p.name}", 1) {
				if(p is Extension && p.platform != null)
					ifdef(p.platform.define) // #ifdef VK_USE_PLATFORM_...

				for(c in p.commands)
					if(c.shouldGen)
						function(c.asCFunction)

				if(p is Extension && p.platform != null)
					endif() // #endif
			}
		}
	}



	/*
	C wrapper generation (not part of bindings)
	 */



	private val Command.pfnName get() = "PFN_$name"

	private val Command.wrapperName get() = "vk${genName.replaceFirstChar { it.uppercase() }}"

	private val Command.addressName get() = "${name}_"

	private val standaloneCommands = registry.commands.filter { it.type == CommandType.STANDALONE }



	fun genCWrapper2() = CWriter.writeHeader(cDirectory, "vk_commands"){
		currentStyle = style(3)

		multilineDeclaration("""
			// This file has been automatically generated.
			#pragma clang diagnostic push
			#pragma ide diagnostic ignored "OCUnusedMacroInspection"
			#pragma ide diagnostic ignored "OCUnusedGlobalDeclarationInspection"
			#pragma once
			
			#include <jni.h>
			#include <vulkan.h>
			
			VkInstance globalInstance;
			VkPhysicalDevice globalPhysicalDevice;
			VkDevice globalDevice;
		""")

		fun forEachCommand(spacing: Int = 0, predicate: (Command) -> Boolean, block: (Command) -> Unit) {
			for(p in registry.providers) {
				if(p.commands.isEmpty()) continue
				if(p.commands.none(predicate)) continue

				group("Provided by ${p.name}", spacing) {
					if(p is Extension && p.platform != null)
						ifdef(p.platform.define)

					for(c in p.commands)
						if(predicate(c))
							block(c)

					if(p is Extension && p.platform != null)
						endif()
				}
			}
		}

		group(0) {
			forEachCommand(0, { true }) {
				declaration("${it.pfnName} ${it.addressName};")
			}
		}

		function("void vkwLoadInitial(void* procAddr)") {
			writeln("vkGetInstanceProcAddr_ = procAddr;")
			for(c in standaloneCommands) {
				writeln("${c.addressName} = (${c.pfnName}) vkGetInstanceProcAddr_(NULL, \"${c.name}\");")
			}
		}

		function("void vkwLoadInstance(VkInstance instance)") {
			writeln("globalInstance = instance;")
			forEachCommand(0, { it.type == CommandType.INSTANCE }) {
				writeln("${it.addressName} = (${it.pfnName}) vkGetInstanceProcAddr_(instance, \"${it.name}\");")
			}
		}

		function("void vkwLoadDevice(VkDevice device)") {
			writeln("globalDevice = device;")
			forEachCommand(0, { it.type == CommandType.DEVICE }) {
				writeln("${it.addressName} = (${it.pfnName}) vkGetDeviceProcAddr_(device, \"${it.name}\");")
			}
		}

		multilineDeclaration("""
			#ifdef WIN32
				#include <windef.h>
				#include <winbase.h>
			#else
				#include <dlfcn.h>
			#endif



			int vkwLoad() {

			#ifdef WIN32

				HMODULE module = LoadLibrary("vulkan-1.dll");
				vkwLoadInitial(GetProcAddress(module, "vkGetInstanceProcAddr"));

			#elif defined(__APPLE__)

				void* module = dlopen("libMoltenVK.dylib", RTLD_NOW | RTLD_LOCAL);
				vkwLoadInitial(dlsym(module, "vkGetInstanceProcAddr"));

			#else

				void* module = dlopen("libvulkan.so", RTLD_NOW | RTLD_LOCAL);
				vkwLoadInitial(dlsym(module, "vkGetInstanceProcAddr"));

			#endif

				return vkGetInstanceProcAddr_ != NULL;
			}
		""")

		JniGeneration.createCFunction(
			packageName  = packageName,
			className    = "Vulkan",
			functionName = "load",
			returnType   = "jint",
			params       = emptyList(),
			contents     = "return vkwLoad();"
		).let(::function)

		JniGeneration.createCFunction(
			packageName  = packageName,
			className    = "Vulkan",
			functionName = "loadInstance",
			returnType   = null,
			params       = listOf("VkInstance" to "instance"),
			contents     = "vkwLoadInstance(instance);"
		).let(::function)

		JniGeneration.createCFunction(
			packageName  = packageName,
			className    = "Vulkan",
			functionName = "loadDevice",
			returnType   = null,
			params       = listOf("VkDevice" to "device"),
			contents     = "vkwLoadDevice(device);"
		).let(::function)

		group(1) {
			forEachCommand(1, { true }) { command ->
				val params = when(command.params[0].type.name) {
					"VkInstance", "VkDevice" -> command.params.drop(1)
					else -> command.params
				}

				//val function = JniGeneration.createCFunction(
				//	packageName = packageName,
				//	className = "Vulkan",
//
				//)
			}
		}
	}



	fun genCWrapper() = CWriter.writeHeader(cDirectory, "vkload") {
		currentStyle = style(3)

		multilineDeclaration("""
			#pragma clang diagnostic push
			#pragma ide diagnostic ignored "OCUnusedGlobalDeclarationInspection"

			#pragma once
			
			#define VK_NO_PROTOTYPES
			
			
			
			// Dynamic loading headers
			#ifdef WIN32
				#include <windef.h>
				#include <winbase.h>
			#else
				#include <dlfcn.h>
			#endif
			
			
			
			// Vulkan headers
			#ifdef VK_USE_PLATFORM_WIN32_KHR
				#include <vk_platform.h>
				#include <vulkan_core.h>
				#include <vulkan_win32.h>
			#else
				#include <vulkan.h>
			#endif
		
			
			
			PFN_vkGetInstanceProcAddr vkGetInstanceProcAddr;
			PFN_vkCreateInstance vkCreateInstance;
			PFN_vkEnumerateInstanceExtensionProperties vkEnumerateInstanceExtensionProperties;
			PFN_vkEnumerateInstanceLayerProperties vkEnumerateInstanceLayerProperties;
			PFN_vkEnumerateInstanceVersion vkEnumerateInstanceVersion;
			
			
			int loadVulkan() {
			#ifdef WIN32
				HMODULE module = LoadLibrary("vulkan-1.dll");
				vkGetInstanceProcAddr = (PFN_vkGetInstanceProcAddr) GetProcAddress(module, "vkGetInstanceProcAddr");
			#elif defined(__APPLE__)
				void* module = dlopen("libMoltenVK.dylib", RTLD_NOW | RTLD_LOCAL);
				vkGetInstanceProcAddr = dlsym(module, "vkGetInstanceProcAddr");
			#else
				void* module = dlopen("libvulkan.so", RTLD_NOW | RTLD_LOCAL);
				vkGetInstanceProcAddr = dlsym(module, "vkGetInstanceProcAddr");
			#endif
				
				if(vkGetInstanceProcAddr == NULL) return 0;
				
				vkCreateInstance = (PFN_vkCreateInstance) vkGetInstanceProcAddr(NULL, "vkCreateInstance");
				vkEnumerateInstanceExtensionProperties = (PFN_vkEnumerateInstanceExtensionProperties) vkGetInstanceProcAddr(NULL, "vkEnumerateInstanceExtensionProperties");
				vkEnumerateInstanceLayerProperties = (PFN_vkEnumerateInstanceLayerProperties) vkGetInstanceProcAddr(NULL, "vkEnumerateInstanceLayerProperties");
				vkEnumerateInstanceVersion = (PFN_vkEnumerateInstanceVersion) vkGetInstanceProcAddr(NULL, "vkEnumerateInstanceVersion");
				
				return 1;
			}


			
			VkInstance gInstance;
			VkPhysicalDevice gPhysicalDevice;
			VkDevice gDevice;
		""")


		fun forEachCommand(spacing: Int = 0, block: Command.() -> Unit) {
			for(p in registry.providers) {
				if(p.commands.isEmpty()) continue

				group("Provided by ${p.name}", spacing) {
					if(p is Extension && p.platform != null)
						ifdef(p.platform.define)

					for(c in p.commands)
						if(c.type != CommandType.STANDALONE)
							block(c)

					if(p is Extension && p.platform != null)
						endif()
				}
			}
		}

		group("Global commands", 1) {
			forEachCommand {
				declaration("$pfnName $addressName;")
			}
		}

		function("void loadInstanceCommands()") {
			forEachCommand {
				writeln("$addressName = ($pfnName) vkGetInstanceProcAddr(gInstance, \"$name\");")
			}
		}

		function("void loadDeviceCommands()") {
			forEachCommand {
				writeln("$addressName = ($pfnName) vkGetDeviceProcAddr_(gDevice, \"$name\");")
			}
		}

		forEachCommand(spacing = 1) {
			var params = params.map { Pair(it.modifier.castName(it.type.name), it.name) }

			val first = params[0].first

			if(first == "VkInstance" || first == "VkDevice" || first == "VkPhysicalDevice") params = params.drop(1)

			val cFunction = CFunction(
				name       = wrapperName,
				returnType = returnType?.name,
				params     = params,
				contents   = buildString {
					if(returnType != null) append("return ")
					append(addressName)
					append('(')

					when(first) {
						"VkInstance"       -> { append("gInstance");       if (params.isNotEmpty()) append(", ") }
						"VkPhysicalDevice" -> { append("gPhysicalDevice"); if (params.isNotEmpty()) append(", ") }
						"VkDevice"         -> { append("gDevice");         if (params.isNotEmpty()) append(", ") }
					}

					for(i in params.indices) {
						append(params[i].second)
						if(i != params.lastIndex) append(", ")
					}

					append(");")
				}
			)

			function(cFunction)
		}
	}


}