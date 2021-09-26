// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkBlendFactor {
 *         ZERO                      = 0
 *         ONE                       = 1
 *         SRC_COLOR                 = 2
 *         ONE_MINUS_SRC_COLOR       = 3
 *         DST_COLOR                 = 4
 *         ONE_MINUS_DST_COLOR       = 5
 *         SRC_ALPHA                 = 6
 *         ONE_MINUS_SRC_ALPHA       = 7
 *         DST_ALPHA                 = 8
 *         ONE_MINUS_DST_ALPHA       = 9
 *         CONSTANT_COLOR            = 10
 *         ONE_MINUS_CONSTANT_COLOR  = 11
 *         CONSTANT_ALPHA            = 12
 *         ONE_MINUS_CONSTANT_ALPHA  = 13
 *         SRC_ALPHA_SATURATE        = 14
 *         SRC1_COLOR                = 15
 *         ONE_MINUS_SRC1_COLOR      = 16
 *         SRC1_ALPHA                = 17
 *         ONE_MINUS_SRC1_ALPHA      = 18
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class BlendFactor(val id: Int) {
	
	
	val is_ZERO get() = id == 0
	val is_ONE get() = id == 1
	val is_SRC_COLOR get() = id == 2
	val is_ONE_MINUS_SRC_COLOR get() = id == 3
	val is_DST_COLOR get() = id == 4
	val is_ONE_MINUS_DST_COLOR get() = id == 5
	val is_SRC_ALPHA get() = id == 6
	val is_ONE_MINUS_SRC_ALPHA get() = id == 7
	val is_DST_ALPHA get() = id == 8
	val is_ONE_MINUS_DST_ALPHA get() = id == 9
	val is_CONSTANT_COLOR get() = id == 10
	val is_ONE_MINUS_CONSTANT_COLOR get() = id == 11
	val is_CONSTANT_ALPHA get() = id == 12
	val is_ONE_MINUS_CONSTANT_ALPHA get() = id == 13
	val is_SRC_ALPHA_SATURATE get() = id == 14
	val is_SRC1_COLOR get() = id == 15
	val is_ONE_MINUS_SRC1_COLOR get() = id == 16
	val is_SRC1_ALPHA get() = id == 17
	val is_ONE_MINUS_SRC1_ALPHA get() = id == 18
	
	
	
	override fun toString() = when(id) {
		ZERO.id -> "ZERO"
		ONE.id -> "ONE"
		SRC_COLOR.id -> "SRC_COLOR"
		ONE_MINUS_SRC_COLOR.id -> "ONE_MINUS_SRC_COLOR"
		DST_COLOR.id -> "DST_COLOR"
		ONE_MINUS_DST_COLOR.id -> "ONE_MINUS_DST_COLOR"
		SRC_ALPHA.id -> "SRC_ALPHA"
		ONE_MINUS_SRC_ALPHA.id -> "ONE_MINUS_SRC_ALPHA"
		DST_ALPHA.id -> "DST_ALPHA"
		ONE_MINUS_DST_ALPHA.id -> "ONE_MINUS_DST_ALPHA"
		CONSTANT_COLOR.id -> "CONSTANT_COLOR"
		ONE_MINUS_CONSTANT_COLOR.id -> "ONE_MINUS_CONSTANT_COLOR"
		CONSTANT_ALPHA.id -> "CONSTANT_ALPHA"
		ONE_MINUS_CONSTANT_ALPHA.id -> "ONE_MINUS_CONSTANT_ALPHA"
		SRC_ALPHA_SATURATE.id -> "SRC_ALPHA_SATURATE"
		SRC1_COLOR.id -> "SRC1_COLOR"
		ONE_MINUS_SRC1_COLOR.id -> "ONE_MINUS_SRC1_COLOR"
		SRC1_ALPHA.id -> "SRC1_ALPHA"
		ONE_MINUS_SRC1_ALPHA.id -> "ONE_MINUS_SRC1_ALPHA"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val ZERO get() = BlendFactor(0)
		val ONE get() = BlendFactor(1)
		val SRC_COLOR get() = BlendFactor(2)
		val ONE_MINUS_SRC_COLOR get() = BlendFactor(3)
		val DST_COLOR get() = BlendFactor(4)
		val ONE_MINUS_DST_COLOR get() = BlendFactor(5)
		val SRC_ALPHA get() = BlendFactor(6)
		val ONE_MINUS_SRC_ALPHA get() = BlendFactor(7)
		val DST_ALPHA get() = BlendFactor(8)
		val ONE_MINUS_DST_ALPHA get() = BlendFactor(9)
		val CONSTANT_COLOR get() = BlendFactor(10)
		val ONE_MINUS_CONSTANT_COLOR get() = BlendFactor(11)
		val CONSTANT_ALPHA get() = BlendFactor(12)
		val ONE_MINUS_CONSTANT_ALPHA get() = BlendFactor(13)
		val SRC_ALPHA_SATURATE get() = BlendFactor(14)
		val SRC1_COLOR get() = BlendFactor(15)
		val ONE_MINUS_SRC1_COLOR get() = BlendFactor(16)
		val SRC1_ALPHA get() = BlendFactor(17)
		val ONE_MINUS_SRC1_ALPHA get() = BlendFactor(18)
	
	}


}