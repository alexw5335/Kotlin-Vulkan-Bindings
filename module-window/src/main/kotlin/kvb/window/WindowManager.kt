package kvb.window

interface WindowManager<T: Window> {


	val windows: List<T>



	fun createWindow(
		title  : String = "Window ${windows.size}",
		x      : Int = 0,
		y      : Int = 0,
		width  : Int = 600,
		height : Int = 600
	): T


}