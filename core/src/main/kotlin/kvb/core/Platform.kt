package kvb.core

import java.nio.file.Files
import java.nio.file.Paths

object Platform {


	/*
	Properties
	 */



	private val osName = System.getProperty("os.name")

	private val osArch = System.getProperty("os.arch")



	init { if(!osArch.contains("64")) throw IllegalStateException("32-bit JVMs are not supported.") }



	/*
	Operating System
	 */



	val isWindows = osName.startsWith("Windows")

	val isMac = osName.startsWith("Mac")

	val isLinux = osName.startsWith("Linux")



	/*
	Natives loading
	 */



	private fun loadFileNatives(path: String, extension: String) = Files.walk(Paths.get(path)).forEach {
		if(it.endsWith(extension))
			System.load(it.toAbsolutePath().toString())
	}



	fun loadNatives() {
		when {
			isWindows -> loadFileNatives("natives/windows", ".dll")
			isMac -> loadFileNatives("natives/mac", ".dylib")
		}
	}


}