package kvb.samples.app

import kvb.vkwrapper.shader.ShaderDirectory
import kvb.window.winapi.WinApi

object AppTest {


	val window = WinApi.createWindow("My window", 0, 0, 700, 700)



	val context = object : ContextBuilder() {

		override val window = this@AppTest.window

		override val isDebugEnabled = true

	}.build()



	val shaders = ShaderDirectory("res/shader/out", context.device)



	fun run() {
		Runtime.getRuntime().exec("res/shader/compile.bat").waitFor()

		window.show()

		while(true) {
			WinApi.update()
			if(WinApi.windows.isEmpty()) break
		}
	}


}