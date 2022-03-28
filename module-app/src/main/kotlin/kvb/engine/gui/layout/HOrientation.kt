package kvb.engine.gui.layout

import kvb.engine.gui.Base
import kvb.engine.gui.MouseEvent

object HOrientation : Orientation {


	override var Base.pos: Float
		get()      = x
		set(value) { x = value }

	override var Base.pos2: Float
		get()      = y
		set(value) { y = value }



	override var Base.length: Float
		get()      = width
		set(value) { width = value }

	override var Base.length2: Float
		get()      = height
		set(value) { height = value }

	override var Base.interiorLength: Float
		get()      = interiorWidth
		set(value) { interiorWidth = value }

	override var Base.interiorLength2: Float
		get()      = interiorHeight
		set(value) { interiorHeight = value }



	override var Base.startPadding: Float
		get()      = paddingLeft
		set(value) { paddingLeft = value }

	override var Base.startPadding2: Float
		get()      = paddingTop
		set(value) { paddingTop = value }
	
	override var Base.endPadding: Float
		get()      = paddingRight
		set(value) { paddingRight = value }
	
	override var Base.endPadding2: Float
		get()      = paddingBottom
		set(value) { paddingBottom = value }



	override var Aligned.alignment
		get()      = hAlignment
		set(value) { hAlignment = value }

	override var Aligned.alignment2
		get()      = vAlignment
		set(value) { vAlignment = value }



	override fun Base.align(alignment: Alignment, child: Base) = hAlign(alignment, child)

	override fun Base.align2(alignment: Alignment, child: Base) = vAlign(alignment, child)



	override fun Base.transformUpAbsolute(pos: Float) = transformUpXAbsolute(pos)

	override fun Base.transformUpAbsolute2(pos: Float) = transformUpYAbsolute(pos)



	override fun Base.transformUpAbsolute(event: MouseEvent) = transformUpXAbsolute(event.mouseX)

	override fun Base.transformUpAbsolute2(event: MouseEvent) = transformUpYAbsolute(event.mouseY)


}