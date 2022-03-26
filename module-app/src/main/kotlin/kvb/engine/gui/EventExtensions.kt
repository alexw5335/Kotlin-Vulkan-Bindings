package kvb.engine.gui

import kvb.engine.gui.event.*
import kvb.window.input.InputAction
import kvb.window.input.InputButton



fun Base.hoverEvent(cursorX: Float, cursorY: Float) = HoverEvent(this, cursorX, cursorY).bubble()

fun Base.pressEvent(cursorX: Float, cursorY: Float) = PressEvent(this, cursorX, cursorY).bubble()

fun Base.mouseEnterEvent(cursorX: Float, cursorY: Float) = MouseEnterEvent(this, cursorX, cursorY).bubble()

fun Base.mouseExitEvent(cursorX: Float, cursorY: Float) = MouseExitEvent(this, cursorX, cursorY).bubble()

fun Base.holdEvent(cursorX: Float, cursorY: Float, originX: Float, originY: Float, hovered: Boolean) = HoldEvent(this, cursorX, cursorY, originX, originY, hovered).bubble()

fun Base.releaseEvent(cursorX: Float, cursorY: Float) = ReleaseEvent(this, cursorX, cursorY).bubble()

fun Base.clickEvent(cursorX: Float, cursorY: Float) = ClickEvent(this, cursorX, cursorY).bubble()

fun Base.toggleEvent(toggled: Boolean) = ToggleEvent(this, toggled).bubble()

fun Base.buttonInputEvent(button: InputButton, action: InputAction, repeatCount: Int) = ButtonInputEvent(this, button, action, repeatCount).bubble()

fun Base.charEvent(char: Char) = CharEvent(this, char).bubble()

fun Base.focusGainEvent() = FocusGainEvent(this).bubble()

fun Base.focusLossEvent() = FocusLossEvent(this).bubble()



fun Base.onClick(action: (ClickEvent) -> Unit) = addHandler(action)