// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.Addressable

@JvmInline
value class DirectInt(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getInt(address)
		set(value) = Unsafe.setInt(address, value)


}