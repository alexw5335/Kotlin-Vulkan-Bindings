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
 *     struct VkDeviceCreateInfo {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkDeviceCreateFlags        flags (reserved, must be zero)
 *         uint32_t                   queueCreateInfoCount
 *         VkDeviceQueueCreateInfo**  pQueueCreateInfos
 *         uint32_t                   enabledLayerCount
 *         char**                     ppEnabledLayerNames
 *         uint32_t                   enabledExtensionCount
 *         char**                     ppEnabledExtensionNames
 *         VkPhysicalDeviceFeatures*  pEnabledFeatures
 *     }
 */
@JvmInline
value class DeviceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: DeviceCreateFlags
		get()      = DeviceCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var queueCreateInfoCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pQueueCreateInfos: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var enabledLayerCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var ppEnabledLayerNames: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var enabledExtensionCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var ppEnabledExtensionNames: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value) }
	
	var pEnabledFeatures: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value) }
	
	
	
	var queueCreateInfos: DeviceQueueCreateInfo.Buffer
		get()      = DeviceQueueCreateInfo.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), queueCreateInfoCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); queueCreateInfoCount = value.capacity }
	
	var enabledLayerNames: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), enabledLayerCount)
		set(value) { ppEnabledLayerNames = value.address; enabledLayerCount = value.capacity }
	
	var enabledExtensionNames: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[8]), enabledExtensionCount)
		set(value) { ppEnabledExtensionNames = value.address; enabledExtensionCount = value.capacity }
	
	var enabledFeatures: PhysicalDeviceFeatures
		get()      = PhysicalDeviceFeatures(Unsafe.getNativePointer(address + LAYOUT.offsets[9]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value.address) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DeviceCreateInfo(0)
		
		fun malloc(allocator: Allocator) = DeviceCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEVICE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = DeviceCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEVICE_CREATE_INFO
		}
	
	}


}