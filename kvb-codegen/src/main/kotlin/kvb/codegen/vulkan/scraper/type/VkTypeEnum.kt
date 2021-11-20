package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.writer.procedural.Primitive
import kvb.codegen.vulkan.scraper.element.VkEnumEntry
import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.vulkan.scraper.list.VkElementList

class VkTypeEnum(override val name: String) : VkType {


	/**
	 * If this enum represents the bit flags of a [bitmask][VkTypeBitmask]].
	 */
	val isFlagBits = name.contains("FlagBits")



	/**
	 * If this enum represents the bit flags of a 64-bit [bitmask][VkTypeBitmask].
	 */
	val is64Bit = isFlagBits && name.contains("FlagBits2")



	/**
	 * 64=bit enums are represented by [Long] and 32-bit enums are represented by [Int].
	 */
	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT



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