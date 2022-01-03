package kvb.codegen.vulkan.scraper

import kvb.codegen.vulkan.scraper.type.VkTypeEnum
import java.util.*
import java.util.regex.Pattern

object GenUtils {


	/** Regex for splitting camel case into words. */
	private val camelCaseRegex = Pattern.compile("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])").toRegex()



	/** converts camelCase to UPPER_SNAKE_CASE. */
	private val String.camelToSnakeCase get() = replace(camelCaseRegex, "_").uppercase(Locale.getDefault())



	/**
	 * Drops the extension postfix and vk or Vk prefix of this name. If this causes a naming conflict, then the
	 * extension postfix is kept.
	 */
	val String.dropVkAndPostfix get() = if(postfixed.contains(this))
		drop(2)
	else
		Postfix.drop(this).drop(2)



	/**
	 * Drops the extension postfix of this name (if any). If this causes a naming conflict, then the extension postfix
	 * is kept.
	 */
	val String.dropPostfix get() = if(postfixed.contains(this))
		this
	else
		Postfix.drop(this)



	/**
	 * Names that should keep their extension postfixes due to naming conflicts. This list is automatically generated.
	 */
	val postfixed = hashSetOf(
		"VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR",
		"VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV",
		"VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR",
		"VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV",
		"VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR",
		"VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV",
		"VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL",
		"VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR",
		"VkAccelerationStructureCreateInfoKHR",
		"VkAccelerationStructureCreateInfoNV",
		"VkAccelerationStructureKHR",
		"VkAccelerationStructureNV",
		"VkRayTracingPipelineCreateInfoKHR",
		"VkRayTracingPipelineCreateInfoNV",
		"VkRayTracingShaderGroupCreateInfoKHR",
		"VkRayTracingShaderGroupCreateInfoNV",
		"VkSurfaceCapabilities2EXT",
		"VkSurfaceCapabilities2KHR",
		"VkWin32KeyedMutexAcquireReleaseInfoKHR",
		"VkWin32KeyedMutexAcquireReleaseInfoNV",
		"VkWriteDescriptorSetAccelerationStructureKHR",
		"VkWriteDescriptorSetAccelerationStructureNV",
		"vkCmdCopyAccelerationStructureKHR",
		"vkCmdCopyAccelerationStructureNV",
		"vkCmdTraceRaysKHR",
		"vkCmdTraceRaysNV",
		"vkCmdWriteAccelerationStructuresPropertiesKHR",
		"vkCmdWriteAccelerationStructuresPropertiesNV",
		"vkCreateAccelerationStructureKHR",
		"vkCreateAccelerationStructureNV",
		"vkCreateRayTracingPipelinesKHR",
		"vkCreateRayTracingPipelinesNV",
		"vkDestroyAccelerationStructureKHR",
		"vkDestroyAccelerationStructureNV",
		"vkGetPhysicalDeviceSurfaceCapabilities2EXT",
		"vkGetPhysicalDeviceSurfaceCapabilities2KHR",
	)



	/**
	 * The names of enums that are empty and thus should not be generated.
	 */
	val emptyEnums = hashSetOf<String>(
		"VkAcquireProfilingLockFlagBitsKHR",
		"VkPipelineCompilerControlFlagBitsAMD",
		"VkShaderCorePropertiesFlagBitsAMD",
		"VkPrivateDataSlotCreateFlagBitsEXT",
	)



	/**
	 * Determines the common prefix of an enum's entries. This prefix is used to remove the namespacing prefixes in
	 * front of entry names.
	 *
	 *     VkBlendOverlapEXT -> VK_BLEND_OVERLAP_
	 *     VkAccessFlagBits  -> VK_ACCESS_
	 *     VkAccessFlagBits2 -> VK_ACCESS_2_
	 */
	fun enumPrefix(enum: VkTypeEnum) = when {
		!enum.isFlagBits -> enum.name.dropPostfix.camelToSnakeCase + "_"
		!enum.is64Bit    -> enum.name.dropPostfix.dropLast(8).camelToSnakeCase + "_"
		else             -> enum.name.dropPostfix.dropLast(9).camelToSnakeCase + "_2_"
	}



	/**
	 * Determines an enum entry's short name.
	 */
	fun enumEntryShortName(name: String, enum: VkTypeEnum) : String {
		// There are about 4 exceptional entries in the registry that don't start with their enum's entry prefix.
		// There is also the VkResult enum that is only prefixed by VK_
		// In these cases, remove the VK_. Otherwise, remove the whole prefix
		val prefixLength = if(!name.startsWith(enum.prefix)) 3 else enum.prefix.length

		// Some types should not have their extensions removed due to naming conflicts
		var shortName = if(postfixed.contains(name))
			name.drop(prefixLength)
		else
			name.drop(prefixLength).dropLast(Postfix.postfixUnderscoreLength(name))

		// Enum names cannot start with digits, prefix with underscore
		if(shortName[0].isDigit()) shortName = "_$shortName"

		// Remove _BIT at the end of bitmask enums (occurs before extension postfix)
		if(shortName.endsWith("_BIT")) shortName = shortName.dropLast(4)

		return shortName
	}


}