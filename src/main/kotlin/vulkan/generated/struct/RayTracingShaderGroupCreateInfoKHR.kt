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
 *     struct VkRayTracingShaderGroupCreateInfoKHR {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkRayTracingShaderGroupTypeKHR  type
 *         uint32_t                        generalShader
 *         uint32_t                        closestHitShader
 *         uint32_t                        anyHitShader
 *         uint32_t                        intersectionShader
 *         void*                           pShaderGroupCaptureReplayHandle
 *     }
 */
@JvmInline
value class RayTracingShaderGroupCreateInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var type: RayTracingShaderGroupType
		get()      = RayTracingShaderGroupType(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var generalShader: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var closestHitShader: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var anyHitShader: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var intersectionShader: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var pShaderGroupCaptureReplayHandle: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value) }
	
	
	
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = RayTracingShaderGroupCreateInfoKHR(offset(index))
		
		operator fun set(index: Int, value: RayTracingShaderGroupCreateInfoKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (RayTracingShaderGroupCreateInfoKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (RayTracingShaderGroupCreateInfoKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "RayTracingShaderGroupCreateInfoKHR[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = RayTracingShaderGroupCreateInfoKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = RayTracingShaderGroupCreateInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RAY_TRACING_SHADER_GROUP_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = RayTracingShaderGroupCreateInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RAY_TRACING_SHADER_GROUP_CREATE_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.RAY_TRACING_SHADER_GROUP_CREATE_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.RAY_TRACING_SHADER_GROUP_CREATE_INFO }
		}
	
	}


}