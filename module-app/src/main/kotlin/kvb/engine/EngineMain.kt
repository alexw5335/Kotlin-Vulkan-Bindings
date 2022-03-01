package kvb.engine

import kvb.core.Platforms
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectLong
import kvb.engine.vulkan.VkContext
import kvb.engine.vulkan.VkContextBuilder
import kvb.vkwrapper.shader.ShaderCreation
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.*
import kvb.window.WindowManager
import kvb.window.winapi.WinApiWindow

fun main() {
	Platforms.init()
	ShaderCreation.compileAll("res/shader/gui", "res/shader/gui/out")

	val window = WindowManager.create("My window", 0, 0, 600, 600)
	window.show()

	VkContextBuilder.also {
		it.debugEnabled = true
		it.windowingEnabled = true
		it.deviceFeatures.geometryShader = VK_TRUE
		it.window = window as WinApiWindow
	}

	val shaderDirectory = ShaderDirectory("res/shader/gui/out", VkContext.device)

	val singleColourRectPipeline = VkContext.device.buildGraphicsPipeline {
		renderPass(VkContext.surfaceSystem.renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 32)
		pushConstant(ShaderStageFlags.FRAGMENT, 32, 16)
		shaders(shaderDirectory["rect"])
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}

	VkContext.surfaceSystem.backgroundColour(0.1F, 0.7F, 0.3F, 1.0F)

	while(true) {
		WindowManager.pollEvents()

		if(WindowManager.windows.isEmpty()) break

		VkContext.surfaceSystem.record {
			it.bindPipeline(singleColourRectPipeline)
			val pushConstants = Unsafe.mallocFloat(8).also { buffer ->
				buffer[0] = window.clientWidth.toFloat()
				buffer[1] = window.clientHeight.toFloat()
				buffer[2] = 100F
				buffer[3] = 100F
				buffer[4] = 1.0F
				buffer[6] = 200F
				buffer[7] = 100F
			}

			val fragPushConstants = Unsafe.mallocFloat(4).also {
				it[0] = 1.0F
				it[1] = 0.0F
				it[2] = 1.0F
				it[3] = 1.0F
			}

			it.pushConstants(singleColourRectPipeline.layout, ShaderStageFlags.VERTEX, 0, 32, DirectLong(pushConstants.address))
			it.pushConstants(singleColourRectPipeline.layout, ShaderStageFlags.FRAGMENT, 32, 16, DirectLong(fragPushConstants.address))
			it.draw(4)
		}

		VkContext.surfaceSystem.present()

		//Thread.sleep(16)
	}
}