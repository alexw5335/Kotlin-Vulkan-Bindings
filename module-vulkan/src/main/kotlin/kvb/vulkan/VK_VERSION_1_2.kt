// This file has been automatically generated.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.*
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_2
 *     void vkCmdDrawIndirectCount(
 *         VkCommandBuffer  commandBuffer
 *         VkBuffer         buffer
 *         VkDeviceSize     offset
 *         VkBuffer         countBuffer
 *         VkDeviceSize     countBufferOffset
 *         uint32_t         maxDrawCount
 *         uint32_t         stride
 *     );
 */
internal external fun cmdDrawIndirectCount(address: Long, commandBuffer: Long, buffer: Long, offset: Long, countBuffer: Long, countBufferOffset: Long, maxDrawCount: Int, stride: Int)



/**
 *     // provided by VK_VERSION_1_2
 *     void vkCmdDrawIndexedIndirectCount(
 *         VkCommandBuffer  commandBuffer
 *         VkBuffer         buffer
 *         VkDeviceSize     offset
 *         VkBuffer         countBuffer
 *         VkDeviceSize     countBufferOffset
 *         uint32_t         maxDrawCount
 *         uint32_t         stride
 *     );
 */
internal external fun cmdDrawIndexedIndirectCount(address: Long, commandBuffer: Long, buffer: Long, offset: Long, countBuffer: Long, countBufferOffset: Long, maxDrawCount: Int, stride: Int)



/**
 *     // provided by VK_VERSION_1_2
 *     VkResult vkCreateRenderPass2(
 *         VkDevice                  device
 *         VkRenderPassCreateInfo2*  pCreateInfo
 *         VkAllocationCallbacks*    pAllocator
 *         VkRenderPass*             pRenderPass
 *     );
 */
internal external fun createRenderPass2(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pRenderPass: Long): Int



/**
 *     // provided by VK_VERSION_1_2
 *     void vkCmdBeginRenderPass2(
 *         VkCommandBuffer         commandBuffer
 *         VkRenderPassBeginInfo*  pRenderPassBegin
 *         VkSubpassBeginInfo*     pSubpassBeginInfo
 *     );
 */
internal external fun cmdBeginRenderPass2(address: Long, commandBuffer: Long, pRenderPassBegin: Long, pSubpassBeginInfo: Long)



/**
 *     // provided by VK_VERSION_1_2
 *     void vkCmdNextSubpass2(
 *         VkCommandBuffer      commandBuffer
 *         VkSubpassBeginInfo*  pSubpassBeginInfo
 *         VkSubpassEndInfo*    pSubpassEndInfo
 *     );
 */
internal external fun cmdNextSubpass2(address: Long, commandBuffer: Long, pSubpassBeginInfo: Long, pSubpassEndInfo: Long)



/**
 *     // provided by VK_VERSION_1_2
 *     void vkCmdEndRenderPass2(
 *         VkCommandBuffer    commandBuffer
 *         VkSubpassEndInfo*  pSubpassEndInfo
 *     );
 */
internal external fun cmdEndRenderPass2(address: Long, commandBuffer: Long, pSubpassEndInfo: Long)



/**
 *     // provided by VK_VERSION_1_2
 *     void vkResetQueryPool(
 *         VkDevice     device
 *         VkQueryPool  queryPool
 *         uint32_t     firstQuery
 *         uint32_t     queryCount
 *     );
 */
internal external fun resetQueryPool(address: Long, device: Long, queryPool: Long, firstQuery: Int, queryCount: Int)



/**
 *     // provided by VK_VERSION_1_2
 *     VkResult vkGetSemaphoreCounterValue(
 *         VkDevice     device
 *         VkSemaphore  semaphore
 *         uint64_t*    pValue
 *     );
 */
internal external fun getSemaphoreCounterValue(address: Long, device: Long, semaphore: Long, pValue: Long): Int



/**
 *     // provided by VK_VERSION_1_2
 *     VkResult vkWaitSemaphores(
 *         VkDevice              device
 *         VkSemaphoreWaitInfo*  pWaitInfo
 *         uint64_t              timeout
 *     );
 */
internal external fun waitSemaphores(address: Long, device: Long, pWaitInfo: Long, timeout: Long): Int



/**
 *     // provided by VK_VERSION_1_2
 *     VkResult vkSignalSemaphore(
 *         VkDevice                device
 *         VkSemaphoreSignalInfo*  pSignalInfo
 *     );
 */
internal external fun signalSemaphore(address: Long, device: Long, pSignalInfo: Long): Int



/**
 *     // provided by VK_VERSION_1_2
 *     VkDeviceAddress vkGetBufferDeviceAddress(
 *         VkDevice                    device
 *         VkBufferDeviceAddressInfo*  pInfo
 *     );
 */
internal external fun getBufferDeviceAddress(address: Long, device: Long, pInfo: Long): Long



/**
 *     // provided by VK_VERSION_1_2
 *     uint64_t vkGetBufferOpaqueCaptureAddress(
 *         VkDevice                    device
 *         VkBufferDeviceAddressInfo*  pInfo
 *     );
 */
internal external fun getBufferOpaqueCaptureAddress(address: Long, device: Long, pInfo: Long): Long



/**
 *     // provided by VK_VERSION_1_2
 *     uint64_t vkGetDeviceMemoryOpaqueCaptureAddress(
 *         VkDevice                                 device
 *         VkDeviceMemoryOpaqueCaptureAddressInfo*  pInfo
 *     );
 */
internal external fun getDeviceMemoryOpaqueCaptureAddress(address: Long, device: Long, pInfo: Long): Long



/**
 *     // provided by VK_VERSION_1_2
 *     enum VkDriverId {
 *         VK_DRIVER_ID_AMD_PROPRIETARY                = 1
 *         VK_DRIVER_ID_AMD_OPEN_SOURCE                = 2
 *         VK_DRIVER_ID_MESA_RADV                      = 3
 *         VK_DRIVER_ID_NVIDIA_PROPRIETARY             = 4
 *         VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS      = 5
 *         VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA         = 6
 *         VK_DRIVER_ID_IMAGINATION_PROPRIETARY        = 7
 *         VK_DRIVER_ID_QUALCOMM_PROPRIETARY           = 8
 *         VK_DRIVER_ID_ARM_PROPRIETARY                = 9
 *         VK_DRIVER_ID_GOOGLE_SWIFTSHADER             = 10
 *         VK_DRIVER_ID_GGP_PROPRIETARY                = 11
 *         VK_DRIVER_ID_BROADCOM_PROPRIETARY           = 12
 *         VK_DRIVER_ID_MESA_LLVMPIPE                  = 13
 *         VK_DRIVER_ID_MOLTENVK                       = 14
 *         VK_DRIVER_ID_COREAVI_PROPRIETARY            = 15
 *         VK_DRIVER_ID_JUICE_PROPRIETARY              = 16
 *         VK_DRIVER_ID_VERISILICON_PROPRIETARY        = 17
 *         VK_DRIVER_ID_MESA_TURNIP                    = 18
 *         VK_DRIVER_ID_MESA_V3DV                      = 19
 *         VK_DRIVER_ID_MESA_PANVK                     = 20
 *         VK_DRIVER_ID_SAMSUNG_PROPRIETARY            = 21
 *         VK_DRIVER_ID_MESA_VENUS                     = 22
 *         VK_DRIVER_ID_AMD_PROPRIETARY_KHR            = 1
 *         VK_DRIVER_ID_AMD_OPEN_SOURCE_KHR            = 2
 *         VK_DRIVER_ID_MESA_RADV_KHR                  = 3
 *         VK_DRIVER_ID_NVIDIA_PROPRIETARY_KHR         = 4
 *         VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS_KHR  = 5
 *         VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA_KHR     = 6
 *         VK_DRIVER_ID_IMAGINATION_PROPRIETARY_KHR    = 7
 *         VK_DRIVER_ID_QUALCOMM_PROPRIETARY_KHR       = 8
 *         VK_DRIVER_ID_ARM_PROPRIETARY_KHR            = 9
 *         VK_DRIVER_ID_GOOGLE_SWIFTSHADER_KHR         = 10
 *         VK_DRIVER_ID_GGP_PROPRIETARY_KHR            = 11
 *         VK_DRIVER_ID_BROADCOM_PROPRIETARY_KHR       = 12
 *     }
 */
@Suppress("Unused")
enum class DriverId(val value: Int) {
	
	
	AMD_PROPRIETARY(1),
	
	AMD_OPEN_SOURCE(2),
	
	MESA_RADV(3),
	
	NVIDIA_PROPRIETARY(4),
	
	INTEL_PROPRIETARY_WINDOWS(5),
	
	INTEL_OPEN_SOURCE_MESA(6),
	
	IMAGINATION_PROPRIETARY(7),
	
	QUALCOMM_PROPRIETARY(8),
	
	ARM_PROPRIETARY(9),
	
	GOOGLE_SWIFTSHADER(10),
	
	GGP_PROPRIETARY(11),
	
	BROADCOM_PROPRIETARY(12),
	
	MESA_LLVMPIPE(13),
	
	MOLTENVK(14),
	
	COREAVI_PROPRIETARY(15),
	
	JUICE_PROPRIETARY(16),
	
	VERISILICON_PROPRIETARY(17),
	
	MESA_TURNIP(18),
	
	MESA_V3DV(19),
	
	MESA_PANVK(20),
	
	SAMSUNG_PROPRIETARY(21),
	
	MESA_VENUS(22);


}



/**
 * Enum getter for [VkDriverId].
 */
fun _DriverId(value: Int) = when(value) {
	1 -> DriverId.AMD_PROPRIETARY
	2 -> DriverId.AMD_OPEN_SOURCE
	3 -> DriverId.MESA_RADV
	4 -> DriverId.NVIDIA_PROPRIETARY
	5 -> DriverId.INTEL_PROPRIETARY_WINDOWS
	6 -> DriverId.INTEL_OPEN_SOURCE_MESA
	7 -> DriverId.IMAGINATION_PROPRIETARY
	8 -> DriverId.QUALCOMM_PROPRIETARY
	9 -> DriverId.ARM_PROPRIETARY
	10 -> DriverId.GOOGLE_SWIFTSHADER
	11 -> DriverId.GGP_PROPRIETARY
	12 -> DriverId.BROADCOM_PROPRIETARY
	13 -> DriverId.MESA_LLVMPIPE
	14 -> DriverId.MOLTENVK
	15 -> DriverId.COREAVI_PROPRIETARY
	16 -> DriverId.JUICE_PROPRIETARY
	17 -> DriverId.VERISILICON_PROPRIETARY
	18 -> DriverId.MESA_TURNIP
	19 -> DriverId.MESA_V3DV
	20 -> DriverId.MESA_PANVK
	21 -> DriverId.SAMSUNG_PROPRIETARY
	22 -> DriverId.MESA_VENUS
	else -> throw RuntimeException("Invalid VkDriverId enum value: $value")
}



