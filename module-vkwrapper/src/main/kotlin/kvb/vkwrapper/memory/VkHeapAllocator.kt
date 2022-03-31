package kvb.vkwrapper.memory

import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.DeviceMemory
import kvb.vkwrapper.handle.VkResource
import kvb.vkwrapper.persistent.MemoryTypeP

class VkHeapAllocator(
	val device: Device,
	val memoryType: MemoryTypeP,
	val persistentlyMapped: Boolean
) : VkAllocator {


	private val allocators = ArrayList<VkLinearAllocator>()

	private val blockLists = HashMap<Long, ArrayList<Block>>()



	override fun allocate(size: Long, alignment: Long): VkAllocation {
		val block = getBlock(size, alignment)
		block.allocated = true
		return VkAllocation(block.memory, block.offset, size)
	}



	override fun destroy() {
		for(l in allocators)
			l.destroy()
	}



	class Block(
		val memory    : DeviceMemory,
		val offset    : Long,
		val size      : Long,
		var allocated : Boolean
	)



	private fun getBlock(size: Long, alignment: Long): Block {
		val blockSize = if(size.countOneBits() == 1) size else size.takeHighestOneBit() * 2
		val blocks = blockLists.getOrPut(blockSize, ::ArrayList)

		for(block in blocks)
			if(!block.allocated)
				return block

		val allocation = getAllocator(blockSize, alignment, blockSize).allocate(blockSize, alignment)
		val block = Block(allocation.memory, allocation.offset, blockSize, false)
		blocks.add(block)
		return block
	}



	private fun getAllocator(size: Long, alignment: Long, blockSize: Long): VkLinearAllocator {
		for(l in allocators)
			if(l.canAllocate(size, alignment))
				return l

		val allocator = VkLinearAllocator(device.allocateMemory(blockSize * 4, memoryType.index))

		allocators.add(allocator)

		if(persistentlyMapped)
			allocator.memory.mapWhole()

		return allocator
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



	fun free(resource: VkResource) = free(resource.memory, resource.offset)



	@Suppress("unused")
	fun printAnalytics() {
		if(blockLists.isEmpty())
			println("This allocator is empty.")

		println("Heap Allocator:")
		println("\tTotal memory capacity: ${allocators.sumOf { it.memory.size }}")
		println("\tTotal memory usage: ${blockLists.flatMap { it.value }.filter { it.allocated }.sumOf { it.size }}")

		for(l in allocators) {
			println("\tsub-allocator(size = ${l.memory.size}, used = ${l.offset})")
		}

		for((blockSize, blocks) in blockLists) {
			println("\tblock list(size = $blockSize, count = ${blocks.size}, allocated = ${blocks.count { it.allocated }})")
		}
	}


}