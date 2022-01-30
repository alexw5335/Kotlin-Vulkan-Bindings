package kvb.app.demo

import kvb.app.App
import kvb.app.VkContextBuilder
import kvb.vkwrapper.pipeline.Program
import kvb.vulkan.*
import kvb.window.Windows
import kvb.window.winapi.WinApi
import java.lang.Float.max
import java.lang.Float.min
import java.lang.Integer.min

object Demo2 : App() {


	val window = Windows.create("My Window", 0, 0, 500, 500)



	override val context = object : VkContextBuilder() {

		override val window = this@Demo2.window

		override val isDebugEnabled = true

		override val presentMode = PresentMode.IMMEDIATE

	}.build()



	val imageView = context.loadImageRgba("res/font_attempt.png")

	val sampler = context.device.createSampler(Filter.NEAREST, Filter.NEAREST)



	private val vertexBuffer = context.vertexBuffer(4 * 4 * 4) {
		it.setFloats(0, floatArrayOf(
			0F, 0F, 0F, 0F,
			800F, 0F, 1F, 0F,
			0F, 800F, 0F, 1F,
			800F, 800F, 1F, 1F
		))
	}



	private val ubo = context.uniformBuffer(4 * 2 + 4 * 2 + 4)



	private val uboDescriptor = context.descriptorPool.buildSet {
		vertexUniform(ubo)
	}

	private val textureDescriptor = context.descriptorPool.buildSet {
		fragmentCominedSampler(ImageLayout.SHADER_READ_ONLY_OPTIMAL, imageView, sampler)
	}



	object BinaryTextureProgram : Program {

		override val device = context.device

		override val descriptors = mapOf(
			0 to uboDescriptor,
			1 to textureDescriptor
		)

		override val pipeline = context.device.buildGraphicsPipeline {
			renderPass(context.surfaceSystem!!.renderPass)
			shaders(context.shaderDirectory["binary_texture"])
			layout(descriptors)
			topology(PrimitiveTopology.TRIANGLE_STRIP)
			simpleBlendAttachment()
			dynamicViewportAndScissor()
		}

	}



	var offsetX = 0F
	var offsetY = 0F
	var zoom = 1F

	var wasPressed = false
	var dragOriginX = 0F
	var dragOriginY = 0F

	val targetFps = 500
	val frameTime = 1_000_000 / targetFps

	fun run() {
		Windows.onScroll = {
			var zoomDelta = -it/1200F
			if(zoom + zoomDelta > 1F) zoomDelta = 1F - zoom
			else if(zoom + zoomDelta < 0.1F) zoomDelta = 0.1F - zoom
			zoom += zoomDelta

			offsetX += (window.clientWidth / 2 - window.cursorX) * -zoomDelta
			offsetY += (window.clientHeight / 2 - window.cursorY) * -zoomDelta
		}

		context.surfaceSystem!!.onRecord = {
			BinaryTextureProgram.bind(it)
			it.bindVertexBuffer(vertexBuffer)
			it.draw(vertexCount = 4, instanceCount = 2)
		}

		context.surfaceSystem.record()

		window.show()

		while(true) {
			val frameStart = System.nanoTime()

			Windows.update()

			if(Windows.windows.isEmpty()) break

			println("${window.clientWidth} ${window.clientHeight}")

			if(WinApi.getKeyState(0x01) and 0x8000 != 0) {
				if(!wasPressed) {
					dragOriginX = window.cursorX.toFloat()
					dragOriginY = window.cursorY.toFloat()
				}

				wasPressed = true

				offsetX += (window.cursorX - dragOriginX) * zoom
				offsetY += (window.cursorY - dragOriginY) * zoom

				dragOriginX = window.cursorX.toFloat()
				dragOriginY = window.cursorY.toFloat()
			} else {
				wasPressed = false
			}

			context.write(ubo) {
				it[0] = window.width.toFloat()
				it[4] = window.height.toFloat()
				it[8] = offsetX
				it[12] = offsetY
				it[16] = zoom
			}

			context.surfaceSystem.present()

			val frameEnd = System.nanoTime()
			val elapsedMicroseconds = (frameEnd - frameStart) / 1_000

			if(elapsedMicroseconds < frameTime) {
				Thread.sleep((frameTime - elapsedMicroseconds) / 1000)
			}
		}
	}


}