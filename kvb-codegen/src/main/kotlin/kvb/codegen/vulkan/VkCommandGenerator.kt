package kvb.codegen.vulkan

import kvb.codegen.*
import kvb.codegen.vulkan.scraper.element.VkCommand
import kvb.codegen.vulkan.scraper.element.VkExtension
import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.vulkan.scraper.element.VkVar
import kvb.codegen.vulkan.scraper.type.*
import kvb.codegen.writer.CWriter
import kvb.codegen.writer.KWriter
import kvb.codegen.writer.procedural.JniGeneration
import kvb.codegen.writer.procedural.KFunction
import kvb.codegen.writer.procedural.Primitive
import kvb.core.memory.Addressable
import kvb.core.memory.Allocator
import kvb.core.memory.MemStacks

object VkCommandGenerator {


	fun generate(providers: Iterable<VkProvider>) {
		printCommandsK(providers)
		printCommandsC(providers)
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
			is VkTypeStruct    -> throw RuntimeException("Non-pointer struct parameter")
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
		packageName  = vulkanPackage,
		className    = "Commands",
		functionName = genName,
		returnType   = returnType?.primitive?.jniName,
		params       = listOf("jlong" to "address") + params.map { Pair(it.cType, it.name) },
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


	private fun printCommandsK(providers: Iterable<VkProvider>) = KWriter.write(vulkanDir, "_Commands") {
		start {
			autogenComment()
			comment("This file's name has been prefixed with '_' so that it appears at the top of the package.")
			suppressFile("Unused", "FunctionName")
			package_(vulkanPackage)
			imports(
				MemStacks::class.qualifiedName + ".default",
				Addressable::class.qualifiedName + ".Companion.addressOrNULL",
				"$primitivePackage.*"
			)
		}

		val commands = ArrayList<VkCommand>().apply {
			for(p in providers)
				for(c in p.commands)
					if(c.shouldGen)
						add(c)
		}

		val instanceCommands = commands.filter { it.type == VkCommand.Type.INSTANCE }
		val deviceCommands = commands.filter { it.type == VkCommand.Type.DEVICE }
		val standaloneCommands = commands.filter { it.type == VkCommand.Type.STANDALONE }

		currentStyle = style(decSpacing = 3)

		class_("object Commands") {
			group(spacing = 1) {
				declaration("private external fun init(): Boolean")
				declaration("init { init() }")
				declaration("external fun getInstanceProcAddr(instance: Long, pname: Long): Long")
			}

			group(spacing = 1) {
				for(c in commands)
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



	private fun printCommandsC(providers: Iterable<VkProvider>) = CWriter.write(cDir, "vk_commands") {
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
				packageName  = vulkanPackage,
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
				packageName  = vulkanPackage,
				className    = "Commands",
				functionName = "getInstanceProcAddr",
				returnType   = "jlong",
				params       = listOf("jlong" to "instance", "jlong" to "pName"),
				contents     = "return (jlong) getInstanceProcAddr((VkInstance) instance, (const char*) pName);"
			)
		)

		for(p in providers) {
			if(p.commands.isEmpty()) continue

			group("Provided by ${p.name}", 1) {
				if(p is VkExtension && p.platform != null)
					ifdef(p.platform.define) // #ifdef VK_USE_PLATFORM_...

				for(c in p.commands)
					function(c.asCFunction)

				if(p is VkExtension && p.platform != null)
					endif() // #endif
			}
		}
	}


}