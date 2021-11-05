// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer

/**
 *     struct VkSubpassDescription {
 *         VkSubpassDescriptionFlags  flags
 *         VkPipelineBindPoint        pipelineBindPoint
 *         uint32_t                   inputAttachmentCount
 *         VkAttachmentReference*     pInputAttachments
 *         uint32_t                   colorAttachmentCount
 *         VkAttachmentReference*     pColorAttachments
 *         VkAttachmentReference*     pResolveAttachments
 *         VkAttachmentReference*     pDepthStencilAttachment
 *         uint32_t                   preserveAttachmentCount
 *         uint32_t*                  pPreserveAttachments
 *     }
 */
@JvmInline
value class SubpassDescription(override val address: Long) : Addressable {
	
	
	var flags: SubpassDescriptionFlags
		get()      = SubpassDescriptionFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = _PipelineBindPoint(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var inputAttachmentCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var pInputAttachments: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pColorAttachments: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pResolveAttachments: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var pDepthStencilAttachment: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var preserveAttachmentCount: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var pPreserveAttachments: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	
	
	var inputAttachments: AttachmentReference.Buffer
		get()      = AttachmentReference.Buffer(Unsafe.getLong(address + 16), inputAttachmentCount)
		set(value) { Unsafe.setLong(address + 16, value.address); inputAttachmentCount = value.capacity }
	
	var colorAttachments: AttachmentReference.Buffer
		get()      = AttachmentReference.Buffer(Unsafe.getLong(address + 32), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 32, value.address); colorAttachmentCount = value.capacity }
	
	var resolveAttachments: AttachmentReference.Buffer
		get()      = AttachmentReference.Buffer(Unsafe.getLong(address + 40), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 40, value.address); colorAttachmentCount = value.capacity }
	
	var depthStencilAttachment: AttachmentReference
		get()      = AttachmentReference(Unsafe.getLong(address + 48))
		set(value) { Unsafe.setLong(address + 48, value.address) }
	
	var preserveAttachments: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 64), preserveAttachmentCount)
		set(value) { Unsafe.setLong(address + 64, value.address); preserveAttachmentCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 72
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubpassDescription(offset(index))
		
		operator fun set(index: Int, value: SubpassDescription) = Unsafe.copy(value.address, offset(index), 72)
		
		inline fun forEach(block: (SubpassDescription) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubpassDescription) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubpassDescription) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}