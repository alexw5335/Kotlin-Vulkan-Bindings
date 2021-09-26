// This file has been automatically generated.

package vulkan.generated.command

import memory.allocation.MemStacks
import memory.type.Addressable.Companion.addressOrNULL
import vulkan.generated.enumeration.*
import vulkan.generated.struct.*
import vulkan.generated.handle.*
import memory.primitive.*

@Suppress("unused")
class InstanceCommands(private val instance: InstanceH) {
	
	
	private val stack = MemStacks.default
	
	
	
	private fun addr(name: String) = Commands.getInstanceProcAddr0(instance.address, stack.encodeUtf8NT(name).address)
	
	
	
	/*
	Command addresses
	 */
	
	
	
	init { stack.push() }
	private val destroyInstanceAddr = addr("vkDestroyInstance")
	private val enumeratePhysicalDevicesAddr = addr("vkEnumeratePhysicalDevices")
	private val getPhysicalDeviceFeaturesAddr = addr("vkGetPhysicalDeviceFeatures")
	private val getPhysicalDeviceFormatPropertiesAddr = addr("vkGetPhysicalDeviceFormatProperties")
	private val getPhysicalDeviceImageFormatPropertiesAddr = addr("vkGetPhysicalDeviceImageFormatProperties")
	private val getPhysicalDevicePropertiesAddr = addr("vkGetPhysicalDeviceProperties")
	private val getPhysicalDeviceQueueFamilyPropertiesAddr = addr("vkGetPhysicalDeviceQueueFamilyProperties")
	private val getPhysicalDeviceMemoryPropertiesAddr = addr("vkGetPhysicalDeviceMemoryProperties")
	private val getInstanceProcAddrAddr = addr("vkGetInstanceProcAddr")
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
	private val destroySurfaceKHRAddr = addr("vkDestroySurfaceKHR")
	private val getPhysicalDeviceSurfaceSupportKHRAddr = addr("vkGetPhysicalDeviceSurfaceSupportKHR")
	private val getPhysicalDeviceSurfaceCapabilitiesKHRAddr = addr("vkGetPhysicalDeviceSurfaceCapabilitiesKHR")
	private val getPhysicalDeviceSurfaceFormatsKHRAddr = addr("vkGetPhysicalDeviceSurfaceFormatsKHR")
	private val getPhysicalDeviceSurfacePresentModesKHRAddr = addr("vkGetPhysicalDeviceSurfacePresentModesKHR")
	private val getPhysicalDevicePresentRectanglesKHRAddr = addr("vkGetPhysicalDevicePresentRectanglesKHR")
	private val getPhysicalDeviceDisplayPropertiesKHRAddr = addr("vkGetPhysicalDeviceDisplayPropertiesKHR")
	private val getPhysicalDeviceDisplayPlanePropertiesKHRAddr = addr("vkGetPhysicalDeviceDisplayPlanePropertiesKHR")
	private val getDisplayPlaneSupportedDisplaysKHRAddr = addr("vkGetDisplayPlaneSupportedDisplaysKHR")
	private val getDisplayModePropertiesKHRAddr = addr("vkGetDisplayModePropertiesKHR")
	private val createDisplayModeKHRAddr = addr("vkCreateDisplayModeKHR")
	private val getDisplayPlaneCapabilitiesKHRAddr = addr("vkGetDisplayPlaneCapabilitiesKHR")
	private val createDisplayPlaneSurfaceKHRAddr = addr("vkCreateDisplayPlaneSurfaceKHR")
	private val createXlibSurfaceKHRAddr = addr("vkCreateXlibSurfaceKHR")
	private val getPhysicalDeviceXlibPresentationSupportKHRAddr = addr("vkGetPhysicalDeviceXlibPresentationSupportKHR")
	private val createXcbSurfaceKHRAddr = addr("vkCreateXcbSurfaceKHR")
	private val getPhysicalDeviceXcbPresentationSupportKHRAddr = addr("vkGetPhysicalDeviceXcbPresentationSupportKHR")
	private val createWaylandSurfaceKHRAddr = addr("vkCreateWaylandSurfaceKHR")
	private val getPhysicalDeviceWaylandPresentationSupportKHRAddr = addr("vkGetPhysicalDeviceWaylandPresentationSupportKHR")
	private val createAndroidSurfaceKHRAddr = addr("vkCreateAndroidSurfaceKHR")
	private val createWin32SurfaceKHRAddr = addr("vkCreateWin32SurfaceKHR")
	private val getPhysicalDeviceWin32PresentationSupportKHRAddr = addr("vkGetPhysicalDeviceWin32PresentationSupportKHR")
	private val createDebugReportCallbackEXTAddr = addr("vkCreateDebugReportCallbackEXT")
	private val destroyDebugReportCallbackEXTAddr = addr("vkDestroyDebugReportCallbackEXT")
	private val debugReportMessageEXTAddr = addr("vkDebugReportMessageEXT")
	private val createStreamDescriptorSurfaceGGPAddr = addr("vkCreateStreamDescriptorSurfaceGGP")
	private val getPhysicalDeviceExternalImageFormatPropertiesNVAddr = addr("vkGetPhysicalDeviceExternalImageFormatPropertiesNV")
	private val getPhysicalDeviceFeatures2KHRAddr = addr("vkGetPhysicalDeviceFeatures2KHR")
	private val getPhysicalDeviceProperties2KHRAddr = addr("vkGetPhysicalDeviceProperties2KHR")
	private val getPhysicalDeviceFormatProperties2KHRAddr = addr("vkGetPhysicalDeviceFormatProperties2KHR")
	private val getPhysicalDeviceImageFormatProperties2KHRAddr = addr("vkGetPhysicalDeviceImageFormatProperties2KHR")
	private val getPhysicalDeviceQueueFamilyProperties2KHRAddr = addr("vkGetPhysicalDeviceQueueFamilyProperties2KHR")
	private val getPhysicalDeviceMemoryProperties2KHRAddr = addr("vkGetPhysicalDeviceMemoryProperties2KHR")
	private val getPhysicalDeviceSparseImageFormatProperties2KHRAddr = addr("vkGetPhysicalDeviceSparseImageFormatProperties2KHR")
	private val createViSurfaceNNAddr = addr("vkCreateViSurfaceNN")
	private val enumeratePhysicalDeviceGroupsKHRAddr = addr("vkEnumeratePhysicalDeviceGroupsKHR")
	private val getPhysicalDeviceExternalBufferPropertiesKHRAddr = addr("vkGetPhysicalDeviceExternalBufferPropertiesKHR")
	private val getPhysicalDeviceExternalSemaphorePropertiesKHRAddr = addr("vkGetPhysicalDeviceExternalSemaphorePropertiesKHR")
	private val releaseDisplayEXTAddr = addr("vkReleaseDisplayEXT")
	private val acquireXlibDisplayEXTAddr = addr("vkAcquireXlibDisplayEXT")
	private val getRandROutputDisplayEXTAddr = addr("vkGetRandROutputDisplayEXT")
	private val getPhysicalDeviceSurfaceCapabilities2EXTAddr = addr("vkGetPhysicalDeviceSurfaceCapabilities2EXT")
	private val getPhysicalDeviceExternalFencePropertiesKHRAddr = addr("vkGetPhysicalDeviceExternalFencePropertiesKHR")
	private val enumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHRAddr = addr("vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR")
	private val getPhysicalDeviceQueueFamilyPerformanceQueryPassesKHRAddr = addr("vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR")
	private val getPhysicalDeviceSurfaceCapabilities2KHRAddr = addr("vkGetPhysicalDeviceSurfaceCapabilities2KHR")
	private val getPhysicalDeviceSurfaceFormats2KHRAddr = addr("vkGetPhysicalDeviceSurfaceFormats2KHR")
	private val getPhysicalDeviceDisplayProperties2KHRAddr = addr("vkGetPhysicalDeviceDisplayProperties2KHR")
	private val getPhysicalDeviceDisplayPlaneProperties2KHRAddr = addr("vkGetPhysicalDeviceDisplayPlaneProperties2KHR")
	private val getDisplayModeProperties2KHRAddr = addr("vkGetDisplayModeProperties2KHR")
	private val getDisplayPlaneCapabilities2KHRAddr = addr("vkGetDisplayPlaneCapabilities2KHR")
	private val createIOSSurfaceMVKAddr = addr("vkCreateIOSSurfaceMVK")
	private val createMacOSSurfaceMVKAddr = addr("vkCreateMacOSSurfaceMVK")
	private val createDebugUtilsMessengerEXTAddr = addr("vkCreateDebugUtilsMessengerEXT")
	private val destroyDebugUtilsMessengerEXTAddr = addr("vkDestroyDebugUtilsMessengerEXT")
	private val submitDebugUtilsMessageEXTAddr = addr("vkSubmitDebugUtilsMessageEXT")
	private val getPhysicalDeviceMultisamplePropertiesEXTAddr = addr("vkGetPhysicalDeviceMultisamplePropertiesEXT")
	private val getPhysicalDeviceCalibrateableTimeDomainsEXTAddr = addr("vkGetPhysicalDeviceCalibrateableTimeDomainsEXT")
	private val createImagePipeSurfaceFUCHSIAAddr = addr("vkCreateImagePipeSurfaceFUCHSIA")
	private val createMetalSurfaceEXTAddr = addr("vkCreateMetalSurfaceEXT")
	private val getPhysicalDeviceFragmentShadingRatesKHRAddr = addr("vkGetPhysicalDeviceFragmentShadingRatesKHR")
	private val getPhysicalDeviceToolPropertiesEXTAddr = addr("vkGetPhysicalDeviceToolPropertiesEXT")
	private val getPhysicalDeviceCooperativeMatrixPropertiesNVAddr = addr("vkGetPhysicalDeviceCooperativeMatrixPropertiesNV")
	private val getPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNVAddr = addr("vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV")
	private val getPhysicalDeviceSurfacePresentModes2EXTAddr = addr("vkGetPhysicalDeviceSurfacePresentModes2EXT")
	private val createHeadlessSurfaceEXTAddr = addr("vkCreateHeadlessSurfaceEXT")
	private val acquireWinrtDisplayNVAddr = addr("vkAcquireWinrtDisplayNV")
	private val getWinrtDisplayNVAddr = addr("vkGetWinrtDisplayNV")
	private val createDirectFBSurfaceEXTAddr = addr("vkCreateDirectFBSurfaceEXT")
	private val getPhysicalDeviceDirectFBPresentationSupportEXTAddr = addr("vkGetPhysicalDeviceDirectFBPresentationSupportEXT")
	private val createScreenSurfaceQNXAddr = addr("vkCreateScreenSurfaceQNX")
	private val getPhysicalDeviceScreenPresentationSupportQNXAddr = addr("vkGetPhysicalDeviceScreenPresentationSupportQNX")
	init { stack.pop() }
	
	
	
