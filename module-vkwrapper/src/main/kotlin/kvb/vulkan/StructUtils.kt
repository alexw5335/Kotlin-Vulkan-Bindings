package kvb.vulkan

import kvb.core.memory.Allocator



/*
ClearValue
 */



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



fun Allocator.ClearValue(r: Float, g: Float, b: Float, a: Float) = ClearValue {
	it.rgba(r, g, b, a)
}

fun Allocator.ClearValue(depth: Float, stencil: Int) = ClearValue {
	it.depth(depth)
	it.stencil(stencil)
}

fun Allocator.ClearValue(r: Float, g: Float, b: Float, a: Float, depth: Float, stencil: Int) = ClearValue(2) {
	it[0].rgba(r, g, b, a)
	it[1].depthStencil(depth, stencil)
}