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
 *     struct VkSubpassDescription {
 *         VkSubpassDescriptionFlags  flags
 *         VkPipelineBindPoint        pipelineBindPoint
 *         uint32_t                   inputAttachmentCount
 *         VkAttachmentReference**    pInputAttachments
 *         uint32_t                   colorAttachmentCount
 *         VkAttachmentReference**    pColorAttachments
 *         VkAttachmentReference**    pResolveAttachments
 *         VkAttachmentReference*     pDepthStencilAttachment
 *         uint32_t                   preserveAttachmentCount
 *         uint32_t**                 pPreserveAttachments
 *     }
 */
@JvmInline
value class SubpassDescription(override val address: Long) : Addressable {
	
	
	var flags: SubpassDescriptionFlags
		get()      = SubpassDescriptionFlags(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.bitfield) }
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = PipelineBindPoint(Unsafe.getInt(address + LAYOUT.offsets[1]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value.id) }
	
	var inputAttachmentCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pInputAttachments: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pColorAttachments: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	var pResolveAttachments: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var pDepthStencilAttachment: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value) }
	
	var preserveAttachmentCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var pPreserveAttachments: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value) }
	
	
	
	var inputAttachments: AttachmentReference.Buffer
		get()      = AttachmentReference.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), inputAttachmentCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); inputAttachmentCount = value.capacity }
	
	var colorAttachments: AttachmentReference.Buffer
		get()      = AttachmentReference.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), colorAttachmentCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); colorAttachmentCount = value.capacity }
	
	var resolveAttachments: AttachmentReference.Buffer
		get()      = AttachmentReference.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), colorAttachmentCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); colorAttachmentCount = value.capacity }
	
	var depthStencilAttachment: AttachmentReference
		get()      = AttachmentReference(Unsafe.getNativePointer(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value.address) }
	
	var preserveAttachments: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[9]), preserveAttachmentCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value.address); preserveAttachmentCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = SubpassDescription(offset(index))
		
		operator fun set(index: Int, value: SubpassDescription) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SubpassDescription) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubpassDescription) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SubpassDescription[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
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
		
		val NULL = SubpassDescription(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SubpassDescription(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SubpassDescription(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}