package kvb.vkwrapper.handle

import kvb.core.memory.*
import kvb.vkwrapper.persistent.Descriptor
import kvb.vulkan.*

class DescriptorPool(address: Long, val device: Device) : DescriptorPoolH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * If [destroy] has been called.
	 */
	var isDestroyed = false; private set

	/**
	 * Implementation of vkDestroyDescriptorPool. Calls after the first will have no effect.
	 */
	fun destroy() = commands.destroyDescriptorPool(this, null)



	/*
	Allocation
	 */



	/**
	 * Convenience implementation of vkAllocateDescriptorSets.
	 */
	fun allocateDescriptorSets(layouts: List<DescriptorSetLayout>) = stackGet {
		val info = DescriptorSetAllocateInfo {
			it.descriptorPool = self
			it.setLayouts = wrapPointers(layouts)
		}

		val pointers = mallocPointer(info.descriptorSetCount)
		device.commands.allocateDescriptorSets(info, pointers).check()
		layouts.mapIndexed { i, l -> DescriptorSet(pointers[i], device, l) }
	}



	/**
	 * Single implementation of vkAllocateDescriptorSets.
	 */
	fun allocateDescriptorSet(layout: DescriptorSetLayout) = stackGet {
		val info = DescriptorSetAllocateInfo {
			it.descriptorPool = self
			it.setLayouts = wrapPointer(layout)
		}

		val pointers = mallocPointer(1)
		device.commands.allocateDescriptorSets(info, pointers).check()
		DescriptorSet(pointers[0], device, layout)
	}



	fun createSet(
		descriptors : List<Descriptor>,
		flags       : DescriptorSetLayoutCreateFlags = DescriptorSetLayoutCreateFlags(0)
	) = stackGet {
		allocateDescriptorSet(device.createDescriptorSetLayout(descriptors, flags))
	}



	fun createSet(
		type   : DescriptorType,
		stages : ShaderStageFlags
	) = allocateDescriptorSet(device.createDescriptorSetLayout(listOf(Descriptor(0, type, 1, stages))))



	fun createSet(
		type   : DescriptorType,
		stages : ShaderStageFlags,
		buffer : Buffer
	) = createSet(type, stages).also { it.bufferWrite(0, buffer) }



	fun createSet(
		type        : DescriptorType,
		stages      : ShaderStageFlags,
		sampler     : Sampler,
		imageView   : ImageView,
		imageLayout : ImageLayout
	) = createSet(type, stages).also { it.imageWrite(0, sampler, imageView, imageLayout) }



	/*
	Functions
	 */



	/**
	 * Implementation of vkResetDescriptorPool. All descriptor sets that were allocated from this pool are freed and
	 * their resources are returned to this pool.
	 */
	fun reset() = commands.resetDescriptorPool(this)


}