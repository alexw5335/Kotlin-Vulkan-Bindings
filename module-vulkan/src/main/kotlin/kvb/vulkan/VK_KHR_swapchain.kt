// This file has been automatically generated.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.*
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_swapchain
 *     VkResult vkCreateSwapchainKHR(
 *         VkDevice                   device
 *         VkSwapchainCreateInfoKHR*  pCreateInfo
 *         VkAllocationCallbacks*     pAllocator
 *         VkSwapchainKHR*            pSwapchain
 *     );
 */
internal external fun createSwapchain(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pSwapchain: Long): Int



/**
 *     // provided by VK_KHR_swapchain
 *     void vkDestroySwapchainKHR(
 *         VkDevice                device
 *         VkSwapchainKHR          swapchain
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroySwapchain(address: Long, device: Long, swapchain: Long, pAllocator: Long)



/**
 *     // provided by VK_KHR_swapchain
 *     VkResult vkGetSwapchainImagesKHR(
 *         VkDevice        device
 *         VkSwapchainKHR  swapchain
 *         uint32_t*       pSwapchainImageCount
 *         VkImage*        pSwapchainImages
 *     );
 */
internal external fun getSwapchainImages(address: Long, device: Long, swapchain: Long, pSwapchainImageCount: Long, pSwapchainImages: Long): Int



/**
 *     // provided by VK_KHR_swapchain
 *     VkResult vkAcquireNextImageKHR(
 *         VkDevice        device
 *         VkSwapchainKHR  swapchain
 *         uint64_t        timeout
 *         VkSemaphore     semaphore
 *         VkFence         fence
 *         uint32_t*       pImageIndex
 *     );
 */
internal external fun acquireNextImage(address: Long, device: Long, swapchain: Long, timeout: Long, semaphore: Long, fence: Long, pImageIndex: Long): Int



/**
 *     // provided by VK_KHR_swapchain
 *     VkResult vkQueuePresentKHR(
 *         VkQueue            queue
 *         VkPresentInfoKHR*  pPresentInfo
 *     );
 */
internal external fun queuePresent(address: Long, queue: Long, pPresentInfo: Long): Int



/**
 *     // provided by VK_KHR_swapchain
 *     VkResult vkGetDeviceGroupPresentCapabilitiesKHR(
 *         VkDevice                              device
 *         VkDeviceGroupPresentCapabilitiesKHR*  pDeviceGroupPresentCapabilities
 *     );
 */
internal external fun getDeviceGroupPresentCapabilities(address: Long, device: Long, pDeviceGroupPresentCapabilities: Long): Int



/**
 *     // provided by VK_KHR_swapchain
 *     VkResult vkGetDeviceGroupSurfacePresentModesKHR(
 *         VkDevice                           device
 *         VkSurfaceKHR                       surface
 *         VkDeviceGroupPresentModeFlagsKHR*  pModes
 *     );
 */
internal external fun getDeviceGroupSurfacePresentModes(address: Long, device: Long, surface: Long, pModes: Long): Int



/**
 *     // provided by VK_KHR_swapchain
 *     VkResult vkGetPhysicalDevicePresentRectanglesKHR(
 *         VkPhysicalDevice  physicalDevice
 *         VkSurfaceKHR      surface
 *         uint32_t*         pRectCount
 *         VkRect2D*         pRects
 *     );
 */
internal external fun getPhysicalDevicePresentRectangles(address: Long, physicalDevice: Long, surface: Long, pRectCount: Long, pRects: Long): Int



/**
 *     // provided by VK_KHR_swapchain
 *     VkResult vkAcquireNextImage2KHR(
 *         VkDevice                    device
 *         VkAcquireNextImageInfoKHR*  pAcquireInfo
 *         uint32_t*                   pImageIndex
 *     );
 */
internal external fun acquireNextImage2(address: Long, device: Long, pAcquireInfo: Long, pImageIndex: Long): Int



/**
 * Implementation of VkSwapchainKHR.
 */
open class SwapchainH(override val address: Long) : Addressable



