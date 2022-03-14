package kvb.engine.vulkan

import kvb.engine.gui.GuiGraphics
import kvb.vkwrapper.memory.VkHeapAllocator
import kvb.vulkan.BufferUsageFlags
import kvb.vulkan.MemoryPropertyFlags

object VkContext {


	init { VkContextBuilder.build() }



	val window = VkContextBuilder.window

	val instance = VkContextBuilder.instance

	val debugMessenger = VkContextBuilder.debugMessenger

	val physicalDevice = VkContextBuilder.physicalDevice

	val device = VkContextBuilder.device

	val queue = VkContextBuilder.queue

	val surfaceSystem = VkContextBuilder.surfaceSystem

	val memoryManager = VkContextBuilder.memoryManager



	private val dummyVertexBuffer = device.createBuffer(32L, BufferUsageFlags.VERTEX_BUFFER)



	fun mappedHeapAllocator() = VkHeapAllocator(device, device.physicalDevice.chooseMemoryType(
		property1      = MemoryPropertyFlags.HOST_VISIBLE,
		property2      = MemoryPropertyFlags.DEVICE_LOCAL,
		property3      = MemoryPropertyFlags.HOST_COHERENT,
		memoryTypeBits = dummyVertexBuffer.memoryRequirements().memoryTypeBits
	)!!, true)

}