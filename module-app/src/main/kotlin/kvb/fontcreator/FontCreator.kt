package kvb.fontcreator

import kvb.window.WindowManager

object FontCreator {


	val context = FontCreatorContext



	private const val targetFps = 500

	private const val frameTime = 1_000_000 / targetFps



	private fun render() {
		context.surfaceSystem.onRecord = {
			SimplePipeline.bind(it)
			it.draw(4)
		}

		context.surfaceSystem.record()
		context.surfaceSystem.present()
	}



	fun run() {
		context.window.show()

		while(true) {
			val frameStart = System.nanoTime()

			WindowManager.pollEvents()
			if(WindowManager.windows.isEmpty()) break

			render()

			val elapsedMicroseconds = (System.nanoTime() - frameStart) / 1_000

			if(elapsedMicroseconds < frameTime) {
				Thread.sleep((frameTime - elapsedMicroseconds) / 1000)
			}
		}
	}


}