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
 *     struct VkCoarseSampleOrderCustomNV {
 *         VkShadingRatePaletteEntryNV  shadingRate
 *         uint32_t                     sampleCount
 *         uint32_t                     sampleLocationCount
 *         VkCoarseSampleLocationNV**   pSampleLocations
 *     }
 */
@JvmInline
value class CoarseSampleOrderCustomNV(override val address: Long) : Addressable {
	
	
	var shadingRate: ShadingRatePaletteEntry
		get()      = ShadingRatePaletteEntry(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var sampleCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var sampleLocationCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pSampleLocations: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var sampleLocations: CoarseSampleLocationNV.Buffer
		get()      = CoarseSampleLocationNV.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), sampleLocationCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); sampleLocationCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = CoarseSampleOrderCustomNV(offset(index))
		
		operator fun set(index: Int, value: CoarseSampleOrderCustomNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (CoarseSampleOrderCustomNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CoarseSampleOrderCustomNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "CoarseSampleOrderCustomNV[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CoarseSampleOrderCustomNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = CoarseSampleOrderCustomNV(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = CoarseSampleOrderCustomNV(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}