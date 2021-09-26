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
 *     struct VkTextureLODGatherFormatPropertiesAMD {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         supportsTextureGatherLODBiasAMD
 *     }
 */
@JvmInline
value class TextureLODGatherFormatPropertiesAMD(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var supportsTextureGatherLODBiasAMD: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val supportsTextureGatherLODBiasAMD: Int,
	) {
		override fun toString() = "TextureLODGatherFormatPropertiesAMD(" + 
			"sType=$sType, " +
			"supportsTextureGatherLODBiasAMD=$supportsTextureGatherLODBiasAMD)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		supportsTextureGatherLODBiasAMD, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = TextureLODGatherFormatPropertiesAMD(0)
		
		fun malloc(allocator: Allocator) = TextureLODGatherFormatPropertiesAMD(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.TEXTURE_LOD_GATHER_FORMAT_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = TextureLODGatherFormatPropertiesAMD(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.TEXTURE_LOD_GATHER_FORMAT_PROPERTIES
		}
	
	}


}