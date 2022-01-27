package kvb.samples.app

import kvb.core.memory.DirectList
import kvb.core.memory.MemStacks
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.QueueFamilyPropertiesP
import kvb.vulkan.BufferUsageFlags
import kvb.vulkan.MappedMemoryRange

class Context(
	val instance       : Instance,
	val debugMessenger : DebugUtilsMessenger?,
	val physicalDevice : PhysicalDevice,
	val queueFamily    : QueueFamilyPropertiesP,
	val device         : Device,
	val queue          : Queue,
	val surfaceSystem  : SurfaceSystem?,
	val descriptorPool : DescriptorPool
) {


	/*
	Memory
	 */



	/**
	 * 2 ^ 20 is about 1MB. 2 ^ 25 is about 32MB.
	 */
	val memoryManager = VkMemoryManager(device, bufferMemorySize = 1 shl 20, imageMemorySize = 1 shl 25)



	val memoryRanges = DirectList(Vulkan.mem, 10) { MappedMemoryRange(it) { } }



	fun flushMemoryRanges() {
		device.commands.flushMappedMemoryRanges(memoryRanges.size, memoryRanges.buffer)
		memoryRanges.reset()
	}



	inline fun writeLazy(
		buffer : Buffer,
		offset : Long = 0,
		size   : Long = buffer.size,
		block  : (DirectByteBuffer) -> Unit
	) {
		block(buffer.data())

		if(buffer.memory.type.isHostCoherent) return

		memoryRanges.buffer[memoryRanges.next].let {
			it.memory = buffer.memory
			it.offset = offset
			it.size = size
		}
	}



	inline fun write(
		buffer : Buffer,
		offset : Long = 0,
		size   : Long = buffer.size,
		block  : (DirectByteBuffer) -> Unit
	) {
		block(buffer.data())
		if(buffer.memory.type.isHostCoherent) return
		buffer.flush(offset, size)
	}



	fun vertexBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = device.createBuffer(
		size.toLong(),
		BufferUsageFlags.VERTEX_BUFFER
	).also {
		it.bindMemory(memoryManager.bufferAllocator.allocate(it))
		write(it, block = block)
	}


}