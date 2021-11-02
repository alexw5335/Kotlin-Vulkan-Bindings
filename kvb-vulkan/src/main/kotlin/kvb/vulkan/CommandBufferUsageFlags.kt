// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkCommandBufferUsageFlagBits {
 *         VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT       = 1
 *         VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT  = 2
 *         VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT      = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class CommandBufferUsageFlags(val value: Int) {
	
	
	companion object {
		
		val ONE_TIME_SUBMIT = CommandBufferUsageFlags(1)
		
		val RENDER_PASS_CONTINUE = CommandBufferUsageFlags(2)
		
		val SIMULTANEOUS_USE = CommandBufferUsageFlags(4)
	
	}
	
	
	
	operator fun plus(mask: CommandBufferUsageFlags) = CommandBufferUsageFlags(value or mask.value)
	
	operator fun contains(mask: CommandBufferUsageFlags) = value and mask.value == mask.value


}