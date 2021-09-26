package vulkan.scraper.type

import memory.Primitive
import vulkan.scraper.VkScraperUtils

data class VkTypeHandle(
	override val name    : String,
	val parent           : String?,
	override val aliased : Boolean = false): VkType {


	override val shortName = VkScraperUtils.handleShortName(name)

	override val primitive = Primitive.POINTER

	override val genName = this.shortName + "H"


}