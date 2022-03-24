package kvb.engine.gui.event

import kvb.engine.gui.Base

class DragEvent(
	source: Base,
	cursorX: Float,
	cursorY: Float,
	val type: DragEvent
) : MouseEvent(source, cursorX, cursorY) {

	enum class Type {
		START, UPDATE, STOP;
	}

	override fun handleAction(base: Base) = base.dragAction(this)

	override fun tryHandler(handler: BaseEventHandler<*>) {
		if(handler is Handler)
			handler.handle(this)
	}

	fun interface Handler : BaseEventHandler<DragEvent>

}