/**
 *     // provided by VK_VERSION_1_2
 *     enum VkShaderFloatControlsIndependence {
 *         VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY      = 0
 *         VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL              = 1
 *         VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE             = 2
 *         VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR  = 0
 *         VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL_KHR          = 1
 *         VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR         = 2
 *     }
 */
@Suppress("Unused")
enum class ShaderFloatControlsIndependence(val value: Int) {
	
	
	_32_BIT_ONLY(0),
	
	ALL(1),
	
	NONE(2);


}



/**
 * Enum getter for [VkShaderFloatControlsIndependence].
 */
fun _ShaderFloatControlsIndependence(value: Int) = when(value) {
	0 -> ShaderFloatControlsIndependence._32_BIT_ONLY
	1 -> ShaderFloatControlsIndependence.ALL
	2 -> ShaderFloatControlsIndependence.NONE
	else -> throw RuntimeException("Invalid VkShaderFloatControlsIndependence enum value: $value")
}



/**
 *     // provided by VK_VERSION_1_2
 *     enum VkSamplerReductionMode {
 *         VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE      = 0
 *         VK_SAMPLER_REDUCTION_MODE_MIN                   = 1
 *         VK_SAMPLER_REDUCTION_MODE_MAX                   = 2
 *         VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT  = 0
 *         VK_SAMPLER_REDUCTION_MODE_MIN_EXT               = 1
 *         VK_SAMPLER_REDUCTION_MODE_MAX_EXT               = 2
 *     }
 */
@Suppress("Unused")
enum class SamplerReductionMode(val value: Int) {
	
	
	WEIGHTED_AVERAGE(0),
	
	MIN(1),
	
	MAX(2);


}



/**
 * Enum getter for [VkSamplerReductionMode].
 */
fun _SamplerReductionMode(value: Int) = when(value) {
	0 -> SamplerReductionMode.WEIGHTED_AVERAGE
	1 -> SamplerReductionMode.MIN
	2 -> SamplerReductionMode.MAX
	else -> throw RuntimeException("Invalid VkSamplerReductionMode enum value: $value")
}



/**
 *     // provided by VK_VERSION_1_2
 *     enum VkSemaphoreType {
 *         VK_SEMAPHORE_TYPE_BINARY        = 0
 *         VK_SEMAPHORE_TYPE_TIMELINE      = 1
 *         VK_SEMAPHORE_TYPE_BINARY_KHR    = 0
 *         VK_SEMAPHORE_TYPE_TIMELINE_KHR  = 1
 *     }
 */
@Suppress("Unused")
enum class SemaphoreType(val value: Int) {
	
	
	BINARY(0),
	
	TIMELINE(1);


}



/**
 * Enum getter for [VkSemaphoreType].
 */
fun _SemaphoreType(value: Int) = when(value) {
	0 -> SemaphoreType.BINARY
	1 -> SemaphoreType.TIMELINE
	else -> throw RuntimeException("Invalid VkSemaphoreType enum value: $value")
}



/**
 *     // provided by VK_VERSION_1_2
 *     enum VkDescriptorBindingFlagBits {
 *         VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT                = 1
 *         VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT      = 2
 *         VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT                  = 4
 *         VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT        = 8
 *         VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT            = 1
 *         VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT  = 2
 *         VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT              = 4
 *         VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT    = 8
 *         VK_DESCRIPTOR_BINDING_RESERVED_4_BIT_QCOM                  = 16
 *     }
 */
