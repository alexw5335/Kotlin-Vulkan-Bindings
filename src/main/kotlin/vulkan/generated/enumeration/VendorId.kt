// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkVendorId {
 *         VIV       = 0x10001
 *         VSI       = 0x10002
 *         KAZAN     = 0x10003
 *         CODEPLAY  = 0x10004
 *         MESA      = 0x10005
 *         POCL      = 0x10006
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class VendorId(val id: Int) {
	
	
	val is_VIV get() = id == 0x10001
	val is_VSI get() = id == 0x10002
	val is_KAZAN get() = id == 0x10003
	val is_CODEPLAY get() = id == 0x10004
	val is_MESA get() = id == 0x10005
	val is_POCL get() = id == 0x10006
	
	
	
	override fun toString() = when(id) {
		VIV.id -> "VIV"
		VSI.id -> "VSI"
		KAZAN.id -> "KAZAN"
		CODEPLAY.id -> "CODEPLAY"
		MESA.id -> "MESA"
		POCL.id -> "POCL"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val VIV get() = VendorId(0x10001)
		val VSI get() = VendorId(0x10002)
		val KAZAN get() = VendorId(0x10003)
		val CODEPLAY get() = VendorId(0x10004)
		val MESA get() = VendorId(0x10005)
		val POCL get() = VendorId(0x10006)
	
	}


}