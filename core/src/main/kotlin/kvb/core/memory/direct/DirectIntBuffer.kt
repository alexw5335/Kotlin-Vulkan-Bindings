// This file has been automatically generated.

package kvb.core.memory.direct

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

@Suppress("unused")
class DirectIntBuffer(override val address: Long, override val capacity: Int): DirectBuffer {
	
	
	constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
	
	
	
	override val elementSize get() = 4
	
	
	
	/*
	Reading
	 */
	
	
	
	operator fun get(index: Int) = Unsafe.getInt(offset(index))
	
	fun get(index: Int, size: Int) = Unsafe.getInts(offset(index), size)
	
	
	
	/*
	Writing
	 */
	
	
	
	operator fun set(index: Int, value: Int) = Unsafe.setInt(offset(index), value)
	
	operator fun set(index: Int, value: IntArray) = Unsafe.setInts(offset(index), value)
	
	operator fun set(index: Int, value: DirectIntBuffer) = Unsafe.copy(offset(index), value.address, value.byteSize)
	
	
	
	/*
	Iteration
	 */
	
	
	
	val asArray get() = Unsafe.getInts(address, capacity)
	
	inline fun forEach(block: (Int) -> Unit) = repeat(capacity) { block(get(it)) }
	
	inline fun<T> map(block: (Int) -> T) = List(capacity) { block(get(it)) }
	
	
	
	/*
	Misc.
	 */
	
	
	
	fun zero() = Unsafe.set(address, byteSize.toLong(), 0)
	
	fun fill(value: Int) { for(i in 0 until capacity) Unsafe.setInt(offset(i), value) }
	
	fun setLast(value: Int) = set(capacity - 1, value)


}