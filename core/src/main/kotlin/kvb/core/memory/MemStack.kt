package kvb.core.memory

/**
 * Represents a contiguous array of off-heap memory that can be sub-allocated in a stack-like fashion. The [with] and
 * [get] methods free any memory that is allocated within their blocks. These functions will not implicitly free memory
 * if an exception is thrown within their blocks. If an exception that was thrown within a block is caught outside of a
 * block, then a memory leak of one or more stack frames will occur. If the same exception is caught within a block,
 * then no memory is leaked. Exceptions caught outside of any block should result in the [resetting][reset] of the
 * MemStack. Using try-with-resources statements (or the equivalent 'use' function in Kotlin) is avoided in order to
 * improve performance as the block functions are used very frequently. None of these precautions are necessary if the
 * exceptions are never caught.
 *
 *     Some examples:
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
 */
class MemStack(val address: Long, private val size: Long) : Allocator {


	constructor(allocator: Allocator, size: Long) : this(allocator.malloc(size, 8), size)





	/*
	Variables
	 */




	private val frames = LongArray(64)

	private var frameIndex = 0



	private val maxAddress = address + size

	private var pointer = address



	/*
	Diagnostics
	 */



	val bytesUsed get() = pointer - address

	val bytesAvailable get() = size - pointer

	val usage get() = bytesUsed.toFloat() / size.toFloat() * 100F



	/*
	Stack implementation
	 */



	fun push(): Int {
		if(frameIndex == frames.size - 1)
			throw IllegalStateException("Memory stack frame overflow.")

		frames[frameIndex++] = pointer
		return frameIndex - 1
	}



	fun pop(frameIndex: Int) {
		this.frameIndex = frameIndex
		pointer = frames[frameIndex]
	}



	fun reset() {
		frameIndex = 0
		pointer = address
	}



	/*
	Allocation implementation
	 */



	override fun malloc(size: Long, alignment: Int): Long {
		// round pointer up to nearest multiple of alignment.
		val address = (pointer + (alignment - 1)) and -alignment.toLong()

		pointer = address + size

		if(pointer > maxAddress)
			throw IllegalAccessException("Memory stack overflow.")

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
		val index = push()
		block(this)
		pop(index)
	}



	fun<T> get(block: MemStack.() -> T): T {
		val index = push()
		val result = block(this)
		pop(index)
		return result
	}


}