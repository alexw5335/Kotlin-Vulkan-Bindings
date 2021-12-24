package scraper.type

import scraper.Named
import scraper.Primitive

sealed interface VkType : Named {


	val primitive: Primitive get() = Primitive.LONG


}