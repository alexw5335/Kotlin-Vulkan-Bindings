package kvb.samples.sample0

import kvb.window.winapi.WinApi

object App {


	val window = WinApi.createWindow("My window")

	val context = AppContext(window)

	val sampleShader = SampleShader



	fun init() {
		context.onRecord = sampleShader::record
		context.record()
		window.show()
	}



	fun update() {
		while(true) {
			val start = System.nanoTime()
			WinApi.update()
			if(WinApi.windows.isEmpty()) break
			SampleShader.update()
			context.present()
			println("${(System.nanoTime() - start) / 1000} us")
			val toSleep = 16 - (System.nanoTime() - start) / 1000000
			if(toSleep > 0)
			Thread.sleep(toSleep)
		}
	}



	fun destroy() {
		context.destroy()
	}



	fun run() {
		Runtime.getRuntime().exec("res/shader/compile.bat").waitFor()
		init()
		update()
		destroy()
	}


}