@JvmInline
value class DescriptorBindingFlags(val value: Int) {
	
	
	companion object {
		
		val UPDATE_AFTER_BIND = DescriptorBindingFlags(1)
		
		val UPDATE_UNUSED_WHILE_PENDING = DescriptorBindingFlags(2)
		
		val PARTIALLY_BOUND = DescriptorBindingFlags(4)
		
		val VARIABLE_DESCRIPTOR_COUNT = DescriptorBindingFlags(8)
	
	}
	
	
	
	operator fun plus(mask: DescriptorBindingFlags) = DescriptorBindingFlags(value or mask.value)
	
	operator fun contains(mask: DescriptorBindingFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [DescriptorBindingFlags].
 */
inline fun DescriptorBindingFlags(block: DescriptorBindingFlags.Companion.() -> DescriptorBindingFlags) = block(DescriptorBindingFlags)



/**
 *     // provided by VK_VERSION_1_2
 *     enum VkResolveModeFlagBits {
 *         VK_RESOLVE_MODE_NONE                 = 0
 *         VK_RESOLVE_MODE_SAMPLE_ZERO_BIT      = 1
 *         VK_RESOLVE_MODE_AVERAGE_BIT          = 2
 *         VK_RESOLVE_MODE_MIN_BIT              = 4
 *         VK_RESOLVE_MODE_MAX_BIT              = 8
 *         VK_RESOLVE_MODE_NONE_KHR             = 0
 *         VK_RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR  = 1
 *         VK_RESOLVE_MODE_AVERAGE_BIT_KHR      = 2
 *         VK_RESOLVE_MODE_MIN_BIT_KHR          = 4
 *         VK_RESOLVE_MODE_MAX_BIT_KHR          = 8
 *     }
 */
@JvmInline
value class ResolveModeFlags(val value: Int) {
	
	
	companion object {
		
		val NONE = ResolveModeFlags(0)
		
		val SAMPLE_ZERO = ResolveModeFlags(1)
		
		val AVERAGE = ResolveModeFlags(2)
		
		val MIN = ResolveModeFlags(4)
		
		val MAX = ResolveModeFlags(8)
	
	}
	
	
	
	operator fun plus(mask: ResolveModeFlags) = ResolveModeFlags(value or mask.value)
	
	operator fun contains(mask: ResolveModeFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [ResolveModeFlags].
 */
inline fun ResolveModeFlags(block: ResolveModeFlags.Companion.() -> ResolveModeFlags) = block(ResolveModeFlags)



/**
 *     // provided by VK_VERSION_1_2
 *     enum VkSemaphoreWaitFlagBits {
 *         VK_SEMAPHORE_WAIT_ANY_BIT      = 1
 *         VK_SEMAPHORE_WAIT_ANY_BIT_KHR  = 1
 *     }
 */
@JvmInline
value class SemaphoreWaitFlags(val value: Int) {
	
	
	companion object {
		
		val ANY = SemaphoreWaitFlags(1)
	
	}
	
	
	
	operator fun plus(mask: SemaphoreWaitFlags) = SemaphoreWaitFlags(value or mask.value)
	
	operator fun contains(mask: SemaphoreWaitFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [SemaphoreWaitFlags].
 */
inline fun SemaphoreWaitFlags(block: SemaphoreWaitFlags.Companion.() -> SemaphoreWaitFlags) = block(SemaphoreWaitFlags)



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceVulkan11Features {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         storageBuffer16BitAccess
 *         VkBool32         uniformAndStorageBuffer16BitAccess
 *         VkBool32         storagePushConstant16
 *         VkBool32         storageInputOutput16
 *         VkBool32         multiview
 *         VkBool32         multiviewGeometryShader
 *         VkBool32         multiviewTessellationShader
 *         VkBool32         variablePointersStorageBuffer
 *         VkBool32         variablePointers
 *         VkBool32         protectedMemory
 *         VkBool32         samplerYcbcrConversion
 *         VkBool32         shaderDrawParameters
 *     }
 */
@JvmInline
value class PhysicalDeviceVulkan11Features(override val address: Long) : Addressable {
	
	
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
	
	var multiview: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var multiviewGeometryShader: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var multiviewTessellationShader: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var variablePointersStorageBuffer: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var variablePointers: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var protectedMemory: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var samplerYcbcrConversion: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var shaderDrawParameters: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)


}



/**
 * Struct calloc function for [PhysicalDeviceVulkan11Features].
 */
inline fun Allocator.PhysicalDeviceVulkan11Features(block: (PhysicalDeviceVulkan11Features) -> Unit) = PhysicalDeviceVulkan11Features(calloc(64)).apply(block).also { it.sType = 49 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceVulkan11Properties {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         uint8_t                  deviceUUID[16]
 *         uint8_t                  driverUUID[16]
 *         uint8_t                  deviceLUID[8]
 *         uint32_t                 deviceNodeMask
 *         VkBool32                 deviceLUIDValid
 *         uint32_t                 subgroupSize
 *         VkShaderStageFlags       subgroupSupportedStages
 *         VkSubgroupFeatureFlags   subgroupSupportedOperations
 *         VkBool32                 subgroupQuadOperationsInAllStages
 *         VkPointClippingBehavior  pointClippingBehavior
 *         uint32_t                 maxMultiviewViewCount
 *         uint32_t                 maxMultiviewInstanceIndex
 *         VkBool32                 protectedNoFault
 *         uint32_t                 maxPerSetDescriptors
 *         VkDeviceSize             maxMemoryAllocationSize
 *     }
 */
@JvmInline
value class PhysicalDeviceVulkan11Properties(override val address: Long) : Addressable {
	
	
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
	
	var subgroupSize: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var subgroupSupportedStages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 68))
		set(value) = Unsafe.setInt(address + 68, value.value)
	
	var subgroupSupportedOperations: SubgroupFeatureFlags
		get()      = SubgroupFeatureFlags(Unsafe.getInt(address + 72))
		set(value) = Unsafe.setInt(address + 72, value.value)
	
	var subgroupQuadOperationsInAllStages: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var pointClippingBehavior: PointClippingBehavior
		get()      = _PointClippingBehavior(Unsafe.getInt(address + 80))
		set(value) = Unsafe.setInt(address + 80, value.value)
	
	var maxMultiviewViewCount: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var maxMultiviewInstanceIndex: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var protectedNoFault: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var maxPerSetDescriptors: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var maxMemoryAllocationSize: Long
		get()      = Unsafe.getLong(address + 104)
		set(value) = Unsafe.setLong(address + 104, value)


}



/**
 * Struct calloc function for [PhysicalDeviceVulkan11Properties].
 */
inline fun Allocator.PhysicalDeviceVulkan11Properties(block: (PhysicalDeviceVulkan11Properties) -> Unit) = PhysicalDeviceVulkan11Properties(calloc(112)).apply(block).also { it.sType = 50 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceVulkan12Features {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         samplerMirrorClampToEdge
 *         VkBool32         drawIndirectCount
 *         VkBool32         storageBuffer8BitAccess
 *         VkBool32         uniformAndStorageBuffer8BitAccess
 *         VkBool32         storagePushConstant8
 *         VkBool32         shaderBufferInt64Atomics
 *         VkBool32         shaderSharedInt64Atomics
 *         VkBool32         shaderFloat16
 *         VkBool32         shaderInt8
 *         VkBool32         descriptorIndexing
 *         VkBool32         shaderInputAttachmentArrayDynamicIndexing
 *         VkBool32         shaderUniformTexelBufferArrayDynamicIndexing
 *         VkBool32         shaderStorageTexelBufferArrayDynamicIndexing
 *         VkBool32         shaderUniformBufferArrayNonUniformIndexing
 *         VkBool32         shaderSampledImageArrayNonUniformIndexing
 *         VkBool32         shaderStorageBufferArrayNonUniformIndexing
 *         VkBool32         shaderStorageImageArrayNonUniformIndexing
 *         VkBool32         shaderInputAttachmentArrayNonUniformIndexing
 *         VkBool32         shaderUniformTexelBufferArrayNonUniformIndexing
 *         VkBool32         shaderStorageTexelBufferArrayNonUniformIndexing
 *         VkBool32         descriptorBindingUniformBufferUpdateAfterBind
 *         VkBool32         descriptorBindingSampledImageUpdateAfterBind
 *         VkBool32         descriptorBindingStorageImageUpdateAfterBind
 *         VkBool32         descriptorBindingStorageBufferUpdateAfterBind
 *         VkBool32         descriptorBindingUniformTexelBufferUpdateAfterBind
 *         VkBool32         descriptorBindingStorageTexelBufferUpdateAfterBind
 *         VkBool32         descriptorBindingUpdateUnusedWhilePending
 *         VkBool32         descriptorBindingPartiallyBound
 *         VkBool32         descriptorBindingVariableDescriptorCount
 *         VkBool32         runtimeDescriptorArray
 *         VkBool32         samplerFilterMinmax
 *         VkBool32         scalarBlockLayout
 *         VkBool32         imagelessFramebuffer
 *         VkBool32         uniformBufferStandardLayout
 *         VkBool32         shaderSubgroupExtendedTypes
 *         VkBool32         separateDepthStencilLayouts
 *         VkBool32         hostQueryReset
 *         VkBool32         timelineSemaphore
 *         VkBool32         bufferDeviceAddress
 *         VkBool32         bufferDeviceAddressCaptureReplay
 *         VkBool32         bufferDeviceAddressMultiDevice
 *         VkBool32         vulkanMemoryModel
 *         VkBool32         vulkanMemoryModelDeviceScope
 *         VkBool32         vulkanMemoryModelAvailabilityVisibilityChains
 *         VkBool32         shaderOutputViewportIndex
 *         VkBool32         shaderOutputLayer
 *         VkBool32         subgroupBroadcastDynamicId
 *     }
 */
@JvmInline
value class PhysicalDeviceVulkan12Features(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var samplerMirrorClampToEdge: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var drawIndirectCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var storageBuffer8BitAccess: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var uniformAndStorageBuffer8BitAccess: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var storagePushConstant8: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var shaderBufferInt64Atomics: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var shaderSharedInt64Atomics: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var shaderFloat16: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var shaderInt8: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var descriptorIndexing: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var shaderInputAttachmentArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var shaderUniformTexelBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var shaderStorageTexelBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var shaderUniformBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var shaderSampledImageArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var shaderStorageBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var shaderStorageImageArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var shaderInputAttachmentArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var shaderUniformTexelBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var shaderStorageTexelBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var descriptorBindingUniformBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var descriptorBindingSampledImageUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 100)
		set(value) = Unsafe.setInt(address + 100, value)
	
	var descriptorBindingStorageImageUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 104)
		set(value) = Unsafe.setInt(address + 104, value)
	
	var descriptorBindingStorageBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 108)
		set(value) = Unsafe.setInt(address + 108, value)
	
	var descriptorBindingUniformTexelBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 112)
		set(value) = Unsafe.setInt(address + 112, value)
	
	var descriptorBindingStorageTexelBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 116)
		set(value) = Unsafe.setInt(address + 116, value)
	
	var descriptorBindingUpdateUnusedWhilePending: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var descriptorBindingPartiallyBound: Int
		get()      = Unsafe.getInt(address + 124)
		set(value) = Unsafe.setInt(address + 124, value)
	
	var descriptorBindingVariableDescriptorCount: Int
		get()      = Unsafe.getInt(address + 128)
		set(value) = Unsafe.setInt(address + 128, value)
	
	var runtimeDescriptorArray: Int
		get()      = Unsafe.getInt(address + 132)
		set(value) = Unsafe.setInt(address + 132, value)
	
	var samplerFilterMinmax: Int
		get()      = Unsafe.getInt(address + 136)
		set(value) = Unsafe.setInt(address + 136, value)
	
	var scalarBlockLayout: Int
		get()      = Unsafe.getInt(address + 140)
		set(value) = Unsafe.setInt(address + 140, value)
	
	var imagelessFramebuffer: Int
		get()      = Unsafe.getInt(address + 144)
		set(value) = Unsafe.setInt(address + 144, value)
	
	var uniformBufferStandardLayout: Int
		get()      = Unsafe.getInt(address + 148)
		set(value) = Unsafe.setInt(address + 148, value)
	
	var shaderSubgroupExtendedTypes: Int
		get()      = Unsafe.getInt(address + 152)
		set(value) = Unsafe.setInt(address + 152, value)
	
	var separateDepthStencilLayouts: Int
		get()      = Unsafe.getInt(address + 156)
		set(value) = Unsafe.setInt(address + 156, value)
	
	var hostQueryReset: Int
		get()      = Unsafe.getInt(address + 160)
		set(value) = Unsafe.setInt(address + 160, value)
	
	var timelineSemaphore: Int
		get()      = Unsafe.getInt(address + 164)
		set(value) = Unsafe.setInt(address + 164, value)
	
	var bufferDeviceAddress: Int
		get()      = Unsafe.getInt(address + 168)
		set(value) = Unsafe.setInt(address + 168, value)
	
	var bufferDeviceAddressCaptureReplay: Int
		get()      = Unsafe.getInt(address + 172)
		set(value) = Unsafe.setInt(address + 172, value)
	
	var bufferDeviceAddressMultiDevice: Int
		get()      = Unsafe.getInt(address + 176)
		set(value) = Unsafe.setInt(address + 176, value)
	
	var vulkanMemoryModel: Int
		get()      = Unsafe.getInt(address + 180)
		set(value) = Unsafe.setInt(address + 180, value)
	
	var vulkanMemoryModelDeviceScope: Int
		get()      = Unsafe.getInt(address + 184)
		set(value) = Unsafe.setInt(address + 184, value)
	
	var vulkanMemoryModelAvailabilityVisibilityChains: Int
		get()      = Unsafe.getInt(address + 188)
		set(value) = Unsafe.setInt(address + 188, value)
	
	var shaderOutputViewportIndex: Int
		get()      = Unsafe.getInt(address + 192)
		set(value) = Unsafe.setInt(address + 192, value)
	
	var shaderOutputLayer: Int
		get()      = Unsafe.getInt(address + 196)
		set(value) = Unsafe.setInt(address + 196, value)
	
	var subgroupBroadcastDynamicId: Int
		get()      = Unsafe.getInt(address + 200)
		set(value) = Unsafe.setInt(address + 200, value)


}



/**
 * Struct calloc function for [PhysicalDeviceVulkan12Features].
 */
