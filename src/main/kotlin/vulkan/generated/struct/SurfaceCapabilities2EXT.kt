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
 *     struct VkSurfaceCapabilities2EXT {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
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
 *         VkSurfaceCounterFlagsEXT       supportedSurfaceCounters
 *     }
 */
@JvmInline
value class SurfaceCapabilities2EXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var minImageCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var maxImageCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var currentExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[4])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.structSize) }
	
	var minImageExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[5])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.structSize) }
	
	var maxImageExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[6])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[6], value.structSize) }
	
	var maxImageArrayLayers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var supportedTransforms: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value.bitfield) }
	
	var currentTransform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + LAYOUT.offsets[9]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value.bitfield) }
	
	var supportedCompositeAlpha: CompositeAlphaFlags
		get()      = CompositeAlphaFlags(Unsafe.getInt(address + LAYOUT.offsets[10]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value.bitfield) }
	
	var supportedUsageFlags: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + LAYOUT.offsets[11]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value.bitfield) }
	
	var supportedSurfaceCounters: SurfaceCounterFlags
		get()      = SurfaceCounterFlags(Unsafe.getInt(address + LAYOUT.offsets[12]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value.bitfield) }
	
	
	
	class Persistent(
		val sType: StructureType,
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
		val supportedSurfaceCounters: SurfaceCounterFlags,
	) {
		override fun toString() = "SurfaceCapabilities2EXT(" + 
			"sType=$sType, " +
			"minImageCount=$minImageCount, " +
			"maxImageCount=$maxImageCount, " +
			"currentExtent=$currentExtent, " +
			"minImageExtent=$minImageExtent, " +
			"maxImageExtent=$maxImageExtent, " +
			"maxImageArrayLayers=$maxImageArrayLayers, " +
			"supportedTransforms=$supportedTransforms, " +
			"currentTransform=$currentTransform, " +
			"supportedCompositeAlpha=$supportedCompositeAlpha, " +
			"supportedUsageFlags=$supportedUsageFlags, " +
			"supportedSurfaceCounters=$supportedSurfaceCounters)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
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
		supportedSurfaceCounters, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
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
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SurfaceCapabilities2EXT(0)
		
		fun malloc(allocator: Allocator) = SurfaceCapabilities2EXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SURFACE_CAPABILITIES_2
		}
		
		fun calloc(allocator: Allocator) = SurfaceCapabilities2EXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SURFACE_CAPABILITIES_2
		}
	
	}


}