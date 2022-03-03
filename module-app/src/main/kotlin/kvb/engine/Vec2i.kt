package kvb.engine

@JvmInline
value class Vec2i private constructor(val value: Long) {

	constructor(x: Int, y: Int) : this(
		x.toLong() or (y.toLong() shl 32)
	)


	val x get() = (value and 0xFFFFFFFF).toInt()

	val y get() = ((value shr 32) and 0xFFFFFFFF).toInt()


	operator fun plus(other: Vec2i) = Vec2i(x + other.x, y + other.y)
}