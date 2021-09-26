// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.DirectBuffer

class DirectCharBuffer(override val address: Long, override val capacity: Int): DirectBuffer {
	
	
	constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
	
	
	
	companion object {
		
		val NULL = DirectCharBuffer(0, 0)
	
	}
	
	
	
	override val elementSize get() = 2
	
	
	
	/*
	Reading
	 */
	
	
	
	operator fun get(index: Int) = Unsafe.getChar(offset(index))
	
	fun get(index: Int, size: Int) = Unsafe.getChars(offset(index), size)
	
	
	
	/*
	Writing
	 */
	
	
	
	operator fun set(index: Int, value: Char) = Unsafe.setChar(offset(index), value)
	
	operator fun set(index: Int, value: CharArray) = Unsafe.setChars(offset(index), value)
	
	operator fun set(index: Int, value: DirectCharBuffer) = Unsafe.copy(offset(index), value.address, value.byteSize)
	
	
	
	/*
	Iteration
	 */
	
	
	
	val asArray get() = Unsafe.getChars(address, capacity)
	
	inline fun forEach(block: (Char) -> Unit) = repeat(capacity) { block(get(it)) }
	
	inline fun<T> map(block: (Char) -> T) = List(capacity) { block(get(it)) }
	
	
	
	/*
	Misc.
	 */
	
	
	
	fun zero() = Unsafe.set(address, byteSize.toLong(), 0)
	
	fun fill(value: Char) { for(i in 0 until capacity) Unsafe.setChar(offset(i), value) }
	
	fun setLast(value: Char) = set(capacity - 1, value)


}