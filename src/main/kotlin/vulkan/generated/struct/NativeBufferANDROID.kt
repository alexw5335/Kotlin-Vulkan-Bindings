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
 *     struct VkNativeBufferANDROID {
 *         VkStructureType              sType
 *         void*                        pNext (must be null)
 *         void*                        handle
 *         int                          stride
 *         int                          format
 *         int                          usage
 *         VkNativeBufferUsage2ANDROID  usage2
 *     }
 */
@JvmInline
value class NativeBufferANDROID(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var handle: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value) }
	
	var stride: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var format: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var usage: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var usage2: NativeBufferUsage2ANDROID
		get()      = NativeBufferUsage2ANDROID(address + LAYOUT.offsets[6])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[6], value.structSize) }
	
	
	
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(NativeBufferUsage2ANDROID.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = NativeBufferANDROID(0)
		
		fun malloc(allocator: Allocator) = NativeBufferANDROID(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = NativeBufferANDROID(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}