package kvb.codegen.vulkan.scraper.list

import kvb.codegen.vulkan.scraper.type.*

class TypeList(private val all: NamedList<VkType> = NamedList()) : Collection<VkType> by all {


	val enums = NamedList<VkTypeEnum>()

	val bitmasks = NamedList<VkTypeBitmask>()

	val structs = NamedList<VkTypeStruct>()

	val handles = NamedList<VkTypeHandle>()

	val aliased = NamedList<VkTypeAliased>()



	/*
	Delegate
	 */



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

	fun fromNameOrNull(name: String) = all.fromNameOrNull(name)

	fun containsName(name: String) = all.containsName(name)


}