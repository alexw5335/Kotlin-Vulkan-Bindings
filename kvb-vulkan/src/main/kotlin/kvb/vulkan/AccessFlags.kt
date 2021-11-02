// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkAccessFlagBits {
 *         VK_ACCESS_INDIRECT_COMMAND_READ_BIT                      = 1
 *         VK_ACCESS_INDEX_READ_BIT                                 = 2
 *         VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT                      = 4
 *         VK_ACCESS_UNIFORM_READ_BIT                               = 8
 *         VK_ACCESS_INPUT_ATTACHMENT_READ_BIT                      = 16
 *         VK_ACCESS_SHADER_READ_BIT                                = 32
 *         VK_ACCESS_SHADER_WRITE_BIT                               = 64
 *         VK_ACCESS_COLOR_ATTACHMENT_READ_BIT                      = 128
 *         VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT                     = 256
 *         VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT              = 512
 *         VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT             = 1024
 *         VK_ACCESS_TRANSFER_READ_BIT                              = 2048
 *         VK_ACCESS_TRANSFER_WRITE_BIT                             = 4096
 *         VK_ACCESS_HOST_READ_BIT                                  = 8192
 *         VK_ACCESS_HOST_WRITE_BIT                                 = 16384
 *         VK_ACCESS_MEMORY_READ_BIT                                = 32768
 *         VK_ACCESS_MEMORY_WRITE_BIT                               = 65536
 *         VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT               = 33554432
 *         VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT        = 67108864
 *         VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT       = 134217728
 *         VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT             = 1048576
 *         VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT      = 524288
 *         VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR            = 2097152
 *         VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR           = 4194304
 *         VK_ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV                 = 8388608
 *         VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV             = 2097152
 *         VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV            = 4194304
 *         VK_ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT              = 16777216
 *         VK_ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR  = 8388608
 *         VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV                 = 131072
 *         VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV                = 262144
 *         VK_ACCESS_NONE_KHR                                       = 0
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class AccessFlags(val value: Int) {
	
	
	companion object {
		
		val INDIRECT_COMMAND_READ = AccessFlags(1)
		
		val INDEX_READ = AccessFlags(2)
		
		val VERTEX_ATTRIBUTE_READ = AccessFlags(4)
		
		val UNIFORM_READ = AccessFlags(8)
		
		val INPUT_ATTACHMENT_READ = AccessFlags(16)
		
		val SHADER_READ = AccessFlags(32)
		
		val SHADER_WRITE = AccessFlags(64)
		
		val COLOR_ATTACHMENT_READ = AccessFlags(128)
		
		val COLOR_ATTACHMENT_WRITE = AccessFlags(256)
		
		val DEPTH_STENCIL_ATTACHMENT_READ = AccessFlags(512)
		
		val DEPTH_STENCIL_ATTACHMENT_WRITE = AccessFlags(1024)
		
		val TRANSFER_READ = AccessFlags(2048)
		
		val TRANSFER_WRITE = AccessFlags(4096)
		
		val HOST_READ = AccessFlags(8192)
		
		val HOST_WRITE = AccessFlags(16384)
		
		val MEMORY_READ = AccessFlags(32768)
		
		val MEMORY_WRITE = AccessFlags(65536)
		
		val TRANSFORM_FEEDBACK_WRITE = AccessFlags(33554432)
		
		val TRANSFORM_FEEDBACK_COUNTER_READ = AccessFlags(67108864)
		
		val TRANSFORM_FEEDBACK_COUNTER_WRITE = AccessFlags(134217728)
		
		val CONDITIONAL_RENDERING_READ = AccessFlags(1048576)
		
		val COLOR_ATTACHMENT_READ_NONCOHERENT = AccessFlags(524288)
		
		val ACCELERATION_STRUCTURE_READ = AccessFlags(2097152)
		
		val ACCELERATION_STRUCTURE_WRITE = AccessFlags(4194304)
		
		val SHADING_RATE_IMAGE_READ = AccessFlags(8388608)
		
		val FRAGMENT_DENSITY_MAP_READ = AccessFlags(16777216)
		
		val COMMAND_PREPROCESS_READ = AccessFlags(131072)
		
		val COMMAND_PREPROCESS_WRITE = AccessFlags(262144)
		
		val NONE = AccessFlags(0)
	
	}
	
	
	
	operator fun plus(mask: AccessFlags) = AccessFlags(value or mask.value)
	
	operator fun contains(mask: AccessFlags) = value and mask.value == mask.value


}