// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_surface

 *     enum VkSurfaceTransformFlagBitsKHR {
 *         VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR                      = 1
 *         VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR                     = 2
 *         VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR                    = 4
 *         VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR                    = 8
 *         VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR             = 16
 *         VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR   = 32
 *         VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR  = 64
 *         VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR  = 128
 *         VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR                       = 256
 *     }
 */
@Suppress("unused")
@JvmInline
value class SurfaceTransformFlags(val value: Int) {
	
	
	companion object {
		
		val IDENTITY = SurfaceTransformFlags(1)
		
		val ROTATE_90 = SurfaceTransformFlags(2)
		
		val ROTATE_180 = SurfaceTransformFlags(4)
		
		val ROTATE_270 = SurfaceTransformFlags(8)
		
		val HORIZONTAL_MIRROR = SurfaceTransformFlags(16)
		
		val HORIZONTAL_MIRROR_ROTATE_90 = SurfaceTransformFlags(32)
		
		val HORIZONTAL_MIRROR_ROTATE_180 = SurfaceTransformFlags(64)
		
		val HORIZONTAL_MIRROR_ROTATE_270 = SurfaceTransformFlags(128)
		
		val INHERIT = SurfaceTransformFlags(256)
	
	}
	
	
	
	operator fun plus(mask: SurfaceTransformFlags) = SurfaceTransformFlags(value or mask.value)
	
	operator fun contains(mask: SurfaceTransformFlags) = value and mask.value == mask.value


}