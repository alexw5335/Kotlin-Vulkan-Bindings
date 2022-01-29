package kvb.app.demo

import kvb.app.App
import kvb.app.VkContextBuilder
import kvb.vkwrapper.handle.DescriptorSet
import kvb.vkwrapper.pipeline.Program
import kvb.vulkan.PrimitiveTopology
import kvb.vulkan.ShaderStageFlags
import kvb.window.Windows

object Demo1 : App() {


	val window = Windows.createWindow("My Window", 0, 0, 1000, 600)



	override val context = object : VkContextBuilder() {

		override val window = this@Demo1.window

		override val isDebugEnabled = true

	}.build()



	object SimpleProgram : Program {

		override val device = context.device

		override val pipeline = context.device.buildGraphicsPipeline {
			vertexBinding { vec2() }
			renderPass(context.surfaceSystem!!.renderPass)
			shaders(context.shaderDirectory["simple"])
			emptyLayout()
			topology(PrimitiveTopology.TRIANGLE_STRIP)
			noBlendAttachment()
			dynamicViewportAndScissor()
		}

	}



	val timeBuffer = context.uniformBuffer(4)



	object FireProgram : Program {

		override val device = context.device

		val descriptor = context.descriptorPool.buildSet {
			uniform(1, ShaderStageFlags.FRAGMENT)
			write(timeBuffer, 0L, 4L)
		}

		override val descriptors = mapOf(0 to descriptor)

		override val pipeline = context.device.buildGraphicsPipeline {
			renderPass(context.surfaceSystem!!.renderPass)
			shaders(context.shaderDirectory["fire"])
			layout(descriptors)
			topology(PrimitiveTopology.TRIANGLE_STRIP)
			noBlendAttachment()
			dynamicViewportAndScissor()
		}

	}



	private val vertexBuffer = context.vertexBuffer(4 * 2 * 4) {
		it[0] = -1F
		it[4] = 1F

		it[8] = 1F
		it[12] = 1F

		it[16] = -1F
		it[20] = -1F

		it[24] = 1F
		it[28] = -1F
	}


	var time = 0F

	fun run() {
		context.surfaceSystem!!.onRecord = {
			//SimpleProgram.bind(it)
			//it.bindVertexBuffer(vertexBuffer)
			//it.draw(vertexCount = 4, instanceCount = 2)

			FireProgram.bind(it)
			it.draw(vertexCount = 4, instanceCount = 2)
		}

		context.surfaceSystem.record()

		window.show()

		while(true) {
			Windows.update()
			if(Windows.windows.isEmpty()) break
			context.surfaceSystem.present()
			Thread.sleep(16)
			time += 0.01F
			context.write(timeBuffer) { it[0] = time }
		}
	}


}