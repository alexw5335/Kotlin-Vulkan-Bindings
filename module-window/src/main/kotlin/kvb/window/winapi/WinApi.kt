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



	external fun createWindow(title: Long, x: Int, y: Int, width: Int, height: Int): Long

	external fun destroyWindow(hwnd: Long): Boolean

	external fun showWindow(hwnd: Long, code: Int): Boolean

	external fun getSystemMetrics(code: Int): Int

	external fun peekMessage(msg: Long): Boolean

	external fun translateMessage(msg: Long): Boolean

	external fun dispatchMessage(msg: Long): Int

	external fun getRect(hwnd: Long, rect: Long)

	external fun getClientRect(hwnd: Long, rect: Long)

	external fun getCursorPos(hwnd: Long, point: Long)

	external fun getKeyState(virtualKey: Int): Int

	external fun getFocussedWindow(): Long



	private fun isButtonPressed(code: Int) = getKeyState(code) and (1 shl 15) != 0

	val focussedWindow get() = windows.firstOrNull { it.hasFocus }

	fun getWindow(hwnd: Long) = windows.firstOrNull { it.hwnd == hwnd }



	/*
	Implementation
	 */



	override val windows = ArrayList<WinApiWindow>()



	override fun create(title: String, x: Int, y: Int, width: Int, height: Int): Window {
		val hwnd = stackGet {
			createWindow(encodeUtf16NT(title).address, x, y, width, height)
		}

		val window = WinApiWindow(hwnd)
		windows.add(window)
		return window
	}



	override fun getButton(code: Int) = Button.windowsMap[code]



	/*
	Event polling
	 */



	override fun pollEvents() {
		while(peekMessage(message.address))
			handleMessage()

		processHeldButtons()
	}



	private fun processHeldButtons() {
		val buttonsToRemove = HashSet<Button>()

		for(button in Button.pressed) {
			// Handle swapping windows while the button is still held.
			// Normally, WM_KEYUP would remove pressed buttons.
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



	/*
	Messages
	 */



	private val Long.highWord get() = ((this shr 16) and 0xFFFF).toInt()

	private val Long.lowWord get() = (this and 0xFFFF).toInt()



	@Suppress("unused")
	fun windowProc(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Boolean {
		var handled = true

		when(msg) {
			MessageType.DESTROY.value -> windows.removeIf { it.hwnd == hwnd }
			MessageType.SIZE.value    -> getWindow(hwnd)?.resizeAction(lparam.lowWord.toFloat(), lparam.highWord.toFloat())
			MessageType.MOVE.value    -> getWindow(hwnd)?.moveAction(lparam.lowWord.toFloat(), lparam.highWord.toFloat())
			else -> handled = false
		}

		return handled
	}



	private val message = Message(Unsafe)

	private val Message.wparamButton get() = Button.windowsMap[wparam.toInt()] ?: Button.NONE

	private val Message.hwndWindow get() = windows.firstOrNull { it.hwnd == hwnd }



	private fun handleMessage() {
		translateMessage(message.address)
		dispatchMessage(message.address)

		when(MessageType.map[message.message] ?: return) {
			MessageType.MOUSE_MOVE   -> message.handleMouseMove()
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



	private fun Message.handleMouseMove() {
		hwndWindow?.mouseMoveAction(lparam.lowWord.toFloat(), lparam.highWord.toFloat())
	}



	private fun Message.handleMouseWheel() {
		hwndWindow?.onScroll?.invoke(wparam.highWord.toFloat())
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