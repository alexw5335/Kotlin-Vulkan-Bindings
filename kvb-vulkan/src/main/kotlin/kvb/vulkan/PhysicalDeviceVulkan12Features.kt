// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
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