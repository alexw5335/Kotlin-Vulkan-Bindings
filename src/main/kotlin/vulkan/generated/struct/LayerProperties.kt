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
 *     struct VkLayerProperties {
 *         char      layerName[256]
 *         uint32_t  specVersion
 *         uint32_t  implementationVersion
 *         char      description[256]
 *     }
 */
@JvmInline
value class LayerProperties(override val address: Long) : Addressable {
	
	
	var layerName: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[0], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.byteSize) }
	
	var specVersion: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var implementationVersion: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[3], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = LayerProperties(offset(index))
		
		operator fun set(index: Int, value: LayerProperties) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (LayerProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (LayerProperties) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "LayerProperties[$capacity]"
	
	}
	
	
	
	class Persistent(
		val layerName: String,
		val specVersion: Int,
		val implementationVersion: Int,
		val description: String,
	) {
		override fun toString() = "LayerProperties(" + 
			"layerName=$layerName, " +
			"specVersion=$specVersion, " +
			"implementationVersion=$implementationVersion, " +
			"description=$description)"
	}
	
	
	
	val asPersistent get() = Persistent(
		Unsafe.decodeUtf8(layerName), 
		specVersion, 
		implementationVersion, 
		Unsafe.decodeUtf8(description), 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			array(1, 256)
			member(4)
			member(4)
			array(1, 256)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = LayerProperties(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = LayerProperties(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = LayerProperties(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}