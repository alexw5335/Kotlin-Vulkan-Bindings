package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.vkwrapper.builder.DescriptorSetBuilder
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
	fun allocateDescriptorSets(layouts: List<DescriptorSetLayout>, stack: MemStack = default) = stack.get {
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
	fun allocateDescriptorSet(layout: DescriptorSetLayout, stack: MemStack = default) = stack.get {
		val info = DescriptorSetAllocateInfo {
			it.descriptorPool = self
			it.setLayouts = wrapPointer(layout)
		}

		val pointers = mallocPointer(1)
		device.commands.allocateDescriptorSets(info, pointers).check()
		DescriptorSet(pointers[0], device, layout)
	}



	inline fun buildSet(stack: MemStack = default, block: DescriptorSetBuilder.() -> Unit) =
		DescriptorSetBuilder(this, stack).also(block).build()



	fun createSet(
		descriptors : List<Descriptor>,
		flags       : DescriptorSetLayoutCreateFlags = DescriptorSetLayoutCreateFlags(0),
		stack       : MemStack = default
	) = stack.get {
		allocateDescriptorSet(device.createDescriptorSetLayout(descriptors, stack = stack))
	}



	fun createSet(
		descriptor : Descriptor,
		flags      : DescriptorSetLayoutCreateFlags = DescriptorSetLayoutCreateFlags(0),
		stack      : MemStack = default
	) = stack.get {
		allocateDescriptorSet(device.createDescriptorSetLayout(listOf(descriptor), stack = stack))
	}



	fun createSet(
		type   : DescriptorType,
		stages : ShaderStageFlags,
		stack  : MemStack = default
	) = stack.get {
		allocateDescriptorSet(device.createDescriptorSetLayout(listOf(Descriptor(0, type, 1, stages)), stack = stack))
	}



	/*
	Functions
	 */



	/**
	 * Implementation of vkResetDescriptorPool. All descriptor sets that were allocated from this pool are freed and
	 * their resources are returned back to this pool.
	 */
	fun reset() = commands.resetDescriptorPool(this)


}