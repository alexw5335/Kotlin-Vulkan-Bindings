package kvb.codegen.vulkan

class ScrapedRegistry(
	val types     : List<VkType>,
	val commands  : List<VkCommand>,
	val constants : List<VkConstant>
)