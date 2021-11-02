// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkCommandPoolResetFlagBits {
 *         VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class CommandPoolResetFlags(val value: Int) {
	
	
	companion object {
		
		val RELEASE_RESOURCES = CommandPoolResetFlags(1)
	
	}
	
	
	
	operator fun plus(mask: CommandPoolResetFlags) = CommandPoolResetFlags(value or mask.value)
	
	operator fun contains(mask: CommandPoolResetFlags) = value and mask.value == mask.value


}