/**
 *     // provided by VK_KHR_swapchain
 *     enum VkSwapchainCreateFlagBitsKHR {
 *         VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR  = 1
 *         VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR                    = 2
 *         VK_SWAPCHAIN_CREATE_MUTABLE_FORMAT_BIT_KHR               = 4
 *     }
 */
@JvmInline
value class SwapchainCreateFlags(val value: Int) {
	
	
	companion object {
		
		val PROTECTED = SwapchainCreateFlags(2)
	
	}
	
	
	
	operator fun plus(mask: SwapchainCreateFlags) = SwapchainCreateFlags(value or mask.value)
	
	operator fun contains(mask: SwapchainCreateFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [SwapchainCreateFlags].
 */
inline fun SwapchainCreateFlags(block: SwapchainCreateFlags.Companion.() -> SwapchainCreateFlags) = block(SwapchainCreateFlags)



/**
 *     // provided by VK_KHR_swapchain
 *     enum VkDeviceGroupPresentModeFlagBitsKHR {
 *         VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR               = 1
 *         VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR              = 2
 *         VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR                 = 4
 *         VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR  = 8
 *     }
 */
@JvmInline
value class DeviceGroupPresentModeFlags(val value: Int) {
	
	
	companion object {
		
		val LOCAL = DeviceGroupPresentModeFlags(1)
		
		val REMOTE = DeviceGroupPresentModeFlags(2)
		
		val SUM = DeviceGroupPresentModeFlags(4)
		
		val LOCAL_MULTI_DEVICE = DeviceGroupPresentModeFlags(8)
	
	}
	
	
	
	operator fun plus(mask: DeviceGroupPresentModeFlags) = DeviceGroupPresentModeFlags(value or mask.value)
	
	operator fun contains(mask: DeviceGroupPresentModeFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [DeviceGroupPresentModeFlags].
 */
inline fun DeviceGroupPresentModeFlags(block: DeviceGroupPresentModeFlags.Companion.() -> DeviceGroupPresentModeFlags) = block(DeviceGroupPresentModeFlags)



/**
 *     // provided by VK_KHR_swapchain
 *     struct VkSwapchainCreateInfoKHR {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkSwapchainCreateFlagsKHR      flags
 *         VkSurfaceKHR                   surface
 *         uint32_t                       minImageCount
 *         VkFormat                       imageFormat
 *         VkColorSpaceKHR                imageColorSpace
 *         VkExtent2D                     imageExtent
 *         uint32_t                       imageArrayLayers
 *         VkImageUsageFlags              imageUsage
 *         VkSharingMode                  imageSharingMode
 *         uint32_t                       queueFamilyIndexCount
 *         uint32_t*                      pQueueFamilyIndices
 *         VkSurfaceTransformFlagBitsKHR  preTransform
 *         VkCompositeAlphaFlagBitsKHR    compositeAlpha
 *         VkPresentModeKHR               presentMode
 *         VkBool32                       clipped
 *         VkSwapchainKHR                 oldSwapchain
 *     }
 * 
 *     Valid pNext types:
 *         - VkSwapchainCounterCreateInfoEXT
 *         - VkDeviceGroupSwapchainCreateInfoKHR
 *         - VkSwapchainDisplayNativeHdrCreateInfoAMD
 *         - VkImageFormatListCreateInfo
 *         - VkSurfaceFullScreenExclusiveInfoEXT
 *         - VkSurfaceFullScreenExclusiveWin32InfoEXT
 */
@JvmInline
value class SwapchainCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: SwapchainCreateFlags
		get()      = SwapchainCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var surface: SurfaceH
		get()      = SurfaceH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var minImageCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var imageFormat: Format
		get()      = Format(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var imageColorSpace: ColorSpace
		get()      = _ColorSpace(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var imageExtent: Extent2D
		get()      = Extent2D(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 8)
	
	var imageArrayLayers: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var imageUsage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 56))
		set(value) = Unsafe.setInt(address + 56, value.value)
	
	var imageSharingMode: SharingMode
		get()      = _SharingMode(Unsafe.getInt(address + 60))
		set(value) = Unsafe.setInt(address + 60, value.value)
	
	var queueFamilyIndexCount: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var pQueueFamilyIndices: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var preTransform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 80))
		set(value) = Unsafe.setInt(address + 80, value.value)
	
	var compositeAlpha: CompositeAlphaFlags
		get()      = CompositeAlphaFlags(Unsafe.getInt(address + 84))
		set(value) = Unsafe.setInt(address + 84, value.value)
	
	var presentMode: PresentMode
		get()      = _PresentMode(Unsafe.getInt(address + 88))
		set(value) = Unsafe.setInt(address + 88, value.value)
	
	var clipped: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var oldSwapchain: SwapchainH
		get()      = SwapchainH(Unsafe.getLong(address + 96))
		set(value) = Unsafe.setLong(address + 96, value.address)
	
	
	
	var queueFamilyIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 72), queueFamilyIndexCount)
		set(value) { Unsafe.setLong(address + 72, value.address); queueFamilyIndexCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 104
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SwapchainCreateInfo(offset(index))
		
		operator fun set(index: Int, value: SwapchainCreateInfo) = Unsafe.copy(value.address, offset(index), 104)
		
		inline fun forEach(block: (SwapchainCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SwapchainCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SwapchainCreateInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [SwapchainCreateInfo].
 */
inline fun Allocator.SwapchainCreateInfo(block: (SwapchainCreateInfo) -> Unit) = SwapchainCreateInfo(calloc(104)).apply(block).also { it.sType = 1000001000 }



/**
 * Struct buffer calloc function for [SwapchainCreateInfo].
 */
inline fun Allocator.SwapchainCreateInfo(capacity: Int, block: (SwapchainCreateInfo.Buffer) -> Unit) = SwapchainCreateInfo.Buffer(calloc(capacity * 104), capacity).apply(block).apply { forEach { it.sType = 1000001000 } }



/**
 *     // provided by VK_KHR_swapchain
 *     struct VkPresentInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext
 *         uint32_t         waitSemaphoreCount
 *         VkSemaphore*     pWaitSemaphores
 *         uint32_t         swapchainCount
 *         VkSwapchainKHR*  pSwapchains
 *         uint32_t*        pImageIndices
 *         VkResult*        pResults
 *     }
 * 
 *     Valid pNext types:
 *         - VkDisplayPresentInfoKHR
 *         - VkPresentRegionsKHR
 *         - VkDeviceGroupPresentInfoKHR
 *         - VkPresentIdKHR
 *         - VkPresentTimesInfoGOOGLE
 *         - VkPresentFrameTokenGGP
 */
@JvmInline
value class PresentInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var waitSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pWaitSemaphores: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var swapchainCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pSwapchains: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var pImageIndices: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var pResults: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var waitSemaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), waitSemaphoreCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreCount = value.capacity }
	
	var swapchains: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), swapchainCount)
		set(value) { Unsafe.setLong(address + 40, value.address); swapchainCount = value.capacity }
	
	var imageIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 48), swapchainCount)
		set(value) { Unsafe.setLong(address + 48, value.address); swapchainCount = value.capacity }
	
	var results: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 56), swapchainCount)
		set(value) { Unsafe.setLong(address + 56, value.address); swapchainCount = value.capacity }


}



