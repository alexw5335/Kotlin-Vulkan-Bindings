package kvb.engine.gui.layout

import kvb.engine.gui.Base

interface Oriented {
	
	
	var Base.pos1: Float
	var Base.pos2: Float
	var Base.length1: Float
	var Base.length2: Float
	var Base.interiorLength1: Float
	var Base.interiorLength2: Float
	var Base.totalLength1: Float
	var Base.totalLength2: Float
	
	var Base.firstPadding1: Float
	var Base.firstPadding2: Float
	var Base.secondPadding1: Float
	var Base.secondPadding2: Float
	val Base.padding1: Float
	val Base.padding2: Float

	var Base.firstBorder1: Float
	var Base.firstBorder2: Float
	var Base.secondBorder1: Float
	var Base.secondBorder2: Float
	val Base.border1: Float
	val Base.border2: Float

	var Base.firstMargin1: Float
	var Base.firstMargin2: Float
	var Base.secondMargin1: Float
	var Base.secondMargin2: Float
	val Base.margin1: Float
	val Base.margin2: Float

	var Aligned.alignment1: Alignment
	var Aligned.alignment2: Alignment
	
	
}