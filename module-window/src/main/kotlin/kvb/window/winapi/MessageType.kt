package kvb.window.winapi

enum class MessageType(val value: Int) {


	DESTROY(0x0002),

	QUIT(0x0012),

	GET_MIN_MAX_INFO(0x0024);


}