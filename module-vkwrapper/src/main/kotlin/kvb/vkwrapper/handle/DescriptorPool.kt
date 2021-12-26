package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
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
	 * Implementation of vkAllocateDescriptorSets.
	 */
	fun allocateDescriptorSets(info: DescriptorSetAllocateInfo, stack: MemStack = default) = stack.get {
		val pointers = mallocPointer(info.descriptorSetCount)
		device.commands.allocateDescriptorSets(info, pointers).check()
		pointers.map { DescriptorSet(it, device) }
	}



	/**
	 * Convenience implementation of vkAllocateDescriptorSets.
	 */
	fun allocateDescriptorSet(setLayouts: List<DescriptorSetLayout>, stack: MemStack = default) = stack.get {
		val info = DescriptorSetAllocateInfo {
			it.descriptorPool = self
			it.setLayouts = wrapPointers(setLayouts)
		}

		allocateDescriptorSets(info)[0]
	}



	/**
	 * Convenience implementation of vkAllocateDescriptorSets. For a single set layout.
	 */
	fun allocateDescriptorSet(setLayout: DescriptorSetLayout, stack: MemStack = default) = stack.get {
		val info = DescriptorSetAllocateInfo {
			it.descriptorPool = self
			it.setLayouts = wrapPointer(setLayout)
		}

		allocateDescriptorSets(info)[0]
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