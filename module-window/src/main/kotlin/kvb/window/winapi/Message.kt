package kvb.window.winapi

import kvb.core.memory.Addressable
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe

class Message(override val address: Long): Addressable {


	constructor(allocator: Allocator) : this(allocator.calloc(48))



	var hwnd: Long
		get()      = Unsafe.getLong(address)
		set(value) = Unsafe.setLong(address, value)

	var message: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)

	var wparam: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)

	var lparam: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)

	var time: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)

	var cursorX: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)

	var cursorY: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)


}