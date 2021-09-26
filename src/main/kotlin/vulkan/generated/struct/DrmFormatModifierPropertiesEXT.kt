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
 *     struct VkDrmFormatModifierPropertiesEXT {
 *         uint64_t              drmFormatModifier
 *         uint32_t              drmFormatModifierPlaneCount
 *         VkFormatFeatureFlags  drmFormatModifierTilingFeatures
 *     }
 */
@JvmInline
value class DrmFormatModifierPropertiesEXT(override val address: Long) : Addressable {
	
	
	var drmFormatModifier: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[0], value) }
	
	var drmFormatModifierPlaneCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var drmFormatModifierTilingFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = DrmFormatModifierPropertiesEXT(offset(index))
		
		operator fun set(index: Int, value: DrmFormatModifierPropertiesEXT) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (DrmFormatModifierPropertiesEXT) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DrmFormatModifierPropertiesEXT) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "DrmFormatModifierPropertiesEXT[$capacity]"
	
	}
	
	
	
	class Persistent(
		val drmFormatModifier: Long,
		val drmFormatModifierPlaneCount: Int,
		val drmFormatModifierTilingFeatures: FormatFeatureFlags,
	) {
		override fun toString() = "DrmFormatModifierPropertiesEXT(" + 
			"drmFormatModifier=$drmFormatModifier, " +
			"drmFormatModifierPlaneCount=$drmFormatModifierPlaneCount, " +
			"drmFormatModifierTilingFeatures=$drmFormatModifierTilingFeatures)"
	}
	
	
	
	val asPersistent get() = Persistent(
		drmFormatModifier, 
		drmFormatModifierPlaneCount, 
		drmFormatModifierTilingFeatures, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(8)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DrmFormatModifierPropertiesEXT(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = DrmFormatModifierPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = DrmFormatModifierPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}