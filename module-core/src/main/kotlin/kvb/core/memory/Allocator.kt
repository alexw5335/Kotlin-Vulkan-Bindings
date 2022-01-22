package kvb.core.memory

import kvb.core.memory.direct.*
import java.nio.charset.Charset

interface Allocator {


	/*
	Abstract functions
	 */



	fun malloc(size: Long, alignment: Int): Long

	fun calloc(size: Long, alignment: Int): Long



	/*
	Convenience allocations
	 */



	fun malloc(size: Int, alignment: Int) = malloc(size.toLong(), alignment)

	fun malloc(size: Long) = malloc(size, 1)

	fun malloc(size: Int) = malloc(size.toLong(), 1)


	fun calloc(size: Int, alignment: Int) = calloc(size.toLong(), alignment)

	fun calloc(size: Long) = calloc(size, 1)

	fun calloc(size: Int) = calloc(size.toLong(), 1)



	/*
	Primitive allocation
	 */



	fun mallocByte()    = DirectByte   (malloc(1, 1))

	fun mallocChar()    = DirectChar   (malloc(2, 2))

	fun mallocShort()   = DirectShort  (malloc(2, 2))

	fun mallocInt()     = DirectInt    (malloc(4, 4))

	fun mallocFloat()   = DirectFloat  (malloc(4, 4))

	fun mallocLong()    = DirectLong   (malloc(8, 8))

	fun mallocDouble()  = DirectDouble (malloc(8, 8))

	fun mallocPointer() = DirectLong   (malloc(8, 8))



	fun callocByte()    = DirectByte   (calloc(1, 1))

	fun callocChar()    = DirectChar   (calloc(2, 2))

	fun callocShort()   = DirectShort  (calloc(2, 2))

	fun callocInt()     = DirectInt    (calloc(4, 4))

	fun callocFloat()   = DirectFloat  (calloc(4, 4))

	fun callocLong()    = DirectLong   (calloc(8, 8))

	fun callocDouble()  = DirectDouble (calloc(8, 8))

	fun callocPointer() = DirectLong   (calloc(8, 8))



	/*
	Primitive buffer allocation
	 */



	fun mallocByte(capacity: Int)    = DirectByteBuffer   (malloc(capacity shl 0, 1), capacity)

	fun mallocChar(capacity: Int)    = DirectCharBuffer   (malloc(capacity shl 1, 2), capacity)

	fun mallocShort(capacity: Int)   = DirectShortBuffer  (malloc(capacity shl 1, 2), capacity)

	fun mallocInt(capacity: Int)     = DirectIntBuffer    (malloc(capacity shl 2, 4), capacity)

	fun mallocFloat(capacity: Int)   = DirectFloatBuffer  (malloc(capacity shl 2, 4), capacity)

	fun mallocLong(capacity: Int)    = DirectLongBuffer   (malloc(capacity shl 3, 8), capacity)

	fun mallocDouble(capacity: Int)  = DirectDoubleBuffer (malloc(capacity shl 3, 8), capacity)

	fun mallocPointer(capacity: Int) = DirectLongBuffer   (malloc(capacity shl 3, 8), capacity)



	fun callocByte(capacity: Int)    = DirectByteBuffer   (calloc(capacity shl 0, 1), capacity)

	fun callocChar(capacity: Int)    = DirectCharBuffer   (calloc(capacity shl 1, 2), capacity)

	fun callocShort(capacity: Int)   = DirectShortBuffer  (calloc(capacity shl 1, 2), capacity)

	fun callocInt(capacity: Int)     = DirectIntBuffer    (calloc(capacity shl 2, 4), capacity)

	fun callocFloat(capacity: Int)   = DirectFloatBuffer  (calloc(capacity shl 2, 4), capacity)

	fun callocLong(capacity: Int)    = DirectLongBuffer   (calloc(capacity shl 3, 8), capacity)

	fun callocDouble(capacity: Int)  = DirectDoubleBuffer (calloc(capacity shl 3, 8), capacity)

	fun callocPointer(capacity: Int) = DirectLongBuffer   (calloc(capacity shl 3, 8), capacity)



	/*
	Primitive wrapping
	 */



	fun wrapByte(value: Byte) = mallocByte().also { it.value = value }

	fun wrapChar(value: Char) = mallocChar().also { it.value = value }

	fun wrapShort(value: Short) = mallocShort().also { it.value = value }

	fun wrapInt(value: Int) = mallocInt().also { it.value = value }

	fun wrapFloat(value: Float) = mallocFloat().also { it.value = value }

	fun wrapLong(value: Long) = mallocLong().also { it.value = value }

	fun wrapDouble(value: Double) = mallocDouble().also { it.value = value }

