// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkColorSpaceKHR {
 *         SRGB_NONLINEAR             = 0
 *         COLORSPACE_SRGB_NONLINEAR  = 0
 *         DISPLAY_P3_NONLINEAR       = 1000104001
 *         EXTENDED_SRGB_LINEAR       = 1000104002
 *         DISPLAY_P3_LINEAR          = 1000104003
 *         DCI_P3_NONLINEAR           = 1000104004
 *         BT709_LINEAR               = 1000104005
 *         BT709_NONLINEAR            = 1000104006
 *         BT2020_LINEAR              = 1000104007
 *         HDR10_ST2084               = 1000104008
 *         DOLBYVISION                = 1000104009
 *         HDR10_HLG                  = 1000104010
 *         ADOBERGB_LINEAR            = 1000104011
 *         ADOBERGB_NONLINEAR         = 1000104012
 *         PASS_THROUGH               = 1000104013
 *         EXTENDED_SRGB_NONLINEAR    = 1000104014
 *         DCI_P3_LINEAR              = 1000104003
 *         DISPLAY_NATIVE             = 1000213000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ColorSpace(val id: Int) {
	
	
	val is_SRGB_NONLINEAR get() = id == 0
	val is_COLORSPACE_SRGB_NONLINEAR get() = id == 0
	val is_DISPLAY_P3_NONLINEAR get() = id == 1000104001
	val is_EXTENDED_SRGB_LINEAR get() = id == 1000104002
	val is_DISPLAY_P3_LINEAR get() = id == 1000104003
	val is_DCI_P3_NONLINEAR get() = id == 1000104004
	val is_BT709_LINEAR get() = id == 1000104005
	val is_BT709_NONLINEAR get() = id == 1000104006
	val is_BT2020_LINEAR get() = id == 1000104007
	val is_HDR10_ST2084 get() = id == 1000104008
	val is_DOLBYVISION get() = id == 1000104009
	val is_HDR10_HLG get() = id == 1000104010
	val is_ADOBERGB_LINEAR get() = id == 1000104011
	val is_ADOBERGB_NONLINEAR get() = id == 1000104012
	val is_PASS_THROUGH get() = id == 1000104013
	val is_EXTENDED_SRGB_NONLINEAR get() = id == 1000104014
	val is_DCI_P3_LINEAR get() = id == 1000104003
	val is_DISPLAY_NATIVE get() = id == 1000213000
	
	
	
	override fun toString() = when(id) {
		SRGB_NONLINEAR.id -> "SRGB_NONLINEAR"
		COLORSPACE_SRGB_NONLINEAR.id -> "COLORSPACE_SRGB_NONLINEAR"
		DISPLAY_P3_NONLINEAR.id -> "DISPLAY_P3_NONLINEAR"
		EXTENDED_SRGB_LINEAR.id -> "EXTENDED_SRGB_LINEAR"
		DISPLAY_P3_LINEAR.id -> "DISPLAY_P3_LINEAR"
		DCI_P3_NONLINEAR.id -> "DCI_P3_NONLINEAR"
		BT709_LINEAR.id -> "BT709_LINEAR"
		BT709_NONLINEAR.id -> "BT709_NONLINEAR"
		BT2020_LINEAR.id -> "BT2020_LINEAR"
		HDR10_ST2084.id -> "HDR10_ST2084"
		DOLBYVISION.id -> "DOLBYVISION"
		HDR10_HLG.id -> "HDR10_HLG"
		ADOBERGB_LINEAR.id -> "ADOBERGB_LINEAR"
		ADOBERGB_NONLINEAR.id -> "ADOBERGB_NONLINEAR"
		PASS_THROUGH.id -> "PASS_THROUGH"
		EXTENDED_SRGB_NONLINEAR.id -> "EXTENDED_SRGB_NONLINEAR"
		DCI_P3_LINEAR.id -> "DCI_P3_LINEAR"
		DISPLAY_NATIVE.id -> "DISPLAY_NATIVE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val SRGB_NONLINEAR get() = ColorSpace(0)
		val COLORSPACE_SRGB_NONLINEAR get() = ColorSpace(0)
		val DISPLAY_P3_NONLINEAR get() = ColorSpace(1000104001)
		val EXTENDED_SRGB_LINEAR get() = ColorSpace(1000104002)
		val DISPLAY_P3_LINEAR get() = ColorSpace(1000104003)
		val DCI_P3_NONLINEAR get() = ColorSpace(1000104004)
		val BT709_LINEAR get() = ColorSpace(1000104005)
		val BT709_NONLINEAR get() = ColorSpace(1000104006)
		val BT2020_LINEAR get() = ColorSpace(1000104007)
		val HDR10_ST2084 get() = ColorSpace(1000104008)
		val DOLBYVISION get() = ColorSpace(1000104009)
		val HDR10_HLG get() = ColorSpace(1000104010)
		val ADOBERGB_LINEAR get() = ColorSpace(1000104011)
		val ADOBERGB_NONLINEAR get() = ColorSpace(1000104012)
		val PASS_THROUGH get() = ColorSpace(1000104013)
		val EXTENDED_SRGB_NONLINEAR get() = ColorSpace(1000104014)
		val DCI_P3_LINEAR get() = ColorSpace(1000104003)
		val DISPLAY_NATIVE get() = ColorSpace(1000213000)
	
	}


}