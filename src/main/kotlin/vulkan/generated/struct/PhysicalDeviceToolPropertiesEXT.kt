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
 *     struct VkPhysicalDeviceToolPropertiesEXT {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         char                   name[256]
 *         char                   version[256]
 *         VkToolPurposeFlagsEXT  purposes
 *         char                   description[256]
 *         char                   layer[256]
 *     }
 */
@JvmInline
value class PhysicalDeviceToolPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var name: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[2], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.byteSize) }
	
	var version: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[3], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	var purposes: ToolPurposeFlags
		get()      = ToolPurposeFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[5], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.byteSize) }
	
	var layer: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[6], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[6], value.byteSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = PhysicalDeviceToolPropertiesEXT(offset(index))
		
		operator fun set(index: Int, value: PhysicalDeviceToolPropertiesEXT) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (PhysicalDeviceToolPropertiesEXT) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PhysicalDeviceToolPropertiesEXT) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "PhysicalDeviceToolPropertiesEXT[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val name: String,
		val version: String,
		val purposes: ToolPurposeFlags,
		val description: String,
		val layer: String,
	) {
		override fun toString() = "PhysicalDeviceToolPropertiesEXT(" + 
			"sType=$sType, " +
			"name=$name, " +
			"version=$version, " +
			"purposes=$purposes, " +
			"description=$description, " +
			"layer=$layer)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		Unsafe.decodeUtf8(name), 
		Unsafe.decodeUtf8(version), 
		purposes, 
		Unsafe.decodeUtf8(description), 
		Unsafe.decodeUtf8(layer), 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			array(1, 256)
			array(1, 256)
			member(4)
			array(1, 256)
			array(1, 256)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceToolPropertiesEXT(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceToolPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_TOOL_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceToolPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_TOOL_PROPERTIES
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PHYSICAL_DEVICE_TOOL_PROPERTIES }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PHYSICAL_DEVICE_TOOL_PROPERTIES }
		}
	
	}


}