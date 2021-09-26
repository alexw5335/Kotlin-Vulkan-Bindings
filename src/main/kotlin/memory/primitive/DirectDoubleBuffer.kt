// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.DirectBuffer

class DirectDoubleBuffer(override val address: Long, override val capacity: Int): DirectBuffer {
	
	
	constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
	
	
	
	companion object {
		
		val NULL = DirectDoubleBuffer(0, 0)
	
	}
	
	
	
	override val elementSize get() = 8
	
	
	
	/*
	Reading
	 */
	
	
	
	operator fun get(index: Int) = Unsafe.getDouble(offset(index))
	
	fun get(index: Int, size: Int) = Unsafe.getDoubles(offset(index), size)
	
	
	
	/*
	Writing
	 */
	
	
	
	operator fun set(index: Int, value: Double) = Unsafe.setDouble(offset(index), value)
	
	operator fun set(index: Int, value: DoubleArray) = Unsafe.setDoubles(offset(index), value)
	
	operator fun set(index: Int, value: DirectDoubleBuffer) = Unsafe.copy(offset(index), value.address, value.byteSize)
	
	
	
	/*
	Iteration
	 */
	
	
	
	val asArray get() = Unsafe.getDoubles(address, capacity)
	
	inline fun forEach(block: (Double) -> Unit) = repeat(capacity) { block(get(it)) }
	
	inline fun<T> map(block: (Double) -> T) = List(capacity) { block(get(it)) }
	
	
	
	/*
	Misc.
	 */
	
	
	
	fun zero() = Unsafe.set(address, byteSize.toLong(), 0)
	
	fun fill(value: Double) { for(i in 0 until capacity) Unsafe.setDouble(offset(i), value) }
	
	fun setLast(value: Double) = set(capacity - 1, value)


}