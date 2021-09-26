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
 *     struct VkAndroidHardwareBufferUsageANDROID {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint64_t         androidHardwareBufferUsage
 *     }
 */
@JvmInline
value class AndroidHardwareBufferUsageANDROID(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var androidHardwareBufferUsage: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val androidHardwareBufferUsage: Long,
	) {
		override fun toString() = "AndroidHardwareBufferUsageANDROID(" + 
			"sType=$sType, " +
			"androidHardwareBufferUsage=$androidHardwareBufferUsage)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		androidHardwareBufferUsage, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = AndroidHardwareBufferUsageANDROID(0)
		
		fun malloc(allocator: Allocator) = AndroidHardwareBufferUsageANDROID(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ANDROID_HARDWARE_BUFFER_USAGE
		}
		
		fun calloc(allocator: Allocator) = AndroidHardwareBufferUsageANDROID(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ANDROID_HARDWARE_BUFFER_USAGE
		}
	
	}


}