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
 *     struct VkPhysicalDeviceVulkan11Properties {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         uint8_t                  deviceUUID[16]
 *         uint8_t                  driverUUID[16]
 *         uint8_t                  deviceLUID[8]
 *         uint32_t                 deviceNodeMask
 *         VkBool32                 deviceLUIDValid
 *         uint32_t                 subgroupSize
 *         VkShaderStageFlags       subgroupSupportedStages
 *         VkSubgroupFeatureFlags   subgroupSupportedOperations
 *         VkBool32                 subgroupQuadOperationsInAllStages
 *         VkPointClippingBehavior  pointClippingBehavior
 *         uint32_t                 maxMultiviewViewCount
 *         uint32_t                 maxMultiviewInstanceIndex
 *         VkBool32                 protectedNoFault
 *         uint32_t                 maxPerSetDescriptors
 *         VkDeviceSize             maxMemoryAllocationSize
 *     }
 */
@JvmInline
value class PhysicalDeviceVulkan11Properties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var deviceUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[2], 16)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.byteSize) }
	
	var driverUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[3], 16)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	var deviceLUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[4], 8)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.byteSize) }
	
	var deviceNodeMask: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var deviceLUIDValid: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var subgroupSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var subgroupSupportedStages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value.bitfield) }
	
	var subgroupSupportedOperations: SubgroupFeatureFlags
		get()      = SubgroupFeatureFlags(Unsafe.getInt(address + LAYOUT.offsets[9]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value.bitfield) }
	
	var subgroupQuadOperationsInAllStages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var pointClippingBehavior: PointClippingBehavior
		get()      = PointClippingBehavior(Unsafe.getInt(address + LAYOUT.offsets[11]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value.id) }
	
	var maxMultiviewViewCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var maxMultiviewInstanceIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var protectedNoFault: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	var maxPerSetDescriptors: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value) }
	
	var maxMemoryAllocationSize: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[16], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val deviceUUID: ByteArray,
		val driverUUID: ByteArray,
		val deviceLUID: ByteArray,
		val deviceNodeMask: Int,
		val deviceLUIDValid: Int,
		val subgroupSize: Int,
		val subgroupSupportedStages: ShaderStageFlags,
		val subgroupSupportedOperations: SubgroupFeatureFlags,
		val subgroupQuadOperationsInAllStages: Int,
		val pointClippingBehavior: PointClippingBehavior,
		val maxMultiviewViewCount: Int,
		val maxMultiviewInstanceIndex: Int,
		val protectedNoFault: Int,
		val maxPerSetDescriptors: Int,
		val maxMemoryAllocationSize: Long,
	) {
		override fun toString() = "PhysicalDeviceVulkan11Properties(" + 
			"sType=$sType, " +
			"deviceUUID=$deviceUUID, " +
			"driverUUID=$driverUUID, " +
			"deviceLUID=$deviceLUID, " +
			"deviceNodeMask=$deviceNodeMask, " +
			"deviceLUIDValid=$deviceLUIDValid, " +
			"subgroupSize=$subgroupSize, " +
			"subgroupSupportedStages=$subgroupSupportedStages, " +
			"subgroupSupportedOperations=$subgroupSupportedOperations, " +
			"subgroupQuadOperationsInAllStages=$subgroupQuadOperationsInAllStages, " +
			"pointClippingBehavior=$pointClippingBehavior, " +
			"maxMultiviewViewCount=$maxMultiviewViewCount, " +
			"maxMultiviewInstanceIndex=$maxMultiviewInstanceIndex, " +
			"protectedNoFault=$protectedNoFault, " +
			"maxPerSetDescriptors=$maxPerSetDescriptors, " +
			"maxMemoryAllocationSize=$maxMemoryAllocationSize)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		deviceUUID.asArray, 
		driverUUID.asArray, 
		deviceLUID.asArray, 
		deviceNodeMask, 
		deviceLUIDValid, 
		subgroupSize, 
		subgroupSupportedStages, 
		subgroupSupportedOperations, 
		subgroupQuadOperationsInAllStages, 
		pointClippingBehavior, 
		maxMultiviewViewCount, 
		maxMultiviewInstanceIndex, 
		protectedNoFault, 
		maxPerSetDescriptors, 
		maxMemoryAllocationSize, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			array(1, 16)
			array(1, 16)
			array(1, 8)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceVulkan11Properties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceVulkan11Properties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceVulkan11Properties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES
		}
	
	}


}