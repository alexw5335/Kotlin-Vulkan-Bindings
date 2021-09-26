// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkShadingRatePaletteEntryNV {
 *         NO_INVOCATIONS                = 0
 *         _16_INVOCATIONS_PER_PIXEL     = 1
 *         _8_INVOCATIONS_PER_PIXEL      = 2
 *         _4_INVOCATIONS_PER_PIXEL      = 3
 *         _2_INVOCATIONS_PER_PIXEL      = 4
 *         _1_INVOCATION_PER_PIXEL       = 5
 *         _1_INVOCATION_PER_2X1_PIXELS  = 6
 *         _1_INVOCATION_PER_1X2_PIXELS  = 7
 *         _1_INVOCATION_PER_2X2_PIXELS  = 8
 *         _1_INVOCATION_PER_4X2_PIXELS  = 9
 *         _1_INVOCATION_PER_2X4_PIXELS  = 10
 *         _1_INVOCATION_PER_4X4_PIXELS  = 11
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ShadingRatePaletteEntry(val id: Int) {
	
	
	val is_NO_INVOCATIONS get() = id == 0
	val is_16_INVOCATIONS_PER_PIXEL get() = id == 1
	val is_8_INVOCATIONS_PER_PIXEL get() = id == 2
	val is_4_INVOCATIONS_PER_PIXEL get() = id == 3
	val is_2_INVOCATIONS_PER_PIXEL get() = id == 4
	val is_1_INVOCATION_PER_PIXEL get() = id == 5
	val is_1_INVOCATION_PER_2X1_PIXELS get() = id == 6
	val is_1_INVOCATION_PER_1X2_PIXELS get() = id == 7
	val is_1_INVOCATION_PER_2X2_PIXELS get() = id == 8
	val is_1_INVOCATION_PER_4X2_PIXELS get() = id == 9
	val is_1_INVOCATION_PER_2X4_PIXELS get() = id == 10
	val is_1_INVOCATION_PER_4X4_PIXELS get() = id == 11
	
	
	
	override fun toString() = when(id) {
		NO_INVOCATIONS.id -> "NO_INVOCATIONS"
		_16_INVOCATIONS_PER_PIXEL.id -> "_16_INVOCATIONS_PER_PIXEL"
		_8_INVOCATIONS_PER_PIXEL.id -> "_8_INVOCATIONS_PER_PIXEL"
		_4_INVOCATIONS_PER_PIXEL.id -> "_4_INVOCATIONS_PER_PIXEL"
		_2_INVOCATIONS_PER_PIXEL.id -> "_2_INVOCATIONS_PER_PIXEL"
		_1_INVOCATION_PER_PIXEL.id -> "_1_INVOCATION_PER_PIXEL"
		_1_INVOCATION_PER_2X1_PIXELS.id -> "_1_INVOCATION_PER_2X1_PIXELS"
		_1_INVOCATION_PER_1X2_PIXELS.id -> "_1_INVOCATION_PER_1X2_PIXELS"
		_1_INVOCATION_PER_2X2_PIXELS.id -> "_1_INVOCATION_PER_2X2_PIXELS"
		_1_INVOCATION_PER_4X2_PIXELS.id -> "_1_INVOCATION_PER_4X2_PIXELS"
		_1_INVOCATION_PER_2X4_PIXELS.id -> "_1_INVOCATION_PER_2X4_PIXELS"
		_1_INVOCATION_PER_4X4_PIXELS.id -> "_1_INVOCATION_PER_4X4_PIXELS"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val NO_INVOCATIONS get() = ShadingRatePaletteEntry(0)
		val _16_INVOCATIONS_PER_PIXEL get() = ShadingRatePaletteEntry(1)
		val _8_INVOCATIONS_PER_PIXEL get() = ShadingRatePaletteEntry(2)
		val _4_INVOCATIONS_PER_PIXEL get() = ShadingRatePaletteEntry(3)
		val _2_INVOCATIONS_PER_PIXEL get() = ShadingRatePaletteEntry(4)
		val _1_INVOCATION_PER_PIXEL get() = ShadingRatePaletteEntry(5)
		val _1_INVOCATION_PER_2X1_PIXELS get() = ShadingRatePaletteEntry(6)
		val _1_INVOCATION_PER_1X2_PIXELS get() = ShadingRatePaletteEntry(7)
		val _1_INVOCATION_PER_2X2_PIXELS get() = ShadingRatePaletteEntry(8)
		val _1_INVOCATION_PER_4X2_PIXELS get() = ShadingRatePaletteEntry(9)
		val _1_INVOCATION_PER_2X4_PIXELS get() = ShadingRatePaletteEntry(10)
		val _1_INVOCATION_PER_4X4_PIXELS get() = ShadingRatePaletteEntry(11)
	
	}


}