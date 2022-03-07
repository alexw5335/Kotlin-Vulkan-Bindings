package kvb.engine.gui.layout

import kvb.engine.gui.Base

object HOrientation : Orientation {


	override var Base.pos1: Float
		get() = x
		set(value) { x = value }

	override var Base.pos2: Float
		get() = y
		set(value) { y = value }



	override var Base.length1: Float
		get() = width
		set(value) { width = value }

	override var Base.length2: Float
		get() = height
		set(value) { height = value }

	override var Base.interiorLength1: Float
		get()      = interiorWidth
		set(value) { interiorWidth = value }

	override var Base.interiorLength2: Float
		get()      = interiorHeight
		set(value) { interiorHeight = value }

	override var Base.totalLength1: Float
		get()      = totalWidth
		set(value) { totalWidth = value }

	override var Base.totalLength2: Float
		get()      = totalHeight
		set(value) { totalHeight = value }



	override var Base.firstPadding1: Float
		get()      = paddingLeft
		set(value) { paddingLeft = value }

	override var Base.firstPadding2: Float
		get()      = paddingTop
		set(value) { paddingTop = value }
	
	override var Base.secondPadding1: Float
		get()      = paddingRight
		set(value) { paddingRight = value }
	
	override var Base.secondPadding2: Float
		get()      = paddingBottom
		set(value) { paddingBottom = value }
	
	override val Base.padding1: Float
		get() = padding.horizontal
	
	override val Base.padding2: Float
		get() = padding.vertical




	override var Base.firstBorder1: Float
		get()      = borderLeft
		set(value) { borderLeft = value }

	override var Base.firstBorder2: Float
		get()      = borderTop
		set(value) { borderTop = value }

	override var Base.secondBorder1: Float
		get()      = borderRight
		set(value) { borderRight = value }

	override var Base.secondBorder2: Float
		get()      = borderBottom
		set(value) { borderBottom = value }

	override val Base.border1: Float
		get() = border.horizontal

	override val Base.border2: Float
		get() = border.vertical



	override var Base.firstMargin1: Float
		get()      = marginLeft
		set(value) { marginLeft = value }

	override var Base.firstMargin2: Float
		get()      = marginTop
		set(value) { marginTop = value }

	override var Base.secondMargin1: Float
		get()      = marginRight
		set(value) { marginRight = value }

	override var Base.secondMargin2: Float
		get()      = marginBottom
		set(value) { marginBottom = value }

	override val Base.margin1: Float
		get() = margin.horizontal

	override val Base.margin2: Float
		get() = margin.vertical



	override var Aligned.alignment1
		get()      = hAlignment
		set(value) { hAlignment = value }

	override var Aligned.alignment2
		get()      = vAlignment
		set(value) { vAlignment = value }


}