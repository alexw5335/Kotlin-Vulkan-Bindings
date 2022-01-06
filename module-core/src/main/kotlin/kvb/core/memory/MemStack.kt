package kvb.core.memory

/**
 * Represents a contiguous array of off-heap memory that can be sub-allocated in a stack-like fashion. The [with] and
 * [get] methods free any memory that is allocated within their blocks. These functions will not implicitly free memory
 * if an exception is thrown within their blocks. If an exception that was thrown within a block is caught outside of a
 * block, then a memory leak of one or more stack frames will occur. If the same exception is caught within a block,
 * then no memory is leaked. Exceptions caught outside any block should result in the [resetting][reset] of the
 * MemStack. Using try-with-resources statements (or the equivalent 'use' function in Kotlin) is avoided in order to
 * improve performance as the block functions are used very frequently. None of these precautions are necessary if the
 * exceptions are never caught.
 *
 * ### Examples:
 *
 *     val stack: MemStack
 *
 *     // Memory leak, exception caught outside of a stack frame.
 *     try {
 *         stack.with {
 *             mallocInt()
 *             throw RuntimeException()
 *         }
 *     } catch(e: Exception) { }
 *
 *
 *     // No memory leak, exception caught within a stack frame.
 *     stack.with {
 *         try {
 *             stack.with {
 *                 mallocInt()
 *                 throw RuntimeException()
 *             }
 *         } catch(e: Exception) { }
 *     }
 *
 *
 *     // No memory leak, exception caught outside of a stack frame,
 *     // but the stack is reset in response.
 *     try {
 *         stack.with {
 *             mallocInt()
 *             throw RuntimeException()
 *         }
 *     } catch(e: Exception) {
 *         stack.reset()
 *     }
 *
 *     // TODO: Add memory-safe block functions
 */
class MemStack(address: Long, size: Long) : LinearAllocator(address, size) {


	constructor(allocator: Allocator, size: Long) : this(allocator.malloc(size, 8), size)



	/*
	Stack implementation
	 */



	/**
	 * Only use when block functions ([with] and [get]) cannot be used. Returns the current [pointer] address to be used
	 * in a future call to [pop]. Each [push] must be paired with a [pop].
	 */
	fun push() = pointer

	/**
	 * Only use when block functions ([with] and [get]) cannot be used. Must only be used with a [pointer] address
	 * obtained by a call to [push]. Each [push] must be paired with a [pop].
	 */
	fun pop(pointer: Long) { this.pointer = pointer }

	/**
	 * Resets this stack's [pointer], effectively 'freeing' all memory that has been allocated by it. The stack can be
	 * used normally after calling [reset], but any memory allocated beforehand is not guaranteed to be valid.
	 */
	fun reset() { pointer = address }



	/*
	Blocks
	 */



	/**
	 * Calls [push], then the [block], then [pop]. Any memory allocations made within the [block] are freed when exiting
	 * the function. If an exception is thrown within the [block], then memory may not be freed. If the exception is
	 * caught within another [with] or [get] block, then the memory will be freed. If the exception is caught at the
	 * top level (outside any [with] or [get] blocks), then the memory will not be freed, and [reset] should be
	 * called.
	 */
	inline fun with(block: MemStack.() -> Unit) {
		val pointer = this.pointer
		block(this)
		this.pointer = pointer
	}



	/**
	 * Calls [push], then the [block], then [pop], before returning the result computed within the block. See [with] for
	 * more details.
	 */
	inline fun<T> get(block: MemStack.() -> T): T {
		val pointer = this.pointer
		val result = block(this)
		this.pointer = pointer
		return result
	}


}