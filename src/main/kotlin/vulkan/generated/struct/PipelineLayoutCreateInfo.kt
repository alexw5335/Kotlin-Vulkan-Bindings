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
 *     struct VkPipelineLayoutCreateInfo {
 *         VkStructureType              sType
 *         void*                        pNext (must be null)
 *         VkPipelineLayoutCreateFlags  flags (reserved, must be zero)
 *         uint32_t                     setLayoutCount
 *         VkDescriptorSetLayout**      pSetLayouts
 *         uint32_t                     pushConstantRangeCount
 *         VkPushConstantRange**        pPushConstantRanges
 *     }
 */
@JvmInline
value class PipelineLayoutCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineLayoutCreateFlags
		get()      = PipelineLayoutCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var setLayoutCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pSetLayouts: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var pushConstantRangeCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pPushConstantRanges: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	
	
	var setLayouts: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), setLayoutCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); setLayoutCount = value.capacity }
	
	var pushConstantRanges: PushConstantRange.Buffer
		get()      = PushConstantRange.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), pushConstantRangeCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); pushConstantRangeCount = value.capacity }
	
	
	
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineLayoutCreateInfo(0)
		
		fun malloc(allocator: Allocator) = PipelineLayoutCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_LAYOUT_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineLayoutCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_LAYOUT_CREATE_INFO
		}
	
	}


}