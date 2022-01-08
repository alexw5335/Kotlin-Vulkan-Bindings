package kvb.core.memory

/**
 * A resizable array of native types.
 */
class DirectList<T : DirectBuffer>(
	private val allocator: Allocator,
	initialCapacity: Int = 5,
	private val create: Allocator.(Int) -> T
) : Addressable {


	var size = 0

	var buffer = allocator.create(initialCapacity)

	override val address get() = buffer.address



	val next: Int get() {
		ensureCapacity()
		return size++
	}



	fun reset() {
		size = 0
	}



	private fun ensureCapacity() {
		if(size < buffer.capacity) return
		val previous = buffer
		buffer = allocator.create(size * 2)
		Unsafe.copy(previous, buffer)
	}


}