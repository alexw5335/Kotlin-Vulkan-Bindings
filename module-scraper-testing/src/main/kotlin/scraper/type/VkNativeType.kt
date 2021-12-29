package scraper.type

import scraper.properties.Primitive
import scraper.type.VkType

class VkNativeType(
	override val name: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive
) : VkType {


	override val genName = primitive.kName


}