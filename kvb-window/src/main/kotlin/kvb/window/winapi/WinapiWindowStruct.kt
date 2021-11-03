package kvb.window.winapi

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

class WinapiWindowStruct(override val address: Long) : Addressable {


	var hwnd
		get()      = Unsafe.getLong(address)
		set(value) = Unsafe.setLong(address, value)

	var minWidth
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)

	var minHeight
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)

	var maxWidth
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)

	var maxHeight
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}