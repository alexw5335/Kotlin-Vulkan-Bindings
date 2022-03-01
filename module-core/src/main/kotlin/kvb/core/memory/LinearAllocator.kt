package kvb.core.memory

open class LinearAllocator(val address: Long, val size: Long) : Allocator {


	constructor(allocator: Allocator, size: Long) : this(allocator.calloc(size, 8), size)



	var pointer = address

	val maxAddress = address + size



	/*
	Diagnostics
	 */



	val bytesUsed get() = pointer - address

	val bytesAvailable get() = size - pointer + address

	val usage get() = bytesUsed.toFloat() / size.toFloat() * 100F



	/*
	Allocator implementation
	 */



	override fun malloc(size: Long, alignment: Int): Long {
		// round pointer up to nearest multiple of alignment.
		val address = (pointer + (alignment - 1)) and -alignment.toLong()

		pointer = address + size

		if(pointer > maxAddress)
			throw IllegalAccessException("Memory stack overflow for allocation of $size bytes")

		return address
	}



	override fun calloc(size: Long, alignment: Int): Long {
		val address = malloc(size, alignment)
		Unsafe.set(address, size, 0)
		return address
	}



	/**
	 * Resets this allocator's [pointer], freeing all memory that has been allocated by it. The allocator can be used
	 * normally after calling [reset], but any memory allocated beforehand is not guaranteed to be valid.
	 */
	fun reset() { pointer = address }


}