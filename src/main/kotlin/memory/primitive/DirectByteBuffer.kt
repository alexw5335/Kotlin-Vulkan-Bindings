// This file has been automatically generated.

package memory.primitive

import memory.Unsafe
import memory.type.DirectBuffer

class DirectByteBuffer(override val address: Long, override val capacity: Int): DirectBuffer {
	
	
	constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
	
	
	
	companion object {
		
		val NULL = DirectByteBuffer(0, 0)
	
	}
	
	
	
	override val elementSize get() = 1
	
	
	
	/*
	Reading
	 */
	
	
	
	operator fun get(index: Int) = Unsafe.getByte(offset(index))
	
	fun get(index: Int, size: Int) = Unsafe.getBytes(offset(index), size)
	
	
	
	/*
	Writing
	 */
	
	
	
	operator fun set(index: Int, value: Byte) = Unsafe.setByte(offset(index), value)
	
	operator fun set(index: Int, value: ByteArray) = Unsafe.setBytes(offset(index), value)
	
	operator fun set(index: Int, value: DirectByteBuffer) = Unsafe.copy(offset(index), value.address, value.byteSize)
	
	
	
	/*
	Iteration
	 */
	
	
	
	val asArray get() = Unsafe.getBytes(address, capacity)
	
	inline fun forEach(block: (Byte) -> Unit) = repeat(capacity) { block(get(it)) }
	
	inline fun<T> map(block: (Byte) -> T) = List(capacity) { block(get(it)) }
	
	
	
	/*
	Misc.
	 */
	
	
	
	fun zero() = Unsafe.set(address, byteSize.toLong(), 0)
	
	fun fill(value: Byte) = Unsafe.set(address, capacity.toLong(), value)
	
	fun setLast(value: Byte) = set(capacity - 1, value)
	
	
	
	/*
	Primitive reading
	 */
	
	
	
	fun getShort(index: Int) = Unsafe.getShort(address + index)
	
	fun getChar(index: Int) = Unsafe.getChar(address + index)
	
	fun getInt(index: Int) = Unsafe.getInt(address + index)
	
	fun getLong(index: Int) = Unsafe.getLong(address + index)
	
	fun getFloat(index: Int) = Unsafe.getFloat(address + index)
	
	fun getDouble(index: Int) = Unsafe.getDouble(address + index)
	
	fun getNativeLong(index: Int) = Unsafe.getNativeLong(address + index)
	
	fun getNativePointer(index: Int) = Unsafe.getNativePointer(address + index)
	
	fun getNativeSizeT(index: Int) = Unsafe.getNativeSizeT(address + index)
	
	
	
	/*
	Primitive writing
	 */
	
	
	
	fun setShort(index: Int, value: Short) = Unsafe.setShort(address + index, value)
	
	fun setChar(index: Int, value: Char) = Unsafe.setChar(address + index, value)
	
	fun setInt(index: Int, value: Int) = Unsafe.setInt(address + index, value)
	
	fun setLong(index: Int, value: Long) = Unsafe.setLong(address + index, value)
	
	fun setFloat(index: Int, value: Float) = Unsafe.setFloat(address + index, value)
	
	fun setDouble(index: Int, value: Double) = Unsafe.setDouble(address + index, value)
	
	fun setNativeLong(index: Int, value: Long) = Unsafe.setNativeLong(address + index, value)
	
	fun setNativePointer(index: Int, value: Long) = Unsafe.setNativePointer(address + index, value)
	
	fun setNativeSizeT(index: Int, value: Long) = Unsafe.setNativeSizeT(address + index, value)
	
	
	
	/*
	Primitive array reading
	 */
	
	
	
	fun getShorts(index: Int, size: Int) = Unsafe.getShorts(address + index, size)
	
	fun getChars(index: Int, size: Int) = Unsafe.getChars(address + index, size)
	
	fun getInts(index: Int, size: Int) = Unsafe.getInts(address + index, size)
	
	fun getLongs(index: Int, size: Int) = Unsafe.getLongs(address + index, size)
	
	fun getFloats(index: Int, size: Int) = Unsafe.getFloats(address + index, size)
	
	fun getDoubles(index: Int, size: Int) = Unsafe.getDoubles(address + index, size)
	
	fun getNativeLongs(index: Int, size: Int) = Unsafe.getNativeLongs(address + index, size)
	
	fun getNativePointers(index: Int, size: Int) = Unsafe.getNativePointers(address + index, size)
	
	fun getNativeSizeTs(index: Int, size: Int) = Unsafe.getNativeSizeTs(address + index, size)
	
	
	
	/*
	Primitive array writing
	 */
	
	
	
	fun setShorts(index: Int, value: ShortArray) = Unsafe.setShorts(address + index, value)
	
	fun setChars(index: Int, value: CharArray) = Unsafe.setChars(address + index, value)
	
	fun setInts(index: Int, value: IntArray) = Unsafe.setInts(address + index, value)
	
	fun setLongs(index: Int, value: LongArray) = Unsafe.setLongs(address + index, value)
	
	fun setFloats(index: Int, value: FloatArray) = Unsafe.setFloats(address + index, value)
	
	fun setDoubles(index: Int, value: DoubleArray) = Unsafe.setDoubles(address + index, value)
	
	fun setNativeLongs(index: Int, value: LongArray) = Unsafe.setNativeLongs(address + index, value)
	
	fun setNativePointers(index: Int, value: LongArray) = Unsafe.setNativePointers(address + index, value)
	
	fun setNativeSizeTs(index: Int, value: LongArray) = Unsafe.setNativeSizeTs(address + index, value)


}