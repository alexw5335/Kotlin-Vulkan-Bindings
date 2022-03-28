package kvb.engine.gui

import kvb.window.input.InputAction
import kvb.window.input.InputButton



abstract class BaseEvent(val source: Base) {

	var finished = false

	fun isValid(c: Class<*>) = c == this::class.java

}



abstract class MouseEvent(source: Base, val mouseX: Float, val mouseY: Float) : BaseEvent(source)



class MouseEnterEvent(source: Base, mouseX: Float, mouseY: Float) : MouseEvent(source, mouseX, mouseY)

class HoverEvent(source: Base, mouseX: Float, mouseY: Float) : MouseEvent(source, mouseX, mouseY)

class MouseExitEvent(source: Base, mouseX: Float, mouseY: Float) : MouseEvent(source, mouseX, mouseY)



class PressEvent(source: Base, mouseX: Float, mouseY: Float) : MouseEvent(source, mouseX, mouseY)

class HoldEvent(source: Base, mouseX: Float, mouseY: Float) : MouseEvent(source, mouseX, mouseY)

class ReleaseEvent(source: Base, mouseX: Float, mouseY: Float) : MouseEvent(source, mouseX, mouseY)

class ClickEvent(source: Base, mouseX: Float, mouseY: Float) : MouseEvent(source, mouseX, mouseY)



class DragStartEvent(source: Base, mouseX: Float, mouseY: Float) : MouseEvent(source, mouseX, mouseY)

class DragUpdateEvent(source: Base, mouseX: Float, mouseY: Float) : MouseEvent(source, mouseX, mouseY)

class DragEndEvent(source: Base, mouseX: Float, mouseY: Float) : MouseEvent(source, mouseX, mouseY)



class ButtonInputEvent(
	source: Base,
	mouseX: Float,
	mouseY: Float,
	val button: InputButton,
	val action: InputAction
) : MouseEvent(source, mouseX, mouseY)



class FocusGainEvent(source: Base) : BaseEvent(source)

class FocusLossEvent(source: Base) : BaseEvent(source)

class ToggleEvent(source: Base, val toggled: Boolean) : BaseEvent(source)

class CharEvent(source: Base, val char: Char) : BaseEvent(source)

class RatioEvent(source: Base, val ratio: Float) : BaseEvent(source)