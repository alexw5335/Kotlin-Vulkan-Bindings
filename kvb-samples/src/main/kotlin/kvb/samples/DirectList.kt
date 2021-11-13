package kvb.samples

import kvb.core.memory.Allocator
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

class DirectList<T : DirectBuffer>(
	private val allocator: Allocator,
	initialCapacity: Int = 10,
	private val create: Allocator.(Int) -> T
) {


	var index = 0

	var buffer = allocator.create(initialCapacity)



	val next get() = index.also { ensureCapacity(); index++ }



	fun reset() {
		index = 0
		Unsafe.set(buffer.address, buffer.byteSize, 0)
	}



	private fun ensureCapacity() {
		if(index == buffer.capacity) buffer.let { previous ->
			buffer = allocator.create(buffer.capacity * 2)
			Unsafe.copy(previous, buffer)
		}
	}


}