package vulkan.scraper.list

import vulkan.scraper.type.*

/**
 * A list of [types] that are additionally grouped by [enums], [bitmasks], [structs], and [handles].
 */
class VkTypesList(val types: VkElementList<VkType> = VkElementList()): VkElementListI<VkType> by types {


	val enums = VkElementList<VkTypeEnum>()

	val bitmasks = VkElementList<VkTypeBitmask>()

	val structs = VkElementList<VkTypeStruct>()

	val handles = VkElementList<VkTypeHandle>()



	override fun add(element: VkType): Boolean {
		val result = super.add(element)

		when(element) {
			is VkTypeEnum    -> enums.add(element)
			is VkTypeBitmask -> bitmasks.add(element)
			is VkTypeStruct  -> structs.add(element)
			is VkTypeHandle  -> handles.add(element)
			else             -> Unit
		}

		return result
	}



	override fun addAll(elements: Iterable<VkType>) = elements.forEach(::add)


}