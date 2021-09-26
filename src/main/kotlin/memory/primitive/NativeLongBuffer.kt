// This file has been automatically generated.

package memory.primitive

import memory.NativeSizes
import memory.Unsafe
import memory.type.DirectBuffer

class NativeLongBuffer(override val address: Long, override val capacity: Int): DirectBuffer {
	
	
	constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
	
	
	
	companion object {
		
		val NULL = NativeLongBuffer(0, 0)
	
	}
	
	
	
	override val elementSize get() = NativeSizes.LONG.toInt()
	
	
	
	/*
	Reading
	 */
	
	
	
	operator fun get(index: Int) = Unsafe.getNativeLong(offset(index))
	
	fun get(index: Int, size: Int) = Unsafe.getNativeLongs(offset(index), size)
	
	
	
	/*
	Writing
	 */
	
	
	
	operator fun set(index: Int, value: Long) = Unsafe.setNativeLong(offset(index), value)
	
	operator fun set(index: Int, value: LongArray) = Unsafe.setNativeLongs(offset(index), value)
	
	operator fun set(index: Int, value: NativeLongBuffer) = Unsafe.copy(offset(index), value.address, value.byteSize)
	
	
	
	/*
	Iteration
	 */
	
	
	
	val asArray get() = Unsafe.getNativeLongs(address, capacity)
	
	inline fun forEach(block: (Long) -> Unit) = repeat(capacity) { block(get(it)) }
	
	inline fun<T> map(block: (Long) -> T) = List(capacity) { block(get(it)) }
	
	
	
	/*
	Misc.
	 */
	
	
	
	fun zero() = Unsafe.set(address, byteSize.toLong(), 0)
	
	fun fill(value: Long) { for(i in 0 until capacity) Unsafe.setNativeLong(offset(i), value) }
	
	fun setLast(value: Long) = set(capacity - 1, value)


}