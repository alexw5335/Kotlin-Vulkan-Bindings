// This file has been automatically generated.

package memory.primitive

import memory.NativeSizes
import memory.Unsafe
import memory.type.DirectBuffer

class NativeSizeTBuffer(override val address: Long, override val capacity: Int): DirectBuffer {
	
	
	constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
	
	
	
	companion object {
		
		val NULL = NativeSizeTBuffer(0, 0)
	
	}
	
	
	
	override val elementSize get() = NativeSizes.SIZE_T.toInt()
	
	
	
	/*
	Reading
	 */
	
	
	
	operator fun get(index: Int) = Unsafe.getNativeSizeT(offset(index))
	
	fun get(index: Int, size: Int) = Unsafe.getNativeSizeTs(offset(index), size)
	
	
	
	/*
	Writing
	 */
	
	
	
	operator fun set(index: Int, value: Long) = Unsafe.setNativeSizeT(offset(index), value)
	
	operator fun set(index: Int, value: LongArray) = Unsafe.setNativeSizeTs(offset(index), value)
	
	operator fun set(index: Int, value: NativeSizeTBuffer) = Unsafe.copy(offset(index), value.address, value.byteSize)
	
	
	
	/*
	Iteration
	 */
	
	
	
	val asArray get() = Unsafe.getNativeSizeTs(address, capacity)
	
	inline fun forEach(block: (Long) -> Unit) = repeat(capacity) { block(get(it)) }
	
	inline fun<T> map(block: (Long) -> T) = List(capacity) { block(get(it)) }
	
	
	
	/*
	Misc.
	 */
	
	
	
	fun zero() = Unsafe.set(address, byteSize.toLong(), 0)
	
	fun fill(value: Long) { for(i in 0 until capacity) Unsafe.setNativeSizeT(offset(i), value) }
	
	fun setLast(value: Long) = set(capacity - 1, value)


}