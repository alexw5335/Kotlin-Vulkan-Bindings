package kvb.vkwrapper.memory

import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.DeviceMemory

class VkLinearAllocator(val memory: DeviceMemory) : VkAllocator {


	var offset = 0L



	override fun allocate(size: Long, alignment: Long) : VkAllocation {
		val offset = (offset + (alignment - 1)) and -alignment

		this.offset += size

		if(this.offset > memory.size)
			throw VkException("Memory stack overflow.")

		return VkAllocation(memory, offset)
	}



	fun stack(block: VkLinearAllocator.() -> Unit) {
		val offset = offset
		block(this)
		this.offset = offset
	}


	fun push() = offset



	fun pop(offset: Long) { this.offset = offset }



	fun reset() { offset = 0L }



	override fun destroy() = memory.free()



	fun canAllocate(size: Long, alignment: Long) =
		size <= memory.size - ((offset + (alignment - 1) and -alignment))


}