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
 *     struct VkDebugUtilsMessengerCallbackDataEXT {
 *         VkStructureType                            sType
 *         void*                                      pNext (must be null)
 *         VkDebugUtilsMessengerCallbackDataFlagsEXT  flags (reserved, must be zero)
 *         char**                                     pMessageIdName
 *         int32_t                                    messageIdNumber
 *         char**                                     pMessage
 *         uint32_t                                   queueLabelCount
 *         VkDebugUtilsLabelEXT**                     pQueueLabels
 *         uint32_t                                   cmdBufLabelCount
 *         VkDebugUtilsLabelEXT**                     pCmdBufLabels
 *         uint32_t                                   objectCount
 *         VkDebugUtilsObjectNameInfoEXT**            pObjects
 *     }
 */
@JvmInline
value class DebugUtilsMessengerCallbackDataEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: DebugUtilsMessengerCallbackDataFlags
		get()      = DebugUtilsMessengerCallbackDataFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var pMessageIdName: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var messageIdNumber: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pMessage: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	var queueLabelCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var pQueueLabels: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value) }
	
	var cmdBufLabelCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var pCmdBufLabels: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value) }
	
	var objectCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var pObjects: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[11], value) }
	
	
	
	var messageIdName: DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var message: DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getNativePointer(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address) }
	
	var queueLabels: DebugUtilsLabelEXT.Buffer
		get()      = DebugUtilsLabelEXT.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[7]), queueLabelCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value.address); queueLabelCount = value.capacity }
	
	var cmdBufLabels: DebugUtilsLabelEXT.Buffer
		get()      = DebugUtilsLabelEXT.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[9]), cmdBufLabelCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value.address); cmdBufLabelCount = value.capacity }
	
	var objects: DebugUtilsObjectNameInfoEXT.Buffer
		get()      = DebugUtilsObjectNameInfoEXT.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[11]), objectCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[11], value.address); objectCount = value.capacity }
	
	
	
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
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DebugUtilsMessengerCallbackDataEXT(0)
		
		fun malloc(allocator: Allocator) = DebugUtilsMessengerCallbackDataEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEBUG_UTILS_MESSENGER_CALLBACK_DATA
		}
		
		fun calloc(allocator: Allocator) = DebugUtilsMessengerCallbackDataEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEBUG_UTILS_MESSENGER_CALLBACK_DATA
		}
	
	}


}