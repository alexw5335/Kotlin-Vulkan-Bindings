// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.Addressable

@JvmInline
value class DirectByte(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getByte(address)
		set(value) = Unsafe.setByte(address, value)


}