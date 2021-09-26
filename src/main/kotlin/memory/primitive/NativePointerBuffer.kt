// This file has been automatically generated.

package memory.primitive

import memory.NativeSizes
import memory.Unsafe
import memory.type.DirectBuffer

class NativePointerBuffer(override val address: Long, override val capacity: Int): DirectBuffer {
	
	
	constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
	
	
	
	companion object {
		
		val NULL = NativePointerBuffer(0, 0)
	
	}
	
	
	
	override val elementSize get() = NativeSizes.POINTER.toInt()
	
	
	
	/*
	Reading
	 */
	
	
	
	operator fun get(index: Int) = Unsafe.getNativePointer(offset(index))
	
	fun get(index: Int, size: Int) = Unsafe.getNativePointers(offset(index), size)
	
	
	
	/*
	Writing
	 */
	
	
	
	operator fun set(index: Int, value: Long) = Unsafe.setNativePointer(offset(index), value)
	
	operator fun set(index: Int, value: LongArray) = Unsafe.setNativePointers(offset(index), value)
	
	operator fun set(index: Int, value: NativePointerBuffer) = Unsafe.copy(offset(index), value.address, value.byteSize)
	
	
	
	/*
	Iteration
	 */
	
	
	
	val asArray get() = Unsafe.getNativePointers(address, capacity)
	
	inline fun forEach(block: (Long) -> Unit) = repeat(capacity) { block(get(it)) }
	
	inline fun<T> map(block: (Long) -> T) = List(capacity) { block(get(it)) }
	
	
	
	/*
	Misc.
	 */
	
	
	
	fun zero() = Unsafe.set(address, byteSize.toLong(), 0)
	
	fun fill(value: Long) { for(i in 0 until capacity) Unsafe.setNativePointer(offset(i), value) }
	
	fun setLast(value: Long) = set(capacity - 1, value)


}