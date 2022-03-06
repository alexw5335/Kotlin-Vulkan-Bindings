package kvb.engine.gui.event

import kvb.engine.gui.Base

class MouseEnterEvent(
	source: Base,
	cursorX: Float,
	cursorY: Float
) : MouseEvent(source, cursorX, cursorY) {

	override fun handleAction(base: Base) = base.mouseEnterAction(this)

	override fun tryHandler(handler: BaseEventHandler<*>) {
		if(handler is Handler)
			handler.handle(this)
	}

	fun interface Handler : BaseEventHandler<MouseEnterEvent>

}