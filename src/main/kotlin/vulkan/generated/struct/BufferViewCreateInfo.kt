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
 *     struct VkBufferViewCreateInfo {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkBufferViewCreateFlags  flags (reserved, must be zero)
 *         VkBuffer                 buffer
 *         VkFormat                 format
 *         VkDeviceSize             offset
 *         VkDeviceSize             range
 *     }
 */
@JvmInline
value class BufferViewCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: BufferViewCreateFlags
		get()      = BufferViewCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var offset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[5], value) }
	
	var range: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[6], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = BufferViewCreateInfo(0)
		
		fun malloc(allocator: Allocator) = BufferViewCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BUFFER_VIEW_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = BufferViewCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BUFFER_VIEW_CREATE_INFO
		}
	
	}


}