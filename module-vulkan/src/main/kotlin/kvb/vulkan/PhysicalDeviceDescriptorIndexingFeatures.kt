// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
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