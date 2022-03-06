package kvb.window.winapi

import kvb.core.memory.Addressable
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.window.Window
import kvb.window.input.Button

class WinApiWindow(private val struct: Struct) : Window {


	constructor(allocator: Allocator) : this(Struct(allocator.calloc(40)))



	val address = struct.address

	val hwnd = struct.hwnd

	override val x get() = struct.x

	override val y get() = struct.y

	override val width get() = struct.width

	override val height get() = struct.height

	override val clientX get() = struct.clientX

	override val clientY get() = struct.clientY

	override val clientWidth get() = struct.clientWidth

	override val clientHeight get() = struct.clientHeight

	override val cursorX get() = WinApi.getCursorX(address)

	override val cursorY get() = WinApi.getCursorY(address)

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
		WinApi.showWindow(address, ShowCode.SHOW_NORMAL.value)
	}

	override fun hide() {
		WinApi.showWindow(address, ShowCode.HIDE.value)
	}



	class Struct(override val address: Long) : Addressable {


		var hwnd
			get()      = Unsafe.getLong(address)
			set(value) = Unsafe.setLong(address, value)

		var x
			get()      = Unsafe.getInt(address + 8)
			set(value) = Unsafe.setInt(address + 8, value)

		var y
			get()      = Unsafe.getInt(address + 12)
			set(value) = Unsafe.setInt(address + 12, value)

		var width
			get()      = Unsafe.getInt(address + 16)
			set(value) = Unsafe.setInt(address + 16, value)

		var height
			get()      = Unsafe.getInt(address + 20)
			set(value) = Unsafe.setInt(address + 20, value)

		var clientX
			get()      = Unsafe.getInt(address + 24)
			set(value) = Unsafe.setInt(address + 24, value)

		var clientY
			get()      = Unsafe.getInt(address + 28)
			set(value) = Unsafe.setInt(address + 28, value)

		var clientWidth
			get()      = Unsafe.getInt(address + 32)
			set(value) = Unsafe.setInt(address + 32, value)

		var clientHeight
			get()      = Unsafe.getInt(address + 36)
			set(value) = Unsafe.setInt(address + 36, value)


	}


}