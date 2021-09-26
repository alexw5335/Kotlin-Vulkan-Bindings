// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkIndirectCommandsTokenTypeNV {
 *         SHADER_GROUP   = 0
 *         STATE_FLAGS    = 1
 *         INDEX_BUFFER   = 2
 *         VERTEX_BUFFER  = 3
 *         PUSH_CONSTANT  = 4
 *         DRAW_INDEXED   = 5
 *         DRAW           = 6
 *         DRAW_TASKS     = 7
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class IndirectCommandsTokenType(val id: Int) {
	
	
	val is_SHADER_GROUP get() = id == 0
	val is_STATE_FLAGS get() = id == 1
	val is_INDEX_BUFFER get() = id == 2
	val is_VERTEX_BUFFER get() = id == 3
	val is_PUSH_CONSTANT get() = id == 4
	val is_DRAW_INDEXED get() = id == 5
	val is_DRAW get() = id == 6
	val is_DRAW_TASKS get() = id == 7
	
	
	
	override fun toString() = when(id) {
		SHADER_GROUP.id -> "SHADER_GROUP"
		STATE_FLAGS.id -> "STATE_FLAGS"
		INDEX_BUFFER.id -> "INDEX_BUFFER"
		VERTEX_BUFFER.id -> "VERTEX_BUFFER"
		PUSH_CONSTANT.id -> "PUSH_CONSTANT"
		DRAW_INDEXED.id -> "DRAW_INDEXED"
		DRAW.id -> "DRAW"
		DRAW_TASKS.id -> "DRAW_TASKS"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val SHADER_GROUP get() = IndirectCommandsTokenType(0)
		val STATE_FLAGS get() = IndirectCommandsTokenType(1)
		val INDEX_BUFFER get() = IndirectCommandsTokenType(2)
		val VERTEX_BUFFER get() = IndirectCommandsTokenType(3)
		val PUSH_CONSTANT get() = IndirectCommandsTokenType(4)
		val DRAW_INDEXED get() = IndirectCommandsTokenType(5)
		val DRAW get() = IndirectCommandsTokenType(6)
		val DRAW_TASKS get() = IndirectCommandsTokenType(7)
	
	}


}