package kvb.engine.gui.layout

import kvb.engine.gui.Base

interface Oriented {
	
	
	var Base.pos1: Float
	var Base.pos2: Float

	var Base.length1: Float
	var Base.length2: Float

	var Base.interiorLength1: Float
	var Base.interiorLength2: Float
	
	var Base.startPadding1: Float
	var Base.startPadding2: Float
	var Base.endPadding1: Float
	var Base.endPadding2: Float

	var Aligned.alignment1: Alignment
	var Aligned.alignment2: Alignment
	
	
}