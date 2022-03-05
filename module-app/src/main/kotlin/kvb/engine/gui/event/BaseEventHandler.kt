package kvb.engine.gui.event

fun interface BaseEventHandler<T : BaseEvent> {

	fun handle(event: T)

}