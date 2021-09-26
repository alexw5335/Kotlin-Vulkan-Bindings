// This file has been automatically generated.

package vulkan.generated.struct

import memory.NativeSizes
import memory.type.DirectBuffer
import memory.struct.LayoutBuilder
import memory.allocation.Allocator
import memory.Unsafe
import memory.type.Addressable

import vulkan.generated.enumeration.*
import memory.primitive.*
import vulkan.generated.handle.*

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
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var samplerMirrorClampToEdge: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var drawIndirectCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var storageBuffer8BitAccess: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var uniformAndStorageBuffer8BitAccess: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var storagePushConstant8: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var shaderBufferInt64Atomics: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var shaderSharedInt64Atomics: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var shaderFloat16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var shaderInt8: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var descriptorIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var shaderInputAttachmentArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var shaderUniformTexelBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var shaderStorageTexelBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	var shaderUniformBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value) }
	
	var shaderSampledImageArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value) }
	
	var shaderStorageBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[17])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[17], value) }
	
	var shaderStorageImageArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[18])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[18], value) }
	
	var shaderInputAttachmentArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[19])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[19], value) }
	
	var shaderUniformTexelBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[20])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[20], value) }
	
	var shaderStorageTexelBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[21])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[21], value) }
	
	var descriptorBindingUniformBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[22])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[22], value) }
	
	var descriptorBindingSampledImageUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[23])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[23], value) }
	
	var descriptorBindingStorageImageUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[24])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[24], value) }
	
	var descriptorBindingStorageBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[25])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[25], value) }
	
	var descriptorBindingUniformTexelBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[26])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[26], value) }
	
	var descriptorBindingStorageTexelBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[27])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[27], value) }
	
	var descriptorBindingUpdateUnusedWhilePending: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[28])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[28], value) }
	
	var descriptorBindingPartiallyBound: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[29])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[29], value) }
	
	var descriptorBindingVariableDescriptorCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[30])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[30], value) }
	
	var runtimeDescriptorArray: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[31])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[31], value) }
	
	var samplerFilterMinmax: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[32])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[32], value) }
	
	var scalarBlockLayout: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[33])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[33], value) }
	
	var imagelessFramebuffer: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[34])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[34], value) }
	
	var uniformBufferStandardLayout: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[35])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[35], value) }
	
	var shaderSubgroupExtendedTypes: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[36])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[36], value) }
	
	var separateDepthStencilLayouts: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[37])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[37], value) }
	
	var hostQueryReset: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[38])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[38], value) }
	
	var timelineSemaphore: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[39])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[39], value) }
	
	var bufferDeviceAddress: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[40])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[40], value) }
	
	var bufferDeviceAddressCaptureReplay: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[41])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[41], value) }
	
	var bufferDeviceAddressMultiDevice: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[42])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[42], value) }
	
	var vulkanMemoryModel: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[43])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[43], value) }
	
	var vulkanMemoryModelDeviceScope: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[44])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[44], value) }
	
	var vulkanMemoryModelAvailabilityVisibilityChains: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[45])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[45], value) }
	
	var shaderOutputViewportIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[46])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[46], value) }
	
	var shaderOutputLayer: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[47])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[47], value) }
	
	var subgroupBroadcastDynamicId: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[48])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[48], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceVulkan12Features(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceVulkan12Features(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_VULKAN_1_2_FEATURES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceVulkan12Features(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_VULKAN_1_2_FEATURES
		}
	
	}


}