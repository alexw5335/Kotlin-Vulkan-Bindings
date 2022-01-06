// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_2

 *     struct VkSubpassDescription2 {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkSubpassDescriptionFlags  flags
 *         VkPipelineBindPoint        pipelineBindPoint
 *         uint32_t                   viewMask
 *         uint32_t                   inputAttachmentCount
 *         VkAttachmentReference2*    pInputAttachments
 *         uint32_t                   colorAttachmentCount
 *         VkAttachmentReference2*    pColorAttachments
 *         VkAttachmentReference2*    pResolveAttachments
 *         VkAttachmentReference2*    pDepthStencilAttachment
 *         uint32_t                   preserveAttachmentCount
 *         uint32_t*                  pPreserveAttachments
 *     }
 * 
 *     Valid pNext types:
 *         - VkSubpassDescriptionDepthStencilResolve
 *         - VkFragmentShadingRateAttachmentInfoKHR
 */
@JvmInline
value class SubpassDescription2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: SubpassDescriptionFlags
		get()      = SubpassDescriptionFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = _PipelineBindPoint(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var viewMask: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var inputAttachmentCount: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var pInputAttachments: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pColorAttachments: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var pResolveAttachments: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pDepthStencilAttachment: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	var preserveAttachmentCount: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var pPreserveAttachments: Long
		get()      = Unsafe.getLong(address + 80)
		set(value) = Unsafe.setLong(address + 80, value)
	
	
	
	var inputAttachments: AttachmentReference2.Buffer
		get()      = AttachmentReference2.Buffer(Unsafe.getLong(address + 32), inputAttachmentCount)
		set(value) { Unsafe.setLong(address + 32, value.address); inputAttachmentCount = value.capacity }
	
	var colorAttachments: AttachmentReference2.Buffer
		get()      = AttachmentReference2.Buffer(Unsafe.getLong(address + 48), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 48, value.address); colorAttachmentCount = value.capacity }
	
	var resolveAttachments: AttachmentReference2.Buffer
		get()      = AttachmentReference2.Buffer(Unsafe.getLong(address + 56), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 56, value.address); colorAttachmentCount = value.capacity }
	
	var depthStencilAttachment: AttachmentReference2
		get()      = AttachmentReference2(Unsafe.getLong(address + 64))
		set(value) { Unsafe.setLong(address + 64, value.address) }
	
	var preserveAttachments: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 80), preserveAttachmentCount)
		set(value) { Unsafe.setLong(address + 80, value.address); preserveAttachmentCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 88
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubpassDescription2(offset(index))
		
		operator fun set(index: Int, value: SubpassDescription2) = Unsafe.copy(value.address, offset(index), 88)
		
		inline fun forEach(block: (SubpassDescription2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubpassDescription2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubpassDescription2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}