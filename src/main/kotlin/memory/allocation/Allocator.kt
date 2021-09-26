package memory.allocation

import memory.NativeSizes
import memory.Unsafe
import memory.primitive.*
import memory.type.Addressable
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



	fun mallocByte()   = DirectByte(malloc(1, 1))

	fun mallocChar()   = DirectChar(malloc(2, 2))

	fun mallocShort()  = DirectShort(malloc(2, 2))

	fun mallocInt()    = DirectInt(malloc(4, 4))

	fun mallocFloat()  = DirectFloat(malloc(4, 4))

	fun mallocLong()   = DirectLong(malloc(8, 8))

	fun mallocDouble() = DirectDouble(malloc(8, 8))



	fun callocByte()   = DirectByte(calloc(1))

	fun callocChar()   = DirectChar(calloc(2))

	fun callocShort()  = DirectShort(calloc(2))

	fun callocInt()    = DirectInt(calloc(4))

	fun callocFloat()  = DirectFloat(calloc(4))

	fun callocLong()   = DirectLong(calloc(8))

	fun callocDouble() = DirectDouble(calloc(8))



	fun mallocPointer()    = NativePointer(malloc(NativeSizes.POINTER, NativeSizes.POINTER))

	fun mallocSizeT()      = NativeSizeT(malloc(NativeSizes.SIZE_T, NativeSizes.SIZE_T))

	fun mallocNativeLong() = NativeLong(malloc(NativeSizes.LONG, NativeSizes.LONG))



	fun callocPointer()    = NativePointer(calloc(NativeSizes.POINTER, NativeSizes.POINTER))

	fun callocSizeT()      = NativeSizeT(calloc(NativeSizes.SIZE_T, NativeSizes.SIZE_T))

	fun callocNativeLong() = NativeLong(calloc(NativeSizes.LONG, NativeSizes.LONG))



	/*
	Primitive buffer allocation
	 */



	fun mallocByte(capacity: Int)    = DirectByteBuffer(   malloc(capacity shl 0, 1), capacity)

	fun mallocChar(capacity: Int)    = DirectCharBuffer(   malloc(capacity shl 1, 2), capacity)

	fun mallocShort(capacity: Int)   = DirectShortBuffer(  malloc(capacity shl 1, 2), capacity)

	fun mallocInt(capacity: Int)     = DirectIntBuffer(    malloc(capacity shl 2, 4), capacity)

	fun mallocFloat(capacity: Int)   = DirectFloatBuffer(  malloc(capacity shl 2, 4), capacity)

	fun mallocLong(capacity: Int)    = DirectLongBuffer(   malloc(capacity shl 3, 8), capacity)

	fun mallocDouble(capacity: Int)  = DirectDoubleBuffer( malloc(capacity shl 3, 8), capacity)



	fun callocByte(capacity: Int)    = DirectByteBuffer(calloc(capacity * 1), capacity)

	fun callocChar(capacity: Int)    = DirectCharBuffer(calloc(capacity * 2), capacity)

	fun callocShort(capacity: Int)   = DirectShortBuffer(calloc(capacity * 2), capacity)

	fun callocInt(capacity: Int)     = DirectIntBuffer(calloc(capacity * 4), capacity)

	fun callocFloat(capacity: Int)   = DirectFloatBuffer(calloc(capacity * 4), capacity)

	fun callocLong(capacity: Int)    = DirectLongBuffer(calloc(capacity * 8), capacity)

	fun callocDouble(capacity: Int)  = DirectDoubleBuffer(calloc(capacity * 8), capacity)



	fun mallocPointer(capacity: Int)     = NativePointerBuffer(malloc(capacity * NativeSizes.POINTER, NativeSizes.POINTER), capacity)

	fun mallocSizeT(capacity: Int)       = NativeSizeTBuffer(malloc(capacity * NativeSizes.SIZE_T, NativeSizes.SIZE_T), capacity)

	fun mallocNativeLong(capacity: Long) = NativeLongBuffer(malloc(capacity * NativeSizes.LONG, NativeSizes.LONG), capacity)



	fun callocPointer(capacity: Int)     = NativePointerBuffer(calloc(capacity * NativeSizes.POINTER, NativeSizes.POINTER), capacity)

	fun callocSizeT(capacity: Int)       = NativeSizeTBuffer(calloc(capacity * NativeSizes.SIZE_T, NativeSizes.SIZE_T), capacity)

	fun callocNativeLong(capacity: Long) = NativeLongBuffer(calloc(capacity * NativeSizes.LONG, NativeSizes.LONG), capacity)



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
	fun<T: Addressable> wrapPointers(list: List<T>) = mallocPointer(list.size).also {
		for(i in list.indices) it[i] = list[i].address
	}

	/**
	 * Contiguous version of [wrapPointers] that fills the resulting array with a single value.
	 */
	fun wrapPointerContiguous(value: Addressable, size: Int) = mallocPointer(size).also {
		it.fill(value.address)
	}

	/**
	 * Single value version of [wrapPointers].
	 */
	fun wrapPointer(value: Addressable) = mallocPointer(1).also { it[0] = value.address }



	/*
	String encoding
	 */



	/**
	 * Encodes a [string] in the given [charset], returning a [DirectByteBuffer] pointing to the memory. A
	 * null-termination character can optionally be appended to the end of the memory.
	 */
	fun encodeString(string: String, charset: Charset, nullTerminated: Boolean = true): DirectByteBuffer {
		val bytes = string.toByteArray(charset)
		val buffer = mallocByte(if(nullTerminated) bytes.size + 1 else bytes.size)
		buffer[0] = bytes
		if(nullTerminated) buffer.setLast(0)
		return buffer
	}



	/**
	 * Encodes a list of [strings] in the given [charset], returning a [DirectLongBuffer] that points to an array of
	 * pointers to the encoded strings. The strings themselves are not stored contiguously in native memory.
	 */
	fun encodeStringList(strings: List<String>, charset: Charset, nullTerminated: Boolean): NativePointerBuffer {
		val buffer = mallocPointer(strings.size)
		for(i in strings.indices) buffer[i] = encodeString(strings[i], charset, nullTerminated).address
		return buffer
	}



	/**
	 * Convenience version of [encodeString] for null-terminated UTF-8-encoded strings.
	 */
	fun encodeUtf8NT(string: String) = encodeString(string, Charsets.UTF_8, true)



	/**
	 * Convenience version of [encodeStringList] for arrays of null-terminated UTF-8-encoded strings.
	 */
	fun encodeUtf8NTList(strings: List<String>) = encodeStringList(strings, Charsets.UTF_8, true)


}