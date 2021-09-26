// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPointClippingBehaviorKHR {
 *         ALL_CLIP_PLANES            = 0
 *         USER_CLIP_PLANES_ONLY      = 1
 *         ALL_CLIP_PLANES_KHR        = 0
 *         USER_CLIP_PLANES_ONLY_KHR  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PointClippingBehavior(val id: Int) {
	
	
	val is_ALL_CLIP_PLANES get() = id == 0
	val is_USER_CLIP_PLANES_ONLY get() = id == 1
	val is_ALL_CLIP_PLANES_KHR get() = id == 0
	val is_USER_CLIP_PLANES_ONLY_KHR get() = id == 1
	
	
	
	override fun toString() = when(id) {
		ALL_CLIP_PLANES.id -> "ALL_CLIP_PLANES"
		USER_CLIP_PLANES_ONLY.id -> "USER_CLIP_PLANES_ONLY"
		ALL_CLIP_PLANES_KHR.id -> "ALL_CLIP_PLANES_KHR"
		USER_CLIP_PLANES_ONLY_KHR.id -> "USER_CLIP_PLANES_ONLY_KHR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val ALL_CLIP_PLANES get() = PointClippingBehavior(0)
		val USER_CLIP_PLANES_ONLY get() = PointClippingBehavior(1)
		val ALL_CLIP_PLANES_KHR get() = PointClippingBehavior(0)
		val USER_CLIP_PLANES_ONLY_KHR get() = PointClippingBehavior(1)
	
	}


}