package kvb.codegen.vulkan

import kvb.codegen.writer.procedural.Primitive
import scraper.kvb.codegen.vulkan.naming.Named
import scraper.kvb.codegen.vulkan.naming.NamedList



enum class CommandType {
	INSTANCE, DEVICE, STANDALONE;
}



class VkCommand(
	override val name : String,
	val genName       : String,
	val shouldGen     : Boolean,
	val type          : CommandType,
	val returnType    : VkType?,
	val params        : List<VkVar>
) : Named



class VkConstant(
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



class VkEnumEntry(
	override val name : String,
	val genName       : String,
	val value         : String,
	val shouldGen     : Boolean
) : Named



class VkEnum(
	override val name      : String,
	override val genName   : String,
	override val shouldGen : Boolean,
	override val primitive : Primitive,
	val is64Bit            : Boolean,
	val entries            : NamedList<VkEnumEntry>
) : VkType



class VkBitmask(
	override val name      : String,
	override val genName   : String,
	override val shouldGen : Boolean,
	override val primitive : Primitive,
	val is64Bit            : Boolean,
	val enumName           : String?
) : VkType



class VkHandle(
	override val name: String,
	override val genName: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive
) : VkType



class VkNativeType(
	override val name: String,
	override val shouldGen: Boolean,
	override val genName: String,
	override val primitive: Primitive
) : VkType



class VkPrimitiveType(
	override val name: String,
	override val genName: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive
) : VkType



class VkStruct(
	override val name: String,
	override val genName: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive
) : VkType {


	val members = ArrayList<VkVar>()

	val pNext = ArrayList<VkStruct>()

	val extends = ArrayList<VkStruct>()

	val sType get() = members.first().sType

	var requiresBuffer = false

}



class VkUnusedType(override val name: String): VkType {


	override val genName = name

	override val shouldGen = false

	override val primitive = Primitive.LONG


}



class VkVar(
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
	var struct: VkStruct? = null

	/**
	 * If this variable should be null or zero. This is mainly used for unused pNext values and reserved flags.
	 */
	val mustBeNull get() = when {
		// Reserved or empty flags
		type is VkBitmask && type.enumName == null -> true

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
	lateinit var varLenVariable: VkVar


}