	/*
	Instance commands
	 */
	
	
	
	fun destroyInstance(pAllocator: AllocationCallbacks?) {
		Commands.destroyInstance(destroyInstanceAddr, instance.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun enumeratePhysicalDevices(pPhysicalDeviceCount: DirectInt, pPhysicalDevices: NativePointerBuffer?): Result {
		return Result(Commands.enumeratePhysicalDevices(enumeratePhysicalDevicesAddr, instance.address, pPhysicalDeviceCount.address, pPhysicalDevices.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceFeatures(physicalDevice: PhysicalDeviceH, pFeatures: PhysicalDeviceFeatures) {
		Commands.getPhysicalDeviceFeatures(getPhysicalDeviceFeaturesAddr, physicalDevice.address, pFeatures.address)
	}
	
	
	
	fun getPhysicalDeviceFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, pFormatProperties: FormatProperties) {
		Commands.getPhysicalDeviceFormatProperties(getPhysicalDeviceFormatPropertiesAddr, physicalDevice.address, format.id, pFormatProperties.address)
	}
	
	
	
	fun getPhysicalDeviceImageFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, type: ImageType, tiling: ImageTiling, usage: ImageUsageFlags, flags: ImageCreateFlags, pImageFormatProperties: ImageFormatProperties): Result {
		return Result(Commands.getPhysicalDeviceImageFormatProperties(getPhysicalDeviceImageFormatPropertiesAddr, physicalDevice.address, format.id, type.id, tiling.id, usage.bitfield, flags.bitfield, pImageFormatProperties.address))
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
	
	
	
	fun getInstanceProcAddr(pName: DirectByteBuffer): Long {
		return Commands.getInstanceProcAddr(getInstanceProcAddrAddr, instance.addressOrNULL, pName.address)
	}
	
	
	
	fun createDevice(physicalDevice: PhysicalDeviceH, pCreateInfo: DeviceCreateInfo, pAllocator: AllocationCallbacks?, pDevice: NativePointer): Result {
		return Result(Commands.createDevice(createDeviceAddr, physicalDevice.address, pCreateInfo.address, pAllocator.addressOrNULL, pDevice.address))
	}
	
	
	
	fun enumerateDeviceExtensionProperties(physicalDevice: PhysicalDeviceH, pLayerName: DirectByteBuffer?, pPropertyCount: DirectInt, pProperties: ExtensionProperties.Buffer?): Result {
		return Result(Commands.enumerateDeviceExtensionProperties(enumerateDeviceExtensionPropertiesAddr, physicalDevice.address, pLayerName.addressOrNULL, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun enumerateDeviceLayerProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: LayerProperties.Buffer?): Result {
		return Result(Commands.enumerateDeviceLayerProperties(enumerateDeviceLayerPropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceSparseImageFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, type: ImageType, samples: SampleCountFlags, usage: ImageUsageFlags, tiling: ImageTiling, pPropertyCount: DirectInt, pProperties: SparseImageFormatProperties.Buffer?) {
		Commands.getPhysicalDeviceSparseImageFormatProperties(getPhysicalDeviceSparseImageFormatPropertiesAddr, physicalDevice.address, format.id, type.id, samples.bitfield, usage.bitfield, tiling.id, pPropertyCount.address, pProperties.addressOrNULL)
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
		Commands.getPhysicalDeviceFormatProperties2(getPhysicalDeviceFormatProperties2Addr, physicalDevice.address, format.id, pFormatProperties.address)
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
	
	
	
	fun destroySurfaceKHR(surface: SurfaceH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySurfaceKHR(destroySurfaceKHRAddr, instance.address, surface.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getPhysicalDeviceSurfaceSupportKHR(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, surface: SurfaceH, pSupported: DirectInt): Result {
		return Result(Commands.getPhysicalDeviceSurfaceSupportKHR(getPhysicalDeviceSurfaceSupportKHRAddr, physicalDevice.address, queueFamilyIndex, surface.address, pSupported.address))
	}
	
	
	
	fun getPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pSurfaceCapabilities: SurfaceCapabilitiesKHR): Result {
		return Result(Commands.getPhysicalDeviceSurfaceCapabilitiesKHR(getPhysicalDeviceSurfaceCapabilitiesKHRAddr, physicalDevice.address, surface.address, pSurfaceCapabilities.address))
	}
	
	
	
	fun getPhysicalDeviceSurfaceFormatsKHR(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pSurfaceFormatCount: DirectInt, pSurfaceFormats: SurfaceFormatKHR.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfaceFormatsKHR(getPhysicalDeviceSurfaceFormatsKHRAddr, physicalDevice.address, surface.address, pSurfaceFormatCount.address, pSurfaceFormats.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceSurfacePresentModesKHR(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pPresentModeCount: DirectInt, pPresentModes: DirectIntBuffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfacePresentModesKHR(getPhysicalDeviceSurfacePresentModesKHRAddr, physicalDevice.address, surface.address, pPresentModeCount.address, pPresentModes.addressOrNULL))
	}
	
	
	
	fun getPhysicalDevicePresentRectanglesKHR(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pRectCount: DirectInt, pRects: Rect2D.Buffer?): Result {
		return Result(Commands.getPhysicalDevicePresentRectanglesKHR(getPhysicalDevicePresentRectanglesKHRAddr, physicalDevice.address, surface.address, pRectCount.address, pRects.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceDisplayPropertiesKHR(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayPropertiesKHR.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayPropertiesKHR(getPhysicalDeviceDisplayPropertiesKHRAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceDisplayPlanePropertiesKHR(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayPlanePropertiesKHR.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayPlanePropertiesKHR(getPhysicalDeviceDisplayPlanePropertiesKHRAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getDisplayPlaneSupportedDisplaysKHR(physicalDevice: PhysicalDeviceH, planeIndex: Int, pDisplayCount: DirectInt, pDisplays: NativePointerBuffer?): Result {
		return Result(Commands.getDisplayPlaneSupportedDisplaysKHR(getDisplayPlaneSupportedDisplaysKHRAddr, physicalDevice.address, planeIndex, pDisplayCount.address, pDisplays.addressOrNULL))
	}
	
	
	
	fun getDisplayModePropertiesKHR(physicalDevice: PhysicalDeviceH, display: DisplayH, pPropertyCount: DirectInt, pProperties: DisplayModePropertiesKHR.Buffer?): Result {
		return Result(Commands.getDisplayModePropertiesKHR(getDisplayModePropertiesKHRAddr, physicalDevice.address, display.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun createDisplayModeKHR(physicalDevice: PhysicalDeviceH, display: DisplayH, pCreateInfo: DisplayModeCreateInfoKHR, pAllocator: AllocationCallbacks?, pMode: NativePointer): Result {
		return Result(Commands.createDisplayModeKHR(createDisplayModeKHRAddr, physicalDevice.address, display.address, pCreateInfo.address, pAllocator.addressOrNULL, pMode.address))
	}
	
	
	
	fun getDisplayPlaneCapabilitiesKHR(physicalDevice: PhysicalDeviceH, mode: DisplayModeH, planeIndex: Int, pCapabilities: DisplayPlaneCapabilitiesKHR): Result {
		return Result(Commands.getDisplayPlaneCapabilitiesKHR(getDisplayPlaneCapabilitiesKHRAddr, physicalDevice.address, mode.address, planeIndex, pCapabilities.address))
	}
	
	
	
	fun createDisplayPlaneSurfaceKHR(pCreateInfo: DisplaySurfaceCreateInfoKHR, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createDisplayPlaneSurfaceKHR(createDisplayPlaneSurfaceKHRAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun createXlibSurfaceKHR(pCreateInfo: XlibSurfaceCreateInfoKHR, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createXlibSurfaceKHR(createXlibSurfaceKHRAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceXlibPresentationSupportKHR(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, dpy: Long, visualID: Long): Int {
		return Commands.getPhysicalDeviceXlibPresentationSupportKHR(getPhysicalDeviceXlibPresentationSupportKHRAddr, physicalDevice.address, queueFamilyIndex, dpy, visualID)
	}
	
	
	
	fun createXcbSurfaceKHR(pCreateInfo: XcbSurfaceCreateInfoKHR, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createXcbSurfaceKHR(createXcbSurfaceKHRAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceXcbPresentationSupportKHR(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, connection: Long, visual_id: Long): Int {
		return Commands.getPhysicalDeviceXcbPresentationSupportKHR(getPhysicalDeviceXcbPresentationSupportKHRAddr, physicalDevice.address, queueFamilyIndex, connection, visual_id)
	}
	
	
	
	fun createWaylandSurfaceKHR(pCreateInfo: WaylandSurfaceCreateInfoKHR, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createWaylandSurfaceKHR(createWaylandSurfaceKHRAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceWaylandPresentationSupportKHR(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, display: Long): Int {
		return Commands.getPhysicalDeviceWaylandPresentationSupportKHR(getPhysicalDeviceWaylandPresentationSupportKHRAddr, physicalDevice.address, queueFamilyIndex, display)
	}
	
	
	
	fun createAndroidSurfaceKHR(pCreateInfo: AndroidSurfaceCreateInfoKHR, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createAndroidSurfaceKHR(createAndroidSurfaceKHRAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun createWin32SurfaceKHR(pCreateInfo: Win32SurfaceCreateInfoKHR, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createWin32SurfaceKHR(createWin32SurfaceKHRAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceWin32PresentationSupportKHR(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int): Int {
		return Commands.getPhysicalDeviceWin32PresentationSupportKHR(getPhysicalDeviceWin32PresentationSupportKHRAddr, physicalDevice.address, queueFamilyIndex)
	}
	
	
	
	fun createDebugReportCallbackEXT(pCreateInfo: DebugReportCallbackCreateInfoEXT, pAllocator: AllocationCallbacks?, pCallback: NativePointer): Result {
		return Result(Commands.createDebugReportCallbackEXT(createDebugReportCallbackEXTAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pCallback.address))
	}
	
	
	
	fun destroyDebugReportCallbackEXT(callback: DebugReportCallbackH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDebugReportCallbackEXT(destroyDebugReportCallbackEXTAddr, instance.address, callback.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun debugReportMessageEXT(flags: DebugReportFlags, objectType: DebugReportObjectType, _object: Long, location: Long, messageCode: Int, pLayerPrefix: DirectByteBuffer, pMessage: DirectByteBuffer) {
		Commands.debugReportMessageEXT(debugReportMessageEXTAddr, instance.address, flags.bitfield, objectType.id, _object, location, messageCode, pLayerPrefix.address, pMessage.address)
	}
	
	
	
	fun createStreamDescriptorSurfaceGGP(pCreateInfo: StreamDescriptorSurfaceCreateInfoGGP, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createStreamDescriptorSurfaceGGP(createStreamDescriptorSurfaceGGPAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceExternalImageFormatPropertiesNV(physicalDevice: PhysicalDeviceH, format: Format, type: ImageType, tiling: ImageTiling, usage: ImageUsageFlags, flags: ImageCreateFlags, externalHandleType: ExternalMemoryHandleTypeFlags, pExternalImageFormatProperties: ExternalImageFormatPropertiesNV): Result {
		return Result(Commands.getPhysicalDeviceExternalImageFormatPropertiesNV(getPhysicalDeviceExternalImageFormatPropertiesNVAddr, physicalDevice.address, format.id, type.id, tiling.id, usage.bitfield, flags.bitfield, externalHandleType.bitfield, pExternalImageFormatProperties.address))
	}
	
	
	
	fun getPhysicalDeviceFeatures2KHR(physicalDevice: PhysicalDeviceH, pFeatures: PhysicalDeviceFeatures2) {
		Commands.getPhysicalDeviceFeatures2KHR(getPhysicalDeviceFeatures2KHRAddr, physicalDevice.address, pFeatures.address)
	}
	
	
	
	fun getPhysicalDeviceProperties2KHR(physicalDevice: PhysicalDeviceH, pProperties: PhysicalDeviceProperties2) {
		Commands.getPhysicalDeviceProperties2KHR(getPhysicalDeviceProperties2KHRAddr, physicalDevice.address, pProperties.address)
	}
	
	
	
	fun getPhysicalDeviceFormatProperties2KHR(physicalDevice: PhysicalDeviceH, format: Format, pFormatProperties: FormatProperties2) {
		Commands.getPhysicalDeviceFormatProperties2KHR(getPhysicalDeviceFormatProperties2KHRAddr, physicalDevice.address, format.id, pFormatProperties.address)
	}
	
	
	
	fun getPhysicalDeviceImageFormatProperties2KHR(physicalDevice: PhysicalDeviceH, pImageFormatInfo: PhysicalDeviceImageFormatInfo2, pImageFormatProperties: ImageFormatProperties2): Result {
		return Result(Commands.getPhysicalDeviceImageFormatProperties2KHR(getPhysicalDeviceImageFormatProperties2KHRAddr, physicalDevice.address, pImageFormatInfo.address, pImageFormatProperties.address))
	}
	
	
	
	fun getPhysicalDeviceQueueFamilyProperties2KHR(physicalDevice: PhysicalDeviceH, pQueueFamilyPropertyCount: DirectInt, pQueueFamilyProperties: QueueFamilyProperties2.Buffer?) {
		Commands.getPhysicalDeviceQueueFamilyProperties2KHR(getPhysicalDeviceQueueFamilyProperties2KHRAddr, physicalDevice.address, pQueueFamilyPropertyCount.address, pQueueFamilyProperties.addressOrNULL)
	}
	
	
	
	fun getPhysicalDeviceMemoryProperties2KHR(physicalDevice: PhysicalDeviceH, pMemoryProperties: PhysicalDeviceMemoryProperties2) {
		Commands.getPhysicalDeviceMemoryProperties2KHR(getPhysicalDeviceMemoryProperties2KHRAddr, physicalDevice.address, pMemoryProperties.address)
	}
	
	
	
	fun getPhysicalDeviceSparseImageFormatProperties2KHR(physicalDevice: PhysicalDeviceH, pFormatInfo: PhysicalDeviceSparseImageFormatInfo2, pPropertyCount: DirectInt, pProperties: SparseImageFormatProperties2.Buffer?) {
		Commands.getPhysicalDeviceSparseImageFormatProperties2KHR(getPhysicalDeviceSparseImageFormatProperties2KHRAddr, physicalDevice.address, pFormatInfo.address, pPropertyCount.address, pProperties.addressOrNULL)
	}
	
	
	
	fun createViSurfaceNN(pCreateInfo: ViSurfaceCreateInfoNN, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createViSurfaceNN(createViSurfaceNNAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun enumeratePhysicalDeviceGroupsKHR(pPhysicalDeviceGroupCount: DirectInt, pPhysicalDeviceGroupProperties: PhysicalDeviceGroupProperties.Buffer?): Result {
		return Result(Commands.enumeratePhysicalDeviceGroupsKHR(enumeratePhysicalDeviceGroupsKHRAddr, instance.address, pPhysicalDeviceGroupCount.address, pPhysicalDeviceGroupProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceExternalBufferPropertiesKHR(physicalDevice: PhysicalDeviceH, pExternalBufferInfo: PhysicalDeviceExternalBufferInfo, pExternalBufferProperties: ExternalBufferProperties) {
		Commands.getPhysicalDeviceExternalBufferPropertiesKHR(getPhysicalDeviceExternalBufferPropertiesKHRAddr, physicalDevice.address, pExternalBufferInfo.address, pExternalBufferProperties.address)
	}
	
	
	
	fun getPhysicalDeviceExternalSemaphorePropertiesKHR(physicalDevice: PhysicalDeviceH, pExternalSemaphoreInfo: PhysicalDeviceExternalSemaphoreInfo, pExternalSemaphoreProperties: ExternalSemaphoreProperties) {
		Commands.getPhysicalDeviceExternalSemaphorePropertiesKHR(getPhysicalDeviceExternalSemaphorePropertiesKHRAddr, physicalDevice.address, pExternalSemaphoreInfo.address, pExternalSemaphoreProperties.address)
	}
	
	
	
	fun releaseDisplayEXT(physicalDevice: PhysicalDeviceH, display: DisplayH): Result {
		return Result(Commands.releaseDisplayEXT(releaseDisplayEXTAddr, physicalDevice.address, display.address))
	}
	
	
	
	fun acquireXlibDisplayEXT(physicalDevice: PhysicalDeviceH, dpy: Long, display: DisplayH): Result {
		return Result(Commands.acquireXlibDisplayEXT(acquireXlibDisplayEXTAddr, physicalDevice.address, dpy, display.address))
	}
	
	
	
	fun getRandROutputDisplayEXT(physicalDevice: PhysicalDeviceH, dpy: Long, rrOutput: Long, pDisplay: NativePointer): Result {
		return Result(Commands.getRandROutputDisplayEXT(getRandROutputDisplayEXTAddr, physicalDevice.address, dpy, rrOutput, pDisplay.address))
	}
	
	
	
	fun getPhysicalDeviceSurfaceCapabilities2EXT(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pSurfaceCapabilities: SurfaceCapabilities2EXT): Result {
		return Result(Commands.getPhysicalDeviceSurfaceCapabilities2EXT(getPhysicalDeviceSurfaceCapabilities2EXTAddr, physicalDevice.address, surface.address, pSurfaceCapabilities.address))
	}
	
	
	
	fun getPhysicalDeviceExternalFencePropertiesKHR(physicalDevice: PhysicalDeviceH, pExternalFenceInfo: PhysicalDeviceExternalFenceInfo, pExternalFenceProperties: ExternalFenceProperties) {
		Commands.getPhysicalDeviceExternalFencePropertiesKHR(getPhysicalDeviceExternalFencePropertiesKHRAddr, physicalDevice.address, pExternalFenceInfo.address, pExternalFenceProperties.address)
	}
	
	
	
	fun enumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, pCounterCount: DirectInt, pCounters: PerformanceCounterKHR.Buffer?, pCounterDescriptions: PerformanceCounterDescriptionKHR.Buffer?): Result {
		return Result(Commands.enumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(enumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHRAddr, physicalDevice.address, queueFamilyIndex, pCounterCount.address, pCounters.addressOrNULL, pCounterDescriptions.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(physicalDevice: PhysicalDeviceH, pPerformanceQueryCreateInfo: QueryPoolPerformanceCreateInfoKHR, pNumPasses: DirectInt) {
		Commands.getPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(getPhysicalDeviceQueueFamilyPerformanceQueryPassesKHRAddr, physicalDevice.address, pPerformanceQueryCreateInfo.address, pNumPasses.address)
	}
	
	
	
	fun getPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice: PhysicalDeviceH, pSurfaceInfo: PhysicalDeviceSurfaceInfo2KHR, pSurfaceCapabilities: SurfaceCapabilities2KHR): Result {
		return Result(Commands.getPhysicalDeviceSurfaceCapabilities2KHR(getPhysicalDeviceSurfaceCapabilities2KHRAddr, physicalDevice.address, pSurfaceInfo.address, pSurfaceCapabilities.address))
	}
	
	
	
	fun getPhysicalDeviceSurfaceFormats2KHR(physicalDevice: PhysicalDeviceH, pSurfaceInfo: PhysicalDeviceSurfaceInfo2KHR, pSurfaceFormatCount: DirectInt, pSurfaceFormats: SurfaceFormat2KHR.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfaceFormats2KHR(getPhysicalDeviceSurfaceFormats2KHRAddr, physicalDevice.address, pSurfaceInfo.address, pSurfaceFormatCount.address, pSurfaceFormats.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceDisplayProperties2KHR(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayProperties2KHR.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayProperties2KHR(getPhysicalDeviceDisplayProperties2KHRAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceDisplayPlaneProperties2KHR(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayPlaneProperties2KHR.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayPlaneProperties2KHR(getPhysicalDeviceDisplayPlaneProperties2KHRAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getDisplayModeProperties2KHR(physicalDevice: PhysicalDeviceH, display: DisplayH, pPropertyCount: DirectInt, pProperties: DisplayModeProperties2KHR.Buffer?): Result {
		return Result(Commands.getDisplayModeProperties2KHR(getDisplayModeProperties2KHRAddr, physicalDevice.address, display.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getDisplayPlaneCapabilities2KHR(physicalDevice: PhysicalDeviceH, pDisplayPlaneInfo: DisplayPlaneInfo2KHR, pCapabilities: DisplayPlaneCapabilities2KHR): Result {
		return Result(Commands.getDisplayPlaneCapabilities2KHR(getDisplayPlaneCapabilities2KHRAddr, physicalDevice.address, pDisplayPlaneInfo.address, pCapabilities.address))
	}
	
	
	
	fun createIOSSurfaceMVK(pCreateInfo: IOSSurfaceCreateInfoMVK, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createIOSSurfaceMVK(createIOSSurfaceMVKAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun createMacOSSurfaceMVK(pCreateInfo: MacOSSurfaceCreateInfoMVK, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createMacOSSurfaceMVK(createMacOSSurfaceMVKAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun createDebugUtilsMessengerEXT(pCreateInfo: DebugUtilsMessengerCreateInfoEXT, pAllocator: AllocationCallbacks?, pMessenger: NativePointer): Result {
		return Result(Commands.createDebugUtilsMessengerEXT(createDebugUtilsMessengerEXTAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pMessenger.address))
	}
	
	
	
	fun destroyDebugUtilsMessengerEXT(messenger: DebugUtilsMessengerH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDebugUtilsMessengerEXT(destroyDebugUtilsMessengerEXTAddr, instance.address, messenger.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun submitDebugUtilsMessageEXT(messageSeverity: DebugUtilsMessageSeverityFlags, messageTypes: DebugUtilsMessageTypeFlags, pCallbackData: DebugUtilsMessengerCallbackDataEXT) {
		Commands.submitDebugUtilsMessageEXT(submitDebugUtilsMessageEXTAddr, instance.address, messageSeverity.bitfield, messageTypes.bitfield, pCallbackData.address)
	}
	
	
	
	fun getPhysicalDeviceMultisamplePropertiesEXT(physicalDevice: PhysicalDeviceH, samples: SampleCountFlags, pMultisampleProperties: MultisamplePropertiesEXT) {
		Commands.getPhysicalDeviceMultisamplePropertiesEXT(getPhysicalDeviceMultisamplePropertiesEXTAddr, physicalDevice.address, samples.bitfield, pMultisampleProperties.address)
	}
	
	
	
	fun getPhysicalDeviceCalibrateableTimeDomainsEXT(physicalDevice: PhysicalDeviceH, pTimeDomainCount: DirectInt, pTimeDomains: DirectIntBuffer?): Result {
		return Result(Commands.getPhysicalDeviceCalibrateableTimeDomainsEXT(getPhysicalDeviceCalibrateableTimeDomainsEXTAddr, physicalDevice.address, pTimeDomainCount.address, pTimeDomains.addressOrNULL))
	}
	
	
	
	fun createImagePipeSurfaceFUCHSIA(pCreateInfo: ImagePipeSurfaceCreateInfoFUCHSIA, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createImagePipeSurfaceFUCHSIA(createImagePipeSurfaceFUCHSIAAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun createMetalSurfaceEXT(pCreateInfo: MetalSurfaceCreateInfoEXT, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createMetalSurfaceEXT(createMetalSurfaceEXTAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceFragmentShadingRatesKHR(physicalDevice: PhysicalDeviceH, pFragmentShadingRateCount: DirectInt, pFragmentShadingRates: PhysicalDeviceFragmentShadingRateKHR.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceFragmentShadingRatesKHR(getPhysicalDeviceFragmentShadingRatesKHRAddr, physicalDevice.address, pFragmentShadingRateCount.address, pFragmentShadingRates.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceToolPropertiesEXT(physicalDevice: PhysicalDeviceH, pToolCount: DirectInt, pToolProperties: PhysicalDeviceToolPropertiesEXT.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceToolPropertiesEXT(getPhysicalDeviceToolPropertiesEXTAddr, physicalDevice.address, pToolCount.address, pToolProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceCooperativeMatrixPropertiesNV(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: CooperativeMatrixPropertiesNV.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceCooperativeMatrixPropertiesNV(getPhysicalDeviceCooperativeMatrixPropertiesNVAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(physicalDevice: PhysicalDeviceH, pCombinationCount: DirectInt, pCombinations: FramebufferMixedSamplesCombinationNV.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(getPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNVAddr, physicalDevice.address, pCombinationCount.address, pCombinations.addressOrNULL))
	}
	
	
	
	fun getPhysicalDeviceSurfacePresentModes2EXT(physicalDevice: PhysicalDeviceH, pSurfaceInfo: PhysicalDeviceSurfaceInfo2KHR, pPresentModeCount: DirectInt, pPresentModes: DirectIntBuffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfacePresentModes2EXT(getPhysicalDeviceSurfacePresentModes2EXTAddr, physicalDevice.address, pSurfaceInfo.address, pPresentModeCount.address, pPresentModes.addressOrNULL))
	}
	
	
	
	fun createHeadlessSurfaceEXT(pCreateInfo: HeadlessSurfaceCreateInfoEXT, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createHeadlessSurfaceEXT(createHeadlessSurfaceEXTAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun acquireWinrtDisplayNV(physicalDevice: PhysicalDeviceH, display: DisplayH): Result {
		return Result(Commands.acquireWinrtDisplayNV(acquireWinrtDisplayNVAddr, physicalDevice.address, display.address))
	}
	
	
	
	fun getWinrtDisplayNV(physicalDevice: PhysicalDeviceH, deviceRelativeId: Int, pDisplay: NativePointer): Result {
		return Result(Commands.getWinrtDisplayNV(getWinrtDisplayNVAddr, physicalDevice.address, deviceRelativeId, pDisplay.address))
	}
	
	
	
	fun createDirectFBSurfaceEXT(pCreateInfo: DirectFBSurfaceCreateInfoEXT, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createDirectFBSurfaceEXT(createDirectFBSurfaceEXTAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceDirectFBPresentationSupportEXT(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, dfb: Long): Int {
		return Commands.getPhysicalDeviceDirectFBPresentationSupportEXT(getPhysicalDeviceDirectFBPresentationSupportEXTAddr, physicalDevice.address, queueFamilyIndex, dfb)
	}
	
	
	
	fun createScreenSurfaceQNX(pCreateInfo: ScreenSurfaceCreateInfoQNX, pAllocator: AllocationCallbacks?, pSurface: NativePointer): Result {
		return Result(Commands.createScreenSurfaceQNX(createScreenSurfaceQNXAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	
	
	fun getPhysicalDeviceScreenPresentationSupportQNX(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, window: Long): Int {
		return Commands.getPhysicalDeviceScreenPresentationSupportQNX(getPhysicalDeviceScreenPresentationSupportQNXAddr, physicalDevice.address, queueFamilyIndex, window)
	}


}