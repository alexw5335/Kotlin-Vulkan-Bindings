// This file has been automatically generated.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.*
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_1
 *     VkResult vkEnumerateInstanceVersion(
 *         uint32_t*  pApiVersion
 *     );
 */
internal external fun enumerateInstanceVersion(address: Long, pApiVersion: Long): Int



/**
 *     // provided by VK_VERSION_1_1
 *     VkResult vkBindBufferMemory2(
 *         VkDevice                 device
 *         uint32_t                 bindInfoCount
 *         VkBindBufferMemoryInfo*  pBindInfos
 *     );
 */
internal external fun bindBufferMemory2(address: Long, device: Long, bindInfoCount: Int, pBindInfos: Long): Int



/**
 *     // provided by VK_VERSION_1_1
 *     VkResult vkBindImageMemory2(
 *         VkDevice                device
 *         uint32_t                bindInfoCount
 *         VkBindImageMemoryInfo*  pBindInfos
 *     );
 */
internal external fun bindImageMemory2(address: Long, device: Long, bindInfoCount: Int, pBindInfos: Long): Int



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetDeviceGroupPeerMemoryFeatures(
 *         VkDevice                   device
 *         uint32_t                   heapIndex
 *         uint32_t                   localDeviceIndex
 *         uint32_t                   remoteDeviceIndex
 *         VkPeerMemoryFeatureFlags*  pPeerMemoryFeatures
 *     );
 */
