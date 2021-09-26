// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkBuildAccelerationStructureFlagBitsKHR {
 *         ALLOW_UPDATE          = 1
 *         ALLOW_COMPACTION      = 2
 *         PREFER_FAST_TRACE     = 4
 *         PREFER_FAST_BUILD     = 8
 *         LOW_MEMORY            = 16
 *         ALLOW_UPDATE_NV       = 1
 *         ALLOW_COMPACTION_NV   = 2
 *         PREFER_FAST_TRACE_NV  = 4
 *         PREFER_FAST_BUILD_NV  = 8
 *         LOW_MEMORY_NV         = 16
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class BuildAccelerationStructureFlags(val bitfield: Int) {
	
	
	val is_ALLOW_UPDATE get() = bitfield and 1 != 0
	val is_ALLOW_COMPACTION get() = bitfield and 2 != 0
	val is_PREFER_FAST_TRACE get() = bitfield and 4 != 0
	val is_PREFER_FAST_BUILD get() = bitfield and 8 != 0
	val is_LOW_MEMORY get() = bitfield and 16 != 0
	val is_ALLOW_UPDATE_NV get() = bitfield and 1 != 0
	val is_ALLOW_COMPACTION_NV get() = bitfield and 2 != 0
	val is_PREFER_FAST_TRACE_NV get() = bitfield and 4 != 0
	val is_PREFER_FAST_BUILD_NV get() = bitfield and 8 != 0
	val is_LOW_MEMORY_NV get() = bitfield and 16 != 0
	
	
	
	infix operator fun plus(other: BuildAccelerationStructureFlags) = BuildAccelerationStructureFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = BuildAccelerationStructureFlags(bitfield or other)
	
	infix fun containsAll(mask: BuildAccelerationStructureFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: BuildAccelerationStructureFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_ALLOW_UPDATE) append("ALLOW_UPDATE, ")
		if(is_ALLOW_COMPACTION) append("ALLOW_COMPACTION, ")
		if(is_PREFER_FAST_TRACE) append("PREFER_FAST_TRACE, ")
		if(is_PREFER_FAST_BUILD) append("PREFER_FAST_BUILD, ")
		if(is_LOW_MEMORY) append("LOW_MEMORY, ")
		if(is_ALLOW_UPDATE_NV) append("ALLOW_UPDATE_NV, ")
		if(is_ALLOW_COMPACTION_NV) append("ALLOW_COMPACTION_NV, ")
		if(is_PREFER_FAST_TRACE_NV) append("PREFER_FAST_TRACE_NV, ")
		if(is_PREFER_FAST_BUILD_NV) append("PREFER_FAST_BUILD_NV, ")
		if(is_LOW_MEMORY_NV) append("LOW_MEMORY_NV, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = BuildAccelerationStructureFlags(0)
		val ALL get() = BuildAccelerationStructureFlags(62)
		val ALLOW_UPDATE get() = BuildAccelerationStructureFlags(1)
		val ALLOW_COMPACTION get() = BuildAccelerationStructureFlags(2)
		val PREFER_FAST_TRACE get() = BuildAccelerationStructureFlags(4)
		val PREFER_FAST_BUILD get() = BuildAccelerationStructureFlags(8)
		val LOW_MEMORY get() = BuildAccelerationStructureFlags(16)
		val ALLOW_UPDATE_NV get() = BuildAccelerationStructureFlags(1)
		val ALLOW_COMPACTION_NV get() = BuildAccelerationStructureFlags(2)
		val PREFER_FAST_TRACE_NV get() = BuildAccelerationStructureFlags(4)
		val PREFER_FAST_BUILD_NV get() = BuildAccelerationStructureFlags(8)
		val LOW_MEMORY_NV get() = BuildAccelerationStructureFlags(16)
		
		inline fun compose(block: Companion.() -> BuildAccelerationStructureFlags) = block(Companion)
	
	}


}