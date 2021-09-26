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
 *     struct VkExtensionProperties {
 *         char      extensionName[256]
 *         uint32_t  specVersion
 *     }
 */
@JvmInline
value class ExtensionProperties(override val address: Long) : Addressable {
	
	
	var extensionName: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[0], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.byteSize) }
	
	var specVersion: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = ExtensionProperties(offset(index))
		
		operator fun set(index: Int, value: ExtensionProperties) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ExtensionProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ExtensionProperties) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ExtensionProperties[$capacity]"
	
	}
	
	
	
	class Persistent(
		val extensionName: String,
		val specVersion: Int,
	) {
		override fun toString() = "ExtensionProperties(" + 
			"extensionName=$extensionName, " +
			"specVersion=$specVersion)"
	}
	
	
	
	val asPersistent get() = Persistent(
		Unsafe.decodeUtf8(extensionName), 
		specVersion, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			array(1, 256)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ExtensionProperties(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ExtensionProperties(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ExtensionProperties(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}