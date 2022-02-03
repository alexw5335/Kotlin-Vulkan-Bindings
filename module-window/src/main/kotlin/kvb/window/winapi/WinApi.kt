package kvb.window.winapi

import kvb.core.memory.MemStacks
import kvb.window.Window
import kvb.window.WindowManager
import kvb.window.input.Button

@Suppress("MemberVisibilityCanBePrivate")
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

	external fun getFocussedWindow(): Long



	/*
	Implementation
	 */



	override val windows = ArrayList<WinApiWindow>()

	val focussedWindow get() = windows.firstOrNull { it.hasFocus }



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



	override fun pollEvents() {
		for(window in windows) {
			updateRect(window.hwnd)
			updateClientRect(window.hwnd)
		}

		while(peekMessage(message.address)) {
			handleMessage()
		}

		for(button in Button.pressed) {
			if(!isButtonPressed(button.code)) {
				Button.pressed.remove(button)
				continue
			}

			when(button.type) {
				Button.Type.KEY -> focussedWindow?.onKeyHold?.invoke(button)
				Button.Type.MOUSE -> focussedWindow?.onMouseHold?.invoke(button)
			}
		}
	}



	override fun getButton(code: Int) = Button.windowsMap[code]



	private fun isButtonPressed(code: Int) = getKeyState(code) and (1 shl 15) != 0



	/*
	Message
	 */



	private val message = Message(MemStacks.meta)

	private val Message.wparamButton get() = Button.windowsMap[wparam.toInt()] ?: Button.NONE

	private val Message.wparamHigh get() = (wparam shr 16).toShort().toInt()

	private val Message.hwndWindow get() = windows.firstOrNull { it.hwnd == hwnd }



	private fun handleMessage() {
		translateMessage(message.address)
		dispatchMessage(message.address)

		val type = MessageType.map[message.message] ?: return

		if(type == MessageType.DESTROY) {
			windows.firstOrNull { it.hwnd == message.wparam }?.let {
				windows.remove(it)
				removeWindow(it.hwnd)
			}

			return
		}

		when(type) {
			MessageType.MOUSE_WHEEL  -> message.handleMouseWheel()
			MessageType.KEY_UP       -> message.handleKeyUp()
			MessageType.KEY_DOWN     -> message.handleKeyDown()
			MessageType.LBUTTON_DOWN -> message.handleMouseButtonDown(Button.LEFT_MOUSE)
			MessageType.LBUTTON_UP   -> message.handleMouseButtonUp(Button.LEFT_MOUSE)
			MessageType.RBUTTON_DOWN -> message.handleMouseButtonDown(Button.RIGHT_MOUSE)
			MessageType.RBUTTON_UP   -> message.handleMouseButtonUp(Button.RIGHT_MOUSE)
			else                     -> { }
		}
	}



	private fun Message.handleMouseWheel() {
		hwndWindow?.onScroll?.invoke(wparamHigh)
	}



	private fun Message.handleKeyUp() {
		val button = wparamButton
		Button.pressed.remove(button)
		hwndWindow?.onKeyRelease?.invoke(button)
	}



	private fun Message.handleKeyDown() {
		val button = wparamButton
		Button.pressed.add(button)
		hwndWindow?.onKeyPress?.invoke(button)
	}



	private fun Message.handleMouseButtonDown(button: Button) {
		Button.pressed.add(button)
		hwndWindow?.onMousePress?.invoke(button)
	}



	private fun Message.handleMouseButtonUp(button: Button) {
		Button.pressed.remove(button)
		hwndWindow?.onMouseRelease?.invoke(button)
	}


}