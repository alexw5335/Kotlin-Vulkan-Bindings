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
 *     struct VkSubpassDescription2 {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkSubpassDescriptionFlags  flags
 *         VkPipelineBindPoint        pipelineBindPoint
 *         uint32_t                   viewMask
 *         uint32_t                   inputAttachmentCount
 *         VkAttachmentReference2**   pInputAttachments
 *         uint32_t                   colorAttachmentCount
 *         VkAttachmentReference2**   pColorAttachments
 *         VkAttachmentReference2**   pResolveAttachments
 *         VkAttachmentReference2*    pDepthStencilAttachment
 *         uint32_t                   preserveAttachmentCount
 *         uint32_t**                 pPreserveAttachments
 *     }
 */
@JvmInline
value class SubpassDescription2(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: SubpassDescriptionFlags
		get()      = SubpassDescriptionFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = PipelineBindPoint(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var viewMask: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var inputAttachmentCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pInputAttachments: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var pColorAttachments: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value) }
	
	var pResolveAttachments: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value) }
	
	var pDepthStencilAttachment: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[10], value) }
	
	var preserveAttachmentCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var pPreserveAttachments: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[12], value) }
	
	
	
	var inputAttachments: AttachmentReference2.Buffer
		get()      = AttachmentReference2.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), inputAttachmentCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); inputAttachmentCount = value.capacity }
	
	var colorAttachments: AttachmentReference2.Buffer
		get()      = AttachmentReference2.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[8]), colorAttachmentCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address); colorAttachmentCount = value.capacity }
	
	var resolveAttachments: AttachmentReference2.Buffer
		get()      = AttachmentReference2.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[9]), colorAttachmentCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value.address); colorAttachmentCount = value.capacity }
	
	var depthStencilAttachment: AttachmentReference2
		get()      = AttachmentReference2(Unsafe.getNativePointer(address + LAYOUT.offsets[10]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[10], value.address) }
	
	var preserveAttachments: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[12]), preserveAttachmentCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[12], value.address); preserveAttachmentCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = SubpassDescription2(offset(index))
		
		operator fun set(index: Int, value: SubpassDescription2) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SubpassDescription2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubpassDescription2) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SubpassDescription2[$capacity]"
	
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
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SubpassDescription2(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SubpassDescription2(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SUBPASS_DESCRIPTION_2
		}
		
		fun calloc(allocator: Allocator) = SubpassDescription2(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SUBPASS_DESCRIPTION_2
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SUBPASS_DESCRIPTION_2 }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SUBPASS_DESCRIPTION_2 }
		}
	
	}


}