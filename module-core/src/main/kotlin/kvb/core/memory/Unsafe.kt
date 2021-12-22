package kvb.core.memory

import kvb.core.memory.direct.DirectByteBuffer
import sun.misc.Unsafe
import java.nio.charset.Charset

@Suppress("unused")
object Unsafe : Allocator {


	val instance: Unsafe = Unsafe::class.java.getDeclaredField("theUnsafe").let {
		it.isAccessible = true
		it.get(null) as Unsafe
	}



	/*
	Allocation
	 */



	override fun malloc(size: Long, alignment: Int): Long {
		// Alignment is ignored as allocateMemory is already aligned.
		return instance.allocateMemory(size)
	}



	override fun calloc(size: Long, alignment: Int): Long {
		// Alignment is ignored as allocateMemory is already aligned.
		val address = instance.allocateMemory(size)
		instance.setMemory(address, size, 0)
		return address
	}



	fun free(address: Long) {
		instance.freeMemory(address)
	}



	fun free(addressable: Addressable) {
		instance.freeMemory(addressable.address)
	}



	fun realloc(address: Long, size: Long): Long {
		return instance.reallocateMemory(address, size)
	}



	fun realloc(address: Long, size: Int): Long {
		return instance.reallocateMemory(address, size.toLong())
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



	fun copy(src: DirectBuffer, dst: Addressable) {
		instance.copyMemory(src.address, dst.address, src.byteSize.toLong())
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
	Decoding
	 */



	/**
	 * If the byte at the memory [address] is zero.
	 */
	fun isZero(address: Long) = getByte(address) == 0.toByte()



	/**
	 * Gets the length of a null-terminated sequence of bytes starting at the given memory [address].
	 * TODO: Make this more efficient.
	 */
	fun getLengthNT(address: Long, maxLength: Int = Integer.MAX_VALUE): Int {
		for(i in 0 until maxLength)
			if(isZero(address + i))
				return i
		return maxLength
	}



	/**
	 * Version of [getLengthNT] that looks for a two-byte null-terminator.
	 */
	fun getLengthNT2(address: Long, maxLength: Int = Integer.MAX_VALUE): Int {
		for(i in 0 until maxLength - 1)
			if(!isZero(address + i) || isZero(address + i + 1))
				return i
		return maxLength
	}



	/**
	 * Version of [getLengthNT] that looks for a four-tbyte null-terminator.
	 */
	fun getLengthNT4(address: Long, maxLength: Int = Integer.MAX_VALUE): Int {
		for(i in 0 until maxLength - 3)
			if(!isZero(address + i) || !isZero(address + i + 1) || !isZero(address + i + 2) || isZero(address + i + 3))
				return i
		return maxLength
	}



	fun getBytesNT(address: Long, maxLength: Int = Integer.MAX_VALUE) =
		DirectByteBuffer(address, getLengthNT(address, maxLength))

	fun getBytesNT2(address: Long, maxLength: Int = Integer.MAX_VALUE) =
		DirectByteBuffer(address, getLengthNT2(address, maxLength))

	fun getBytesNT4(address: Long, maxLength: Int = Integer.MAX_VALUE) =
		DirectByteBuffer(address, getLengthNT4(address, maxLength))



	fun decodeString(address: Long, charset: Charset, length: Int) =
		String(getBytes(address, length), charset).trimEnd { it.code == 0 }

	fun decodeStringNT(address: Long, charset: Charset, maxLength: Int = Int.MAX_VALUE) =
		String(getBytes(address, getLengthNT(address, maxLength)), charset)

	fun decodeStringNT2(address: Long, charset: Charset, maxLength: Int = Int.MAX_VALUE) =
		String(getBytes(address, getLengthNT2(address, maxLength)), charset)

	fun decodeStringNT4(address: Long, charset: Charset, maxLength: Int = Int.MAX_VALUE) =
		String(getBytes(address, getLengthNT4(address, maxLength)), charset)



	fun decodeAscii(address: Long, length: Int) = decodeString(address, Charsets.US_ASCII, length)

	fun decodeAsciiNT(address: Long, maxLength: Int = Int.MAX_VALUE) = decodeStringNT(address, Charsets.US_ASCII, maxLength)



	fun decodeUtf8(address: Long, length: Int) = decodeString(address, Charsets.UTF_8, length)

	fun decodeUtf8NT(address: Long, maxLength: Int = Int.MAX_VALUE) = decodeStringNT(address, Charsets.UTF_8, maxLength)



	fun decodeUtf16(address: Long, length: Int) = decodeString(address, Charsets.UTF_16LE, length)

	fun decodeUtf16NT(address: Long, maxLength: Int = Int.MAX_VALUE) = decodeStringNT2(address, Charsets.UTF_16LE, maxLength)



	fun decodeUtf32(address: Long, length: Int) = decodeString(address, Charsets.UTF_32LE, length)

	fun decodeUtf32NT(address: Long, maxLength: Int = Int.MAX_VALUE) = decodeStringNT4(address, Charsets.UTF_32LE, maxLength)

}