package kvb.app

import kvb.window.Window

abstract class VkContextBuilder {


	abstract val enableWindowing: Boolean

	abstract val enableDebug: Boolean

	abstract val window: Window?


}