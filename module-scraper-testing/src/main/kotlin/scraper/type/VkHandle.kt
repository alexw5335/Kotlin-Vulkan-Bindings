package scraper.type

import scraper.properties.Primitive

class VkHandle(
	override val name: String,
	override val genName: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive
) : VkType