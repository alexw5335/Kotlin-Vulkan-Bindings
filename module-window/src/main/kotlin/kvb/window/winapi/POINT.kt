package kvb.window.winapi

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

class POINT(override val address: Long) : Addressable {

	var x: Int
		get() = Unsafe.getInt(address)
		set(value) = Unsafe.setInt(address, value)

	var y: Int
		get() = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)

}