inline fun Allocator.PhysicalDeviceVulkan12Features(block: (PhysicalDeviceVulkan12Features) -> Unit) = PhysicalDeviceVulkan12Features(calloc(208)).apply(block).also { it.sType = 51 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceVulkan12Properties {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkDriverId                         driverID
 *         char                               driverName[256]
 *         char                               driverInfo[256]
 *         VkConformanceVersion               conformanceVersion
 *         VkShaderFloatControlsIndependence  denormBehaviorIndependence
 *         VkShaderFloatControlsIndependence  roundingModeIndependence
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat16
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat32
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat64
 *         VkBool32                           shaderDenormPreserveFloat16
 *         VkBool32                           shaderDenormPreserveFloat32
 *         VkBool32                           shaderDenormPreserveFloat64
 *         VkBool32                           shaderDenormFlushToZeroFloat16
 *         VkBool32                           shaderDenormFlushToZeroFloat32
 *         VkBool32                           shaderDenormFlushToZeroFloat64
 *         VkBool32                           shaderRoundingModeRTEFloat16
 *         VkBool32                           shaderRoundingModeRTEFloat32
 *         VkBool32                           shaderRoundingModeRTEFloat64
 *         VkBool32                           shaderRoundingModeRTZFloat16
 *         VkBool32                           shaderRoundingModeRTZFloat32
 *         VkBool32                           shaderRoundingModeRTZFloat64
 *         uint32_t                           maxUpdateAfterBindDescriptorsInAllPools
 *         VkBool32                           shaderUniformBufferArrayNonUniformIndexingNative
 *         VkBool32                           shaderSampledImageArrayNonUniformIndexingNative
 *         VkBool32                           shaderStorageBufferArrayNonUniformIndexingNative
 *         VkBool32                           shaderStorageImageArrayNonUniformIndexingNative
 *         VkBool32                           shaderInputAttachmentArrayNonUniformIndexingNative
 *         VkBool32                           robustBufferAccessUpdateAfterBind
 *         VkBool32                           quadDivergentImplicitLod
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindSamplers
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindUniformBuffers
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindStorageBuffers
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindSampledImages
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindStorageImages
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindInputAttachments
 *         uint32_t                           maxPerStageUpdateAfterBindResources
 *         uint32_t                           maxDescriptorSetUpdateAfterBindSamplers
 *         uint32_t                           maxDescriptorSetUpdateAfterBindUniformBuffers
 *         uint32_t                           maxDescriptorSetUpdateAfterBindUniformBuffersDynamic
 *         uint32_t                           maxDescriptorSetUpdateAfterBindStorageBuffers
 *         uint32_t                           maxDescriptorSetUpdateAfterBindStorageBuffersDynamic
 *         uint32_t                           maxDescriptorSetUpdateAfterBindSampledImages
 *         uint32_t                           maxDescriptorSetUpdateAfterBindStorageImages
 *         uint32_t                           maxDescriptorSetUpdateAfterBindInputAttachments
 *         VkResolveModeFlags                 supportedDepthResolveModes
 *         VkResolveModeFlags                 supportedStencilResolveModes
 *         VkBool32                           independentResolveNone
 *         VkBool32                           independentResolve
 *         VkBool32                           filterMinmaxSingleComponentFormats
 *         VkBool32                           filterMinmaxImageComponentMapping
 *         uint64_t                           maxTimelineSemaphoreValueDifference
 *         VkSampleCountFlags                 framebufferIntegerColorSampleCounts
 *     }
 */
@JvmInline
value class PhysicalDeviceVulkan12Properties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var driverID: DriverId
		get()      = _DriverId(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var driverName: DirectByteBuffer
		get()      = DirectByteBuffer(address + 20, 256)
		set(value) = Unsafe.copy(value.address, address + 20, value.byteSize)
	
	var driverInfo: DirectByteBuffer
		get()      = DirectByteBuffer(address + 276, 256)
		set(value) = Unsafe.copy(value.address, address + 276, value.byteSize)
	
	var conformanceVersion: ConformanceVersion
		get()      = ConformanceVersion(address + 532)
		set(value) = Unsafe.copy(value.address, address + 532, 4)
	
	var denormBehaviorIndependence: ShaderFloatControlsIndependence
		get()      = _ShaderFloatControlsIndependence(Unsafe.getInt(address + 536))
		set(value) = Unsafe.setInt(address + 536, value.value)
	
	var roundingModeIndependence: ShaderFloatControlsIndependence
		get()      = _ShaderFloatControlsIndependence(Unsafe.getInt(address + 540))
		set(value) = Unsafe.setInt(address + 540, value.value)
	
	var shaderSignedZeroInfNanPreserveFloat16: Int
		get()      = Unsafe.getInt(address + 544)
		set(value) = Unsafe.setInt(address + 544, value)
	
	var shaderSignedZeroInfNanPreserveFloat32: Int
		get()      = Unsafe.getInt(address + 548)
		set(value) = Unsafe.setInt(address + 548, value)
	
	var shaderSignedZeroInfNanPreserveFloat64: Int
		get()      = Unsafe.getInt(address + 552)
		set(value) = Unsafe.setInt(address + 552, value)
	
	var shaderDenormPreserveFloat16: Int
		get()      = Unsafe.getInt(address + 556)
		set(value) = Unsafe.setInt(address + 556, value)
	
	var shaderDenormPreserveFloat32: Int
		get()      = Unsafe.getInt(address + 560)
		set(value) = Unsafe.setInt(address + 560, value)
	
	var shaderDenormPreserveFloat64: Int
		get()      = Unsafe.getInt(address + 564)
		set(value) = Unsafe.setInt(address + 564, value)
	
	var shaderDenormFlushToZeroFloat16: Int
		get()      = Unsafe.getInt(address + 568)
		set(value) = Unsafe.setInt(address + 568, value)
	
	var shaderDenormFlushToZeroFloat32: Int
		get()      = Unsafe.getInt(address + 572)
		set(value) = Unsafe.setInt(address + 572, value)
	
	var shaderDenormFlushToZeroFloat64: Int
		get()      = Unsafe.getInt(address + 576)
		set(value) = Unsafe.setInt(address + 576, value)
	
	var shaderRoundingModeRTEFloat16: Int
		get()      = Unsafe.getInt(address + 580)
		set(value) = Unsafe.setInt(address + 580, value)
	
	var shaderRoundingModeRTEFloat32: Int
		get()      = Unsafe.getInt(address + 584)
		set(value) = Unsafe.setInt(address + 584, value)
	
	var shaderRoundingModeRTEFloat64: Int
		get()      = Unsafe.getInt(address + 588)
		set(value) = Unsafe.setInt(address + 588, value)
	
	var shaderRoundingModeRTZFloat16: Int
		get()      = Unsafe.getInt(address + 592)
		set(value) = Unsafe.setInt(address + 592, value)
	
	var shaderRoundingModeRTZFloat32: Int
		get()      = Unsafe.getInt(address + 596)
		set(value) = Unsafe.setInt(address + 596, value)
	
	var shaderRoundingModeRTZFloat64: Int
		get()      = Unsafe.getInt(address + 600)
		set(value) = Unsafe.setInt(address + 600, value)
	
	var maxUpdateAfterBindDescriptorsInAllPools: Int
		get()      = Unsafe.getInt(address + 604)
		set(value) = Unsafe.setInt(address + 604, value)
	
	var shaderUniformBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 608)
		set(value) = Unsafe.setInt(address + 608, value)
	
	var shaderSampledImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 612)
		set(value) = Unsafe.setInt(address + 612, value)
	
	var shaderStorageBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 616)
		set(value) = Unsafe.setInt(address + 616, value)
	
	var shaderStorageImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 620)
		set(value) = Unsafe.setInt(address + 620, value)
	
	var shaderInputAttachmentArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 624)
		set(value) = Unsafe.setInt(address + 624, value)
	
	var robustBufferAccessUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 628)
		set(value) = Unsafe.setInt(address + 628, value)
	
	var quadDivergentImplicitLod: Int
		get()      = Unsafe.getInt(address + 632)
		set(value) = Unsafe.setInt(address + 632, value)
	
	var maxPerStageDescriptorUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + 636)
		set(value) = Unsafe.setInt(address + 636, value)
	
	var maxPerStageDescriptorUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + 640)
		set(value) = Unsafe.setInt(address + 640, value)
	
	var maxPerStageDescriptorUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + 644)
		set(value) = Unsafe.setInt(address + 644, value)
	
	var maxPerStageDescriptorUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + 648)
		set(value) = Unsafe.setInt(address + 648, value)
	
	var maxPerStageDescriptorUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + 652)
		set(value) = Unsafe.setInt(address + 652, value)
	
	var maxPerStageDescriptorUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + 656)
		set(value) = Unsafe.setInt(address + 656, value)
	
	var maxPerStageUpdateAfterBindResources: Int
		get()      = Unsafe.getInt(address + 660)
		set(value) = Unsafe.setInt(address + 660, value)
	
	var maxDescriptorSetUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + 664)
		set(value) = Unsafe.setInt(address + 664, value)
	
	var maxDescriptorSetUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + 668)
		set(value) = Unsafe.setInt(address + 668, value)
	
	var maxDescriptorSetUpdateAfterBindUniformBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 672)
		set(value) = Unsafe.setInt(address + 672, value)
	
	var maxDescriptorSetUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + 676)
		set(value) = Unsafe.setInt(address + 676, value)
	
	var maxDescriptorSetUpdateAfterBindStorageBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 680)
		set(value) = Unsafe.setInt(address + 680, value)
	
	var maxDescriptorSetUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + 684)
		set(value) = Unsafe.setInt(address + 684, value)
	
	var maxDescriptorSetUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + 688)
		set(value) = Unsafe.setInt(address + 688, value)
	
	var maxDescriptorSetUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + 692)
		set(value) = Unsafe.setInt(address + 692, value)
	
	var supportedDepthResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 696))
		set(value) = Unsafe.setInt(address + 696, value.value)
	
	var supportedStencilResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 700))
		set(value) = Unsafe.setInt(address + 700, value.value)
	
	var independentResolveNone: Int
		get()      = Unsafe.getInt(address + 704)
		set(value) = Unsafe.setInt(address + 704, value)
	
	var independentResolve: Int
		get()      = Unsafe.getInt(address + 708)
		set(value) = Unsafe.setInt(address + 708, value)
	
	var filterMinmaxSingleComponentFormats: Int
		get()      = Unsafe.getInt(address + 712)
		set(value) = Unsafe.setInt(address + 712, value)
	
	var filterMinmaxImageComponentMapping: Int
		get()      = Unsafe.getInt(address + 716)
		set(value) = Unsafe.setInt(address + 716, value)
	
	var maxTimelineSemaphoreValueDifference: Long
		get()      = Unsafe.getLong(address + 720)
		set(value) = Unsafe.setLong(address + 720, value)
	
	var framebufferIntegerColorSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 728))
		set(value) = Unsafe.setInt(address + 728, value.value)


}



/**
 * Struct calloc function for [PhysicalDeviceVulkan12Properties].
 */
inline fun Allocator.PhysicalDeviceVulkan12Properties(block: (PhysicalDeviceVulkan12Properties) -> Unit) = PhysicalDeviceVulkan12Properties(calloc(736)).apply(block).also { it.sType = 52 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkImageFormatListCreateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         viewFormatCount
 *         VkFormat*        pViewFormats
 *     }
 */
@JvmInline
value class ImageFormatListCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var viewFormatCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pViewFormats: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var viewFormats: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), viewFormatCount)
		set(value) { Unsafe.setLong(address + 24, value.address); viewFormatCount = value.capacity }


}



/**
 * Struct calloc function for [ImageFormatListCreateInfo].
 */
inline fun Allocator.ImageFormatListCreateInfo(block: (ImageFormatListCreateInfo) -> Unit) = ImageFormatListCreateInfo(calloc(32)).apply(block).also { it.sType = 1000147000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkRenderPassCreateInfo2 {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkRenderPassCreateFlags    flags
 *         uint32_t                   attachmentCount
 *         VkAttachmentDescription2*  pAttachments
 *         uint32_t                   subpassCount
 *         VkSubpassDescription2*     pSubpasses
 *         uint32_t                   dependencyCount
 *         VkSubpassDependency2*      pDependencies
 *         uint32_t                   correlatedViewMaskCount
 *         uint32_t*                  pCorrelatedViewMasks
 *     }
 * 
 *     Valid pNext types:
 *         - VkRenderPassFragmentDensityMapCreateInfoEXT
 */
@JvmInline
value class RenderPassCreateInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: RenderPassCreateFlags
		get()      = RenderPassCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var attachmentCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pAttachments: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var subpassCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pSubpasses: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var dependencyCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pDependencies: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var correlatedViewMaskCount: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var pCorrelatedViewMasks: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	
	
	var attachments: AttachmentDescription2.Buffer
		get()      = AttachmentDescription2.Buffer(Unsafe.getLong(address + 24), attachmentCount)
		set(value) { Unsafe.setLong(address + 24, value.address); attachmentCount = value.capacity }
	
	var subpasses: SubpassDescription2.Buffer
		get()      = SubpassDescription2.Buffer(Unsafe.getLong(address + 40), subpassCount)
		set(value) { Unsafe.setLong(address + 40, value.address); subpassCount = value.capacity }
	
	var dependencies: SubpassDependency2.Buffer
		get()      = SubpassDependency2.Buffer(Unsafe.getLong(address + 56), dependencyCount)
		set(value) { Unsafe.setLong(address + 56, value.address); dependencyCount = value.capacity }
	
	var correlatedViewMasks: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 72), correlatedViewMaskCount)
		set(value) { Unsafe.setLong(address + 72, value.address); correlatedViewMaskCount = value.capacity }


}



/**
 * Struct calloc function for [RenderPassCreateInfo2].
 */
