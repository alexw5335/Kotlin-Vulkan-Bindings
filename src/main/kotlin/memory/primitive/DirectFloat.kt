// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.Addressable

@JvmInline
value class DirectFloat(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getFloat(address)
		set(value) = Unsafe.setFloat(address, value)


}