package kvb.core.binary

class BinaryWriter(bytes: ByteArray, var endianness: Endianness) {


	constructor(initialCapacity: Int, endianness: Endianness) : this(ByteArray(initialCapacity), endianness)

	constructor(endianness: Endianness) : this(8192, endianness)

	constructor() : this(LittleEndian)



	/*
	Position
	 */



	var pos = 0; private set

	fun seek(pos: Int) { this.pos = pos; ensureCapacity() }

	fun advance(num: Int) { pos += num; ensureCapacity() }

	fun retreat(num: Int) { pos += num; ensureCapacity() }



	/*
	Data
	 */



	var bytes = bytes; private set



	private fun ensureCapacity() {
		if(pos >= bytes.size)
			bytes = bytes.copyOf(bytes.size * 2)
	}



	private fun ensureCapacity(length: Int) {
		if(pos + length >= bytes.size)
			bytes = bytes.copyOf(pos + length * 2)
	}



	/*
	Byte writing
	 */



	fun s8(value: Int) {
		ensureCapacity()
		bytes[pos++] = value.toByte()
	}

	fun u8(value: Int) {
		ensureCapacity()
		bytes[pos++] = value.toUByte().toByte()
	}
	
	fun bytes(bytes: ByteArray, offset: Int, length: Int) {
		ensureCapacity(length)
		System.arraycopy(bytes, offset, this.bytes, pos, length)
		pos += length
	}
	
	fun bytes(bytes: ByteArray) {
		ensureCapacity(bytes.size)
		System.arraycopy(bytes, 0, this.bytes, pos, bytes.size)
		pos += bytes.size
	}
	
	
	
	/*
	Little-endian writing
	 */
	
	
	
	fun s16LE(value: Int) {
		ensureCapacity(2)
		bytes[pos++] = value.toUByte().toByte()
		bytes[pos++] = (value shr 8).toByte()
	}
	
	fun u16LE(value: Int) {
		ensureCapacity(2)
		bytes[pos++] = value.toUByte().toByte()
		bytes[pos++] = (value shr 8).toUByte().toByte()
	}
	
	fun s32LE(value: Int) {
		ensureCapacity(4)
		bytes[pos++] = value.toUByte().toByte()
		bytes[pos++] = (value shr 8).toUByte().toByte()
		bytes[pos++] = (value shr 16).toUByte().toByte()
		bytes[pos++] = (value shr 24).toByte()
	}
	
	fun u32LE(value: Int) {
		ensureCapacity(4)
		bytes[pos++] = value.toUByte().toByte()
		bytes[pos++] = (value shr 8).toUByte().toByte()
		bytes[pos++] = (value shr 16).toUByte().toByte()
		bytes[pos++] = (value shr 24).toUByte().toByte()
	}
	
	fun s64LE(value: Long) {
		ensureCapacity(8)
		bytes[pos++] = value.toUByte().toByte()
		bytes[pos++] = (value shr 8).toUByte().toByte()
		bytes[pos++] = (value shr 16).toUByte().toByte()
		bytes[pos++] = (value shr 24).toUByte().toByte()
		bytes[pos++] = (value shr 32).toUByte().toByte()
		bytes[pos++] = (value shr 40).toUByte().toByte()
		bytes[pos++] = (value shr 48).toUByte().toByte()
		bytes[pos++] = (value shr 56).toByte()
	}

	fun u64LE(value: Long) {
		ensureCapacity(8)
		bytes[pos++] = value.toUByte().toByte()
		bytes[pos++] = (value shr 8).toUByte().toByte()
		bytes[pos++] = (value shr 16).toUByte().toByte()
		bytes[pos++] = (value shr 24).toUByte().toByte()
		bytes[pos++] = (value shr 32).toUByte().toByte()
		bytes[pos++] = (value shr 40).toUByte().toByte()
		bytes[pos++] = (value shr 48).toUByte().toByte()
		bytes[pos++] = (value shr 56).toUByte().toByte()
	}

	fun f32LE(value: Float) = u32LE(value.toBits())

	fun f64LE(value: Double) = u64LE(value.toBits())



	/*
	Big-endian writing
	 */



	fun s16BE(value: Int) {
		ensureCapacity(2)
		bytes[pos++] = (value shr 8).toByte()
		bytes[pos++] = value.toUByte().toByte()
	}

	fun u16BE(value: Int) {
		ensureCapacity(2)
		bytes[pos++] = (value shr 8).toUByte().toByte()
		bytes[pos++] = value.toUByte().toByte()
	}

	fun s32BE(value: Int) {
		ensureCapacity(4)
		bytes[pos++] = (value shr 24).toByte()
		bytes[pos++] = (value shr 16).toUByte().toByte()
		bytes[pos++] = (value shr 8).toUByte().toByte()
		bytes[pos++] = value.toUByte().toByte()
	}

	fun u32BE(value: Int) {
		ensureCapacity(4)
		bytes[pos++] = (value shr 24).toUByte().toByte()
		bytes[pos++] = (value shr 16).toUByte().toByte()
		bytes[pos++] = (value shr 8).toUByte().toByte()
		bytes[pos++] = value.toUByte().toByte()
	}

	fun s64BE(value: Long) {
		ensureCapacity(8)
		bytes[pos++] = (value shr 56).toByte()
		bytes[pos++] = (value shr 48).toUByte().toByte()
		bytes[pos++] = (value shr 40).toUByte().toByte()
		bytes[pos++] = (value shr 32).toUByte().toByte()
		bytes[pos++] = (value shr 24).toUByte().toByte()
		bytes[pos++] = (value shr 16).toUByte().toByte()
		bytes[pos++] = (value shr 8).toUByte().toByte()
		bytes[pos++] = value.toUByte().toByte()
	}

	fun u64BE(value: Long) {
		ensureCapacity(8)
		bytes[pos++] = (value shr 56).toUByte().toByte()
		bytes[pos++] = (value shr 48).toUByte().toByte()
		bytes[pos++] = (value shr 40).toUByte().toByte()
		bytes[pos++] = (value shr 32).toUByte().toByte()
		bytes[pos++] = (value shr 24).toUByte().toByte()
		bytes[pos++] = (value shr 16).toUByte().toByte()
		bytes[pos++] = (value shr 8).toUByte().toByte()
		bytes[pos++] = value.toUByte().toByte()
	}

	fun f32BE(value: Float) = u32BE(value.toBits())

	fun f64BE(value: Double) = u64BE(value.toBits())



	/*
	Writing
	 */



	fun s16(value: Int) = endianness.s16(this, value)

	fun u16(value: Int) = endianness.u16(this, value)

	fun s32(value: Int) = endianness.s32(this, value)

	fun u32(value: Int) = endianness.u32(this, value)

	fun s64(value: Long) = endianness.s64(this, value)

	fun u64(value: Long) = endianness.u64(this, value)

	fun f32(value: Float) = endianness.f32(this, value)

	fun f64(value: Double) = endianness.f64(this, value)


}