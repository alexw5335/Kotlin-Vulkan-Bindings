package kvb.codegen.vulkan

import kvb.codegen.vulkan.scrape.*
import kvb.codegen.writer.*
import kvb.core.memory.MemStack
import java.nio.file.Files
import java.nio.file.Path

class VulkanGenerator(
	private val registry    : ScrapedRegistry,
	private val directory   : Path,
	private val cDirectory  : Path,
	private val packageName : String
) {


	init {
		Files.createDirectories(directory)
		Files.createDirectories(cDirectory)
	}



	private fun write(name: String, block: KWriter.() -> Unit) = KWriter.write(directory, name, block)



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



	private val StructType.docStrings get() = ArrayList<String>().also { list ->
		list.add("    // provided by ${registry.getProvider(name).name}")

		if(isUnion)
			list.add("    union $name {")
		else
			list.add("    struct $name {")

		val maxLength = members.maxOfOrNull { it.docType.length + 2 } ?: 0

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



	private val EnumType.docStrings get() = ArrayList<String>().also { list ->
		list.add("    // provided by ${registry.getProvider(name).name}")
		list.add("    enum $name {")

		val maxLength = entries.maxOfOrNull { it.name.length + 2} ?: 0

		for(e in entries) {
			var string = "        ${e.name}"
			repeat(maxLength - e.name.length) { string += ' ' }
			string += "= ${e.value}"
			list.add(string)
		}

		list.add("    }")
	}



	private val Command.docStrings get() = ArrayList<String>().also { list ->
		list.add("    // provided by ${registry.getProvider(name).name}")

		if(params.isEmpty())
			list.add("    ${returnType?.name ?: "void"} $name()")
		else
			list.add("    ${returnType?.name ?: "void"} $name(")

		val maxLength = params.maxOfOrNull { it.docType.length + 2 } ?: 0

		for(m in params) {
			val type = m.docType
			var string = "        ${m.docType}"
			repeat(maxLength - type.length) { string += ' ' }
			string += m.docName
			list.add(string)
		}

		if(params.isNotEmpty())
			list.add("    );")
	}



	/*
	Constants
	 */



	fun genConstants() = write("Constants") {
		start {
			autogenComment()
			suppressFile("Unused")
			package_(packageName)
		}

		group(1) {
			for(constant in registry.constants)
				if(constant.shouldGen)
					declaration("const val ${constant.genName} = ${constant.value}")
			declaration("fun VK_BOOL(value: Boolean) = if(value) VK_TRUE else VK_FALSE")
		}
	}



	/*
	Handles
	 */



	private fun KWriter.writeHandle(handle: HandleType) {
		doc("Implementation of ${handle.name}.")
		declaration("open class ${handle.genName}(override val address: Long) : Addressable")
	}



	/*
	Enums
	 */



	private val EnumType.isValue get() = name == "VkResult" || name == "VkObjectType" || name == "VkFormat"



	private fun KWriter.writeEnum(enum: EnumType) {
		val entries = enum.entries.filter { it.shouldGen }

		doc(enum.docStrings)
		suppress("Unused")
		class_("enum class ${enum.genName}(val value: Int)") {
			enums(entries.map {
				"${it.genName}(${it.value})"
			})
		}

		doc("Enum getter for [${enum.name}].")
		declaration {
			write("fun _${enum.genName}(value: Int) = when(value)")
			braced {
				for(entry in enum.entries) {
					if(!entry.shouldGen) continue
					writeln("${entry.value} -> ${enum.genName}.${entry.genName}")
				}

				writeln("else -> throw RuntimeException(\"Invalid ${enum.name} enum value: \$value\")")
			}
		}
	}



	private fun KWriter.writeValueEnum(enum: EnumType) {
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



	private fun KWriter.writeBitmask(bitmask: BitmaskType) {
		val name = bitmask.genName
		val enum = registry.types.firstOrNull { it.name == bitmask.enumName } as? EnumType

		if(enum == null || enum.entries.isEmpty()) {
			doc(listOf(
				"    // Provided by ${registry.getProvider(bitmask.name).name}",
				"    typedef VkFlags ${bitmask.name}",
			    "    // This bitmask's flag bits are empty or are part of an extension that has not been generated."
			))
			annotation("JvmInline")
			declaration("value class $name(val value: ${bitmask.primitive.kName})")
			return
		}

		val entries = enum.entries.filter { it.shouldGen }

		doc(enum.docStrings)
		annotation("JvmInline")
		class_("value class $name(val value: ${bitmask.primitive.kName})") {
			companion_ {
				for(entry in entries)
					declaration("val ${entry.genName} = $name(${entry.value})")
			}

			group(1) {
				declaration("operator fun plus(mask: $name) = $name(value or mask.value)")
				declaration("operator fun contains(mask: $name) = value and mask.value == mask.value")
			}
		}

		doc("Bitmask builder for [$name].")
		declaration("inline fun $name(block: $name.Companion.() -> $name) = block($name)")
	}





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
	Commands - Jni
	 */



	private val Command.jniContents get() = buildString {
		if(returnType != null)
			append("return (${returnType.primitive.jniName}) ")

		append("((PFN_$name) address) (")

		for(i in params.indices) {
			append(params[i].name)
			if(i != params.lastIndex) append(", ")
		}

		append(");")
	}



	private val Var.jniType get() = if(isPointer || isArray)
		Primitive.LONG.jniName
	else
		type.primitive.jniName



	private val Var.kType get() = if(isPointer || isArray)
		Primitive.LONG.kName
	else
		type.primitive.kName



	private val Command.asCFunction get() = JniGen.createCFunction(
		packageName  = packageName,
		className    = registry.getProvider(name).name.replace("_", "_1") + "Kt",
		functionName = genName,
		returnType   = returnType?.primitive?.jniName,
		params       = listOf("jlong" to "address") + params.map { Pair(it.jniType, it.name) },
		contents     = jniContents
	)



	private val Command.asKFunction get() = KFunction(
		name       = genName,
		returnType = returnType?.primitive?.kName,
		params     = listOf("address" to "Long") + params.map { Pair(it.name, it.kType) },
		modifiers  = listOf("internal", "external"),
	)



	private fun KWriter.writeCommand(command: Command) {
		doc(command.docStrings)
		function(command.asKFunction)
	}



	/*
	Commands - Wrapper
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



	fun genCommands() = KWriter.write(directory, "Commands") {
		start {
			autogenComment()
			suppressFile("Unused")
			package_(packageName)
			imports(
				"kvb.core.memory.*",
				"kvb.core.memory.direct.*"
			)
		}

		currentStyle = style(3)

		class_("object Commands") {
			group(1) {
				declaration("init { loadVulkan() }")
				declaration("external fun loadVulkan(): Boolean")
				declaration("external fun getInstanceProcAddr(instance: Long, pName: Long): Long")
				declaration("private val stack = MemStack.current()")
				declaration("private fun addr(name: String) = getInstanceProcAddr(0L, stack.encodeUtf8NT(name).address)")
			}

			group(0) {
				declaration("private val stackPointer = stack.push()")
				for(c in registry.commands)
					if(c.type == CommandType.GLOBAL && c.name != "vkGetInstanceProcAddr")
						declaration("private val ${c.genName}Addr = addr(\"${c.name}\")")
				declaration("init { stack.pop(stackPointer) }")
			}

			group(1) {
				for(c in registry.commands)
					if(c.type == CommandType.GLOBAL && c.name != "vkGetInstanceProcAddr")
						function(c.asStandaloneFunction)
			}
		}

		class_("class InstanceCommands(private val instance: InstanceH)") {
			group(1) {
				declaration("private val stack = MemStack.current()")
				declaration("private fun addr(name: String) = Commands.getInstanceProcAddr(instance.address, stack.encodeUtf8NT(name).address)")
			}

			declaration(style(0, 0)) {
				writeln("private val stackPointer = stack.push()")
				for(c in registry.commands)
					if(c.type == CommandType.INSTANCE)
						writeln("private val ${c.genName}Addr = addr(\"${c.name}\")")
				writeln("init { stack.pop(stackPointer) }")
			}

			group(spacing = 1) {
				for(c in registry.commands)
					if(c.type == CommandType.INSTANCE)
						function(c.asInstanceFunction)
			}
		}

		class_("class DeviceCommands(private val device: DeviceH, private val instanceCommands: InstanceCommands)") {
			group(1) {
				declaration("private val stack = MemStack.current()")
				declaration("private fun addr(name: String) = instanceCommands.getDeviceProcAddr(device, stack.encodeUtf8NT(name))")
			}

			declaration(style(0, 0)) {
				writeln("private val stackPointer = stack.push()")
				for(c in registry.commands)
					if(c.type == CommandType.DEVICE)
						writeln("private val ${c.genName}Addr = addr(\"${c.name}\")")
				writeln("init { stack.pop(stackPointer) }")
			}

			group(spacing = 1) {
				for(c in registry.commands)
					if(c.type == CommandType.DEVICE)
						function(c.asDeviceFunction)
			}
		}
	}



	fun genCommandsC() = CWriter.write(cDirectory, "vk_commands") {
		currentStyle = style(3)

		declaration("#include <jni.h>")

		group("Types", spacing = 0) {
			for(command in registry.commands) {
				write("typedef ${command.returnType?.primitive?.jniName ?: "void"} (*PFN_${command.name})(")

				for((index, param) in command.params.withIndex()) {
					write("${param.jniType} ${param.name}")
					if(index != command.params.size - 1) write(", ")
				}

				writeln(");")
			}
		}

		group("Initialisation", spacing = 3) {
			multilineDeclaration("""
				#ifdef WIN32
					#include <windef.h>
					#include <winbase.h>
				#else
					#include <dlfcn.h>
				#endif
			""")

			multilineDeclaration("""
				PFN_vkGetInstanceProcAddr getInstanceProcAddr;
				
				
				
				int load() {
				#ifdef WIN32
					HMODULE module = LoadLibrary("vulkan-1.dll");
					getInstanceProcAddr = (PFN_vkGetInstanceProcAddr) GetProcAddress(module, "vkGetInstanceProcAddr");
				#elif defined(__APPLE__)
					void* module = dlopen("libMoltenVK.dylib", RTLD_NOW | RTLD_LOCAL);
					getInstanceProcAddr = (PFN_vkGetInstanceProcAddr) dlsym(module, "vkGetInstanceProcAddr");
				#else
					void* module = dlopen("libvulkan.so", RTLD_NOW | RTLD_LOCAL);
					getInstanceProcAddr = (PFN_vkGetInstanceProcAddr) dlsym(module, "vkGetInstanceProcAddr");
				#endif
					
					return getInstanceProcAddr != NULL;
				}
			""")

			function(JniGen.createCFunction(
				packageName,
				"Commands",
				"loadVulkan",
				"jboolean",
				emptyList(),
				"return (jboolean) load();"
			))

			function(JniGen.createCFunction(
				packageName,
				"Commands",
				"getInstanceProcAddr",
				"jlong",
				listOf("jlong" to "instance", "jlong" to "pName"),
				"return (jlong) getInstanceProcAddr(instance, pName);"
			))
		}

		group("JNI commands", spacing = 1) {
			for(command in registry.commands)
				if(command.shouldGen)
					if(command.name != "vkGetInstanceProcAddr")
						function(command.asCFunction)
		}
	}




	/*
	Struct - Member generation
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
	Struct - Convenience member generation
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



	private fun KWriter.writeStruct(struct: StructType) {
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

		if(struct.sType != null) {
			doc("Struct calloc function for [$name].")
			declaration("inline fun Allocator.$name(block: ($name) -> Unit) = $name(calloc(${struct.size64})).apply(block).also { it.sType = ${struct.sType} }")

			if(struct.requiresBuffer) {
				doc("Struct buffer calloc function for [$name].")
				declaration("inline fun Allocator.$name(capacity: Int, block: ($name.Buffer) -> Unit) = $name.Buffer(calloc(capacity * ${struct.size64}), capacity).apply(block).apply { forEach { it.sType = ${struct.sType} } }")
			}
		} else {
			doc("Struct calloc function for [$name].")
			declaration("inline fun Allocator.$name(block: ($name) -> Unit) = $name(calloc(${struct.size64})).apply(block)")

			if(struct.requiresBuffer) {
				doc("Struct buffer calloc function for [$name].")
				declaration("inline fun Allocator.$name(capacity: Int, block: ($name.Buffer) -> Unit) = $name.Buffer(calloc(capacity * ${struct.size64}), capacity).apply(block)")
			}
		}
	}



	/*
	Providers
	 */



	fun genProviders() {
		for(provider in registry.providers)
			if(provider.shouldGen)
				genProvider(provider)
	}



	private fun genProvider(provider: Provider) = KWriter.write(directory, provider.name) {
		start {
			autogenComment()
			suppressFile("Unused", "FunctionName")
			package_(packageName)
			imports(
				"kvb.core.memory.*",
				"kvb.core.memory.direct.*"
			)
		}

		currentStyle = style(3, 0)

		for(command in provider.commands)
			if(command.shouldGen)
				writeCommand(command)

		for(type in provider.types)
			if(type is HandleType && type.shouldGen)
				writeHandle(type)

		for(type in provider.types)
			if(type is EnumType && type.shouldGen)
				when {
					type.isFlagBits -> continue
					type.isValue    -> writeValueEnum(type)
					else            -> writeEnum(type)
				}

		for(type in provider.types)
			if(type is BitmaskType && type.shouldGen)
				writeBitmask(type)

		for(type in provider.types)
			if(type is StructType && type.shouldGen)
				writeStruct(type)
	}



	/*
	Misc.
	 */



	fun genUtils() = write("Utils") {
		start {
			autogenComment()
			package_(packageName)
		}

		doc("An abstraction of the macros VK_VERSION_MAJOR, VK_VERSION_MINOR, and VK_VERSION_PATCH.")
		annotation("JvmInline")
		class_("value class Version(val value: Int)", style(1, 1)) {
			declaration("constructor(major: Int, minor: Int, patch: Int) : this((major shl 22) or (minor shl 12) or patch)")
			declaration("val major get() = value shr 22")
			declaration("val minor get() = value shr 12 and 0x3FF")
			declaration("val patch get() = value and 0xFFF")
			declaration("override fun toString() = \"Version(\$major, \$minor, \$patch)\"")
		}
	}



}