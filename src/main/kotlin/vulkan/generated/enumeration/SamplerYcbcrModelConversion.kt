// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSamplerYcbcrModelConversionKHR {
 *         RGB_IDENTITY        = 0
 *         YCBCR_IDENTITY      = 1
 *         YCBCR_709           = 2
 *         YCBCR_601           = 3
 *         YCBCR_2020          = 4
 *         RGB_IDENTITY_KHR    = 0
 *         YCBCR_IDENTITY_KHR  = 1
 *         YCBCR_709_KHR       = 2
 *         YCBCR_601_KHR       = 3
 *         YCBCR_2020_KHR      = 4
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class SamplerYcbcrModelConversion(val id: Int) {
	
	
	val is_RGB_IDENTITY get() = id == 0
	val is_YCBCR_IDENTITY get() = id == 1
	val is_YCBCR_709 get() = id == 2
	val is_YCBCR_601 get() = id == 3
	val is_YCBCR_2020 get() = id == 4
	val is_RGB_IDENTITY_KHR get() = id == 0
	val is_YCBCR_IDENTITY_KHR get() = id == 1
	val is_YCBCR_709_KHR get() = id == 2
	val is_YCBCR_601_KHR get() = id == 3
	val is_YCBCR_2020_KHR get() = id == 4
	
	
	
	override fun toString() = when(id) {
		RGB_IDENTITY.id -> "RGB_IDENTITY"
		YCBCR_IDENTITY.id -> "YCBCR_IDENTITY"
		YCBCR_709.id -> "YCBCR_709"
		YCBCR_601.id -> "YCBCR_601"
		YCBCR_2020.id -> "YCBCR_2020"
		RGB_IDENTITY_KHR.id -> "RGB_IDENTITY_KHR"
		YCBCR_IDENTITY_KHR.id -> "YCBCR_IDENTITY_KHR"
		YCBCR_709_KHR.id -> "YCBCR_709_KHR"
		YCBCR_601_KHR.id -> "YCBCR_601_KHR"
		YCBCR_2020_KHR.id -> "YCBCR_2020_KHR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val RGB_IDENTITY get() = SamplerYcbcrModelConversion(0)
		val YCBCR_IDENTITY get() = SamplerYcbcrModelConversion(1)
		val YCBCR_709 get() = SamplerYcbcrModelConversion(2)
		val YCBCR_601 get() = SamplerYcbcrModelConversion(3)
		val YCBCR_2020 get() = SamplerYcbcrModelConversion(4)
		val RGB_IDENTITY_KHR get() = SamplerYcbcrModelConversion(0)
		val YCBCR_IDENTITY_KHR get() = SamplerYcbcrModelConversion(1)
		val YCBCR_709_KHR get() = SamplerYcbcrModelConversion(2)
		val YCBCR_601_KHR get() = SamplerYcbcrModelConversion(3)
		val YCBCR_2020_KHR get() = SamplerYcbcrModelConversion(4)
	
	}


}