// This file has been automatically generated.

package vulkan.generated.command

import memory.allocation.MemStacks
import memory.type.Addressable.Companion.addressOrNULL
import vulkan.generated.enumeration.*
import vulkan.generated.struct.*
import memory.primitive.*

@Suppress("unused")
object StandaloneCommands {
	
	
	private val stack = MemStacks.default
	
	
	
	private fun addr(name: String) = Commands.getInstanceProcAddr0(0L, stack.encodeUtf8NT(name).address)
	
	
	
	/*
	Command addresses
	 */
	
	
	
	init { stack.push() }
	private val createInstanceAddr = addr("vkCreateInstance")
	private val enumerateInstanceExtensionPropertiesAddr = addr("vkEnumerateInstanceExtensionProperties")
	private val enumerateInstanceLayerPropertiesAddr = addr("vkEnumerateInstanceLayerProperties")
	private val enumerateInstanceVersionAddr = addr("vkEnumerateInstanceVersion")
	init { stack.pop() }
	
	
	
	/*
	Standalone commands
	 */
	
	
	
	fun createInstance(pCreateInfo: InstanceCreateInfo, pAllocator: AllocationCallbacks?, pInstance: NativePointer): Result {
		return Result(Commands.createInstance(createInstanceAddr, pCreateInfo.address, pAllocator.addressOrNULL, pInstance.address))
	}
	
	
	
	fun enumerateInstanceExtensionProperties(pLayerName: DirectByteBuffer?, pPropertyCount: DirectInt, pProperties: ExtensionProperties.Buffer?): Result {
		return Result(Commands.enumerateInstanceExtensionProperties(enumerateInstanceExtensionPropertiesAddr, pLayerName.addressOrNULL, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun enumerateInstanceLayerProperties(pPropertyCount: DirectInt, pProperties: LayerProperties.Buffer?): Result {
		return Result(Commands.enumerateInstanceLayerProperties(enumerateInstanceLayerPropertiesAddr, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun enumerateInstanceVersion(pApiVersion: DirectInt): Result {
		return Result(Commands.enumerateInstanceVersion(enumerateInstanceVersionAddr, pApiVersion.address))
	}


}