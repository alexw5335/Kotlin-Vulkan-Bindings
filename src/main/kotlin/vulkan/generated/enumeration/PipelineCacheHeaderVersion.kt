// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPipelineCacheHeaderVersion {
 *         ONE  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PipelineCacheHeaderVersion(val id: Int) {
	
	
	val is_ONE get() = id == 1
	
	
	
	override fun toString() = when(id) {
		ONE.id -> "ONE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val ONE get() = PipelineCacheHeaderVersion(1)
	
	}


}