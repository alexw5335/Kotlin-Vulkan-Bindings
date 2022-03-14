package kvb.engine

import kvb.core.Core
import kvb.engine.gui.*
import kvb.engine.gui.layout.Alignment
import kvb.engine.gui.layout.Padding
import kvb.engine.gui.model.BaseModel
import kvb.engine.vulkan.VkContextBuilder
import kvb.vulkan.*



fun engineConfig(block: EngineBuilder.() -> Unit) = EngineBuilder.also(block)

fun vulkanConfig(block: VkContextBuilder.() -> Unit) = VkContextBuilder.also(block)



fun main() {
	run()
}



fun run() {
	Core.init()
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

	val root = hbox {
		spacing = 20F

		val pixels = ArrayList<PixelBase>()
		anchorPane {
			width = 7 * 50F
			height = 9 * 50F

			for(y in 0 until 9) {
				for(x in 0 until 7) {
					addChild(PixelBase()) {
						this.x = x * 50F
						this.y = y * 50F
					}.also(pixels::add)
				}
			}
		}

		vbox {
			pack = true
			spacing = 20F

			text {
				text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 for(i in 0 until 10) { test[2 * i] = 15 + i; }"
				wrapWidth = 400F
				lineSpacing = 1F
				scale = 2F
			}

			button {
				with(textBase) {
					text = "build"
					wrapWidth = 1000F
					scale = 3F
				}

				onClick {
					var value = 0L

					for((i, p) in pixels.withIndex())
						if(p.toggled)
							value = value or (1L shl i)

					println(value)
				}
			}
		}
	}

	/*val root = vbox {
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

		toggleButton {
			with(textBase) {
				text = "CLICK ME!"
				scale = 3F
				lineSpacing = 1F
				wrapWidth = this@toggleButton.interiorWidth
			}
		}

		text {
			text = "public static void main(String[] args) { System.out.println(\"Hello World\"); }"
			scale = 2F
			lineSpacing = 1F
			wrapWidth = 400F
		}
	}*/

	Engine.gui = Gui(root)

	Engine.run()
}