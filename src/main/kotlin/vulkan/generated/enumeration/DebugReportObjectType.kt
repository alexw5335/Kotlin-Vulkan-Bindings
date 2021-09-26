// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDebugReportObjectTypeEXT {
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
 *         SURFACE_KHR                     = 26
 *         SWAPCHAIN_KHR                   = 27
 *         DEBUG_REPORT_CALLBACK_EXT       = 28
 *         DEBUG_REPORT                    = 28
 *         DISPLAY_KHR                     = 29
 *         DISPLAY_MODE_KHR                = 30
 *         VALIDATION_CACHE_EXT            = 33
 *         VALIDATION_CACHE                = 33
 *         SAMPLER_YCBCR_CONVERSION        = 1000156000
 *         DESCRIPTOR_UPDATE_TEMPLATE      = 1000085000
 *         DESCRIPTOR_UPDATE_TEMPLATE_KHR  = 1000085000
 *         ACCELERATION_STRUCTURE_KHR      = 1000150000
 *         SAMPLER_YCBCR_CONVERSION_KHR    = 1000156000
 *         ACCELERATION_STRUCTURE_NV       = 1000165000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class DebugReportObjectType(val id: Int) {
	
	
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
	val is_SURFACE_KHR get() = id == 26
	val is_SWAPCHAIN_KHR get() = id == 27
	val is_DEBUG_REPORT_CALLBACK_EXT get() = id == 28
	val is_DEBUG_REPORT get() = id == 28
	val is_DISPLAY_KHR get() = id == 29
	val is_DISPLAY_MODE_KHR get() = id == 30
	val is_VALIDATION_CACHE_EXT get() = id == 33
	val is_VALIDATION_CACHE get() = id == 33
	val is_SAMPLER_YCBCR_CONVERSION get() = id == 1000156000
	val is_DESCRIPTOR_UPDATE_TEMPLATE get() = id == 1000085000
	val is_DESCRIPTOR_UPDATE_TEMPLATE_KHR get() = id == 1000085000
	val is_ACCELERATION_STRUCTURE_KHR get() = id == 1000150000
	val is_SAMPLER_YCBCR_CONVERSION_KHR get() = id == 1000156000
	val is_ACCELERATION_STRUCTURE_NV get() = id == 1000165000
	
	
	
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
		SURFACE_KHR.id -> "SURFACE_KHR"
		SWAPCHAIN_KHR.id -> "SWAPCHAIN_KHR"
		DEBUG_REPORT_CALLBACK_EXT.id -> "DEBUG_REPORT_CALLBACK_EXT"
		DEBUG_REPORT.id -> "DEBUG_REPORT"
		DISPLAY_KHR.id -> "DISPLAY_KHR"
		DISPLAY_MODE_KHR.id -> "DISPLAY_MODE_KHR"
		VALIDATION_CACHE_EXT.id -> "VALIDATION_CACHE_EXT"
		VALIDATION_CACHE.id -> "VALIDATION_CACHE"
		SAMPLER_YCBCR_CONVERSION.id -> "SAMPLER_YCBCR_CONVERSION"
		DESCRIPTOR_UPDATE_TEMPLATE.id -> "DESCRIPTOR_UPDATE_TEMPLATE"
		DESCRIPTOR_UPDATE_TEMPLATE_KHR.id -> "DESCRIPTOR_UPDATE_TEMPLATE_KHR"
		ACCELERATION_STRUCTURE_KHR.id -> "ACCELERATION_STRUCTURE_KHR"
		SAMPLER_YCBCR_CONVERSION_KHR.id -> "SAMPLER_YCBCR_CONVERSION_KHR"
		ACCELERATION_STRUCTURE_NV.id -> "ACCELERATION_STRUCTURE_NV"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val UNKNOWN get() = DebugReportObjectType(0)
		val INSTANCE get() = DebugReportObjectType(1)
		val PHYSICAL_DEVICE get() = DebugReportObjectType(2)
		val DEVICE get() = DebugReportObjectType(3)
		val QUEUE get() = DebugReportObjectType(4)
		val SEMAPHORE get() = DebugReportObjectType(5)
		val COMMAND_BUFFER get() = DebugReportObjectType(6)
		val FENCE get() = DebugReportObjectType(7)
		val DEVICE_MEMORY get() = DebugReportObjectType(8)
		val BUFFER get() = DebugReportObjectType(9)
		val IMAGE get() = DebugReportObjectType(10)
		val EVENT get() = DebugReportObjectType(11)
		val QUERY_POOL get() = DebugReportObjectType(12)
		val BUFFER_VIEW get() = DebugReportObjectType(13)
		val IMAGE_VIEW get() = DebugReportObjectType(14)
		val SHADER_MODULE get() = DebugReportObjectType(15)
		val PIPELINE_CACHE get() = DebugReportObjectType(16)
		val PIPELINE_LAYOUT get() = DebugReportObjectType(17)
		val RENDER_PASS get() = DebugReportObjectType(18)
		val PIPELINE get() = DebugReportObjectType(19)
		val DESCRIPTOR_SET_LAYOUT get() = DebugReportObjectType(20)
		val SAMPLER get() = DebugReportObjectType(21)
		val DESCRIPTOR_POOL get() = DebugReportObjectType(22)
		val DESCRIPTOR_SET get() = DebugReportObjectType(23)
		val FRAMEBUFFER get() = DebugReportObjectType(24)
		val COMMAND_POOL get() = DebugReportObjectType(25)
		val SURFACE_KHR get() = DebugReportObjectType(26)
		val SWAPCHAIN_KHR get() = DebugReportObjectType(27)
		val DEBUG_REPORT_CALLBACK_EXT get() = DebugReportObjectType(28)
		val DEBUG_REPORT get() = DebugReportObjectType(28)
		val DISPLAY_KHR get() = DebugReportObjectType(29)
		val DISPLAY_MODE_KHR get() = DebugReportObjectType(30)
		val VALIDATION_CACHE_EXT get() = DebugReportObjectType(33)
		val VALIDATION_CACHE get() = DebugReportObjectType(33)
		val SAMPLER_YCBCR_CONVERSION get() = DebugReportObjectType(1000156000)
		val DESCRIPTOR_UPDATE_TEMPLATE get() = DebugReportObjectType(1000085000)
		val DESCRIPTOR_UPDATE_TEMPLATE_KHR get() = DebugReportObjectType(1000085000)
		val ACCELERATION_STRUCTURE_KHR get() = DebugReportObjectType(1000150000)
		val SAMPLER_YCBCR_CONVERSION_KHR get() = DebugReportObjectType(1000156000)
		val ACCELERATION_STRUCTURE_NV get() = DebugReportObjectType(1000165000)
	
	}


}