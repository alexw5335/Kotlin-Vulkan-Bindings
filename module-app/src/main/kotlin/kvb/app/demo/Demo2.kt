package kvb.app.demo

import kvb.app.App
import kvb.app.VkContextBuilder
import kvb.vkwrapper.handle.DescriptorSet
import kvb.vkwrapper.pipeline.Program
import kvb.vulkan.*
import kvb.window.Windows

object Demo2 : App() {


	val window = Windows.createWindow("My Window", 0, 0, 1000, 600)



	override val context = object : VkContextBuilder() {

		override val window = this@Demo2.window

		override val isDebugEnabled = true

		override val presentMode = PresentMode.FIFO

	}.build()



	val imageView = context.loadImageRgba("res/sdf.png")

	val sampler = context.device.createSampler(Filter.LINEAR, Filter.LINEAR)



	object BinaryTextureProgram : Program {

		override val device = context.device

		private val descriptorSet = context.descriptorPool.buildSet {
			fragmentCominedSampler(ImageLayout.SHADER_READ_ONLY_OPTIMAL, imageView, sampler)
		}

		override val descriptors = mapOf(0 to descriptorSet)

		override val pipeline = context.device.buildGraphicsPipeline {
			vertexBinding {
				vec2() // position
				vec2() // texCoords
			}

			renderPass(context.surfaceSystem!!.renderPass)
			shaders(context.shaderDirectory["binary_texture"])
			layout(descriptors)
			topology(PrimitiveTopology.TRIANGLE_STRIP)
			noBlendAttachment()
			dynamicViewportAndScissor()
		}

	}



	private val vertexBuffer = context.vertexBuffer(4 * 4 * 4) {
		it.setFloats(0, floatArrayOf(
			-1F, 1F, 0F, 0F,
			1F, 1F, 1F, 0F,
			-1F, -1F, 0F, 1F,
			1F, -1F, 1F, 1F
		))
	}



	private val windowSizeBuffer = context.uniformBuffer(4 * 2);



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
				it[1] = window.height.toFloat()
			}
			context.surfaceSystem.present()
		}
	}


}