/**
 * Struct calloc function for [PresentInfo].
 */
inline fun Allocator.PresentInfo(block: (PresentInfo) -> Unit) = PresentInfo(calloc(64)).apply(block).also { it.sType = 1000001001 }



/**
 *     // provided by VK_KHR_swapchain
 *     struct VkImageSwapchainCreateInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkSwapchainKHR   swapchain
 *     }
 */
@JvmInline
value class ImageSwapchainCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var swapchain: SwapchainH
		get()      = SwapchainH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)


}



/**
 * Struct calloc function for [ImageSwapchainCreateInfo].
 */
inline fun Allocator.ImageSwapchainCreateInfo(block: (ImageSwapchainCreateInfo) -> Unit) = ImageSwapchainCreateInfo(calloc(24)).apply(block).also { it.sType = 1000060008 }



/**
 *     // provided by VK_KHR_swapchain
 *     struct VkBindImageMemorySwapchainInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkSwapchainKHR   swapchain
 *         uint32_t         imageIndex
 *     }
 */
@JvmInline
value class BindImageMemorySwapchainInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var swapchain: SwapchainH
		get()      = SwapchainH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var imageIndex: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}



/**
 * Struct calloc function for [BindImageMemorySwapchainInfo].
 */
inline fun Allocator.BindImageMemorySwapchainInfo(block: (BindImageMemorySwapchainInfo) -> Unit) = BindImageMemorySwapchainInfo(calloc(32)).apply(block).also { it.sType = 1000060009 }



