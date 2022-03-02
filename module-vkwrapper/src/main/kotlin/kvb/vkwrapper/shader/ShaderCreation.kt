package kvb.vkwrapper.shader

import kvb.core.FileUtils
import kvb.vkwrapper.exception.VkShaderException
import kvb.vkwrapper.handle.Device
import kvb.vulkan.ShaderStageFlags
import java.io.File

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



	fun compileAll(srcPath: String, outPath: String) {
		val srcDirectory = File(srcPath)
		val outDirectory = File(outPath)

		for(file in srcDirectory.listFiles() ?: return)
			file.delete()

		for(file in srcDirectory.listFiles() ?: return) {
			if(stageFromExtension(file.extension) == null) continue
			val process = Runtime.getRuntime().exec("glslc $file -o $outDirectory/${file.name}.spv")
			process.waitFor()
			val error = process.errorReader().readText()
			if(error.isNotEmpty()) throw VkShaderException(error)
		}
	}


}