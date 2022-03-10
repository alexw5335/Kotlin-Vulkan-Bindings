package kvb.engine.gui

@JvmInline
value class Colour(val value: Int) {


	constructor(r: Int, g: Int, b: Int, a: Int = 0) : this(
		(r.coerceAtMost(255) shl 0) or
		(g.coerceAtMost(255) shl 8) or
		(b.coerceAtMost(255) shl 16) or
		(a.coerceAtMost(255) shl 24)
	)



	constructor(r: Float, g: Float, b: Float, a: Float = 0F) : this(
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



	companion object {

		val NULL = Colour(0)

	}


}