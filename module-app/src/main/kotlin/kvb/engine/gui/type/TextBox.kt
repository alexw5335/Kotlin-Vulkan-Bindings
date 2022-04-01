package kvb.engine.gui.type

import kvb.engine.gui.*
import kvb.engine.gui.font.Chars
import kvb.engine.gui.font.Fonts
import kvb.engine.gui.font.TextCollision
import kvb.engine.gui.layout.Alignment
import kvb.window.input.InputButton
import java.lang.Integer.max
import java.lang.Integer.min

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

	private var collisionX = 0F

	private val paragraph get() = textBase.paragraph

	var selectionStartIndex = 0

	var selectionEndIndex = 0

	var selecting = false



	private fun onTextCollision(collision: TextCollision?) {
		if(collision != null) {
			caret.isBlinking = true
			collisionX = collision.x
			caret.x = textBase.x + collision.x - caret.width
			caret.y = textBase.y + collision.y
		} else {
			caret.isBlinking = false
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



	override val draggable = true

	override val dragThreshold = 3F



	override fun align() {
		textBase.wrapWidth = interiorWidth

		hAlign(hAlignment, textBase)
		vAlign(vAlignment, textBase)

		caret.width = textBase.scale.toFloat()
		caret.height = Fonts.font.size.toFloat() * textBase.scale
	}



	private fun onButtonInput(event: ButtonInputEvent) {
		val collision = this.collision ?: return

		if(event.action.isRepeatOrPress) {
			val newCollision = when(event.button) {
				InputButton.LEFT  -> paragraph.leftCollision(collision)
				InputButton.RIGHT -> paragraph.rightCollision(collision)
				InputButton.UP    -> paragraph.upCollision(collision, collisionX)
				InputButton.DOWN  -> paragraph.downCollision(collision, collisionX)
				else              -> return
			}

			newCollision?.let {
				val prevCollisionX = collisionX

				this.collision = it

				if(event.button == InputButton.UP || event.button == InputButton.DOWN)
					collisionX = prevCollisionX
			}
		}
	}



	private fun onPress(event: PressEvent) {
		collision = textBase.paragraph.collision(
			textBase.transformUpXAbsolute(event.mouseX),
			textBase.transformUpYAbsolute(event.mouseY)
		)
	}



	private fun backspaceAt(collision: TextCollision) {
		if(collision.index == 0) return

		val text = textBase.text

		if(collision.index == text.length) {
			if(textBase.text.isEmpty())
				return
			else
				textBase.text = text.dropLast(1)
		} else {
			textBase.text = buildString {
				append(text.dropLast(text.length - collision.index + 1))
				append(text.drop(collision.index))
			}
		}

		this.collision = paragraph.leftCollision(collision)
	}



	private fun addCharAt(collision: TextCollision, char: Char) {
		if(char !in Fonts.font) return

		val text = textBase.text

		if(collision.index == text.length) {
			textBase.text += char
		} else {
			textBase.text = buildString {
				append(text.dropLast(text.length - collision.index))
				append(char)
				append(text.drop(collision.index))
			}
		}

		this.collision = paragraph.rightCollision(collision)
	}



	private fun onChar(event: CharEvent) {
		val collision = this.collision ?: return

		if(event.char == Chars.BACKSPACE)
			backspaceAt(collision)
		else
			addCharAt(collision, event.char)
	}



	override fun eventAction(event: BaseEvent) {
		super.eventAction(event)

		when(event) {
			is FocusLossEvent   -> collision = null
			is PressEvent       -> onPress(event)
			is ButtonInputEvent -> onButtonInput(event)
			is CharEvent        -> onChar(event)

			is DragStartEvent -> {
				val collision = collisionAt(event.mouseX, event.mouseY)
				selectionStartIndex = collision.index
				selecting = true
			}

			is DragUpdateEvent -> {
				val collision = collisionAt(event.mouseX, event.mouseY)
				selectionEndIndex = collision.index
			}

			is DragEndEvent -> {
				selectionEndIndex = collisionAt(event.mouseX, event.mouseY).index
				selecting = false
			}
		}
	}



	private fun collisionAt(x: Float, y: Float) = textBase.paragraph.collision(
		textBase.transformUpXAbsolute(x),
		textBase.transformUpYAbsolute(y)
	)



	override fun renderThis(x: Float, y: Float) {
		GuiGraphics.renderBorder(x, y, width, height, borderColour, border)
		GuiGraphics.renderRect(x, y, width, height, backgroundColour)
	}


}