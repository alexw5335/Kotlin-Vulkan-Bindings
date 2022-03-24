package kvb.engine.gui.event

import kvb.engine.gui.Base
import kvb.window.input.InputAction
import kvb.window.input.InputButton

class ButtonInputEvent(
	source          : Base,
	val button      : InputButton,
	val action      : InputAction,
	val repeatCount : Int
) : BaseEvent(source) {


	override fun handleAction(base: Base) = base.buttonInputAction(this)

	override fun tryHandler(handler: BaseEventHandler<*>) {
		if(handler is Handler)
			handler.handle(this)
	}

	fun interface Handler : BaseEventHandler<ButtonInputEvent>

}