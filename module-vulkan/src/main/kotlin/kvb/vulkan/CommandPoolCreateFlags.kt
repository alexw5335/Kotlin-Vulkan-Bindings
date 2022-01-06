// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkCommandPoolCreateFlagBits {
 *         VK_COMMAND_POOL_CREATE_TRANSIENT_BIT             = 1
 *         VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT  = 2
 *         VK_COMMAND_POOL_CREATE_PROTECTED_BIT             = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class CommandPoolCreateFlags(val value: Int) {
	
	
	companion object {
		
		val TRANSIENT = CommandPoolCreateFlags(1)
		
		val RESET_COMMAND_BUFFER = CommandPoolCreateFlags(2)
		
		val PROTECTED = CommandPoolCreateFlags(4)
	
	}
	
	
	
	operator fun plus(mask: CommandPoolCreateFlags) = CommandPoolCreateFlags(value or mask.value)
	
	operator fun contains(mask: CommandPoolCreateFlags) = value and mask.value == mask.value


}