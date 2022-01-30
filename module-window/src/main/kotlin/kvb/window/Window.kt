package kvb.window

interface Window {


	fun show()

	fun hide()

	val x: Int

	val y: Int

	val width: Int

	val height: Int

	val clientX: Int

	val clientY: Int

	val clientWidth: Int

	val clientHeight: Int

	val cursorX: Int

	val cursorY: Int


}