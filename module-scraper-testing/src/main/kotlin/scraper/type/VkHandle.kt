package scraper.type

import scraper.writer.procedural.Primitive

class VkHandle(
	override val name: String,
	override val genName: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive
) : VkType