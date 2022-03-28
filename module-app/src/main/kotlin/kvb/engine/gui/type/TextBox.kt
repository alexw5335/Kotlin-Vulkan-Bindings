package kvb.engine.gui.type

import kvb.engine.gui.*
import kvb.engine.gui.font.Fonts
import kvb.engine.gui.font.TextCollision
import kvb.engine.gui.layout.Alignment
import kvb.window.input.InputAction
import kvb.window.input.InputButton

class TextBox : Base() {


	val textBase = addChildInternal(TextBase()) { active = false }

	val caret = addChildInternal(Caret())

	var backgroundColour = BaseDefaults.controlColour

	var borderColour = BaseDefaults.controlBorderColour

	var hAlignment = Alignment.START
		set(value) { field = value; shouldAlign = true }

	var vAlignment = Alignment.START
		set(value)  { field = value; shouldAlign = true }

	private var collision: TextCollision? = null
		set(value) { field = value; onTextCollision(value) }

	var collisionX = 0F



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
		border = BaseDefaults.controlBorder

		textBase.scale = 2
		textBase.lineSpacing = 1f

		focussable = true
		focusOnPress = true
	}



	override fun align() {
		textBase.wrapWidth = interiorWidth
		hAlign(hAlignment, textBase)
		vAlign(vAlignment, textBase)

		caret.width = textBase.scale.toFloat()
		caret.height = Fonts.font.size.toFloat() * textBase.scale
	}



	override fun eventAction(event: BaseEvent) {
		super.eventAction(event)

		when(event) {
			is FocusLossEvent -> collision = null

			is PressEvent -> {
				collision = textBase.paragraph?.collision(
					textBase.transformUpXAbsolute(event.mouseX),
					textBase.transformUpYAbsolute(event.mouseY)
				)?.also { collisionX = it.x }
			}

			is ButtonInputEvent -> {
				val collision = this.collision ?: return

				if(event.action != InputAction.REPEAT && event.action != InputAction.PRESS) return

				when(event.button) {
					InputButton.LEFT -> textBase.paragraph?.collision(collision.index - 1)?.let { this.collision = it; collisionX = it.x }
					InputButton.RIGHT -> textBase.paragraph?.collision(collision.index + 1)?.let { this.collision = it; collisionX = it.x }
					InputButton.UP -> textBase.paragraph?.collision(collision.lineIndex - 1, collisionX)?.let { this.collision = it }
					InputButton.DOWN -> textBase.paragraph?.collision(collision.lineIndex + 1, collisionX)?.let { this.collision = it }
					else -> { }
				}
			}

			is CharEvent -> {
				val collision = this.collision ?: return

				if(event.char.code == 8) {
					if(collision.index == 0) return

					textBase.text = if(collision.index == textBase.text.length) {
						if(textBase.text.isEmpty())
							textBase.text
						else
							textBase.text.dropLast(1)
					} else {
						buildString {
							append(textBase.text.dropLast(textBase.text.length - collision.index))
							append(textBase.text.drop(collision.index + 1))
						}
					}

					this.collision = textBase.paragraph!!.collision(collision.index - 1)?.also { collisionX = it.x }
				} else {
					if(event.char !in Fonts.font) return

					textBase.text = if(collision.index == textBase.text.length)
						textBase.text + event.char
					else
						buildString {
							append(textBase.text.dropLast(textBase.text.length - collision.index))
							append(event.char)
							append(textBase.text.drop(collision.index))
						}

					this.collision = textBase.paragraph!!.collision(collision.index + 1)?.also { collisionX = it.x }
				}
			}
		}
	}



	override fun renderThis(x: Float, y: Float) {
		GuiGraphics.renderBorder(x, y, width, height, borderColour, border)
		GuiGraphics.renderRect(x, y, width, height, backgroundColour)
	}


}