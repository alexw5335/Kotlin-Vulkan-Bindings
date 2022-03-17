package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.BaseDefaults
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.event.CharEvent
import kvb.engine.gui.event.FocusGainEvent
import kvb.engine.gui.event.FocusLossEvent
import kvb.engine.gui.event.PressEvent
import kvb.engine.gui.font.Fonts
import kvb.engine.gui.layout.Alignment
import kvb.engine.gui.layout.Padding

class TextBox : Base() {


	val textBase = addChildInternal(TextBase()) { active = false }

	val caret = addChildInternal(Caret())

	var backgroundColour = BaseDefaults.controlColour

	var border = BaseDefaults.controlBorder

	var borderColour = BaseDefaults.controlBorderColour

	var hAlignment = Alignment.START
		set(value) { field = value; shouldAlign = true }

	var vAlignment = Alignment.START
		set(value)  { field = value; shouldAlign = true }



	init {
		width = BaseDefaults.textBoxWidth
		height = BaseDefaults.textBoxHeight
		padding = BaseDefaults.textBoxPadding

		textBase.scale = 2F
		textBase.lineSpacing = 1f

		focussable = true
		focusOnPress = true
	}



	override fun align() {
		textBase.wrapWidth = interiorWidth
		hAlign(hAlignment, textBase)
		vAlign(vAlignment, textBase)

		caret.width = textBase.scale

		caret.height = Fonts.font.size.toFloat() * textBase.scale

		textBase.paragraph?.lines?.last()?.let {
			var x = textBase.x + it.x

			for(c in it.chars)
				x += c.width * textBase.scale + textBase.scale

			caret.x = x
			caret.y = textBase.y + it.y
		}

		if(textBase.paragraph == null) {
			caret.x = padding.left
			caret.y = padding.top
		}
	}



	override fun focusGainAction(event: FocusGainEvent) {
		super.focusGainAction(event)
		caret.isBlinking = true
	}



	override fun focusLossAction(event: FocusLossEvent) {
		super.focusLossAction(event)
		caret.isBlinking = false
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