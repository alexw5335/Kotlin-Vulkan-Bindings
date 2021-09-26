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
 *     struct VkPhysicalDevicePCIBusInfoPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         pciDomain
 *         uint32_t         pciBus
 *         uint32_t         pciDevice
 *         uint32_t         pciFunction
 *     }
 */
@JvmInline
value class PhysicalDevicePCIBusInfoPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var pciDomain: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pciBus: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pciDevice: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pciFunction: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val pciDomain: Int,
		val pciBus: Int,
		val pciDevice: Int,
		val pciFunction: Int,
	) {
		override fun toString() = "PhysicalDevicePCIBusInfoPropertiesEXT(" + 
			"sType=$sType, " +
			"pciDomain=$pciDomain, " +
			"pciBus=$pciBus, " +
			"pciDevice=$pciDevice, " +
			"pciFunction=$pciFunction)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		pciDomain, 
		pciBus, 
		pciDevice, 
		pciFunction, 
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
		
		val NULL = PhysicalDevicePCIBusInfoPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDevicePCIBusInfoPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDevicePCIBusInfoPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES
		}
	
	}


}