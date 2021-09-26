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
 *     struct VkPipelineExecutablePropertiesKHR {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkShaderStageFlags  stages
 *         char                name[256]
 *         char                description[256]
 *         uint32_t            subgroupSize
 *     }
 */
@JvmInline
value class PipelineExecutablePropertiesKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var stages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var name: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[3], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[4], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.byteSize) }
	
	var subgroupSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = PipelineExecutablePropertiesKHR(offset(index))
		
		operator fun set(index: Int, value: PipelineExecutablePropertiesKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (PipelineExecutablePropertiesKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineExecutablePropertiesKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "PipelineExecutablePropertiesKHR[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val stages: ShaderStageFlags,
		val name: String,
		val description: String,
		val subgroupSize: Int,
	) {
		override fun toString() = "PipelineExecutablePropertiesKHR(" + 
			"sType=$sType, " +
			"stages=$stages, " +
			"name=$name, " +
			"description=$description, " +
			"subgroupSize=$subgroupSize)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		stages, 
		Unsafe.decodeUtf8(name), 
		Unsafe.decodeUtf8(description), 
		subgroupSize, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			array(1, 256)
			array(1, 256)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineExecutablePropertiesKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = PipelineExecutablePropertiesKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_EXECUTABLE_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PipelineExecutablePropertiesKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_EXECUTABLE_PROPERTIES
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PIPELINE_EXECUTABLE_PROPERTIES }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PIPELINE_EXECUTABLE_PROPERTIES }
		}
	
	}


}