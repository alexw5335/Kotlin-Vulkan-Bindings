package kvb.vkwrapper.memory

import kvb.core.memory.*
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.handle.Image
import kvb.vulkan.*

interface VkAllocator {


	fun allocate(size: Long, alignment: Long): VkAllocation



	fun allocate(requirements: MemoryRequirements) = allocate(requirements.size, requirements.alignment)



	fun allocate(buffer: Buffer) = stackGet {
		val requirements = MemoryRequirements { }
		buffer.commands.getBufferMemoryRequirements(buffer, requirements)
		allocate(requirements)
	}



	fun allocate(image: Image) = stackGet {
		val requirements = MemoryRequirements { }
		image.commands.getImageMemoryRequirements(image, requirements)
		allocate(requirements)
	}



	fun destroy()


}