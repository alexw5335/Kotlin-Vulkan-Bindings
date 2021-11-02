// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkBufferUsageFlagBits {
 *         VK_BUFFER_USAGE_TRANSFER_SRC_BIT                                      = 1
 *         VK_BUFFER_USAGE_TRANSFER_DST_BIT                                      = 2
 *         VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT                              = 4
 *         VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT                              = 8
 *         VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT                                    = 16
 *         VK_BUFFER_USAGE_STORAGE_BUFFER_BIT                                    = 32
 *         VK_BUFFER_USAGE_INDEX_BUFFER_BIT                                      = 64
 *         VK_BUFFER_USAGE_VERTEX_BUFFER_BIT                                     = 128
 *         VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT                                   = 256
 *         VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT                             = 131072
 *         VK_BUFFER_USAGE_RESERVED_15_BIT_KHR                                   = 32768
 *         VK_BUFFER_USAGE_RESERVED_16_BIT_KHR                                   = 65536
 *         VK_BUFFER_USAGE_RESERVED_13_BIT_KHR                                   = 8192
 *         VK_BUFFER_USAGE_RESERVED_14_BIT_KHR                                   = 16384
 *         VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT                     = 2048
 *         VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT             = 4096
 *         VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT                         = 512
 *         VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR  = 524288
 *         VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR                = 1048576
 *         VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR                          = 1024
 *         VK_BUFFER_USAGE_RAY_TRACING_BIT_NV                                    = 1024
 *         VK_BUFFER_USAGE_RESERVED_18_BIT_QCOM                                  = 262144
 *         VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT                         = 131072
 *         VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR                         = 131072
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class BufferUsageFlags(val value: Int) {
	
	
	companion object {
		
		val TRANSFER_SRC = BufferUsageFlags(1)
		
		val TRANSFER_DST = BufferUsageFlags(2)
		
		val UNIFORM_TEXEL_BUFFER = BufferUsageFlags(4)
		
		val STORAGE_TEXEL_BUFFER = BufferUsageFlags(8)
		
		val UNIFORM_BUFFER = BufferUsageFlags(16)
		
		val STORAGE_BUFFER = BufferUsageFlags(32)
		
		val INDEX_BUFFER = BufferUsageFlags(64)
		
		val VERTEX_BUFFER = BufferUsageFlags(128)
		
		val INDIRECT_BUFFER = BufferUsageFlags(256)
		
		val SHADER_DEVICE_ADDRESS = BufferUsageFlags(131072)
		
		val TRANSFORM_FEEDBACK_BUFFER = BufferUsageFlags(2048)
		
		val TRANSFORM_FEEDBACK_COUNTER_BUFFER = BufferUsageFlags(4096)
		
		val CONDITIONAL_RENDERING = BufferUsageFlags(512)
		
		val ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY = BufferUsageFlags(524288)
		
		val ACCELERATION_STRUCTURE_STORAGE = BufferUsageFlags(1048576)
		
		val SHADER_BINDING_TABLE = BufferUsageFlags(1024)
	
	}
	
	
	
	operator fun plus(mask: BufferUsageFlags) = BufferUsageFlags(value or mask.value)
	
	operator fun contains(mask: BufferUsageFlags) = value and mask.value == mask.value


}