package kvb.window

import kvb.core.Platform
import kvb.window.winapi.WinApi

interface WindowManager {


	val windows: List<Window>



	fun update()



	fun createWindow(
		title  : String = "Window ${windows.size}",
		x      : Int = 0,
		y      : Int = 0,
		width  : Int = 600,
		height : Int = 600
	): Window



	companion object {

		val INSTANCE: WindowManager by lazy {
			when {
				Platform.isWindows -> WinApi
				else -> throw RuntimeException("Windowing only supported on Windows")
			}
		}

	}


}