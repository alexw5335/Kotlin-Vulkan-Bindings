// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkGeometryInstanceFlagBitsKHR {
 *         TRIANGLE_FACING_CULL_DISABLE        = 1
 *         TRIANGLE_FRONT_COUNTERCLOCKWISE     = 2
 *         FORCE_OPAQUE                        = 4
 *         FORCE_NO_OPAQUE                     = 8
 *         TRIANGLE_CULL_DISABLE               = 1
 *         TRIANGLE_FRONT_COUNTERCLOCKWISE_NV  = 2
 *         FORCE_OPAQUE_NV                     = 4
 *         FORCE_NO_OPAQUE_NV                  = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class GeometryInstanceFlags(val bitfield: Int) {
	
	
	val is_TRIANGLE_FACING_CULL_DISABLE get() = bitfield and 1 != 0
	val is_TRIANGLE_FRONT_COUNTERCLOCKWISE get() = bitfield and 2 != 0
	val is_FORCE_OPAQUE get() = bitfield and 4 != 0
	val is_FORCE_NO_OPAQUE get() = bitfield and 8 != 0
	val is_TRIANGLE_CULL_DISABLE get() = bitfield and 1 != 0
	val is_TRIANGLE_FRONT_COUNTERCLOCKWISE_NV get() = bitfield and 2 != 0
	val is_FORCE_OPAQUE_NV get() = bitfield and 4 != 0
	val is_FORCE_NO_OPAQUE_NV get() = bitfield and 8 != 0
	
	
	
	infix operator fun plus(other: GeometryInstanceFlags) = GeometryInstanceFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = GeometryInstanceFlags(bitfield or other)
	
	infix fun containsAll(mask: GeometryInstanceFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: GeometryInstanceFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_TRIANGLE_FACING_CULL_DISABLE) append("TRIANGLE_FACING_CULL_DISABLE, ")
		if(is_TRIANGLE_FRONT_COUNTERCLOCKWISE) append("TRIANGLE_FRONT_COUNTERCLOCKWISE, ")
		if(is_FORCE_OPAQUE) append("FORCE_OPAQUE, ")
		if(is_FORCE_NO_OPAQUE) append("FORCE_NO_OPAQUE, ")
		if(is_TRIANGLE_CULL_DISABLE) append("TRIANGLE_CULL_DISABLE, ")
		if(is_TRIANGLE_FRONT_COUNTERCLOCKWISE_NV) append("TRIANGLE_FRONT_COUNTERCLOCKWISE_NV, ")
		if(is_FORCE_OPAQUE_NV) append("FORCE_OPAQUE_NV, ")
		if(is_FORCE_NO_OPAQUE_NV) append("FORCE_NO_OPAQUE_NV, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = GeometryInstanceFlags(0)
		val ALL get() = GeometryInstanceFlags(30)
		val TRIANGLE_FACING_CULL_DISABLE get() = GeometryInstanceFlags(1)
		val TRIANGLE_FRONT_COUNTERCLOCKWISE get() = GeometryInstanceFlags(2)
		val FORCE_OPAQUE get() = GeometryInstanceFlags(4)
		val FORCE_NO_OPAQUE get() = GeometryInstanceFlags(8)
		val TRIANGLE_CULL_DISABLE get() = GeometryInstanceFlags(1)
		val TRIANGLE_FRONT_COUNTERCLOCKWISE_NV get() = GeometryInstanceFlags(2)
		val FORCE_OPAQUE_NV get() = GeometryInstanceFlags(4)
		val FORCE_NO_OPAQUE_NV get() = GeometryInstanceFlags(8)
		
		inline fun compose(block: Companion.() -> GeometryInstanceFlags) = block(Companion)
	
	}


}