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
 *     struct VkFormatProperties {
 *         VkFormatFeatureFlags  linearTilingFeatures
 *         VkFormatFeatureFlags  optimalTilingFeatures
 *         VkFormatFeatureFlags  bufferFeatures
 *     }
 */
@JvmInline
value class FormatProperties(override val address: Long) : Addressable {
	
	
	var linearTilingFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.bitfield) }
	
	var optimalTilingFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + LAYOUT.offsets[1]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value.bitfield) }
	
	var bufferFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	
	
	class Persistent(
		val linearTilingFeatures: FormatFeatureFlags,
		val optimalTilingFeatures: FormatFeatureFlags,
		val bufferFeatures: FormatFeatureFlags,
	) {
		override fun toString() = "FormatProperties(" + 
			"linearTilingFeatures=$linearTilingFeatures, " +
			"optimalTilingFeatures=$optimalTilingFeatures, " +
			"bufferFeatures=$bufferFeatures)"
	}
	
	
	
	val asPersistent get() = Persistent(
		linearTilingFeatures, 
		optimalTilingFeatures, 
		bufferFeatures, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = FormatProperties(0)
		
		fun malloc(allocator: Allocator) = FormatProperties(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = FormatProperties(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}