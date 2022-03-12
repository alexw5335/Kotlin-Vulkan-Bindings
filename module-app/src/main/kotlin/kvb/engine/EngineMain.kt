package kvb.engine

import kvb.core.Platforms
import kvb.engine.gui.*
import kvb.engine.gui.layout.Alignment
import kvb.engine.gui.layout.Padding
import kvb.engine.vulkan.VkContextBuilder
import kvb.vulkan.*



fun engineConfig(block: EngineBuilder.() -> Unit) = EngineBuilder.also(block)

fun vulkanConfig(block: VkContextBuilder.() -> Unit) = VkContextBuilder.also(block)



fun run() {
	Platforms.init()
	//ShaderCreation.compileAll("res/shader/gui", "res/shader/gui/out")

	vulkanConfig {
		sampleCount = SampleCountFlags._4
	}

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
			with(textBase) {
				text = "Click Me!"
				scale = 2F
				lineSpacing = 1F
				wrapWidth = this@button.interiorWidth
			}
		}

		toggleButton { }

		text {
			text = "public static void main(String[] args) { System.out.println(\"Hello World\"); }"
			scale = 2F
			lineSpacing = 1F
			wrapWidth = 400F
		}
	}

	Engine.gui = Gui(root)

	Engine.run()
}