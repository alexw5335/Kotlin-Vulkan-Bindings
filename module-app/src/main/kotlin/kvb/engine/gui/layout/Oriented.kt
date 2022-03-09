package kvb.engine.gui.layout

import kvb.engine.gui.Base

interface Oriented {
	
	
	var Base.pos: Float
	var Base.pos2: Float

	var Base.length: Float
	var Base.length2: Float

	var Base.interiorLength: Float
	var Base.interiorLength2: Float
	
	var Base.startPadding: Float
	var Base.startPadding2: Float
	var Base.endPadding: Float
	var Base.endPadding2: Float

	var Aligned.alignment: Alignment
	var Aligned.alignment2: Alignment

	fun Base.align(alignment: Alignment, child: Base)
	fun Base.align2(alignment: Alignment, child: Base)

	fun<T> T.align(child: Base) where T : Base, T : Aligned = align(alignment, child)
	fun<T> T.align2(child: Base) where T : Base, T : Aligned = align2(alignment2, child)

	
}