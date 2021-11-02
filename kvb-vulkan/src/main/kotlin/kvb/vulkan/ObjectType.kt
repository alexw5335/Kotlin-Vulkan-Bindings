// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkObjectType {
 *         VK_OBJECT_TYPE_UNKNOWN                          = 0
 *         VK_OBJECT_TYPE_INSTANCE                         = 1
 *         VK_OBJECT_TYPE_PHYSICAL_DEVICE                  = 2
 *         VK_OBJECT_TYPE_DEVICE                           = 3
 *         VK_OBJECT_TYPE_QUEUE                            = 4
 *         VK_OBJECT_TYPE_SEMAPHORE                        = 5
 *         VK_OBJECT_TYPE_COMMAND_BUFFER                   = 6
 *         VK_OBJECT_TYPE_FENCE                            = 7
 *         VK_OBJECT_TYPE_DEVICE_MEMORY                    = 8
 *         VK_OBJECT_TYPE_BUFFER                           = 9
 *         VK_OBJECT_TYPE_IMAGE                            = 10
 *         VK_OBJECT_TYPE_EVENT                            = 11
 *         VK_OBJECT_TYPE_QUERY_POOL                       = 12
 *         VK_OBJECT_TYPE_BUFFER_VIEW                      = 13
 *         VK_OBJECT_TYPE_IMAGE_VIEW                       = 14
 *         VK_OBJECT_TYPE_SHADER_MODULE                    = 15
 *         VK_OBJECT_TYPE_PIPELINE_CACHE                   = 16
 *         VK_OBJECT_TYPE_PIPELINE_LAYOUT                  = 17
 *         VK_OBJECT_TYPE_RENDER_PASS                      = 18
 *         VK_OBJECT_TYPE_PIPELINE                         = 19
 *         VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT            = 20
 *         VK_OBJECT_TYPE_SAMPLER                          = 21
 *         VK_OBJECT_TYPE_DESCRIPTOR_POOL                  = 22
 *         VK_OBJECT_TYPE_DESCRIPTOR_SET                   = 23
 *         VK_OBJECT_TYPE_FRAMEBUFFER                      = 24
 *         VK_OBJECT_TYPE_COMMAND_POOL                     = 25
 *         VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION         = 1000156000
 *         VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE       = 1000085000
 *         VK_OBJECT_TYPE_SURFACE_KHR                      = 1000000000
 *         VK_OBJECT_TYPE_SWAPCHAIN_KHR                    = 1000001000
 *         VK_OBJECT_TYPE_DISPLAY_KHR                      = 1000002000
 *         VK_OBJECT_TYPE_DISPLAY_MODE_KHR                 = 1000002001
 *         VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT        = 1000011000
 *         VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR   = 1000085000
 *         VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT        = 1000128000
 *         VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR       = 1000150000
 *         VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR     = 1000156000
 *         VK_OBJECT_TYPE_VALIDATION_CACHE_EXT             = 1000160000
 *         VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV        = 1000165000
 *         VK_OBJECT_TYPE_PERFORMANCE_CONFIGURATION_INTEL  = 1000210000
 *         VK_OBJECT_TYPE_DEFERRED_OPERATION_KHR           = 1000268000
 *         VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NV      = 1000277000
 *         VK_OBJECT_TYPE_PRIVATE_DATA_SLOT_EXT            = 1000295000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ObjectType(val value: Int) {
	
	
	companion object {
		
		val UNKNOWN = ObjectType(0)
		
		val INSTANCE = ObjectType(1)
		
		val PHYSICAL_DEVICE = ObjectType(2)
		
		val DEVICE = ObjectType(3)
		
		val QUEUE = ObjectType(4)
		
		val SEMAPHORE = ObjectType(5)
		
		val COMMAND_BUFFER = ObjectType(6)
		
		val FENCE = ObjectType(7)
		
		val DEVICE_MEMORY = ObjectType(8)
		
		val BUFFER = ObjectType(9)
		
		val IMAGE = ObjectType(10)
		
		val EVENT = ObjectType(11)
		
		val QUERY_POOL = ObjectType(12)
		
		val BUFFER_VIEW = ObjectType(13)
		
		val IMAGE_VIEW = ObjectType(14)
		
		val SHADER_MODULE = ObjectType(15)
		
		val PIPELINE_CACHE = ObjectType(16)
		
		val PIPELINE_LAYOUT = ObjectType(17)
		
		val RENDER_PASS = ObjectType(18)
		
		val PIPELINE = ObjectType(19)
		
		val DESCRIPTOR_SET_LAYOUT = ObjectType(20)
		
		val SAMPLER = ObjectType(21)
		
		val DESCRIPTOR_POOL = ObjectType(22)
		
		val DESCRIPTOR_SET = ObjectType(23)
		
		val FRAMEBUFFER = ObjectType(24)
		
		val COMMAND_POOL = ObjectType(25)
		
		val SAMPLER_YCBCR_CONVERSION = ObjectType(1000156000)
		
		val DESCRIPTOR_UPDATE_TEMPLATE = ObjectType(1000085000)
		
		val SURFACE = ObjectType(1000000000)
		
		val SWAPCHAIN = ObjectType(1000001000)
		
		val DISPLAY = ObjectType(1000002000)
		
		val DISPLAY_MODE = ObjectType(1000002001)
		
		val DEBUG_UTILS_MESSENGER = ObjectType(1000128000)
		
		val ACCELERATION_STRUCTURE_KHR = ObjectType(1000150000)
		
		val VALIDATION_CACHE = ObjectType(1000160000)
		
		val ACCELERATION_STRUCTURE_NV = ObjectType(1000165000)
		
		val PERFORMANCE_CONFIGURATION = ObjectType(1000210000)
		
		val DEFERRED_OPERATION = ObjectType(1000268000)
		
		val INDIRECT_COMMANDS_LAYOUT = ObjectType(1000277000)
		
		val PRIVATE_DATA_SLOT = ObjectType(1000295000)
	
	}
	
	
	
	override fun toString() = when(value) {
		0 -> "UNKNOWN"
		1 -> "INSTANCE"
		2 -> "PHYSICAL_DEVICE"
		3 -> "DEVICE"
		4 -> "QUEUE"
		5 -> "SEMAPHORE"
		6 -> "COMMAND_BUFFER"
		7 -> "FENCE"
		8 -> "DEVICE_MEMORY"
		9 -> "BUFFER"
		10 -> "IMAGE"
		11 -> "EVENT"
		12 -> "QUERY_POOL"
		13 -> "BUFFER_VIEW"
		14 -> "IMAGE_VIEW"
		15 -> "SHADER_MODULE"
		16 -> "PIPELINE_CACHE"
		17 -> "PIPELINE_LAYOUT"
		18 -> "RENDER_PASS"
		19 -> "PIPELINE"
		20 -> "DESCRIPTOR_SET_LAYOUT"
		21 -> "SAMPLER"
		22 -> "DESCRIPTOR_POOL"
		23 -> "DESCRIPTOR_SET"
		24 -> "FRAMEBUFFER"
		25 -> "COMMAND_POOL"
		1000156000 -> "SAMPLER_YCBCR_CONVERSION"
		1000085000 -> "DESCRIPTOR_UPDATE_TEMPLATE"
		1000000000 -> "SURFACE"
		1000001000 -> "SWAPCHAIN"
		1000002000 -> "DISPLAY"
		1000002001 -> "DISPLAY_MODE"
		1000128000 -> "DEBUG_UTILS_MESSENGER"
		1000150000 -> "ACCELERATION_STRUCTURE_KHR"
		1000160000 -> "VALIDATION_CACHE"
		1000165000 -> "ACCELERATION_STRUCTURE_NV"
		1000210000 -> "PERFORMANCE_CONFIGURATION"
		1000268000 -> "DEFERRED_OPERATION"
		1000277000 -> "INDIRECT_COMMANDS_LAYOUT"
		1000295000 -> "PRIVATE_DATA_SLOT"
		else -> "*INVALID*"
	}


}