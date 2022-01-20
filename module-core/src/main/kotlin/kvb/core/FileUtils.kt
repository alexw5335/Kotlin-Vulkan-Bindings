package kvb.core

import kvb.core.memory.Allocator
import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.core.memory.direct.DirectByteBuffer

/**
 * Reads whole files into off-heap memory. Should not be used for very large files. Reading files larger than about 4 GB
 * will result in an exception.
 */
object FileUtils {


	/*
	Natives
	 */



	private external fun openFileForReading(path: Long): Long

	private external fun getFileSize(file: Long): Long

	private external fun readFile(file: Long, size: Long, data: Long)



	/*
	Reading
	 */



	fun readFully(path: String, allocator: Allocator, stack: MemStack = default): DirectByteBuffer {
		val file = stack.get {
			openFileForReading(stack.encodeUtf8NT(path).address)
		}

		if(file == 0L)
			throw IllegalArgumentException("File at '$path' could not be opened for reading.")

		val size = getFileSize(file)

		if(size > Int.MAX_VALUE)
			throw IllegalArgumentException("File at '$path' is too large ($size bytes) to be read fully.")

		val data = allocator.mallocByte(size.toInt())

		readFile(file, size, data.address)

		return data
	}



	fun<R> readFullyAndFree(path: String, stack: MemStack = default, block: (DirectByteBuffer) -> R): R = stack.get {
		block(readFully(path, stack, stack))
	}


}