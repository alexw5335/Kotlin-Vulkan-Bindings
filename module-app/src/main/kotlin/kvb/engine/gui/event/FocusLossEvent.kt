package kvb.engine.gui.event

import kvb.engine.gui.Base

class FocusLossEvent(source: Base) : BaseEvent(source) {


	override fun handleAction(base: Base) = base.focusLossAction(this)

	override fun tryHandler(handler: BaseEventHandler<*>) {
		if(handler is Handler)
			handler.handle(this)
	}

	fun interface Handler : BaseEventHandler<FocusLossEvent>


}