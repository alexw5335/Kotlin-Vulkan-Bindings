package kvb.codegen.vulkan.scraper.list

import kvb.codegen.vulkan.scraper.type.*

class VkTypeList(private val all: VkElementList<VkType> = VkElementList()) : List<VkType> by all {


	val enums = VkElementList<VkTypeEnum>()

	val bitmasks = VkElementList<VkTypeBitmask>()

	val structs = VkElementList<VkTypeStruct>()

	val handles = VkElementList<VkTypeHandle>()

	val aliased = VkElementList<VkTypeAliased>()



	fun add(element: VkType) {
		all.add(element)

		when(element) {
			is VkTypeEnum    -> enums.add(element)
			is VkTypeBitmask -> bitmasks.add(element)
			is VkTypeStruct  -> structs.add(element)
			is VkTypeHandle  -> handles.add(element)
			is VkTypeAliased -> aliased.add(element)
			else             -> Unit
		}
	}



	fun addAll(elements: Iterable<VkType>) = elements.forEach(::add)



	fun fromName(name: String) = all.fromName(name)


}