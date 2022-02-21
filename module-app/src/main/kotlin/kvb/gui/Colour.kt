package kvb.gui

inline class Colour(private val value: Int) {


	constructor(r: Int, g: Int, b: Int, a: Int) : this(r or (g shr 8) or (b shr 16) or (a shr 24))



	val r get() = value and 0xFF

	val g get() = (value shr 8) and 0xFF

	val b get() = (value shr 16) and 0xFF

	val a get() = (value shr 24) and 0xFF


}