package kvb.vkwrapper.pipeline

import kvb.vkwrapper.handle.Device

abstract class FileShaderCollection(directory: ShaderDirectory, name: String) : ShaderCollection {


	override val shaders = directory[name]

	override val device: Device = directory.device



	init {
		directory.shaderCollections.add(this)
	}

	
}