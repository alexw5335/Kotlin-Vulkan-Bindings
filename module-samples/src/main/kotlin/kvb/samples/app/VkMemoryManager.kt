package kvb.samples.app

import kvb.vkwrapper.allocation.VkLinearAllocator
import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.Queue
import kvb.vulkan.*

class VkMemoryManager(
	val device: Device,
	val queue: Queue,
	val stagingMemorySize: Int,
	val imageMemorySize: Int,
	val bufferMemorySize: Int
) {


	private val commandPool = device.createCommandPool(queue.family, CommandPoolCreateFlags.TRANSIENT)



	private val dummyStagingBuffer = device.createBuffer(
		size = 32L,
		usage = BufferUsageFlags.TRANSFER_SRC
	)



	private val dummyImage = device.createImage2D(
		width = 32,
		height = 32,
		usage = ImageUsageFlags.COLOR_ATTACHMENT
	)



	private val dummyBuffer = device.createBuffer(
		size = 32L,
		usage = BufferUsageFlags.VERTEX_BUFFER
	)



	private val stagingAllocator = VkLinearAllocator(
		device.allocateMemory(
			size = stagingMemorySize.toLong(),
			flags = MemoryPropertyFlags { HOST_VISIBLE },
			memoryTypeBits = dummyStagingBuffer.memoryRequirementsP().memoryTypeBits
		)
	)



	private val imageAllocator = VkLinearAllocator(
		device.allocateMemory(
			size = imageMemorySize.toLong(),
			flags = MemoryPropertyFlags { DEVICE_LOCAL },
			memoryTypeBits = dummyImage.memoryRequirementsP().memoryTypeBits
		)
	)



	private val bufferAllocator = VkLinearAllocator(
		device.allocateMemory(
			size = bufferMemorySize.toLong(),
			flags = MemoryPropertyFlags { DEVICE_LOCAL },
			memoryTypeBits = dummyBuffer.memoryRequirementsP().memoryTypeBits
		)
	)


}