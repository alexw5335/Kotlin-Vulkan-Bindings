package kvb.engine.gui

import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.RenderPass
import kvb.window.Window

object Guis {


	private lateinit var context: GuiContext



	fun init(window: Window, device: Device, renderPass: RenderPass) {
		context = GuiContext(window, device, renderPass)
	}


}