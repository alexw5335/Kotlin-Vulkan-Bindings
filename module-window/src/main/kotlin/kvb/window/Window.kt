package kvb.window

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



	/*
	Visibility
	 */



	fun show()

	fun hide()



	/*
	Event handlers
	 */



	var onScroll: (Float) -> Unit

	var onKeyHold: (InputButton) -> Unit

	var onKeyPress: (InputButton, repeatCount: Int) -> Unit

	var onKeyRelease: (InputButton) -> Unit

	var onMouseHold: (InputButton) -> Unit

	var onMousePress: (InputButton) -> Unit

	var onMouseRelease: (InputButton) -> Unit

	var onChar: (Char) -> Unit

	var onResize: () -> Unit

	var onMove: () -> Unit

	var onMouseMove: () -> Unit


}