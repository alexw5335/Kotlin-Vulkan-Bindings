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
 *     struct VkPhysicalDeviceLineRasterizationPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         lineSubPixelPrecisionBits
 *     }
 */
@JvmInline
value class PhysicalDeviceLineRasterizationPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var lineSubPixelPrecisionBits: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val lineSubPixelPrecisionBits: Int,
	) {
		override fun toString() = "PhysicalDeviceLineRasterizationPropertiesEXT(" + 
			"sType=$sType, " +
			"lineSubPixelPrecisionBits=$lineSubPixelPrecisionBits)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		lineSubPixelPrecisionBits, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceLineRasterizationPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceLineRasterizationPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceLineRasterizationPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES
		}
	
	}


}