// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.Addressable

@JvmInline
value class DirectDouble(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getDouble(address)
		set(value) = Unsafe.setDouble(address, value)


}