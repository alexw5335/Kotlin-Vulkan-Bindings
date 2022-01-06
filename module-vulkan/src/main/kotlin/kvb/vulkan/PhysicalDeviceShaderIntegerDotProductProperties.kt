// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_shader_integer_dot_product

 *     struct VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         integerDotProduct8BitUnsignedAccelerated
 *         VkBool32         integerDotProduct8BitSignedAccelerated
 *         VkBool32         integerDotProduct8BitMixedSignednessAccelerated
 *         VkBool32         integerDotProduct4x8BitPackedUnsignedAccelerated
 *         VkBool32         integerDotProduct4x8BitPackedSignedAccelerated
 *         VkBool32         integerDotProduct4x8BitPackedMixedSignednessAccelerated
 *         VkBool32         integerDotProduct16BitUnsignedAccelerated
 *         VkBool32         integerDotProduct16BitSignedAccelerated
 *         VkBool32         integerDotProduct16BitMixedSignednessAccelerated
 *         VkBool32         integerDotProduct32BitUnsignedAccelerated
 *         VkBool32         integerDotProduct32BitSignedAccelerated
 *         VkBool32         integerDotProduct32BitMixedSignednessAccelerated
 *         VkBool32         integerDotProduct64BitUnsignedAccelerated
 *         VkBool32         integerDotProduct64BitSignedAccelerated
 *         VkBool32         integerDotProduct64BitMixedSignednessAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating8BitUnsignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating8BitSignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating16BitUnsignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating16BitSignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating32BitUnsignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating32BitSignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating64BitUnsignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating64BitSignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderIntegerDotProductProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var integerDotProduct8BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var integerDotProduct8BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var integerDotProduct8BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var integerDotProduct4x8BitPackedUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var integerDotProduct4x8BitPackedSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var integerDotProduct4x8BitPackedMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var integerDotProduct16BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var integerDotProduct16BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var integerDotProduct16BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var integerDotProduct32BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var integerDotProduct32BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var integerDotProduct32BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var integerDotProduct64BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var integerDotProduct64BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var integerDotProduct64BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var integerDotProductAccumulatingSaturating8BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var integerDotProductAccumulatingSaturating8BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var integerDotProductAccumulatingSaturating16BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 100)
		set(value) = Unsafe.setInt(address + 100, value)
	
	var integerDotProductAccumulatingSaturating16BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 104)
		set(value) = Unsafe.setInt(address + 104, value)
	
	var integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 108)
		set(value) = Unsafe.setInt(address + 108, value)
	
	var integerDotProductAccumulatingSaturating32BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 112)
		set(value) = Unsafe.setInt(address + 112, value)
	
	var integerDotProductAccumulatingSaturating32BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 116)
		set(value) = Unsafe.setInt(address + 116, value)
	
	var integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var integerDotProductAccumulatingSaturating64BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 124)
		set(value) = Unsafe.setInt(address + 124, value)
	
	var integerDotProductAccumulatingSaturating64BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 128)
		set(value) = Unsafe.setInt(address + 128, value)
	
	var integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 132)
		set(value) = Unsafe.setInt(address + 132, value)


}