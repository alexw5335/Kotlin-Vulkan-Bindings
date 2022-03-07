package kvb.engine.gui

@JvmInline
value class Offsets2 private constructor(private val value: Long) {


	constructor(top: Int, right: Int, bottom: Int, left: Int) : this(
		top.toLong() or
		(right.toLong() shl 16) or
		(bottom.toLong() shl 32) or
		(left.toLong() shl 48)
	)

	constructor(all: Int) : this(all, all, all, all)

	constructor() : this(0L)



	val top: Int get() = (value and 0xFFFFFFFF).toInt()

	val right: Int get() = ((value shr 16) and 0xFFFFFFFF).toInt()

	val bottom: Int get() = ((value shr 32) and 0xFFFFFFFF).toInt()

	val left: Int get() = (value shr 48).toInt()

	val horizontal get() = left + right

	val vertical get() = top + bottom



	override fun toString() = "(top: $top, right: $right, bottom: $bottom, left: $left)"


}