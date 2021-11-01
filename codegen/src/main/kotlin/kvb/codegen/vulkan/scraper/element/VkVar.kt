package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.VkModifier
import kvb.codegen.vulkan.scraper.type.VkType
import kvb.codegen.vulkan.scraper.type.VkTypeBitmask
import kvb.codegen.vulkan.scraper.type.VkTypeStruct

/**
 * Represents a command parameter or a struct member.
 * - [isPointer]: If this variable is a C pointer. This includes pointers to arrays.
 * - [isArray]: If this variable is a C array. This includes pointers to arrays.
 * - [isOptional]: If this variable can be substituted with null.
 * - [constLen]: The size of this struct member if it is a compile-time sized array.
 * - [varLen]: If the array length is determined by another variable, then this is the name of that variable.
 * - [sType]: Only used for sType. Gives the required VkStructureType value for structs.
 * - [altLen]: An expression that gives the array size.
 * - [isStringPointer]: If this is a null-terminated UTF-8 char* (doesn't include struct array members).
 * - [modifier]: The C modifier, e.g. const*. Used to create casts when generating JNI code.
 * - [index]: The index of the var in a struct or function (In the original structs/commands, not the generated ones).
 */
class VkVar(
	override val name: String,
	val type: VkType,
	val isOptional: Boolean,
	val len: String?,
	val constLen: Int?,
	val varLen: String?,
	val altLen: String?,
	val sType: VkEnumEntry?,
	val modifier: VkModifier,
	val index: Int
) : VkElement {


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
	val isPointerToPointerArray = modifier == VkModifier.C2_POINTER2

	/**
	 * If this is a null-terminated UTF-8 char* (not an array).
	 */
	val isStringPointer = len == "null-terminated"



	/*
	Name
	 */



	/**
	 * Appends '?' to the end of a string if this var is [isOptional]. This is used to create nullable Kotlin equivalents
	 * to optional C parameters/variables.
	 */
	val String.makeOptional get() = if(isOptional) "$this?" else this

	/**
	 * Appends either .addressOrNULL or .address to the [name], depending on whether this variable is [isOptional] or
	 * not. Used for nullable Kotlin equivalents when passing addressable types through JNI.
	 */
	val addressString get() = if(isOptional) "$name.addressOrNULL" else "$name.address"

	/**
	 * Drops the first letter and then decapitalises the [name]. E.g. pGeometryCount -> geometryCount.
	 */
	val nonPointerName get() = if(name.startsWith('p') && isPointer)
		name.drop(1).replaceFirstChar { it.lowercase() }
	else
		name

	/**
	 * Convenience variable for the name of the [type].
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
	var struct: VkTypeStruct? = null

	/**
	 * If this variable should be null or zero. This is mainly used for unused pNext values and reserved flags.
	 */
	val mustBeNull get() = when {
		// Reserved or empty flags
		type is VkTypeBitmask && !type.implemented -> true

		// pNext variables with no valid values
		// Some pNext vars don't rely on the 'values' attribute, e.g. VkBaseOutStructure andVkBaseInStructure.
		name == "pNext"
			&& struct!!.pNextValues.isEmpty()
			&& type.name != "VkBaseOutStructure"
			&& type.name != "VkBaseInStructure" -> true

		else -> false
	}

	/**
	 * The variable that [varLen] refers to. Will only be initialised if [varLen] is not null and if this is a struct.
	 */
	lateinit var varLenVariable: VkVar


}