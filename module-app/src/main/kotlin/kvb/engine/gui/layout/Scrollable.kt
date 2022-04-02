package kvb.engine.gui.layout

interface Scrollable {


	/*
	// If viewportWidth / contentWidth <= 1F, then the scroll bar must be disabled.
	keyLength = scrollBarLength * viewportWidth / contentWidth
	 */



	val scrollableWidthRatio: Float

	val scrollableHeightRatio: Float



	fun onScroll(orientation: Orientation, ratio: Float)


}