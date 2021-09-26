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
 *     struct VkPhysicalDeviceDepthStencilResolveProperties {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkResolveModeFlags  supportedDepthResolveModes
 *         VkResolveModeFlags  supportedStencilResolveModes
 *         VkBool32            independentResolveNone
 *         VkBool32            independentResolve
 *     }
 */
@JvmInline
value class PhysicalDeviceDepthStencilResolveProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var supportedDepthResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var supportedStencilResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var independentResolveNone: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var independentResolve: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val supportedDepthResolveModes: ResolveModeFlags,
		val supportedStencilResolveModes: ResolveModeFlags,
		val independentResolveNone: Int,
		val independentResolve: Int,
	) {
		override fun toString() = "PhysicalDeviceDepthStencilResolveProperties(" + 
			"sType=$sType, " +
			"supportedDepthResolveModes=$supportedDepthResolveModes, " +
			"supportedStencilResolveModes=$supportedStencilResolveModes, " +
			"independentResolveNone=$independentResolveNone, " +
			"independentResolve=$independentResolve)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		supportedDepthResolveModes, 
		supportedStencilResolveModes, 
		independentResolveNone, 
		independentResolve, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceDepthStencilResolveProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceDepthStencilResolveProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceDepthStencilResolveProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES
		}
	
	}


}