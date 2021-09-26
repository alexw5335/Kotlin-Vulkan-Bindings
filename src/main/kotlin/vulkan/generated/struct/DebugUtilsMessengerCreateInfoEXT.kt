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
 *     struct VkDebugUtilsMessengerCreateInfoEXT {
 *         VkStructureType                       sType
 *         void*                                 pNext (must be null)
 *         VkDebugUtilsMessengerCreateFlagsEXT   flags (reserved, must be zero)
 *         VkDebugUtilsMessageSeverityFlagsEXT   messageSeverity
 *         VkDebugUtilsMessageTypeFlagsEXT       messageType
 *         PFN_vkDebugUtilsMessengerCallbackEXT  pfnUserCallback
 *         void*                                 pUserData
 *     }
 */
@JvmInline
value class DebugUtilsMessengerCreateInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: DebugUtilsMessengerCreateFlags
		get()      = DebugUtilsMessengerCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var messageSeverity: DebugUtilsMessageSeverityFlags
		get()      = DebugUtilsMessageSeverityFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var messageType: DebugUtilsMessageTypeFlags
		get()      = DebugUtilsMessageTypeFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	var pfnUserCallback: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	var pUserData: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	
	
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DebugUtilsMessengerCreateInfoEXT(0)
		
		fun malloc(allocator: Allocator) = DebugUtilsMessengerCreateInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEBUG_UTILS_MESSENGER_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = DebugUtilsMessengerCreateInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEBUG_UTILS_MESSENGER_CREATE_INFO
		}
	
	}


}