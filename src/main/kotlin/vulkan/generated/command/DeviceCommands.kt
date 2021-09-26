// This file has been automatically generated.

package vulkan.generated.command

import memory.allocation.MemStacks
import memory.type.Addressable.Companion.addressOrNULL
import vulkan.generated.enumeration.*
import vulkan.generated.struct.*
import vulkan.generated.handle.*
import memory.primitive.*

@Suppress("unused")
class DeviceCommands(private val device: DeviceH) {
	
	
	private val stack = MemStacks.default
	
	
	
	private fun addr(name: String) = Commands.getDeviceProcAddr0(device.address, stack.encodeUtf8NT(name).address)
	
	
	
	/*
	Command addresses
	 */
	
	
	
	init { stack.push() }
	private val getDeviceProcAddrAddr = addr("vkGetDeviceProcAddr")
	private val destroyDeviceAddr = addr("vkDestroyDevice")
	private val getDeviceQueueAddr = addr("vkGetDeviceQueue")
	private val queueSubmitAddr = addr("vkQueueSubmit")
	private val queueWaitIdleAddr = addr("vkQueueWaitIdle")
	private val deviceWaitIdleAddr = addr("vkDeviceWaitIdle")
	private val allocateMemoryAddr = addr("vkAllocateMemory")
	private val freeMemoryAddr = addr("vkFreeMemory")
	private val mapMemoryAddr = addr("vkMapMemory")
	private val unmapMemoryAddr = addr("vkUnmapMemory")
	private val flushMappedMemoryRangesAddr = addr("vkFlushMappedMemoryRanges")
	private val invalidateMappedMemoryRangesAddr = addr("vkInvalidateMappedMemoryRanges")
	private val getDeviceMemoryCommitmentAddr = addr("vkGetDeviceMemoryCommitment")
	private val bindBufferMemoryAddr = addr("vkBindBufferMemory")
	private val bindImageMemoryAddr = addr("vkBindImageMemory")
	private val getBufferMemoryRequirementsAddr = addr("vkGetBufferMemoryRequirements")
	private val getImageMemoryRequirementsAddr = addr("vkGetImageMemoryRequirements")
	private val getImageSparseMemoryRequirementsAddr = addr("vkGetImageSparseMemoryRequirements")
	private val queueBindSparseAddr = addr("vkQueueBindSparse")
	private val createFenceAddr = addr("vkCreateFence")
	private val destroyFenceAddr = addr("vkDestroyFence")
	private val resetFencesAddr = addr("vkResetFences")
	private val getFenceStatusAddr = addr("vkGetFenceStatus")
	private val waitForFencesAddr = addr("vkWaitForFences")
	private val createSemaphoreAddr = addr("vkCreateSemaphore")
	private val destroySemaphoreAddr = addr("vkDestroySemaphore")
	private val createEventAddr = addr("vkCreateEvent")
	private val destroyEventAddr = addr("vkDestroyEvent")
	private val getEventStatusAddr = addr("vkGetEventStatus")
	private val setEventAddr = addr("vkSetEvent")
	private val resetEventAddr = addr("vkResetEvent")
	private val createQueryPoolAddr = addr("vkCreateQueryPool")
	private val destroyQueryPoolAddr = addr("vkDestroyQueryPool")
	private val getQueryPoolResultsAddr = addr("vkGetQueryPoolResults")
	private val createBufferAddr = addr("vkCreateBuffer")
	private val destroyBufferAddr = addr("vkDestroyBuffer")
	private val createBufferViewAddr = addr("vkCreateBufferView")
	private val destroyBufferViewAddr = addr("vkDestroyBufferView")
	private val createImageAddr = addr("vkCreateImage")
	private val destroyImageAddr = addr("vkDestroyImage")
	private val getImageSubresourceLayoutAddr = addr("vkGetImageSubresourceLayout")
	private val createImageViewAddr = addr("vkCreateImageView")
	private val destroyImageViewAddr = addr("vkDestroyImageView")
	private val createShaderModuleAddr = addr("vkCreateShaderModule")
	private val destroyShaderModuleAddr = addr("vkDestroyShaderModule")
	private val createPipelineCacheAddr = addr("vkCreatePipelineCache")
	private val destroyPipelineCacheAddr = addr("vkDestroyPipelineCache")
	private val getPipelineCacheDataAddr = addr("vkGetPipelineCacheData")
	private val mergePipelineCachesAddr = addr("vkMergePipelineCaches")
	private val createGraphicsPipelinesAddr = addr("vkCreateGraphicsPipelines")
	private val createComputePipelinesAddr = addr("vkCreateComputePipelines")
	private val destroyPipelineAddr = addr("vkDestroyPipeline")
	private val createPipelineLayoutAddr = addr("vkCreatePipelineLayout")
	private val destroyPipelineLayoutAddr = addr("vkDestroyPipelineLayout")
	private val createSamplerAddr = addr("vkCreateSampler")
	private val destroySamplerAddr = addr("vkDestroySampler")
	private val createDescriptorSetLayoutAddr = addr("vkCreateDescriptorSetLayout")
	private val destroyDescriptorSetLayoutAddr = addr("vkDestroyDescriptorSetLayout")
	private val createDescriptorPoolAddr = addr("vkCreateDescriptorPool")
	private val destroyDescriptorPoolAddr = addr("vkDestroyDescriptorPool")
	private val resetDescriptorPoolAddr = addr("vkResetDescriptorPool")
	private val allocateDescriptorSetsAddr = addr("vkAllocateDescriptorSets")
	private val freeDescriptorSetsAddr = addr("vkFreeDescriptorSets")
	private val updateDescriptorSetsAddr = addr("vkUpdateDescriptorSets")
	private val createFramebufferAddr = addr("vkCreateFramebuffer")
	private val destroyFramebufferAddr = addr("vkDestroyFramebuffer")
	private val createRenderPassAddr = addr("vkCreateRenderPass")
	private val destroyRenderPassAddr = addr("vkDestroyRenderPass")
	private val getRenderAreaGranularityAddr = addr("vkGetRenderAreaGranularity")
	private val createCommandPoolAddr = addr("vkCreateCommandPool")
	private val destroyCommandPoolAddr = addr("vkDestroyCommandPool")
	private val resetCommandPoolAddr = addr("vkResetCommandPool")
	private val allocateCommandBuffersAddr = addr("vkAllocateCommandBuffers")
	private val freeCommandBuffersAddr = addr("vkFreeCommandBuffers")
	private val beginCommandBufferAddr = addr("vkBeginCommandBuffer")
	private val endCommandBufferAddr = addr("vkEndCommandBuffer")
	private val resetCommandBufferAddr = addr("vkResetCommandBuffer")
	private val cmdBindPipelineAddr = addr("vkCmdBindPipeline")
	private val cmdSetViewportAddr = addr("vkCmdSetViewport")
	private val cmdSetScissorAddr = addr("vkCmdSetScissor")
	private val cmdSetLineWidthAddr = addr("vkCmdSetLineWidth")
	private val cmdSetDepthBiasAddr = addr("vkCmdSetDepthBias")
	private val cmdSetBlendConstantsAddr = addr("vkCmdSetBlendConstants")
	private val cmdSetDepthBoundsAddr = addr("vkCmdSetDepthBounds")
	private val cmdSetStencilCompareMaskAddr = addr("vkCmdSetStencilCompareMask")
	private val cmdSetStencilWriteMaskAddr = addr("vkCmdSetStencilWriteMask")
	private val cmdSetStencilReferenceAddr = addr("vkCmdSetStencilReference")
	private val cmdBindDescriptorSetsAddr = addr("vkCmdBindDescriptorSets")
	private val cmdBindIndexBufferAddr = addr("vkCmdBindIndexBuffer")
	private val cmdBindVertexBuffersAddr = addr("vkCmdBindVertexBuffers")
	private val cmdDrawAddr = addr("vkCmdDraw")
	private val cmdDrawIndexedAddr = addr("vkCmdDrawIndexed")
	private val cmdDrawIndirectAddr = addr("vkCmdDrawIndirect")
	private val cmdDrawIndexedIndirectAddr = addr("vkCmdDrawIndexedIndirect")
	private val cmdDispatchAddr = addr("vkCmdDispatch")
	private val cmdDispatchIndirectAddr = addr("vkCmdDispatchIndirect")
	private val cmdCopyBufferAddr = addr("vkCmdCopyBuffer")
	private val cmdCopyImageAddr = addr("vkCmdCopyImage")
	private val cmdBlitImageAddr = addr("vkCmdBlitImage")
	private val cmdCopyBufferToImageAddr = addr("vkCmdCopyBufferToImage")
	private val cmdCopyImageToBufferAddr = addr("vkCmdCopyImageToBuffer")
	private val cmdUpdateBufferAddr = addr("vkCmdUpdateBuffer")
	private val cmdFillBufferAddr = addr("vkCmdFillBuffer")
	private val cmdClearColorImageAddr = addr("vkCmdClearColorImage")
	private val cmdClearDepthStencilImageAddr = addr("vkCmdClearDepthStencilImage")
	private val cmdClearAttachmentsAddr = addr("vkCmdClearAttachments")
	private val cmdResolveImageAddr = addr("vkCmdResolveImage")
	private val cmdSetEventAddr = addr("vkCmdSetEvent")
	private val cmdResetEventAddr = addr("vkCmdResetEvent")
	private val cmdWaitEventsAddr = addr("vkCmdWaitEvents")
	private val cmdPipelineBarrierAddr = addr("vkCmdPipelineBarrier")
	private val cmdBeginQueryAddr = addr("vkCmdBeginQuery")
	private val cmdEndQueryAddr = addr("vkCmdEndQuery")
	private val cmdResetQueryPoolAddr = addr("vkCmdResetQueryPool")
	private val cmdWriteTimestampAddr = addr("vkCmdWriteTimestamp")
	private val cmdCopyQueryPoolResultsAddr = addr("vkCmdCopyQueryPoolResults")
	private val cmdPushConstantsAddr = addr("vkCmdPushConstants")
	private val cmdBeginRenderPassAddr = addr("vkCmdBeginRenderPass")
	private val cmdNextSubpassAddr = addr("vkCmdNextSubpass")
	private val cmdEndRenderPassAddr = addr("vkCmdEndRenderPass")
	private val cmdExecuteCommandsAddr = addr("vkCmdExecuteCommands")
	private val bindBufferMemory2Addr = addr("vkBindBufferMemory2")
	private val bindImageMemory2Addr = addr("vkBindImageMemory2")
	private val getDeviceGroupPeerMemoryFeaturesAddr = addr("vkGetDeviceGroupPeerMemoryFeatures")
	private val cmdSetDeviceMaskAddr = addr("vkCmdSetDeviceMask")
	private val cmdDispatchBaseAddr = addr("vkCmdDispatchBase")
	private val getImageMemoryRequirements2Addr = addr("vkGetImageMemoryRequirements2")
	private val getBufferMemoryRequirements2Addr = addr("vkGetBufferMemoryRequirements2")
	private val getImageSparseMemoryRequirements2Addr = addr("vkGetImageSparseMemoryRequirements2")
	private val trimCommandPoolAddr = addr("vkTrimCommandPool")
	private val getDeviceQueue2Addr = addr("vkGetDeviceQueue2")
	private val createSamplerYcbcrConversionAddr = addr("vkCreateSamplerYcbcrConversion")
	private val destroySamplerYcbcrConversionAddr = addr("vkDestroySamplerYcbcrConversion")
	private val createDescriptorUpdateTemplateAddr = addr("vkCreateDescriptorUpdateTemplate")
	private val destroyDescriptorUpdateTemplateAddr = addr("vkDestroyDescriptorUpdateTemplate")
	private val updateDescriptorSetWithTemplateAddr = addr("vkUpdateDescriptorSetWithTemplate")
	private val getDescriptorSetLayoutSupportAddr = addr("vkGetDescriptorSetLayoutSupport")
	private val cmdDrawIndirectCountAddr = addr("vkCmdDrawIndirectCount")
	private val cmdDrawIndexedIndirectCountAddr = addr("vkCmdDrawIndexedIndirectCount")
	private val createRenderPass2Addr = addr("vkCreateRenderPass2")
	private val cmdBeginRenderPass2Addr = addr("vkCmdBeginRenderPass2")
	private val cmdNextSubpass2Addr = addr("vkCmdNextSubpass2")
	private val cmdEndRenderPass2Addr = addr("vkCmdEndRenderPass2")
	private val resetQueryPoolAddr = addr("vkResetQueryPool")
	private val getSemaphoreCounterValueAddr = addr("vkGetSemaphoreCounterValue")
	private val waitSemaphoresAddr = addr("vkWaitSemaphores")
	private val signalSemaphoreAddr = addr("vkSignalSemaphore")
	private val getBufferDeviceAddressAddr = addr("vkGetBufferDeviceAddress")
	private val getBufferOpaqueCaptureAddressAddr = addr("vkGetBufferOpaqueCaptureAddress")
	private val getDeviceMemoryOpaqueCaptureAddressAddr = addr("vkGetDeviceMemoryOpaqueCaptureAddress")
	private val createSwapchainKHRAddr = addr("vkCreateSwapchainKHR")
	private val destroySwapchainKHRAddr = addr("vkDestroySwapchainKHR")
	private val getSwapchainImagesKHRAddr = addr("vkGetSwapchainImagesKHR")
	private val acquireNextImageKHRAddr = addr("vkAcquireNextImageKHR")
	private val queuePresentKHRAddr = addr("vkQueuePresentKHR")
	private val getDeviceGroupPresentCapabilitiesKHRAddr = addr("vkGetDeviceGroupPresentCapabilitiesKHR")
	private val getDeviceGroupSurfacePresentModesKHRAddr = addr("vkGetDeviceGroupSurfacePresentModesKHR")
	private val acquireNextImage2KHRAddr = addr("vkAcquireNextImage2KHR")
	private val createSharedSwapchainsKHRAddr = addr("vkCreateSharedSwapchainsKHR")
	private val debugMarkerSetObjectTagEXTAddr = addr("vkDebugMarkerSetObjectTagEXT")
	private val debugMarkerSetObjectNameEXTAddr = addr("vkDebugMarkerSetObjectNameEXT")
	private val cmdDebugMarkerBeginEXTAddr = addr("vkCmdDebugMarkerBeginEXT")
	private val cmdDebugMarkerEndEXTAddr = addr("vkCmdDebugMarkerEndEXT")
	private val cmdDebugMarkerInsertEXTAddr = addr("vkCmdDebugMarkerInsertEXT")
	private val cmdBindTransformFeedbackBuffersEXTAddr = addr("vkCmdBindTransformFeedbackBuffersEXT")
	private val cmdBeginTransformFeedbackEXTAddr = addr("vkCmdBeginTransformFeedbackEXT")
	private val cmdEndTransformFeedbackEXTAddr = addr("vkCmdEndTransformFeedbackEXT")
	private val cmdBeginQueryIndexedEXTAddr = addr("vkCmdBeginQueryIndexedEXT")
	private val cmdEndQueryIndexedEXTAddr = addr("vkCmdEndQueryIndexedEXT")
	private val cmdDrawIndirectByteCountEXTAddr = addr("vkCmdDrawIndirectByteCountEXT")
	private val getImageViewHandleNVXAddr = addr("vkGetImageViewHandleNVX")
	private val getImageViewAddressNVXAddr = addr("vkGetImageViewAddressNVX")
	private val cmdDrawIndirectCountAMDAddr = addr("vkCmdDrawIndirectCountAMD")
	private val cmdDrawIndexedIndirectCountAMDAddr = addr("vkCmdDrawIndexedIndirectCountAMD")
	private val getShaderInfoAMDAddr = addr("vkGetShaderInfoAMD")
	private val getMemoryWin32HandleNVAddr = addr("vkGetMemoryWin32HandleNV")
	private val getDeviceGroupPeerMemoryFeaturesKHRAddr = addr("vkGetDeviceGroupPeerMemoryFeaturesKHR")
	private val cmdSetDeviceMaskKHRAddr = addr("vkCmdSetDeviceMaskKHR")
	private val cmdDispatchBaseKHRAddr = addr("vkCmdDispatchBaseKHR")
	private val trimCommandPoolKHRAddr = addr("vkTrimCommandPoolKHR")
	private val getMemoryWin32HandleKHRAddr = addr("vkGetMemoryWin32HandleKHR")
	private val getMemoryWin32HandlePropertiesKHRAddr = addr("vkGetMemoryWin32HandlePropertiesKHR")
	private val getMemoryFdKHRAddr = addr("vkGetMemoryFdKHR")
	private val getMemoryFdPropertiesKHRAddr = addr("vkGetMemoryFdPropertiesKHR")
	private val importSemaphoreWin32HandleKHRAddr = addr("vkImportSemaphoreWin32HandleKHR")
	private val getSemaphoreWin32HandleKHRAddr = addr("vkGetSemaphoreWin32HandleKHR")
	private val importSemaphoreFdKHRAddr = addr("vkImportSemaphoreFdKHR")
	private val getSemaphoreFdKHRAddr = addr("vkGetSemaphoreFdKHR")
	private val cmdPushDescriptorSetKHRAddr = addr("vkCmdPushDescriptorSetKHR")
	private val cmdPushDescriptorSetWithTemplateKHRAddr = addr("vkCmdPushDescriptorSetWithTemplateKHR")
	private val cmdBeginConditionalRenderingEXTAddr = addr("vkCmdBeginConditionalRenderingEXT")
	private val cmdEndConditionalRenderingEXTAddr = addr("vkCmdEndConditionalRenderingEXT")
	private val createDescriptorUpdateTemplateKHRAddr = addr("vkCreateDescriptorUpdateTemplateKHR")
	private val destroyDescriptorUpdateTemplateKHRAddr = addr("vkDestroyDescriptorUpdateTemplateKHR")
	private val updateDescriptorSetWithTemplateKHRAddr = addr("vkUpdateDescriptorSetWithTemplateKHR")
	private val cmdSetViewportWScalingNVAddr = addr("vkCmdSetViewportWScalingNV")
	private val displayPowerControlEXTAddr = addr("vkDisplayPowerControlEXT")
	private val registerDeviceEventEXTAddr = addr("vkRegisterDeviceEventEXT")
	private val registerDisplayEventEXTAddr = addr("vkRegisterDisplayEventEXT")
	private val getSwapchainCounterEXTAddr = addr("vkGetSwapchainCounterEXT")
	private val getRefreshCycleDurationGOOGLEAddr = addr("vkGetRefreshCycleDurationGOOGLE")
	private val getPastPresentationTimingGOOGLEAddr = addr("vkGetPastPresentationTimingGOOGLE")
	private val cmdSetDiscardRectangleEXTAddr = addr("vkCmdSetDiscardRectangleEXT")
	private val setHdrMetadataEXTAddr = addr("vkSetHdrMetadataEXT")
	private val createRenderPass2KHRAddr = addr("vkCreateRenderPass2KHR")
	private val cmdBeginRenderPass2KHRAddr = addr("vkCmdBeginRenderPass2KHR")
	private val cmdNextSubpass2KHRAddr = addr("vkCmdNextSubpass2KHR")
	private val cmdEndRenderPass2KHRAddr = addr("vkCmdEndRenderPass2KHR")
	private val getSwapchainStatusKHRAddr = addr("vkGetSwapchainStatusKHR")
	private val importFenceWin32HandleKHRAddr = addr("vkImportFenceWin32HandleKHR")
	private val getFenceWin32HandleKHRAddr = addr("vkGetFenceWin32HandleKHR")
	private val importFenceFdKHRAddr = addr("vkImportFenceFdKHR")
	private val getFenceFdKHRAddr = addr("vkGetFenceFdKHR")
	private val acquireProfilingLockKHRAddr = addr("vkAcquireProfilingLockKHR")
	private val releaseProfilingLockKHRAddr = addr("vkReleaseProfilingLockKHR")
	private val setDebugUtilsObjectNameEXTAddr = addr("vkSetDebugUtilsObjectNameEXT")
	private val setDebugUtilsObjectTagEXTAddr = addr("vkSetDebugUtilsObjectTagEXT")
	private val queueBeginDebugUtilsLabelEXTAddr = addr("vkQueueBeginDebugUtilsLabelEXT")
	private val queueEndDebugUtilsLabelEXTAddr = addr("vkQueueEndDebugUtilsLabelEXT")
	private val queueInsertDebugUtilsLabelEXTAddr = addr("vkQueueInsertDebugUtilsLabelEXT")
	private val cmdBeginDebugUtilsLabelEXTAddr = addr("vkCmdBeginDebugUtilsLabelEXT")
	private val cmdEndDebugUtilsLabelEXTAddr = addr("vkCmdEndDebugUtilsLabelEXT")
	private val cmdInsertDebugUtilsLabelEXTAddr = addr("vkCmdInsertDebugUtilsLabelEXT")
	private val getAndroidHardwareBufferPropertiesANDROIDAddr = addr("vkGetAndroidHardwareBufferPropertiesANDROID")
	private val getMemoryAndroidHardwareBufferANDROIDAddr = addr("vkGetMemoryAndroidHardwareBufferANDROID")
	private val cmdSetSampleLocationsEXTAddr = addr("vkCmdSetSampleLocationsEXT")
	private val getImageMemoryRequirements2KHRAddr = addr("vkGetImageMemoryRequirements2KHR")
	private val getBufferMemoryRequirements2KHRAddr = addr("vkGetBufferMemoryRequirements2KHR")
	private val getImageSparseMemoryRequirements2KHRAddr = addr("vkGetImageSparseMemoryRequirements2KHR")
	private val createAccelerationStructureKHRAddr = addr("vkCreateAccelerationStructureKHR")
	private val destroyAccelerationStructureKHRAddr = addr("vkDestroyAccelerationStructureKHR")
	private val cmdBuildAccelerationStructuresKHRAddr = addr("vkCmdBuildAccelerationStructuresKHR")
	private val cmdBuildAccelerationStructuresIndirectKHRAddr = addr("vkCmdBuildAccelerationStructuresIndirectKHR")
	private val buildAccelerationStructuresKHRAddr = addr("vkBuildAccelerationStructuresKHR")
	private val copyAccelerationStructureKHRAddr = addr("vkCopyAccelerationStructureKHR")
	private val copyAccelerationStructureToMemoryKHRAddr = addr("vkCopyAccelerationStructureToMemoryKHR")
	private val copyMemoryToAccelerationStructureKHRAddr = addr("vkCopyMemoryToAccelerationStructureKHR")
	private val writeAccelerationStructuresPropertiesKHRAddr = addr("vkWriteAccelerationStructuresPropertiesKHR")
	private val cmdCopyAccelerationStructureKHRAddr = addr("vkCmdCopyAccelerationStructureKHR")
	private val cmdCopyAccelerationStructureToMemoryKHRAddr = addr("vkCmdCopyAccelerationStructureToMemoryKHR")
	private val cmdCopyMemoryToAccelerationStructureKHRAddr = addr("vkCmdCopyMemoryToAccelerationStructureKHR")
	private val getAccelerationStructureDeviceAddressKHRAddr = addr("vkGetAccelerationStructureDeviceAddressKHR")
	private val cmdWriteAccelerationStructuresPropertiesKHRAddr = addr("vkCmdWriteAccelerationStructuresPropertiesKHR")
	private val getDeviceAccelerationStructureCompatibilityKHRAddr = addr("vkGetDeviceAccelerationStructureCompatibilityKHR")
	private val getAccelerationStructureBuildSizesKHRAddr = addr("vkGetAccelerationStructureBuildSizesKHR")
	private val cmdTraceRaysKHRAddr = addr("vkCmdTraceRaysKHR")
	private val createRayTracingPipelinesKHRAddr = addr("vkCreateRayTracingPipelinesKHR")
	private val getRayTracingShaderGroupHandlesKHRAddr = addr("vkGetRayTracingShaderGroupHandlesKHR")
	private val getRayTracingCaptureReplayShaderGroupHandlesKHRAddr = addr("vkGetRayTracingCaptureReplayShaderGroupHandlesKHR")
	private val cmdTraceRaysIndirectKHRAddr = addr("vkCmdTraceRaysIndirectKHR")
	private val getRayTracingShaderGroupStackSizeKHRAddr = addr("vkGetRayTracingShaderGroupStackSizeKHR")
	private val cmdSetRayTracingPipelineStackSizeKHRAddr = addr("vkCmdSetRayTracingPipelineStackSizeKHR")
	private val createSamplerYcbcrConversionKHRAddr = addr("vkCreateSamplerYcbcrConversionKHR")
	private val destroySamplerYcbcrConversionKHRAddr = addr("vkDestroySamplerYcbcrConversionKHR")
	private val bindBufferMemory2KHRAddr = addr("vkBindBufferMemory2KHR")
	private val bindImageMemory2KHRAddr = addr("vkBindImageMemory2KHR")
	private val getImageDrmFormatModifierPropertiesEXTAddr = addr("vkGetImageDrmFormatModifierPropertiesEXT")
	private val createValidationCacheEXTAddr = addr("vkCreateValidationCacheEXT")
	private val destroyValidationCacheEXTAddr = addr("vkDestroyValidationCacheEXT")
	private val mergeValidationCachesEXTAddr = addr("vkMergeValidationCachesEXT")
	private val getValidationCacheDataEXTAddr = addr("vkGetValidationCacheDataEXT")
	private val cmdBindShadingRateImageNVAddr = addr("vkCmdBindShadingRateImageNV")
	private val cmdSetViewportShadingRatePaletteNVAddr = addr("vkCmdSetViewportShadingRatePaletteNV")
	private val cmdSetCoarseSampleOrderNVAddr = addr("vkCmdSetCoarseSampleOrderNV")
	private val createAccelerationStructureNVAddr = addr("vkCreateAccelerationStructureNV")
	private val destroyAccelerationStructureNVAddr = addr("vkDestroyAccelerationStructureNV")
	private val getAccelerationStructureMemoryRequirementsNVAddr = addr("vkGetAccelerationStructureMemoryRequirementsNV")
	private val bindAccelerationStructureMemoryNVAddr = addr("vkBindAccelerationStructureMemoryNV")
	private val cmdBuildAccelerationStructureNVAddr = addr("vkCmdBuildAccelerationStructureNV")
	private val cmdCopyAccelerationStructureNVAddr = addr("vkCmdCopyAccelerationStructureNV")
	private val cmdTraceRaysNVAddr = addr("vkCmdTraceRaysNV")
	private val createRayTracingPipelinesNVAddr = addr("vkCreateRayTracingPipelinesNV")
	private val getRayTracingShaderGroupHandlesNVAddr = addr("vkGetRayTracingShaderGroupHandlesNV")
	private val getAccelerationStructureHandleNVAddr = addr("vkGetAccelerationStructureHandleNV")
	private val cmdWriteAccelerationStructuresPropertiesNVAddr = addr("vkCmdWriteAccelerationStructuresPropertiesNV")
	private val compileDeferredNVAddr = addr("vkCompileDeferredNV")
	private val getDescriptorSetLayoutSupportKHRAddr = addr("vkGetDescriptorSetLayoutSupportKHR")
	private val cmdDrawIndirectCountKHRAddr = addr("vkCmdDrawIndirectCountKHR")
	private val cmdDrawIndexedIndirectCountKHRAddr = addr("vkCmdDrawIndexedIndirectCountKHR")
	private val getMemoryHostPointerPropertiesEXTAddr = addr("vkGetMemoryHostPointerPropertiesEXT")
	private val cmdWriteBufferMarkerAMDAddr = addr("vkCmdWriteBufferMarkerAMD")
	private val getCalibratedTimestampsEXTAddr = addr("vkGetCalibratedTimestampsEXT")
	private val cmdDrawMeshTasksNVAddr = addr("vkCmdDrawMeshTasksNV")
	private val cmdDrawMeshTasksIndirectNVAddr = addr("vkCmdDrawMeshTasksIndirectNV")
	private val cmdDrawMeshTasksIndirectCountNVAddr = addr("vkCmdDrawMeshTasksIndirectCountNV")
	private val cmdSetExclusiveScissorNVAddr = addr("vkCmdSetExclusiveScissorNV")
	private val cmdSetCheckpointNVAddr = addr("vkCmdSetCheckpointNV")
	private val getQueueCheckpointDataNVAddr = addr("vkGetQueueCheckpointDataNV")
	private val getSemaphoreCounterValueKHRAddr = addr("vkGetSemaphoreCounterValueKHR")
	private val waitSemaphoresKHRAddr = addr("vkWaitSemaphoresKHR")
	private val signalSemaphoreKHRAddr = addr("vkSignalSemaphoreKHR")
	private val initializePerformanceApiINTELAddr = addr("vkInitializePerformanceApiINTEL")
	private val uninitializePerformanceApiINTELAddr = addr("vkUninitializePerformanceApiINTEL")
	private val cmdSetPerformanceMarkerINTELAddr = addr("vkCmdSetPerformanceMarkerINTEL")
	private val cmdSetPerformanceStreamMarkerINTELAddr = addr("vkCmdSetPerformanceStreamMarkerINTEL")
	private val cmdSetPerformanceOverrideINTELAddr = addr("vkCmdSetPerformanceOverrideINTEL")
	private val acquirePerformanceConfigurationINTELAddr = addr("vkAcquirePerformanceConfigurationINTEL")
	private val releasePerformanceConfigurationINTELAddr = addr("vkReleasePerformanceConfigurationINTEL")
	private val queueSetPerformanceConfigurationINTELAddr = addr("vkQueueSetPerformanceConfigurationINTEL")
	private val getPerformanceParameterINTELAddr = addr("vkGetPerformanceParameterINTEL")
	private val setLocalDimmingAMDAddr = addr("vkSetLocalDimmingAMD")
	private val cmdSetFragmentShadingRateKHRAddr = addr("vkCmdSetFragmentShadingRateKHR")
	private val getBufferDeviceAddressEXTAddr = addr("vkGetBufferDeviceAddressEXT")
	private val acquireFullScreenExclusiveModeEXTAddr = addr("vkAcquireFullScreenExclusiveModeEXT")
	private val releaseFullScreenExclusiveModeEXTAddr = addr("vkReleaseFullScreenExclusiveModeEXT")
	private val getDeviceGroupSurfacePresentModes2EXTAddr = addr("vkGetDeviceGroupSurfacePresentModes2EXT")
	private val getBufferDeviceAddressKHRAddr = addr("vkGetBufferDeviceAddressKHR")
	private val getBufferOpaqueCaptureAddressKHRAddr = addr("vkGetBufferOpaqueCaptureAddressKHR")
	private val getDeviceMemoryOpaqueCaptureAddressKHRAddr = addr("vkGetDeviceMemoryOpaqueCaptureAddressKHR")
	private val cmdSetLineStippleEXTAddr = addr("vkCmdSetLineStippleEXT")
	private val resetQueryPoolEXTAddr = addr("vkResetQueryPoolEXT")
	private val cmdSetCullModeEXTAddr = addr("vkCmdSetCullModeEXT")
	private val cmdSetFrontFaceEXTAddr = addr("vkCmdSetFrontFaceEXT")
	private val cmdSetPrimitiveTopologyEXTAddr = addr("vkCmdSetPrimitiveTopologyEXT")
	private val cmdSetViewportWithCountEXTAddr = addr("vkCmdSetViewportWithCountEXT")
	private val cmdSetScissorWithCountEXTAddr = addr("vkCmdSetScissorWithCountEXT")
	private val cmdBindVertexBuffers2EXTAddr = addr("vkCmdBindVertexBuffers2EXT")
	private val cmdSetDepthTestEnableEXTAddr = addr("vkCmdSetDepthTestEnableEXT")
	private val cmdSetDepthWriteEnableEXTAddr = addr("vkCmdSetDepthWriteEnableEXT")
	private val cmdSetDepthCompareOpEXTAddr = addr("vkCmdSetDepthCompareOpEXT")
	private val cmdSetDepthBoundsTestEnableEXTAddr = addr("vkCmdSetDepthBoundsTestEnableEXT")
	private val cmdSetStencilTestEnableEXTAddr = addr("vkCmdSetStencilTestEnableEXT")
	private val cmdSetStencilOpEXTAddr = addr("vkCmdSetStencilOpEXT")
	private val createDeferredOperationKHRAddr = addr("vkCreateDeferredOperationKHR")
	private val destroyDeferredOperationKHRAddr = addr("vkDestroyDeferredOperationKHR")
	private val getDeferredOperationMaxConcurrencyKHRAddr = addr("vkGetDeferredOperationMaxConcurrencyKHR")
	private val getDeferredOperationResultKHRAddr = addr("vkGetDeferredOperationResultKHR")
	private val deferredOperationJoinKHRAddr = addr("vkDeferredOperationJoinKHR")
	private val getPipelineExecutablePropertiesKHRAddr = addr("vkGetPipelineExecutablePropertiesKHR")
	private val getPipelineExecutableStatisticsKHRAddr = addr("vkGetPipelineExecutableStatisticsKHR")
	private val getPipelineExecutableInternalRepresentationsKHRAddr = addr("vkGetPipelineExecutableInternalRepresentationsKHR")
	private val getGeneratedCommandsMemoryRequirementsNVAddr = addr("vkGetGeneratedCommandsMemoryRequirementsNV")
	private val cmdPreprocessGeneratedCommandsNVAddr = addr("vkCmdPreprocessGeneratedCommandsNV")
	private val cmdExecuteGeneratedCommandsNVAddr = addr("vkCmdExecuteGeneratedCommandsNV")
	private val cmdBindPipelineShaderGroupNVAddr = addr("vkCmdBindPipelineShaderGroupNV")
	private val createIndirectCommandsLayoutNVAddr = addr("vkCreateIndirectCommandsLayoutNV")
	private val destroyIndirectCommandsLayoutNVAddr = addr("vkDestroyIndirectCommandsLayoutNV")
	private val createPrivateDataSlotEXTAddr = addr("vkCreatePrivateDataSlotEXT")
	private val destroyPrivateDataSlotEXTAddr = addr("vkDestroyPrivateDataSlotEXT")
	private val setPrivateDataEXTAddr = addr("vkSetPrivateDataEXT")
	private val getPrivateDataEXTAddr = addr("vkGetPrivateDataEXT")
	private val cmdSetEvent2KHRAddr = addr("vkCmdSetEvent2KHR")
	private val cmdResetEvent2KHRAddr = addr("vkCmdResetEvent2KHR")
	private val cmdWaitEvents2KHRAddr = addr("vkCmdWaitEvents2KHR")
	private val cmdPipelineBarrier2KHRAddr = addr("vkCmdPipelineBarrier2KHR")
	private val cmdWriteTimestamp2KHRAddr = addr("vkCmdWriteTimestamp2KHR")
	private val queueSubmit2KHRAddr = addr("vkQueueSubmit2KHR")
	private val cmdWriteBufferMarker2AMDAddr = addr("vkCmdWriteBufferMarker2AMD")
	private val getQueueCheckpointData2NVAddr = addr("vkGetQueueCheckpointData2NV")
	private val cmdSetFragmentShadingRateEnumNVAddr = addr("vkCmdSetFragmentShadingRateEnumNV")
	private val cmdCopyBuffer2KHRAddr = addr("vkCmdCopyBuffer2KHR")
	private val cmdCopyImage2KHRAddr = addr("vkCmdCopyImage2KHR")
	private val cmdCopyBufferToImage2KHRAddr = addr("vkCmdCopyBufferToImage2KHR")
	private val cmdCopyImageToBuffer2KHRAddr = addr("vkCmdCopyImageToBuffer2KHR")
	private val cmdBlitImage2KHRAddr = addr("vkCmdBlitImage2KHR")
	private val cmdResolveImage2KHRAddr = addr("vkCmdResolveImage2KHR")
	private val getMemoryZirconHandleFUCHSIAAddr = addr("vkGetMemoryZirconHandleFUCHSIA")
	private val getMemoryZirconHandlePropertiesFUCHSIAAddr = addr("vkGetMemoryZirconHandlePropertiesFUCHSIA")
	private val importSemaphoreZirconHandleFUCHSIAAddr = addr("vkImportSemaphoreZirconHandleFUCHSIA")
	private val getSemaphoreZirconHandleFUCHSIAAddr = addr("vkGetSemaphoreZirconHandleFUCHSIA")
	init { stack.pop() }
	
	
	
