package kvb.window.winapi

import kvb.core.memory.MemStacks
import kvb.window.Window
import kvb.window.WindowManager
import kvb.window.input.Button

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

	external fun updateClientRect(hwnd: Long)

	external fun getCursorX(hwnd: Long): Int

	external fun getCursorY(hwnd: Long): Int

	external fun getKeyState(virtualKey: Int): Int



	/*
	Implementation
	 */



	override val windows = ArrayList<WinApiWindow>()



	override fun create(title: String, x: Int, y: Int, width: Int, height: Int): Window {
		val address = MemStacks.get {
			createWindow(encodeUtf16NT(title).address, x, y, width, height)
		}

		val window = WinApiWindow(address)
		windows.add(window)
		updateRect(window.hwnd)
		updateClientRect(window.hwnd)
		return window
	}



	override fun update() {
		for(window in windows) {
			updateRect(window.hwnd)
			updateClientRect(window.hwnd)
		}

		while(peekMessage(message.address)) {
			handleMessage()
		}
	}



	override fun getButton(code: Int) = Button.windowsMap[code]



	/*
	Message
	 */



	private val message = Message(MemStacks.meta)



	private fun handleMessage() {
		translateMessage(message.address)
		dispatchMessage(message.address)

		val hwnd = message.hwnd
		val window = windows.firstOrNull { it.hwnd == hwnd }

		if(message.message == MessageType.DESTROY.value) {
			println(hwnd)
			println(message.wparam)
			windows.first { it.hwnd == message.wparam }.let {
				windows.remove(it)
				removeWindow(it.hwnd)
			}
		} else if(message.message == MessageType.MOUSE_WHEEL.value) {
			//onScroll(((message.wparam shr 16) and 0xffff).toShort().toInt())
		} else if(message.message == MessageType.KEY_UP.value) {
			//onKeyUp(message.wparam.toInt())
			println(getButton(message.wparam.toInt()))
		}
	}


}