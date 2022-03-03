package kvb.engine.gui

@JvmInline
value class Offsets private constructor(private val value: Long) {


	constructor(left: Int, top: Int, right: Int, bottom: Int) : this(
		left.toLong() or
		(top.toLong() shl 16) or
		(right.toLong() shl 32) or
		(bottom.toLong() shl 48)
	)

	constructor(all: Int) : this(all, all, all, all)

	constructor() : this(0L)


	val left: Int get() = (value and 0xFFFFFFFF).toInt()

	val top: Int get() = ((value shr 16) and 0xFFFFFFFF).toInt()

	val right: Int get() = ((value shr 32) and 0xFFFFFFFF).toInt()

	val bottom: Int get() = (value shr 48).toInt()



	override fun toString() = "(left: $left, top: $top, right: $right, bottom: $bottom)"


}