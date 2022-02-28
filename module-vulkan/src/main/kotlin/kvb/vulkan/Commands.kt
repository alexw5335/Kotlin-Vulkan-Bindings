// This file has been automatically generated.

@file:Suppress("Unused")

package kvb.vulkan

import kvb.core.memory.MemStack
import kvb.core.memory.*
import kvb.core.memory.direct.*

object Commands {
	
	
	init { loadVulkan() }
	
	external fun loadVulkan(): Boolean
	
	external fun getInstanceProcAddr(instance: Long, pName: Long): Long
	
	private val stack = MemStack.current()
	
	private fun addr(name: String) = getInstanceProcAddr(0L, stack.encodeUtf8NT(name).address)
	
	
	
	private val stackPointer = stack.push()
	private val createInstanceAddr = addr("vkCreateInstance")
	private val enumerateInstanceExtensionPropertiesAddr = addr("vkEnumerateInstanceExtensionProperties")
	private val enumerateInstanceLayerPropertiesAddr = addr("vkEnumerateInstanceLayerProperties")
	private val enumerateInstanceVersionAddr = addr("vkEnumerateInstanceVersion")
	init { stack.pop(stackPointer) }
	
	
	
	fun createInstance(pCreateInfo: InstanceCreateInfo, pAllocator: AllocationCallbacks?, pInstance: DirectLong): Result {
		return Result(createInstance(createInstanceAddr, pCreateInfo.address, pAllocator.addressOrNULL, pInstance.address))
	}
	
