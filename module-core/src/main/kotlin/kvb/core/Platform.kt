package kvb.core

import kvb.core.file.FileUtils
import kvb.core.memory.Unsafe
import java.io.File
import java.io.IOException
import java.nio.file.*
import java.nio.file.attribute.BasicFileAttributes
import kotlin.io.path.deleteExisting
import kotlin.io.path.listDirectoryEntries

object Platform {


	/*
	Operating System
	 */



	val osName = System.getProperty("os.name")

	val isWindows = osName.startsWith("Windows")

	val isMac = osName.startsWith("Mac")



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
		if(Files.exists(Paths.get("natives"))) {
			when {
				isWindows -> loadFileNatives("natives/windows", ".dll")
				isMac -> loadFileNatives("natives/mac", ".dylib")
			}
		} else {
			when {
				isWindows -> loadResourceNatives("/natives/windows", "natives/windows", ".dll")
				isMac -> loadResourceNatives("/natives/mac", "natives/mac", ".dylib")
			}
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



	/** Triggers static initialisers. Subsequent calls will do nothing. */
	fun init() { }


}