// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.Addressable

@JvmInline
value class DirectLong(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getLong(address)
		set(value) = Unsafe.setLong(address, value)


}