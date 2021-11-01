// This file has been automatically generated.

package kvb.core.memory.direct

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

@JvmInline
value class DirectLong(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getLong(address)
		set(value) = Unsafe.setLong(address, value)
	
	
	
	val asBuffer get() = DirectLongBuffer(address, 1)


}