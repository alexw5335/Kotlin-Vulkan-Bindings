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
 *     struct VkQueryPoolCreateInfo {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkQueryPoolCreateFlags         flags (reserved, must be zero)
 *         VkQueryType                    queryType
 *         uint32_t                       queryCount
 *         VkQueryPipelineStatisticFlags  pipelineStatistics
 *     }
 */
@JvmInline
value class QueryPoolCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: QueryPoolCreateFlags
		get()      = QueryPoolCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var queryType: QueryType
		get()      = QueryType(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var queryCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pipelineStatistics: QueryPipelineStatisticFlags
		get()      = QueryPipelineStatisticFlags(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.bitfield) }
	
	
	
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = QueryPoolCreateInfo(0)
		
		fun malloc(allocator: Allocator) = QueryPoolCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.QUERY_POOL_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = QueryPoolCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.QUERY_POOL_CREATE_INFO
		}
	
	}


}