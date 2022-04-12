package kvb.engine

import kvb.core.Core
import kvb.engine.gui.*
import kvb.engine.gui.layout.*
import kvb.engine.gui.model.ColourRectModel
import kvb.engine.gui.type.CheckBox
import kvb.engine.gui.type.ScrollBar
import kvb.engine.gui.type.Slider
import kvb.vkwrapper.shader.ShaderCreation
import kvb.vulkan.*



fun engine(block: EngineBuilder.() -> Unit) {
	Core.init()
	block(EngineBuilder)
	Engine.run()
}



fun main() {
	run()
}



fun run() = engine {
	vulkan {
		presentMode = PresentMode.FIFO
		sampleCount = SampleCountFlags._4
	}

	windowWidth = 900
	windowHeight = 600
	initialRoot = ::test
}



fun test() = hbox {

	alignment = DualAlignment.CENTRE_CENTRE
	button {
		width = 200F
		height = 60F
		padding = Padding(10F)
		border = Padding(5F)
		alignment = DualAlignment.CENTRE_CENTRE

		with(textBase) {
			text = "CLICK ME"
			wrapWidth = 1000000F
			scale = 5

			on<ClickEvent> {
				println("Clicked")
			}
		}
	}
}



class ScrollPane : Base(), Scrollable {


	var hScrollBar = addChildInternal(ScrollBar(Horizontal, this))

	val vScrollBar = addChildInternal(ScrollBar(Vertical, this))

	var contentWidth = 400F

	var contentHeight = 2000F

	override val scrollableWidthRatio get() = width / contentWidth

	override val scrollableHeightRatio get() = height / contentHeight



	override fun onScroll(orientation: Orientation, ratio: Float) {

	}



	init {
		width = 200F
		height = 300F
		padding = Padding(5F)
		model = ColourRectModel()
		model.colour = BaseDefaults.controlColour
		border = BaseDefaults.controlBorder
		model.borderColour = BaseDefaults.controlBorderColour
	}



	override fun align() {
		vScrollBar.height = interiorHeight
		vScrollBar.width = 8F
		align(DualAlignment.TOP_RIGHT, vScrollBar)
		hScrollBar.width = interiorWidth - vScrollBar.width - padding.right
		hScrollBar.height = 8F
		align(DualAlignment.BOTTOM_LEFT, hScrollBar)
	}

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

	textBox {
		alignment = DualAlignment.CENTRE_CENTRE
		textBase.alignment = TextAlignment.CENTRE
	}

	vbox {
		pack = true
		spacing = 20F

/*		text {
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

		}*/

		addChild(Slider(Horizontal)) { }

		addChild(CheckBox()) { }

		addChild(ScrollPane())
	}
}