internal external fun getDeviceGroupPeerMemoryFeatures(address: Long, device: Long, heapIndex: Int, localDeviceIndex: Int, remoteDeviceIndex: Int, pPeerMemoryFeatures: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkCmdSetDeviceMask(
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         deviceMask
 *     );
 */
internal external fun cmdSetDeviceMask(address: Long, commandBuffer: Long, deviceMask: Int)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkCmdDispatchBase(
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         baseGroupX
 *         uint32_t         baseGroupY
 *         uint32_t         baseGroupZ
 *         uint32_t         groupCountX
 *         uint32_t         groupCountY
 *         uint32_t         groupCountZ
 *     );
 */
internal external fun cmdDispatchBase(address: Long, commandBuffer: Long, baseGroupX: Int, baseGroupY: Int, baseGroupZ: Int, groupCountX: Int, groupCountY: Int, groupCountZ: Int)



/**
 *     // provided by VK_VERSION_1_1
 *     VkResult vkEnumeratePhysicalDeviceGroups(
 *         VkInstance                        instance
 *         uint32_t*                         pPhysicalDeviceGroupCount
 *         VkPhysicalDeviceGroupProperties*  pPhysicalDeviceGroupProperties
 *     );
 */
internal external fun enumeratePhysicalDeviceGroups(address: Long, instance: Long, pPhysicalDeviceGroupCount: Long, pPhysicalDeviceGroupProperties: Long): Int



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetImageMemoryRequirements2(
 *         VkDevice                         device
 *         VkImageMemoryRequirementsInfo2*  pInfo
 *         VkMemoryRequirements2*           pMemoryRequirements
 *     );
 */
internal external fun getImageMemoryRequirements2(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetBufferMemoryRequirements2(
 *         VkDevice                          device
 *         VkBufferMemoryRequirementsInfo2*  pInfo
 *         VkMemoryRequirements2*            pMemoryRequirements
 *     );
 */
internal external fun getBufferMemoryRequirements2(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetImageSparseMemoryRequirements2(
 *         VkDevice                               device
 *         VkImageSparseMemoryRequirementsInfo2*  pInfo
 *         uint32_t*                              pSparseMemoryRequirementCount
 *         VkSparseImageMemoryRequirements2*      pSparseMemoryRequirements
 *     );
 */
internal external fun getImageSparseMemoryRequirements2(address: Long, device: Long, pInfo: Long, pSparseMemoryRequirementCount: Long, pSparseMemoryRequirements: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetPhysicalDeviceFeatures2(
 *         VkPhysicalDevice            physicalDevice
 *         VkPhysicalDeviceFeatures2*  pFeatures
 *     );
 */
internal external fun getPhysicalDeviceFeatures2(address: Long, physicalDevice: Long, pFeatures: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetPhysicalDeviceProperties2(
 *         VkPhysicalDevice              physicalDevice
 *         VkPhysicalDeviceProperties2*  pProperties
 *     );
 */
internal external fun getPhysicalDeviceProperties2(address: Long, physicalDevice: Long, pProperties: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetPhysicalDeviceFormatProperties2(
 *         VkPhysicalDevice      physicalDevice
 *         VkFormat              format
 *         VkFormatProperties2*  pFormatProperties
 *     );
 */
internal external fun getPhysicalDeviceFormatProperties2(address: Long, physicalDevice: Long, format: Int, pFormatProperties: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     VkResult vkGetPhysicalDeviceImageFormatProperties2(
 *         VkPhysicalDevice                   physicalDevice
 *         VkPhysicalDeviceImageFormatInfo2*  pImageFormatInfo
 *         VkImageFormatProperties2*          pImageFormatProperties
 *     );
 */
internal external fun getPhysicalDeviceImageFormatProperties2(address: Long, physicalDevice: Long, pImageFormatInfo: Long, pImageFormatProperties: Long): Int



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetPhysicalDeviceQueueFamilyProperties2(
 *         VkPhysicalDevice           physicalDevice
 *         uint32_t*                  pQueueFamilyPropertyCount
 *         VkQueueFamilyProperties2*  pQueueFamilyProperties
 *     );
 */
internal external fun getPhysicalDeviceQueueFamilyProperties2(address: Long, physicalDevice: Long, pQueueFamilyPropertyCount: Long, pQueueFamilyProperties: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetPhysicalDeviceMemoryProperties2(
 *         VkPhysicalDevice                    physicalDevice
 *         VkPhysicalDeviceMemoryProperties2*  pMemoryProperties
 *     );
 */
internal external fun getPhysicalDeviceMemoryProperties2(address: Long, physicalDevice: Long, pMemoryProperties: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetPhysicalDeviceSparseImageFormatProperties2(
 *         VkPhysicalDevice                         physicalDevice
 *         VkPhysicalDeviceSparseImageFormatInfo2*  pFormatInfo
 *         uint32_t*                                pPropertyCount
 *         VkSparseImageFormatProperties2*          pProperties
 *     );
 */
internal external fun getPhysicalDeviceSparseImageFormatProperties2(address: Long, physicalDevice: Long, pFormatInfo: Long, pPropertyCount: Long, pProperties: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkTrimCommandPool(
 *         VkDevice                device
 *         VkCommandPool           commandPool
 *         VkCommandPoolTrimFlags  flags (reserved, must be zero)
 *     );
 */
internal external fun trimCommandPool(address: Long, device: Long, commandPool: Long, flags: Int)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetDeviceQueue2(
 *         VkDevice             device
 *         VkDeviceQueueInfo2*  pQueueInfo
 *         VkQueue*             pQueue
 *     );
 */
internal external fun getDeviceQueue2(address: Long, device: Long, pQueueInfo: Long, pQueue: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     VkResult vkCreateSamplerYcbcrConversion(
 *         VkDevice                             device
 *         VkSamplerYcbcrConversionCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*               pAllocator
 *         VkSamplerYcbcrConversion*            pYcbcrConversion
 *     );
 */
internal external fun createSamplerYcbcrConversion(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pYcbcrConversion: Long): Int



/**
 *     // provided by VK_VERSION_1_1
 *     void vkDestroySamplerYcbcrConversion(
 *         VkDevice                  device
 *         VkSamplerYcbcrConversion  ycbcrConversion
 *         VkAllocationCallbacks*    pAllocator
 *     );
 */
internal external fun destroySamplerYcbcrConversion(address: Long, device: Long, ycbcrConversion: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     VkResult vkCreateDescriptorUpdateTemplate(
 *         VkDevice                               device
 *         VkDescriptorUpdateTemplateCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*                 pAllocator
 *         VkDescriptorUpdateTemplate*            pDescriptorUpdateTemplate
 *     );
 */
internal external fun createDescriptorUpdateTemplate(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pDescriptorUpdateTemplate: Long): Int



/**
 *     // provided by VK_VERSION_1_1
 *     void vkDestroyDescriptorUpdateTemplate(
 *         VkDevice                    device
 *         VkDescriptorUpdateTemplate  descriptorUpdateTemplate
 *         VkAllocationCallbacks*      pAllocator
 *     );
 */
internal external fun destroyDescriptorUpdateTemplate(address: Long, device: Long, descriptorUpdateTemplate: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkUpdateDescriptorSetWithTemplate(
 *         VkDevice                    device
 *         VkDescriptorSet             descriptorSet
 *         VkDescriptorUpdateTemplate  descriptorUpdateTemplate
 *         void*                       pData
 *     );
 */
internal external fun updateDescriptorSetWithTemplate(address: Long, device: Long, descriptorSet: Long, descriptorUpdateTemplate: Long, pData: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetPhysicalDeviceExternalBufferProperties(
 *         VkPhysicalDevice                     physicalDevice
 *         VkPhysicalDeviceExternalBufferInfo*  pExternalBufferInfo
 *         VkExternalBufferProperties*          pExternalBufferProperties
 *     );
 */
internal external fun getPhysicalDeviceExternalBufferProperties(address: Long, physicalDevice: Long, pExternalBufferInfo: Long, pExternalBufferProperties: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetPhysicalDeviceExternalFenceProperties(
 *         VkPhysicalDevice                    physicalDevice
 *         VkPhysicalDeviceExternalFenceInfo*  pExternalFenceInfo
 *         VkExternalFenceProperties*          pExternalFenceProperties
 *     );
 */
internal external fun getPhysicalDeviceExternalFenceProperties(address: Long, physicalDevice: Long, pExternalFenceInfo: Long, pExternalFenceProperties: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetPhysicalDeviceExternalSemaphoreProperties(
 *         VkPhysicalDevice                        physicalDevice
 *         VkPhysicalDeviceExternalSemaphoreInfo*  pExternalSemaphoreInfo
 *         VkExternalSemaphoreProperties*          pExternalSemaphoreProperties
 *     );
 */
internal external fun getPhysicalDeviceExternalSemaphoreProperties(address: Long, physicalDevice: Long, pExternalSemaphoreInfo: Long, pExternalSemaphoreProperties: Long)



/**
 *     // provided by VK_VERSION_1_1
 *     void vkGetDescriptorSetLayoutSupport(
 *         VkDevice                          device
 *         VkDescriptorSetLayoutCreateInfo*  pCreateInfo
 *         VkDescriptorSetLayoutSupport*     pSupport
 *     );
 */
internal external fun getDescriptorSetLayoutSupport(address: Long, device: Long, pCreateInfo: Long, pSupport: Long)



/**
 * Implementation of VkSamplerYcbcrConversion.
 */
open class SamplerYcbcrConversionH(override val address: Long) : Addressable



/**
 * Implementation of VkDescriptorUpdateTemplate.
 */
open class DescriptorUpdateTemplateH(override val address: Long) : Addressable



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkPointClippingBehavior {
 *         VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES            = 0
 *         VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY      = 1
 *         VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR        = 0
 *         VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR  = 1
 *     }
 */
@Suppress("Unused")
enum class PointClippingBehavior(val value: Int) {
	
	
	ALL_CLIP_PLANES(0),
	
	USER_CLIP_PLANES_ONLY(1);


}



/**
 * Enum getter for [VkPointClippingBehavior].
 */
fun _PointClippingBehavior(value: Int) = when(value) {
	0 -> PointClippingBehavior.ALL_CLIP_PLANES
	1 -> PointClippingBehavior.USER_CLIP_PLANES_ONLY
	else -> throw RuntimeException("Invalid VkPointClippingBehavior enum value: $value")
}



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkTessellationDomainOrigin {
 *         VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT      = 0
 *         VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT      = 1
 *         VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR  = 0
 *         VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR  = 1
 *     }
 */
@Suppress("Unused")
enum class TessellationDomainOrigin(val value: Int) {
	
	
	UPPER_LEFT(0),
	
	LOWER_LEFT(1);


}



/**
 * Enum getter for [VkTessellationDomainOrigin].
 */
fun _TessellationDomainOrigin(value: Int) = when(value) {
	0 -> TessellationDomainOrigin.UPPER_LEFT
	1 -> TessellationDomainOrigin.LOWER_LEFT
	else -> throw RuntimeException("Invalid VkTessellationDomainOrigin enum value: $value")
}



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkSamplerYcbcrModelConversion {
 *         VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY        = 0
 *         VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY      = 1
 *         VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709           = 2
 *         VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601           = 3
 *         VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020          = 4
 *         VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR    = 0
 *         VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR  = 1
 *         VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR       = 2
 *         VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR       = 3
 *         VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR      = 4
 *     }
 */
@Suppress("Unused")
enum class SamplerYcbcrModelConversion(val value: Int) {
	
	
	RGB_IDENTITY(0),
	
	YCBCR_IDENTITY(1),
	
	YCBCR_709(2),
	
	YCBCR_601(3),
	
	YCBCR_2020(4);


}



/**
 * Enum getter for [VkSamplerYcbcrModelConversion].
 */
fun _SamplerYcbcrModelConversion(value: Int) = when(value) {
	0 -> SamplerYcbcrModelConversion.RGB_IDENTITY
	1 -> SamplerYcbcrModelConversion.YCBCR_IDENTITY
	2 -> SamplerYcbcrModelConversion.YCBCR_709
	3 -> SamplerYcbcrModelConversion.YCBCR_601
	4 -> SamplerYcbcrModelConversion.YCBCR_2020
	else -> throw RuntimeException("Invalid VkSamplerYcbcrModelConversion enum value: $value")
}



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkSamplerYcbcrRange {
 *         VK_SAMPLER_YCBCR_RANGE_ITU_FULL        = 0
 *         VK_SAMPLER_YCBCR_RANGE_ITU_NARROW      = 1
 *         VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR    = 0
 *         VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR  = 1
 *     }
 */
@Suppress("Unused")
enum class SamplerYcbcrRange(val value: Int) {
	
	
	ITU_FULL(0),
	
	ITU_NARROW(1);


}



/**
 * Enum getter for [VkSamplerYcbcrRange].
 */
fun _SamplerYcbcrRange(value: Int) = when(value) {
	0 -> SamplerYcbcrRange.ITU_FULL
	1 -> SamplerYcbcrRange.ITU_NARROW
	else -> throw RuntimeException("Invalid VkSamplerYcbcrRange enum value: $value")
}



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkChromaLocation {
 *         VK_CHROMA_LOCATION_COSITED_EVEN      = 0
 *         VK_CHROMA_LOCATION_MIDPOINT          = 1
 *         VK_CHROMA_LOCATION_COSITED_EVEN_KHR  = 0
 *         VK_CHROMA_LOCATION_MIDPOINT_KHR      = 1
 *     }
 */
@Suppress("Unused")
enum class ChromaLocation(val value: Int) {
	
	
	COSITED_EVEN(0),
	
	MIDPOINT(1);


}



/**
 * Enum getter for [VkChromaLocation].
 */
fun _ChromaLocation(value: Int) = when(value) {
	0 -> ChromaLocation.COSITED_EVEN
	1 -> ChromaLocation.MIDPOINT
	else -> throw RuntimeException("Invalid VkChromaLocation enum value: $value")
}



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkDescriptorUpdateTemplateType {
 *         VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET        = 0
 *         VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR  = 1
 *         VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR    = 0
 *     }
 */
@Suppress("Unused")
enum class DescriptorUpdateTemplateType(val value: Int) {
	
	
	DESCRIPTOR_SET(0);


}



/**
 * Enum getter for [VkDescriptorUpdateTemplateType].
 */
fun _DescriptorUpdateTemplateType(value: Int) = when(value) {
	0 -> DescriptorUpdateTemplateType.DESCRIPTOR_SET
	else -> throw RuntimeException("Invalid VkDescriptorUpdateTemplateType enum value: $value")
}



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkSubgroupFeatureFlagBits {
 *         VK_SUBGROUP_FEATURE_BASIC_BIT             = 1
 *         VK_SUBGROUP_FEATURE_VOTE_BIT              = 2
 *         VK_SUBGROUP_FEATURE_ARITHMETIC_BIT        = 4
 *         VK_SUBGROUP_FEATURE_BALLOT_BIT            = 8
 *         VK_SUBGROUP_FEATURE_SHUFFLE_BIT           = 16
 *         VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT  = 32
 *         VK_SUBGROUP_FEATURE_CLUSTERED_BIT         = 64
 *         VK_SUBGROUP_FEATURE_QUAD_BIT              = 128
 *         VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV    = 256
 *     }
 */
@JvmInline
value class SubgroupFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val BASIC = SubgroupFeatureFlags(1)
		
		val VOTE = SubgroupFeatureFlags(2)
		
		val ARITHMETIC = SubgroupFeatureFlags(4)
		
		val BALLOT = SubgroupFeatureFlags(8)
		
		val SHUFFLE = SubgroupFeatureFlags(16)
		
		val SHUFFLE_RELATIVE = SubgroupFeatureFlags(32)
		
		val CLUSTERED = SubgroupFeatureFlags(64)
		
		val QUAD = SubgroupFeatureFlags(128)
	
	}
	
	
	
	operator fun plus(mask: SubgroupFeatureFlags) = SubgroupFeatureFlags(value or mask.value)
	
	operator fun contains(mask: SubgroupFeatureFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [SubgroupFeatureFlags].
 */
inline fun SubgroupFeatureFlags(block: SubgroupFeatureFlags.Companion.() -> SubgroupFeatureFlags) = block(SubgroupFeatureFlags)



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkPeerMemoryFeatureFlagBits {
 *         VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT         = 1
 *         VK_PEER_MEMORY_FEATURE_COPY_DST_BIT         = 2
 *         VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT      = 4
 *         VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT      = 8
 *         VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR     = 1
 *         VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR     = 2
 *         VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR  = 4
 *         VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR  = 8
 *     }
 */
@JvmInline
value class PeerMemoryFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val COPY_SRC = PeerMemoryFeatureFlags(1)
		
		val COPY_DST = PeerMemoryFeatureFlags(2)
		
		val GENERIC_SRC = PeerMemoryFeatureFlags(4)
		
		val GENERIC_DST = PeerMemoryFeatureFlags(8)
	
	}
	
	
	
	operator fun plus(mask: PeerMemoryFeatureFlags) = PeerMemoryFeatureFlags(value or mask.value)
	
	operator fun contains(mask: PeerMemoryFeatureFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [PeerMemoryFeatureFlags].
 */
inline fun PeerMemoryFeatureFlags(block: PeerMemoryFeatureFlags.Companion.() -> PeerMemoryFeatureFlags) = block(PeerMemoryFeatureFlags)



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkMemoryAllocateFlagBits {
 *         VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT                        = 1
 *         VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT                     = 2
 *         VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT      = 4
 *         VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR                    = 1
 *         VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR                 = 2
 *         VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR  = 4
 *     }
 */
@JvmInline
value class MemoryAllocateFlags(val value: Int) {
	
	
	companion object {
		
		val DEVICE_MASK = MemoryAllocateFlags(1)
		
		val DEVICE_ADDRESS = MemoryAllocateFlags(2)
		
		val DEVICE_ADDRESS_CAPTURE_REPLAY = MemoryAllocateFlags(4)
	
	}
	
	
	
	operator fun plus(mask: MemoryAllocateFlags) = MemoryAllocateFlags(value or mask.value)
	
	operator fun contains(mask: MemoryAllocateFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [MemoryAllocateFlags].
 */
inline fun MemoryAllocateFlags(block: MemoryAllocateFlags.Companion.() -> MemoryAllocateFlags) = block(MemoryAllocateFlags)



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkExternalMemoryHandleTypeFlagBits {
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT                        = 1
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT                     = 2
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT                 = 4
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT                    = 8
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT                = 16
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT                       = 32
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT                   = 64
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR                    = 1
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR                 = 2
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR             = 4
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR                = 8
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR            = 16
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR                   = 32
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR               = 64
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT                      = 512
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID  = 1024
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT              = 128
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT   = 256
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_ZIRCON_VMO_BIT_FUCHSIA               = 2048
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV                  = 4096
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_RESERVED_13_BIT_NV                   = 8192
 *     }
 */
@JvmInline
value class ExternalMemoryHandleTypeFlags(val value: Int) {
	
	
	companion object {
		
		val OPAQUE_FD = ExternalMemoryHandleTypeFlags(1)
		
		val OPAQUE_WIN32 = ExternalMemoryHandleTypeFlags(2)
		
		val OPAQUE_WIN32_KMT = ExternalMemoryHandleTypeFlags(4)
		
		val D3D11_TEXTURE = ExternalMemoryHandleTypeFlags(8)
		
		val D3D11_TEXTURE_KMT = ExternalMemoryHandleTypeFlags(16)
		
		val D3D12_HEAP = ExternalMemoryHandleTypeFlags(32)
		
		val D3D12_RESOURCE = ExternalMemoryHandleTypeFlags(64)
	
	}
	
	
	
	operator fun plus(mask: ExternalMemoryHandleTypeFlags) = ExternalMemoryHandleTypeFlags(value or mask.value)
	
	operator fun contains(mask: ExternalMemoryHandleTypeFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [ExternalMemoryHandleTypeFlags].
 */
inline fun ExternalMemoryHandleTypeFlags(block: ExternalMemoryHandleTypeFlags.Companion.() -> ExternalMemoryHandleTypeFlags) = block(ExternalMemoryHandleTypeFlags)



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkExternalMemoryFeatureFlagBits {
 *         VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT      = 1
 *         VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT          = 2
 *         VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT          = 4
 *         VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR  = 1
 *         VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR      = 2
 *         VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR      = 4
 *     }
 */
@JvmInline
value class ExternalMemoryFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val DEDICATED_ONLY = ExternalMemoryFeatureFlags(1)
		
		val EXPORTABLE = ExternalMemoryFeatureFlags(2)
		
		val IMPORTABLE = ExternalMemoryFeatureFlags(4)
	
	}
	
	
	
	operator fun plus(mask: ExternalMemoryFeatureFlags) = ExternalMemoryFeatureFlags(value or mask.value)
	
	operator fun contains(mask: ExternalMemoryFeatureFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [ExternalMemoryFeatureFlags].
 */
inline fun ExternalMemoryFeatureFlags(block: ExternalMemoryFeatureFlags.Companion.() -> ExternalMemoryFeatureFlags) = block(ExternalMemoryFeatureFlags)



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkExternalFenceHandleTypeFlagBits {
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT             = 1
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT          = 2
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT      = 4
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT               = 8
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR         = 1
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR      = 2
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR  = 4
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR           = 8
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_RESERVED_4_BIT_NV         = 16
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_RESERVED_5_BIT_NV         = 32
 *     }
 */
@JvmInline
value class ExternalFenceHandleTypeFlags(val value: Int) {
	
	
	companion object {
		
		val OPAQUE_FD = ExternalFenceHandleTypeFlags(1)
		
		val OPAQUE_WIN32 = ExternalFenceHandleTypeFlags(2)
		
		val OPAQUE_WIN32_KMT = ExternalFenceHandleTypeFlags(4)
		
		val SYNC_FD = ExternalFenceHandleTypeFlags(8)
	
	}
	
	
	
	operator fun plus(mask: ExternalFenceHandleTypeFlags) = ExternalFenceHandleTypeFlags(value or mask.value)
	
	operator fun contains(mask: ExternalFenceHandleTypeFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [ExternalFenceHandleTypeFlags].
 */
inline fun ExternalFenceHandleTypeFlags(block: ExternalFenceHandleTypeFlags.Companion.() -> ExternalFenceHandleTypeFlags) = block(ExternalFenceHandleTypeFlags)



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkExternalFenceFeatureFlagBits {
 *         VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT      = 1
 *         VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT      = 2
 *         VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR  = 1
 *         VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR  = 2
 *     }
 */
@JvmInline
value class ExternalFenceFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val EXPORTABLE = ExternalFenceFeatureFlags(1)
		
		val IMPORTABLE = ExternalFenceFeatureFlags(2)
	
	}
	
	
	
	operator fun plus(mask: ExternalFenceFeatureFlags) = ExternalFenceFeatureFlags(value or mask.value)
	
	operator fun contains(mask: ExternalFenceFeatureFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [ExternalFenceFeatureFlags].
 */
inline fun ExternalFenceFeatureFlags(block: ExternalFenceFeatureFlags.Companion.() -> ExternalFenceFeatureFlags) = block(ExternalFenceFeatureFlags)



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkFenceImportFlagBits {
 *         VK_FENCE_IMPORT_TEMPORARY_BIT      = 1
 *         VK_FENCE_IMPORT_TEMPORARY_BIT_KHR  = 1
 *     }
 */
@JvmInline
value class FenceImportFlags(val value: Int) {
	
	
	companion object {
		
		val TEMPORARY = FenceImportFlags(1)
	
	}
	
	
	
	operator fun plus(mask: FenceImportFlags) = FenceImportFlags(value or mask.value)
	
	operator fun contains(mask: FenceImportFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [FenceImportFlags].
 */
inline fun FenceImportFlags(block: FenceImportFlags.Companion.() -> FenceImportFlags) = block(FenceImportFlags)



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkSemaphoreImportFlagBits {
 *         VK_SEMAPHORE_IMPORT_TEMPORARY_BIT      = 1
 *         VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR  = 1
 *     }
 */
@JvmInline
value class SemaphoreImportFlags(val value: Int) {
	
	
	companion object {
		
		val TEMPORARY = SemaphoreImportFlags(1)
	
	}
	
	
	
	operator fun plus(mask: SemaphoreImportFlags) = SemaphoreImportFlags(value or mask.value)
	
	operator fun contains(mask: SemaphoreImportFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [SemaphoreImportFlags].
 */
inline fun SemaphoreImportFlags(block: SemaphoreImportFlags.Companion.() -> SemaphoreImportFlags) = block(SemaphoreImportFlags)



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkExternalSemaphoreHandleTypeFlagBits {
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT             = 1
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT          = 2
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT      = 4
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT           = 8
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE_BIT           = 8
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT               = 16
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR         = 1
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR      = 2
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR  = 4
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR       = 8
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR           = 16
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_ZIRCON_EVENT_BIT_FUCHSIA  = 128
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_RESERVED_5_BIT_NV         = 32
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_RESERVED_6_BIT_NV         = 64
 *     }
 */
@JvmInline
value class ExternalSemaphoreHandleTypeFlags(val value: Int) {
	
	
	companion object {
		
		val OPAQUE_FD = ExternalSemaphoreHandleTypeFlags(1)
		
		val OPAQUE_WIN32 = ExternalSemaphoreHandleTypeFlags(2)
		
		val OPAQUE_WIN32_KMT = ExternalSemaphoreHandleTypeFlags(4)
		
		val D3D12_FENCE = ExternalSemaphoreHandleTypeFlags(8)
		
		val SYNC_FD = ExternalSemaphoreHandleTypeFlags(16)
	
	}
	
	
	
	operator fun plus(mask: ExternalSemaphoreHandleTypeFlags) = ExternalSemaphoreHandleTypeFlags(value or mask.value)
	
	operator fun contains(mask: ExternalSemaphoreHandleTypeFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [ExternalSemaphoreHandleTypeFlags].
 */
inline fun ExternalSemaphoreHandleTypeFlags(block: ExternalSemaphoreHandleTypeFlags.Companion.() -> ExternalSemaphoreHandleTypeFlags) = block(ExternalSemaphoreHandleTypeFlags)



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkExternalSemaphoreFeatureFlagBits {
 *         VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT      = 1
 *         VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT      = 2
 *         VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR  = 1
 *         VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR  = 2
 *     }
 */
@JvmInline
value class ExternalSemaphoreFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val EXPORTABLE = ExternalSemaphoreFeatureFlags(1)
		
		val IMPORTABLE = ExternalSemaphoreFeatureFlags(2)
	
	}
	
	
	
	operator fun plus(mask: ExternalSemaphoreFeatureFlags) = ExternalSemaphoreFeatureFlags(value or mask.value)
	
	operator fun contains(mask: ExternalSemaphoreFeatureFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [ExternalSemaphoreFeatureFlags].
 */
inline fun ExternalSemaphoreFeatureFlags(block: ExternalSemaphoreFeatureFlags.Companion.() -> ExternalSemaphoreFeatureFlags) = block(ExternalSemaphoreFeatureFlags)



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceSubgroupProperties {
 *         VkStructureType         sType
 *         void*                   pNext (must be null)
 *         uint32_t                subgroupSize
 *         VkShaderStageFlags      supportedStages
 *         VkSubgroupFeatureFlags  supportedOperations
 *         VkBool32                quadOperationsInAllStages
 *     }
 */
@JvmInline
value class PhysicalDeviceSubgroupProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var subgroupSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var supportedStages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var supportedOperations: SubgroupFeatureFlags
		get()      = SubgroupFeatureFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var quadOperationsInAllStages: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)


}



/**
 * Struct calloc function for [PhysicalDeviceSubgroupProperties].
 */
inline fun Allocator.PhysicalDeviceSubgroupProperties(block: (PhysicalDeviceSubgroupProperties) -> Unit) = PhysicalDeviceSubgroupProperties(calloc(32)).apply(block).also { it.sType = 1000094000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkBindBufferMemoryInfo {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkBuffer         buffer
 *         VkDeviceMemory   memory
 *         VkDeviceSize     memoryOffset
 *     }
 * 
 *     Valid pNext types:
 *         - VkBindBufferMemoryDeviceGroupInfo
 */
@JvmInline
value class BindBufferMemoryInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BindBufferMemoryInfo(offset(index))
		
		operator fun set(index: Int, value: BindBufferMemoryInfo) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (BindBufferMemoryInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BindBufferMemoryInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BindBufferMemoryInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [BindBufferMemoryInfo].
 */
inline fun Allocator.BindBufferMemoryInfo(block: (BindBufferMemoryInfo) -> Unit) = BindBufferMemoryInfo(calloc(40)).apply(block).also { it.sType = 1000157000 }



/**
 * Struct buffer calloc function for [BindBufferMemoryInfo].
 */
inline fun Allocator.BindBufferMemoryInfo(capacity: Int, block: (BindBufferMemoryInfo.Buffer) -> Unit) = BindBufferMemoryInfo.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000157000 } }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkBindImageMemoryInfo {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkImage          image
 *         VkDeviceMemory   memory
 *         VkDeviceSize     memoryOffset
 *     }
 * 
 *     Valid pNext types:
 *         - VkBindImageMemoryDeviceGroupInfo
 *         - VkBindImageMemorySwapchainInfoKHR
 *         - VkBindImagePlaneMemoryInfo
 */
@JvmInline
value class BindImageMemoryInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BindImageMemoryInfo(offset(index))
		
		operator fun set(index: Int, value: BindImageMemoryInfo) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (BindImageMemoryInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BindImageMemoryInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BindImageMemoryInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [BindImageMemoryInfo].
 */
inline fun Allocator.BindImageMemoryInfo(block: (BindImageMemoryInfo) -> Unit) = BindImageMemoryInfo(calloc(40)).apply(block).also { it.sType = 1000157001 }



/**
 * Struct buffer calloc function for [BindImageMemoryInfo].
 */
inline fun Allocator.BindImageMemoryInfo(capacity: Int, block: (BindImageMemoryInfo.Buffer) -> Unit) = BindImageMemoryInfo.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000157001 } }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDevice16BitStorageFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         storageBuffer16BitAccess
 *         VkBool32         uniformAndStorageBuffer16BitAccess
 *         VkBool32         storagePushConstant16
 *         VkBool32         storageInputOutput16
 *     }
 */
@JvmInline
value class PhysicalDevice16BitStorageFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var storageBuffer16BitAccess: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var uniformAndStorageBuffer16BitAccess: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var storagePushConstant16: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var storageInputOutput16: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)


}



/**
 * Struct calloc function for [PhysicalDevice16BitStorageFeatures].
 */
inline fun Allocator.PhysicalDevice16BitStorageFeatures(block: (PhysicalDevice16BitStorageFeatures) -> Unit) = PhysicalDevice16BitStorageFeatures(calloc(32)).apply(block).also { it.sType = 1000083000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkMemoryDedicatedRequirements {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         prefersDedicatedAllocation
 *         VkBool32         requiresDedicatedAllocation
 *     }
 */
@JvmInline
value class MemoryDedicatedRequirements(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var prefersDedicatedAllocation: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var requiresDedicatedAllocation: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 * Struct calloc function for [MemoryDedicatedRequirements].
 */
inline fun Allocator.MemoryDedicatedRequirements(block: (MemoryDedicatedRequirements) -> Unit) = MemoryDedicatedRequirements(calloc(24)).apply(block).also { it.sType = 1000127000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkMemoryDedicatedAllocateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkImage          image
 *         VkBuffer         buffer
 *     }
 */
@JvmInline
value class MemoryDedicatedAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)


}



/**
 * Struct calloc function for [MemoryDedicatedAllocateInfo].
 */
inline fun Allocator.MemoryDedicatedAllocateInfo(block: (MemoryDedicatedAllocateInfo) -> Unit) = MemoryDedicatedAllocateInfo(calloc(32)).apply(block).also { it.sType = 1000127001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkMemoryAllocateFlagsInfo {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkMemoryAllocateFlags  flags
 *         uint32_t               deviceMask
 *     }
 */
@JvmInline
value class MemoryAllocateFlagsInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: MemoryAllocateFlags
		get()      = MemoryAllocateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var deviceMask: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 * Struct calloc function for [MemoryAllocateFlagsInfo].
 */
inline fun Allocator.MemoryAllocateFlagsInfo(block: (MemoryAllocateFlagsInfo) -> Unit) = MemoryAllocateFlagsInfo(calloc(24)).apply(block).also { it.sType = 1000060000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkDeviceGroupRenderPassBeginInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         deviceMask
 *         uint32_t         deviceRenderAreaCount
 *         VkRect2D*        pDeviceRenderAreas
 *     }
 */
@JvmInline
value class DeviceGroupRenderPassBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var deviceMask: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var deviceRenderAreaCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pDeviceRenderAreas: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var deviceRenderAreas: Rect2D.Buffer
		get()      = Rect2D.Buffer(Unsafe.getLong(address + 24), deviceRenderAreaCount)
		set(value) { Unsafe.setLong(address + 24, value.address); deviceRenderAreaCount = value.capacity }


}



/**
 * Struct calloc function for [DeviceGroupRenderPassBeginInfo].
 */
inline fun Allocator.DeviceGroupRenderPassBeginInfo(block: (DeviceGroupRenderPassBeginInfo) -> Unit) = DeviceGroupRenderPassBeginInfo(calloc(32)).apply(block).also { it.sType = 1000060003 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkDeviceGroupCommandBufferBeginInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         deviceMask
 *     }
 */
@JvmInline
value class DeviceGroupCommandBufferBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var deviceMask: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [DeviceGroupCommandBufferBeginInfo].
 */
inline fun Allocator.DeviceGroupCommandBufferBeginInfo(block: (DeviceGroupCommandBufferBeginInfo) -> Unit) = DeviceGroupCommandBufferBeginInfo(calloc(24)).apply(block).also { it.sType = 1000060004 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkDeviceGroupSubmitInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         waitSemaphoreCount
 *         uint32_t*        pWaitSemaphoreDeviceIndices
 *         uint32_t         commandBufferCount
 *         uint32_t*        pCommandBufferDeviceMasks
 *         uint32_t         signalSemaphoreCount
 *         uint32_t*        pSignalSemaphoreDeviceIndices
 *     }
 */
@JvmInline
value class DeviceGroupSubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var waitSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pWaitSemaphoreDeviceIndices: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var commandBufferCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pCommandBufferDeviceMasks: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var signalSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pSignalSemaphoreDeviceIndices: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var waitSemaphoreDeviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), waitSemaphoreCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreCount = value.capacity }
	
	var commandBufferDeviceMasks: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 40), commandBufferCount)
		set(value) { Unsafe.setLong(address + 40, value.address); commandBufferCount = value.capacity }
	
	var signalSemaphoreDeviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 56), signalSemaphoreCount)
		set(value) { Unsafe.setLong(address + 56, value.address); signalSemaphoreCount = value.capacity }


}



/**
 * Struct calloc function for [DeviceGroupSubmitInfo].
 */
inline fun Allocator.DeviceGroupSubmitInfo(block: (DeviceGroupSubmitInfo) -> Unit) = DeviceGroupSubmitInfo(calloc(64)).apply(block).also { it.sType = 1000060005 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkDeviceGroupBindSparseInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         resourceDeviceIndex
 *         uint32_t         memoryDeviceIndex
 *     }
 */
@JvmInline
value class DeviceGroupBindSparseInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var resourceDeviceIndex: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var memoryDeviceIndex: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 * Struct calloc function for [DeviceGroupBindSparseInfo].
 */
inline fun Allocator.DeviceGroupBindSparseInfo(block: (DeviceGroupBindSparseInfo) -> Unit) = DeviceGroupBindSparseInfo(calloc(24)).apply(block).also { it.sType = 1000060006 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkBindBufferMemoryDeviceGroupInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         deviceIndexCount
 *         uint32_t*        pDeviceIndices
 *     }
 */
@JvmInline
value class BindBufferMemoryDeviceGroupInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var deviceIndexCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pDeviceIndices: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var deviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), deviceIndexCount)
		set(value) { Unsafe.setLong(address + 24, value.address); deviceIndexCount = value.capacity }


}



/**
 * Struct calloc function for [BindBufferMemoryDeviceGroupInfo].
 */
inline fun Allocator.BindBufferMemoryDeviceGroupInfo(block: (BindBufferMemoryDeviceGroupInfo) -> Unit) = BindBufferMemoryDeviceGroupInfo(calloc(32)).apply(block).also { it.sType = 1000060013 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkBindImageMemoryDeviceGroupInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         deviceIndexCount
 *         uint32_t*        pDeviceIndices
 *         uint32_t         splitInstanceBindRegionCount
 *         VkRect2D*        pSplitInstanceBindRegions
 *     }
 */
@JvmInline
value class BindImageMemoryDeviceGroupInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var deviceIndexCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pDeviceIndices: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var splitInstanceBindRegionCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pSplitInstanceBindRegions: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var deviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), deviceIndexCount)
		set(value) { Unsafe.setLong(address + 24, value.address); deviceIndexCount = value.capacity }
	
	var splitInstanceBindRegions: Rect2D.Buffer
		get()      = Rect2D.Buffer(Unsafe.getLong(address + 40), splitInstanceBindRegionCount)
		set(value) { Unsafe.setLong(address + 40, value.address); splitInstanceBindRegionCount = value.capacity }


}



/**
 * Struct calloc function for [BindImageMemoryDeviceGroupInfo].
 */
inline fun Allocator.BindImageMemoryDeviceGroupInfo(block: (BindImageMemoryDeviceGroupInfo) -> Unit) = BindImageMemoryDeviceGroupInfo(calloc(48)).apply(block).also { it.sType = 1000060014 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceGroupProperties {
 *         VkStructureType   sType
 *         void*             pNext (must be null)
 *         uint32_t          physicalDeviceCount
 *         VkPhysicalDevice  physicalDevices[32]
 *         VkBool32          subsetAllocation
 *     }
 */
@JvmInline
value class PhysicalDeviceGroupProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var physicalDeviceCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var physicalDevices: DirectLongBuffer
		get()      = DirectLongBuffer(address + 24, 32)
		set(value) = Unsafe.copy(value.address, address + 24, value.byteSize)
	
	var subsetAllocation: Int
		get()      = Unsafe.getInt(address + 280)
		set(value) = Unsafe.setInt(address + 280, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 288
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PhysicalDeviceGroupProperties(offset(index))
		
		operator fun set(index: Int, value: PhysicalDeviceGroupProperties) = Unsafe.copy(value.address, offset(index), 288)
		
		inline fun forEach(block: (PhysicalDeviceGroupProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PhysicalDeviceGroupProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PhysicalDeviceGroupProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [PhysicalDeviceGroupProperties].
 */
inline fun Allocator.PhysicalDeviceGroupProperties(block: (PhysicalDeviceGroupProperties) -> Unit) = PhysicalDeviceGroupProperties(calloc(288)).apply(block).also { it.sType = 1000070000 }



/**
 * Struct buffer calloc function for [PhysicalDeviceGroupProperties].
 */
inline fun Allocator.PhysicalDeviceGroupProperties(capacity: Int, block: (PhysicalDeviceGroupProperties.Buffer) -> Unit) = PhysicalDeviceGroupProperties.Buffer(calloc(capacity * 288), capacity).apply(block).apply { forEach { it.sType = 1000070000 } }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkDeviceGroupDeviceCreateInfo {
 *         VkStructureType    sType
 *         void*              pNext (must be null)
 *         uint32_t           physicalDeviceCount
 *         VkPhysicalDevice*  pPhysicalDevices
 *     }
 */
@JvmInline
value class DeviceGroupDeviceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var physicalDeviceCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pPhysicalDevices: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var physicalDevices: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), physicalDeviceCount)
		set(value) { Unsafe.setLong(address + 24, value.address); physicalDeviceCount = value.capacity }


}



/**
 * Struct calloc function for [DeviceGroupDeviceCreateInfo].
 */
inline fun Allocator.DeviceGroupDeviceCreateInfo(block: (DeviceGroupDeviceCreateInfo) -> Unit) = DeviceGroupDeviceCreateInfo(calloc(32)).apply(block).also { it.sType = 1000070001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkBufferMemoryRequirementsInfo2 {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBuffer         buffer
 *     }
 */
@JvmInline
value class BufferMemoryRequirementsInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)


}



/**
 * Struct calloc function for [BufferMemoryRequirementsInfo2].
 */
inline fun Allocator.BufferMemoryRequirementsInfo2(block: (BufferMemoryRequirementsInfo2) -> Unit) = BufferMemoryRequirementsInfo2(calloc(24)).apply(block).also { it.sType = 1000146000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkImageMemoryRequirementsInfo2 {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkImage          image
 *     }
 * 
 *     Valid pNext types:
 *         - VkImagePlaneMemoryRequirementsInfo
 */
@JvmInline
value class ImageMemoryRequirementsInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)


}



/**
 * Struct calloc function for [ImageMemoryRequirementsInfo2].
 */
inline fun Allocator.ImageMemoryRequirementsInfo2(block: (ImageMemoryRequirementsInfo2) -> Unit) = ImageMemoryRequirementsInfo2(calloc(24)).apply(block).also { it.sType = 1000146001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkImageSparseMemoryRequirementsInfo2 {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkImage          image
 *     }
 */
@JvmInline
value class ImageSparseMemoryRequirementsInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)


}



/**
 * Struct calloc function for [ImageSparseMemoryRequirementsInfo2].
 */
inline fun Allocator.ImageSparseMemoryRequirementsInfo2(block: (ImageSparseMemoryRequirementsInfo2) -> Unit) = ImageSparseMemoryRequirementsInfo2(calloc(24)).apply(block).also { it.sType = 1000146002 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkMemoryRequirements2 {
 *         VkStructureType       sType
 *         void*                 pNext
 *         VkMemoryRequirements  memoryRequirements
 *     }
 * 
 *     Valid pNext types:
 *         - VkMemoryDedicatedRequirements
 */
@JvmInline
value class MemoryRequirements2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memoryRequirements: MemoryRequirements
		get()      = MemoryRequirements(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 24)


}



/**
 * Struct calloc function for [MemoryRequirements2].
 */
inline fun Allocator.MemoryRequirements2(block: (MemoryRequirements2) -> Unit) = MemoryRequirements2(calloc(40)).apply(block).also { it.sType = 1000146003 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkSparseImageMemoryRequirements2 {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         VkSparseImageMemoryRequirements  memoryRequirements
 *     }
 */
@JvmInline
value class SparseImageMemoryRequirements2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memoryRequirements: SparseImageMemoryRequirements
		get()      = SparseImageMemoryRequirements(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 48)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageMemoryRequirements2(offset(index))
		
		operator fun set(index: Int, value: SparseImageMemoryRequirements2) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (SparseImageMemoryRequirements2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageMemoryRequirements2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageMemoryRequirements2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [SparseImageMemoryRequirements2].
 */
inline fun Allocator.SparseImageMemoryRequirements2(block: (SparseImageMemoryRequirements2) -> Unit) = SparseImageMemoryRequirements2(calloc(64)).apply(block).also { it.sType = 1000146004 }



/**
 * Struct buffer calloc function for [SparseImageMemoryRequirements2].
 */
inline fun Allocator.SparseImageMemoryRequirements2(capacity: Int, block: (SparseImageMemoryRequirements2.Buffer) -> Unit) = SparseImageMemoryRequirements2.Buffer(calloc(capacity * 64), capacity).apply(block).apply { forEach { it.sType = 1000146004 } }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceFeatures2 {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkPhysicalDeviceFeatures  features
 *     }
 * 
 *     Valid pNext types:
 *         - VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV
 *         - VkPhysicalDevicePrivateDataFeatures
 *         - VkPhysicalDeviceVariablePointersFeatures
 *         - VkPhysicalDeviceMultiviewFeatures
 *         - VkPhysicalDevicePresentIdFeaturesKHR
 *         - VkPhysicalDevicePresentWaitFeaturesKHR
 *         - VkPhysicalDevice16BitStorageFeatures
 *         - VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures
 *         - VkPhysicalDeviceSamplerYcbcrConversionFeatures
 *         - VkPhysicalDeviceProtectedMemoryFeatures
 *         - VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT
 *         - VkPhysicalDeviceMultiDrawFeaturesEXT
 *         - VkPhysicalDeviceInlineUniformBlockFeatures
 *         - VkPhysicalDeviceMaintenance4Features
 *         - VkPhysicalDeviceShaderDrawParametersFeatures
 *         - VkPhysicalDeviceShaderFloat16Int8Features
 *         - VkPhysicalDeviceHostQueryResetFeatures
 *         - VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR
 *         - VkPhysicalDeviceDeviceMemoryReportFeaturesEXT
 *         - VkPhysicalDeviceDescriptorIndexingFeatures
 *         - VkPhysicalDeviceTimelineSemaphoreFeatures
 *         - VkPhysicalDevice8BitStorageFeatures
 *         - VkPhysicalDeviceConditionalRenderingFeaturesEXT
 *         - VkPhysicalDeviceVulkanMemoryModelFeatures
 *         - VkPhysicalDeviceShaderAtomicInt64Features
 *         - VkPhysicalDeviceShaderAtomicFloatFeaturesEXT
 *         - VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
 *         - VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT
 *         - VkPhysicalDeviceASTCDecodeFeaturesEXT
 *         - VkPhysicalDeviceTransformFeedbackFeaturesEXT
 *         - VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV
 *         - VkPhysicalDeviceExclusiveScissorFeaturesNV
 *         - VkPhysicalDeviceCornerSampledImageFeaturesNV
 *         - VkPhysicalDeviceComputeShaderDerivativesFeaturesNV
 *         - VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV
 *         - VkPhysicalDeviceShaderImageFootprintFeaturesNV
 *         - VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV
 *         - VkPhysicalDeviceShadingRateImageFeaturesNV
 *         - VkPhysicalDeviceInvocationMaskFeaturesHUAWEI
 *         - VkPhysicalDeviceMeshShaderFeaturesNV
 *         - VkPhysicalDeviceAccelerationStructureFeaturesKHR
 *         - VkPhysicalDeviceRayTracingPipelineFeaturesKHR
 *         - VkPhysicalDeviceRayQueryFeaturesKHR
 *         - VkPhysicalDeviceFragmentDensityMapFeaturesEXT
 *         - VkPhysicalDeviceFragmentDensityMap2FeaturesEXT
 *         - VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM
 *         - VkPhysicalDeviceScalarBlockLayoutFeatures
 *         - VkPhysicalDeviceUniformBufferStandardLayoutFeatures
 *         - VkPhysicalDeviceDepthClipEnableFeaturesEXT
 *         - VkPhysicalDeviceMemoryPriorityFeaturesEXT
 *         - VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT
 *         - VkPhysicalDeviceBufferDeviceAddressFeatures
 *         - VkPhysicalDeviceBufferDeviceAddressFeaturesEXT
 *         - VkPhysicalDeviceImagelessFramebufferFeatures
 *         - VkPhysicalDeviceTextureCompressionASTCHDRFeatures
 *         - VkPhysicalDeviceCooperativeMatrixFeaturesNV
 *         - VkPhysicalDeviceYcbcrImageArraysFeaturesEXT
 *         - VkPhysicalDevicePerformanceQueryFeaturesKHR
 *         - VkPhysicalDeviceCoverageReductionModeFeaturesNV
 *         - VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL
 *         - VkPhysicalDeviceShaderClockFeaturesKHR
 *         - VkPhysicalDeviceIndexTypeUint8FeaturesEXT
 *         - VkPhysicalDeviceShaderSMBuiltinsFeaturesNV
 *         - VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT
 *         - VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures
 *         - VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT
 *         - VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR
 *         - VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures
 *         - VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT
 *         - VkPhysicalDeviceSubgroupSizeControlFeatures
 *         - VkPhysicalDeviceLineRasterizationFeaturesEXT
 *         - VkPhysicalDevicePipelineCreationCacheControlFeatures
 *         - VkPhysicalDeviceVulkan11Features
 *         - VkPhysicalDeviceVulkan12Features
 *         - VkPhysicalDeviceVulkan13Features
 *         - VkPhysicalDeviceCoherentMemoryFeaturesAMD
 *         - VkPhysicalDeviceCustomBorderColorFeaturesEXT
 *         - VkPhysicalDeviceBorderColorSwizzleFeaturesEXT
 *         - VkPhysicalDeviceExtendedDynamicStateFeaturesEXT
 *         - VkPhysicalDeviceExtendedDynamicState2FeaturesEXT
 *         - VkPhysicalDeviceDiagnosticsConfigFeaturesNV
 *         - VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures
 *         - VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR
 *         - VkPhysicalDeviceRobustness2FeaturesEXT
 *         - VkPhysicalDeviceImageRobustnessFeatures
 *         - VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR
 *         - VkPhysicalDevicePortabilitySubsetFeaturesKHR
 *         - VkPhysicalDevice4444FormatsFeaturesEXT
 *         - VkPhysicalDeviceSubpassShadingFeaturesHUAWEI
 *         - VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT
 *         - VkPhysicalDeviceFragmentShadingRateFeaturesKHR
 *         - VkPhysicalDeviceShaderTerminateInvocationFeatures
 *         - VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV
 *         - VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE
 *         - VkPhysicalDeviceDepthClipControlFeaturesEXT
 *         - VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT
 *         - VkPhysicalDeviceExternalMemoryRDMAFeaturesNV
 *         - VkPhysicalDeviceColorWriteEnableFeaturesEXT
 *         - VkPhysicalDeviceSynchronization2Features
 *         - VkPhysicalDeviceInheritedViewportScissorFeaturesNV
 *         - VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT
 *         - VkPhysicalDeviceProvokingVertexFeaturesEXT
 *         - VkPhysicalDeviceShaderIntegerDotProductFeatures
 *         - VkPhysicalDeviceRayTracingMotionBlurFeaturesNV
 *         - VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT
 *         - VkPhysicalDeviceDynamicRenderingFeatures
 *         - VkPhysicalDeviceImageViewMinLodFeaturesEXT
 *         - VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM
 *         - VkPhysicalDeviceLinearColorAttachmentFeaturesNV
 */
@JvmInline
value class PhysicalDeviceFeatures2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var features: PhysicalDeviceFeatures
		get()      = PhysicalDeviceFeatures(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 220)


}



/**
 * Struct calloc function for [PhysicalDeviceFeatures2].
 */
inline fun Allocator.PhysicalDeviceFeatures2(block: (PhysicalDeviceFeatures2) -> Unit) = PhysicalDeviceFeatures2(calloc(240)).apply(block).also { it.sType = 1000059000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceProperties2 {
 *         VkStructureType             sType
 *         void*                       pNext
 *         VkPhysicalDeviceProperties  properties
 *     }
 * 
 *     Valid pNext types:
 *         - VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV
 *         - VkPhysicalDeviceMultiDrawPropertiesEXT
 *         - VkPhysicalDevicePushDescriptorPropertiesKHR
 *         - VkPhysicalDeviceDriverProperties
 *         - VkPhysicalDeviceIDProperties
 *         - VkPhysicalDeviceMultiviewProperties
 *         - VkPhysicalDeviceDiscardRectanglePropertiesEXT
 *         - VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX
 *         - VkPhysicalDeviceSubgroupProperties
 *         - VkPhysicalDevicePointClippingProperties
 *         - VkPhysicalDeviceProtectedMemoryProperties
 *         - VkPhysicalDeviceSamplerFilterMinmaxProperties
 *         - VkPhysicalDeviceSampleLocationsPropertiesEXT
 *         - VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT
 *         - VkPhysicalDeviceInlineUniformBlockProperties
 *         - VkPhysicalDeviceMaintenance3Properties
 *         - VkPhysicalDeviceMaintenance4Properties
 *         - VkPhysicalDeviceFloatControlsProperties
 *         - VkPhysicalDeviceExternalMemoryHostPropertiesEXT
 *         - VkPhysicalDeviceConservativeRasterizationPropertiesEXT
 *         - VkPhysicalDeviceShaderCorePropertiesAMD
 *         - VkPhysicalDeviceShaderCoreProperties2AMD
 *         - VkPhysicalDeviceDescriptorIndexingProperties
 *         - VkPhysicalDeviceTimelineSemaphoreProperties
 *         - VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT
 *         - VkPhysicalDevicePCIBusInfoPropertiesEXT
 *         - VkPhysicalDeviceDepthStencilResolveProperties
 *         - VkPhysicalDeviceTransformFeedbackPropertiesEXT
 *         - VkPhysicalDeviceShadingRateImagePropertiesNV
 *         - VkPhysicalDeviceMeshShaderPropertiesNV
 *         - VkPhysicalDeviceAccelerationStructurePropertiesKHR
 *         - VkPhysicalDeviceRayTracingPipelinePropertiesKHR
 *         - VkPhysicalDeviceRayTracingPropertiesNV
 *         - VkPhysicalDeviceFragmentDensityMapPropertiesEXT
 *         - VkPhysicalDeviceFragmentDensityMap2PropertiesEXT
 *         - VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM
 *         - VkPhysicalDeviceCooperativeMatrixPropertiesNV
 *         - VkPhysicalDevicePerformanceQueryPropertiesKHR
 *         - VkPhysicalDeviceShaderSMBuiltinsPropertiesNV
 *         - VkPhysicalDeviceTexelBufferAlignmentProperties
 *         - VkPhysicalDeviceSubgroupSizeControlProperties
 *         - VkPhysicalDeviceSubpassShadingPropertiesHUAWEI
 *         - VkPhysicalDeviceLineRasterizationPropertiesEXT
 *         - VkPhysicalDeviceVulkan11Properties
 *         - VkPhysicalDeviceVulkan12Properties
 *         - VkPhysicalDeviceVulkan13Properties
 *         - VkPhysicalDeviceCustomBorderColorPropertiesEXT
 *         - VkPhysicalDeviceRobustness2PropertiesEXT
 *         - VkPhysicalDevicePortabilitySubsetPropertiesKHR
 *         - VkPhysicalDeviceFragmentShadingRatePropertiesKHR
 *         - VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV
 *         - VkPhysicalDeviceProvokingVertexPropertiesEXT
 *         - VkPhysicalDeviceShaderIntegerDotProductProperties
 *         - VkPhysicalDeviceDrmPropertiesEXT
 */
@JvmInline
value class PhysicalDeviceProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var properties: PhysicalDeviceProperties
		get()      = PhysicalDeviceProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 824)


}



/**
 * Struct calloc function for [PhysicalDeviceProperties2].
 */
inline fun Allocator.PhysicalDeviceProperties2(block: (PhysicalDeviceProperties2) -> Unit) = PhysicalDeviceProperties2(calloc(840)).apply(block).also { it.sType = 1000059001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkFormatProperties2 {
 *         VkStructureType     sType
 *         void*               pNext
 *         VkFormatProperties  formatProperties
 *     }
 * 
 *     Valid pNext types:
 *         - VkDrmFormatModifierPropertiesListEXT
 *         - VkVideoProfilesKHR
 *         - VkVideoProfileKHR
 *         - VkVideoDecodeH264ProfileEXT
 *         - VkVideoDecodeH265ProfileEXT
 *         - VkVideoEncodeH264ProfileEXT
 *         - VkVideoEncodeH265ProfileEXT
 *         - VkFormatProperties3
 *         - VkDrmFormatModifierPropertiesList2EXT
 */
@JvmInline
value class FormatProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var formatProperties: FormatProperties
		get()      = FormatProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 12)


}



/**
 * Struct calloc function for [FormatProperties2].
 */
inline fun Allocator.FormatProperties2(block: (FormatProperties2) -> Unit) = FormatProperties2(calloc(32)).apply(block).also { it.sType = 1000059002 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkImageFormatProperties2 {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkImageFormatProperties  imageFormatProperties
 *     }
 * 
 *     Valid pNext types:
 *         - VkExternalImageFormatProperties
 *         - VkSamplerYcbcrConversionImageFormatProperties
 *         - VkTextureLODGatherFormatPropertiesAMD
 *         - VkAndroidHardwareBufferUsageANDROID
 *         - VkFilterCubicImageViewImageFormatPropertiesEXT
 */
@JvmInline
value class ImageFormatProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var imageFormatProperties: ImageFormatProperties
		get()      = ImageFormatProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 32)


}



/**
 * Struct calloc function for [ImageFormatProperties2].
 */
inline fun Allocator.ImageFormatProperties2(block: (ImageFormatProperties2) -> Unit) = ImageFormatProperties2(calloc(48)).apply(block).also { it.sType = 1000059003 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceImageFormatInfo2 {
 *         VkStructureType     sType
 *         void*               pNext
 *         VkFormat            format
 *         VkImageType         type
 *         VkImageTiling       tiling
 *         VkImageUsageFlags   usage
 *         VkImageCreateFlags  flags
 *     }
 * 
 *     Valid pNext types:
 *         - VkPhysicalDeviceExternalImageFormatInfo
 *         - VkImageFormatListCreateInfo
 *         - VkPhysicalDeviceImageDrmFormatModifierInfoEXT
 *         - VkImageStencilUsageCreateInfo
 *         - VkPhysicalDeviceImageViewImageFormatInfoEXT
 */
@JvmInline
value class PhysicalDeviceImageFormatInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var type: ImageType
		get()      = _ImageType(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var tiling: ImageTiling
		get()      = _ImageTiling(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var usage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var flags: ImageCreateFlags
		get()      = ImageCreateFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)


}



/**
 * Struct calloc function for [PhysicalDeviceImageFormatInfo2].
 */
inline fun Allocator.PhysicalDeviceImageFormatInfo2(block: (PhysicalDeviceImageFormatInfo2) -> Unit) = PhysicalDeviceImageFormatInfo2(calloc(40)).apply(block).also { it.sType = 1000059004 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkQueueFamilyProperties2 {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkQueueFamilyProperties  queueFamilyProperties
 *     }
 * 
 *     Valid pNext types:
 *         - VkQueueFamilyGlobalPriorityPropertiesKHR
 *         - VkQueueFamilyCheckpointPropertiesNV
 *         - VkQueueFamilyCheckpointProperties2NV
 *         - VkVideoQueueFamilyProperties2KHR
 *         - VkQueueFamilyQueryResultStatusProperties2KHR
 */
@JvmInline
value class QueueFamilyProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var queueFamilyProperties: QueueFamilyProperties
		get()      = QueueFamilyProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 24)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = QueueFamilyProperties2(offset(index))
		
		operator fun set(index: Int, value: QueueFamilyProperties2) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (QueueFamilyProperties2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (QueueFamilyProperties2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, QueueFamilyProperties2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [QueueFamilyProperties2].
 */
inline fun Allocator.QueueFamilyProperties2(block: (QueueFamilyProperties2) -> Unit) = QueueFamilyProperties2(calloc(40)).apply(block).also { it.sType = 1000059005 }



/**
 * Struct buffer calloc function for [QueueFamilyProperties2].
 */
inline fun Allocator.QueueFamilyProperties2(capacity: Int, block: (QueueFamilyProperties2.Buffer) -> Unit) = QueueFamilyProperties2.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000059005 } }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceMemoryProperties2 {
 *         VkStructureType                   sType
 *         void*                             pNext
 *         VkPhysicalDeviceMemoryProperties  memoryProperties
 *     }
 * 
 *     Valid pNext types:
 *         - VkPhysicalDeviceMemoryBudgetPropertiesEXT
 */
@JvmInline
value class PhysicalDeviceMemoryProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memoryProperties: PhysicalDeviceMemoryProperties
		get()      = PhysicalDeviceMemoryProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 520)


}



/**
 * Struct calloc function for [PhysicalDeviceMemoryProperties2].
 */
inline fun Allocator.PhysicalDeviceMemoryProperties2(block: (PhysicalDeviceMemoryProperties2) -> Unit) = PhysicalDeviceMemoryProperties2(calloc(536)).apply(block).also { it.sType = 1000059006 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkSparseImageFormatProperties2 {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         VkSparseImageFormatProperties  properties
 *     }
 */
@JvmInline
value class SparseImageFormatProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var properties: SparseImageFormatProperties
		get()      = SparseImageFormatProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 20)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageFormatProperties2(offset(index))
		
		operator fun set(index: Int, value: SparseImageFormatProperties2) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (SparseImageFormatProperties2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageFormatProperties2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageFormatProperties2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [SparseImageFormatProperties2].
 */
inline fun Allocator.SparseImageFormatProperties2(block: (SparseImageFormatProperties2) -> Unit) = SparseImageFormatProperties2(calloc(40)).apply(block).also { it.sType = 1000059007 }



/**
 * Struct buffer calloc function for [SparseImageFormatProperties2].
 */
inline fun Allocator.SparseImageFormatProperties2(capacity: Int, block: (SparseImageFormatProperties2.Buffer) -> Unit) = SparseImageFormatProperties2.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000059007 } }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceSparseImageFormatInfo2 {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkFormat               format
 *         VkImageType            type
 *         VkSampleCountFlagBits  samples
 *         VkImageUsageFlags      usage
 *         VkImageTiling          tiling
 *     }
 */
@JvmInline
value class PhysicalDeviceSparseImageFormatInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var type: ImageType
		get()      = _ImageType(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var samples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var usage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var tiling: ImageTiling
		get()      = _ImageTiling(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)


}



/**
 * Struct calloc function for [PhysicalDeviceSparseImageFormatInfo2].
 */
inline fun Allocator.PhysicalDeviceSparseImageFormatInfo2(block: (PhysicalDeviceSparseImageFormatInfo2) -> Unit) = PhysicalDeviceSparseImageFormatInfo2(calloc(40)).apply(block).also { it.sType = 1000059008 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDevicePointClippingProperties {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkPointClippingBehavior  pointClippingBehavior
 *     }
 */
@JvmInline
value class PhysicalDevicePointClippingProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pointClippingBehavior: PointClippingBehavior
		get()      = _PointClippingBehavior(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [PhysicalDevicePointClippingProperties].
 */
inline fun Allocator.PhysicalDevicePointClippingProperties(block: (PhysicalDevicePointClippingProperties) -> Unit) = PhysicalDevicePointClippingProperties(calloc(24)).apply(block).also { it.sType = 1000117000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkRenderPassInputAttachmentAspectCreateInfo {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         uint32_t                           aspectReferenceCount
 *         VkInputAttachmentAspectReference*  pAspectReferences
 *     }
 */
@JvmInline
value class RenderPassInputAttachmentAspectCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var aspectReferenceCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pAspectReferences: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var aspectReferences: InputAttachmentAspectReference.Buffer
		get()      = InputAttachmentAspectReference.Buffer(Unsafe.getLong(address + 24), aspectReferenceCount)
		set(value) { Unsafe.setLong(address + 24, value.address); aspectReferenceCount = value.capacity }


}



/**
 * Struct calloc function for [RenderPassInputAttachmentAspectCreateInfo].
 */
inline fun Allocator.RenderPassInputAttachmentAspectCreateInfo(block: (RenderPassInputAttachmentAspectCreateInfo) -> Unit) = RenderPassInputAttachmentAspectCreateInfo(calloc(32)).apply(block).also { it.sType = 1000117001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkInputAttachmentAspectReference {
 *         uint32_t            subpass
 *         uint32_t            inputAttachmentIndex
 *         VkImageAspectFlags  aspectMask
 *     }
 */
@JvmInline
value class InputAttachmentAspectReference(override val address: Long) : Addressable {
	
	
	var subpass: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var inputAttachmentIndex: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 12
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = InputAttachmentAspectReference(offset(index))
		
		operator fun set(index: Int, value: InputAttachmentAspectReference) = Unsafe.copy(value.address, offset(index), 12)
		
		inline fun forEach(block: (InputAttachmentAspectReference) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (InputAttachmentAspectReference) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, InputAttachmentAspectReference) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [InputAttachmentAspectReference].
 */
inline fun Allocator.InputAttachmentAspectReference(block: (InputAttachmentAspectReference) -> Unit) = InputAttachmentAspectReference(calloc(12)).apply(block)



/**
 * Struct buffer calloc function for [InputAttachmentAspectReference].
 */
inline fun Allocator.InputAttachmentAspectReference(capacity: Int, block: (InputAttachmentAspectReference.Buffer) -> Unit) = InputAttachmentAspectReference.Buffer(calloc(capacity * 12), capacity).apply(block)



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkImageViewUsageCreateInfo {
 *         VkStructureType    sType
 *         void*              pNext (must be null)
 *         VkImageUsageFlags  usage
 *     }
 */
@JvmInline
value class ImageViewUsageCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var usage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [ImageViewUsageCreateInfo].
 */
inline fun Allocator.ImageViewUsageCreateInfo(block: (ImageViewUsageCreateInfo) -> Unit) = ImageViewUsageCreateInfo(calloc(24)).apply(block).also { it.sType = 1000117002 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPipelineTessellationDomainOriginStateCreateInfo {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkTessellationDomainOrigin  domainOrigin
 *     }
 */
@JvmInline
value class PipelineTessellationDomainOriginStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var domainOrigin: TessellationDomainOrigin
		get()      = _TessellationDomainOrigin(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [PipelineTessellationDomainOriginStateCreateInfo].
 */
inline fun Allocator.PipelineTessellationDomainOriginStateCreateInfo(block: (PipelineTessellationDomainOriginStateCreateInfo) -> Unit) = PipelineTessellationDomainOriginStateCreateInfo(calloc(24)).apply(block).also { it.sType = 1000117003 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkRenderPassMultiviewCreateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         subpassCount
 *         uint32_t*        pViewMasks
 *         uint32_t         dependencyCount
 *         int32_t*         pViewOffsets
 *         uint32_t         correlationMaskCount
 *         uint32_t*        pCorrelationMasks
 *     }
 */
@JvmInline
value class RenderPassMultiviewCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var subpassCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pViewMasks: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var dependencyCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pViewOffsets: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var correlationMaskCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pCorrelationMasks: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var viewMasks: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), subpassCount)
		set(value) { Unsafe.setLong(address + 24, value.address); subpassCount = value.capacity }
	
	var viewOffsets: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 40), dependencyCount)
		set(value) { Unsafe.setLong(address + 40, value.address); dependencyCount = value.capacity }
	
	var correlationMasks: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 56), correlationMaskCount)
		set(value) { Unsafe.setLong(address + 56, value.address); correlationMaskCount = value.capacity }


}



/**
 * Struct calloc function for [RenderPassMultiviewCreateInfo].
 */
inline fun Allocator.RenderPassMultiviewCreateInfo(block: (RenderPassMultiviewCreateInfo) -> Unit) = RenderPassMultiviewCreateInfo(calloc(64)).apply(block).also { it.sType = 1000053000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceMultiviewFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         multiview
 *         VkBool32         multiviewGeometryShader
 *         VkBool32         multiviewTessellationShader
 *     }
 */
@JvmInline
value class PhysicalDeviceMultiviewFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var multiview: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var multiviewGeometryShader: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var multiviewTessellationShader: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}



/**
 * Struct calloc function for [PhysicalDeviceMultiviewFeatures].
 */
inline fun Allocator.PhysicalDeviceMultiviewFeatures(block: (PhysicalDeviceMultiviewFeatures) -> Unit) = PhysicalDeviceMultiviewFeatures(calloc(32)).apply(block).also { it.sType = 1000053001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceMultiviewProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxMultiviewViewCount
 *         uint32_t         maxMultiviewInstanceIndex
 *     }
 */
@JvmInline
value class PhysicalDeviceMultiviewProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxMultiviewViewCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxMultiviewInstanceIndex: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 * Struct calloc function for [PhysicalDeviceMultiviewProperties].
 */
inline fun Allocator.PhysicalDeviceMultiviewProperties(block: (PhysicalDeviceMultiviewProperties) -> Unit) = PhysicalDeviceMultiviewProperties(calloc(24)).apply(block).also { it.sType = 1000053002 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceVariablePointersFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         variablePointersStorageBuffer
 *         VkBool32         variablePointers
 *     }
 */
@JvmInline
value class PhysicalDeviceVariablePointersFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var variablePointersStorageBuffer: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var variablePointers: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 * Struct calloc function for [PhysicalDeviceVariablePointersFeatures].
 */
inline fun Allocator.PhysicalDeviceVariablePointersFeatures(block: (PhysicalDeviceVariablePointersFeatures) -> Unit) = PhysicalDeviceVariablePointersFeatures(calloc(24)).apply(block).also { it.sType = 1000120000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceProtectedMemoryFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         protectedMemory
 *     }
 */
@JvmInline
value class PhysicalDeviceProtectedMemoryFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var protectedMemory: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceProtectedMemoryFeatures].
 */
