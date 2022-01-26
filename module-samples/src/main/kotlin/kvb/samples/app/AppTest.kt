package kvb.samples.app

import kvb.core.memory.MemStacks
import kvb.vkwrapper.shader.FileShaderCollection
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.BufferUsageFlags
import kvb.vulkan.PrimitiveTopology
import kvb.window.winapi.WinApi
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

object AppTest {


	val window = WinApi.createWindow("My window", 0, 0, 700, 700)



	val context = object : ContextBuilder() {

		override val window = this@AppTest.window

		override val isDebugEnabled = true

	}.build()



	val shaders = ShaderDirectory("res/shader/out", context.device)



	object Shader : FileShaderCollection(shaders, "simple") {

		override val pipeline = device.buildGraphicsPipeline {
			vertexBinding { vec2() }
			renderPass(context.surfaceSystem!!.renderPass)
			shaders(this@Shader)
			topology = PrimitiveTopology.TRIANGLE_STRIP
			singleColourBlendAttachment()
			dynamicViewportAndScissor()
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
		context.surfaceSystem!!.onRecord = {
			Shader.bind(it)
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
		}
	}


}