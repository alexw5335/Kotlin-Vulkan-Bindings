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
 *     struct VkCooperativeMatrixPropertiesNV {
 *         VkStructureType    sType
 *         void*              pNext (must be null)
 *         uint32_t           MSize
 *         uint32_t           NSize
 *         uint32_t           KSize
 *         VkComponentTypeNV  AType
 *         VkComponentTypeNV  BType
 *         VkComponentTypeNV  CType
 *         VkComponentTypeNV  DType
 *         VkScopeNV          scope
 *     }
 */
@JvmInline
value class CooperativeMatrixPropertiesNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var MSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var NSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var KSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var AType: ComponentType
		get()      = ComponentType(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.id) }
	
	var BType: ComponentType
		get()      = ComponentType(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	var CType: ComponentType
		get()      = ComponentType(Unsafe.getInt(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value.id) }
	
	var DType: ComponentType
		get()      = ComponentType(Unsafe.getInt(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value.id) }
	
	var scope: Scope
		get()      = Scope(Unsafe.getInt(address + LAYOUT.offsets[9]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value.id) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = CooperativeMatrixPropertiesNV(offset(index))
		
		operator fun set(index: Int, value: CooperativeMatrixPropertiesNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (CooperativeMatrixPropertiesNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CooperativeMatrixPropertiesNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "CooperativeMatrixPropertiesNV[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CooperativeMatrixPropertiesNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = CooperativeMatrixPropertiesNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COOPERATIVE_MATRIX_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = CooperativeMatrixPropertiesNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COOPERATIVE_MATRIX_PROPERTIES
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.COOPERATIVE_MATRIX_PROPERTIES }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.COOPERATIVE_MATRIX_PROPERTIES }
		}
	
	}


}