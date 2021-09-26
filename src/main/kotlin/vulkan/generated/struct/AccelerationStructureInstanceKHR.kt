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
 *     struct VkAccelerationStructureInstanceKHR {
 *         VkTransformMatrixKHR        transform
 *         uint32_t                    instanceCustomIndex
 *         uint32_t                    mask
 *         uint32_t                    instanceShaderBindingTableRecordOffset
 *         VkGeometryInstanceFlagsKHR  flags
 *         uint64_t                    accelerationStructureReference
 *     }
 */
@JvmInline
value class AccelerationStructureInstanceKHR(override val address: Long) : Addressable {
	
	
	var transform: TransformMatrixKHR
		get()      = TransformMatrixKHR(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var instanceCustomIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var mask: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var instanceShaderBindingTableRecordOffset: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var flags: GeometryInstanceFlags
		get()      = GeometryInstanceFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	var accelerationStructureReference: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[5], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(TransformMatrixKHR.LAYOUT)
			member(4)
			member(4)
			member(4)
			member(4)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = AccelerationStructureInstanceKHR(0)
		
		fun malloc(allocator: Allocator) = AccelerationStructureInstanceKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = AccelerationStructureInstanceKHR(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}