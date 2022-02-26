package kvb.codegen.vulkan.scrape

import kvb.codegen.vulkan.name.Named
import kvb.codegen.vulkan.name.NamedList
import kvb.codegen.vulkan.parse.Modifier
import kvb.codegen.vulkan.parse.PlatformElement
import kvb.codegen.writer.Primitive
import kvb.core.struct.StructLayout
import kvb.core.struct.StructLayoutBuilder



sealed interface Provider : Named {
	val shouldGen : Boolean
	val types     : NamedList<VkType>
	val commands  : NamedList<Command>
}



class Feature(
	override val name      : String,
	override val shouldGen : Boolean,
	override val types     : NamedList<VkType>,
	override val commands  : NamedList<Command>
) : Provider



class Extension(
	override val name      : String,
	override val shouldGen : Boolean,
	override val types     : NamedList<VkType>,
	override val commands  : NamedList<Command>,
	val number             : Int,
	val platform           : PlatformElement?,
	val deprecatedBy       : String?,
	val promotedTo         : String?,
	val disabled           : Boolean,
) : Provider



enum class CommandType {
	INSTANCE, DEVICE, STANDALONE;
}



class Command(
	override val name : String,
	val genName       : String,
	val shouldGen     : Boolean,
	val type          : CommandType,
	val returnType    : VkType?,
	val params        : List<Var>
) : Named



class Constant(
	override val name : String,
	val genName       : String,
	val shouldGen     : Boolean,
	val value         : String,
	val aliased       : Boolean
) : Named



/*
Type
 */



sealed interface VkType : Named {

	val genName: String

	val shouldGen: Boolean

	val primitive: Primitive

}



class EnumEntry(
	override val name : String,
	val genName       : String,
	val value         : String,
	val shouldGen     : Boolean
) : Named



class EnumType(
	override val name      : String,
	override val genName   : String,
	override val shouldGen : Boolean,
	override val primitive : Primitive,
	val is64Bit            : Boolean,
	val isFlagBits         : Boolean,
	val entries            : NamedList<EnumEntry>,
) : VkType



class BitmaskType(
	override val name      : String,
	override val genName   : String,
	override val shouldGen : Boolean,
	override val primitive : Primitive,
	val is64Bit            : Boolean,
	val enumName           : String?
) : VkType



class HandleType(
	override val name: String,
	override val genName: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive
) : VkType



class NativeType(
	override val name: String,
	override val genName: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive
) : VkType



class PrimitiveType(
	override val name: String,
	override val genName: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive
) : VkType



class StructType(
	override val name: String,
	override val genName: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive,
	val isUnion: Boolean
) : VkType {


	val members = ArrayList<Var>()

	val pNext = ArrayList<StructType>()

	val extends = ArrayList<StructType>()

	val sType get() = members.first().sType

	var requiresBuffer = false

	val layout64: StructLayout by lazy {
		StructLayoutBuilder().build(isUnion) {
			for(m in members) {
				when {
					m.isPointer                        -> member(8)
					m.isArray && m.type is StructType -> array(m.type.layout64, m.constLen!!)
					m.isArray                          -> array(m.type.primitive.size, m.constLen!!)
					m.type is StructType -> member(m.type.layout64)
					else                               -> member(m.type.primitive.size)
				}
			}
		}
	}

	val size64: Int by lazy { layout64.size }


}



object VoidType : VkType {

	override val name = "void"

	override val genName = "Long"

	override val shouldGen = false

	override val primitive = Primitive.LONG

}



class AliasedType(override val name: String, val alias: String) : VkType {

	override val genName = name

	override val shouldGen = false

	override val primitive = Primitive.LONG

}



class UnusedType(override val name: String) : VkType {

	override val genName = name

	override val shouldGen = false

	override val primitive = Primitive.LONG

}



class Var(
	val name       : String,
	val type       : VkType,
	val optional   : Boolean,
	val modifier   : Modifier,
	val index      : Int,
	val len        : String?,
	val altLen     : String?,
	val varLen     : String?,
	val constLen   : Int?,
	val sType      : String?,
) {


	/*
	Pointer
	 */



	/**
	 * If this is a C pointer (includes being a pointer to an array).
	 */
	val isPointer = modifier.isPointer

	/**
	 * If this is a C array (includes being a pointer to an array).
	 */
	val isArray = constLen != null || varLen != null

	/**
	 * If [isPointer] and [isArray] are both true.
	 */
	val isPointerToArray = isPointer && isArray

	/**
	 * If this is a pointer to an array of pointers. The names of these variables are always prefixed with 'pp'. There
	 * are only five struct members with this modifier, found in: VkDeviceCreateInfo, VkInstanceCreateInfo, and
	 * VkAccelerationStructureBuildGeometryInfoKHR.
	 */
	val isPointerToPointerArray = modifier == Modifier.POINTER7 || modifier == Modifier.POINTER8

	/**
	 * If this is a null-terminated UTF-8 char* (not an array).
	 */
	val isStringPointer = len == "null-terminated"



	/*
	Naming
	 */



	/**
	 * Appends '?' to the end of a string if this var is [optional]. This is used to create nullable Kotlin equivalents
	 * to optional C parameters/variables.
	 */
	val String.makeOptional get() = if(optional) "$this?" else this

	/**
	 * Appends either .addressOrNULL or .address to the [name], depending on whether this variable is [optional] or
	 * not. Used for nullable Kotlin equivalents when passing addressable types through JNI.
	 */
	val addressString get() = if(optional) "$name.addressOrNULL" else "$name.address"

	/**
	 * Drops the first letter and then decapitalises the [name]. E.g. pGeometryCount -> geometryCount.
	 */
	val nonPointerName get() = if(name.startsWith('p') && isPointer)
		name.drop(1).replaceFirstChar { it.lowercase() }
	else
		name

	/**
	 * Convenience variable for the generated name of the [type].
	 */
	val typeName get() = type.genName

	/**
	 * Convenience variable for the buffer name of the [type]'s primitive type.
	 */
	val primitiveBufferName get() = type.primitive.bufferName



	/*
	Struct-specific
	 */



	/**
	 * The struct type that contains this variable.
	 */
	var struct: StructType? = null

	/**
	 * If this variable should be null or zero. This is mainly used for unused pNext values and reserved flags.
	 */
	val mustBeNull get() = when {
		// Reserved or empty flags
		type is BitmaskType && type.enumName == null -> true

		// pNext variables with no valid values
		// Some pNext vars don't rely on the 'values' attribute, e.g. VkBaseOutStructure andVkBaseInStructure.
		name == "pNext"
			&& struct!!.pNext.isEmpty()
			&& type.name != "VkBaseOutStructure"
			&& type.name != "VkBaseInStructure" -> true

		else -> false
	}

	/**
	 * The variable that [varLen] refers to. Will only be initialised if [varLen] is not null and if this is a struct.
	 */
	lateinit var varLenVariable: Var


}