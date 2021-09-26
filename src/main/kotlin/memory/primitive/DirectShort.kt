// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.Addressable

@JvmInline
value class DirectShort(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getShort(address)
		set(value) = Unsafe.setShort(address, value)


}