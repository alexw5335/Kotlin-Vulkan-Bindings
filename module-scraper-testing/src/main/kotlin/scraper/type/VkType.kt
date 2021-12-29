package scraper.type

import scraper.naming.Named
import scraper.writer.procedural.Primitive

sealed interface VkType : Named {


	val genName: String

	val shouldGen: Boolean

	val primitive: Primitive


}