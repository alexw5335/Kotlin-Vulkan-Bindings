package kvb.codegen.vulkan.scraper.element

interface VkGenElement : VkElement {


	val shouldGen: Boolean

	val genName: String


}