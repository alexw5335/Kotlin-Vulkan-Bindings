package vulkan.scraper.type

import memory.Primitive
import vulkan.scraper.VkScraperUtils
import vulkan.scraper.element.VkVar

/**
 * Represents a Vulkan struct type.
 */
data class VkTypeStruct(
	override val name     : String,
	val isUnion	          : Boolean,
	override val aliased  : Boolean = false,
	val returnedOnly      : Boolean
): VkType {


	/**
	 * Standard shortened name with the removal of the "Vk" prefix and of any extension postfixes.
	 */
	override val shortName = VkScraperUtils.structShortName(name)

	/**
	 * No structs are passed by value in Vulkan anyway. If any were, they would be passed by reference through jni.
	 */
	override val primitive = Primitive.POINTER

	/**
	 * The struct members.
	 */
	val members = ArrayList<VkVar>()

	/**
	 * The valid structure type value (if any) of the sType member of this struct.
	 */
	val sTypeValue get() = members.firstOrNull()?.values

	/**
	 * A list of struct types whose instances may be present in the pNext chain.
	 */
	val pNextValues = ArrayList<VkTypeStruct>()

	/**
	 * A list of struct types whose pNext chains can contain an instance of this struct type.
	 */
	val extends = ArrayList<VkTypeStruct>()

	/**
	 * Edge-case for the getAccelerationStructureMemoryRequirementsNV command, which refers to vkMemoryRequirements2KHR
	 * which is an alias for VkMemoryRequirements2. This is the only case where a struct alias is referred to in a
	 * command.
	 */
	override val genName = if(name == "VkMemoryRequirements2KHR") "MemoryRequirements2" else shortName



	var usedInArray = false

	var hasPersistent = returnedOnly


}