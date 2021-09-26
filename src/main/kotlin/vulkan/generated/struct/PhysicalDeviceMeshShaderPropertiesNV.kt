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
 *     struct VkPhysicalDeviceMeshShaderPropertiesNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxDrawMeshTasksCount
 *         uint32_t         maxTaskWorkGroupInvocations
 *         uint32_t         maxTaskWorkGroupSize[3]
 *         uint32_t         maxTaskTotalMemorySize
 *         uint32_t         maxTaskOutputCount
 *         uint32_t         maxMeshWorkGroupInvocations
 *         uint32_t         maxMeshWorkGroupSize[3]
 *         uint32_t         maxMeshTotalMemorySize
 *         uint32_t         maxMeshOutputVertices
 *         uint32_t         maxMeshOutputPrimitives
 *         uint32_t         maxMeshMultiviewViewCount
 *         uint32_t         meshOutputPerVertexGranularity
 *         uint32_t         meshOutputPerPrimitiveGranularity
 *     }
 */
@JvmInline
value class PhysicalDeviceMeshShaderPropertiesNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var maxDrawMeshTasksCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var maxTaskWorkGroupInvocations: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var maxTaskWorkGroupSize: DirectIntBuffer
		get()      = DirectIntBuffer(address + LAYOUT.offsets[4], 3)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.byteSize) }
	
	var maxTaskTotalMemorySize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var maxTaskOutputCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var maxMeshWorkGroupInvocations: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var maxMeshWorkGroupSize: DirectIntBuffer
		get()      = DirectIntBuffer(address + LAYOUT.offsets[8], 3)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[8], value.byteSize) }
	
	var maxMeshTotalMemorySize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var maxMeshOutputVertices: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var maxMeshOutputPrimitives: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var maxMeshMultiviewViewCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var meshOutputPerVertexGranularity: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var meshOutputPerPrimitiveGranularity: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val maxDrawMeshTasksCount: Int,
		val maxTaskWorkGroupInvocations: Int,
		val maxTaskWorkGroupSize: IntArray,
		val maxTaskTotalMemorySize: Int,
		val maxTaskOutputCount: Int,
		val maxMeshWorkGroupInvocations: Int,
		val maxMeshWorkGroupSize: IntArray,
		val maxMeshTotalMemorySize: Int,
		val maxMeshOutputVertices: Int,
		val maxMeshOutputPrimitives: Int,
		val maxMeshMultiviewViewCount: Int,
		val meshOutputPerVertexGranularity: Int,
		val meshOutputPerPrimitiveGranularity: Int,
	) {
		override fun toString() = "PhysicalDeviceMeshShaderPropertiesNV(" + 
			"sType=$sType, " +
			"maxDrawMeshTasksCount=$maxDrawMeshTasksCount, " +
			"maxTaskWorkGroupInvocations=$maxTaskWorkGroupInvocations, " +
			"maxTaskWorkGroupSize=$maxTaskWorkGroupSize, " +
			"maxTaskTotalMemorySize=$maxTaskTotalMemorySize, " +
			"maxTaskOutputCount=$maxTaskOutputCount, " +
			"maxMeshWorkGroupInvocations=$maxMeshWorkGroupInvocations, " +
			"maxMeshWorkGroupSize=$maxMeshWorkGroupSize, " +
			"maxMeshTotalMemorySize=$maxMeshTotalMemorySize, " +
			"maxMeshOutputVertices=$maxMeshOutputVertices, " +
			"maxMeshOutputPrimitives=$maxMeshOutputPrimitives, " +
			"maxMeshMultiviewViewCount=$maxMeshMultiviewViewCount, " +
			"meshOutputPerVertexGranularity=$meshOutputPerVertexGranularity, " +
			"meshOutputPerPrimitiveGranularity=$meshOutputPerPrimitiveGranularity)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		maxDrawMeshTasksCount, 
		maxTaskWorkGroupInvocations, 
		maxTaskWorkGroupSize.asArray, 
		maxTaskTotalMemorySize, 
		maxTaskOutputCount, 
		maxMeshWorkGroupInvocations, 
		maxMeshWorkGroupSize.asArray, 
		maxMeshTotalMemorySize, 
		maxMeshOutputVertices, 
		maxMeshOutputPrimitives, 
		maxMeshMultiviewViewCount, 
		meshOutputPerVertexGranularity, 
		meshOutputPerPrimitiveGranularity, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			array(4, 3)
			member(4)
			member(4)
			member(4)
			array(4, 3)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceMeshShaderPropertiesNV(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceMeshShaderPropertiesNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceMeshShaderPropertiesNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES
		}
	
	}


}