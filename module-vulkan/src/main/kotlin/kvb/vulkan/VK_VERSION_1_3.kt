// This file has been automatically generated.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.*
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_3
 *     VkResult vkGetPhysicalDeviceToolProperties(
 *         VkPhysicalDevice                 physicalDevice
 *         uint32_t*                        pToolCount
 *         VkPhysicalDeviceToolProperties*  pToolProperties
 *     );
 */
internal external fun getPhysicalDeviceToolProperties(address: Long, physicalDevice: Long, pToolCount: Long, pToolProperties: Long): Int



/**
 *     // provided by VK_VERSION_1_3
 *     VkResult vkCreatePrivateDataSlot(
 *         VkDevice                      device
 *         VkPrivateDataSlotCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*        pAllocator
 *         VkPrivateDataSlot*            pPrivateDataSlot
 *     );
 */
internal external fun createPrivateDataSlot(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pPrivateDataSlot: Long): Int



/**
 *     // provided by VK_VERSION_1_3
 *     void vkDestroyPrivateDataSlot(
 *         VkDevice                device
 *         VkPrivateDataSlot       privateDataSlot
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyPrivateDataSlot(address: Long, device: Long, privateDataSlot: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     VkResult vkSetPrivateData(
 *         VkDevice           device
 *         VkObjectType       objectType
 *         uint64_t           objectHandle
 *         VkPrivateDataSlot  privateDataSlot
 *         uint64_t           data
 *     );
 */
internal external fun setPrivateData(address: Long, device: Long, objectType: Int, objectHandle: Long, privateDataSlot: Long, data: Long): Int



/**
 *     // provided by VK_VERSION_1_3
 *     void vkGetPrivateData(
 *         VkDevice           device
 *         VkObjectType       objectType
 *         uint64_t           objectHandle
 *         VkPrivateDataSlot  privateDataSlot
 *         uint64_t*          pData
 *     );
 */
