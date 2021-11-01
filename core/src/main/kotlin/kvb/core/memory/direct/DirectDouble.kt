// This file has been automatically generated.

package kvb.core.memory.direct

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

@JvmInline
value class DirectDouble(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getDouble(address)
		set(value) = Unsafe.setDouble(address, value)
	
	
	
	val asBuffer get() = DirectDoubleBuffer(address, 1)


}