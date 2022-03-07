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

	
}