	fun wrapPointer(value: Long) = mallocPointer().also { it.value = value }



	/*
	Primitive array wrapping
 	 */



	fun wrapBytes(array: ByteArray) = mallocByte(array.size).also {
		Unsafe.setBytes(it.address, array)
	}

	fun wrapChars(array: CharArray) = mallocChar(array.size).also {
		Unsafe.setChars(it.address, array)
	}

	fun wrapShorts(array: ShortArray) = mallocShort(array.size).also {
		Unsafe.setShorts(it.address, array)
	}

	fun wrapInts(array: IntArray) = mallocInt(array.size).also {
		Unsafe.setInts(it.address, array)
	}

	fun wrapFloats(array: FloatArray) = mallocFloat(array.size).also {
		Unsafe.setFloats(it.address, array)
	}

	fun wrapLongs(array: LongArray) = mallocLong(array.size).also {
		Unsafe.setLongs(it.address, array)
	}

	fun wrapDoubles(array: DoubleArray) = mallocDouble(array.size).also {
		Unsafe.setDoubles(it.address, array)
	}



	/*
	Pointer wrapping
	 */



	/**
	 * Creates an array of pointers in native memory.
	 */
	fun<T: Addressable> wrapPointers(list: List<T>) = mallocLong(list.size).also {
		for(i in list.indices) it[i] = list[i].address
	}

	/**
	 * Contiguous version of [wrapPointers] that fills the resulting array with a single value.
	 */
	fun wrapPointerContiguous(value: Addressable, size: Int) = mallocLong(size).also {
		it.fill(value.address)
	}

	/**
	 * Single value version of [wrapPointers].
	 */
	fun wrapPointer(value: Addressable) = mallocLong(1).also { it[0] = value.address }



	/*
	String encoding
	 */



	fun encodeString(string: String, charset: Charset): DirectByteBuffer {
		val bytes = string.toByteArray(charset)
		val buffer = mallocByte(bytes.size)
		buffer[0] = bytes
		return buffer
	}



	fun encodeStringNT(string: String, charset: Charset, charSize: Int): DirectByteBuffer {
		val bytes = string.toByteArray(charset)
		val buffer = mallocByte(bytes.size + charSize)
		buffer[0] = bytes
		for(i in 0 until charSize) buffer[buffer.capacity - 1 - i] = 0
		return buffer
	}



	fun encodeStringList(strings: Collection<String>, charset: Charset): DirectLongBuffer {
		val buffer = callocLong(strings.size)
		for((i, s) in strings.withIndex())
			buffer[i] = encodeString(s, charset).address
		return buffer
	}



	fun encodeStringNTList(strings: Collection<String>, charset: Charset, charSize: Int): DirectLongBuffer {
		val buffer = callocLong(strings.size)
		for((i, s) in strings.withIndex())
			buffer[i] = encodeStringNT(s, charset, charSize).address
		return buffer
	}



	fun encodeAscii(string: String) = encodeString(string, Charsets.US_ASCII)

	fun encodeAsciiList(strings: Collection<String>) = encodeStringList(strings, Charsets.US_ASCII)

	fun encodeAsciiNT(string: String) = encodeStringNT(string, Charsets.US_ASCII, 1)

	fun encodeAsciiNTList(strings: Collection<String>) = encodeStringNTList(strings, Charsets.US_ASCII, 1)



	fun encodeUtf8(string: String) = encodeString(string, Charsets.UTF_8)

	fun encodeUtf8List(strings: Collection<String>) = encodeStringList(strings, Charsets.UTF_8)

	fun encodeUtf8NT(string: String) = encodeStringNT(string, Charsets.UTF_8, 1)

	fun encodeUtf8NTList(strings: Collection<String>) = encodeStringNTList(strings, Charsets.UTF_8, 1)



	fun encodeUtf16(string: String) = encodeString(string, Charsets.UTF_16LE)

	fun encodeUtf16List(strings: Collection<String>) = encodeStringList(strings, Charsets.UTF_16LE)

	fun encodeUtf16NT(string: String) = encodeStringNT(string, Charsets.UTF_16LE, 2)

	fun encodeUtf16NTList(strings: Collection<String>) = encodeStringNTList(strings, Charsets.UTF_16LE, 2)



	fun encodeUtf16Big(string: String) = encodeString(string, Charsets.UTF_16BE)

	fun encodeUtf16BigList(strings: Collection<String>) = encodeStringList(strings, Charsets.UTF_16BE)

	fun encodeUtf16BigNT(string: String) = encodeStringNT(string, Charsets.UTF_16BE, 2)

	fun encodeUtf16BigNTList(strings: Collection<String>) = encodeStringNTList(strings, Charsets.UTF_16BE, 2)


}