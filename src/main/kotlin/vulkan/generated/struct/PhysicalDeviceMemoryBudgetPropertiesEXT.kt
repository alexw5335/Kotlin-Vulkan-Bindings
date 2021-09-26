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
 *     struct VkPhysicalDeviceMemoryBudgetPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceSize     heapBudget[16]
 *         VkDeviceSize     heapUsage[16]
 *     }
 */
@JvmInline
value class PhysicalDeviceMemoryBudgetPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var heapBudget: DirectLongBuffer
		get()      = DirectLongBuffer(address + LAYOUT.offsets[2], 16)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.byteSize) }
	
	var heapUsage: DirectLongBuffer
		get()      = DirectLongBuffer(address + LAYOUT.offsets[3], 16)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val heapBudget: LongArray,
		val heapUsage: LongArray,
	) {
		override fun toString() = "PhysicalDeviceMemoryBudgetPropertiesEXT(" + 
			"sType=$sType, " +
			"heapBudget=$heapBudget, " +
			"heapUsage=$heapUsage)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		heapBudget.asArray, 
		heapUsage.asArray, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			array(8, 16)
			array(8, 16)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceMemoryBudgetPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceMemoryBudgetPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceMemoryBudgetPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES
		}
	
	}


}