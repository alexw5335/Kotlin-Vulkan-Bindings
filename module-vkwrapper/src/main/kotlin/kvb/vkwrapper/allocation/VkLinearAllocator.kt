package kvb.vkwrapper.allocation

import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.DeviceMemory

class VkLinearAllocator(val memory: DeviceMemory) : VkAllocator {


	var pointer = 0L
		private set


	override fun allocate(size: Long, alignment: Long) : VkAllocation {
		val offset = (pointer + (alignment - 1)) and -alignment

		pointer += size

		if(pointer > memory.size)
			throw VkException("Memory stack overflow.")

		return VkAllocation(memory, offset)
	}



	override fun destroy() {
		memory.free()
	}



	fun canAllocate(size: Long, alignment: Long) =
		size <= memory.size - ((pointer + (alignment - 1) and -alignment))


}