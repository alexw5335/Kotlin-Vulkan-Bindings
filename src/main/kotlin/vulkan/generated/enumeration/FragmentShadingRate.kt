// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkFragmentShadingRateNV {
 *         _1_INVOCATION_PER_PIXEL       = 0
 *         _1_INVOCATION_PER_1X2_PIXELS  = 1
 *         _1_INVOCATION_PER_2X1_PIXELS  = 4
 *         _1_INVOCATION_PER_2X2_PIXELS  = 5
 *         _1_INVOCATION_PER_2X4_PIXELS  = 6
 *         _1_INVOCATION_PER_4X2_PIXELS  = 9
 *         _1_INVOCATION_PER_4X4_PIXELS  = 10
 *         _2_INVOCATIONS_PER_PIXEL      = 11
 *         _4_INVOCATIONS_PER_PIXEL      = 12
 *         _8_INVOCATIONS_PER_PIXEL      = 13
 *         _16_INVOCATIONS_PER_PIXEL     = 14
 *         NO_INVOCATIONS                = 15
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class FragmentShadingRate(val id: Int) {
	
	
	val is_1_INVOCATION_PER_PIXEL get() = id == 0
	val is_1_INVOCATION_PER_1X2_PIXELS get() = id == 1
	val is_1_INVOCATION_PER_2X1_PIXELS get() = id == 4
	val is_1_INVOCATION_PER_2X2_PIXELS get() = id == 5
	val is_1_INVOCATION_PER_2X4_PIXELS get() = id == 6
	val is_1_INVOCATION_PER_4X2_PIXELS get() = id == 9
	val is_1_INVOCATION_PER_4X4_PIXELS get() = id == 10
	val is_2_INVOCATIONS_PER_PIXEL get() = id == 11
	val is_4_INVOCATIONS_PER_PIXEL get() = id == 12
	val is_8_INVOCATIONS_PER_PIXEL get() = id == 13
	val is_16_INVOCATIONS_PER_PIXEL get() = id == 14
	val is_NO_INVOCATIONS get() = id == 15
	
	
	
	override fun toString() = when(id) {
		_1_INVOCATION_PER_PIXEL.id -> "_1_INVOCATION_PER_PIXEL"
		_1_INVOCATION_PER_1X2_PIXELS.id -> "_1_INVOCATION_PER_1X2_PIXELS"
		_1_INVOCATION_PER_2X1_PIXELS.id -> "_1_INVOCATION_PER_2X1_PIXELS"
		_1_INVOCATION_PER_2X2_PIXELS.id -> "_1_INVOCATION_PER_2X2_PIXELS"
		_1_INVOCATION_PER_2X4_PIXELS.id -> "_1_INVOCATION_PER_2X4_PIXELS"
		_1_INVOCATION_PER_4X2_PIXELS.id -> "_1_INVOCATION_PER_4X2_PIXELS"
		_1_INVOCATION_PER_4X4_PIXELS.id -> "_1_INVOCATION_PER_4X4_PIXELS"
		_2_INVOCATIONS_PER_PIXEL.id -> "_2_INVOCATIONS_PER_PIXEL"
		_4_INVOCATIONS_PER_PIXEL.id -> "_4_INVOCATIONS_PER_PIXEL"
		_8_INVOCATIONS_PER_PIXEL.id -> "_8_INVOCATIONS_PER_PIXEL"
		_16_INVOCATIONS_PER_PIXEL.id -> "_16_INVOCATIONS_PER_PIXEL"
		NO_INVOCATIONS.id -> "NO_INVOCATIONS"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val _1_INVOCATION_PER_PIXEL get() = FragmentShadingRate(0)
		val _1_INVOCATION_PER_1X2_PIXELS get() = FragmentShadingRate(1)
		val _1_INVOCATION_PER_2X1_PIXELS get() = FragmentShadingRate(4)
		val _1_INVOCATION_PER_2X2_PIXELS get() = FragmentShadingRate(5)
		val _1_INVOCATION_PER_2X4_PIXELS get() = FragmentShadingRate(6)
		val _1_INVOCATION_PER_4X2_PIXELS get() = FragmentShadingRate(9)
		val _1_INVOCATION_PER_4X4_PIXELS get() = FragmentShadingRate(10)
		val _2_INVOCATIONS_PER_PIXEL get() = FragmentShadingRate(11)
		val _4_INVOCATIONS_PER_PIXEL get() = FragmentShadingRate(12)
		val _8_INVOCATIONS_PER_PIXEL get() = FragmentShadingRate(13)
		val _16_INVOCATIONS_PER_PIXEL get() = FragmentShadingRate(14)
		val NO_INVOCATIONS get() = FragmentShadingRate(15)
	
	}


}