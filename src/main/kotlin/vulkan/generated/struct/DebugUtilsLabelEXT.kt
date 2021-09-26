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
 *     struct VkDebugUtilsLabelEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         char**           pLabelName
 *         float            color[4]
 *     }
 */
@JvmInline
value class DebugUtilsLabelEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var pLabelName: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value) }
	
	var color: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + LAYOUT.offsets[3], 4)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	
	
	var labelName: DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = DebugUtilsLabelEXT(offset(index))
		
		operator fun set(index: Int, value: DebugUtilsLabelEXT) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (DebugUtilsLabelEXT) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DebugUtilsLabelEXT) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "DebugUtilsLabelEXT[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			array(4, 4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DebugUtilsLabelEXT(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = DebugUtilsLabelEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEBUG_UTILS_LABEL
		}
		
		fun calloc(allocator: Allocator) = DebugUtilsLabelEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEBUG_UTILS_LABEL
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.DEBUG_UTILS_LABEL }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.DEBUG_UTILS_LABEL }
		}
	
	}


}