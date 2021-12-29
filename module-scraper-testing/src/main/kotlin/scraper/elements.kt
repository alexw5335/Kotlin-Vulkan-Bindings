package scraper

import scraper.naming.NamedList
import scraper.properties.Modifier
import scraper.naming.Named



class PlatformElement(
	override val name: String,
	val define: String
) : Named



class ConstantElement(
	override val name : String,
	val value         : String,
	val aliased       : Boolean = false
) : Named



sealed interface ProviderElement : Named {

	val types: NamedList<TypeElement>

	val commands: NamedList<CommandElement>

}



class FeatureElement(
	override val name     : String,
	override val types    : NamedList<TypeElement>,
	override val commands : NamedList<CommandElement>
) : ProviderElement



class ExtensionElement(
	override val name     : String,
	override val types    : NamedList<TypeElement>,
	override val commands : NamedList<CommandElement>,
	val number            : Int,
	val platform          : PlatformElement?,
	val deprecatedBy      : String?,
	val promotedTo        : String?,
	val disabled          : Boolean,
) : ProviderElement



class EnumEntryElement(
	override val name : String,
	val value         : String?,
	val alias         : String?,
	val extension     : String?
) : Named



class VarElement(
	override val name : String,
	val type          : String,
	val optional      : Boolean,
	val modifier      : Modifier,
	val index         : Int,
	val len           : String?,
	val altLen        : String?,
	val varLen        : String?,
	val constLen      : Int?,
	val sType         : String?,
) : Named



class CommandElement(
	override val name : String,
	val returnType    : String?,
	val params        : List<VarElement>,
	val alias         : String?
) : Named



sealed interface TypeElement : Named



class EnumElement(
	override val name : String,
	val is64Bit       : Boolean,
	val isFlagBits    : Boolean,
	val entries       : ArrayList<EnumEntryElement> = ArrayList()
) : TypeElement



class BitmaskElement(
	override val name: String,
	val is64Bit: Boolean,
	val enumName: String?
) : TypeElement



class StructElement(
	override val name: String,
	val isUnion: Boolean,
	val members: List<VarElement>,
	val extends: List<String>
) : TypeElement



class HandleElement(
	override val name: String
) : TypeElement



class PrimitiveElement(
	override val name: String,
	val primitiveName: String
) : TypeElement



class NativeElement(
	override val name: String
): TypeElement



class FuncPointerElement(
	override val name: String
) : TypeElement



class TypeAliasElement(
	override val name: String,
	val alias: String
) : TypeElement



class MiscTypeElement(
	override val name: String
) : TypeElement