package kvb.engine.gui

import kvb.window.Window

class Gui(val root: Base) {



	/*
	Variables
	 */



	/**
	 * The [Base] over which the cursor is located.
	 */
	var hovered: Base? = null
		private set

	/**
	 * The [Base] over which the cursor was located when the last [newPressEvent] was triggered.
	 */
	var pressed: Base? = null
		private set



	/**
	 * The [Base] that is currently receiving key input.
	 */
	var keyFocus: Base? = null
		private set

	/**
	 * The [Base] that is currently receiving scroll input.
	 */
	var scrollFocus: Base? = null
		private set

	/**
	 * The [Base] that is currently receiving drag input.
	 */
	var dragFocus: Base? = null
		private set

	/**
	 * The [Base] that is currently receiving mouse input.
	 */
	var mouseFocus: Base? = null
		private set



	fun onWindowSizeChanged(window: Window) {
		root.width = window.width.toFloat()
		root.height = window.height.toFloat()
	}



	/*
	Left mouse press
	 */



	fun onPress(cursorX: Float, cursorY: Float) {
		pressed = hovered
	}



	fun onHold(cursorX: Float, cursorY: Float) {

	}


}



/*
Gui model:
	- Each window has a GUI, although there is only one window.
	- A Base can access the GUI that it is in through Gui.current. This
	should only be used in methods that are called by the GUI.
	- Each Base has a protected list of internal children.
		- If a Base is designed to add other children, then it must extend Pane.
	- Each Base has a padding, border, and margin.

- Need to work out how to initialise the GUI, window, and graphics.
	- Make everything global?
- GUIs are not instantiated by the user. They are maintained for each window by the Guis object.
	- val window = Engine.createWindow?
- The Engine object encapsulates the global window, global Vulkan Context, and the global GUI.
- EngineBuilder configures all engine initialisation config.
	- Engine.root = StackPane { }

- For the moment, BaseModels are sufficient for rendering.
	- BaseModel is just an interface with a render function.

- 3 button actions:
	- press (initial press only)
	- hold (doesn't include initial press)
	- release (or click)

*/