internal external fun getPrivateData(address: Long, device: Long, objectType: Int, objectHandle: Long, privateDataSlot: Long, pData: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetEvent2(
 *         VkCommandBuffer    commandBuffer
 *         VkEvent            event
 *         VkDependencyInfo*  pDependencyInfo
 *     );
 */
internal external fun cmdSetEvent2(address: Long, commandBuffer: Long, event: Long, pDependencyInfo: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdResetEvent2(
 *         VkCommandBuffer        commandBuffer
 *         VkEvent                event
 *         VkPipelineStageFlags2  stageMask
 *     );
 */
internal external fun cmdResetEvent2(address: Long, commandBuffer: Long, event: Long, stageMask: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdWaitEvents2(
 *         VkCommandBuffer    commandBuffer
 *         uint32_t           eventCount
 *         VkEvent*           pEvents
 *         VkDependencyInfo*  pDependencyInfos
 *     );
 */
internal external fun cmdWaitEvents2(address: Long, commandBuffer: Long, eventCount: Int, pEvents: Long, pDependencyInfos: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdPipelineBarrier2(
 *         VkCommandBuffer    commandBuffer
 *         VkDependencyInfo*  pDependencyInfo
 *     );
 */
internal external fun cmdPipelineBarrier2(address: Long, commandBuffer: Long, pDependencyInfo: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdWriteTimestamp2(
 *         VkCommandBuffer        commandBuffer
 *         VkPipelineStageFlags2  stage
 *         VkQueryPool            queryPool
 *         uint32_t               query
 *     );
 */
internal external fun cmdWriteTimestamp2(address: Long, commandBuffer: Long, stage: Long, queryPool: Long, query: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     VkResult vkQueueSubmit2(
 *         VkQueue         queue
 *         uint32_t        submitCount
 *         VkSubmitInfo2*  pSubmits
 *         VkFence         fence
 *     );
 */
internal external fun queueSubmit2(address: Long, queue: Long, submitCount: Int, pSubmits: Long, fence: Long): Int



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdCopyBuffer2(
 *         VkCommandBuffer     commandBuffer
 *         VkCopyBufferInfo2*  pCopyBufferInfo
 *     );
 */
internal external fun cmdCopyBuffer2(address: Long, commandBuffer: Long, pCopyBufferInfo: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdCopyImage2(
 *         VkCommandBuffer    commandBuffer
 *         VkCopyImageInfo2*  pCopyImageInfo
 *     );
 */
internal external fun cmdCopyImage2(address: Long, commandBuffer: Long, pCopyImageInfo: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdCopyBufferToImage2(
 *         VkCommandBuffer            commandBuffer
 *         VkCopyBufferToImageInfo2*  pCopyBufferToImageInfo
 *     );
 */
internal external fun cmdCopyBufferToImage2(address: Long, commandBuffer: Long, pCopyBufferToImageInfo: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdCopyImageToBuffer2(
 *         VkCommandBuffer            commandBuffer
 *         VkCopyImageToBufferInfo2*  pCopyImageToBufferInfo
 *     );
 */
internal external fun cmdCopyImageToBuffer2(address: Long, commandBuffer: Long, pCopyImageToBufferInfo: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdBlitImage2(
 *         VkCommandBuffer    commandBuffer
 *         VkBlitImageInfo2*  pBlitImageInfo
 *     );
 */
internal external fun cmdBlitImage2(address: Long, commandBuffer: Long, pBlitImageInfo: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdResolveImage2(
 *         VkCommandBuffer       commandBuffer
 *         VkResolveImageInfo2*  pResolveImageInfo
 *     );
 */
internal external fun cmdResolveImage2(address: Long, commandBuffer: Long, pResolveImageInfo: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdBeginRendering(
 *         VkCommandBuffer   commandBuffer
 *         VkRenderingInfo*  pRenderingInfo
 *     );
 */
internal external fun cmdBeginRendering(address: Long, commandBuffer: Long, pRenderingInfo: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdEndRendering(
 *         VkCommandBuffer  commandBuffer
 *     );
 */
internal external fun cmdEndRendering(address: Long, commandBuffer: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetCullMode(
 *         VkCommandBuffer  commandBuffer
 *         VkCullModeFlags  cullMode
 *     );
 */
internal external fun cmdSetCullMode(address: Long, commandBuffer: Long, cullMode: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetFrontFace(
 *         VkCommandBuffer  commandBuffer
 *         VkFrontFace      frontFace
 *     );
 */
internal external fun cmdSetFrontFace(address: Long, commandBuffer: Long, frontFace: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetPrimitiveTopology(
 *         VkCommandBuffer      commandBuffer
 *         VkPrimitiveTopology  primitiveTopology
 *     );
 */
internal external fun cmdSetPrimitiveTopology(address: Long, commandBuffer: Long, primitiveTopology: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetViewportWithCount(
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         viewportCount
 *         VkViewport*      pViewports
 *     );
 */
internal external fun cmdSetViewportWithCount(address: Long, commandBuffer: Long, viewportCount: Int, pViewports: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetScissorWithCount(
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         scissorCount
 *         VkRect2D*        pScissors
 *     );
 */
internal external fun cmdSetScissorWithCount(address: Long, commandBuffer: Long, scissorCount: Int, pScissors: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdBindVertexBuffers2(
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         firstBinding
 *         uint32_t         bindingCount
 *         VkBuffer*        pBuffers
 *         VkDeviceSize*    pOffsets
 *         VkDeviceSize*    pSizes
 *         VkDeviceSize*    pStrides
 *     );
 */
internal external fun cmdBindVertexBuffers2(address: Long, commandBuffer: Long, firstBinding: Int, bindingCount: Int, pBuffers: Long, pOffsets: Long, pSizes: Long, pStrides: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetDepthTestEnable(
 *         VkCommandBuffer  commandBuffer
 *         VkBool32         depthTestEnable
 *     );
 */
internal external fun cmdSetDepthTestEnable(address: Long, commandBuffer: Long, depthTestEnable: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetDepthWriteEnable(
 *         VkCommandBuffer  commandBuffer
 *         VkBool32         depthWriteEnable
 *     );
 */
internal external fun cmdSetDepthWriteEnable(address: Long, commandBuffer: Long, depthWriteEnable: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetDepthCompareOp(
 *         VkCommandBuffer  commandBuffer
 *         VkCompareOp      depthCompareOp
 *     );
 */
internal external fun cmdSetDepthCompareOp(address: Long, commandBuffer: Long, depthCompareOp: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetDepthBoundsTestEnable(
 *         VkCommandBuffer  commandBuffer
 *         VkBool32         depthBoundsTestEnable
 *     );
 */
internal external fun cmdSetDepthBoundsTestEnable(address: Long, commandBuffer: Long, depthBoundsTestEnable: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetStencilTestEnable(
 *         VkCommandBuffer  commandBuffer
 *         VkBool32         stencilTestEnable
 *     );
 */
internal external fun cmdSetStencilTestEnable(address: Long, commandBuffer: Long, stencilTestEnable: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetStencilOp(
 *         VkCommandBuffer     commandBuffer
 *         VkStencilFaceFlags  faceMask
 *         VkStencilOp         failOp
 *         VkStencilOp         passOp
 *         VkStencilOp         depthFailOp
 *         VkCompareOp         compareOp
 *     );
 */
internal external fun cmdSetStencilOp(address: Long, commandBuffer: Long, faceMask: Int, failOp: Int, passOp: Int, depthFailOp: Int, compareOp: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetRasterizerDiscardEnable(
 *         VkCommandBuffer  commandBuffer
 *         VkBool32         rasterizerDiscardEnable
 *     );
 */
internal external fun cmdSetRasterizerDiscardEnable(address: Long, commandBuffer: Long, rasterizerDiscardEnable: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetDepthBiasEnable(
 *         VkCommandBuffer  commandBuffer
 *         VkBool32         depthBiasEnable
 *     );
 */
internal external fun cmdSetDepthBiasEnable(address: Long, commandBuffer: Long, depthBiasEnable: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkCmdSetPrimitiveRestartEnable(
 *         VkCommandBuffer  commandBuffer
 *         VkBool32         primitiveRestartEnable
 *     );
 */
internal external fun cmdSetPrimitiveRestartEnable(address: Long, commandBuffer: Long, primitiveRestartEnable: Int)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkGetDeviceBufferMemoryRequirements(
 *         VkDevice                           device
 *         VkDeviceBufferMemoryRequirements*  pInfo
 *         VkMemoryRequirements2*             pMemoryRequirements
 *     );
 */
internal external fun getDeviceBufferMemoryRequirements(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkGetDeviceImageMemoryRequirements(
 *         VkDevice                          device
 *         VkDeviceImageMemoryRequirements*  pInfo
 *         VkMemoryRequirements2*            pMemoryRequirements
 *     );
 */
internal external fun getDeviceImageMemoryRequirements(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)



/**
 *     // provided by VK_VERSION_1_3
 *     void vkGetDeviceImageSparseMemoryRequirements(
 *         VkDevice                           device
 *         VkDeviceImageMemoryRequirements*   pInfo
 *         uint32_t*                          pSparseMemoryRequirementCount
 *         VkSparseImageMemoryRequirements2*  pSparseMemoryRequirements
 *     );
 */
internal external fun getDeviceImageSparseMemoryRequirements(address: Long, device: Long, pInfo: Long, pSparseMemoryRequirementCount: Long, pSparseMemoryRequirements: Long)



/**
 * Implementation of VkPrivateDataSlot.
 */
open class PrivateDataSlotH(override val address: Long) : Addressable



/**
 *     // provided by VK_VERSION_1_3
 *     enum VkPipelineCreationFeedbackFlagBits {
 *         VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT                               = 1
 *         VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT                           = 1
 *         VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT      = 2
 *         VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT  = 2
 *         VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT          = 4
 *         VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT_EXT      = 4
 *     }
 */
@JvmInline
value class PipelineCreationFeedbackFlags(val value: Int) {
	
	
	companion object {
		
		val VALID = PipelineCreationFeedbackFlags(1)
		
		val APPLICATION_PIPELINE_CACHE_HIT = PipelineCreationFeedbackFlags(2)
		
		val BASE_PIPELINE_ACCELERATION = PipelineCreationFeedbackFlags(4)
	
	}
	
	
	
	operator fun plus(mask: PipelineCreationFeedbackFlags) = PipelineCreationFeedbackFlags(value or mask.value)
	
	operator fun contains(mask: PipelineCreationFeedbackFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [PipelineCreationFeedbackFlags].
 */
inline fun PipelineCreationFeedbackFlags(block: PipelineCreationFeedbackFlags.Companion.() -> PipelineCreationFeedbackFlags) = block(PipelineCreationFeedbackFlags)



/**
 *     // provided by VK_VERSION_1_3
 *     enum VkToolPurposeFlagBits {
 *         VK_TOOL_PURPOSE_VALIDATION_BIT               = 1
 *         VK_TOOL_PURPOSE_VALIDATION_BIT_EXT           = 1
 *         VK_TOOL_PURPOSE_PROFILING_BIT                = 2
 *         VK_TOOL_PURPOSE_PROFILING_BIT_EXT            = 2
 *         VK_TOOL_PURPOSE_TRACING_BIT                  = 4
 *         VK_TOOL_PURPOSE_TRACING_BIT_EXT              = 4
 *         VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT      = 8
 *         VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT  = 8
 *         VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT       = 16
 *         VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT   = 16
 *         VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT      = 32
 *         VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT        = 64
 *     }
 */
@JvmInline
value class ToolPurposeFlags(val value: Int) {
	
	
	companion object {
		
		val VALIDATION = ToolPurposeFlags(1)
		
		val PROFILING = ToolPurposeFlags(2)
		
		val TRACING = ToolPurposeFlags(4)
		
		val ADDITIONAL_FEATURES = ToolPurposeFlags(8)
		
		val MODIFYING_FEATURES = ToolPurposeFlags(16)
	
	}
	
	
	
	operator fun plus(mask: ToolPurposeFlags) = ToolPurposeFlags(value or mask.value)
	
	operator fun contains(mask: ToolPurposeFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [ToolPurposeFlags].
 */
inline fun ToolPurposeFlags(block: ToolPurposeFlags.Companion.() -> ToolPurposeFlags) = block(ToolPurposeFlags)



/**
 *     // provided by VK_VERSION_1_3
 *     enum VkPipelineStageFlagBits2 {
 *         VK_PIPELINE_STAGE_2_NONE                                      = 0
 *         VK_PIPELINE_STAGE_2_NONE_KHR                                  = 0
 *         VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT                           = 1
 *         VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR                       = 1
 *         VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT                         = 2
 *         VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR                     = 2
 *         VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT                          = 4
 *         VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR                      = 4
 *         VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT                         = 8
 *         VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR                     = 8
 *         VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT           = 16
 *         VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR       = 16
 *         VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT        = 32
 *         VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR    = 32
 *         VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT                       = 64
 *         VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR                   = 64
 *         VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT                       = 128
 *         VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR                   = 128
 *         VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT                  = 256
 *         VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR              = 256
 *         VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT                   = 512
 *         VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR               = 512
 *         VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT               = 1024
 *         VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR           = 1024
 *         VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT                        = 2048
 *         VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR                    = 2048
 *         VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT                          = 4096
 *         VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR                      = 4096
 *         VK_PIPELINE_STAGE_2_TRANSFER_BIT                              = 4096
 *         VK_PIPELINE_STAGE_2_TRANSFER_BIT_KHR                          = 4096
 *         VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT                        = 8192
 *         VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR                    = 8192
 *         VK_PIPELINE_STAGE_2_HOST_BIT                                  = 16384
 *         VK_PIPELINE_STAGE_2_HOST_BIT_KHR                              = 16384
 *         VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT                          = 32768
 *         VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR                      = 32768
 *         VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT                          = 65536
 *         VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR                      = 65536
 *         VK_PIPELINE_STAGE_2_COPY_BIT                                  = 4294967296
 *         VK_PIPELINE_STAGE_2_COPY_BIT_KHR                              = 4294967296
 *         VK_PIPELINE_STAGE_2_RESOLVE_BIT                               = 8589934592
 *         VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR                           = 8589934592
 *         VK_PIPELINE_STAGE_2_BLIT_BIT                                  = 17179869184
 *         VK_PIPELINE_STAGE_2_BLIT_BIT_KHR                              = 17179869184
 *         VK_PIPELINE_STAGE_2_CLEAR_BIT                                 = 34359738368
 *         VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR                             = 34359738368
 *         VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT                           = 68719476736
 *         VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR                       = 68719476736
 *         VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT                = 137438953472
 *         VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR            = 137438953472
 *         VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT             = 274877906944
 *         VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR         = 274877906944
 *         VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR                      = 67108864
 *         VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR                      = 134217728
 *         VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT                = 16777216
 *         VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT             = 262144
 *         VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV                 = 131072
 *         VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR  = 4194304
 *         VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV                 = 4194304
 *         VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR      = 33554432
 *         VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR                = 2097152
 *         VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV                 = 2097152
 *         VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV       = 33554432
 *         VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT          = 8388608
 *         VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV                        = 524288
 *         VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV                        = 1048576
 *         VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI                = 549755813888
 *         VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI                = 1099511627776
 *         VK_PIPELINE_STAGE_2_RESERVED_387_BIT_KHR                      = 268435456
 *     }
 */
@JvmInline
value class PipelineStageFlags2(val value: Long) {
	
	
	companion object {
		
		val NONE = PipelineStageFlags2(0)
		
		val TOP_OF_PIPE = PipelineStageFlags2(1)
		
		val DRAW_INDIRECT = PipelineStageFlags2(2)
		
		val VERTEX_INPUT = PipelineStageFlags2(4)
		
		val VERTEX_SHADER = PipelineStageFlags2(8)
		
		val TESSELLATION_CONTROL_SHADER = PipelineStageFlags2(16)
		
		val TESSELLATION_EVALUATION_SHADER = PipelineStageFlags2(32)
		
		val GEOMETRY_SHADER = PipelineStageFlags2(64)
		
		val FRAGMENT_SHADER = PipelineStageFlags2(128)
		
		val EARLY_FRAGMENT_TESTS = PipelineStageFlags2(256)
		
		val LATE_FRAGMENT_TESTS = PipelineStageFlags2(512)
		
		val COLOR_ATTACHMENT_OUTPUT = PipelineStageFlags2(1024)
		
		val COMPUTE_SHADER = PipelineStageFlags2(2048)
		
		val ALL_TRANSFER = PipelineStageFlags2(4096)
		
		val BOTTOM_OF_PIPE = PipelineStageFlags2(8192)
		
		val HOST = PipelineStageFlags2(16384)
		
		val ALL_GRAPHICS = PipelineStageFlags2(32768)
		
		val ALL_COMMANDS = PipelineStageFlags2(65536)
		
		val COPY = PipelineStageFlags2(4294967296)
		
		val RESOLVE = PipelineStageFlags2(8589934592)
		
		val BLIT = PipelineStageFlags2(17179869184)
		
		val CLEAR = PipelineStageFlags2(34359738368)
		
		val INDEX_INPUT = PipelineStageFlags2(68719476736)
		
		val VERTEX_ATTRIBUTE_INPUT = PipelineStageFlags2(137438953472)
		
		val PRE_RASTERIZATION_SHADERS = PipelineStageFlags2(274877906944)
	
	}
	
	
	
	operator fun plus(mask: PipelineStageFlags2) = PipelineStageFlags2(value or mask.value)
	
	operator fun contains(mask: PipelineStageFlags2) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [PipelineStageFlags2].
 */
inline fun PipelineStageFlags2(block: PipelineStageFlags2.Companion.() -> PipelineStageFlags2) = block(PipelineStageFlags2)



/**
 *     // provided by VK_VERSION_1_3
 *     enum VkAccessFlagBits2 {
 *         VK_ACCESS_2_NONE                                           = 0
 *         VK_ACCESS_2_NONE_KHR                                       = 0
 *         VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT                      = 1
 *         VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR                  = 1
 *         VK_ACCESS_2_INDEX_READ_BIT                                 = 2
 *         VK_ACCESS_2_INDEX_READ_BIT_KHR                             = 2
 *         VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT                      = 4
 *         VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR                  = 4
 *         VK_ACCESS_2_UNIFORM_READ_BIT                               = 8
 *         VK_ACCESS_2_UNIFORM_READ_BIT_KHR                           = 8
 *         VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT                      = 16
 *         VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR                  = 16
 *         VK_ACCESS_2_SHADER_READ_BIT                                = 32
 *         VK_ACCESS_2_SHADER_READ_BIT_KHR                            = 32
 *         VK_ACCESS_2_SHADER_WRITE_BIT                               = 64
 *         VK_ACCESS_2_SHADER_WRITE_BIT_KHR                           = 64
 *         VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT                      = 128
 *         VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR                  = 128
 *         VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT                     = 256
 *         VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR                 = 256
 *         VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT              = 512
 *         VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR          = 512
 *         VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT             = 1024
 *         VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR         = 1024
 *         VK_ACCESS_2_TRANSFER_READ_BIT                              = 2048
 *         VK_ACCESS_2_TRANSFER_READ_BIT_KHR                          = 2048
 *         VK_ACCESS_2_TRANSFER_WRITE_BIT                             = 4096
 *         VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR                         = 4096
 *         VK_ACCESS_2_HOST_READ_BIT                                  = 8192
 *         VK_ACCESS_2_HOST_READ_BIT_KHR                              = 8192
 *         VK_ACCESS_2_HOST_WRITE_BIT                                 = 16384
 *         VK_ACCESS_2_HOST_WRITE_BIT_KHR                             = 16384
 *         VK_ACCESS_2_MEMORY_READ_BIT                                = 32768
 *         VK_ACCESS_2_MEMORY_READ_BIT_KHR                            = 32768
 *         VK_ACCESS_2_MEMORY_WRITE_BIT                               = 65536
 *         VK_ACCESS_2_MEMORY_WRITE_BIT_KHR                           = 65536
 *         VK_ACCESS_2_SHADER_SAMPLED_READ_BIT                        = 4294967296
 *         VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR                    = 4294967296
 *         VK_ACCESS_2_SHADER_STORAGE_READ_BIT                        = 8589934592
 *         VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR                    = 8589934592
 *         VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT                       = 17179869184
 *         VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR                   = 17179869184
 *         VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR                      = 34359738368
 *         VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR                     = 68719476736
 *         VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR                      = 137438953472
 *         VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR                     = 274877906944
 *         VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT               = 33554432
 *         VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT        = 67108864
 *         VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT       = 134217728
 *         VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT             = 1048576
 *         VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV                 = 131072
 *         VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV                = 262144
 *         VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR  = 8388608
 *         VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV                 = 8388608
 *         VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR            = 2097152
 *         VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR           = 4194304
 *         VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV             = 2097152
 *         VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV            = 4194304
 *         VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT              = 16777216
 *         VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT      = 524288
 *         VK_ACCESS_2_RESERVED_41_BIT_AMD                            = 2199023255552
 *         VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI                = 549755813888
 *         VK_ACCESS_2_RESERVED_387_BIT_KHR                           = 1099511627776
 *     }
 */
@JvmInline
value class AccessFlags2(val value: Long) {
	
	
	companion object {
		
		val NONE = AccessFlags2(0)
		
		val INDIRECT_COMMAND_READ = AccessFlags2(1)
		
		val INDEX_READ = AccessFlags2(2)
		
		val VERTEX_ATTRIBUTE_READ = AccessFlags2(4)
		
		val UNIFORM_READ = AccessFlags2(8)
		
		val INPUT_ATTACHMENT_READ = AccessFlags2(16)
		
		val SHADER_READ = AccessFlags2(32)
		
		val SHADER_WRITE = AccessFlags2(64)
		
		val COLOR_ATTACHMENT_READ = AccessFlags2(128)
		
		val COLOR_ATTACHMENT_WRITE = AccessFlags2(256)
		
		val DEPTH_STENCIL_ATTACHMENT_READ = AccessFlags2(512)
		
		val DEPTH_STENCIL_ATTACHMENT_WRITE = AccessFlags2(1024)
		
		val TRANSFER_READ = AccessFlags2(2048)
		
		val TRANSFER_WRITE = AccessFlags2(4096)
		
		val HOST_READ = AccessFlags2(8192)
		
		val HOST_WRITE = AccessFlags2(16384)
		
		val MEMORY_READ = AccessFlags2(32768)
		
		val MEMORY_WRITE = AccessFlags2(65536)
		
		val SHADER_SAMPLED_READ = AccessFlags2(4294967296)
		
		val SHADER_STORAGE_READ = AccessFlags2(8589934592)
		
		val SHADER_STORAGE_WRITE = AccessFlags2(17179869184)
	
	}
	
	
	
	operator fun plus(mask: AccessFlags2) = AccessFlags2(value or mask.value)
	
	operator fun contains(mask: AccessFlags2) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [AccessFlags2].
 */
inline fun AccessFlags2(block: AccessFlags2.Companion.() -> AccessFlags2) = block(AccessFlags2)



/**
 *     // provided by VK_VERSION_1_3
 *     enum VkSubmitFlagBits {
 *         VK_SUBMIT_PROTECTED_BIT      = 1
 *         VK_SUBMIT_PROTECTED_BIT_KHR  = 1
 *     }
 */
@JvmInline
value class SubmitFlags(val value: Int) {
	
	
	companion object {
		
		val PROTECTED = SubmitFlags(1)
	
	}
	
	
	
	operator fun plus(mask: SubmitFlags) = SubmitFlags(value or mask.value)
	
	operator fun contains(mask: SubmitFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [SubmitFlags].
 */
inline fun SubmitFlags(block: SubmitFlags.Companion.() -> SubmitFlags) = block(SubmitFlags)



/**
 *     // provided by VK_VERSION_1_3
 *     enum VkRenderingFlagBits {
 *         VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT      = 1
 *         VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR  = 1
 *         VK_RENDERING_SUSPENDING_BIT                              = 2
 *         VK_RENDERING_SUSPENDING_BIT_KHR                          = 2
 *         VK_RENDERING_RESUMING_BIT                                = 4
 *         VK_RENDERING_RESUMING_BIT_KHR                            = 4
 *     }
 */
@JvmInline
value class RenderingFlags(val value: Int) {
	
	
	companion object {
		
		val CONTENTS_SECONDARY_COMMAND_BUFFERS = RenderingFlags(1)
		
		val SUSPENDING = RenderingFlags(2)
		
		val RESUMING = RenderingFlags(4)
	
	}
	
	
	
	operator fun plus(mask: RenderingFlags) = RenderingFlags(value or mask.value)
	
	operator fun contains(mask: RenderingFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [RenderingFlags].
 */
inline fun RenderingFlags(block: RenderingFlags.Companion.() -> RenderingFlags) = block(RenderingFlags)



/**
 *     // provided by VK_VERSION_1_3
 *     enum VkFormatFeatureFlagBits2 {
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT                                                                = 1
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT_KHR                                                            = 1
 *         VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT                                                                = 2
 *         VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT_KHR                                                            = 2
 *         VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT                                                         = 4
 *         VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT_KHR                                                     = 4
 *         VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT                                                         = 8
 *         VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR                                                     = 8
 *         VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT                                                         = 16
 *         VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT_KHR                                                     = 16
 *         VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT                                                  = 32
 *         VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT_KHR                                              = 32
 *         VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT                                                                = 64
 *         VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT_KHR                                                            = 64
 *         VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT                                                             = 128
 *         VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT_KHR                                                         = 128
 *         VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT                                                       = 256
 *         VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT_KHR                                                   = 256
 *         VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT                                                     = 512
 *         VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT_KHR                                                 = 512
 *         VK_FORMAT_FEATURE_2_BLIT_SRC_BIT                                                                     = 1024
 *         VK_FORMAT_FEATURE_2_BLIT_SRC_BIT_KHR                                                                 = 1024
 *         VK_FORMAT_FEATURE_2_BLIT_DST_BIT                                                                     = 2048
 *         VK_FORMAT_FEATURE_2_BLIT_DST_BIT_KHR                                                                 = 2048
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT                                                  = 4096
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT_KHR                                              = 4096
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT                                                   = 8192
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT                                               = 8192
 *         VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT                                                                 = 16384
 *         VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT_KHR                                                             = 16384
 *         VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT                                                                 = 32768
 *         VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT_KHR                                                             = 32768
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT                                                  = 65536
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT_KHR                                              = 65536
 *         VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT                                                      = 131072
 *         VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT_KHR                                                  = 131072
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT                                 = 262144
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR                             = 262144
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT                = 524288
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR            = 524288
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT                = 1048576
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR            = 1048576
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT      = 2097152
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR  = 2097152
 *         VK_FORMAT_FEATURE_2_DISJOINT_BIT                                                                     = 4194304
 *         VK_FORMAT_FEATURE_2_DISJOINT_BIT_KHR                                                                 = 4194304
 *         VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT                                                       = 8388608
 *         VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT_KHR                                                   = 8388608
 *         VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT                                                  = 2147483648
 *         VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT_KHR                                              = 2147483648
 *         VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT                                                 = 4294967296
 *         VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT_KHR                                             = 4294967296
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT                                               = 8589934592
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT_KHR                                           = 8589934592
 *         VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR                                                      = 33554432
 *         VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR                                                         = 67108864
 *         VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR                                     = 536870912
 *         VK_FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT                                                     = 16777216
 *         VK_FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR                                         = 1073741824
 *         VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR                                                       = 134217728
 *         VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR                                                         = 268435456
 *         VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV                                                   = 274877906944
 *         VK_FORMAT_FEATURE_2_RESERVED_34_BIT_QCOM                                                             = 17179869184
 *         VK_FORMAT_FEATURE_2_RESERVED_35_BIT_QCOM                                                             = 34359738368
 *         VK_FORMAT_FEATURE_2_RESERVED_36_BIT_QCOM                                                             = 68719476736
 *         VK_FORMAT_FEATURE_2_RESERVED_37_BIT_QCOM                                                             = 137438953472
 *     }
 */
@JvmInline
value class FormatFeatureFlags2(val value: Long) {
	
	
	companion object {
		
		val SAMPLED_IMAGE = FormatFeatureFlags2(1)
		
		val STORAGE_IMAGE = FormatFeatureFlags2(2)
		
		val STORAGE_IMAGE_ATOMIC = FormatFeatureFlags2(4)
		
		val UNIFORM_TEXEL_BUFFER = FormatFeatureFlags2(8)
		
		val STORAGE_TEXEL_BUFFER = FormatFeatureFlags2(16)
		
		val STORAGE_TEXEL_BUFFER_ATOMIC = FormatFeatureFlags2(32)
		
		val VERTEX_BUFFER = FormatFeatureFlags2(64)
		
		val COLOR_ATTACHMENT = FormatFeatureFlags2(128)
		
		val COLOR_ATTACHMENT_BLEND = FormatFeatureFlags2(256)
		
		val DEPTH_STENCIL_ATTACHMENT = FormatFeatureFlags2(512)
		
		val BLIT_SRC = FormatFeatureFlags2(1024)
		
		val BLIT_DST = FormatFeatureFlags2(2048)
		
		val SAMPLED_IMAGE_FILTER_LINEAR = FormatFeatureFlags2(4096)
		
		val SAMPLED_IMAGE_FILTER_CUBIC = FormatFeatureFlags2(8192)
		
		val TRANSFER_SRC = FormatFeatureFlags2(16384)
		
		val TRANSFER_DST = FormatFeatureFlags2(32768)
		
		val SAMPLED_IMAGE_FILTER_MINMAX = FormatFeatureFlags2(65536)
		
		val MIDPOINT_CHROMA_SAMPLES = FormatFeatureFlags2(131072)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER = FormatFeatureFlags2(262144)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER = FormatFeatureFlags2(524288)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT = FormatFeatureFlags2(1048576)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE = FormatFeatureFlags2(2097152)
		
		val DISJOINT = FormatFeatureFlags2(4194304)
		
		val COSITED_CHROMA_SAMPLES = FormatFeatureFlags2(8388608)
		
		val STORAGE_READ_WITHOUT_FORMAT = FormatFeatureFlags2(2147483648)
		
		val STORAGE_WRITE_WITHOUT_FORMAT = FormatFeatureFlags2(4294967296)
		
		val SAMPLED_IMAGE_DEPTH_COMPARISON = FormatFeatureFlags2(8589934592)
	
	}
	
	
	
	operator fun plus(mask: FormatFeatureFlags2) = FormatFeatureFlags2(value or mask.value)
	
	operator fun contains(mask: FormatFeatureFlags2) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [FormatFeatureFlags2].
 */
inline fun FormatFeatureFlags2(block: FormatFeatureFlags2.Companion.() -> FormatFeatureFlags2) = block(FormatFeatureFlags2)



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceVulkan13Features {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         robustImageAccess
 *         VkBool32         inlineUniformBlock
 *         VkBool32         descriptorBindingInlineUniformBlockUpdateAfterBind
 *         VkBool32         pipelineCreationCacheControl
 *         VkBool32         privateData
 *         VkBool32         shaderDemoteToHelperInvocation
 *         VkBool32         shaderTerminateInvocation
 *         VkBool32         subgroupSizeControl
 *         VkBool32         computeFullSubgroups
 *         VkBool32         synchronization2
 *         VkBool32         textureCompressionASTC_HDR
 *         VkBool32         shaderZeroInitializeWorkgroupMemory
 *         VkBool32         dynamicRendering
 *         VkBool32         shaderIntegerDotProduct
 *         VkBool32         maintenance4
 *     }
 */
@JvmInline
value class PhysicalDeviceVulkan13Features(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var robustImageAccess: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var inlineUniformBlock: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var descriptorBindingInlineUniformBlockUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pipelineCreationCacheControl: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var privateData: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var shaderDemoteToHelperInvocation: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var shaderTerminateInvocation: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var subgroupSizeControl: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var computeFullSubgroups: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var synchronization2: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var textureCompressionASTC_HDR: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var shaderZeroInitializeWorkgroupMemory: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var dynamicRendering: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var shaderIntegerDotProduct: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var maintenance4: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)


}



/**
 * Struct calloc function for [PhysicalDeviceVulkan13Features].
 */
inline fun Allocator.PhysicalDeviceVulkan13Features(block: (PhysicalDeviceVulkan13Features) -> Unit) = PhysicalDeviceVulkan13Features(calloc(80)).apply(block).also { it.sType = 53 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceVulkan13Properties {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         uint32_t            minSubgroupSize
 *         uint32_t            maxSubgroupSize
 *         uint32_t            maxComputeWorkgroupSubgroups
 *         VkShaderStageFlags  requiredSubgroupSizeStages
 *         uint32_t            maxInlineUniformBlockSize
 *         uint32_t            maxPerStageDescriptorInlineUniformBlocks
 *         uint32_t            maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks
 *         uint32_t            maxDescriptorSetInlineUniformBlocks
 *         uint32_t            maxDescriptorSetUpdateAfterBindInlineUniformBlocks
 *         uint32_t            maxInlineUniformTotalSize
 *         VkBool32            integerDotProduct8BitUnsignedAccelerated
 *         VkBool32            integerDotProduct8BitSignedAccelerated
 *         VkBool32            integerDotProduct8BitMixedSignednessAccelerated
 *         VkBool32            integerDotProduct4x8BitPackedUnsignedAccelerated
 *         VkBool32            integerDotProduct4x8BitPackedSignedAccelerated
 *         VkBool32            integerDotProduct4x8BitPackedMixedSignednessAccelerated
 *         VkBool32            integerDotProduct16BitUnsignedAccelerated
 *         VkBool32            integerDotProduct16BitSignedAccelerated
 *         VkBool32            integerDotProduct16BitMixedSignednessAccelerated
 *         VkBool32            integerDotProduct32BitUnsignedAccelerated
 *         VkBool32            integerDotProduct32BitSignedAccelerated
 *         VkBool32            integerDotProduct32BitMixedSignednessAccelerated
 *         VkBool32            integerDotProduct64BitUnsignedAccelerated
 *         VkBool32            integerDotProduct64BitSignedAccelerated
 *         VkBool32            integerDotProduct64BitMixedSignednessAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating8BitUnsignedAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating8BitSignedAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating16BitUnsignedAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating16BitSignedAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating32BitUnsignedAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating32BitSignedAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating64BitUnsignedAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating64BitSignedAccelerated
 *         VkBool32            integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated
 *         VkDeviceSize        storageTexelBufferOffsetAlignmentBytes
 *         VkBool32            storageTexelBufferOffsetSingleTexelAlignment
 *         VkDeviceSize        uniformTexelBufferOffsetAlignmentBytes
 *         VkBool32            uniformTexelBufferOffsetSingleTexelAlignment
 *         VkDeviceSize        maxBufferSize
 *     }
 */
@JvmInline
value class PhysicalDeviceVulkan13Properties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var minSubgroupSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxSubgroupSize: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxComputeWorkgroupSubgroups: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var requiredSubgroupSizeStages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var maxInlineUniformBlockSize: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var maxPerStageDescriptorInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var maxDescriptorSetInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var maxDescriptorSetUpdateAfterBindInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var maxInlineUniformTotalSize: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var integerDotProduct8BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var integerDotProduct8BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var integerDotProduct8BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var integerDotProduct4x8BitPackedUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var integerDotProduct4x8BitPackedSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var integerDotProduct4x8BitPackedMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var integerDotProduct16BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var integerDotProduct16BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var integerDotProduct16BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var integerDotProduct32BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var integerDotProduct32BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var integerDotProduct32BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 100)
		set(value) = Unsafe.setInt(address + 100, value)
	
	var integerDotProduct64BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 104)
		set(value) = Unsafe.setInt(address + 104, value)
	
	var integerDotProduct64BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 108)
		set(value) = Unsafe.setInt(address + 108, value)
	
	var integerDotProduct64BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 112)
		set(value) = Unsafe.setInt(address + 112, value)
	
	var integerDotProductAccumulatingSaturating8BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 116)
		set(value) = Unsafe.setInt(address + 116, value)
	
	var integerDotProductAccumulatingSaturating8BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 124)
		set(value) = Unsafe.setInt(address + 124, value)
	
	var integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 128)
		set(value) = Unsafe.setInt(address + 128, value)
	
	var integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 132)
		set(value) = Unsafe.setInt(address + 132, value)
	
	var integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 136)
		set(value) = Unsafe.setInt(address + 136, value)
	
	var integerDotProductAccumulatingSaturating16BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 140)
		set(value) = Unsafe.setInt(address + 140, value)
	
	var integerDotProductAccumulatingSaturating16BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 144)
		set(value) = Unsafe.setInt(address + 144, value)
	
	var integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 148)
		set(value) = Unsafe.setInt(address + 148, value)
	
	var integerDotProductAccumulatingSaturating32BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 152)
		set(value) = Unsafe.setInt(address + 152, value)
	
	var integerDotProductAccumulatingSaturating32BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 156)
		set(value) = Unsafe.setInt(address + 156, value)
	
	var integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 160)
		set(value) = Unsafe.setInt(address + 160, value)
	
	var integerDotProductAccumulatingSaturating64BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 164)
		set(value) = Unsafe.setInt(address + 164, value)
	
	var integerDotProductAccumulatingSaturating64BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 168)
		set(value) = Unsafe.setInt(address + 168, value)
	
	var integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 172)
		set(value) = Unsafe.setInt(address + 172, value)
	
	var storageTexelBufferOffsetAlignmentBytes: Long
		get()      = Unsafe.getLong(address + 176)
		set(value) = Unsafe.setLong(address + 176, value)
	
	var storageTexelBufferOffsetSingleTexelAlignment: Int
		get()      = Unsafe.getInt(address + 184)
		set(value) = Unsafe.setInt(address + 184, value)
	
	var uniformTexelBufferOffsetAlignmentBytes: Long
		get()      = Unsafe.getLong(address + 192)
		set(value) = Unsafe.setLong(address + 192, value)
	
	var uniformTexelBufferOffsetSingleTexelAlignment: Int
		get()      = Unsafe.getInt(address + 200)
		set(value) = Unsafe.setInt(address + 200, value)
	
	var maxBufferSize: Long
		get()      = Unsafe.getLong(address + 208)
		set(value) = Unsafe.setLong(address + 208, value)


}



/**
 * Struct calloc function for [PhysicalDeviceVulkan13Properties].
 */
inline fun Allocator.PhysicalDeviceVulkan13Properties(block: (PhysicalDeviceVulkan13Properties) -> Unit) = PhysicalDeviceVulkan13Properties(calloc(216)).apply(block).also { it.sType = 54 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPipelineCreationFeedbackCreateInfo {
 *         VkStructureType              sType
 *         void*                        pNext (must be null)
 *         VkPipelineCreationFeedback*  pPipelineCreationFeedback
 *         uint32_t                     pipelineStageCreationFeedbackCount
 *         VkPipelineCreationFeedback*  pPipelineStageCreationFeedbacks
 *     }
 */
@JvmInline
value class PipelineCreationFeedbackCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pPipelineCreationFeedback: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var pipelineStageCreationFeedbackCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pPipelineStageCreationFeedbacks: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var pipelineCreationFeedback: PipelineCreationFeedback
		get()      = PipelineCreationFeedback(Unsafe.getLong(address + 16))
		set(value) { Unsafe.setLong(address + 16, value.address) }
	
	var pipelineStageCreationFeedbacks: PipelineCreationFeedback.Buffer
		get()      = PipelineCreationFeedback.Buffer(Unsafe.getLong(address + 32), pipelineStageCreationFeedbackCount)
		set(value) { Unsafe.setLong(address + 32, value.address); pipelineStageCreationFeedbackCount = value.capacity }


}



/**
 * Struct calloc function for [PipelineCreationFeedbackCreateInfo].
 */
inline fun Allocator.PipelineCreationFeedbackCreateInfo(block: (PipelineCreationFeedbackCreateInfo) -> Unit) = PipelineCreationFeedbackCreateInfo(calloc(40)).apply(block).also { it.sType = 1000192000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPipelineCreationFeedback {
 *         VkPipelineCreationFeedbackFlags  flags
 *         uint64_t                         duration
 *     }
 */
@JvmInline
value class PipelineCreationFeedback(override val address: Long) : Addressable {
	
	
	var flags: PipelineCreationFeedbackFlags
		get()      = PipelineCreationFeedbackFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var duration: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PipelineCreationFeedback(offset(index))
		
		operator fun set(index: Int, value: PipelineCreationFeedback) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (PipelineCreationFeedback) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineCreationFeedback) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PipelineCreationFeedback) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [PipelineCreationFeedback].
 */
inline fun Allocator.PipelineCreationFeedback(block: (PipelineCreationFeedback) -> Unit) = PipelineCreationFeedback(calloc(16)).apply(block)



/**
 * Struct buffer calloc function for [PipelineCreationFeedback].
 */
inline fun Allocator.PipelineCreationFeedback(capacity: Int, block: (PipelineCreationFeedback.Buffer) -> Unit) = PipelineCreationFeedback.Buffer(calloc(capacity * 16), capacity).apply(block)



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceShaderTerminateInvocationFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderTerminateInvocation
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderTerminateInvocationFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderTerminateInvocation: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceShaderTerminateInvocationFeatures].
 */
inline fun Allocator.PhysicalDeviceShaderTerminateInvocationFeatures(block: (PhysicalDeviceShaderTerminateInvocationFeatures) -> Unit) = PhysicalDeviceShaderTerminateInvocationFeatures(calloc(24)).apply(block).also { it.sType = 1000215000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceToolProperties {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         char                name[256]
 *         char                version[256]
 *         VkToolPurposeFlags  purposes
 *         char                description[256]
 *         char                layer[256]
 *     }
 */
@JvmInline
value class PhysicalDeviceToolProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var name: DirectByteBuffer
		get()      = DirectByteBuffer(address + 16, 256)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)
	
	var version: DirectByteBuffer
		get()      = DirectByteBuffer(address + 272, 256)
		set(value) = Unsafe.copy(value.address, address + 272, value.byteSize)
	
	var purposes: ToolPurposeFlags
		get()      = ToolPurposeFlags(Unsafe.getInt(address + 528))
		set(value) = Unsafe.setInt(address + 528, value.value)
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + 532, 256)
		set(value) = Unsafe.copy(value.address, address + 532, value.byteSize)
	
	var layer: DirectByteBuffer
		get()      = DirectByteBuffer(address + 788, 256)
		set(value) = Unsafe.copy(value.address, address + 788, value.byteSize)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 1048
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PhysicalDeviceToolProperties(offset(index))
		
		operator fun set(index: Int, value: PhysicalDeviceToolProperties) = Unsafe.copy(value.address, offset(index), 1048)
		
		inline fun forEach(block: (PhysicalDeviceToolProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PhysicalDeviceToolProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PhysicalDeviceToolProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [PhysicalDeviceToolProperties].
 */
inline fun Allocator.PhysicalDeviceToolProperties(block: (PhysicalDeviceToolProperties) -> Unit) = PhysicalDeviceToolProperties(calloc(1048)).apply(block).also { it.sType = 1000245000 }



/**
 * Struct buffer calloc function for [PhysicalDeviceToolProperties].
 */
inline fun Allocator.PhysicalDeviceToolProperties(capacity: Int, block: (PhysicalDeviceToolProperties.Buffer) -> Unit) = PhysicalDeviceToolProperties.Buffer(calloc(capacity * 1048), capacity).apply(block).apply { forEach { it.sType = 1000245000 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderDemoteToHelperInvocation
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderDemoteToHelperInvocationFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderDemoteToHelperInvocation: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceShaderDemoteToHelperInvocationFeatures].
 */
inline fun Allocator.PhysicalDeviceShaderDemoteToHelperInvocationFeatures(block: (PhysicalDeviceShaderDemoteToHelperInvocationFeatures) -> Unit) = PhysicalDeviceShaderDemoteToHelperInvocationFeatures(calloc(24)).apply(block).also { it.sType = 1000276000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDevicePrivateDataFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         privateData
 *     }
 */
@JvmInline
value class PhysicalDevicePrivateDataFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var privateData: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDevicePrivateDataFeatures].
 */
inline fun Allocator.PhysicalDevicePrivateDataFeatures(block: (PhysicalDevicePrivateDataFeatures) -> Unit) = PhysicalDevicePrivateDataFeatures(calloc(24)).apply(block).also { it.sType = 1000295000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkDevicePrivateDataCreateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         privateDataSlotRequestCount
 *     }
 */
@JvmInline
value class DevicePrivateDataCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var privateDataSlotRequestCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [DevicePrivateDataCreateInfo].
 */
inline fun Allocator.DevicePrivateDataCreateInfo(block: (DevicePrivateDataCreateInfo) -> Unit) = DevicePrivateDataCreateInfo(calloc(24)).apply(block).also { it.sType = 1000295001 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPrivateDataSlotCreateInfo {
 *         VkStructureType               sType
 *         void*                         pNext (must be null)
 *         VkPrivateDataSlotCreateFlags  flags (reserved, must be zero)
 *     }
 */
@JvmInline
value class PrivateDataSlotCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PrivateDataSlotCreateInfo].
 */
inline fun Allocator.PrivateDataSlotCreateInfo(block: (PrivateDataSlotCreateInfo) -> Unit) = PrivateDataSlotCreateInfo(calloc(24)).apply(block).also { it.sType = 1000295002 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDevicePipelineCreationCacheControlFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         pipelineCreationCacheControl
 *     }
 */
@JvmInline
value class PhysicalDevicePipelineCreationCacheControlFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pipelineCreationCacheControl: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDevicePipelineCreationCacheControlFeatures].
 */
inline fun Allocator.PhysicalDevicePipelineCreationCacheControlFeatures(block: (PhysicalDevicePipelineCreationCacheControlFeatures) -> Unit) = PhysicalDevicePipelineCreationCacheControlFeatures(calloc(24)).apply(block).also { it.sType = 1000297000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkMemoryBarrier2 {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkPipelineStageFlags2  srcStageMask
 *         VkAccessFlags2         srcAccessMask
 *         VkPipelineStageFlags2  dstStageMask
 *         VkAccessFlags2         dstAccessMask
 *     }
 */
@JvmInline
value class MemoryBarrier2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.value)
	
	var srcAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.value)
	
	var dstStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.value)
	
	var dstAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = MemoryBarrier2(offset(index))
		
		operator fun set(index: Int, value: MemoryBarrier2) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (MemoryBarrier2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MemoryBarrier2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, MemoryBarrier2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [MemoryBarrier2].
 */
inline fun Allocator.MemoryBarrier2(block: (MemoryBarrier2) -> Unit) = MemoryBarrier2(calloc(48)).apply(block).also { it.sType = 1000314000 }



/**
 * Struct buffer calloc function for [MemoryBarrier2].
 */
inline fun Allocator.MemoryBarrier2(capacity: Int, block: (MemoryBarrier2.Buffer) -> Unit) = MemoryBarrier2.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000314000 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkBufferMemoryBarrier2 {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkPipelineStageFlags2  srcStageMask
 *         VkAccessFlags2         srcAccessMask
 *         VkPipelineStageFlags2  dstStageMask
 *         VkAccessFlags2         dstAccessMask
 *         uint32_t               srcQueueFamilyIndex
 *         uint32_t               dstQueueFamilyIndex
 *         VkBuffer               buffer
 *         VkDeviceSize           offset
 *         VkDeviceSize           size
 *     }
 */
@JvmInline
value class BufferMemoryBarrier2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.value)
	
	var srcAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.value)
	
	var dstStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.value)
	
	var dstAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.value)
	
	var srcQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var dstQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 56))
		set(value) = Unsafe.setLong(address + 56, value.address)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 80
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BufferMemoryBarrier2(offset(index))
		
		operator fun set(index: Int, value: BufferMemoryBarrier2) = Unsafe.copy(value.address, offset(index), 80)
		
		inline fun forEach(block: (BufferMemoryBarrier2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferMemoryBarrier2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BufferMemoryBarrier2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [BufferMemoryBarrier2].
 */
inline fun Allocator.BufferMemoryBarrier2(block: (BufferMemoryBarrier2) -> Unit) = BufferMemoryBarrier2(calloc(80)).apply(block).also { it.sType = 1000314001 }



/**
 * Struct buffer calloc function for [BufferMemoryBarrier2].
 */
inline fun Allocator.BufferMemoryBarrier2(capacity: Int, block: (BufferMemoryBarrier2.Buffer) -> Unit) = BufferMemoryBarrier2.Buffer(calloc(capacity * 80), capacity).apply(block).apply { forEach { it.sType = 1000314001 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkImageMemoryBarrier2 {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkPipelineStageFlags2    srcStageMask
 *         VkAccessFlags2           srcAccessMask
 *         VkPipelineStageFlags2    dstStageMask
 *         VkAccessFlags2           dstAccessMask
 *         VkImageLayout            oldLayout
 *         VkImageLayout            newLayout
 *         uint32_t                 srcQueueFamilyIndex
 *         uint32_t                 dstQueueFamilyIndex
 *         VkImage                  image
 *         VkImageSubresourceRange  subresourceRange
 *     }
 * 
 *     Valid pNext types:
 *         - VkSampleLocationsInfoEXT
 */
@JvmInline
value class ImageMemoryBarrier2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.value)
	
	var srcAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.value)
	
	var dstStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.value)
	
	var dstAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.value)
	
	var oldLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var newLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 52))
		set(value) = Unsafe.setInt(address + 52, value.value)
	
	var srcQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var dstQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 64))
		set(value) = Unsafe.setLong(address + 64, value.address)
	
	var subresourceRange: ImageSubresourceRange
		get()      = ImageSubresourceRange(address + 72)
		set(value) = Unsafe.copy(value.address, address + 72, 20)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 96
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageMemoryBarrier2(offset(index))
		
		operator fun set(index: Int, value: ImageMemoryBarrier2) = Unsafe.copy(value.address, offset(index), 96)
		
		inline fun forEach(block: (ImageMemoryBarrier2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageMemoryBarrier2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageMemoryBarrier2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [ImageMemoryBarrier2].
 */
inline fun Allocator.ImageMemoryBarrier2(block: (ImageMemoryBarrier2) -> Unit) = ImageMemoryBarrier2(calloc(96)).apply(block).also { it.sType = 1000314002 }



/**
 * Struct buffer calloc function for [ImageMemoryBarrier2].
 */
inline fun Allocator.ImageMemoryBarrier2(capacity: Int, block: (ImageMemoryBarrier2.Buffer) -> Unit) = ImageMemoryBarrier2.Buffer(calloc(capacity * 96), capacity).apply(block).apply { forEach { it.sType = 1000314002 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkDependencyInfo {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkDependencyFlags        dependencyFlags
 *         uint32_t                 memoryBarrierCount
 *         VkMemoryBarrier2*        pMemoryBarriers
 *         uint32_t                 bufferMemoryBarrierCount
 *         VkBufferMemoryBarrier2*  pBufferMemoryBarriers
 *         uint32_t                 imageMemoryBarrierCount
 *         VkImageMemoryBarrier2*   pImageMemoryBarriers
 *     }
 */
@JvmInline
value class DependencyInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var dependencyFlags: DependencyFlags
		get()      = DependencyFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var memoryBarrierCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pMemoryBarriers: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var bufferMemoryBarrierCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pBufferMemoryBarriers: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var imageMemoryBarrierCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pImageMemoryBarriers: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var memoryBarriers: MemoryBarrier2.Buffer
		get()      = MemoryBarrier2.Buffer(Unsafe.getLong(address + 24), memoryBarrierCount)
		set(value) { Unsafe.setLong(address + 24, value.address); memoryBarrierCount = value.capacity }
	
	var bufferMemoryBarriers: BufferMemoryBarrier2.Buffer
		get()      = BufferMemoryBarrier2.Buffer(Unsafe.getLong(address + 40), bufferMemoryBarrierCount)
		set(value) { Unsafe.setLong(address + 40, value.address); bufferMemoryBarrierCount = value.capacity }
	
	var imageMemoryBarriers: ImageMemoryBarrier2.Buffer
		get()      = ImageMemoryBarrier2.Buffer(Unsafe.getLong(address + 56), imageMemoryBarrierCount)
		set(value) { Unsafe.setLong(address + 56, value.address); imageMemoryBarrierCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DependencyInfo(offset(index))
		
		operator fun set(index: Int, value: DependencyInfo) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (DependencyInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DependencyInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DependencyInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [DependencyInfo].
 */
inline fun Allocator.DependencyInfo(block: (DependencyInfo) -> Unit) = DependencyInfo(calloc(64)).apply(block).also { it.sType = 1000314003 }



/**
 * Struct buffer calloc function for [DependencyInfo].
 */
inline fun Allocator.DependencyInfo(capacity: Int, block: (DependencyInfo.Buffer) -> Unit) = DependencyInfo.Buffer(calloc(capacity * 64), capacity).apply(block).apply { forEach { it.sType = 1000314003 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkSubmitInfo2 {
 *         VkStructureType             sType
 *         void*                       pNext
 *         VkSubmitFlags               flags
 *         uint32_t                    waitSemaphoreInfoCount
 *         VkSemaphoreSubmitInfo*      pWaitSemaphoreInfos
 *         uint32_t                    commandBufferInfoCount
 *         VkCommandBufferSubmitInfo*  pCommandBufferInfos
 *         uint32_t                    signalSemaphoreInfoCount
 *         VkSemaphoreSubmitInfo*      pSignalSemaphoreInfos
 *     }
 * 
 *     Valid pNext types:
 *         - VkWin32KeyedMutexAcquireReleaseInfoNV
 *         - VkWin32KeyedMutexAcquireReleaseInfoKHR
 *         - VkPerformanceQuerySubmitInfoKHR
 */
@JvmInline
value class SubmitInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: SubmitFlags
		get()      = SubmitFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var waitSemaphoreInfoCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pWaitSemaphoreInfos: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var commandBufferInfoCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pCommandBufferInfos: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var signalSemaphoreInfoCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pSignalSemaphoreInfos: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var waitSemaphoreInfos: SemaphoreSubmitInfo.Buffer
		get()      = SemaphoreSubmitInfo.Buffer(Unsafe.getLong(address + 24), waitSemaphoreInfoCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreInfoCount = value.capacity }
	
	var commandBufferInfos: CommandBufferSubmitInfo.Buffer
		get()      = CommandBufferSubmitInfo.Buffer(Unsafe.getLong(address + 40), commandBufferInfoCount)
		set(value) { Unsafe.setLong(address + 40, value.address); commandBufferInfoCount = value.capacity }
	
	var signalSemaphoreInfos: SemaphoreSubmitInfo.Buffer
		get()      = SemaphoreSubmitInfo.Buffer(Unsafe.getLong(address + 56), signalSemaphoreInfoCount)
		set(value) { Unsafe.setLong(address + 56, value.address); signalSemaphoreInfoCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubmitInfo2(offset(index))
		
		operator fun set(index: Int, value: SubmitInfo2) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (SubmitInfo2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubmitInfo2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubmitInfo2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [SubmitInfo2].
 */
inline fun Allocator.SubmitInfo2(block: (SubmitInfo2) -> Unit) = SubmitInfo2(calloc(64)).apply(block).also { it.sType = 1000314004 }



/**
 * Struct buffer calloc function for [SubmitInfo2].
 */
inline fun Allocator.SubmitInfo2(capacity: Int, block: (SubmitInfo2.Buffer) -> Unit) = SubmitInfo2.Buffer(calloc(capacity * 64), capacity).apply(block).apply { forEach { it.sType = 1000314004 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkSemaphoreSubmitInfo {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkSemaphore            semaphore
 *         uint64_t               value
 *         VkPipelineStageFlags2  stageMask
 *         uint32_t               deviceIndex
 *     }
 */
@JvmInline
value class SemaphoreSubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var semaphore: SemaphoreH
		get()      = SemaphoreH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var value: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var stageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.value)
	
	var deviceIndex: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SemaphoreSubmitInfo(offset(index))
		
		operator fun set(index: Int, value: SemaphoreSubmitInfo) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (SemaphoreSubmitInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SemaphoreSubmitInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SemaphoreSubmitInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [SemaphoreSubmitInfo].
 */
inline fun Allocator.SemaphoreSubmitInfo(block: (SemaphoreSubmitInfo) -> Unit) = SemaphoreSubmitInfo(calloc(48)).apply(block).also { it.sType = 1000314005 }



/**
 * Struct buffer calloc function for [SemaphoreSubmitInfo].
 */
inline fun Allocator.SemaphoreSubmitInfo(capacity: Int, block: (SemaphoreSubmitInfo.Buffer) -> Unit) = SemaphoreSubmitInfo.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000314005 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkCommandBufferSubmitInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         deviceMask
 *     }
 */
@JvmInline
value class CommandBufferSubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var commandBuffer: CommandBufferH
		get()      = CommandBufferH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var deviceMask: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 32
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = CommandBufferSubmitInfo(offset(index))
		
		operator fun set(index: Int, value: CommandBufferSubmitInfo) = Unsafe.copy(value.address, offset(index), 32)
		
		inline fun forEach(block: (CommandBufferSubmitInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CommandBufferSubmitInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, CommandBufferSubmitInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [CommandBufferSubmitInfo].
 */
inline fun Allocator.CommandBufferSubmitInfo(block: (CommandBufferSubmitInfo) -> Unit) = CommandBufferSubmitInfo(calloc(32)).apply(block).also { it.sType = 1000314006 }



/**
 * Struct buffer calloc function for [CommandBufferSubmitInfo].
 */
inline fun Allocator.CommandBufferSubmitInfo(capacity: Int, block: (CommandBufferSubmitInfo.Buffer) -> Unit) = CommandBufferSubmitInfo.Buffer(calloc(capacity * 32), capacity).apply(block).apply { forEach { it.sType = 1000314006 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceSynchronization2Features {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         synchronization2
 *     }
 */
@JvmInline
value class PhysicalDeviceSynchronization2Features(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var synchronization2: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceSynchronization2Features].
 */
inline fun Allocator.PhysicalDeviceSynchronization2Features(block: (PhysicalDeviceSynchronization2Features) -> Unit) = PhysicalDeviceSynchronization2Features(calloc(24)).apply(block).also { it.sType = 1000314007 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderZeroInitializeWorkgroupMemory
 *     }
 */
@JvmInline
value class PhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderZeroInitializeWorkgroupMemory: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceZeroInitializeWorkgroupMemoryFeatures].
 */
inline fun Allocator.PhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(block: (PhysicalDeviceZeroInitializeWorkgroupMemoryFeatures) -> Unit) = PhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(calloc(24)).apply(block).also { it.sType = 1000325000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceImageRobustnessFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         robustImageAccess
 *     }
 */
@JvmInline
value class PhysicalDeviceImageRobustnessFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var robustImageAccess: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceImageRobustnessFeatures].
 */
inline fun Allocator.PhysicalDeviceImageRobustnessFeatures(block: (PhysicalDeviceImageRobustnessFeatures) -> Unit) = PhysicalDeviceImageRobustnessFeatures(calloc(24)).apply(block).also { it.sType = 1000335000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkCopyBufferInfo2 {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBuffer         srcBuffer
 *         VkBuffer         dstBuffer
 *         uint32_t         regionCount
 *         VkBufferCopy2*   pRegions
 *     }
 */
@JvmInline
value class CopyBufferInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var dstBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var regionCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pRegions: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var regions: BufferCopy2.Buffer
		get()      = BufferCopy2.Buffer(Unsafe.getLong(address + 40), regionCount)
		set(value) { Unsafe.setLong(address + 40, value.address); regionCount = value.capacity }


}



/**
 * Struct calloc function for [CopyBufferInfo2].
 */
inline fun Allocator.CopyBufferInfo2(block: (CopyBufferInfo2) -> Unit) = CopyBufferInfo2(calloc(48)).apply(block).also { it.sType = 1000337000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkCopyImageInfo2 {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkImage          srcImage
 *         VkImageLayout    srcImageLayout
 *         VkImage          dstImage
 *         VkImageLayout    dstImageLayout
 *         uint32_t         regionCount
 *         VkImageCopy2*    pRegions
 *     }
 */
@JvmInline
value class CopyImageInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcImage: ImageH
		get()      = ImageH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var srcImageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var dstImage: ImageH
		get()      = ImageH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var dstImageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var regionCount: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var pRegions: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var regions: ImageCopy2.Buffer
		get()      = ImageCopy2.Buffer(Unsafe.getLong(address + 48), regionCount)
		set(value) { Unsafe.setLong(address + 48, value.address); regionCount = value.capacity }


}



/**
 * Struct calloc function for [CopyImageInfo2].
 */
inline fun Allocator.CopyImageInfo2(block: (CopyImageInfo2) -> Unit) = CopyImageInfo2(calloc(56)).apply(block).also { it.sType = 1000337001 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkCopyBufferToImageInfo2 {
 *         VkStructureType      sType
 *         void*                pNext (must be null)
 *         VkBuffer             srcBuffer
 *         VkImage              dstImage
 *         VkImageLayout        dstImageLayout
 *         uint32_t             regionCount
 *         VkBufferImageCopy2*  pRegions
 *     }
 */
@JvmInline
value class CopyBufferToImageInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var dstImage: ImageH
		get()      = ImageH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var dstImageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var regionCount: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var pRegions: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var regions: BufferImageCopy2.Buffer
		get()      = BufferImageCopy2.Buffer(Unsafe.getLong(address + 40), regionCount)
		set(value) { Unsafe.setLong(address + 40, value.address); regionCount = value.capacity }


}



/**
 * Struct calloc function for [CopyBufferToImageInfo2].
 */
inline fun Allocator.CopyBufferToImageInfo2(block: (CopyBufferToImageInfo2) -> Unit) = CopyBufferToImageInfo2(calloc(48)).apply(block).also { it.sType = 1000337002 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkCopyImageToBufferInfo2 {
 *         VkStructureType      sType
 *         void*                pNext (must be null)
 *         VkImage              srcImage
 *         VkImageLayout        srcImageLayout
 *         VkBuffer             dstBuffer
 *         uint32_t             regionCount
 *         VkBufferImageCopy2*  pRegions
 *     }
 */
@JvmInline
value class CopyImageToBufferInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcImage: ImageH
		get()      = ImageH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var srcImageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var dstBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var regionCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pRegions: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var regions: BufferImageCopy2.Buffer
		get()      = BufferImageCopy2.Buffer(Unsafe.getLong(address + 48), regionCount)
		set(value) { Unsafe.setLong(address + 48, value.address); regionCount = value.capacity }


}



/**
 * Struct calloc function for [CopyImageToBufferInfo2].
 */
inline fun Allocator.CopyImageToBufferInfo2(block: (CopyImageToBufferInfo2) -> Unit) = CopyImageToBufferInfo2(calloc(56)).apply(block).also { it.sType = 1000337003 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkBlitImageInfo2 {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkImage          srcImage
 *         VkImageLayout    srcImageLayout
 *         VkImage          dstImage
 *         VkImageLayout    dstImageLayout
 *         uint32_t         regionCount
 *         VkImageBlit2*    pRegions
 *         VkFilter         filter
 *     }
 */
@JvmInline
value class BlitImageInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcImage: ImageH
		get()      = ImageH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var srcImageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var dstImage: ImageH
		get()      = ImageH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var dstImageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var regionCount: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var pRegions: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var filter: Filter
		get()      = _Filter(Unsafe.getInt(address + 56))
		set(value) = Unsafe.setInt(address + 56, value.value)
	
	
	
	var regions: ImageBlit2.Buffer
		get()      = ImageBlit2.Buffer(Unsafe.getLong(address + 48), regionCount)
		set(value) { Unsafe.setLong(address + 48, value.address); regionCount = value.capacity }


}



/**
 * Struct calloc function for [BlitImageInfo2].
 */
inline fun Allocator.BlitImageInfo2(block: (BlitImageInfo2) -> Unit) = BlitImageInfo2(calloc(64)).apply(block).also { it.sType = 1000337004 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkResolveImageInfo2 {
 *         VkStructureType   sType
 *         void*             pNext (must be null)
 *         VkImage           srcImage
 *         VkImageLayout     srcImageLayout
 *         VkImage           dstImage
 *         VkImageLayout     dstImageLayout
 *         uint32_t          regionCount
 *         VkImageResolve2*  pRegions
 *     }
 */
@JvmInline
value class ResolveImageInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcImage: ImageH
		get()      = ImageH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var srcImageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var dstImage: ImageH
		get()      = ImageH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var dstImageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var regionCount: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var pRegions: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var regions: ImageResolve2.Buffer
		get()      = ImageResolve2.Buffer(Unsafe.getLong(address + 48), regionCount)
		set(value) { Unsafe.setLong(address + 48, value.address); regionCount = value.capacity }


}



/**
 * Struct calloc function for [ResolveImageInfo2].
 */
inline fun Allocator.ResolveImageInfo2(block: (ResolveImageInfo2) -> Unit) = ResolveImageInfo2(calloc(56)).apply(block).also { it.sType = 1000337005 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkBufferCopy2 {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceSize     srcOffset
 *         VkDeviceSize     dstOffset
 *         VkDeviceSize     size
 *     }
 */
@JvmInline
value class BufferCopy2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcOffset: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var dstOffset: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BufferCopy2(offset(index))
		
		operator fun set(index: Int, value: BufferCopy2) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (BufferCopy2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferCopy2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BufferCopy2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [BufferCopy2].
 */
inline fun Allocator.BufferCopy2(block: (BufferCopy2) -> Unit) = BufferCopy2(calloc(40)).apply(block).also { it.sType = 1000337006 }



/**
 * Struct buffer calloc function for [BufferCopy2].
 */
inline fun Allocator.BufferCopy2(capacity: Int, block: (BufferCopy2.Buffer) -> Unit) = BufferCopy2.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000337006 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkImageCopy2 {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffset
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffset
 *         VkExtent3D                extent
 *     }
 */
@JvmInline
value class ImageCopy2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 16)
	
	var srcOffset: Offset3D
		get()      = Offset3D(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 12)
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 16)
	
	var dstOffset: Offset3D
		get()      = Offset3D(address + 60)
		set(value) = Unsafe.copy(value.address, address + 60, 12)
	
	var extent: Extent3D
		get()      = Extent3D(address + 72)
		set(value) = Unsafe.copy(value.address, address + 72, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 88
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageCopy2(offset(index))
		
		operator fun set(index: Int, value: ImageCopy2) = Unsafe.copy(value.address, offset(index), 88)
		
		inline fun forEach(block: (ImageCopy2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageCopy2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageCopy2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [ImageCopy2].
 */
inline fun Allocator.ImageCopy2(block: (ImageCopy2) -> Unit) = ImageCopy2(calloc(88)).apply(block).also { it.sType = 1000337007 }



/**
 * Struct buffer calloc function for [ImageCopy2].
 */
inline fun Allocator.ImageCopy2(capacity: Int, block: (ImageCopy2.Buffer) -> Unit) = ImageCopy2.Buffer(calloc(capacity * 88), capacity).apply(block).apply { forEach { it.sType = 1000337007 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkImageBlit2 {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffsets[2]
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffsets[2]
 *     }
 * 
 *     Valid pNext types:
 *         - VkCopyCommandTransformInfoQCOM
 */
@JvmInline
value class ImageBlit2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 16)
	
	var srcOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + 32, 2)
		set(value) = Unsafe.copy(value.address, address + 32, value.byteSize)
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 16)
	
	var dstOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + 72, 2)
		set(value) = Unsafe.copy(value.address, address + 72, value.byteSize)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 96
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageBlit2(offset(index))
		
		operator fun set(index: Int, value: ImageBlit2) = Unsafe.copy(value.address, offset(index), 96)
		
		inline fun forEach(block: (ImageBlit2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageBlit2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageBlit2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [ImageBlit2].
 */
inline fun Allocator.ImageBlit2(block: (ImageBlit2) -> Unit) = ImageBlit2(calloc(96)).apply(block).also { it.sType = 1000337008 }



/**
 * Struct buffer calloc function for [ImageBlit2].
 */
inline fun Allocator.ImageBlit2(capacity: Int, block: (ImageBlit2.Buffer) -> Unit) = ImageBlit2.Buffer(calloc(capacity * 96), capacity).apply(block).apply { forEach { it.sType = 1000337008 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkBufferImageCopy2 {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkDeviceSize              bufferOffset
 *         uint32_t                  bufferRowLength
 *         uint32_t                  bufferImageHeight
 *         VkImageSubresourceLayers  imageSubresource
 *         VkOffset3D                imageOffset
 *         VkExtent3D                imageExtent
 *     }
 * 
 *     Valid pNext types:
 *         - VkCopyCommandTransformInfoQCOM
 */
@JvmInline
value class BufferImageCopy2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var bufferOffset: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var bufferRowLength: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var bufferImageHeight: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var imageSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 16)
	
	var imageOffset: Offset3D
		get()      = Offset3D(address + 48)
		set(value) = Unsafe.copy(value.address, address + 48, 12)
	
	var imageExtent: Extent3D
		get()      = Extent3D(address + 60)
		set(value) = Unsafe.copy(value.address, address + 60, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 72
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BufferImageCopy2(offset(index))
		
		operator fun set(index: Int, value: BufferImageCopy2) = Unsafe.copy(value.address, offset(index), 72)
		
		inline fun forEach(block: (BufferImageCopy2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferImageCopy2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BufferImageCopy2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [BufferImageCopy2].
 */
inline fun Allocator.BufferImageCopy2(block: (BufferImageCopy2) -> Unit) = BufferImageCopy2(calloc(72)).apply(block).also { it.sType = 1000337009 }



/**
 * Struct buffer calloc function for [BufferImageCopy2].
 */
inline fun Allocator.BufferImageCopy2(capacity: Int, block: (BufferImageCopy2.Buffer) -> Unit) = BufferImageCopy2.Buffer(calloc(capacity * 72), capacity).apply(block).apply { forEach { it.sType = 1000337009 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkImageResolve2 {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffset
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffset
 *         VkExtent3D                extent
 *     }
 */
@JvmInline
value class ImageResolve2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 16)
	
	var srcOffset: Offset3D
		get()      = Offset3D(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 12)
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 16)
	
	var dstOffset: Offset3D
		get()      = Offset3D(address + 60)
		set(value) = Unsafe.copy(value.address, address + 60, 12)
	
	var extent: Extent3D
		get()      = Extent3D(address + 72)
		set(value) = Unsafe.copy(value.address, address + 72, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 88
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageResolve2(offset(index))
		
		operator fun set(index: Int, value: ImageResolve2) = Unsafe.copy(value.address, offset(index), 88)
		
		inline fun forEach(block: (ImageResolve2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageResolve2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageResolve2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [ImageResolve2].
 */
inline fun Allocator.ImageResolve2(block: (ImageResolve2) -> Unit) = ImageResolve2(calloc(88)).apply(block).also { it.sType = 1000337010 }



/**
 * Struct buffer calloc function for [ImageResolve2].
 */
inline fun Allocator.ImageResolve2(capacity: Int, block: (ImageResolve2.Buffer) -> Unit) = ImageResolve2.Buffer(calloc(capacity * 88), capacity).apply(block).apply { forEach { it.sType = 1000337010 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceSubgroupSizeControlFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         subgroupSizeControl
 *         VkBool32         computeFullSubgroups
 *     }
 */
@JvmInline
value class PhysicalDeviceSubgroupSizeControlFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var subgroupSizeControl: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var computeFullSubgroups: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 * Struct calloc function for [PhysicalDeviceSubgroupSizeControlFeatures].
 */
inline fun Allocator.PhysicalDeviceSubgroupSizeControlFeatures(block: (PhysicalDeviceSubgroupSizeControlFeatures) -> Unit) = PhysicalDeviceSubgroupSizeControlFeatures(calloc(24)).apply(block).also { it.sType = 1000225002 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceSubgroupSizeControlProperties {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         uint32_t            minSubgroupSize
 *         uint32_t            maxSubgroupSize
 *         uint32_t            maxComputeWorkgroupSubgroups
 *         VkShaderStageFlags  requiredSubgroupSizeStages
 *     }
 */
@JvmInline
value class PhysicalDeviceSubgroupSizeControlProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var minSubgroupSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxSubgroupSize: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxComputeWorkgroupSubgroups: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var requiredSubgroupSizeStages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)


}



/**
 * Struct calloc function for [PhysicalDeviceSubgroupSizeControlProperties].
 */
inline fun Allocator.PhysicalDeviceSubgroupSizeControlProperties(block: (PhysicalDeviceSubgroupSizeControlProperties) -> Unit) = PhysicalDeviceSubgroupSizeControlProperties(calloc(32)).apply(block).also { it.sType = 1000225000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPipelineShaderStageRequiredSubgroupSizeCreateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         requiredSubgroupSize
 *     }
 */
@JvmInline
value class PipelineShaderStageRequiredSubgroupSizeCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var requiredSubgroupSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PipelineShaderStageRequiredSubgroupSizeCreateInfo].
 */
inline fun Allocator.PipelineShaderStageRequiredSubgroupSizeCreateInfo(block: (PipelineShaderStageRequiredSubgroupSizeCreateInfo) -> Unit) = PipelineShaderStageRequiredSubgroupSizeCreateInfo(calloc(24)).apply(block).also { it.sType = 1000225001 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceInlineUniformBlockFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         inlineUniformBlock
 *         VkBool32         descriptorBindingInlineUniformBlockUpdateAfterBind
 *     }
 */
@JvmInline
value class PhysicalDeviceInlineUniformBlockFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var inlineUniformBlock: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var descriptorBindingInlineUniformBlockUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 * Struct calloc function for [PhysicalDeviceInlineUniformBlockFeatures].
 */
inline fun Allocator.PhysicalDeviceInlineUniformBlockFeatures(block: (PhysicalDeviceInlineUniformBlockFeatures) -> Unit) = PhysicalDeviceInlineUniformBlockFeatures(calloc(24)).apply(block).also { it.sType = 1000138000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceInlineUniformBlockProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxInlineUniformBlockSize
 *         uint32_t         maxPerStageDescriptorInlineUniformBlocks
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks
 *         uint32_t         maxDescriptorSetInlineUniformBlocks
 *         uint32_t         maxDescriptorSetUpdateAfterBindInlineUniformBlocks
 *     }
 */
@JvmInline
value class PhysicalDeviceInlineUniformBlockProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxInlineUniformBlockSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxPerStageDescriptorInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var maxDescriptorSetInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var maxDescriptorSetUpdateAfterBindInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)


}



/**
 * Struct calloc function for [PhysicalDeviceInlineUniformBlockProperties].
 */
inline fun Allocator.PhysicalDeviceInlineUniformBlockProperties(block: (PhysicalDeviceInlineUniformBlockProperties) -> Unit) = PhysicalDeviceInlineUniformBlockProperties(calloc(40)).apply(block).also { it.sType = 1000138001 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkWriteDescriptorSetInlineUniformBlock {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         dataSize
 *         void*            pData
 *     }
 */
@JvmInline
value class WriteDescriptorSetInlineUniformBlock(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var dataSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pData: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var data: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), dataSize)
		set(value) { Unsafe.setLong(address + 24, value.address); dataSize = value.capacity }


}



/**
 * Struct calloc function for [WriteDescriptorSetInlineUniformBlock].
 */
inline fun Allocator.WriteDescriptorSetInlineUniformBlock(block: (WriteDescriptorSetInlineUniformBlock) -> Unit) = WriteDescriptorSetInlineUniformBlock(calloc(32)).apply(block).also { it.sType = 1000138002 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkDescriptorPoolInlineUniformBlockCreateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxInlineUniformBlockBindings
 *     }
 */
@JvmInline
value class DescriptorPoolInlineUniformBlockCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxInlineUniformBlockBindings: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [DescriptorPoolInlineUniformBlockCreateInfo].
 */
inline fun Allocator.DescriptorPoolInlineUniformBlockCreateInfo(block: (DescriptorPoolInlineUniformBlockCreateInfo) -> Unit) = DescriptorPoolInlineUniformBlockCreateInfo(calloc(24)).apply(block).also { it.sType = 1000138003 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceTextureCompressionASTCHDRFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         textureCompressionASTC_HDR
 *     }
 */
@JvmInline
value class PhysicalDeviceTextureCompressionASTCHDRFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var textureCompressionASTC_HDR: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceTextureCompressionASTCHDRFeatures].
 */
inline fun Allocator.PhysicalDeviceTextureCompressionASTCHDRFeatures(block: (PhysicalDeviceTextureCompressionASTCHDRFeatures) -> Unit) = PhysicalDeviceTextureCompressionASTCHDRFeatures(calloc(24)).apply(block).also { it.sType = 1000066000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkRenderingInfo {
 *         VkStructureType             sType
 *         void*                       pNext
 *         VkRenderingFlags            flags
 *         VkRect2D                    renderArea
 *         uint32_t                    layerCount
 *         uint32_t                    viewMask
 *         uint32_t                    colorAttachmentCount
 *         VkRenderingAttachmentInfo*  pColorAttachments
 *         VkRenderingAttachmentInfo*  pDepthAttachment
 *         VkRenderingAttachmentInfo*  pStencilAttachment
 *     }
 * 
 *     Valid pNext types:
 *         - VkDeviceGroupRenderPassBeginInfo
 *         - VkRenderingFragmentShadingRateAttachmentInfoKHR
 *         - VkRenderingFragmentDensityMapAttachmentInfoEXT
 *         - VkMultiviewPerViewAttributesInfoNVX
 */
@JvmInline
value class RenderingInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: RenderingFlags
		get()      = RenderingFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var renderArea: Rect2D
		get()      = Rect2D(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 16)
	
	var layerCount: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var viewMask: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var pColorAttachments: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var pDepthAttachment: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pStencilAttachment: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	
	
	var colorAttachments: RenderingAttachmentInfo.Buffer
		get()      = RenderingAttachmentInfo.Buffer(Unsafe.getLong(address + 48), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 48, value.address); colorAttachmentCount = value.capacity }
	
	var depthAttachment: RenderingAttachmentInfo
		get()      = RenderingAttachmentInfo(Unsafe.getLong(address + 56))
		set(value) { Unsafe.setLong(address + 56, value.address) }
	
	var stencilAttachment: RenderingAttachmentInfo
		get()      = RenderingAttachmentInfo(Unsafe.getLong(address + 64))
		set(value) { Unsafe.setLong(address + 64, value.address) }


}



/**
 * Struct calloc function for [RenderingInfo].
 */
inline fun Allocator.RenderingInfo(block: (RenderingInfo) -> Unit) = RenderingInfo(calloc(72)).apply(block).also { it.sType = 1000044000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkRenderingAttachmentInfo {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkImageView            imageView
 *         VkImageLayout          imageLayout
 *         VkResolveModeFlagBits  resolveMode
 *         VkImageView            resolveImageView
 *         VkImageLayout          resolveImageLayout
 *         VkAttachmentLoadOp     loadOp
 *         VkAttachmentStoreOp    storeOp
 *         VkClearValue           clearValue
 *     }
 */
@JvmInline
value class RenderingAttachmentInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var imageView: ImageViewH
		get()      = ImageViewH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var imageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var resolveMode: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var resolveImageView: ImageViewH
		get()      = ImageViewH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var resolveImageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var loadOp: AttachmentLoadOp
		get()      = _AttachmentLoadOp(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var storeOp: AttachmentStoreOp
		get()      = _AttachmentStoreOp(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var clearValue: ClearValue
		get()      = ClearValue(address + 52)
		set(value) = Unsafe.copy(value.address, address + 52, 16)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 72
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = RenderingAttachmentInfo(offset(index))
		
		operator fun set(index: Int, value: RenderingAttachmentInfo) = Unsafe.copy(value.address, offset(index), 72)
		
		inline fun forEach(block: (RenderingAttachmentInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (RenderingAttachmentInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, RenderingAttachmentInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [RenderingAttachmentInfo].
 */
inline fun Allocator.RenderingAttachmentInfo(block: (RenderingAttachmentInfo) -> Unit) = RenderingAttachmentInfo(calloc(72)).apply(block).also { it.sType = 1000044001 }



/**
 * Struct buffer calloc function for [RenderingAttachmentInfo].
 */
inline fun Allocator.RenderingAttachmentInfo(capacity: Int, block: (RenderingAttachmentInfo.Buffer) -> Unit) = RenderingAttachmentInfo.Buffer(calloc(capacity * 72), capacity).apply(block).apply { forEach { it.sType = 1000044001 } }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPipelineRenderingCreateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         viewMask
 *         uint32_t         colorAttachmentCount
 *         VkFormat*        pColorAttachmentFormats
 *         VkFormat         depthAttachmentFormat
 *         VkFormat         stencilAttachmentFormat
 *     }
 */
@JvmInline
value class PipelineRenderingCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var viewMask: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pColorAttachmentFormats: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var depthAttachmentFormat: Format
		get()      = Format(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var stencilAttachmentFormat: Format
		get()      = Format(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	
	
	var colorAttachmentFormats: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 24, value.address); colorAttachmentCount = value.capacity }


}



/**
 * Struct calloc function for [PipelineRenderingCreateInfo].
 */
inline fun Allocator.PipelineRenderingCreateInfo(block: (PipelineRenderingCreateInfo) -> Unit) = PipelineRenderingCreateInfo(calloc(40)).apply(block).also { it.sType = 1000044002 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceDynamicRenderingFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         dynamicRendering
 *     }
 */
@JvmInline
value class PhysicalDeviceDynamicRenderingFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var dynamicRendering: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceDynamicRenderingFeatures].
 */
inline fun Allocator.PhysicalDeviceDynamicRenderingFeatures(block: (PhysicalDeviceDynamicRenderingFeatures) -> Unit) = PhysicalDeviceDynamicRenderingFeatures(calloc(24)).apply(block).also { it.sType = 1000044003 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkCommandBufferInheritanceRenderingInfo {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkRenderingFlags       flags
 *         uint32_t               viewMask
 *         uint32_t               colorAttachmentCount
 *         VkFormat*              pColorAttachmentFormats
 *         VkFormat               depthAttachmentFormat
 *         VkFormat               stencilAttachmentFormat
 *         VkSampleCountFlagBits  rasterizationSamples
 *     }
 */
@JvmInline
value class CommandBufferInheritanceRenderingInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: RenderingFlags
		get()      = RenderingFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var viewMask: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pColorAttachmentFormats: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var depthAttachmentFormat: Format
		get()      = Format(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var stencilAttachmentFormat: Format
		get()      = Format(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var rasterizationSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	
	
	var colorAttachmentFormats: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 32), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 32, value.address); colorAttachmentCount = value.capacity }


}



/**
 * Struct calloc function for [CommandBufferInheritanceRenderingInfo].
 */
inline fun Allocator.CommandBufferInheritanceRenderingInfo(block: (CommandBufferInheritanceRenderingInfo) -> Unit) = CommandBufferInheritanceRenderingInfo(calloc(56)).apply(block).also { it.sType = 1000044004 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceShaderIntegerDotProductFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderIntegerDotProduct
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderIntegerDotProductFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderIntegerDotProduct: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceShaderIntegerDotProductFeatures].
 */
inline fun Allocator.PhysicalDeviceShaderIntegerDotProductFeatures(block: (PhysicalDeviceShaderIntegerDotProductFeatures) -> Unit) = PhysicalDeviceShaderIntegerDotProductFeatures(calloc(24)).apply(block).also { it.sType = 1000280000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceShaderIntegerDotProductProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         integerDotProduct8BitUnsignedAccelerated
 *         VkBool32         integerDotProduct8BitSignedAccelerated
 *         VkBool32         integerDotProduct8BitMixedSignednessAccelerated
 *         VkBool32         integerDotProduct4x8BitPackedUnsignedAccelerated
 *         VkBool32         integerDotProduct4x8BitPackedSignedAccelerated
 *         VkBool32         integerDotProduct4x8BitPackedMixedSignednessAccelerated
 *         VkBool32         integerDotProduct16BitUnsignedAccelerated
 *         VkBool32         integerDotProduct16BitSignedAccelerated
 *         VkBool32         integerDotProduct16BitMixedSignednessAccelerated
 *         VkBool32         integerDotProduct32BitUnsignedAccelerated
 *         VkBool32         integerDotProduct32BitSignedAccelerated
 *         VkBool32         integerDotProduct32BitMixedSignednessAccelerated
 *         VkBool32         integerDotProduct64BitUnsignedAccelerated
 *         VkBool32         integerDotProduct64BitSignedAccelerated
 *         VkBool32         integerDotProduct64BitMixedSignednessAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating8BitUnsignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating8BitSignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating16BitUnsignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating16BitSignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating32BitUnsignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating32BitSignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating64BitUnsignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating64BitSignedAccelerated
 *         VkBool32         integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderIntegerDotProductProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var integerDotProduct8BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var integerDotProduct8BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var integerDotProduct8BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var integerDotProduct4x8BitPackedUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var integerDotProduct4x8BitPackedSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var integerDotProduct4x8BitPackedMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var integerDotProduct16BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var integerDotProduct16BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var integerDotProduct16BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var integerDotProduct32BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var integerDotProduct32BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var integerDotProduct32BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var integerDotProduct64BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var integerDotProduct64BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var integerDotProduct64BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var integerDotProductAccumulatingSaturating8BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var integerDotProductAccumulatingSaturating8BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var integerDotProductAccumulatingSaturating16BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 100)
		set(value) = Unsafe.setInt(address + 100, value)
	
	var integerDotProductAccumulatingSaturating16BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 104)
		set(value) = Unsafe.setInt(address + 104, value)
	
	var integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 108)
		set(value) = Unsafe.setInt(address + 108, value)
	
	var integerDotProductAccumulatingSaturating32BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 112)
		set(value) = Unsafe.setInt(address + 112, value)
	
	var integerDotProductAccumulatingSaturating32BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 116)
		set(value) = Unsafe.setInt(address + 116, value)
	
	var integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var integerDotProductAccumulatingSaturating64BitUnsignedAccelerated: Int
		get()      = Unsafe.getInt(address + 124)
		set(value) = Unsafe.setInt(address + 124, value)
	
	var integerDotProductAccumulatingSaturating64BitSignedAccelerated: Int
		get()      = Unsafe.getInt(address + 128)
		set(value) = Unsafe.setInt(address + 128, value)
	
	var integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated: Int
		get()      = Unsafe.getInt(address + 132)
		set(value) = Unsafe.setInt(address + 132, value)


}



/**
 * Struct calloc function for [PhysicalDeviceShaderIntegerDotProductProperties].
 */
inline fun Allocator.PhysicalDeviceShaderIntegerDotProductProperties(block: (PhysicalDeviceShaderIntegerDotProductProperties) -> Unit) = PhysicalDeviceShaderIntegerDotProductProperties(calloc(136)).apply(block).also { it.sType = 1000280001 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceTexelBufferAlignmentProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceSize     storageTexelBufferOffsetAlignmentBytes
 *         VkBool32         storageTexelBufferOffsetSingleTexelAlignment
 *         VkDeviceSize     uniformTexelBufferOffsetAlignmentBytes
 *         VkBool32         uniformTexelBufferOffsetSingleTexelAlignment
 *     }
 */
@JvmInline
value class PhysicalDeviceTexelBufferAlignmentProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var storageTexelBufferOffsetAlignmentBytes: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var storageTexelBufferOffsetSingleTexelAlignment: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var uniformTexelBufferOffsetAlignmentBytes: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var uniformTexelBufferOffsetSingleTexelAlignment: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)


}



/**
 * Struct calloc function for [PhysicalDeviceTexelBufferAlignmentProperties].
 */
inline fun Allocator.PhysicalDeviceTexelBufferAlignmentProperties(block: (PhysicalDeviceTexelBufferAlignmentProperties) -> Unit) = PhysicalDeviceTexelBufferAlignmentProperties(calloc(48)).apply(block).also { it.sType = 1000281001 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkFormatProperties3 {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkFormatFeatureFlags2  linearTilingFeatures
 *         VkFormatFeatureFlags2  optimalTilingFeatures
 *         VkFormatFeatureFlags2  bufferFeatures
 *     }
 */
@JvmInline
value class FormatProperties3(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var linearTilingFeatures: FormatFeatureFlags2
		get()      = FormatFeatureFlags2(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.value)
	
	var optimalTilingFeatures: FormatFeatureFlags2
		get()      = FormatFeatureFlags2(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.value)
	
	var bufferFeatures: FormatFeatureFlags2
		get()      = FormatFeatureFlags2(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.value)


}



/**
 * Struct calloc function for [FormatProperties3].
 */
inline fun Allocator.FormatProperties3(block: (FormatProperties3) -> Unit) = FormatProperties3(calloc(40)).apply(block).also { it.sType = 1000360000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceMaintenance4Features {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         maintenance4
 *     }
 */
@JvmInline
value class PhysicalDeviceMaintenance4Features(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maintenance4: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceMaintenance4Features].
 */
inline fun Allocator.PhysicalDeviceMaintenance4Features(block: (PhysicalDeviceMaintenance4Features) -> Unit) = PhysicalDeviceMaintenance4Features(calloc(24)).apply(block).also { it.sType = 1000413000 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkPhysicalDeviceMaintenance4Properties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceSize     maxBufferSize
 *     }
 */
@JvmInline
value class PhysicalDeviceMaintenance4Properties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxBufferSize: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)


}



/**
 * Struct calloc function for [PhysicalDeviceMaintenance4Properties].
 */
inline fun Allocator.PhysicalDeviceMaintenance4Properties(block: (PhysicalDeviceMaintenance4Properties) -> Unit) = PhysicalDeviceMaintenance4Properties(calloc(24)).apply(block).also { it.sType = 1000413001 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkDeviceBufferMemoryRequirements {
 *         VkStructureType      sType
 *         void*                pNext (must be null)
 *         VkBufferCreateInfo*  pCreateInfo
 *     }
 */
@JvmInline
value class DeviceBufferMemoryRequirements(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pCreateInfo: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	var createInfo: BufferCreateInfo
		get()      = BufferCreateInfo(Unsafe.getLong(address + 16))
		set(value) { Unsafe.setLong(address + 16, value.address) }


}



/**
 * Struct calloc function for [DeviceBufferMemoryRequirements].
 */
inline fun Allocator.DeviceBufferMemoryRequirements(block: (DeviceBufferMemoryRequirements) -> Unit) = DeviceBufferMemoryRequirements(calloc(24)).apply(block).also { it.sType = 1000413002 }



/**
 *     // provided by VK_VERSION_1_3
 *     struct VkDeviceImageMemoryRequirements {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkImageCreateInfo*     pCreateInfo
 *         VkImageAspectFlagBits  planeAspect
 *     }
 */
@JvmInline
value class DeviceImageMemoryRequirements(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pCreateInfo: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var planeAspect: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	
	
	var createInfo: ImageCreateInfo
		get()      = ImageCreateInfo(Unsafe.getLong(address + 16))
		set(value) { Unsafe.setLong(address + 16, value.address) }


}



/**
 * Struct calloc function for [DeviceImageMemoryRequirements].
 */
inline fun Allocator.DeviceImageMemoryRequirements(block: (DeviceImageMemoryRequirements) -> Unit) = DeviceImageMemoryRequirements(calloc(32)).apply(block).also { it.sType = 1000413003 }