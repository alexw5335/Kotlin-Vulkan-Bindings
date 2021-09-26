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
 *     struct VkMultisamplePropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkExtent2D       maxSampleLocationGridSize
 *     }
 */
@JvmInline
value class MultisamplePropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var maxSampleLocationGridSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val maxSampleLocationGridSize: Extent2D.Persistent,
	) {
		override fun toString() = "MultisamplePropertiesEXT(" + 
			"sType=$sType, " +
			"maxSampleLocationGridSize=$maxSampleLocationGridSize)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		maxSampleLocationGridSize.asPersistent, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(Extent2D.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = MultisamplePropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = MultisamplePropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.MULTISAMPLE_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = MultisamplePropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.MULTISAMPLE_PROPERTIES
		}
	
	}


}