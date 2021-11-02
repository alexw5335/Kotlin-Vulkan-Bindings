// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkGeometryInstanceFlagBitsKHR {
 *         VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR     = 1
 *         VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR  = 2
 *         VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR                     = 4
 *         VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR                  = 8
 *         VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV             = 1
 *         VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV   = 2
 *         VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV                      = 4
 *         VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV                   = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class GeometryInstanceFlags(val value: Int) {
	
	
	companion object {
		
		val TRIANGLE_FACING_CULL_DISABLE = GeometryInstanceFlags(1)
		
		val TRIANGLE_FRONT_COUNTERCLOCKWISE = GeometryInstanceFlags(2)
		
		val FORCE_OPAQUE = GeometryInstanceFlags(4)
		
		val FORCE_NO_OPAQUE = GeometryInstanceFlags(8)
	
	}
	
	
	
	operator fun plus(mask: GeometryInstanceFlags) = GeometryInstanceFlags(value or mask.value)
	
	operator fun contains(mask: GeometryInstanceFlags) = value and mask.value == mask.value


}