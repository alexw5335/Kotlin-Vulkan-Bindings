package kvb.vkwrapper.allocation

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.handle.Image
import kvb.vulkan.MemoryRequirements

interface VkAllocator {


	fun allocate(size: Long, alignment: Long): VkAllocation

	fun allocate(requirements: MemoryRequirements) = allocate(requirements.size, requirements.alignment)

	fun allocate(buffer: Buffer, stack: MemStack = default) = stack.get {
		allocate(buffer.memoryRequirements(stack))
	}

	fun allocate(image: Image, stack: MemStack = default) = stack.get {
		allocate(image.memoryRequirements(stack))
	}

	fun destroy()


}