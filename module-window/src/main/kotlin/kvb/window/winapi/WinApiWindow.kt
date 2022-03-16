package kvb.window.winapi

import kvb.window.Window
import kvb.window.input.InputButton

class WinApiWindow(val hwnd: Long) : Window {


	private var _x = 0F

	private var _y = 0F

	private var _width = 0F

	private var _height = 0F

	private var _cursorX = 0F

	private var _cursorY = 0F



	override val x get() = _x

	override val y get() = _y

	override val width get() = _width

	override val height get() = _height

	override val cursorX get() = _cursorX

	override val cursorY get() = _cursorY



	override val hasFocus get() = WinApi.getFocussedWindow() == hwnd



	override fun show() {
		WinApi.showWindow(hwnd, ShowCode.SHOW_NORMAL.value)
	}

	override fun hide() {
		WinApi.showWindow(hwnd, ShowCode.HIDE.value)
	}



	override var onScroll: (Float) -> Unit = { }

	override var onKeyHold: (InputButton) -> Unit = { }

	override var onKeyPress: (InputButton) -> Unit = { }

	override var onKeyRelease: (InputButton) -> Unit = { }

	override var onMouseHold: (InputButton) -> Unit = { }

	override var onMousePress: (InputButton) -> Unit = { }

	override var onMouseRelease: (InputButton) -> Unit = { }

	override var onChar: (Char) -> Unit = { }

	override var onResize: () -> Unit = { }

	override var onMove: () -> Unit = { }

	override var onMouseMove: () -> Unit = { }



	fun moveAction(x: Float, y: Float) {
		_x = x
		_y = y
		onMove()
	}



	fun resizeAction(width: Float, height: Float) {
		_width = width
		_height = height
		onResize()

	}



	fun mouseMoveAction(cursorX: Float, cursorY: Float) {
		_cursorX = cursorX
		_cursorY = cursorY
		onMouseMove()
	}


}