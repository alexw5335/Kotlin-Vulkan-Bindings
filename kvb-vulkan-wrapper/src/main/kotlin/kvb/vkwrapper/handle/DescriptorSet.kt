package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.vulkan.*

class DescriptorSet(address: Long, val device: Device) : DescriptorSetH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this



	/*
	Commands
	 */



	/**
	 * Convenience implementation of vkUpdateDescriptorSets. For a single uniform descriptor set with a single buffer
	 * write.
	 */
	fun updateUniformWrite(
		buffer       : Buffer,
		offset       : Long,
		range        : Long,
		binding      : Int,
		arrayElement : Int = 0,
		stack        : MemStack = default
	) = stack.with {
		val writeInfo = WriteDescriptorSet {
			it.dstSet = self
			it.dstBinding = binding
			it.dstArrayElement = arrayElement
			it.descriptorType = DescriptorType.UNIFORM_BUFFER
			it.bufferInfo = DescriptorBufferInfo { bufferInfo ->
				bufferInfo.buffer = buffer
				bufferInfo.offset = offset
				bufferInfo.range = range
			}.asBuffer
		}

		device.updateDescriptorSets(writeInfo.asBuffer)
	}


}