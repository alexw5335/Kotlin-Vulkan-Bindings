package kvb.window.winapi

import kvb.core.memory.Addressable
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.window.Window
import kvb.window.input.Button

class WinApiWindow(val hwnd: Long) : Window {


	val rect = RECT(Unsafe.calloc(16))

	val clientRect = RECT(Unsafe.calloc(16))

	val cursorPos = POINT(Unsafe.calloc(8))



	override val x get() = rect.left

	override val y get() = rect.top

	override val width get() = rect.right - rect.left

	override val height get() = rect.bottom - rect.top

	override val clientWidth get() = clientRect.right

	override val clientHeight get() = clientRect.bottom

	override val cursorX get() = cursorPos.x

	override val cursorY get() = cursorPos.y

	override val hasFocus get() = WinApi.getFocussedWindow() == hwnd



	override var onScroll: (Int) -> Unit = { }

	override var onKeyHold: (Button) -> Unit = { }

	override var onKeyPress: (Button) -> Unit = { }

	override var onKeyRelease: (Button) -> Unit = { }

	override var onMouseHold: (Button) -> Unit = { }

	override var onMousePress: (Button) -> Unit = { }

	override var onMouseRelease: (Button) -> Unit = { }

	override var onChar: (Char) -> Unit = { }

	override var onClientSizeChanged: (Int, Int) -> Unit = { _, _ -> }



	override fun show() {
		WinApi.showWindow(hwnd, ShowCode.SHOW_NORMAL.value)
	}

	override fun hide() {
		WinApi.showWindow(hwnd, ShowCode.HIDE.value)
	}

	fun updateDimensions() {
		WinApi.getRect(hwnd, rect.address)
		WinApi.getClientRect(hwnd, clientRect.address)
	}


}