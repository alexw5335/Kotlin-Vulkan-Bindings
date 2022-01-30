package kvb.vkwrapper.pipeline

import kvb.core.FileUtils
import kvb.vkwrapper.exception.VkShaderException
import kvb.vkwrapper.handle.Device
import kvb.vulkan.ShaderStageFlags

/**
 * Util functions for reading shaders from files.
 */
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
		device      : Device,
		path        : String,
		stage       : ShaderStageFlags,
		entryPoint  : String = "main"
	) = Shader(
		module      = FileUtils.readFullyAndFree(path) { device.createShaderModule(it) },
		stage       = stage,
		entryPoint  = entryPoint
	)



	fun createFromFile(
		device      : Device,
		path        : String,
		entryPoint  : String = "main"
	) = Shader(
		module      = FileUtils.readFullyAndFree(path) { device.createShaderModule(it) },
		stage       = stageFromFileName(path) ?: throw VkShaderException("Invalid shader file extension: $path"),
		entryPoint  = entryPoint
	)


}