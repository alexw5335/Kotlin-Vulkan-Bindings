package kvb.vkwrapper.allocation

import kvb.core.memory.LinearAllocator
import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.DeviceMemory
import kvb.vkwrapper.persistent.MemoryTypeP
import kvb.vulkan.MemoryPropertyFlags
import kvb.vulkan.MemoryType

class VkHeapAllocator(val device: Device, val memoryType: MemoryTypeP) {


	private val linearAllocators = ArrayList<VkLinearAllocator>()

	private val blockLists = HashMap<Long, ArrayList<Block>>()



	class Block(
		val memory: DeviceMemory,
		val offset: Long,
		val size: Long,
		var allocated: Boolean
	)



	fun allocate(size: Long): VkAllocation {
		val blockSize = if(size.countOneBits() == 1)
			size
		else
			size.takeHighestOneBit() * 2

		val blocks = blockLists.getOrPut(blockSize, ::ArrayList)

		var existingBlock = blocks.firstOrNull { !it.allocated }

		val block: Block

		if(existingBlock == null) {
			val allocator = linearAllocators.firstOrNull {
				it.canAllocate(blockSize, 256)
			} ?: VkLinearAllocator(device.allocateMemory(blockSize * 4, memoryType.index))

			val blockAllocation = allocator.allocate(blockSize, 256)
			block = Block(allocator.memory, blockAllocation.offset, blockSize, true)
		} else {
			block = existingBlock
		}


	}

}