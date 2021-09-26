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
 *     struct VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         advancedBlendMaxColorAttachments
 *         VkBool32         advancedBlendIndependentBlend
 *         VkBool32         advancedBlendNonPremultipliedSrcColor
 *         VkBool32         advancedBlendNonPremultipliedDstColor
 *         VkBool32         advancedBlendCorrelatedOverlap
 *         VkBool32         advancedBlendAllOperations
 *     }
 */
@JvmInline
value class PhysicalDeviceBlendOperationAdvancedPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var advancedBlendMaxColorAttachments: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var advancedBlendIndependentBlend: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var advancedBlendNonPremultipliedSrcColor: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var advancedBlendNonPremultipliedDstColor: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var advancedBlendCorrelatedOverlap: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var advancedBlendAllOperations: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val advancedBlendMaxColorAttachments: Int,
		val advancedBlendIndependentBlend: Int,
		val advancedBlendNonPremultipliedSrcColor: Int,
		val advancedBlendNonPremultipliedDstColor: Int,
		val advancedBlendCorrelatedOverlap: Int,
		val advancedBlendAllOperations: Int,
	) {
		override fun toString() = "PhysicalDeviceBlendOperationAdvancedPropertiesEXT(" + 
			"sType=$sType, " +
			"advancedBlendMaxColorAttachments=$advancedBlendMaxColorAttachments, " +
			"advancedBlendIndependentBlend=$advancedBlendIndependentBlend, " +
			"advancedBlendNonPremultipliedSrcColor=$advancedBlendNonPremultipliedSrcColor, " +
			"advancedBlendNonPremultipliedDstColor=$advancedBlendNonPremultipliedDstColor, " +
			"advancedBlendCorrelatedOverlap=$advancedBlendCorrelatedOverlap, " +
			"advancedBlendAllOperations=$advancedBlendAllOperations)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		advancedBlendMaxColorAttachments, 
		advancedBlendIndependentBlend, 
		advancedBlendNonPremultipliedSrcColor, 
		advancedBlendNonPremultipliedDstColor, 
		advancedBlendCorrelatedOverlap, 
		advancedBlendAllOperations, 
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceBlendOperationAdvancedPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceBlendOperationAdvancedPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceBlendOperationAdvancedPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES
		}
	
	}


}