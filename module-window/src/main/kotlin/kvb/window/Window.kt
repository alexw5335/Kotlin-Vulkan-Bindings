package kvb.window

import kvb.window.input.InputAction
import kvb.window.input.InputButton

interface Window {


	/*
	Metrics
	 */



	val x: Float

	val y: Float

	val width: Float

	val height: Float

	val cursorX: Float

	val cursorY: Float

	val hasFocus: Boolean

	val isVisible: Boolean



	/*
	Visibility
	 */



	fun show()

	fun hide()



	/*
	Event handlers
	 */



	var onScroll: (Float) -> Unit

	var onButtonInput: (InputButton, InputAction) -> Unit

	var onChar: (Char) -> Unit

	var onResize: () -> Unit

	var onMove: () -> Unit

	var onMouseMove: () -> Unit


}