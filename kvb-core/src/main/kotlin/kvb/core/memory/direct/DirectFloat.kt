// This file has been automatically generated.

package kvb.core.memory.direct

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

@JvmInline
value class DirectFloat(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getFloat(address)
		set(value) = Unsafe.setFloat(address, value)
	
	
	
	val asBuffer get() = DirectFloatBuffer(address, 1)


}