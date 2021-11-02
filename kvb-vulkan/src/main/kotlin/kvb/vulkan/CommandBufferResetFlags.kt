// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkCommandBufferResetFlagBits {
 *         VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class CommandBufferResetFlags(val value: Int) {
	
	
	companion object {
		
		val RELEASE_RESOURCES = CommandBufferResetFlags(1)
	
	}
	
	
	
	operator fun plus(mask: CommandBufferResetFlags) = CommandBufferResetFlags(value or mask.value)
	
	operator fun contains(mask: CommandBufferResetFlags) = value and mask.value == mask.value


}