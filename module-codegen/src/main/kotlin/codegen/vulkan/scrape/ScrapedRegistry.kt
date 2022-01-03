package codegen.vulkan.scrape

class ScrapedRegistry(
	val types     : List<VkType>,
	val commands  : List<Command>,
	val constants : List<Constant>
)