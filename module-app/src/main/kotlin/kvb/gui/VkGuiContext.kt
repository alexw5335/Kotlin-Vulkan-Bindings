package kvb.gui

import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.Surface
import kvb.vulkan.*

class VkGuiContext(val device: Device, val surface: Surface) {


	val renderPass = device.buildRenderPass {
		it.presentAttachment(surface.formats)

		it.colourSubpass()

		it.dependency(
			srcSubpass    = VK_SUBPASS_EXTERNAL,
			dstSubpass    = 0,
			srcStageMask  = PipelineStageFlags { COLOR_ATTACHMENT_OUTPUT },
			dstStageMask  = PipelineStageFlags { COLOR_ATTACHMENT_OUTPUT },
			srcAccessMask = AccessFlags(0),
			dstAccessMask = AccessFlags { COLOR_ATTACHMENT_WRITE }
		)
	}


}