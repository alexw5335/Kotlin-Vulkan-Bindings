package codegen.vulkan.parse

import codegen.vulkan.name.NamedList

class ParsedRegistry(
	val providerElements : NamedList<ProviderElement>,
	val commandElements  : NamedList<CommandElement>,
	val platformElements : NamedList<PlatformElement>,
	val constantElements : NamedList<ConstantElement>,
	val typeElements     : NamedList<TypeElement>
)