package kvb.vkwrapper.memory

import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.DeviceMemory
import kvb.vkwrapper.handle.VkResource

class VkLinearAllocator(val memory: DeviceMemory) : VkAllocator {


	var offset = 0L



	override fun allocate(size: Long, alignment: Long): VkAllocation {
		val offset = (offset + (alignment - 1)) and -alignment

		this.offset += size

		if(this.offset > memory.size)
			throw VkException("Linear allocator has run out of memory.")

		return VkAllocation(memory, size, alignment)
	}



	fun stack(block: VkLinearAllocator.() -> Unit) {
		val offset = offset
		block(this)
		this.offset = offset
	}



	fun canAllocate(size: Long, alignment: Long) =
		size <= memory.size - ((offset + (alignment - 1) and -alignment))



	fun push() = offset

	fun pop(offset: Long) { this.offset = offset }

	fun reset() { offset = 0L }

	override fun destroy() = memory.free()


}