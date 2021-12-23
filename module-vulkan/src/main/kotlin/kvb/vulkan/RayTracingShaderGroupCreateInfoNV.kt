// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkRayTracingShaderGroupCreateInfoNV {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkRayTracingShaderGroupTypeKHR  type
 *         uint32_t                        generalShader
 *         uint32_t                        closestHitShader
 *         uint32_t                        anyHitShader
 *         uint32_t                        intersectionShader
 *     }
 */
@JvmInline
value class RayTracingShaderGroupCreateInfoNV(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var type: RayTracingShaderGroupType
		get()      = _RayTracingShaderGroupType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var generalShader: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var closestHitShader: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var anyHitShader: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var intersectionShader: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = RayTracingShaderGroupCreateInfoNV(offset(index))
		
		operator fun set(index: Int, value: RayTracingShaderGroupCreateInfoNV) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (RayTracingShaderGroupCreateInfoNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (RayTracingShaderGroupCreateInfoNV) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, RayTracingShaderGroupCreateInfoNV) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}