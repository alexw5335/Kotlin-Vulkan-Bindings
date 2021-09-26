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
 *     struct VkPhysicalDeviceFragmentDensityMap2PropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         subsampledLoads
 *         VkBool32         subsampledCoarseReconstructionEarlyAccess
 *         uint32_t         maxSubsampledArrayLayers
 *         uint32_t         maxDescriptorSetSubsampledSamplers
 *     }
 */
@JvmInline
value class PhysicalDeviceFragmentDensityMap2PropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var subsampledLoads: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var subsampledCoarseReconstructionEarlyAccess: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var maxSubsampledArrayLayers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var maxDescriptorSetSubsampledSamplers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val subsampledLoads: Int,
		val subsampledCoarseReconstructionEarlyAccess: Int,
		val maxSubsampledArrayLayers: Int,
		val maxDescriptorSetSubsampledSamplers: Int,
	) {
		override fun toString() = "PhysicalDeviceFragmentDensityMap2PropertiesEXT(" + 
			"sType=$sType, " +
			"subsampledLoads=$subsampledLoads, " +
			"subsampledCoarseReconstructionEarlyAccess=$subsampledCoarseReconstructionEarlyAccess, " +
			"maxSubsampledArrayLayers=$maxSubsampledArrayLayers, " +
			"maxDescriptorSetSubsampledSamplers=$maxDescriptorSetSubsampledSamplers)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		subsampledLoads, 
		subsampledCoarseReconstructionEarlyAccess, 
		maxSubsampledArrayLayers, 
		maxDescriptorSetSubsampledSamplers, 
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
		
		val NULL = PhysicalDeviceFragmentDensityMap2PropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceFragmentDensityMap2PropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceFragmentDensityMap2PropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES
		}
	
	}


}