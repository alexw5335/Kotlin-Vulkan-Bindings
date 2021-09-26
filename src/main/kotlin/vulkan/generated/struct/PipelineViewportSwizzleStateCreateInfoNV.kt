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
 *     struct VkPipelineViewportSwizzleStateCreateInfoNV {
 *         VkStructureType                              sType
 *         void*                                        pNext (must be null)
 *         VkPipelineViewportSwizzleStateCreateFlagsNV  flags (reserved, must be zero)
 *         uint32_t                                     viewportCount
 *         VkViewportSwizzleNV**                        pViewportSwizzles
 *     }
 */
@JvmInline
value class PipelineViewportSwizzleStateCreateInfoNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineViewportSwizzleStateCreateFlags
		get()      = PipelineViewportSwizzleStateCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var viewportCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pViewportSwizzles: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	
	
	var viewportSwizzles: ViewportSwizzleNV.Buffer
		get()      = ViewportSwizzleNV.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), viewportCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); viewportCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineViewportSwizzleStateCreateInfoNV(0)
		
		fun malloc(allocator: Allocator) = PipelineViewportSwizzleStateCreateInfoNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineViewportSwizzleStateCreateInfoNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO
		}
	
	}


}