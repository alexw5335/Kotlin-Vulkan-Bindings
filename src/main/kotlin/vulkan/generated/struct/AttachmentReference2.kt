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
 *     struct VkAttachmentReference2 {
 *         VkStructureType     sType
 *         void*               pNext
 *         uint32_t            attachment
 *         VkImageLayout       layout
 *         VkImageAspectFlags  aspectMask
 *     }
 */
@JvmInline
value class AttachmentReference2(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var attachment: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var layout: ImageLayout
		get()      = ImageLayout(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = AttachmentReference2(offset(index))
		
		operator fun set(index: Int, value: AttachmentReference2) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (AttachmentReference2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AttachmentReference2) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "AttachmentReference2[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = AttachmentReference2(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = AttachmentReference2(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ATTACHMENT_REFERENCE_2
		}
		
		fun calloc(allocator: Allocator) = AttachmentReference2(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ATTACHMENT_REFERENCE_2
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.ATTACHMENT_REFERENCE_2 }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.ATTACHMENT_REFERENCE_2 }
		}
	
	}


}