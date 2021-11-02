// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkStencilFaceFlagBits {
 *         VK_STENCIL_FACE_FRONT_BIT       = 1
 *         VK_STENCIL_FACE_BACK_BIT        = 2
 *         VK_STENCIL_FACE_FRONT_AND_BACK  = 0x00000003
 *         VK_STENCIL_FRONT_AND_BACK       = 0x00000003
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class StencilFaceFlags(val value: Int) {
	
	
	companion object {
		
		val FRONT = StencilFaceFlags(1)
		
		val BACK = StencilFaceFlags(2)
		
		val FRONT_AND_BACK = StencilFaceFlags(0x00000003)
	
	}
	
	
	
	operator fun plus(mask: StencilFaceFlags) = StencilFaceFlags(value or mask.value)
	
	operator fun contains(mask: StencilFaceFlags) = value and mask.value == mask.value


}