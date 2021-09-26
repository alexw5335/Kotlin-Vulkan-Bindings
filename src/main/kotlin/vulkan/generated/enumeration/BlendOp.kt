// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkBlendOp {
 *         ADD                 = 0
 *         SUBTRACT            = 1
 *         REVERSE_SUBTRACT    = 2
 *         MIN                 = 3
 *         MAX                 = 4
 *         ZERO                = 1000148000
 *         SRC                 = 1000148001
 *         DST                 = 1000148002
 *         SRC_OVER            = 1000148003
 *         DST_OVER            = 1000148004
 *         SRC_IN              = 1000148005
 *         DST_IN              = 1000148006
 *         SRC_OUT             = 1000148007
 *         DST_OUT             = 1000148008
 *         SRC_ATOP            = 1000148009
 *         DST_ATOP            = 1000148010
 *         XOR                 = 1000148011
 *         MULTIPLY            = 1000148012
 *         SCREEN              = 1000148013
 *         OVERLAY             = 1000148014
 *         DARKEN              = 1000148015
 *         LIGHTEN             = 1000148016
 *         COLORDODGE          = 1000148017
 *         COLORBURN           = 1000148018
 *         HARDLIGHT           = 1000148019
 *         SOFTLIGHT           = 1000148020
 *         DIFFERENCE          = 1000148021
 *         EXCLUSION           = 1000148022
 *         INVERT              = 1000148023
 *         INVERT_RGB          = 1000148024
 *         LINEARDODGE         = 1000148025
 *         LINEARBURN          = 1000148026
 *         VIVIDLIGHT          = 1000148027
 *         LINEARLIGHT         = 1000148028
 *         PINLIGHT            = 1000148029
 *         HARDMIX             = 1000148030
 *         HSL_HUE             = 1000148031
 *         HSL_SATURATION      = 1000148032
 *         HSL_COLOR           = 1000148033
 *         HSL_LUMINOSITY      = 1000148034
 *         PLUS                = 1000148035
 *         PLUS_CLAMPED        = 1000148036
 *         PLUS_CLAMPED_ALPHA  = 1000148037
 *         PLUS_DARKER         = 1000148038
 *         MINUS               = 1000148039
 *         MINUS_CLAMPED       = 1000148040
 *         CONTRAST            = 1000148041
 *         INVERT_OVG          = 1000148042
 *         RED                 = 1000148043
 *         GREEN               = 1000148044
 *         BLUE                = 1000148045
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class BlendOp(val id: Int) {
	
	
	val is_ADD get() = id == 0
	val is_SUBTRACT get() = id == 1
	val is_REVERSE_SUBTRACT get() = id == 2
	val is_MIN get() = id == 3
	val is_MAX get() = id == 4
	val is_ZERO get() = id == 1000148000
	val is_SRC get() = id == 1000148001
	val is_DST get() = id == 1000148002
	val is_SRC_OVER get() = id == 1000148003
	val is_DST_OVER get() = id == 1000148004
	val is_SRC_IN get() = id == 1000148005
	val is_DST_IN get() = id == 1000148006
	val is_SRC_OUT get() = id == 1000148007
	val is_DST_OUT get() = id == 1000148008
	val is_SRC_ATOP get() = id == 1000148009
	val is_DST_ATOP get() = id == 1000148010
	val is_XOR get() = id == 1000148011
	val is_MULTIPLY get() = id == 1000148012
	val is_SCREEN get() = id == 1000148013
	val is_OVERLAY get() = id == 1000148014
	val is_DARKEN get() = id == 1000148015
	val is_LIGHTEN get() = id == 1000148016
	val is_COLORDODGE get() = id == 1000148017
	val is_COLORBURN get() = id == 1000148018
	val is_HARDLIGHT get() = id == 1000148019
	val is_SOFTLIGHT get() = id == 1000148020
	val is_DIFFERENCE get() = id == 1000148021
	val is_EXCLUSION get() = id == 1000148022
	val is_INVERT get() = id == 1000148023
	val is_INVERT_RGB get() = id == 1000148024
	val is_LINEARDODGE get() = id == 1000148025
	val is_LINEARBURN get() = id == 1000148026
	val is_VIVIDLIGHT get() = id == 1000148027
	val is_LINEARLIGHT get() = id == 1000148028
	val is_PINLIGHT get() = id == 1000148029
	val is_HARDMIX get() = id == 1000148030
	val is_HSL_HUE get() = id == 1000148031
	val is_HSL_SATURATION get() = id == 1000148032
	val is_HSL_COLOR get() = id == 1000148033
	val is_HSL_LUMINOSITY get() = id == 1000148034
	val is_PLUS get() = id == 1000148035
	val is_PLUS_CLAMPED get() = id == 1000148036
	val is_PLUS_CLAMPED_ALPHA get() = id == 1000148037
	val is_PLUS_DARKER get() = id == 1000148038
	val is_MINUS get() = id == 1000148039
	val is_MINUS_CLAMPED get() = id == 1000148040
	val is_CONTRAST get() = id == 1000148041
	val is_INVERT_OVG get() = id == 1000148042
	val is_RED get() = id == 1000148043
	val is_GREEN get() = id == 1000148044
	val is_BLUE get() = id == 1000148045
	
	
	
	override fun toString() = when(id) {
		ADD.id -> "ADD"
		SUBTRACT.id -> "SUBTRACT"
		REVERSE_SUBTRACT.id -> "REVERSE_SUBTRACT"
		MIN.id -> "MIN"
		MAX.id -> "MAX"
		ZERO.id -> "ZERO"
		SRC.id -> "SRC"
		DST.id -> "DST"
		SRC_OVER.id -> "SRC_OVER"
		DST_OVER.id -> "DST_OVER"
		SRC_IN.id -> "SRC_IN"
		DST_IN.id -> "DST_IN"
		SRC_OUT.id -> "SRC_OUT"
		DST_OUT.id -> "DST_OUT"
		SRC_ATOP.id -> "SRC_ATOP"
		DST_ATOP.id -> "DST_ATOP"
		XOR.id -> "XOR"
		MULTIPLY.id -> "MULTIPLY"
		SCREEN.id -> "SCREEN"
		OVERLAY.id -> "OVERLAY"
		DARKEN.id -> "DARKEN"
		LIGHTEN.id -> "LIGHTEN"
		COLORDODGE.id -> "COLORDODGE"
		COLORBURN.id -> "COLORBURN"
		HARDLIGHT.id -> "HARDLIGHT"
		SOFTLIGHT.id -> "SOFTLIGHT"
		DIFFERENCE.id -> "DIFFERENCE"
		EXCLUSION.id -> "EXCLUSION"
		INVERT.id -> "INVERT"
		INVERT_RGB.id -> "INVERT_RGB"
		LINEARDODGE.id -> "LINEARDODGE"
		LINEARBURN.id -> "LINEARBURN"
		VIVIDLIGHT.id -> "VIVIDLIGHT"
		LINEARLIGHT.id -> "LINEARLIGHT"
		PINLIGHT.id -> "PINLIGHT"
		HARDMIX.id -> "HARDMIX"
		HSL_HUE.id -> "HSL_HUE"
		HSL_SATURATION.id -> "HSL_SATURATION"
		HSL_COLOR.id -> "HSL_COLOR"
		HSL_LUMINOSITY.id -> "HSL_LUMINOSITY"
		PLUS.id -> "PLUS"
		PLUS_CLAMPED.id -> "PLUS_CLAMPED"
		PLUS_CLAMPED_ALPHA.id -> "PLUS_CLAMPED_ALPHA"
		PLUS_DARKER.id -> "PLUS_DARKER"
		MINUS.id -> "MINUS"
		MINUS_CLAMPED.id -> "MINUS_CLAMPED"
		CONTRAST.id -> "CONTRAST"
		INVERT_OVG.id -> "INVERT_OVG"
		RED.id -> "RED"
		GREEN.id -> "GREEN"
		BLUE.id -> "BLUE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val ADD get() = BlendOp(0)
		val SUBTRACT get() = BlendOp(1)
		val REVERSE_SUBTRACT get() = BlendOp(2)
		val MIN get() = BlendOp(3)
		val MAX get() = BlendOp(4)
		val ZERO get() = BlendOp(1000148000)
		val SRC get() = BlendOp(1000148001)
		val DST get() = BlendOp(1000148002)
		val SRC_OVER get() = BlendOp(1000148003)
		val DST_OVER get() = BlendOp(1000148004)
		val SRC_IN get() = BlendOp(1000148005)
		val DST_IN get() = BlendOp(1000148006)
		val SRC_OUT get() = BlendOp(1000148007)
		val DST_OUT get() = BlendOp(1000148008)
		val SRC_ATOP get() = BlendOp(1000148009)
		val DST_ATOP get() = BlendOp(1000148010)
		val XOR get() = BlendOp(1000148011)
		val MULTIPLY get() = BlendOp(1000148012)
		val SCREEN get() = BlendOp(1000148013)
		val OVERLAY get() = BlendOp(1000148014)
		val DARKEN get() = BlendOp(1000148015)
		val LIGHTEN get() = BlendOp(1000148016)
		val COLORDODGE get() = BlendOp(1000148017)
		val COLORBURN get() = BlendOp(1000148018)
		val HARDLIGHT get() = BlendOp(1000148019)
		val SOFTLIGHT get() = BlendOp(1000148020)
		val DIFFERENCE get() = BlendOp(1000148021)
		val EXCLUSION get() = BlendOp(1000148022)
		val INVERT get() = BlendOp(1000148023)
		val INVERT_RGB get() = BlendOp(1000148024)
		val LINEARDODGE get() = BlendOp(1000148025)
		val LINEARBURN get() = BlendOp(1000148026)
		val VIVIDLIGHT get() = BlendOp(1000148027)
		val LINEARLIGHT get() = BlendOp(1000148028)
		val PINLIGHT get() = BlendOp(1000148029)
		val HARDMIX get() = BlendOp(1000148030)
		val HSL_HUE get() = BlendOp(1000148031)
		val HSL_SATURATION get() = BlendOp(1000148032)
		val HSL_COLOR get() = BlendOp(1000148033)
		val HSL_LUMINOSITY get() = BlendOp(1000148034)
		val PLUS get() = BlendOp(1000148035)
		val PLUS_CLAMPED get() = BlendOp(1000148036)
		val PLUS_CLAMPED_ALPHA get() = BlendOp(1000148037)
		val PLUS_DARKER get() = BlendOp(1000148038)
		val MINUS get() = BlendOp(1000148039)
		val MINUS_CLAMPED get() = BlendOp(1000148040)
		val CONTRAST get() = BlendOp(1000148041)
		val INVERT_OVG get() = BlendOp(1000148042)
		val RED get() = BlendOp(1000148043)
		val GREEN get() = BlendOp(1000148044)
		val BLUE get() = BlendOp(1000148045)
	
	}


}