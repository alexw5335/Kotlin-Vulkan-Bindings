// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_cooperative_matrix

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
value class CooperativeMatrixProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var MSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var NSize: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var KSize: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var AType: ComponentType
		get()      = _ComponentType(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var BType: ComponentType
		get()      = _ComponentType(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var CType: ComponentType
		get()      = _ComponentType(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var DType: ComponentType
		get()      = _ComponentType(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var scope: Scope
		get()      = _Scope(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = CooperativeMatrixProperties(offset(index))
		
		operator fun set(index: Int, value: CooperativeMatrixProperties) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (CooperativeMatrixProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CooperativeMatrixProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, CooperativeMatrixProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}