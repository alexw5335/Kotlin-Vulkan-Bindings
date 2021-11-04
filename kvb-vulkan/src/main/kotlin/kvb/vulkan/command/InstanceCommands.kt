// This file has been automatically generated.

package kvb.vulkan.command

import kvb.core.memory.MemStacks
import kvb.core.memory.Addressable.Companion.addressOrNULL
import kvb.vulkan.*
import kvb.core.memory.direct.*

@Suppress("unused")
class InstanceCommands(private val instance: InstanceH) {
	
	
	private val stack = MemStacks.default
	
	
	
	private fun addr(name: String) = Commands.getInstanceProcAddr(instance.address, stack.encodeUtf8NT(name).address)
	
	
	
	/*
	Command addresses
	 */
	
	
	
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
	private val createXlibSurfaceAddr = addr("vkCreateXlibSurfaceKHR")
	private val getPhysicalDeviceXlibPresentationSupportAddr = addr("vkGetPhysicalDeviceXlibPresentationSupportKHR")
	private val createXcbSurfaceAddr = addr("vkCreateXcbSurfaceKHR")
	private val getPhysicalDeviceXcbPresentationSupportAddr = addr("vkGetPhysicalDeviceXcbPresentationSupportKHR")
	private val createWaylandSurfaceAddr = addr("vkCreateWaylandSurfaceKHR")
	private val getPhysicalDeviceWaylandPresentationSupportAddr = addr("vkGetPhysicalDeviceWaylandPresentationSupportKHR")
	private val createAndroidSurfaceAddr = addr("vkCreateAndroidSurfaceKHR")
	private val createWin32SurfaceAddr = addr("vkCreateWin32SurfaceKHR")
	private val getPhysicalDeviceWin32PresentationSupportAddr = addr("vkGetPhysicalDeviceWin32PresentationSupportKHR")
	private val createStreamDescriptorSurfaceAddr = addr("vkCreateStreamDescriptorSurfaceGGP")
	private val createViSurfaceAddr = addr("vkCreateViSurfaceNN")
	private val releaseDisplayAddr = addr("vkReleaseDisplayEXT")
	private val acquireXlibDisplayAddr = addr("vkAcquireXlibDisplayEXT")
	private val getRandROutputDisplayAddr = addr("vkGetRandROutputDisplayEXT")
	private val getPhysicalDeviceSurfaceCapabilities2EXTAddr = addr("vkGetPhysicalDeviceSurfaceCapabilities2EXT")
	private val enumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersAddr = addr("vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR")
	private val getPhysicalDeviceQueueFamilyPerformanceQueryPassesAddr = addr("vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR")
	private val getPhysicalDeviceSurfaceCapabilities2KHRAddr = addr("vkGetPhysicalDeviceSurfaceCapabilities2KHR")
	private val getPhysicalDeviceSurfaceFormats2Addr = addr("vkGetPhysicalDeviceSurfaceFormats2KHR")
	private val getPhysicalDeviceDisplayProperties2Addr = addr("vkGetPhysicalDeviceDisplayProperties2KHR")
	private val getPhysicalDeviceDisplayPlaneProperties2Addr = addr("vkGetPhysicalDeviceDisplayPlaneProperties2KHR")
	private val getDisplayModeProperties2Addr = addr("vkGetDisplayModeProperties2KHR")
	private val getDisplayPlaneCapabilities2Addr = addr("vkGetDisplayPlaneCapabilities2KHR")
	private val createDebugUtilsMessengerAddr = addr("vkCreateDebugUtilsMessengerEXT")
	private val destroyDebugUtilsMessengerAddr = addr("vkDestroyDebugUtilsMessengerEXT")
	private val submitDebugUtilsMessageAddr = addr("vkSubmitDebugUtilsMessageEXT")
	private val getPhysicalDeviceMultisamplePropertiesAddr = addr("vkGetPhysicalDeviceMultisamplePropertiesEXT")
	private val getPhysicalDeviceCalibrateableTimeDomainsAddr = addr("vkGetPhysicalDeviceCalibrateableTimeDomainsEXT")
	private val createImagePipeSurfaceAddr = addr("vkCreateImagePipeSurfaceFUCHSIA")
	private val createMetalSurfaceAddr = addr("vkCreateMetalSurfaceEXT")
	private val getPhysicalDeviceFragmentShadingRatesAddr = addr("vkGetPhysicalDeviceFragmentShadingRatesKHR")
	private val getPhysicalDeviceToolPropertiesAddr = addr("vkGetPhysicalDeviceToolPropertiesEXT")
	private val getPhysicalDeviceCooperativeMatrixPropertiesAddr = addr("vkGetPhysicalDeviceCooperativeMatrixPropertiesNV")
	private val getPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsAddr = addr("vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV")
	private val getPhysicalDeviceSurfacePresentModes2Addr = addr("vkGetPhysicalDeviceSurfacePresentModes2EXT")
	private val createHeadlessSurfaceAddr = addr("vkCreateHeadlessSurfaceEXT")
	private val acquireWinrtDisplayAddr = addr("vkAcquireWinrtDisplayNV")
	private val getWinrtDisplayAddr = addr("vkGetWinrtDisplayNV")
	private val createDirectFBSurfaceAddr = addr("vkCreateDirectFBSurfaceEXT")
	private val getPhysicalDeviceDirectFBPresentationSupportAddr = addr("vkGetPhysicalDeviceDirectFBPresentationSupportEXT")
	private val createScreenSurfaceQAddr = addr("vkCreateScreenSurfaceQNX")
	private val getPhysicalDeviceScreenPresentationSupportQAddr = addr("vkGetPhysicalDeviceScreenPresentationSupportQNX")
	init { stack.pop(stackPointer) }
	
	
	
