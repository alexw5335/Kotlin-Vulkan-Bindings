package scraper.type

import scraper.writer.procedural.Primitive

class VkNativeType(
	override val name: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive
) : VkType {


	override val genName = primitive.kName


}