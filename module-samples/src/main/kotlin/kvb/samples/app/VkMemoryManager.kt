package kvb.samples.app

import kvb.vkwrapper.allocation.VkLinearAllocator
import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.Queue
import kvb.vulkan.*

class VkMemoryManager(device: Device, bufferMemorySize: Int, imageMemorySize: Int) {


	private val dummyBuffer = device.createBuffer(32L, BufferUsageFlags.VERTEX_BUFFER)

	private val dummyImage = device.createImage2D(32, 32, ImageUsageFlags.COLOR_ATTACHMENT)



	val bufferAllocator = VkLinearAllocator(
		device.allocateMemory(
			size           = bufferMemorySize.toLong(),
			requiredFlags  = MemoryPropertyFlags { HOST_VISIBLE },
			preferredFlags = MemoryPropertyFlags { DEVICE_LOCAL + HOST_COHERENT },
			memoryTypeBits = dummyBuffer.memoryRequirementsP().memoryTypeBits
		).also { it.mapWhole() }
	)



	val imageAllocator = VkLinearAllocator(
		device.allocateMemory(
			size           = imageMemorySize.toLong(),
			requiredFlags  = MemoryPropertyFlags { DEVICE_LOCAL },
			memoryTypeBits = dummyImage.memoryRequirementsP().memoryTypeBits
		)
	)



	fun destroy() {
		dummyBuffer.destroy()
		dummyImage.destroy()
		bufferAllocator.destroy()
		imageAllocator.destroy()
	}


}