package kvb.engine.gui.font

class Line(
	val index     : Int,
	val charIndex : Int,
	val x         : Float,
	val y         : Float,
	val width     : Float,
	val chars     : List<BinaryChar>
) {


	fun charX(index: Int): Float {
		var x = this.x
		for(i in 0 until index) x += chars[i].advanceWidth
		return x
	}


}