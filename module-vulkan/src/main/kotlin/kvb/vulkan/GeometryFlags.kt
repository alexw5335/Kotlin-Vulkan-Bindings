// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkGeometryFlagBitsKHR {
 *         VK_GEOMETRY_OPAQUE_BIT_KHR                           = 1
 *         VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR  = 2
 *         VK_GEOMETRY_OPAQUE_BIT_NV                            = 1
 *         VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV   = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class GeometryFlags(val value: Int) {
	
	
	companion object {
		
		val OPAQUE = GeometryFlags(1)
		
		val NO_DUPLICATE_ANY_HIT_INVOCATION = GeometryFlags(2)
	
	}
	
	
	
	operator fun plus(mask: GeometryFlags) = GeometryFlags(value or mask.value)
	
	operator fun contains(mask: GeometryFlags) = value and mask.value == mask.value


}