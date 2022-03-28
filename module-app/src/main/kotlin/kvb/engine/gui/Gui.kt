package kvb.engine.gui

import kvb.engine.Engine
import kvb.window.Window
import kvb.window.input.InputAction
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


	var dragCandidate: Base? = null

	var dragFocus: Base? = null

	var dragOriginX = 0F

	var dragOriginY = 0F

	val dragging get() = dragCandidate != null || dragFocus != null



	/*
	Events
	 */



	fun assignFocus(base: Base?) {
		removeFocus()
		focussed = base
		focussed?.createEvent { FocusGainEvent(it) }
	}



	fun removeFocus() {
		focussed?.createEvent { FocusLossEvent(it) }
		focussed = null
	}



	fun onCharInput(char: Char) {
		focussed?.createEvent { CharEvent(it, char) }
	}



	fun onButtonInput(button: InputButton, action: InputAction, mouseX: Float, mouseY: Float) {
		focussed?.createEvent { ButtonInputEvent(it, mouseX, mouseY, button, action) }

		hovered?.let {
			if(dragging) return

			if(it.draggable && it.dragPredicate()) {
				dragCandidate = it
				dragOriginX = mouseX
				dragOriginY = mouseY
			}
		}
	}



	fun onWindowResize(width: Float, height: Float) {
		root.width = width
		root.height = height
	}



	fun onPress(mouseX: Float, mouseY: Float) {
		pressed = hovered

		// No press events while dragging
		if(!dragging)
			focussed?.createEvent { PressEvent(it, mouseX, mouseY) }
	}



	fun onRelease(mouseX: Float, mouseY: Float) {
		// No click events while dragging
		if(!dragging && pressed == hovered)
			hovered?.createEvent { ClickEvent(it, mouseX, mouseY) }

		if(!dragging)
			hovered?.createEvent { ReleaseEvent(it, mouseX, mouseY) }

		pressed = null
	}



	fun onHold(cursorX: Float, cursorY: Float) {
		if(!dragging)
			pressed?.createEvent { HoldEvent(it, cursorX, cursorY) }
	}



	fun onMouseMove(mouseX: Float, mouseY: Float) { }



	fun handleMousePos(mouseX: Float, mouseY: Float) {
		val new = root.checkCollision(mouseX, mouseY)

		if(new != hovered) {
			if(!dragging) {
				hovered?.createEvent { MouseExitEvent(it, mouseX, mouseY) }
				new?.createEvent { MouseEnterEvent(it, mouseX, mouseY) }
			}

			hovered = new
		}

		if(!dragging)
			hovered?.createEvent { HoverEvent(it, mouseX, mouseY) }

		dragFocus?.let { focus ->
			if(!focus.dragPredicate()) {
				dragFocus?.createEvent { DragEndEvent(it, mouseX, mouseY) }
				dragFocus = null
				return@let
			} else {
				dragFocus?.createEvent { DragUpdateEvent(it, mouseX, mouseY) }
			}
		}

		dragCandidate?.let { candidate ->
			if(!candidate.dragPredicate()) {
				dragCandidate = null
				return@let
			}

			val x = mouseX - dragOriginX
			val y = mouseY - dragOriginY

			if(candidate.dragImmediately || x*x + y*y >= candidate.dragThreshold) {
				dragCandidate = null
				dragFocus = candidate
				dragFocus?.createEvent { DragStartEvent(it, mouseX, mouseY) }
			}
		}
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