// This file has been automatically generated.

package kvb.core.memory.direct

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

@JvmInline
value class DirectChar(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getChar(address)
		set(value) = Unsafe.setChar(address, value)
	
	
	
	val asBuffer get() = DirectCharBuffer(address, 1)


}