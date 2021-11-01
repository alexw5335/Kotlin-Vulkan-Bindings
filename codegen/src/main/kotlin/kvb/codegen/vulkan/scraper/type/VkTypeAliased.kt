package kvb.codegen.vulkan.scraper.type

class VkTypeAliased(override val name: String, val alias: VkType): VkType by alias