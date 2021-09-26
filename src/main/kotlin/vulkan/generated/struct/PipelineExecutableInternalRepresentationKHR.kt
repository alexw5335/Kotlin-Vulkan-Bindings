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
 *     struct VkPipelineExecutableInternalRepresentationKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         char             name[256]
 *         char             description[256]
 *         VkBool32         isText
 *         size_t           dataSize
 *         void**           pData
 *     }
 */
@JvmInline
value class PipelineExecutableInternalRepresentationKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var name: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[2], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.byteSize) }
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[3], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	var isText: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var dataSize: Long
		get()      = Unsafe.getNativeSizeT(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativeSizeT(address + LAYOUT.offsets[5], value) }
	
	var pData: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	
	
	var data: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), dataSize.toInt())
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); dataSize = value.capacity.toLong() }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = PipelineExecutableInternalRepresentationKHR(offset(index))
		
		operator fun set(index: Int, value: PipelineExecutableInternalRepresentationKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (PipelineExecutableInternalRepresentationKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineExecutableInternalRepresentationKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "PipelineExecutableInternalRepresentationKHR[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val name: String,
		val description: String,
		val isText: Int,
		val dataSize: Long,
	) {
		override fun toString() = "PipelineExecutableInternalRepresentationKHR(" + 
			"sType=$sType, " +
			"name=$name, " +
			"description=$description, " +
			"isText=$isText, " +
			"dataSize=$dataSize)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		Unsafe.decodeUtf8(name), 
		Unsafe.decodeUtf8(description), 
		isText, 
		dataSize, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			array(1, 256)
			array(1, 256)
			member(4)
			member(NativeSizes.SIZE_T)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineExecutableInternalRepresentationKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = PipelineExecutableInternalRepresentationKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION
		}
		
		fun calloc(allocator: Allocator) = PipelineExecutableInternalRepresentationKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION }
		}
	
	}


}