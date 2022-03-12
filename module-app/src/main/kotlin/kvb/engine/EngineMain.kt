package kvb.engine

import kvb.core.Platforms
import kvb.engine.gui.*
import kvb.engine.gui.layout.Alignment
import kvb.engine.gui.layout.Padding
import kvb.engine.gui.layout.VOrientation
import kvb.engine.vulkan.VkContextBuilder



fun engineConfig(block: EngineBuilder.() -> Unit) = EngineBuilder.also(block)

fun vulkanConfig(block: VkContextBuilder.() -> Unit) = VkContextBuilder.also(block)



fun main() {
	Platforms.init()
	//ShaderCreation.compileAll("res/shader/gui", "res/shader/gui/out")

	engineConfig {
		windowX = 0
		windowY = 0
		windowWidth = 900
		windowHeight = 600
	}

	Engine

	val root = vbox {
		spacing = 50F
		hAlignment = Alignment.CENTRE
		vAlignment = Alignment.START
		padding = Padding(50F)

		rect {
			width = 200F
			height = 100F
			colour = Colour(0F, 0.5F, 0F)
		}

		hbox {
			pack = true
			spacing = 10F

			rect {
				width = 100F
				height = 100F
				colour = Colour(0F, 0F, 1F)
			}

			rect {
				width = 50F
				height = 50F
				colour = Colour(0F, 0F, 1F)
			}
		}

		button {
			textBase = SimpleText("Ab c d e fg h i j kl m n op qr", 2F, 0F, width)
		}

		toggleButton { }

	/*	addChild(SimpleText("public static void main(String[] args) { System.out.println(\"Hello World\"); }",
			2F,
			2F,
			400F
		))*/
	}

	Engine.gui = Gui(root)

	Engine.run()
}