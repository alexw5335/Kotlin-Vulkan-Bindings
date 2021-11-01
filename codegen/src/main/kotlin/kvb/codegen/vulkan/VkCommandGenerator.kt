package kvb.codegen.vulkan

import kvb.codegen.GenConfig
import kvb.codegen.vulkan.scraper.element.VkCommand
import kvb.codegen.vulkan.scraper.element.VkExtension
import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.vulkan.scraper.type.*
import kvb.codegen.vulkan.scraper.element.VkVar
import kvb.codegen.vulkan.scraper.list.VkProviderList
import kvb.codegen.writer.CWriter
import kvb.codegen.writer.KWriter
import kvb.codegen.writer.procedural.JniGeneration
import kvb.codegen.writer.procedural.KFunction
import kvb.codegen.writer.procedural.Primitive
import kvb.core.memory.Addressable
import kvb.core.memory.MemStacks
import java.nio.file.Path

object VkCommandGenerator {


	fun generate(directory: Path, cDirectory: Path, providers: Iterable<VkProvider>) {
		writeCommandsK(directory, providers)
		writeCommandsC(cDirectory, providers)
		writeInstanceCommands(directory, providers)
		writeDeviceCommands(directory, providers)
		writeStandaloneCommands(directory, providers)
	}



	/*
	Parameter and argument strings
	 */



	private val VkVar.paramType: String get() = when {
		isArray -> when(type) {
			is VkTypeEnum      -> primitiveBufferName.makeOptional
			is VkTypeBitmask   -> primitiveBufferName.makeOptional
			is VkTypeStruct    -> "$typeName.Buffer".makeOptional
			is VkTypeHandle    -> primitiveBufferName.makeOptional
			is VkTypePrimitive -> primitiveBufferName.makeOptional
			else               -> Primitive.LONG.directName.makeOptional
		}

		isStringPointer -> type.primitive.bufferName.makeOptional

		isPointer -> when(type) {
			is VkTypeStruct    -> typeName.makeOptional
			is VkTypePrimitive -> type.primitive.directName.makeOptional
			else               -> Primitive.LONG.directName.makeOptional
		}

		else -> when(type) {
			is VkTypeStruct    -> throw RuntimeException("Non-pointer struct parameter") // should never happen.
			is VkTypeHandle    -> typeName.makeOptional
			else               -> typeName
		}
	}



	private val VkVar.argument: String get() = when {
		isArray -> when(type) {
			is VkTypeEnum 		-> addressString
			is VkTypeBitmask 	-> addressString
			is VkTypeStruct		-> addressString
			is VkTypeHandle 	-> addressString
			is VkTypePrimitive 	-> addressString
			is VkTypeVoid 		-> addressString
			else 				-> addressString
		}

		isStringPointer -> addressString

		isPointer -> when(type) {
			is VkTypeEnum 		-> addressString
			is VkTypeBitmask 	-> addressString
			is VkTypeStruct 	-> addressString
			is VkTypeHandle 	-> addressString
			is VkTypePrimitive  -> addressString
			is VkTypeVoid 		-> addressString
			else 				-> addressString
		}

		type is VkTypeEnum 		-> if(type.shouldGen) "$name.value" else if(type.is64Bit) "0L" else "0"
		type is VkTypeBitmask 	-> if(type.shouldGen) "$name.value" else if(type.is64Bit) "0L" else "0"
		type is VkTypeStruct 	-> addressString
		type is VkTypeHandle 	-> addressString
		type is VkTypePrimitive -> name
		type is VkTypeVoid 		-> addressString
		else					-> name
	}



	/*
	Jni generation utils
	 */



	private val VkVar.castName get() = "(${modifier.castName(type.name)}) $name"



	private val VkCommand.jniContents get() = buildString {
		if(returnType != null)
			append("return (${returnType.primitive.jniName}) ")

		append("((PFN_$name) address) (")

		for(i in params.indices) {
			append(params[i].castName)
			if(i != params.lastIndex) append(", ")
		}

		append(");")
	}



	private val VkVar.cType get() = if(isPointer || isArray)
		Primitive.LONG.jniName
	else
		type.primitive.jniName



