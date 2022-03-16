package kvb.engine.gui.event

import kvb.engine.gui.Base

class ToggleEvent(source: Base, val toggled: Boolean) : BaseEvent(source) {

	override fun handleAction(base: Base) = base.toggleAction(this)

	override fun tryHandler(handler: BaseEventHandler<*>) {
		if(handler is Handler)
			handler.handle(this)
	}

	fun interface Handler : BaseEventHandler<ToggleEvent>

}