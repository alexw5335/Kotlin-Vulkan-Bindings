package scraper.type

import scraper.writer.procedural.Primitive

class VkUnusedType(override val name: String): VkType {


	override val genName = name

	override val shouldGen = false

	override val primitive = Primitive.LONG


}