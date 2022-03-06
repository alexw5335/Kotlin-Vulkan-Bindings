package kvb.window.winapi

import kvb.core.memory.*
import kvb.window.Window
import kvb.window.WindowManager
import kvb.window.input.Button

@Suppress("MemberVisibilityCanBePrivate")
object WinApi : WindowManager {


	/*
	Natives
	 */



	external fun createWindow(window: Long, title: Long, x: Int, y: Int, width: Int, height: Int)

	external fun destroyWindow(window: Long): Boolean

	external fun showWindow(window: Long, code: Int): Boolean

	external fun getSystemMetrics(code: Int): Int

	external fun peekMessage(msg: Long): Boolean

	external fun translateMessage(msg: Long): Boolean

	external fun dispatchMessage(msg: Long): Int

	external fun updateRect(window: Long)

	external fun updateClientRect(window: Long)

	external fun getCursorX(window: Long): Int

	external fun getCursorY(window: Long): Int

	external fun getKeyState(virtualKey: Int): Int

	external fun getFocussedWindow(): Long



	/*
	Implementation
	 */



	override val windows = ArrayList<WinApiWindow>()

	val focussedWindow get() = windows.firstOrNull { it.hasFocus }



	override fun create(title: String, x: Int, y: Int, width: Int, height: Int): Window {
		val window = WinApiWindow(Unsafe)

		stack {
			createWindow(window.address, encodeUtf16NT(title).address, x, y, width, height)
		}

		windows.add(window)
		updateRect(window.address)
		updateClientRect(window.address)
		return window
	}



	override fun pollEvents() {
		for(window in windows) {
			val prevClientWidth = window.clientWidth
			val prevClientHeight = window.clientHeight

			updateRect(window.address)
			updateClientRect(window.address)

			if(window.clientWidth != prevClientWidth || window.clientHeight != prevClientHeight) {
				window.onClientSizeChanged(prevClientWidth, prevClientHeight)
			}
		}

		while(peekMessage(message.address)) {
			handleMessage()
		}

		val buttonsToRemove = HashSet<Button>()

		for(button in Button.pressed) {
			// Handle swapping windows while the button is still held,
			// in which case the original window does not receive the message.
			if(!isButtonPressed(button.code)) {
				buttonsToRemove.add(button)
				continue
			}

			when(button.type) {
				Button.Type.KEY -> focussedWindow?.onKeyHold?.invoke(button)
				Button.Type.MOUSE -> focussedWindow?.onMouseHold?.invoke(button)
			}
		}

		Button.pressed.removeAll(buttonsToRemove)
	}



	override fun getButton(code: Int) = Button.windowsMap[code]

	private fun isButtonPressed(code: Int) = getKeyState(code) and (1 shl 15) != 0



	/*
	Message
	 */



	private val message = Message(Unsafe)

	private val Message.wparamButton get() = Button.windowsMap[wparam.toInt()] ?: Button.NONE

	private val Message.wparamHigh get() = (wparam shr 16).toShort().toInt()

	private val Message.hwndWindow get() = windows.firstOrNull { it.hwnd == hwnd }



	fun windowProc(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Boolean {
		var handled = true

		when(MessageType.map[msg] ?: return false) {
			MessageType.DESTROY -> { }
			else -> handled = false
		}

		return handled
	}



	private fun handleMessage() {
		translateMessage(message.address)
		dispatchMessage(message.address)

		when(MessageType.map[message.message] ?: return) {
			MessageType.MOUSE_WHEEL  -> message.handleMouseWheel()
			MessageType.KEY_UP       -> message.handleKeyUp()
			MessageType.KEY_DOWN     -> message.handleKeyDown()
			MessageType.LBUTTON_DOWN -> message.handleMouseButtonDown(Button.LEFT_MOUSE)
			MessageType.LBUTTON_UP   -> message.handleMouseButtonUp(Button.LEFT_MOUSE)
			MessageType.RBUTTON_DOWN -> message.handleMouseButtonDown(Button.RIGHT_MOUSE)
			MessageType.RBUTTON_UP   -> message.handleMouseButtonUp(Button.RIGHT_MOUSE)
			MessageType.CHAR         -> message.handleChar()
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



	private fun Message.handleChar() {
		hwndWindow?.onChar?.invoke(Char(wparam.toInt()))
	}


}