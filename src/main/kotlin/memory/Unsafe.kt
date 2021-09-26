package memory

import memory.allocation.Allocator
import memory.primitive.DirectByteBuffer
import sun.misc.Unsafe
import java.nio.charset.Charset

object Unsafe: Allocator {


	val instance: Unsafe = Unsafe::class.java.getDeclaredField("theUnsafe").let {
		it.isAccessible = true
		it.get(null) as Unsafe
	}



	/*
	Allocator implementation
	 */



	override fun malloc(size: Long, alignment: Int): Long {
		return instance.allocateMemory(size)
	}



	override fun calloc(size: Long, alignment: Int): Long {
		val address = instance.allocateMemory(size)
		instance.setMemory(address, size, 0)
		return address
	}



	fun free(address: Long) {
		instance.freeMemory(address)
	}



	/*
	Raw copying
	 */



	fun copy(src: Long, dst: Long, size: Long) {
		instance.copyMemory(src, dst, size)
	}



	fun copy(src: Long, dst: Long, size: Int) {
		instance.copyMemory(src, dst, size.toLong())
	}



	fun set(address: Long, size: Long, value: Byte) {
		instance.setMemory(address, size, value)
	}



	fun set(address: Long, size: Int, value: Byte) {
		instance.setMemory(address, size.toLong(), value)
	}



	/*
	Primitive reading
	 */



	fun getByte(address: Long)   = instance.getByte(address)

	fun getChar(address: Long)   = instance.getChar(address)

	fun getShort(address: Long)  = instance.getShort(address)

	fun getInt(address: Long)    = instance.getInt(address)

	fun getFloat(address: Long)  = instance.getFloat(address)

	fun getLong(address: Long)   = instance.getLong(address)

	fun getDouble(address: Long) = instance.getDouble(address)



	/*
	Primitive write
	 */



	fun setByte(address: Long, value: Byte)     = instance.putByte(address, value)

	fun setChar(address: Long, value: Char)     = instance.putChar(address, value)

	fun setShort(address: Long, value: Short)   = instance.putShort(address, value)

	fun setInt(address: Long, value: Int)       = instance.putInt(address, value)

	fun setFloat(address: Long, value: Float)   = instance.putFloat(address, value)

	fun setLong(address: Long, value: Long)     = instance.putLong(address, value)

	fun setDouble(address: Long, value: Double) = instance.putDouble(address, value)



	/*
	Primitive array read
	 */



	fun getBytes(address: Long, size: Int) = ByteArray(size).also {
		instance.copyMemory(null, address, it, 16L, size.toLong())
	}

	fun getChars(address: Long, size: Int) = CharArray(size).also {
		instance.copyMemory(null, address, it, 16L, size.toLong() * 2)
	}

	fun getShorts(address: Long, size: Int) = ShortArray(size).also {
		instance.copyMemory(null, address, it, 16L, size.toLong() * 2)
	}

	fun getInts(address: Long, size: Int) = IntArray(size).also {
		instance.copyMemory(null, address, it, 16L, size.toLong() * 4)
	}

	fun getFloats(address: Long, size: Int) = FloatArray(size).also {
		instance.copyMemory(null, address, it, 16L, size.toLong() * 4)
	}

	fun getLongs(address: Long, size: Int) = LongArray(size).also {
		instance.copyMemory(null, address, it, 16L, size.toLong() * 8)
	}

	fun getDoubles(address: Long, size: Int) = DoubleArray(size).also {
		instance.copyMemory(null, address, it, 16L, size.toLong() * 8)
	}



	/*
	Primitive array write
	 */



	fun setBytes(address: Long, value: ByteArray) {
		instance.copyMemory(value, 16L, null, address, value.size.toLong())
	}

	fun setChars(address: Long, value: CharArray) {
		instance.copyMemory(value, 16L, null, address, value.size.toLong() * 2)
	}

	fun setShorts(address: Long, value: ShortArray) {
		instance.copyMemory(value, 16L, null, address, value.size.toLong() * 2)
	}

	fun setInts(address: Long, value: IntArray) {
		instance.copyMemory(value, 16L, null, address, value.size.toLong() * 4)
	}

	fun setFloats(address: Long, value: FloatArray) {
		instance.copyMemory(value, 16L, null, address, value.size.toLong() * 4)
	}

	fun setLongs(address: Long, value: LongArray) {
		instance.copyMemory(value, 16L, null, address, value.size.toLong() * 8)
	}

	fun setDoubles(address: Long, value: DoubleArray) {
		instance.copyMemory(value, 16L, null, address, value.size.toLong() * 8)
	}



	/*
	Native helper methods
	 */



	private fun getIntAsLong(address: Long): Long {
		return instance.getInt(address).toLong()
	}



	private fun setLongAsInt(address: Long, value: Long) {
		instance.putInt(address, value.toInt())
	}



	private fun setLongsAsInts(address: Long, longs: LongArray) {
		for(i in longs.indices)
			instance.putInt(address + i * 4, longs[i].toInt())
	}



	private fun getIntsAsLongs(address: Long, size: Int): LongArray {
		val intArray = getInts(address, size)
		return LongArray(size) { intArray[it].toLong() }
	}



