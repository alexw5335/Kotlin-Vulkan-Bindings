package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.VkPostfix
import java.util.*
import java.util.regex.Pattern

object VkGenUtils {


	/** Regex for splitting camel case into words. */
	private val camelCaseRegex = Pattern.compile("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])").toRegex()

	/** converts camelCase to UPPER_SNAKE_CASE. */
	private val String.camelToSnakeCase get() = replace(camelCaseRegex, "_").uppercase(Locale.getDefault())



	/**
	 * Drops the extension postfix of this name (if any) as well as the vk or Vk postfix. If this would cause naming
	 * conflicts, then the extension postfix is kept.
	 */
	val String.dropVkAndPostfix get() = if(postfixed.contains(this))
		drop(2)
	else
		VkPostfix.drop(this).drop(2)



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
		"vkCmdDrawIndexedIndirectCountAMD",
		"vkCmdDrawIndexedIndirectCountKHR",
		"vkCmdDrawIndirectCountAMD",
		"vkCmdDrawIndirectCountKHR",
	)



	/*
	Lists
	 */



	/**
	 * A list of enums that should be generated with value classes rather than with enum classes.
	 */
	val valueEnums = hashSetOf(
		// Returned in many structs
		"VkFormat",

		// Returned by many commands
		"VkResult",

		// Returned by debug callbacks
		"VkObjectType"
	)



	/*

	VkShadingRatePaletteEntryNV   12 - no returning cases
	VkDescriptorType   15 - no returning cases.
	VkLogicOp   16 - no returning cases
	VkColorSpaceKHR   18 - used in VkSurfaceFormatKHR but unlikely to be used often.
	VkBlendFactor   19 - no returning cases.
	VkDriverId   26 - returned in two properties structs, unlikely to be used often.
	VkImageLayout   28 - not many returning cases
	VkDynamicState   30 - no returning cases
	VkObjectType   43 - must be value
	VkResult   44 - must be value
	VkBlendOp   51 - no returning cases
	VkFormat   307 - must be value

	 */



}