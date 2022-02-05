package kvb.core.memory

object MemStacks {


	/**
	 * A linear allocator from which persistent memory stacks can be sub-allocated. Must only be used from the main
	 * thread.
	 */
	val meta = MemStack(Unsafe, 1L shl 22) // 4 MB

	/**
	 * A general-purpose [MemStack] for small allocations. Must only be used from the main thread.
	 */
	val default = MemStack(meta, 1L shl 20) // 1 MB



	/*
	Block functions
	 */



	/**
	 * Calls [MemStack.with] on the [default] MemStack.
	 */
	inline fun with(block: MemStack.() -> Unit) {
		val index = default.push()
		block(default)
		default.pop(index)
	}



	/**
	 * Calls [MemStack.get] on the [default] MemStack.
	 */
	inline fun<T> get(block: MemStack.() -> T): T {
		val index = default.push()
		val result = block(default)
		default.pop(index)
		return result
	}



	/*
	Test
	 */



	class StackLazy<T>(private val initialiser: MemStack.() -> T): Lazy<T> {
		private var value_: T? = null
		override val value: T get() = value_ ?: initialiser(default).also { value_ = it }
		override fun isInitialized() = value_ != null
	}


}