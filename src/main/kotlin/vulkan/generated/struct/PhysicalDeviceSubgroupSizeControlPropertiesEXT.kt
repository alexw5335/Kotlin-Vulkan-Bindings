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
 *     struct VkPhysicalDeviceSubgroupSizeControlPropertiesEXT {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         uint32_t            minSubgroupSize
 *         uint32_t            maxSubgroupSize
 *         uint32_t            maxComputeWorkgroupSubgroups
 *         VkShaderStageFlags  requiredSubgroupSizeStages
 *     }
 */
@JvmInline
value class PhysicalDeviceSubgroupSizeControlPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var minSubgroupSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var maxSubgroupSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var maxComputeWorkgroupSubgroups: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var requiredSubgroupSizeStages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.bitfield) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val minSubgroupSize: Int,
		val maxSubgroupSize: Int,
		val maxComputeWorkgroupSubgroups: Int,
		val requiredSubgroupSizeStages: ShaderStageFlags,
	) {
		override fun toString() = "PhysicalDeviceSubgroupSizeControlPropertiesEXT(" + 
			"sType=$sType, " +
			"minSubgroupSize=$minSubgroupSize, " +
			"maxSubgroupSize=$maxSubgroupSize, " +
			"maxComputeWorkgroupSubgroups=$maxComputeWorkgroupSubgroups, " +
			"requiredSubgroupSizeStages=$requiredSubgroupSizeStages)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		minSubgroupSize, 
		maxSubgroupSize, 
		maxComputeWorkgroupSubgroups, 
		requiredSubgroupSizeStages, 
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
		
		val NULL = PhysicalDeviceSubgroupSizeControlPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceSubgroupSizeControlPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceSubgroupSizeControlPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES
		}
	
	}


}