package kvb.codegen.vulkan

import kvb.codegen.vulkan.*
import scraper.kvb.codegen.vulkan.naming.NamedList

class ParsedRegistry(
	val providerElements : NamedList<ProviderElement>,
	val commandElements  : NamedList<CommandElement>,
	val platformElements : NamedList<PlatformElement>,
	val constantElements : NamedList<ConstantElement>,
	val typeElements     : NamedList<TypeElement>
)