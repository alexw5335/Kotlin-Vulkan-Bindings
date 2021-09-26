// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkObjectType {
 *         UNKNOWN                         = 0
 *         INSTANCE                        = 1
 *         PHYSICAL_DEVICE                 = 2
 *         DEVICE                          = 3
 *         QUEUE                           = 4
 *         SEMAPHORE                       = 5
 *         COMMAND_BUFFER                  = 6
 *         FENCE                           = 7
 *         DEVICE_MEMORY                   = 8
 *         BUFFER                          = 9
 *         IMAGE                           = 10
 *         EVENT                           = 11
 *         QUERY_POOL                      = 12
 *         BUFFER_VIEW                     = 13
 *         IMAGE_VIEW                      = 14
 *         SHADER_MODULE                   = 15
 *         PIPELINE_CACHE                  = 16
 *         PIPELINE_LAYOUT                 = 17
 *         RENDER_PASS                     = 18
 *         PIPELINE                        = 19
 *         DESCRIPTOR_SET_LAYOUT           = 20
 *         SAMPLER                         = 21
 *         DESCRIPTOR_POOL                 = 22
 *         DESCRIPTOR_SET                  = 23
 *         FRAMEBUFFER                     = 24
 *         COMMAND_POOL                    = 25
 *         SAMPLER_YCBCR_CONVERSION        = 1000156000
 *         DESCRIPTOR_UPDATE_TEMPLATE      = 1000085000
 *         SURFACE                         = 1000000000
 *         SWAPCHAIN                       = 1000001000
 *         DISPLAY                         = 1000002000
 *         DISPLAY_MODE                    = 1000002001
 *         DEBUG_REPORT_CALLBACK           = 1000011000
 *         DESCRIPTOR_UPDATE_TEMPLATE_KHR  = 1000085000
 *         DEBUG_UTILS_MESSENGER           = 1000128000
 *         ACCELERATION_STRUCTURE          = 1000150000
 *         SAMPLER_YCBCR_CONVERSION_KHR    = 1000156000
 *         VALIDATION_CACHE                = 1000160000
 *         ACCELERATION_STRUCTURE_NV       = 1000165000
 *         PERFORMANCE_CONFIGURATION       = 1000210000
 *         DEFERRED_OPERATION              = 1000268000
 *         INDIRECT_COMMANDS_LAYOUT        = 1000277000
 *         PRIVATE_DATA_SLOT               = 1000295000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ObjectType(val id: Int) {
	
	
	val is_UNKNOWN get() = id == 0
	val is_INSTANCE get() = id == 1
	val is_PHYSICAL_DEVICE get() = id == 2
	val is_DEVICE get() = id == 3
	val is_QUEUE get() = id == 4
	val is_SEMAPHORE get() = id == 5
	val is_COMMAND_BUFFER get() = id == 6
	val is_FENCE get() = id == 7
	val is_DEVICE_MEMORY get() = id == 8
	val is_BUFFER get() = id == 9
	val is_IMAGE get() = id == 10
	val is_EVENT get() = id == 11
	val is_QUERY_POOL get() = id == 12
	val is_BUFFER_VIEW get() = id == 13
	val is_IMAGE_VIEW get() = id == 14
	val is_SHADER_MODULE get() = id == 15
	val is_PIPELINE_CACHE get() = id == 16
	val is_PIPELINE_LAYOUT get() = id == 17
	val is_RENDER_PASS get() = id == 18
	val is_PIPELINE get() = id == 19
	val is_DESCRIPTOR_SET_LAYOUT get() = id == 20
	val is_SAMPLER get() = id == 21
	val is_DESCRIPTOR_POOL get() = id == 22
	val is_DESCRIPTOR_SET get() = id == 23
	val is_FRAMEBUFFER get() = id == 24
	val is_COMMAND_POOL get() = id == 25
	val is_SAMPLER_YCBCR_CONVERSION get() = id == 1000156000
	val is_DESCRIPTOR_UPDATE_TEMPLATE get() = id == 1000085000
	val is_SURFACE get() = id == 1000000000
	val is_SWAPCHAIN get() = id == 1000001000
	val is_DISPLAY get() = id == 1000002000
	val is_DISPLAY_MODE get() = id == 1000002001
	val is_DEBUG_REPORT_CALLBACK get() = id == 1000011000
	val is_DESCRIPTOR_UPDATE_TEMPLATE_KHR get() = id == 1000085000
	val is_DEBUG_UTILS_MESSENGER get() = id == 1000128000
	val is_ACCELERATION_STRUCTURE get() = id == 1000150000
	val is_SAMPLER_YCBCR_CONVERSION_KHR get() = id == 1000156000
	val is_VALIDATION_CACHE get() = id == 1000160000
	val is_ACCELERATION_STRUCTURE_NV get() = id == 1000165000
	val is_PERFORMANCE_CONFIGURATION get() = id == 1000210000
	val is_DEFERRED_OPERATION get() = id == 1000268000
	val is_INDIRECT_COMMANDS_LAYOUT get() = id == 1000277000
	val is_PRIVATE_DATA_SLOT get() = id == 1000295000
	
	
	
	override fun toString() = when(id) {
		UNKNOWN.id -> "UNKNOWN"
		INSTANCE.id -> "INSTANCE"
		PHYSICAL_DEVICE.id -> "PHYSICAL_DEVICE"
		DEVICE.id -> "DEVICE"
		QUEUE.id -> "QUEUE"
		SEMAPHORE.id -> "SEMAPHORE"
		COMMAND_BUFFER.id -> "COMMAND_BUFFER"
		FENCE.id -> "FENCE"
		DEVICE_MEMORY.id -> "DEVICE_MEMORY"
		BUFFER.id -> "BUFFER"
		IMAGE.id -> "IMAGE"
		EVENT.id -> "EVENT"
		QUERY_POOL.id -> "QUERY_POOL"
		BUFFER_VIEW.id -> "BUFFER_VIEW"
		IMAGE_VIEW.id -> "IMAGE_VIEW"
		SHADER_MODULE.id -> "SHADER_MODULE"
		PIPELINE_CACHE.id -> "PIPELINE_CACHE"
		PIPELINE_LAYOUT.id -> "PIPELINE_LAYOUT"
		RENDER_PASS.id -> "RENDER_PASS"
		PIPELINE.id -> "PIPELINE"
		DESCRIPTOR_SET_LAYOUT.id -> "DESCRIPTOR_SET_LAYOUT"
		SAMPLER.id -> "SAMPLER"
		DESCRIPTOR_POOL.id -> "DESCRIPTOR_POOL"
		DESCRIPTOR_SET.id -> "DESCRIPTOR_SET"
		FRAMEBUFFER.id -> "FRAMEBUFFER"
		COMMAND_POOL.id -> "COMMAND_POOL"
		SAMPLER_YCBCR_CONVERSION.id -> "SAMPLER_YCBCR_CONVERSION"
		DESCRIPTOR_UPDATE_TEMPLATE.id -> "DESCRIPTOR_UPDATE_TEMPLATE"
		SURFACE.id -> "SURFACE"
		SWAPCHAIN.id -> "SWAPCHAIN"
		DISPLAY.id -> "DISPLAY"
		DISPLAY_MODE.id -> "DISPLAY_MODE"
		DEBUG_REPORT_CALLBACK.id -> "DEBUG_REPORT_CALLBACK"
		DESCRIPTOR_UPDATE_TEMPLATE_KHR.id -> "DESCRIPTOR_UPDATE_TEMPLATE_KHR"
		DEBUG_UTILS_MESSENGER.id -> "DEBUG_UTILS_MESSENGER"
		ACCELERATION_STRUCTURE.id -> "ACCELERATION_STRUCTURE"
		SAMPLER_YCBCR_CONVERSION_KHR.id -> "SAMPLER_YCBCR_CONVERSION_KHR"
		VALIDATION_CACHE.id -> "VALIDATION_CACHE"
		ACCELERATION_STRUCTURE_NV.id -> "ACCELERATION_STRUCTURE_NV"
		PERFORMANCE_CONFIGURATION.id -> "PERFORMANCE_CONFIGURATION"
		DEFERRED_OPERATION.id -> "DEFERRED_OPERATION"
		INDIRECT_COMMANDS_LAYOUT.id -> "INDIRECT_COMMANDS_LAYOUT"
		PRIVATE_DATA_SLOT.id -> "PRIVATE_DATA_SLOT"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val UNKNOWN get() = ObjectType(0)
		val INSTANCE get() = ObjectType(1)
		val PHYSICAL_DEVICE get() = ObjectType(2)
		val DEVICE get() = ObjectType(3)
		val QUEUE get() = ObjectType(4)
		val SEMAPHORE get() = ObjectType(5)
		val COMMAND_BUFFER get() = ObjectType(6)
		val FENCE get() = ObjectType(7)
		val DEVICE_MEMORY get() = ObjectType(8)
		val BUFFER get() = ObjectType(9)
		val IMAGE get() = ObjectType(10)
		val EVENT get() = ObjectType(11)
		val QUERY_POOL get() = ObjectType(12)
		val BUFFER_VIEW get() = ObjectType(13)
		val IMAGE_VIEW get() = ObjectType(14)
		val SHADER_MODULE get() = ObjectType(15)
		val PIPELINE_CACHE get() = ObjectType(16)
		val PIPELINE_LAYOUT get() = ObjectType(17)
		val RENDER_PASS get() = ObjectType(18)
		val PIPELINE get() = ObjectType(19)
		val DESCRIPTOR_SET_LAYOUT get() = ObjectType(20)
		val SAMPLER get() = ObjectType(21)
		val DESCRIPTOR_POOL get() = ObjectType(22)
		val DESCRIPTOR_SET get() = ObjectType(23)
		val FRAMEBUFFER get() = ObjectType(24)
		val COMMAND_POOL get() = ObjectType(25)
		val SAMPLER_YCBCR_CONVERSION get() = ObjectType(1000156000)
		val DESCRIPTOR_UPDATE_TEMPLATE get() = ObjectType(1000085000)
		val SURFACE get() = ObjectType(1000000000)
		val SWAPCHAIN get() = ObjectType(1000001000)
		val DISPLAY get() = ObjectType(1000002000)
		val DISPLAY_MODE get() = ObjectType(1000002001)
		val DEBUG_REPORT_CALLBACK get() = ObjectType(1000011000)
		val DESCRIPTOR_UPDATE_TEMPLATE_KHR get() = ObjectType(1000085000)
		val DEBUG_UTILS_MESSENGER get() = ObjectType(1000128000)
		val ACCELERATION_STRUCTURE get() = ObjectType(1000150000)
		val SAMPLER_YCBCR_CONVERSION_KHR get() = ObjectType(1000156000)
		val VALIDATION_CACHE get() = ObjectType(1000160000)
		val ACCELERATION_STRUCTURE_NV get() = ObjectType(1000165000)
		val PERFORMANCE_CONFIGURATION get() = ObjectType(1000210000)
		val DEFERRED_OPERATION get() = ObjectType(1000268000)
		val INDIRECT_COMMANDS_LAYOUT get() = ObjectType(1000277000)
		val PRIVATE_DATA_SLOT get() = ObjectType(1000295000)
	
	}


}