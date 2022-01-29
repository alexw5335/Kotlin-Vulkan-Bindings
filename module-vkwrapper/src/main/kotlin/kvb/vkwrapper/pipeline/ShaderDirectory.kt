package kvb.vkwrapper.pipeline

import kvb.vkwrapper.exception.VkShaderException
import kvb.vkwrapper.handle.Device
import java.nio.file.Files
import java.nio.file.Paths

class ShaderDirectory(val root: String, val device: Device) {


	/**
	 * A map of file names to lists of shaders that share that file name (excluding extensions).
	 */
	val shaders = HashMap<String, ArrayList<Shader>>()

	val shaderCollections = ArrayList<ShaderCollection>()




	init {
		Files.walk(Paths.get(root)).use { stream ->
			for(path in stream) {
				val pathString = path.toString()
				val stage = ShaderCreation.stageFromFileName(pathString) ?: continue
				val name = path.fileName.toString().substringBefore('.')
				val shader = ShaderCreation.createFromFile(device, pathString, stage)
				shaders.getOrPut(name, ::ArrayList).add(shader)
			}
		}
	}



	operator fun get(name: String) = shaders[name]
		?: throw VkShaderException("No shaders of name: $name")



	fun destroy() {
		for(s in shaderCollections)
			s.destroy()

		for(e in shaders)
			for(s in e.value)
				s.module.destroy()
	}


}