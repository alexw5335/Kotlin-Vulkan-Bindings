package kvb.window.winapi

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 * - GetClientRect: left and top are zero, right and bottom are the width and height of the client area.
 */
class RECT(override val address: Long) : Addressable {

	var left: Int
		get() = Unsafe.getInt(address)
		set(value) = Unsafe.setInt(address, value)

	var top: Int
		get() = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)

	var right: Int
		get() = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)

	var bottom: Int
		get() = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)

}