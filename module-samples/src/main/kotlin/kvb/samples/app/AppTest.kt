package kvb.samples.app

import kvb.vkwrapper.shader.FileShaderCollection
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.PrimitiveTopology
import kvb.window.winapi.WinApi

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
			topology(PrimitiveTopology.TRIANGLE_STRIP)
			singleColourBlendAttachment()
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


	/*
	Three factors:

	host-visible
	device-local
	host-coherent

	If a memory write doesn't need to happen instantly, then it will be flushed before the next frame.
	If a memory write needs to occur instantly, then it will be flushed immediately after the write occurs.
	If the memory is host-coherent, then flushing is not necessary. The host-coherent property of the memory is not
	relevant to the API. It is only used internally to control flushing, although the API user should still specify
	whether the memory write must be made visible immediately or not (defaulting to immediately).

	Small buffers will be placed in host-visible, device-local memory, even if they are persistent. If no such memory
	exists, then they will be placed in host-visible memory. Device-local memory is a secondary priority for small
	buffers as they likely do not need such efficient access.

	 */


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