package memory.struct

class StructLayout(
	val alignment : Int,
	val size      : Int,
	val offsets   : IntArray,
)