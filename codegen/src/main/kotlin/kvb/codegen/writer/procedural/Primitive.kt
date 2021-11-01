package kvb.codegen.writer.procedural

enum class Primitive(val kName: String, val size: Int) {


	BYTE("Byte", 1),

	SHORT("Short", 2),

	CHAR("Char", 2),

	INT("Int", 4),

	FLOAT("Float", 4),

	LONG("Long", 8),

	DOUBLE("Double", 8);



	val jniName = 'j' + kName.lowercase()

	val arrayName = "${kName}Array"

	val directName = "Direct$kName"

	val bufferName = "Direct${kName}Buffer"

	val unsafeGetter = "get$kName"

	val unsafeSetter = "set$kName"

	val unsafeArrayGetter = "get${kName}s"

	val unsafeArraySetter = "set${kName}s"


}