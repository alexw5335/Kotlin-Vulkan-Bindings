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
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var shaderInputAttachmentArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var shaderUniformTexelBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var shaderStorageTexelBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var shaderUniformBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var shaderSampledImageArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var shaderStorageBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var shaderStorageImageArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var shaderInputAttachmentArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var shaderUniformTexelBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var shaderStorageTexelBufferArrayNonUniformIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var descriptorBindingUniformBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var descriptorBindingSampledImageUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var descriptorBindingStorageImageUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	var descriptorBindingStorageBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value) }
	
	var descriptorBindingUniformTexelBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value) }
	
	var descriptorBindingStorageTexelBufferUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[17])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[17], value) }
	
	var descriptorBindingUpdateUnusedWhilePending: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[18])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[18], value) }
	
	var descriptorBindingPartiallyBound: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[19])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[19], value) }
	
	var descriptorBindingVariableDescriptorCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[20])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[20], value) }
	
	var runtimeDescriptorArray: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[21])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[21], value) }
	
	
	
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceDescriptorIndexingFeatures(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceDescriptorIndexingFeatures(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceDescriptorIndexingFeatures(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES
		}
	
	}


}