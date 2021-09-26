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
 *     struct VkPhysicalDeviceInlineUniformBlockPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxInlineUniformBlockSize
 *         uint32_t         maxPerStageDescriptorInlineUniformBlocks
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks
 *         uint32_t         maxDescriptorSetInlineUniformBlocks
 *         uint32_t         maxDescriptorSetUpdateAfterBindInlineUniformBlocks
 *     }
 */
@JvmInline
value class PhysicalDeviceInlineUniformBlockPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var maxInlineUniformBlockSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var maxPerStageDescriptorInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var maxDescriptorSetInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var maxDescriptorSetUpdateAfterBindInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val maxInlineUniformBlockSize: Int,
		val maxPerStageDescriptorInlineUniformBlocks: Int,
		val maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks: Int,
		val maxDescriptorSetInlineUniformBlocks: Int,
		val maxDescriptorSetUpdateAfterBindInlineUniformBlocks: Int,
	) {
		override fun toString() = "PhysicalDeviceInlineUniformBlockPropertiesEXT(" + 
			"sType=$sType, " +
			"maxInlineUniformBlockSize=$maxInlineUniformBlockSize, " +
			"maxPerStageDescriptorInlineUniformBlocks=$maxPerStageDescriptorInlineUniformBlocks, " +
			"maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks=$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, " +
			"maxDescriptorSetInlineUniformBlocks=$maxDescriptorSetInlineUniformBlocks, " +
			"maxDescriptorSetUpdateAfterBindInlineUniformBlocks=$maxDescriptorSetUpdateAfterBindInlineUniformBlocks)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		maxInlineUniformBlockSize, 
		maxPerStageDescriptorInlineUniformBlocks, 
		maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, 
		maxDescriptorSetInlineUniformBlocks, 
		maxDescriptorSetUpdateAfterBindInlineUniformBlocks, 
	)
	
	
	
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceInlineUniformBlockPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceInlineUniformBlockPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceInlineUniformBlockPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES
		}
	
	}


}