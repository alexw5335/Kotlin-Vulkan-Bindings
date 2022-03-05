package kvb.engine

import kvb.engine.gui.Gui
import kvb.engine.gui.GuiGraphics
import kvb.engine.vulkan.VkContext

object Engine {


	val window = EngineBuilder.window

	val gui = Gui(EngineBuilder.root)

	val cursorX get() = window.cursorX

	val cursorY get() = window.cursorY



	init {
		window.onClientSizeChanged = { _, _ ->
			gui.onWindowSizeChanged(window)
		}
	}



	fun renderGui() {
		GuiGraphics.resetAllocator()

		VkContext.surfaceSystem.record {
			GuiGraphics.commandBuffer = it
			GuiGraphics.preRender(window)
			gui.root.render(0F, 0F)
		}

		VkContext.surfaceSystem.present()
	}


}