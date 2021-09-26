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
 *     struct VkPhysicalDeviceRayTracingPipelinePropertiesKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         shaderGroupHandleSize
 *         uint32_t         maxRayRecursionDepth
 *         uint32_t         maxShaderGroupStride
 *         uint32_t         shaderGroupBaseAlignment
 *         uint32_t         shaderGroupHandleCaptureReplaySize
 *         uint32_t         maxRayDispatchInvocationCount
 *         uint32_t         shaderGroupHandleAlignment
 *         uint32_t         maxRayHitAttributeSize
 *     }
 */
@JvmInline
value class PhysicalDeviceRayTracingPipelinePropertiesKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var shaderGroupHandleSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var maxRayRecursionDepth: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var maxShaderGroupStride: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var shaderGroupBaseAlignment: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var shaderGroupHandleCaptureReplaySize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var maxRayDispatchInvocationCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var shaderGroupHandleAlignment: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var maxRayHitAttributeSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val shaderGroupHandleSize: Int,
		val maxRayRecursionDepth: Int,
		val maxShaderGroupStride: Int,
		val shaderGroupBaseAlignment: Int,
		val shaderGroupHandleCaptureReplaySize: Int,
		val maxRayDispatchInvocationCount: Int,
		val shaderGroupHandleAlignment: Int,
		val maxRayHitAttributeSize: Int,
	) {
		override fun toString() = "PhysicalDeviceRayTracingPipelinePropertiesKHR(" + 
			"sType=$sType, " +
			"shaderGroupHandleSize=$shaderGroupHandleSize, " +
			"maxRayRecursionDepth=$maxRayRecursionDepth, " +
			"maxShaderGroupStride=$maxShaderGroupStride, " +
			"shaderGroupBaseAlignment=$shaderGroupBaseAlignment, " +
			"shaderGroupHandleCaptureReplaySize=$shaderGroupHandleCaptureReplaySize, " +
			"maxRayDispatchInvocationCount=$maxRayDispatchInvocationCount, " +
			"shaderGroupHandleAlignment=$shaderGroupHandleAlignment, " +
			"maxRayHitAttributeSize=$maxRayHitAttributeSize)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		shaderGroupHandleSize, 
		maxRayRecursionDepth, 
		maxShaderGroupStride, 
		shaderGroupBaseAlignment, 
		shaderGroupHandleCaptureReplaySize, 
		maxRayDispatchInvocationCount, 
		shaderGroupHandleAlignment, 
		maxRayHitAttributeSize, 
	)
	
	
	
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
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceRayTracingPipelinePropertiesKHR(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceRayTracingPipelinePropertiesKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceRayTracingPipelinePropertiesKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES
		}
	
	}


}