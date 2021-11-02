// This file has been automatically generated.

package kvb.vulkan.command

import kvb.core.memory.MemStacks
import kvb.core.memory.Addressable.Companion.addressOrNULL
import kvb.vulkan.*
import kvb.core.memory.direct.*

@Suppress("unused")
class DeviceCommands(private val device: DeviceH, private val instanceCommands: InstanceCommands) {
	
	
	private val stack = MemStacks.default
	
	
	
	private fun addr(name: String) = instanceCommands.getDeviceProcAddr(device, stack.encodeUtf8NT(name))
	
	
	
	/*
	Command addresses
	 */
	
	
	
	private val frameIndex = stack.push()
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
	private val createSwapchainAddr = addr("vkCreateSwapchainKHR")
	private val destroySwapchainAddr = addr("vkDestroySwapchainKHR")
	private val getSwapchainImagesAddr = addr("vkGetSwapchainImagesKHR")
	private val acquireNextImageAddr = addr("vkAcquireNextImageKHR")
	private val queuePresentAddr = addr("vkQueuePresentKHR")
	private val getDeviceGroupPresentCapabilitiesAddr = addr("vkGetDeviceGroupPresentCapabilitiesKHR")
	private val getDeviceGroupSurfacePresentModesAddr = addr("vkGetDeviceGroupSurfacePresentModesKHR")
	private val acquireNextImage2Addr = addr("vkAcquireNextImage2KHR")
	private val createSharedSwapchainsAddr = addr("vkCreateSharedSwapchainsKHR")
	private val cmdBindTransformFeedbackBuffersAddr = addr("vkCmdBindTransformFeedbackBuffersEXT")
	private val cmdBeginTransformFeedbackAddr = addr("vkCmdBeginTransformFeedbackEXT")
	private val cmdEndTransformFeedbackAddr = addr("vkCmdEndTransformFeedbackEXT")
	private val cmdBeginQueryIndexedAddr = addr("vkCmdBeginQueryIndexedEXT")
	private val cmdEndQueryIndexedAddr = addr("vkCmdEndQueryIndexedEXT")
	private val cmdDrawIndirectByteCountAddr = addr("vkCmdDrawIndirectByteCountEXT")
	private val getImageViewHandleAddr = addr("vkGetImageViewHandleNVX")
	private val getImageViewAddressAddr = addr("vkGetImageViewAddressNVX")
	private val getShaderInfoAddr = addr("vkGetShaderInfoAMD")
	private val getMemoryWin32HandleAddr = addr("vkGetMemoryWin32HandleKHR")
	private val getMemoryWin32HandlePropertiesAddr = addr("vkGetMemoryWin32HandlePropertiesKHR")
	private val getMemoryFdAddr = addr("vkGetMemoryFdKHR")
	private val getMemoryFdPropertiesAddr = addr("vkGetMemoryFdPropertiesKHR")
	private val importSemaphoreWin32HandleAddr = addr("vkImportSemaphoreWin32HandleKHR")
	private val getSemaphoreWin32HandleAddr = addr("vkGetSemaphoreWin32HandleKHR")
	private val importSemaphoreFdAddr = addr("vkImportSemaphoreFdKHR")
	private val getSemaphoreFdAddr = addr("vkGetSemaphoreFdKHR")
	private val cmdPushDescriptorSetAddr = addr("vkCmdPushDescriptorSetKHR")
	private val cmdPushDescriptorSetWithTemplateAddr = addr("vkCmdPushDescriptorSetWithTemplateKHR")
	private val cmdBeginConditionalRenderingAddr = addr("vkCmdBeginConditionalRenderingEXT")
	private val cmdEndConditionalRenderingAddr = addr("vkCmdEndConditionalRenderingEXT")
	private val cmdSetViewportWScalingAddr = addr("vkCmdSetViewportWScalingNV")
	private val displayPowerControlAddr = addr("vkDisplayPowerControlEXT")
	private val registerDeviceEventAddr = addr("vkRegisterDeviceEventEXT")
	private val registerDisplayEventAddr = addr("vkRegisterDisplayEventEXT")
	private val getSwapchainCounterAddr = addr("vkGetSwapchainCounterEXT")
	private val getRefreshCycleDurationAddr = addr("vkGetRefreshCycleDurationGOOGLE")
	private val getPastPresentationTimingAddr = addr("vkGetPastPresentationTimingGOOGLE")
	private val cmdSetDiscardRectangleAddr = addr("vkCmdSetDiscardRectangleEXT")
	private val setHdrMetadataAddr = addr("vkSetHdrMetadataEXT")
	private val getSwapchainStatusAddr = addr("vkGetSwapchainStatusKHR")
	private val importFenceWin32HandleAddr = addr("vkImportFenceWin32HandleKHR")
	private val getFenceWin32HandleAddr = addr("vkGetFenceWin32HandleKHR")
	private val importFenceFdAddr = addr("vkImportFenceFdKHR")
	private val getFenceFdAddr = addr("vkGetFenceFdKHR")
	private val acquireProfilingLockAddr = addr("vkAcquireProfilingLockKHR")
	private val releaseProfilingLockAddr = addr("vkReleaseProfilingLockKHR")
	private val setDebugUtilsObjectNameAddr = addr("vkSetDebugUtilsObjectNameEXT")
	private val setDebugUtilsObjectTagAddr = addr("vkSetDebugUtilsObjectTagEXT")
	private val queueBeginDebugUtilsLabelAddr = addr("vkQueueBeginDebugUtilsLabelEXT")
	private val queueEndDebugUtilsLabelAddr = addr("vkQueueEndDebugUtilsLabelEXT")
	private val queueInsertDebugUtilsLabelAddr = addr("vkQueueInsertDebugUtilsLabelEXT")
	private val cmdBeginDebugUtilsLabelAddr = addr("vkCmdBeginDebugUtilsLabelEXT")
	private val cmdEndDebugUtilsLabelAddr = addr("vkCmdEndDebugUtilsLabelEXT")
	private val cmdInsertDebugUtilsLabelAddr = addr("vkCmdInsertDebugUtilsLabelEXT")
	private val getAndroidHardwareBufferPropertiesAddr = addr("vkGetAndroidHardwareBufferPropertiesANDROID")
	private val getMemoryAndroidHardwareBufferAddr = addr("vkGetMemoryAndroidHardwareBufferANDROID")
	private val cmdSetSampleLocationsAddr = addr("vkCmdSetSampleLocationsEXT")
	private val createAccelerationStructureKHRAddr = addr("vkCreateAccelerationStructureKHR")
	private val destroyAccelerationStructureKHRAddr = addr("vkDestroyAccelerationStructureKHR")
	private val cmdBuildAccelerationStructuresAddr = addr("vkCmdBuildAccelerationStructuresKHR")
	private val cmdBuildAccelerationStructuresIndirectAddr = addr("vkCmdBuildAccelerationStructuresIndirectKHR")
	private val buildAccelerationStructuresAddr = addr("vkBuildAccelerationStructuresKHR")
	private val copyAccelerationStructureAddr = addr("vkCopyAccelerationStructureKHR")
	private val copyAccelerationStructureToMemoryAddr = addr("vkCopyAccelerationStructureToMemoryKHR")
	private val copyMemoryToAccelerationStructureAddr = addr("vkCopyMemoryToAccelerationStructureKHR")
	private val writeAccelerationStructuresPropertiesAddr = addr("vkWriteAccelerationStructuresPropertiesKHR")
	private val cmdCopyAccelerationStructureKHRAddr = addr("vkCmdCopyAccelerationStructureKHR")
	private val cmdCopyAccelerationStructureToMemoryAddr = addr("vkCmdCopyAccelerationStructureToMemoryKHR")
	private val cmdCopyMemoryToAccelerationStructureAddr = addr("vkCmdCopyMemoryToAccelerationStructureKHR")
	private val getAccelerationStructureDeviceAddressAddr = addr("vkGetAccelerationStructureDeviceAddressKHR")
	private val cmdWriteAccelerationStructuresPropertiesKHRAddr = addr("vkCmdWriteAccelerationStructuresPropertiesKHR")
	private val getDeviceAccelerationStructureCompatibilityAddr = addr("vkGetDeviceAccelerationStructureCompatibilityKHR")
	private val getAccelerationStructureBuildSizesAddr = addr("vkGetAccelerationStructureBuildSizesKHR")
	private val cmdTraceRaysKHRAddr = addr("vkCmdTraceRaysKHR")
	private val createRayTracingPipelinesKHRAddr = addr("vkCreateRayTracingPipelinesKHR")
	private val getRayTracingShaderGroupHandlesKHRAddr = addr("vkGetRayTracingShaderGroupHandlesKHR")
	private val getRayTracingCaptureReplayShaderGroupHandlesAddr = addr("vkGetRayTracingCaptureReplayShaderGroupHandlesKHR")
	private val cmdTraceRaysIndirectAddr = addr("vkCmdTraceRaysIndirectKHR")
	private val getRayTracingShaderGroupStackSizeAddr = addr("vkGetRayTracingShaderGroupStackSizeKHR")
	private val cmdSetRayTracingPipelineStackSizeAddr = addr("vkCmdSetRayTracingPipelineStackSizeKHR")
	private val getImageDrmFormatModifierPropertiesAddr = addr("vkGetImageDrmFormatModifierPropertiesEXT")
	private val createValidationCacheAddr = addr("vkCreateValidationCacheEXT")
	private val destroyValidationCacheAddr = addr("vkDestroyValidationCacheEXT")
	private val mergeValidationCachesAddr = addr("vkMergeValidationCachesEXT")
	private val getValidationCacheDataAddr = addr("vkGetValidationCacheDataEXT")
	private val cmdBindShadingRateImageAddr = addr("vkCmdBindShadingRateImageNV")
	private val cmdSetViewportShadingRatePaletteAddr = addr("vkCmdSetViewportShadingRatePaletteNV")
	private val cmdSetCoarseSampleOrderAddr = addr("vkCmdSetCoarseSampleOrderNV")
	private val createAccelerationStructureNVAddr = addr("vkCreateAccelerationStructureNV")
	private val destroyAccelerationStructureNVAddr = addr("vkDestroyAccelerationStructureNV")
	private val getAccelerationStructureMemoryRequirementsAddr = addr("vkGetAccelerationStructureMemoryRequirementsNV")
	private val bindAccelerationStructureMemoryAddr = addr("vkBindAccelerationStructureMemoryNV")
	private val cmdBuildAccelerationStructureAddr = addr("vkCmdBuildAccelerationStructureNV")
	private val cmdCopyAccelerationStructureNVAddr = addr("vkCmdCopyAccelerationStructureNV")
	private val cmdTraceRaysNVAddr = addr("vkCmdTraceRaysNV")
	private val createRayTracingPipelinesNVAddr = addr("vkCreateRayTracingPipelinesNV")
	private val getAccelerationStructureHandleAddr = addr("vkGetAccelerationStructureHandleNV")
	private val cmdWriteAccelerationStructuresPropertiesNVAddr = addr("vkCmdWriteAccelerationStructuresPropertiesNV")
	private val compileDeferredAddr = addr("vkCompileDeferredNV")
	private val getMemoryHostPointerPropertiesAddr = addr("vkGetMemoryHostPointerPropertiesEXT")
	private val cmdWriteBufferMarkerAddr = addr("vkCmdWriteBufferMarkerAMD")
	private val getCalibratedTimestampsAddr = addr("vkGetCalibratedTimestampsEXT")
	private val cmdDrawMeshTasksAddr = addr("vkCmdDrawMeshTasksNV")
	private val cmdDrawMeshTasksIndirectAddr = addr("vkCmdDrawMeshTasksIndirectNV")
	private val cmdDrawMeshTasksIndirectCountAddr = addr("vkCmdDrawMeshTasksIndirectCountNV")
	private val cmdSetExclusiveScissorAddr = addr("vkCmdSetExclusiveScissorNV")
	private val cmdSetCheckpointAddr = addr("vkCmdSetCheckpointNV")
	private val getQueueCheckpointDataAddr = addr("vkGetQueueCheckpointDataNV")
	private val initializePerformanceApiAddr = addr("vkInitializePerformanceApiINTEL")
	private val uninitializePerformanceApiAddr = addr("vkUninitializePerformanceApiINTEL")
	private val cmdSetPerformanceMarkerAddr = addr("vkCmdSetPerformanceMarkerINTEL")
	private val cmdSetPerformanceStreamMarkerAddr = addr("vkCmdSetPerformanceStreamMarkerINTEL")
	private val cmdSetPerformanceOverrideAddr = addr("vkCmdSetPerformanceOverrideINTEL")
	private val acquirePerformanceConfigurationAddr = addr("vkAcquirePerformanceConfigurationINTEL")
	private val releasePerformanceConfigurationAddr = addr("vkReleasePerformanceConfigurationINTEL")
	private val queueSetPerformanceConfigurationAddr = addr("vkQueueSetPerformanceConfigurationINTEL")
	private val getPerformanceParameterAddr = addr("vkGetPerformanceParameterINTEL")
	private val setLocalDimmingAddr = addr("vkSetLocalDimmingAMD")
	private val cmdSetFragmentShadingRateAddr = addr("vkCmdSetFragmentShadingRateKHR")
	private val acquireFullScreenExclusiveModeAddr = addr("vkAcquireFullScreenExclusiveModeEXT")
	private val releaseFullScreenExclusiveModeAddr = addr("vkReleaseFullScreenExclusiveModeEXT")
	private val getDeviceGroupSurfacePresentModes2Addr = addr("vkGetDeviceGroupSurfacePresentModes2EXT")
	private val cmdSetLineStippleAddr = addr("vkCmdSetLineStippleEXT")
	private val cmdSetCullModeAddr = addr("vkCmdSetCullModeEXT")
	private val cmdSetFrontFaceAddr = addr("vkCmdSetFrontFaceEXT")
	private val cmdSetPrimitiveTopologyAddr = addr("vkCmdSetPrimitiveTopologyEXT")
	private val cmdSetViewportWithCountAddr = addr("vkCmdSetViewportWithCountEXT")
	private val cmdSetScissorWithCountAddr = addr("vkCmdSetScissorWithCountEXT")
	private val cmdBindVertexBuffers2Addr = addr("vkCmdBindVertexBuffers2EXT")
	private val cmdSetDepthTestEnableAddr = addr("vkCmdSetDepthTestEnableEXT")
	private val cmdSetDepthWriteEnableAddr = addr("vkCmdSetDepthWriteEnableEXT")
	private val cmdSetDepthCompareOpAddr = addr("vkCmdSetDepthCompareOpEXT")
	private val cmdSetDepthBoundsTestEnableAddr = addr("vkCmdSetDepthBoundsTestEnableEXT")
	private val cmdSetStencilTestEnableAddr = addr("vkCmdSetStencilTestEnableEXT")
	private val cmdSetStencilOpAddr = addr("vkCmdSetStencilOpEXT")
	private val createDeferredOperationAddr = addr("vkCreateDeferredOperationKHR")
	private val destroyDeferredOperationAddr = addr("vkDestroyDeferredOperationKHR")
	private val getDeferredOperationMaxConcurrencyAddr = addr("vkGetDeferredOperationMaxConcurrencyKHR")
	private val getDeferredOperationResultAddr = addr("vkGetDeferredOperationResultKHR")
	private val deferredOperationJoinAddr = addr("vkDeferredOperationJoinKHR")
	private val getPipelineExecutablePropertiesAddr = addr("vkGetPipelineExecutablePropertiesKHR")
	private val getPipelineExecutableStatisticsAddr = addr("vkGetPipelineExecutableStatisticsKHR")
	private val getPipelineExecutableInternalRepresentationsAddr = addr("vkGetPipelineExecutableInternalRepresentationsKHR")
	private val getGeneratedCommandsMemoryRequirementsAddr = addr("vkGetGeneratedCommandsMemoryRequirementsNV")
	private val cmdPreprocessGeneratedCommandsAddr = addr("vkCmdPreprocessGeneratedCommandsNV")
	private val cmdExecuteGeneratedCommandsAddr = addr("vkCmdExecuteGeneratedCommandsNV")
	private val cmdBindPipelineShaderGroupAddr = addr("vkCmdBindPipelineShaderGroupNV")
	private val createIndirectCommandsLayoutAddr = addr("vkCreateIndirectCommandsLayoutNV")
	private val destroyIndirectCommandsLayoutAddr = addr("vkDestroyIndirectCommandsLayoutNV")
	private val createPrivateDataSlotAddr = addr("vkCreatePrivateDataSlotEXT")
	private val destroyPrivateDataSlotAddr = addr("vkDestroyPrivateDataSlotEXT")
	private val setPrivateDataAddr = addr("vkSetPrivateDataEXT")
	private val getPrivateDataAddr = addr("vkGetPrivateDataEXT")
	private val cmdSetEvent2Addr = addr("vkCmdSetEvent2KHR")
	private val cmdResetEvent2Addr = addr("vkCmdResetEvent2KHR")
	private val cmdWaitEvents2Addr = addr("vkCmdWaitEvents2KHR")
	private val cmdPipelineBarrier2Addr = addr("vkCmdPipelineBarrier2KHR")
	private val cmdWriteTimestamp2Addr = addr("vkCmdWriteTimestamp2KHR")
	private val queueSubmit2Addr = addr("vkQueueSubmit2KHR")
	private val cmdWriteBufferMarker2Addr = addr("vkCmdWriteBufferMarker2AMD")
	private val getQueueCheckpointData2Addr = addr("vkGetQueueCheckpointData2NV")
	private val cmdSetFragmentShadingRateEnumAddr = addr("vkCmdSetFragmentShadingRateEnumNV")
	private val cmdCopyBuffer2Addr = addr("vkCmdCopyBuffer2KHR")
	private val cmdCopyImage2Addr = addr("vkCmdCopyImage2KHR")
	private val cmdCopyBufferToImage2Addr = addr("vkCmdCopyBufferToImage2KHR")
	private val cmdCopyImageToBuffer2Addr = addr("vkCmdCopyImageToBuffer2KHR")
	private val cmdBlitImage2Addr = addr("vkCmdBlitImage2KHR")
	private val cmdResolveImage2Addr = addr("vkCmdResolveImage2KHR")
	private val getMemoryZirconHandleAddr = addr("vkGetMemoryZirconHandleFUCHSIA")
	private val getMemoryZirconHandlePropertiesAddr = addr("vkGetMemoryZirconHandlePropertiesFUCHSIA")
	private val importSemaphoreZirconHandleAddr = addr("vkImportSemaphoreZirconHandleFUCHSIA")
	private val getSemaphoreZirconHandleAddr = addr("vkGetSemaphoreZirconHandleFUCHSIA")
	init { stack.pop(frameIndex) }
	
	
	
