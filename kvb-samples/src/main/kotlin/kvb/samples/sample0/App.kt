package kvb.samples.sample0

import kvb.window.winapi.WinApi

object App {


	val window = WinApi.createWindow("My window")

	val context = AppContext(window)



	fun init() {
		context.onRecord = {}
		context.record()
		window.show()
	}



	fun update() {
		while(true) {
			WinApi.update()

			if(WinApi.windows.isEmpty()) break

			context.present()

			Thread.sleep(16)
		}
	}



	fun destroy() {
		context.destroy()
	}



	fun run() {
		//Runtime.getRuntime().exec("res/shader/compile.bat").waitFor()
		init()
		update()
		destroy()
	}


}