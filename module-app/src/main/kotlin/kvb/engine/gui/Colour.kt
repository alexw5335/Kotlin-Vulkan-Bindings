package kvb.engine.gui

@JvmInline
value class Colour(val value: Int) {


	constructor(r: Int, g: Int, b: Int, a: Int) : this(
		((r and 255) shl 0) or
		((g and 255) shl 8) or
		((b and 255) shl 16) or
		((a and 255) shl 24)
	)



	constructor(r: Float, g: Float, b: Float, a: Float) : this(
		(r * 255).toInt(),
		(g * 255).toInt(),
		(b * 255).toInt(),
		(a * 255).toInt()
	)



	val r get() = value and 0xFF

	val g get() = (value shr 8) and 0xFF

	val b get() = (value shr 16) and 0xFF

	val a get() = (value shr 24) and 0xFF


	override fun toString() = "$value: ($r, $g, $b, $a)"


}