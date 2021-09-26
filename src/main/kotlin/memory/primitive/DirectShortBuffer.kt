// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.DirectBuffer

class DirectShortBuffer(override val address: Long, override val capacity: Int): DirectBuffer {
	
	
	constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
	
	
	
	companion object {
		
		val NULL = DirectShortBuffer(0, 0)
	
	}
	
	
	
	override val elementSize get() = 2
	
	
	
	/*
	Reading
	 */
	
	
	
	operator fun get(index: Int) = Unsafe.getShort(offset(index))
	
	fun get(index: Int, size: Int) = Unsafe.getShorts(offset(index), size)
	
	
	
	/*
	Writing
	 */
	
	
	
	operator fun set(index: Int, value: Short) = Unsafe.setShort(offset(index), value)
	
	operator fun set(index: Int, value: ShortArray) = Unsafe.setShorts(offset(index), value)
	
	operator fun set(index: Int, value: DirectShortBuffer) = Unsafe.copy(offset(index), value.address, value.byteSize)
	
	
	
	/*
	Iteration
	 */
	
	
	
	val asArray get() = Unsafe.getShorts(address, capacity)
	
	inline fun forEach(block: (Short) -> Unit) = repeat(capacity) { block(get(it)) }
	
	inline fun<T> map(block: (Short) -> T) = List(capacity) { block(get(it)) }
	
	
	
	/*
	Misc.
	 */
	
	
	
	fun zero() = Unsafe.set(address, byteSize.toLong(), 0)
	
	fun fill(value: Short) { for(i in 0 until capacity) Unsafe.setShort(offset(i), value) }
	
	fun setLast(value: Short) = set(capacity - 1, value)


}