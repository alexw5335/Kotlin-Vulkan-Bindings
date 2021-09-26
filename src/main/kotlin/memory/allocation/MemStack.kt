package memory.allocation

import memory.Unsafe

class MemStack(private val address: Long, private val size: Long) : Allocator, AutoCloseable {


	/*
	Variables
	 */



	private val frames = LongArray(128)

	private var pointer = 0L

	private var frameIndex = 0

	private val maxAddress = address + size



	/*
	Diagnostics
	 */



	val bytesUsed get() = pointer

	val bytesAvailable get() = size - pointer

	val usage get() = bytesUsed.toFloat() / size.toFloat() * 100F



	/*
	Stack implementation
	 */



	fun push() {
		if(frameIndex == frames.size - 1)
			throw IllegalStateException("Memory stack frame overflow.")

		frames[frameIndex++] = pointer
	}



	fun pop() {
		if(frameIndex == 0)
			throw java.lang.IllegalStateException("Each pop must be paired with a push.")

		pointer = frames[--frameIndex]
	}



	override fun close() {
		pop()
	}



	/*
	Allocation implementation
	 */



	override fun malloc(size: Long, alignment: Int): Long {
/*		val address = (this.address + pointer + (alignment - 1)) and -alignment.toLong()

		pointer = address + size

		println(maxAddress)
		if(pointer > maxAddress)
			throw IllegalAccessException("Memory stack overflow.")

		return address*/

		if(pointer + size > this.size)
			throw IllegalAccessException("Memory stack overflow.")

		val address = this.address + pointer

		pointer += size

		return address
	}



	override fun calloc(size: Long, alignment: Int): Long {
		val address = malloc(size, alignment)
		Unsafe.set(address, size, 0)
		return address
	}



	/*
	Blocks
	 */



	fun with(block: MemStack.() -> Unit) {
		push()
		use(block)
	}



	fun<T> get(block: MemStack.() -> T): T {
		push()
		return use(block)
	}


}