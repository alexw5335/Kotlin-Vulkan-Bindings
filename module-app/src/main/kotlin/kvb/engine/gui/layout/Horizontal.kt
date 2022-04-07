package kvb.engine.gui.layout

import kvb.engine.gui.Base
import kvb.engine.gui.MouseEvent

object Horizontal : Orientation {


	override var Base.pos get() = x; set(value) { x = value }
	override var Base.pos2 get() = y; set(value) { y = value }

	override var Base.length get() = width; set(value) { width = value }
	override var Base.length2 get() = height; set(value) { height = value }

	override var Base.interiorLength get() = interiorWidth; set(value) { interiorWidth = value }
	override var Base.interiorLength2 get() = interiorHeight; set(value) { interiorHeight = value }

	override var Base.startPadding get() = paddingLeft; set(value) { paddingLeft = value }
	override var Base.startPadding2 get() = paddingTop; set(value) { paddingTop = value }

	override var Base.endPadding get() = paddingRight; set(value) { paddingRight = value }
	override var Base.endPadding2 get() = paddingBottom; set(value) { paddingBottom = value }

	override fun Base.align(alignment: Alignment, child: Base) = hAlign(alignment, child)
	override fun Base.align2(alignment: Alignment, child: Base) = vAlign(alignment, child)

	override fun Base.transformUpAbsolute(pos: Float) = transformUpXAbsolute(pos)
	override fun Base.transformUpAbsolute2(pos: Float) = transformUpYAbsolute(pos)

	override val DualAlignment.primary get() = hAlignment
	override val DualAlignment.secondary get() = vAlignment
	override fun DualAlignment.withPrimary(primary: Alignment) = withHorizontal(primary)
	override fun DualAlignment.withSecondary(secondary: Alignment) = withVertical(secondary)

	override val MouseEvent.primaryPos get() = mouseX
	override val MouseEvent.secondaryPos get() = mouseY


}