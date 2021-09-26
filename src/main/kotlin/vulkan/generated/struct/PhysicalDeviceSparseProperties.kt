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
 *     struct VkPhysicalDeviceSparseProperties {
 *         VkBool32  residencyStandard2DBlockShape
 *         VkBool32  residencyStandard2DMultisampleBlockShape
 *         VkBool32  residencyStandard3DBlockShape
 *         VkBool32  residencyAlignedMipSize
 *         VkBool32  residencyNonResidentStrict
 *     }
 */
@JvmInline
value class PhysicalDeviceSparseProperties(override val address: Long) : Addressable {
	
	
	var residencyStandard2DBlockShape: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var residencyStandard2DMultisampleBlockShape: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var residencyStandard3DBlockShape: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var residencyAlignedMipSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var residencyNonResidentStrict: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	
	
	class Persistent(
		val residencyStandard2DBlockShape: Int,
		val residencyStandard2DMultisampleBlockShape: Int,
		val residencyStandard3DBlockShape: Int,
		val residencyAlignedMipSize: Int,
		val residencyNonResidentStrict: Int,
	) {
		override fun toString() = "PhysicalDeviceSparseProperties(" + 
			"residencyStandard2DBlockShape=$residencyStandard2DBlockShape, " +
			"residencyStandard2DMultisampleBlockShape=$residencyStandard2DMultisampleBlockShape, " +
			"residencyStandard3DBlockShape=$residencyStandard3DBlockShape, " +
			"residencyAlignedMipSize=$residencyAlignedMipSize, " +
			"residencyNonResidentStrict=$residencyNonResidentStrict)"
	}
	
	
	
	val asPersistent get() = Persistent(
		residencyStandard2DBlockShape, 
		residencyStandard2DMultisampleBlockShape, 
		residencyStandard3DBlockShape, 
		residencyAlignedMipSize, 
		residencyNonResidentStrict, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceSparseProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceSparseProperties(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PhysicalDeviceSparseProperties(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}