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
 *     struct VkSamplerCreateInfo {
 *         VkStructureType       sType
 *         void*                 pNext
 *         VkSamplerCreateFlags  flags
 *         VkFilter              magFilter
 *         VkFilter              minFilter
 *         VkSamplerMipmapMode   mipmapMode
 *         VkSamplerAddressMode  addressModeU
 *         VkSamplerAddressMode  addressModeV
 *         VkSamplerAddressMode  addressModeW
 *         float                 mipLodBias
 *         VkBool32              anisotropyEnable
 *         float                 maxAnisotropy
 *         VkBool32              compareEnable
 *         VkCompareOp           compareOp
 *         float                 minLod
 *         float                 maxLod
 *         VkBorderColor         borderColor
 *         VkBool32              unnormalizedCoordinates
 *     }
 */
@JvmInline
value class SamplerCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: SamplerCreateFlags
		get()      = SamplerCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var magFilter: Filter
		get()      = Filter(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var minFilter: Filter
		get()      = Filter(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var mipmapMode: SamplerMipmapMode
		get()      = SamplerMipmapMode(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.id) }
	
	var addressModeU: SamplerAddressMode
		get()      = SamplerAddressMode(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	var addressModeV: SamplerAddressMode
		get()      = SamplerAddressMode(Unsafe.getInt(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value.id) }
	
	var addressModeW: SamplerAddressMode
		get()      = SamplerAddressMode(Unsafe.getInt(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value.id) }
	
	var mipLodBias: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[9], value) }
	
	var anisotropyEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var maxAnisotropy: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[11], value) }
	
	var compareEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var compareOp: CompareOp
		get()      = CompareOp(Unsafe.getInt(address + LAYOUT.offsets[13]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value.id) }
	
	var minLod: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[14], value) }
	
	var maxLod: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[15], value) }
	
	var borderColor: BorderColor
		get()      = BorderColor(Unsafe.getInt(address + LAYOUT.offsets[16]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value.id) }
	
	var unnormalizedCoordinates: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[17])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[17], value) }
	
	
	
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
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SamplerCreateInfo(0)
		
		fun malloc(allocator: Allocator) = SamplerCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SAMPLER_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = SamplerCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SAMPLER_CREATE_INFO
		}
	
	}


}