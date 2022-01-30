package kvb.app.demo

import kvb.app.App
import kvb.app.VkContextBuilder
import kvb.vkwrapper.pipeline.Program
import kvb.vulkan.*
import kvb.window.Windows

object Demo2 : App() {


	val window = Windows.create("My Window", 0, 0, 256, 256)



	override val context = object : VkContextBuilder() {

		override val window = this@Demo2.window

		override val isDebugEnabled = true

		override val presentMode = PresentMode.FIFO

	}.build()



	val imageView = context.loadImageRgba("res/font_attempt.png")

	val sampler = context.device.createSampler(Filter.NEAREST, Filter.NEAREST)



	private const val width = 1F
	private val vertexBuffer = context.vertexBuffer(4 * 4 * 4) {
/*		it.setFloats(0, floatArrayOf(
			-1F, 1F, 0F, 0F,
			1F, 1F, 1F, 0F,
			-1F, -1F, 0F, 1F,
			1F, -1F, 1F, 1F
		))*/

		it.setFloats(0, floatArrayOf(
			-1F, -1F, 0F, 0F,
			width, -1F, 1F, 0F,
			-1F, width, 0F, 1F,
			width, width, 1F, 1F
		))
	}



	private val windowSizeBuffer = context.uniformBuffer(4 * 2)



	private val windowSizeDescriptor = context.descriptorPool.buildSet {
		vertexUniform(windowSizeBuffer)
	}

	private val textureDescriptor = context.descriptorPool.buildSet {
		fragmentCominedSampler(ImageLayout.SHADER_READ_ONLY_OPTIMAL, imageView, sampler)
	}



	object BinaryTextureProgram : Program {

		override val device = context.device

		override val descriptors = mapOf(
			0 to windowSizeDescriptor,
			1 to textureDescriptor
		)

		override val pipeline = context.device.buildGraphicsPipeline {
			vertexBinding {
				vec2() // position
				vec2() // texCoords
			}

			renderPass(context.surfaceSystem!!.renderPass)
			shaders(context.shaderDirectory["binary_texture"])
			layout(descriptors)
			topology(PrimitiveTopology.TRIANGLE_STRIP)
			//noBlendAttachment()
			simpleBlendAttachment()
			dynamicViewportAndScissor()
		}

	}




	fun run() {
		context.surfaceSystem!!.onRecord = {
			BinaryTextureProgram.bind(it)
			it.bindVertexBuffer(vertexBuffer)
			it.draw(vertexCount = 4, instanceCount = 2)
		}

		context.surfaceSystem.record()

		window.show()

		while(true) {
			Windows.update()
			if(Windows.windows.isEmpty()) break

			context.write(windowSizeBuffer) {
				it[0] = window.width.toFloat()
				it[4] = window.height.toFloat()
			}

			context.surfaceSystem.present()
		}
	}


}