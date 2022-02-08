package kvb.window

import kvb.core.Platforms
import kvb.window.input.Button
import kvb.window.winapi.WinApi
import kvb.window.winapi.WinApiWindow

interface WindowManager {


	val windows: List<Window>

	fun pollEvents()

	fun create(title: String, x: Int, y: Int, width: Int, height: Int): Window

	fun getButton(code: Int): Button?



	companion object : WindowManager by when {
		Platforms.isWindows -> WinApi
		else                -> throw RuntimeException("Window implementation supported only on Windows.")
	}


}