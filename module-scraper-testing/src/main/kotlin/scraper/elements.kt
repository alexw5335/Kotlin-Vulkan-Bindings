package scraper



class ExtensionElement



class FeatureElement



class EnumElement(
	override val name: String,
	val entries: List<EnumEntryElement>
) : Named



class EnumEntryElement(
	override val name: String,
	val value: String?,
	val alias: String?
) : Named



class VarElement(
	override val name : String,
	val type          : String,
	val optional      : Boolean,
	val modifier      : Modifier,
	val index         : Int,
	val len           : String?,
	val altLen        : String?,
	val sType         : String?,
) : Named



class StructElement(
	override val name : String,
	val members       : List<VarElement>
) : Named



class CommandElement(
	override val name : String,
	val returnType    : String,
	val params        : List<VarElement>,
	val alias         : String? = null
) : Named



sealed interface TypeElement : Named



class EnumTypeElement(
	override val name: String,
	val is64Bit: Boolean,
	val isFlagBits: Boolean,
) : TypeElement



class BitmaskTypeElement(
	override val name: String,
	val is64Bit: Boolean,
	val enumName: String?
) : TypeElement



class StructTypeElement(
	override val name: String,
	val isUnion: Boolean
) : TypeElement



class HandleTypeElement(
	override val name: String
) : TypeElement



class PrimitiveTypeElement(
	override val name: String,
	val primitiveName: String
) : TypeElement



class NativeTypeElement(
	override val name: String
): TypeElement



class AliasTypeElement(
	override val name: String,
	val aliasedName: String
) : TypeElement



class MiscTypeElement(
	override val name: String
) : TypeElement