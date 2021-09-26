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
 *     struct VkConformanceVersion {
 *         uint8_t  major
 *         uint8_t  minor
 *         uint8_t  subminor
 *         uint8_t  patch
 *     }
 */
@JvmInline
value class ConformanceVersion(override val address: Long) : Addressable {
	
	
	var major: Byte
		get()      = Unsafe.getByte(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setByte(address + LAYOUT.offsets[0], value) }
	
	var minor: Byte
		get()      = Unsafe.getByte(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setByte(address + LAYOUT.offsets[1], value) }
	
	var subminor: Byte
		get()      = Unsafe.getByte(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setByte(address + LAYOUT.offsets[2], value) }
	
	var patch: Byte
		get()      = Unsafe.getByte(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setByte(address + LAYOUT.offsets[3], value) }
	
	
	
	class Persistent(
		val major: Byte,
		val minor: Byte,
		val subminor: Byte,
		val patch: Byte,
	) {
		override fun toString() = "ConformanceVersion(" + 
			"major=$major, " +
			"minor=$minor, " +
			"subminor=$subminor, " +
			"patch=$patch)"
	}
	
	
	
	val asPersistent get() = Persistent(
		major, 
		minor, 
		subminor, 
		patch, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(1)
			member(1)
			member(1)
			member(1)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ConformanceVersion(0)
		
		fun malloc(allocator: Allocator) = ConformanceVersion(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ConformanceVersion(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}