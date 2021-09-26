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
 *     struct VkPhysicalDeviceFragmentShadingRateKHR {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkSampleCountFlags  sampleCounts
 *         VkExtent2D          fragmentSize
 *     }
 */
@JvmInline
value class PhysicalDeviceFragmentShadingRateKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var sampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var fragmentSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = PhysicalDeviceFragmentShadingRateKHR(offset(index))
		
		operator fun set(index: Int, value: PhysicalDeviceFragmentShadingRateKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (PhysicalDeviceFragmentShadingRateKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PhysicalDeviceFragmentShadingRateKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "PhysicalDeviceFragmentShadingRateKHR[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val sampleCounts: SampleCountFlags,
		val fragmentSize: Extent2D.Persistent,
	) {
		override fun toString() = "PhysicalDeviceFragmentShadingRateKHR(" + 
			"sType=$sType, " +
			"sampleCounts=$sampleCounts, " +
			"fragmentSize=$fragmentSize)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		sampleCounts, 
		fragmentSize.asPersistent, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(Extent2D.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceFragmentShadingRateKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceFragmentShadingRateKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceFragmentShadingRateKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE }
		}
	
	}


}