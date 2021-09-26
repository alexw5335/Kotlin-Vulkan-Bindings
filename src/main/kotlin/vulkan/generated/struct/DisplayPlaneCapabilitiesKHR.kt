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
value class DisplayPlaneCapabilitiesKHR(override val address: Long) : Addressable {
	
	
	var supportedAlpha: DisplayPlaneAlphaFlags
		get()      = DisplayPlaneAlphaFlags(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.bitfield) }
	
	var minSrcPosition: Offset2D
		get()      = Offset2D(address + LAYOUT.offsets[1])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.structSize) }
	
	var maxSrcPosition: Offset2D
		get()      = Offset2D(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var minSrcExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var maxSrcExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[4])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.structSize) }
	
	var minDstPosition: Offset2D
		get()      = Offset2D(address + LAYOUT.offsets[5])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.structSize) }
	
	var maxDstPosition: Offset2D
		get()      = Offset2D(address + LAYOUT.offsets[6])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[6], value.structSize) }
	
	var minDstExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[7])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[7], value.structSize) }
	
	var maxDstExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[8])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[8], value.structSize) }
	
	
	
	class Persistent(
		val supportedAlpha: DisplayPlaneAlphaFlags,
		val minSrcPosition: Offset2D.Persistent,
		val maxSrcPosition: Offset2D.Persistent,
		val minSrcExtent: Extent2D.Persistent,
		val maxSrcExtent: Extent2D.Persistent,
		val minDstPosition: Offset2D.Persistent,
		val maxDstPosition: Offset2D.Persistent,
		val minDstExtent: Extent2D.Persistent,
		val maxDstExtent: Extent2D.Persistent,
	) {
		override fun toString() = "DisplayPlaneCapabilitiesKHR(" + 
			"supportedAlpha=$supportedAlpha, " +
			"minSrcPosition=$minSrcPosition, " +
			"maxSrcPosition=$maxSrcPosition, " +
			"minSrcExtent=$minSrcExtent, " +
			"maxSrcExtent=$maxSrcExtent, " +
			"minDstPosition=$minDstPosition, " +
			"maxDstPosition=$maxDstPosition, " +
			"minDstExtent=$minDstExtent, " +
			"maxDstExtent=$maxDstExtent)"
	}
	
	
	
	val asPersistent get() = Persistent(
		supportedAlpha, 
		minSrcPosition.asPersistent, 
		maxSrcPosition.asPersistent, 
		minSrcExtent.asPersistent, 
		maxSrcExtent.asPersistent, 
		minDstPosition.asPersistent, 
		maxDstPosition.asPersistent, 
		minDstExtent.asPersistent, 
		maxDstExtent.asPersistent, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(Offset2D.LAYOUT)
			member(Offset2D.LAYOUT)
			member(Extent2D.LAYOUT)
			member(Extent2D.LAYOUT)
			member(Offset2D.LAYOUT)
			member(Offset2D.LAYOUT)
			member(Extent2D.LAYOUT)
			member(Extent2D.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DisplayPlaneCapabilitiesKHR(0)
		
		fun malloc(allocator: Allocator) = DisplayPlaneCapabilitiesKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = DisplayPlaneCapabilitiesKHR(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}