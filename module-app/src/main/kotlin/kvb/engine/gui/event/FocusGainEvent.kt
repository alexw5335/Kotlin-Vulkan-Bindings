package kvb.engine.gui.event

import kvb.engine.gui.Base

class FocusGainEvent(source   : Base) : BaseEvent(source) {


	override fun handleAction(base: Base) = base.focusGainAction(this)

	override fun tryHandler(handler: BaseEventHandler<*>) {
		if(handler is Handler)
			handler.handle(this)
	}

	fun interface Handler : BaseEventHandler<FocusGainEvent>


}