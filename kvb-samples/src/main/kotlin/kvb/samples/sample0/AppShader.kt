package kvb.samples.sample0

import kvb.vkwrapper.shader.FileShaderCollection

abstract class AppShader(name: String) : FileShaderCollection(App.context.shaderDirectory, name) {

	protected val context = App.context

}