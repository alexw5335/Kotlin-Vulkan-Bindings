package kvb.window.winapi

import kvb.core.memory.MemStacks
import kvb.window.Window
import kvb.window.WindowManager

object WinApi : WindowManager {


	/*
	Natives
	 */



	external fun createWindow(title: Long, x: Int, y: Int, width: Int, height: Int): Long

	external fun removeWindow(hwnd: Long)

	external fun destroyWindow(hwnd: Long): Boolean

	external fun showWindow(hwnd: Long, code: Int): Boolean

	external fun getSystemMetrics(code: Int): Int

	external fun peekMessage(pMsg: Long): Boolean

	external fun translateMessage(pMsg: Long): Boolean

	external fun dispatchMessage(pMsg: Long): Int

	external fun updateRect(hwnd: Long)



	/*
	Implementation
	 */



	override val windows = ArrayList<WinApiWindow>()



	override fun create(title: String, x: Int, y: Int, width: Int, height: Int): Window {
		val address = MemStacks.get {
			createWindow(encodeUtf16NT(title).address, x, y, width, height)
		}

		return WinApiWindow(address).also(windows::add)
	}



	override fun update() {
		for(window in windows) updateRect(window.hwnd)

		while(peekMessage(message.address)) {
			handleMessage()
		}
	}



	/*
	Message
	 */



	private val message = Message(MemStacks.meta)



	private fun handleMessage() {
		translateMessage(message.address)
		dispatchMessage(message.address)

		if(message.message == MessageType.DESTROY.value) {
			val window = windows.first { it.hwnd == message.wparam }
			windows.remove(window)
			removeWindow(window.hwnd)
		}
	}


}