package kvb.samples.app

import kvb.core.memory.MemStacks
import kvb.samples.sample0.Circles
import kvb.samples.sample0.SampleShader
import kvb.vkwrapper.shader.FileShaderCollection
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.BufferUsageFlags
import kvb.vulkan.PrimitiveTopology
import kvb.window.winapi.WinApi

object AppTest {


	val window = WinApi.createWindow("My window", 0, 0, 700, 700)



	val context = object : ContextBuilder() {

		override val window = this@AppTest.window

		override val isDebugEnabled = true

	}.build()



	val shaders = ShaderDirectory("res/shader/out", context.device)



	val shader = object : FileShaderCollection(shaders, "simple") {

		override val attributes = listOf(
			vec2Attrib(location = 0, binding = 0, offset = 0)
		)

		override val bindings = listOf(
			binding(binding = 0, stride = 2 * 4)
		)

		override val pipeline = device.buildGraphicsPipeline {
			it.renderPass = context.surfaceSystem!!.renderPass
			it.shaders(this)
			it.emptyLayout()
			it.topology = PrimitiveTopology.TRIANGLE_STRIP
			it.singleColourBlendAttachment()
			it.dynamicViewportAndScissor()
		}

	}



	val vertexBuffer = context.device.createBuffer(
		size = 24,
		usage = BufferUsageFlags.VERTEX_BUFFER
	).also {
		it.bindMemory(context.memoryManager.stagingAllocator.allocate(it))
		it.memory.mapWhole()

		it.flush {
			it[0] = 0F
			it[4] = 0F
			it[8] = 1F
			it[12] = 1F
			it[16] = 1F
			it[20] = 0F
		}
	}



	fun run() {
		Runtime.getRuntime().exec("res/shader/compile.bat").waitFor()

		context.surfaceSystem!!.onRecord = {
			it.bindPipeline(shader.pipeline!!)
			it.bindVertexBuffer(vertexBuffer)
			it.draw(vertexCount = 3, instanceCount = 1)
		}

		context.surfaceSystem.record()

		window.show()

		while(true) {
			WinApi.update()
			if(WinApi.windows.isEmpty()) break
			context.surfaceSystem.present()
			Thread.sleep(16)
			println(MemStacks.default.bytesUsed)
		}
	}


}