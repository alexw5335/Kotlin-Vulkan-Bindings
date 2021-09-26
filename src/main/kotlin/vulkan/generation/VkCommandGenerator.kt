package vulkan.generation

import codegen.CWriter
import codegen.CodeWriter.Companion.with
import codegen.procedural.JniGeneration
import codegen.KWriter
import codegen.procedural.*
import memory.Primitive
import memory.allocation.MemStacks
import memory.type.Addressable
import vulkan.scraper.element.VkCommand
import vulkan.scraper.element.VkExtension
import vulkan.scraper.element.VkFeature
import vulkan.scraper.element.VkVar
import vulkan.scraper.type.*
import java.nio.file.Path
import kotlin.io.path.div

class VkCommandGenerator(
	private val directory: Path,
	private val packageName: String,
	private val cDirectory: Path,
	private val className: String,
	private val features: Iterable<VkFeature>,
	private val extensions: Iterable<VkExtension>
){


	fun generate() {
		writeCommandsK()
		writeCommandsC()
		writeInstanceCommands()
		writeDeviceCommands()
		writeStandaloneCommands()
	}



	/*
	Manually created commands
	 */




	private val getInstanceProcAddrFunctionK = KFunction(
		name 		= "getInstanceProcAddr0",
		returnType  = "Long",
		modifiers   = listOf("external"),
		params      = listOf("instance" to "Long", "pname" to "Long"),
	)



	private val getInstanceProcAddrFunctionC = JniGeneration.createCFunction(
		packageName  = packageName,
		className    = className,
		functionName = "getInstanceProcAddr0",
		returnType   = "jlong",
		params       = listOf("instance" to "jlong", "pname" to "jlong"),
		contents     = "return (jlong) vkGetInstanceProcAddr((VkInstance) instance, (char*) pname);"
	)



	private val getDeviceProcAddrFunctionK = KFunction(
		name 		= "getDeviceProcAddr0",
		returnType  = "Long",
		modifiers   = listOf("external"),
		params      = listOf("device" to "Long", "pname" to "Long"),
	)



	private val getDeviceProcAddrFunctionC = JniGeneration.createCFunction(
		packageName  = packageName,
		className    = className,
		functionName = "getDeviceProcAddr0",
		returnType   = "jlong",
		params       = listOf("device" to "jlong", "pname" to "jlong"),
		contents     = "return (jlong) vkGetDeviceProcAddr((VkDevice) device, (char*) pname);"
	)



	/*
	Param strings
	 */



	private val VkVar.paramType: String get() = when {
		isArray -> when(type) {
			is VkTypeEnum 		-> primitiveBufferName.makeOptional
			is VkTypeBitmask 	-> primitiveBufferName.makeOptional
			is VkTypeStruct 	-> "$typeName.Buffer".makeOptional
			is VkTypeHandle 	-> primitiveBufferName.makeOptional
			is VkTypePrimitive 	-> primitiveBufferName.makeOptional
			is VkTypeVoid		-> "Long"
			else 				-> "Long"
		}

		isPointer -> when(type) {
			is VkTypeEnum 		-> "Long"
			is VkTypeBitmask 	-> "Long"
			is VkTypeStruct 	-> typeName.makeOptional
			is VkTypeHandle 	-> Primitive.POINTER.directName.makeOptional
			is VkTypePrimitive 	-> type.primitive.directName.makeOptional
			is VkTypeVoid		-> "Long"
			else 				-> "Long"
		}

		// Note: No instances of structs being passed by value. Those would have to be de-referenced in native JNI code.
		else -> when(type) {
			is VkTypeEnum 		-> typeName
			is VkTypeBitmask 	-> typeName
			is VkTypeStruct 	-> typeName.makeOptional
			is VkTypeHandle 	-> typeName.makeOptional
			is VkTypePrimitive 	-> typeName
			is VkTypeVoid 		-> typeName
			else			 	-> typeName
		}
	}



	private val VkVar.argument: String get() = when {
		isArray -> when(type) {
			is VkTypeEnum 		-> addressString
			is VkTypeBitmask 	-> addressString
			is VkTypeStruct		-> addressString
			is VkTypeHandle 	-> addressString
			is VkTypePrimitive 	-> addressString
			is VkTypeVoid 		-> validName
			else 				-> validName
		}

		isPointer -> when(type) {
			is VkTypeEnum 		-> validName
			is VkTypeBitmask 	-> validName
			is VkTypeStruct 	-> addressString
			is VkTypeHandle 	-> addressString
			is VkTypePrimitive  -> addressString
			is VkTypeVoid 		-> validName
			else 				-> validName
		}

		type is VkTypeEnum 		-> "$validName.${type.valueString}"
		type is VkTypeBitmask 	-> "$validName.bitfield"
		type is VkTypeStruct 	-> addressString
		type is VkTypeHandle 	-> addressString
		type is VkTypePrimitive -> validName
		type is VkTypeVoid 		-> validName
		else					-> validName
	}



	/*
	Jni Functions
	 */



	private val VkCommand.jniContents get() = buildString {
		if(isReturning) append("return ")
		append("$returnCast((PFN_$name) address) (")

		for(i in params.indices) {
			append(params[i].castName)
			if(i != params.lastIndex) append(", ")
		}

		append(");")
	}



	private val VkVar.cType get() = if(isPointer || isArray)
		Primitive.POINTER.jniName
	else
		type.primitive.jniName



	private val VkVar.kType get() = if(isPointer || isArray)
		Primitive.POINTER.kName
	else
		type.primitive.kName



	private val VkCommand.asCFunction get() = JniGeneration.createCFunction(
		packageName  = packageName,
		className    = className,
		functionName = shortName,
		returnType   = returnType?.primitive?.jniName,
		params       = listOf("address" to "jlong") + params.map { Pair(it.validName, it.cType) },
		contents     = jniContents
	)



	private val VkCommand.asKFunction get() = KFunction(
		name       = shortName,
		returnType = returnType?.primitive?.kName,
		params     = listOf("address" to "Long") + params.map { Pair(it.validName, it.kType) },
		modifiers  = listOf("external"),
	)



	/*
	Kotlin wrapper functions
	 */



	private val VkCommand.kReturnType get(): String? {
		if(returnType == null)
			return null

		return if(returnType.name == "VkResult")
			"Result"
		else
			returnType.primitive.kName
	}



	private val VkCommand.kContents get() = buildString {
		returnType?.let {
			append("return ")
			if(it.name == "VkResult")
				append("Result(")
		}

		append("Commands.")
		append(shortName)
		append('(')

		append(shortName)
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



	private val VkCommand.asInstanceFunction get() = KFunction(
		name 		= shortName,
		returnType 	= kReturnType,
		params 		= params.filter { it.name != "instance" }.map { Pair(it.validName, it.paramType) },
		contents 	= kContents
	)



	private val VkCommand.asDeviceFunction get() = KFunction(
		name 		= shortName,
		returnType 	= kReturnType,
		params 		= params.filter { it.name != "device" }.map { Pair(it.validName, it.paramType) },
		contents 	= kContents
	)



	private val VkCommand.asStandaloneFunction get() = KFunction(
		name 		= shortName,
		returnType 	= kReturnType,
		params 		= params.map { Pair(it.validName, it.paramType) },
		contents 	= kContents
	)



	/*
	Jni generation
	 */



	private fun writeCommandsK() = KWriter(directory/"Commands.kt").with {
		start {
			autogenComment()
			package_(packageName)
		}

		suppress("unused")
		class_("object $className") {

			group("Address commands", 1) {
				function(getInstanceProcAddrFunctionK)
				function(getDeviceProcAddrFunctionK)
			}

			for(f in features) {
				group("Provided by ${f.name}", 1) {
					for(c in f.commands) function(c.asKFunction)
				}
			}

			for(e in extensions) {
				if(e.commands.isEmpty()) continue
				group("Provided by ${e.name}", 1) {
					for(c in e.commands) function(c.asKFunction)
				}
			}
		}
	}



	private fun writeCommandsC() = CWriter(cDirectory/"commands.c").with {
		currentStyle = style(3, 0)

		autogenComment()
		includes("jni.h", "vulkan.h")

		group("Address commands", 1) {
			function(getInstanceProcAddrFunctionC)
			function(getDeviceProcAddrFunctionC)
		}

		for(f in features) {
			group("Provided by ${f.name}", 1) {
				for(c in f.commands) function(c.asCFunction)
			}
		}

		for(e in extensions) {
			if(e.commands.isEmpty()) continue

			group("Provided by ${e.name}", 1) {
				// Handle platform-specific extensions
				if(e.platform != null) {
					ifdef(e.platform.define) // #ifdef VK_USE_PLATFORM_...

					indented {
						for(c in e.commands) function(c.asCFunction)
					}

					endif() // #endif
				} else {
					for(c in e.commands) function(c.asCFunction)
				}
			}
		}
	}



	/*
	Wrapper function generation
	 */



	/**
	 * Iterates through all commands in [features] and [extensions].
	 */
	private inline fun forEachCommand(block: (VkCommand) -> Unit) {
		for(f in features)
			for(c in f.commands)
				block(c)

		for(e in extensions)
			for(c in e.commands)
				block(c)
	}



	/**
	 * Writes all commands whose addresses are obtained with vkGetInstanceProcAddr. These commands are grouped into a
	 * file called 'InstanceCommands'. In comparison to the raw jni functions, their parameters are made type-safe and
	 * their function addresses are automatically substituted via calls to vkGetInstanceProcAddr. Specifically, these
	 * functions are those whose first parameter is either a VkInstance or a VkPhysicalDevice.
	 */
	private fun writeInstanceCommands() = KWriter(directory/"InstanceCommands.kt").with {
		start {
			autogenComment()
			package_(packageName)
			imports(
				MemStacks::class.qualifiedName,
				Addressable::class.qualifiedName + ".Companion.addressOrNULL",
				"vulkan.generated.enumeration.*",
				"vulkan.generated.struct.*",
				"vulkan.generated.handle.*",
				"memory.primitive.*"
			)
		}

		suppress("unused")
		class_("class InstanceCommands(private val instance: InstanceH)") {
			declaration("private val stack = MemStacks.default")
			declaration("private fun addr(name: String) = " +
				"Commands.getInstanceProcAddr0(instance.address, stack.encodeUtf8NT(name).address)")

			multilineComment("Command addresses")
			declaration(noStyle) {
				writeln("init { stack.push() }")
				forEachCommand {
					if(it.isInstanceCommand)
						writeln("private val ${it.shortName}Addr = addr(\"${it.name}\")")
				}
				writeln("init { stack.pop() }")
			}

			multilineComment("Instance commands")
			forEachCommand {
				if(it.isInstanceCommand) function(it.asInstanceFunction)
			}
		}
	}



	/**
	 * Writes all commands whose addresses are obtained with vkGetDeviceProcAddr. These commands are grouped into a
	 * file called 'DeviceCommands'. In comparison to the raw jni functions, their parameters are made type-safe and
	 * their function addresses are automatically substituted via calls to vkGetDeviceProcAddr. Specifically, these
	 * functions are those whose first parameter is one of: VkDevice, VkQueue, or VkCommandBuffer.
	 */
	private fun writeDeviceCommands() = KWriter(directory/"DeviceCommands.kt").with {
		start {
			autogenComment()
			package_(packageName)
			imports(
				MemStacks::class.qualifiedName,
				Addressable::class.qualifiedName + ".Companion.addressOrNULL",
				"vulkan.generated.enumeration.*",
				"vulkan.generated.struct.*",
				"vulkan.generated.handle.*",
				"memory.primitive.*"
			)
		}

		suppress("unused")
		class_("class DeviceCommands(private val device: DeviceH)") {
			declaration("private val stack = MemStacks.default")
			declaration("private fun addr(name: String) = " +
				"Commands.getDeviceProcAddr0(device.address, stack.encodeUtf8NT(name).address)")

			multilineComment("Command addresses")
			declaration(noStyle) {
				writeln("init { stack.push() }")
				forEachCommand {
					if(it.isDeviceCommand)
						writeln("private val ${it.shortName}Addr = addr(\"${it.name}\")")
				}
				writeln("init { stack.pop() }")
			}

			multilineComment("Device commands")
			forEachCommand {
				if(it.isDeviceCommand) function(it.asDeviceFunction)
			}
		}
	}



	/**
	 * Writes any commands that are not device nor instance commands.
	 */
	private fun writeStandaloneCommands() = KWriter(directory/"StandaloneCommands.kt").with {
		start {
			autogenComment()
			package_(packageName)
			imports(
				MemStacks::class.qualifiedName,
				Addressable::class.qualifiedName + ".Companion.addressOrNULL",
				"vulkan.generated.enumeration.*",
				"vulkan.generated.struct.*",
				"memory.primitive.*"
			)
		}

		suppress("unused")
		class_("object StandaloneCommands") {
			declaration("private val stack = MemStacks.default")
			declaration("private fun addr(name: String) = " +
				"Commands.getInstanceProcAddr0(0L, stack.encodeUtf8NT(name).address)")

			multilineComment("Command addresses")
			declaration(noStyle) {
				writeln("init { stack.push() }")
				forEachCommand {
					if(it.isStandaloneCommand)
						writeln("private val ${it.shortName}Addr = addr(\"${it.name}\")")
				}
				writeln("init { stack.pop() }")
			}

			multilineComment("Standalone commands")
			forEachCommand {
				if(it.isStandaloneCommand) function(it.asStandaloneFunction)
			}
		}
	}


}