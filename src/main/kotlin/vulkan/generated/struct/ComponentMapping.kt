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
 *     struct VkComponentMapping {
 *         VkComponentSwizzle  r
 *         VkComponentSwizzle  g
 *         VkComponentSwizzle  b
 *         VkComponentSwizzle  a
 *     }
 */
@JvmInline
value class ComponentMapping(override val address: Long) : Addressable {
	
	
	var r: ComponentSwizzle
		get()      = ComponentSwizzle(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var g: ComponentSwizzle
		get()      = ComponentSwizzle(Unsafe.getInt(address + LAYOUT.offsets[1]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value.id) }
	
	var b: ComponentSwizzle
		get()      = ComponentSwizzle(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var a: ComponentSwizzle
		get()      = ComponentSwizzle(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	
	
	class Persistent(
		val r: ComponentSwizzle,
		val g: ComponentSwizzle,
		val b: ComponentSwizzle,
		val a: ComponentSwizzle,
	) {
		override fun toString() = "ComponentMapping(" + 
			"r=$r, " +
			"g=$g, " +
			"b=$b, " +
			"a=$a)"
	}
	
	
	
	val asPersistent get() = Persistent(
		r, 
		g, 
		b, 
		a, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ComponentMapping(0)
		
		fun malloc(allocator: Allocator) = ComponentMapping(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ComponentMapping(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}