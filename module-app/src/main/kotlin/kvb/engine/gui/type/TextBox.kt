package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.BaseDefaults
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.event.CharEvent
import kvb.engine.gui.event.FocusGainEvent
import kvb.engine.gui.event.FocusLossEvent
import kvb.engine.gui.event.PressEvent
import kvb.engine.gui.font.Fonts
import kvb.engine.gui.font.TextCollision
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

	private var collision: TextCollision? = null
		set(value) { field = value; onTextCollision(value) }



	private fun onTextCollision(collision: TextCollision?) {
		caret.isBlinking = collision != null

		if(collision != null) {
			caret.x = textBase.x + collision.x
			caret.y = textBase.y + collision.y
		}
	}



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
	}



	override fun focusLossAction(event: FocusLossEvent) {
		super.focusLossAction(event)
		collision = null
	}



	override fun pressAction(event: PressEvent) {
		super.pressAction(event)
		collision = textBase.paragraph?.collision(event.cursorX, event.cursorY)
	}



	override fun charAction(event: CharEvent) {
		super.charAction(event)

		val collision = this.collision ?: return

		if(textBase.text.isEmpty()) return

		val totalIndex = collision.totalCharIndex()

		if(event.char.code == 8) {
			textBase.text = if(totalIndex == textBase.text.length)
				textBase.text.dropLast(1)
			else
				buildString {
					append(textBase.text.dropLast(textBase.text.length - totalIndex))
					append(textBase.text.drop(totalIndex))
				}
		} else {
			if(event.char !in Fonts.font) return

			textBase.text = if(totalIndex == textBase.text.length)
				textBase.text + event.char
			else
				buildString {
					append(textBase.text.dropLast(textBase.text.length - totalIndex))
					append(event.char)
					append(textBase.text.drop(totalIndex))
				}
		}
	}



	override fun renderThis(x: Float, y: Float) {
		GuiGraphics.renderBorder(x, y, width, height, borderColour, border)
		GuiGraphics.renderRect(x, y, width, height, backgroundColour)
	}


}