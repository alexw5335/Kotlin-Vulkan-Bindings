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
 *     struct VkDescriptorUpdateTemplateCreateInfo {
 *         VkStructureType                        sType
 *         void*                                  pNext (must be null)
 *         VkDescriptorUpdateTemplateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                               descriptorUpdateEntryCount
 *         VkDescriptorUpdateTemplateEntry**      pDescriptorUpdateEntries
 *         VkDescriptorUpdateTemplateType         templateType
 *         VkDescriptorSetLayout                  descriptorSetLayout
 *         VkPipelineBindPoint                    pipelineBindPoint
 *         VkPipelineLayout                       pipelineLayout
 *         uint32_t                               set
 *     }
 */
@JvmInline
value class DescriptorUpdateTemplateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: DescriptorUpdateTemplateCreateFlags
		get()      = DescriptorUpdateTemplateCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var descriptorUpdateEntryCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pDescriptorUpdateEntries: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var templateType: DescriptorUpdateTemplateType
		get()      = DescriptorUpdateTemplateType(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.id) }
	
	var descriptorSetLayout: DescriptorSetLayoutH
		get()      = DescriptorSetLayoutH(Unsafe.getNativePointer(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address) }
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = PipelineBindPoint(Unsafe.getInt(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value.id) }
	
	var pipelineLayout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getNativePointer(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address) }
	
	var set: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	
	
	var descriptorUpdateEntries: DescriptorUpdateTemplateEntry.Buffer
		get()      = DescriptorUpdateTemplateEntry.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), descriptorUpdateEntryCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); descriptorUpdateEntryCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DescriptorUpdateTemplateCreateInfo(0)
		
		fun malloc(allocator: Allocator) = DescriptorUpdateTemplateCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = DescriptorUpdateTemplateCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO
		}
	
	}


}