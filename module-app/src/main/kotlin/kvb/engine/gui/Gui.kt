package kvb.engine.gui

import kvb.engine.Engine
import kvb.engine.gui.event.ButtonInputEvent
import kvb.engine.gui.event.HoverEvent
import kvb.engine.gui.type.Button
import kvb.window.Window
import kvb.window.input.InputButton

class Gui(private val root: Base) {


	/*
	Variables
	 */



	/**
	 * The [Base] over which the cursor is located.
	 */
	var hovered: Base? = null
		private set

	/**
	 * The [Base] over which the cursor was located when the last press event was triggered.
	 */
	var pressed: Base? = null
		private set

	/**
	 * The [Base] that is currently receiving input events. This is usually assigned when pressing on a base.
	 */
	var focussed: Base? = null
		private set



	/**
	 * The cursor's x position when the last new press event was triggered.
	 */
	private var pressOriginX = 0F

	/**
	 * The cursor's y position when the last new press event was triggered.
	 */
	private var pressOriginY = 0F



	fun assignFocus(base: Base?) {
		removeFocus()
		this.focussed = base
		this.focussed?.focusGainEvent()
	}



	fun removeFocus() {
		focussed?.focusLossEvent()
		focussed = null
	}



	/*
	Events
	 */



	fun onCharInput(char: Char) {
		focussed?.charEvent(char)
	}



	fun onButtonInput(button: InputButton, type: ButtonInputEvent.Type, repeatCount: Int = 1) {
		focussed?.buttonInputEvent(button, type, repeatCount)
	}



	fun onWindowResize(width: Float, height: Float) {
		root.width = width
		root.height = height
	}



	fun onPress(cursorX: Float, cursorY: Float) {
		pressed = hovered

		pressOriginX = cursorX
		pressOriginY = cursorY

		pressed?.pressEvent(cursorX, cursorY)
	}



	fun onRelease(cursorX: Float, cursorY: Float) {
		if(pressed == hovered)
			hovered?.clickEvent(cursorX, cursorY)

		hovered?.releaseEvent(cursorX, cursorY)

		pressed = null
	}



	fun onHold(cursorX: Float, cursorY: Float) {
		pressed?.holdEvent(cursorX, cursorY, pressOriginX, pressOriginY, hovered == pressed)
	}



	fun onMouseMove(cursorX: Float, cursorY: Float) {
		val new = root.checkCollision(cursorX, cursorY)

		if(new != hovered) {
			hovered?.mouseExitEvent(cursorX, cursorY)
			new?.mouseEnterEvent(cursorX, cursorY)
			hovered = new
		}
	}



	fun handleMousePos(cursorX: Float, cursorY: Float) {
		hovered?.handleEvent(HoverEvent(hovered!!, cursorX, cursorY))
	}



	fun update(window: Window) {
		handleMousePos(window.cursorX, Engine.window.cursorY)

		if(InputButton.LEFT_MOUSE.isPressed)
			onHold(window.cursorX, window.cursorY)

		root.alignCycle()
		root.updateCycle()
	}



	fun render() {
		root.render(0F, 0F)
	}


}