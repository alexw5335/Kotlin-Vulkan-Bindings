// This file has been automatically generated.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.*
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_display
 *     VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(
 *         VkPhysicalDevice         physicalDevice
 *         uint32_t*                pPropertyCount
 *         VkDisplayPropertiesKHR*  pProperties
 *     );
 */
internal external fun getPhysicalDeviceDisplayProperties(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int



/**
 *     // provided by VK_KHR_display
 *     VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
 *         VkPhysicalDevice              physicalDevice
 *         uint32_t*                     pPropertyCount
 *         VkDisplayPlanePropertiesKHR*  pProperties
 *     );
 */
internal external fun getPhysicalDeviceDisplayPlaneProperties(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int



/**
 *     // provided by VK_KHR_display
 *     VkResult vkGetDisplayPlaneSupportedDisplaysKHR(
 *         VkPhysicalDevice  physicalDevice
 *         uint32_t          planeIndex
 *         uint32_t*         pDisplayCount
 *         VkDisplayKHR*     pDisplays
 *     );
 */
internal external fun getDisplayPlaneSupportedDisplays(address: Long, physicalDevice: Long, planeIndex: Int, pDisplayCount: Long, pDisplays: Long): Int



/**
 *     // provided by VK_KHR_display
 *     VkResult vkGetDisplayModePropertiesKHR(
 *         VkPhysicalDevice             physicalDevice
 *         VkDisplayKHR                 display
 *         uint32_t*                    pPropertyCount
 *         VkDisplayModePropertiesKHR*  pProperties
 *     );
 */
internal external fun getDisplayModeProperties(address: Long, physicalDevice: Long, display: Long, pPropertyCount: Long, pProperties: Long): Int



/**
 *     // provided by VK_KHR_display
 *     VkResult vkCreateDisplayModeKHR(
 *         VkPhysicalDevice             physicalDevice
 *         VkDisplayKHR                 display
 *         VkDisplayModeCreateInfoKHR*  pCreateInfo
 *         VkAllocationCallbacks*       pAllocator
 *         VkDisplayModeKHR*            pMode
 *     );
 */
internal external fun createDisplayMode(address: Long, physicalDevice: Long, display: Long, pCreateInfo: Long, pAllocator: Long, pMode: Long): Int



/**
 *     // provided by VK_KHR_display
 *     VkResult vkGetDisplayPlaneCapabilitiesKHR(
 *         VkPhysicalDevice                physicalDevice
 *         VkDisplayModeKHR                mode
 *         uint32_t                        planeIndex
 *         VkDisplayPlaneCapabilitiesKHR*  pCapabilities
 *     );
 */
internal external fun getDisplayPlaneCapabilities(address: Long, physicalDevice: Long, mode: Long, planeIndex: Int, pCapabilities: Long): Int



/**
 *     // provided by VK_KHR_display
 *     VkResult vkCreateDisplayPlaneSurfaceKHR(
 *         VkInstance                      instance
 *         VkDisplaySurfaceCreateInfoKHR*  pCreateInfo
 *         VkAllocationCallbacks*          pAllocator
 *         VkSurfaceKHR*                   pSurface
 *     );
 */
internal external fun createDisplayPlaneSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int



/**
 * Implementation of VkDisplayKHR.
 */
open class DisplayH(override val address: Long) : Addressable



/**
 * Implementation of VkDisplayModeKHR.
 */
open class DisplayModeH(override val address: Long) : Addressable



/**
 *     // provided by VK_KHR_display
 *     enum VkDisplayPlaneAlphaFlagBitsKHR {
 *         VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR                   = 1
 *         VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR                   = 2
 *         VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR                = 4
 *         VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR  = 8
 *     }
 */
@JvmInline
value class DisplayPlaneAlphaFlags(val value: Int) {
	
	
	companion object {
		
		val OPAQUE = DisplayPlaneAlphaFlags(1)
		
		val GLOBAL = DisplayPlaneAlphaFlags(2)
		
		val PER_PIXEL = DisplayPlaneAlphaFlags(4)
		
		val PER_PIXEL_PREMULTIPLIED = DisplayPlaneAlphaFlags(8)
	
	}
	
	
	
	operator fun plus(mask: DisplayPlaneAlphaFlags) = DisplayPlaneAlphaFlags(value or mask.value)
	
	operator fun contains(mask: DisplayPlaneAlphaFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [DisplayPlaneAlphaFlags].
 */
inline fun DisplayPlaneAlphaFlags(block: DisplayPlaneAlphaFlags.Companion.() -> DisplayPlaneAlphaFlags) = block(DisplayPlaneAlphaFlags)



/**
 *     // provided by VK_KHR_surface
 *     enum VkSurfaceTransformFlagBitsKHR {
 *         VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR                      = 1
 *         VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR                     = 2
 *         VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR                    = 4
 *         VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR                    = 8
 *         VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR             = 16
 *         VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR   = 32
 *         VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR  = 64
 *         VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR  = 128
 *         VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR                       = 256
 *     }
 */
@JvmInline
value class SurfaceTransformFlags(val value: Int) {
	
	
	companion object {
		
		val IDENTITY = SurfaceTransformFlags(1)
		
		val ROTATE_90 = SurfaceTransformFlags(2)
		
		val ROTATE_180 = SurfaceTransformFlags(4)
		
		val ROTATE_270 = SurfaceTransformFlags(8)
		
		val HORIZONTAL_MIRROR = SurfaceTransformFlags(16)
		
		val HORIZONTAL_MIRROR_ROTATE_90 = SurfaceTransformFlags(32)
		
		val HORIZONTAL_MIRROR_ROTATE_180 = SurfaceTransformFlags(64)
		
		val HORIZONTAL_MIRROR_ROTATE_270 = SurfaceTransformFlags(128)
		
		val INHERIT = SurfaceTransformFlags(256)
	
	}
	
	
	
	operator fun plus(mask: SurfaceTransformFlags) = SurfaceTransformFlags(value or mask.value)
	
	operator fun contains(mask: SurfaceTransformFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [SurfaceTransformFlags].
 */
inline fun SurfaceTransformFlags(block: SurfaceTransformFlags.Companion.() -> SurfaceTransformFlags) = block(SurfaceTransformFlags)



/**
 *     // provided by VK_KHR_display
 *     struct VkDisplayModeCreateInfoKHR {
 *         VkStructureType              sType
 *         void*                        pNext (must be null)
 *         VkDisplayModeCreateFlagsKHR  flags (reserved, must be zero)
 *         VkDisplayModeParametersKHR   parameters
 *     }
 */
@JvmInline
value class DisplayModeCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var parameters: DisplayModeParameters
		get()      = DisplayModeParameters(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 12)


}



/**
 * Struct calloc function for [DisplayModeCreateInfo].
 */
inline fun Allocator.DisplayModeCreateInfo(block: (DisplayModeCreateInfo) -> Unit) = DisplayModeCreateInfo(calloc(32)).apply(block).also { it.sType = 1000002000 }



/**
 *     // provided by VK_KHR_display
 *     struct VkDisplayModeParametersKHR {
 *         VkExtent2D  visibleRegion
 *         uint32_t    refreshRate
 *     }
 */
@JvmInline
value class DisplayModeParameters(override val address: Long) : Addressable {
	
	
	var visibleRegion: Extent2D
		get()      = Extent2D(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 8)
	
	var refreshRate: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)


}



/**
 * Struct calloc function for [DisplayModeParameters].
 */
inline fun Allocator.DisplayModeParameters(block: (DisplayModeParameters) -> Unit) = DisplayModeParameters(calloc(12)).apply(block)



/**
 *     // provided by VK_KHR_display
 *     struct VkDisplayModePropertiesKHR {
 *         VkDisplayModeKHR            displayMode
 *         VkDisplayModeParametersKHR  parameters
 *     }
 */
@JvmInline
value class DisplayModeProperties(override val address: Long) : Addressable {
	
	
	var displayMode: DisplayModeH
		get()      = DisplayModeH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var parameters: DisplayModeParameters
		get()      = DisplayModeParameters(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DisplayModeProperties(offset(index))
		
		operator fun set(index: Int, value: DisplayModeProperties) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (DisplayModeProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DisplayModeProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DisplayModeProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [DisplayModeProperties].
 */
inline fun Allocator.DisplayModeProperties(block: (DisplayModeProperties) -> Unit) = DisplayModeProperties(calloc(24)).apply(block)



/**
 * Struct buffer calloc function for [DisplayModeProperties].
 */
inline fun Allocator.DisplayModeProperties(capacity: Int, block: (DisplayModeProperties.Buffer) -> Unit) = DisplayModeProperties.Buffer(calloc(capacity * 24), capacity).apply(block)



/**
 *     // provided by VK_KHR_display
 *     struct VkDisplayPlaneCapabilitiesKHR {
 *         VkDisplayPlaneAlphaFlagsKHR  supportedAlpha
 *         VkOffset2D                   minSrcPosition
 *         VkOffset2D                   maxSrcPosition
 *         VkExtent2D                   minSrcExtent
 *         VkExtent2D                   maxSrcExtent
 *         VkOffset2D                   minDstPosition
 *         VkOffset2D                   maxDstPosition
 *         VkExtent2D                   minDstExtent
 *         VkExtent2D                   maxDstExtent
 *     }
 */
@JvmInline
value class DisplayPlaneCapabilities(override val address: Long) : Addressable {
	
	
	var supportedAlpha: DisplayPlaneAlphaFlags
		get()      = DisplayPlaneAlphaFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var minSrcPosition: Offset2D
		get()      = Offset2D(address + 4)
		set(value) = Unsafe.copy(value.address, address + 4, 8)
	
	var maxSrcPosition: Offset2D
		get()      = Offset2D(address + 12)
		set(value) = Unsafe.copy(value.address, address + 12, 8)
	
	var minSrcExtent: Extent2D
		get()      = Extent2D(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 8)
	
	var maxSrcExtent: Extent2D
		get()      = Extent2D(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 8)
	
	var minDstPosition: Offset2D
		get()      = Offset2D(address + 36)
		set(value) = Unsafe.copy(value.address, address + 36, 8)
	
	var maxDstPosition: Offset2D
		get()      = Offset2D(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 8)
	
	var minDstExtent: Extent2D
		get()      = Extent2D(address + 52)
		set(value) = Unsafe.copy(value.address, address + 52, 8)
	
	var maxDstExtent: Extent2D
		get()      = Extent2D(address + 60)
		set(value) = Unsafe.copy(value.address, address + 60, 8)


}



/**
 * Struct calloc function for [DisplayPlaneCapabilities].
 */
inline fun Allocator.DisplayPlaneCapabilities(block: (DisplayPlaneCapabilities) -> Unit) = DisplayPlaneCapabilities(calloc(68)).apply(block)



/**
 *     // provided by VK_KHR_display
 *     struct VkDisplayPlanePropertiesKHR {
 *         VkDisplayKHR  currentDisplay
 *         uint32_t      currentStackIndex
 *     }
 */
@JvmInline
value class DisplayPlaneProperties(override val address: Long) : Addressable {
	
	
	var currentDisplay: DisplayH
		get()      = DisplayH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var currentStackIndex: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DisplayPlaneProperties(offset(index))
		
		operator fun set(index: Int, value: DisplayPlaneProperties) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (DisplayPlaneProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DisplayPlaneProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DisplayPlaneProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [DisplayPlaneProperties].
 */
inline fun Allocator.DisplayPlaneProperties(block: (DisplayPlaneProperties) -> Unit) = DisplayPlaneProperties(calloc(16)).apply(block)



/**
 * Struct buffer calloc function for [DisplayPlaneProperties].
 */
inline fun Allocator.DisplayPlaneProperties(capacity: Int, block: (DisplayPlaneProperties.Buffer) -> Unit) = DisplayPlaneProperties.Buffer(calloc(capacity * 16), capacity).apply(block)



/**
 *     // provided by VK_KHR_display
 *     struct VkDisplayPropertiesKHR {
 *         VkDisplayKHR                display
 *         char*                       displayName
 *         VkExtent2D                  physicalDimensions
 *         VkExtent2D                  physicalResolution
 *         VkSurfaceTransformFlagsKHR  supportedTransforms
 *         VkBool32                    planeReorderPossible
 *         VkBool32                    persistentContent
 *     }
 */
@JvmInline
value class DisplayProperties(override val address: Long) : Addressable {
	
	
	var display: DisplayH
		get()      = DisplayH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var displayName: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var physicalDimensions: Extent2D
		get()      = Extent2D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 8)
	
	var physicalResolution: Extent2D
		get()      = Extent2D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var supportedTransforms: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var planeReorderPossible: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var persistentContent: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DisplayProperties(offset(index))
		
		operator fun set(index: Int, value: DisplayProperties) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (DisplayProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DisplayProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DisplayProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [DisplayProperties].
 */
inline fun Allocator.DisplayProperties(block: (DisplayProperties) -> Unit) = DisplayProperties(calloc(48)).apply(block)



/**
 * Struct buffer calloc function for [DisplayProperties].
 */
inline fun Allocator.DisplayProperties(capacity: Int, block: (DisplayProperties.Buffer) -> Unit) = DisplayProperties.Buffer(calloc(capacity * 48), capacity).apply(block)



/**
 *     // provided by VK_KHR_display
 *     struct VkDisplaySurfaceCreateInfoKHR {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkDisplaySurfaceCreateFlagsKHR  flags (reserved, must be zero)
 *         VkDisplayModeKHR                displayMode
 *         uint32_t                        planeIndex
 *         uint32_t                        planeStackIndex
 *         VkSurfaceTransformFlagBitsKHR   transform
 *         float                           globalAlpha
 *         VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
 *         VkExtent2D                      imageExtent
 *     }
 */
@JvmInline
value class DisplaySurfaceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var displayMode: DisplayModeH
		get()      = DisplayModeH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var planeIndex: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var planeStackIndex: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var transform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var globalAlpha: Float
		get()      = Unsafe.getFloat(address + 44)
		set(value) = Unsafe.setFloat(address + 44, value)
	
	var alphaMode: DisplayPlaneAlphaFlags
		get()      = DisplayPlaneAlphaFlags(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var imageExtent: Extent2D
		get()      = Extent2D(address + 52)
		set(value) = Unsafe.copy(value.address, address + 52, 8)


}



/**
 * Struct calloc function for [DisplaySurfaceCreateInfo].
 */
inline fun Allocator.DisplaySurfaceCreateInfo(block: (DisplaySurfaceCreateInfo) -> Unit) = DisplaySurfaceCreateInfo(calloc(64)).apply(block).also { it.sType = 1000002001 }