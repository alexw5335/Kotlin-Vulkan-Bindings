package kvb.app.demo

import kvb.app.App
import kvb.app.VkContextBuilder
import kvb.vkwrapper.pipeline.Program
import kvb.vulkan.*
import kvb.window.Windows
import kvb.window.winapi.WinApi
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

object Demo3 : App() {


	val window = Windows.create("My Window", 0, 0, 500, 500)



	override val context = object : VkContextBuilder() {

		override val window = this@Demo3.window

		override val isDebugEnabled = true

		override val presentMode = PresentMode.IMMEDIATE

	}.build()



	private val vertexBuffer = context.vertexBuffer(128 * 128 * 12 * 4) {
		var index = 0
		val scale = 3F
		for(x in 0 until 128) {
			for(y in 0 until 128) {
				val xFloat = x.toFloat() * scale
				val yFloat = y.toFloat() * scale

				it.setFloats(index, floatArrayOf(
					xFloat, yFloat,
					xFloat + scale, yFloat,
					xFloat, yFloat + scale,
					xFloat, yFloat + scale,
					xFloat + scale, yFloat + scale,
					xFloat + scale, yFloat
				))

				index += 12 * 4
			}
		}
	}

	val binaryBuffer = context.uniformBuffer(128 * 128 / 32) {
		it[0] = Byte.MAX_VALUE
	}

	private val ubo = context.uniformBuffer(4 * 2 + 4 * 2 + 4)



	private val uboDescriptor = context.descriptorPool.buildSet {
		vertexUniform(ubo)
	}

	private val binaryDescriptor = context.descriptorPool.buildSet {
		vertexUniform(binaryBuffer)
	}



	object BinaryTextureProgram : Program {

		override val device = context.device

		override val descriptors = mapOf(
			0 to uboDescriptor,
			1 to binaryDescriptor
		)

		override val pipeline = context.device.buildGraphicsPipeline {
			vertexBinding {
				vec2() // pos
			}

			renderPass(context.surfaceSystem!!.renderPass)
			shaders(context.shaderDirectory["binary_texture2"])
			layout(descriptors)
			topology(PrimitiveTopology.TRIANGLE_LIST)
			noBlendAttachment()
			dynamicViewportAndScissor()
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
			val test = 128*128*2
			it.draw(vertexCount = test * 3, instanceCount = test)
		}

		context.surfaceSystem.record()

		window.show()

		while(true) {
			val frameStart = System.nanoTime()

			Windows.update()
			if(Windows.windows.isEmpty()) break

			if(WinApi.getKeyState(0x01) and 0x8000 != 0) {
				if(!wasPressed) {
					offsetOriginX = offsetX
					offsetOriginY = offsetY
					cursorOriginX = window.cursorX.toFloat()
					cursorOriginY = window.cursorY.toFloat()
				}

				wasPressed = true

				offsetX = offsetOriginX + (window.cursorX - cursorOriginX) * zoom
				offsetY = offsetOriginY + (window.cursorY - cursorOriginY) * zoom
			} else {
				wasPressed = false
			}

			context.write(ubo) {
				it[0] = window.clientWidth.toFloat()
				it[4] = window.clientHeight.toFloat()
				it[8] = offsetX
				it[12] = offsetY
				it[16] = zoom
			}

			context.surfaceSystem.present()

			val elapsedMicroseconds = (System.nanoTime() - frameStart) / 1_000
			println(elapsedMicroseconds)
			//if(elapsedMicroseconds < frameTime) Thread.sleep((frameTime - elapsedMicroseconds) / 1000)
		}
	}


}