// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.Addressable

@JvmInline
value class DirectChar(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getChar(address)
		set(value) = Unsafe.setChar(address, value)


}