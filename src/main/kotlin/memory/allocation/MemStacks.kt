package memory.allocation

import memory.Unsafe

object MemStacks {


	/*
	Creation
	 */



	private const val DEFAULT_SIZE = 1L shl 20



	fun create(allocator: Allocator, size: Long): MemStack {
		return MemStack(allocator.calloc(size), size)
	}



	/*
	Instances
	 */






	/**
	 * Thread-safe storage of [MemStack]s. Contains one [MemStack] for each thread from which this variable is
	 * referenced.
	 */
	private val locals = ThreadLocal.withInitial { create(Unsafe, DEFAULT_SIZE) }



	/**
	 * A [MemStack] that can be used for any small allocations on the main thread.
	 */
	val default = create(Unsafe, DEFAULT_SIZE)



	/**
	 * A [MemStack] whose allocations are never freed.
	 */
	val persistent = create(Unsafe, DEFAULT_SIZE)




	/**
	 * A thread-safe [MemStack]. Should be used sparingly as getting the thread-local [MemStack] is expensive.
	 */
	private val local get() = locals.get()



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