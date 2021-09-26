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
 *     struct VkValidationFeaturesEXT {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         uint32_t                         enabledValidationFeatureCount
 *         VkValidationFeatureEnableEXT**   pEnabledValidationFeatures
 *         uint32_t                         disabledValidationFeatureCount
 *         VkValidationFeatureDisableEXT**  pDisabledValidationFeatures
 *     }
 */
@JvmInline
value class ValidationFeaturesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var enabledValidationFeatureCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pEnabledValidationFeatures: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var disabledValidationFeatureCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pDisabledValidationFeatures: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
	var enabledValidationFeatures: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), enabledValidationFeatureCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); enabledValidationFeatureCount = value.capacity }
	
	var disabledValidationFeatures: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), disabledValidationFeatureCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); disabledValidationFeatureCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ValidationFeaturesEXT(0)
		
		fun malloc(allocator: Allocator) = ValidationFeaturesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.VALIDATION_FEATURES
		}
		
		fun calloc(allocator: Allocator) = ValidationFeaturesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.VALIDATION_FEATURES
		}
	
	}


}