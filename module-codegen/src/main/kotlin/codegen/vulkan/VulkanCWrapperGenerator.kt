package codegen.vulkan

import codegen.vulkan.parse.*
import codegen.vulkan.scrape.Var
import codegen.writer.CWriter
import java.nio.file.Files
import java.nio.file.Path


class VulkanCWrapperGenerator(private val registry: ParsedRegistry, private val directory: Path) {


	init { Files.createDirectories(directory) }



	val providers = registry.providerElements.filter {
		it !is ExtensionElement || Filter.extensionNames.contains(it.name)
	}

	val typesToGen = HashSet<String>().apply {
		for(provider in providers)
			for(type in provider.types)
				add(type.name)
	}



	val types = registry.typeElements.filter { typesToGen.contains(it.name) }

	val commands = providers.flatMap { it.commands.filter { c -> c.alias == null } }

	val handles = types.filterIsInstance<HandleElement>()

	val enums = types.filterIsInstance<EnumElement>()

	val bitmasks = types.filterIsInstance<BitmaskElement>()

	val structs = types.filterIsInstance<StructElement>()



	private object Filter {

		val extensionNames = setOf(
			"VK_KHR_swapchain",
			"VK_KHR_surface",
			"VK_KHR_display",
			"VK_KHR_debug_utils"
		)

	}



	val VarElement.typeGenName get() = when(type) {
		"VkBool32"        -> "uint32_t"
		"VkDeviceAddress" -> "uint64_t"
		"VkDeviceSize"    -> "uint64_t"
		"VkFlags"         -> "uint32_t"
		"VkSampleMask"    -> "uint32_t"
		else              -> type
	}.let {
		if(modifier != Modifier.ARRAY)
			modifier.castName(it)
		else
			it
	}



	val VarElement.genName get() = if(modifier == Modifier.ARRAY)
		name + '[' + constLen!! + ']'
	else
		name




	fun genDef() = CWriter.writeHeader(directory, "vk_def") {
		multilineDeclaration("""
			#pragma clang diagnostic push
			#pragma ide diagnostic ignored "OCUnusedMacroInspection"
			#pragma ide diagnostic ignored "OCUnusedGlobalDeclarationInspection"
			#pragma once
			
			#include <stdint.h>
		""")

		group(0) {
			for(constant in registry.constantElements) {
				if(constant.aliased) continue

				declaration("#define ${constant.name} ${constant.cValue}")
			}
		}

		group(0) {
			for(handle in handles) {
				declaration("typedef struct ${handle.name}_T* ${handle.name};")
			}
		}

		for(enum in enums) {
			val entries = enum.entries.filter {
				it.alias == null && (it.extension == null || Filter.extensionNames.contains(it.extension))
			}

			if(entries.isEmpty()) {
				declaration("typedef uint32_t ${enum.name};")
				continue
			}

			declaration(noStyle) {
				write("typedef enum ${enum.name}")
				braced {
					for((index, entry) in entries.withIndex()) {
						if(index != enum.entries.size - 1)
							writeln("${entry.name} = ${entry.value},")
						else
							writeln("${entry.name} = ${entry.value}")
					}
				}
				resetNewline()
				writeln(" ${enum.name};")
			}
		}

		group(0) {
			for(bitmask in bitmasks) {
				declaration("typedef uint32_t ${bitmask.name};")
			}
		}

		multilineDeclaration("""
			typedef void* (__stdcall* PFN_vkAllocationFunction)(void* pUserData, size_t size, size_t alignment, VkSystemAllocationScope allocationScope);
			typedef void  (__stdcall* PFN_vkFreeFunction)(void* pUserData, void* pMemory);
			typedef void  (__stdcall* PFN_vkInternalAllocationNotification)(void* pUserData, size_t size, VkInternalAllocationType allocationType, VkSystemAllocationScope allocationScope);
			typedef void  (__stdcall* PFN_vkInternalFreeNotification)(void* pUserData, size_t size, VkInternalAllocationType allocationType, VkSystemAllocationScope allocationScope);
			typedef void* (__stdcall* PFN_vkReallocationFunction)(void* pUserData, void* pOriginal, size_t size, size_t alignment, VkSystemAllocationScope allocationScope);
			typedef void  (__stdcall* PFN_vkVoidFunction)(void);
		""")

		val structsToGen = ArrayList<StructElement>()
		val structNames = HashSet<String>()

		fun addStruct(struct: StructElement) {
			if(structNames.contains(struct.name)) return

			structNames.add(struct.name)

			for(member in struct.members) {
				registry.typeElements.fromName(member.type).let {
					if(it is StructElement)
						addStruct(it)
				}
			}

			structsToGen.add(struct)
		}

		for(struct in structs) addStruct(struct)

		for(struct in structsToGen) {
			var length = 0
			for(member in struct.members) {
				val typeLength = member.typeGenName.length
				if(typeLength > length) length = typeLength
			}

			declaration(noStyle) {
				write("typedef ${if(struct.isUnion) "union" else "struct"} ${struct.name}")
				braced {
					for(member in struct.members) {
						val typeName = member.typeGenName
						write(typeName)
						repeat(length - typeName.length + 4) { write(' ') }
						write(member.genName)
						writeln(';')
					}
				}
				resetNewline()
				writeln(" ${struct.name};")
			}
		}

		group(0) {
			for(command in commands) {
				declaration {
					val returnTypeName = when(command.returnType) {
						"VkBool32"        -> "uint32_t"
						"VkDeviceAddress" -> "uint64_t"
						"VkDeviceSize"    -> "uint64_t"
						"VkFlags"         -> "uint32_t"
						"VkSampleMask"    -> "uint32_t"
						null              -> "void"
						else              -> command.returnType
					}

					write("typedef $returnTypeName (__stdcall* PFN_${command.name})(")
					for((index, param) in command.params.withIndex()) {
						if(index != 0) write(' ')
						write("${param.typeGenName} ${param.name}")
						if(index != command.params.size - 1) write(',')
					}
					writeln(");")
				}
			}
		}

		group(0) {
			for(command in commands) {
				writeln("PFN_${command.name} ${command.name}_;")
			}
		}

	}


}