inline fun Allocator.PhysicalDeviceProtectedMemoryFeatures(block: (PhysicalDeviceProtectedMemoryFeatures) -> Unit) = PhysicalDeviceProtectedMemoryFeatures(calloc(24)).apply(block).also { it.sType = 1000145001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceProtectedMemoryProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         protectedNoFault
 *     }
 */
@JvmInline
value class PhysicalDeviceProtectedMemoryProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var protectedNoFault: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceProtectedMemoryProperties].
 */
inline fun Allocator.PhysicalDeviceProtectedMemoryProperties(block: (PhysicalDeviceProtectedMemoryProperties) -> Unit) = PhysicalDeviceProtectedMemoryProperties(calloc(24)).apply(block).also { it.sType = 1000145002 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkDeviceQueueInfo2 {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkDeviceQueueCreateFlags  flags
 *         uint32_t                  queueFamilyIndex
 *         uint32_t                  queueIndex
 *     }
 */
@JvmInline
value class DeviceQueueInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: DeviceQueueCreateFlags
		get()      = DeviceQueueCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var queueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var queueIndex: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}



/**
 * Struct calloc function for [DeviceQueueInfo2].
 */
inline fun Allocator.DeviceQueueInfo2(block: (DeviceQueueInfo2) -> Unit) = DeviceQueueInfo2(calloc(32)).apply(block).also { it.sType = 1000145003 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkProtectedSubmitInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         protectedSubmit
 *     }
 */
