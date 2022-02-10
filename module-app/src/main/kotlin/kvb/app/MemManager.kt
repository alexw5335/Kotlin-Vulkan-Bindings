package kvb.app

import kvb.core.memory.DirectList
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.allocation.VkLinearAllocator
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.Image
import kvb.vkwrapper.persistent.MemoryTypeP
import kvb.vulkan.*

class MemManager(
	val device           : Device,
	val bufferMemorySize : Long = 10_000_000,
	val imageMemorySize  : Long = 32_000_000
) {


	val mappedType = device.physicalDevice.chooseMemoryType(
		property1 = MemoryPropertyFlags { HOST_VISIBLE },
		property2 = MemoryPropertyFlags { DEVICE_LOCAL },
		property3 = MemoryPropertyFlags { HOST_COHERENT }
	) ?: throw VkException("No mappable memory types")



	val dummyImage = device.createImage2D(32, 32, ImageUsageFlags.COLOR_ATTACHMENT)



	val bufferAllocator = VkLinearAllocator(
		device.allocateMemory(bufferMemorySize, mappedType.index)
	)



	val imageAllocator = VkLinearAllocator(
		device.allocateMemory(
			size = imageMemorySize,
			property1 = MemoryPropertyFlags { DEVICE_LOCAL },
			memoryTypeBits = dummyImage.memoryRequirementsP().memoryTypeBits
		)
	)



	/*
	Writing
	 */



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



	/*
	Allocation
	 */



	fun allocateBuffer(buffer: Buffer) = buffer.bindMemory(bufferAllocator.allocate(buffer))

	fun allocateImage(image: Image) = image.bindMemory(imageAllocator.allocate(image))



	fun buffer(size: Int, usage: BufferUsageFlags) =
		device.createBuffer(size.toLong(), usage).also(::allocateBuffer)

	fun image(width: Int, height: Int, usage: ImageUsageFlags, format: Format) =
		device.createImage2D(width, height, usage, format).also(::allocateImage)



	fun stagingBuffer(size: Int) = buffer(size, BufferUsageFlags.TRANSFER_SRC)

	fun vertexBuffer(size: Int) = buffer(size, BufferUsageFlags.VERTEX_BUFFER)

	fun uniformBuffer(size: Int) = buffer(size, BufferUsageFlags.UNIFORM_BUFFER)



	fun stagingBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = stagingBuffer(size).also {
		write(it, block = block)
	}

	fun vertexBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = vertexBuffer(size).also {
		write(it, block = block)
	}

	fun uniformBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = uniformBuffer(size).also {
		write(it, block = block)
	}



	fun vertexBuffer(size: Int, floats: FloatArray) = vertexBuffer(size) {
		it.setFloats(0, floats)
	}

	fun stagingBuffer(size: Int, floats: FloatArray) = stagingBuffer(size) {
		it.setFloats(0, floats)
	}

	fun uniformBuffer(size: Int, floats: FloatArray) = uniformBuffer(size) {
		it.setFloats(0, floats)
	}


}