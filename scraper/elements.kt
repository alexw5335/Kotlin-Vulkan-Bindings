package scraper



class VarElement(
	override val name : String,
	val type          : String,
	val modifier      : Modifier,
	val optional      : Boolean,
	val index         : Int,
	val len           : String?,
	val constLen      : String?,
	val varLen        : String?,
	val altLen        : String?,
	val sType         : String?,
) : Named



class StructElement(
	override val name : String,
	val members       : List<VarElement>,
	val pNextValues   : List<String>,
	val extends       : List<String>,
	val sType         : String?
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