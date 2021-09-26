// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkAccelerationStructureCreateFlagBitsKHR {
 *         DEVICE_ADDRESS_CAPTURE_REPLAY  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class AccelerationStructureCreateFlags(val bitfield: Int) {
	
	
	val is_DEVICE_ADDRESS_CAPTURE_REPLAY get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: AccelerationStructureCreateFlags) = AccelerationStructureCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = AccelerationStructureCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: AccelerationStructureCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: AccelerationStructureCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_DEVICE_ADDRESS_CAPTURE_REPLAY) append("DEVICE_ADDRESS_CAPTURE_REPLAY, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = AccelerationStructureCreateFlags(0)
		val ALL get() = AccelerationStructureCreateFlags(1)
		val DEVICE_ADDRESS_CAPTURE_REPLAY get() = AccelerationStructureCreateFlags(1)
		
		inline fun compose(block: Companion.() -> AccelerationStructureCreateFlags) = block(Companion)
	
	}


}