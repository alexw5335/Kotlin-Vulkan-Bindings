// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.Addressable

@JvmInline
value class NativePointer(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getNativePointer(address)
		set(value) = Unsafe.setNativePointer(address, value)


}