package kvb.engine.gui

import kvb.engine.gui.event.*



fun Base.hoverEvent(cursorX: Float, cursorY: Float) = HoverEvent(this, cursorX, cursorY).bubble()

fun Base.pressEvent(cursorX: Float, cursorY: Float) = PressEvent(this, cursorX, cursorY).bubble()

fun Base.mouseEnterEvent(cursorX: Float, cursorY: Float) = MouseEnterEvent(this, cursorX, cursorY).bubble()

fun Base.mouseExitEvent(cursorX: Float, cursorY: Float) = MouseExitEvent(this, cursorX, cursorY).bubble()

fun Base.holdEvent(cursorX: Float, cursorY: Float, originX: Float, originY: Float, hovered: Boolean) = HoldEvent(this, cursorX, cursorY, originX, originY, hovered).bubble()

fun Base.releaseEvent(cursorX: Float, cursorY: Float) = ReleaseEvent(this, cursorX, cursorY).bubble()

fun Base.clickEvent(cursorX: Float, cursorY: Float) = ClickEvent(this, cursorX, cursorY).bubble()



fun Base.onHover(action: (HoverEvent) -> Unit) = handlers.add(HoverEvent.Handler(action))

fun Base.onPress(action: (PressEvent) -> Unit) = handlers.add(PressEvent.Handler(action))

fun Base.onMouseEnter(action: (MouseEnterEvent) -> Unit) = handlers.add(MouseEnterEvent.Handler(action))

fun Base.onMouseExit(action: (MouseExitEvent) -> Unit) = handlers.add(MouseExitEvent.Handler(action))

fun Base.onHold(action: (HoldEvent) -> Unit) = handlers.add(HoldEvent.Handler(action))

fun Base.onRelease(action: (ReleaseEvent) -> Unit) = handlers.add(ReleaseEvent.Handler(action))

fun Base.onClick(action: (ClickEvent) -> Unit) = handlers.add(ClickEvent.Handler(action))