package kvb.window.winapi

enum class MessageType(val value: Int) {


	DESTROY(0x0002),

	QUIT(0x0012),

	GET_MIN_MAX_INFO(0x0024),

	MOUSE_WHEEL(0x020A),

	KEY_UP(0x0101),

	KEY_DOWN(0x0100),

	MOUSE_MOVE(0x0200),

	LBUTTON_DCLICK(0x0203),

	LBUTTON_DOWN(0x0201),

	LBUTTON_UP(0x0202),

	RBUTTON_DCLICK(0x0206),

	RBUTTON_DOWN(0x0204),

	RBUTTON_UP(0x0205),

	SIZE(0x0005),

	MOVE(0x0003),

	CHAR(0x0102);



	companion object {
		val map = values().associateBy { it.value }
	}


}