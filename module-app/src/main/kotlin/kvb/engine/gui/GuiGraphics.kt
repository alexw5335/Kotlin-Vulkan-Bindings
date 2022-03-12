package kvb.engine.gui

import kvb.core.memory.LinearAllocator
import kvb.core.memory.Unsafe
import kvb.engine.vulkan.VkContext
import kvb.vkwrapper.allocation.VkLinearAllocator
import kvb.vkwrapper.builder.GraphicsPipelineBuilder
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.handle.CommandBuffer
import kvb.vkwrapper.handle.Pipeline
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.*
import kvb.window.Window

object GuiGraphics {


	private val shaderDirectory = ShaderDirectory("res/shader/gui", VkContext.device)

	private val pipelines = ArrayList<Pipeline>()

	private val allocator = LinearAllocator(Unsafe, 1 shl 20)

	private fun pipeline(block: GraphicsPipelineBuilder.() -> Unit) =
		VkContext.device.buildGraphicsPipeline(block).also(pipelines::add)

	lateinit var commandBuffer: CommandBuffer

	private val dummyBuffer = VkContext.device.createBuffer(32L, BufferUsageFlags.VERTEX_BUFFER)

	val textAllocator = VkLinearAllocator(VkContext.device.allocateMemory(
		size           = 1L shl 20,
		property1      = MemoryPropertyFlags.HOST_VISIBLE,
		property2      = MemoryPropertyFlags.DEVICE_LOCAL,
		memoryTypeBits = dummyBuffer.memoryRequirements().memoryTypeBits
	))



	fun resetAllocator() {
		allocator.reset()
	}



	fun setWindowSize(windowWidth: Float, windowHeight: Float) {
		val data = allocator.mallocFloat(2)

		data[0] = windowWidth
		data[1] = windowHeight

		for(p in pipelines)
			commandBuffer.pushConstants(p.layout, ShaderStageFlags.VERTEX, 0, 8, data)
	}



	fun setScale(scale: Float) {
		val data = allocator.wrapFloat(scale)

		for(p in pipelines)
			commandBuffer.pushConstants(p.layout, ShaderStageFlags.VERTEX, 8, 4, data)
	}



	fun preRender(window: Window) {
		setWindowSize(window.width, window.height)
		setScale(1.0F)
	}



	fun renderRect(
		x      : Float,
		y      : Float,
		width  : Float,
		height : Float,
		colour : Colour
	) {
		val data = allocator.mallocByte(20)
		data.setFloat(0, x)
		data.setFloat(4, y)
		data.setFloat(8, width)
		data.setFloat(12, height)
		data.setInt(16, colour.value)

		commandBuffer.bindPipeline(singleColourRectPipeline)
		commandBuffer.pushConstants(singleColourRectPipeline.layout, ShaderStageFlags.VERTEX, 16, 20, data)
		commandBuffer.draw(4)
	}



	val singleColourRectPipeline = pipeline {
		renderPass(VkContext.surfaceSystem.renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 36)
		shaders(shaderDirectory["rect"])
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
		samples(VkContext.surfaceSystem.sampleCount)
	}



	val binaryFontPipeline = VkContext.device.buildGraphicsPipeline {
		vertexBinding { vec2(); uvec2() }
		renderPass(VkContext.surfaceSystem.renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 32)
		shaders(shaderDirectory["font"])
		pointList()
		simpleBlendAttachment()
		dynamicViewportAndScissor()
		samples(VkContext.surfaceSystem.sampleCount)
	}



	fun renderText(
		offsetX   : Float,
		offsetY   : Float,
		buffer    : Buffer,
		textScale : Float,
		numChars  : Int,
	) {
		val data = allocator.mallocByte(12)
		data.setFloat(0, offsetX)
		data.setFloat(4, offsetY)
		data.setFloat(8, textScale)

		commandBuffer.bindPipeline(binaryFontPipeline)
		commandBuffer.pushConstants(binaryFontPipeline.layout, ShaderStageFlags.VERTEX, 16, data.byteSize, data)
		commandBuffer.bindVertexBuffer(buffer)
		commandBuffer.draw(numChars)
	}


}