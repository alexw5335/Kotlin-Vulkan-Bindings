package kvb.window

import kvb.window.input.Button

abstract class Window {


	/*
	Metrics
	 */



	abstract val x: Int

	abstract val y: Int

	abstract val width: Int

	abstract val height: Int

	abstract val clientX: Int

	abstract val clientY: Int

	abstract val clientWidth: Int

	abstract val clientHeight: Int

	abstract val cursorX: Int

	abstract val cursorY: Int

	abstract val hasFocus: Boolean



	/*
	Visibility
	 */



	abstract fun show()

	abstract fun hide()



	/*
	Event handlers
	 */



	var onScroll: (Int) -> Unit = { }

	var onKeyHold: (Button) -> Unit = { }

	var onKeyPress: (Button) -> Unit = { }

	var onKeyRelease: (Button) -> Unit = { }

	var onMouseHold: (Button) -> Unit = { }

	var onMousePress: (Button) -> Unit = { }

	var onMouseRelease: (Button) -> Unit = { }


}