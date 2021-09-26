package memory

/**
 * Specifies a fixed-size java primitive or a variable-size native primitive.
 */
enum class Primitive(
	val size         : Int,
	val sizeString   : String,
	val type         : String,
	val kName        : String,
	val isNative     : Boolean,
) {


	/*
	Java primitives
	 */



	BYTE(1, "1", "Byte", "Byte", false),

	SHORT(2, "2", "Short", "Short", false),

	CHAR(2, "2", "Char", "Char", false),

	INT(4, "4", "Int", "Int", false),

	LONG(8, "8", "Long", "Long", false),

	FLOAT(4, "4", "Float", "Float", false),

	DOUBLE(8, "8", "Double", "Double", false),



	/*
	Native primitives (variable size)
	 */



	NATIVE_LONG(NativeSizes.LONG, NativeSizes::class.simpleName + ".LONG", "Long", "Long", true),

	POINTER(NativeSizes.POINTER, NativeSizes::class.simpleName + ".POINTER", "Pointer", "Long", true),

	SIZE_T(NativeSizes.SIZE_T, NativeSizes::class.simpleName + ".SIZE_T", "SizeT", "Long", true);



	/*
	Naming
	 */



	val jniName            = 'j' + kName.lowercase()

	val arrayName          = "${kName}Array"

	val directName         = if(isNative) "Native$type" else "Direct$type"

	val bufferName         = if(isNative) "Native${type}Buffer" else "Direct${type}Buffer"

	val unsafeGetter       = if(isNative) "getNative$type"      else "get$type"

	val unsafeSetter       = if(isNative) "setNative$type"      else "set$type"

	val unsafeArrayGetter  = if(isNative) "getNative${type}s"   else "get${type}s"

	val unsafeArraySetter  = if(isNative) "setNative${type}s"   else "set${type}s"



	/*
	Companion
	 */



	companion object {


		private val nativeMap = mapOf(
			"char" to BYTE,
			"signed char" to BYTE,
			"unsigned char" to BYTE,

			"short" to SHORT,
			"signed short" to SHORT,
			"unsigned short" to SHORT,

			"int" to INT,
			"signed int" to INT,
			"unsigned int" to INT,

			"long" to NATIVE_LONG,
			"signed long" to NATIVE_LONG,
			"unsigned long" to NATIVE_LONG,

			"float" to FLOAT,
			"double" to DOUBLE,

			"int8_t" to BYTE,
			"uint8_t" to BYTE,
			"int16_t" to SHORT,
			"uint16_t" to SHORT,
			"int32_t" to INT,
			"uint32_t" to INT,
			"int64_t" to LONG,
			"uint64_t" to LONG,

			"void*" to POINTER,

			"size_t" to SIZE_T
		)



		fun resolveNative(nativeType: String) = nativeMap[nativeType]
			?: throw IllegalArgumentException("Unrecognised native type: $nativeType")


	}


}