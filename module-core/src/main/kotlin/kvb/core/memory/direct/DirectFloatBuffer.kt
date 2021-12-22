// This file has been automatically generated.

package kvb.core.memory.direct

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

@Suppress("unused")
class DirectFloatBuffer(override val address: Long, override val capacity: Int): DirectBuffer {
	
	
	constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
	
	
	
	override val elementSize get() = 4
	
	
	
	/*
	Reading
	 */
	
	
	
	operator fun get(index: Int) = Unsafe.getFloat(offset(index))
	
	fun get(index: Int, size: Int) = Unsafe.getFloats(offset(index), size)
	
	
	
	/*
	Writing
	 */
	
	
	
	operator fun set(index: Int, value: Float) = Unsafe.setFloat(offset(index), value)
	
	operator fun set(index: Int, value: FloatArray) = Unsafe.setFloats(offset(index), value)
	
	operator fun set(index: Int, value: DirectFloatBuffer) = Unsafe.copy(offset(index), value.address, value.byteSize)
	
	
	
	/*
	Iteration
	 */
	
	
	
	val asArray get() = Unsafe.getFloats(address, capacity)
	
	inline fun forEach(block: (Float) -> Unit) = repeat(capacity) { block(get(it)) }
	
	inline fun<T> map(block: (Float) -> T) = List(capacity) { block(get(it)) }
	
	
	
	/*
	Misc.
	 */
	
	
	
	fun zero() = Unsafe.set(address, byteSize.toLong(), 0)
	
	fun fill(value: Float) { for(i in 0 until capacity) Unsafe.setFloat(offset(i), value) }
	
	fun setLast(value: Float) = set(capacity - 1, value)


}