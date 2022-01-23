package kvb.samples

import kvb.core.Platform
import kvb.samples.app.AppTest

fun main() {
	Platform.init()
	AppTest.run()
}



/*
Surface System
- Surface, Swapchain, Viewport, Scissor, SurfaceFormat, ColourSpace, PresentMode,
SurfaceCapabilities, width, height.

RenderPass does not contain references to the swapchain.

Swapchains are used to:
	- provide images as render targets
	- present (VkPresentQueueKHR)

CommandBuffer submission does not depend on swapchains.

Swapchains are only required for use when presenting to the screen.
If rendering to a buffer, then swapchains are not required.

Contexts are not thread-safe (for the moment).

val shader = device.createShader("myShader") {
	vec2Attrib(0, 0, 0)
	vec3Attrib(1, 0, 8)
	binding(0, 20)

	descriptorSet {
		vertexUniform()
		write(uniformBuffer, 0, 16)
		vertexUniform()
		write(uniformBuffer2, 0, 8)
	}

	graphicsPipeline {
		renderPass(context.renderPass)
		topology(TRIANGLE_FAN)
		singleColourBlendAttachment()
		dynamicViewportAndScissor()
	}
}

When flushing buffers, flushed regions should be queued and then flushed all at once
at the beginning of a frame. If the buffer must be flushed immediately, then convenience functions
are provided in the Buffer class. The context handles this.

context.lazyFlush(buffer, 0, 8) {
	it[0] = 1.0F
	it[4] = 2.0F
}

val uniformBuffer1 = context.createUniformBuffer(8)
val uniformBuffer2 = context.createUniformBuffer(8) {
	it[0] = 10
}

 */