inline fun Allocator.RenderPassCreateInfo2(block: (RenderPassCreateInfo2) -> Unit) = RenderPassCreateInfo2(calloc(80)).apply(block).also { it.sType = 1000109004 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkAttachmentDescription2 {
 *         VkStructureType               sType
 *         void*                         pNext
 *         VkAttachmentDescriptionFlags  flags
 *         VkFormat                      format
 *         VkSampleCountFlagBits         samples
 *         VkAttachmentLoadOp            loadOp
 *         VkAttachmentStoreOp           storeOp
 *         VkAttachmentLoadOp            stencilLoadOp
 *         VkAttachmentStoreOp           stencilStoreOp
 *         VkImageLayout                 initialLayout
 *         VkImageLayout                 finalLayout
 *     }
 * 
 *     Valid pNext types:
 *         - VkAttachmentDescriptionStencilLayout
 */
@JvmInline
value class AttachmentDescription2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: AttachmentDescriptionFlags
		get()      = AttachmentDescriptionFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var samples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var loadOp: AttachmentLoadOp
		get()      = _AttachmentLoadOp(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var storeOp: AttachmentStoreOp
		get()      = _AttachmentStoreOp(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var stencilLoadOp: AttachmentLoadOp
		get()      = _AttachmentLoadOp(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var stencilStoreOp: AttachmentStoreOp
		get()      = _AttachmentStoreOp(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var initialLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var finalLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 56
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = AttachmentDescription2(offset(index))
		
		operator fun set(index: Int, value: AttachmentDescription2) = Unsafe.copy(value.address, offset(index), 56)
		
		inline fun forEach(block: (AttachmentDescription2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AttachmentDescription2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, AttachmentDescription2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [AttachmentDescription2].
 */
inline fun Allocator.AttachmentDescription2(block: (AttachmentDescription2) -> Unit) = AttachmentDescription2(calloc(56)).apply(block).also { it.sType = 1000109000 }



/**
 * Struct buffer calloc function for [AttachmentDescription2].
 */
inline fun Allocator.AttachmentDescription2(capacity: Int, block: (AttachmentDescription2.Buffer) -> Unit) = AttachmentDescription2.Buffer(calloc(capacity * 56), capacity).apply(block).apply { forEach { it.sType = 1000109000 } }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkAttachmentReference2 {
 *         VkStructureType     sType
 *         void*               pNext
 *         uint32_t            attachment
 *         VkImageLayout       layout
 *         VkImageAspectFlags  aspectMask
 *     }
 * 
 *     Valid pNext types:
 *         - VkAttachmentReferenceStencilLayout
 */
@JvmInline
value class AttachmentReference2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var attachment: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var layout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 32
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = AttachmentReference2(offset(index))
		
		operator fun set(index: Int, value: AttachmentReference2) = Unsafe.copy(value.address, offset(index), 32)
		
		inline fun forEach(block: (AttachmentReference2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AttachmentReference2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, AttachmentReference2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [AttachmentReference2].
 */
inline fun Allocator.AttachmentReference2(block: (AttachmentReference2) -> Unit) = AttachmentReference2(calloc(32)).apply(block).also { it.sType = 1000109001 }



/**
 * Struct buffer calloc function for [AttachmentReference2].
 */
inline fun Allocator.AttachmentReference2(capacity: Int, block: (AttachmentReference2.Buffer) -> Unit) = AttachmentReference2.Buffer(calloc(capacity * 32), capacity).apply(block).apply { forEach { it.sType = 1000109001 } }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkSubpassDescription2 {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkSubpassDescriptionFlags  flags
 *         VkPipelineBindPoint        pipelineBindPoint
 *         uint32_t                   viewMask
 *         uint32_t                   inputAttachmentCount
 *         VkAttachmentReference2*    pInputAttachments
 *         uint32_t                   colorAttachmentCount
 *         VkAttachmentReference2*    pColorAttachments
 *         VkAttachmentReference2*    pResolveAttachments
 *         VkAttachmentReference2*    pDepthStencilAttachment
 *         uint32_t                   preserveAttachmentCount
 *         uint32_t*                  pPreserveAttachments
 *     }
 * 
 *     Valid pNext types:
 *         - VkSubpassDescriptionDepthStencilResolve
 *         - VkFragmentShadingRateAttachmentInfoKHR
 */
@JvmInline
value class SubpassDescription2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: SubpassDescriptionFlags
		get()      = SubpassDescriptionFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = _PipelineBindPoint(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var viewMask: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var inputAttachmentCount: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var pInputAttachments: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pColorAttachments: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var pResolveAttachments: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pDepthStencilAttachment: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	var preserveAttachmentCount: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var pPreserveAttachments: Long
		get()      = Unsafe.getLong(address + 80)
		set(value) = Unsafe.setLong(address + 80, value)
	
	
	
	var inputAttachments: AttachmentReference2.Buffer
		get()      = AttachmentReference2.Buffer(Unsafe.getLong(address + 32), inputAttachmentCount)
		set(value) { Unsafe.setLong(address + 32, value.address); inputAttachmentCount = value.capacity }
	
	var colorAttachments: AttachmentReference2.Buffer
		get()      = AttachmentReference2.Buffer(Unsafe.getLong(address + 48), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 48, value.address); colorAttachmentCount = value.capacity }
	
	var resolveAttachments: AttachmentReference2.Buffer
		get()      = AttachmentReference2.Buffer(Unsafe.getLong(address + 56), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 56, value.address); colorAttachmentCount = value.capacity }
	
	var depthStencilAttachment: AttachmentReference2
		get()      = AttachmentReference2(Unsafe.getLong(address + 64))
		set(value) { Unsafe.setLong(address + 64, value.address) }
	
	var preserveAttachments: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 80), preserveAttachmentCount)
		set(value) { Unsafe.setLong(address + 80, value.address); preserveAttachmentCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 88
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubpassDescription2(offset(index))
		
		operator fun set(index: Int, value: SubpassDescription2) = Unsafe.copy(value.address, offset(index), 88)
		
		inline fun forEach(block: (SubpassDescription2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubpassDescription2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubpassDescription2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [SubpassDescription2].
 */
inline fun Allocator.SubpassDescription2(block: (SubpassDescription2) -> Unit) = SubpassDescription2(calloc(88)).apply(block).also { it.sType = 1000109002 }



/**
 * Struct buffer calloc function for [SubpassDescription2].
 */
inline fun Allocator.SubpassDescription2(capacity: Int, block: (SubpassDescription2.Buffer) -> Unit) = SubpassDescription2.Buffer(calloc(capacity * 88), capacity).apply(block).apply { forEach { it.sType = 1000109002 } }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkSubpassDependency2 {
 *         VkStructureType       sType
 *         void*                 pNext
 *         uint32_t              srcSubpass
 *         uint32_t              dstSubpass
 *         VkPipelineStageFlags  srcStageMask
 *         VkPipelineStageFlags  dstStageMask
 *         VkAccessFlags         srcAccessMask
 *         VkAccessFlags         dstAccessMask
 *         VkDependencyFlags     dependencyFlags
 *         int32_t               viewOffset
 *     }
 * 
 *     Valid pNext types:
 *         - VkMemoryBarrier2
 */
@JvmInline
value class SubpassDependency2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcSubpass: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var dstSubpass: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var srcStageMask: PipelineStageFlags
		get()      = PipelineStageFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var dstStageMask: PipelineStageFlags
		get()      = PipelineStageFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var srcAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var dstAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var dependencyFlags: DependencyFlags
		get()      = DependencyFlags(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var viewOffset: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubpassDependency2(offset(index))
		
		operator fun set(index: Int, value: SubpassDependency2) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (SubpassDependency2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubpassDependency2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubpassDependency2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [SubpassDependency2].
 */
inline fun Allocator.SubpassDependency2(block: (SubpassDependency2) -> Unit) = SubpassDependency2(calloc(48)).apply(block).also { it.sType = 1000109003 }



/**
 * Struct buffer calloc function for [SubpassDependency2].
 */
inline fun Allocator.SubpassDependency2(capacity: Int, block: (SubpassDependency2.Buffer) -> Unit) = SubpassDependency2.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000109003 } }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkSubpassBeginInfo {
 *         VkStructureType    sType
 *         void*              pNext (must be null)
 *         VkSubpassContents  contents
 *     }
 */
@JvmInline
value class SubpassBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var contents: SubpassContents
		get()      = _SubpassContents(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [SubpassBeginInfo].
 */
inline fun Allocator.SubpassBeginInfo(block: (SubpassBeginInfo) -> Unit) = SubpassBeginInfo(calloc(24)).apply(block).also { it.sType = 1000109005 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkSubpassEndInfo {
 *         VkStructureType  sType
 *         void*            pNext
 *     }
 * 
 *     Valid pNext types:
 *         - VkSubpassFragmentDensityMapOffsetEndInfoQCOM
 */
@JvmInline
value class SubpassEndInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)


}



/**
 * Struct calloc function for [SubpassEndInfo].
 */
inline fun Allocator.SubpassEndInfo(block: (SubpassEndInfo) -> Unit) = SubpassEndInfo(calloc(16)).apply(block).also { it.sType = 1000109006 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDevice8BitStorageFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         storageBuffer8BitAccess
 *         VkBool32         uniformAndStorageBuffer8BitAccess
 *         VkBool32         storagePushConstant8
 *     }
 */
@JvmInline
value class PhysicalDevice8BitStorageFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var storageBuffer8BitAccess: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var uniformAndStorageBuffer8BitAccess: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var storagePushConstant8: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}



/**
 * Struct calloc function for [PhysicalDevice8BitStorageFeatures].
 */
inline fun Allocator.PhysicalDevice8BitStorageFeatures(block: (PhysicalDevice8BitStorageFeatures) -> Unit) = PhysicalDevice8BitStorageFeatures(calloc(32)).apply(block).also { it.sType = 1000177000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkConformanceVersion {
 *         uint8_t  major
 *         uint8_t  minor
 *         uint8_t  subminor
 *         uint8_t  patch
 *     }
 */
@JvmInline
value class ConformanceVersion(override val address: Long) : Addressable {
	
	
	var major: Byte
		get()      = Unsafe.getByte(address + 0)
		set(value) = Unsafe.setByte(address + 0, value)
	
	var minor: Byte
		get()      = Unsafe.getByte(address + 1)
		set(value) = Unsafe.setByte(address + 1, value)
	
	var subminor: Byte
		get()      = Unsafe.getByte(address + 2)
		set(value) = Unsafe.setByte(address + 2, value)
	
	var patch: Byte
		get()      = Unsafe.getByte(address + 3)
		set(value) = Unsafe.setByte(address + 3, value)


}



/**
 * Struct calloc function for [ConformanceVersion].
 */
inline fun Allocator.ConformanceVersion(block: (ConformanceVersion) -> Unit) = ConformanceVersion(calloc(4)).apply(block)



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceDriverProperties {
 *         VkStructureType       sType
 *         void*                 pNext (must be null)
 *         VkDriverId            driverID
 *         char                  driverName[256]
 *         char                  driverInfo[256]
 *         VkConformanceVersion  conformanceVersion
 *     }
 */
@JvmInline
value class PhysicalDeviceDriverProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var driverID: DriverId
		get()      = _DriverId(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var driverName: DirectByteBuffer
		get()      = DirectByteBuffer(address + 20, 256)
		set(value) = Unsafe.copy(value.address, address + 20, value.byteSize)
	
	var driverInfo: DirectByteBuffer
		get()      = DirectByteBuffer(address + 276, 256)
		set(value) = Unsafe.copy(value.address, address + 276, value.byteSize)
	
	var conformanceVersion: ConformanceVersion
		get()      = ConformanceVersion(address + 532)
		set(value) = Unsafe.copy(value.address, address + 532, 4)


}



/**
 * Struct calloc function for [PhysicalDeviceDriverProperties].
 */
inline fun Allocator.PhysicalDeviceDriverProperties(block: (PhysicalDeviceDriverProperties) -> Unit) = PhysicalDeviceDriverProperties(calloc(536)).apply(block).also { it.sType = 1000196000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceShaderAtomicInt64Features {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderBufferInt64Atomics
 *         VkBool32         shaderSharedInt64Atomics
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderAtomicInt64Features(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderBufferInt64Atomics: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var shaderSharedInt64Atomics: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 * Struct calloc function for [PhysicalDeviceShaderAtomicInt64Features].
 */
inline fun Allocator.PhysicalDeviceShaderAtomicInt64Features(block: (PhysicalDeviceShaderAtomicInt64Features) -> Unit) = PhysicalDeviceShaderAtomicInt64Features(calloc(24)).apply(block).also { it.sType = 1000180000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceShaderFloat16Int8Features {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderFloat16
 *         VkBool32         shaderInt8
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderFloat16Int8Features(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderFloat16: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var shaderInt8: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 * Struct calloc function for [PhysicalDeviceShaderFloat16Int8Features].
 */
inline fun Allocator.PhysicalDeviceShaderFloat16Int8Features(block: (PhysicalDeviceShaderFloat16Int8Features) -> Unit) = PhysicalDeviceShaderFloat16Int8Features(calloc(24)).apply(block).also { it.sType = 1000082000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceFloatControlsProperties {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkShaderFloatControlsIndependence  denormBehaviorIndependence
 *         VkShaderFloatControlsIndependence  roundingModeIndependence
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat16
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat32
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat64
 *         VkBool32                           shaderDenormPreserveFloat16
 *         VkBool32                           shaderDenormPreserveFloat32
 *         VkBool32                           shaderDenormPreserveFloat64
 *         VkBool32                           shaderDenormFlushToZeroFloat16
 *         VkBool32                           shaderDenormFlushToZeroFloat32
 *         VkBool32                           shaderDenormFlushToZeroFloat64
 *         VkBool32                           shaderRoundingModeRTEFloat16
 *         VkBool32                           shaderRoundingModeRTEFloat32
 *         VkBool32                           shaderRoundingModeRTEFloat64
 *         VkBool32                           shaderRoundingModeRTZFloat16
 *         VkBool32                           shaderRoundingModeRTZFloat32
 *         VkBool32                           shaderRoundingModeRTZFloat64
 *     }
 */
@JvmInline
value class PhysicalDeviceFloatControlsProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var denormBehaviorIndependence: ShaderFloatControlsIndependence
		get()      = _ShaderFloatControlsIndependence(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var roundingModeIndependence: ShaderFloatControlsIndependence
		get()      = _ShaderFloatControlsIndependence(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var shaderSignedZeroInfNanPreserveFloat16: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var shaderSignedZeroInfNanPreserveFloat32: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var shaderSignedZeroInfNanPreserveFloat64: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var shaderDenormPreserveFloat16: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var shaderDenormPreserveFloat32: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var shaderDenormPreserveFloat64: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var shaderDenormFlushToZeroFloat16: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var shaderDenormFlushToZeroFloat32: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var shaderDenormFlushToZeroFloat64: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var shaderRoundingModeRTEFloat16: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var shaderRoundingModeRTEFloat32: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var shaderRoundingModeRTEFloat64: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var shaderRoundingModeRTZFloat16: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var shaderRoundingModeRTZFloat32: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var shaderRoundingModeRTZFloat64: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)


}



/**
 * Struct calloc function for [PhysicalDeviceFloatControlsProperties].
 */
inline fun Allocator.PhysicalDeviceFloatControlsProperties(block: (PhysicalDeviceFloatControlsProperties) -> Unit) = PhysicalDeviceFloatControlsProperties(calloc(88)).apply(block).also { it.sType = 1000197000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkDescriptorSetLayoutBindingFlagsCreateInfo {
 *         VkStructureType            sType
 *         void*                      pNext (must be null)
 *         uint32_t                   bindingCount
 *         VkDescriptorBindingFlags*  pBindingFlags
 *     }
 */
@JvmInline
value class DescriptorSetLayoutBindingFlagsCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var bindingCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pBindingFlags: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var bindingFlags: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), bindingCount)
		set(value) { Unsafe.setLong(address + 24, value.address); bindingCount = value.capacity }


}



/**
 * Struct calloc function for [DescriptorSetLayoutBindingFlagsCreateInfo].
 */
inline fun Allocator.DescriptorSetLayoutBindingFlagsCreateInfo(block: (DescriptorSetLayoutBindingFlagsCreateInfo) -> Unit) = DescriptorSetLayoutBindingFlagsCreateInfo(calloc(32)).apply(block).also { it.sType = 1000161000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceDescriptorIndexingFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderInputAttachmentArrayDynamicIndexing
 *         VkBool32         shaderUniformTexelBufferArrayDynamicIndexing
 *         VkBool32         shaderStorageTexelBufferArrayDynamicIndexing
 *         VkBool32         shaderUniformBufferArrayNonUniformIndexing
 *         VkBool32         shaderSampledImageArrayNonUniformIndexing
 *         VkBool32         shaderStorageBufferArrayNonUniformIndexing
 *         VkBool32         shaderStorageImageArrayNonUniformIndexing
 *         VkBool32         shaderInputAttachmentArrayNonUniformIndexing
 *         VkBool32         shaderUniformTexelBufferArrayNonUniformIndexing
 *         VkBool32         shaderStorageTexelBufferArrayNonUniformIndexing
 *         VkBool32         descriptorBindingUniformBufferUpdateAfterBind
 *         VkBool32         descriptorBindingSampledImageUpdateAfterBind
 *         VkBool32         descriptorBindingStorageImageUpdateAfterBind
 *         VkBool32         descriptorBindingStorageBufferUpdateAfterBind
 *         VkBool32         descriptorBindingUniformTexelBufferUpdateAfterBind
 *         VkBool32         descriptorBindingStorageTexelBufferUpdateAfterBind
 *         VkBool32         descriptorBindingUpdateUnusedWhilePending
 *         VkBool32         descriptorBindingPartiallyBound
 *         VkBool32         descriptorBindingVariableDescriptorCount
 *         VkBool32         runtimeDescriptorArray
 *     }
 */
@JvmInline
value class PhysicalDeviceDescriptorIndexingFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderInputAttachmentArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var shaderUniformTexelBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var shaderStorageTexelBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var shaderUniformBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var shaderSampledImageArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var shaderStorageBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var shaderStorageImageArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var shaderInputAttachmentArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var shaderUniformTexelBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var shaderStorageTexelBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var descriptorBindingUniformBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var descriptorBindingSampledImageUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var descriptorBindingStorageImageUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var descriptorBindingStorageBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var descriptorBindingUniformTexelBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var descriptorBindingStorageTexelBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var descriptorBindingUpdateUnusedWhilePending: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var descriptorBindingPartiallyBound: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var descriptorBindingVariableDescriptorCount: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var runtimeDescriptorArray: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)


}



/**
 * Struct calloc function for [PhysicalDeviceDescriptorIndexingFeatures].
 */
inline fun Allocator.PhysicalDeviceDescriptorIndexingFeatures(block: (PhysicalDeviceDescriptorIndexingFeatures) -> Unit) = PhysicalDeviceDescriptorIndexingFeatures(calloc(96)).apply(block).also { it.sType = 1000161001 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceDescriptorIndexingProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxUpdateAfterBindDescriptorsInAllPools
 *         VkBool32         shaderUniformBufferArrayNonUniformIndexingNative
 *         VkBool32         shaderSampledImageArrayNonUniformIndexingNative
 *         VkBool32         shaderStorageBufferArrayNonUniformIndexingNative
 *         VkBool32         shaderStorageImageArrayNonUniformIndexingNative
 *         VkBool32         shaderInputAttachmentArrayNonUniformIndexingNative
 *         VkBool32         robustBufferAccessUpdateAfterBind
 *         VkBool32         quadDivergentImplicitLod
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindSamplers
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindUniformBuffers
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindStorageBuffers
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindSampledImages
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindStorageImages
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindInputAttachments
 *         uint32_t         maxPerStageUpdateAfterBindResources
 *         uint32_t         maxDescriptorSetUpdateAfterBindSamplers
 *         uint32_t         maxDescriptorSetUpdateAfterBindUniformBuffers
 *         uint32_t         maxDescriptorSetUpdateAfterBindUniformBuffersDynamic
 *         uint32_t         maxDescriptorSetUpdateAfterBindStorageBuffers
 *         uint32_t         maxDescriptorSetUpdateAfterBindStorageBuffersDynamic
 *         uint32_t         maxDescriptorSetUpdateAfterBindSampledImages
 *         uint32_t         maxDescriptorSetUpdateAfterBindStorageImages
 *         uint32_t         maxDescriptorSetUpdateAfterBindInputAttachments
 *     }
 */
@JvmInline
value class PhysicalDeviceDescriptorIndexingProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxUpdateAfterBindDescriptorsInAllPools: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var shaderUniformBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var shaderSampledImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var shaderStorageBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var shaderStorageImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var shaderInputAttachmentArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var robustBufferAccessUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var quadDivergentImplicitLod: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var maxPerStageDescriptorUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var maxPerStageDescriptorUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var maxPerStageDescriptorUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var maxPerStageDescriptorUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var maxPerStageDescriptorUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var maxPerStageDescriptorUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var maxPerStageUpdateAfterBindResources: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var maxDescriptorSetUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var maxDescriptorSetUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var maxDescriptorSetUpdateAfterBindUniformBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var maxDescriptorSetUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var maxDescriptorSetUpdateAfterBindStorageBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var maxDescriptorSetUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var maxDescriptorSetUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + 100)
		set(value) = Unsafe.setInt(address + 100, value)
	
	var maxDescriptorSetUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + 104)
		set(value) = Unsafe.setInt(address + 104, value)


}



/**
 * Struct calloc function for [PhysicalDeviceDescriptorIndexingProperties].
 */
inline fun Allocator.PhysicalDeviceDescriptorIndexingProperties(block: (PhysicalDeviceDescriptorIndexingProperties) -> Unit) = PhysicalDeviceDescriptorIndexingProperties(calloc(112)).apply(block).also { it.sType = 1000161002 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkDescriptorSetVariableDescriptorCountAllocateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         descriptorSetCount
 *         uint32_t*        pDescriptorCounts
 *     }
 */
@JvmInline
value class DescriptorSetVariableDescriptorCountAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var descriptorSetCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pDescriptorCounts: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var descriptorCounts: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), descriptorSetCount)
		set(value) { Unsafe.setLong(address + 24, value.address); descriptorSetCount = value.capacity }


}



/**
 * Struct calloc function for [DescriptorSetVariableDescriptorCountAllocateInfo].
 */
inline fun Allocator.DescriptorSetVariableDescriptorCountAllocateInfo(block: (DescriptorSetVariableDescriptorCountAllocateInfo) -> Unit) = DescriptorSetVariableDescriptorCountAllocateInfo(calloc(32)).apply(block).also { it.sType = 1000161003 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkDescriptorSetVariableDescriptorCountLayoutSupport {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxVariableDescriptorCount
 *     }
 */
@JvmInline
value class DescriptorSetVariableDescriptorCountLayoutSupport(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxVariableDescriptorCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [DescriptorSetVariableDescriptorCountLayoutSupport].
 */
inline fun Allocator.DescriptorSetVariableDescriptorCountLayoutSupport(block: (DescriptorSetVariableDescriptorCountLayoutSupport) -> Unit) = DescriptorSetVariableDescriptorCountLayoutSupport(calloc(24)).apply(block).also { it.sType = 1000161004 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkSubpassDescriptionDepthStencilResolve {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkResolveModeFlagBits    depthResolveMode
 *         VkResolveModeFlagBits    stencilResolveMode
 *         VkAttachmentReference2*  pDepthStencilResolveAttachment
 *     }
 */
@JvmInline
value class SubpassDescriptionDepthStencilResolve(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var depthResolveMode: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stencilResolveMode: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var pDepthStencilResolveAttachment: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var depthStencilResolveAttachment: AttachmentReference2
		get()      = AttachmentReference2(Unsafe.getLong(address + 24))
		set(value) { Unsafe.setLong(address + 24, value.address) }


}



/**
 * Struct calloc function for [SubpassDescriptionDepthStencilResolve].
 */
inline fun Allocator.SubpassDescriptionDepthStencilResolve(block: (SubpassDescriptionDepthStencilResolve) -> Unit) = SubpassDescriptionDepthStencilResolve(calloc(32)).apply(block).also { it.sType = 1000199001 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceDepthStencilResolveProperties {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkResolveModeFlags  supportedDepthResolveModes
 *         VkResolveModeFlags  supportedStencilResolveModes
 *         VkBool32            independentResolveNone
 *         VkBool32            independentResolve
 *     }
 */
@JvmInline
value class PhysicalDeviceDepthStencilResolveProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var supportedDepthResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var supportedStencilResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var independentResolveNone: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var independentResolve: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)


}



/**
 * Struct calloc function for [PhysicalDeviceDepthStencilResolveProperties].
 */
inline fun Allocator.PhysicalDeviceDepthStencilResolveProperties(block: (PhysicalDeviceDepthStencilResolveProperties) -> Unit) = PhysicalDeviceDepthStencilResolveProperties(calloc(32)).apply(block).also { it.sType = 1000199000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceScalarBlockLayoutFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         scalarBlockLayout
 *     }
 */
@JvmInline
value class PhysicalDeviceScalarBlockLayoutFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var scalarBlockLayout: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceScalarBlockLayoutFeatures].
 */
inline fun Allocator.PhysicalDeviceScalarBlockLayoutFeatures(block: (PhysicalDeviceScalarBlockLayoutFeatures) -> Unit) = PhysicalDeviceScalarBlockLayoutFeatures(calloc(24)).apply(block).also { it.sType = 1000221000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkImageStencilUsageCreateInfo {
 *         VkStructureType    sType
 *         void*              pNext (must be null)
 *         VkImageUsageFlags  stencilUsage
 *     }
 */
@JvmInline
value class ImageStencilUsageCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var stencilUsage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [ImageStencilUsageCreateInfo].
 */
inline fun Allocator.ImageStencilUsageCreateInfo(block: (ImageStencilUsageCreateInfo) -> Unit) = ImageStencilUsageCreateInfo(calloc(24)).apply(block).also { it.sType = 1000246000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkSamplerReductionModeCreateInfo {
 *         VkStructureType         sType
 *         void*                   pNext (must be null)
 *         VkSamplerReductionMode  reductionMode
 *     }
 */
@JvmInline
value class SamplerReductionModeCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var reductionMode: SamplerReductionMode
		get()      = _SamplerReductionMode(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [SamplerReductionModeCreateInfo].
 */
inline fun Allocator.SamplerReductionModeCreateInfo(block: (SamplerReductionModeCreateInfo) -> Unit) = SamplerReductionModeCreateInfo(calloc(24)).apply(block).also { it.sType = 1000130001 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceSamplerFilterMinmaxProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         filterMinmaxSingleComponentFormats
 *         VkBool32         filterMinmaxImageComponentMapping
 *     }
 */
@JvmInline
value class PhysicalDeviceSamplerFilterMinmaxProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var filterMinmaxSingleComponentFormats: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var filterMinmaxImageComponentMapping: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 * Struct calloc function for [PhysicalDeviceSamplerFilterMinmaxProperties].
 */
inline fun Allocator.PhysicalDeviceSamplerFilterMinmaxProperties(block: (PhysicalDeviceSamplerFilterMinmaxProperties) -> Unit) = PhysicalDeviceSamplerFilterMinmaxProperties(calloc(24)).apply(block).also { it.sType = 1000130000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceVulkanMemoryModelFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         vulkanMemoryModel
 *         VkBool32         vulkanMemoryModelDeviceScope
 *         VkBool32         vulkanMemoryModelAvailabilityVisibilityChains
 *     }
 */
@JvmInline
value class PhysicalDeviceVulkanMemoryModelFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var vulkanMemoryModel: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var vulkanMemoryModelDeviceScope: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var vulkanMemoryModelAvailabilityVisibilityChains: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}



/**
 * Struct calloc function for [PhysicalDeviceVulkanMemoryModelFeatures].
 */
inline fun Allocator.PhysicalDeviceVulkanMemoryModelFeatures(block: (PhysicalDeviceVulkanMemoryModelFeatures) -> Unit) = PhysicalDeviceVulkanMemoryModelFeatures(calloc(32)).apply(block).also { it.sType = 1000211000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceImagelessFramebufferFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         imagelessFramebuffer
 *     }
 */
@JvmInline
value class PhysicalDeviceImagelessFramebufferFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var imagelessFramebuffer: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceImagelessFramebufferFeatures].
 */
inline fun Allocator.PhysicalDeviceImagelessFramebufferFeatures(block: (PhysicalDeviceImagelessFramebufferFeatures) -> Unit) = PhysicalDeviceImagelessFramebufferFeatures(calloc(24)).apply(block).also { it.sType = 1000108000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkFramebufferAttachmentsCreateInfo {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         uint32_t                           attachmentImageInfoCount
 *         VkFramebufferAttachmentImageInfo*  pAttachmentImageInfos
 *     }
 */
@JvmInline
value class FramebufferAttachmentsCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var attachmentImageInfoCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pAttachmentImageInfos: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var attachmentImageInfos: FramebufferAttachmentImageInfo.Buffer
		get()      = FramebufferAttachmentImageInfo.Buffer(Unsafe.getLong(address + 24), attachmentImageInfoCount)
		set(value) { Unsafe.setLong(address + 24, value.address); attachmentImageInfoCount = value.capacity }


}



/**
 * Struct calloc function for [FramebufferAttachmentsCreateInfo].
 */
inline fun Allocator.FramebufferAttachmentsCreateInfo(block: (FramebufferAttachmentsCreateInfo) -> Unit) = FramebufferAttachmentsCreateInfo(calloc(32)).apply(block).also { it.sType = 1000108001 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkFramebufferAttachmentImageInfo {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkImageCreateFlags  flags
 *         VkImageUsageFlags   usage
 *         uint32_t            width
 *         uint32_t            height
 *         uint32_t            layerCount
 *         uint32_t            viewFormatCount
 *         VkFormat*           pViewFormats
 *     }
 */
@JvmInline
value class FramebufferAttachmentImageInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: ImageCreateFlags
		get()      = ImageCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var usage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var width: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var height: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var layerCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var viewFormatCount: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var pViewFormats: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var viewFormats: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 40), viewFormatCount)
		set(value) { Unsafe.setLong(address + 40, value.address); viewFormatCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = FramebufferAttachmentImageInfo(offset(index))
		
		operator fun set(index: Int, value: FramebufferAttachmentImageInfo) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (FramebufferAttachmentImageInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (FramebufferAttachmentImageInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, FramebufferAttachmentImageInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [FramebufferAttachmentImageInfo].
 */
inline fun Allocator.FramebufferAttachmentImageInfo(block: (FramebufferAttachmentImageInfo) -> Unit) = FramebufferAttachmentImageInfo(calloc(48)).apply(block).also { it.sType = 1000108002 }



/**
 * Struct buffer calloc function for [FramebufferAttachmentImageInfo].
 */
inline fun Allocator.FramebufferAttachmentImageInfo(capacity: Int, block: (FramebufferAttachmentImageInfo.Buffer) -> Unit) = FramebufferAttachmentImageInfo.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000108002 } }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkRenderPassAttachmentBeginInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         attachmentCount
 *         VkImageView*     pAttachments
 *     }
 */
@JvmInline
value class RenderPassAttachmentBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var attachmentCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pAttachments: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var attachments: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), attachmentCount)
		set(value) { Unsafe.setLong(address + 24, value.address); attachmentCount = value.capacity }


}



/**
 * Struct calloc function for [RenderPassAttachmentBeginInfo].
 */
inline fun Allocator.RenderPassAttachmentBeginInfo(block: (RenderPassAttachmentBeginInfo) -> Unit) = RenderPassAttachmentBeginInfo(calloc(32)).apply(block).also { it.sType = 1000108003 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceUniformBufferStandardLayoutFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         uniformBufferStandardLayout
 *     }
 */
@JvmInline
value class PhysicalDeviceUniformBufferStandardLayoutFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var uniformBufferStandardLayout: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceUniformBufferStandardLayoutFeatures].
 */
inline fun Allocator.PhysicalDeviceUniformBufferStandardLayoutFeatures(block: (PhysicalDeviceUniformBufferStandardLayoutFeatures) -> Unit) = PhysicalDeviceUniformBufferStandardLayoutFeatures(calloc(24)).apply(block).also { it.sType = 1000253000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderSubgroupExtendedTypes
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderSubgroupExtendedTypesFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderSubgroupExtendedTypes: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceShaderSubgroupExtendedTypesFeatures].
 */
inline fun Allocator.PhysicalDeviceShaderSubgroupExtendedTypesFeatures(block: (PhysicalDeviceShaderSubgroupExtendedTypesFeatures) -> Unit) = PhysicalDeviceShaderSubgroupExtendedTypesFeatures(calloc(24)).apply(block).also { it.sType = 1000175000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         separateDepthStencilLayouts
 *     }
 */
@JvmInline
value class PhysicalDeviceSeparateDepthStencilLayoutsFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var separateDepthStencilLayouts: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceSeparateDepthStencilLayoutsFeatures].
 */
inline fun Allocator.PhysicalDeviceSeparateDepthStencilLayoutsFeatures(block: (PhysicalDeviceSeparateDepthStencilLayoutsFeatures) -> Unit) = PhysicalDeviceSeparateDepthStencilLayoutsFeatures(calloc(24)).apply(block).also { it.sType = 1000241000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkAttachmentReferenceStencilLayout {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkImageLayout    stencilLayout
 *     }
 */
@JvmInline
value class AttachmentReferenceStencilLayout(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var stencilLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 * Struct calloc function for [AttachmentReferenceStencilLayout].
 */
inline fun Allocator.AttachmentReferenceStencilLayout(block: (AttachmentReferenceStencilLayout) -> Unit) = AttachmentReferenceStencilLayout(calloc(24)).apply(block).also { it.sType = 1000241001 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkAttachmentDescriptionStencilLayout {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkImageLayout    stencilInitialLayout
 *         VkImageLayout    stencilFinalLayout
 *     }
 */
@JvmInline
value class AttachmentDescriptionStencilLayout(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var stencilInitialLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stencilFinalLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)


}



/**
 * Struct calloc function for [AttachmentDescriptionStencilLayout].
 */
inline fun Allocator.AttachmentDescriptionStencilLayout(block: (AttachmentDescriptionStencilLayout) -> Unit) = AttachmentDescriptionStencilLayout(calloc(24)).apply(block).also { it.sType = 1000241002 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceHostQueryResetFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         hostQueryReset
 *     }
 */
@JvmInline
value class PhysicalDeviceHostQueryResetFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var hostQueryReset: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceHostQueryResetFeatures].
 */
inline fun Allocator.PhysicalDeviceHostQueryResetFeatures(block: (PhysicalDeviceHostQueryResetFeatures) -> Unit) = PhysicalDeviceHostQueryResetFeatures(calloc(24)).apply(block).also { it.sType = 1000261000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceTimelineSemaphoreFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         timelineSemaphore
 *     }
 */
@JvmInline
value class PhysicalDeviceTimelineSemaphoreFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var timelineSemaphore: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceTimelineSemaphoreFeatures].
 */
inline fun Allocator.PhysicalDeviceTimelineSemaphoreFeatures(block: (PhysicalDeviceTimelineSemaphoreFeatures) -> Unit) = PhysicalDeviceTimelineSemaphoreFeatures(calloc(24)).apply(block).also { it.sType = 1000207000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceTimelineSemaphoreProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint64_t         maxTimelineSemaphoreValueDifference
 *     }
 */
@JvmInline
value class PhysicalDeviceTimelineSemaphoreProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxTimelineSemaphoreValueDifference: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceTimelineSemaphoreProperties].
 */
inline fun Allocator.PhysicalDeviceTimelineSemaphoreProperties(block: (PhysicalDeviceTimelineSemaphoreProperties) -> Unit) = PhysicalDeviceTimelineSemaphoreProperties(calloc(24)).apply(block).also { it.sType = 1000207001 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkSemaphoreTypeCreateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkSemaphoreType  semaphoreType
 *         uint64_t         initialValue
 *     }
 */
@JvmInline
value class SemaphoreTypeCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var semaphoreType: SemaphoreType
		get()      = _SemaphoreType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var initialValue: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}



