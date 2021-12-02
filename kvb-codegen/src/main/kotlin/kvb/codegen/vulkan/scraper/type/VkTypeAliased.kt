package kvb.codegen.vulkan.scraper.type

class VkTypeAliased(override val name: String, val alias: VkType): VkType {

	override val primitive = alias.primitive

}