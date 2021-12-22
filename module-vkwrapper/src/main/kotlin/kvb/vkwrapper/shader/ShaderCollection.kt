package kvb.vkwrapper.shader

import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.Pipeline
import kvb.vkwrapper.handle.PipelineLayout

interface ShaderCollection {


	val shaders: List<Shader>

	val device: Device

	val attributes: List<VertexAttribute> get() = emptyList()

	val bindings: List<VertexBinding> get() = emptyList()

	val pipeline: Pipeline? get() = null

	val pipelineLayout: PipelineLayout? get() = null



	fun destroy() {
		pipeline?.destroy()
		shaders.forEach { it.module.destroy() }
		pipelineLayout?.destroy()
	}


}