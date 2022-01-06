// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_synchronization2

 *     enum VkAccessFlagBits2KHR {
 *         VK_ACCESS_2_NONE_KHR                                       = 0
 *         VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR                  = 1
 *         VK_ACCESS_2_INDEX_READ_BIT_KHR                             = 2
 *         VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR                  = 4
 *         VK_ACCESS_2_UNIFORM_READ_BIT_KHR                           = 8
 *         VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR                  = 16
 *         VK_ACCESS_2_SHADER_READ_BIT_KHR                            = 32
 *         VK_ACCESS_2_SHADER_WRITE_BIT_KHR                           = 64
 *         VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR                  = 128
 *         VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR                 = 256
 *         VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR          = 512
 *         VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR         = 1024
 *         VK_ACCESS_2_TRANSFER_READ_BIT_KHR                          = 2048
 *         VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR                         = 4096
 *         VK_ACCESS_2_HOST_READ_BIT_KHR                              = 8192
 *         VK_ACCESS_2_HOST_WRITE_BIT_KHR                             = 16384
 *         VK_ACCESS_2_MEMORY_READ_BIT_KHR                            = 32768
 *         VK_ACCESS_2_MEMORY_WRITE_BIT_KHR                           = 65536
 *         VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR                    = 4294967296
 *         VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR                    = 8589934592
 *         VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR                   = 17179869184
 *         VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR                      = 34359738368
 *         VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR                     = 68719476736
 *         VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR                      = 137438953472
 *         VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR                     = 274877906944
 *         VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT               = 33554432
 *         VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT        = 67108864
 *         VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT       = 134217728
 *         VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT             = 1048576
 *         VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV                 = 131072
 *         VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV                = 262144
 *         VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR  = 8388608
 *         VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV                 = 8388608
 *         VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR            = 2097152
 *         VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR           = 4194304
 *         VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV             = 2097152
 *         VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV            = 4194304
 *         VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT              = 16777216
 *         VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT      = 524288
 *         VK_ACCESS_2_RESERVED_41_BIT_AMD                            = 2199023255552
 *         VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI                = 549755813888
 *         VK_ACCESS_2_RESERVED_387_BIT_KHR                           = 1099511627776
 *     }
 */
@Suppress("unused")
@JvmInline
value class AccessFlags2(val value: Long) {
	
	
	companion object {
		
		val NONE = AccessFlags2(0)
		
		val INDIRECT_COMMAND_READ = AccessFlags2(1)
		
		val INDEX_READ = AccessFlags2(2)
		
		val VERTEX_ATTRIBUTE_READ = AccessFlags2(4)
		
		val UNIFORM_READ = AccessFlags2(8)
		
		val INPUT_ATTACHMENT_READ = AccessFlags2(16)
		
		val SHADER_READ = AccessFlags2(32)
		
		val SHADER_WRITE = AccessFlags2(64)
		
		val COLOR_ATTACHMENT_READ = AccessFlags2(128)
		
		val COLOR_ATTACHMENT_WRITE = AccessFlags2(256)
		
		val DEPTH_STENCIL_ATTACHMENT_READ = AccessFlags2(512)
		
		val DEPTH_STENCIL_ATTACHMENT_WRITE = AccessFlags2(1024)
		
		val TRANSFER_READ = AccessFlags2(2048)
		
		val TRANSFER_WRITE = AccessFlags2(4096)
		
		val HOST_READ = AccessFlags2(8192)
		
		val HOST_WRITE = AccessFlags2(16384)
		
		val MEMORY_READ = AccessFlags2(32768)
		
		val MEMORY_WRITE = AccessFlags2(65536)
		
		val SHADER_SAMPLED_READ = AccessFlags2(4294967296)
		
		val SHADER_STORAGE_READ = AccessFlags2(8589934592)
		
		val SHADER_STORAGE_WRITE = AccessFlags2(17179869184)
		
		val VIDEO_DECODE_READ = AccessFlags2(34359738368)
		
		val VIDEO_DECODE_WRITE = AccessFlags2(68719476736)
		
		val VIDEO_ENCODE_READ = AccessFlags2(137438953472)
		
		val VIDEO_ENCODE_WRITE = AccessFlags2(274877906944)
		
		val TRANSFORM_FEEDBACK_WRITE = AccessFlags2(33554432)
		
		val TRANSFORM_FEEDBACK_COUNTER_READ = AccessFlags2(67108864)
		
		val TRANSFORM_FEEDBACK_COUNTER_WRITE = AccessFlags2(134217728)
		
		val CONDITIONAL_RENDERING_READ = AccessFlags2(1048576)
		
		val COMMAND_PREPROCESS_READ = AccessFlags2(131072)
		
		val COMMAND_PREPROCESS_WRITE = AccessFlags2(262144)
		
		val FRAGMENT_SHADING_RATE_ATTACHMENT_READ = AccessFlags2(8388608)
		
		val ACCELERATION_STRUCTURE_READ = AccessFlags2(2097152)
		
		val ACCELERATION_STRUCTURE_WRITE = AccessFlags2(4194304)
		
		val FRAGMENT_DENSITY_MAP_READ = AccessFlags2(16777216)
		
		val COLOR_ATTACHMENT_READ_NONCOHERENT = AccessFlags2(524288)
		
		val INVOCATION_MASK_READ = AccessFlags2(549755813888)
	
	}
	
	
	
	operator fun plus(mask: AccessFlags2) = AccessFlags2(value or mask.value)
	
	operator fun contains(mask: AccessFlags2) = value and mask.value == mask.value


}