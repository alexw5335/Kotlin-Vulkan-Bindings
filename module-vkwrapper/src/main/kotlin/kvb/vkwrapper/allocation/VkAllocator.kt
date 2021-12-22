package kvb.vkwrapper.allocation

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.handle.DeviceMemory
import kvb.vkwrapper.handle.Image
import kvb.vulkan.MemoryRequirements

interface VkAllocator {


	class Allocation(val memory: DeviceMemory, val offset: Long)



	/*
	Abstract functions
	 */



	fun allocate(size: Long, alignment: Long): VkAllocation

	fun destroy()



	/*
	Convenience functions
	 */



	fun allocate(requirements: MemoryRequirements) = allocate(requirements.size, requirements.alignment)



	fun allocateBuffer(buffer: Buffer, stack: MemStack = default) = stack.with {
		buffer.bindMemory(allocate(buffer.memoryRequirements(stack)))
	}



	fun allocateImage(image: Image, stack: MemStack = default) = stack.with {
		image.bindMemory(allocate(image.memoryRequirements(stack)))
	}


}