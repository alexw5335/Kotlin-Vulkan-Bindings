package kvb.samples.app

import kvb.core.FileUtils
import kvb.core.memory.Unsafe
import kvb.vkwrapper.pipeline.ShaderProgram
import kvb.vkwrapper.pipeline.ShaderDirectory
import kvb.vulkan.*
import kvb.window.winapi.WinApi

object App {


	val window = WinApi.createWindow("My window", 0, 0, 700, 700)



	val context = object : ContextBuilder() {

		override val window = this@App.window

		override val isDebugEnabled = true

	}.build()



	val shaderDirectory = ShaderDirectory("res/shader/out", context.device)



	object Shader : ShaderProgram {

		override val device = context.device

		override val pipeline = device.buildGraphicsPipeline {
			vertexBinding { vec2() }
			renderPass(context.surfaceSystem!!.renderPass)
			shaders(shaderDirectory["simple"])
			emptyLayout()
			topology(PrimitiveTopology.TRIANGLE_STRIP)
			noBlendAttachment()
			dynamicViewportAndScissor()
		}

	}



	val image = FileUtils.readRGBA("res/font_attempt.png") { imageData ->
		val stagingBuffer = context.stagingBuffer(imageData.width * imageData.height * 4) {
			Unsafe.copy(imageData.address, it.address, it.byteSize)
		}

		context.device.createImage2D(
			width = imageData.width,
			height = imageData.height,
			format = Format.R8G8B8A8_SRGB,
			usage = ImageUsageFlags { TRANSFER_DST + SAMPLED }
		).also {
			context.memoryManager.imageAllocator.allocate(it).also(it::bindMemory)
			context.transitionImage(it, stagingBuffer)
			stagingBuffer.destroy()
		}
	}



	val imageView = context.device.createImageView(image)



	val sampler = context.device.createSampler(Filter.NEAREST, Filter.NEAREST)



	object TextureShader : ShaderProgram {

		override val device = context.device

		val descriptorSet = context.descriptorPool.buildSet {
			fragmentCominedSampler(ImageLayout.SHADER_READ_ONLY_OPTIMAL, imageView, sampler)
		}

		override val descriptors = mapOf(0 to descriptorSet)

		override val pipeline = device.buildGraphicsPipeline {
			renderPass(context.surfaceSystem!!.renderPass)
			shaders(shaderDirectory["texture"])
			layout(descriptors)
			topology(PrimitiveTopology.TRIANGLE_STRIP)
			simpleBlendAttachment()
			dynamicViewportAndScissor()
		}
	}



	val vertexBuffer = context.vertexBuffer(24) {
		it[0]  = 0F
		it[4]  = 0F
		it[8]  = 1F
		it[12] = 1F
		it[16] = 1F
		it[20] = 0F
	}



	fun run() {
		context.surfaceSystem!!.onRecord = {
			Shader.bind(it)
			it.bindVertexBuffer(vertexBuffer)
			it.draw(vertexCount = 3, instanceCount = 1)

			TextureShader.bind(it)
			it.draw(vertexCount = 4, instanceCount = 2)
		}

		context.surfaceSystem.record()

		window.show()

		while(true) {
			WinApi.pollEvents()
			if(WinApi.windows.isEmpty()) break
			context.surfaceSystem.present()
			Thread.sleep(16)
		}
	}


}