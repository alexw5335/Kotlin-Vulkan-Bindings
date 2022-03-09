package kvb.engine.gui.event

import kvb.engine.gui.Base

class HoldEvent(
	source: Base,
	cursorX: Float,
	cursorY: Float,
	val originX: Float,
	val originY: Float,
	val hovered: Boolean
) : MouseEvent(source, cursorX, cursorY) {

	override fun handleAction(base: Base) = base.holdAction(this)

	override fun tryHandler(handler: BaseEventHandler<*>) {
		if(handler is Handler)
			handler.handle(this)
	}

	fun interface Handler : BaseEventHandler<HoldEvent>

}