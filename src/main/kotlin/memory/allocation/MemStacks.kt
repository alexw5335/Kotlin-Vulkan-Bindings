package memory.allocation

import memory.Unsafe

object MemStacks {


	fun create(allocator: Allocator, size: Long): MemStack {
		return MemStack(allocator.calloc(size), size)
	}



	/**
	 * Must only be used from the main thread.
	 */
	val default = create(Unsafe, 1L shl 20)



	/*
	Block functions
	 */



	inline fun with(block: MemStack.() -> Unit) {
		default.push()
		default.use(block)
	}



	inline fun<T> get(block: MemStack.() -> T): T {
		default.push()
		return default.use(block)
	}


}