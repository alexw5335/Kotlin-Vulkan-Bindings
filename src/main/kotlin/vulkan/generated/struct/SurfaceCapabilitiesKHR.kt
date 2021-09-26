// This file has been automatically generated.

package vulkan.generated.struct

import memory.NativeSizes
import memory.type.DirectBuffer
import memory.struct.LayoutBuilder
import memory.allocation.Allocator
import memory.Unsafe
import memory.type.Addressable

import vulkan.generated.enumeration.*
import memory.primitive.*
import vulkan.generated.handle.*

/**
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
value class SurfaceCapabilitiesKHR(override val address: Long) : Addressable {
	
	
	var minImageCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var maxImageCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var currentExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var minImageExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var maxImageExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[4])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.structSize) }
	
	var maxImageArrayLayers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var supportedTransforms: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.bitfield) }
	
	var currentTransform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value.bitfield) }
	
	var supportedCompositeAlpha: CompositeAlphaFlags
		get()      = CompositeAlphaFlags(Unsafe.getInt(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value.bitfield) }
	
	var supportedUsageFlags: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + LAYOUT.offsets[9]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value.bitfield) }
	
	
	
	class Persistent(
		val minImageCount: Int,
		val maxImageCount: Int,
		val currentExtent: Extent2D.Persistent,
		val minImageExtent: Extent2D.Persistent,
		val maxImageExtent: Extent2D.Persistent,
		val maxImageArrayLayers: Int,
		val supportedTransforms: SurfaceTransformFlags,
		val currentTransform: SurfaceTransformFlags,
		val supportedCompositeAlpha: CompositeAlphaFlags,
		val supportedUsageFlags: ImageUsageFlags,
	) {
		override fun toString() = "SurfaceCapabilitiesKHR(" + 
			"minImageCount=$minImageCount, " +
			"maxImageCount=$maxImageCount, " +
			"currentExtent=$currentExtent, " +
			"minImageExtent=$minImageExtent, " +
			"maxImageExtent=$maxImageExtent, " +
			"maxImageArrayLayers=$maxImageArrayLayers, " +
			"supportedTransforms=$supportedTransforms, " +
			"currentTransform=$currentTransform, " +
			"supportedCompositeAlpha=$supportedCompositeAlpha, " +
			"supportedUsageFlags=$supportedUsageFlags)"
	}
	
	
	
	val asPersistent get() = Persistent(
		minImageCount, 
		maxImageCount, 
		currentExtent.asPersistent, 
		minImageExtent.asPersistent, 
		maxImageExtent.asPersistent, 
		maxImageArrayLayers, 
		supportedTransforms, 
		currentTransform, 
		supportedCompositeAlpha, 
		supportedUsageFlags, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(Extent2D.LAYOUT)
			member(Extent2D.LAYOUT)
			member(Extent2D.LAYOUT)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SurfaceCapabilitiesKHR(0)
		
		fun malloc(allocator: Allocator) = SurfaceCapabilitiesKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SurfaceCapabilitiesKHR(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}