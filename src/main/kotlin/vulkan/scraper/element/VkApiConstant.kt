package vulkan.scraper.element

import vulkan.scraper.VkScraperUtils

data class VkApiConstant(override val name : String,
						 val value         : String,
						 val intValue      : Int?    = null,
						 val longValue     : Long?   = null,
						 val floatValue    : Float?  = null,
						 val aliased       : Boolean = false) : VkElement {


	override val shortName get() = VkScraperUtils.apiConstantShortName(name)


}