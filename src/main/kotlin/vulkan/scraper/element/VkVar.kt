package vulkan.scraper.element

import memory.Primitive
import vulkan.scraper.VkModifier
import vulkan.scraper.VkScraperUtils
import vulkan.scraper.type.VkType
import vulkan.scraper.type.VkTypeBitmask
import vulkan.scraper.type.VkTypeStruct

/**
 * Envelope type for command parameters and struct members.
 *
 * Variables:
 * - [isPointer]: If this variable is a C pointer. This includes pointers to arrays.
 * - [isArray]: If this variable is a C array. This includes pointers to arrays.
 * - [isOptional]: If this variable can be substituted with null.
 * - [constLen]: The size of this struct member if it is a compile-time sized array.
 * - [varLen]: If the array length is determined by another variable, then this is the name of that variable.
 * - [values]: Only used for sType. Gives the required VkStructureType value for structs.
 * - [altLen]: An expression that gives the array size.
 * - [isStringPointer]: If this is a null-terminated UTF-8 char*.
 * - [modifier]: The C modifier, e.g. const*. Used to create casts when generating JNI code.
 * - [index]: The index of the var in a struct or function (In the original structs/commands, not the generated ones).
 */
data class VkVar(
	override val name   : String,
	val type            : VkType,
	val isPointer       : Boolean,
	val isArray         : Boolean,
	val isOptional      : Boolean,
	val constLen        : Int?,
	val varLen          : String?,
	val altLen	        : String?,
	val isStringPointer : Boolean,
	val values	        : String?,
	val modifier        : VkModifier,
	val index           : Int
): VkElement {


	/*
	Type
	 */



	/**
	 * If [isPointer] and [isArray] are both true.
	 */
	val isPointerToArray get() = isPointer && isArray

	/**
	 * If this is a pointer to an array of pointers. The names of these variables are always prefixed with 'pp'. Note:
	 * This is hardcoded. See [VkModifier]. There are only five struct members with this modifier, found in:
	 * VkDeviceCreateInfo, VkInstanceCreateInfo, and VkAccelerationStructureBuildGeometryInfoKHR.
	 */
	val isPointerToPointerArray get() = modifier == VkModifier.CONST_POINTER_CONST_POINTER



	/*
	Name
	 */



	/**
	 * This name is prefixed by an underscore if the [name] has any conflicts with Kotlin identifiers. This value must
	 * be used whenever this var is referred to during code generation.
	 */
	val validName get() = VkScraperUtils.makeValid(name)

	/**
	 * Used in JNI files to cast the jni type to the appropriate Vulkan [type].
	 */
	val castName get() = "(${modifier.castName(type.name)}) $validName"

	/**
	 * Appends '?' to the end of a string if this var is [isOptional]. This is used to create nullable Kotlin equivalents
	 * to optional C parameters/variables.
	 */
	val String.makeOptional get() = if(isOptional) "$this?" else this

	/**
	 * Appends either .addressOrNULL or .address to the [validName], depending on whether this variable is [isOptional] or
	 * not. Used for nullable Kotlin equivalents when passing addressable types through JNI.
	 */
	val addressString get() = if(isOptional) "$validName.addressOrNULL" else "$validName.address"

	/**
	 * Drops the first letter and then decapitalises the [name]. E.g. pGeometryCount -> geometryCount.
	 */
	val nonPointerName get() = if(validName.startsWith('p') && isPointer)
		validName.drop(1).replaceFirstChar { it + 32 }
	else
		validName



	val primitiveBufferName get() = type.primitive.bufferName

	val typeName get() = type.genName



	/**
	 * The struct type to which this member belongs (if it is a member and not a command parameter).
	 */
	var struct: VkTypeStruct? = null

	/**
	 * If this variable should be null or zero. This is mainly used for unused pNext values and reserved flags.
	 */
	val mustBeNull get() = when {
		type is VkTypeBitmask && !type.implemented -> true
		name == "pNext" && struct!!.pNextValues.isEmpty() -> true
		else -> false
	}

	/**
	 * The variable that [varLen] refers to. Will only be initialised if [varLen] is not null and if this is a struct.
	 */
	lateinit var varLenVariable: VkVar

	/**
	 * If the [varLen] will be represented by a [Long]. Otherwise, it will be represented by an [Int].
	 */
	val varLenIsLong get() = varLenVariable.type.primitive.kName == "Long"


}