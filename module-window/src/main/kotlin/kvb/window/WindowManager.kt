package kvb.window

import kvb.core.Platform
import kvb.window.winapi.WinApi

interface WindowManager {


	val windows: List<Window>

	fun update()

	fun create(title: String, x: Int, y: Int, width: Int, height: Int): Window

	var onScroll: (Int) -> Unit

	var onKeyUp: (Int) -> Unit



	companion object {

		val INSTANCE: WindowManager by lazy {
			when {
				Platform.isWindows -> WinApi
				else -> throw RuntimeException("Windowing only supported on Windows")
			}
		}

	}


}