package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.VkPostfix
import kvb.codegen.vulkan.scraper.element.*
import kvb.codegen.vulkan.scraper.type.VkTypeBitmask
import kvb.codegen.vulkan.scraper.type.VkTypeEnum
import java.util.*
import java.util.regex.Pattern

object VkGenUtils {


	/*
	ShouldGen
	 */



	fun shouldGenCommand(command: VkCommand)       = !command.isAliased && !nonGeneratedCommands.contains(command.name)

	fun shouldGenEnum(enum: VkTypeEnum)            = enum.entries.isNotEmpty() && !nonGeneratedEnums.contains(enum.name) && (!enum.isFlagBits || enum.bitmask!!.shouldGen)

	fun shouldGenBitmask(bitmask: VkTypeBitmask)   = bitmask.implemented && bitmask.enum!!.entries.isNotEmpty()

	fun shouldGenExtension(extension: VkExtension) = extension.deprecatedBy == null && extension.promotedTo == null && !extension.disabled

	fun shouldGenProvider(provider: VkProvider) = provider !is VkExtension || shouldGenExtension(provider)

	fun shouldGenEnumEntry(entry: VkEnumEntry)     = !entry.isAliased && !(entry.provider is VkExtension && !shouldGenExtension(entry.provider as VkExtension) )

	fun shouldGenConstant(constant: VkConstant)    = !constant.isAliased



	/*
	Naming
	 */



	/** Regex for converting splitting camelCase into words, taken from StackOverflow. */
	private val camelCaseRegex = Pattern.compile("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])").toRegex()

	/** Drops the Vk or vk prefix that is in front of all Vulkan types. */
	private val String.dropVk get() = drop(2)

	/** Drops the extension provider postfix that is at the end of types provided by extensions. */
	private val String.dropPostfix get() = if(postfixedTypes.contains(this)) this else dropLast(VkPostfix.postfixLength(this))

	/** Decapitalises the first letter. */
	private val String.decapitalised get() = replaceFirstChar { it.lowercase() }

	/** Converts camelCase to UPPER_SNAKE_CASE. */
	private val String.camelToSnakeCase get() = replace(camelCaseRegex, "_").uppercase(Locale.getDefault())



	// Note: dropPostfix must be called first so that postfixedTypes can recognise the name.



	fun commandShortName(name: String)  = name.dropPostfix.dropVk.decapitalised

	fun structShortName(name: String)   = name.dropPostfix.dropVk

	fun bitmaskShortName(name: String)  = name.dropPostfix.dropVk

	fun enumShortName(name: String)     = name.dropPostfix.dropVk

	fun handleShortName(name: String)   = name.dropPostfix.dropVk

	fun constantShortName(name: String) = name.drop(3) // drop VK_ prefix



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
		// There is also the VkResult enum that is only prefixed by VK_.
		// In these cases, remove the VK_. Otherwise, remove the whole prefix.
		val prefixLength = if(!name.startsWith(enum.prefix)) 3 else enum.prefix.length

		// Some types should not have their extensions removed due to naming conflicts.
		var shortName = if(postfixedTypes.contains(name))
			name.drop(prefixLength)
		else
			name.drop(prefixLength).dropLast(VkPostfix.postfixUnderscoreLength(name))

		// Java enums cannot start with digits, prefix with '_'.
		if(shortName[0].isDigit()) shortName = "_$shortName"

		// Remove _BIT at the end of bitmask enums.
		if(shortName.endsWith("_BIT")) shortName = shortName.dropLast(4)

