package kvb.app.demo

import kvb.app.App
import kvb.app.VkContextBuilder
import kvb.vkwrapper.handle.CommandBuffer
import kvb.vkwrapper.pipeline.Program
import kvb.vulkan.*
import kvb.window.WindowManager
import kvb.window.input.Button
import kvb.window.winapi.WinApi
import kotlin.math.sqrt

object Demo4 : App() {


	val window = WindowManager.create("My Window", 0, 0, 512, 512)



	override val context = object : VkContextBuilder() {

		override val window = this@Demo4.window

		override val isDebugEnabled = true

		override val presentMode = PresentMode.IMMEDIATE

	}.build()



	val windowUBO = context.uniformBuffer(20)

	const val WIDTH = 128
	const val HEIGHT = 128

	const val BLACK: Byte = 0
	const val WHITE: Byte = -1

	val stagingBuffer = context.stagingBuffer(WIDTH * HEIGHT)

	val image = context.device.createImage2D(
		width = WIDTH,
		height = HEIGHT,
		format = Format.R8_SRGB,
		usage = ImageUsageFlags { SAMPLED + TRANSFER_DST }
	).also(context::allocateImage).also {
		context.transitionImageForShaderRead(it, stagingBuffer)
	}

	fun updateImage() {
		context.updateImage(image, stagingBuffer)
	}

	val imageView = context.device.createImageView(image)

	val sampler = context.device.createSampler(Filter.NEAREST, Filter.NEAREST)

	val colourUBO = context.uniformBuffer(16) {
		it[0] = 1F
		it[4] = 1F
		it[8] = 1F
		it[12] = 1F
	}

	val windowDescriptorSet = context.descriptorPool.buildSet {
		binding(0, DescriptorType.UNIFORM_BUFFER, 1, ShaderStageFlags.VERTEX)
		write(windowUBO)
		//vertexUniform(windowUBO)
	}


	val textureDescriptorSet = context.descriptorPool.buildSet {
		fragmentCominedSampler(imageLayout = ImageLayout.SHADER_READ_ONLY_OPTIMAL, imageView = imageView, sampler = sampler)
	}


	val colourDescriptorSet = context.descriptorPool.buildSet {
		fragmentUniform(colourUBO)
	}



	val Shaders = object : Program {

		override val device = context.device

		override val descriptors = mapOf(
			0 to windowDescriptorSet,
			1 to textureDescriptorSet
		)

		override val pipeline = context.device.buildGraphicsPipeline {
			vertexBinding {
				vec2()
				vec2()
			}

			renderPass(context.surfaceSystem!!.renderPass)
			shaders(context.shaderDirectory["binary_texture3"])
			layout(descriptors)
			topology(PrimitiveTopology.TRIANGLE_STRIP)
			noBlendAttachment()
			dynamicViewportAndScissor()
		}

	}



	val LineShaders = object : Program {

		override val device = context.device

		override val descriptors = mapOf(
			0 to windowDescriptorSet,
			1 to colourDescriptorSet
		)

		override val pipeline = context.device.buildGraphicsPipeline {
			vertexBinding {
				vec2()
			}

			renderPass(context.surfaceSystem!!.renderPass)
			shaders(context.shaderDirectory["line"])
			layout(descriptors)
			topology(PrimitiveTopology.LINE_LIST)
			simpleBlendAttachment()
			dynamicViewportAndScissor()
		}
	}



	val meshWidth = (WIDTH).toFloat()
	val meshHeight = (HEIGHT).toFloat()



	val vertexBuffer = context.vertexBuffer(4 * 4 * 4, floatArrayOf(
		0F, 0F, 0F, 0F,
		meshWidth, 0F, 1F, 0F,
		0F, meshHeight, 0F, 1F,
		meshWidth, meshHeight, 1F, 1F
	))



	val linesBuffer = context.vertexBuffer((WIDTH - 1 + HEIGHT - 1) * 16) {
		var index = 0
		val scale = meshWidth / WIDTH

		for(i in 1 until WIDTH) {
			it[index] = i.toFloat() * scale
			it[index + 4] = 0F
			it[index + 8] = i.toFloat() * scale
			it[index + 12] = HEIGHT.toFloat() * scale
			index += 16
		}

		for(i in 1 until HEIGHT) {
			it[index] = 0F
			it[index + 4] = i.toFloat() * scale
			it[index + 8] = WIDTH.toFloat() * scale
			it[index + 12] = i.toFloat() * scale
			index += 16
		}
	}