	/*
	Device commands
	 */
	
	
	
	fun destroyDevice(pAllocator: AllocationCallbacks?) {
		Commands.destroyDevice(destroyDeviceAddr, device.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getDeviceQueue(queueFamilyIndex: Int, queueIndex: Int, pQueue: DirectLong) {
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
	
	
	
	fun allocateMemory(pAllocateInfo: MemoryAllocateInfo, pAllocator: AllocationCallbacks?, pMemory: DirectLong): Result {
		return Result(Commands.allocateMemory(allocateMemoryAddr, device.address, pAllocateInfo.address, pAllocator.addressOrNULL, pMemory.address))
	}
	
	
	
	fun freeMemory(memory: DeviceMemoryH?, pAllocator: AllocationCallbacks?) {
		Commands.freeMemory(freeMemoryAddr, device.address, memory.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun mapMemory(memory: DeviceMemoryH, offset: Long, size: Long, ppData: DirectLong): Result {
		return Result(Commands.mapMemory(mapMemoryAddr, device.address, memory.address, offset, size, 0, ppData.address))
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
	
	
	
	fun createFence(pCreateInfo: FenceCreateInfo, pAllocator: AllocationCallbacks?, pFence: DirectLong): Result {
		return Result(Commands.createFence(createFenceAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pFence.address))
	}
	
	
	
	fun destroyFence(fence: FenceH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyFence(destroyFenceAddr, device.address, fence.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun resetFences(fenceCount: Int, pFences: DirectLongBuffer): Result {
		return Result(Commands.resetFences(resetFencesAddr, device.address, fenceCount, pFences.address))
	}
	
	
	
	fun getFenceStatus(fence: FenceH): Result {
		return Result(Commands.getFenceStatus(getFenceStatusAddr, device.address, fence.address))
	}
	
	
	
	fun waitForFences(fenceCount: Int, pFences: DirectLongBuffer, waitAll: Int, timeout: Long): Result {
		return Result(Commands.waitForFences(waitForFencesAddr, device.address, fenceCount, pFences.address, waitAll, timeout))
	}
	
	
	
	fun createSemaphore(pCreateInfo: SemaphoreCreateInfo, pAllocator: AllocationCallbacks?, pSemaphore: DirectLong): Result {
		return Result(Commands.createSemaphore(createSemaphoreAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSemaphore.address))
	}
	
	
	
	fun destroySemaphore(semaphore: SemaphoreH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySemaphore(destroySemaphoreAddr, device.address, semaphore.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createEvent(pCreateInfo: EventCreateInfo, pAllocator: AllocationCallbacks?, pEvent: DirectLong): Result {
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
	
	
	
	fun createQueryPool(pCreateInfo: QueryPoolCreateInfo, pAllocator: AllocationCallbacks?, pQueryPool: DirectLong): Result {
		return Result(Commands.createQueryPool(createQueryPoolAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pQueryPool.address))
	}
	
	
	
	fun destroyQueryPool(queryPool: QueryPoolH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyQueryPool(destroyQueryPoolAddr, device.address, queryPool.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getQueryPoolResults(queryPool: QueryPoolH, firstQuery: Int, queryCount: Int, dataSize: Long, pData: DirectLong, stride: Long, flags: QueryResultFlags): Result {
		return Result(Commands.getQueryPoolResults(getQueryPoolResultsAddr, device.address, queryPool.address, firstQuery, queryCount, dataSize, pData.address, stride, flags.value))
	}
	
	
	
	fun createBuffer(pCreateInfo: BufferCreateInfo, pAllocator: AllocationCallbacks?, pBuffer: DirectLong): Result {
		return Result(Commands.createBuffer(createBufferAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pBuffer.address))
	}
	
	
	
	fun destroyBuffer(buffer: BufferH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyBuffer(destroyBufferAddr, device.address, buffer.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createBufferView(pCreateInfo: BufferViewCreateInfo, pAllocator: AllocationCallbacks?, pView: DirectLong): Result {
		return Result(Commands.createBufferView(createBufferViewAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pView.address))
	}
	
	
	
	fun destroyBufferView(bufferView: BufferViewH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyBufferView(destroyBufferViewAddr, device.address, bufferView.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createImage(pCreateInfo: ImageCreateInfo, pAllocator: AllocationCallbacks?, pImage: DirectLong): Result {
		return Result(Commands.createImage(createImageAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pImage.address))
	}
	
	
	
	fun destroyImage(image: ImageH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyImage(destroyImageAddr, device.address, image.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getImageSubresourceLayout(image: ImageH, pSubresource: ImageSubresource, pLayout: SubresourceLayout) {
		Commands.getImageSubresourceLayout(getImageSubresourceLayoutAddr, device.address, image.address, pSubresource.address, pLayout.address)
	}
	
	
	
	fun createImageView(pCreateInfo: ImageViewCreateInfo, pAllocator: AllocationCallbacks?, pView: DirectLong): Result {
		return Result(Commands.createImageView(createImageViewAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pView.address))
	}
	
	
	
	fun destroyImageView(imageView: ImageViewH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyImageView(destroyImageViewAddr, device.address, imageView.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createShaderModule(pCreateInfo: ShaderModuleCreateInfo, pAllocator: AllocationCallbacks?, pShaderModule: DirectLong): Result {
		return Result(Commands.createShaderModule(createShaderModuleAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pShaderModule.address))
	}
	
	
	
	fun destroyShaderModule(shaderModule: ShaderModuleH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyShaderModule(destroyShaderModuleAddr, device.address, shaderModule.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createPipelineCache(pCreateInfo: PipelineCacheCreateInfo, pAllocator: AllocationCallbacks?, pPipelineCache: DirectLong): Result {
		return Result(Commands.createPipelineCache(createPipelineCacheAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pPipelineCache.address))
	}
	
	
	
	fun destroyPipelineCache(pipelineCache: PipelineCacheH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyPipelineCache(destroyPipelineCacheAddr, device.address, pipelineCache.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getPipelineCacheData(pipelineCache: PipelineCacheH, pDataSize: DirectLong, pData: DirectLong?): Result {
		return Result(Commands.getPipelineCacheData(getPipelineCacheDataAddr, device.address, pipelineCache.address, pDataSize.address, pData.addressOrNULL))
	}
	
	
	
	fun mergePipelineCaches(dstCache: PipelineCacheH, srcCacheCount: Int, pSrcCaches: DirectLongBuffer): Result {
		return Result(Commands.mergePipelineCaches(mergePipelineCachesAddr, device.address, dstCache.address, srcCacheCount, pSrcCaches.address))
	}
	
	
	
	fun createGraphicsPipelines(pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: GraphicsPipelineCreateInfo.Buffer, pAllocator: AllocationCallbacks?, pPipelines: DirectLongBuffer): Result {
		return Result(Commands.createGraphicsPipelines(createGraphicsPipelinesAddr, device.address, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	
	
	fun createComputePipelines(pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: ComputePipelineCreateInfo.Buffer, pAllocator: AllocationCallbacks?, pPipelines: DirectLongBuffer): Result {
		return Result(Commands.createComputePipelines(createComputePipelinesAddr, device.address, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	
	
	fun destroyPipeline(pipeline: PipelineH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyPipeline(destroyPipelineAddr, device.address, pipeline.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createPipelineLayout(pCreateInfo: PipelineLayoutCreateInfo, pAllocator: AllocationCallbacks?, pPipelineLayout: DirectLong): Result {
		return Result(Commands.createPipelineLayout(createPipelineLayoutAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pPipelineLayout.address))
	}
	
	
	
	fun destroyPipelineLayout(pipelineLayout: PipelineLayoutH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyPipelineLayout(destroyPipelineLayoutAddr, device.address, pipelineLayout.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createSampler(pCreateInfo: SamplerCreateInfo, pAllocator: AllocationCallbacks?, pSampler: DirectLong): Result {
		return Result(Commands.createSampler(createSamplerAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSampler.address))
	}
	
	
	
	fun destroySampler(sampler: SamplerH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySampler(destroySamplerAddr, device.address, sampler.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createDescriptorSetLayout(pCreateInfo: DescriptorSetLayoutCreateInfo, pAllocator: AllocationCallbacks?, pSetLayout: DirectLong): Result {
		return Result(Commands.createDescriptorSetLayout(createDescriptorSetLayoutAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSetLayout.address))
	}
	
	
	
	fun destroyDescriptorSetLayout(descriptorSetLayout: DescriptorSetLayoutH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDescriptorSetLayout(destroyDescriptorSetLayoutAddr, device.address, descriptorSetLayout.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createDescriptorPool(pCreateInfo: DescriptorPoolCreateInfo, pAllocator: AllocationCallbacks?, pDescriptorPool: DirectLong): Result {
		return Result(Commands.createDescriptorPool(createDescriptorPoolAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pDescriptorPool.address))
	}
	
	
	
	fun destroyDescriptorPool(descriptorPool: DescriptorPoolH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDescriptorPool(destroyDescriptorPoolAddr, device.address, descriptorPool.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun resetDescriptorPool(descriptorPool: DescriptorPoolH): Result {
		return Result(Commands.resetDescriptorPool(resetDescriptorPoolAddr, device.address, descriptorPool.address, 0))
	}
	
	
	
	fun allocateDescriptorSets(pAllocateInfo: DescriptorSetAllocateInfo, pDescriptorSets: DirectLongBuffer): Result {
		return Result(Commands.allocateDescriptorSets(allocateDescriptorSetsAddr, device.address, pAllocateInfo.address, pDescriptorSets.address))
	}
	
	
	
	fun freeDescriptorSets(descriptorPool: DescriptorPoolH, descriptorSetCount: Int, pDescriptorSets: DirectLongBuffer): Result {
		return Result(Commands.freeDescriptorSets(freeDescriptorSetsAddr, device.address, descriptorPool.address, descriptorSetCount, pDescriptorSets.address))
	}
	
	
	
	fun updateDescriptorSets(descriptorWriteCount: Int, pDescriptorWrites: WriteDescriptorSet.Buffer, descriptorCopyCount: Int, pDescriptorCopies: CopyDescriptorSet.Buffer) {
		Commands.updateDescriptorSets(updateDescriptorSetsAddr, device.address, descriptorWriteCount, pDescriptorWrites.address, descriptorCopyCount, pDescriptorCopies.address)
	}
	
	
	
	fun createFramebuffer(pCreateInfo: FramebufferCreateInfo, pAllocator: AllocationCallbacks?, pFramebuffer: DirectLong): Result {
		return Result(Commands.createFramebuffer(createFramebufferAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pFramebuffer.address))
	}
	
	
	
	fun destroyFramebuffer(framebuffer: FramebufferH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyFramebuffer(destroyFramebufferAddr, device.address, framebuffer.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createRenderPass(pCreateInfo: RenderPassCreateInfo, pAllocator: AllocationCallbacks?, pRenderPass: DirectLong): Result {
		return Result(Commands.createRenderPass(createRenderPassAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pRenderPass.address))
	}
	
	
	
	fun destroyRenderPass(renderPass: RenderPassH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyRenderPass(destroyRenderPassAddr, device.address, renderPass.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getRenderAreaGranularity(renderPass: RenderPassH, pGranularity: Extent2D) {
		Commands.getRenderAreaGranularity(getRenderAreaGranularityAddr, device.address, renderPass.address, pGranularity.address)
	}
	
	
	
	fun createCommandPool(pCreateInfo: CommandPoolCreateInfo, pAllocator: AllocationCallbacks?, pCommandPool: DirectLong): Result {
		return Result(Commands.createCommandPool(createCommandPoolAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pCommandPool.address))
	}
	
	
	
	fun destroyCommandPool(commandPool: CommandPoolH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyCommandPool(destroyCommandPoolAddr, device.address, commandPool.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun resetCommandPool(commandPool: CommandPoolH, flags: CommandPoolResetFlags): Result {
		return Result(Commands.resetCommandPool(resetCommandPoolAddr, device.address, commandPool.address, flags.value))
	}
	
	
	
	fun allocateCommandBuffers(pAllocateInfo: CommandBufferAllocateInfo, pCommandBuffers: DirectLongBuffer): Result {
		return Result(Commands.allocateCommandBuffers(allocateCommandBuffersAddr, device.address, pAllocateInfo.address, pCommandBuffers.address))
	}
	
	
	
	fun freeCommandBuffers(commandPool: CommandPoolH, commandBufferCount: Int, pCommandBuffers: DirectLongBuffer) {
		Commands.freeCommandBuffers(freeCommandBuffersAddr, device.address, commandPool.address, commandBufferCount, pCommandBuffers.address)
	}
	
	
	
	fun beginCommandBuffer(commandBuffer: CommandBufferH, pBeginInfo: CommandBufferBeginInfo): Result {
		return Result(Commands.beginCommandBuffer(beginCommandBufferAddr, commandBuffer.address, pBeginInfo.address))
	}
	
	
	
	fun endCommandBuffer(commandBuffer: CommandBufferH): Result {
		return Result(Commands.endCommandBuffer(endCommandBufferAddr, commandBuffer.address))
	}
	
	
	
	fun resetCommandBuffer(commandBuffer: CommandBufferH, flags: CommandBufferResetFlags): Result {
		return Result(Commands.resetCommandBuffer(resetCommandBufferAddr, commandBuffer.address, flags.value))
	}
	
	
	
	fun cmdBindPipeline(commandBuffer: CommandBufferH, pipelineBindPoint: PipelineBindPoint, pipeline: PipelineH) {
		Commands.cmdBindPipeline(cmdBindPipelineAddr, commandBuffer.address, pipelineBindPoint.value, pipeline.address)
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
		Commands.cmdSetStencilCompareMask(cmdSetStencilCompareMaskAddr, commandBuffer.address, faceMask.value, compareMask)
	}
	
	
	
	fun cmdSetStencilWriteMask(commandBuffer: CommandBufferH, faceMask: StencilFaceFlags, writeMask: Int) {
		Commands.cmdSetStencilWriteMask(cmdSetStencilWriteMaskAddr, commandBuffer.address, faceMask.value, writeMask)
	}
	
	
	
	fun cmdSetStencilReference(commandBuffer: CommandBufferH, faceMask: StencilFaceFlags, reference: Int) {
		Commands.cmdSetStencilReference(cmdSetStencilReferenceAddr, commandBuffer.address, faceMask.value, reference)
	}
	
	
	
	fun cmdBindDescriptorSets(commandBuffer: CommandBufferH, pipelineBindPoint: PipelineBindPoint, layout: PipelineLayoutH, firstSet: Int, descriptorSetCount: Int, pDescriptorSets: DirectLongBuffer, dynamicOffsetCount: Int, pDynamicOffsets: DirectIntBuffer) {
		Commands.cmdBindDescriptorSets(cmdBindDescriptorSetsAddr, commandBuffer.address, pipelineBindPoint.value, layout.address, firstSet, descriptorSetCount, pDescriptorSets.address, dynamicOffsetCount, pDynamicOffsets.address)
	}
	
	
	
	fun cmdBindIndexBuffer(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, indexType: IndexType) {
		Commands.cmdBindIndexBuffer(cmdBindIndexBufferAddr, commandBuffer.address, buffer.address, offset, indexType.value)
	}
	
	
	
	fun cmdBindVertexBuffers(commandBuffer: CommandBufferH, firstBinding: Int, bindingCount: Int, pBuffers: DirectLongBuffer, pOffsets: DirectLongBuffer) {
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
		Commands.cmdCopyImage(cmdCopyImageAddr, commandBuffer.address, srcImage.address, srcImageLayout.value, dstImage.address, dstImageLayout.value, regionCount, pRegions.address)
	}
	
	
	
	fun cmdBlitImage(commandBuffer: CommandBufferH, srcImage: ImageH, srcImageLayout: ImageLayout, dstImage: ImageH, dstImageLayout: ImageLayout, regionCount: Int, pRegions: ImageBlit.Buffer, filter: Filter) {
		Commands.cmdBlitImage(cmdBlitImageAddr, commandBuffer.address, srcImage.address, srcImageLayout.value, dstImage.address, dstImageLayout.value, regionCount, pRegions.address, filter.value)
	}
	
	
	
	fun cmdCopyBufferToImage(commandBuffer: CommandBufferH, srcBuffer: BufferH, dstImage: ImageH, dstImageLayout: ImageLayout, regionCount: Int, pRegions: BufferImageCopy.Buffer) {
		Commands.cmdCopyBufferToImage(cmdCopyBufferToImageAddr, commandBuffer.address, srcBuffer.address, dstImage.address, dstImageLayout.value, regionCount, pRegions.address)
	}
	
	
	
	fun cmdCopyImageToBuffer(commandBuffer: CommandBufferH, srcImage: ImageH, srcImageLayout: ImageLayout, dstBuffer: BufferH, regionCount: Int, pRegions: BufferImageCopy.Buffer) {
		Commands.cmdCopyImageToBuffer(cmdCopyImageToBufferAddr, commandBuffer.address, srcImage.address, srcImageLayout.value, dstBuffer.address, regionCount, pRegions.address)
	}
	
	
	
	fun cmdUpdateBuffer(commandBuffer: CommandBufferH, dstBuffer: BufferH, dstOffset: Long, dataSize: Long, pData: DirectLong) {
		Commands.cmdUpdateBuffer(cmdUpdateBufferAddr, commandBuffer.address, dstBuffer.address, dstOffset, dataSize, pData.address)
	}
	
	
	
	fun cmdFillBuffer(commandBuffer: CommandBufferH, dstBuffer: BufferH, dstOffset: Long, size: Long, data: Int) {
		Commands.cmdFillBuffer(cmdFillBufferAddr, commandBuffer.address, dstBuffer.address, dstOffset, size, data)
	}
	
	
	
	fun cmdClearColorImage(commandBuffer: CommandBufferH, image: ImageH, imageLayout: ImageLayout, pColor: ClearColorValue, rangeCount: Int, pRanges: ImageSubresourceRange.Buffer) {
		Commands.cmdClearColorImage(cmdClearColorImageAddr, commandBuffer.address, image.address, imageLayout.value, pColor.address, rangeCount, pRanges.address)
	}
	
	
	
	fun cmdClearDepthStencilImage(commandBuffer: CommandBufferH, image: ImageH, imageLayout: ImageLayout, pDepthStencil: ClearDepthStencilValue, rangeCount: Int, pRanges: ImageSubresourceRange.Buffer) {
		Commands.cmdClearDepthStencilImage(cmdClearDepthStencilImageAddr, commandBuffer.address, image.address, imageLayout.value, pDepthStencil.address, rangeCount, pRanges.address)
	}
	
	
	
	fun cmdClearAttachments(commandBuffer: CommandBufferH, attachmentCount: Int, pAttachments: ClearAttachment.Buffer, rectCount: Int, pRects: ClearRect.Buffer) {
		Commands.cmdClearAttachments(cmdClearAttachmentsAddr, commandBuffer.address, attachmentCount, pAttachments.address, rectCount, pRects.address)
	}
	
	
	
	fun cmdResolveImage(commandBuffer: CommandBufferH, srcImage: ImageH, srcImageLayout: ImageLayout, dstImage: ImageH, dstImageLayout: ImageLayout, regionCount: Int, pRegions: ImageResolve.Buffer) {
		Commands.cmdResolveImage(cmdResolveImageAddr, commandBuffer.address, srcImage.address, srcImageLayout.value, dstImage.address, dstImageLayout.value, regionCount, pRegions.address)
	}
	
	
	
	fun cmdSetEvent(commandBuffer: CommandBufferH, event: EventH, stageMask: PipelineStageFlags) {
		Commands.cmdSetEvent(cmdSetEventAddr, commandBuffer.address, event.address, stageMask.value)
	}
	
	
	
	fun cmdResetEvent(commandBuffer: CommandBufferH, event: EventH, stageMask: PipelineStageFlags) {
		Commands.cmdResetEvent(cmdResetEventAddr, commandBuffer.address, event.address, stageMask.value)
	}
	
	
	
	fun cmdWaitEvents(commandBuffer: CommandBufferH, eventCount: Int, pEvents: DirectLongBuffer, srcStageMask: PipelineStageFlags, dstStageMask: PipelineStageFlags, memoryBarrierCount: Int, pMemoryBarriers: MemoryBarrier.Buffer, bufferMemoryBarrierCount: Int, pBufferMemoryBarriers: BufferMemoryBarrier.Buffer, imageMemoryBarrierCount: Int, pImageMemoryBarriers: ImageMemoryBarrier.Buffer) {
		Commands.cmdWaitEvents(cmdWaitEventsAddr, commandBuffer.address, eventCount, pEvents.address, srcStageMask.value, dstStageMask.value, memoryBarrierCount, pMemoryBarriers.address, bufferMemoryBarrierCount, pBufferMemoryBarriers.address, imageMemoryBarrierCount, pImageMemoryBarriers.address)
	}
	
	
	
	fun cmdPipelineBarrier(commandBuffer: CommandBufferH, srcStageMask: PipelineStageFlags, dstStageMask: PipelineStageFlags, dependencyFlags: DependencyFlags, memoryBarrierCount: Int, pMemoryBarriers: MemoryBarrier.Buffer, bufferMemoryBarrierCount: Int, pBufferMemoryBarriers: BufferMemoryBarrier.Buffer, imageMemoryBarrierCount: Int, pImageMemoryBarriers: ImageMemoryBarrier.Buffer) {
		Commands.cmdPipelineBarrier(cmdPipelineBarrierAddr, commandBuffer.address, srcStageMask.value, dstStageMask.value, dependencyFlags.value, memoryBarrierCount, pMemoryBarriers.address, bufferMemoryBarrierCount, pBufferMemoryBarriers.address, imageMemoryBarrierCount, pImageMemoryBarriers.address)
	}
	
	
	
	fun cmdBeginQuery(commandBuffer: CommandBufferH, queryPool: QueryPoolH, query: Int, flags: QueryControlFlags) {
		Commands.cmdBeginQuery(cmdBeginQueryAddr, commandBuffer.address, queryPool.address, query, flags.value)
	}
	
	
	
	fun cmdEndQuery(commandBuffer: CommandBufferH, queryPool: QueryPoolH, query: Int) {
		Commands.cmdEndQuery(cmdEndQueryAddr, commandBuffer.address, queryPool.address, query)
	}
	
	
	
	fun cmdResetQueryPool(commandBuffer: CommandBufferH, queryPool: QueryPoolH, firstQuery: Int, queryCount: Int) {
		Commands.cmdResetQueryPool(cmdResetQueryPoolAddr, commandBuffer.address, queryPool.address, firstQuery, queryCount)
	}
	
	
	
	fun cmdWriteTimestamp(commandBuffer: CommandBufferH, pipelineStage: PipelineStageFlags, queryPool: QueryPoolH, query: Int) {
		Commands.cmdWriteTimestamp(cmdWriteTimestampAddr, commandBuffer.address, pipelineStage.value, queryPool.address, query)
	}
	
	
	
	fun cmdCopyQueryPoolResults(commandBuffer: CommandBufferH, queryPool: QueryPoolH, firstQuery: Int, queryCount: Int, dstBuffer: BufferH, dstOffset: Long, stride: Long, flags: QueryResultFlags) {
		Commands.cmdCopyQueryPoolResults(cmdCopyQueryPoolResultsAddr, commandBuffer.address, queryPool.address, firstQuery, queryCount, dstBuffer.address, dstOffset, stride, flags.value)
	}
	
	
	
	fun cmdPushConstants(commandBuffer: CommandBufferH, layout: PipelineLayoutH, stageFlags: ShaderStageFlags, offset: Int, size: Int, pValues: DirectLong) {
		Commands.cmdPushConstants(cmdPushConstantsAddr, commandBuffer.address, layout.address, stageFlags.value, offset, size, pValues.address)
	}
	
	
	
	fun cmdBeginRenderPass(commandBuffer: CommandBufferH, pRenderPassBegin: RenderPassBeginInfo, contents: SubpassContents) {
		Commands.cmdBeginRenderPass(cmdBeginRenderPassAddr, commandBuffer.address, pRenderPassBegin.address, contents.value)
	}
	
	
	
	fun cmdNextSubpass(commandBuffer: CommandBufferH, contents: SubpassContents) {
		Commands.cmdNextSubpass(cmdNextSubpassAddr, commandBuffer.address, contents.value)
	}
	
	
	
	fun cmdEndRenderPass(commandBuffer: CommandBufferH) {
		Commands.cmdEndRenderPass(cmdEndRenderPassAddr, commandBuffer.address)
	}
	
	
	
	fun cmdExecuteCommands(commandBuffer: CommandBufferH, commandBufferCount: Int, pCommandBuffers: DirectLongBuffer) {
		Commands.cmdExecuteCommands(cmdExecuteCommandsAddr, commandBuffer.address, commandBufferCount, pCommandBuffers.address)
	}
	
	
	
	fun bindBufferMemory2(bindInfoCount: Int, pBindInfos: BindBufferMemoryInfo.Buffer): Result {
		return Result(Commands.bindBufferMemory2(bindBufferMemory2Addr, device.address, bindInfoCount, pBindInfos.address))
	}
	
	
	
	fun bindImageMemory2(bindInfoCount: Int, pBindInfos: BindImageMemoryInfo.Buffer): Result {
		return Result(Commands.bindImageMemory2(bindImageMemory2Addr, device.address, bindInfoCount, pBindInfos.address))
	}
	
	
	
	fun getDeviceGroupPeerMemoryFeatures(heapIndex: Int, localDeviceIndex: Int, remoteDeviceIndex: Int, pPeerMemoryFeatures: DirectLong) {
		Commands.getDeviceGroupPeerMemoryFeatures(getDeviceGroupPeerMemoryFeaturesAddr, device.address, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures.address)
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
	
	
	
	fun trimCommandPool(commandPool: CommandPoolH) {
		Commands.trimCommandPool(trimCommandPoolAddr, device.address, commandPool.address, 0)
	}
	
	
	
	fun getDeviceQueue2(pQueueInfo: DeviceQueueInfo2, pQueue: DirectLong) {
		Commands.getDeviceQueue2(getDeviceQueue2Addr, device.address, pQueueInfo.address, pQueue.address)
	}
	
	
	
	fun createSamplerYcbcrConversion(pCreateInfo: SamplerYcbcrConversionCreateInfo, pAllocator: AllocationCallbacks?, pYcbcrConversion: DirectLong): Result {
		return Result(Commands.createSamplerYcbcrConversion(createSamplerYcbcrConversionAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pYcbcrConversion.address))
	}
	
	
	
	fun destroySamplerYcbcrConversion(ycbcrConversion: SamplerYcbcrConversionH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySamplerYcbcrConversion(destroySamplerYcbcrConversionAddr, device.address, ycbcrConversion.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createDescriptorUpdateTemplate(pCreateInfo: DescriptorUpdateTemplateCreateInfo, pAllocator: AllocationCallbacks?, pDescriptorUpdateTemplate: DirectLong): Result {
		return Result(Commands.createDescriptorUpdateTemplate(createDescriptorUpdateTemplateAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pDescriptorUpdateTemplate.address))
	}
	
	
	
	fun destroyDescriptorUpdateTemplate(descriptorUpdateTemplate: DescriptorUpdateTemplateH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDescriptorUpdateTemplate(destroyDescriptorUpdateTemplateAddr, device.address, descriptorUpdateTemplate.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun updateDescriptorSetWithTemplate(descriptorSet: DescriptorSetH, descriptorUpdateTemplate: DescriptorUpdateTemplateH, pData: DirectLong) {
		Commands.updateDescriptorSetWithTemplate(updateDescriptorSetWithTemplateAddr, device.address, descriptorSet.address, descriptorUpdateTemplate.address, pData.address)
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
	
	
	
	fun createRenderPass2(pCreateInfo: RenderPassCreateInfo2, pAllocator: AllocationCallbacks?, pRenderPass: DirectLong): Result {
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
	
	
	
	fun createSwapchain(pCreateInfo: SwapchainCreateInfo, pAllocator: AllocationCallbacks?, pSwapchain: DirectLong): Result {
		return Result(Commands.createSwapchain(createSwapchainAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pSwapchain.address))
	}
	
	
	
	fun destroySwapchain(swapchain: SwapchainH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySwapchain(destroySwapchainAddr, device.address, swapchain.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getSwapchainImages(swapchain: SwapchainH, pSwapchainImageCount: DirectInt, pSwapchainImages: DirectLongBuffer?): Result {
		return Result(Commands.getSwapchainImages(getSwapchainImagesAddr, device.address, swapchain.address, pSwapchainImageCount.address, pSwapchainImages.addressOrNULL))
	}
	
	
	
	fun acquireNextImage(swapchain: SwapchainH, timeout: Long, semaphore: SemaphoreH?, fence: FenceH?, pImageIndex: DirectInt): Result {
		return Result(Commands.acquireNextImage(acquireNextImageAddr, device.address, swapchain.address, timeout, semaphore.addressOrNULL, fence.addressOrNULL, pImageIndex.address))
	}
	
	
	
	fun queuePresent(queue: QueueH, pPresentInfo: PresentInfo): Result {
		return Result(Commands.queuePresent(queuePresentAddr, queue.address, pPresentInfo.address))
	}
	
	
	
	fun getDeviceGroupPresentCapabilities(pDeviceGroupPresentCapabilities: DeviceGroupPresentCapabilities): Result {
		return Result(Commands.getDeviceGroupPresentCapabilities(getDeviceGroupPresentCapabilitiesAddr, device.address, pDeviceGroupPresentCapabilities.address))
	}
	
	
	
	fun getDeviceGroupSurfacePresentModes(surface: SurfaceH, pModes: DirectLong): Result {
		return Result(Commands.getDeviceGroupSurfacePresentModes(getDeviceGroupSurfacePresentModesAddr, device.address, surface.address, pModes.address))
	}
	
	
	
	fun acquireNextImage2(pAcquireInfo: AcquireNextImageInfo, pImageIndex: DirectInt): Result {
		return Result(Commands.acquireNextImage2(acquireNextImage2Addr, device.address, pAcquireInfo.address, pImageIndex.address))
	}
	
	
	
	fun createSharedSwapchains(swapchainCount: Int, pCreateInfos: SwapchainCreateInfo.Buffer, pAllocator: AllocationCallbacks?, pSwapchains: DirectLongBuffer): Result {
		return Result(Commands.createSharedSwapchains(createSharedSwapchainsAddr, device.address, swapchainCount, pCreateInfos.address, pAllocator.addressOrNULL, pSwapchains.address))
	}
	
	
	
	fun cmdBindTransformFeedbackBuffers(commandBuffer: CommandBufferH, firstBinding: Int, bindingCount: Int, pBuffers: DirectLongBuffer, pOffsets: DirectLongBuffer, pSizes: DirectLongBuffer?) {
		Commands.cmdBindTransformFeedbackBuffers(cmdBindTransformFeedbackBuffersAddr, commandBuffer.address, firstBinding, bindingCount, pBuffers.address, pOffsets.address, pSizes.addressOrNULL)
	}
	
	
	
	fun cmdBeginTransformFeedback(commandBuffer: CommandBufferH, firstCounterBuffer: Int, counterBufferCount: Int, pCounterBuffers: DirectLongBuffer, pCounterBufferOffsets: DirectLongBuffer?) {
		Commands.cmdBeginTransformFeedback(cmdBeginTransformFeedbackAddr, commandBuffer.address, firstCounterBuffer, counterBufferCount, pCounterBuffers.address, pCounterBufferOffsets.addressOrNULL)
	}
	
	
	
	fun cmdEndTransformFeedback(commandBuffer: CommandBufferH, firstCounterBuffer: Int, counterBufferCount: Int, pCounterBuffers: DirectLongBuffer, pCounterBufferOffsets: DirectLongBuffer?) {
		Commands.cmdEndTransformFeedback(cmdEndTransformFeedbackAddr, commandBuffer.address, firstCounterBuffer, counterBufferCount, pCounterBuffers.address, pCounterBufferOffsets.addressOrNULL)
	}
	
	
	
	fun cmdBeginQueryIndexed(commandBuffer: CommandBufferH, queryPool: QueryPoolH, query: Int, flags: QueryControlFlags, index: Int) {
		Commands.cmdBeginQueryIndexed(cmdBeginQueryIndexedAddr, commandBuffer.address, queryPool.address, query, flags.value, index)
	}
	
	
	
	fun cmdEndQueryIndexed(commandBuffer: CommandBufferH, queryPool: QueryPoolH, query: Int, index: Int) {
		Commands.cmdEndQueryIndexed(cmdEndQueryIndexedAddr, commandBuffer.address, queryPool.address, query, index)
	}
	
	
	
	fun cmdDrawIndirectByteCount(commandBuffer: CommandBufferH, instanceCount: Int, firstInstance: Int, counterBuffer: BufferH, counterBufferOffset: Long, counterOffset: Int, vertexStride: Int) {
		Commands.cmdDrawIndirectByteCount(cmdDrawIndirectByteCountAddr, commandBuffer.address, instanceCount, firstInstance, counterBuffer.address, counterBufferOffset, counterOffset, vertexStride)
	}
	
	
	
	fun getImageViewHandle(pInfo: ImageViewHandleInfo): Int {
		return Commands.getImageViewHandle(getImageViewHandleAddr, device.address, pInfo.address)
	}
	
	
	
	fun getImageViewAddress(imageView: ImageViewH, pProperties: ImageViewAddressProperties): Result {
		return Result(Commands.getImageViewAddress(getImageViewAddressAddr, device.address, imageView.address, pProperties.address))
	}
	
	
	
	fun getShaderInfo(pipeline: PipelineH, shaderStage: ShaderStageFlags, infoType: ShaderInfoType, pInfoSize: DirectLong, pInfo: DirectLong?): Result {
		return Result(Commands.getShaderInfo(getShaderInfoAddr, device.address, pipeline.address, shaderStage.value, infoType.value, pInfoSize.address, pInfo.addressOrNULL))
	}
	
	
	
	fun getMemoryWin32Handle(pGetWin32HandleInfo: MemoryGetWin32HandleInfo, pHandle: DirectLong): Result {
		return Result(Commands.getMemoryWin32Handle(getMemoryWin32HandleAddr, device.address, pGetWin32HandleInfo.address, pHandle.address))
	}
	
	
	
	fun getMemoryWin32HandleProperties(handleType: ExternalMemoryHandleTypeFlags, handle: Long, pMemoryWin32HandleProperties: MemoryWin32HandleProperties): Result {
		return Result(Commands.getMemoryWin32HandleProperties(getMemoryWin32HandlePropertiesAddr, device.address, handleType.value, handle, pMemoryWin32HandleProperties.address))
	}
	
	
	
	fun getMemoryFd(pGetFdInfo: MemoryGetFdInfo, pFd: DirectInt): Result {
		return Result(Commands.getMemoryFd(getMemoryFdAddr, device.address, pGetFdInfo.address, pFd.address))
	}
	
	
	
	fun getMemoryFdProperties(handleType: ExternalMemoryHandleTypeFlags, fd: Int, pMemoryFdProperties: MemoryFdProperties): Result {
		return Result(Commands.getMemoryFdProperties(getMemoryFdPropertiesAddr, device.address, handleType.value, fd, pMemoryFdProperties.address))
	}
	
	
	
	fun importSemaphoreWin32Handle(pImportSemaphoreWin32HandleInfo: ImportSemaphoreWin32HandleInfo): Result {
		return Result(Commands.importSemaphoreWin32Handle(importSemaphoreWin32HandleAddr, device.address, pImportSemaphoreWin32HandleInfo.address))
	}
	
	
	
	fun getSemaphoreWin32Handle(pGetWin32HandleInfo: SemaphoreGetWin32HandleInfo, pHandle: DirectLong): Result {
		return Result(Commands.getSemaphoreWin32Handle(getSemaphoreWin32HandleAddr, device.address, pGetWin32HandleInfo.address, pHandle.address))
	}
	
	
	
	fun importSemaphoreFd(pImportSemaphoreFdInfo: ImportSemaphoreFdInfo): Result {
		return Result(Commands.importSemaphoreFd(importSemaphoreFdAddr, device.address, pImportSemaphoreFdInfo.address))
	}
	
	
	
	fun getSemaphoreFd(pGetFdInfo: SemaphoreGetFdInfo, pFd: DirectInt): Result {
		return Result(Commands.getSemaphoreFd(getSemaphoreFdAddr, device.address, pGetFdInfo.address, pFd.address))
	}
	
	
	
	fun cmdPushDescriptorSet(commandBuffer: CommandBufferH, pipelineBindPoint: PipelineBindPoint, layout: PipelineLayoutH, set: Int, descriptorWriteCount: Int, pDescriptorWrites: WriteDescriptorSet.Buffer) {
		Commands.cmdPushDescriptorSet(cmdPushDescriptorSetAddr, commandBuffer.address, pipelineBindPoint.value, layout.address, set, descriptorWriteCount, pDescriptorWrites.address)
	}
	
	
	
	fun cmdPushDescriptorSetWithTemplate(commandBuffer: CommandBufferH, descriptorUpdateTemplate: DescriptorUpdateTemplateH, layout: PipelineLayoutH, set: Int, pData: DirectLong) {
		Commands.cmdPushDescriptorSetWithTemplate(cmdPushDescriptorSetWithTemplateAddr, commandBuffer.address, descriptorUpdateTemplate.address, layout.address, set, pData.address)
	}
	
	
	
	fun cmdBeginConditionalRendering(commandBuffer: CommandBufferH, pConditionalRenderingBegin: ConditionalRenderingBeginInfo) {
		Commands.cmdBeginConditionalRendering(cmdBeginConditionalRenderingAddr, commandBuffer.address, pConditionalRenderingBegin.address)
	}
	
	
	
	fun cmdEndConditionalRendering(commandBuffer: CommandBufferH) {
		Commands.cmdEndConditionalRendering(cmdEndConditionalRenderingAddr, commandBuffer.address)
	}
	
	
	
	fun cmdSetViewportWScaling(commandBuffer: CommandBufferH, firstViewport: Int, viewportCount: Int, pViewportWScalings: ViewportWScaling.Buffer) {
		Commands.cmdSetViewportWScaling(cmdSetViewportWScalingAddr, commandBuffer.address, firstViewport, viewportCount, pViewportWScalings.address)
	}
	
	
	
	fun displayPowerControl(display: DisplayH, pDisplayPowerInfo: DisplayPowerInfo): Result {
		return Result(Commands.displayPowerControl(displayPowerControlAddr, device.address, display.address, pDisplayPowerInfo.address))
	}
	
	
	
	fun registerDeviceEvent(pDeviceEventInfo: DeviceEventInfo, pAllocator: AllocationCallbacks?, pFence: DirectLong): Result {
		return Result(Commands.registerDeviceEvent(registerDeviceEventAddr, device.address, pDeviceEventInfo.address, pAllocator.addressOrNULL, pFence.address))
	}
	
	
	
	fun registerDisplayEvent(display: DisplayH, pDisplayEventInfo: DisplayEventInfo, pAllocator: AllocationCallbacks?, pFence: DirectLong): Result {
		return Result(Commands.registerDisplayEvent(registerDisplayEventAddr, device.address, display.address, pDisplayEventInfo.address, pAllocator.addressOrNULL, pFence.address))
	}
	
	
	
	fun getSwapchainCounter(swapchain: SwapchainH, counter: SurfaceCounterFlags, pCounterValue: DirectLong): Result {
		return Result(Commands.getSwapchainCounter(getSwapchainCounterAddr, device.address, swapchain.address, counter.value, pCounterValue.address))
	}
	
	
	
	fun getRefreshCycleDuration(swapchain: SwapchainH, pDisplayTimingProperties: RefreshCycleDuration): Result {
		return Result(Commands.getRefreshCycleDuration(getRefreshCycleDurationAddr, device.address, swapchain.address, pDisplayTimingProperties.address))
	}
	
	
	
	fun getPastPresentationTiming(swapchain: SwapchainH, pPresentationTimingCount: DirectInt, pPresentationTimings: PastPresentationTiming.Buffer?): Result {
		return Result(Commands.getPastPresentationTiming(getPastPresentationTimingAddr, device.address, swapchain.address, pPresentationTimingCount.address, pPresentationTimings.addressOrNULL))
	}
	
	
	
	fun cmdSetDiscardRectangle(commandBuffer: CommandBufferH, firstDiscardRectangle: Int, discardRectangleCount: Int, pDiscardRectangles: Rect2D.Buffer) {
		Commands.cmdSetDiscardRectangle(cmdSetDiscardRectangleAddr, commandBuffer.address, firstDiscardRectangle, discardRectangleCount, pDiscardRectangles.address)
	}
	
	
	
	fun setHdrMetadata(swapchainCount: Int, pSwapchains: DirectLongBuffer, pMetadata: HdrMetadata.Buffer) {
		Commands.setHdrMetadata(setHdrMetadataAddr, device.address, swapchainCount, pSwapchains.address, pMetadata.address)
	}
	
	
	
	fun getSwapchainStatus(swapchain: SwapchainH): Result {
		return Result(Commands.getSwapchainStatus(getSwapchainStatusAddr, device.address, swapchain.address))
	}
	
	
	
	fun importFenceWin32Handle(pImportFenceWin32HandleInfo: ImportFenceWin32HandleInfo): Result {
		return Result(Commands.importFenceWin32Handle(importFenceWin32HandleAddr, device.address, pImportFenceWin32HandleInfo.address))
	}
	
	
	
	fun getFenceWin32Handle(pGetWin32HandleInfo: FenceGetWin32HandleInfo, pHandle: DirectLong): Result {
		return Result(Commands.getFenceWin32Handle(getFenceWin32HandleAddr, device.address, pGetWin32HandleInfo.address, pHandle.address))
	}
	
	
	
	fun importFenceFd(pImportFenceFdInfo: ImportFenceFdInfo): Result {
		return Result(Commands.importFenceFd(importFenceFdAddr, device.address, pImportFenceFdInfo.address))
	}
	
	
	
	fun getFenceFd(pGetFdInfo: FenceGetFdInfo, pFd: DirectInt): Result {
		return Result(Commands.getFenceFd(getFenceFdAddr, device.address, pGetFdInfo.address, pFd.address))
	}
	
	
	
	fun acquireProfilingLock(pInfo: AcquireProfilingLockInfo): Result {
		return Result(Commands.acquireProfilingLock(acquireProfilingLockAddr, device.address, pInfo.address))
	}
	
	
	
	fun releaseProfilingLock() {
		Commands.releaseProfilingLock(releaseProfilingLockAddr, device.address)
	}
	
	
	
	fun setDebugUtilsObjectName(pNameInfo: DebugUtilsObjectNameInfo): Result {
		return Result(Commands.setDebugUtilsObjectName(setDebugUtilsObjectNameAddr, device.address, pNameInfo.address))
	}
	
	
	
	fun setDebugUtilsObjectTag(pTagInfo: DebugUtilsObjectTagInfo): Result {
		return Result(Commands.setDebugUtilsObjectTag(setDebugUtilsObjectTagAddr, device.address, pTagInfo.address))
	}
	
	
	
	fun queueBeginDebugUtilsLabel(queue: QueueH, pLabelInfo: DebugUtilsLabel) {
		Commands.queueBeginDebugUtilsLabel(queueBeginDebugUtilsLabelAddr, queue.address, pLabelInfo.address)
	}
	
	
	
	fun queueEndDebugUtilsLabel(queue: QueueH) {
		Commands.queueEndDebugUtilsLabel(queueEndDebugUtilsLabelAddr, queue.address)
	}
	
	
	
	fun queueInsertDebugUtilsLabel(queue: QueueH, pLabelInfo: DebugUtilsLabel) {
		Commands.queueInsertDebugUtilsLabel(queueInsertDebugUtilsLabelAddr, queue.address, pLabelInfo.address)
	}
	
	
	
	fun cmdBeginDebugUtilsLabel(commandBuffer: CommandBufferH, pLabelInfo: DebugUtilsLabel) {
		Commands.cmdBeginDebugUtilsLabel(cmdBeginDebugUtilsLabelAddr, commandBuffer.address, pLabelInfo.address)
	}
	
	
	
	fun cmdEndDebugUtilsLabel(commandBuffer: CommandBufferH) {
		Commands.cmdEndDebugUtilsLabel(cmdEndDebugUtilsLabelAddr, commandBuffer.address)
	}
	
	
	
	fun cmdInsertDebugUtilsLabel(commandBuffer: CommandBufferH, pLabelInfo: DebugUtilsLabel) {
		Commands.cmdInsertDebugUtilsLabel(cmdInsertDebugUtilsLabelAddr, commandBuffer.address, pLabelInfo.address)
	}
	
	
	
	fun getAndroidHardwareBufferProperties(buffer: DirectLong, pProperties: AndroidHardwareBufferProperties): Result {
		return Result(Commands.getAndroidHardwareBufferProperties(getAndroidHardwareBufferPropertiesAddr, device.address, buffer.address, pProperties.address))
	}
	
	
	
	fun getMemoryAndroidHardwareBuffer(pInfo: MemoryGetAndroidHardwareBufferInfo, pBuffer: DirectLong): Result {
		return Result(Commands.getMemoryAndroidHardwareBuffer(getMemoryAndroidHardwareBufferAddr, device.address, pInfo.address, pBuffer.address))
	}
	
	
	
	fun cmdSetSampleLocations(commandBuffer: CommandBufferH, pSampleLocationsInfo: SampleLocationsInfo) {
		Commands.cmdSetSampleLocations(cmdSetSampleLocationsAddr, commandBuffer.address, pSampleLocationsInfo.address)
	}
	
	
	
	fun createAccelerationStructureKHR(pCreateInfo: AccelerationStructureCreateInfoKHR, pAllocator: AllocationCallbacks?, pAccelerationStructure: DirectLong): Result {
		return Result(Commands.createAccelerationStructureKHR(createAccelerationStructureKHRAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pAccelerationStructure.address))
	}
	
	
	
	fun destroyAccelerationStructureKHR(accelerationStructure: AccelerationStructureKHRH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyAccelerationStructureKHR(destroyAccelerationStructureKHRAddr, device.address, accelerationStructure.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun cmdBuildAccelerationStructures(commandBuffer: CommandBufferH, infoCount: Int, pInfos: AccelerationStructureBuildGeometryInfo.Buffer, ppBuildRangeInfos: AccelerationStructureBuildRangeInfo.Buffer) {
		Commands.cmdBuildAccelerationStructures(cmdBuildAccelerationStructuresAddr, commandBuffer.address, infoCount, pInfos.address, ppBuildRangeInfos.address)
	}
	
	
	
	fun cmdBuildAccelerationStructuresIndirect(commandBuffer: CommandBufferH, infoCount: Int, pInfos: AccelerationStructureBuildGeometryInfo.Buffer, pIndirectDeviceAddresses: DirectLongBuffer, pIndirectStrides: DirectIntBuffer, ppMaxPrimitiveCounts: DirectIntBuffer) {
		Commands.cmdBuildAccelerationStructuresIndirect(cmdBuildAccelerationStructuresIndirectAddr, commandBuffer.address, infoCount, pInfos.address, pIndirectDeviceAddresses.address, pIndirectStrides.address, ppMaxPrimitiveCounts.address)
	}
	
	
	
	fun buildAccelerationStructures(deferredOperation: DeferredOperationH?, infoCount: Int, pInfos: AccelerationStructureBuildGeometryInfo.Buffer, ppBuildRangeInfos: AccelerationStructureBuildRangeInfo.Buffer): Result {
		return Result(Commands.buildAccelerationStructures(buildAccelerationStructuresAddr, device.address, deferredOperation.addressOrNULL, infoCount, pInfos.address, ppBuildRangeInfos.address))
	}
	
	
	
	fun copyAccelerationStructure(deferredOperation: DeferredOperationH?, pInfo: CopyAccelerationStructureInfo): Result {
		return Result(Commands.copyAccelerationStructure(copyAccelerationStructureAddr, device.address, deferredOperation.addressOrNULL, pInfo.address))
	}
	
	
	
	fun copyAccelerationStructureToMemory(deferredOperation: DeferredOperationH?, pInfo: CopyAccelerationStructureToMemoryInfo): Result {
		return Result(Commands.copyAccelerationStructureToMemory(copyAccelerationStructureToMemoryAddr, device.address, deferredOperation.addressOrNULL, pInfo.address))
	}
	
	
	
	fun copyMemoryToAccelerationStructure(deferredOperation: DeferredOperationH?, pInfo: CopyMemoryToAccelerationStructureInfo): Result {
		return Result(Commands.copyMemoryToAccelerationStructure(copyMemoryToAccelerationStructureAddr, device.address, deferredOperation.addressOrNULL, pInfo.address))
	}
	
	
	
	fun writeAccelerationStructuresProperties(accelerationStructureCount: Int, pAccelerationStructures: DirectLongBuffer, queryType: QueryType, dataSize: Long, pData: DirectLong, stride: Long): Result {
		return Result(Commands.writeAccelerationStructuresProperties(writeAccelerationStructuresPropertiesAddr, device.address, accelerationStructureCount, pAccelerationStructures.address, queryType.value, dataSize, pData.address, stride))
	}
	
	
	
	fun cmdCopyAccelerationStructureKHR(commandBuffer: CommandBufferH, pInfo: CopyAccelerationStructureInfo) {
		Commands.cmdCopyAccelerationStructureKHR(cmdCopyAccelerationStructureKHRAddr, commandBuffer.address, pInfo.address)
	}
	
	
	
	fun cmdCopyAccelerationStructureToMemory(commandBuffer: CommandBufferH, pInfo: CopyAccelerationStructureToMemoryInfo) {
		Commands.cmdCopyAccelerationStructureToMemory(cmdCopyAccelerationStructureToMemoryAddr, commandBuffer.address, pInfo.address)
	}
	
	
	
	fun cmdCopyMemoryToAccelerationStructure(commandBuffer: CommandBufferH, pInfo: CopyMemoryToAccelerationStructureInfo) {
		Commands.cmdCopyMemoryToAccelerationStructure(cmdCopyMemoryToAccelerationStructureAddr, commandBuffer.address, pInfo.address)
	}
	
	
	
	fun getAccelerationStructureDeviceAddress(pInfo: AccelerationStructureDeviceAddressInfo): Long {
		return Commands.getAccelerationStructureDeviceAddress(getAccelerationStructureDeviceAddressAddr, device.address, pInfo.address)
	}
	
	
	
	fun cmdWriteAccelerationStructuresPropertiesKHR(commandBuffer: CommandBufferH, accelerationStructureCount: Int, pAccelerationStructures: DirectLongBuffer, queryType: QueryType, queryPool: QueryPoolH, firstQuery: Int) {
		Commands.cmdWriteAccelerationStructuresPropertiesKHR(cmdWriteAccelerationStructuresPropertiesKHRAddr, commandBuffer.address, accelerationStructureCount, pAccelerationStructures.address, queryType.value, queryPool.address, firstQuery)
	}
	
	
	
	fun getDeviceAccelerationStructureCompatibility(pVersionInfo: AccelerationStructureVersionInfo, pCompatibility: DirectLong) {
		Commands.getDeviceAccelerationStructureCompatibility(getDeviceAccelerationStructureCompatibilityAddr, device.address, pVersionInfo.address, pCompatibility.address)
	}
	
	
	
	fun getAccelerationStructureBuildSizes(buildType: AccelerationStructureBuildType, pBuildInfo: AccelerationStructureBuildGeometryInfo, pMaxPrimitiveCounts: DirectIntBuffer?, pSizeInfo: AccelerationStructureBuildSizesInfo) {
		Commands.getAccelerationStructureBuildSizes(getAccelerationStructureBuildSizesAddr, device.address, buildType.value, pBuildInfo.address, pMaxPrimitiveCounts.addressOrNULL, pSizeInfo.address)
	}
	
	
	
	fun cmdTraceRaysKHR(commandBuffer: CommandBufferH, pRaygenShaderBindingTable: StridedDeviceAddressRegion, pMissShaderBindingTable: StridedDeviceAddressRegion, pHitShaderBindingTable: StridedDeviceAddressRegion, pCallableShaderBindingTable: StridedDeviceAddressRegion, width: Int, height: Int, depth: Int) {
		Commands.cmdTraceRaysKHR(cmdTraceRaysKHRAddr, commandBuffer.address, pRaygenShaderBindingTable.address, pMissShaderBindingTable.address, pHitShaderBindingTable.address, pCallableShaderBindingTable.address, width, height, depth)
	}
	
	
	
	fun createRayTracingPipelinesKHR(deferredOperation: DeferredOperationH?, pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: RayTracingPipelineCreateInfoKHR.Buffer, pAllocator: AllocationCallbacks?, pPipelines: DirectLongBuffer): Result {
		return Result(Commands.createRayTracingPipelinesKHR(createRayTracingPipelinesKHRAddr, device.address, deferredOperation.addressOrNULL, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	
	
	fun getRayTracingShaderGroupHandlesKHR(pipeline: PipelineH, firstGroup: Int, groupCount: Int, dataSize: Long, pData: DirectLong): Result {
		return Result(Commands.getRayTracingShaderGroupHandlesKHR(getRayTracingShaderGroupHandlesKHRAddr, device.address, pipeline.address, firstGroup, groupCount, dataSize, pData.address))
	}
	
	
	
	fun getRayTracingCaptureReplayShaderGroupHandles(pipeline: PipelineH, firstGroup: Int, groupCount: Int, dataSize: Long, pData: DirectLong): Result {
		return Result(Commands.getRayTracingCaptureReplayShaderGroupHandles(getRayTracingCaptureReplayShaderGroupHandlesAddr, device.address, pipeline.address, firstGroup, groupCount, dataSize, pData.address))
	}
	
	
	
	fun cmdTraceRaysIndirect(commandBuffer: CommandBufferH, pRaygenShaderBindingTable: StridedDeviceAddressRegion, pMissShaderBindingTable: StridedDeviceAddressRegion, pHitShaderBindingTable: StridedDeviceAddressRegion, pCallableShaderBindingTable: StridedDeviceAddressRegion, indirectDeviceAddress: Long) {
		Commands.cmdTraceRaysIndirect(cmdTraceRaysIndirectAddr, commandBuffer.address, pRaygenShaderBindingTable.address, pMissShaderBindingTable.address, pHitShaderBindingTable.address, pCallableShaderBindingTable.address, indirectDeviceAddress)
	}
	
	
	
	fun getRayTracingShaderGroupStackSize(pipeline: PipelineH, group: Int, groupShader: ShaderGroupShader): Long {
		return Commands.getRayTracingShaderGroupStackSize(getRayTracingShaderGroupStackSizeAddr, device.address, pipeline.address, group, groupShader.value)
	}
	
	
	
	fun cmdSetRayTracingPipelineStackSize(commandBuffer: CommandBufferH, pipelineStackSize: Int) {
		Commands.cmdSetRayTracingPipelineStackSize(cmdSetRayTracingPipelineStackSizeAddr, commandBuffer.address, pipelineStackSize)
	}
	
	
	
	fun getImageDrmFormatModifierProperties(image: ImageH, pProperties: ImageDrmFormatModifierProperties): Result {
		return Result(Commands.getImageDrmFormatModifierProperties(getImageDrmFormatModifierPropertiesAddr, device.address, image.address, pProperties.address))
	}
	
	
	
	fun createValidationCache(pCreateInfo: ValidationCacheCreateInfo, pAllocator: AllocationCallbacks?, pValidationCache: DirectLong): Result {
		return Result(Commands.createValidationCache(createValidationCacheAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pValidationCache.address))
	}
	
	
	
	fun destroyValidationCache(validationCache: ValidationCacheH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyValidationCache(destroyValidationCacheAddr, device.address, validationCache.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun mergeValidationCaches(dstCache: ValidationCacheH, srcCacheCount: Int, pSrcCaches: DirectLongBuffer): Result {
		return Result(Commands.mergeValidationCaches(mergeValidationCachesAddr, device.address, dstCache.address, srcCacheCount, pSrcCaches.address))
	}
	
	
	
	fun getValidationCacheData(validationCache: ValidationCacheH, pDataSize: DirectLong, pData: DirectLong?): Result {
		return Result(Commands.getValidationCacheData(getValidationCacheDataAddr, device.address, validationCache.address, pDataSize.address, pData.addressOrNULL))
	}
	
	
	
	fun cmdBindShadingRateImage(commandBuffer: CommandBufferH, imageView: ImageViewH?, imageLayout: ImageLayout) {
		Commands.cmdBindShadingRateImage(cmdBindShadingRateImageAddr, commandBuffer.address, imageView.addressOrNULL, imageLayout.value)
	}
	
	
	
	fun cmdSetViewportShadingRatePalette(commandBuffer: CommandBufferH, firstViewport: Int, viewportCount: Int, pShadingRatePalettes: ShadingRatePalette.Buffer) {
		Commands.cmdSetViewportShadingRatePalette(cmdSetViewportShadingRatePaletteAddr, commandBuffer.address, firstViewport, viewportCount, pShadingRatePalettes.address)
	}
	
	
	
	fun cmdSetCoarseSampleOrder(commandBuffer: CommandBufferH, sampleOrderType: CoarseSampleOrderType, customSampleOrderCount: Int, pCustomSampleOrders: CoarseSampleOrderCustom.Buffer) {
		Commands.cmdSetCoarseSampleOrder(cmdSetCoarseSampleOrderAddr, commandBuffer.address, sampleOrderType.value, customSampleOrderCount, pCustomSampleOrders.address)
	}
	
	
	
	fun createAccelerationStructureNV(pCreateInfo: AccelerationStructureCreateInfoNV, pAllocator: AllocationCallbacks?, pAccelerationStructure: DirectLong): Result {
		return Result(Commands.createAccelerationStructureNV(createAccelerationStructureNVAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pAccelerationStructure.address))
	}
	
	
	
	fun destroyAccelerationStructureNV(accelerationStructure: AccelerationStructureNVH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyAccelerationStructureNV(destroyAccelerationStructureNVAddr, device.address, accelerationStructure.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getAccelerationStructureMemoryRequirements(pInfo: AccelerationStructureMemoryRequirementsInfo, pMemoryRequirements: MemoryRequirements2) {
		Commands.getAccelerationStructureMemoryRequirements(getAccelerationStructureMemoryRequirementsAddr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	
	
	fun bindAccelerationStructureMemory(bindInfoCount: Int, pBindInfos: BindAccelerationStructureMemoryInfo.Buffer): Result {
		return Result(Commands.bindAccelerationStructureMemory(bindAccelerationStructureMemoryAddr, device.address, bindInfoCount, pBindInfos.address))
	}
	
	
	
	fun cmdBuildAccelerationStructure(commandBuffer: CommandBufferH, pInfo: AccelerationStructureInfo, instanceData: BufferH?, instanceOffset: Long, update: Int, dst: AccelerationStructureNVH, src: AccelerationStructureNVH?, scratch: BufferH, scratchOffset: Long) {
		Commands.cmdBuildAccelerationStructure(cmdBuildAccelerationStructureAddr, commandBuffer.address, pInfo.address, instanceData.addressOrNULL, instanceOffset, update, dst.address, src.addressOrNULL, scratch.address, scratchOffset)
	}
	
	
	
	fun cmdCopyAccelerationStructureNV(commandBuffer: CommandBufferH, dst: AccelerationStructureNVH, src: AccelerationStructureNVH, mode: CopyAccelerationStructureMode) {
		Commands.cmdCopyAccelerationStructureNV(cmdCopyAccelerationStructureNVAddr, commandBuffer.address, dst.address, src.address, mode.value)
	}
	
	
	
	fun cmdTraceRaysNV(commandBuffer: CommandBufferH, raygenShaderBindingTableBuffer: BufferH, raygenShaderBindingOffset: Long, missShaderBindingTableBuffer: BufferH?, missShaderBindingOffset: Long, missShaderBindingStride: Long, hitShaderBindingTableBuffer: BufferH?, hitShaderBindingOffset: Long, hitShaderBindingStride: Long, callableShaderBindingTableBuffer: BufferH?, callableShaderBindingOffset: Long, callableShaderBindingStride: Long, width: Int, height: Int, depth: Int) {
		Commands.cmdTraceRaysNV(cmdTraceRaysNVAddr, commandBuffer.address, raygenShaderBindingTableBuffer.address, raygenShaderBindingOffset, missShaderBindingTableBuffer.addressOrNULL, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer.addressOrNULL, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer.addressOrNULL, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth)
	}
	
	
	
	fun createRayTracingPipelinesNV(pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: RayTracingPipelineCreateInfoNV.Buffer, pAllocator: AllocationCallbacks?, pPipelines: DirectLongBuffer): Result {
		return Result(Commands.createRayTracingPipelinesNV(createRayTracingPipelinesNVAddr, device.address, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	
	
	fun getAccelerationStructureHandle(accelerationStructure: AccelerationStructureNVH, dataSize: Long, pData: DirectLong): Result {
		return Result(Commands.getAccelerationStructureHandle(getAccelerationStructureHandleAddr, device.address, accelerationStructure.address, dataSize, pData.address))
	}
	
	
	
	fun cmdWriteAccelerationStructuresPropertiesNV(commandBuffer: CommandBufferH, accelerationStructureCount: Int, pAccelerationStructures: DirectLongBuffer, queryType: QueryType, queryPool: QueryPoolH, firstQuery: Int) {
		Commands.cmdWriteAccelerationStructuresPropertiesNV(cmdWriteAccelerationStructuresPropertiesNVAddr, commandBuffer.address, accelerationStructureCount, pAccelerationStructures.address, queryType.value, queryPool.address, firstQuery)
	}
	
	
	
	fun compileDeferred(pipeline: PipelineH, shader: Int): Result {
		return Result(Commands.compileDeferred(compileDeferredAddr, device.address, pipeline.address, shader))
	}
	
	
	
	fun getMemoryHostPointerProperties(handleType: ExternalMemoryHandleTypeFlags, pHostPointer: DirectLong, pMemoryHostPointerProperties: MemoryHostPointerProperties): Result {
		return Result(Commands.getMemoryHostPointerProperties(getMemoryHostPointerPropertiesAddr, device.address, handleType.value, pHostPointer.address, pMemoryHostPointerProperties.address))
	}
	
	
	
	fun cmdWriteBufferMarker(commandBuffer: CommandBufferH, pipelineStage: PipelineStageFlags, dstBuffer: BufferH, dstOffset: Long, marker: Int) {
		Commands.cmdWriteBufferMarker(cmdWriteBufferMarkerAddr, commandBuffer.address, pipelineStage.value, dstBuffer.address, dstOffset, marker)
	}
	
	
	
	fun getCalibratedTimestamps(timestampCount: Int, pTimestampInfos: CalibratedTimestampInfo.Buffer, pTimestamps: DirectLongBuffer, pMaxDeviation: DirectLong): Result {
		return Result(Commands.getCalibratedTimestamps(getCalibratedTimestampsAddr, device.address, timestampCount, pTimestampInfos.address, pTimestamps.address, pMaxDeviation.address))
	}
	
	
	
	fun cmdDrawMeshTasks(commandBuffer: CommandBufferH, taskCount: Int, firstTask: Int) {
		Commands.cmdDrawMeshTasks(cmdDrawMeshTasksAddr, commandBuffer.address, taskCount, firstTask)
	}
	
	
	
	fun cmdDrawMeshTasksIndirect(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, drawCount: Int, stride: Int) {
		Commands.cmdDrawMeshTasksIndirect(cmdDrawMeshTasksIndirectAddr, commandBuffer.address, buffer.address, offset, drawCount, stride)
	}
	
	
	
	fun cmdDrawMeshTasksIndirectCount(commandBuffer: CommandBufferH, buffer: BufferH, offset: Long, countBuffer: BufferH, countBufferOffset: Long, maxDrawCount: Int, stride: Int) {
		Commands.cmdDrawMeshTasksIndirectCount(cmdDrawMeshTasksIndirectCountAddr, commandBuffer.address, buffer.address, offset, countBuffer.address, countBufferOffset, maxDrawCount, stride)
	}
	
	
	
	fun cmdSetExclusiveScissor(commandBuffer: CommandBufferH, firstExclusiveScissor: Int, exclusiveScissorCount: Int, pExclusiveScissors: Rect2D.Buffer) {
		Commands.cmdSetExclusiveScissor(cmdSetExclusiveScissorAddr, commandBuffer.address, firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissors.address)
	}
	
	
	
	fun cmdSetCheckpoint(commandBuffer: CommandBufferH, pCheckpointMarker: DirectLong) {
		Commands.cmdSetCheckpoint(cmdSetCheckpointAddr, commandBuffer.address, pCheckpointMarker.address)
	}
	
	
	
	fun getQueueCheckpointData(queue: QueueH, pCheckpointDataCount: DirectInt, pCheckpointData: CheckpointData.Buffer?) {
		Commands.getQueueCheckpointData(getQueueCheckpointDataAddr, queue.address, pCheckpointDataCount.address, pCheckpointData.addressOrNULL)
	}
	
	
	
	fun initializePerformanceApi(pInitializeInfo: InitializePerformanceApiInfo): Result {
		return Result(Commands.initializePerformanceApi(initializePerformanceApiAddr, device.address, pInitializeInfo.address))
	}
	
	
	
	fun uninitializePerformanceApi() {
		Commands.uninitializePerformanceApi(uninitializePerformanceApiAddr, device.address)
	}
	
	
	
	fun cmdSetPerformanceMarker(commandBuffer: CommandBufferH, pMarkerInfo: PerformanceMarkerInfo): Result {
		return Result(Commands.cmdSetPerformanceMarker(cmdSetPerformanceMarkerAddr, commandBuffer.address, pMarkerInfo.address))
	}
	
	
	
	fun cmdSetPerformanceStreamMarker(commandBuffer: CommandBufferH, pMarkerInfo: PerformanceStreamMarkerInfo): Result {
		return Result(Commands.cmdSetPerformanceStreamMarker(cmdSetPerformanceStreamMarkerAddr, commandBuffer.address, pMarkerInfo.address))
	}
	
	
	
	fun cmdSetPerformanceOverride(commandBuffer: CommandBufferH, pOverrideInfo: PerformanceOverrideInfo): Result {
		return Result(Commands.cmdSetPerformanceOverride(cmdSetPerformanceOverrideAddr, commandBuffer.address, pOverrideInfo.address))
	}
	
	
	
	fun acquirePerformanceConfiguration(pAcquireInfo: PerformanceConfigurationAcquireInfo, pConfiguration: DirectLong): Result {
		return Result(Commands.acquirePerformanceConfiguration(acquirePerformanceConfigurationAddr, device.address, pAcquireInfo.address, pConfiguration.address))
	}
	
	
	
	fun releasePerformanceConfiguration(configuration: PerformanceConfigurationH?): Result {
		return Result(Commands.releasePerformanceConfiguration(releasePerformanceConfigurationAddr, device.address, configuration.addressOrNULL))
	}
	
	
	
	fun queueSetPerformanceConfiguration(queue: QueueH, configuration: PerformanceConfigurationH): Result {
		return Result(Commands.queueSetPerformanceConfiguration(queueSetPerformanceConfigurationAddr, queue.address, configuration.address))
	}
	
	
	
	fun getPerformanceParameter(parameter: PerformanceParameterType, pValue: PerformanceValue): Result {
		return Result(Commands.getPerformanceParameter(getPerformanceParameterAddr, device.address, parameter.value, pValue.address))
	}
	
	
	
	fun setLocalDimming(swapChain: SwapchainH, localDimmingEnable: Int) {
		Commands.setLocalDimming(setLocalDimmingAddr, device.address, swapChain.address, localDimmingEnable)
	}
	
	
	
	fun cmdSetFragmentShadingRate(commandBuffer: CommandBufferH, pFragmentSize: Extent2D, combinerOps: DirectIntBuffer) {
		Commands.cmdSetFragmentShadingRate(cmdSetFragmentShadingRateAddr, commandBuffer.address, pFragmentSize.address, combinerOps.address)
	}
	
	
	
	fun acquireFullScreenExclusiveMode(swapchain: SwapchainH): Result {
		return Result(Commands.acquireFullScreenExclusiveMode(acquireFullScreenExclusiveModeAddr, device.address, swapchain.address))
	}
	
	
	
	fun releaseFullScreenExclusiveMode(swapchain: SwapchainH): Result {
		return Result(Commands.releaseFullScreenExclusiveMode(releaseFullScreenExclusiveModeAddr, device.address, swapchain.address))
	}
	
	
	
	fun getDeviceGroupSurfacePresentModes2(pSurfaceInfo: PhysicalDeviceSurfaceInfo2, pModes: DirectLong): Result {
		return Result(Commands.getDeviceGroupSurfacePresentModes2(getDeviceGroupSurfacePresentModes2Addr, device.address, pSurfaceInfo.address, pModes.address))
	}
	
	
	
	fun cmdSetLineStipple(commandBuffer: CommandBufferH, lineStippleFactor: Int, lineStipplePattern: Short) {
		Commands.cmdSetLineStipple(cmdSetLineStippleAddr, commandBuffer.address, lineStippleFactor, lineStipplePattern)
	}
	
	
	
	fun cmdSetCullMode(commandBuffer: CommandBufferH, cullMode: CullModeFlags) {
		Commands.cmdSetCullMode(cmdSetCullModeAddr, commandBuffer.address, cullMode.value)
	}
	
	
	
	fun cmdSetFrontFace(commandBuffer: CommandBufferH, frontFace: FrontFace) {
		Commands.cmdSetFrontFace(cmdSetFrontFaceAddr, commandBuffer.address, frontFace.value)
	}
	
	
	
	fun cmdSetPrimitiveTopology(commandBuffer: CommandBufferH, primitiveTopology: PrimitiveTopology) {
		Commands.cmdSetPrimitiveTopology(cmdSetPrimitiveTopologyAddr, commandBuffer.address, primitiveTopology.value)
	}
	
	
	
	fun cmdSetViewportWithCount(commandBuffer: CommandBufferH, viewportCount: Int, pViewports: Viewport.Buffer) {
		Commands.cmdSetViewportWithCount(cmdSetViewportWithCountAddr, commandBuffer.address, viewportCount, pViewports.address)
	}
	
	
	
	fun cmdSetScissorWithCount(commandBuffer: CommandBufferH, scissorCount: Int, pScissors: Rect2D.Buffer) {
		Commands.cmdSetScissorWithCount(cmdSetScissorWithCountAddr, commandBuffer.address, scissorCount, pScissors.address)
	}
	
	
	
	fun cmdBindVertexBuffers2(commandBuffer: CommandBufferH, firstBinding: Int, bindingCount: Int, pBuffers: DirectLongBuffer, pOffsets: DirectLongBuffer, pSizes: DirectLongBuffer?, pStrides: DirectLongBuffer?) {
		Commands.cmdBindVertexBuffers2(cmdBindVertexBuffers2Addr, commandBuffer.address, firstBinding, bindingCount, pBuffers.address, pOffsets.address, pSizes.addressOrNULL, pStrides.addressOrNULL)
	}
	
	
	
	fun cmdSetDepthTestEnable(commandBuffer: CommandBufferH, depthTestEnable: Int) {
		Commands.cmdSetDepthTestEnable(cmdSetDepthTestEnableAddr, commandBuffer.address, depthTestEnable)
	}
	
	
	
	fun cmdSetDepthWriteEnable(commandBuffer: CommandBufferH, depthWriteEnable: Int) {
		Commands.cmdSetDepthWriteEnable(cmdSetDepthWriteEnableAddr, commandBuffer.address, depthWriteEnable)
	}
	
	
	
	fun cmdSetDepthCompareOp(commandBuffer: CommandBufferH, depthCompareOp: CompareOp) {
		Commands.cmdSetDepthCompareOp(cmdSetDepthCompareOpAddr, commandBuffer.address, depthCompareOp.value)
	}
	
	
	
	fun cmdSetDepthBoundsTestEnable(commandBuffer: CommandBufferH, depthBoundsTestEnable: Int) {
		Commands.cmdSetDepthBoundsTestEnable(cmdSetDepthBoundsTestEnableAddr, commandBuffer.address, depthBoundsTestEnable)
	}
	
	
	
	fun cmdSetStencilTestEnable(commandBuffer: CommandBufferH, stencilTestEnable: Int) {
		Commands.cmdSetStencilTestEnable(cmdSetStencilTestEnableAddr, commandBuffer.address, stencilTestEnable)
	}
	
	
	
	fun cmdSetStencilOp(commandBuffer: CommandBufferH, faceMask: StencilFaceFlags, failOp: StencilOp, passOp: StencilOp, depthFailOp: StencilOp, compareOp: CompareOp) {
		Commands.cmdSetStencilOp(cmdSetStencilOpAddr, commandBuffer.address, faceMask.value, failOp.value, passOp.value, depthFailOp.value, compareOp.value)
	}
	
	
	
	fun createDeferredOperation(pAllocator: AllocationCallbacks?, pDeferredOperation: DirectLong): Result {
		return Result(Commands.createDeferredOperation(createDeferredOperationAddr, device.address, pAllocator.addressOrNULL, pDeferredOperation.address))
	}
	
	
	
	fun destroyDeferredOperation(operation: DeferredOperationH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDeferredOperation(destroyDeferredOperationAddr, device.address, operation.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun getDeferredOperationMaxConcurrency(operation: DeferredOperationH): Int {
		return Commands.getDeferredOperationMaxConcurrency(getDeferredOperationMaxConcurrencyAddr, device.address, operation.address)
	}
	
	
	
	fun getDeferredOperationResult(operation: DeferredOperationH): Result {
		return Result(Commands.getDeferredOperationResult(getDeferredOperationResultAddr, device.address, operation.address))
	}
	
	
	
	fun deferredOperationJoin(operation: DeferredOperationH): Result {
		return Result(Commands.deferredOperationJoin(deferredOperationJoinAddr, device.address, operation.address))
	}
	
	
	
	fun getPipelineExecutableProperties(pPipelineInfo: PipelineInfo, pExecutableCount: DirectInt, pProperties: PipelineExecutableProperties.Buffer?): Result {
		return Result(Commands.getPipelineExecutableProperties(getPipelineExecutablePropertiesAddr, device.address, pPipelineInfo.address, pExecutableCount.address, pProperties.addressOrNULL))
	}
	
	
	
	fun getPipelineExecutableStatistics(pExecutableInfo: PipelineExecutableInfo, pStatisticCount: DirectInt, pStatistics: PipelineExecutableStatistic.Buffer?): Result {
		return Result(Commands.getPipelineExecutableStatistics(getPipelineExecutableStatisticsAddr, device.address, pExecutableInfo.address, pStatisticCount.address, pStatistics.addressOrNULL))
	}
	
	
	
	fun getPipelineExecutableInternalRepresentations(pExecutableInfo: PipelineExecutableInfo, pInternalRepresentationCount: DirectInt, pInternalRepresentations: PipelineExecutableInternalRepresentation.Buffer?): Result {
		return Result(Commands.getPipelineExecutableInternalRepresentations(getPipelineExecutableInternalRepresentationsAddr, device.address, pExecutableInfo.address, pInternalRepresentationCount.address, pInternalRepresentations.addressOrNULL))
	}
	
	
	
	fun getGeneratedCommandsMemoryRequirements(pInfo: GeneratedCommandsMemoryRequirementsInfo, pMemoryRequirements: MemoryRequirements2) {
		Commands.getGeneratedCommandsMemoryRequirements(getGeneratedCommandsMemoryRequirementsAddr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	
	
	fun cmdPreprocessGeneratedCommands(commandBuffer: CommandBufferH, pGeneratedCommandsInfo: GeneratedCommandsInfo) {
		Commands.cmdPreprocessGeneratedCommands(cmdPreprocessGeneratedCommandsAddr, commandBuffer.address, pGeneratedCommandsInfo.address)
	}
	
	
	
	fun cmdExecuteGeneratedCommands(commandBuffer: CommandBufferH, isPreprocessed: Int, pGeneratedCommandsInfo: GeneratedCommandsInfo) {
		Commands.cmdExecuteGeneratedCommands(cmdExecuteGeneratedCommandsAddr, commandBuffer.address, isPreprocessed, pGeneratedCommandsInfo.address)
	}
	
	
	
	fun cmdBindPipelineShaderGroup(commandBuffer: CommandBufferH, pipelineBindPoint: PipelineBindPoint, pipeline: PipelineH, groupIndex: Int) {
		Commands.cmdBindPipelineShaderGroup(cmdBindPipelineShaderGroupAddr, commandBuffer.address, pipelineBindPoint.value, pipeline.address, groupIndex)
	}
	
	
	
	fun createIndirectCommandsLayout(pCreateInfo: IndirectCommandsLayoutCreateInfo, pAllocator: AllocationCallbacks?, pIndirectCommandsLayout: DirectLong): Result {
		return Result(Commands.createIndirectCommandsLayout(createIndirectCommandsLayoutAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pIndirectCommandsLayout.address))
	}
	
	
	
	fun destroyIndirectCommandsLayout(indirectCommandsLayout: IndirectCommandsLayoutH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyIndirectCommandsLayout(destroyIndirectCommandsLayoutAddr, device.address, indirectCommandsLayout.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun createPrivateDataSlot(pCreateInfo: PrivateDataSlotCreateInfo, pAllocator: AllocationCallbacks?, pPrivateDataSlot: DirectLong): Result {
		return Result(Commands.createPrivateDataSlot(createPrivateDataSlotAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pPrivateDataSlot.address))
	}
	
	
	
	fun destroyPrivateDataSlot(privateDataSlot: PrivateDataSlotH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyPrivateDataSlot(destroyPrivateDataSlotAddr, device.address, privateDataSlot.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	
	
	fun setPrivateData(objectType: ObjectType, objectHandle: Long, privateDataSlot: PrivateDataSlotH, data: Long): Result {
		return Result(Commands.setPrivateData(setPrivateDataAddr, device.address, objectType.value, objectHandle, privateDataSlot.address, data))
	}
	
	
	
	fun getPrivateData(objectType: ObjectType, objectHandle: Long, privateDataSlot: PrivateDataSlotH, pData: DirectLong) {
		Commands.getPrivateData(getPrivateDataAddr, device.address, objectType.value, objectHandle, privateDataSlot.address, pData.address)
	}
	
	
	
	fun cmdSetEvent2(commandBuffer: CommandBufferH, event: EventH, pDependencyInfo: DependencyInfo) {
		Commands.cmdSetEvent2(cmdSetEvent2Addr, commandBuffer.address, event.address, pDependencyInfo.address)
	}
	
	
	
	fun cmdResetEvent2(commandBuffer: CommandBufferH, event: EventH, stageMask: PipelineStageFlags2) {
		Commands.cmdResetEvent2(cmdResetEvent2Addr, commandBuffer.address, event.address, stageMask.value)
	}
	
	
	
	fun cmdWaitEvents2(commandBuffer: CommandBufferH, eventCount: Int, pEvents: DirectLongBuffer, pDependencyInfos: DependencyInfo.Buffer) {
		Commands.cmdWaitEvents2(cmdWaitEvents2Addr, commandBuffer.address, eventCount, pEvents.address, pDependencyInfos.address)
	}
	
	
	
	fun cmdPipelineBarrier2(commandBuffer: CommandBufferH, pDependencyInfo: DependencyInfo) {
		Commands.cmdPipelineBarrier2(cmdPipelineBarrier2Addr, commandBuffer.address, pDependencyInfo.address)
	}
	
	
	
	fun cmdWriteTimestamp2(commandBuffer: CommandBufferH, stage: PipelineStageFlags2, queryPool: QueryPoolH, query: Int) {
		Commands.cmdWriteTimestamp2(cmdWriteTimestamp2Addr, commandBuffer.address, stage.value, queryPool.address, query)
	}
	
	
	
	fun queueSubmit2(queue: QueueH, submitCount: Int, pSubmits: SubmitInfo2.Buffer, fence: FenceH?): Result {
		return Result(Commands.queueSubmit2(queueSubmit2Addr, queue.address, submitCount, pSubmits.address, fence.addressOrNULL))
	}
	
	
	
	fun cmdWriteBufferMarker2(commandBuffer: CommandBufferH, stage: PipelineStageFlags2, dstBuffer: BufferH, dstOffset: Long, marker: Int) {
		Commands.cmdWriteBufferMarker2(cmdWriteBufferMarker2Addr, commandBuffer.address, stage.value, dstBuffer.address, dstOffset, marker)
	}
	
	
	
	fun getQueueCheckpointData2(queue: QueueH, pCheckpointDataCount: DirectInt, pCheckpointData: CheckpointData2.Buffer?) {
		Commands.getQueueCheckpointData2(getQueueCheckpointData2Addr, queue.address, pCheckpointDataCount.address, pCheckpointData.addressOrNULL)
	}
	
	
	
	fun cmdSetFragmentShadingRateEnum(commandBuffer: CommandBufferH, shadingRate: FragmentShadingRate, combinerOps: DirectIntBuffer) {
		Commands.cmdSetFragmentShadingRateEnum(cmdSetFragmentShadingRateEnumAddr, commandBuffer.address, shadingRate.value, combinerOps.address)
	}
	
	
	
	fun cmdCopyBuffer2(commandBuffer: CommandBufferH, pCopyBufferInfo: CopyBufferInfo2) {
		Commands.cmdCopyBuffer2(cmdCopyBuffer2Addr, commandBuffer.address, pCopyBufferInfo.address)
	}
	
	
	
	fun cmdCopyImage2(commandBuffer: CommandBufferH, pCopyImageInfo: CopyImageInfo2) {
		Commands.cmdCopyImage2(cmdCopyImage2Addr, commandBuffer.address, pCopyImageInfo.address)
	}
	
	
	
	fun cmdCopyBufferToImage2(commandBuffer: CommandBufferH, pCopyBufferToImageInfo: CopyBufferToImageInfo2) {
		Commands.cmdCopyBufferToImage2(cmdCopyBufferToImage2Addr, commandBuffer.address, pCopyBufferToImageInfo.address)
	}
	
	
	
	fun cmdCopyImageToBuffer2(commandBuffer: CommandBufferH, pCopyImageToBufferInfo: CopyImageToBufferInfo2) {
		Commands.cmdCopyImageToBuffer2(cmdCopyImageToBuffer2Addr, commandBuffer.address, pCopyImageToBufferInfo.address)
	}
	
	
	
	fun cmdBlitImage2(commandBuffer: CommandBufferH, pBlitImageInfo: BlitImageInfo2) {
		Commands.cmdBlitImage2(cmdBlitImage2Addr, commandBuffer.address, pBlitImageInfo.address)
	}
	
	
	
	fun cmdResolveImage2(commandBuffer: CommandBufferH, pResolveImageInfo: ResolveImageInfo2) {
		Commands.cmdResolveImage2(cmdResolveImage2Addr, commandBuffer.address, pResolveImageInfo.address)
	}
	
	
	
	fun getMemoryZirconHandle(pGetZirconHandleInfo: MemoryGetZirconHandleInfo, pZirconHandle: DirectLong): Result {
		return Result(Commands.getMemoryZirconHandle(getMemoryZirconHandleAddr, device.address, pGetZirconHandleInfo.address, pZirconHandle.address))
	}
	
	
	
	fun getMemoryZirconHandleProperties(handleType: ExternalMemoryHandleTypeFlags, zirconHandle: Long, pMemoryZirconHandleProperties: MemoryZirconHandleProperties): Result {
		return Result(Commands.getMemoryZirconHandleProperties(getMemoryZirconHandlePropertiesAddr, device.address, handleType.value, zirconHandle, pMemoryZirconHandleProperties.address))
	}
	
	
	
	fun importSemaphoreZirconHandle(pImportSemaphoreZirconHandleInfo: ImportSemaphoreZirconHandleInfo): Result {
		return Result(Commands.importSemaphoreZirconHandle(importSemaphoreZirconHandleAddr, device.address, pImportSemaphoreZirconHandleInfo.address))
	}
	
	
	
	fun getSemaphoreZirconHandle(pGetZirconHandleInfo: SemaphoreGetZirconHandleInfo, pZirconHandle: DirectLong): Result {
		return Result(Commands.getSemaphoreZirconHandle(getSemaphoreZirconHandleAddr, device.address, pGetZirconHandleInfo.address, pZirconHandle.address))
	}


}