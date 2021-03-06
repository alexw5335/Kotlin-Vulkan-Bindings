package kvb.window.winapi

import kvb.window.Window
import kvb.window.input.InputAction
import kvb.window.input.InputButton

class WinApiWindow(val hwnd: Long) : Window {


	private var _x = 0F

	private var _y = 0F

	private var _width = 0F

	private var _height = 0F

	private var _cursorX = 0F

	private var _cursorY = 0F

	private var _isVisible = false



	override val x get() = _x

	override val y get() = _y

	override val width get() = _width

	override val height get() = _height

	override val cursorX get() = _cursorX

	override val cursorY get() = _cursorY

	override val isVisible get() = _isVisible



	override val hasFocus get() = WinApi.getFocussedWindow() == hwnd



	override fun show() {
		WinApi.showWindow(hwnd, ShowCode.SHOW_NORMAL.value)
		_isVisible = true
	}



	override fun hide() {
		WinApi.showWindow(hwnd, ShowCode.HIDE.value)
		_isVisible = false
	}



	override var onScroll: (Float) -> Unit = { }

	override var onButtonInput: (InputButton, InputAction) -> Unit = { _, _ -> }

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



	override fun hashCode() = hwnd.hashCode()

	override fun equals(other: Any?) = other is WinApiWindow && other.hwnd == hwnd

	override fun toString() = "WinApiWindow(hwnd=$hwnd)"


}