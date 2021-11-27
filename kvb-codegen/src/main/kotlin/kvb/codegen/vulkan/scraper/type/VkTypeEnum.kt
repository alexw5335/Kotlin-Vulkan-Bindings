package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.vulkan.scraper.element.VkEnumEntry
import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.writer.procedural.Primitive

class VkTypeEnum(override val name: String) : VkType {


	/*
	Properties
	 */



	/**
	 * If this enum represents the bit flags of a [bitmask][VkTypeBitmask]].
	 */
	val isFlagBits = name.contains("FlagBits")



	/**
	 * If this enum represents the bit flags of a 64-bit [bitmask][VkTypeBitmask].
	 */
	val is64Bit = isFlagBits && name.contains("FlagBits2")



	/**
	 * The common prefix in front of this enum's entries. This is used to trim the names of the entries.
	 */
	val prefix = VkGenUtils.enumPrefix(this)



	/**
	 * The entries of this enum. Each entry has a unique int or long identifier.
	 */
	val entries = VkElementList<VkEnumEntry>()



	/**
	 * The bitmask whose bits are specified by this enum if this enum is a FlagBits enum. Null otherwise.
	 */
	var bitmask: VkTypeBitmask? = null



	/*
	Type implementation
	 */



	override lateinit var genName: String

	override val shouldGen get() = entries.isNotEmpty() && name != "VkStructureType" && (!isFlagBits || bitmask!!.shouldGen)

	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT


}