	/*
	Native getters
	 */



	val getNativeLong: (Long) -> Long = when(NativeSizes.LONG) {
		4    -> ::getIntAsLong
		8    -> instance::getLong
		else -> throw IllegalStateException("Invalid native long size: ${NativeSizes.LONG}")
	}



	val getNativePointer: (Long) -> Long = when(NativeSizes.POINTER) {
		4    -> ::getIntAsLong
		8    -> instance::getLong
		else -> throw IllegalStateException("Invalid native pointer size: ${NativeSizes.POINTER}")
	}



	val getNativeSizeT: (Long) -> Long = when(NativeSizes.SIZE_T) {
		4    -> ::getIntAsLong
		8    -> instance::getLong
		else -> throw IllegalStateException("Invalid native size_t size: ${NativeSizes.SIZE_T}")
	}



	/*
	Native array getters
	 */



	val getNativeLongs: (Long, Int) -> LongArray = when(NativeSizes.LONG) {
		4    -> ::getIntsAsLongs
		8    -> ::getLongs
		else -> throw IllegalStateException("Invalid native long size: ${NativeSizes.LONG}.")
	}



	val getNativePointers: (Long, Int) -> LongArray = when(NativeSizes.POINTER) {
		4    -> ::getIntsAsLongs
		8    -> ::getLongs
		else -> throw IllegalStateException("Invalid native pointer size: ${NativeSizes.POINTER}")
	}



	val getNativeSizeTs: (Long, Int) -> LongArray = when(NativeSizes.SIZE_T) {
		4    -> ::getIntsAsLongs
		8    -> ::getLongs
		else -> throw IllegalStateException("Invalid native szie_t size: ${NativeSizes.SIZE_T}")
	}



	/*
	Native setters
	 */



	val setNativeLong: (Long, Long) -> Unit = when(NativeSizes.LONG) {
		4    -> ::setLongAsInt
		8    -> instance::putLong
		else -> throw IllegalStateException("Invalid native long size: ${NativeSizes.LONG}")
	}



	val setNativePointer: (Long, Long) -> Unit = when(NativeSizes.POINTER) {
		4    -> ::setLongAsInt
		8    -> instance::putLong
		else -> throw IllegalStateException("Invalid native pointer size: ${NativeSizes.POINTER}")
	}



	val setNativeSizeT: (Long, Long) -> Unit = when(NativeSizes.SIZE_T) {
		4    -> ::setLongAsInt
		8    -> instance::putLong
		else -> throw IllegalStateException("Invalid native size_t size: ${NativeSizes.SIZE_T}")
	}



	/*
	Native array setters
	 */



	val setNativeLongs: (Long, LongArray) -> Unit = when(NativeSizes.LONG) {
		4    -> ::setLongsAsInts
		8    -> ::setLongs
		else -> throw IllegalStateException("Invalid native long size: ${NativeSizes.LONG}")
	}



	val setNativePointers: (Long, LongArray) -> Unit = when(NativeSizes.POINTER) {
		4    -> ::setLongsAsInts
		8    -> ::setLongs
		else -> throw IllegalStateException("Invalid native pointer size: ${NativeSizes.POINTER}")
	}



	val setNativeSizeTs: (Long, LongArray) -> Unit = when(NativeSizes.SIZE_T) {
		4    -> ::setLongsAsInts
		8    -> ::setLongs
		else -> throw IllegalStateException("Invalid native size_T size: ${NativeSizes.SIZE_T}")
	}



	/*
	Decoding
	 */



	/**
	 * Returns a [DirectByteBuffer] at the [address] whose length is determined by the presence of a null-terminator
	 * byte. If no null-terminator is found within the given [maxLength], then the buffer's length is set to the
	 * [maxLength].
	 */
	fun getBytesNT(address: Long, maxLength: Int = Integer.MAX_VALUE): DirectByteBuffer {
		for(i in 0 until maxLength)
			if(getByte(address + i) == 0.toByte()) return DirectByteBuffer(address, i)

		return DirectByteBuffer(address, maxLength)
	}



	fun decodeString(address: Long, charset: Charset, length: Int) =
		String(getBytes(address, length), charset).trimEnd { it.code == 0 }

	fun decodeString(buffer: DirectByteBuffer, charset: Charset) =
		String(buffer.asArray, charset).trimEnd { it.code == 0 }

	fun decodeStringNT(address: Long, charset: Charset, maxLength: Int = Int.MAX_VALUE) =
		String(getBytesNT(address, maxLength).asArray, charset)



	fun decodeAscii(address: Long, length: Int) = decodeString(address, Charsets.US_ASCII, length)

	fun decodeAscii(buffer: DirectByteBuffer) = decodeString(buffer, Charsets.US_ASCII)

	fun decodeAsciiNT(address: Long) = decodeStringNT(address, Charsets.US_ASCII)



	fun decodeUtf8(address: Long, length: Int) = decodeString(address, Charsets.UTF_8, length)

	fun decodeUtf8(buffer: DirectByteBuffer) = decodeString(buffer, Charsets.UTF_8)

	fun decodeUtf8NT(address: Long) = decodeStringNT(address, Charsets.UTF_8)


}