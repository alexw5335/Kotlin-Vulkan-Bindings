// This file has been automatically generated.

package kvb.core.memory.direct

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

@JvmInline
value class DirectByte(override val address: Long) : Addressable {
	
	
	var value
		get()      = Unsafe.getByte(address)
		set(value) = Unsafe.setByte(address, value)
	
	
	
	val asBuffer get() = DirectByteBuffer(address, 1)


}