/**
 * Struct calloc function for [SemaphoreTypeCreateInfo].
 */
inline fun Allocator.SemaphoreTypeCreateInfo(block: (SemaphoreTypeCreateInfo) -> Unit) = SemaphoreTypeCreateInfo(calloc(32)).apply(block).also { it.sType = 1000207002 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkTimelineSemaphoreSubmitInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         waitSemaphoreValueCount
 *         uint64_t*        pWaitSemaphoreValues
 *         uint32_t         signalSemaphoreValueCount
 *         uint64_t*        pSignalSemaphoreValues
 *     }
 */
@JvmInline
value class TimelineSemaphoreSubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var waitSemaphoreValueCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pWaitSemaphoreValues: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var signalSemaphoreValueCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pSignalSemaphoreValues: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var waitSemaphoreValues: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), waitSemaphoreValueCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreValueCount = value.capacity }
	
	var signalSemaphoreValues: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), signalSemaphoreValueCount)
		set(value) { Unsafe.setLong(address + 40, value.address); signalSemaphoreValueCount = value.capacity }


}



/**
 * Struct calloc function for [TimelineSemaphoreSubmitInfo].
 */
inline fun Allocator.TimelineSemaphoreSubmitInfo(block: (TimelineSemaphoreSubmitInfo) -> Unit) = TimelineSemaphoreSubmitInfo(calloc(48)).apply(block).also { it.sType = 1000207003 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkSemaphoreWaitInfo {
 *         VkStructureType       sType
 *         void*                 pNext (must be null)
 *         VkSemaphoreWaitFlags  flags
 *         uint32_t              semaphoreCount
 *         VkSemaphore*          pSemaphores
 *         uint64_t*             pValues
 *     }
 */
@JvmInline
value class SemaphoreWaitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: SemaphoreWaitFlags
		get()      = SemaphoreWaitFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var semaphoreCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pSemaphores: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pValues: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var semaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), semaphoreCount)
		set(value) { Unsafe.setLong(address + 24, value.address); semaphoreCount = value.capacity }
	
	var values: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 32), semaphoreCount)
		set(value) { Unsafe.setLong(address + 32, value.address); semaphoreCount = value.capacity }


}



