package kvb.samples.sample0

import kvb.vkwrapper.handle.CommandBuffer
import kvb.vulkan.PrimitiveTopology
import kotlin.math.sin

object SampleShader : AppShader("sample") {


	override fun destroy() {
		super.destroy()
		descriptorSet.layout.destroy()
		uniformBuffer.destroy()
		uniformBuffer2.destroy()
		vertexBuffer.destroy()
	}



	val uniformBuffer = context.createUniformBuffer(16L)

	val uniformBuffer2 = context.createUniformBuffer(8L)



	val descriptorSet = context.uniformPool.buildSet {
		vertexWriteUniform(uniformBuffer, size = 16L)
		vertexWriteUniform(uniformBuffer2, size = 8L)
	}



	override val pipeline = context.device.buildGraphicsPipeline {
		vertexBinding {
			vec2()
			vec3()
		}

		shaders(this@SampleShader)
		renderPass(context.renderPass)
		layout(descriptorSet)
		topology = PrimitiveTopology.TRIANGLE_FAN
		singleColourBlendAttachment()
		dynamicViewportAndScissor()
	}



	private val vertexBuffer = context.createVertexBuffer(Circles.vertices.size * 4L).apply {
		flush {
			it.setFloats(0, Circles.vertices)
		}
	}



	fun record(commandBuffer: CommandBuffer) {
		bind(commandBuffer)
		commandBuffer.bindVertexBuffer(vertexBuffer)
		commandBuffer.draw(vertexCount = Circles.numSections + 2, instanceCount = 1)
	}



	var time = 0F



	fun update() {
		uniformBuffer.flush {
			it[0] = context.surface.width.toFloat()
			it[4] = context.surface.height.toFloat()
			it[8] = context.surface.width / 2F
			it[12] = context.surface.height / 2F
		}

		time += 0.02F

		uniformBuffer2.flush {
			it[0] = sin(time) * 200F
			it[4] = sin(0.5F*time) * 200F
		}
	}


}