/**
 *     // provided by VK_KHR_swapchain
 *     struct VkAcquireNextImageInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkSwapchainKHR   swapchain
 *         uint64_t         timeout
 *         VkSemaphore      semaphore
 *         VkFence          fence
 *         uint32_t         deviceMask
 *     }
 */
@JvmInline
value class AcquireNextImageInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var swapchain: SwapchainH
		get()      = SwapchainH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var timeout: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var semaphore: SemaphoreH
		get()      = SemaphoreH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var fence: FenceH
		get()      = FenceH(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)
	
	var deviceMask: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)


}



/**
 * Struct calloc function for [AcquireNextImageInfo].
 */
inline fun Allocator.AcquireNextImageInfo(block: (AcquireNextImageInfo) -> Unit) = AcquireNextImageInfo(calloc(56)).apply(block).also { it.sType = 1000060010 }



/**
 *     // provided by VK_KHR_swapchain
 *     struct VkDeviceGroupPresentCapabilitiesKHR {
 *         VkStructureType                   sType
 *         void*                             pNext (must be null)
 *         uint32_t                          presentMask[32]
 *         VkDeviceGroupPresentModeFlagsKHR  modes
 *     }
 */
@JvmInline
value class DeviceGroupPresentCapabilities(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var presentMask: DirectIntBuffer
		get()      = DirectIntBuffer(address + 16, 32)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)
	
	var modes: DeviceGroupPresentModeFlags
		get()      = DeviceGroupPresentModeFlags(Unsafe.getInt(address + 144))
		set(value) = Unsafe.setInt(address + 144, value.value)


}



/**
 * Struct calloc function for [DeviceGroupPresentCapabilities].
 */
inline fun Allocator.DeviceGroupPresentCapabilities(block: (DeviceGroupPresentCapabilities) -> Unit) = DeviceGroupPresentCapabilities(calloc(152)).apply(block).also { it.sType = 1000060007 }



/**
 *     // provided by VK_KHR_swapchain
 *     struct VkDeviceGroupPresentInfoKHR {
 *         VkStructureType                      sType
 *         void*                                pNext (must be null)
 *         uint32_t                             swapchainCount
 *         uint32_t*                            pDeviceMasks
 *         VkDeviceGroupPresentModeFlagBitsKHR  mode
 *     }
 */
@JvmInline
value class DeviceGroupPresentInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var swapchainCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pDeviceMasks: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var mode: DeviceGroupPresentModeFlags
		get()      = DeviceGroupPresentModeFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	
	
	var deviceMasks: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), swapchainCount)
		set(value) { Unsafe.setLong(address + 24, value.address); swapchainCount = value.capacity }


}



/**
 * Struct calloc function for [DeviceGroupPresentInfo].
 */
inline fun Allocator.DeviceGroupPresentInfo(block: (DeviceGroupPresentInfo) -> Unit) = DeviceGroupPresentInfo(calloc(40)).apply(block).also { it.sType = 1000060011 }



/**
 *     // provided by VK_KHR_swapchain
 *     struct VkDeviceGroupSwapchainCreateInfoKHR {
 *         VkStructureType                   sType
 *         void*                             pNext (must be null)
 *         VkDeviceGroupPresentModeFlagsKHR  modes
 *     }
 */
@JvmInline
value class DeviceGroupSwapchainCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var modes: DeviceGroupPresentModeFlags
		get()      = DeviceGroupPresentModeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [DeviceGroupSwapchainCreateInfo].
 */
inline fun Allocator.DeviceGroupSwapchainCreateInfo(block: (DeviceGroupSwapchainCreateInfo) -> Unit) = DeviceGroupSwapchainCreateInfo(calloc(24)).apply(block).also { it.sType = 1000060012 }