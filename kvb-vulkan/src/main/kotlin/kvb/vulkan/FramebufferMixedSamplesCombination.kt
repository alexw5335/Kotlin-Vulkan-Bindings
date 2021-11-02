// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkFramebufferMixedSamplesCombinationNV {
 *         VkStructureType            sType
 *         void*                      pNext (must be null)
 *         VkCoverageReductionModeNV  coverageReductionMode
 *         VkSampleCountFlagBits      rasterizationSamples
 *         VkSampleCountFlags         depthStencilSamples
 *         VkSampleCountFlags         colorSamples
 *     }
 */
@JvmInline
value class FramebufferMixedSamplesCombination(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var coverageReductionMode: CoverageReductionMode
		get()      = CoverageReductionMode.values().first { it.value == Unsafe.getInt(address + 16) }
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var rasterizationSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var depthStencilSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var colorSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 32
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = FramebufferMixedSamplesCombination(offset(index))
		
		operator fun set(index: Int, value: FramebufferMixedSamplesCombination) = Unsafe.copy(value.address, offset(index), 32)
		
		inline fun forEach(block: (FramebufferMixedSamplesCombination) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (FramebufferMixedSamplesCombination) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, FramebufferMixedSamplesCombination) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}