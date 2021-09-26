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
 *     struct VkHdrMetadataEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkXYColorEXT     displayPrimaryRed
 *         VkXYColorEXT     displayPrimaryGreen
 *         VkXYColorEXT     displayPrimaryBlue
 *         VkXYColorEXT     whitePoint
 *         float            maxLuminance
 *         float            minLuminance
 *         float            maxContentLightLevel
 *         float            maxFrameAverageLightLevel
 *     }
 */
@JvmInline
value class HdrMetadataEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var displayPrimaryRed: XYColorEXT
		get()      = XYColorEXT(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var displayPrimaryGreen: XYColorEXT
		get()      = XYColorEXT(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var displayPrimaryBlue: XYColorEXT
		get()      = XYColorEXT(address + LAYOUT.offsets[4])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.structSize) }
	
	var whitePoint: XYColorEXT
		get()      = XYColorEXT(address + LAYOUT.offsets[5])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.structSize) }
	
	var maxLuminance: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[6], value) }
	
	var minLuminance: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[7], value) }
	
	var maxContentLightLevel: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[8], value) }
	
	var maxFrameAverageLightLevel: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[9], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = HdrMetadataEXT(offset(index))
		
		operator fun set(index: Int, value: HdrMetadataEXT) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (HdrMetadataEXT) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (HdrMetadataEXT) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "HdrMetadataEXT[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(XYColorEXT.LAYOUT)
			member(XYColorEXT.LAYOUT)
			member(XYColorEXT.LAYOUT)
			member(XYColorEXT.LAYOUT)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = HdrMetadataEXT(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = HdrMetadataEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.HDR_METADATA
		}
		
		fun calloc(allocator: Allocator) = HdrMetadataEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.HDR_METADATA
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.HDR_METADATA }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.HDR_METADATA }
		}
	
	}


}