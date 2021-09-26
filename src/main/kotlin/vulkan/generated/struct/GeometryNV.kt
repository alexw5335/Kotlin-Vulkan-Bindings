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
 *     struct VkGeometryNV {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkGeometryTypeKHR   geometryType
 *         VkGeometryDataNV    geometry
 *         VkGeometryFlagsKHR  flags
 *     }
 */
@JvmInline
value class GeometryNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var geometryType: GeometryType
		get()      = GeometryType(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var geometry: GeometryDataNV
		get()      = GeometryDataNV(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var flags: GeometryFlags
		get()      = GeometryFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = GeometryNV(offset(index))
		
		operator fun set(index: Int, value: GeometryNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (GeometryNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (GeometryNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "GeometryNV[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(GeometryDataNV.LAYOUT)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = GeometryNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = GeometryNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GEOMETRY
		}
		
		fun calloc(allocator: Allocator) = GeometryNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GEOMETRY
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.GEOMETRY }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.GEOMETRY }
		}
	
	}


}