	private val VkVar.kType get() = if(isPointer || isArray)
		Primitive.LONG.kName
	else
		type.primitive.kName



	private val VkCommand.asCFunction get() = JniGeneration.createCFunction(
		packageName  = GenConfig.commandPackage,
		className    = "Commands",
		functionName = genName,
		returnType   = returnType?.primitive?.jniName,
		params       = listOf("address" to "jlong") + params.map { Pair(it.name, it.cType) },
		contents     = jniContents
	)



	private val VkCommand.asKFunction get() = KFunction(
		name       = genName,
		returnType = returnType?.primitive?.kName,
		params     = listOf("address" to "Long") + params.map { Pair(it.name, it.kType) },
		modifiers  = listOf("external"),
	)





	/*
	Wrapper generation utils
	 */



	private val VkVar.shouldGenWrapperParam get() = when(type) {
		is VkTypeEnum    -> type.shouldGen
		is VkTypeBitmask -> type.shouldGen
		else             -> true
	}



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



	private val VkCommand.asInstanceFunction get() = KFunction(
		name 		= genName,
		returnType 	= kReturnType,
		params 		= params
			.filter { it.name != "instance" && it.shouldGenWrapperParam }
			.map    { Pair(it.name, it.paramType) },
		contents 	= kContents
	)



	private val VkCommand.asDeviceFunction get() = KFunction(
		name 		= genName,
		returnType 	= kReturnType,
		params 		= params
			.filter { it.name != "device" && it.shouldGenWrapperParam }
			.map    { Pair(it.name, it.paramType) },
		contents 	= kContents
	)



	private val VkCommand.asStandaloneFunction get() = KFunction(
		name 		= genName,
		returnType 	= kReturnType,
		params 		= params.map { Pair(it.name, it.paramType) },
		contents 	= kContents
	)



	/*
	Jni generation
	 */



	private fun writeCommandsK(
		directory: Path,
		providers: Iterable<VkProvider>
	) = KWriter.write(directory, "Commands") {
		start {
			autogenComment()
			package_(GenConfig.commandPackage)
		}

		suppress("unused")
		class_("object Commands") {
			declaration("external fun init(): Boolean")
			declaration("external fun getInstanceProcAddr(instance: Long, pname: Long): Long")

			for(p in providers) {
				if(p.commands.isEmpty()) continue
				group("Provided by ${p.name}", 1) {
					for(c in p.commands)
						if(c.shouldGen)
							function(c.asKFunction)
				}
			}
		}
	}



