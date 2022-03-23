package kvb.engine.gui

import kvb.engine.gui.event.*
import kvb.window.input.InputButton



fun Base.hoverEvent(cursorX: Float, cursorY: Float) = HoverEvent(this, cursorX, cursorY).bubble()

fun Base.pressEvent(cursorX: Float, cursorY: Float) = PressEvent(this, cursorX, cursorY).bubble()

fun Base.mouseEnterEvent(cursorX: Float, cursorY: Float) = MouseEnterEvent(this, cursorX, cursorY).bubble()

fun Base.mouseExitEvent(cursorX: Float, cursorY: Float) = MouseExitEvent(this, cursorX, cursorY).bubble()

fun Base.holdEvent(cursorX: Float, cursorY: Float, originX: Float, originY: Float, hovered: Boolean) = HoldEvent(this, cursorX, cursorY, originX, originY, hovered).bubble()

fun Base.releaseEvent(cursorX: Float, cursorY: Float) = ReleaseEvent(this, cursorX, cursorY).bubble()

fun Base.clickEvent(cursorX: Float, cursorY: Float) = ClickEvent(this, cursorX, cursorY).bubble()

fun Base.toggleEvent(toggled: Boolean) = ToggleEvent(this, toggled).bubble()

fun Base.buttonInputEvent(button: InputButton, type: ButtonInputEvent.Type, repeatCount: Int) = ButtonInputEvent(this, button, type, repeatCount).bubble()

fun Base.charEvent(char: Char) = CharEvent(this, char).bubble()

fun Base.focusGainEvent() = FocusGainEvent(this).bubble()

fun Base.focusLossEvent() = FocusLossEvent(this).bubble()



fun Base.onHover(action: (HoverEvent) -> Unit) = handlers.add(HoverEvent.Handler(action))

fun Base.onPress(action: (PressEvent) -> Unit) = handlers.add(PressEvent.Handler(action))

fun Base.onMouseEnter(action: (MouseEnterEvent) -> Unit) = handlers.add(MouseEnterEvent.Handler(action))

fun Base.onMouseExit(action: (MouseExitEvent) -> Unit) = handlers.add(MouseExitEvent.Handler(action))

fun Base.onHold(action: (HoldEvent) -> Unit) = handlers.add(HoldEvent.Handler(action))

fun Base.onRelease(action: (ReleaseEvent) -> Unit) = handlers.add(ReleaseEvent.Handler(action))

fun Base.onClick(action: (ClickEvent) -> Unit) = handlers.add(ClickEvent.Handler(action))

fun Base.onToggle(action: (ToggleEvent) -> Unit) = handlers.add(ToggleEvent.Handler(action))

fun Base.onButtonInput(action: (ButtonInputEvent) -> Unit) = handlers.add(ButtonInputEvent.Handler(action))

fun Base.onChar(action: (CharEvent) -> Unit) = handlers.add(CharEvent.Handler(action))

fun Base.onFocusGain(action: (FocusGainEvent) -> Unit) = handlers.add(FocusGainEvent.Handler(action))

fun Base.onFocusLoss(action: (FocusLossEvent) -> Unit) = handlers.add(FocusLossEvent.Handler(action))