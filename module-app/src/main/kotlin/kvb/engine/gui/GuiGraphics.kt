package kvb.engine.gui

import kvb.core.memory.LinearAllocator
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectLong
import kvb.engine.vulkan.VkContext
import kvb.vkwrapper.builder.GraphicsPipelineBuilder
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
		setWindowSize(window.clientWidth.toFloat(), window.clientHeight.toFloat())
		setScale(1.0F)
	}



	/*
	- Push constant allocations can use a linear allocator that is reset every frame.
	- Text will require more sophisticated memory management.
	- Each character will require 16 bytes. A 256-byte minimum-alignment buffer can fit 16 characters.
		- There is no use in sub-allocating buffers for text.
		- Each Text uses a single buffer
		- Need a heap allocator for a single memory type.
			- Can allocate more DeviceMemory if it is needed.
			- Can use multiple DeviceMemory objects.
	 */



	fun renderRect(
		offsetX : Float,
		offsetY : Float,
		width   : Float,
		height  : Float,
		colour  : Colour
	) {
		val data = allocator.mallocByte(20)
		data.setFloat(0, offsetX)
		data.setFloat(4, offsetY)
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
	}



/*	val binaryFontPipeline = VkContext.device.buildGraphicsPipeline {
		vertexBinding { vec2(); uvec2() }
		renderPass(VkContext.surfaceSystem.renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 20)
		shaders(shaderDirectory["font"])
		pointList()
		simpleBlendAttachment()
		dynamicViewportAndScissor()
	}*/


}