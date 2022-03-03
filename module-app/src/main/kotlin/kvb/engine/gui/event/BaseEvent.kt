package kvb.engine.gui.event

import kvb.engine.gui.Base

abstract class BaseEvent(val source: Base) {

	var finished = false

	fun bubble() {
		var current = source

		while(!finished) {
			// current.handleEvent(this)
			current = current.parent ?: break
		}
	}

	abstract fun handleAction(base: Base)

	abstract fun tryHandler(handler: BaseEventHandler)

}