package codegen.core

import codegen.writer.KWriter
import codegen.writer.Primitive
import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Path

class PrimitiveGenerator(private val directory: Path, private val packageName: String) {


	init {
		Files.createDirectories(directory)
	}



	fun generate() {
		for(p in Primitive.values()) {
			genDirect(p)
			genDirectBuffer(p)
		}
	}



	private fun genDirect(primitive: Primitive) = KWriter.write(directory, primitive.directName) {
		start {
			autogenComment()
			package_(packageName)
			imports(Addressable::class, Unsafe::class)
		}

		annotation("JvmInline")
		class_("value class ${primitive.directName}(override val address: Long) : Addressable") {
			multilineDeclaration("""
				var value
					get()      = Unsafe.${primitive.unsafeGetter}(address)
					set(value) = Unsafe.${primitive.unsafeSetter}(address, value)
			""")

			declaration("val asBuffer get() = ${primitive.bufferName}(address, 1)")
		}
	}



	private fun genDirectBuffer(primitive: Primitive) = KWriter.write(directory, primitive.bufferName) {
		start {
			autogenComment()
			package_(packageName)
			imports(
				DirectBuffer::class,
				Unsafe::class,
				if(primitive == Primitive.BYTE) Charset::class else null
			)
		}

		suppress("unused")
		class_("class ${primitive.bufferName}(override val address: Long, override val capacity: Int): DirectBuffer") {
			declaration("constructor(address: Long, capacity: Long) : this(address, capacity.toInt())")
			declaration("override val elementSize get() = ${primitive.size}")

			group("Reading", spacing = 1) {
				declaration("operator fun get(index: Int) = Unsafe.${primitive.unsafeGetter}(offset(index))")
				declaration("fun get(index: Int, size: Int) = Unsafe.${primitive.unsafeArrayGetter}(offset(index), size)")
			}

			group("Writing", spacing = 1) {
				declaration("operator fun set(index: Int, value: ${primitive.kName}) = Unsafe.${primitive.unsafeSetter}(offset(index), value)")
				declaration("operator fun set(index: Int, value: ${primitive.arrayName}) = Unsafe.${primitive.unsafeArraySetter}(offset(index), value)")
				declaration("operator fun set(index: Int, value: ${primitive.bufferName}) = Unsafe.copy(offset(index), value.address, value.byteSize)")
			}

			group("Iteration", spacing = 1) {
				declaration("val asArray get() = Unsafe.${primitive.unsafeArrayGetter}(address, capacity)")
				declaration("inline fun forEach(block: (${primitive.kName}) -> Unit) = repeat(capacity) { block(get(it)) }")
				declaration("inline fun<T> map(block: (${primitive.kName}) -> T) = List(capacity) { block(get(it)) }")
			}

			group("Misc.", spacing = 1) {
				declaration("fun zero() = Unsafe.set(address, byteSize.toLong(), 0)")

				// Optimised version of fill for DirectByteBuffer.
				if(primitive == Primitive.BYTE)
					declaration("fun fill(value: Byte) = Unsafe.set(address, capacity.toLong(), value)")
				else
					declaration("fun fill(value: ${primitive.kName}) { for(i in 0 until capacity) Unsafe.${primitive.unsafeSetter}(offset(i), value) }")

				declaration("fun setLast(value: ${primitive.kName}) = set(capacity - 1, value)")
			}

			// DirectByteBuffer-specific functions. Can get and set any other primitive type.
			if(primitive == Primitive.BYTE) {
				val otherPrimitives = Primitive.values().filter { it != Primitive.BYTE }

				group("Primitive reading", spacing = 1) {
					for(p in otherPrimitives) {
						declaration("fun ${p.unsafeGetter}(index: Int) = Unsafe.${p.unsafeGetter}(address + index)")
					}
				}

				group("Primitive writing", spacing = 1) {
					for(p in otherPrimitives) {
						declaration("fun ${p.unsafeSetter}(index: Int, value: ${p.kName}) = Unsafe.${p.unsafeSetter}(address + index, value)")
					}
				}

				group("Primitive array reading", spacing = 1) {
					for(p in otherPrimitives) {
						declaration("fun ${p.unsafeArrayGetter}(index: Int, size: Int) = Unsafe.${p.unsafeArrayGetter}(address + index, size)")
					}
				}

				group("Primitive array writing", spacing = 1) {
					for(p in otherPrimitives) {
						declaration("fun ${p.unsafeArraySetter}(index: Int, value: ${p.arrayName}) = Unsafe.${p.unsafeArraySetter}(address + index, value)")
					}
				}

				// Specialised string reading from the start of the buffer to either the end or to a null-terminator.
				group("Decoding", spacing = 3) {
					group(1) {
						declaration("fun decodeString(charset: Charset) = Unsafe.decodeString(address, charset, capacity)")
						declaration("fun decodeStringNT(charset: Charset) = Unsafe.decodeStringNT(address, charset, capacity)")
						declaration("fun decodeStringNT2(charset: Charset) = Unsafe.decodeStringNT2(address, charset, capacity)")
						declaration("fun decodeStringNT4(charset: Charset) = Unsafe.decodeStringNT4(address, charset, capacity)")
					}

					group(1) {
						declaration("fun decodeAscii() = decodeString(Charsets.US_ASCII)")
						declaration("fun decodeAsciiNT() = decodeStringNT(Charsets.US_ASCII)")
					}

					group(1) {
						declaration("fun decodeUtf8() = decodeString(Charsets.UTF_8)")
						declaration("fun decodeUtf8NT() = decodeStringNT(Charsets.UTF_8)")
					}

					group(1) {
						declaration("fun decodeUtf16() = decodeString(Charsets.UTF_16LE)")
						declaration("fun decodeUtf16NT() = decodeStringNT2(Charsets.UTF_16LE)")
					}

					group(1) {
						declaration("fun decodeUtf32() = decodeString(Charsets.UTF_32LE)")
						declaration("fun decodeUtf32NT() = decodeStringNT4(Charsets.UTF_32LE)")
					}
				}
			}
		}
	}


}