// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer

/**
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