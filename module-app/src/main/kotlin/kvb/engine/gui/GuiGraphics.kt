package kvb.engine.gui

import kvb.core.memory.LinearAllocator
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectByteBuffer
import kvb.engine.Engine
import kvb.engine.gui.font.Paragraph
import kvb.engine.gui.layout.Padding
import kvb.engine.vulkan.VkContext
import kvb.vkwrapper.builder.GraphicsPipelineBuilder
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.handle.CommandBuffer
import kvb.vkwrapper.handle.Pipeline
import kvb.vkwrapper.memory.VkHeapAllocator
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.*
import kvb.window.Window
import kvb.window.input.InputButton

object GuiGraphics {


	/*
	Variables
	 */



	private val shaderDirectory = ShaderDirectory("res/shader/gui", VkContext.device)

	private val pipelines = ArrayList<Pipeline>()

	private val allocator = LinearAllocator(Unsafe, 1 shl 20)

	lateinit var commandBuffer: CommandBuffer



	/*
	Text
	 */



	val textAllocator = VkContext.mappedHeapAllocator()



	fun populateText(paragraph: Paragraph, data: DirectByteBuffer) {
		var i = 0

		for(line in paragraph.lines) {
			var x = line.x

			for(binaryChar in line.chars) {
				data.setFloat(i, x)
				data.setFloat(i + 4, line.y + binaryChar.yOffset)
				data.setLong(i + 8, binaryChar.texture)
				x += binaryChar.advanceWidth
				i += 16
			}
		}
	}



	fun resetAllocator() {
		allocator.reset()
	}



	/*
	Rendering setup
	 */



	fun setScissor(x: Int, y: Int, width: Int, height: Int) {
		commandBuffer.setScissor(allocator.Rect2D(x, y, width, height))
	}



	fun setViewport(x: Float, y: Float, width: Float, height: Float) {
		commandBuffer.setViewport(allocator.Viewport(x, y, width, height))
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



	/*
	Rendering
	 */



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



	fun renderBorder(
		x: Float,
		y: Float,
		width: Float,
		height: Float,
		colour: Colour,
		border: Padding
	) = renderRect(
		x - border.left,
		y - border.top,
		width + border.horizontal,
		height + border.vertical,
		colour
	)



	fun renderText(
		offsetX   : Float,
		offsetY   : Float,
		buffer    : Buffer,
		textScale : Float,
		numChars  : Int,
		colour    : Colour
	) {
		val data = allocator.mallocByte(20)
		data.setFloat(0, offsetX)
		data.setFloat(4, offsetY)
		data.setFloat(8, textScale)
		data.setInt(12, colour.value)

		commandBuffer.bindPipeline(binaryFontPipeline)
		commandBuffer.pushConstants(binaryFontPipeline.layout, ShaderStageFlags.VERTEX, 16, data.byteSize, data)
		commandBuffer.bindVertexBuffer(buffer)
		commandBuffer.draw(numChars)
	}



	/*
	Pipelines
	 */



	private fun pipeline(block: GraphicsPipelineBuilder.() -> Unit) = VkContext.device
		.buildGraphicsPipeline(block)
		.also(pipelines::add)



	val singleColourRectPipeline = pipeline {
		renderPass(Engine.surfaceSystem.renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 36)
		shaders(shaderDirectory["rect"])
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
		samples(Engine.surfaceSystem.sampleCount)
	}



	val binaryFontPipeline = pipeline {
		vertexBinding { vec2(); uvec2() }
		renderPass(Engine.surfaceSystem.renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 40)
		shaders(shaderDirectory["font"])
		pointList()
		simpleBlendAttachment()
		dynamicViewportAndScissor()
		samples(Engine.surfaceSystem.sampleCount)
	}


}