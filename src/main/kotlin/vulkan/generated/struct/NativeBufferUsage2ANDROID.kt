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
 *     struct VkNativeBufferUsage2ANDROID {
 *         uint64_t  consumer
 *         uint64_t  producer
 *     }
 */
@JvmInline
value class NativeBufferUsage2ANDROID(override val address: Long) : Addressable {
	
	
	var consumer: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[0], value) }
	
	var producer: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[1], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = NativeBufferUsage2ANDROID(0)
		
		fun malloc(allocator: Allocator) = NativeBufferUsage2ANDROID(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = NativeBufferUsage2ANDROID(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}