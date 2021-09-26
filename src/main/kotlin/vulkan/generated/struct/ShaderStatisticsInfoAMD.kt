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
 *     struct VkShaderStatisticsInfoAMD {
 *         VkShaderStageFlags        shaderStageMask
 *         VkShaderResourceUsageAMD  resourceUsage
 *         uint32_t                  numPhysicalVgprs
 *         uint32_t                  numPhysicalSgprs
 *         uint32_t                  numAvailableVgprs
 *         uint32_t                  numAvailableSgprs
 *         uint32_t                  computeWorkGroupSize[3]
 *     }
 */
@JvmInline
value class ShaderStatisticsInfoAMD(override val address: Long) : Addressable {
	
	
	var shaderStageMask: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.bitfield) }
	
	var resourceUsage: ShaderResourceUsageAMD
		get()      = ShaderResourceUsageAMD(address + LAYOUT.offsets[1])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.structSize) }
	
	var numPhysicalVgprs: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var numPhysicalSgprs: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var numAvailableVgprs: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var numAvailableSgprs: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var computeWorkGroupSize: DirectIntBuffer
		get()      = DirectIntBuffer(address + LAYOUT.offsets[6], 3)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[6], value.byteSize) }
	
	
	
	class Persistent(
		val shaderStageMask: ShaderStageFlags,
		val resourceUsage: ShaderResourceUsageAMD.Persistent,
		val numPhysicalVgprs: Int,
		val numPhysicalSgprs: Int,
		val numAvailableVgprs: Int,
		val numAvailableSgprs: Int,
		val computeWorkGroupSize: IntArray,
	) {
		override fun toString() = "ShaderStatisticsInfoAMD(" + 
			"shaderStageMask=$shaderStageMask, " +
			"resourceUsage=$resourceUsage, " +
			"numPhysicalVgprs=$numPhysicalVgprs, " +
			"numPhysicalSgprs=$numPhysicalSgprs, " +
			"numAvailableVgprs=$numAvailableVgprs, " +
			"numAvailableSgprs=$numAvailableSgprs, " +
			"computeWorkGroupSize=$computeWorkGroupSize)"
	}
	
	
	
	val asPersistent get() = Persistent(
		shaderStageMask, 
		resourceUsage.asPersistent, 
		numPhysicalVgprs, 
		numPhysicalSgprs, 
		numAvailableVgprs, 
		numAvailableSgprs, 
		computeWorkGroupSize.asArray, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(ShaderResourceUsageAMD.LAYOUT)
			member(4)
			member(4)
			member(4)
			member(4)
			array(4, 3)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ShaderStatisticsInfoAMD(0)
		
		fun malloc(allocator: Allocator) = ShaderStatisticsInfoAMD(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ShaderStatisticsInfoAMD(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}