package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.writer.procedural.Primitive
import kvb.codegen.vulkan.scraper.element.VkEnumEntry
import kvb.codegen.vulkan.scraper.list.VkElementList

class VkTypeEnum(override val name: String) : VkType {


	/**
	 * A shortened representation of the [name].
	 */
	val shortName = VkGenUtils.enumShortName(name)



	/**
	 * 64-bit enums are always flag bits and they have 'FlagBits2' before the extension postfix.
	 */
	val is64Bit = shortName.endsWith('2')



	/**
	 * If this enum represents the flag bits of a bitmask. These always end in 'FlagBits' or 'FlagBits2'.
	 */
	val isFlagBits = is64Bit || shortName.endsWith("FlagBits")



	/**
	 * The common prefix in front of this enum's entries. This is used to trim the names of the entries.
	 */
	val prefix = VkGenUtils.enumPrefix(this)



	/**
	 * If this enum should be generated as a value class with extra functions rather than as an enum.
	 */
	val isExtraGen get() = VkGenUtils.extraGenEnums.contains(name)



	/*
	Type implementation
	 */



	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT



	override val shouldGen get() = VkGenUtils.shouldGenEnum(this)



	override val genName get() = when {
		isFlagBits -> bitmask!!.genName
		!shouldGen -> primitive.kName
		else       -> shortName
	}



	/*
	Lateinit variables
	 */



	val entries = VkElementList<VkEnumEntry>()



	var bitmask: VkTypeBitmask? = null


}