package kvb.window

import kvb.window.input.Button

interface Window {


	/*
	Metrics
	 */



	val x: Int

	val y: Int

	val width: Int

	val height: Int

	val clientWidth: Int

	val clientHeight: Int

	val cursorX: Int

	val cursorY: Int

	val hasFocus: Boolean



	/*
	Visibility
	 */



	fun show()

	fun hide()



	/*
	Event handlers
	 */



	var onScroll: (Int) -> Unit

	var onKeyHold: (Button) -> Unit

	var onKeyPress: (Button) -> Unit

	var onKeyRelease: (Button) -> Unit

	var onMouseHold: (Button) -> Unit

	var onMousePress: (Button) -> Unit

	var onMouseRelease: (Button) -> Unit

	var onChar: (Char) -> Unit

	var onClientSizeChanged: (Int, Int) -> Unit


}