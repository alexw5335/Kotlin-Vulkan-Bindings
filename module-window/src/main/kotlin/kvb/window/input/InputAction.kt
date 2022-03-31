package kvb.window.input

enum class InputAction {


	PRESS,

	HOLD,

	REPEAT,

	RELEASE;



	val isPress get() = this == PRESS

	val isHold get() = this == HOLD

	val isRepeat get() = this == REPEAT

	val isRelease get() = this == RELEASE

	val isRepeatOrPress get() = this == REPEAT || this == PRESS


}