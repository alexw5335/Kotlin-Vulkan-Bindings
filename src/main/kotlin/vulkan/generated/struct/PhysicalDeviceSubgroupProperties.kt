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
 *     struct VkPhysicalDeviceSubgroupProperties {
 *         VkStructureType         sType
 *         void*                   pNext (must be null)
 *         uint32_t                subgroupSize
 *         VkShaderStageFlags      supportedStages
 *         VkSubgroupFeatureFlags  supportedOperations
 *         VkBool32                quadOperationsInAllStages
 *     }
 */
@JvmInline
value class PhysicalDeviceSubgroupProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var subgroupSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var supportedStages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var supportedOperations: SubgroupFeatureFlags
		get()      = SubgroupFeatureFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	var quadOperationsInAllStages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val subgroupSize: Int,
		val supportedStages: ShaderStageFlags,
		val supportedOperations: SubgroupFeatureFlags,
		val quadOperationsInAllStages: Int,
	) {
		override fun toString() = "PhysicalDeviceSubgroupProperties(" + 
			"sType=$sType, " +
			"subgroupSize=$subgroupSize, " +
			"supportedStages=$supportedStages, " +
			"supportedOperations=$supportedOperations, " +
			"quadOperationsInAllStages=$quadOperationsInAllStages)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		subgroupSize, 
		supportedStages, 
		supportedOperations, 
		quadOperationsInAllStages, 
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceSubgroupProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceSubgroupProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SUBGROUP_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceSubgroupProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SUBGROUP_PROPERTIES
		}
	
	}


}