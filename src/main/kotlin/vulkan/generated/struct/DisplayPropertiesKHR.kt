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
 *     struct VkDisplayPropertiesKHR {
 *         VkDisplayKHR                display
 *         char**                      displayName
 *         VkExtent2D                  physicalDimensions
 *         VkExtent2D                  physicalResolution
 *         VkSurfaceTransformFlagsKHR  supportedTransforms
 *         VkBool32                    planeReorderPossible
 *         VkBool32                    persistentContent
 *     }
 */
@JvmInline
value class DisplayPropertiesKHR(override val address: Long) : Addressable {
	
	
	var display: DisplayH
		get()      = DisplayH(Unsafe.getNativePointer(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[0], value.address) }
	
	var displayName: DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getNativePointer(address + LAYOUT.offsets[1]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value.address) }
	
	var physicalDimensions: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var physicalResolution: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var supportedTransforms: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	var planeReorderPossible: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var persistentContent: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = DisplayPropertiesKHR(offset(index))
		
		operator fun set(index: Int, value: DisplayPropertiesKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (DisplayPropertiesKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DisplayPropertiesKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "DisplayPropertiesKHR[$capacity]"
	
	}
	
	
	
	class Persistent(
		val display: DisplayH,
		val displayName: String,
		val physicalDimensions: Extent2D.Persistent,
		val physicalResolution: Extent2D.Persistent,
		val supportedTransforms: SurfaceTransformFlags,
		val planeReorderPossible: Int,
		val persistentContent: Int,
	) {
		override fun toString() = "DisplayPropertiesKHR(" + 
			"display=$display, " +
			"displayName=$displayName, " +
			"physicalDimensions=$physicalDimensions, " +
			"physicalResolution=$physicalResolution, " +
			"supportedTransforms=$supportedTransforms, " +
			"planeReorderPossible=$planeReorderPossible, " +
			"persistentContent=$persistentContent)"
	}
	
	
	
	val asPersistent get() = Persistent(
		display, 
		Unsafe.decodeUtf8NT(Unsafe.getNativePointer(address + LAYOUT.offsets[1])), 
		physicalDimensions.asPersistent, 
		physicalResolution.asPersistent, 
		supportedTransforms, 
		planeReorderPossible, 
		persistentContent, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(Extent2D.LAYOUT)
			member(Extent2D.LAYOUT)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DisplayPropertiesKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = DisplayPropertiesKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = DisplayPropertiesKHR(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}