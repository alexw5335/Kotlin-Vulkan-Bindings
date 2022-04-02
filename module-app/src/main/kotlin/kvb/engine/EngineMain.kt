package kvb.engine

import kvb.core.Core
import kvb.engine.gui.*
import kvb.engine.gui.layout.HOrientation
import kvb.engine.gui.layout.TextAlignment
import kvb.engine.gui.type.CheckBox
import kvb.engine.gui.type.Slider
import kvb.vulkan.PresentMode



fun engine(block: EngineBuilder.() -> Unit) {
	Core.init()
	block(EngineBuilder)
	Engine.run()
}



fun main() = engine {
	vulkan {
		presentMode = PresentMode.FIFO
	}

	windowWidth = 900
	windowHeight = 600
	initialRoot = ::root
}



fun root() = hbox {
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

			addHandler<ClickEvent> {
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

		addChild(Slider(HOrientation)) { }

		addChild(CheckBox()) { }
	}
}