package kvb.window.winapi

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.window.Window

class WinApiWindow(address: Long) : Window {


	private val struct = Struct(address)

	val hwnd = struct.hwnd

	override val x get() = struct.x

	override val y get() = struct.y

	override val width get() = struct.width

	override val height get() = struct.height



	override fun show() {
		WinApi.showWindow(hwnd, ShowCode.SHOW_NORMAL.value)
	}



	override fun hide() {
		WinApi.showWindow(hwnd, ShowCode.HIDE.value)
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


	}


}