// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.Addressable

@JvmInline
value class NativeSizeT(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getNativeSizeT(address)
		set(value) = Unsafe.setNativeSizeT(address, value)


}