	private fun writeCommandsC(
		directory: Path,
		providers: Iterable<VkProvider>
	) = CWriter.write(directory, "vk_commands") {
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
					#include <dlfnc.h>
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
					void* module = LoadLibrary("libMoltenVK.dylib", RLTD_NOW | RLTD_LOCAL);
					getInstanceProcAddr = dlsym(module, "vkGetInstanceProcAddr");
					if(module == NULL) return 0;
				#else
					void* module = LoadLibary("libvulkan.so", RLTD_NOW | RLTD_LOCAL);
					getInstanceProcAddr = dlsym(module, "vkGetInstanceProcAddr");
					if(module == NULL) return 0;
				#endif
				if(getInstanceProcAddr == NULL) return 0;
				return 1;
			}
		""")

		multilineDeclaration("""
			JNIEXPORT jboolean JNICALL Java_vulkan_generated_command_Commands_init() {
				return (jboolean) initVulkan();
			}
		""")

		multilineDeclaration("""
			JNIEXPORT jlong JNICALL Java_vulkan_generated_command_Commands_getInstanceProcAddr(
				JNIEnv* env, 
				jobject obj, 
				jlong instance,
				jlong pName
			) {
				return (jlong) getInstanceProcAddr((VkInstance) instance, (const char*) pName);
			}
		""")

		for(p in providers) {
			if(p.commands.isEmpty()) continue

			group("Provided by ${p.name}", 1) {
				if(p is VkExtension && p.platform != null)
					ifdef(p.platform.define) // #ifdef VK_USE_PLATFORM_...

				for(c in p.commands)
					if(c.shouldGen)
						function(c.asCFunction)

				if(p is VkExtension && p.platform != null)
					endif() // #endif
			}
		}
	}



	/*
	Wrapper generation
	 */



	private fun writeInstanceCommands(
		directory: Path,
		providers: Iterable<VkProvider>
	) = KWriter.write(directory, "InstanceCommands") {
		start {
			autogenComment()
			package_(GenConfig.commandPackage)
			imports(
				MemStacks::class,
				Addressable::class.qualifiedName + ".Companion.addressOrNULL",
				GenConfig.enumPackage + ".*",
				GenConfig.structPackage + ".*",
				GenConfig.handlePackage + ".*",
				GenConfig.primitivePackage + ".*"
			)
		}

		suppress("unused")
		class_("class InstanceCommands(private val instance: InstanceH)") {
			declaration("private val stack = MemStacks.default")
			declaration("private fun addr(name: String) = " +
				"Commands.getInstanceProcAddr(instance.address, stack.encodeUtf8NT(name).address)")

			multilineComment("Command addresses")
			declaration(noStyle) {
				writeln("init { stack.push() }")

				for(p in providers)
					for(c in p.commands)
						if(c.type == VkCommand.Type.INSTANCE && c.shouldGen)
							writeln("private val ${c.genName}Addr = addr(\"${c.name}\")")

				writeln("init { stack.pop() }")
			}

			multilineComment("Instance commands")

			for(p in providers)
				for(c in p.commands)
					if(c.type == VkCommand.Type.INSTANCE && c.shouldGen)
						function(c.asInstanceFunction)
		}
	}



	private fun writeDeviceCommands(
		directory: Path,
		providers: Iterable<VkProvider>
	) = KWriter.write(directory, "DeviceCommands") {
		start {
			autogenComment()
			package_(GenConfig.commandPackage)
			imports(
				MemStacks::class,
				Addressable::class.qualifiedName + ".Companion.addressOrNULL",
				GenConfig.enumPackage + ".*",
				GenConfig.structPackage + ".*",
				GenConfig.handlePackage + ".*",
				GenConfig.primitivePackage + ".*"
			)
		}

		suppress("unused")
		class_("class DeviceCommands(private val device: DeviceH, private val instanceCommands: InstanceCommands)") {
			declaration("private val stack = MemStacks.default")
			declaration("private fun addr(name: String) = " +
				"instanceCommands.getDeviceProcAddr(device, stack.encodeUtf8NT(name))")

			multilineComment("Command addresses")
			declaration(noStyle) {
				writeln("init { stack.push() }")

				for(p in providers)
					for(c in p.commands)
						if(c.type == VkCommand.Type.DEVICE && c.shouldGen)
							writeln("private val ${c.genName}Addr = addr(\"${c.name}\")")

				writeln("init { stack.pop() }")
			}

			multilineComment("Device commands")

			for(p in providers)
				for(c in p.commands)
					if(c.type == VkCommand.Type.DEVICE && c.shouldGen)
						function(c.asDeviceFunction)
		}
	}



	private fun writeStandaloneCommands(
		directory: Path,
		providers: Iterable<VkProvider>
	) = KWriter.write(directory, "StandaloneCommands") {
		start {
			autogenComment()
			package_(GenConfig.commandPackage)
			imports(
				MemStacks::class,
				Addressable::class.qualifiedName + ".Companion.addressOrNULL",
				GenConfig.enumPackage + ".*",
				GenConfig.structPackage + ".*",
				GenConfig.primitivePackage + ".*"
			)
		}

		suppress("unused")
		class_("object StandaloneCommands") {
			declaration("private val stack = MemStacks.default")
			declaration("private fun addr(name: String) = " +
				"Commands.getInstanceProcAddr(0L, stack.encodeUtf8NT(name).address)")

			multilineComment("Command addresses")
			declaration(noStyle) {
				writeln("init { stack.push() }")

				for(p in providers)
					for(c in p.commands)
						if(c.type == VkCommand.Type.STANDALONE && c.shouldGen)
							writeln("private val ${c.genName}Addr = addr(\"${c.name}\")")

				writeln("init { stack.pop() }")
			}

			multilineComment("Standalone commands")

			for(p in providers)
				for(c in p.commands)
					if(c.type == VkCommand.Type.STANDALONE && c.shouldGen)
						function(c.asStandaloneFunction)
		}
	}


}