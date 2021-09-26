// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCopyAccelerationStructureModeNV {
 *         CLONE        = 0
 *         COMPACT      = 1
 *         SERIALIZE    = 2
 *         DESERIALIZE  = 3
 *         CLONE_NV     = 0
 *         COMPACT_NV   = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class CopyAccelerationStructureMode(val id: Int) {
	
	
	val is_CLONE get() = id == 0
	val is_COMPACT get() = id == 1
	val is_SERIALIZE get() = id == 2
	val is_DESERIALIZE get() = id == 3
	val is_CLONE_NV get() = id == 0
	val is_COMPACT_NV get() = id == 1
	
	
	
	override fun toString() = when(id) {
		CLONE.id -> "CLONE"
		COMPACT.id -> "COMPACT"
		SERIALIZE.id -> "SERIALIZE"
		DESERIALIZE.id -> "DESERIALIZE"
		CLONE_NV.id -> "CLONE_NV"
		COMPACT_NV.id -> "COMPACT_NV"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val CLONE get() = CopyAccelerationStructureMode(0)
		val COMPACT get() = CopyAccelerationStructureMode(1)
		val SERIALIZE get() = CopyAccelerationStructureMode(2)
		val DESERIALIZE get() = CopyAccelerationStructureMode(3)
		val CLONE_NV get() = CopyAccelerationStructureMode(0)
		val COMPACT_NV get() = CopyAccelerationStructureMode(1)
	
	}


}