@JvmInline
value class ProtectedSubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var protectedSubmit: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [ProtectedSubmitInfo].
 */
inline fun Allocator.ProtectedSubmitInfo(block: (ProtectedSubmitInfo) -> Unit) = ProtectedSubmitInfo(calloc(24)).apply(block).also { it.sType = 1000145000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkSamplerYcbcrConversionCreateInfo {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkFormat                       format
 *         VkSamplerYcbcrModelConversion  ycbcrModel
 *         VkSamplerYcbcrRange            ycbcrRange
 *         VkComponentMapping             components
 *         VkChromaLocation               xChromaOffset
 *         VkChromaLocation               yChromaOffset
 *         VkFilter                       chromaFilter
 *         VkBool32                       forceExplicitReconstruction
 *     }
 * 
 *     Valid pNext types:
 *         - VkExternalFormatANDROID
 */
@JvmInline
value class SamplerYcbcrConversionCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var ycbcrModel: SamplerYcbcrModelConversion
		get()      = _SamplerYcbcrModelConversion(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var ycbcrRange: SamplerYcbcrRange
		get()      = _SamplerYcbcrRange(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var components: ComponentMapping
		get()      = ComponentMapping(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 16)
	
	var xChromaOffset: ChromaLocation
		get()      = _ChromaLocation(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var yChromaOffset: ChromaLocation
		get()      = _ChromaLocation(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var chromaFilter: Filter
		get()      = _Filter(Unsafe.getInt(address + 52))
		set(value) = Unsafe.setInt(address + 52, value.value)
	
	var forceExplicitReconstruction: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)


}



/**
 * Struct calloc function for [SamplerYcbcrConversionCreateInfo].
 */
inline fun Allocator.SamplerYcbcrConversionCreateInfo(block: (SamplerYcbcrConversionCreateInfo) -> Unit) = SamplerYcbcrConversionCreateInfo(calloc(64)).apply(block).also { it.sType = 1000156000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkSamplerYcbcrConversionInfo {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkSamplerYcbcrConversion  conversion
 *     }
 */
@JvmInline
value class SamplerYcbcrConversionInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var conversion: SamplerYcbcrConversionH
		get()      = SamplerYcbcrConversionH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)


}



/**
 * Struct calloc function for [SamplerYcbcrConversionInfo].
 */
inline fun Allocator.SamplerYcbcrConversionInfo(block: (SamplerYcbcrConversionInfo) -> Unit) = SamplerYcbcrConversionInfo(calloc(24)).apply(block).also { it.sType = 1000156001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkBindImagePlaneMemoryInfo {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkImageAspectFlagBits  planeAspect
 *     }
 */
@JvmInline
value class BindImagePlaneMemoryInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var planeAspect: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [BindImagePlaneMemoryInfo].
 */
inline fun Allocator.BindImagePlaneMemoryInfo(block: (BindImagePlaneMemoryInfo) -> Unit) = BindImagePlaneMemoryInfo(calloc(24)).apply(block).also { it.sType = 1000156002 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkImagePlaneMemoryRequirementsInfo {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkImageAspectFlagBits  planeAspect
 *     }
 */
@JvmInline
value class ImagePlaneMemoryRequirementsInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var planeAspect: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [ImagePlaneMemoryRequirementsInfo].
 */
inline fun Allocator.ImagePlaneMemoryRequirementsInfo(block: (ImagePlaneMemoryRequirementsInfo) -> Unit) = ImagePlaneMemoryRequirementsInfo(calloc(24)).apply(block).also { it.sType = 1000156003 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceSamplerYcbcrConversionFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         samplerYcbcrConversion
 *     }
 */
@JvmInline
value class PhysicalDeviceSamplerYcbcrConversionFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var samplerYcbcrConversion: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceSamplerYcbcrConversionFeatures].
 */
inline fun Allocator.PhysicalDeviceSamplerYcbcrConversionFeatures(block: (PhysicalDeviceSamplerYcbcrConversionFeatures) -> Unit) = PhysicalDeviceSamplerYcbcrConversionFeatures(calloc(24)).apply(block).also { it.sType = 1000156004 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkSamplerYcbcrConversionImageFormatProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         combinedImageSamplerDescriptorCount
 *     }
 */
@JvmInline
value class SamplerYcbcrConversionImageFormatProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var combinedImageSamplerDescriptorCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [SamplerYcbcrConversionImageFormatProperties].
 */
inline fun Allocator.SamplerYcbcrConversionImageFormatProperties(block: (SamplerYcbcrConversionImageFormatProperties) -> Unit) = SamplerYcbcrConversionImageFormatProperties(calloc(24)).apply(block).also { it.sType = 1000156005 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkDescriptorUpdateTemplateEntry {
 *         uint32_t          dstBinding
 *         uint32_t          dstArrayElement
 *         uint32_t          descriptorCount
 *         VkDescriptorType  descriptorType
 *         size_t            offset
 *         size_t            stride
 *     }
 */
@JvmInline
value class DescriptorUpdateTemplateEntry(override val address: Long) : Addressable {
	
	
	var dstBinding: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var dstArrayElement: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var descriptorType: DescriptorType
		get()      = _DescriptorType(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var stride: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 32
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DescriptorUpdateTemplateEntry(offset(index))
		
		operator fun set(index: Int, value: DescriptorUpdateTemplateEntry) = Unsafe.copy(value.address, offset(index), 32)
		
		inline fun forEach(block: (DescriptorUpdateTemplateEntry) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DescriptorUpdateTemplateEntry) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DescriptorUpdateTemplateEntry) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [DescriptorUpdateTemplateEntry].
 */
inline fun Allocator.DescriptorUpdateTemplateEntry(block: (DescriptorUpdateTemplateEntry) -> Unit) = DescriptorUpdateTemplateEntry(calloc(32)).apply(block)



/**
 * Struct buffer calloc function for [DescriptorUpdateTemplateEntry].
 */
inline fun Allocator.DescriptorUpdateTemplateEntry(capacity: Int, block: (DescriptorUpdateTemplateEntry.Buffer) -> Unit) = DescriptorUpdateTemplateEntry.Buffer(calloc(capacity * 32), capacity).apply(block)



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkDescriptorUpdateTemplateCreateInfo {
 *         VkStructureType                        sType
 *         void*                                  pNext (must be null)
 *         VkDescriptorUpdateTemplateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                               descriptorUpdateEntryCount
 *         VkDescriptorUpdateTemplateEntry*       pDescriptorUpdateEntries
 *         VkDescriptorUpdateTemplateType         templateType
 *         VkDescriptorSetLayout                  descriptorSetLayout
 *         VkPipelineBindPoint                    pipelineBindPoint
 *         VkPipelineLayout                       pipelineLayout
 *         uint32_t                               set
 *     }
 */
@JvmInline
value class DescriptorUpdateTemplateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var descriptorUpdateEntryCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pDescriptorUpdateEntries: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var templateType: DescriptorUpdateTemplateType
		get()      = _DescriptorUpdateTemplateType(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var descriptorSetLayout: DescriptorSetLayoutH
		get()      = DescriptorSetLayoutH(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = _PipelineBindPoint(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var pipelineLayout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getLong(address + 56))
		set(value) = Unsafe.setLong(address + 56, value.address)
	
	var set: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	
	
	var descriptorUpdateEntries: DescriptorUpdateTemplateEntry.Buffer
		get()      = DescriptorUpdateTemplateEntry.Buffer(Unsafe.getLong(address + 24), descriptorUpdateEntryCount)
		set(value) { Unsafe.setLong(address + 24, value.address); descriptorUpdateEntryCount = value.capacity }


}



/**
 * Struct calloc function for [DescriptorUpdateTemplateCreateInfo].
 */
inline fun Allocator.DescriptorUpdateTemplateCreateInfo(block: (DescriptorUpdateTemplateCreateInfo) -> Unit) = DescriptorUpdateTemplateCreateInfo(calloc(72)).apply(block).also { it.sType = 1000085000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkExternalMemoryProperties {
 *         VkExternalMemoryFeatureFlags     externalMemoryFeatures
 *         VkExternalMemoryHandleTypeFlags  exportFromImportedHandleTypes
 *         VkExternalMemoryHandleTypeFlags  compatibleHandleTypes
 *     }
 */
@JvmInline
value class ExternalMemoryProperties(override val address: Long) : Addressable {
	
	
	var externalMemoryFeatures: ExternalMemoryFeatureFlags
		get()      = ExternalMemoryFeatureFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var exportFromImportedHandleTypes: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var compatibleHandleTypes: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)


}



/**
 * Struct calloc function for [ExternalMemoryProperties].
 */
inline fun Allocator.ExternalMemoryProperties(block: (ExternalMemoryProperties) -> Unit) = ExternalMemoryProperties(calloc(12)).apply(block)



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceExternalImageFormatInfo {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkExternalMemoryHandleTypeFlagBits  handleType
 *     }
 */
@JvmInline
value class PhysicalDeviceExternalImageFormatInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var handleType: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [PhysicalDeviceExternalImageFormatInfo].
 */
inline fun Allocator.PhysicalDeviceExternalImageFormatInfo(block: (PhysicalDeviceExternalImageFormatInfo) -> Unit) = PhysicalDeviceExternalImageFormatInfo(calloc(24)).apply(block).also { it.sType = 1000071000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkExternalImageFormatProperties {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkExternalMemoryProperties  externalMemoryProperties
 *     }
 */
@JvmInline
value class ExternalImageFormatProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var externalMemoryProperties: ExternalMemoryProperties
		get()      = ExternalMemoryProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 12)


}



/**
 * Struct calloc function for [ExternalImageFormatProperties].
 */
inline fun Allocator.ExternalImageFormatProperties(block: (ExternalImageFormatProperties) -> Unit) = ExternalImageFormatProperties(calloc(32)).apply(block).also { it.sType = 1000071001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceExternalBufferInfo {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkBufferCreateFlags                 flags
 *         VkBufferUsageFlags                  usage
 *         VkExternalMemoryHandleTypeFlagBits  handleType
 *     }
 */
@JvmInline
value class PhysicalDeviceExternalBufferInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: BufferCreateFlags
		get()      = BufferCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var usage: BufferUsageFlags
		get()      = BufferUsageFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var handleType: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)


}



/**
 * Struct calloc function for [PhysicalDeviceExternalBufferInfo].
 */
inline fun Allocator.PhysicalDeviceExternalBufferInfo(block: (PhysicalDeviceExternalBufferInfo) -> Unit) = PhysicalDeviceExternalBufferInfo(calloc(32)).apply(block).also { it.sType = 1000071002 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkExternalBufferProperties {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkExternalMemoryProperties  externalMemoryProperties
 *     }
 */
@JvmInline
value class ExternalBufferProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var externalMemoryProperties: ExternalMemoryProperties
		get()      = ExternalMemoryProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 12)


}



/**
 * Struct calloc function for [ExternalBufferProperties].
 */
inline fun Allocator.ExternalBufferProperties(block: (ExternalBufferProperties) -> Unit) = ExternalBufferProperties(calloc(32)).apply(block).also { it.sType = 1000071003 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceIDProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint8_t          deviceUUID[16]
 *         uint8_t          driverUUID[16]
 *         uint8_t          deviceLUID[8]
 *         uint32_t         deviceNodeMask
 *         VkBool32         deviceLUIDValid
 *     }
 */
@JvmInline
value class PhysicalDeviceIDProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var deviceUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + 16, 16)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)
	
	var driverUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + 32, 16)
		set(value) = Unsafe.copy(value.address, address + 32, value.byteSize)
	
	var deviceLUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + 48, 8)
		set(value) = Unsafe.copy(value.address, address + 48, value.byteSize)
	
	var deviceNodeMask: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var deviceLUIDValid: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)


}



