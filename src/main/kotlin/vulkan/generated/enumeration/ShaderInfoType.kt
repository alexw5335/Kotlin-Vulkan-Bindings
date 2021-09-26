// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkShaderInfoTypeAMD {
 *         STATISTICS   = 0
 *         BINARY       = 1
 *         DISASSEMBLY  = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ShaderInfoType(val id: Int) {
	
	
	val is_STATISTICS get() = id == 0
	val is_BINARY get() = id == 1
	val is_DISASSEMBLY get() = id == 2
	
	
	
	override fun toString() = when(id) {
		STATISTICS.id -> "STATISTICS"
		BINARY.id -> "BINARY"
		DISASSEMBLY.id -> "DISASSEMBLY"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val STATISTICS get() = ShaderInfoType(0)
		val BINARY get() = ShaderInfoType(1)
		val DISASSEMBLY get() = ShaderInfoType(2)
	
	}


}