package kvb.engine.gui.layout

import kvb.engine.gui.Base

object VOrientation : Orientation {


	override var Base.pos1: Float
		get()      = y
		set(value) { y = value }

	override var Base.pos2: Float
		get()      = x
		set(value) { x = value }



	override var Base.length1: Float
		get()      = height
		set(value) { height = value }

	override var Base.length2: Float
		get()      = width
		set(value) { width = value }

	override var Base.interiorLength1: Float
		get()      = interiorHeight
		set(value) { interiorHeight = value }

	override var Base.interiorLength2: Float
		get()      = interiorWidth
		set(value) { interiorWidth = value }



	override var Base.startPadding1: Float
		get()      = paddingTop
		set(value) { paddingTop = value }

	override var Base.startPadding2: Float
		get()      = paddingLeft
		set(value) { paddingLeft = value }
	
	override var Base.endPadding1: Float
		get()      = paddingBottom
		set(value) { paddingBottom = value }
	
	override var Base.endPadding2: Float
		get()      = paddingRight
		set(value) { paddingRight = value }



	override var Aligned.alignment1
		get()      = vAlignment
		set(value) { vAlignment = value }

	override var Aligned.alignment2
		get()      = hAlignment
		set(value) { hAlignment = value }
	

}