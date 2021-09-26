// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.Addressable

@JvmInline
value class NativeLong(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getNativeLong(address)
		set(value) = Unsafe.setNativeLong(address, value)


}