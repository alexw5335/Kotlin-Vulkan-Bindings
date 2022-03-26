package kvb.engine.gui.event

interface BaseEventType



enum class DefaultBaseEventType : BaseEventType {

	MOUSE_ENTER,
	HOVER,
	MOUSE_EXIT,

	// BUTTON_INPUT events for left mouse button.
	PRESS,
	HOLD,
	RELEASE,

	BUTTON_INPUT,

	FOCUS_GAIN,
	FOCUS_LOSS,

	TOGGLE,

	DRAG_START,
	DRAG_UPDATE,
	DRAG_END;

}