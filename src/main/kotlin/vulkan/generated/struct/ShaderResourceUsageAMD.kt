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
 *     struct VkShaderResourceUsageAMD {
 *         uint32_t  numUsedVgprs
 *         uint32_t  numUsedSgprs
 *         uint32_t  ldsSizePerLocalWorkGroup
 *         size_t    ldsUsageSizeInBytes
 *         size_t    scratchMemUsageInBytes
 *     }
 */
@JvmInline
value class ShaderResourceUsageAMD(override val address: Long) : Addressable {
	
	
	var numUsedVgprs: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var numUsedSgprs: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var ldsSizePerLocalWorkGroup: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var ldsUsageSizeInBytes: Long
		get()      = Unsafe.getNativeSizeT(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativeSizeT(address + LAYOUT.offsets[3], value) }
	
	var scratchMemUsageInBytes: Long
		get()      = Unsafe.getNativeSizeT(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativeSizeT(address + LAYOUT.offsets[4], value) }
	
	
	
	class Persistent(
		val numUsedVgprs: Int,
		val numUsedSgprs: Int,
		val ldsSizePerLocalWorkGroup: Int,
		val ldsUsageSizeInBytes: Long,
		val scratchMemUsageInBytes: Long,
	) {
		override fun toString() = "ShaderResourceUsageAMD(" + 
			"numUsedVgprs=$numUsedVgprs, " +
			"numUsedSgprs=$numUsedSgprs, " +
			"ldsSizePerLocalWorkGroup=$ldsSizePerLocalWorkGroup, " +
			"ldsUsageSizeInBytes=$ldsUsageSizeInBytes, " +
			"scratchMemUsageInBytes=$scratchMemUsageInBytes)"
	}
	
	
	
	val asPersistent get() = Persistent(
		numUsedVgprs, 
		numUsedSgprs, 
		ldsSizePerLocalWorkGroup, 
		ldsUsageSizeInBytes, 
		scratchMemUsageInBytes, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
			member(NativeSizes.SIZE_T)
			member(NativeSizes.SIZE_T)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ShaderResourceUsageAMD(0)
		
		fun malloc(allocator: Allocator) = ShaderResourceUsageAMD(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ShaderResourceUsageAMD(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}