	var offsetX = 0F
	var offsetY = 0F
	var zoom = 1F
	var wasPressed = false
	var offsetOriginX = 0F
	var offsetOriginY = 0F
	var cursorOriginX = 0F
	var cursorOriginY = 0F
	var dragging = false
	val targetFps = 500
	val frameTime = 1_000_000 / targetFps
	var displayLines = false
	var minZoom = 0.03F
	var maxZoom = 1.0F
	var erase = false



	fun centre() {
		zoom = 1F
		offsetX = (window.clientWidth - meshWidth) / 2F * zoom
		offsetY = (window.clientHeight - meshHeight) / 2F * zoom
	}



	private fun record(commandBuffer: CommandBuffer) {
		Shaders.bind(commandBuffer)
		commandBuffer.bindVertexBuffer(vertexBuffer)
		commandBuffer.draw(4)

		LineShaders.bind(commandBuffer)
		commandBuffer.bindVertexBuffer(linesBuffer)
		commandBuffer.draw((WIDTH - 1 + HEIGHT - 1) * 2)
	}



	private fun onScroll(scroll: Int) {
		if(dragging) return
		var zoomDelta = -scroll/1200F
		if(zoom + zoomDelta > maxZoom) zoomDelta = maxZoom - zoom
		else if(zoom + zoomDelta < minZoom) zoomDelta = minZoom - zoom
		zoom += zoomDelta

		offsetX += (window.clientWidth / 2 - window.cursorX) * -zoomDelta
		offsetY += (window.clientHeight / 2 - window.cursorY) * -zoomDelta
	}



	private fun onMouseHold(button: Button) {
		if(button == Button.RIGHT_MOUSE) {
			if(!wasPressed) {
				offsetOriginX = offsetX
				offsetOriginY = offsetY
				cursorOriginX = window.cursorX.toFloat()
				cursorOriginY = window.cursorY.toFloat()
			}

			wasPressed = true

			if(!dragging) {
				val xdif = window.cursorX - cursorOriginX
				val ydif = window.cursorY - cursorOriginY
				val distance = sqrt(xdif * xdif + ydif * ydif)
				if(distance > 2F) dragging = true
			}

			if(dragging) {
				offsetX = offsetOriginX + (window.cursorX - cursorOriginX) * zoom
				offsetY = offsetOriginY + (window.cursorY - cursorOriginY) * zoom
			}

			return
		}

		if(button == Button.LEFT_MOUSE) {
			if(dragging) return

			context.write(stagingBuffer) {
				val meshX = (window.cursorX - window.clientWidth / 2 ) * zoom + window.clientWidth / 2 - offsetX
				val meshY = (window.cursorY - window.clientHeight / 2) * zoom + window.clientHeight / 2 - offsetY
				val meshXIndex = (meshX * (WIDTH.toFloat() / meshWidth)).toInt()
				val meshYIndex = (meshY * (HEIGHT.toFloat() / meshHeight)).toInt()

				if(meshXIndex in 0 until WIDTH && meshYIndex in 0 until HEIGHT) {
					val colour = if(erase) BLACK else WHITE
					it[meshYIndex * HEIGHT + meshXIndex] = colour
					updateImage()
				}
			}
		}
	}



	private fun onKeyRelease(button: Button) {
		when(button) {
			Button.Q -> displayLines = !displayLines
			Button.E -> erase = false
			else -> { }
		}
	}


	private fun onKeyPress(button: Button) {
		if(button == Button.E)
			erase = true
	}



	fun run() {
		if(context.surfaceSystem == null)
			throw RuntimeException("No window")

		context.surfaceSystem.onRecord = ::record

		window.onScroll = ::onScroll
		window.onMouseHold = ::onMouseHold
		window.onKeyRelease = ::onKeyRelease
		window.onKeyPress = ::onKeyPress

		window.show()

		centre()

		while(true) {
			val frameStart = System.nanoTime()

			WindowManager.pollEvents()
			if(WindowManager.windows.isEmpty()) break

			if(!Button.RIGHT_MOUSE.isPressed) {
				wasPressed = false
				dragging = false
			}

			context.write(windowUBO) {
				it[0] = window.clientWidth.toFloat()
				it[4] = window.clientHeight.toFloat()
				it[8] = offsetX
				it[12] = offsetY
				it[16] = zoom
			}

			context.write(colourUBO) {
				val alpha = if(displayLines) 0.4F else 0.0F
				it[0] = alpha
				it[4] = alpha
				it[8] = alpha
				it[12] = alpha
			}

			context.surfaceSystem.record()
			context.surfaceSystem.present()

			val elapsedMicroseconds = (System.nanoTime() - frameStart) / 1_000
			if(context.surfaceSystem.swapchain.presentMode == PresentMode.IMMEDIATE &&
				elapsedMicroseconds < frameTime
			) Thread.sleep((frameTime - elapsedMicroseconds) / 1000)
		}
	}


}