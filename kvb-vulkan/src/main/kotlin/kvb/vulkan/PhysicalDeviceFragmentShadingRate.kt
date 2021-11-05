// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceFragmentShadingRateKHR {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkSampleCountFlags  sampleCounts
 *         VkExtent2D          fragmentSize
 *     }
 */
@JvmInline
value class PhysicalDeviceFragmentShadingRate(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var sampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var fragmentSize: Extent2D
		get()      = Extent2D(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 8)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 32
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PhysicalDeviceFragmentShadingRate(offset(index))
		
		operator fun set(index: Int, value: PhysicalDeviceFragmentShadingRate) = Unsafe.copy(value.address, offset(index), 32)
		
		inline fun forEach(block: (PhysicalDeviceFragmentShadingRate) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PhysicalDeviceFragmentShadingRate) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PhysicalDeviceFragmentShadingRate) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}