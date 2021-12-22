package kvb.vkwrapper.shader

import kvb.core.file.FileUtils
import kvb.vkwrapper.exception.VkShaderException
import kvb.vkwrapper.handle.Device
import kvb.vulkan.ShaderStageFlags

object ShaderCreation {


	/**
	 * Gets the [ShaderStageFlags] bit that is represented by the given file [extension].
	 */
	fun stageFromExtension(extension: String) = when(extension) {
		"vert" -> ShaderStageFlags.VERTEX
		"frag" -> ShaderStageFlags.FRAGMENT
		"geom" -> ShaderStageFlags.GEOMETRY
		"comp" -> ShaderStageFlags.COMPUTE
		"tese" -> ShaderStageFlags.TESSELLATION_EVALUATION
		"tesc" -> ShaderStageFlags.TESSELLATION_CONTROL
		else   -> null
	}



	fun stageFromFileName(fileName: String) : ShaderStageFlags? {
		if(!fileName.endsWith(".spv")) return null
		return stageFromExtension(fileName.substring(fileName.length - 8, fileName.length - 4))
	}



	fun createFromFile(
		device            : Device,
		path              : String,
		stage             : ShaderStageFlags,
		defaultEntryPoint : String = "main"
	) = Shader(
		FileUtils.readFullyAndFree(path) { device.createShaderModule(it) },
		stage,
		defaultEntryPoint
	)



	fun createFromFile(
		device            : Device,
		path              : String,
		defaultEntryPoint : String = "main"
	) = createFromFile(
		device,
		path,
		stageFromFileName(path) ?: throw VkShaderException("Invalid shader file extension: $path"),
		defaultEntryPoint
	)


}