package kvb.window.winapi

import kvb.core.memory.MemStacks
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



	private val CW_USEDEFAULT = 0x80000000.toUInt().toInt()



	/*
	Implementation
	 */



	override val windows = ArrayList<WinApiWindow>()



	override fun createWindow(
		title  : String,
		x      : Int,
		y      : Int,
		width  : Int,
		height : Int,
	) = MemStacks.get {
		val address = createWindow(encodeUtf16NT(title).address, x, y, width, height)
		val window = WinApiWindow(WinApiWindow.Struct(address))
		windows.add(window)
		window
	}



	/*
	Message
	 */



	private val message = Message(MemStacks.meta)



	private fun handleMessage() {
		translateMessage(message.address)
		dispatchMessage(message.address)

		if(message.message == 0x0002) {
			val window = windows.first { it.hwnd == message.wparam }
			windows.remove(window)
			removeWindow(window.hwnd)
		}
	}



	override fun update() {
		while(peekMessage(message.address)) {
			handleMessage()
		}
	}


}