package kvb.engine.gui.event

fun interface BaseEventHandler<in T : BaseEvent> {

	fun handle(event: T)

}