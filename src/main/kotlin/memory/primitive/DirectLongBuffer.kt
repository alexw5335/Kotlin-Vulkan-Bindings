// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.DirectBuffer

class DirectLongBuffer(override val address: Long, override val capacity: Int): DirectBuffer {
	
	
	constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
	
	
	
	companion object {
		
		val NULL = DirectLongBuffer(0, 0)
	
	}
	
	
	
	override val elementSize get() = 8
	
	
	
	/*
	Reading
	 */
	
	
	
	operator fun get(index: Int) = Unsafe.getLong(offset(index))
	
	fun get(index: Int, size: Int) = Unsafe.getLongs(offset(index), size)
	
	
	
	/*
	Writing
	 */
	
	
	
	operator fun set(index: Int, value: Long) = Unsafe.setLong(offset(index), value)
	
	operator fun set(index: Int, value: LongArray) = Unsafe.setLongs(offset(index), value)
	
	operator fun set(index: Int, value: DirectLongBuffer) = Unsafe.copy(offset(index), value.address, value.byteSize)
	
	
	
	/*
	Iteration
	 */
	
	
	
	val asArray get() = Unsafe.getLongs(address, capacity)
	
	inline fun forEach(block: (Long) -> Unit) = repeat(capacity) { block(get(it)) }
	
	inline fun<T> map(block: (Long) -> T) = List(capacity) { block(get(it)) }
	
	
	
	/*
	Misc.
	 */
	
	
	
	fun zero() = Unsafe.set(address, byteSize.toLong(), 0)
	
	fun fill(value: Long) { for(i in 0 until capacity) Unsafe.setLong(offset(i), value) }
	
	fun setLast(value: Long) = set(capacity - 1, value)


}