		return shortName
	}



	/*
	Lists
	 */



	/**
	 * Commands that should not be generated.
	 */
	val nonGeneratedCommands = hashSetOf(
		"vkGetInstanceProcAddr",
	)



	/**
	 * Enums that should not be generated and should instead be represented by ints or longs.
	 */
	val nonGeneratedEnums = hashSetOf(
		// sType values are automatically filled in during allocation.
		"VkStructureType"
	)



	/**
	 * A list of enums that should be generated with value classes rather than with enum classes.
	 */
	val extraGenEnums = hashSetOf(
		// Returned in structs
		"VkFormat",

		// Returned by commands
		"VkResult",

		// Returned by debug callbacks
		"VkObjectType"
	)



	/**
	 * Bitmask types that should have extra generated content such as a toString implementation.
	 */
	val extraGenBitmasks = hashSetOf(
		"VkMemoryPropertyFlags",
		"VkMemoryHeapFlags"
	)



	/**
	 * Type names that should not have their extension postfixes removed due to naming conflicts. These conflicts are
	 * not due to aliasing or extension promoting.
	 */
	val postfixedTypes = hashSetOf(
		// Enum entries
		"VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR",
		"VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV",
		"VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR",
		"VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV",
		"VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR",
		"VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV",
		"VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR",
		"VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL",

		// Handles
		"VkAccelerationStructureKHR",
		"VkAccelerationStructureNV",

		// Structs
		"VkSurfaceCapabilities2EXT",
		"VkSurfaceCapabilities2KHR",
		"VkAccelerationStructureCreateInfoKHR",
		"VkAccelerationStructureCreateInfoNV",
		"VkWriteDescriptorSetAccelerationStructureKHR",
		"VkWriteDescriptorSetAccelerationStructureNV",
		"VkRayTracingShaderGroupCreateInfoKHR",
		"VkRayTracingShaderGroupCreateInfoNV",
		"VkRayTracingPipelineCreateInfoKHR",
		"VkRayTracingPipelineCreateInfoNV",

		// Commands
		"vkGetPhysicalDeviceSurfaceCapabilities2EXT",
		"vkGetPhysicalDeviceSurfaceCapabilities2KHR",
		"vkCreateAccelerationStructureNV",
		"vkCreateAccelerationStructureKHR",
		"vkDestroyAccelerationStructureNV",
		"vkDestroyAccelerationStructureKHR",
		"vkCmdWriteAccelerationStructuresPropertiesNV",
		"vkCmdWriteAccelerationStructuresPropertiesKHR",
		"getRayTracingShaderGroupHandles",
		"vkGetRayTracingShaderGroupHandlesNV",
		"vkGetRayTracingShaderGroupHandlesKHR",
		"vkCmdTraceRaysNV",
		"vkCmdTraceRaysKHR",
		"vkCmdCopyAccelerationStructureNV",
		"vkCmdCopyAccelerationStructureKHR",
		"vkCreateRayTracingPipelinesNV",
		"vkCreateRayTracingPipelinesKHR",
		"vkGetRayTracingShaderGroupHandlesNV",
		"vkGetRayTracingShaderGroupHandlesKHR",
		"vkCmdWriteAccelerationStructuresPropertiesNV",
		"vkCmdWriteAccelerationStructuresPropertiesKHR"
	)



	/*

	VkScope - returned in VkCooperativeMatrixPropertiesNV, only four values.
	VkSemaphoreType - no returning cases.
	VkShaderFloatControlsIndependence - returned in VkPhysicalDeviceVulkan12Properties, only three values.
	VkShaderGroupShader - no returning cases.
	VkShaderInfoTypeAMD - no returning cases.
	VkShadingRatePaletteEntry - no returning cases.
	VkSharingMode - no returning cases.
	VkStencilOp - no returning cases.
    VkSubpassContents - no returning cases.
	VkSystemAllocationScope - no returning cases.
	VkTessellationDomainOrigin - no returning cases.
	VkTimeDomainEXT - returned in VkCalibratedTimestampInfoEXT, only four values.
	VkValidationCacheHeaderVersion - only one value.
	VkValidationFeatureDisableEXT - no returning cases.
	VkValidationFeatureEnableEXT - no returning cases.
	VkVendorId - returned in VkPhyscialDeviceProperties, only use.
	VkVertexInputRate - no returning cases
	VkViewportSwizzleNV - no returning cases
	 */


	/*

	VkSamplerAddressMode   6
	VkCopyAccelerationStructureModeKHR   6
	VkRayTracingShaderGroupTypeKHR   6
	VkPerformanceCounterScopeKHR   6
	VkPerformanceCounterStorageKHR   6
	VkPresentModeKHR   6
	VkSamplerReductionMode   6
	VkShaderFloatControlsIndependence   6
	VkVendorId   6
	VkComponentSwizzle   7
	VkImageViewType   7
	VkValidationFeatureDisableEXT   7
	VkBorderColor   8
	VkCompareOp   8
	VkStencilOp   8
	VkIndirectCommandsTokenTypeNV   8
	VkViewportCoordinateSwizzleNV   8
	VkSamplerYcbcrModelConversion   10
	VkPrimitiveTopology   11
	VkQueryType   11
	VkComponentTypeNV   11
	VkPerformanceCounterUnitKHR   11
	VkFragmentShadingRateNV   12
	VkShadingRatePaletteEntryNV   12 - no returning cases
	VkDescriptorType   15 - no returning cases.
	VkLogicOp   16 - no returning cases
	VkColorSpaceKHR   18 - used in VkSurfaceFormatKHR but unlikely to be used often.
	VkBlendFactor   19 - no returning cases.
	VkDriverId   26 - returned in two properties structs, unlikely to be used often.
	VkImageLayout   28 - many uses?
	VkDynamicState   30 - no returning cases
	VkObjectType   43 - must be value
	VkResult   44 - must be value
	VkBlendOp   51 - no returning cases
	VkFormat   307 - must be value

	 */



}