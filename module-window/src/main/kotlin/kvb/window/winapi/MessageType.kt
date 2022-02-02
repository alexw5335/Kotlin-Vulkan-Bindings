package kvb.window.winapi

enum class MessageType(val value: Int) {


	DESTROY(0x0002),

	QUIT(0x0012),

	GET_MIN_MAX_INFO(0x0024),

	MOUSE_WHEEL(0x020A),

	//https://docs.microsoft.com/en-us/windows/win32/inputdev/wm-keyup
	KEY_UP(0x0101),

	LBUTTON_DCLICK(0x0203),

	LBUTTON_DOWN(0x0201),

	LBUTTON_UP(0x0202),

	RBUTTON_DCLICK(0x0206),

	RBUTTON_DOWN(0x0204),

	RBUTTON_UP(0x0205);


}