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
 *     struct VkDeviceGroupPresentCapabilitiesKHR {
 *         VkStructureType                   sType
 *         void*                             pNext (must be null)
 *         uint32_t                          presentMask[32]
 *         VkDeviceGroupPresentModeFlagsKHR  modes
 *     }
 */
@JvmInline
value class DeviceGroupPresentCapabilitiesKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var presentMask: DirectIntBuffer
		get()      = DirectIntBuffer(address + LAYOUT.offsets[2], 32)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.byteSize) }
	
	var modes: DeviceGroupPresentModeFlags
		get()      = DeviceGroupPresentModeFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val presentMask: IntArray,
		val modes: DeviceGroupPresentModeFlags,
	) {
		override fun toString() = "DeviceGroupPresentCapabilitiesKHR(" + 
			"sType=$sType, " +
			"presentMask=$presentMask, " +
			"modes=$modes)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		presentMask.asArray, 
		modes, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			array(4, 32)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DeviceGroupPresentCapabilitiesKHR(0)
		
		fun malloc(allocator: Allocator) = DeviceGroupPresentCapabilitiesKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEVICE_GROUP_PRESENT_CAPABILITIES
		}
		
		fun calloc(allocator: Allocator) = DeviceGroupPresentCapabilitiesKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEVICE_GROUP_PRESENT_CAPABILITIES
		}
	
	}


}