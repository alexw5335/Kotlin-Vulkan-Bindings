package scraper.type

import scraper.naming.Named
import scraper.properties.Primitive

sealed interface VkType : Named {


	val genName: String

	val shouldGen: Boolean

	val primitive: Primitive


}