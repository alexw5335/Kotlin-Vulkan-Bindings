// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer

/**
 *     struct VkIndirectCommandsLayoutTokenNV {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         VkIndirectCommandsTokenTypeNV  tokenType
 *         uint32_t                       stream
 *         uint32_t                       offset
 *         uint32_t                       vertexBindingUnit
 *         VkBool32                       vertexDynamicStride
 *         VkPipelineLayout               pushconstantPipelineLayout
 *         VkShaderStageFlags             pushconstantShaderStageFlags
 *         uint32_t                       pushconstantOffset
 *         uint32_t                       pushconstantSize
 *         VkIndirectStateFlagsNV         indirectStateFlags
 *         uint32_t                       indexTypeCount
 *         VkIndexType*                   pIndexTypes
 *         uint32_t*                      pIndexTypeValues
 *     }
 */
@JvmInline
value class IndirectCommandsLayoutToken(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var tokenType: IndirectCommandsTokenType
		get()      = _IndirectCommandsTokenType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stream: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var offset: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var vertexBindingUnit: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var vertexDynamicStride: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pushconstantPipelineLayout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)
	
	var pushconstantShaderStageFlags: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var pushconstantOffset: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var pushconstantSize: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var indirectStateFlags: IndirectStateFlags
		get()      = IndirectStateFlags(Unsafe.getInt(address + 60))
		set(value) = Unsafe.setInt(address + 60, value.value)
	
	var indexTypeCount: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var pIndexTypes: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var pIndexTypeValues: Long
		get()      = Unsafe.getLong(address + 80)
		set(value) = Unsafe.setLong(address + 80, value)
	
	
	
	var indexTypes: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 72), indexTypeCount)
		set(value) { Unsafe.setLong(address + 72, value.address); indexTypeCount = value.capacity }
	
	var indexTypeValues: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 80), indexTypeCount)
		set(value) { Unsafe.setLong(address + 80, value.address); indexTypeCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 88
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = IndirectCommandsLayoutToken(offset(index))
		
		operator fun set(index: Int, value: IndirectCommandsLayoutToken) = Unsafe.copy(value.address, offset(index), 88)
		
		inline fun forEach(block: (IndirectCommandsLayoutToken) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (IndirectCommandsLayoutToken) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, IndirectCommandsLayoutToken) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}