package kvb.engine.gui.font

class BinaryChar(
	val char: Char,
	val texture: Long,
	val yOffset: Int,
	val width: Int,
	val height: Int,
	val advanceWidth: Int,
	val scale: Int = 1
) {


	val yExtent = yOffset + height



	fun scaled(scale: Int) = BinaryChar(
		char,
		texture,
		yOffset * scale / this.scale,
		width * scale / this.scale,
		height * scale / this.scale,
		advanceWidth * scale / this.scale,
		scale,
	)


}