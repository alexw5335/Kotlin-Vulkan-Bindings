package scraper

class ParsedRegistry(
	val commands   : NamedList<CommandElement>,
	val platforms  : NamedList<PlatformElement>,
	val constants  : NamedList<ConstantElement>,
	val type       : NamedList<TypeElement>,
	val enums      : NamedList<EnumsElement>,
	val features   : NamedList<FeatureElement>,
	val extensions : NamedList<ExtensionElement>
)