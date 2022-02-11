package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.vulkan.*

class DescriptorSet(
	address    : Long,
	val device : Device,
	val layout : DescriptorSetLayout
) : DescriptorSetH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	val descriptors = layout.descriptors



	/*
	Commands
	 */



	fun bufferWrite(
		binding : Int,
		buffer  : Buffer,
		offset  : Long = 0L,
		size    : Long = 0L,
		stack   : MemStack = default
	) = stack.with {
		device.updateDescriptorSets(
			WriteDescriptorSet {
				it.dstSet = self
				it.dstBinding = binding
				it.dstArrayElement = 0
				it.descriptorType  = descriptors[binding].type
				it.descriptorCount = 1
				it.bufferInfo = DescriptorBufferInfo { bufferInfo ->
					bufferInfo.buffer = buffer
					bufferInfo.offset = offset
					bufferInfo.range  = size
				}.asBuffer
			}.asBuffer
		)
	}



	fun imageWrite(
		binding     : Int,
		sampler     : Sampler,
		imageView   : ImageView,
		imageLayout : ImageLayout,
		stack       : MemStack = default
	) = stack.with {
		device.updateDescriptorSets(
			WriteDescriptorSet {
				it.dstSet = self
				it.dstBinding = binding
				it.dstArrayElement = 0
				it.descriptorType  = descriptors[binding].type
				it.descriptorCount = 1
				it.imageInfo = DescriptorImageInfo { imageInfo ->
					imageInfo.sampler = sampler
					imageInfo.imageView = imageView
					imageInfo.imageLayout  = imageLayout
				}.asBuffer
			}.asBuffer
		)
	}



	fun imageWrite(
		binding     : Int,
		sampler     : Sampler,
		stack       : MemStack = default
	) = stack.with {
		device.updateDescriptorSets(
			WriteDescriptorSet {
				it.dstSet = self
				it.dstBinding = binding
				it.dstArrayElement = 0
				it.descriptorType  = descriptors[binding].type
				it.descriptorCount = 1
				it.imageInfo = DescriptorImageInfo { imageInfo ->
					imageInfo.sampler = sampler
				}.asBuffer
			}.asBuffer
		)
	}



	fun imageWrite(
		binding     : Int,
		imageView   : ImageView,
		imageLayout : ImageLayout,
		stack       : MemStack = default
	) = stack.with {
		device.updateDescriptorSets(
			WriteDescriptorSet {
				it.dstSet = self
				it.dstBinding = binding
				it.dstArrayElement = 0
				it.descriptorType  = descriptors[binding].type
				it.descriptorCount = 1
				it.imageInfo = DescriptorImageInfo { imageInfo ->
					imageInfo.imageView = imageView
					imageInfo.imageLayout  = imageLayout
				}.asBuffer
			}.asBuffer
		)
	}


}