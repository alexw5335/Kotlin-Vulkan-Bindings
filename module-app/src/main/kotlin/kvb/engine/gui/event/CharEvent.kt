package kvb.engine.gui.event

import kvb.engine.gui.Base

class CharEvent(
	source   : Base,
	val char : Char
) : BaseEvent(source) {

	override fun handleAction(base: Base) = base.charAction(this)

	override fun tryHandler(handler: BaseEventHandler<*>) {
		if(handler is Handler)
			handler.handle(this)
	}

	fun interface Handler : BaseEventHandler<CharEvent>

}