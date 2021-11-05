// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

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
 * 
 *     Valid pNext types:
 *         - VkSamplerYcbcrConversionInfo
 *         - VkSamplerReductionModeCreateInfo
 *         - VkSamplerCustomBorderColorCreateInfoEXT
 */
@JvmInline
value class SamplerCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: SamplerCreateFlags
		get()      = SamplerCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var magFilter: Filter
		get()      = _Filter(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var minFilter: Filter
		get()      = _Filter(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var mipmapMode: SamplerMipmapMode
		get()      = _SamplerMipmapMode(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var addressModeU: SamplerAddressMode
		get()      = _SamplerAddressMode(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var addressModeV: SamplerAddressMode
		get()      = _SamplerAddressMode(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var addressModeW: SamplerAddressMode
		get()      = _SamplerAddressMode(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var mipLodBias: Float
		get()      = Unsafe.getFloat(address + 44)
		set(value) = Unsafe.setFloat(address + 44, value)
	
	var anisotropyEnable: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var maxAnisotropy: Float
		get()      = Unsafe.getFloat(address + 52)
		set(value) = Unsafe.setFloat(address + 52, value)
	
	var compareEnable: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var compareOp: CompareOp
		get()      = _CompareOp(Unsafe.getInt(address + 60))
		set(value) = Unsafe.setInt(address + 60, value.value)
	
	var minLod: Float
		get()      = Unsafe.getFloat(address + 64)
		set(value) = Unsafe.setFloat(address + 64, value)
	
	var maxLod: Float
		get()      = Unsafe.getFloat(address + 68)
		set(value) = Unsafe.setFloat(address + 68, value)
	
	var borderColor: BorderColor
		get()      = _BorderColor(Unsafe.getInt(address + 72))
		set(value) = Unsafe.setInt(address + 72, value.value)
	
	var unnormalizedCoordinates: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)


}