	fun enumerateInstanceExtensionProperties(pLayerName: DirectByteBuffer?, pPropertyCount: DirectInt, pProperties: ExtensionProperties.Buffer?): Result {
		return Result(enumerateInstanceExtensionProperties(enumerateInstanceExtensionPropertiesAddr, pLayerName.addressOrNULL, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun enumerateInstanceLayerProperties(pPropertyCount: DirectInt, pProperties: LayerProperties.Buffer?): Result {
		return Result(enumerateInstanceLayerProperties(enumerateInstanceLayerPropertiesAddr, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun enumerateInstanceVersion(pApiVersion: DirectInt): Result {
		return Result(enumerateInstanceVersion(enumerateInstanceVersionAddr, pApiVersion.address))
	}


}



class InstanceCommands(private val instance: InstanceH) {
	
	
	private val stack = MemStack.current()
	
	private fun addr(name: String) = Commands.getInstanceProcAddr(instance.address, stack.encodeUtf8NT(name).address)
	
	
	
	private val stackPointer = stack.push()
	private val destroyInstanceAddr = addr("vkDestroyInstance")
	private val enumeratePhysicalDevicesAddr = addr("vkEnumeratePhysicalDevices")
	private val getPhysicalDeviceFeaturesAddr = addr("vkGetPhysicalDeviceFeatures")
	private val getPhysicalDeviceFormatPropertiesAddr = addr("vkGetPhysicalDeviceFormatProperties")
	private val getPhysicalDeviceImageFormatPropertiesAddr = addr("vkGetPhysicalDeviceImageFormatProperties")
	private val getPhysicalDevicePropertiesAddr = addr("vkGetPhysicalDeviceProperties")
	private val getPhysicalDeviceQueueFamilyPropertiesAddr = addr("vkGetPhysicalDeviceQueueFamilyProperties")
	private val getPhysicalDeviceMemoryPropertiesAddr = addr("vkGetPhysicalDeviceMemoryProperties")
	private val getDeviceProcAddrAddr = addr("vkGetDeviceProcAddr")
	private val createDeviceAddr = addr("vkCreateDevice")
	private val enumerateDeviceExtensionPropertiesAddr = addr("vkEnumerateDeviceExtensionProperties")
	private val enumerateDeviceLayerPropertiesAddr = addr("vkEnumerateDeviceLayerProperties")
	private val getPhysicalDeviceSparseImageFormatPropertiesAddr = addr("vkGetPhysicalDeviceSparseImageFormatProperties")
	private val enumeratePhysicalDeviceGroupsAddr = addr("vkEnumeratePhysicalDeviceGroups")
	private val getPhysicalDeviceFeatures2Addr = addr("vkGetPhysicalDeviceFeatures2")
	private val getPhysicalDeviceProperties2Addr = addr("vkGetPhysicalDeviceProperties2")
	private val getPhysicalDeviceFormatProperties2Addr = addr("vkGetPhysicalDeviceFormatProperties2")
	private val getPhysicalDeviceImageFormatProperties2Addr = addr("vkGetPhysicalDeviceImageFormatProperties2")
	private val getPhysicalDeviceQueueFamilyProperties2Addr = addr("vkGetPhysicalDeviceQueueFamilyProperties2")
	private val getPhysicalDeviceMemoryProperties2Addr = addr("vkGetPhysicalDeviceMemoryProperties2")
	private val getPhysicalDeviceSparseImageFormatProperties2Addr = addr("vkGetPhysicalDeviceSparseImageFormatProperties2")
	private val getPhysicalDeviceExternalBufferPropertiesAddr = addr("vkGetPhysicalDeviceExternalBufferProperties")
	private val getPhysicalDeviceExternalFencePropertiesAddr = addr("vkGetPhysicalDeviceExternalFenceProperties")
	private val getPhysicalDeviceExternalSemaphorePropertiesAddr = addr("vkGetPhysicalDeviceExternalSemaphoreProperties")
	private val getPhysicalDeviceToolPropertiesAddr = addr("vkGetPhysicalDeviceToolProperties")
	private val destroySurfaceAddr = addr("vkDestroySurfaceKHR")
	private val getPhysicalDeviceSurfaceSupportAddr = addr("vkGetPhysicalDeviceSurfaceSupportKHR")
	private val getPhysicalDeviceSurfaceCapabilitiesAddr = addr("vkGetPhysicalDeviceSurfaceCapabilitiesKHR")
	private val getPhysicalDeviceSurfaceFormatsAddr = addr("vkGetPhysicalDeviceSurfaceFormatsKHR")
	private val getPhysicalDeviceSurfacePresentModesAddr = addr("vkGetPhysicalDeviceSurfacePresentModesKHR")
	private val getPhysicalDevicePresentRectanglesAddr = addr("vkGetPhysicalDevicePresentRectanglesKHR")
	private val getPhysicalDeviceDisplayPropertiesAddr = addr("vkGetPhysicalDeviceDisplayPropertiesKHR")
	private val getPhysicalDeviceDisplayPlanePropertiesAddr = addr("vkGetPhysicalDeviceDisplayPlanePropertiesKHR")
	private val getDisplayPlaneSupportedDisplaysAddr = addr("vkGetDisplayPlaneSupportedDisplaysKHR")
	private val getDisplayModePropertiesAddr = addr("vkGetDisplayModePropertiesKHR")
	private val createDisplayModeAddr = addr("vkCreateDisplayModeKHR")
	private val getDisplayPlaneCapabilitiesAddr = addr("vkGetDisplayPlaneCapabilitiesKHR")
	private val createDisplayPlaneSurfaceAddr = addr("vkCreateDisplayPlaneSurfaceKHR")
	private val createWin32SurfaceAddr = addr("vkCreateWin32SurfaceKHR")
	private val getPhysicalDeviceWin32PresentationSupportAddr = addr("vkGetPhysicalDeviceWin32PresentationSupportKHR")
	private val createDebugUtilsMessengerAddr = addr("vkCreateDebugUtilsMessengerEXT")
	private val destroyDebugUtilsMessengerAddr = addr("vkDestroyDebugUtilsMessengerEXT")
	private val submitDebugUtilsMessageAddr = addr("vkSubmitDebugUtilsMessageEXT")
	init { stack.pop(stackPointer) }
	
	
	
	fun destroyInstance(pAllocator: AllocationCallbacks?) {
		destroyInstance(destroyInstanceAddr, instance.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun enumeratePhysicalDevices(pPhysicalDeviceCount: DirectInt, pPhysicalDevices: DirectLongBuffer?): Result {
		return Result(enumeratePhysicalDevices(enumeratePhysicalDevicesAddr, instance.address, pPhysicalDeviceCount.address, pPhysicalDevices.addressOrNULL))
	}
	
	fun getPhysicalDeviceFeatures(physicalDevice: PhysicalDeviceH, pFeatures: PhysicalDeviceFeatures) {
		getPhysicalDeviceFeatures(getPhysicalDeviceFeaturesAddr, physicalDevice.address, pFeatures.address)
	}
	
	fun getPhysicalDeviceFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, pFormatProperties: FormatProperties) {
		getPhysicalDeviceFormatProperties(getPhysicalDeviceFormatPropertiesAddr, physicalDevice.address, format.value, pFormatProperties.address)
	}
	
	fun getPhysicalDeviceImageFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, type: ImageType, tiling: ImageTiling, usage: ImageUsageFlags, flags: ImageCreateFlags, pImageFormatProperties: ImageFormatProperties): Result {
		return Result(getPhysicalDeviceImageFormatProperties(getPhysicalDeviceImageFormatPropertiesAddr, physicalDevice.address, format.value, type.value, tiling.value, usage.value, flags.value, pImageFormatProperties.address))
	}
	
	fun getPhysicalDeviceProperties(physicalDevice: PhysicalDeviceH, pProperties: PhysicalDeviceProperties) {
		getPhysicalDeviceProperties(getPhysicalDevicePropertiesAddr, physicalDevice.address, pProperties.address)
	}
	
	fun getPhysicalDeviceQueueFamilyProperties(physicalDevice: PhysicalDeviceH, pQueueFamilyPropertyCount: DirectInt, pQueueFamilyProperties: QueueFamilyProperties.Buffer?) {
		getPhysicalDeviceQueueFamilyProperties(getPhysicalDeviceQueueFamilyPropertiesAddr, physicalDevice.address, pQueueFamilyPropertyCount.address, pQueueFamilyProperties.addressOrNULL)
	}
	
	fun getPhysicalDeviceMemoryProperties(physicalDevice: PhysicalDeviceH, pMemoryProperties: PhysicalDeviceMemoryProperties) {
		getPhysicalDeviceMemoryProperties(getPhysicalDeviceMemoryPropertiesAddr, physicalDevice.address, pMemoryProperties.address)
	}
	
	fun getDeviceProcAddr(device: DeviceH, pName: DirectByteBuffer): Long {
		return getDeviceProcAddr(getDeviceProcAddrAddr, device.address, pName.address)
	}
	
	fun createDevice(physicalDevice: PhysicalDeviceH, pCreateInfo: DeviceCreateInfo, pAllocator: AllocationCallbacks?, pDevice: DirectLong): Result {
		return Result(createDevice(createDeviceAddr, physicalDevice.address, pCreateInfo.address, pAllocator.addressOrNULL, pDevice.address))
	}
	
	fun enumerateDeviceExtensionProperties(physicalDevice: PhysicalDeviceH, pLayerName: DirectByteBuffer?, pPropertyCount: DirectInt, pProperties: ExtensionProperties.Buffer?): Result {
		return Result(enumerateDeviceExtensionProperties(enumerateDeviceExtensionPropertiesAddr, physicalDevice.address, pLayerName.addressOrNULL, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun enumerateDeviceLayerProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: LayerProperties.Buffer?): Result {
		return Result(enumerateDeviceLayerProperties(enumerateDeviceLayerPropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun getPhysicalDeviceSparseImageFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, type: ImageType, samples: SampleCountFlags, usage: ImageUsageFlags, tiling: ImageTiling, pPropertyCount: DirectInt, pProperties: SparseImageFormatProperties.Buffer?) {
		getPhysicalDeviceSparseImageFormatProperties(getPhysicalDeviceSparseImageFormatPropertiesAddr, physicalDevice.address, format.value, type.value, samples.value, usage.value, tiling.value, pPropertyCount.address, pProperties.addressOrNULL)
	}
	
	fun enumeratePhysicalDeviceGroups(pPhysicalDeviceGroupCount: DirectInt, pPhysicalDeviceGroupProperties: PhysicalDeviceGroupProperties.Buffer?): Result {
		return Result(enumeratePhysicalDeviceGroups(enumeratePhysicalDeviceGroupsAddr, instance.address, pPhysicalDeviceGroupCount.address, pPhysicalDeviceGroupProperties.addressOrNULL))
	}
	
	fun getPhysicalDeviceFeatures2(physicalDevice: PhysicalDeviceH, pFeatures: PhysicalDeviceFeatures2) {
		getPhysicalDeviceFeatures2(getPhysicalDeviceFeatures2Addr, physicalDevice.address, pFeatures.address)
	}
	
	fun getPhysicalDeviceProperties2(physicalDevice: PhysicalDeviceH, pProperties: PhysicalDeviceProperties2) {
		getPhysicalDeviceProperties2(getPhysicalDeviceProperties2Addr, physicalDevice.address, pProperties.address)
	}
	
	fun getPhysicalDeviceFormatProperties2(physicalDevice: PhysicalDeviceH, format: Format, pFormatProperties: FormatProperties2) {
		getPhysicalDeviceFormatProperties2(getPhysicalDeviceFormatProperties2Addr, physicalDevice.address, format.value, pFormatProperties.address)
	}
	
	fun getPhysicalDeviceImageFormatProperties2(physicalDevice: PhysicalDeviceH, pImageFormatInfo: PhysicalDeviceImageFormatInfo2, pImageFormatProperties: ImageFormatProperties2): Result {
		return Result(getPhysicalDeviceImageFormatProperties2(getPhysicalDeviceImageFormatProperties2Addr, physicalDevice.address, pImageFormatInfo.address, pImageFormatProperties.address))
	}
	
	fun getPhysicalDeviceQueueFamilyProperties2(physicalDevice: PhysicalDeviceH, pQueueFamilyPropertyCount: DirectInt, pQueueFamilyProperties: QueueFamilyProperties2.Buffer?) {
		getPhysicalDeviceQueueFamilyProperties2(getPhysicalDeviceQueueFamilyProperties2Addr, physicalDevice.address, pQueueFamilyPropertyCount.address, pQueueFamilyProperties.addressOrNULL)
	}
	
	fun getPhysicalDeviceMemoryProperties2(physicalDevice: PhysicalDeviceH, pMemoryProperties: PhysicalDeviceMemoryProperties2) {
		getPhysicalDeviceMemoryProperties2(getPhysicalDeviceMemoryProperties2Addr, physicalDevice.address, pMemoryProperties.address)
	}
	
	fun getPhysicalDeviceSparseImageFormatProperties2(physicalDevice: PhysicalDeviceH, pFormatInfo: PhysicalDeviceSparseImageFormatInfo2, pPropertyCount: DirectInt, pProperties: SparseImageFormatProperties2.Buffer?) {
		getPhysicalDeviceSparseImageFormatProperties2(getPhysicalDeviceSparseImageFormatProperties2Addr, physicalDevice.address, pFormatInfo.address, pPropertyCount.address, pProperties.addressOrNULL)
	}
	
	fun getPhysicalDeviceExternalBufferProperties(physicalDevice: PhysicalDeviceH, pExternalBufferInfo: PhysicalDeviceExternalBufferInfo, pExternalBufferProperties: ExternalBufferProperties) {
		getPhysicalDeviceExternalBufferProperties(getPhysicalDeviceExternalBufferPropertiesAddr, physicalDevice.address, pExternalBufferInfo.address, pExternalBufferProperties.address)
	}
	
	fun getPhysicalDeviceExternalFenceProperties(physicalDevice: PhysicalDeviceH, pExternalFenceInfo: PhysicalDeviceExternalFenceInfo, pExternalFenceProperties: ExternalFenceProperties) {
		getPhysicalDeviceExternalFenceProperties(getPhysicalDeviceExternalFencePropertiesAddr, physicalDevice.address, pExternalFenceInfo.address, pExternalFenceProperties.address)
	}
	
	fun getPhysicalDeviceExternalSemaphoreProperties(physicalDevice: PhysicalDeviceH, pExternalSemaphoreInfo: PhysicalDeviceExternalSemaphoreInfo, pExternalSemaphoreProperties: ExternalSemaphoreProperties) {
		getPhysicalDeviceExternalSemaphoreProperties(getPhysicalDeviceExternalSemaphorePropertiesAddr, physicalDevice.address, pExternalSemaphoreInfo.address, pExternalSemaphoreProperties.address)
	}
	
	fun getPhysicalDeviceToolProperties(physicalDevice: PhysicalDeviceH, pToolCount: DirectInt, pToolProperties: PhysicalDeviceToolProperties.Buffer?): Result {
		return Result(getPhysicalDeviceToolProperties(getPhysicalDeviceToolPropertiesAddr, physicalDevice.address, pToolCount.address, pToolProperties.addressOrNULL))
	}
	
	fun destroySurface(surface: SurfaceH?, pAllocator: AllocationCallbacks?) {
		destroySurface(destroySurfaceAddr, instance.address, surface.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun getPhysicalDeviceSurfaceSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, surface: SurfaceH, pSupported: DirectInt): Result {
		return Result(getPhysicalDeviceSurfaceSupport(getPhysicalDeviceSurfaceSupportAddr, physicalDevice.address, queueFamilyIndex, surface.address, pSupported.address))
	}
	
	fun getPhysicalDeviceSurfaceCapabilities(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pSurfaceCapabilities: SurfaceCapabilities): Result {
		return Result(getPhysicalDeviceSurfaceCapabilities(getPhysicalDeviceSurfaceCapabilitiesAddr, physicalDevice.address, surface.address, pSurfaceCapabilities.address))
	}
	
	fun getPhysicalDeviceSurfaceFormats(physicalDevice: PhysicalDeviceH, surface: SurfaceH?, pSurfaceFormatCount: DirectInt, pSurfaceFormats: SurfaceFormat.Buffer?): Result {
		return Result(getPhysicalDeviceSurfaceFormats(getPhysicalDeviceSurfaceFormatsAddr, physicalDevice.address, surface.addressOrNULL, pSurfaceFormatCount.address, pSurfaceFormats.addressOrNULL))
	}
	
	fun getPhysicalDeviceSurfacePresentModes(physicalDevice: PhysicalDeviceH, surface: SurfaceH?, pPresentModeCount: DirectInt, pPresentModes: DirectIntBuffer?): Result {
		return Result(getPhysicalDeviceSurfacePresentModes(getPhysicalDeviceSurfacePresentModesAddr, physicalDevice.address, surface.addressOrNULL, pPresentModeCount.address, pPresentModes.addressOrNULL))
	}
	
	fun getPhysicalDevicePresentRectangles(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pRectCount: DirectInt, pRects: Rect2D.Buffer?): Result {
		return Result(getPhysicalDevicePresentRectangles(getPhysicalDevicePresentRectanglesAddr, physicalDevice.address, surface.address, pRectCount.address, pRects.addressOrNULL))
	}
	
	fun getPhysicalDeviceDisplayProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayProperties.Buffer?): Result {
		return Result(getPhysicalDeviceDisplayProperties(getPhysicalDeviceDisplayPropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun getPhysicalDeviceDisplayPlaneProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayPlaneProperties.Buffer?): Result {
		return Result(getPhysicalDeviceDisplayPlaneProperties(getPhysicalDeviceDisplayPlanePropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun getDisplayPlaneSupportedDisplays(physicalDevice: PhysicalDeviceH, planeIndex: Int, pDisplayCount: DirectInt, pDisplays: DirectLongBuffer?): Result {
		return Result(getDisplayPlaneSupportedDisplays(getDisplayPlaneSupportedDisplaysAddr, physicalDevice.address, planeIndex, pDisplayCount.address, pDisplays.addressOrNULL))
	}
	
	fun getDisplayModeProperties(physicalDevice: PhysicalDeviceH, display: DisplayH, pPropertyCount: DirectInt, pProperties: DisplayModeProperties.Buffer?): Result {
		return Result(getDisplayModeProperties(getDisplayModePropertiesAddr, physicalDevice.address, display.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun createDisplayMode(physicalDevice: PhysicalDeviceH, display: DisplayH, pCreateInfo: DisplayModeCreateInfo, pAllocator: AllocationCallbacks?, pMode: DirectLong): Result {
		return Result(createDisplayMode(createDisplayModeAddr, physicalDevice.address, display.address, pCreateInfo.address, pAllocator.addressOrNULL, pMode.address))
	}
	
	fun getDisplayPlaneCapabilities(physicalDevice: PhysicalDeviceH, mode: DisplayModeH, planeIndex: Int, pCapabilities: DisplayPlaneCapabilities): Result {
		return Result(getDisplayPlaneCapabilities(getDisplayPlaneCapabilitiesAddr, physicalDevice.address, mode.address, planeIndex, pCapabilities.address))
	}
	
	fun createDisplayPlaneSurface(pCreateInfo: DisplaySurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(createDisplayPlaneSurface(createDisplayPlaneSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun createWin32Surface(pCreateInfo: Win32SurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(createWin32Surface(createWin32SurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun getPhysicalDeviceWin32PresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int): Int {
		return getPhysicalDeviceWin32PresentationSupport(getPhysicalDeviceWin32PresentationSupportAddr, physicalDevice.address, queueFamilyIndex)
	}
	
	fun createDebugUtilsMessenger(pCreateInfo: DebugUtilsMessengerCreateInfo, pAllocator: AllocationCallbacks?, pMessenger: DirectLong): Result {
		return Result(createDebugUtilsMessenger(createDebugUtilsMessengerAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pMessenger.address))
	}
	
	fun destroyDebugUtilsMessenger(messenger: DebugUtilsMessengerH?, pAllocator: AllocationCallbacks?) {
		destroyDebugUtilsMessenger(destroyDebugUtilsMessengerAddr, instance.address, messenger.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun submitDebugUtilsMessage(messageSeverity: DebugUtilsMessageSeverityFlags, messageTypes: DebugUtilsMessageTypeFlags, pCallbackData: DebugUtilsMessengerCallbackData) {
		submitDebugUtilsMessage(submitDebugUtilsMessageAddr, instance.address, messageSeverity.value, messageTypes.value, pCallbackData.address)
	}


}



class DeviceCommands(private val device: DeviceH, private val instanceCommands: InstanceCommands) {
	
	
	private val stack = MemStack.current()
	
	private fun addr(name: String) = instanceCommands.getDeviceProcAddr(device, stack.encodeUtf8NT(name))
	
	
	
	private val stackPointer = stack.push()
	private val destroyDeviceAddr = addr("vkDestroyDevice")
	private val getDeviceQueueAddr = addr("vkGetDeviceQueue")
	private val queueSubmitAddr = addr("vkQueueSubmit")
	private val queueWaitIdleAddr = addr("vkQueueWaitIdle")
	private val deviceWaitIdleAddr = addr("vkDeviceWaitIdle")
	private val allocateMemoryAddr = addr("vkAllocateMemory")
	private val freeMemoryAddr = addr("vkFreeMemory")
	private val mapMemoryAddr = addr("vkMapMemory")
	private val unmapMemoryAddr = addr("vkUnmapMemory")
	private val flushMappedMemoryRangesAddr = addr("vkFlushMappedMemoryRanges")
	private val invalidateMappedMemoryRangesAddr = addr("vkInvalidateMappedMemoryRanges")
	private val getDeviceMemoryCommitmentAddr = addr("vkGetDeviceMemoryCommitment")
	private val bindBufferMemoryAddr = addr("vkBindBufferMemory")
	private val bindImageMemoryAddr = addr("vkBindImageMemory")
	private val getBufferMemoryRequirementsAddr = addr("vkGetBufferMemoryRequirements")
	private val getImageMemoryRequirementsAddr = addr("vkGetImageMemoryRequirements")
	private val getImageSparseMemoryRequirementsAddr = addr("vkGetImageSparseMemoryRequirements")
	private val queueBindSparseAddr = addr("vkQueueBindSparse")
	private val createFenceAddr = addr("vkCreateFence")
	private val destroyFenceAddr = addr("vkDestroyFence")
	private val resetFencesAddr = addr("vkResetFences")
	private val getFenceStatusAddr = addr("vkGetFenceStatus")
	private val waitForFencesAddr = addr("vkWaitForFences")
	private val createSemaphoreAddr = addr("vkCreateSemaphore")
	private val destroySemaphoreAddr = addr("vkDestroySemaphore")
	private val createEventAddr = addr("vkCreateEvent")
	private val destroyEventAddr = addr("vkDestroyEvent")
	private val getEventStatusAddr = addr("vkGetEventStatus")
	private val setEventAddr = addr("vkSetEvent")
	private val resetEventAddr = addr("vkResetEvent")
	private val createQueryPoolAddr = addr("vkCreateQueryPool")
	private val destroyQueryPoolAddr = addr("vkDestroyQueryPool")
	private val getQueryPoolResultsAddr = addr("vkGetQueryPoolResults")
	private val createBufferAddr = addr("vkCreateBuffer")
	private val destroyBufferAddr = addr("vkDestroyBuffer")
	private val createBufferViewAddr = addr("vkCreateBufferView")
	private val destroyBufferViewAddr = addr("vkDestroyBufferView")
	private val createImageAddr = addr("vkCreateImage")
	private val destroyImageAddr = addr("vkDestroyImage")
	private val getImageSubresourceLayoutAddr = addr("vkGetImageSubresourceLayout")
	private val createImageViewAddr = addr("vkCreateImageView")
	private val destroyImageViewAddr = addr("vkDestroyImageView")
	private val createShaderModuleAddr = addr("vkCreateShaderModule")
	private val destroyShaderModuleAddr = addr("vkDestroyShaderModule")
	private val createPipelineCacheAddr = addr("vkCreatePipelineCache")
	private val destroyPipelineCacheAddr = addr("vkDestroyPipelineCache")
	private val getPipelineCacheDataAddr = addr("vkGetPipelineCacheData")
	private val mergePipelineCachesAddr = addr("vkMergePipelineCaches")
	private val createGraphicsPipelinesAddr = addr("vkCreateGraphicsPipelines")
	private val createComputePipelinesAddr = addr("vkCreateComputePipelines")
	private val destroyPipelineAddr = addr("vkDestroyPipeline")
	private val createPipelineLayoutAddr = addr("vkCreatePipelineLayout")
	private val destroyPipelineLayoutAddr = addr("vkDestroyPipelineLayout")
	private val createSamplerAddr = addr("vkCreateSampler")
	private val destroySamplerAddr = addr("vkDestroySampler")
	private val createDescriptorSetLayoutAddr = addr("vkCreateDescriptorSetLayout")
	private val destroyDescriptorSetLayoutAddr = addr("vkDestroyDescriptorSetLayout")
	private val createDescriptorPoolAddr = addr("vkCreateDescriptorPool")
	private val destroyDescriptorPoolAddr = addr("vkDestroyDescriptorPool")
	private val resetDescriptorPoolAddr = addr("vkResetDescriptorPool")
	private val allocateDescriptorSetsAddr = addr("vkAllocateDescriptorSets")
	private val freeDescriptorSetsAddr = addr("vkFreeDescriptorSets")
	private val updateDescriptorSetsAddr = addr("vkUpdateDescriptorSets")
	private val createFramebufferAddr = addr("vkCreateFramebuffer")
	private val destroyFramebufferAddr = addr("vkDestroyFramebuffer")
	private val createRenderPassAddr = addr("vkCreateRenderPass")
	private val destroyRenderPassAddr = addr("vkDestroyRenderPass")
	private val getRenderAreaGranularityAddr = addr("vkGetRenderAreaGranularity")
	private val createCommandPoolAddr = addr("vkCreateCommandPool")
	private val destroyCommandPoolAddr = addr("vkDestroyCommandPool")
	private val resetCommandPoolAddr = addr("vkResetCommandPool")
	private val allocateCommandBuffersAddr = addr("vkAllocateCommandBuffers")
	private val freeCommandBuffersAddr = addr("vkFreeCommandBuffers")
	private val beginCommandBufferAddr = addr("vkBeginCommandBuffer")
	private val endCommandBufferAddr = addr("vkEndCommandBuffer")
	private val resetCommandBufferAddr = addr("vkResetCommandBuffer")
	private val cmdBindPipelineAddr = addr("vkCmdBindPipeline")
	private val cmdSetViewportAddr = addr("vkCmdSetViewport")
	private val cmdSetScissorAddr = addr("vkCmdSetScissor")
	private val cmdSetLineWidthAddr = addr("vkCmdSetLineWidth")
	private val cmdSetDepthBiasAddr = addr("vkCmdSetDepthBias")
	private val cmdSetBlendConstantsAddr = addr("vkCmdSetBlendConstants")
	private val cmdSetDepthBoundsAddr = addr("vkCmdSetDepthBounds")
	private val cmdSetStencilCompareMaskAddr = addr("vkCmdSetStencilCompareMask")
	private val cmdSetStencilWriteMaskAddr = addr("vkCmdSetStencilWriteMask")
	private val cmdSetStencilReferenceAddr = addr("vkCmdSetStencilReference")
	private val cmdBindDescriptorSetsAddr = addr("vkCmdBindDescriptorSets")
	private val cmdBindIndexBufferAddr = addr("vkCmdBindIndexBuffer")
	private val cmdBindVertexBuffersAddr = addr("vkCmdBindVertexBuffers")
	private val cmdDrawAddr = addr("vkCmdDraw")
	private val cmdDrawIndexedAddr = addr("vkCmdDrawIndexed")
	private val cmdDrawIndirectAddr = addr("vkCmdDrawIndirect")
	private val cmdDrawIndexedIndirectAddr = addr("vkCmdDrawIndexedIndirect")
	private val cmdDispatchAddr = addr("vkCmdDispatch")
	private val cmdDispatchIndirectAddr = addr("vkCmdDispatchIndirect")
	private val cmdCopyBufferAddr = addr("vkCmdCopyBuffer")
	private val cmdCopyImageAddr = addr("vkCmdCopyImage")
	private val cmdBlitImageAddr = addr("vkCmdBlitImage")
	private val cmdCopyBufferToImageAddr = addr("vkCmdCopyBufferToImage")
	private val cmdCopyImageToBufferAddr = addr("vkCmdCopyImageToBuffer")
	private val cmdUpdateBufferAddr = addr("vkCmdUpdateBuffer")
	private val cmdFillBufferAddr = addr("vkCmdFillBuffer")
	private val cmdClearColorImageAddr = addr("vkCmdClearColorImage")
	private val cmdClearDepthStencilImageAddr = addr("vkCmdClearDepthStencilImage")
	private val cmdClearAttachmentsAddr = addr("vkCmdClearAttachments")
	private val cmdResolveImageAddr = addr("vkCmdResolveImage")
	private val cmdSetEventAddr = addr("vkCmdSetEvent")
	private val cmdResetEventAddr = addr("vkCmdResetEvent")
	private val cmdWaitEventsAddr = addr("vkCmdWaitEvents")
	private val cmdPipelineBarrierAddr = addr("vkCmdPipelineBarrier")
	private val cmdBeginQueryAddr = addr("vkCmdBeginQuery")
	private val cmdEndQueryAddr = addr("vkCmdEndQuery")
	private val cmdResetQueryPoolAddr = addr("vkCmdResetQueryPool")
	private val cmdWriteTimestampAddr = addr("vkCmdWriteTimestamp")
	private val cmdCopyQueryPoolResultsAddr = addr("vkCmdCopyQueryPoolResults")
	private val cmdPushConstantsAddr = addr("vkCmdPushConstants")
	private val cmdBeginRenderPassAddr = addr("vkCmdBeginRenderPass")
	private val cmdNextSubpassAddr = addr("vkCmdNextSubpass")
	private val cmdEndRenderPassAddr = addr("vkCmdEndRenderPass")
	private val cmdExecuteCommandsAddr = addr("vkCmdExecuteCommands")
	private val bindBufferMemory2Addr = addr("vkBindBufferMemory2")
	private val bindImageMemory2Addr = addr("vkBindImageMemory2")
	private val getDeviceGroupPeerMemoryFeaturesAddr = addr("vkGetDeviceGroupPeerMemoryFeatures")
	private val cmdSetDeviceMaskAddr = addr("vkCmdSetDeviceMask")
	private val cmdDispatchBaseAddr = addr("vkCmdDispatchBase")
	private val getImageMemoryRequirements2Addr = addr("vkGetImageMemoryRequirements2")
	private val getBufferMemoryRequirements2Addr = addr("vkGetBufferMemoryRequirements2")
	private val getImageSparseMemoryRequirements2Addr = addr("vkGetImageSparseMemoryRequirements2")
	private val trimCommandPoolAddr = addr("vkTrimCommandPool")
	private val getDeviceQueue2Addr = addr("vkGetDeviceQueue2")
	private val createSamplerYcbcrConversionAddr = addr("vkCreateSamplerYcbcrConversion")
	private val destroySamplerYcbcrConversionAddr = addr("vkDestroySamplerYcbcrConversion")
	private val createDescriptorUpdateTemplateAddr = addr("vkCreateDescriptorUpdateTemplate")
	private val destroyDescriptorUpdateTemplateAddr = addr("vkDestroyDescriptorUpdateTemplate")
	private val updateDescriptorSetWithTemplateAddr = addr("vkUpdateDescriptorSetWithTemplate")
	private val getDescriptorSetLayoutSupportAddr = addr("vkGetDescriptorSetLayoutSupport")
	private val cmdDrawIndirectCountAddr = addr("vkCmdDrawIndirectCount")
	private val cmdDrawIndexedIndirectCountAddr = addr("vkCmdDrawIndexedIndirectCount")
	private val createRenderPass2Addr = addr("vkCreateRenderPass2")
	private val cmdBeginRenderPass2Addr = addr("vkCmdBeginRenderPass2")
	private val cmdNextSubpass2Addr = addr("vkCmdNextSubpass2")
	private val cmdEndRenderPass2Addr = addr("vkCmdEndRenderPass2")
	private val resetQueryPoolAddr = addr("vkResetQueryPool")
	private val getSemaphoreCounterValueAddr = addr("vkGetSemaphoreCounterValue")
	private val waitSemaphoresAddr = addr("vkWaitSemaphores")
	private val signalSemaphoreAddr = addr("vkSignalSemaphore")
	private val getBufferDeviceAddressAddr = addr("vkGetBufferDeviceAddress")
	private val getBufferOpaqueCaptureAddressAddr = addr("vkGetBufferOpaqueCaptureAddress")
	private val getDeviceMemoryOpaqueCaptureAddressAddr = addr("vkGetDeviceMemoryOpaqueCaptureAddress")
	private val createPrivateDataSlotAddr = addr("vkCreatePrivateDataSlot")
	private val destroyPrivateDataSlotAddr = addr("vkDestroyPrivateDataSlot")
	private val setPrivateDataAddr = addr("vkSetPrivateData")
	private val getPrivateDataAddr = addr("vkGetPrivateData")
	private val cmdSetEvent2Addr = addr("vkCmdSetEvent2")
	private val cmdResetEvent2Addr = addr("vkCmdResetEvent2")
	private val cmdWaitEvents2Addr = addr("vkCmdWaitEvents2")
	private val cmdPipelineBarrier2Addr = addr("vkCmdPipelineBarrier2")
	private val cmdWriteTimestamp2Addr = addr("vkCmdWriteTimestamp2")
	private val queueSubmit2Addr = addr("vkQueueSubmit2")
	private val cmdCopyBuffer2Addr = addr("vkCmdCopyBuffer2")
	private val cmdCopyImage2Addr = addr("vkCmdCopyImage2")
	private val cmdCopyBufferToImage2Addr = addr("vkCmdCopyBufferToImage2")
	private val cmdCopyImageToBuffer2Addr = addr("vkCmdCopyImageToBuffer2")
	private val cmdBlitImage2Addr = addr("vkCmdBlitImage2")
	private val cmdResolveImage2Addr = addr("vkCmdResolveImage2")
	private val cmdBeginRenderingAddr = addr("vkCmdBeginRendering")
	private val cmdEndRenderingAddr = addr("vkCmdEndRendering")
	private val cmdSetCullModeAddr = addr("vkCmdSetCullMode")
	private val cmdSetFrontFaceAddr = addr("vkCmdSetFrontFace")
	private val cmdSetPrimitiveTopologyAddr = addr("vkCmdSetPrimitiveTopology")
	private val cmdSetViewportWithCountAddr = addr("vkCmdSetViewportWithCount")
	private val cmdSetScissorWithCountAddr = addr("vkCmdSetScissorWithCount")
	private val cmdBindVertexBuffers2Addr = addr("vkCmdBindVertexBuffers2")
	private val cmdSetDepthTestEnableAddr = addr("vkCmdSetDepthTestEnable")
	private val cmdSetDepthWriteEnableAddr = addr("vkCmdSetDepthWriteEnable")
	private val cmdSetDepthCompareOpAddr = addr("vkCmdSetDepthCompareOp")
	private val cmdSetDepthBoundsTestEnableAddr = addr("vkCmdSetDepthBoundsTestEnable")
	private val cmdSetStencilTestEnableAddr = addr("vkCmdSetStencilTestEnable")
	private val cmdSetStencilOpAddr = addr("vkCmdSetStencilOp")
	private val cmdSetRasterizerDiscardEnableAddr = addr("vkCmdSetRasterizerDiscardEnable")
	private val cmdSetDepthBiasEnableAddr = addr("vkCmdSetDepthBiasEnable")
	private val cmdSetPrimitiveRestartEnableAddr = addr("vkCmdSetPrimitiveRestartEnable")
	private val getDeviceBufferMemoryRequirementsAddr = addr("vkGetDeviceBufferMemoryRequirements")
	private val getDeviceImageMemoryRequirementsAddr = addr("vkGetDeviceImageMemoryRequirements")
	private val getDeviceImageSparseMemoryRequirementsAddr = addr("vkGetDeviceImageSparseMemoryRequirements")
	private val createSwapchainAddr = addr("vkCreateSwapchainKHR")
	private val destroySwapchainAddr = addr("vkDestroySwapchainKHR")
	private val getSwapchainImagesAddr = addr("vkGetSwapchainImagesKHR")
	private val acquireNextImageAddr = addr("vkAcquireNextImageKHR")
	private val queuePresentAddr = addr("vkQueuePresentKHR")
	private val getDeviceGroupPresentCapabilitiesAddr = addr("vkGetDeviceGroupPresentCapabilitiesKHR")
	private val getDeviceGroupSurfacePresentModesAddr = addr("vkGetDeviceGroupSurfacePresentModesKHR")
	private val acquireNextImage2Addr = addr("vkAcquireNextImage2KHR")
	private val setDebugUtilsObjectNameAddr = addr("vkSetDebugUtilsObjectNameEXT")
	private val setDebugUtilsObjectTagAddr = addr("vkSetDebugUtilsObjectTagEXT")
	private val queueBeginDebugUtilsLabelAddr = addr("vkQueueBeginDebugUtilsLabelEXT")
	private val queueEndDebugUtilsLabelAddr = addr("vkQueueEndDebugUtilsLabelEXT")
	private val queueInsertDebugUtilsLabelAddr = addr("vkQueueInsertDebugUtilsLabelEXT")
	private val cmdBeginDebugUtilsLabelAddr = addr("vkCmdBeginDebugUtilsLabelEXT")
	private val cmdEndDebugUtilsLabelAddr = addr("vkCmdEndDebugUtilsLabelEXT")
	private val cmdInsertDebugUtilsLabelAddr = addr("vkCmdInsertDebugUtilsLabelEXT")
	init { stack.pop(stackPointer) }
	
	
	
	fun destroyDevice(pAllocator: AllocationCallbacks?) {
		destroyDevice(destroyDeviceAddr, device.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun getDeviceQueue(queueFamilyIndex: Int, queueIndex: Int, pQueue: DirectLong) {
		getDeviceQueue(getDeviceQueueAddr, device.address, queueFamilyIndex, queueIndex, pQueue.address)
	}
	
	fun queueSubmit(queue: QueueH, submitCount: Int, pSubmits: SubmitInfo.Buffer, fence: FenceH?): Result {
		return Result(queueSubmit(queueSubmitAddr, queue.address, submitCount, pSubmits.address, fence.addressOrNULL))
	}
	
	fun queueWaitIdle(queue: QueueH): Result {
		return Result(queueWaitIdle(queueWaitIdleAddr, queue.address))
	}
	
	fun deviceWaitIdle(): Result {
		return Result(deviceWaitIdle(deviceWaitIdleAddr, device.address))
	}
	
	fun allocateMemory(pAllocateInfo: MemoryAllocateInfo, pAllocator: AllocationCallbacks?, pMemory: DirectLong): Result {
		return Result(allocateMemory(allocateMemoryAddr, device.address, pAllocateInfo.address, pAllocator.addressOrNULL, pMemory.address))
	}
	
	fun freeMemory(memory: DeviceMemoryH?, pAllocator: AllocationCallbacks?) {
		freeMemory(freeMemoryAddr, device.address, memory.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun mapMemory(memory: DeviceMemoryH, offset: Long, size: Long, ppData: DirectLong): Result {
		return Result(mapMemory(mapMemoryAddr, device.address, memory.address, offset, size, 0, ppData.address))
	}
	
	fun unmapMemory(memory: DeviceMemoryH) {
		unmapMemory(unmapMemoryAddr, device.address, memory.address)
	}
	
	fun flushMappedMemoryRanges(memoryRangeCount: Int, pMemoryRanges: MappedMemoryRange.Buffer): Result {
		return Result(flushMappedMemoryRanges(flushMappedMemoryRangesAddr, device.address, memoryRangeCount, pMemoryRanges.address))
	}
	
	fun invalidateMappedMemoryRanges(memoryRangeCount: Int, pMemoryRanges: MappedMemoryRange.Buffer): Result {
		return Result(invalidateMappedMemoryRanges(invalidateMappedMemoryRangesAddr, device.address, memoryRangeCount, pMemoryRanges.address))
	}
	
	fun getDeviceMemoryCommitment(memory: DeviceMemoryH, pCommittedMemoryInBytes: DirectLong) {
		getDeviceMemoryCommitment(getDeviceMemoryCommitmentAddr, device.address, memory.address, pCommittedMemoryInBytes.address)
	}
	
	fun bindBufferMemory(buffer: BufferH, memory: DeviceMemoryH, memoryOffset: Long): Result {
		return Result(bindBufferMemory(bindBufferMemoryAddr, device.address, buffer.address, memory.address, memoryOffset))
	}
	
	fun bindImageMemory(image: ImageH, memory: DeviceMemoryH, memoryOffset: Long): Result {
		return Result(bindImageMemory(bindImageMemoryAddr, device.address, image.address, memory.address, memoryOffset))
	}
	
	fun getBufferMemoryRequirements(buffer: BufferH, pMemoryRequirements: MemoryRequirements) {
		getBufferMemoryRequirements(getBufferMemoryRequirementsAddr, device.address, buffer.address, pMemoryRequirements.address)
	}
	
	fun getImageMemoryRequirements(image: ImageH, pMemoryRequirements: MemoryRequirements) {
		getImageMemoryRequirements(getImageMemoryRequirementsAddr, device.address, image.address, pMemoryRequirements.address)
	}
	
	fun getImageSparseMemoryRequirements(image: ImageH, pSparseMemoryRequirementCount: DirectInt, pSparseMemoryRequirements: SparseImageMemoryRequirements.Buffer?) {
		getImageSparseMemoryRequirements(getImageSparseMemoryRequirementsAddr, device.address, image.address, pSparseMemoryRequirementCount.address, pSparseMemoryRequirements.addressOrNULL)
	}
	
	fun queueBindSparse(queue: QueueH, bindInfoCount: Int, pBindInfo: BindSparseInfo.Buffer, fence: FenceH?): Result {
		return Result(queueBindSparse(queueBindSparseAddr, queue.address, bindInfoCount, pBindInfo.address, fence.addressOrNULL))
	}
	
	fun createFence(pCreateInfo: FenceCreateInfo, pAllocator: AllocationCallbacks?, pFence: DirectLong): Result {
		return Result(createFence(createFenceAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pFence.address))
	}
	
	fun destroyFence(fence: FenceH?, pAllocator: AllocationCallbacks?) {
		destroyFence(destroyFenceAddr, device.address, fence.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun resetFences(fenceCount: Int, pFences: DirectLongBuffer): Result {
		return Result(resetFences(resetFencesAddr, device.address, fenceCount, pFences.address))
	}
	
	fun getFenceStatus(fence: FenceH): Result {
		return Result(getFenceStatus(getFenceStatusAddr, device.address, fence.address))
	}
	
	fun waitForFences(fenceCount: Int, pFences: DirectLongBuffer, waitAll: Int, timeout: Long): Result {
		return Result(waitForFences(waitForFencesAddr, device.address, fenceCount, pFences.address, waitAll, timeout))
	}
	
	fun createSemaphore(pCreateInfo: SemaphoreCreateInfo, pAllocator: AllocationCallbacks?, pSemaphore: DirectLong): Result {
		return Result(createSemaphore(createSemaphoreAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSemaphore.address))
	}
	
	fun destroySemaphore(semaphore: SemaphoreH?, pAllocator: AllocationCallbacks?) {
		destroySemaphore(destroySemaphoreAddr, device.address, semaphore.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun createEvent(pCreateInfo: EventCreateInfo, pAllocator: AllocationCallbacks?, pEvent: DirectLong): Result {
		return Result(createEvent(createEventAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pEvent.address))
	}
	
	fun destroyEvent(event: EventH?, pAllocator: AllocationCallbacks?) {
		destroyEvent(destroyEventAddr, device.address, event.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun getEventStatus(event: EventH): Result {
		return Result(getEventStatus(getEventStatusAddr, device.address, event.address))
	}
	
	fun setEvent(event: EventH): Result {
		return Result(setEvent(setEventAddr, device.address, event.address))
	}
	
	fun resetEvent(event: EventH): Result {
		return Result(resetEvent(resetEventAddr, device.address, event.address))
	}
	
	fun createQueryPool(pCreateInfo: QueryPoolCreateInfo, pAllocator: AllocationCallbacks?, pQueryPool: DirectLong): Result {
		return Result(createQueryPool(createQueryPoolAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pQueryPool.address))
	}
	
	fun destroyQueryPool(queryPool: QueryPoolH?, pAllocator: AllocationCallbacks?) {
		destroyQueryPool(destroyQueryPoolAddr, device.address, queryPool.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun getQueryPoolResults(queryPool: QueryPoolH, firstQuery: Int, queryCount: Int, dataSize: Long, pData: DirectLong, stride: Long, flags: QueryResultFlags): Result {
		return Result(getQueryPoolResults(getQueryPoolResultsAddr, device.address, queryPool.address, firstQuery, queryCount, dataSize, pData.address, stride, flags.value))
	}
	
	fun createBuffer(pCreateInfo: BufferCreateInfo, pAllocator: AllocationCallbacks?, pBuffer: DirectLong): Result {
		return Result(createBuffer(createBufferAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pBuffer.address))
	}
	
	fun destroyBuffer(buffer: BufferH?, pAllocator: AllocationCallbacks?) {
		destroyBuffer(destroyBufferAddr, device.address, buffer.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun createBufferView(pCreateInfo: BufferViewCreateInfo, pAllocator: AllocationCallbacks?, pView: DirectLong): Result {
		return Result(createBufferView(createBufferViewAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pView.address))
	}
	
	fun destroyBufferView(bufferView: BufferViewH?, pAllocator: AllocationCallbacks?) {
		destroyBufferView(destroyBufferViewAddr, device.address, bufferView.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun createImage(pCreateInfo: ImageCreateInfo, pAllocator: AllocationCallbacks?, pImage: DirectLong): Result {
		return Result(createImage(createImageAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pImage.address))
	}
	
	fun destroyImage(image: ImageH?, pAllocator: AllocationCallbacks?) {
		destroyImage(destroyImageAddr, device.address, image.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun getImageSubresourceLayout(image: ImageH, pSubresource: ImageSubresource, pLayout: SubresourceLayout) {
		getImageSubresourceLayout(getImageSubresourceLayoutAddr, device.address, image.address, pSubresource.address, pLayout.address)
	}
	
	fun createImageView(pCreateInfo: ImageViewCreateInfo, pAllocator: AllocationCallbacks?, pView: DirectLong): Result {
		return Result(createImageView(createImageViewAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pView.address))
	}
	
	fun destroyImageView(imageView: ImageViewH?, pAllocator: AllocationCallbacks?) {
		destroyImageView(destroyImageViewAddr, device.address, imageView.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun createShaderModule(pCreateInfo: ShaderModuleCreateInfo, pAllocator: AllocationCallbacks?, pShaderModule: DirectLong): Result {
		return Result(createShaderModule(createShaderModuleAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pShaderModule.address))
	}
	
	fun destroyShaderModule(shaderModule: ShaderModuleH?, pAllocator: AllocationCallbacks?) {
		destroyShaderModule(destroyShaderModuleAddr, device.address, shaderModule.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun createPipelineCache(pCreateInfo: PipelineCacheCreateInfo, pAllocator: AllocationCallbacks?, pPipelineCache: DirectLong): Result {
		return Result(createPipelineCache(createPipelineCacheAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pPipelineCache.address))
	}
	
	fun destroyPipelineCache(pipelineCache: PipelineCacheH?, pAllocator: AllocationCallbacks?) {
		destroyPipelineCache(destroyPipelineCacheAddr, device.address, pipelineCache.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun getPipelineCacheData(pipelineCache: PipelineCacheH, pDataSize: DirectLong, pData: DirectLong?): Result {
		return Result(getPipelineCacheData(getPipelineCacheDataAddr, device.address, pipelineCache.address, pDataSize.address, pData.addressOrNULL))
	}
	
	fun mergePipelineCaches(dstCache: PipelineCacheH, srcCacheCount: Int, pSrcCaches: DirectLongBuffer): Result {
		return Result(mergePipelineCaches(mergePipelineCachesAddr, device.address, dstCache.address, srcCacheCount, pSrcCaches.address))
	}
	
	fun createGraphicsPipelines(pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: GraphicsPipelineCreateInfo.Buffer, pAllocator: AllocationCallbacks?, pPipelines: DirectLongBuffer): Result {
		return Result(createGraphicsPipelines(createGraphicsPipelinesAddr, device.address, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	fun createComputePipelines(pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: ComputePipelineCreateInfo.Buffer, pAllocator: AllocationCallbacks?, pPipelines: DirectLongBuffer): Result {
		return Result(createComputePipelines(createComputePipelinesAddr, device.address, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	fun destroyPipeline(pipeline: PipelineH?, pAllocator: AllocationCallbacks?) {
		destroyPipeline(destroyPipelineAddr, device.address, pipeline.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun createPipelineLayout(pCreateInfo: PipelineLayoutCreateInfo, pAllocator: AllocationCallbacks?, pPipelineLayout: DirectLong): Result {
		return Result(createPipelineLayout(createPipelineLayoutAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pPipelineLayout.address))
	}
	
	fun destroyPipelineLayout(pipelineLayout: PipelineLayoutH?, pAllocator: AllocationCallbacks?) {
		destroyPipelineLayout(destroyPipelineLayoutAddr, device.address, pipelineLayout.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun createSampler(pCreateInfo: SamplerCreateInfo, pAllocator: AllocationCallbacks?, pSampler: DirectLong): Result {
		return Result(createSampler(createSamplerAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSampler.address))
	}
	
	fun destroySampler(sampler: SamplerH?, pAllocator: AllocationCallbacks?) {
		destroySampler(destroySamplerAddr, device.address, sampler.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun createDescriptorSetLayout(pCreateInfo: DescriptorSetLayoutCreateInfo, pAllocator: AllocationCallbacks?, pSetLayout: DirectLong): Result {
		return Result(createDescriptorSetLayout(createDescriptorSetLayoutAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSetLayout.address))
	}
	
	fun destroyDescriptorSetLayout(descriptorSetLayout: DescriptorSetLayoutH?, pAllocator: AllocationCallbacks?) {
		destroyDescriptorSetLayout(destroyDescriptorSetLayoutAddr, device.address, descriptorSetLayout.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun createDescriptorPool(pCreateInfo: DescriptorPoolCreateInfo, pAllocator: AllocationCallbacks?, pDescriptorPool: DirectLong): Result {
		return Result(createDescriptorPool(createDescriptorPoolAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pDescriptorPool.address))
	}
	
	fun destroyDescriptorPool(descriptorPool: DescriptorPoolH?, pAllocator: AllocationCallbacks?) {
		destroyDescriptorPool(destroyDescriptorPoolAddr, device.address, descriptorPool.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun resetDescriptorPool(descriptorPool: DescriptorPoolH): Result {
		return Result(resetDescriptorPool(resetDescriptorPoolAddr, device.address, descriptorPool.address, 0))
	}
	
	fun allocateDescriptorSets(pAllocateInfo: DescriptorSetAllocateInfo, pDescriptorSets: DirectLongBuffer): Result {
		return Result(allocateDescriptorSets(allocateDescriptorSetsAddr, device.address, pAllocateInfo.address, pDescriptorSets.address))
	}
	
	fun freeDescriptorSets(descriptorPool: DescriptorPoolH, descriptorSetCount: Int, pDescriptorSets: DirectLongBuffer): Result {
		return Result(freeDescriptorSets(freeDescriptorSetsAddr, device.address, descriptorPool.address, descriptorSetCount, pDescriptorSets.address))
	}
	
	fun updateDescriptorSets(descriptorWriteCount: Int, pDescriptorWrites: WriteDescriptorSet.Buffer, descriptorCopyCount: Int, pDescriptorCopies: CopyDescriptorSet.Buffer) {
		updateDescriptorSets(updateDescriptorSetsAddr, device.address, descriptorWriteCount, pDescriptorWrites.address, descriptorCopyCount, pDescriptorCopies.address)
	}
	
	fun createFramebuffer(pCreateInfo: FramebufferCreateInfo, pAllocator: AllocationCallbacks?, pFramebuffer: DirectLong): Result {
		return Result(createFramebuffer(createFramebufferAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pFramebuffer.address))
	}
	
	fun destroyFramebuffer(framebuffer: FramebufferH?, pAllocator: AllocationCallbacks?) {
		destroyFramebuffer(destroyFramebufferAddr, device.address, framebuffer.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun createRenderPass(pCreateInfo: RenderPassCreateInfo, pAllocator: AllocationCallbacks?, pRenderPass: DirectLong): Result {
		return Result(createRenderPass(createRenderPassAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pRenderPass.address))
	}
	
	fun destroyRenderPass(renderPass: RenderPassH?, pAllocator: AllocationCallbacks?) {
		destroyRenderPass(destroyRenderPassAddr, device.address, renderPass.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun getRenderAreaGranularity(renderPass: RenderPassH, pGranularity: Extent2D) {
		getRenderAreaGranularity(getRenderAreaGranularityAddr, device.address, renderPass.address, pGranularity.address)
	}
	
	fun createCommandPool(pCreateInfo: CommandPoolCreateInfo, pAllocator: AllocationCallbacks?, pCommandPool: DirectLong): Result {
		return Result(createCommandPool(createCommandPoolAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pCommandPool.address))
	}
	
	fun destroyCommandPool(commandPool: CommandPoolH?, pAllocator: AllocationCallbacks?) {
		destroyCommandPool(destroyCommandPoolAddr, device.address, commandPool.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun resetCommandPool(commandPool: CommandPoolH, flags: CommandPoolResetFlags): Result {
		return Result(resetCommandPool(resetCommandPoolAddr, device.address, commandPool.address, flags.value))
	}
	
	fun allocateCommandBuffers(pAllocateInfo: CommandBufferAllocateInfo, pCommandBuffers: DirectLongBuffer): Result {
		return Result(allocateCommandBuffers(allocateCommandBuffersAddr, device.address, pAllocateInfo.address, pCommandBuffers.address))
	}
	
	fun freeCommandBuffers(commandPool: CommandPoolH, commandBufferCount: Int, pCommandBuffers: DirectLongBuffer) {
		freeCommandBuffers(freeCommandBuffersAddr, device.address, commandPool.address, commandBufferCount, pCommandBuffers.address)
	}
	
	fun beginCommandBuffer(commandBuffer: CommandBufferH, pBeginInfo: CommandBufferBeginInfo): Result {
		return Result(beginCommandBuffer(beginCommandBufferAddr, commandBuffer.address, pBeginInfo.address))
	}
	
	fun endCommandBuffer(commandBuffer: CommandBufferH): Result {
		return Result(endCommandBuffer(endCommandBufferAddr, commandBuffer.address))
	}
	
	fun resetCommandBuffer(commandBuffer: CommandBufferH, flags: CommandBufferResetFlags): Result {
		return Result(resetCommandBuffer(resetCommandBufferAddr, commandBuffer.address, flags.value))
	}
	
	fun cmdBindPipeline(commandBuffer: CommandBufferH, pipelineBindPoint: PipelineBindPoint, pipeline: PipelineH) {
		cmdBindPipeline(cmdBindPipelineAddr, commandBuffer.address, pipelineBindPoint.value, pipeline.address)
	}
	
	fun cmdSetViewport(commandBuffer: CommandBufferH, firstViewport: Int, viewportCount: Int, pViewports: Viewport.Buffer) {
		cmdSetViewport(cmdSetViewportAddr, commandBuffer.address, firstViewport, viewportCount, pViewports.address)
	}
	
	fun cmdSetScissor(commandBuffer: CommandBufferH, firstScissor: Int, scissorCount: Int, pScissors: Rect2D.Buffer) {
		cmdSetScissor(cmdSetScissorAddr, commandBuffer.address, firstScissor, scissorCount, pScissors.address)
	}
	
	fun cmdSetLineWidth(commandBuffer: CommandBufferH, lineWidth: Float) {
		cmdSetLineWidth(cmdSetLineWidthAddr, commandBuffer.address, lineWidth)
	}
	
	fun cmdSetDepthBias(commandBuffer: CommandBufferH, depthBiasConstantFactor: Float, depthBiasClamp: Float, depthBiasSlopeFactor: Float) {
		cmdSetDepthBias(cmdSetDepthBiasAddr, commandBuffer.address, depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor)
	}
	
	fun cmdSetBlendConstants(commandBuffer: CommandBufferH, blendConstants: DirectFloatBuffer) {
		cmdSetBlendConstants(cmdSetBlendConstantsAddr, commandBuffer.address, blendConstants.address)
	}
	
	fun cmdSetDepthBounds(commandBuffer: CommandBufferH, minDepthBounds: Float, maxDepthBounds: Float) {
		cmdSetDepthBounds(cmdSetDepthBoundsAddr, commandBuffer.address, minDepthBounds, maxDepthBounds)
	}
	
	fun cmdSetStencilCompareMask(commandBuffer: CommandBufferH, faceMask: StencilFaceFlags, compareMask: Int) {
		cmdSetStencilCompareMask(cmdSetStencilCompareMaskAddr, commandBuffer.address, faceMask.value, compareMask)
	}
	
	fun cmdSetStencilWriteMask(commandBuffer: CommandBufferH, faceMask: StencilFaceFlags, writeMask: Int) {
		cmdSetStencilWriteMask(cmdSetStencilWriteMaskAddr, commandBuffer.address, faceMask.value, writeMask)
	}
	
	fun cmdSetStencilReference(commandBuffer: CommandBufferH, faceMask: StencilFaceFlags, reference: Int) {
		cmdSetStencilReference(cmdSetStencilReferenceAddr, commandBuffer.address, faceMask.value, reference)
	}
	
	fun cmdBindDescriptorSets(commandBuffer: CommandBufferH, pipelineBindPoint: PipelineBindPoint, layout: PipelineLayoutH, firstSet: Int, descriptorSetCount: Int, pDescriptorSets: DirectLongBuffer, dynamicOffsetCount: Int, pDynamicOffsets: DirectIntBuffer) {
		cmdBindDescriptorSets(cmdBindDescriptorSetsAddr, commandBuffer.address, pipelineBindPoint.value, layout.address, firstSet, descriptorSetCount, pDescriptorSets.address, dynamicOffsetCount, pDynamicOffsets.address)
	}
	
	fun cmdBindIndexBuffer(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, indexType: IndexType) {
		cmdBindIndexBuffer(cmdBindIndexBufferAddr, commandBuffer.address, buffer.address, offset, indexType.value)
	}
	
	fun cmdBindVertexBuffers(commandBuffer: CommandBufferH, firstBinding: Int, bindingCount: Int, pBuffers: DirectLongBuffer, pOffsets: DirectLongBuffer) {
		cmdBindVertexBuffers(cmdBindVertexBuffersAddr, commandBuffer.address, firstBinding, bindingCount, pBuffers.address, pOffsets.address)
	}
	
	fun cmdDraw(commandBuffer: CommandBufferH, vertexCount: Int, instanceCount: Int, firstVertex: Int, firstInstance: Int) {
		cmdDraw(cmdDrawAddr, commandBuffer.address, vertexCount, instanceCount, firstVertex, firstInstance)
	}
	
	fun cmdDrawIndexed(commandBuffer: CommandBufferH, indexCount: Int, instanceCount: Int, firstIndex: Int, vertexOffset: Int, firstInstance: Int) {
		cmdDrawIndexed(cmdDrawIndexedAddr, commandBuffer.address, indexCount, instanceCount, firstIndex, vertexOffset, firstInstance)
	}
	
	fun cmdDrawIndirect(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, drawCount: Int, stride: Int) {
		cmdDrawIndirect(cmdDrawIndirectAddr, commandBuffer.address, buffer.address, offset, drawCount, stride)
	}
	
	fun cmdDrawIndexedIndirect(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, drawCount: Int, stride: Int) {
		cmdDrawIndexedIndirect(cmdDrawIndexedIndirectAddr, commandBuffer.address, buffer.address, offset, drawCount, stride)
	}
	
	fun cmdDispatch(commandBuffer: CommandBufferH, groupCountX: Int, groupCountY: Int, groupCountZ: Int) {
		cmdDispatch(cmdDispatchAddr, commandBuffer.address, groupCountX, groupCountY, groupCountZ)
	}
	
	fun cmdDispatchIndirect(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long) {
		cmdDispatchIndirect(cmdDispatchIndirectAddr, commandBuffer.address, buffer.address, offset)
	}
	
	fun cmdCopyBuffer(commandBuffer: CommandBufferH, srcBuffer: BufferH, dstBuffer: BufferH, regionCount: Int, pRegions: BufferCopy.Buffer) {
		cmdCopyBuffer(cmdCopyBufferAddr, commandBuffer.address, srcBuffer.address, dstBuffer.address, regionCount, pRegions.address)
	}
	
	fun cmdCopyImage(commandBuffer: CommandBufferH, srcImage: ImageH, srcImageLayout: ImageLayout, dstImage: ImageH, dstImageLayout: ImageLayout, regionCount: Int, pRegions: ImageCopy.Buffer) {
		cmdCopyImage(cmdCopyImageAddr, commandBuffer.address, srcImage.address, srcImageLayout.value, dstImage.address, dstImageLayout.value, regionCount, pRegions.address)
	}
	
	fun cmdBlitImage(commandBuffer: CommandBufferH, srcImage: ImageH, srcImageLayout: ImageLayout, dstImage: ImageH, dstImageLayout: ImageLayout, regionCount: Int, pRegions: ImageBlit.Buffer, filter: Filter) {
		cmdBlitImage(cmdBlitImageAddr, commandBuffer.address, srcImage.address, srcImageLayout.value, dstImage.address, dstImageLayout.value, regionCount, pRegions.address, filter.value)
	}
	
	fun cmdCopyBufferToImage(commandBuffer: CommandBufferH, srcBuffer: BufferH, dstImage: ImageH, dstImageLayout: ImageLayout, regionCount: Int, pRegions: BufferImageCopy.Buffer) {
		cmdCopyBufferToImage(cmdCopyBufferToImageAddr, commandBuffer.address, srcBuffer.address, dstImage.address, dstImageLayout.value, regionCount, pRegions.address)
	}
	
	fun cmdCopyImageToBuffer(commandBuffer: CommandBufferH, srcImage: ImageH, srcImageLayout: ImageLayout, dstBuffer: BufferH, regionCount: Int, pRegions: BufferImageCopy.Buffer) {
		cmdCopyImageToBuffer(cmdCopyImageToBufferAddr, commandBuffer.address, srcImage.address, srcImageLayout.value, dstBuffer.address, regionCount, pRegions.address)
	}
	
	fun cmdUpdateBuffer(commandBuffer: CommandBufferH, dstBuffer: BufferH, dstOffset: Long, dataSize: Long, pData: DirectLong) {
		cmdUpdateBuffer(cmdUpdateBufferAddr, commandBuffer.address, dstBuffer.address, dstOffset, dataSize, pData.address)
	}
	
	fun cmdFillBuffer(commandBuffer: CommandBufferH, dstBuffer: BufferH, dstOffset: Long, size: Long, data: Int) {
		cmdFillBuffer(cmdFillBufferAddr, commandBuffer.address, dstBuffer.address, dstOffset, size, data)
	}
	
	fun cmdClearColorImage(commandBuffer: CommandBufferH, image: ImageH, imageLayout: ImageLayout, pColor: ClearColorValue, rangeCount: Int, pRanges: ImageSubresourceRange.Buffer) {
		cmdClearColorImage(cmdClearColorImageAddr, commandBuffer.address, image.address, imageLayout.value, pColor.address, rangeCount, pRanges.address)
	}
	
	fun cmdClearDepthStencilImage(commandBuffer: CommandBufferH, image: ImageH, imageLayout: ImageLayout, pDepthStencil: ClearDepthStencilValue, rangeCount: Int, pRanges: ImageSubresourceRange.Buffer) {
		cmdClearDepthStencilImage(cmdClearDepthStencilImageAddr, commandBuffer.address, image.address, imageLayout.value, pDepthStencil.address, rangeCount, pRanges.address)
	}
	
	fun cmdClearAttachments(commandBuffer: CommandBufferH, attachmentCount: Int, pAttachments: ClearAttachment.Buffer, rectCount: Int, pRects: ClearRect.Buffer) {
		cmdClearAttachments(cmdClearAttachmentsAddr, commandBuffer.address, attachmentCount, pAttachments.address, rectCount, pRects.address)
	}
	
	fun cmdResolveImage(commandBuffer: CommandBufferH, srcImage: ImageH, srcImageLayout: ImageLayout, dstImage: ImageH, dstImageLayout: ImageLayout, regionCount: Int, pRegions: ImageResolve.Buffer) {
		cmdResolveImage(cmdResolveImageAddr, commandBuffer.address, srcImage.address, srcImageLayout.value, dstImage.address, dstImageLayout.value, regionCount, pRegions.address)
	}
	
	fun cmdSetEvent(commandBuffer: CommandBufferH, event: EventH, stageMask: PipelineStageFlags) {
		cmdSetEvent(cmdSetEventAddr, commandBuffer.address, event.address, stageMask.value)
	}
	
	fun cmdResetEvent(commandBuffer: CommandBufferH, event: EventH, stageMask: PipelineStageFlags) {
		cmdResetEvent(cmdResetEventAddr, commandBuffer.address, event.address, stageMask.value)
	}
	
	fun cmdWaitEvents(commandBuffer: CommandBufferH, eventCount: Int, pEvents: DirectLongBuffer, srcStageMask: PipelineStageFlags, dstStageMask: PipelineStageFlags, memoryBarrierCount: Int, pMemoryBarriers: MemoryBarrier.Buffer, bufferMemoryBarrierCount: Int, pBufferMemoryBarriers: BufferMemoryBarrier.Buffer, imageMemoryBarrierCount: Int, pImageMemoryBarriers: ImageMemoryBarrier.Buffer) {
		cmdWaitEvents(cmdWaitEventsAddr, commandBuffer.address, eventCount, pEvents.address, srcStageMask.value, dstStageMask.value, memoryBarrierCount, pMemoryBarriers.address, bufferMemoryBarrierCount, pBufferMemoryBarriers.address, imageMemoryBarrierCount, pImageMemoryBarriers.address)
	}
	
	fun cmdPipelineBarrier(commandBuffer: CommandBufferH, srcStageMask: PipelineStageFlags, dstStageMask: PipelineStageFlags, dependencyFlags: DependencyFlags, memoryBarrierCount: Int, pMemoryBarriers: MemoryBarrier.Buffer, bufferMemoryBarrierCount: Int, pBufferMemoryBarriers: BufferMemoryBarrier.Buffer, imageMemoryBarrierCount: Int, pImageMemoryBarriers: ImageMemoryBarrier.Buffer) {
		cmdPipelineBarrier(cmdPipelineBarrierAddr, commandBuffer.address, srcStageMask.value, dstStageMask.value, dependencyFlags.value, memoryBarrierCount, pMemoryBarriers.address, bufferMemoryBarrierCount, pBufferMemoryBarriers.address, imageMemoryBarrierCount, pImageMemoryBarriers.address)
	}
	
	fun cmdBeginQuery(commandBuffer: CommandBufferH, queryPool: QueryPoolH, query: Int, flags: QueryControlFlags) {
		cmdBeginQuery(cmdBeginQueryAddr, commandBuffer.address, queryPool.address, query, flags.value)
	}
	
	fun cmdEndQuery(commandBuffer: CommandBufferH, queryPool: QueryPoolH, query: Int) {
		cmdEndQuery(cmdEndQueryAddr, commandBuffer.address, queryPool.address, query)
	}
	
	fun cmdResetQueryPool(commandBuffer: CommandBufferH, queryPool: QueryPoolH, firstQuery: Int, queryCount: Int) {
		cmdResetQueryPool(cmdResetQueryPoolAddr, commandBuffer.address, queryPool.address, firstQuery, queryCount)
	}
	
	fun cmdWriteTimestamp(commandBuffer: CommandBufferH, pipelineStage: PipelineStageFlags, queryPool: QueryPoolH, query: Int) {
		cmdWriteTimestamp(cmdWriteTimestampAddr, commandBuffer.address, pipelineStage.value, queryPool.address, query)
	}
	
	fun cmdCopyQueryPoolResults(commandBuffer: CommandBufferH, queryPool: QueryPoolH, firstQuery: Int, queryCount: Int, dstBuffer: BufferH, dstOffset: Long, stride: Long, flags: QueryResultFlags) {
		cmdCopyQueryPoolResults(cmdCopyQueryPoolResultsAddr, commandBuffer.address, queryPool.address, firstQuery, queryCount, dstBuffer.address, dstOffset, stride, flags.value)
	}
	
	fun cmdPushConstants(commandBuffer: CommandBufferH, layout: PipelineLayoutH, stageFlags: ShaderStageFlags, offset: Int, size: Int, pValues: DirectLong) {
		cmdPushConstants(cmdPushConstantsAddr, commandBuffer.address, layout.address, stageFlags.value, offset, size, pValues.address)
	}
	
	fun cmdBeginRenderPass(commandBuffer: CommandBufferH, pRenderPassBegin: RenderPassBeginInfo, contents: SubpassContents) {
		cmdBeginRenderPass(cmdBeginRenderPassAddr, commandBuffer.address, pRenderPassBegin.address, contents.value)
	}
	
	fun cmdNextSubpass(commandBuffer: CommandBufferH, contents: SubpassContents) {
		cmdNextSubpass(cmdNextSubpassAddr, commandBuffer.address, contents.value)
	}
	
	fun cmdEndRenderPass(commandBuffer: CommandBufferH) {
		cmdEndRenderPass(cmdEndRenderPassAddr, commandBuffer.address)
	}
	
	fun cmdExecuteCommands(commandBuffer: CommandBufferH, commandBufferCount: Int, pCommandBuffers: DirectLongBuffer) {
		cmdExecuteCommands(cmdExecuteCommandsAddr, commandBuffer.address, commandBufferCount, pCommandBuffers.address)
	}
	
	fun bindBufferMemory2(bindInfoCount: Int, pBindInfos: BindBufferMemoryInfo.Buffer): Result {
		return Result(bindBufferMemory2(bindBufferMemory2Addr, device.address, bindInfoCount, pBindInfos.address))
	}
	
	fun bindImageMemory2(bindInfoCount: Int, pBindInfos: BindImageMemoryInfo.Buffer): Result {
		return Result(bindImageMemory2(bindImageMemory2Addr, device.address, bindInfoCount, pBindInfos.address))
	}
	
	fun getDeviceGroupPeerMemoryFeatures(heapIndex: Int, localDeviceIndex: Int, remoteDeviceIndex: Int, pPeerMemoryFeatures: DirectLong) {
		getDeviceGroupPeerMemoryFeatures(getDeviceGroupPeerMemoryFeaturesAddr, device.address, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures.address)
	}
	
	fun cmdSetDeviceMask(commandBuffer: CommandBufferH, deviceMask: Int) {
		cmdSetDeviceMask(cmdSetDeviceMaskAddr, commandBuffer.address, deviceMask)
	}
	
	fun cmdDispatchBase(commandBuffer: CommandBufferH, baseGroupX: Int, baseGroupY: Int, baseGroupZ: Int, groupCountX: Int, groupCountY: Int, groupCountZ: Int) {
		cmdDispatchBase(cmdDispatchBaseAddr, commandBuffer.address, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ)
	}
	
	fun getImageMemoryRequirements2(pInfo: ImageMemoryRequirementsInfo2, pMemoryRequirements: MemoryRequirements2) {
		getImageMemoryRequirements2(getImageMemoryRequirements2Addr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	fun getBufferMemoryRequirements2(pInfo: BufferMemoryRequirementsInfo2, pMemoryRequirements: MemoryRequirements2) {
		getBufferMemoryRequirements2(getBufferMemoryRequirements2Addr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	fun getImageSparseMemoryRequirements2(pInfo: ImageSparseMemoryRequirementsInfo2, pSparseMemoryRequirementCount: DirectInt, pSparseMemoryRequirements: SparseImageMemoryRequirements2.Buffer?) {
		getImageSparseMemoryRequirements2(getImageSparseMemoryRequirements2Addr, device.address, pInfo.address, pSparseMemoryRequirementCount.address, pSparseMemoryRequirements.addressOrNULL)
	}
	
	fun trimCommandPool(commandPool: CommandPoolH) {
		trimCommandPool(trimCommandPoolAddr, device.address, commandPool.address, 0)
	}
	
	fun getDeviceQueue2(pQueueInfo: DeviceQueueInfo2, pQueue: DirectLong) {
		getDeviceQueue2(getDeviceQueue2Addr, device.address, pQueueInfo.address, pQueue.address)
	}
	
	fun createSamplerYcbcrConversion(pCreateInfo: SamplerYcbcrConversionCreateInfo, pAllocator: AllocationCallbacks?, pYcbcrConversion: DirectLong): Result {
		return Result(createSamplerYcbcrConversion(createSamplerYcbcrConversionAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pYcbcrConversion.address))
	}
	
	fun destroySamplerYcbcrConversion(ycbcrConversion: SamplerYcbcrConversionH?, pAllocator: AllocationCallbacks?) {
		destroySamplerYcbcrConversion(destroySamplerYcbcrConversionAddr, device.address, ycbcrConversion.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun createDescriptorUpdateTemplate(pCreateInfo: DescriptorUpdateTemplateCreateInfo, pAllocator: AllocationCallbacks?, pDescriptorUpdateTemplate: DirectLong): Result {
		return Result(createDescriptorUpdateTemplate(createDescriptorUpdateTemplateAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pDescriptorUpdateTemplate.address))
	}
	
	fun destroyDescriptorUpdateTemplate(descriptorUpdateTemplate: DescriptorUpdateTemplateH?, pAllocator: AllocationCallbacks?) {
		destroyDescriptorUpdateTemplate(destroyDescriptorUpdateTemplateAddr, device.address, descriptorUpdateTemplate.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun updateDescriptorSetWithTemplate(descriptorSet: DescriptorSetH, descriptorUpdateTemplate: DescriptorUpdateTemplateH, pData: DirectLong) {
		updateDescriptorSetWithTemplate(updateDescriptorSetWithTemplateAddr, device.address, descriptorSet.address, descriptorUpdateTemplate.address, pData.address)
	}
	
	fun getDescriptorSetLayoutSupport(pCreateInfo: DescriptorSetLayoutCreateInfo, pSupport: DescriptorSetLayoutSupport) {
		getDescriptorSetLayoutSupport(getDescriptorSetLayoutSupportAddr, device.address, pCreateInfo.address, pSupport.address)
	}
	
	fun cmdDrawIndirectCount(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, countBuffer: BufferH, countBufferOffset: Long, maxDrawCount: Int, stride: Int) {
		cmdDrawIndirectCount(cmdDrawIndirectCountAddr, commandBuffer.address, buffer.address, offset, countBuffer.address, countBufferOffset, maxDrawCount, stride)
	}
	
	fun cmdDrawIndexedIndirectCount(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, countBuffer: BufferH, countBufferOffset: Long, maxDrawCount: Int, stride: Int) {
		cmdDrawIndexedIndirectCount(cmdDrawIndexedIndirectCountAddr, commandBuffer.address, buffer.address, offset, countBuffer.address, countBufferOffset, maxDrawCount, stride)
	}
	
	fun createRenderPass2(pCreateInfo: RenderPassCreateInfo2, pAllocator: AllocationCallbacks?, pRenderPass: DirectLong): Result {
		return Result(createRenderPass2(createRenderPass2Addr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pRenderPass.address))
	}
	
	fun cmdBeginRenderPass2(commandBuffer: CommandBufferH, pRenderPassBegin: RenderPassBeginInfo, pSubpassBeginInfo: SubpassBeginInfo) {
		cmdBeginRenderPass2(cmdBeginRenderPass2Addr, commandBuffer.address, pRenderPassBegin.address, pSubpassBeginInfo.address)
	}
	
	fun cmdNextSubpass2(commandBuffer: CommandBufferH, pSubpassBeginInfo: SubpassBeginInfo, pSubpassEndInfo: SubpassEndInfo) {
		cmdNextSubpass2(cmdNextSubpass2Addr, commandBuffer.address, pSubpassBeginInfo.address, pSubpassEndInfo.address)
	}
	
	fun cmdEndRenderPass2(commandBuffer: CommandBufferH, pSubpassEndInfo: SubpassEndInfo) {
		cmdEndRenderPass2(cmdEndRenderPass2Addr, commandBuffer.address, pSubpassEndInfo.address)
	}
	
	fun resetQueryPool(queryPool: QueryPoolH, firstQuery: Int, queryCount: Int) {
		resetQueryPool(resetQueryPoolAddr, device.address, queryPool.address, firstQuery, queryCount)
	}
	
	fun getSemaphoreCounterValue(semaphore: SemaphoreH, pValue: DirectLong): Result {
		return Result(getSemaphoreCounterValue(getSemaphoreCounterValueAddr, device.address, semaphore.address, pValue.address))
	}
	
	fun waitSemaphores(pWaitInfo: SemaphoreWaitInfo, timeout: Long): Result {
		return Result(waitSemaphores(waitSemaphoresAddr, device.address, pWaitInfo.address, timeout))
	}
	
	fun signalSemaphore(pSignalInfo: SemaphoreSignalInfo): Result {
		return Result(signalSemaphore(signalSemaphoreAddr, device.address, pSignalInfo.address))
	}
	
	fun getBufferDeviceAddress(pInfo: BufferDeviceAddressInfo): Long {
		return getBufferDeviceAddress(getBufferDeviceAddressAddr, device.address, pInfo.address)
	}
	
	fun getBufferOpaqueCaptureAddress(pInfo: BufferDeviceAddressInfo): Long {
		return getBufferOpaqueCaptureAddress(getBufferOpaqueCaptureAddressAddr, device.address, pInfo.address)
	}
	
	fun getDeviceMemoryOpaqueCaptureAddress(pInfo: DeviceMemoryOpaqueCaptureAddressInfo): Long {
		return getDeviceMemoryOpaqueCaptureAddress(getDeviceMemoryOpaqueCaptureAddressAddr, device.address, pInfo.address)
	}
	
	fun createPrivateDataSlot(pCreateInfo: PrivateDataSlotCreateInfo, pAllocator: AllocationCallbacks?, pPrivateDataSlot: DirectLong): Result {
		return Result(createPrivateDataSlot(createPrivateDataSlotAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pPrivateDataSlot.address))
	}
	
	fun destroyPrivateDataSlot(privateDataSlot: PrivateDataSlotH?, pAllocator: AllocationCallbacks?) {
		destroyPrivateDataSlot(destroyPrivateDataSlotAddr, device.address, privateDataSlot.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun setPrivateData(objectType: ObjectType, objectHandle: Long, privateDataSlot: PrivateDataSlotH, data: Long): Result {
		return Result(setPrivateData(setPrivateDataAddr, device.address, objectType.value, objectHandle, privateDataSlot.address, data))
	}
	
	fun getPrivateData(objectType: ObjectType, objectHandle: Long, privateDataSlot: PrivateDataSlotH, pData: DirectLong) {
		getPrivateData(getPrivateDataAddr, device.address, objectType.value, objectHandle, privateDataSlot.address, pData.address)
	}
	
	fun cmdSetEvent2(commandBuffer: CommandBufferH, event: EventH, pDependencyInfo: DependencyInfo) {
		cmdSetEvent2(cmdSetEvent2Addr, commandBuffer.address, event.address, pDependencyInfo.address)
	}
	
	fun cmdResetEvent2(commandBuffer: CommandBufferH, event: EventH, stageMask: PipelineStageFlags2) {
		cmdResetEvent2(cmdResetEvent2Addr, commandBuffer.address, event.address, stageMask.value)
	}
	
	fun cmdWaitEvents2(commandBuffer: CommandBufferH, eventCount: Int, pEvents: DirectLongBuffer, pDependencyInfos: DependencyInfo.Buffer) {
		cmdWaitEvents2(cmdWaitEvents2Addr, commandBuffer.address, eventCount, pEvents.address, pDependencyInfos.address)
	}
	
	fun cmdPipelineBarrier2(commandBuffer: CommandBufferH, pDependencyInfo: DependencyInfo) {
		cmdPipelineBarrier2(cmdPipelineBarrier2Addr, commandBuffer.address, pDependencyInfo.address)
	}
	
	fun cmdWriteTimestamp2(commandBuffer: CommandBufferH, stage: PipelineStageFlags2, queryPool: QueryPoolH, query: Int) {
		cmdWriteTimestamp2(cmdWriteTimestamp2Addr, commandBuffer.address, stage.value, queryPool.address, query)
	}
	
	fun queueSubmit2(queue: QueueH, submitCount: Int, pSubmits: SubmitInfo2.Buffer, fence: FenceH?): Result {
		return Result(queueSubmit2(queueSubmit2Addr, queue.address, submitCount, pSubmits.address, fence.addressOrNULL))
	}
	
	fun cmdCopyBuffer2(commandBuffer: CommandBufferH, pCopyBufferInfo: CopyBufferInfo2) {
		cmdCopyBuffer2(cmdCopyBuffer2Addr, commandBuffer.address, pCopyBufferInfo.address)
	}
	
	fun cmdCopyImage2(commandBuffer: CommandBufferH, pCopyImageInfo: CopyImageInfo2) {
		cmdCopyImage2(cmdCopyImage2Addr, commandBuffer.address, pCopyImageInfo.address)
	}
	
	fun cmdCopyBufferToImage2(commandBuffer: CommandBufferH, pCopyBufferToImageInfo: CopyBufferToImageInfo2) {
		cmdCopyBufferToImage2(cmdCopyBufferToImage2Addr, commandBuffer.address, pCopyBufferToImageInfo.address)
	}
	
	fun cmdCopyImageToBuffer2(commandBuffer: CommandBufferH, pCopyImageToBufferInfo: CopyImageToBufferInfo2) {
		cmdCopyImageToBuffer2(cmdCopyImageToBuffer2Addr, commandBuffer.address, pCopyImageToBufferInfo.address)
	}
	
	fun cmdBlitImage2(commandBuffer: CommandBufferH, pBlitImageInfo: BlitImageInfo2) {
		cmdBlitImage2(cmdBlitImage2Addr, commandBuffer.address, pBlitImageInfo.address)
	}
	
	fun cmdResolveImage2(commandBuffer: CommandBufferH, pResolveImageInfo: ResolveImageInfo2) {
		cmdResolveImage2(cmdResolveImage2Addr, commandBuffer.address, pResolveImageInfo.address)
	}
	
	fun cmdBeginRendering(commandBuffer: CommandBufferH, pRenderingInfo: RenderingInfo) {
		cmdBeginRendering(cmdBeginRenderingAddr, commandBuffer.address, pRenderingInfo.address)
	}
	
	fun cmdEndRendering(commandBuffer: CommandBufferH) {
		cmdEndRendering(cmdEndRenderingAddr, commandBuffer.address)
	}
	
	fun cmdSetCullMode(commandBuffer: CommandBufferH, cullMode: CullModeFlags) {
		cmdSetCullMode(cmdSetCullModeAddr, commandBuffer.address, cullMode.value)
	}
	
	fun cmdSetFrontFace(commandBuffer: CommandBufferH, frontFace: FrontFace) {
		cmdSetFrontFace(cmdSetFrontFaceAddr, commandBuffer.address, frontFace.value)
	}
	
	fun cmdSetPrimitiveTopology(commandBuffer: CommandBufferH, primitiveTopology: PrimitiveTopology) {
		cmdSetPrimitiveTopology(cmdSetPrimitiveTopologyAddr, commandBuffer.address, primitiveTopology.value)
	}
	
	fun cmdSetViewportWithCount(commandBuffer: CommandBufferH, viewportCount: Int, pViewports: Viewport.Buffer) {
		cmdSetViewportWithCount(cmdSetViewportWithCountAddr, commandBuffer.address, viewportCount, pViewports.address)
	}
	
	fun cmdSetScissorWithCount(commandBuffer: CommandBufferH, scissorCount: Int, pScissors: Rect2D.Buffer) {
		cmdSetScissorWithCount(cmdSetScissorWithCountAddr, commandBuffer.address, scissorCount, pScissors.address)
	}
	
	fun cmdBindVertexBuffers2(commandBuffer: CommandBufferH, firstBinding: Int, bindingCount: Int, pBuffers: DirectLongBuffer, pOffsets: DirectLongBuffer, pSizes: DirectLongBuffer?, pStrides: DirectLongBuffer?) {
		cmdBindVertexBuffers2(cmdBindVertexBuffers2Addr, commandBuffer.address, firstBinding, bindingCount, pBuffers.address, pOffsets.address, pSizes.addressOrNULL, pStrides.addressOrNULL)
	}
	
	fun cmdSetDepthTestEnable(commandBuffer: CommandBufferH, depthTestEnable: Int) {
		cmdSetDepthTestEnable(cmdSetDepthTestEnableAddr, commandBuffer.address, depthTestEnable)
	}
	
	fun cmdSetDepthWriteEnable(commandBuffer: CommandBufferH, depthWriteEnable: Int) {
		cmdSetDepthWriteEnable(cmdSetDepthWriteEnableAddr, commandBuffer.address, depthWriteEnable)
	}
	
	fun cmdSetDepthCompareOp(commandBuffer: CommandBufferH, depthCompareOp: CompareOp) {
		cmdSetDepthCompareOp(cmdSetDepthCompareOpAddr, commandBuffer.address, depthCompareOp.value)
	}
	
	fun cmdSetDepthBoundsTestEnable(commandBuffer: CommandBufferH, depthBoundsTestEnable: Int) {
		cmdSetDepthBoundsTestEnable(cmdSetDepthBoundsTestEnableAddr, commandBuffer.address, depthBoundsTestEnable)
	}
	
	fun cmdSetStencilTestEnable(commandBuffer: CommandBufferH, stencilTestEnable: Int) {
		cmdSetStencilTestEnable(cmdSetStencilTestEnableAddr, commandBuffer.address, stencilTestEnable)
	}
	
	fun cmdSetStencilOp(commandBuffer: CommandBufferH, faceMask: StencilFaceFlags, failOp: StencilOp, passOp: StencilOp, depthFailOp: StencilOp, compareOp: CompareOp) {
		cmdSetStencilOp(cmdSetStencilOpAddr, commandBuffer.address, faceMask.value, failOp.value, passOp.value, depthFailOp.value, compareOp.value)
	}
	
	fun cmdSetRasterizerDiscardEnable(commandBuffer: CommandBufferH, rasterizerDiscardEnable: Int) {
		cmdSetRasterizerDiscardEnable(cmdSetRasterizerDiscardEnableAddr, commandBuffer.address, rasterizerDiscardEnable)
	}
	
	fun cmdSetDepthBiasEnable(commandBuffer: CommandBufferH, depthBiasEnable: Int) {
		cmdSetDepthBiasEnable(cmdSetDepthBiasEnableAddr, commandBuffer.address, depthBiasEnable)
	}
	
	fun cmdSetPrimitiveRestartEnable(commandBuffer: CommandBufferH, primitiveRestartEnable: Int) {
		cmdSetPrimitiveRestartEnable(cmdSetPrimitiveRestartEnableAddr, commandBuffer.address, primitiveRestartEnable)
	}
	
	fun getDeviceBufferMemoryRequirements(pInfo: DeviceBufferMemoryRequirements, pMemoryRequirements: MemoryRequirements2) {
		getDeviceBufferMemoryRequirements(getDeviceBufferMemoryRequirementsAddr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	fun getDeviceImageMemoryRequirements(pInfo: DeviceImageMemoryRequirements, pMemoryRequirements: MemoryRequirements2) {
		getDeviceImageMemoryRequirements(getDeviceImageMemoryRequirementsAddr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	fun getDeviceImageSparseMemoryRequirements(pInfo: DeviceImageMemoryRequirements, pSparseMemoryRequirementCount: DirectInt, pSparseMemoryRequirements: SparseImageMemoryRequirements2.Buffer?) {
		getDeviceImageSparseMemoryRequirements(getDeviceImageSparseMemoryRequirementsAddr, device.address, pInfo.address, pSparseMemoryRequirementCount.address, pSparseMemoryRequirements.addressOrNULL)
	}
	
	fun createSwapchain(pCreateInfo: SwapchainCreateInfo, pAllocator: AllocationCallbacks?, pSwapchain: DirectLong): Result {
		return Result(createSwapchain(createSwapchainAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSwapchain.address))
	}
	
	fun destroySwapchain(swapchain: SwapchainH?, pAllocator: AllocationCallbacks?) {
		destroySwapchain(destroySwapchainAddr, device.address, swapchain.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun getSwapchainImages(swapchain: SwapchainH, pSwapchainImageCount: DirectInt, pSwapchainImages: DirectLongBuffer?): Result {
		return Result(getSwapchainImages(getSwapchainImagesAddr, device.address, swapchain.address, pSwapchainImageCount.address, pSwapchainImages.addressOrNULL))
	}
	
	fun acquireNextImage(swapchain: SwapchainH, timeout: Long, semaphore: SemaphoreH?, fence: FenceH?, pImageIndex: DirectInt): Result {
		return Result(acquireNextImage(acquireNextImageAddr, device.address, swapchain.address, timeout, semaphore.addressOrNULL, fence.addressOrNULL, pImageIndex.address))
	}
	
	fun queuePresent(queue: QueueH, pPresentInfo: PresentInfo): Result {
		return Result(queuePresent(queuePresentAddr, queue.address, pPresentInfo.address))
	}
	
	fun getDeviceGroupPresentCapabilities(pDeviceGroupPresentCapabilities: DeviceGroupPresentCapabilities): Result {
		return Result(getDeviceGroupPresentCapabilities(getDeviceGroupPresentCapabilitiesAddr, device.address, pDeviceGroupPresentCapabilities.address))
	}
	
	fun getDeviceGroupSurfacePresentModes(surface: SurfaceH, pModes: DirectLong): Result {
		return Result(getDeviceGroupSurfacePresentModes(getDeviceGroupSurfacePresentModesAddr, device.address, surface.address, pModes.address))
	}
	
	fun acquireNextImage2(pAcquireInfo: AcquireNextImageInfo, pImageIndex: DirectInt): Result {
		return Result(acquireNextImage2(acquireNextImage2Addr, device.address, pAcquireInfo.address, pImageIndex.address))
	}
	
	fun setDebugUtilsObjectName(pNameInfo: DebugUtilsObjectNameInfo): Result {
		return Result(setDebugUtilsObjectName(setDebugUtilsObjectNameAddr, device.address, pNameInfo.address))
	}
	
	fun setDebugUtilsObjectTag(pTagInfo: DebugUtilsObjectTagInfo): Result {
		return Result(setDebugUtilsObjectTag(setDebugUtilsObjectTagAddr, device.address, pTagInfo.address))
	}
	
	fun queueBeginDebugUtilsLabel(queue: QueueH, pLabelInfo: DebugUtilsLabel) {
		queueBeginDebugUtilsLabel(queueBeginDebugUtilsLabelAddr, queue.address, pLabelInfo.address)
	}
	
	fun queueEndDebugUtilsLabel(queue: QueueH) {
		queueEndDebugUtilsLabel(queueEndDebugUtilsLabelAddr, queue.address)
	}
	
	fun queueInsertDebugUtilsLabel(queue: QueueH, pLabelInfo: DebugUtilsLabel) {
		queueInsertDebugUtilsLabel(queueInsertDebugUtilsLabelAddr, queue.address, pLabelInfo.address)
	}
	
	fun cmdBeginDebugUtilsLabel(commandBuffer: CommandBufferH, pLabelInfo: DebugUtilsLabel) {
		cmdBeginDebugUtilsLabel(cmdBeginDebugUtilsLabelAddr, commandBuffer.address, pLabelInfo.address)
	}
	
	fun cmdEndDebugUtilsLabel(commandBuffer: CommandBufferH) {
		cmdEndDebugUtilsLabel(cmdEndDebugUtilsLabelAddr, commandBuffer.address)
	}
	
	fun cmdInsertDebugUtilsLabel(commandBuffer: CommandBufferH, pLabelInfo: DebugUtilsLabel) {
		cmdInsertDebugUtilsLabel(cmdInsertDebugUtilsLabelAddr, commandBuffer.address, pLabelInfo.address)
	}


}