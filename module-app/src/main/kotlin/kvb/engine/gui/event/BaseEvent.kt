package kvb.engine.gui.event

import kvb.engine.gui.Base

interface BaseEvent {


	val source: Base



	fun tryHandler(c: Class<*>, handler: (Any) -> Unit) {
		if(c == this::class.java)
			handler.invoke(this)
	}


}



class ClickEvent(override val source: Base, val mouseX: Float, val mouseY: Float) : BaseEvent
class HoverEvent(override val source: Base, val mouseX: Float, val mouseY: Float) : BaseEvent
class HoldEvent(override val source: Base, val mouseX: Float, val mouseY: Float): BaseEvent