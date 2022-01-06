package kvb.samples.sample0

import kvb.core.memory.MemStacks
import kvb.vkwrapper.handle.CommandBuffer
import kvb.vulkan.*
import kotlin.math.sin
import kotlin.random.Random

object SampleShader : AppShader("sample") {


	/*

	Can split layout bindings among multiple sets

	DescriptorSet
		DescriptorSetLayout[]
			DescriptorSetLayoutBinding[]

	layout(binding = 0) uniform UBO {
		vec2 windowSize;
		vec2 offset;
	};

	layout(binding = 1) uniform UBO2 {
		float xOffset2;
		float yOffset2;
	};

	 */



	override val attributes = listOf(
		vec2Attrib(location = 0, binding = 0, offset = 0),
		vec3Attrib(location = 1, binding = 0, offset = 4 * 2)
	)

	override val bindings = listOf(
		binding(binding = 0, stride = 4 * 5)
	)

	override fun destroy() {
		super.destroy()
		descriptorSetLayout.destroy()
		uniformBuffer.destroy()
		uniformBuffer2.destroy()
		vertexBuffer.destroy()
	}



	val uniformBuffer = context.createUniformBuffer(16L)

	val uniformBuffer2 = context.createUniformBuffer(8L)



	val descriptorSetLayout = MemStacks.get {
		val bindings = DescriptorSetLayoutBinding(2) { bindings ->
			bindings[0].let {
				it.binding = 0
				it.descriptorType = DescriptorType.UNIFORM_BUFFER
				it.descriptorCount = 1
				it.stageFlags = ShaderStageFlags.VERTEX
			}

			bindings[1].let {
				it.binding = 1
				it.descriptorType = DescriptorType.UNIFORM_BUFFER
				it.descriptorCount = 1
				it.stageFlags = ShaderStageFlags.VERTEX
			}
		}

		context.device.createDescriptorSetLayout(DescriptorSetLayoutCreateInfo {
			it.bindings = bindings
		})
	}



	val descriptorSet = context.uniformPool.allocateDescriptorSet(descriptorSetLayout)



	init {
		MemStacks.with {
			descriptorSet.updateUniformWrite(uniformBuffer, 0, 16L, binding = 0)
			descriptorSet.updateUniformWrite(uniformBuffer2, 0L, 8L, binding = 1)

			val writes = WriteDescriptorSet(2) { writes ->
				writes[0].let { write ->
					write.dstSet = descriptorSet
					write.dstBinding = 0
					write.dstArrayElement = 0
					write.descriptorType = DescriptorType.UNIFORM_BUFFER
					write.bufferInfo = DescriptorBufferInfo(1) { bufferInfo ->
						bufferInfo[0].let {
							it.buffer = uniformBuffer
							it.offset = 0L
							it.range = 16L
						}
					}
				}

				writes[1].let { write ->
					write.dstSet = descriptorSet
					write.dstBinding = 1
					write.dstArrayElement = 0
					write.descriptorType = DescriptorType.UNIFORM_BUFFER
					write.bufferInfo = DescriptorBufferInfo(1) { bufferInfo ->
						bufferInfo[0].let {
							it.buffer = uniformBuffer2
							it.offset = 0L
							it.range = 8L
						}
					}
				}
			}

			device.updateDescriptorSets(writes)
		}
	}



	override val pipelineLayout = device.createPipelineLayout(descriptorSetLayout)



	override val pipeline = context.device.buildGraphicsPipeline {
		it.renderPass = context.renderPass
		it.shaders(this)
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
		commandBuffer.bindGraphicsDescriptorSet(pipelineLayout, descriptorSet)
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

		time += 0.001F

		uniformBuffer2.flush {
			it.setFloat(0, sin(time) * 200F)
			it.setFloat(4, sin(0.5F*time) * 200F)
		}
	}


}