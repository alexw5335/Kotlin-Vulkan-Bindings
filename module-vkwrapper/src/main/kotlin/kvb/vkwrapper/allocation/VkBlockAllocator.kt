package kvb.vkwrapper.allocation

import kvb.vkwrapper.exception.VkOutOfMemoryException
import kvb.vkwrapper.handle.DeviceMemory

class VkBlockAllocator(val memory: DeviceMemory, val blockSize: Long) : VkAllocator {


	private var pointer = 0L

	private val blockCount = (memory.size / blockSize).toInt()

	private val freeBlocks = HashSet<Long>()

	private val allocatedBlocks = HashSet<Long>()



	init {
		for(i in 0 until blockCount)
			freeBlocks.add(i * blockSize)
	}



	override fun allocate(size: Long, alignment: Long) : VkAllocation {
		if(freeBlocks.isEmpty())
			throw VkOutOfMemoryException("Memory stack overflow")

		val offset = (pointer + (alignment - 1)) and -alignment

		pointer += size

		if(pointer > memory.size)
			throw VkOutOfMemoryException("Memory stack overflow.")

		return VkAllocation(memory, offset)
	}



	override fun destroy() {
		memory.free()
	}


}