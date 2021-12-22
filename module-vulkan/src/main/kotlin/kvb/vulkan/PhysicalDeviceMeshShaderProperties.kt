// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

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
value class PhysicalDeviceMeshShaderProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxDrawMeshTasksCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxTaskWorkGroupInvocations: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxTaskWorkGroupSize: DirectIntBuffer
		get()      = DirectIntBuffer(address + 24, 3)
		set(value) = Unsafe.copy(value.address, address + 24, value.byteSize)
	
	var maxTaskTotalMemorySize: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var maxTaskOutputCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var maxMeshWorkGroupInvocations: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var maxMeshWorkGroupSize: DirectIntBuffer
		get()      = DirectIntBuffer(address + 48, 3)
		set(value) = Unsafe.copy(value.address, address + 48, value.byteSize)
	
	var maxMeshTotalMemorySize: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var maxMeshOutputVertices: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var maxMeshOutputPrimitives: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var maxMeshMultiviewViewCount: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var meshOutputPerVertexGranularity: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var meshOutputPerPrimitiveGranularity: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)


}