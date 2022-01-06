// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_device_generated_commands

 *     struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxGraphicsShaderGroupCount
 *         uint32_t         maxIndirectSequenceCount
 *         uint32_t         maxIndirectCommandsTokenCount
 *         uint32_t         maxIndirectCommandsStreamCount
 *         uint32_t         maxIndirectCommandsTokenOffset
 *         uint32_t         maxIndirectCommandsStreamStride
 *         uint32_t         minSequencesCountBufferOffsetAlignment
 *         uint32_t         minSequencesIndexBufferOffsetAlignment
 *         uint32_t         minIndirectCommandsBufferOffsetAlignment
 *     }
 */
@JvmInline
value class PhysicalDeviceDeviceGeneratedCommandsProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxGraphicsShaderGroupCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxIndirectSequenceCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxIndirectCommandsTokenCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var maxIndirectCommandsStreamCount: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var maxIndirectCommandsTokenOffset: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var maxIndirectCommandsStreamStride: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var minSequencesCountBufferOffsetAlignment: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var minSequencesIndexBufferOffsetAlignment: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var minIndirectCommandsBufferOffsetAlignment: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)


}