// This file has been automatically generated.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_surface
 *     void vkDestroySurfaceKHR(
 *         VkInstance              instance
 *         VkSurfaceKHR            surface
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroySurface(address: Long, instance: Long, surface: Long, pAllocator: Long)



/**
 *     // provided by VK_KHR_surface
 *     VkResult vkGetPhysicalDeviceSurfaceSupportKHR(
 *         VkPhysicalDevice  physicalDevice
 *         uint32_t          queueFamilyIndex
 *         VkSurfaceKHR      surface
 *         VkBool32*         pSupported
 *     );
 */
internal external fun getPhysicalDeviceSurfaceSupport(address: Long, physicalDevice: Long, queueFamilyIndex: Int, surface: Long, pSupported: Long): Int



/**
 *     // provided by VK_KHR_surface
 *     VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
 *         VkPhysicalDevice           physicalDevice
 *         VkSurfaceKHR               surface
 *         VkSurfaceCapabilitiesKHR*  pSurfaceCapabilities
 *     );
 */
internal external fun getPhysicalDeviceSurfaceCapabilities(address: Long, physicalDevice: Long, surface: Long, pSurfaceCapabilities: Long): Int



/**
 *     // provided by VK_KHR_surface
 *     VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(
 *         VkPhysicalDevice     physicalDevice
 *         VkSurfaceKHR         surface
 *         uint32_t*            pSurfaceFormatCount
 *         VkSurfaceFormatKHR*  pSurfaceFormats
 *     );
 */
internal external fun getPhysicalDeviceSurfaceFormats(address: Long, physicalDevice: Long, surface: Long, pSurfaceFormatCount: Long, pSurfaceFormats: Long): Int



/**
 *     // provided by VK_KHR_surface
 *     VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(
 *         VkPhysicalDevice   physicalDevice
 *         VkSurfaceKHR       surface
 *         uint32_t*          pPresentModeCount
 *         VkPresentModeKHR*  pPresentModes
 *     );
 */
internal external fun getPhysicalDeviceSurfacePresentModes(address: Long, physicalDevice: Long, surface: Long, pPresentModeCount: Long, pPresentModes: Long): Int



/**
 * Implementation of VkSurfaceKHR.
 */
open class SurfaceH(override val address: Long) : Addressable



/**
 *     // provided by VK_KHR_surface
 *     enum VkPresentModeKHR {
 *         VK_PRESENT_MODE_IMMEDIATE_KHR                  = 0
 *         VK_PRESENT_MODE_MAILBOX_KHR                    = 1
 *         VK_PRESENT_MODE_FIFO_KHR                       = 2
 *         VK_PRESENT_MODE_FIFO_RELAXED_KHR               = 3
 *         VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR      = 1000111000
 *         VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR  = 1000111001
 *     }
 */
@Suppress("Unused")
enum class PresentMode(val value: Int) {
	
	
	IMMEDIATE(0),
	
	MAILBOX(1),
	
	FIFO(2),
	
	FIFO_RELAXED(3);


}



/**
 *     // provided by VK_KHR_surface
 *     enum VkColorSpaceKHR {
 *         VK_COLOR_SPACE_SRGB_NONLINEAR_KHR           = 0
 *         VK_COLORSPACE_SRGB_NONLINEAR_KHR            = 0
 *         VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT     = 1000104001
 *         VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT     = 1000104002
 *         VK_COLOR_SPACE_DISPLAY_P3_LINEAR_EXT        = 1000104003
 *         VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT         = 1000104004
 *         VK_COLOR_SPACE_BT709_LINEAR_EXT             = 1000104005
 *         VK_COLOR_SPACE_BT709_NONLINEAR_EXT          = 1000104006
 *         VK_COLOR_SPACE_BT2020_LINEAR_EXT            = 1000104007
 *         VK_COLOR_SPACE_HDR10_ST2084_EXT             = 1000104008
 *         VK_COLOR_SPACE_DOLBYVISION_EXT              = 1000104009
 *         VK_COLOR_SPACE_HDR10_HLG_EXT                = 1000104010
 *         VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT          = 1000104011
 *         VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT       = 1000104012
 *         VK_COLOR_SPACE_PASS_THROUGH_EXT             = 1000104013
 *         VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT  = 1000104014
 *         VK_COLOR_SPACE_DCI_P3_LINEAR_EXT            = 1000104003
 *         VK_COLOR_SPACE_DISPLAY_NATIVE_AMD           = 1000213000
 *     }
 */
@Suppress("Unused")
enum class ColorSpace(val value: Int) {
	
	
	SRGB_NONLINEAR(0);


}



/**
 *     // provided by VK_KHR_surface
 *     enum VkCompositeAlphaFlagBitsKHR {
 *         VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR           = 1
 *         VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR   = 2
 *         VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR  = 4
 *         VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR          = 8
 *     }
 */
@Suppress("unused")
@JvmInline
value class CompositeAlphaFlags(val value: Int) {
	
	
	companion object {
		
		val OPAQUE = CompositeAlphaFlags(1)
		
		val PRE_MULTIPLIED = CompositeAlphaFlags(2)
		
		val POST_MULTIPLIED = CompositeAlphaFlags(4)
		
		val INHERIT = CompositeAlphaFlags(8)
	
	}
	
	
	
	operator fun plus(mask: CompositeAlphaFlags) = CompositeAlphaFlags(value or mask.value)
	
	operator fun contains(mask: CompositeAlphaFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_KHR_surface
 *     struct VkSurfaceCapabilitiesKHR {
 *         uint32_t                       minImageCount
 *         uint32_t                       maxImageCount
 *         VkExtent2D                     currentExtent
 *         VkExtent2D                     minImageExtent
 *         VkExtent2D                     maxImageExtent
 *         uint32_t                       maxImageArrayLayers
 *         VkSurfaceTransformFlagsKHR     supportedTransforms
 *         VkSurfaceTransformFlagBitsKHR  currentTransform
 *         VkCompositeAlphaFlagsKHR       supportedCompositeAlpha
 *         VkImageUsageFlags              supportedUsageFlags
 *     }
 */
@JvmInline
value class SurfaceCapabilities(override val address: Long) : Addressable {
	
	
	var minImageCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var maxImageCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var currentExtent: Extent2D
		get()      = Extent2D(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 8)
	
	var minImageExtent: Extent2D
		get()      = Extent2D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 8)
	
	var maxImageExtent: Extent2D
		get()      = Extent2D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var maxImageArrayLayers: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var supportedTransforms: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var currentTransform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var supportedCompositeAlpha: CompositeAlphaFlags
		get()      = CompositeAlphaFlags(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var supportedUsageFlags: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)


}



/**
 *     // provided by VK_KHR_surface
 *     struct VkSurfaceFormatKHR {
 *         VkFormat         format
 *         VkColorSpaceKHR  colorSpace
 *     }
 */
@JvmInline
value class SurfaceFormat(override val address: Long) : Addressable {
	
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var colorSpace: ColorSpace
		get()      = _ColorSpace(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SurfaceFormat(offset(index))
		
		operator fun set(index: Int, value: SurfaceFormat) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (SurfaceFormat) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SurfaceFormat) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SurfaceFormat) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}