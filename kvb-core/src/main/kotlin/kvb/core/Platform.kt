package kvb.core

import kvb.core.memory.Unsafe
import java.nio.file.Files
import java.nio.file.Paths

object Platform {


	/*
	Operating System
	 */



	val osName = System.getProperty("os.name")

	val isWindows = osName.startsWith("Windows")

	val isMac = osName.startsWith("Mac")



	/*
	Natives loading
	 */



	private fun loadFileNatives(path: String, extension: String) = Files.walk(Paths.get(path)).forEach {
		if(it.endsWith(extension))
			System.load(it.toAbsolutePath().toString())
	}



	private fun loadNatives() {
		when {
			isWindows -> loadFileNatives("natives/windows", ".dll")
			isMac -> loadFileNatives("natives/mac", ".dylib")
		}
	}



	/*
	Initialisation
	 */



	init {
		if(Unsafe.instance.addressSize() == 4)
			throw IllegalStateException("32-bit JVMs are not supported.")

		loadNatives()
	}


}