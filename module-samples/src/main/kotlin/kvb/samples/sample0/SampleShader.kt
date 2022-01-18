package kvb.samples.sample0

import kvb.vkwrapper.handle.CommandBuffer
import kvb.vulkan.PrimitiveTopology
import kotlin.math.sin

object SampleShader : AppShader("sample") {


	override val attributes = listOf(
		vec2Attrib(location = 0, binding = 0, offset = 0),
		vec3Attrib(location = 1, binding = 0, offset = 4 * 2)
	)



	override val bindings = listOf(
		binding(binding = 0, stride = 4 * 5)
	)



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
		vertexUniform()
		write(uniformBuffer, 0L, 16L)
		vertexUniform()
		write(uniformBuffer2, 0L, 8L)
	}



	override val pipeline = context.device.buildGraphicsPipeline {
		it.renderPass = context.renderPass
		it.shaders(this)
		it.layout(descriptorSet)
		it.topology = PrimitiveTopology.TRIANGLE_FAN
		it.singleColourBlendAttachment()
		it.dynamicViewportAndScissor()
	}



	private val vertexBuffer = context.createVertexBuffer(Circles.vertices.size * 4L).apply {
		flush {
			it.setFloats(0, Circles.vertices)
		}
	}



	fun record(commandBuffer: CommandBuffer) {
		commandBuffer.bindPipeline(pipeline)
		commandBuffer.bindGraphicsDescriptorSet(pipeline.layout, descriptorSet)
		commandBuffer.bindVertexBuffer(vertexBuffer)
		commandBuffer.draw(vertexCount = Circles.numSections + 2, instanceCount = 1)
	}



	var time = 0F

	fun update() {
		uniformBuffer.flush {
			it.setFloat(0, context.surface.width.toFloat())
			it.setFloat(4, context.surface.height.toFloat())
			it.setFloat(8, context.surface.width / 2F)
			it.setFloat(12, context.surface.height / 2F)
		}

		time += 0.02F

		uniformBuffer2.flush {
			it.setFloat(0, sin(time) * 200F)
			it.setFloat(4, sin(0.5F*time) * 200F)
		}
	}


}