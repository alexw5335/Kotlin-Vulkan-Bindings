package kvb.window.winapi

import kvb.core.memory.Unsafe
import kvb.core.memory.stackGet
import kvb.window.WindowManager
import kvb.window.input.InputButton

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



	private const val CW_USE_DEFAULT =  -0x80000000



	/*
	Implementation
	 */



	override val windows = ArrayList<WinApiWindow>()



	override fun create(title: String, x: Int?, y: Int?, width: Int?, height: Int?) = stackGet {
		val hwnd = createWindow(
			encodeUtf16NT(title).address,
			x ?: CW_USE_DEFAULT,
			y ?: CW_USE_DEFAULT,
			width ?: CW_USE_DEFAULT,
			height ?: CW_USE_DEFAULT
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

		processHeldButtons()
	}



	private fun processHeldButtons() {
		val released = HashSet<InputButton>()

		for(button in InputButton.pressed) {
			// Handle swapping windows while the button is still held.
			// Normally, WM_KEYUP would remove pressed buttons.
			if(!isButtonPressed(button.code)) {
				released.add(button)
				continue
			}

			button.processPressed()

			when(button.type) {
				InputButton.Type.KEY -> focussedWindow?.onKeyHold?.invoke(button)
				InputButton.Type.MOUSE -> focussedWindow?.onMouseHold?.invoke(button)
			}
		}

		for(button in released) button.onRelease()
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

	private val Message.repeatCount get() = lparam.lowWord



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
		hwndWindow?.onKeyRelease?.invoke(button)
	}



	private fun Message.handleKeyDown() {
		val button = wparamButton
		button.onPress()
		hwndWindow?.onKeyPress?.invoke(button, repeatCount)
	}



	private fun Message.handleMouseButtonDown(button: InputButton) {
		button.onPress()
		hwndWindow?.onMousePress?.invoke(button)
	}



	private fun Message.handleMouseButtonUp(button: InputButton) {
		button.onRelease()
		hwndWindow?.onMouseRelease?.invoke(button)
	}



	private fun Message.handleChar() {
		hwndWindow?.onChar?.invoke(Char(wparam.toInt()))
	}


}