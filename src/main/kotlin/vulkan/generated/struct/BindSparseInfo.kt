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
 *     struct VkBindSparseInfo {
 *         VkStructureType                      sType
 *         void*                                pNext
 *         uint32_t                             waitSemaphoreCount
 *         VkSemaphore**                        pWaitSemaphores
 *         uint32_t                             bufferBindCount
 *         VkSparseBufferMemoryBindInfo**       pBufferBinds
 *         uint32_t                             imageOpaqueBindCount
 *         VkSparseImageOpaqueMemoryBindInfo**  pImageOpaqueBinds
 *         uint32_t                             imageBindCount
 *         VkSparseImageMemoryBindInfo**        pImageBinds
 *         uint32_t                             signalSemaphoreCount
 *         VkSemaphore**                        pSignalSemaphores
 *     }
 */
@JvmInline
value class BindSparseInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var waitSemaphoreCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pWaitSemaphores: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var bufferBindCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pBufferBinds: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	var imageOpaqueBindCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var pImageOpaqueBinds: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value) }
	
	var imageBindCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var pImageBinds: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value) }
	
	var signalSemaphoreCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var pSignalSemaphores: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[11], value) }
	
	
	
	var waitSemaphores: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), waitSemaphoreCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); waitSemaphoreCount = value.capacity }
	
	var bufferBinds: SparseBufferMemoryBindInfo.Buffer
		get()      = SparseBufferMemoryBindInfo.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), bufferBindCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); bufferBindCount = value.capacity }
	
	var imageOpaqueBinds: SparseImageOpaqueMemoryBindInfo.Buffer
		get()      = SparseImageOpaqueMemoryBindInfo.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[7]), imageOpaqueBindCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value.address); imageOpaqueBindCount = value.capacity }
	
	var imageBinds: SparseImageMemoryBindInfo.Buffer
		get()      = SparseImageMemoryBindInfo.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[9]), imageBindCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value.address); imageBindCount = value.capacity }
	
	var signalSemaphores: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[11]), signalSemaphoreCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[11], value.address); signalSemaphoreCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = BindSparseInfo(offset(index))
		
		operator fun set(index: Int, value: BindSparseInfo) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (BindSparseInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BindSparseInfo) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "BindSparseInfo[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = BindSparseInfo(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = BindSparseInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BIND_SPARSE_INFO
		}
		
		fun calloc(allocator: Allocator) = BindSparseInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BIND_SPARSE_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.BIND_SPARSE_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.BIND_SPARSE_INFO }
		}
	
	}


}