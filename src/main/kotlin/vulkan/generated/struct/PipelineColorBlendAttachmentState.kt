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
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var srcColorBlendFactor: BlendFactor
		get()      = BlendFactor(Unsafe.getInt(address + LAYOUT.offsets[1]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value.id) }
	
	var dstColorBlendFactor: BlendFactor
		get()      = BlendFactor(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var colorBlendOp: BlendOp
		get()      = BlendOp(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var srcAlphaBlendFactor: BlendFactor
		get()      = BlendFactor(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var dstAlphaBlendFactor: BlendFactor
		get()      = BlendFactor(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.id) }
	
	var alphaBlendOp: BlendOp
		get()      = BlendOp(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	var colorWriteMask: ColorComponentFlags
		get()      = ColorComponentFlags(Unsafe.getInt(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value.bitfield) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = PipelineColorBlendAttachmentState(offset(index))
		
		operator fun set(index: Int, value: PipelineColorBlendAttachmentState) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (PipelineColorBlendAttachmentState) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineColorBlendAttachmentState) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "PipelineColorBlendAttachmentState[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineColorBlendAttachmentState(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = PipelineColorBlendAttachmentState(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PipelineColorBlendAttachmentState(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}