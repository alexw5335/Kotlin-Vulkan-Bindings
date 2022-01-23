package kvb.vkwrapper.shader

import kvb.vkwrapper.exception.VkShaderException
import kvb.vkwrapper.handle.Device
import java.nio.file.Files
import java.nio.file.Paths

class ShaderDirectory(val root: String, val device: Device, readImmediately: Boolean = true) {


	val shaders = HashMap<String, ArrayList<Shader>>()

	val shaderCollections = ArrayList<ShaderCollection>()



	init {
		if(readImmediately) readShaders(device)
	}



	fun readShaders(device: Device) = Files.walk(Paths.get(root)).use { stream ->
		for(path in stream) {
			val pathString = path.toString()
			val stage = ShaderCreation.stageFromFileName(pathString) ?: continue
			val name = path.fileName.toString().substringBefore('.')
			val shader = ShaderCreation.createFromFile(device, pathString, stage)
			shaders.getOrPut(name, ::ArrayList).add(shader)
		}
	}



	fun getShadersOfName(name: String) = shaders[name] ?: throw VkShaderException("No shaders of name: $name")



	fun destroy() {
		for(s in shaderCollections) s.destroy()
		for(e in shaders) for(s in e.value) s.module.destroy()
	}


}