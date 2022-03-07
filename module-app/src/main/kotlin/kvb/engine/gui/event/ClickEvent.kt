package kvb.engine.gui.event

import kvb.engine.gui.Base

class ClickEvent(
	source: Base,
	cursorX: Float,
	cursorY: Float
) : MouseEvent(source, cursorX, cursorY) {

	override fun handleAction(base: Base) = base.clickAction(this)

	override fun tryHandler(handler: BaseEventHandler<*>) {
		if(handler is Handler)
			handler.handle(this)
	}

	fun interface Handler : BaseEventHandler<ClickEvent>

}