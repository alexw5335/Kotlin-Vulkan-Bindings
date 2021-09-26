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
 *     struct VkPhysicalDeviceGroupProperties {
 *         VkStructureType   sType
 *         void*             pNext (must be null)
 *         uint32_t          physicalDeviceCount
 *         VkPhysicalDevice  physicalDevices[32]
 *         VkBool32          subsetAllocation
 *     }
 */
@JvmInline
value class PhysicalDeviceGroupProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var physicalDeviceCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var physicalDevices: NativePointerBuffer
		get()      = NativePointerBuffer(address + LAYOUT.offsets[3], 32)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	var subsetAllocation: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = PhysicalDeviceGroupProperties(offset(index))
		
		operator fun set(index: Int, value: PhysicalDeviceGroupProperties) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (PhysicalDeviceGroupProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PhysicalDeviceGroupProperties) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "PhysicalDeviceGroupProperties[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val physicalDeviceCount: Int,
		val physicalDevices: List<PhysicalDeviceH>,
		val subsetAllocation: Int,
	) {
		override fun toString() = "PhysicalDeviceGroupProperties(" + 
			"sType=$sType, " +
			"physicalDeviceCount=$physicalDeviceCount, " +
			"physicalDevices=$physicalDevices, " +
			"subsetAllocation=$subsetAllocation)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		physicalDeviceCount, 
		physicalDevices.map { PhysicalDeviceH(it) }, 
		subsetAllocation, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			array(NativeSizes.POINTER, 32)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceGroupProperties(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceGroupProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_GROUP_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceGroupProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_GROUP_PROPERTIES
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PHYSICAL_DEVICE_GROUP_PROPERTIES }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PHYSICAL_DEVICE_GROUP_PROPERTIES }
		}
	
	}


}