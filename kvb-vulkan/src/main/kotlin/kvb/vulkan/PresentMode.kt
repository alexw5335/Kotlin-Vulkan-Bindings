// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkPresentModeKHR {
 *         VK_PRESENT_MODE_IMMEDIATE_KHR                  = 0
 *         VK_PRESENT_MODE_MAILBOX_KHR                    = 1
 *         VK_PRESENT_MODE_FIFO_KHR                       = 2
 *         VK_PRESENT_MODE_FIFO_RELAXED_KHR               = 3
 *         VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR      = 1000111000
 *         VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR  = 1000111001
 *     }
 */
@Suppress("unused")
enum class PresentMode(val value: Int) {
	
	
	IMMEDIATE(0),
	
	MAILBOX(1),
	
	FIFO(2),
	
	FIFO_RELAXED(3),
	
	SHARED_DEMAND_REFRESH(1000111000),
	
	SHARED_CONTINUOUS_REFRESH(1000111001);


}