	/*
	Device commands
	 */
	
	
	
	fun getDeviceProcAddr(pName: DirectByteBuffer): Long {
		return Commands.getDeviceProcAddr(getDeviceProcAddrAddr, device.address, pName.address)
	}
	
	
	
	fun destroyDevice(pAllocator: AllocationCallbacks?) {
		Commands.destroyDevice(destroyDeviceAddr, device.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getDeviceQueue(queueFamilyIndex: Int, queueIndex: Int, pQueue: NativePointer) {
		Commands.getDeviceQueue(getDeviceQueueAddr, device.address, queueFamilyIndex, queueIndex, pQueue.address)
	}
	
	
	
	fun queueSubmit(queue: QueueH, submitCount: Int, pSubmits: SubmitInfo.Buffer, fence: FenceH?): Result {
		return Result(Commands.queueSubmit(queueSubmitAddr, queue.address, submitCount, pSubmits.address, fence.addressOrNULL))
	}
	
	
	
	fun queueWaitIdle(queue: QueueH): Result {
		return Result(Commands.queueWaitIdle(queueWaitIdleAddr, queue.address))
	}
	
	
	
	fun deviceWaitIdle(): Result {
		return Result(Commands.deviceWaitIdle(deviceWaitIdleAddr, device.address))
	}
	
	
	
	fun allocateMemory(pAllocateInfo: MemoryAllocateInfo, pAllocator: AllocationCallbacks?, pMemory: NativePointer): Result {
		return Result(Commands.allocateMemory(allocateMemoryAddr, device.address, pAllocateInfo.address, pAllocator.addressOrNULL, pMemory.address))
	}
	
	
	
	fun freeMemory(memory: DeviceMemoryH?, pAllocator: AllocationCallbacks?) {
		Commands.freeMemory(freeMemoryAddr, device.address, memory.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun mapMemory(memory: DeviceMemoryH, offset: Long, size: Long, flags: MemoryMapFlags, ppData: Long): Result {
		return Result(Commands.mapMemory(mapMemoryAddr, device.address, memory.address, offset, size, flags.bitfield, ppData))
	}
	
	
	
	fun unmapMemory(memory: DeviceMemoryH) {
		Commands.unmapMemory(unmapMemoryAddr, device.address, memory.address)
	}
	
	
	
	fun flushMappedMemoryRanges(memoryRangeCount: Int, pMemoryRanges: MappedMemoryRange.Buffer): Result {
		return Result(Commands.flushMappedMemoryRanges(flushMappedMemoryRangesAddr, device.address, memoryRangeCount, pMemoryRanges.address))
	}
	
	
	
	fun invalidateMappedMemoryRanges(memoryRangeCount: Int, pMemoryRanges: MappedMemoryRange.Buffer): Result {
		return Result(Commands.invalidateMappedMemoryRanges(invalidateMappedMemoryRangesAddr, device.address, memoryRangeCount, pMemoryRanges.address))
	}
	
	
	
	fun getDeviceMemoryCommitment(memory: DeviceMemoryH, pCommittedMemoryInBytes: DirectLong) {
		Commands.getDeviceMemoryCommitment(getDeviceMemoryCommitmentAddr, device.address, memory.address, pCommittedMemoryInBytes.address)
	}
	
	
	
	fun bindBufferMemory(buffer: BufferH, memory: DeviceMemoryH, memoryOffset: Long): Result {
		return Result(Commands.bindBufferMemory(bindBufferMemoryAddr, device.address, buffer.address, memory.address, memoryOffset))
	}
	
	
	
	fun bindImageMemory(image: ImageH, memory: DeviceMemoryH, memoryOffset: Long): Result {
		return Result(Commands.bindImageMemory(bindImageMemoryAddr, device.address, image.address, memory.address, memoryOffset))
	}
	
	
	
	fun getBufferMemoryRequirements(buffer: BufferH, pMemoryRequirements: MemoryRequirements) {
		Commands.getBufferMemoryRequirements(getBufferMemoryRequirementsAddr, device.address, buffer.address, pMemoryRequirements.address)
	}
	
	
	
	fun getImageMemoryRequirements(image: ImageH, pMemoryRequirements: MemoryRequirements) {
		Commands.getImageMemoryRequirements(getImageMemoryRequirementsAddr, device.address, image.address, pMemoryRequirements.address)
	}
	
	
	
	fun getImageSparseMemoryRequirements(image: ImageH, pSparseMemoryRequirementCount: DirectInt, pSparseMemoryRequirements: SparseImageMemoryRequirements.Buffer?) {
		Commands.getImageSparseMemoryRequirements(getImageSparseMemoryRequirementsAddr, device.address, image.address, pSparseMemoryRequirementCount.address, pSparseMemoryRequirements.addressOrNULL)
	}
	
	
	
	fun queueBindSparse(queue: QueueH, bindInfoCount: Int, pBindInfo: BindSparseInfo.Buffer, fence: FenceH?): Result {
		return Result(Commands.queueBindSparse(queueBindSparseAddr, queue.address, bindInfoCount, pBindInfo.address, fence.addressOrNULL))
	}
	
	
	
	fun createFence(pCreateInfo: FenceCreateInfo, pAllocator: AllocationCallbacks?, pFence: NativePointer): Result {
		return Result(Commands.createFence(createFenceAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pFence.address))
	}
	
	
	
	fun destroyFence(fence: FenceH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyFence(destroyFenceAddr, device.address, fence.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun resetFences(fenceCount: Int, pFences: NativePointerBuffer): Result {
		return Result(Commands.resetFences(resetFencesAddr, device.address, fenceCount, pFences.address))
	}
	
	
	
	fun getFenceStatus(fence: FenceH): Result {
		return Result(Commands.getFenceStatus(getFenceStatusAddr, device.address, fence.address))
	}
	
	
	
	fun waitForFences(fenceCount: Int, pFences: NativePointerBuffer, waitAll: Int, timeout: Long): Result {
		return Result(Commands.waitForFences(waitForFencesAddr, device.address, fenceCount, pFences.address, waitAll, timeout))
	}
	
	
	
	fun createSemaphore(pCreateInfo: SemaphoreCreateInfo, pAllocator: AllocationCallbacks?, pSemaphore: NativePointer): Result {
		return Result(Commands.createSemaphore(createSemaphoreAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSemaphore.address))
	}
	
	
	
	fun destroySemaphore(semaphore: SemaphoreH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySemaphore(destroySemaphoreAddr, device.address, semaphore.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createEvent(pCreateInfo: EventCreateInfo, pAllocator: AllocationCallbacks?, pEvent: NativePointer): Result {
		return Result(Commands.createEvent(createEventAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pEvent.address))
	}
	
	
	
	fun destroyEvent(event: EventH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyEvent(destroyEventAddr, device.address, event.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getEventStatus(event: EventH): Result {
		return Result(Commands.getEventStatus(getEventStatusAddr, device.address, event.address))
	}
	
	
	
	fun setEvent(event: EventH): Result {
		return Result(Commands.setEvent(setEventAddr, device.address, event.address))
	}
	
	
	
	fun resetEvent(event: EventH): Result {
		return Result(Commands.resetEvent(resetEventAddr, device.address, event.address))
	}
	
	
	
	fun createQueryPool(pCreateInfo: QueryPoolCreateInfo, pAllocator: AllocationCallbacks?, pQueryPool: NativePointer): Result {
		return Result(Commands.createQueryPool(createQueryPoolAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pQueryPool.address))
	}
	
	
	
	fun destroyQueryPool(queryPool: QueryPoolH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyQueryPool(destroyQueryPoolAddr, device.address, queryPool.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getQueryPoolResults(queryPool: QueryPoolH, firstQuery: Int, queryCount: Int, dataSize: Long, pData: Long, stride: Long, flags: QueryResultFlags): Result {
		return Result(Commands.getQueryPoolResults(getQueryPoolResultsAddr, device.address, queryPool.address, firstQuery, queryCount, dataSize, pData, stride, flags.bitfield))
	}
	
	
	
	fun createBuffer(pCreateInfo: BufferCreateInfo, pAllocator: AllocationCallbacks?, pBuffer: NativePointer): Result {
		return Result(Commands.createBuffer(createBufferAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pBuffer.address))
	}
	
	
	
	fun destroyBuffer(buffer: BufferH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyBuffer(destroyBufferAddr, device.address, buffer.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createBufferView(pCreateInfo: BufferViewCreateInfo, pAllocator: AllocationCallbacks?, pView: NativePointer): Result {
		return Result(Commands.createBufferView(createBufferViewAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pView.address))
	}
	
	
	
	fun destroyBufferView(bufferView: BufferViewH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyBufferView(destroyBufferViewAddr, device.address, bufferView.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createImage(pCreateInfo: ImageCreateInfo, pAllocator: AllocationCallbacks?, pImage: NativePointer): Result {
		return Result(Commands.createImage(createImageAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pImage.address))
	}
	
	
	
	fun destroyImage(image: ImageH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyImage(destroyImageAddr, device.address, image.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getImageSubresourceLayout(image: ImageH, pSubresource: ImageSubresource, pLayout: SubresourceLayout) {
		Commands.getImageSubresourceLayout(getImageSubresourceLayoutAddr, device.address, image.address, pSubresource.address, pLayout.address)
	}
	
	
	
	fun createImageView(pCreateInfo: ImageViewCreateInfo, pAllocator: AllocationCallbacks?, pView: NativePointer): Result {
		return Result(Commands.createImageView(createImageViewAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pView.address))
	}
	
	
	
	fun destroyImageView(imageView: ImageViewH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyImageView(destroyImageViewAddr, device.address, imageView.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createShaderModule(pCreateInfo: ShaderModuleCreateInfo, pAllocator: AllocationCallbacks?, pShaderModule: NativePointer): Result {
		return Result(Commands.createShaderModule(createShaderModuleAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pShaderModule.address))
	}
	
	
	
	fun destroyShaderModule(shaderModule: ShaderModuleH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyShaderModule(destroyShaderModuleAddr, device.address, shaderModule.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createPipelineCache(pCreateInfo: PipelineCacheCreateInfo, pAllocator: AllocationCallbacks?, pPipelineCache: NativePointer): Result {
		return Result(Commands.createPipelineCache(createPipelineCacheAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pPipelineCache.address))
	}
	
	
	
	fun destroyPipelineCache(pipelineCache: PipelineCacheH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyPipelineCache(destroyPipelineCacheAddr, device.address, pipelineCache.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getPipelineCacheData(pipelineCache: PipelineCacheH, pDataSize: NativeSizeT, pData: Long): Result {
		return Result(Commands.getPipelineCacheData(getPipelineCacheDataAddr, device.address, pipelineCache.address, pDataSize.address, pData))
	}
	
	
	
	fun mergePipelineCaches(dstCache: PipelineCacheH, srcCacheCount: Int, pSrcCaches: NativePointerBuffer): Result {
		return Result(Commands.mergePipelineCaches(mergePipelineCachesAddr, device.address, dstCache.address, srcCacheCount, pSrcCaches.address))
	}
	
	
	
	fun createGraphicsPipelines(pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: GraphicsPipelineCreateInfo.Buffer, pAllocator: AllocationCallbacks?, pPipelines: NativePointerBuffer): Result {
		return Result(Commands.createGraphicsPipelines(createGraphicsPipelinesAddr, device.address, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	
	
	fun createComputePipelines(pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: ComputePipelineCreateInfo.Buffer, pAllocator: AllocationCallbacks?, pPipelines: NativePointerBuffer): Result {
		return Result(Commands.createComputePipelines(createComputePipelinesAddr, device.address, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	
	
	fun destroyPipeline(pipeline: PipelineH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyPipeline(destroyPipelineAddr, device.address, pipeline.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createPipelineLayout(pCreateInfo: PipelineLayoutCreateInfo, pAllocator: AllocationCallbacks?, pPipelineLayout: NativePointer): Result {
		return Result(Commands.createPipelineLayout(createPipelineLayoutAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pPipelineLayout.address))
	}
	
	
	
	fun destroyPipelineLayout(pipelineLayout: PipelineLayoutH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyPipelineLayout(destroyPipelineLayoutAddr, device.address, pipelineLayout.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createSampler(pCreateInfo: SamplerCreateInfo, pAllocator: AllocationCallbacks?, pSampler: NativePointer): Result {
		return Result(Commands.createSampler(createSamplerAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSampler.address))
	}
	
	
	
	fun destroySampler(sampler: SamplerH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySampler(destroySamplerAddr, device.address, sampler.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createDescriptorSetLayout(pCreateInfo: DescriptorSetLayoutCreateInfo, pAllocator: AllocationCallbacks?, pSetLayout: NativePointer): Result {
		return Result(Commands.createDescriptorSetLayout(createDescriptorSetLayoutAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSetLayout.address))
	}
	
	
	
	fun destroyDescriptorSetLayout(descriptorSetLayout: DescriptorSetLayoutH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDescriptorSetLayout(destroyDescriptorSetLayoutAddr, device.address, descriptorSetLayout.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createDescriptorPool(pCreateInfo: DescriptorPoolCreateInfo, pAllocator: AllocationCallbacks?, pDescriptorPool: NativePointer): Result {
		return Result(Commands.createDescriptorPool(createDescriptorPoolAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pDescriptorPool.address))
	}
	
	
	
	fun destroyDescriptorPool(descriptorPool: DescriptorPoolH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDescriptorPool(destroyDescriptorPoolAddr, device.address, descriptorPool.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun resetDescriptorPool(descriptorPool: DescriptorPoolH, flags: DescriptorPoolResetFlags): Result {
		return Result(Commands.resetDescriptorPool(resetDescriptorPoolAddr, device.address, descriptorPool.address, flags.bitfield))
	}
	
	
	
	fun allocateDescriptorSets(pAllocateInfo: DescriptorSetAllocateInfo, pDescriptorSets: NativePointerBuffer): Result {
		return Result(Commands.allocateDescriptorSets(allocateDescriptorSetsAddr, device.address, pAllocateInfo.address, pDescriptorSets.address))
	}
	
	
	
	fun freeDescriptorSets(descriptorPool: DescriptorPoolH, descriptorSetCount: Int, pDescriptorSets: NativePointerBuffer): Result {
		return Result(Commands.freeDescriptorSets(freeDescriptorSetsAddr, device.address, descriptorPool.address, descriptorSetCount, pDescriptorSets.address))
	}
	
	
	
	fun updateDescriptorSets(descriptorWriteCount: Int, pDescriptorWrites: WriteDescriptorSet.Buffer, descriptorCopyCount: Int, pDescriptorCopies: CopyDescriptorSet.Buffer) {
		Commands.updateDescriptorSets(updateDescriptorSetsAddr, device.address, descriptorWriteCount, pDescriptorWrites.address, descriptorCopyCount, pDescriptorCopies.address)
	}
	
	
	
	fun createFramebuffer(pCreateInfo: FramebufferCreateInfo, pAllocator: AllocationCallbacks?, pFramebuffer: NativePointer): Result {
		return Result(Commands.createFramebuffer(createFramebufferAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pFramebuffer.address))
	}
	
	
	
	fun destroyFramebuffer(framebuffer: FramebufferH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyFramebuffer(destroyFramebufferAddr, device.address, framebuffer.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createRenderPass(pCreateInfo: RenderPassCreateInfo, pAllocator: AllocationCallbacks?, pRenderPass: NativePointer): Result {
		return Result(Commands.createRenderPass(createRenderPassAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pRenderPass.address))
	}
	
	
	
	fun destroyRenderPass(renderPass: RenderPassH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyRenderPass(destroyRenderPassAddr, device.address, renderPass.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getRenderAreaGranularity(renderPass: RenderPassH, pGranularity: Extent2D) {
		Commands.getRenderAreaGranularity(getRenderAreaGranularityAddr, device.address, renderPass.address, pGranularity.address)
	}
	
	
	
	fun createCommandPool(pCreateInfo: CommandPoolCreateInfo, pAllocator: AllocationCallbacks?, pCommandPool: NativePointer): Result {
		return Result(Commands.createCommandPool(createCommandPoolAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pCommandPool.address))
	}
	
	
	
	fun destroyCommandPool(commandPool: CommandPoolH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyCommandPool(destroyCommandPoolAddr, device.address, commandPool.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun resetCommandPool(commandPool: CommandPoolH, flags: CommandPoolResetFlags): Result {
		return Result(Commands.resetCommandPool(resetCommandPoolAddr, device.address, commandPool.address, flags.bitfield))
	}
	
	
	
	fun allocateCommandBuffers(pAllocateInfo: CommandBufferAllocateInfo, pCommandBuffers: NativePointerBuffer): Result {
		return Result(Commands.allocateCommandBuffers(allocateCommandBuffersAddr, device.address, pAllocateInfo.address, pCommandBuffers.address))
	}
	
	
	
	fun freeCommandBuffers(commandPool: CommandPoolH, commandBufferCount: Int, pCommandBuffers: NativePointerBuffer) {
		Commands.freeCommandBuffers(freeCommandBuffersAddr, device.address, commandPool.address, commandBufferCount, pCommandBuffers.address)
	}
	
	
	
	fun beginCommandBuffer(commandBuffer: CommandBufferH, pBeginInfo: CommandBufferBeginInfo): Result {
		return Result(Commands.beginCommandBuffer(beginCommandBufferAddr, commandBuffer.address, pBeginInfo.address))
	}
	
	
	
	fun endCommandBuffer(commandBuffer: CommandBufferH): Result {
		return Result(Commands.endCommandBuffer(endCommandBufferAddr, commandBuffer.address))
	}
	
	
	
	fun resetCommandBuffer(commandBuffer: CommandBufferH, flags: CommandBufferResetFlags): Result {
		return Result(Commands.resetCommandBuffer(resetCommandBufferAddr, commandBuffer.address, flags.bitfield))
	}
	
	
	
	fun cmdBindPipeline(commandBuffer: CommandBufferH, pipelineBindPoint: PipelineBindPoint, pipeline: PipelineH) {
		Commands.cmdBindPipeline(cmdBindPipelineAddr, commandBuffer.address, pipelineBindPoint.id, pipeline.address)
	}
	
	
	
	fun cmdSetViewport(commandBuffer: CommandBufferH, firstViewport: Int, viewportCount: Int, pViewports: Viewport.Buffer) {
		Commands.cmdSetViewport(cmdSetViewportAddr, commandBuffer.address, firstViewport, viewportCount, pViewports.address)
	}
	
	
	
	fun cmdSetScissor(commandBuffer: CommandBufferH, firstScissor: Int, scissorCount: Int, pScissors: Rect2D.Buffer) {
		Commands.cmdSetScissor(cmdSetScissorAddr, commandBuffer.address, firstScissor, scissorCount, pScissors.address)
	}
	
	
	
	fun cmdSetLineWidth(commandBuffer: CommandBufferH, lineWidth: Float) {
		Commands.cmdSetLineWidth(cmdSetLineWidthAddr, commandBuffer.address, lineWidth)
	}
	
	
	
	fun cmdSetDepthBias(commandBuffer: CommandBufferH, depthBiasConstantFactor: Float, depthBiasClamp: Float, depthBiasSlopeFactor: Float) {
		Commands.cmdSetDepthBias(cmdSetDepthBiasAddr, commandBuffer.address, depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor)
	}
	
	
	
	fun cmdSetBlendConstants(commandBuffer: CommandBufferH, blendConstants: DirectFloatBuffer) {
		Commands.cmdSetBlendConstants(cmdSetBlendConstantsAddr, commandBuffer.address, blendConstants.address)
	}
	
	
	
	fun cmdSetDepthBounds(commandBuffer: CommandBufferH, minDepthBounds: Float, maxDepthBounds: Float) {
		Commands.cmdSetDepthBounds(cmdSetDepthBoundsAddr, commandBuffer.address, minDepthBounds, maxDepthBounds)
	}
	
	
	
	fun cmdSetStencilCompareMask(commandBuffer: CommandBufferH, faceMask: StencilFaceFlags, compareMask: Int) {
		Commands.cmdSetStencilCompareMask(cmdSetStencilCompareMaskAddr, commandBuffer.address, faceMask.bitfield, compareMask)
	}
	
	
	
	fun cmdSetStencilWriteMask(commandBuffer: CommandBufferH, faceMask: StencilFaceFlags, writeMask: Int) {
		Commands.cmdSetStencilWriteMask(cmdSetStencilWriteMaskAddr, commandBuffer.address, faceMask.bitfield, writeMask)
	}
	
	
	
	fun cmdSetStencilReference(commandBuffer: CommandBufferH, faceMask: StencilFaceFlags, reference: Int) {
		Commands.cmdSetStencilReference(cmdSetStencilReferenceAddr, commandBuffer.address, faceMask.bitfield, reference)
	}
	
	
	
	fun cmdBindDescriptorSets(commandBuffer: CommandBufferH, pipelineBindPoint: PipelineBindPoint, layout: PipelineLayoutH, firstSet: Int, descriptorSetCount: Int, pDescriptorSets: NativePointerBuffer, dynamicOffsetCount: Int, pDynamicOffsets: DirectIntBuffer) {
		Commands.cmdBindDescriptorSets(cmdBindDescriptorSetsAddr, commandBuffer.address, pipelineBindPoint.id, layout.address, firstSet, descriptorSetCount, pDescriptorSets.address, dynamicOffsetCount, pDynamicOffsets.address)
	}
	
	
	
	fun cmdBindIndexBuffer(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, indexType: IndexType) {
		Commands.cmdBindIndexBuffer(cmdBindIndexBufferAddr, commandBuffer.address, buffer.address, offset, indexType.id)
	}
	
	
	
	fun cmdBindVertexBuffers(commandBuffer: CommandBufferH, firstBinding: Int, bindingCount: Int, pBuffers: NativePointerBuffer, pOffsets: DirectLongBuffer) {
		Commands.cmdBindVertexBuffers(cmdBindVertexBuffersAddr, commandBuffer.address, firstBinding, bindingCount, pBuffers.address, pOffsets.address)
	}
	
	
	
	fun cmdDraw(commandBuffer: CommandBufferH, vertexCount: Int, instanceCount: Int, firstVertex: Int, firstInstance: Int) {
		Commands.cmdDraw(cmdDrawAddr, commandBuffer.address, vertexCount, instanceCount, firstVertex, firstInstance)
	}
	
	
	
	fun cmdDrawIndexed(commandBuffer: CommandBufferH, indexCount: Int, instanceCount: Int, firstIndex: Int, vertexOffset: Int, firstInstance: Int) {
		Commands.cmdDrawIndexed(cmdDrawIndexedAddr, commandBuffer.address, indexCount, instanceCount, firstIndex, vertexOffset, firstInstance)
	}
	
	
	
	fun cmdDrawIndirect(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, drawCount: Int, stride: Int) {
		Commands.cmdDrawIndirect(cmdDrawIndirectAddr, commandBuffer.address, buffer.address, offset, drawCount, stride)
	}
	
	
	
	fun cmdDrawIndexedIndirect(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, drawCount: Int, stride: Int) {
		Commands.cmdDrawIndexedIndirect(cmdDrawIndexedIndirectAddr, commandBuffer.address, buffer.address, offset, drawCount, stride)
	}
	
	
	
	fun cmdDispatch(commandBuffer: CommandBufferH, groupCountX: Int, groupCountY: Int, groupCountZ: Int) {
		Commands.cmdDispatch(cmdDispatchAddr, commandBuffer.address, groupCountX, groupCountY, groupCountZ)
	}
	
	
	
	fun cmdDispatchIndirect(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long) {
		Commands.cmdDispatchIndirect(cmdDispatchIndirectAddr, commandBuffer.address, buffer.address, offset)
	}
	
	
	
	fun cmdCopyBuffer(commandBuffer: CommandBufferH, srcBuffer: BufferH, dstBuffer: BufferH, regionCount: Int, pRegions: BufferCopy.Buffer) {
		Commands.cmdCopyBuffer(cmdCopyBufferAddr, commandBuffer.address, srcBuffer.address, dstBuffer.address, regionCount, pRegions.address)
	}
	
	
	
	fun cmdCopyImage(commandBuffer: CommandBufferH, srcImage: ImageH, srcImageLayout: ImageLayout, dstImage: ImageH, dstImageLayout: ImageLayout, regionCount: Int, pRegions: ImageCopy.Buffer) {
		Commands.cmdCopyImage(cmdCopyImageAddr, commandBuffer.address, srcImage.address, srcImageLayout.id, dstImage.address, dstImageLayout.id, regionCount, pRegions.address)
	}
	
	
	
	fun cmdBlitImage(commandBuffer: CommandBufferH, srcImage: ImageH, srcImageLayout: ImageLayout, dstImage: ImageH, dstImageLayout: ImageLayout, regionCount: Int, pRegions: ImageBlit.Buffer, filter: Filter) {
		Commands.cmdBlitImage(cmdBlitImageAddr, commandBuffer.address, srcImage.address, srcImageLayout.id, dstImage.address, dstImageLayout.id, regionCount, pRegions.address, filter.id)
	}
	
	
	
	fun cmdCopyBufferToImage(commandBuffer: CommandBufferH, srcBuffer: BufferH, dstImage: ImageH, dstImageLayout: ImageLayout, regionCount: Int, pRegions: BufferImageCopy.Buffer) {
		Commands.cmdCopyBufferToImage(cmdCopyBufferToImageAddr, commandBuffer.address, srcBuffer.address, dstImage.address, dstImageLayout.id, regionCount, pRegions.address)
	}
	
	
	
	fun cmdCopyImageToBuffer(commandBuffer: CommandBufferH, srcImage: ImageH, srcImageLayout: ImageLayout, dstBuffer: BufferH, regionCount: Int, pRegions: BufferImageCopy.Buffer) {
		Commands.cmdCopyImageToBuffer(cmdCopyImageToBufferAddr, commandBuffer.address, srcImage.address, srcImageLayout.id, dstBuffer.address, regionCount, pRegions.address)
	}
	
	
	
	fun cmdUpdateBuffer(commandBuffer: CommandBufferH, dstBuffer: BufferH, dstOffset: Long, dataSize: Long, pData: Long) {
		Commands.cmdUpdateBuffer(cmdUpdateBufferAddr, commandBuffer.address, dstBuffer.address, dstOffset, dataSize, pData)
	}
	
	
	
	fun cmdFillBuffer(commandBuffer: CommandBufferH, dstBuffer: BufferH, dstOffset: Long, size: Long, data: Int) {
		Commands.cmdFillBuffer(cmdFillBufferAddr, commandBuffer.address, dstBuffer.address, dstOffset, size, data)
	}
	
	
	
	fun cmdClearColorImage(commandBuffer: CommandBufferH, image: ImageH, imageLayout: ImageLayout, pColor: ClearColorValue, rangeCount: Int, pRanges: ImageSubresourceRange.Buffer) {
		Commands.cmdClearColorImage(cmdClearColorImageAddr, commandBuffer.address, image.address, imageLayout.id, pColor.address, rangeCount, pRanges.address)
	}
	
	
	
	fun cmdClearDepthStencilImage(commandBuffer: CommandBufferH, image: ImageH, imageLayout: ImageLayout, pDepthStencil: ClearDepthStencilValue, rangeCount: Int, pRanges: ImageSubresourceRange.Buffer) {
		Commands.cmdClearDepthStencilImage(cmdClearDepthStencilImageAddr, commandBuffer.address, image.address, imageLayout.id, pDepthStencil.address, rangeCount, pRanges.address)
	}
	
	
	
	fun cmdClearAttachments(commandBuffer: CommandBufferH, attachmentCount: Int, pAttachments: ClearAttachment.Buffer, rectCount: Int, pRects: ClearRect.Buffer) {
		Commands.cmdClearAttachments(cmdClearAttachmentsAddr, commandBuffer.address, attachmentCount, pAttachments.address, rectCount, pRects.address)
	}
	
	
	
	fun cmdResolveImage(commandBuffer: CommandBufferH, srcImage: ImageH, srcImageLayout: ImageLayout, dstImage: ImageH, dstImageLayout: ImageLayout, regionCount: Int, pRegions: ImageResolve.Buffer) {
		Commands.cmdResolveImage(cmdResolveImageAddr, commandBuffer.address, srcImage.address, srcImageLayout.id, dstImage.address, dstImageLayout.id, regionCount, pRegions.address)
	}
	
	
	
	fun cmdSetEvent(commandBuffer: CommandBufferH, event: EventH, stageMask: PipelineStageFlags) {
		Commands.cmdSetEvent(cmdSetEventAddr, commandBuffer.address, event.address, stageMask.bitfield)
	}
	
	
	
	fun cmdResetEvent(commandBuffer: CommandBufferH, event: EventH, stageMask: PipelineStageFlags) {
		Commands.cmdResetEvent(cmdResetEventAddr, commandBuffer.address, event.address, stageMask.bitfield)
	}
	
	
	
	fun cmdWaitEvents(commandBuffer: CommandBufferH, eventCount: Int, pEvents: NativePointerBuffer, srcStageMask: PipelineStageFlags, dstStageMask: PipelineStageFlags, memoryBarrierCount: Int, pMemoryBarriers: MemoryBarrier.Buffer, bufferMemoryBarrierCount: Int, pBufferMemoryBarriers: BufferMemoryBarrier.Buffer, imageMemoryBarrierCount: Int, pImageMemoryBarriers: ImageMemoryBarrier.Buffer) {
		Commands.cmdWaitEvents(cmdWaitEventsAddr, commandBuffer.address, eventCount, pEvents.address, srcStageMask.bitfield, dstStageMask.bitfield, memoryBarrierCount, pMemoryBarriers.address, bufferMemoryBarrierCount, pBufferMemoryBarriers.address, imageMemoryBarrierCount, pImageMemoryBarriers.address)
	}
	
	
	
	fun cmdPipelineBarrier(commandBuffer: CommandBufferH, srcStageMask: PipelineStageFlags, dstStageMask: PipelineStageFlags, dependencyFlags: DependencyFlags, memoryBarrierCount: Int, pMemoryBarriers: MemoryBarrier.Buffer, bufferMemoryBarrierCount: Int, pBufferMemoryBarriers: BufferMemoryBarrier.Buffer, imageMemoryBarrierCount: Int, pImageMemoryBarriers: ImageMemoryBarrier.Buffer) {
		Commands.cmdPipelineBarrier(cmdPipelineBarrierAddr, commandBuffer.address, srcStageMask.bitfield, dstStageMask.bitfield, dependencyFlags.bitfield, memoryBarrierCount, pMemoryBarriers.address, bufferMemoryBarrierCount, pBufferMemoryBarriers.address, imageMemoryBarrierCount, pImageMemoryBarriers.address)
	}
	
	
	
	fun cmdBeginQuery(commandBuffer: CommandBufferH, queryPool: QueryPoolH, query: Int, flags: QueryControlFlags) {
		Commands.cmdBeginQuery(cmdBeginQueryAddr, commandBuffer.address, queryPool.address, query, flags.bitfield)
	}
	
	
	
	fun cmdEndQuery(commandBuffer: CommandBufferH, queryPool: QueryPoolH, query: Int) {
		Commands.cmdEndQuery(cmdEndQueryAddr, commandBuffer.address, queryPool.address, query)
	}
	
	
	
	fun cmdResetQueryPool(commandBuffer: CommandBufferH, queryPool: QueryPoolH, firstQuery: Int, queryCount: Int) {
		Commands.cmdResetQueryPool(cmdResetQueryPoolAddr, commandBuffer.address, queryPool.address, firstQuery, queryCount)
	}
	
	
	
	fun cmdWriteTimestamp(commandBuffer: CommandBufferH, pipelineStage: PipelineStageFlags, queryPool: QueryPoolH, query: Int) {
		Commands.cmdWriteTimestamp(cmdWriteTimestampAddr, commandBuffer.address, pipelineStage.bitfield, queryPool.address, query)
	}
	
	
	
	fun cmdCopyQueryPoolResults(commandBuffer: CommandBufferH, queryPool: QueryPoolH, firstQuery: Int, queryCount: Int, dstBuffer: BufferH, dstOffset: Long, stride: Long, flags: QueryResultFlags) {
		Commands.cmdCopyQueryPoolResults(cmdCopyQueryPoolResultsAddr, commandBuffer.address, queryPool.address, firstQuery, queryCount, dstBuffer.address, dstOffset, stride, flags.bitfield)
	}
	
	
	
	fun cmdPushConstants(commandBuffer: CommandBufferH, layout: PipelineLayoutH, stageFlags: ShaderStageFlags, offset: Int, size: Int, pValues: Long) {
		Commands.cmdPushConstants(cmdPushConstantsAddr, commandBuffer.address, layout.address, stageFlags.bitfield, offset, size, pValues)
	}
	
	
	
	fun cmdBeginRenderPass(commandBuffer: CommandBufferH, pRenderPassBegin: RenderPassBeginInfo, contents: SubpassContents) {
		Commands.cmdBeginRenderPass(cmdBeginRenderPassAddr, commandBuffer.address, pRenderPassBegin.address, contents.id)
	}
	
	
	
	fun cmdNextSubpass(commandBuffer: CommandBufferH, contents: SubpassContents) {
		Commands.cmdNextSubpass(cmdNextSubpassAddr, commandBuffer.address, contents.id)
	}
	
	
	
	fun cmdEndRenderPass(commandBuffer: CommandBufferH) {
		Commands.cmdEndRenderPass(cmdEndRenderPassAddr, commandBuffer.address)
	}
	
	
	
	fun cmdExecuteCommands(commandBuffer: CommandBufferH, commandBufferCount: Int, pCommandBuffers: NativePointerBuffer) {
		Commands.cmdExecuteCommands(cmdExecuteCommandsAddr, commandBuffer.address, commandBufferCount, pCommandBuffers.address)
	}
	
	
	
	fun bindBufferMemory2(bindInfoCount: Int, pBindInfos: BindBufferMemoryInfo.Buffer): Result {
		return Result(Commands.bindBufferMemory2(bindBufferMemory2Addr, device.address, bindInfoCount, pBindInfos.address))
	}
	
	
	
	fun bindImageMemory2(bindInfoCount: Int, pBindInfos: BindImageMemoryInfo.Buffer): Result {
		return Result(Commands.bindImageMemory2(bindImageMemory2Addr, device.address, bindInfoCount, pBindInfos.address))
	}
	
	
	
	fun getDeviceGroupPeerMemoryFeatures(heapIndex: Int, localDeviceIndex: Int, remoteDeviceIndex: Int, pPeerMemoryFeatures: Long) {
		Commands.getDeviceGroupPeerMemoryFeatures(getDeviceGroupPeerMemoryFeaturesAddr, device.address, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures)
	}
	
	
	
	fun cmdSetDeviceMask(commandBuffer: CommandBufferH, deviceMask: Int) {
		Commands.cmdSetDeviceMask(cmdSetDeviceMaskAddr, commandBuffer.address, deviceMask)
	}
	
	
	
	fun cmdDispatchBase(commandBuffer: CommandBufferH, baseGroupX: Int, baseGroupY: Int, baseGroupZ: Int, groupCountX: Int, groupCountY: Int, groupCountZ: Int) {
		Commands.cmdDispatchBase(cmdDispatchBaseAddr, commandBuffer.address, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ)
	}
	
	
	
	fun getImageMemoryRequirements2(pInfo: ImageMemoryRequirementsInfo2, pMemoryRequirements: MemoryRequirements2) {
		Commands.getImageMemoryRequirements2(getImageMemoryRequirements2Addr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	
	
	fun getBufferMemoryRequirements2(pInfo: BufferMemoryRequirementsInfo2, pMemoryRequirements: MemoryRequirements2) {
		Commands.getBufferMemoryRequirements2(getBufferMemoryRequirements2Addr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	
	
	fun getImageSparseMemoryRequirements2(pInfo: ImageSparseMemoryRequirementsInfo2, pSparseMemoryRequirementCount: DirectInt, pSparseMemoryRequirements: SparseImageMemoryRequirements2.Buffer?) {
		Commands.getImageSparseMemoryRequirements2(getImageSparseMemoryRequirements2Addr, device.address, pInfo.address, pSparseMemoryRequirementCount.address, pSparseMemoryRequirements.addressOrNULL)
	}
	
	
	
	fun trimCommandPool(commandPool: CommandPoolH, flags: CommandPoolTrimFlags) {
		Commands.trimCommandPool(trimCommandPoolAddr, device.address, commandPool.address, flags.bitfield)
	}
	
	
	
	fun getDeviceQueue2(pQueueInfo: DeviceQueueInfo2, pQueue: NativePointer) {
		Commands.getDeviceQueue2(getDeviceQueue2Addr, device.address, pQueueInfo.address, pQueue.address)
	}
	
	
	
	fun createSamplerYcbcrConversion(pCreateInfo: SamplerYcbcrConversionCreateInfo, pAllocator: AllocationCallbacks?, pYcbcrConversion: NativePointer): Result {
		return Result(Commands.createSamplerYcbcrConversion(createSamplerYcbcrConversionAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pYcbcrConversion.address))
	}
	
	
	
	fun destroySamplerYcbcrConversion(ycbcrConversion: SamplerYcbcrConversionH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySamplerYcbcrConversion(destroySamplerYcbcrConversionAddr, device.address, ycbcrConversion.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createDescriptorUpdateTemplate(pCreateInfo: DescriptorUpdateTemplateCreateInfo, pAllocator: AllocationCallbacks?, pDescriptorUpdateTemplate: NativePointer): Result {
		return Result(Commands.createDescriptorUpdateTemplate(createDescriptorUpdateTemplateAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pDescriptorUpdateTemplate.address))
	}
	
	
	
	fun destroyDescriptorUpdateTemplate(descriptorUpdateTemplate: DescriptorUpdateTemplateH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDescriptorUpdateTemplate(destroyDescriptorUpdateTemplateAddr, device.address, descriptorUpdateTemplate.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun updateDescriptorSetWithTemplate(descriptorSet: DescriptorSetH, descriptorUpdateTemplate: DescriptorUpdateTemplateH, pData: Long) {
		Commands.updateDescriptorSetWithTemplate(updateDescriptorSetWithTemplateAddr, device.address, descriptorSet.address, descriptorUpdateTemplate.address, pData)
	}
	
	
	
	fun getDescriptorSetLayoutSupport(pCreateInfo: DescriptorSetLayoutCreateInfo, pSupport: DescriptorSetLayoutSupport) {
		Commands.getDescriptorSetLayoutSupport(getDescriptorSetLayoutSupportAddr, device.address, pCreateInfo.address, pSupport.address)
	}
	
	
	
	fun cmdDrawIndirectCount(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, countBuffer: BufferH, countBufferOffset: Long, maxDrawCount: Int, stride: Int) {
		Commands.cmdDrawIndirectCount(cmdDrawIndirectCountAddr, commandBuffer.address, buffer.address, offset, countBuffer.address, countBufferOffset, maxDrawCount, stride)
	}
	
	
	
	fun cmdDrawIndexedIndirectCount(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, countBuffer: BufferH, countBufferOffset: Long, maxDrawCount: Int, stride: Int) {
		Commands.cmdDrawIndexedIndirectCount(cmdDrawIndexedIndirectCountAddr, commandBuffer.address, buffer.address, offset, countBuffer.address, countBufferOffset, maxDrawCount, stride)
	}
	
	
	
	fun createRenderPass2(pCreateInfo: RenderPassCreateInfo2, pAllocator: AllocationCallbacks?, pRenderPass: NativePointer): Result {
		return Result(Commands.createRenderPass2(createRenderPass2Addr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pRenderPass.address))
	}
	
	
	
	fun cmdBeginRenderPass2(commandBuffer: CommandBufferH, pRenderPassBegin: RenderPassBeginInfo, pSubpassBeginInfo: SubpassBeginInfo) {
		Commands.cmdBeginRenderPass2(cmdBeginRenderPass2Addr, commandBuffer.address, pRenderPassBegin.address, pSubpassBeginInfo.address)
	}
	
	
	
	fun cmdNextSubpass2(commandBuffer: CommandBufferH, pSubpassBeginInfo: SubpassBeginInfo, pSubpassEndInfo: SubpassEndInfo) {
		Commands.cmdNextSubpass2(cmdNextSubpass2Addr, commandBuffer.address, pSubpassBeginInfo.address, pSubpassEndInfo.address)
	}
	
	
	
	fun cmdEndRenderPass2(commandBuffer: CommandBufferH, pSubpassEndInfo: SubpassEndInfo) {
		Commands.cmdEndRenderPass2(cmdEndRenderPass2Addr, commandBuffer.address, pSubpassEndInfo.address)
	}
	
	
	
	fun resetQueryPool(queryPool: QueryPoolH, firstQuery: Int, queryCount: Int) {
		Commands.resetQueryPool(resetQueryPoolAddr, device.address, queryPool.address, firstQuery, queryCount)
	}
	
	
	
	fun getSemaphoreCounterValue(semaphore: SemaphoreH, pValue: DirectLong): Result {
		return Result(Commands.getSemaphoreCounterValue(getSemaphoreCounterValueAddr, device.address, semaphore.address, pValue.address))
	}
	
	
	
	fun waitSemaphores(pWaitInfo: SemaphoreWaitInfo, timeout: Long): Result {
		return Result(Commands.waitSemaphores(waitSemaphoresAddr, device.address, pWaitInfo.address, timeout))
	}
	
	
	
	fun signalSemaphore(pSignalInfo: SemaphoreSignalInfo): Result {
		return Result(Commands.signalSemaphore(signalSemaphoreAddr, device.address, pSignalInfo.address))
	}
	
	
	
	fun getBufferDeviceAddress(pInfo: BufferDeviceAddressInfo): Long {
		return Commands.getBufferDeviceAddress(getBufferDeviceAddressAddr, device.address, pInfo.address)
	}
	
	
	
	fun getBufferOpaqueCaptureAddress(pInfo: BufferDeviceAddressInfo): Long {
		return Commands.getBufferOpaqueCaptureAddress(getBufferOpaqueCaptureAddressAddr, device.address, pInfo.address)
	}
	
	
	
	fun getDeviceMemoryOpaqueCaptureAddress(pInfo: DeviceMemoryOpaqueCaptureAddressInfo): Long {
		return Commands.getDeviceMemoryOpaqueCaptureAddress(getDeviceMemoryOpaqueCaptureAddressAddr, device.address, pInfo.address)
	}
	
	
	
	fun createSwapchainKHR(pCreateInfo: SwapchainCreateInfoKHR, pAllocator: AllocationCallbacks?, pSwapchain: NativePointer): Result {
		return Result(Commands.createSwapchainKHR(createSwapchainKHRAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSwapchain.address))
	}
	
	
	
	fun destroySwapchainKHR(swapchain: SwapchainH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySwapchainKHR(destroySwapchainKHRAddr, device.address, swapchain.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getSwapchainImagesKHR(swapchain: SwapchainH, pSwapchainImageCount: DirectInt, pSwapchainImages: NativePointerBuffer?): Result {
		return Result(Commands.getSwapchainImagesKHR(getSwapchainImagesKHRAddr, device.address, swapchain.address, pSwapchainImageCount.address, pSwapchainImages.addressOrNULL))
	}
	
	
	
	fun acquireNextImageKHR(swapchain: SwapchainH, timeout: Long, semaphore: SemaphoreH?, fence: FenceH?, pImageIndex: DirectInt): Result {
		return Result(Commands.acquireNextImageKHR(acquireNextImageKHRAddr, device.address, swapchain.address, timeout, semaphore.addressOrNULL, fence.addressOrNULL, pImageIndex.address))
	}
	
	
	
	fun queuePresentKHR(queue: QueueH, pPresentInfo: PresentInfoKHR): Result {
		return Result(Commands.queuePresentKHR(queuePresentKHRAddr, queue.address, pPresentInfo.address))
	}
	
	
	
	fun getDeviceGroupPresentCapabilitiesKHR(pDeviceGroupPresentCapabilities: DeviceGroupPresentCapabilitiesKHR): Result {
		return Result(Commands.getDeviceGroupPresentCapabilitiesKHR(getDeviceGroupPresentCapabilitiesKHRAddr, device.address, pDeviceGroupPresentCapabilities.address))
	}
	
	
	
	fun getDeviceGroupSurfacePresentModesKHR(surface: SurfaceH, pModes: Long): Result {
		return Result(Commands.getDeviceGroupSurfacePresentModesKHR(getDeviceGroupSurfacePresentModesKHRAddr, device.address, surface.address, pModes))
	}
	
	
	
	fun acquireNextImage2KHR(pAcquireInfo: AcquireNextImageInfoKHR, pImageIndex: DirectInt): Result {
		return Result(Commands.acquireNextImage2KHR(acquireNextImage2KHRAddr, device.address, pAcquireInfo.address, pImageIndex.address))
	}
	
	
	
	fun createSharedSwapchainsKHR(swapchainCount: Int, pCreateInfos: SwapchainCreateInfoKHR.Buffer, pAllocator: AllocationCallbacks?, pSwapchains: NativePointerBuffer): Result {
		return Result(Commands.createSharedSwapchainsKHR(createSharedSwapchainsKHRAddr, device.address, swapchainCount, pCreateInfos.address, pAllocator.addressOrNULL, pSwapchains.address))
	}
	
	
	
	fun debugMarkerSetObjectTagEXT(pTagInfo: DebugMarkerObjectTagInfoEXT): Result {
		return Result(Commands.debugMarkerSetObjectTagEXT(debugMarkerSetObjectTagEXTAddr, device.address, pTagInfo.address))
	}
	
	
	
	fun debugMarkerSetObjectNameEXT(pNameInfo: DebugMarkerObjectNameInfoEXT): Result {
		return Result(Commands.debugMarkerSetObjectNameEXT(debugMarkerSetObjectNameEXTAddr, device.address, pNameInfo.address))
	}
	
	
	
	fun cmdDebugMarkerBeginEXT(commandBuffer: CommandBufferH, pMarkerInfo: DebugMarkerMarkerInfoEXT) {
		Commands.cmdDebugMarkerBeginEXT(cmdDebugMarkerBeginEXTAddr, commandBuffer.address, pMarkerInfo.address)
	}
	
	
	
	fun cmdDebugMarkerEndEXT(commandBuffer: CommandBufferH) {
		Commands.cmdDebugMarkerEndEXT(cmdDebugMarkerEndEXTAddr, commandBuffer.address)
	}
	
	
	
	fun cmdDebugMarkerInsertEXT(commandBuffer: CommandBufferH, pMarkerInfo: DebugMarkerMarkerInfoEXT) {
		Commands.cmdDebugMarkerInsertEXT(cmdDebugMarkerInsertEXTAddr, commandBuffer.address, pMarkerInfo.address)
	}
	
	
	
	fun cmdBindTransformFeedbackBuffersEXT(commandBuffer: CommandBufferH, firstBinding: Int, bindingCount: Int, pBuffers: NativePointerBuffer, pOffsets: DirectLongBuffer, pSizes: DirectLongBuffer?) {
		Commands.cmdBindTransformFeedbackBuffersEXT(cmdBindTransformFeedbackBuffersEXTAddr, commandBuffer.address, firstBinding, bindingCount, pBuffers.address, pOffsets.address, pSizes.addressOrNULL)
	}
	
	
	
	fun cmdBeginTransformFeedbackEXT(commandBuffer: CommandBufferH, firstCounterBuffer: Int, counterBufferCount: Int, pCounterBuffers: NativePointerBuffer, pCounterBufferOffsets: DirectLongBuffer?) {
		Commands.cmdBeginTransformFeedbackEXT(cmdBeginTransformFeedbackEXTAddr, commandBuffer.address, firstCounterBuffer, counterBufferCount, pCounterBuffers.address, pCounterBufferOffsets.addressOrNULL)
	}
	
	
	
	fun cmdEndTransformFeedbackEXT(commandBuffer: CommandBufferH, firstCounterBuffer: Int, counterBufferCount: Int, pCounterBuffers: NativePointerBuffer, pCounterBufferOffsets: DirectLongBuffer?) {
		Commands.cmdEndTransformFeedbackEXT(cmdEndTransformFeedbackEXTAddr, commandBuffer.address, firstCounterBuffer, counterBufferCount, pCounterBuffers.address, pCounterBufferOffsets.addressOrNULL)
	}
	
	
	
	fun cmdBeginQueryIndexedEXT(commandBuffer: CommandBufferH, queryPool: QueryPoolH, query: Int, flags: QueryControlFlags, index: Int) {
		Commands.cmdBeginQueryIndexedEXT(cmdBeginQueryIndexedEXTAddr, commandBuffer.address, queryPool.address, query, flags.bitfield, index)
	}
	
	
	
	fun cmdEndQueryIndexedEXT(commandBuffer: CommandBufferH, queryPool: QueryPoolH, query: Int, index: Int) {
		Commands.cmdEndQueryIndexedEXT(cmdEndQueryIndexedEXTAddr, commandBuffer.address, queryPool.address, query, index)
	}
	
	
	
	fun cmdDrawIndirectByteCountEXT(commandBuffer: CommandBufferH, instanceCount: Int, firstInstance: Int, counterBuffer: BufferH, counterBufferOffset: Long, counterOffset: Int, vertexStride: Int) {
		Commands.cmdDrawIndirectByteCountEXT(cmdDrawIndirectByteCountEXTAddr, commandBuffer.address, instanceCount, firstInstance, counterBuffer.address, counterBufferOffset, counterOffset, vertexStride)
	}
	
	
	
	fun getImageViewHandleNVX(pInfo: ImageViewHandleInfoNVX): Int {
		return Commands.getImageViewHandleNVX(getImageViewHandleNVXAddr, device.address, pInfo.address)
	}
	
	
	
	fun getImageViewAddressNVX(imageView: ImageViewH, pProperties: ImageViewAddressPropertiesNVX): Result {
		return Result(Commands.getImageViewAddressNVX(getImageViewAddressNVXAddr, device.address, imageView.address, pProperties.address))
	}
	
	
	
	fun cmdDrawIndirectCountAMD(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, countBuffer: BufferH, countBufferOffset: Long, maxDrawCount: Int, stride: Int) {
		Commands.cmdDrawIndirectCountAMD(cmdDrawIndirectCountAMDAddr, commandBuffer.address, buffer.address, offset, countBuffer.address, countBufferOffset, maxDrawCount, stride)
	}
	
	
	
	fun cmdDrawIndexedIndirectCountAMD(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, countBuffer: BufferH, countBufferOffset: Long, maxDrawCount: Int, stride: Int) {
		Commands.cmdDrawIndexedIndirectCountAMD(cmdDrawIndexedIndirectCountAMDAddr, commandBuffer.address, buffer.address, offset, countBuffer.address, countBufferOffset, maxDrawCount, stride)
	}
	
	
	
	fun getShaderInfoAMD(pipeline: PipelineH, shaderStage: ShaderStageFlags, infoType: ShaderInfoType, pInfoSize: NativeSizeT, pInfo: Long): Result {
		return Result(Commands.getShaderInfoAMD(getShaderInfoAMDAddr, device.address, pipeline.address, shaderStage.bitfield, infoType.id, pInfoSize.address, pInfo))
	}
	
	
	
	fun getMemoryWin32HandleNV(memory: DeviceMemoryH, handleType: ExternalMemoryHandleTypeFlags, pHandle: Long): Result {
		return Result(Commands.getMemoryWin32HandleNV(getMemoryWin32HandleNVAddr, device.address, memory.address, handleType.bitfield, pHandle))
	}
	
	
	
	fun getDeviceGroupPeerMemoryFeaturesKHR(heapIndex: Int, localDeviceIndex: Int, remoteDeviceIndex: Int, pPeerMemoryFeatures: Long) {
		Commands.getDeviceGroupPeerMemoryFeaturesKHR(getDeviceGroupPeerMemoryFeaturesKHRAddr, device.address, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures)
	}
	
	
	
	fun cmdSetDeviceMaskKHR(commandBuffer: CommandBufferH, deviceMask: Int) {
		Commands.cmdSetDeviceMaskKHR(cmdSetDeviceMaskKHRAddr, commandBuffer.address, deviceMask)
	}
	
	
	
	fun cmdDispatchBaseKHR(commandBuffer: CommandBufferH, baseGroupX: Int, baseGroupY: Int, baseGroupZ: Int, groupCountX: Int, groupCountY: Int, groupCountZ: Int) {
		Commands.cmdDispatchBaseKHR(cmdDispatchBaseKHRAddr, commandBuffer.address, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ)
	}
	
	
	
	fun trimCommandPoolKHR(commandPool: CommandPoolH, flags: CommandPoolTrimFlags) {
		Commands.trimCommandPoolKHR(trimCommandPoolKHRAddr, device.address, commandPool.address, flags.bitfield)
	}
	
	
	
	fun getMemoryWin32HandleKHR(pGetWin32HandleInfo: MemoryGetWin32HandleInfoKHR, pHandle: Long): Result {
		return Result(Commands.getMemoryWin32HandleKHR(getMemoryWin32HandleKHRAddr, device.address, pGetWin32HandleInfo.address, pHandle))
	}
	
	
	
	fun getMemoryWin32HandlePropertiesKHR(handleType: ExternalMemoryHandleTypeFlags, handle: Long, pMemoryWin32HandleProperties: MemoryWin32HandlePropertiesKHR): Result {
		return Result(Commands.getMemoryWin32HandlePropertiesKHR(getMemoryWin32HandlePropertiesKHRAddr, device.address, handleType.bitfield, handle, pMemoryWin32HandleProperties.address))
	}
	
	
	
	fun getMemoryFdKHR(pGetFdInfo: MemoryGetFdInfoKHR, pFd: DirectInt): Result {
		return Result(Commands.getMemoryFdKHR(getMemoryFdKHRAddr, device.address, pGetFdInfo.address, pFd.address))
	}
	
	
	
	fun getMemoryFdPropertiesKHR(handleType: ExternalMemoryHandleTypeFlags, fd: Int, pMemoryFdProperties: MemoryFdPropertiesKHR): Result {
		return Result(Commands.getMemoryFdPropertiesKHR(getMemoryFdPropertiesKHRAddr, device.address, handleType.bitfield, fd, pMemoryFdProperties.address))
	}
	
	
	
	fun importSemaphoreWin32HandleKHR(pImportSemaphoreWin32HandleInfo: ImportSemaphoreWin32HandleInfoKHR): Result {
		return Result(Commands.importSemaphoreWin32HandleKHR(importSemaphoreWin32HandleKHRAddr, device.address, pImportSemaphoreWin32HandleInfo.address))
	}
	
	
	
	fun getSemaphoreWin32HandleKHR(pGetWin32HandleInfo: SemaphoreGetWin32HandleInfoKHR, pHandle: Long): Result {
		return Result(Commands.getSemaphoreWin32HandleKHR(getSemaphoreWin32HandleKHRAddr, device.address, pGetWin32HandleInfo.address, pHandle))
	}
	
	
	
	fun importSemaphoreFdKHR(pImportSemaphoreFdInfo: ImportSemaphoreFdInfoKHR): Result {
		return Result(Commands.importSemaphoreFdKHR(importSemaphoreFdKHRAddr, device.address, pImportSemaphoreFdInfo.address))
	}
	
	
	
	fun getSemaphoreFdKHR(pGetFdInfo: SemaphoreGetFdInfoKHR, pFd: DirectInt): Result {
		return Result(Commands.getSemaphoreFdKHR(getSemaphoreFdKHRAddr, device.address, pGetFdInfo.address, pFd.address))
	}
	
	
	
	fun cmdPushDescriptorSetKHR(commandBuffer: CommandBufferH, pipelineBindPoint: PipelineBindPoint, layout: PipelineLayoutH, set: Int, descriptorWriteCount: Int, pDescriptorWrites: WriteDescriptorSet.Buffer) {
		Commands.cmdPushDescriptorSetKHR(cmdPushDescriptorSetKHRAddr, commandBuffer.address, pipelineBindPoint.id, layout.address, set, descriptorWriteCount, pDescriptorWrites.address)
	}
	
	
	
	fun cmdPushDescriptorSetWithTemplateKHR(commandBuffer: CommandBufferH, descriptorUpdateTemplate: DescriptorUpdateTemplateH, layout: PipelineLayoutH, set: Int, pData: Long) {
		Commands.cmdPushDescriptorSetWithTemplateKHR(cmdPushDescriptorSetWithTemplateKHRAddr, commandBuffer.address, descriptorUpdateTemplate.address, layout.address, set, pData)
	}
	
	
	
	fun cmdBeginConditionalRenderingEXT(commandBuffer: CommandBufferH, pConditionalRenderingBegin: ConditionalRenderingBeginInfoEXT) {
		Commands.cmdBeginConditionalRenderingEXT(cmdBeginConditionalRenderingEXTAddr, commandBuffer.address, pConditionalRenderingBegin.address)
	}
	
	
	
	fun cmdEndConditionalRenderingEXT(commandBuffer: CommandBufferH) {
		Commands.cmdEndConditionalRenderingEXT(cmdEndConditionalRenderingEXTAddr, commandBuffer.address)
	}
	
	
	
	fun createDescriptorUpdateTemplateKHR(pCreateInfo: DescriptorUpdateTemplateCreateInfo, pAllocator: AllocationCallbacks?, pDescriptorUpdateTemplate: NativePointer): Result {
		return Result(Commands.createDescriptorUpdateTemplateKHR(createDescriptorUpdateTemplateKHRAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pDescriptorUpdateTemplate.address))
	}
	
	
	
	fun destroyDescriptorUpdateTemplateKHR(descriptorUpdateTemplate: DescriptorUpdateTemplateH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDescriptorUpdateTemplateKHR(destroyDescriptorUpdateTemplateKHRAddr, device.address, descriptorUpdateTemplate.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun updateDescriptorSetWithTemplateKHR(descriptorSet: DescriptorSetH, descriptorUpdateTemplate: DescriptorUpdateTemplateH, pData: Long) {
		Commands.updateDescriptorSetWithTemplateKHR(updateDescriptorSetWithTemplateKHRAddr, device.address, descriptorSet.address, descriptorUpdateTemplate.address, pData)
	}
	
	
	
	fun cmdSetViewportWScalingNV(commandBuffer: CommandBufferH, firstViewport: Int, viewportCount: Int, pViewportWScalings: ViewportWScalingNV.Buffer) {
		Commands.cmdSetViewportWScalingNV(cmdSetViewportWScalingNVAddr, commandBuffer.address, firstViewport, viewportCount, pViewportWScalings.address)
	}
	
	
	
	fun displayPowerControlEXT(display: DisplayH, pDisplayPowerInfo: DisplayPowerInfoEXT): Result {
		return Result(Commands.displayPowerControlEXT(displayPowerControlEXTAddr, device.address, display.address, pDisplayPowerInfo.address))
	}
	
	
	
	fun registerDeviceEventEXT(pDeviceEventInfo: DeviceEventInfoEXT, pAllocator: AllocationCallbacks?, pFence: NativePointer): Result {
		return Result(Commands.registerDeviceEventEXT(registerDeviceEventEXTAddr, device.address, pDeviceEventInfo.address, pAllocator.addressOrNULL, pFence.address))
	}
	
	
	
	fun registerDisplayEventEXT(display: DisplayH, pDisplayEventInfo: DisplayEventInfoEXT, pAllocator: AllocationCallbacks?, pFence: NativePointer): Result {
		return Result(Commands.registerDisplayEventEXT(registerDisplayEventEXTAddr, device.address, display.address, pDisplayEventInfo.address, pAllocator.addressOrNULL, pFence.address))
	}
	
	
	
	fun getSwapchainCounterEXT(swapchain: SwapchainH, counter: SurfaceCounterFlags, pCounterValue: DirectLong): Result {
		return Result(Commands.getSwapchainCounterEXT(getSwapchainCounterEXTAddr, device.address, swapchain.address, counter.bitfield, pCounterValue.address))
	}
	
	
	
	fun getRefreshCycleDurationGOOGLE(swapchain: SwapchainH, pDisplayTimingProperties: RefreshCycleDurationGOOGLE): Result {
		return Result(Commands.getRefreshCycleDurationGOOGLE(getRefreshCycleDurationGOOGLEAddr, device.address, swapchain.address, pDisplayTimingProperties.address))
	}
	
	
	
	fun getPastPresentationTimingGOOGLE(swapchain: SwapchainH, pPresentationTimingCount: DirectInt, pPresentationTimings: PastPresentationTimingGOOGLE.Buffer?): Result {
		return Result(Commands.getPastPresentationTimingGOOGLE(getPastPresentationTimingGOOGLEAddr, device.address, swapchain.address, pPresentationTimingCount.address, pPresentationTimings.addressOrNULL))
	}
	
	
	
	fun cmdSetDiscardRectangleEXT(commandBuffer: CommandBufferH, firstDiscardRectangle: Int, discardRectangleCount: Int, pDiscardRectangles: Rect2D.Buffer) {
		Commands.cmdSetDiscardRectangleEXT(cmdSetDiscardRectangleEXTAddr, commandBuffer.address, firstDiscardRectangle, discardRectangleCount, pDiscardRectangles.address)
	}
	
	
	
	fun setHdrMetadataEXT(swapchainCount: Int, pSwapchains: NativePointerBuffer, pMetadata: HdrMetadataEXT.Buffer) {
		Commands.setHdrMetadataEXT(setHdrMetadataEXTAddr, device.address, swapchainCount, pSwapchains.address, pMetadata.address)
	}
	
	
	
	fun createRenderPass2KHR(pCreateInfo: RenderPassCreateInfo2, pAllocator: AllocationCallbacks?, pRenderPass: NativePointer): Result {
		return Result(Commands.createRenderPass2KHR(createRenderPass2KHRAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pRenderPass.address))
	}
	
	
	
	fun cmdBeginRenderPass2KHR(commandBuffer: CommandBufferH, pRenderPassBegin: RenderPassBeginInfo, pSubpassBeginInfo: SubpassBeginInfo) {
		Commands.cmdBeginRenderPass2KHR(cmdBeginRenderPass2KHRAddr, commandBuffer.address, pRenderPassBegin.address, pSubpassBeginInfo.address)
	}
	
	
	
	fun cmdNextSubpass2KHR(commandBuffer: CommandBufferH, pSubpassBeginInfo: SubpassBeginInfo, pSubpassEndInfo: SubpassEndInfo) {
		Commands.cmdNextSubpass2KHR(cmdNextSubpass2KHRAddr, commandBuffer.address, pSubpassBeginInfo.address, pSubpassEndInfo.address)
	}
	
	
	
	fun cmdEndRenderPass2KHR(commandBuffer: CommandBufferH, pSubpassEndInfo: SubpassEndInfo) {
		Commands.cmdEndRenderPass2KHR(cmdEndRenderPass2KHRAddr, commandBuffer.address, pSubpassEndInfo.address)
	}
	
	
	
	fun getSwapchainStatusKHR(swapchain: SwapchainH): Result {
		return Result(Commands.getSwapchainStatusKHR(getSwapchainStatusKHRAddr, device.address, swapchain.address))
	}
	
	
	
	fun importFenceWin32HandleKHR(pImportFenceWin32HandleInfo: ImportFenceWin32HandleInfoKHR): Result {
		return Result(Commands.importFenceWin32HandleKHR(importFenceWin32HandleKHRAddr, device.address, pImportFenceWin32HandleInfo.address))
	}
	
	
	
	fun getFenceWin32HandleKHR(pGetWin32HandleInfo: FenceGetWin32HandleInfoKHR, pHandle: Long): Result {
		return Result(Commands.getFenceWin32HandleKHR(getFenceWin32HandleKHRAddr, device.address, pGetWin32HandleInfo.address, pHandle))
	}
	
	
	
	fun importFenceFdKHR(pImportFenceFdInfo: ImportFenceFdInfoKHR): Result {
		return Result(Commands.importFenceFdKHR(importFenceFdKHRAddr, device.address, pImportFenceFdInfo.address))
	}
	
	
	
	fun getFenceFdKHR(pGetFdInfo: FenceGetFdInfoKHR, pFd: DirectInt): Result {
		return Result(Commands.getFenceFdKHR(getFenceFdKHRAddr, device.address, pGetFdInfo.address, pFd.address))
	}
	
	
	
	fun acquireProfilingLockKHR(pInfo: AcquireProfilingLockInfoKHR): Result {
		return Result(Commands.acquireProfilingLockKHR(acquireProfilingLockKHRAddr, device.address, pInfo.address))
	}
	
	
	
	fun releaseProfilingLockKHR() {
		Commands.releaseProfilingLockKHR(releaseProfilingLockKHRAddr, device.address)
	}
	
	
	
	fun setDebugUtilsObjectNameEXT(pNameInfo: DebugUtilsObjectNameInfoEXT): Result {
		return Result(Commands.setDebugUtilsObjectNameEXT(setDebugUtilsObjectNameEXTAddr, device.address, pNameInfo.address))
	}
	
	
	
	fun setDebugUtilsObjectTagEXT(pTagInfo: DebugUtilsObjectTagInfoEXT): Result {
		return Result(Commands.setDebugUtilsObjectTagEXT(setDebugUtilsObjectTagEXTAddr, device.address, pTagInfo.address))
	}
	
	
	
	fun queueBeginDebugUtilsLabelEXT(queue: QueueH, pLabelInfo: DebugUtilsLabelEXT) {
		Commands.queueBeginDebugUtilsLabelEXT(queueBeginDebugUtilsLabelEXTAddr, queue.address, pLabelInfo.address)
	}
	
	
	
	fun queueEndDebugUtilsLabelEXT(queue: QueueH) {
		Commands.queueEndDebugUtilsLabelEXT(queueEndDebugUtilsLabelEXTAddr, queue.address)
	}
	
	
	
	fun queueInsertDebugUtilsLabelEXT(queue: QueueH, pLabelInfo: DebugUtilsLabelEXT) {
		Commands.queueInsertDebugUtilsLabelEXT(queueInsertDebugUtilsLabelEXTAddr, queue.address, pLabelInfo.address)
	}
	
	
	
	fun cmdBeginDebugUtilsLabelEXT(commandBuffer: CommandBufferH, pLabelInfo: DebugUtilsLabelEXT) {
		Commands.cmdBeginDebugUtilsLabelEXT(cmdBeginDebugUtilsLabelEXTAddr, commandBuffer.address, pLabelInfo.address)
	}
	
	
	
	fun cmdEndDebugUtilsLabelEXT(commandBuffer: CommandBufferH) {
		Commands.cmdEndDebugUtilsLabelEXT(cmdEndDebugUtilsLabelEXTAddr, commandBuffer.address)
	}
	
	
	
	fun cmdInsertDebugUtilsLabelEXT(commandBuffer: CommandBufferH, pLabelInfo: DebugUtilsLabelEXT) {
		Commands.cmdInsertDebugUtilsLabelEXT(cmdInsertDebugUtilsLabelEXTAddr, commandBuffer.address, pLabelInfo.address)
	}
	
	
	
	fun getAndroidHardwareBufferPropertiesANDROID(buffer: Long, pProperties: AndroidHardwareBufferPropertiesANDROID): Result {
		return Result(Commands.getAndroidHardwareBufferPropertiesANDROID(getAndroidHardwareBufferPropertiesANDROIDAddr, device.address, buffer, pProperties.address))
	}
	
	
	
	fun getMemoryAndroidHardwareBufferANDROID(pInfo: MemoryGetAndroidHardwareBufferInfoANDROID, pBuffer: Long): Result {
		return Result(Commands.getMemoryAndroidHardwareBufferANDROID(getMemoryAndroidHardwareBufferANDROIDAddr, device.address, pInfo.address, pBuffer))
	}
	
	
	
	fun cmdSetSampleLocationsEXT(commandBuffer: CommandBufferH, pSampleLocationsInfo: SampleLocationsInfoEXT) {
		Commands.cmdSetSampleLocationsEXT(cmdSetSampleLocationsEXTAddr, commandBuffer.address, pSampleLocationsInfo.address)
	}
	
	
	
	fun getImageMemoryRequirements2KHR(pInfo: ImageMemoryRequirementsInfo2, pMemoryRequirements: MemoryRequirements2) {
		Commands.getImageMemoryRequirements2KHR(getImageMemoryRequirements2KHRAddr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	
	
	fun getBufferMemoryRequirements2KHR(pInfo: BufferMemoryRequirementsInfo2, pMemoryRequirements: MemoryRequirements2) {
		Commands.getBufferMemoryRequirements2KHR(getBufferMemoryRequirements2KHRAddr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	
	
	fun getImageSparseMemoryRequirements2KHR(pInfo: ImageSparseMemoryRequirementsInfo2, pSparseMemoryRequirementCount: DirectInt, pSparseMemoryRequirements: SparseImageMemoryRequirements2.Buffer?) {
		Commands.getImageSparseMemoryRequirements2KHR(getImageSparseMemoryRequirements2KHRAddr, device.address, pInfo.address, pSparseMemoryRequirementCount.address, pSparseMemoryRequirements.addressOrNULL)
	}
	
	
	
	fun createAccelerationStructureKHR(pCreateInfo: AccelerationStructureCreateInfoKHR, pAllocator: AllocationCallbacks?, pAccelerationStructure: NativePointer): Result {
		return Result(Commands.createAccelerationStructureKHR(createAccelerationStructureKHRAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pAccelerationStructure.address))
	}
	
	
	
	fun destroyAccelerationStructureKHR(accelerationStructure: AccelerationStructureH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyAccelerationStructureKHR(destroyAccelerationStructureKHRAddr, device.address, accelerationStructure.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun cmdBuildAccelerationStructuresKHR(commandBuffer: CommandBufferH, infoCount: Int, pInfos: AccelerationStructureBuildGeometryInfoKHR.Buffer, ppBuildRangeInfos: AccelerationStructureBuildRangeInfoKHR.Buffer) {
		Commands.cmdBuildAccelerationStructuresKHR(cmdBuildAccelerationStructuresKHRAddr, commandBuffer.address, infoCount, pInfos.address, ppBuildRangeInfos.address)
	}
	
	
	
	fun cmdBuildAccelerationStructuresIndirectKHR(commandBuffer: CommandBufferH, infoCount: Int, pInfos: AccelerationStructureBuildGeometryInfoKHR.Buffer, pIndirectDeviceAddresses: DirectLongBuffer, pIndirectStrides: DirectIntBuffer, ppMaxPrimitiveCounts: DirectIntBuffer) {
		Commands.cmdBuildAccelerationStructuresIndirectKHR(cmdBuildAccelerationStructuresIndirectKHRAddr, commandBuffer.address, infoCount, pInfos.address, pIndirectDeviceAddresses.address, pIndirectStrides.address, ppMaxPrimitiveCounts.address)
	}
	
	
	
	fun buildAccelerationStructuresKHR(deferredOperation: DeferredOperationH?, infoCount: Int, pInfos: AccelerationStructureBuildGeometryInfoKHR.Buffer, ppBuildRangeInfos: AccelerationStructureBuildRangeInfoKHR.Buffer): Result {
		return Result(Commands.buildAccelerationStructuresKHR(buildAccelerationStructuresKHRAddr, device.address, deferredOperation.addressOrNULL, infoCount, pInfos.address, ppBuildRangeInfos.address))
	}
	
	
	
	fun copyAccelerationStructureKHR(deferredOperation: DeferredOperationH?, pInfo: CopyAccelerationStructureInfoKHR): Result {
		return Result(Commands.copyAccelerationStructureKHR(copyAccelerationStructureKHRAddr, device.address, deferredOperation.addressOrNULL, pInfo.address))
	}
	
	
	
	fun copyAccelerationStructureToMemoryKHR(deferredOperation: DeferredOperationH?, pInfo: CopyAccelerationStructureToMemoryInfoKHR): Result {
		return Result(Commands.copyAccelerationStructureToMemoryKHR(copyAccelerationStructureToMemoryKHRAddr, device.address, deferredOperation.addressOrNULL, pInfo.address))
	}
	
	
	
	fun copyMemoryToAccelerationStructureKHR(deferredOperation: DeferredOperationH?, pInfo: CopyMemoryToAccelerationStructureInfoKHR): Result {
		return Result(Commands.copyMemoryToAccelerationStructureKHR(copyMemoryToAccelerationStructureKHRAddr, device.address, deferredOperation.addressOrNULL, pInfo.address))
	}
	
	
	
	fun writeAccelerationStructuresPropertiesKHR(accelerationStructureCount: Int, pAccelerationStructures: NativePointerBuffer, queryType: QueryType, dataSize: Long, pData: Long, stride: Long): Result {
		return Result(Commands.writeAccelerationStructuresPropertiesKHR(writeAccelerationStructuresPropertiesKHRAddr, device.address, accelerationStructureCount, pAccelerationStructures.address, queryType.id, dataSize, pData, stride))
	}
	
	
	
	fun cmdCopyAccelerationStructureKHR(commandBuffer: CommandBufferH, pInfo: CopyAccelerationStructureInfoKHR) {
		Commands.cmdCopyAccelerationStructureKHR(cmdCopyAccelerationStructureKHRAddr, commandBuffer.address, pInfo.address)
	}
	
	
	
	fun cmdCopyAccelerationStructureToMemoryKHR(commandBuffer: CommandBufferH, pInfo: CopyAccelerationStructureToMemoryInfoKHR) {
		Commands.cmdCopyAccelerationStructureToMemoryKHR(cmdCopyAccelerationStructureToMemoryKHRAddr, commandBuffer.address, pInfo.address)
	}
	
	
	
	fun cmdCopyMemoryToAccelerationStructureKHR(commandBuffer: CommandBufferH, pInfo: CopyMemoryToAccelerationStructureInfoKHR) {
		Commands.cmdCopyMemoryToAccelerationStructureKHR(cmdCopyMemoryToAccelerationStructureKHRAddr, commandBuffer.address, pInfo.address)
	}
	
	
	
	fun getAccelerationStructureDeviceAddressKHR(pInfo: AccelerationStructureDeviceAddressInfoKHR): Long {
		return Commands.getAccelerationStructureDeviceAddressKHR(getAccelerationStructureDeviceAddressKHRAddr, device.address, pInfo.address)
	}
	
	
	
	fun cmdWriteAccelerationStructuresPropertiesKHR(commandBuffer: CommandBufferH, accelerationStructureCount: Int, pAccelerationStructures: NativePointerBuffer, queryType: QueryType, queryPool: QueryPoolH, firstQuery: Int) {
		Commands.cmdWriteAccelerationStructuresPropertiesKHR(cmdWriteAccelerationStructuresPropertiesKHRAddr, commandBuffer.address, accelerationStructureCount, pAccelerationStructures.address, queryType.id, queryPool.address, firstQuery)
	}
	
	
	
	fun getDeviceAccelerationStructureCompatibilityKHR(pVersionInfo: AccelerationStructureVersionInfoKHR, pCompatibility: Long) {
		Commands.getDeviceAccelerationStructureCompatibilityKHR(getDeviceAccelerationStructureCompatibilityKHRAddr, device.address, pVersionInfo.address, pCompatibility)
	}
	
	
	
	fun getAccelerationStructureBuildSizesKHR(buildType: AccelerationStructureBuildType, pBuildInfo: AccelerationStructureBuildGeometryInfoKHR, pMaxPrimitiveCounts: DirectIntBuffer?, pSizeInfo: AccelerationStructureBuildSizesInfoKHR) {
		Commands.getAccelerationStructureBuildSizesKHR(getAccelerationStructureBuildSizesKHRAddr, device.address, buildType.id, pBuildInfo.address, pMaxPrimitiveCounts.addressOrNULL, pSizeInfo.address)
	}
	
	
	
	fun cmdTraceRaysKHR(commandBuffer: CommandBufferH, pRaygenShaderBindingTable: StridedDeviceAddressRegionKHR, pMissShaderBindingTable: StridedDeviceAddressRegionKHR, pHitShaderBindingTable: StridedDeviceAddressRegionKHR, pCallableShaderBindingTable: StridedDeviceAddressRegionKHR, width: Int, height: Int, depth: Int) {
		Commands.cmdTraceRaysKHR(cmdTraceRaysKHRAddr, commandBuffer.address, pRaygenShaderBindingTable.address, pMissShaderBindingTable.address, pHitShaderBindingTable.address, pCallableShaderBindingTable.address, width, height, depth)
	}
	
	
	
	fun createRayTracingPipelinesKHR(deferredOperation: DeferredOperationH?, pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: RayTracingPipelineCreateInfoKHR.Buffer, pAllocator: AllocationCallbacks?, pPipelines: NativePointerBuffer): Result {
		return Result(Commands.createRayTracingPipelinesKHR(createRayTracingPipelinesKHRAddr, device.address, deferredOperation.addressOrNULL, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	
	
	fun getRayTracingShaderGroupHandlesKHR(pipeline: PipelineH, firstGroup: Int, groupCount: Int, dataSize: Long, pData: Long): Result {
		return Result(Commands.getRayTracingShaderGroupHandlesKHR(getRayTracingShaderGroupHandlesKHRAddr, device.address, pipeline.address, firstGroup, groupCount, dataSize, pData))
	}
	
	
	
	fun getRayTracingCaptureReplayShaderGroupHandlesKHR(pipeline: PipelineH, firstGroup: Int, groupCount: Int, dataSize: Long, pData: Long): Result {
		return Result(Commands.getRayTracingCaptureReplayShaderGroupHandlesKHR(getRayTracingCaptureReplayShaderGroupHandlesKHRAddr, device.address, pipeline.address, firstGroup, groupCount, dataSize, pData))
	}
	
	
	
	fun cmdTraceRaysIndirectKHR(commandBuffer: CommandBufferH, pRaygenShaderBindingTable: StridedDeviceAddressRegionKHR, pMissShaderBindingTable: StridedDeviceAddressRegionKHR, pHitShaderBindingTable: StridedDeviceAddressRegionKHR, pCallableShaderBindingTable: StridedDeviceAddressRegionKHR, indirectDeviceAddress: Long) {
		Commands.cmdTraceRaysIndirectKHR(cmdTraceRaysIndirectKHRAddr, commandBuffer.address, pRaygenShaderBindingTable.address, pMissShaderBindingTable.address, pHitShaderBindingTable.address, pCallableShaderBindingTable.address, indirectDeviceAddress)
	}
	
	
	
	fun getRayTracingShaderGroupStackSizeKHR(pipeline: PipelineH, group: Int, groupShader: ShaderGroupShader): Long {
		return Commands.getRayTracingShaderGroupStackSizeKHR(getRayTracingShaderGroupStackSizeKHRAddr, device.address, pipeline.address, group, groupShader.id)
	}
	
	
	
	fun cmdSetRayTracingPipelineStackSizeKHR(commandBuffer: CommandBufferH, pipelineStackSize: Int) {
		Commands.cmdSetRayTracingPipelineStackSizeKHR(cmdSetRayTracingPipelineStackSizeKHRAddr, commandBuffer.address, pipelineStackSize)
	}
	
	
	
	fun createSamplerYcbcrConversionKHR(pCreateInfo: SamplerYcbcrConversionCreateInfo, pAllocator: AllocationCallbacks?, pYcbcrConversion: NativePointer): Result {
		return Result(Commands.createSamplerYcbcrConversionKHR(createSamplerYcbcrConversionKHRAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pYcbcrConversion.address))
	}
	
	
	
	fun destroySamplerYcbcrConversionKHR(ycbcrConversion: SamplerYcbcrConversionH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySamplerYcbcrConversionKHR(destroySamplerYcbcrConversionKHRAddr, device.address, ycbcrConversion.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun bindBufferMemory2KHR(bindInfoCount: Int, pBindInfos: BindBufferMemoryInfo.Buffer): Result {
		return Result(Commands.bindBufferMemory2KHR(bindBufferMemory2KHRAddr, device.address, bindInfoCount, pBindInfos.address))
	}
	
	
	
	fun bindImageMemory2KHR(bindInfoCount: Int, pBindInfos: BindImageMemoryInfo.Buffer): Result {
		return Result(Commands.bindImageMemory2KHR(bindImageMemory2KHRAddr, device.address, bindInfoCount, pBindInfos.address))
	}
	
	
	
	fun getImageDrmFormatModifierPropertiesEXT(image: ImageH, pProperties: ImageDrmFormatModifierPropertiesEXT): Result {
		return Result(Commands.getImageDrmFormatModifierPropertiesEXT(getImageDrmFormatModifierPropertiesEXTAddr, device.address, image.address, pProperties.address))
	}
	
	
	
	fun createValidationCacheEXT(pCreateInfo: ValidationCacheCreateInfoEXT, pAllocator: AllocationCallbacks?, pValidationCache: NativePointer): Result {
		return Result(Commands.createValidationCacheEXT(createValidationCacheEXTAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pValidationCache.address))
	}
	
	
	
	fun destroyValidationCacheEXT(validationCache: ValidationCacheH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyValidationCacheEXT(destroyValidationCacheEXTAddr, device.address, validationCache.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun mergeValidationCachesEXT(dstCache: ValidationCacheH, srcCacheCount: Int, pSrcCaches: NativePointerBuffer): Result {
		return Result(Commands.mergeValidationCachesEXT(mergeValidationCachesEXTAddr, device.address, dstCache.address, srcCacheCount, pSrcCaches.address))
	}
	
	
	
	fun getValidationCacheDataEXT(validationCache: ValidationCacheH, pDataSize: NativeSizeT, pData: Long): Result {
		return Result(Commands.getValidationCacheDataEXT(getValidationCacheDataEXTAddr, device.address, validationCache.address, pDataSize.address, pData))
	}
	
	
	
	fun cmdBindShadingRateImageNV(commandBuffer: CommandBufferH, imageView: ImageViewH?, imageLayout: ImageLayout) {
		Commands.cmdBindShadingRateImageNV(cmdBindShadingRateImageNVAddr, commandBuffer.address, imageView.addressOrNULL, imageLayout.id)
	}
	
	
	
	fun cmdSetViewportShadingRatePaletteNV(commandBuffer: CommandBufferH, firstViewport: Int, viewportCount: Int, pShadingRatePalettes: ShadingRatePaletteNV.Buffer) {
		Commands.cmdSetViewportShadingRatePaletteNV(cmdSetViewportShadingRatePaletteNVAddr, commandBuffer.address, firstViewport, viewportCount, pShadingRatePalettes.address)
	}
	
	
	
	fun cmdSetCoarseSampleOrderNV(commandBuffer: CommandBufferH, sampleOrderType: CoarseSampleOrderType, customSampleOrderCount: Int, pCustomSampleOrders: CoarseSampleOrderCustomNV.Buffer) {
		Commands.cmdSetCoarseSampleOrderNV(cmdSetCoarseSampleOrderNVAddr, commandBuffer.address, sampleOrderType.id, customSampleOrderCount, pCustomSampleOrders.address)
	}
	
	
	
	fun createAccelerationStructureNV(pCreateInfo: AccelerationStructureCreateInfoNV, pAllocator: AllocationCallbacks?, pAccelerationStructure: NativePointer): Result {
		return Result(Commands.createAccelerationStructureNV(createAccelerationStructureNVAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pAccelerationStructure.address))
	}
	
	
	
	fun destroyAccelerationStructureNV(accelerationStructure: AccelerationStructureH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyAccelerationStructureNV(destroyAccelerationStructureNVAddr, device.address, accelerationStructure.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getAccelerationStructureMemoryRequirementsNV(pInfo: AccelerationStructureMemoryRequirementsInfoNV, pMemoryRequirements: MemoryRequirements2) {
		Commands.getAccelerationStructureMemoryRequirementsNV(getAccelerationStructureMemoryRequirementsNVAddr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	
	
	fun bindAccelerationStructureMemoryNV(bindInfoCount: Int, pBindInfos: BindAccelerationStructureMemoryInfoNV.Buffer): Result {
		return Result(Commands.bindAccelerationStructureMemoryNV(bindAccelerationStructureMemoryNVAddr, device.address, bindInfoCount, pBindInfos.address))
	}
	
	
	
	fun cmdBuildAccelerationStructureNV(commandBuffer: CommandBufferH, pInfo: AccelerationStructureInfoNV, instanceData: BufferH?, instanceOffset: Long, update: Int, dst: AccelerationStructureH, src: AccelerationStructureH?, scratch: BufferH, scratchOffset: Long) {
		Commands.cmdBuildAccelerationStructureNV(cmdBuildAccelerationStructureNVAddr, commandBuffer.address, pInfo.address, instanceData.addressOrNULL, instanceOffset, update, dst.address, src.addressOrNULL, scratch.address, scratchOffset)
	}
	
	
	
	fun cmdCopyAccelerationStructureNV(commandBuffer: CommandBufferH, dst: AccelerationStructureH, src: AccelerationStructureH, mode: CopyAccelerationStructureMode) {
		Commands.cmdCopyAccelerationStructureNV(cmdCopyAccelerationStructureNVAddr, commandBuffer.address, dst.address, src.address, mode.id)
	}
	
	
	
	fun cmdTraceRaysNV(commandBuffer: CommandBufferH, raygenShaderBindingTableBuffer: BufferH, raygenShaderBindingOffset: Long, missShaderBindingTableBuffer: BufferH?, missShaderBindingOffset: Long, missShaderBindingStride: Long, hitShaderBindingTableBuffer: BufferH?, hitShaderBindingOffset: Long, hitShaderBindingStride: Long, callableShaderBindingTableBuffer: BufferH?, callableShaderBindingOffset: Long, callableShaderBindingStride: Long, width: Int, height: Int, depth: Int) {
		Commands.cmdTraceRaysNV(cmdTraceRaysNVAddr, commandBuffer.address, raygenShaderBindingTableBuffer.address, raygenShaderBindingOffset, missShaderBindingTableBuffer.addressOrNULL, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer.addressOrNULL, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer.addressOrNULL, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth)
	}
	
	
	
	fun createRayTracingPipelinesNV(pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: RayTracingPipelineCreateInfoNV.Buffer, pAllocator: AllocationCallbacks?, pPipelines: NativePointerBuffer): Result {
		return Result(Commands.createRayTracingPipelinesNV(createRayTracingPipelinesNVAddr, device.address, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	
	
	fun getRayTracingShaderGroupHandlesNV(pipeline: PipelineH, firstGroup: Int, groupCount: Int, dataSize: Long, pData: Long): Result {
		return Result(Commands.getRayTracingShaderGroupHandlesNV(getRayTracingShaderGroupHandlesNVAddr, device.address, pipeline.address, firstGroup, groupCount, dataSize, pData))
	}
	
	
	
	fun getAccelerationStructureHandleNV(accelerationStructure: AccelerationStructureH, dataSize: Long, pData: Long): Result {
		return Result(Commands.getAccelerationStructureHandleNV(getAccelerationStructureHandleNVAddr, device.address, accelerationStructure.address, dataSize, pData))
	}
	
	
	
	fun cmdWriteAccelerationStructuresPropertiesNV(commandBuffer: CommandBufferH, accelerationStructureCount: Int, pAccelerationStructures: NativePointerBuffer, queryType: QueryType, queryPool: QueryPoolH, firstQuery: Int) {
		Commands.cmdWriteAccelerationStructuresPropertiesNV(cmdWriteAccelerationStructuresPropertiesNVAddr, commandBuffer.address, accelerationStructureCount, pAccelerationStructures.address, queryType.id, queryPool.address, firstQuery)
	}
	
	
	
	fun compileDeferredNV(pipeline: PipelineH, shader: Int): Result {
		return Result(Commands.compileDeferredNV(compileDeferredNVAddr, device.address, pipeline.address, shader))
	}
	
	
	
	fun getDescriptorSetLayoutSupportKHR(pCreateInfo: DescriptorSetLayoutCreateInfo, pSupport: DescriptorSetLayoutSupport) {
		Commands.getDescriptorSetLayoutSupportKHR(getDescriptorSetLayoutSupportKHRAddr, device.address, pCreateInfo.address, pSupport.address)
	}
	
	
	
	fun cmdDrawIndirectCountKHR(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, countBuffer: BufferH, countBufferOffset: Long, maxDrawCount: Int, stride: Int) {
		Commands.cmdDrawIndirectCountKHR(cmdDrawIndirectCountKHRAddr, commandBuffer.address, buffer.address, offset, countBuffer.address, countBufferOffset, maxDrawCount, stride)
	}
	
	
	
	fun cmdDrawIndexedIndirectCountKHR(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, countBuffer: BufferH, countBufferOffset: Long, maxDrawCount: Int, stride: Int) {
		Commands.cmdDrawIndexedIndirectCountKHR(cmdDrawIndexedIndirectCountKHRAddr, commandBuffer.address, buffer.address, offset, countBuffer.address, countBufferOffset, maxDrawCount, stride)
	}
	
	
	
	fun getMemoryHostPointerPropertiesEXT(handleType: ExternalMemoryHandleTypeFlags, pHostPointer: Long, pMemoryHostPointerProperties: MemoryHostPointerPropertiesEXT): Result {
		return Result(Commands.getMemoryHostPointerPropertiesEXT(getMemoryHostPointerPropertiesEXTAddr, device.address, handleType.bitfield, pHostPointer, pMemoryHostPointerProperties.address))
	}
	
	
	
	fun cmdWriteBufferMarkerAMD(commandBuffer: CommandBufferH, pipelineStage: PipelineStageFlags, dstBuffer: BufferH, dstOffset: Long, marker: Int) {
		Commands.cmdWriteBufferMarkerAMD(cmdWriteBufferMarkerAMDAddr, commandBuffer.address, pipelineStage.bitfield, dstBuffer.address, dstOffset, marker)
	}
	
	
	
	fun getCalibratedTimestampsEXT(timestampCount: Int, pTimestampInfos: CalibratedTimestampInfoEXT.Buffer, pTimestamps: DirectLongBuffer, pMaxDeviation: DirectLong): Result {
		return Result(Commands.getCalibratedTimestampsEXT(getCalibratedTimestampsEXTAddr, device.address, timestampCount, pTimestampInfos.address, pTimestamps.address, pMaxDeviation.address))
	}
	
	
	
	fun cmdDrawMeshTasksNV(commandBuffer: CommandBufferH, taskCount: Int, firstTask: Int) {
		Commands.cmdDrawMeshTasksNV(cmdDrawMeshTasksNVAddr, commandBuffer.address, taskCount, firstTask)
	}
	
	
	
	fun cmdDrawMeshTasksIndirectNV(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, drawCount: Int, stride: Int) {
		Commands.cmdDrawMeshTasksIndirectNV(cmdDrawMeshTasksIndirectNVAddr, commandBuffer.address, buffer.address, offset, drawCount, stride)
	}
	
	
	
	fun cmdDrawMeshTasksIndirectCountNV(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, countBuffer: BufferH, countBufferOffset: Long, maxDrawCount: Int, stride: Int) {
		Commands.cmdDrawMeshTasksIndirectCountNV(cmdDrawMeshTasksIndirectCountNVAddr, commandBuffer.address, buffer.address, offset, countBuffer.address, countBufferOffset, maxDrawCount, stride)
	}
	
	
	
	fun cmdSetExclusiveScissorNV(commandBuffer: CommandBufferH, firstExclusiveScissor: Int, exclusiveScissorCount: Int, pExclusiveScissors: Rect2D.Buffer) {
		Commands.cmdSetExclusiveScissorNV(cmdSetExclusiveScissorNVAddr, commandBuffer.address, firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissors.address)
	}
	
	
	
	fun cmdSetCheckpointNV(commandBuffer: CommandBufferH, pCheckpointMarker: Long) {
		Commands.cmdSetCheckpointNV(cmdSetCheckpointNVAddr, commandBuffer.address, pCheckpointMarker)
	}
	
	
	
	fun getQueueCheckpointDataNV(queue: QueueH, pCheckpointDataCount: DirectInt, pCheckpointData: CheckpointDataNV.Buffer?) {
		Commands.getQueueCheckpointDataNV(getQueueCheckpointDataNVAddr, queue.address, pCheckpointDataCount.address, pCheckpointData.addressOrNULL)
	}
	
	
	
	fun getSemaphoreCounterValueKHR(semaphore: SemaphoreH, pValue: DirectLong): Result {
		return Result(Commands.getSemaphoreCounterValueKHR(getSemaphoreCounterValueKHRAddr, device.address, semaphore.address, pValue.address))
	}
	
	
	
	fun waitSemaphoresKHR(pWaitInfo: SemaphoreWaitInfo, timeout: Long): Result {
		return Result(Commands.waitSemaphoresKHR(waitSemaphoresKHRAddr, device.address, pWaitInfo.address, timeout))
	}
	
	
	
	fun signalSemaphoreKHR(pSignalInfo: SemaphoreSignalInfo): Result {
		return Result(Commands.signalSemaphoreKHR(signalSemaphoreKHRAddr, device.address, pSignalInfo.address))
	}
	
	
	
	fun initializePerformanceApiINTEL(pInitializeInfo: InitializePerformanceApiInfoINTEL): Result {
		return Result(Commands.initializePerformanceApiINTEL(initializePerformanceApiINTELAddr, device.address, pInitializeInfo.address))
	}
	
	
	
	fun uninitializePerformanceApiINTEL() {
		Commands.uninitializePerformanceApiINTEL(uninitializePerformanceApiINTELAddr, device.address)
	}
	
	
	
	fun cmdSetPerformanceMarkerINTEL(commandBuffer: CommandBufferH, pMarkerInfo: PerformanceMarkerInfoINTEL): Result {
		return Result(Commands.cmdSetPerformanceMarkerINTEL(cmdSetPerformanceMarkerINTELAddr, commandBuffer.address, pMarkerInfo.address))
	}
	
	
	
	fun cmdSetPerformanceStreamMarkerINTEL(commandBuffer: CommandBufferH, pMarkerInfo: PerformanceStreamMarkerInfoINTEL): Result {
		return Result(Commands.cmdSetPerformanceStreamMarkerINTEL(cmdSetPerformanceStreamMarkerINTELAddr, commandBuffer.address, pMarkerInfo.address))
	}
	
	
	
	fun cmdSetPerformanceOverrideINTEL(commandBuffer: CommandBufferH, pOverrideInfo: PerformanceOverrideInfoINTEL): Result {
		return Result(Commands.cmdSetPerformanceOverrideINTEL(cmdSetPerformanceOverrideINTELAddr, commandBuffer.address, pOverrideInfo.address))
	}
	
	
	
	fun acquirePerformanceConfigurationINTEL(pAcquireInfo: PerformanceConfigurationAcquireInfoINTEL, pConfiguration: NativePointer): Result {
		return Result(Commands.acquirePerformanceConfigurationINTEL(acquirePerformanceConfigurationINTELAddr, device.address, pAcquireInfo.address, pConfiguration.address))
	}
	
	
	
	fun releasePerformanceConfigurationINTEL(configuration: PerformanceConfigurationH?): Result {
		return Result(Commands.releasePerformanceConfigurationINTEL(releasePerformanceConfigurationINTELAddr, device.address, configuration.addressOrNULL))
	}
	
	
	
	fun queueSetPerformanceConfigurationINTEL(queue: QueueH, configuration: PerformanceConfigurationH): Result {
		return Result(Commands.queueSetPerformanceConfigurationINTEL(queueSetPerformanceConfigurationINTELAddr, queue.address, configuration.address))
	}
	
	
	
	fun getPerformanceParameterINTEL(parameter: PerformanceParameterType, pValue: PerformanceValueINTEL): Result {
		return Result(Commands.getPerformanceParameterINTEL(getPerformanceParameterINTELAddr, device.address, parameter.id, pValue.address))
	}
	
	
	
	fun setLocalDimmingAMD(swapChain: SwapchainH, localDimmingEnable: Int) {
		Commands.setLocalDimmingAMD(setLocalDimmingAMDAddr, device.address, swapChain.address, localDimmingEnable)
	}
	
	
	
	fun cmdSetFragmentShadingRateKHR(commandBuffer: CommandBufferH, pFragmentSize: Extent2D, combinerOps: DirectIntBuffer) {
		Commands.cmdSetFragmentShadingRateKHR(cmdSetFragmentShadingRateKHRAddr, commandBuffer.address, pFragmentSize.address, combinerOps.address)
	}
	
	
	
	fun getBufferDeviceAddressEXT(pInfo: BufferDeviceAddressInfo): Long {
		return Commands.getBufferDeviceAddressEXT(getBufferDeviceAddressEXTAddr, device.address, pInfo.address)
	}
	
	
	
	fun acquireFullScreenExclusiveModeEXT(swapchain: SwapchainH): Result {
		return Result(Commands.acquireFullScreenExclusiveModeEXT(acquireFullScreenExclusiveModeEXTAddr, device.address, swapchain.address))
	}
	
	
	
	fun releaseFullScreenExclusiveModeEXT(swapchain: SwapchainH): Result {
		return Result(Commands.releaseFullScreenExclusiveModeEXT(releaseFullScreenExclusiveModeEXTAddr, device.address, swapchain.address))
	}
	
	
	
	fun getDeviceGroupSurfacePresentModes2EXT(pSurfaceInfo: PhysicalDeviceSurfaceInfo2KHR, pModes: Long): Result {
		return Result(Commands.getDeviceGroupSurfacePresentModes2EXT(getDeviceGroupSurfacePresentModes2EXTAddr, device.address, pSurfaceInfo.address, pModes))
	}
	
	
	
	fun getBufferDeviceAddressKHR(pInfo: BufferDeviceAddressInfo): Long {
		return Commands.getBufferDeviceAddressKHR(getBufferDeviceAddressKHRAddr, device.address, pInfo.address)
	}
	
	
	
	fun getBufferOpaqueCaptureAddressKHR(pInfo: BufferDeviceAddressInfo): Long {
		return Commands.getBufferOpaqueCaptureAddressKHR(getBufferOpaqueCaptureAddressKHRAddr, device.address, pInfo.address)
	}
	
	
	
	fun getDeviceMemoryOpaqueCaptureAddressKHR(pInfo: DeviceMemoryOpaqueCaptureAddressInfo): Long {
		return Commands.getDeviceMemoryOpaqueCaptureAddressKHR(getDeviceMemoryOpaqueCaptureAddressKHRAddr, device.address, pInfo.address)
	}
	
	
	
	fun cmdSetLineStippleEXT(commandBuffer: CommandBufferH, lineStippleFactor: Int, lineStipplePattern: Short) {
		Commands.cmdSetLineStippleEXT(cmdSetLineStippleEXTAddr, commandBuffer.address, lineStippleFactor, lineStipplePattern)
	}
	
	
	
	fun resetQueryPoolEXT(queryPool: QueryPoolH, firstQuery: Int, queryCount: Int) {
		Commands.resetQueryPoolEXT(resetQueryPoolEXTAddr, device.address, queryPool.address, firstQuery, queryCount)
	}
	
	
	
	fun cmdSetCullModeEXT(commandBuffer: CommandBufferH, cullMode: CullModeFlags) {
		Commands.cmdSetCullModeEXT(cmdSetCullModeEXTAddr, commandBuffer.address, cullMode.bitfield)
	}
	
	
	
	fun cmdSetFrontFaceEXT(commandBuffer: CommandBufferH, frontFace: FrontFace) {
		Commands.cmdSetFrontFaceEXT(cmdSetFrontFaceEXTAddr, commandBuffer.address, frontFace.id)
	}
	
	
	
	fun cmdSetPrimitiveTopologyEXT(commandBuffer: CommandBufferH, primitiveTopology: PrimitiveTopology) {
		Commands.cmdSetPrimitiveTopologyEXT(cmdSetPrimitiveTopologyEXTAddr, commandBuffer.address, primitiveTopology.id)
	}
	
	
	
	fun cmdSetViewportWithCountEXT(commandBuffer: CommandBufferH, viewportCount: Int, pViewports: Viewport.Buffer) {
		Commands.cmdSetViewportWithCountEXT(cmdSetViewportWithCountEXTAddr, commandBuffer.address, viewportCount, pViewports.address)
	}
	
	
	
	fun cmdSetScissorWithCountEXT(commandBuffer: CommandBufferH, scissorCount: Int, pScissors: Rect2D.Buffer) {
		Commands.cmdSetScissorWithCountEXT(cmdSetScissorWithCountEXTAddr, commandBuffer.address, scissorCount, pScissors.address)
	}
	
	
	
	fun cmdBindVertexBuffers2EXT(commandBuffer: CommandBufferH, firstBinding: Int, bindingCount: Int, pBuffers: NativePointerBuffer, pOffsets: DirectLongBuffer, pSizes: DirectLongBuffer?, pStrides: DirectLongBuffer?) {
		Commands.cmdBindVertexBuffers2EXT(cmdBindVertexBuffers2EXTAddr, commandBuffer.address, firstBinding, bindingCount, pBuffers.address, pOffsets.address, pSizes.addressOrNULL, pStrides.addressOrNULL)
	}
	
	
	
	fun cmdSetDepthTestEnableEXT(commandBuffer: CommandBufferH, depthTestEnable: Int) {
		Commands.cmdSetDepthTestEnableEXT(cmdSetDepthTestEnableEXTAddr, commandBuffer.address, depthTestEnable)
	}
	
	
	
	fun cmdSetDepthWriteEnableEXT(commandBuffer: CommandBufferH, depthWriteEnable: Int) {
		Commands.cmdSetDepthWriteEnableEXT(cmdSetDepthWriteEnableEXTAddr, commandBuffer.address, depthWriteEnable)
	}
	
	
	
	fun cmdSetDepthCompareOpEXT(commandBuffer: CommandBufferH, depthCompareOp: CompareOp) {
		Commands.cmdSetDepthCompareOpEXT(cmdSetDepthCompareOpEXTAddr, commandBuffer.address, depthCompareOp.id)
	}
	
	
	
	fun cmdSetDepthBoundsTestEnableEXT(commandBuffer: CommandBufferH, depthBoundsTestEnable: Int) {
		Commands.cmdSetDepthBoundsTestEnableEXT(cmdSetDepthBoundsTestEnableEXTAddr, commandBuffer.address, depthBoundsTestEnable)
	}
	
	
	
	fun cmdSetStencilTestEnableEXT(commandBuffer: CommandBufferH, stencilTestEnable: Int) {
		Commands.cmdSetStencilTestEnableEXT(cmdSetStencilTestEnableEXTAddr, commandBuffer.address, stencilTestEnable)
	}
	
	
	
	fun cmdSetStencilOpEXT(commandBuffer: CommandBufferH, faceMask: StencilFaceFlags, failOp: StencilOp, passOp: StencilOp, depthFailOp: StencilOp, compareOp: CompareOp) {
		Commands.cmdSetStencilOpEXT(cmdSetStencilOpEXTAddr, commandBuffer.address, faceMask.bitfield, failOp.id, passOp.id, depthFailOp.id, compareOp.id)
	}
	
	
	
	fun createDeferredOperationKHR(pAllocator: AllocationCallbacks?, pDeferredOperation: NativePointer): Result {
		return Result(Commands.createDeferredOperationKHR(createDeferredOperationKHRAddr, device.address, pAllocator.addressOrNULL, pDeferredOperation.address))
	}
	
	
	
	fun destroyDeferredOperationKHR(operation: DeferredOperationH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDeferredOperationKHR(destroyDeferredOperationKHRAddr, device.address, operation.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getDeferredOperationMaxConcurrencyKHR(operation: DeferredOperationH): Int {
		return Commands.getDeferredOperationMaxConcurrencyKHR(getDeferredOperationMaxConcurrencyKHRAddr, device.address, operation.address)
	}
	
	
	
	fun getDeferredOperationResultKHR(operation: DeferredOperationH): Result {
		return Result(Commands.getDeferredOperationResultKHR(getDeferredOperationResultKHRAddr, device.address, operation.address))
	}
	
	
	
	fun deferredOperationJoinKHR(operation: DeferredOperationH): Result {
		return Result(Commands.deferredOperationJoinKHR(deferredOperationJoinKHRAddr, device.address, operation.address))
	}
	
	
	
	fun getPipelineExecutablePropertiesKHR(pPipelineInfo: PipelineInfoKHR, pExecutableCount: DirectInt, pProperties: PipelineExecutablePropertiesKHR.Buffer?): Result {
		return Result(Commands.getPipelineExecutablePropertiesKHR(getPipelineExecutablePropertiesKHRAddr, device.address, pPipelineInfo.address, pExecutableCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getPipelineExecutableStatisticsKHR(pExecutableInfo: PipelineExecutableInfoKHR, pStatisticCount: DirectInt, pStatistics: PipelineExecutableStatisticKHR.Buffer?): Result {
		return Result(Commands.getPipelineExecutableStatisticsKHR(getPipelineExecutableStatisticsKHRAddr, device.address, pExecutableInfo.address, pStatisticCount.address, pStatistics.addressOrNULL))
	}
	
	
	
	fun getPipelineExecutableInternalRepresentationsKHR(pExecutableInfo: PipelineExecutableInfoKHR, pInternalRepresentationCount: DirectInt, pInternalRepresentations: PipelineExecutableInternalRepresentationKHR.Buffer?): Result {
		return Result(Commands.getPipelineExecutableInternalRepresentationsKHR(getPipelineExecutableInternalRepresentationsKHRAddr, device.address, pExecutableInfo.address, pInternalRepresentationCount.address, pInternalRepresentations.addressOrNULL))
	}
	
	
	
	fun getGeneratedCommandsMemoryRequirementsNV(pInfo: GeneratedCommandsMemoryRequirementsInfoNV, pMemoryRequirements: MemoryRequirements2) {
		Commands.getGeneratedCommandsMemoryRequirementsNV(getGeneratedCommandsMemoryRequirementsNVAddr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	
	
	fun cmdPreprocessGeneratedCommandsNV(commandBuffer: CommandBufferH, pGeneratedCommandsInfo: GeneratedCommandsInfoNV) {
		Commands.cmdPreprocessGeneratedCommandsNV(cmdPreprocessGeneratedCommandsNVAddr, commandBuffer.address, pGeneratedCommandsInfo.address)
	}
	
	
	
	fun cmdExecuteGeneratedCommandsNV(commandBuffer: CommandBufferH, isPreprocessed: Int, pGeneratedCommandsInfo: GeneratedCommandsInfoNV) {
		Commands.cmdExecuteGeneratedCommandsNV(cmdExecuteGeneratedCommandsNVAddr, commandBuffer.address, isPreprocessed, pGeneratedCommandsInfo.address)
	}
	
	
	
	fun cmdBindPipelineShaderGroupNV(commandBuffer: CommandBufferH, pipelineBindPoint: PipelineBindPoint, pipeline: PipelineH, groupIndex: Int) {
		Commands.cmdBindPipelineShaderGroupNV(cmdBindPipelineShaderGroupNVAddr, commandBuffer.address, pipelineBindPoint.id, pipeline.address, groupIndex)
	}
	
	
	
	fun createIndirectCommandsLayoutNV(pCreateInfo: IndirectCommandsLayoutCreateInfoNV, pAllocator: AllocationCallbacks?, pIndirectCommandsLayout: NativePointer): Result {
		return Result(Commands.createIndirectCommandsLayoutNV(createIndirectCommandsLayoutNVAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pIndirectCommandsLayout.address))
	}
	
	
	
	fun destroyIndirectCommandsLayoutNV(indirectCommandsLayout: IndirectCommandsLayoutH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyIndirectCommandsLayoutNV(destroyIndirectCommandsLayoutNVAddr, device.address, indirectCommandsLayout.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createPrivateDataSlotEXT(pCreateInfo: PrivateDataSlotCreateInfoEXT, pAllocator: AllocationCallbacks?, pPrivateDataSlot: NativePointer): Result {
		return Result(Commands.createPrivateDataSlotEXT(createPrivateDataSlotEXTAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pPrivateDataSlot.address))
	}
	
	
	
	fun destroyPrivateDataSlotEXT(privateDataSlot: PrivateDataSlotH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyPrivateDataSlotEXT(destroyPrivateDataSlotEXTAddr, device.address, privateDataSlot.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun setPrivateDataEXT(objectType: ObjectType, objectHandle: Long, privateDataSlot: PrivateDataSlotH, data: Long): Result {
		return Result(Commands.setPrivateDataEXT(setPrivateDataEXTAddr, device.address, objectType.id, objectHandle, privateDataSlot.address, data))
	}
	
	
	
	fun getPrivateDataEXT(objectType: ObjectType, objectHandle: Long, privateDataSlot: PrivateDataSlotH, pData: DirectLong) {
		Commands.getPrivateDataEXT(getPrivateDataEXTAddr, device.address, objectType.id, objectHandle, privateDataSlot.address, pData.address)
	}
	
	
	
	fun cmdSetEvent2KHR(commandBuffer: CommandBufferH, event: EventH, pDependencyInfo: DependencyInfoKHR) {
		Commands.cmdSetEvent2KHR(cmdSetEvent2KHRAddr, commandBuffer.address, event.address, pDependencyInfo.address)
	}
	
	
	
	fun cmdResetEvent2KHR(commandBuffer: CommandBufferH, event: EventH, stageMask: PipelineStageFlags2) {
		Commands.cmdResetEvent2KHR(cmdResetEvent2KHRAddr, commandBuffer.address, event.address, stageMask.bitfield)
	}
	
	
	
	fun cmdWaitEvents2KHR(commandBuffer: CommandBufferH, eventCount: Int, pEvents: NativePointerBuffer, pDependencyInfos: DependencyInfoKHR.Buffer) {
		Commands.cmdWaitEvents2KHR(cmdWaitEvents2KHRAddr, commandBuffer.address, eventCount, pEvents.address, pDependencyInfos.address)
	}
	
	
	
	fun cmdPipelineBarrier2KHR(commandBuffer: CommandBufferH, pDependencyInfo: DependencyInfoKHR) {
		Commands.cmdPipelineBarrier2KHR(cmdPipelineBarrier2KHRAddr, commandBuffer.address, pDependencyInfo.address)
	}
	
	
	
	fun cmdWriteTimestamp2KHR(commandBuffer: CommandBufferH, stage: PipelineStageFlags2, queryPool: QueryPoolH, query: Int) {
		Commands.cmdWriteTimestamp2KHR(cmdWriteTimestamp2KHRAddr, commandBuffer.address, stage.bitfield, queryPool.address, query)
	}
	
	
	
	fun queueSubmit2KHR(queue: QueueH, submitCount: Int, pSubmits: SubmitInfo2KHR.Buffer, fence: FenceH?): Result {
		return Result(Commands.queueSubmit2KHR(queueSubmit2KHRAddr, queue.address, submitCount, pSubmits.address, fence.addressOrNULL))
	}
	
	
	
	fun cmdWriteBufferMarker2AMD(commandBuffer: CommandBufferH, stage: PipelineStageFlags2, dstBuffer: BufferH, dstOffset: Long, marker: Int) {
		Commands.cmdWriteBufferMarker2AMD(cmdWriteBufferMarker2AMDAddr, commandBuffer.address, stage.bitfield, dstBuffer.address, dstOffset, marker)
	}
	
	
	
	fun getQueueCheckpointData2NV(queue: QueueH, pCheckpointDataCount: DirectInt, pCheckpointData: CheckpointData2NV.Buffer?) {
		Commands.getQueueCheckpointData2NV(getQueueCheckpointData2NVAddr, queue.address, pCheckpointDataCount.address, pCheckpointData.addressOrNULL)
	}
	
	
	
	fun cmdSetFragmentShadingRateEnumNV(commandBuffer: CommandBufferH, shadingRate: FragmentShadingRate, combinerOps: DirectIntBuffer) {
		Commands.cmdSetFragmentShadingRateEnumNV(cmdSetFragmentShadingRateEnumNVAddr, commandBuffer.address, shadingRate.id, combinerOps.address)
	}
	
	
	
	fun cmdCopyBuffer2KHR(commandBuffer: CommandBufferH, pCopyBufferInfo: CopyBufferInfo2KHR) {
		Commands.cmdCopyBuffer2KHR(cmdCopyBuffer2KHRAddr, commandBuffer.address, pCopyBufferInfo.address)
	}
	
	
	
	fun cmdCopyImage2KHR(commandBuffer: CommandBufferH, pCopyImageInfo: CopyImageInfo2KHR) {
		Commands.cmdCopyImage2KHR(cmdCopyImage2KHRAddr, commandBuffer.address, pCopyImageInfo.address)
	}
	
	
	
	fun cmdCopyBufferToImage2KHR(commandBuffer: CommandBufferH, pCopyBufferToImageInfo: CopyBufferToImageInfo2KHR) {
		Commands.cmdCopyBufferToImage2KHR(cmdCopyBufferToImage2KHRAddr, commandBuffer.address, pCopyBufferToImageInfo.address)
	}
	
	
	
	fun cmdCopyImageToBuffer2KHR(commandBuffer: CommandBufferH, pCopyImageToBufferInfo: CopyImageToBufferInfo2KHR) {
		Commands.cmdCopyImageToBuffer2KHR(cmdCopyImageToBuffer2KHRAddr, commandBuffer.address, pCopyImageToBufferInfo.address)
	}
	
	
	
	fun cmdBlitImage2KHR(commandBuffer: CommandBufferH, pBlitImageInfo: BlitImageInfo2KHR) {
		Commands.cmdBlitImage2KHR(cmdBlitImage2KHRAddr, commandBuffer.address, pBlitImageInfo.address)
	}
	
	
	
	fun cmdResolveImage2KHR(commandBuffer: CommandBufferH, pResolveImageInfo: ResolveImageInfo2KHR) {
		Commands.cmdResolveImage2KHR(cmdResolveImage2KHRAddr, commandBuffer.address, pResolveImageInfo.address)
	}
	
	
	
	fun getMemoryZirconHandleFUCHSIA(pGetZirconHandleInfo: MemoryGetZirconHandleInfoFUCHSIA, pZirconHandle: Long): Result {
		return Result(Commands.getMemoryZirconHandleFUCHSIA(getMemoryZirconHandleFUCHSIAAddr, device.address, pGetZirconHandleInfo.address, pZirconHandle))
	}
	
	
	
	fun getMemoryZirconHandlePropertiesFUCHSIA(handleType: ExternalMemoryHandleTypeFlags, zirconHandle: Long, pMemoryZirconHandleProperties: MemoryZirconHandlePropertiesFUCHSIA): Result {
		return Result(Commands.getMemoryZirconHandlePropertiesFUCHSIA(getMemoryZirconHandlePropertiesFUCHSIAAddr, device.address, handleType.bitfield, zirconHandle, pMemoryZirconHandleProperties.address))
	}
	
	
	
	fun importSemaphoreZirconHandleFUCHSIA(pImportSemaphoreZirconHandleInfo: ImportSemaphoreZirconHandleInfoFUCHSIA): Result {
		return Result(Commands.importSemaphoreZirconHandleFUCHSIA(importSemaphoreZirconHandleFUCHSIAAddr, device.address, pImportSemaphoreZirconHandleInfo.address))
	}
	
	
	
	fun getSemaphoreZirconHandleFUCHSIA(pGetZirconHandleInfo: SemaphoreGetZirconHandleInfoFUCHSIA, pZirconHandle: Long): Result {
		return Result(Commands.getSemaphoreZirconHandleFUCHSIA(getSemaphoreZirconHandleFUCHSIAAddr, device.address, pGetZirconHandleInfo.address, pZirconHandle))
	}


}