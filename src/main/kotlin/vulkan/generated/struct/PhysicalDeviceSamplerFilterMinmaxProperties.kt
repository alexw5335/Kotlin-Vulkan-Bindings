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
 *     struct VkPhysicalDeviceSamplerFilterMinmaxProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         filterMinmaxSingleComponentFormats
 *         VkBool32         filterMinmaxImageComponentMapping
 *     }
 */
@JvmInline
value class PhysicalDeviceSamplerFilterMinmaxProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var filterMinmaxSingleComponentFormats: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var filterMinmaxImageComponentMapping: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val filterMinmaxSingleComponentFormats: Int,
		val filterMinmaxImageComponentMapping: Int,
	) {
		override fun toString() = "PhysicalDeviceSamplerFilterMinmaxProperties(" + 
			"sType=$sType, " +
			"filterMinmaxSingleComponentFormats=$filterMinmaxSingleComponentFormats, " +
			"filterMinmaxImageComponentMapping=$filterMinmaxImageComponentMapping)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		filterMinmaxSingleComponentFormats, 
		filterMinmaxImageComponentMapping, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceSamplerFilterMinmaxProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceSamplerFilterMinmaxProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceSamplerFilterMinmaxProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES
		}
	
	}


}