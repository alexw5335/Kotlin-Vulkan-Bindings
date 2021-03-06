package kvb.codegen.writer

/**
 * A procedurally generated function in C.
 */
class CFunction(
	val name        : String,
	val returnType  : String?                     = null,
	val params      : List<Pair<String, String>>  = emptyList(),
	val contents    : String?                     = null,
	val modifiers   : List<String>                = emptyList(),
	val modifiers2  : List<String>                = emptyList()
)