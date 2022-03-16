package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.BaseDefaults
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.event.CharEvent
import kvb.engine.gui.event.PressEvent
import kvb.engine.gui.font.Fonts
import kvb.engine.gui.layout.Alignment

class TextBox : Base() {


	val textBase = addChildInternal(TextBase()) { active = false }

	val caret = addChildInternal(Caret())

	var backgroundColour = BaseDefaults.controlColour

	var border = BaseDefaults.controlBorder

	var borderColour = BaseDefaults.controlBorderColour



	init {
		width = BaseDefaults.textBoxWidth
		height = BaseDefaults.textBoxHeight
		padding = BaseDefaults.textBoxPadding

		textBase.scale = 2F
		textBase.lineSpacing = 1f
	}



	override fun pressAction(event: PressEvent) {
		super.pressAction(event)
		gui.keyFocus = this
	}



	override fun align() {
		textBase.wrapWidth = interiorWidth
		hAlign(Alignment.START, textBase)
		vAlign(Alignment.START, textBase)

		caret.x = 50F
		caret.y = 50F
		caret.height = 15F
	}



	override fun charAction(event: CharEvent) {
		super.charAction(event)

		if(event.char.code == 8) {
			if(textBase.text.isNotEmpty())
				textBase.text = textBase.text.dropLast(1)
		} else {
			if(event.char in Fonts.font)
				textBase.text += event.char
		}
	}



	override fun renderThis(x: Float, y: Float) {
		GuiGraphics.renderRect(
			x - border.left,
			y - border.top,
			width + border.horizontal,
			height + border.vertical,
			borderColour
		)

		GuiGraphics.renderRect(x, y, width, height, backgroundColour)
	}


}