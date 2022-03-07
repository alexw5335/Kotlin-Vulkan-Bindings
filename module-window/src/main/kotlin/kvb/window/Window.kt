package kvb.window

import kvb.window.input.Button

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

	var onKeyHold: (Button) -> Unit

	var onKeyPress: (Button) -> Unit

	var onKeyRelease: (Button) -> Unit

	var onMouseHold: (Button) -> Unit

	var onMousePress: (Button) -> Unit

	var onMouseRelease: (Button) -> Unit

	var onChar: (Char) -> Unit

	var onResize: () -> Unit

	var onMove: () -> Unit

	var onMouseMove: () -> Unit


}