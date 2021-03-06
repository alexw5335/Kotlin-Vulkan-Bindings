package kvb.core

import kvb.core.memory.Allocator
import kvb.core.memory.direct.DirectByteBuffer
import kvb.core.memory.stackGet

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

	external fun currentThreadID(): Int

	external fun loadImage(pFile: Long, pImage: Long, desiredChannels: Int)

	external fun freeImageData(pData: Long)



	/*
	Reading
	 */



	fun readFully(path: String, allocator: Allocator): DirectByteBuffer {
		val file = stackGet {
			openFileForReading(encodeUtf8NT(path).address)
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



	fun<R> readFullyAndFree(path: String, block: (DirectByteBuffer) -> R): R = stackGet {
		block(readFully(path, this))
	}



	/*
	Image reading
	 */



	fun readRgba(path: String) = stackGet {
		val imageBuffer = mallocByte(8 + 8 + 8)

		loadImage(encodeUtf8NT(path).address, imageBuffer.address, desiredChannels = 4)

		if(imageBuffer.getLong(0) == 0L) {
			throw RuntimeException("Could not load image.")
		}

		Image(
			imageBuffer.getLong(0),
			imageBuffer.getInt(8),
			imageBuffer.getInt(12),
			imageBuffer.getInt(16)
		)
	}



	inline fun<T> readRGBA(path: String, block: (Image) -> T) = stackGet {
		val imageBuffer = mallocByte(8 + 4 + 4 + 4)

		loadImage(encodeUtf8NT(path).address, imageBuffer.address, desiredChannels = 4)

		val data = Image(
			imageBuffer.getLong(0),
			imageBuffer.getInt(8),
			imageBuffer.getInt(12),
			imageBuffer.getInt(16)
		)

		val result = block(data)
		freeImageData(data.address)
		result
	}



	class Image(val address: Long, val width: Int, val height: Int, val channels: Int)


}