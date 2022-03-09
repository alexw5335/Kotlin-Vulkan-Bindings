package kvb.engine.gui.event

import kvb.engine.gui.Base

class PressEvent(
	source: Base,
	cursorX: Float,
	cursorY: Float
) : MouseEvent(source, cursorX, cursorY) {

	override fun handleAction(base: Base) = base.pressAction(this)

	override fun tryHandler(handler: BaseEventHandler<*>) {
		if(handler is Handler)
			handler.handle(this)
	}

	fun interface Handler : BaseEventHandler<PressEvent>

}