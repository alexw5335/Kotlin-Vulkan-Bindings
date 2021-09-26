// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDeviceGroupPresentModeFlagBitsKHR {
 *         LOCAL               = 1
 *         REMOTE              = 2
 *         SUM                 = 4
 *         LOCAL_MULTI_DEVICE  = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DeviceGroupPresentModeFlags(val bitfield: Int) {
	
	
	val is_LOCAL get() = bitfield and 1 != 0
	val is_REMOTE get() = bitfield and 2 != 0
	val is_SUM get() = bitfield and 4 != 0
	val is_LOCAL_MULTI_DEVICE get() = bitfield and 8 != 0
	
	
	
	infix operator fun plus(other: DeviceGroupPresentModeFlags) = DeviceGroupPresentModeFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = DeviceGroupPresentModeFlags(bitfield or other)
	
	infix fun containsAll(mask: DeviceGroupPresentModeFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: DeviceGroupPresentModeFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_LOCAL) append("LOCAL, ")
		if(is_REMOTE) append("REMOTE, ")
		if(is_SUM) append("SUM, ")
		if(is_LOCAL_MULTI_DEVICE) append("LOCAL_MULTI_DEVICE, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = DeviceGroupPresentModeFlags(0)
		val ALL get() = DeviceGroupPresentModeFlags(15)
		val LOCAL get() = DeviceGroupPresentModeFlags(1)
		val REMOTE get() = DeviceGroupPresentModeFlags(2)
		val SUM get() = DeviceGroupPresentModeFlags(4)
		val LOCAL_MULTI_DEVICE get() = DeviceGroupPresentModeFlags(8)
		
		inline fun compose(block: Companion.() -> DeviceGroupPresentModeFlags) = block(Companion)
	
	}


}