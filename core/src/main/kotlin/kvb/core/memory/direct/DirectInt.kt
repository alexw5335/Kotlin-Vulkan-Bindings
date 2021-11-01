// This file has been automatically generated.

package kvb.core.memory.direct

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

@JvmInline
value class DirectInt(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getInt(address)
		set(value) = Unsafe.setInt(address, value)
	
	
	
	val asBuffer get() = DirectIntBuffer(address, 1)


}