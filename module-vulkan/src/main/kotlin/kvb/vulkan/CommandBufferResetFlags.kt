// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkCommandBufferResetFlagBits {
 *         VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class CommandBufferResetFlags(val value: Int) {
	
	
	companion object {
		
		val RELEASE_RESOURCES = CommandBufferResetFlags(1)
	
	}
	
	
	
	operator fun plus(mask: CommandBufferResetFlags) = CommandBufferResetFlags(value or mask.value)
	
	operator fun contains(mask: CommandBufferResetFlags) = value and mask.value == mask.value


}