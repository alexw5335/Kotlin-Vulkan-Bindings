package kvb.samples.sample0

import kvb.vkwrapper.allocation.VkLinearAllocator
import kvb.vkwrapper.handle.Device
import kvb.vulkan.*

class AppAllocator(
	device: Device,
	bufferMemorySize: Long,
	imageMemorySize: Long
) {


	val dummyBuffer = device.createBuffer(size = 32, usage = BufferUsageFlags.VERTEX_BUFFER)

	val dummyImage = device.createImage2D(width = 32, height = 32, usage = ImageUsageFlags.COLOR_ATTACHMENT)



	val bufferAllocator = VkLinearAllocator(device.allocateMemory(
		size = bufferMemorySize,
		flags = MemoryPropertyFlags { HOST_VISIBLE },
		memoryTypeBits = dummyBuffer.memoryRequirementsP().memoryTypeBits,
	))



	val imageAllocator = VkLinearAllocator(device.allocateMemory(
		size = imageMemorySize,
		flags = MemoryPropertyFlags { DEVICE_LOCAL },
		memoryTypeBits = dummyImage.memoryRequirementsP().memoryTypeBits
	))



	init {
		bufferAllocator.memory.mapWhole()
	}



	fun destroy() {
		dummyBuffer.destroy()
		dummyImage.destroy()
		bufferAllocator.destroy()
		imageAllocator.destroy()
	}


}