/**
 * Struct calloc function for [PhysicalDeviceIDProperties].
 */
inline fun Allocator.PhysicalDeviceIDProperties(block: (PhysicalDeviceIDProperties) -> Unit) = PhysicalDeviceIDProperties(calloc(64)).apply(block).also { it.sType = 1000071004 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkExternalMemoryImageCreateInfo {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         VkExternalMemoryHandleTypeFlags  handleTypes
 *     }
 */
@JvmInline
value class ExternalMemoryImageCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var handleTypes: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [ExternalMemoryImageCreateInfo].
 */
inline fun Allocator.ExternalMemoryImageCreateInfo(block: (ExternalMemoryImageCreateInfo) -> Unit) = ExternalMemoryImageCreateInfo(calloc(24)).apply(block).also { it.sType = 1000072001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkExternalMemoryBufferCreateInfo {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         VkExternalMemoryHandleTypeFlags  handleTypes
 *     }
 */
@JvmInline
value class ExternalMemoryBufferCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var handleTypes: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [ExternalMemoryBufferCreateInfo].
 */
inline fun Allocator.ExternalMemoryBufferCreateInfo(block: (ExternalMemoryBufferCreateInfo) -> Unit) = ExternalMemoryBufferCreateInfo(calloc(24)).apply(block).also { it.sType = 1000072000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkExportMemoryAllocateInfo {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         VkExternalMemoryHandleTypeFlags  handleTypes
 *     }
 */
@JvmInline
value class ExportMemoryAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var handleTypes: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [ExportMemoryAllocateInfo].
 */
inline fun Allocator.ExportMemoryAllocateInfo(block: (ExportMemoryAllocateInfo) -> Unit) = ExportMemoryAllocateInfo(calloc(24)).apply(block).also { it.sType = 1000072002 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceExternalFenceInfo {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkExternalFenceHandleTypeFlagBits  handleType
 *     }
 */
@JvmInline
value class PhysicalDeviceExternalFenceInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var handleType: ExternalFenceHandleTypeFlags
		get()      = ExternalFenceHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [PhysicalDeviceExternalFenceInfo].
 */
inline fun Allocator.PhysicalDeviceExternalFenceInfo(block: (PhysicalDeviceExternalFenceInfo) -> Unit) = PhysicalDeviceExternalFenceInfo(calloc(24)).apply(block).also { it.sType = 1000112000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkExternalFenceProperties {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkExternalFenceHandleTypeFlags  exportFromImportedHandleTypes
 *         VkExternalFenceHandleTypeFlags  compatibleHandleTypes
 *         VkExternalFenceFeatureFlags     externalFenceFeatures
 *     }
 */
@JvmInline
value class ExternalFenceProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var exportFromImportedHandleTypes: ExternalFenceHandleTypeFlags
		get()      = ExternalFenceHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var compatibleHandleTypes: ExternalFenceHandleTypeFlags
		get()      = ExternalFenceHandleTypeFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var externalFenceFeatures: ExternalFenceFeatureFlags
		get()      = ExternalFenceFeatureFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)


}



/**
 * Struct calloc function for [ExternalFenceProperties].
 */
inline fun Allocator.ExternalFenceProperties(block: (ExternalFenceProperties) -> Unit) = ExternalFenceProperties(calloc(32)).apply(block).also { it.sType = 1000112001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkExportFenceCreateInfo {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkExternalFenceHandleTypeFlags  handleTypes
 *     }
 */
@JvmInline
value class ExportFenceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var handleTypes: ExternalFenceHandleTypeFlags
		get()      = ExternalFenceHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [ExportFenceCreateInfo].
 */
inline fun Allocator.ExportFenceCreateInfo(block: (ExportFenceCreateInfo) -> Unit) = ExportFenceCreateInfo(calloc(24)).apply(block).also { it.sType = 1000113000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkExportSemaphoreCreateInfo {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkExternalSemaphoreHandleTypeFlags  handleTypes
 *     }
 */
@JvmInline
value class ExportSemaphoreCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var handleTypes: ExternalSemaphoreHandleTypeFlags
		get()      = ExternalSemaphoreHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [ExportSemaphoreCreateInfo].
 */
inline fun Allocator.ExportSemaphoreCreateInfo(block: (ExportSemaphoreCreateInfo) -> Unit) = ExportSemaphoreCreateInfo(calloc(24)).apply(block).also { it.sType = 1000077000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceExternalSemaphoreInfo {
 *         VkStructureType                        sType
 *         void*                                  pNext
 *         VkExternalSemaphoreHandleTypeFlagBits  handleType
 *     }
 * 
 *     Valid pNext types:
 *         - VkSemaphoreTypeCreateInfo
 */
@JvmInline
value class PhysicalDeviceExternalSemaphoreInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var handleType: ExternalSemaphoreHandleTypeFlags
		get()      = ExternalSemaphoreHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [PhysicalDeviceExternalSemaphoreInfo].
 */
inline fun Allocator.PhysicalDeviceExternalSemaphoreInfo(block: (PhysicalDeviceExternalSemaphoreInfo) -> Unit) = PhysicalDeviceExternalSemaphoreInfo(calloc(24)).apply(block).also { it.sType = 1000076000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkExternalSemaphoreProperties {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkExternalSemaphoreHandleTypeFlags  exportFromImportedHandleTypes
 *         VkExternalSemaphoreHandleTypeFlags  compatibleHandleTypes
 *         VkExternalSemaphoreFeatureFlags     externalSemaphoreFeatures
 *     }
 */
@JvmInline
value class ExternalSemaphoreProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var exportFromImportedHandleTypes: ExternalSemaphoreHandleTypeFlags
		get()      = ExternalSemaphoreHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var compatibleHandleTypes: ExternalSemaphoreHandleTypeFlags
		get()      = ExternalSemaphoreHandleTypeFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var externalSemaphoreFeatures: ExternalSemaphoreFeatureFlags
		get()      = ExternalSemaphoreFeatureFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)


}



/**
 * Struct calloc function for [ExternalSemaphoreProperties].
 */
inline fun Allocator.ExternalSemaphoreProperties(block: (ExternalSemaphoreProperties) -> Unit) = ExternalSemaphoreProperties(calloc(32)).apply(block).also { it.sType = 1000076001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceMaintenance3Properties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxPerSetDescriptors
 *         VkDeviceSize     maxMemoryAllocationSize
 *     }
 */
@JvmInline
value class PhysicalDeviceMaintenance3Properties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxPerSetDescriptors: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxMemoryAllocationSize: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}



/**
 * Struct calloc function for [PhysicalDeviceMaintenance3Properties].
 */
inline fun Allocator.PhysicalDeviceMaintenance3Properties(block: (PhysicalDeviceMaintenance3Properties) -> Unit) = PhysicalDeviceMaintenance3Properties(calloc(32)).apply(block).also { it.sType = 1000168000 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkDescriptorSetLayoutSupport {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkBool32         supported
 *     }
 * 
 *     Valid pNext types:
 *         - VkDescriptorSetVariableDescriptorCountLayoutSupport
 */
@JvmInline
value class DescriptorSetLayoutSupport(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var supported: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [DescriptorSetLayoutSupport].
 */
inline fun Allocator.DescriptorSetLayoutSupport(block: (DescriptorSetLayoutSupport) -> Unit) = DescriptorSetLayoutSupport(calloc(24)).apply(block).also { it.sType = 1000168001 }



/**
 *     // provided by VK_VERSION_1_1
 *     struct VkPhysicalDeviceShaderDrawParametersFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderDrawParameters
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderDrawParametersFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderDrawParameters: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceShaderDrawParametersFeatures].
 */
inline fun Allocator.PhysicalDeviceShaderDrawParametersFeatures(block: (PhysicalDeviceShaderDrawParametersFeatures) -> Unit) = PhysicalDeviceShaderDrawParametersFeatures(calloc(24)).apply(block).also { it.sType = 1000063000 }