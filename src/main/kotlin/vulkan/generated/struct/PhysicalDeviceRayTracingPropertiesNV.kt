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
 *     struct VkPhysicalDeviceRayTracingPropertiesNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         shaderGroupHandleSize
 *         uint32_t         maxRecursionDepth
 *         uint32_t         maxShaderGroupStride
 *         uint32_t         shaderGroupBaseAlignment
 *         uint64_t         maxGeometryCount
 *         uint64_t         maxInstanceCount
 *         uint64_t         maxTriangleCount
 *         uint32_t         maxDescriptorSetAccelerationStructures
 *     }
 */
@JvmInline
value class PhysicalDeviceRayTracingPropertiesNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var shaderGroupHandleSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var maxRecursionDepth: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var maxShaderGroupStride: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var shaderGroupBaseAlignment: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var maxGeometryCount: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[6], value) }
	
	var maxInstanceCount: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[7], value) }
	
	var maxTriangleCount: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[8], value) }
	
	var maxDescriptorSetAccelerationStructures: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val shaderGroupHandleSize: Int,
		val maxRecursionDepth: Int,
		val maxShaderGroupStride: Int,
		val shaderGroupBaseAlignment: Int,
		val maxGeometryCount: Long,
		val maxInstanceCount: Long,
		val maxTriangleCount: Long,
		val maxDescriptorSetAccelerationStructures: Int,
	) {
		override fun toString() = "PhysicalDeviceRayTracingPropertiesNV(" + 
			"sType=$sType, " +
			"shaderGroupHandleSize=$shaderGroupHandleSize, " +
			"maxRecursionDepth=$maxRecursionDepth, " +
			"maxShaderGroupStride=$maxShaderGroupStride, " +
			"shaderGroupBaseAlignment=$shaderGroupBaseAlignment, " +
			"maxGeometryCount=$maxGeometryCount, " +
			"maxInstanceCount=$maxInstanceCount, " +
			"maxTriangleCount=$maxTriangleCount, " +
			"maxDescriptorSetAccelerationStructures=$maxDescriptorSetAccelerationStructures)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		shaderGroupHandleSize, 
		maxRecursionDepth, 
		maxShaderGroupStride, 
		shaderGroupBaseAlignment, 
		maxGeometryCount, 
		maxInstanceCount, 
		maxTriangleCount, 
		maxDescriptorSetAccelerationStructures, 
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
			member(8)
			member(8)
			member(8)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceRayTracingPropertiesNV(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceRayTracingPropertiesNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceRayTracingPropertiesNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES
		}
	
	}


}