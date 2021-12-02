package kvb.codegen.vulkan.scraper

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.vulkan.scraper.type.VkTypeEnum
import java.util.*
import java.util.regex.Pattern



private val camelCaseRegex = Pattern.compile("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])").toRegex()

private val String.camelToSnakeCase get() = replace(camelCaseRegex, "_").uppercase(Locale.getDefault())



val String.dropVkAndPostfix get() = if(postfixed.contains(this))
	drop(2)
else
	VkPostfix.drop(this).drop(2)



val postfixed = hashSetOf(
	"VkAccelerationStructureCreateInfoNV",
	"VkWriteDescriptorSetAccelerationStructureKHR",
	"VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR",
	"VkAccelerationStructureNV",
	"vkCmdDrawIndirectCountKHR",
	"VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR",
	"VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR",
	"VkSurfaceCapabilities2KHR",
	"VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV",
	"VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR",
	"vkCmdDrawIndexedIndirectCountAMD",
	"VkWin32KeyedMutexAcquireReleaseInfoKHR",
	"vkCmdDrawIndexedIndirectCountKHR",
	"VkRayTracingPipelineCreateInfoNV",
	"VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV",
	"VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL",
	"VkWin32KeyedMutexAcquireReleaseInfoNV",
	"VkRayTracingShaderGroupCreateInfoKHR",
	"VkAccelerationStructureCreateInfoKHR",
	"VkWriteDescriptorSetAccelerationStructureNV",
	"VkAccelerationStructureKHR",
	"VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV",
	"vkCmdDrawIndirectCountAMD",
	"VkSurfaceCapabilities2EXT",
	"VkRayTracingShaderGroupCreateInfoNV",
	"VkRayTracingPipelineCreateInfoKHR",
)



fun enumPrefix(enum: VkTypeEnum) = when {
	enum.is64Bit    -> VkPostfix.drop(enum.name).dropLast(9).camelToSnakeCase + "_2_"
	enum.isFlagBits -> VkPostfix.drop(enum.name).dropLast(8).camelToSnakeCase + "_"
	else            -> VkPostfix.drop(enum.name).camelToSnakeCase + "_"
}