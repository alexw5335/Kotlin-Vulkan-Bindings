package kvb.vkwrapper.shader

import kvb.vkwrapper.handle.Device
import kvb.vulkan.Format
import kvb.vulkan.VertexInputRate

abstract class FileShaderCollection(directory: ShaderDirectory, name: String) : ShaderCollection {


	override val shaders = directory.getShadersOfName(name)

	override val device: Device = directory.device



	init {
		directory.shaderCollections.add(this)
	}
	
	
	
	/*
	Attributes
	 */

	
	
	protected fun attrib(location: Int, binding: Int, format: Format, offset: Int) = VertexAttribute(location, binding, format, offset)

	protected fun vec2Attrib(location: Int, binding: Int, offset: Int) = VertexAttribute(location, binding, Format.R32G32_SFLOAT, offset)
	
	protected fun vec3Attrib(location: Int, binding: Int, offset: Int) = VertexAttribute(location, binding, Format.R32G32B32_SFLOAT, offset)
	
	protected fun vec4Attrib(location: Int, binding: Int, offset: Int) = VertexAttribute(location, binding, Format.R32G32B32A32_SFLOAT, offset)
	
	
	
	/*
	Bindings
	 */
	
	
	
	protected fun binding(binding: Int, stride: Int) = VertexBinding(binding, stride, VertexInputRate.VERTEX)

	protected fun instanceBinding(binding: Int, stride: Int) = VertexBinding(binding, stride, VertexInputRate.INSTANCE)

	
}