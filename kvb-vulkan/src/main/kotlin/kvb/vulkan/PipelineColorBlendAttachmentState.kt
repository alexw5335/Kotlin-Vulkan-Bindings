// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkPipelineColorBlendAttachmentState {
 *         VkBool32               blendEnable
 *         VkBlendFactor          srcColorBlendFactor
 *         VkBlendFactor          dstColorBlendFactor
 *         VkBlendOp              colorBlendOp
 *         VkBlendFactor          srcAlphaBlendFactor
 *         VkBlendFactor          dstAlphaBlendFactor
 *         VkBlendOp              alphaBlendOp
 *         VkColorComponentFlags  colorWriteMask
 *     }
 */
@JvmInline
value class PipelineColorBlendAttachmentState(override val address: Long) : Addressable {
	
	
	var blendEnable: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var srcColorBlendFactor: BlendFactor
		get()      = _BlendFactor(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var dstColorBlendFactor: BlendFactor
		get()      = _BlendFactor(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var colorBlendOp: BlendOp
		get()      = _BlendOp(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	var srcAlphaBlendFactor: BlendFactor
		get()      = _BlendFactor(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var dstAlphaBlendFactor: BlendFactor
		get()      = _BlendFactor(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var alphaBlendOp: BlendOp
		get()      = _BlendOp(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var colorWriteMask: ColorComponentFlags
		get()      = ColorComponentFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 32
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PipelineColorBlendAttachmentState(offset(index))
		
		operator fun set(index: Int, value: PipelineColorBlendAttachmentState) = Unsafe.copy(value.address, offset(index), 32)
		
		inline fun forEach(block: (PipelineColorBlendAttachmentState) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineColorBlendAttachmentState) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PipelineColorBlendAttachmentState) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}