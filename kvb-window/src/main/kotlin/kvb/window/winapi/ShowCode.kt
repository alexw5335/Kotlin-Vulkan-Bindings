package kvb.window.winapi

/**
 * Values that can be given to the ShowWindow function. [HIDE] and [SHOW_NORMAL] should be used in most cases to hide
 * or show a window.
 */
enum class ShowCode(val value: Int) {


	/**
	 *  Hides the window and activates another window.
	 */
	HIDE(0),

	/**
	 * Activates and displays a window. If the window is minimised or maximised, the system restores it to its original
	 * size and position. An application should specify this flag when displaying the window for the first time.
	 */
	SHOW_NORMAL(1),

	/**
	 * Activates the window and displays it as a minimised window.
	 */
	SHOW_MINIMISED(2),

	/**
	 * Activates the window and displays it as a maximised window.
	 */
	SHOW_MAXIMISED(3),

	/**
	 * Displays a window in its most recent size and position. This value is similar to [SHOW_NORMAL], except that the
	 * window is not activated.
	 */
	SHOW_NO_ACTIVATE(4),

	/**
	 * Activates the window and displays it in its current size and position.
	 */
	SHOW(5),

	/**
	 * Minimizes the specified window and activates the next top-level window in the Z order.
	 */
	MINIMISE(6),

	/**
	 * Displays the window as a minimized window. This value is similar to [SHOW_MINIMISED], except the window is not
	 * activated.
	 */
	SHOW_MIN_NO_ACTIVE(7),

	/**
	 * Displays the window in its current size and position. This value is similar to [SHOW], except that the window is
	 * not activated.
	 */
	SHOW_NA(8),

	/**
	 * Activates and displays the window. If the window is minimised or maximised, the system restores it to its
	 * original size and position. An application should specify this flag when restoring a minimised window.
	 */
	RESTORE(9),

	/**
	 * Sets the show state based on the SW_ value specified in the STARTUPINFO structure passed to the CreateProcess
	 * function by the program that started the application.
	 */
	SHOW_DEFAULT(10),

	/**
	 * Minimises a window, even if the thread that owns the window is not responding. This flag should only be used when
	 * minimising windows from a different thread.
	 */
	FORCE_MINIMISE(11);


}