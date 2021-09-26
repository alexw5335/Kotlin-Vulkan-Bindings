// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDriverIdKHR {
 *         AMD_PROPRIETARY                = 1
 *         AMD_OPEN_SOURCE                = 2
 *         MESA_RADV                      = 3
 *         NVIDIA_PROPRIETARY             = 4
 *         INTEL_PROPRIETARY_WINDOWS      = 5
 *         INTEL_OPEN_SOURCE_MESA         = 6
 *         IMAGINATION_PROPRIETARY        = 7
 *         QUALCOMM_PROPRIETARY           = 8
 *         ARM_PROPRIETARY                = 9
 *         GOOGLE_SWIFTSHADER             = 10
 *         GGP_PROPRIETARY                = 11
 *         BROADCOM_PROPRIETARY           = 12
 *         MESA_LLVMPIPE                  = 13
 *         MOLTENVK                       = 14
 *         AMD_PROPRIETARY_KHR            = 1
 *         AMD_OPEN_SOURCE_KHR            = 2
 *         MESA_RADV_KHR                  = 3
 *         NVIDIA_PROPRIETARY_KHR         = 4
 *         INTEL_PROPRIETARY_WINDOWS_KHR  = 5
 *         INTEL_OPEN_SOURCE_MESA_KHR     = 6
 *         IMAGINATION_PROPRIETARY_KHR    = 7
 *         QUALCOMM_PROPRIETARY_KHR       = 8
 *         ARM_PROPRIETARY_KHR            = 9
 *         GOOGLE_SWIFTSHADER_KHR         = 10
 *         GGP_PROPRIETARY_KHR            = 11
 *         BROADCOM_PROPRIETARY_KHR       = 12
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class DriverId(val id: Int) {
	
	
	val is_AMD_PROPRIETARY get() = id == 1
	val is_AMD_OPEN_SOURCE get() = id == 2
	val is_MESA_RADV get() = id == 3
	val is_NVIDIA_PROPRIETARY get() = id == 4
	val is_INTEL_PROPRIETARY_WINDOWS get() = id == 5
	val is_INTEL_OPEN_SOURCE_MESA get() = id == 6
	val is_IMAGINATION_PROPRIETARY get() = id == 7
	val is_QUALCOMM_PROPRIETARY get() = id == 8
	val is_ARM_PROPRIETARY get() = id == 9
	val is_GOOGLE_SWIFTSHADER get() = id == 10
	val is_GGP_PROPRIETARY get() = id == 11
	val is_BROADCOM_PROPRIETARY get() = id == 12
	val is_MESA_LLVMPIPE get() = id == 13
	val is_MOLTENVK get() = id == 14
	val is_AMD_PROPRIETARY_KHR get() = id == 1
	val is_AMD_OPEN_SOURCE_KHR get() = id == 2
	val is_MESA_RADV_KHR get() = id == 3
	val is_NVIDIA_PROPRIETARY_KHR get() = id == 4
	val is_INTEL_PROPRIETARY_WINDOWS_KHR get() = id == 5
	val is_INTEL_OPEN_SOURCE_MESA_KHR get() = id == 6
	val is_IMAGINATION_PROPRIETARY_KHR get() = id == 7
	val is_QUALCOMM_PROPRIETARY_KHR get() = id == 8
	val is_ARM_PROPRIETARY_KHR get() = id == 9
	val is_GOOGLE_SWIFTSHADER_KHR get() = id == 10
	val is_GGP_PROPRIETARY_KHR get() = id == 11
	val is_BROADCOM_PROPRIETARY_KHR get() = id == 12
	
	
	
	override fun toString() = when(id) {
		AMD_PROPRIETARY.id -> "AMD_PROPRIETARY"
		AMD_OPEN_SOURCE.id -> "AMD_OPEN_SOURCE"
		MESA_RADV.id -> "MESA_RADV"
		NVIDIA_PROPRIETARY.id -> "NVIDIA_PROPRIETARY"
		INTEL_PROPRIETARY_WINDOWS.id -> "INTEL_PROPRIETARY_WINDOWS"
		INTEL_OPEN_SOURCE_MESA.id -> "INTEL_OPEN_SOURCE_MESA"
		IMAGINATION_PROPRIETARY.id -> "IMAGINATION_PROPRIETARY"
		QUALCOMM_PROPRIETARY.id -> "QUALCOMM_PROPRIETARY"
		ARM_PROPRIETARY.id -> "ARM_PROPRIETARY"
		GOOGLE_SWIFTSHADER.id -> "GOOGLE_SWIFTSHADER"
		GGP_PROPRIETARY.id -> "GGP_PROPRIETARY"
		BROADCOM_PROPRIETARY.id -> "BROADCOM_PROPRIETARY"
		MESA_LLVMPIPE.id -> "MESA_LLVMPIPE"
		MOLTENVK.id -> "MOLTENVK"
		AMD_PROPRIETARY_KHR.id -> "AMD_PROPRIETARY_KHR"
		AMD_OPEN_SOURCE_KHR.id -> "AMD_OPEN_SOURCE_KHR"
		MESA_RADV_KHR.id -> "MESA_RADV_KHR"
		NVIDIA_PROPRIETARY_KHR.id -> "NVIDIA_PROPRIETARY_KHR"
		INTEL_PROPRIETARY_WINDOWS_KHR.id -> "INTEL_PROPRIETARY_WINDOWS_KHR"
		INTEL_OPEN_SOURCE_MESA_KHR.id -> "INTEL_OPEN_SOURCE_MESA_KHR"
		IMAGINATION_PROPRIETARY_KHR.id -> "IMAGINATION_PROPRIETARY_KHR"
		QUALCOMM_PROPRIETARY_KHR.id -> "QUALCOMM_PROPRIETARY_KHR"
		ARM_PROPRIETARY_KHR.id -> "ARM_PROPRIETARY_KHR"
		GOOGLE_SWIFTSHADER_KHR.id -> "GOOGLE_SWIFTSHADER_KHR"
		GGP_PROPRIETARY_KHR.id -> "GGP_PROPRIETARY_KHR"
		BROADCOM_PROPRIETARY_KHR.id -> "BROADCOM_PROPRIETARY_KHR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val AMD_PROPRIETARY get() = DriverId(1)
		val AMD_OPEN_SOURCE get() = DriverId(2)
		val MESA_RADV get() = DriverId(3)
		val NVIDIA_PROPRIETARY get() = DriverId(4)
		val INTEL_PROPRIETARY_WINDOWS get() = DriverId(5)
		val INTEL_OPEN_SOURCE_MESA get() = DriverId(6)
		val IMAGINATION_PROPRIETARY get() = DriverId(7)
		val QUALCOMM_PROPRIETARY get() = DriverId(8)
		val ARM_PROPRIETARY get() = DriverId(9)
		val GOOGLE_SWIFTSHADER get() = DriverId(10)
		val GGP_PROPRIETARY get() = DriverId(11)
		val BROADCOM_PROPRIETARY get() = DriverId(12)
		val MESA_LLVMPIPE get() = DriverId(13)
		val MOLTENVK get() = DriverId(14)
		val AMD_PROPRIETARY_KHR get() = DriverId(1)
		val AMD_OPEN_SOURCE_KHR get() = DriverId(2)
		val MESA_RADV_KHR get() = DriverId(3)
		val NVIDIA_PROPRIETARY_KHR get() = DriverId(4)
		val INTEL_PROPRIETARY_WINDOWS_KHR get() = DriverId(5)
		val INTEL_OPEN_SOURCE_MESA_KHR get() = DriverId(6)
		val IMAGINATION_PROPRIETARY_KHR get() = DriverId(7)
		val QUALCOMM_PROPRIETARY_KHR get() = DriverId(8)
		val ARM_PROPRIETARY_KHR get() = DriverId(9)
		val GOOGLE_SWIFTSHADER_KHR get() = DriverId(10)
		val GGP_PROPRIETARY_KHR get() = DriverId(11)
		val BROADCOM_PROPRIETARY_KHR get() = DriverId(12)
	
	}


}