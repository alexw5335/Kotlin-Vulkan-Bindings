package kvb.core

import kvb.core.memory.MemStack
import kvb.core.memory.Persistent
import kvb.core.memory.Unsafe
import java.nio.file.*

object Core {


	/*
	Operating System
	 */



	private val osName = System.getProperty("os.name")



	val current = when {
		osName.startsWith("Windows")  -> Platform.WINDOWS
		osName.startsWith("LINUX")    -> Platform.LINUX
		osName.startsWith("Mac")      -> Platform.MAC
		else                          -> throw RuntimeException("Unidentified or unsupported platform: $osName")
	}



	val isWindows = current == Platform.WINDOWS

	val isLinux = current == Platform.LINUX

	val isMac = current == Platform.MAC



	/*
	Native library loading
	 */



	private fun loadFileNatives(path: String, extension: String) = Files.walk(Paths.get(path)).forEach {
		if(it.toString().endsWith(extension))
			System.load(it.toAbsolutePath().toString())
	}



	private fun loadResourceNatives(jarPath: String, filePath: String, extension: String) {
		Files.createDirectories(Paths.get(filePath))

		javaClass.getResourceAsStream(jarPath)!!.bufferedReader().use { dirReader ->
			while(dirReader.ready()) {
				val fileName = dirReader.readLine()
				if(fileName.toString().endsWith(extension)) {
					Files.copy(javaClass.getResourceAsStream("$jarPath/$fileName")!!, Paths.get("$filePath/$fileName"))
					System.load(Paths.get("$filePath/$fileName").toAbsolutePath().toString())
				}
			}
		}
	}



	private fun loadNatives() {
		if(Files.exists(Paths.get("natives"))) when(current) {
			Platform.WINDOWS -> loadFileNatives("natives/windows", ".dll")
			Platform.LINUX   -> loadFileNatives("natives/linux", ".so")
			Platform.MAC     -> loadFileNatives("natives/mac", ".dylib")
		} else when(current) {
			Platform.WINDOWS -> loadResourceNatives("/natives/windows", "natives/windows", ".dll")
			Platform.LINUX   -> loadResourceNatives("/natives/linux", "natives/linux", ".so")
			Platform.MAC     -> loadResourceNatives("/natives/mac", "natives/mac", ".dylib")
		}
	}



	/*
	Initialisation
	 */



	init {
		loadNatives()

		Unsafe
		MemStack
		Persistent


		if(Unsafe.instance.addressSize() == 4)
			throw IllegalStateException("32-bit JVMs are not supported.")
	}



	/** Triggers static initialisers. Subsequent calls will do nothing. */
	fun init() { }


}