/**
 * Struct calloc function for [SemaphoreWaitInfo].
 */
inline fun Allocator.SemaphoreWaitInfo(block: (SemaphoreWaitInfo) -> Unit) = SemaphoreWaitInfo(calloc(40)).apply(block).also { it.sType = 1000207004 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkSemaphoreSignalInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkSemaphore      semaphore
 *         uint64_t         value
 *     }
 */
@JvmInline
value class SemaphoreSignalInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var semaphore: SemaphoreH
		get()      = SemaphoreH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var value: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}



/**
 * Struct calloc function for [SemaphoreSignalInfo].
 */
inline fun Allocator.SemaphoreSignalInfo(block: (SemaphoreSignalInfo) -> Unit) = SemaphoreSignalInfo(calloc(32)).apply(block).also { it.sType = 1000207005 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkPhysicalDeviceBufferDeviceAddressFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         bufferDeviceAddress
 *         VkBool32         bufferDeviceAddressCaptureReplay
 *         VkBool32         bufferDeviceAddressMultiDevice
 *     }
 */
@JvmInline
value class PhysicalDeviceBufferDeviceAddressFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var bufferDeviceAddress: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var bufferDeviceAddressCaptureReplay: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var bufferDeviceAddressMultiDevice: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}



/**
 * Struct calloc function for [PhysicalDeviceBufferDeviceAddressFeatures].
 */
