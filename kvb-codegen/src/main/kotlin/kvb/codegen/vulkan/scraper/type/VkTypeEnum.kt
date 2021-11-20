package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.writer.procedural.Primitive
import kvb.codegen.vulkan.scraper.element.VkEnumEntry
import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.vulkan.scraper.list.VkElementList

class VkTypeEnum(override val name: String) : VkType {


	/*
	Type implementation
	 */



	override val shortName = VkGenUtils.enumShortName(name)

	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT

	override lateinit var provider: VkProvider



	/*
	Properties
	 */



	/**
	 * 64-bit enums are always flag bits and they have 'FlagBits2' before the extension postfix.
	 */
	val is64Bit get() = shortName.endsWith('2')



	/**
	 * If this enum represents the flag bits of a bitmask. These always end in 'FlagBits' or 'FlagBits2'.
	 */
	val isFlagBits get() = is64Bit || shortName.endsWith("FlagBits")



	/**
	 * The common prefix in front of this enum's entries. This is used to trim the names of the entries.
	 */
	val prefix = VkGenUtils.enumPrefix(this)



	/*
	Lateinit variables
	 */



	/**
	 * The entries of this enum. Each entry has a unique int or long identifier.
	 */
	val entries = VkElementList<VkEnumEntry>()



	/**
	 * The bitmask whose bits are specified by this enum if this enum is a FlagBits enum. Null otherwise.
	 */
	var bitmask: VkTypeBitmask? = null


}