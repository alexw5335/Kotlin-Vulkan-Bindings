package kvb.engine.gui

import kvb.engine.Engine
import kvb.engine.NullBase
import kvb.window.Window
import kvb.window.input.InputAction
import kvb.window.input.InputButton
import kotlin.math.sqrt

class Gui(root: Base) {


	/*
	Variables
	 */



	/**
	 * The root GUI component.
	 */
	var root: Base = root
		set(value) {
			field = value
			field.width = width
			field.height = height
			hovered = null
			pressed = null
			focussed = null
			dragCandidate = null
			dragFocus = null
			dragOriginX = 0F
			dragOriginY = 0F
		}



	/**
	 * The width of the window that contains this GUI. This is always the same as that of the [root] base.
	 */
	var width = 0F
		private set

	/**
	 * The height of the window that contains this GUI. This is always the same as that of the [root] base.
	 */
	var height = 0F
		private set

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
	 * The base that is currently being queried every frame for drag starts based on the cursor's position.
	 */
	var dragCandidate: Base? = null
		private set

	/**
	 * The base that is currently receiving drag update events.
	 */
	var dragFocus: Base? = null
		private set

	/**
	 * The cursor's x coordinate when the last drag start event began.
	 */
	var dragOriginX = 0F
		private set

	/**
	 * The cursor's y coordinate when the last drag start event began.
	 */
	var dragOriginY = 0F
		private set

	/**
	 * If drag is either being queried or if a drag event is currently in progress.
	 */
	val dragging get() = dragCandidate != null || dragFocus != null



	/*
	Focus
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



	/*
	Events
	 */



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



	fun onPress(mouseX: Float, mouseY: Float) {
		pressed = hovered

		if(!dragging)
			pressed?.createEvent { PressEvent(it, mouseX, mouseY) }
	}



	fun onRelease(mouseX: Float, mouseY: Float) {
		if(!dragging && pressed == hovered)
			hovered?.createEvent { ClickEvent(it, mouseX, mouseY) }

		if(!dragging)
			hovered?.createEvent { ReleaseEvent(it, mouseX, mouseY) }

		pressed = null
	}



	fun onWindowResize(width: Float, height: Float) {
		this.width = width
		this.height = height
		root.width = width
		root.height = height
	}



	/*
	Update
	 */



	private fun handleMousePos(mouseX: Float, mouseY: Float) {
		checkHovered(mouseX, mouseY)
		checkPressed(mouseX, mouseY)
		checkDragStart(mouseX, mouseY)
		checkDrag(mouseX, mouseY)
	}



	private fun checkPressed(mouseX: Float, mouseY: Float) {
		if(InputButton.LEFT_MOUSE.isPressed)
			if(!dragging)
				pressed?.createEvent { HoldEvent(it, mouseX, mouseY) }
	}



	private fun checkHovered(mouseX: Float, mouseY: Float) {
		if(dragging) return

		val new = root.checkCollision(mouseX, mouseY)

		if(new != hovered) {
			hovered?.createEvent { MouseExitEvent(it, mouseX, mouseY) }
			new?.createEvent { MouseEnterEvent(it, mouseX, mouseY) }
			hovered = new
		}

		hovered?.createEvent { HoverEvent(it, mouseX, mouseY) }
	}



	private fun checkDragStart(mouseX: Float, mouseY: Float) {
		if(dragFocus != null) return

		val candidate = dragCandidate ?: return

		if(!candidate.dragPredicate()) {
			dragCandidate = null
			return
		}

		val dx = mouseX - dragOriginX
		val dy = mouseY - dragOriginY

		if(candidate.dragThreshold <= 0F || sqrt(dx*dx + dy*dy) >= candidate.dragThreshold) {
			dragCandidate = null
			dragFocus = candidate

			if(!candidate.dragFromOrigin) {
				dragOriginX = mouseX
				dragOriginY = mouseY
			}

			candidate.createEvent { DragStartEvent(it, mouseX, mouseY) }
		}
	}



	private fun checkDrag(mouseX: Float, mouseY: Float) {
		val focus = dragFocus ?: return

		if(focus.dragPredicate()) {
			focus.createEvent { DragUpdateEvent(it, mouseX, mouseY, dragOriginX, dragOriginY) }
		} else {
			focus.createEvent { DragEndEvent(it, mouseX, mouseY) }
			dragFocus = null
		}
	}



	fun update(window: Window) {
		handleMousePos(window.cursorX, Engine.window.cursorY)
		root.alignCycle()
		root.updateCycle()
	}



	fun render() {
		root.render(0F, 0F)
	}


}