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
 *     struct VkShadingRatePaletteNV {
 *         uint32_t                       shadingRatePaletteEntryCount
 *         VkShadingRatePaletteEntryNV**  pShadingRatePaletteEntries
 *     }
 */
@JvmInline
value class ShadingRatePaletteNV(override val address: Long) : Addressable {
	
	
	var shadingRatePaletteEntryCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var pShadingRatePaletteEntries: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	
	
	var shadingRatePaletteEntries: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[1]), shadingRatePaletteEntryCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value.address); shadingRatePaletteEntryCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = ShadingRatePaletteNV(offset(index))
		
		operator fun set(index: Int, value: ShadingRatePaletteNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ShadingRatePaletteNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ShadingRatePaletteNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ShadingRatePaletteNV[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ShadingRatePaletteNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ShadingRatePaletteNV(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ShadingRatePaletteNV(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}