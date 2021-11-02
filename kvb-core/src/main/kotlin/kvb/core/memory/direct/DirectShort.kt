// This file has been automatically generated.

package kvb.core.memory.direct

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

@JvmInline
value class DirectShort(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getShort(address)
		set(value) = Unsafe.setShort(address, value)
	
	
	
	val asBuffer get() = DirectShortBuffer(address, 1)


}