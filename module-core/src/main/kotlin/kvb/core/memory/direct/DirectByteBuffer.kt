// This file has been automatically generated.

package kvb.core.memory.direct

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

import java.nio.charset.Charset

@Suppress("unused")
class DirectByteBuffer(override val address: Long, override val capacity: Int): DirectBuffer {
	
	
	constructor(address: Long, capacity: Long) : this(address, capacity.toInt())



	override val elementSize get() = 1



	val asFloatBuffer get() = DirectFloatBuffer(address, capacity / 4)



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

	fun getFloat(index: Int) = Unsafe.getFloat(address + index)

	fun getLong(index: Int) = Unsafe.getLong(address + index)

	fun getDouble(index: Int) = Unsafe.getDouble(address + index)



	/*
	Primitive writing
	 */



	operator fun set(index: Int, value: Short) = Unsafe.setShort(address + index, value)

	operator fun set(index: Int, value: Char) = Unsafe.setChar(address + index, value)

	operator fun set(index: Int, value: Int) = Unsafe.setInt(address + index, value)

	operator fun set(index: Int, value: Float) = Unsafe.setFloat(address + index, value)

	operator fun set(index: Int, value: Long) = Unsafe.setLong(address + index, value)

	operator fun set(index: Int, value: Double) = Unsafe.setDouble(address + index, value)



	/*
	Primitive array reading
	 */



	fun getShorts(index: Int, size: Int) = Unsafe.getShorts(address + index, size)

	fun getChars(index: Int, size: Int) = Unsafe.getChars(address + index, size)

	fun getInts(index: Int, size: Int) = Unsafe.getInts(address + index, size)

	fun getFloats(index: Int, size: Int) = Unsafe.getFloats(address + index, size)

	fun getLongs(index: Int, size: Int) = Unsafe.getLongs(address + index, size)

	fun getDoubles(index: Int, size: Int) = Unsafe.getDoubles(address + index, size)



	/*
	Primitive array writing
	 */



	fun setShorts(index: Int, value: ShortArray) = Unsafe.setShorts(address + index, value)

	fun setChars(index: Int, value: CharArray) = Unsafe.setChars(address + index, value)

	fun setInts(index: Int, value: IntArray) = Unsafe.setInts(address + index, value)

	fun setFloats(index: Int, value: FloatArray) = Unsafe.setFloats(address + index, value)

	fun setLongs(index: Int, value: LongArray) = Unsafe.setLongs(address + index, value)

	fun setDoubles(index: Int, value: DoubleArray) = Unsafe.setDoubles(address + index, value)



	/*
	Decoding
	 */



	fun decodeString(charset: Charset) = Unsafe.decodeString(address, charset, capacity)

	fun decodeStringNT(charset: Charset) = Unsafe.decodeStringNT(address, charset, capacity)

	fun decodeStringNT2(charset: Charset) = Unsafe.decodeStringNT2(address, charset, capacity)

	fun decodeStringNT4(charset: Charset) = Unsafe.decodeStringNT4(address, charset, capacity)



	fun decodeAscii() = decodeString(Charsets.US_ASCII)

	fun decodeAsciiNT() = decodeStringNT(Charsets.US_ASCII)



	fun decodeUtf8() = decodeString(Charsets.UTF_8)

	fun decodeUtf8NT() = decodeStringNT(Charsets.UTF_8)



	fun decodeUtf16() = decodeString(Charsets.UTF_16LE)

	fun decodeUtf16NT() = decodeStringNT2(Charsets.UTF_16LE)



	fun decodeUtf32() = decodeString(Charsets.UTF_32LE)

	fun decodeUtf32NT() = decodeStringNT4(Charsets.UTF_32LE)


}