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
 *         VkIndexType**                  pIndexTypes
 *         uint32_t**                     pIndexTypeValues
 *     }
 */
@JvmInline
value class IndirectCommandsLayoutTokenNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var tokenType: IndirectCommandsTokenType
		get()      = IndirectCommandsTokenType(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var stream: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var offset: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var vertexBindingUnit: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var vertexDynamicStride: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var pushconstantPipelineLayout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getNativePointer(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value.address) }
	
	var pushconstantShaderStageFlags: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value.bitfield) }
	
	var pushconstantOffset: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var pushconstantSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var indirectStateFlags: IndirectStateFlags
		get()      = IndirectStateFlags(Unsafe.getInt(address + LAYOUT.offsets[11]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value.bitfield) }
	
	var indexTypeCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var pIndexTypes: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[13], value) }
	
	var pIndexTypeValues: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[14], value) }
	
	
	
	var indexTypes: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[13]), indexTypeCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[13], value.address); indexTypeCount = value.capacity }
	
	var indexTypeValues: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[14]), indexTypeCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[14], value.address); indexTypeCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = IndirectCommandsLayoutTokenNV(offset(index))
		
		operator fun set(index: Int, value: IndirectCommandsLayoutTokenNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (IndirectCommandsLayoutTokenNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (IndirectCommandsLayoutTokenNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "IndirectCommandsLayoutTokenNV[$capacity]"
	
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
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = IndirectCommandsLayoutTokenNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = IndirectCommandsLayoutTokenNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.INDIRECT_COMMANDS_LAYOUT_TOKEN
		}
		
		fun calloc(allocator: Allocator) = IndirectCommandsLayoutTokenNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.INDIRECT_COMMANDS_LAYOUT_TOKEN
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.INDIRECT_COMMANDS_LAYOUT_TOKEN }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.INDIRECT_COMMANDS_LAYOUT_TOKEN }
		}
	
	}


}