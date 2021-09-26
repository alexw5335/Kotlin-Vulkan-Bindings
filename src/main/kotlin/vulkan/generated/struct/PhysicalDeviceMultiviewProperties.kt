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
 *     struct VkPhysicalDeviceMultiviewProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxMultiviewViewCount
 *         uint32_t         maxMultiviewInstanceIndex
 *     }
 */
@JvmInline
value class PhysicalDeviceMultiviewProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var maxMultiviewViewCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var maxMultiviewInstanceIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val maxMultiviewViewCount: Int,
		val maxMultiviewInstanceIndex: Int,
	) {
		override fun toString() = "PhysicalDeviceMultiviewProperties(" + 
			"sType=$sType, " +
			"maxMultiviewViewCount=$maxMultiviewViewCount, " +
			"maxMultiviewInstanceIndex=$maxMultiviewInstanceIndex)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		maxMultiviewViewCount, 
		maxMultiviewInstanceIndex, 
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
		
		val NULL = PhysicalDeviceMultiviewProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceMultiviewProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceMultiviewProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES
		}
	
	}


}