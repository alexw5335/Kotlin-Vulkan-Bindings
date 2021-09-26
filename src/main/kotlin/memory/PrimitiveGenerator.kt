package memory

import codegen.CodeWriter.Companion.with
import codegen.KWriter
import memory.type.Addressable
import memory.type.DirectBuffer
import java.nio.file.Path
import kotlin.io.path.div

object PrimitiveGenerator {


	fun generate(directory: Path, packageName: String) {
		for(p in Primitive.values()) {
			writeBuffer(directory, packageName, p)
			writePrimitive(directory, packageName, p)
		}
	}



	private fun writePrimitive(
		directory   : Path,
		packageName : String,
		primitive   : Primitive
	) = KWriter(directory/"${primitive.directName}.kt").with {
		start {
			autogenComment()
			package_(packageName)
			qualifiedImports(Addressable::class, Unsafe::class)
		}

		annotation("JvmInline")
		class_("value class ${primitive.directName}(override val address: Long) : Addressable") {
			declaration {
				writeln("var value")
				writeln("\tget()      = Unsafe.${primitive.unsafeGetter}(address)")
				writeln("\tset(value) = Unsafe.${primitive.unsafeSetter}(address, value)")
			}
		}
	}



	private fun writeBuffer(
		directory   : Path,
		packageName : String,
		primitive   : Primitive
	) = KWriter(directory/"${primitive.bufferName}.kt").with {
		start {
			autogenComment()
			package_(packageName)
			qualifiedImports(NativeSizes::class, DirectBuffer::class, Unsafe::class)
		}

		class_("class ${primitive.bufferName}(override val address: Long, override val capacity: Int): DirectBuffer") {
			declaration("constructor(address: Long, capacity: Long) : this(address, capacity.toInt())")
			companion_ {
				declaration("val NULL = ${primitive.bufferName}(0, 0)")
			}

			declaration("override val elementSize get() = ${primitive.sizeString}")

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

				if(primitive == Primitive.BYTE)
					declaration("fun fill(value: Byte) = Unsafe.set(address, capacity.toLong(), value)")
				else
					declaration("fun fill(value: ${primitive.kName}) { for(i in 0 until capacity) Unsafe.${primitive.unsafeSetter}(offset(i), value) }")

				declaration("fun setLast(value: ${primitive.kName}) = set(capacity - 1, value)")
			}

			// DirectByteBuffer-specific functions. Byte buffers can get and set any other primitive types.
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
			}
		}
	}
}