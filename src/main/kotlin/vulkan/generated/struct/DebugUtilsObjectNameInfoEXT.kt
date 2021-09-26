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
 *     struct VkDebugUtilsObjectNameInfoEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkObjectType     objectType
 *         uint64_t         objectHandle
 *         char**           pObjectName
 *     }
 */
@JvmInline
value class DebugUtilsObjectNameInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var objectType: ObjectType
		get()      = ObjectType(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var objectHandle: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var pObjectName: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	
	
	var objectName: DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getNativePointer(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = DebugUtilsObjectNameInfoEXT(offset(index))
		
		operator fun set(index: Int, value: DebugUtilsObjectNameInfoEXT) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (DebugUtilsObjectNameInfoEXT) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DebugUtilsObjectNameInfoEXT) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "DebugUtilsObjectNameInfoEXT[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(8)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DebugUtilsObjectNameInfoEXT(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = DebugUtilsObjectNameInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEBUG_UTILS_OBJECT_NAME_INFO
		}
		
		fun calloc(allocator: Allocator) = DebugUtilsObjectNameInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEBUG_UTILS_OBJECT_NAME_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.DEBUG_UTILS_OBJECT_NAME_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.DEBUG_UTILS_OBJECT_NAME_INFO }
		}
	
	}


}