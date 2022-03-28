package kvb.window.winapi

import kvb.core.memory.Unsafe
import kvb.core.memory.stackGet
import kvb.window.WindowManager
import kvb.window.input.InputAction
import kvb.window.input.InputButton
import kvb.window.winapi.WinApi.hwndWindow

@Suppress("MemberVisibilityCanBePrivate")
object WinApi : WindowManager {


	// TODO: Handle repeat count. May miss some key inputs otherwise.



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



	private val CW_USE_DEFAULT = 0x80000000.toUInt().toInt()



	/*
	Implementation
	 */



	override val windows = ArrayList<WinApiWindow>()



	override fun create(title: String, x: Int?, y: Int?, width: Int?, height: Int?) = stackGet {
		val hwnd = createWindow(
			encodeUtf16NT(title).address,
			x ?: 0,
			y ?: 0,
			width ?: 600,
			height ?: 600
		)

		WinApiWindow(hwnd).also(windows::add)
	}



	override fun getButton(code: Int) = InputButton.windowsMap[code]



	/*
	Event polling
	 */



	override fun pollEvents() {
		while(peekMessage(message.address))
			handleMessage()

		// Handle swapping windows while the button is still held, which doesn't produce WM_KEYUP.
		InputButton.pressed.filter { !isButtonPressed(it.code) }.forEach { it.onRelease() }
		InputButton.pressed.forEach { focussedWindow?.onButtonInput?.invoke(it, InputAction.HOLD) }
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

	private val Message.wparamButton get() = InputButton.windowsMap[wparam.toInt()] ?: InputButton.NONE

	private val Message.hwndWindow get() = windows.firstOrNull { it.hwnd == hwnd }



	private fun handleMessage() {
		translateMessage(message.address)
		dispatchMessage(message.address)

		when(MessageType.map[message.message] ?: return) {
			MessageType.MOUSE_MOVE   -> message.handleMouseMove()
			MessageType.MOUSE_WHEEL  -> message.handleMouseWheel()
			MessageType.KEY_UP       -> message.handleKeyUp()
			MessageType.KEY_DOWN     -> message.handleKeyDown()
			MessageType.LBUTTON_DOWN -> message.handleMouseButtonDown(InputButton.LEFT_MOUSE)
			MessageType.LBUTTON_UP   -> message.handleMouseButtonUp(InputButton.LEFT_MOUSE)
			MessageType.RBUTTON_DOWN -> message.handleMouseButtonDown(InputButton.RIGHT_MOUSE)
			MessageType.RBUTTON_UP   -> message.handleMouseButtonUp(InputButton.RIGHT_MOUSE)
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
		button.onRelease()
		hwndWindow?.onButtonInput?.invoke(button, InputAction.RELEASE)
	}



	private fun Message.handleKeyDown() {
		val button = wparamButton

		if(button.isPressed) {
			hwndWindow?.onButtonInput?.invoke(button, InputAction.REPEAT)
		} else {
			button.onPress()
			hwndWindow?.onButtonInput?.invoke(button, InputAction.PRESS)
		}
	}



	private fun Message.handleMouseButtonDown(button: InputButton) {
		if(button.isPressed) {
			hwndWindow?.onButtonInput?.invoke(button, InputAction.REPEAT)
		} else {
			button.onPress()
			hwndWindow?.onButtonInput?.invoke(button, InputAction.PRESS)
		}
	}



	private fun Message.handleMouseButtonUp(button: InputButton) {
		button.onRelease()
		hwndWindow?.onButtonInput?.invoke(button, InputAction.RELEASE)
	}



	private fun Message.handleChar() {
		hwndWindow?.onChar?.invoke(Char(wparam.toInt()))
	}


}