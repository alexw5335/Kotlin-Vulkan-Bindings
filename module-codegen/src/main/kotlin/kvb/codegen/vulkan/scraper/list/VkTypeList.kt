package kvb.codegen.vulkan.scraper.list

import kvb.codegen.vulkan.scraper.type.*

class VkTypeList(private val all: VkNamedList<VkType> = VkNamedList()) : Iterable<VkType> by all {


	val enums = VkNamedList<VkTypeEnum>()

	val bitmasks = VkNamedList<VkTypeBitmask>()

	val structs = VkNamedList<VkTypeStruct>()

	val handles = VkNamedList<VkTypeHandle>()

	val aliased = VkNamedList<VkTypeAliased>()



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



	fun fromName(name: String) = all.fromName(name)


}