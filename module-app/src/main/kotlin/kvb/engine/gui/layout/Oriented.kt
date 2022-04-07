package kvb.engine.gui.layout

import kvb.engine.gui.Base
import kvb.engine.gui.MouseEvent

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

	fun Base.align(alignment: Alignment, child: Base)
	fun Base.align2(alignment: Alignment, child: Base)

	fun Base.transformUpAbsolute(pos: Float): Float
	fun Base.transformUpAbsolute2(pos: Float): Float

	fun Base.transformUpAbsolute(event: MouseEvent) = transformUpAbsolute(event.primaryPos)
	fun Base.transformUpAbsolute2(event: MouseEvent) = transformUpAbsolute2(event.secondaryPos)

	val DualAlignment.primary: Alignment
	val DualAlignment.secondary: Alignment
	fun DualAlignment.withPrimary(primary: Alignment): DualAlignment
	fun DualAlignment.withSecondary(secondary: Alignment): DualAlignment

	val MouseEvent.primaryPos: Float
	val MouseEvent.secondaryPos: Float


}