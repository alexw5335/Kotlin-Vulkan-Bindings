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
 *     struct VkMutableDescriptorTypeListVALVE {
 *         uint32_t            descriptorTypeCount
 *         VkDescriptorType**  pDescriptorTypes
 *     }
 */
@JvmInline
value class MutableDescriptorTypeListVALVE(override val address: Long) : Addressable {
	
	
	var descriptorTypeCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var pDescriptorTypes: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	
	
	var descriptorTypes: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[1]), descriptorTypeCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value.address); descriptorTypeCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = MutableDescriptorTypeListVALVE(offset(index))
		
		operator fun set(index: Int, value: MutableDescriptorTypeListVALVE) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (MutableDescriptorTypeListVALVE) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MutableDescriptorTypeListVALVE) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "MutableDescriptorTypeListVALVE[$capacity]"
	
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
		
		val NULL = MutableDescriptorTypeListVALVE(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = MutableDescriptorTypeListVALVE(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = MutableDescriptorTypeListVALVE(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}