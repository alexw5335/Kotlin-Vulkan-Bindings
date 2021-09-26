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
 *     struct VkCommandBufferBeginInfo {
 *         VkStructureType                  sType
 *         void*                            pNext
 *         VkCommandBufferUsageFlags        flags
 *         VkCommandBufferInheritanceInfo*  pInheritanceInfo
 *     }
 */
@JvmInline
value class CommandBufferBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: CommandBufferUsageFlags
		get()      = CommandBufferUsageFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var pInheritanceInfo: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var inheritanceInfo: CommandBufferInheritanceInfo
		get()      = CommandBufferInheritanceInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CommandBufferBeginInfo(0)
		
		fun malloc(allocator: Allocator) = CommandBufferBeginInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COMMAND_BUFFER_BEGIN_INFO
		}
		
		fun calloc(allocator: Allocator) = CommandBufferBeginInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COMMAND_BUFFER_BEGIN_INFO
		}
	
	}


}