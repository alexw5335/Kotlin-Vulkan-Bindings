package scraper.type

import scraper.properties.Primitive

class VkUnusedType(override val name: String): VkType {


	override val genName = name

	override val shouldGen = false

	override val primitive = Primitive.LONG


}