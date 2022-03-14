package kvb.window

import kvb.core.Core
import kvb.window.input.Button
import kvb.window.winapi.WinApi

interface WindowManager {


	val windows: List<Window>

	fun pollEvents()

	fun create(title: String, x: Int?, y: Int?, width: Int?, height: Int?): Window

	fun getButton(code: Int): Button?



	companion object : WindowManager by when {
		Core.isWindows -> WinApi
		else -> throw RuntimeException("Window implementation supported only on Windows.")
	}


}