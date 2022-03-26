package kvb.engine

import kvb.core.Core
import kvb.engine.gui.*
import kvb.engine.gui.event.ClickEvent
import kvb.engine.gui.layout.Alignment
import kvb.engine.gui.layout.Padding
import kvb.engine.gui.layout.TextAlignment
import kvb.engine.gui.model.BaseModel
import kvb.engine.vulkan.VkContextBuilder
import kvb.vkwrapper.shader.ShaderCreation
import kvb.vulkan.*



fun engineConfig(block: EngineBuilder.() -> Unit) = EngineBuilder.also(block)

fun vulkanConfig(block: VkContextBuilder.() -> Unit) = VkContextBuilder.also(block)



fun main() {
	val handler: (Int) -> Unit = { println(it) }
	val handler2: (Any) -> Unit = handler as (Any) -> Unit
	handler2(1)

 	//run()
}



fun run() {
	Core.init()
	ShaderCreation.compileAll("res/shader/gui", "res/shader/gui/out")

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
				text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 for(i in 0 until 10) { test[2*i] == 15 + i - 2; } 4-3+8*5/6"
				wrapWidth = 400F
				lineSpacing = 1F
				scale = 2
			}

			button {
				with(textBase) {
					text = "build"
					scale = 3
				}

				onClick {
					var value = 0L

					for((i, p) in pixels.withIndex())
						if(p.toggled)
							value = value or (1L shl i)

					println(value)
				}
			}

			textBox {
				textBase.alignment = TextAlignment.LEFT
			}

			toggleButton {

			}
		}
	}

	Engine.gui = Gui(root)

	Engine.run()
}