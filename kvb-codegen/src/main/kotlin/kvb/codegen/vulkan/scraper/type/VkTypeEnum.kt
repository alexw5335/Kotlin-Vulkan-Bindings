package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.dropVkAndPostfix
import kvb.codegen.vulkan.scraper.element.VkEnumEntry
import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.writer.procedural.Primitive

class VkTypeEnum(
	override val name: String,
	val isFlagBits: Boolean,
	val is64Bit: Boolean
) : VkType {


	/*
	Type implementation
	Lazy delegates are used since [entries] and [bitmask] are updated after construction.
	 */



	override val primitive = if(is64Bit)
		Primitive.LONG
	else
		Primitive.INT



	override val shouldGen by lazy {
		entries.isNotEmpty() && name != "VkStructureType" && (!isFlagBits || bitmask!!.shouldGen)
	}



	override val genName by lazy {
		when {
			!shouldGen -> primitive.kName
			isFlagBits -> bitmask!!.genName
			else       -> name.dropVkAndPostfix
		}
	}



	/*
	Properties
	 */



	val entries = VkElementList<VkEnumEntry>()

	var bitmask: VkTypeBitmask? = null


}