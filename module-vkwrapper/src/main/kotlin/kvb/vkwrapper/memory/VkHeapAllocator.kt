package kvb.vkwrapper.memory

import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.DeviceMemory
import kvb.vkwrapper.persistent.MemoryTypeP

class VkHeapAllocator(val device: Device, val memoryType: MemoryTypeP, val persistentlyMapped: Boolean) {


	private val linearAllocators = ArrayList<VkLinearAllocator>()

	private val blockLists = HashMap<Long, ArrayList<Block>>()



	class Block(
		val memory: DeviceMemory,
		val offset: Long,
		val size: Long,
		var allocated: Boolean
	)



	fun allocate(size: Long): VkAllocation {
		val blockSize = if(size.countOneBits() == 1) size else size.takeHighestOneBit() * 2

		val blocks = blockLists.getOrPut(blockSize, ::ArrayList)

		val existingBlock = blocks.firstOrNull { !it.allocated }

		val block = if(existingBlock == null) {
			val allocator = linearAllocators
				.firstOrNull { it.canAllocate(blockSize, 256) }
				?: VkLinearAllocator(device.allocateMemory(blockSize * 4, memoryType.index))
				.also(linearAllocators::add)
				.also { if(persistentlyMapped) it.memory.mapWhole() }

			val blockAllocation = allocator.allocate(blockSize, 256)
			Block(allocator.memory, blockAllocation.offset, blockSize, true).also(blocks::add)
		} else {
			existingBlock.also { it.allocated = true }
		}

		return VkAllocation(block.memory, block.offset)
	}



	fun allocate(buffer: Buffer) {
		// Align size to a power of 256
		val size = (buffer.size + (256 - 1)) and -256
		val allocation = allocate(size)
		buffer.bindMemory(allocation)
	}



	fun free(memory: DeviceMemory, offset: Long) {
		for(list in blockLists.values) {
			for(block in list) {
				if(block.memory == memory && block.offset == offset) {
					block.allocated = false
					return
				}
			}
		}

		// TODO: Make more efficient.
		throw VkException("Tried to free a block of memory that was not allocated with this heap allocator.")
	}



	fun printAnalytics() {
		if(blockLists.isEmpty())
			println("This allocator is empty.")

		println("Heap Allocator:")
		println("\tTotal memory capacity: ${linearAllocators.sumOf { it.memory.size }}")
		println("\tTotal memory usage: ${blockLists.flatMap { it.value }.filter { it.allocated }.sumOf { it.size }}")

		for(l in linearAllocators) {
			println("\tsub-allocator(size = ${l.memory.size}, used = ${l.offset})")
		}

		for((blockSize, blocks) in blockLists) {
			println("\tblock list(size = $blockSize, count = ${blocks.size}, allocated = ${blocks.count { it.allocated }})")
		}
	}


}