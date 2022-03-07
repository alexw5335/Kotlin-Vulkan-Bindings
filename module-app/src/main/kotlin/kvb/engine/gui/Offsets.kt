package kvb.engine.gui

data class Offsets(val top: Float, val right: Float, val bottom: Float, val left: Float) {


	constructor(all: Float) : this(all, all, all, all)

	constructor() : this(0F, 0F, 0F, 0F)



	val horizontal get() = left + right

	val vertical get() = top + bottom

	val valid get() = top != 0F && right != 0F && bottom != 0F && left != 0F



	fun withTop(top: Float) = Offsets(top, right, bottom, left)

	fun withRight(right: Float) = Offsets(top, right, bottom, left)

	fun withBottom(bottom: Float) = Offsets(top, right, bottom, left)

	fun withLeft(left: Float) = Offsets(top, right, bottom, left)



	override fun toString() = "(top: $top, right: $right, bottom: $bottom, left: $left)"


}