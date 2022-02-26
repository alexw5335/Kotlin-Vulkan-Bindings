package kvb.codegen.vulkan.parse

import kvb.codegen.vulkan.name.NamedList
import kvb.codegen.vulkan.parse.*

class ParsedRegistry(
	val providerElements : NamedList<ProviderElement>,
	val commandElements  : NamedList<CommandElement>,
	val platformElements : NamedList<PlatformElement>,
	val constantElements : NamedList<ConstantElement>,
	val typeElements     : NamedList<TypeElement>
)