inline fun Allocator.PhysicalDeviceBufferDeviceAddressFeatures(block: (PhysicalDeviceBufferDeviceAddressFeatures) -> Unit) = PhysicalDeviceBufferDeviceAddressFeatures(calloc(32)).apply(block).also { it.sType = 1000257000 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkBufferDeviceAddressInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBuffer         buffer
 *     }
 */
@JvmInline
value class BufferDeviceAddressInfo(override val address: Long) : Addressable {
	
	
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
 * Struct calloc function for [BufferDeviceAddressInfo].
 */
inline fun Allocator.BufferDeviceAddressInfo(block: (BufferDeviceAddressInfo) -> Unit) = BufferDeviceAddressInfo(calloc(24)).apply(block).also { it.sType = 1000244001 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkBufferOpaqueCaptureAddressCreateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint64_t         opaqueCaptureAddress
 *     }
 */
@JvmInline
value class BufferOpaqueCaptureAddressCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var opaqueCaptureAddress: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)


}



/**
 * Struct calloc function for [BufferOpaqueCaptureAddressCreateInfo].
 */
inline fun Allocator.BufferOpaqueCaptureAddressCreateInfo(block: (BufferOpaqueCaptureAddressCreateInfo) -> Unit) = BufferOpaqueCaptureAddressCreateInfo(calloc(24)).apply(block).also { it.sType = 1000257002 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkMemoryOpaqueCaptureAddressAllocateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint64_t         opaqueCaptureAddress
 *     }
 */
@JvmInline
value class MemoryOpaqueCaptureAddressAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var opaqueCaptureAddress: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)


}



/**
 * Struct calloc function for [MemoryOpaqueCaptureAddressAllocateInfo].
 */
inline fun Allocator.MemoryOpaqueCaptureAddressAllocateInfo(block: (MemoryOpaqueCaptureAddressAllocateInfo) -> Unit) = MemoryOpaqueCaptureAddressAllocateInfo(calloc(24)).apply(block).also { it.sType = 1000257003 }



/**
 *     // provided by VK_VERSION_1_2
 *     struct VkDeviceMemoryOpaqueCaptureAddressInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceMemory   memory
 *     }
 */
@JvmInline
value class DeviceMemoryOpaqueCaptureAddressInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)


}



/**
 * Struct calloc function for [DeviceMemoryOpaqueCaptureAddressInfo].
 */
inline fun Allocator.DeviceMemoryOpaqueCaptureAddressInfo(block: (DeviceMemoryOpaqueCaptureAddressInfo) -> Unit) = DeviceMemoryOpaqueCaptureAddressInfo(calloc(24)).apply(block).also { it.sType = 1000257004 }