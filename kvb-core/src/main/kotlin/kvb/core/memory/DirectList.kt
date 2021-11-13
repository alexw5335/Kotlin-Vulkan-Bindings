package kvb.core.memory

class DirectList<T : DirectBuffer>(
	private val allocator: Allocator,
	initialCapacity: Int = 5,
	private val create: Allocator.(Int) -> T
) : Addressable {


	var size = 0

	var buffer = allocator.create(initialCapacity)

	override val address get() = buffer.address



	val next get() = size.also { ensureCapacity(); size++ }



	fun reset() {
		size = 0
		Unsafe.set(buffer.address, buffer.byteSize, 0)
	}



	private fun ensureCapacity() {
		if(size == buffer.capacity) buffer.let { previous ->
			buffer = allocator.create(buffer.capacity * 2)
			Unsafe.copy(previous, buffer)
		}
	}


}