	/*
	Instance commands
	 */
	
	
	
	fun destroyInstance(pAllocator: AllocationCallbacks?) {
		Commands.destroyInstance(destroyInstanceAddr, instance.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun enumeratePhysicalDevices(pPhysicalDeviceCount: DirectInt, pPhysicalDevices: DirectLongBuffer?): Result {
		return Result(Commands.enumeratePhysicalDevices(enumeratePhysicalDevicesAddr, instance.address, pPhysicalDeviceCount.address, pPhysicalDevices.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceFeatures(physicalDevice: PhysicalDeviceH, pFeatures: PhysicalDeviceFeatures) {
		Commands.getPhysicalDeviceFeatures(getPhysicalDeviceFeaturesAddr, physicalDevice.address, pFeatures.address)
	}
	
	
	
	fun getPhysicalDeviceFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, pFormatProperties: FormatProperties) {
		Commands.getPhysicalDeviceFormatProperties(getPhysicalDeviceFormatPropertiesAddr, physicalDevice.address, format.value, pFormatProperties.address)
	}
	
	
	
	fun getPhysicalDeviceImageFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, type: ImageType, tiling: ImageTiling, usage: ImageUsageFlags, flags: ImageCreateFlags, pImageFormatProperties: ImageFormatProperties): Result {
		return Result(Commands.getPhysicalDeviceImageFormatProperties(getPhysicalDeviceImageFormatPropertiesAddr, physicalDevice.address, format.value, type.value, tiling.value, usage.value, flags.value, pImageFormatProperties.address))
	}
	
	
	
	fun getPhysicalDeviceProperties(physicalDevice: PhysicalDeviceH, pProperties: PhysicalDeviceProperties) {
		Commands.getPhysicalDeviceProperties(getPhysicalDevicePropertiesAddr, physicalDevice.address, pProperties.address)
	}
	
	
	
	fun getPhysicalDeviceQueueFamilyProperties(physicalDevice: PhysicalDeviceH, pQueueFamilyPropertyCount: DirectInt, pQueueFamilyProperties: QueueFamilyProperties.Buffer?) {
		Commands.getPhysicalDeviceQueueFamilyProperties(getPhysicalDeviceQueueFamilyPropertiesAddr, physicalDevice.address, pQueueFamilyPropertyCount.address, pQueueFamilyProperties.addressOrNULL)
	}
	
	
	
	fun getPhysicalDeviceMemoryProperties(physicalDevice: PhysicalDeviceH, pMemoryProperties: PhysicalDeviceMemoryProperties) {
		Commands.getPhysicalDeviceMemoryProperties(getPhysicalDeviceMemoryPropertiesAddr, physicalDevice.address, pMemoryProperties.address)
	}
	
	
	
	fun getDeviceProcAddr(device: DeviceH, pName: DirectByteBuffer): Long {
		return Commands.getDeviceProcAddr(getDeviceProcAddrAddr, device.address, pName.address)
	}
	
	
	
	fun createDevice(physicalDevice: PhysicalDeviceH, pCreateInfo: DeviceCreateInfo, pAllocator: AllocationCallbacks?, pDevice: DirectLong): Result {
		return Result(Commands.createDevice(createDeviceAddr, physicalDevice.address, pCreateInfo.address, pAllocator.addressOrNULL, pDevice.address))
	}
	
	
	
	fun enumerateDeviceExtensionProperties(physicalDevice: PhysicalDeviceH, pLayerName: DirectByteBuffer?, pPropertyCount: DirectInt, pProperties: ExtensionProperties.Buffer?): Result {
		return Result(Commands.enumerateDeviceExtensionProperties(enumerateDeviceExtensionPropertiesAddr, physicalDevice.address, pLayerName.addressOrNULL, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun enumerateDeviceLayerProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: LayerProperties.Buffer?): Result {
		return Result(Commands.enumerateDeviceLayerProperties(enumerateDeviceLayerPropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceSparseImageFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, type: ImageType, samples: SampleCountFlags, usage: ImageUsageFlags, tiling: ImageTiling, pPropertyCount: DirectInt, pProperties: SparseImageFormatProperties.Buffer?) {
		Commands.getPhysicalDeviceSparseImageFormatProperties(getPhysicalDeviceSparseImageFormatPropertiesAddr, physicalDevice.address, format.value, type.value, samples.value, usage.value, tiling.value, pPropertyCount.address, pProperties.addressOrNULL)
	}
	
	
	
	fun enumeratePhysicalDeviceGroups(pPhysicalDeviceGroupCount: DirectInt, pPhysicalDeviceGroupProperties: PhysicalDeviceGroupProperties.Buffer?): Result {
		return Result(Commands.enumeratePhysicalDeviceGroups(enumeratePhysicalDeviceGroupsAddr, instance.address, pPhysicalDeviceGroupCount.address, pPhysicalDeviceGroupProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceFeatures2(physicalDevice: PhysicalDeviceH, pFeatures: PhysicalDeviceFeatures2) {
		Commands.getPhysicalDeviceFeatures2(getPhysicalDeviceFeatures2Addr, physicalDevice.address, pFeatures.address)
	}
	
	
	
	fun getPhysicalDeviceProperties2(physicalDevice: PhysicalDeviceH, pProperties: PhysicalDeviceProperties2) {
		Commands.getPhysicalDeviceProperties2(getPhysicalDeviceProperties2Addr, physicalDevice.address, pProperties.address)
	}
	
	
	
	fun getPhysicalDeviceFormatProperties2(physicalDevice: PhysicalDeviceH, format: Format, pFormatProperties: FormatProperties2) {
		Commands.getPhysicalDeviceFormatProperties2(getPhysicalDeviceFormatProperties2Addr, physicalDevice.address, format.value, pFormatProperties.address)
	}
	
	
	
	fun getPhysicalDeviceImageFormatProperties2(physicalDevice: PhysicalDeviceH, pImageFormatInfo: PhysicalDeviceImageFormatInfo2, pImageFormatProperties: ImageFormatProperties2): Result {
		return Result(Commands.getPhysicalDeviceImageFormatProperties2(getPhysicalDeviceImageFormatProperties2Addr, physicalDevice.address, pImageFormatInfo.address, pImageFormatProperties.address))
	}
	
	
	
	fun getPhysicalDeviceQueueFamilyProperties2(physicalDevice: PhysicalDeviceH, pQueueFamilyPropertyCount: DirectInt, pQueueFamilyProperties: QueueFamilyProperties2.Buffer?) {
		Commands.getPhysicalDeviceQueueFamilyProperties2(getPhysicalDeviceQueueFamilyProperties2Addr, physicalDevice.address, pQueueFamilyPropertyCount.address, pQueueFamilyProperties.addressOrNULL)
	}
	
	
	
	fun getPhysicalDeviceMemoryProperties2(physicalDevice: PhysicalDeviceH, pMemoryProperties: PhysicalDeviceMemoryProperties2) {
		Commands.getPhysicalDeviceMemoryProperties2(getPhysicalDeviceMemoryProperties2Addr, physicalDevice.address, pMemoryProperties.address)
	}
	
	
	
	fun getPhysicalDeviceSparseImageFormatProperties2(physicalDevice: PhysicalDeviceH, pFormatInfo: PhysicalDeviceSparseImageFormatInfo2, pPropertyCount: DirectInt, pProperties: SparseImageFormatProperties2.Buffer?) {
		Commands.getPhysicalDeviceSparseImageFormatProperties2(getPhysicalDeviceSparseImageFormatProperties2Addr, physicalDevice.address, pFormatInfo.address, pPropertyCount.address, pProperties.addressOrNULL)
	}
	
	
	
	fun getPhysicalDeviceExternalBufferProperties(physicalDevice: PhysicalDeviceH, pExternalBufferInfo: PhysicalDeviceExternalBufferInfo, pExternalBufferProperties: ExternalBufferProperties) {
		Commands.getPhysicalDeviceExternalBufferProperties(getPhysicalDeviceExternalBufferPropertiesAddr, physicalDevice.address, pExternalBufferInfo.address, pExternalBufferProperties.address)
	}
	
	
	
	fun getPhysicalDeviceExternalFenceProperties(physicalDevice: PhysicalDeviceH, pExternalFenceInfo: PhysicalDeviceExternalFenceInfo, pExternalFenceProperties: ExternalFenceProperties) {
		Commands.getPhysicalDeviceExternalFenceProperties(getPhysicalDeviceExternalFencePropertiesAddr, physicalDevice.address, pExternalFenceInfo.address, pExternalFenceProperties.address)
	}
	
	
	
	fun getPhysicalDeviceExternalSemaphoreProperties(physicalDevice: PhysicalDeviceH, pExternalSemaphoreInfo: PhysicalDeviceExternalSemaphoreInfo, pExternalSemaphoreProperties: ExternalSemaphoreProperties) {
		Commands.getPhysicalDeviceExternalSemaphoreProperties(getPhysicalDeviceExternalSemaphorePropertiesAddr, physicalDevice.address, pExternalSemaphoreInfo.address, pExternalSemaphoreProperties.address)
	}
	
	
	
	fun destroySurface(surface: SurfaceH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySurface(destroySurfaceAddr, instance.address, surface.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getPhysicalDeviceSurfaceSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, surface: SurfaceH, pSupported: DirectInt): Result {
		return Result(Commands.getPhysicalDeviceSurfaceSupport(getPhysicalDeviceSurfaceSupportAddr, physicalDevice.address, queueFamilyIndex, surface.address, pSupported.address))
	}
	
	
	
	fun getPhysicalDeviceSurfaceCapabilities(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pSurfaceCapabilities: SurfaceCapabilities): Result {
		return Result(Commands.getPhysicalDeviceSurfaceCapabilities(getPhysicalDeviceSurfaceCapabilitiesAddr, physicalDevice.address, surface.address, pSurfaceCapabilities.address))
	}
	
	
	
	fun getPhysicalDeviceSurfaceFormats(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pSurfaceFormatCount: DirectInt, pSurfaceFormats: SurfaceFormat.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfaceFormats(getPhysicalDeviceSurfaceFormatsAddr, physicalDevice.address, surface.address, pSurfaceFormatCount.address, pSurfaceFormats.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceSurfacePresentModes(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pPresentModeCount: DirectInt, pPresentModes: DirectIntBuffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfacePresentModes(getPhysicalDeviceSurfacePresentModesAddr, physicalDevice.address, surface.address, pPresentModeCount.address, pPresentModes.addressOrNULL))
	}
	
	
	
	fun getPhysicalDevicePresentRectangles(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pRectCount: DirectInt, pRects: Rect2D.Buffer?): Result {
		return Result(Commands.getPhysicalDevicePresentRectangles(getPhysicalDevicePresentRectanglesAddr, physicalDevice.address, surface.address, pRectCount.address, pRects.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceDisplayProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayProperties.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayProperties(getPhysicalDeviceDisplayPropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceDisplayPlaneProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayPlaneProperties.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayPlaneProperties(getPhysicalDeviceDisplayPlanePropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getDisplayPlaneSupportedDisplays(physicalDevice: PhysicalDeviceH, planeIndex: Int, pDisplayCount: DirectInt, pDisplays: DirectLongBuffer?): Result {
		return Result(Commands.getDisplayPlaneSupportedDisplays(getDisplayPlaneSupportedDisplaysAddr, physicalDevice.address, planeIndex, pDisplayCount.address, pDisplays.addressOrNULL))
	}
	
	
	
	fun getDisplayModeProperties(physicalDevice: PhysicalDeviceH, display: DisplayH, pPropertyCount: DirectInt, pProperties: DisplayModeProperties.Buffer?): Result {
		return Result(Commands.getDisplayModeProperties(getDisplayModePropertiesAddr, physicalDevice.address, display.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun createDisplayMode(physicalDevice: PhysicalDeviceH, display: DisplayH, pCreateInfo: DisplayModeCreateInfo, pAllocator: AllocationCallbacks?, pMode: DirectLong): Result {
		return Result(Commands.createDisplayMode(createDisplayModeAddr, physicalDevice.address, display.address, pCreateInfo.address, pAllocator.addressOrNULL, pMode.address))
	}
	
	
	
	fun getDisplayPlaneCapabilities(physicalDevice: PhysicalDeviceH, mode: DisplayModeH, planeIndex: Int, pCapabilities: DisplayPlaneCapabilities): Result {
		return Result(Commands.getDisplayPlaneCapabilities(getDisplayPlaneCapabilitiesAddr, physicalDevice.address, mode.address, planeIndex, pCapabilities.address))
	}
	
	
	
	fun createDisplayPlaneSurface(pCreateInfo: DisplaySurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createDisplayPlaneSurface(createDisplayPlaneSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun createXlibSurface(pCreateInfo: XlibSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createXlibSurface(createXlibSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceXlibPresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, dpy: DirectLong, visualID: Long): Int {
		return Commands.getPhysicalDeviceXlibPresentationSupport(getPhysicalDeviceXlibPresentationSupportAddr, physicalDevice.address, queueFamilyIndex, dpy.address, visualID)
	}
	
	
	
	fun createXcbSurface(pCreateInfo: XcbSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createXcbSurface(createXcbSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceXcbPresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, connection: DirectLong, visual_id: Long): Int {
		return Commands.getPhysicalDeviceXcbPresentationSupport(getPhysicalDeviceXcbPresentationSupportAddr, physicalDevice.address, queueFamilyIndex, connection.address, visual_id)
	}
	
	
	
	fun createWaylandSurface(pCreateInfo: WaylandSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createWaylandSurface(createWaylandSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceWaylandPresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, display: DirectLong): Int {
		return Commands.getPhysicalDeviceWaylandPresentationSupport(getPhysicalDeviceWaylandPresentationSupportAddr, physicalDevice.address, queueFamilyIndex, display.address)
	}
	
	
	
	fun createAndroidSurface(pCreateInfo: AndroidSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createAndroidSurface(createAndroidSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun createWin32Surface(pCreateInfo: Win32SurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createWin32Surface(createWin32SurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceWin32PresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int): Int {
		return Commands.getPhysicalDeviceWin32PresentationSupport(getPhysicalDeviceWin32PresentationSupportAddr, physicalDevice.address, queueFamilyIndex)
	}
	
	
	
	fun createStreamDescriptorSurface(pCreateInfo: StreamDescriptorSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createStreamDescriptorSurface(createStreamDescriptorSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun createViSurface(pCreateInfo: ViSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createViSurface(createViSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun releaseDisplay(physicalDevice: PhysicalDeviceH, display: DisplayH): Result {
		return Result(Commands.releaseDisplay(releaseDisplayAddr, physicalDevice.address, display.address))
	}
	
	
	
	fun acquireXlibDisplay(physicalDevice: PhysicalDeviceH, dpy: DirectLong, display: DisplayH): Result {
		return Result(Commands.acquireXlibDisplay(acquireXlibDisplayAddr, physicalDevice.address, dpy.address, display.address))
	}
	
	
	
	fun getRandROutputDisplay(physicalDevice: PhysicalDeviceH, dpy: DirectLong, rrOutput: Long, pDisplay: DirectLong): Result {
		return Result(Commands.getRandROutputDisplay(getRandROutputDisplayAddr, physicalDevice.address, dpy.address, rrOutput, pDisplay.address))
	}
	
	
	
	fun getPhysicalDeviceSurfaceCapabilities2EXT(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pSurfaceCapabilities: SurfaceCapabilities2EXT): Result {
		return Result(Commands.getPhysicalDeviceSurfaceCapabilities2EXT(getPhysicalDeviceSurfaceCapabilities2EXTAddr, physicalDevice.address, surface.address, pSurfaceCapabilities.address))
	}
	
	
	
	fun enumeratePhysicalDeviceQueueFamilyPerformanceQueryCounters(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, pCounterCount: DirectInt, pCounters: PerformanceCounter.Buffer?, pCounterDescriptions: PerformanceCounterDescription.Buffer?): Result {
		return Result(Commands.enumeratePhysicalDeviceQueueFamilyPerformanceQueryCounters(enumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersAddr, physicalDevice.address, queueFamilyIndex, pCounterCount.address, pCounters.addressOrNULL, pCounterDescriptions.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceQueueFamilyPerformanceQueryPasses(physicalDevice: PhysicalDeviceH, pPerformanceQueryCreateInfo: QueryPoolPerformanceCreateInfo, pNumPasses: DirectInt) {
		Commands.getPhysicalDeviceQueueFamilyPerformanceQueryPasses(getPhysicalDeviceQueueFamilyPerformanceQueryPassesAddr, physicalDevice.address, pPerformanceQueryCreateInfo.address, pNumPasses.address)
	}
	
	
	
	fun getPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice: PhysicalDeviceH, pSurfaceInfo: PhysicalDeviceSurfaceInfo2, pSurfaceCapabilities: SurfaceCapabilities2KHR): Result {
		return Result(Commands.getPhysicalDeviceSurfaceCapabilities2KHR(getPhysicalDeviceSurfaceCapabilities2KHRAddr, physicalDevice.address, pSurfaceInfo.address, pSurfaceCapabilities.address))
	}
	
	
	
	fun getPhysicalDeviceSurfaceFormats2(physicalDevice: PhysicalDeviceH, pSurfaceInfo: PhysicalDeviceSurfaceInfo2, pSurfaceFormatCount: DirectInt, pSurfaceFormats: SurfaceFormat2.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfaceFormats2(getPhysicalDeviceSurfaceFormats2Addr, physicalDevice.address, pSurfaceInfo.address, pSurfaceFormatCount.address, pSurfaceFormats.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceDisplayProperties2(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayProperties2.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayProperties2(getPhysicalDeviceDisplayProperties2Addr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceDisplayPlaneProperties2(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayPlaneProperties2.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayPlaneProperties2(getPhysicalDeviceDisplayPlaneProperties2Addr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getDisplayModeProperties2(physicalDevice: PhysicalDeviceH, display: DisplayH, pPropertyCount: DirectInt, pProperties: DisplayModeProperties2.Buffer?): Result {
		return Result(Commands.getDisplayModeProperties2(getDisplayModeProperties2Addr, physicalDevice.address, display.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getDisplayPlaneCapabilities2(physicalDevice: PhysicalDeviceH, pDisplayPlaneInfo: DisplayPlaneInfo2, pCapabilities: DisplayPlaneCapabilities2): Result {
		return Result(Commands.getDisplayPlaneCapabilities2(getDisplayPlaneCapabilities2Addr, physicalDevice.address, pDisplayPlaneInfo.address, pCapabilities.address))
	}
	
	
	
	fun createDebugUtilsMessenger(pCreateInfo: DebugUtilsMessengerCreateInfo, pAllocator: AllocationCallbacks?, pMessenger: DirectLong): Result {
		return Result(Commands.createDebugUtilsMessenger(createDebugUtilsMessengerAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pMessenger.address))
	}
	
	
	
	fun destroyDebugUtilsMessenger(messenger: DebugUtilsMessengerH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDebugUtilsMessenger(destroyDebugUtilsMessengerAddr, instance.address, messenger.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun submitDebugUtilsMessage(messageSeverity: DebugUtilsMessageSeverityFlags, messageTypes: DebugUtilsMessageTypeFlags, pCallbackData: DebugUtilsMessengerCallbackData) {
		Commands.submitDebugUtilsMessage(submitDebugUtilsMessageAddr, instance.address, messageSeverity.value, messageTypes.value, pCallbackData.address)
	}
	
	
	
	fun getPhysicalDeviceMultisampleProperties(physicalDevice: PhysicalDeviceH, samples: SampleCountFlags, pMultisampleProperties: MultisampleProperties) {
		Commands.getPhysicalDeviceMultisampleProperties(getPhysicalDeviceMultisamplePropertiesAddr, physicalDevice.address, samples.value, pMultisampleProperties.address)
	}
	
	
	
	fun getPhysicalDeviceCalibrateableTimeDomains(physicalDevice: PhysicalDeviceH, pTimeDomainCount: DirectInt, pTimeDomains: DirectIntBuffer?): Result {
		return Result(Commands.getPhysicalDeviceCalibrateableTimeDomains(getPhysicalDeviceCalibrateableTimeDomainsAddr, physicalDevice.address, pTimeDomainCount.address, pTimeDomains.addressOrNULL))
	}
	
	
	
	fun createImagePipeSurface(pCreateInfo: ImagePipeSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createImagePipeSurface(createImagePipeSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun createMetalSurface(pCreateInfo: MetalSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createMetalSurface(createMetalSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceFragmentShadingRates(physicalDevice: PhysicalDeviceH, pFragmentShadingRateCount: DirectInt, pFragmentShadingRates: PhysicalDeviceFragmentShadingRate.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceFragmentShadingRates(getPhysicalDeviceFragmentShadingRatesAddr, physicalDevice.address, pFragmentShadingRateCount.address, pFragmentShadingRates.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceToolProperties(physicalDevice: PhysicalDeviceH, pToolCount: DirectInt, pToolProperties: PhysicalDeviceToolProperties.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceToolProperties(getPhysicalDeviceToolPropertiesAddr, physicalDevice.address, pToolCount.address, pToolProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceCooperativeMatrixProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: CooperativeMatrixProperties.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceCooperativeMatrixProperties(getPhysicalDeviceCooperativeMatrixPropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceSupportedFramebufferMixedSamplesCombinations(physicalDevice: PhysicalDeviceH, pCombinationCount: DirectInt, pCombinations: FramebufferMixedSamplesCombination.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceSupportedFramebufferMixedSamplesCombinations(getPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsAddr, physicalDevice.address, pCombinationCount.address, pCombinations.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceSurfacePresentModes2(physicalDevice: PhysicalDeviceH, pSurfaceInfo: PhysicalDeviceSurfaceInfo2, pPresentModeCount: DirectInt, pPresentModes: DirectIntBuffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfacePresentModes2(getPhysicalDeviceSurfacePresentModes2Addr, physicalDevice.address, pSurfaceInfo.address, pPresentModeCount.address, pPresentModes.addressOrNULL))
	}
	
	
	
	fun createHeadlessSurface(pCreateInfo: HeadlessSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createHeadlessSurface(createHeadlessSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun acquireWinrtDisplay(physicalDevice: PhysicalDeviceH, display: DisplayH): Result {
		return Result(Commands.acquireWinrtDisplay(acquireWinrtDisplayAddr, physicalDevice.address, display.address))
	}
	
	
	
	fun getWinrtDisplay(physicalDevice: PhysicalDeviceH, deviceRelativeId: Int, pDisplay: DirectLong): Result {
		return Result(Commands.getWinrtDisplay(getWinrtDisplayAddr, physicalDevice.address, deviceRelativeId, pDisplay.address))
	}
	
	
	
	fun createDirectFBSurface(pCreateInfo: DirectFBSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createDirectFBSurface(createDirectFBSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceDirectFBPresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, dfb: DirectLong): Int {
		return Commands.getPhysicalDeviceDirectFBPresentationSupport(getPhysicalDeviceDirectFBPresentationSupportAddr, physicalDevice.address, queueFamilyIndex, dfb.address)
	}
	
	
	
	fun createScreenSurfaceQ(pCreateInfo: ScreenSurfaceCreateInfoQ, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createScreenSurfaceQ(createScreenSurfaceQAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceScreenPresentationSupportQ(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, window: DirectLong): Int {
		return Commands.getPhysicalDeviceScreenPresentationSupportQ(getPhysicalDeviceScreenPresentationSupportQAddr, physicalDevice.address, queueFamilyIndex, window.address)
	}


}