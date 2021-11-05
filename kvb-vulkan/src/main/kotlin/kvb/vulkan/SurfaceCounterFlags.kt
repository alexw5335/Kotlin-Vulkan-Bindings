// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkSurfaceCounterFlagBitsEXT {
 *         VK_SURFACE_COUNTER_VBLANK_BIT_EXT  = 1
 *         VK_SURFACE_COUNTER_VBLANK_EXT      = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class SurfaceCounterFlags(val value: Int) {
	
	
	companion object {
		
		val VBLANK = SurfaceCounterFlags(1)
	
	}
	
	
	
	operator fun plus(mask: SurfaceCounterFlags) = SurfaceCounterFlags(value or mask.value)
	
	operator fun contains(mask: SurfaceCounterFlags) = value and mask.value == mask.value


}