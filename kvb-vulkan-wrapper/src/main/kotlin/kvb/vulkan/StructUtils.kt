package kvb.vulkan


fun ClearValue.rgba(r: Float, g: Float, b: Float, a: Float) {
	color.float32.let { it[0] = r; it[1] = g; it[2] = b; it[3] = a }
}

fun ClearValue.depthStencil(depth: Float, stencil: Int) {
	depthStencil.let { it.depth = depth; it.stencil = stencil }
}

fun ClearValue.depth(depth: Float) {
	depthStencil.depth = depth
}

fun ClearValue.stencil(stencil: Int) {
	depthStencil.stencil = stencil
}