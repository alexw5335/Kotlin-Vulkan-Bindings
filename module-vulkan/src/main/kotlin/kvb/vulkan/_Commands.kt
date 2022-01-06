// This file has been automatically generated.

// This file's name has been prefixed with '_' so that it appears at the top of the package.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.MemStacks.default
import kvb.core.memory.Addressable.Companion.addressOrNULL
import kvb.core.memory.direct.*

object Commands {
	
	
	private external fun init(): Boolean
	
	init { init() }
	
	external fun getInstanceProcAddr(instance: Long, pname: Long): Long
	
	
	
	external fun createInstance(address: Long, pCreateInfo: Long, pAllocator: Long, pInstance: Long): Int
	
	external fun destroyInstance(address: Long, instance: Long, pAllocator: Long)
	
	external fun enumeratePhysicalDevices(address: Long, instance: Long, pPhysicalDeviceCount: Long, pPhysicalDevices: Long): Int
	
	external fun getPhysicalDeviceFeatures(address: Long, physicalDevice: Long, pFeatures: Long)
	
	external fun getPhysicalDeviceFormatProperties(address: Long, physicalDevice: Long, format: Int, pFormatProperties: Long)
	
	external fun getPhysicalDeviceImageFormatProperties(address: Long, physicalDevice: Long, format: Int, type: Int, tiling: Int, usage: Int, flags: Int, pImageFormatProperties: Long): Int
	
	external fun getPhysicalDeviceProperties(address: Long, physicalDevice: Long, pProperties: Long)
	
	external fun getPhysicalDeviceQueueFamilyProperties(address: Long, physicalDevice: Long, pQueueFamilyPropertyCount: Long, pQueueFamilyProperties: Long)
	
	external fun getPhysicalDeviceMemoryProperties(address: Long, physicalDevice: Long, pMemoryProperties: Long)
	
	external fun getDeviceProcAddr(address: Long, device: Long, pName: Long): Long
	
	external fun createDevice(address: Long, physicalDevice: Long, pCreateInfo: Long, pAllocator: Long, pDevice: Long): Int
	
	external fun destroyDevice(address: Long, device: Long, pAllocator: Long)
	
	external fun enumerateInstanceExtensionProperties(address: Long, pLayerName: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun enumerateDeviceExtensionProperties(address: Long, physicalDevice: Long, pLayerName: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun enumerateInstanceLayerProperties(address: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun enumerateDeviceLayerProperties(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getDeviceQueue(address: Long, device: Long, queueFamilyIndex: Int, queueIndex: Int, pQueue: Long)
	
	external fun queueSubmit(address: Long, queue: Long, submitCount: Int, pSubmits: Long, fence: Long): Int
	
	external fun queueWaitIdle(address: Long, queue: Long): Int
	
	external fun deviceWaitIdle(address: Long, device: Long): Int
	
	external fun allocateMemory(address: Long, device: Long, pAllocateInfo: Long, pAllocator: Long, pMemory: Long): Int
	
	external fun freeMemory(address: Long, device: Long, memory: Long, pAllocator: Long)
	
	external fun mapMemory(address: Long, device: Long, memory: Long, offset: Long, size: Long, flags: Int, ppData: Long): Int
	
	external fun unmapMemory(address: Long, device: Long, memory: Long)
	
	external fun flushMappedMemoryRanges(address: Long, device: Long, memoryRangeCount: Int, pMemoryRanges: Long): Int
	
	external fun invalidateMappedMemoryRanges(address: Long, device: Long, memoryRangeCount: Int, pMemoryRanges: Long): Int
	
	external fun getDeviceMemoryCommitment(address: Long, device: Long, memory: Long, pCommittedMemoryInBytes: Long)
	
	external fun bindBufferMemory(address: Long, device: Long, buffer: Long, memory: Long, memoryOffset: Long): Int
	
	external fun bindImageMemory(address: Long, device: Long, image: Long, memory: Long, memoryOffset: Long): Int
	
	external fun getBufferMemoryRequirements(address: Long, device: Long, buffer: Long, pMemoryRequirements: Long)
	
	external fun getImageMemoryRequirements(address: Long, device: Long, image: Long, pMemoryRequirements: Long)
	
	external fun getImageSparseMemoryRequirements(address: Long, device: Long, image: Long, pSparseMemoryRequirementCount: Long, pSparseMemoryRequirements: Long)
	
	external fun getPhysicalDeviceSparseImageFormatProperties(address: Long, physicalDevice: Long, format: Int, type: Int, samples: Int, usage: Int, tiling: Int, pPropertyCount: Long, pProperties: Long)
	
	external fun queueBindSparse(address: Long, queue: Long, bindInfoCount: Int, pBindInfo: Long, fence: Long): Int
	
	external fun createFence(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pFence: Long): Int
	
	external fun destroyFence(address: Long, device: Long, fence: Long, pAllocator: Long)
	
	external fun resetFences(address: Long, device: Long, fenceCount: Int, pFences: Long): Int
	
	external fun getFenceStatus(address: Long, device: Long, fence: Long): Int
	
	external fun waitForFences(address: Long, device: Long, fenceCount: Int, pFences: Long, waitAll: Int, timeout: Long): Int
	
	external fun createSemaphore(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pSemaphore: Long): Int
	
	external fun destroySemaphore(address: Long, device: Long, semaphore: Long, pAllocator: Long)
	
	external fun createEvent(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pEvent: Long): Int
	
	external fun destroyEvent(address: Long, device: Long, event: Long, pAllocator: Long)
	
	external fun getEventStatus(address: Long, device: Long, event: Long): Int
	
	external fun setEvent(address: Long, device: Long, event: Long): Int
	
	external fun resetEvent(address: Long, device: Long, event: Long): Int
	
	external fun createQueryPool(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pQueryPool: Long): Int
	
	external fun destroyQueryPool(address: Long, device: Long, queryPool: Long, pAllocator: Long)
	
	external fun getQueryPoolResults(address: Long, device: Long, queryPool: Long, firstQuery: Int, queryCount: Int, dataSize: Long, pData: Long, stride: Long, flags: Int): Int
	
	external fun createBuffer(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pBuffer: Long): Int
	
	external fun destroyBuffer(address: Long, device: Long, buffer: Long, pAllocator: Long)
	
	external fun createBufferView(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pView: Long): Int
	
	external fun destroyBufferView(address: Long, device: Long, bufferView: Long, pAllocator: Long)
	
	external fun createImage(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pImage: Long): Int
	
	external fun destroyImage(address: Long, device: Long, image: Long, pAllocator: Long)
	
	external fun getImageSubresourceLayout(address: Long, device: Long, image: Long, pSubresource: Long, pLayout: Long)
	
	external fun createImageView(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pView: Long): Int
	
	external fun destroyImageView(address: Long, device: Long, imageView: Long, pAllocator: Long)
	
	external fun createShaderModule(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pShaderModule: Long): Int
	
	external fun destroyShaderModule(address: Long, device: Long, shaderModule: Long, pAllocator: Long)
	
	external fun createPipelineCache(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pPipelineCache: Long): Int
	
	external fun destroyPipelineCache(address: Long, device: Long, pipelineCache: Long, pAllocator: Long)
	
	external fun getPipelineCacheData(address: Long, device: Long, pipelineCache: Long, pDataSize: Long, pData: Long): Int
	
	external fun mergePipelineCaches(address: Long, device: Long, dstCache: Long, srcCacheCount: Int, pSrcCaches: Long): Int
	
	external fun createGraphicsPipelines(address: Long, device: Long, pipelineCache: Long, createInfoCount: Int, pCreateInfos: Long, pAllocator: Long, pPipelines: Long): Int
	
	external fun createComputePipelines(address: Long, device: Long, pipelineCache: Long, createInfoCount: Int, pCreateInfos: Long, pAllocator: Long, pPipelines: Long): Int
	
	external fun destroyPipeline(address: Long, device: Long, pipeline: Long, pAllocator: Long)
	
	external fun createPipelineLayout(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pPipelineLayout: Long): Int
	
	external fun destroyPipelineLayout(address: Long, device: Long, pipelineLayout: Long, pAllocator: Long)
	
	external fun createSampler(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pSampler: Long): Int
	
	external fun destroySampler(address: Long, device: Long, sampler: Long, pAllocator: Long)
	
	external fun createDescriptorSetLayout(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pSetLayout: Long): Int
	
	external fun destroyDescriptorSetLayout(address: Long, device: Long, descriptorSetLayout: Long, pAllocator: Long)
	
	external fun createDescriptorPool(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pDescriptorPool: Long): Int
	
	external fun destroyDescriptorPool(address: Long, device: Long, descriptorPool: Long, pAllocator: Long)
	
	external fun resetDescriptorPool(address: Long, device: Long, descriptorPool: Long, flags: Int): Int
	
	external fun allocateDescriptorSets(address: Long, device: Long, pAllocateInfo: Long, pDescriptorSets: Long): Int
	
	external fun freeDescriptorSets(address: Long, device: Long, descriptorPool: Long, descriptorSetCount: Int, pDescriptorSets: Long): Int
	
	external fun updateDescriptorSets(address: Long, device: Long, descriptorWriteCount: Int, pDescriptorWrites: Long, descriptorCopyCount: Int, pDescriptorCopies: Long)
	
	external fun createFramebuffer(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pFramebuffer: Long): Int
	
	external fun destroyFramebuffer(address: Long, device: Long, framebuffer: Long, pAllocator: Long)
	
	external fun createRenderPass(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pRenderPass: Long): Int
	
	external fun destroyRenderPass(address: Long, device: Long, renderPass: Long, pAllocator: Long)
	
	external fun getRenderAreaGranularity(address: Long, device: Long, renderPass: Long, pGranularity: Long)
	
	external fun createCommandPool(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pCommandPool: Long): Int
	
	external fun destroyCommandPool(address: Long, device: Long, commandPool: Long, pAllocator: Long)
	
	external fun resetCommandPool(address: Long, device: Long, commandPool: Long, flags: Int): Int
	
	external fun allocateCommandBuffers(address: Long, device: Long, pAllocateInfo: Long, pCommandBuffers: Long): Int
	
	external fun freeCommandBuffers(address: Long, device: Long, commandPool: Long, commandBufferCount: Int, pCommandBuffers: Long)
	
	external fun beginCommandBuffer(address: Long, commandBuffer: Long, pBeginInfo: Long): Int
	
	external fun endCommandBuffer(address: Long, commandBuffer: Long): Int
	
	external fun resetCommandBuffer(address: Long, commandBuffer: Long, flags: Int): Int
	
	external fun cmdBindPipeline(address: Long, commandBuffer: Long, pipelineBindPoint: Int, pipeline: Long)
	
	external fun cmdSetViewport(address: Long, commandBuffer: Long, firstViewport: Int, viewportCount: Int, pViewports: Long)
	
	external fun cmdSetScissor(address: Long, commandBuffer: Long, firstScissor: Int, scissorCount: Int, pScissors: Long)
	
	external fun cmdSetLineWidth(address: Long, commandBuffer: Long, lineWidth: Float)
	
	external fun cmdSetDepthBias(address: Long, commandBuffer: Long, depthBiasConstantFactor: Float, depthBiasClamp: Float, depthBiasSlopeFactor: Float)
	
	external fun cmdSetBlendConstants(address: Long, commandBuffer: Long, blendConstants: Long)
	
	external fun cmdSetDepthBounds(address: Long, commandBuffer: Long, minDepthBounds: Float, maxDepthBounds: Float)
	
	external fun cmdSetStencilCompareMask(address: Long, commandBuffer: Long, faceMask: Int, compareMask: Int)
	
	external fun cmdSetStencilWriteMask(address: Long, commandBuffer: Long, faceMask: Int, writeMask: Int)
	
	external fun cmdSetStencilReference(address: Long, commandBuffer: Long, faceMask: Int, reference: Int)
	
	external fun cmdBindDescriptorSets(address: Long, commandBuffer: Long, pipelineBindPoint: Int, layout: Long, firstSet: Int, descriptorSetCount: Int, pDescriptorSets: Long, dynamicOffsetCount: Int, pDynamicOffsets: Long)
	
	external fun cmdBindIndexBuffer(address: Long, commandBuffer: Long, buffer: Long, offset: Long, indexType: Int)
	
	external fun cmdBindVertexBuffers(address: Long, commandBuffer: Long, firstBinding: Int, bindingCount: Int, pBuffers: Long, pOffsets: Long)
	
	external fun cmdDraw(address: Long, commandBuffer: Long, vertexCount: Int, instanceCount: Int, firstVertex: Int, firstInstance: Int)
	
	external fun cmdDrawIndexed(address: Long, commandBuffer: Long, indexCount: Int, instanceCount: Int, firstIndex: Int, vertexOffset: Int, firstInstance: Int)
	
	external fun cmdDrawIndirect(address: Long, commandBuffer: Long, buffer: Long, offset: Long, drawCount: Int, stride: Int)
	
	external fun cmdDrawIndexedIndirect(address: Long, commandBuffer: Long, buffer: Long, offset: Long, drawCount: Int, stride: Int)
	
	external fun cmdDispatch(address: Long, commandBuffer: Long, groupCountX: Int, groupCountY: Int, groupCountZ: Int)
	
	external fun cmdDispatchIndirect(address: Long, commandBuffer: Long, buffer: Long, offset: Long)
	
	external fun cmdCopyBuffer(address: Long, commandBuffer: Long, srcBuffer: Long, dstBuffer: Long, regionCount: Int, pRegions: Long)
	
	external fun cmdCopyImage(address: Long, commandBuffer: Long, srcImage: Long, srcImageLayout: Int, dstImage: Long, dstImageLayout: Int, regionCount: Int, pRegions: Long)
	
	external fun cmdBlitImage(address: Long, commandBuffer: Long, srcImage: Long, srcImageLayout: Int, dstImage: Long, dstImageLayout: Int, regionCount: Int, pRegions: Long, filter: Int)
	
	external fun cmdCopyBufferToImage(address: Long, commandBuffer: Long, srcBuffer: Long, dstImage: Long, dstImageLayout: Int, regionCount: Int, pRegions: Long)
	
	external fun cmdCopyImageToBuffer(address: Long, commandBuffer: Long, srcImage: Long, srcImageLayout: Int, dstBuffer: Long, regionCount: Int, pRegions: Long)
	
	external fun cmdUpdateBuffer(address: Long, commandBuffer: Long, dstBuffer: Long, dstOffset: Long, dataSize: Long, pData: Long)
	
	external fun cmdFillBuffer(address: Long, commandBuffer: Long, dstBuffer: Long, dstOffset: Long, size: Long, data: Int)
	
	external fun cmdClearColorImage(address: Long, commandBuffer: Long, image: Long, imageLayout: Int, pColor: Long, rangeCount: Int, pRanges: Long)
	
	external fun cmdClearDepthStencilImage(address: Long, commandBuffer: Long, image: Long, imageLayout: Int, pDepthStencil: Long, rangeCount: Int, pRanges: Long)
	
	external fun cmdClearAttachments(address: Long, commandBuffer: Long, attachmentCount: Int, pAttachments: Long, rectCount: Int, pRects: Long)
	
	external fun cmdResolveImage(address: Long, commandBuffer: Long, srcImage: Long, srcImageLayout: Int, dstImage: Long, dstImageLayout: Int, regionCount: Int, pRegions: Long)
	
	external fun cmdSetEvent(address: Long, commandBuffer: Long, event: Long, stageMask: Int)
	
	external fun cmdResetEvent(address: Long, commandBuffer: Long, event: Long, stageMask: Int)
	
	external fun cmdWaitEvents(address: Long, commandBuffer: Long, eventCount: Int, pEvents: Long, srcStageMask: Int, dstStageMask: Int, memoryBarrierCount: Int, pMemoryBarriers: Long, bufferMemoryBarrierCount: Int, pBufferMemoryBarriers: Long, imageMemoryBarrierCount: Int, pImageMemoryBarriers: Long)
	
	external fun cmdPipelineBarrier(address: Long, commandBuffer: Long, srcStageMask: Int, dstStageMask: Int, dependencyFlags: Int, memoryBarrierCount: Int, pMemoryBarriers: Long, bufferMemoryBarrierCount: Int, pBufferMemoryBarriers: Long, imageMemoryBarrierCount: Int, pImageMemoryBarriers: Long)
	
	external fun cmdBeginQuery(address: Long, commandBuffer: Long, queryPool: Long, query: Int, flags: Int)
	
	external fun cmdEndQuery(address: Long, commandBuffer: Long, queryPool: Long, query: Int)
	
	external fun cmdResetQueryPool(address: Long, commandBuffer: Long, queryPool: Long, firstQuery: Int, queryCount: Int)
	
	external fun cmdWriteTimestamp(address: Long, commandBuffer: Long, pipelineStage: Int, queryPool: Long, query: Int)
	
	external fun cmdCopyQueryPoolResults(address: Long, commandBuffer: Long, queryPool: Long, firstQuery: Int, queryCount: Int, dstBuffer: Long, dstOffset: Long, stride: Long, flags: Int)
	
	external fun cmdPushConstants(address: Long, commandBuffer: Long, layout: Long, stageFlags: Int, offset: Int, size: Int, pValues: Long)
	
	external fun cmdBeginRenderPass(address: Long, commandBuffer: Long, pRenderPassBegin: Long, contents: Int)
	
	external fun cmdNextSubpass(address: Long, commandBuffer: Long, contents: Int)
	
	external fun cmdEndRenderPass(address: Long, commandBuffer: Long)
	
	external fun cmdExecuteCommands(address: Long, commandBuffer: Long, commandBufferCount: Int, pCommandBuffers: Long)
	
	external fun enumerateInstanceVersion(address: Long, pApiVersion: Long): Int
	
	external fun bindBufferMemory2(address: Long, device: Long, bindInfoCount: Int, pBindInfos: Long): Int
	
	external fun bindImageMemory2(address: Long, device: Long, bindInfoCount: Int, pBindInfos: Long): Int
	
	external fun getDeviceGroupPeerMemoryFeatures(address: Long, device: Long, heapIndex: Int, localDeviceIndex: Int, remoteDeviceIndex: Int, pPeerMemoryFeatures: Long)
	
	external fun cmdSetDeviceMask(address: Long, commandBuffer: Long, deviceMask: Int)
	
	external fun cmdDispatchBase(address: Long, commandBuffer: Long, baseGroupX: Int, baseGroupY: Int, baseGroupZ: Int, groupCountX: Int, groupCountY: Int, groupCountZ: Int)
	
	external fun enumeratePhysicalDeviceGroups(address: Long, instance: Long, pPhysicalDeviceGroupCount: Long, pPhysicalDeviceGroupProperties: Long): Int
	
	external fun getImageMemoryRequirements2(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)
	
	external fun getBufferMemoryRequirements2(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)
	
	external fun getImageSparseMemoryRequirements2(address: Long, device: Long, pInfo: Long, pSparseMemoryRequirementCount: Long, pSparseMemoryRequirements: Long)
	
	external fun getPhysicalDeviceFeatures2(address: Long, physicalDevice: Long, pFeatures: Long)
	
	external fun getPhysicalDeviceProperties2(address: Long, physicalDevice: Long, pProperties: Long)
	
	external fun getPhysicalDeviceFormatProperties2(address: Long, physicalDevice: Long, format: Int, pFormatProperties: Long)
	
	external fun getPhysicalDeviceImageFormatProperties2(address: Long, physicalDevice: Long, pImageFormatInfo: Long, pImageFormatProperties: Long): Int
	
	external fun getPhysicalDeviceQueueFamilyProperties2(address: Long, physicalDevice: Long, pQueueFamilyPropertyCount: Long, pQueueFamilyProperties: Long)
	
	external fun getPhysicalDeviceMemoryProperties2(address: Long, physicalDevice: Long, pMemoryProperties: Long)
	
	external fun getPhysicalDeviceSparseImageFormatProperties2(address: Long, physicalDevice: Long, pFormatInfo: Long, pPropertyCount: Long, pProperties: Long)
	
	external fun trimCommandPool(address: Long, device: Long, commandPool: Long, flags: Int)
	
	external fun getDeviceQueue2(address: Long, device: Long, pQueueInfo: Long, pQueue: Long)
	
	external fun createSamplerYcbcrConversion(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pYcbcrConversion: Long): Int
	
	external fun destroySamplerYcbcrConversion(address: Long, device: Long, ycbcrConversion: Long, pAllocator: Long)
	
	external fun createDescriptorUpdateTemplate(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pDescriptorUpdateTemplate: Long): Int
	
	external fun destroyDescriptorUpdateTemplate(address: Long, device: Long, descriptorUpdateTemplate: Long, pAllocator: Long)
	
	external fun updateDescriptorSetWithTemplate(address: Long, device: Long, descriptorSet: Long, descriptorUpdateTemplate: Long, pData: Long)
	
	external fun getPhysicalDeviceExternalBufferProperties(address: Long, physicalDevice: Long, pExternalBufferInfo: Long, pExternalBufferProperties: Long)
	
	external fun getPhysicalDeviceExternalFenceProperties(address: Long, physicalDevice: Long, pExternalFenceInfo: Long, pExternalFenceProperties: Long)
	
	external fun getPhysicalDeviceExternalSemaphoreProperties(address: Long, physicalDevice: Long, pExternalSemaphoreInfo: Long, pExternalSemaphoreProperties: Long)
	
	external fun getDescriptorSetLayoutSupport(address: Long, device: Long, pCreateInfo: Long, pSupport: Long)
	
	external fun cmdDrawIndirectCount(address: Long, commandBuffer: Long, buffer: Long, offset: Long, countBuffer: Long, countBufferOffset: Long, maxDrawCount: Int, stride: Int)
	
	external fun cmdDrawIndexedIndirectCount(address: Long, commandBuffer: Long, buffer: Long, offset: Long, countBuffer: Long, countBufferOffset: Long, maxDrawCount: Int, stride: Int)
	
	external fun createRenderPass2(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pRenderPass: Long): Int
	
	external fun cmdBeginRenderPass2(address: Long, commandBuffer: Long, pRenderPassBegin: Long, pSubpassBeginInfo: Long)
	
	external fun cmdNextSubpass2(address: Long, commandBuffer: Long, pSubpassBeginInfo: Long, pSubpassEndInfo: Long)
	
	external fun cmdEndRenderPass2(address: Long, commandBuffer: Long, pSubpassEndInfo: Long)
	
	external fun resetQueryPool(address: Long, device: Long, queryPool: Long, firstQuery: Int, queryCount: Int)
	
	external fun getSemaphoreCounterValue(address: Long, device: Long, semaphore: Long, pValue: Long): Int
	
	external fun waitSemaphores(address: Long, device: Long, pWaitInfo: Long, timeout: Long): Int
	
	external fun signalSemaphore(address: Long, device: Long, pSignalInfo: Long): Int
	
	external fun getBufferDeviceAddress(address: Long, device: Long, pInfo: Long): Long
	
	external fun getBufferOpaqueCaptureAddress(address: Long, device: Long, pInfo: Long): Long
	
	external fun getDeviceMemoryOpaqueCaptureAddress(address: Long, device: Long, pInfo: Long): Long
	
	external fun destroySurface(address: Long, instance: Long, surface: Long, pAllocator: Long)
	
	external fun getPhysicalDeviceSurfaceSupport(address: Long, physicalDevice: Long, queueFamilyIndex: Int, surface: Long, pSupported: Long): Int
	
	external fun getPhysicalDeviceSurfaceCapabilities(address: Long, physicalDevice: Long, surface: Long, pSurfaceCapabilities: Long): Int
	
	external fun getPhysicalDeviceSurfaceFormats(address: Long, physicalDevice: Long, surface: Long, pSurfaceFormatCount: Long, pSurfaceFormats: Long): Int
	
	external fun getPhysicalDeviceSurfacePresentModes(address: Long, physicalDevice: Long, surface: Long, pPresentModeCount: Long, pPresentModes: Long): Int
	
	external fun createSwapchain(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pSwapchain: Long): Int
	
	external fun destroySwapchain(address: Long, device: Long, swapchain: Long, pAllocator: Long)
	
	external fun getSwapchainImages(address: Long, device: Long, swapchain: Long, pSwapchainImageCount: Long, pSwapchainImages: Long): Int
	
	external fun acquireNextImage(address: Long, device: Long, swapchain: Long, timeout: Long, semaphore: Long, fence: Long, pImageIndex: Long): Int
	
	external fun queuePresent(address: Long, queue: Long, pPresentInfo: Long): Int
	
	external fun getDeviceGroupPresentCapabilities(address: Long, device: Long, pDeviceGroupPresentCapabilities: Long): Int
	
	external fun getDeviceGroupSurfacePresentModes(address: Long, device: Long, surface: Long, pModes: Long): Int
	
	external fun getPhysicalDevicePresentRectangles(address: Long, physicalDevice: Long, surface: Long, pRectCount: Long, pRects: Long): Int
	
	external fun acquireNextImage2(address: Long, device: Long, pAcquireInfo: Long, pImageIndex: Long): Int
	
	external fun getPhysicalDeviceDisplayProperties(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getPhysicalDeviceDisplayPlaneProperties(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getDisplayPlaneSupportedDisplays(address: Long, physicalDevice: Long, planeIndex: Int, pDisplayCount: Long, pDisplays: Long): Int
	
	external fun getDisplayModeProperties(address: Long, physicalDevice: Long, display: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun createDisplayMode(address: Long, physicalDevice: Long, display: Long, pCreateInfo: Long, pAllocator: Long, pMode: Long): Int
	
	external fun getDisplayPlaneCapabilities(address: Long, physicalDevice: Long, mode: Long, planeIndex: Int, pCapabilities: Long): Int
	
	external fun createDisplayPlaneSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun createSharedSwapchains(address: Long, device: Long, swapchainCount: Int, pCreateInfos: Long, pAllocator: Long, pSwapchains: Long): Int
	
	external fun createXlibSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceXlibPresentationSupport(address: Long, physicalDevice: Long, queueFamilyIndex: Int, dpy: Long, visualID: Long): Int
	
	external fun createXcbSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceXcbPresentationSupport(address: Long, physicalDevice: Long, queueFamilyIndex: Int, connection: Long, visual_id: Long): Int
	
	external fun createWaylandSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceWaylandPresentationSupport(address: Long, physicalDevice: Long, queueFamilyIndex: Int, display: Long): Int
	
	external fun createAndroidSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun createWin32Surface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceWin32PresentationSupport(address: Long, physicalDevice: Long, queueFamilyIndex: Int): Int
	
	external fun getPhysicalDeviceVideoCapabilities(address: Long, physicalDevice: Long, pVideoProfile: Long, pCapabilities: Long): Int
	
	external fun getPhysicalDeviceVideoFormatProperties(address: Long, physicalDevice: Long, pVideoFormatInfo: Long, pVideoFormatPropertyCount: Long, pVideoFormatProperties: Long): Int
	
	external fun createVideoSession(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pVideoSession: Long): Int
	
	external fun destroyVideoSession(address: Long, device: Long, videoSession: Long, pAllocator: Long)
	
	external fun getVideoSessionMemoryRequirements(address: Long, device: Long, videoSession: Long, pVideoSessionMemoryRequirementsCount: Long, pVideoSessionMemoryRequirements: Long): Int
	
	external fun bindVideoSessionMemory(address: Long, device: Long, videoSession: Long, videoSessionBindMemoryCount: Int, pVideoSessionBindMemories: Long): Int
	
	external fun createVideoSessionParameters(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pVideoSessionParameters: Long): Int
	
	external fun updateVideoSessionParameters(address: Long, device: Long, videoSessionParameters: Long, pUpdateInfo: Long): Int
	
	external fun destroyVideoSessionParameters(address: Long, device: Long, videoSessionParameters: Long, pAllocator: Long)
	
	external fun cmdBeginVideoCoding(address: Long, commandBuffer: Long, pBeginInfo: Long)
	
	external fun cmdEndVideoCoding(address: Long, commandBuffer: Long, pEndCodingInfo: Long)
	
	external fun cmdControlVideoCoding(address: Long, commandBuffer: Long, pCodingControlInfo: Long)
	
	external fun cmdDecodeVideo(address: Long, commandBuffer: Long, pFrameInfo: Long)
	
	external fun cmdBindTransformFeedbackBuffers(address: Long, commandBuffer: Long, firstBinding: Int, bindingCount: Int, pBuffers: Long, pOffsets: Long, pSizes: Long)
	
	external fun cmdBeginTransformFeedback(address: Long, commandBuffer: Long, firstCounterBuffer: Int, counterBufferCount: Int, pCounterBuffers: Long, pCounterBufferOffsets: Long)
	
	external fun cmdEndTransformFeedback(address: Long, commandBuffer: Long, firstCounterBuffer: Int, counterBufferCount: Int, pCounterBuffers: Long, pCounterBufferOffsets: Long)
	
	external fun cmdBeginQueryIndexed(address: Long, commandBuffer: Long, queryPool: Long, query: Int, flags: Int, index: Int)
	
	external fun cmdEndQueryIndexed(address: Long, commandBuffer: Long, queryPool: Long, query: Int, index: Int)
	
	external fun cmdDrawIndirectByteCount(address: Long, commandBuffer: Long, instanceCount: Int, firstInstance: Int, counterBuffer: Long, counterBufferOffset: Long, counterOffset: Int, vertexStride: Int)
	
	external fun createCuModule(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pModule: Long): Int
	
	external fun createCuFunction(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pFunction: Long): Int
	
	external fun destroyCuModule(address: Long, device: Long, module: Long, pAllocator: Long)
	
	external fun destroyCuFunction(address: Long, device: Long, function: Long, pAllocator: Long)
	
	external fun cmdCuLaunchKernel(address: Long, commandBuffer: Long, pLaunchInfo: Long)
	
	external fun getImageViewHandle(address: Long, device: Long, pInfo: Long): Int
	
	external fun getImageViewAddress(address: Long, device: Long, imageView: Long, pProperties: Long): Int
	
	external fun getShaderInfo(address: Long, device: Long, pipeline: Long, shaderStage: Int, infoType: Int, pInfoSize: Long, pInfo: Long): Int
	
	external fun cmdBeginRendering(address: Long, commandBuffer: Long, pRenderingInfo: Long)
	
	external fun cmdEndRendering(address: Long, commandBuffer: Long)
	
	external fun createStreamDescriptorSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun createViSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getMemoryWin32Handle(address: Long, device: Long, pGetWin32HandleInfo: Long, pHandle: Long): Int
	
	external fun getMemoryWin32HandleProperties(address: Long, device: Long, handleType: Int, handle: Long, pMemoryWin32HandleProperties: Long): Int
	
	external fun getMemoryFd(address: Long, device: Long, pGetFdInfo: Long, pFd: Long): Int
	
	external fun getMemoryFdProperties(address: Long, device: Long, handleType: Int, fd: Int, pMemoryFdProperties: Long): Int
	
	external fun importSemaphoreWin32Handle(address: Long, device: Long, pImportSemaphoreWin32HandleInfo: Long): Int
	
	external fun getSemaphoreWin32Handle(address: Long, device: Long, pGetWin32HandleInfo: Long, pHandle: Long): Int
	
	external fun importSemaphoreFd(address: Long, device: Long, pImportSemaphoreFdInfo: Long): Int
	
	external fun getSemaphoreFd(address: Long, device: Long, pGetFdInfo: Long, pFd: Long): Int
	
	external fun cmdPushDescriptorSet(address: Long, commandBuffer: Long, pipelineBindPoint: Int, layout: Long, set: Int, descriptorWriteCount: Int, pDescriptorWrites: Long)
	
	external fun cmdPushDescriptorSetWithTemplate(address: Long, commandBuffer: Long, descriptorUpdateTemplate: Long, layout: Long, set: Int, pData: Long)
	
	external fun cmdBeginConditionalRendering(address: Long, commandBuffer: Long, pConditionalRenderingBegin: Long)
	
	external fun cmdEndConditionalRendering(address: Long, commandBuffer: Long)
	
	external fun cmdSetViewportWScaling(address: Long, commandBuffer: Long, firstViewport: Int, viewportCount: Int, pViewportWScalings: Long)
	
	external fun releaseDisplay(address: Long, physicalDevice: Long, display: Long): Int
	
	external fun acquireXlibDisplay(address: Long, physicalDevice: Long, dpy: Long, display: Long): Int
	
	external fun getRandROutputDisplay(address: Long, physicalDevice: Long, dpy: Long, rrOutput: Long, pDisplay: Long): Int
	
	external fun vkGetPhysicalDeviceSurfaceCapabilities2EXT(address: Long, physicalDevice: Long, surface: Long, pSurfaceCapabilities: Long): Int
	
	external fun displayPowerControl(address: Long, device: Long, display: Long, pDisplayPowerInfo: Long): Int
	
	external fun registerDeviceEvent(address: Long, device: Long, pDeviceEventInfo: Long, pAllocator: Long, pFence: Long): Int
	
	external fun registerDisplayEvent(address: Long, device: Long, display: Long, pDisplayEventInfo: Long, pAllocator: Long, pFence: Long): Int
	
	external fun getSwapchainCounter(address: Long, device: Long, swapchain: Long, counter: Int, pCounterValue: Long): Int
	
	external fun getRefreshCycleDuration(address: Long, device: Long, swapchain: Long, pDisplayTimingProperties: Long): Int
	
	external fun getPastPresentationTiming(address: Long, device: Long, swapchain: Long, pPresentationTimingCount: Long, pPresentationTimings: Long): Int
	
	external fun cmdSetDiscardRectangle(address: Long, commandBuffer: Long, firstDiscardRectangle: Int, discardRectangleCount: Int, pDiscardRectangles: Long)
	
	external fun setHdrMetadata(address: Long, device: Long, swapchainCount: Int, pSwapchains: Long, pMetadata: Long)
	
	external fun getSwapchainStatus(address: Long, device: Long, swapchain: Long): Int
	
	external fun importFenceWin32Handle(address: Long, device: Long, pImportFenceWin32HandleInfo: Long): Int
	
	external fun getFenceWin32Handle(address: Long, device: Long, pGetWin32HandleInfo: Long, pHandle: Long): Int
	
	external fun importFenceFd(address: Long, device: Long, pImportFenceFdInfo: Long): Int
	
	external fun getFenceFd(address: Long, device: Long, pGetFdInfo: Long, pFd: Long): Int
	
	external fun enumeratePhysicalDeviceQueueFamilyPerformanceQueryCounters(address: Long, physicalDevice: Long, queueFamilyIndex: Int, pCounterCount: Long, pCounters: Long, pCounterDescriptions: Long): Int
	
	external fun getPhysicalDeviceQueueFamilyPerformanceQueryPasses(address: Long, physicalDevice: Long, pPerformanceQueryCreateInfo: Long, pNumPasses: Long)
	
	external fun acquireProfilingLock(address: Long, device: Long, pInfo: Long): Int
	
	external fun releaseProfilingLock(address: Long, device: Long)
	
	external fun vkGetPhysicalDeviceSurfaceCapabilities2KHR(address: Long, physicalDevice: Long, pSurfaceInfo: Long, pSurfaceCapabilities: Long): Int
	
	external fun getPhysicalDeviceSurfaceFormats2(address: Long, physicalDevice: Long, pSurfaceInfo: Long, pSurfaceFormatCount: Long, pSurfaceFormats: Long): Int
	
	external fun getPhysicalDeviceDisplayProperties2(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getPhysicalDeviceDisplayPlaneProperties2(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getDisplayModeProperties2(address: Long, physicalDevice: Long, display: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getDisplayPlaneCapabilities2(address: Long, physicalDevice: Long, pDisplayPlaneInfo: Long, pCapabilities: Long): Int
	
	external fun setDebugUtilsObjectName(address: Long, device: Long, pNameInfo: Long): Int
	
	external fun setDebugUtilsObjectTag(address: Long, device: Long, pTagInfo: Long): Int
	
	external fun queueBeginDebugUtilsLabel(address: Long, queue: Long, pLabelInfo: Long)
	
	external fun queueEndDebugUtilsLabel(address: Long, queue: Long)
	
	external fun queueInsertDebugUtilsLabel(address: Long, queue: Long, pLabelInfo: Long)
	
	external fun cmdBeginDebugUtilsLabel(address: Long, commandBuffer: Long, pLabelInfo: Long)
	
	external fun cmdEndDebugUtilsLabel(address: Long, commandBuffer: Long)
	
	external fun cmdInsertDebugUtilsLabel(address: Long, commandBuffer: Long, pLabelInfo: Long)
	
	external fun createDebugUtilsMessenger(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pMessenger: Long): Int
	
	external fun destroyDebugUtilsMessenger(address: Long, instance: Long, messenger: Long, pAllocator: Long)
	
	external fun submitDebugUtilsMessage(address: Long, instance: Long, messageSeverity: Int, messageTypes: Int, pCallbackData: Long)
	
	external fun getAndroidHardwareBufferProperties(address: Long, device: Long, buffer: Long, pProperties: Long): Int
	
	external fun getMemoryAndroidHardwareBuffer(address: Long, device: Long, pInfo: Long, pBuffer: Long): Int
	
	external fun cmdSetSampleLocations(address: Long, commandBuffer: Long, pSampleLocationsInfo: Long)
	
	external fun getPhysicalDeviceMultisampleProperties(address: Long, physicalDevice: Long, samples: Int, pMultisampleProperties: Long)
	
	external fun vkCreateAccelerationStructureKHR(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pAccelerationStructure: Long): Int
	
	external fun vkDestroyAccelerationStructureKHR(address: Long, device: Long, accelerationStructure: Long, pAllocator: Long)
	
	external fun cmdBuildAccelerationStructures(address: Long, commandBuffer: Long, infoCount: Int, pInfos: Long, ppBuildRangeInfos: Long)
	
	external fun cmdBuildAccelerationStructuresIndirect(address: Long, commandBuffer: Long, infoCount: Int, pInfos: Long, pIndirectDeviceAddresses: Long, pIndirectStrides: Long, ppMaxPrimitiveCounts: Long)
	
	external fun buildAccelerationStructures(address: Long, device: Long, deferredOperation: Long, infoCount: Int, pInfos: Long, ppBuildRangeInfos: Long): Int
	
	external fun copyAccelerationStructure(address: Long, device: Long, deferredOperation: Long, pInfo: Long): Int
	
	external fun copyAccelerationStructureToMemory(address: Long, device: Long, deferredOperation: Long, pInfo: Long): Int
	
	external fun copyMemoryToAccelerationStructure(address: Long, device: Long, deferredOperation: Long, pInfo: Long): Int
	
	external fun writeAccelerationStructuresProperties(address: Long, device: Long, accelerationStructureCount: Int, pAccelerationStructures: Long, queryType: Int, dataSize: Long, pData: Long, stride: Long): Int
	
	external fun vkCmdCopyAccelerationStructureKHR(address: Long, commandBuffer: Long, pInfo: Long)
	
	external fun cmdCopyAccelerationStructureToMemory(address: Long, commandBuffer: Long, pInfo: Long)
	
	external fun cmdCopyMemoryToAccelerationStructure(address: Long, commandBuffer: Long, pInfo: Long)
	
	external fun getAccelerationStructureDeviceAddress(address: Long, device: Long, pInfo: Long): Long
	
	external fun vkCmdWriteAccelerationStructuresPropertiesKHR(address: Long, commandBuffer: Long, accelerationStructureCount: Int, pAccelerationStructures: Long, queryType: Int, queryPool: Long, firstQuery: Int)
	
	external fun getDeviceAccelerationStructureCompatibility(address: Long, device: Long, pVersionInfo: Long, pCompatibility: Long)
	
	external fun getAccelerationStructureBuildSizes(address: Long, device: Long, buildType: Int, pBuildInfo: Long, pMaxPrimitiveCounts: Long, pSizeInfo: Long)
	
	external fun vkCmdTraceRaysKHR(address: Long, commandBuffer: Long, pRaygenShaderBindingTable: Long, pMissShaderBindingTable: Long, pHitShaderBindingTable: Long, pCallableShaderBindingTable: Long, width: Int, height: Int, depth: Int)
	
	external fun vkCreateRayTracingPipelinesKHR(address: Long, device: Long, deferredOperation: Long, pipelineCache: Long, createInfoCount: Int, pCreateInfos: Long, pAllocator: Long, pPipelines: Long): Int
	
	external fun getRayTracingShaderGroupHandles(address: Long, device: Long, pipeline: Long, firstGroup: Int, groupCount: Int, dataSize: Long, pData: Long): Int
	
	external fun getRayTracingCaptureReplayShaderGroupHandles(address: Long, device: Long, pipeline: Long, firstGroup: Int, groupCount: Int, dataSize: Long, pData: Long): Int
	
	external fun cmdTraceRaysIndirect(address: Long, commandBuffer: Long, pRaygenShaderBindingTable: Long, pMissShaderBindingTable: Long, pHitShaderBindingTable: Long, pCallableShaderBindingTable: Long, indirectDeviceAddress: Long)
	
	external fun getRayTracingShaderGroupStackSize(address: Long, device: Long, pipeline: Long, group: Int, groupShader: Int): Long
	
	external fun cmdSetRayTracingPipelineStackSize(address: Long, commandBuffer: Long, pipelineStackSize: Int)
	
	external fun getImageDrmFormatModifierProperties(address: Long, device: Long, image: Long, pProperties: Long): Int
	
	external fun createValidationCache(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pValidationCache: Long): Int
	
	external fun destroyValidationCache(address: Long, device: Long, validationCache: Long, pAllocator: Long)
	
	external fun mergeValidationCaches(address: Long, device: Long, dstCache: Long, srcCacheCount: Int, pSrcCaches: Long): Int
	
	external fun getValidationCacheData(address: Long, device: Long, validationCache: Long, pDataSize: Long, pData: Long): Int
	
	external fun cmdBindShadingRateImage(address: Long, commandBuffer: Long, imageView: Long, imageLayout: Int)
	
	external fun cmdSetViewportShadingRatePalette(address: Long, commandBuffer: Long, firstViewport: Int, viewportCount: Int, pShadingRatePalettes: Long)
	
	external fun cmdSetCoarseSampleOrder(address: Long, commandBuffer: Long, sampleOrderType: Int, customSampleOrderCount: Int, pCustomSampleOrders: Long)
	
	external fun vkCreateAccelerationStructureNV(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pAccelerationStructure: Long): Int
	
	external fun vkDestroyAccelerationStructureNV(address: Long, device: Long, accelerationStructure: Long, pAllocator: Long)
	
	external fun getAccelerationStructureMemoryRequirements(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)
	
	external fun bindAccelerationStructureMemory(address: Long, device: Long, bindInfoCount: Int, pBindInfos: Long): Int
	
	external fun cmdBuildAccelerationStructure(address: Long, commandBuffer: Long, pInfo: Long, instanceData: Long, instanceOffset: Long, update: Int, dst: Long, src: Long, scratch: Long, scratchOffset: Long)
	
	external fun vkCmdCopyAccelerationStructureNV(address: Long, commandBuffer: Long, dst: Long, src: Long, mode: Int)
	
	external fun vkCmdTraceRaysNV(address: Long, commandBuffer: Long, raygenShaderBindingTableBuffer: Long, raygenShaderBindingOffset: Long, missShaderBindingTableBuffer: Long, missShaderBindingOffset: Long, missShaderBindingStride: Long, hitShaderBindingTableBuffer: Long, hitShaderBindingOffset: Long, hitShaderBindingStride: Long, callableShaderBindingTableBuffer: Long, callableShaderBindingOffset: Long, callableShaderBindingStride: Long, width: Int, height: Int, depth: Int)
	
	external fun vkCreateRayTracingPipelinesNV(address: Long, device: Long, pipelineCache: Long, createInfoCount: Int, pCreateInfos: Long, pAllocator: Long, pPipelines: Long): Int
	
	external fun getAccelerationStructureHandle(address: Long, device: Long, accelerationStructure: Long, dataSize: Long, pData: Long): Int
	
	external fun vkCmdWriteAccelerationStructuresPropertiesNV(address: Long, commandBuffer: Long, accelerationStructureCount: Int, pAccelerationStructures: Long, queryType: Int, queryPool: Long, firstQuery: Int)
	
	external fun compileDeferred(address: Long, device: Long, pipeline: Long, shader: Int): Int
	
	external fun getMemoryHostPointerProperties(address: Long, device: Long, handleType: Int, pHostPointer: Long, pMemoryHostPointerProperties: Long): Int
	
	external fun cmdWriteBufferMarker(address: Long, commandBuffer: Long, pipelineStage: Int, dstBuffer: Long, dstOffset: Long, marker: Int)
	
	external fun getPhysicalDeviceCalibrateableTimeDomains(address: Long, physicalDevice: Long, pTimeDomainCount: Long, pTimeDomains: Long): Int
	
	external fun getCalibratedTimestamps(address: Long, device: Long, timestampCount: Int, pTimestampInfos: Long, pTimestamps: Long, pMaxDeviation: Long): Int
	
	external fun cmdDrawMeshTasks(address: Long, commandBuffer: Long, taskCount: Int, firstTask: Int)
	
	external fun cmdDrawMeshTasksIndirect(address: Long, commandBuffer: Long, buffer: Long, offset: Long, drawCount: Int, stride: Int)
	
	external fun cmdDrawMeshTasksIndirectCount(address: Long, commandBuffer: Long, buffer: Long, offset: Long, countBuffer: Long, countBufferOffset: Long, maxDrawCount: Int, stride: Int)
	
	external fun cmdSetExclusiveScissor(address: Long, commandBuffer: Long, firstExclusiveScissor: Int, exclusiveScissorCount: Int, pExclusiveScissors: Long)
	
	external fun cmdSetCheckpoint(address: Long, commandBuffer: Long, pCheckpointMarker: Long)
	
	external fun getQueueCheckpointData(address: Long, queue: Long, pCheckpointDataCount: Long, pCheckpointData: Long)
	
	external fun initializePerformanceApi(address: Long, device: Long, pInitializeInfo: Long): Int
	
	external fun uninitializePerformanceApi(address: Long, device: Long)
	
	external fun cmdSetPerformanceMarker(address: Long, commandBuffer: Long, pMarkerInfo: Long): Int
	
	external fun cmdSetPerformanceStreamMarker(address: Long, commandBuffer: Long, pMarkerInfo: Long): Int
	
	external fun cmdSetPerformanceOverride(address: Long, commandBuffer: Long, pOverrideInfo: Long): Int
	
	external fun acquirePerformanceConfiguration(address: Long, device: Long, pAcquireInfo: Long, pConfiguration: Long): Int
	
	external fun releasePerformanceConfiguration(address: Long, device: Long, configuration: Long): Int
	
	external fun queueSetPerformanceConfiguration(address: Long, queue: Long, configuration: Long): Int
	
	external fun getPerformanceParameter(address: Long, device: Long, parameter: Int, pValue: Long): Int
	
	external fun setLocalDimming(address: Long, device: Long, swapChain: Long, localDimmingEnable: Int)
	
	external fun createImagePipeSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun createMetalSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceFragmentShadingRates(address: Long, physicalDevice: Long, pFragmentShadingRateCount: Long, pFragmentShadingRates: Long): Int
	
	external fun cmdSetFragmentShadingRate(address: Long, commandBuffer: Long, pFragmentSize: Long, combinerOps: Long)
	
	external fun getPhysicalDeviceToolProperties(address: Long, physicalDevice: Long, pToolCount: Long, pToolProperties: Long): Int
	
	external fun waitForPresent(address: Long, device: Long, swapchain: Long, presentId: Long, timeout: Long): Int
	
	external fun getPhysicalDeviceCooperativeMatrixProperties(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getPhysicalDeviceSupportedFramebufferMixedSamplesCombinations(address: Long, physicalDevice: Long, pCombinationCount: Long, pCombinations: Long): Int
	
	external fun getPhysicalDeviceSurfacePresentModes2(address: Long, physicalDevice: Long, pSurfaceInfo: Long, pPresentModeCount: Long, pPresentModes: Long): Int
	
	external fun acquireFullScreenExclusiveMode(address: Long, device: Long, swapchain: Long): Int
	
	external fun releaseFullScreenExclusiveMode(address: Long, device: Long, swapchain: Long): Int
	
	external fun getDeviceGroupSurfacePresentModes2(address: Long, device: Long, pSurfaceInfo: Long, pModes: Long): Int
	
	external fun createHeadlessSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun cmdSetLineStipple(address: Long, commandBuffer: Long, lineStippleFactor: Int, lineStipplePattern: Short)
	
	external fun cmdSetCullMode(address: Long, commandBuffer: Long, cullMode: Int)
	
	external fun cmdSetFrontFace(address: Long, commandBuffer: Long, frontFace: Int)
	
	external fun cmdSetPrimitiveTopology(address: Long, commandBuffer: Long, primitiveTopology: Int)
	
	external fun cmdSetViewportWithCount(address: Long, commandBuffer: Long, viewportCount: Int, pViewports: Long)
	
	external fun cmdSetScissorWithCount(address: Long, commandBuffer: Long, scissorCount: Int, pScissors: Long)
	
	external fun cmdBindVertexBuffers2(address: Long, commandBuffer: Long, firstBinding: Int, bindingCount: Int, pBuffers: Long, pOffsets: Long, pSizes: Long, pStrides: Long)
	
	external fun cmdSetDepthTestEnable(address: Long, commandBuffer: Long, depthTestEnable: Int)
	
	external fun cmdSetDepthWriteEnable(address: Long, commandBuffer: Long, depthWriteEnable: Int)
	
	external fun cmdSetDepthCompareOp(address: Long, commandBuffer: Long, depthCompareOp: Int)
	
	external fun cmdSetDepthBoundsTestEnable(address: Long, commandBuffer: Long, depthBoundsTestEnable: Int)
	
	external fun cmdSetStencilTestEnable(address: Long, commandBuffer: Long, stencilTestEnable: Int)
	
	external fun cmdSetStencilOp(address: Long, commandBuffer: Long, faceMask: Int, failOp: Int, passOp: Int, depthFailOp: Int, compareOp: Int)
	
	external fun createDeferredOperation(address: Long, device: Long, pAllocator: Long, pDeferredOperation: Long): Int
	
	external fun destroyDeferredOperation(address: Long, device: Long, operation: Long, pAllocator: Long)
	
	external fun getDeferredOperationMaxConcurrency(address: Long, device: Long, operation: Long): Int
	
	external fun getDeferredOperationResult(address: Long, device: Long, operation: Long): Int
	
	external fun deferredOperationJoin(address: Long, device: Long, operation: Long): Int
	
	external fun getPipelineExecutableProperties(address: Long, device: Long, pPipelineInfo: Long, pExecutableCount: Long, pProperties: Long): Int
	
	external fun getPipelineExecutableStatistics(address: Long, device: Long, pExecutableInfo: Long, pStatisticCount: Long, pStatistics: Long): Int
	
	external fun getPipelineExecutableInternalRepresentations(address: Long, device: Long, pExecutableInfo: Long, pInternalRepresentationCount: Long, pInternalRepresentations: Long): Int
	
	external fun getGeneratedCommandsMemoryRequirements(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)
	
	external fun cmdPreprocessGeneratedCommands(address: Long, commandBuffer: Long, pGeneratedCommandsInfo: Long)
	
	external fun cmdExecuteGeneratedCommands(address: Long, commandBuffer: Long, isPreprocessed: Int, pGeneratedCommandsInfo: Long)
	
	external fun cmdBindPipelineShaderGroup(address: Long, commandBuffer: Long, pipelineBindPoint: Int, pipeline: Long, groupIndex: Int)
	
	external fun createIndirectCommandsLayout(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pIndirectCommandsLayout: Long): Int
	
	external fun destroyIndirectCommandsLayout(address: Long, device: Long, indirectCommandsLayout: Long, pAllocator: Long)
	
	external fun acquireDrmDisplay(address: Long, physicalDevice: Long, drmFd: Int, display: Long): Int
	
	external fun getDrmDisplay(address: Long, physicalDevice: Long, drmFd: Int, connectorId: Int, display: Long): Int
	
	external fun createPrivateDataSlot(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pPrivateDataSlot: Long): Int
	
	external fun destroyPrivateDataSlot(address: Long, device: Long, privateDataSlot: Long, pAllocator: Long)
	
	external fun setPrivateData(address: Long, device: Long, objectType: Int, objectHandle: Long, privateDataSlot: Long, data: Long): Int
	
	external fun getPrivateData(address: Long, device: Long, objectType: Int, objectHandle: Long, privateDataSlot: Long, pData: Long)
	
	external fun cmdEncodeVideo(address: Long, commandBuffer: Long, pEncodeInfo: Long)
	
	external fun cmdSetEvent2(address: Long, commandBuffer: Long, event: Long, pDependencyInfo: Long)
	
	external fun cmdResetEvent2(address: Long, commandBuffer: Long, event: Long, stageMask: Long)
	
	external fun cmdWaitEvents2(address: Long, commandBuffer: Long, eventCount: Int, pEvents: Long, pDependencyInfos: Long)
	
	external fun cmdPipelineBarrier2(address: Long, commandBuffer: Long, pDependencyInfo: Long)
	
	external fun cmdWriteTimestamp2(address: Long, commandBuffer: Long, stage: Long, queryPool: Long, query: Int)
	
	external fun queueSubmit2(address: Long, queue: Long, submitCount: Int, pSubmits: Long, fence: Long): Int
	
	external fun cmdWriteBufferMarker2(address: Long, commandBuffer: Long, stage: Long, dstBuffer: Long, dstOffset: Long, marker: Int)
	
	external fun getQueueCheckpointData2(address: Long, queue: Long, pCheckpointDataCount: Long, pCheckpointData: Long)
	
	external fun cmdSetFragmentShadingRateEnum(address: Long, commandBuffer: Long, shadingRate: Int, combinerOps: Long)
	
	external fun cmdCopyBuffer2(address: Long, commandBuffer: Long, pCopyBufferInfo: Long)
	
	external fun cmdCopyImage2(address: Long, commandBuffer: Long, pCopyImageInfo: Long)
	
	external fun cmdCopyBufferToImage2(address: Long, commandBuffer: Long, pCopyBufferToImageInfo: Long)
	
	external fun cmdCopyImageToBuffer2(address: Long, commandBuffer: Long, pCopyImageToBufferInfo: Long)
	
	external fun cmdBlitImage2(address: Long, commandBuffer: Long, pBlitImageInfo: Long)
	
	external fun cmdResolveImage2(address: Long, commandBuffer: Long, pResolveImageInfo: Long)
	
	external fun acquireWinrtDisplay(address: Long, physicalDevice: Long, display: Long): Int
	
	external fun getWinrtDisplay(address: Long, physicalDevice: Long, deviceRelativeId: Int, pDisplay: Long): Int
	
	external fun createDirectFBSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceDirectFBPresentationSupport(address: Long, physicalDevice: Long, queueFamilyIndex: Int, dfb: Long): Int
	
	external fun cmdSetVertexInput(address: Long, commandBuffer: Long, vertexBindingDescriptionCount: Int, pVertexBindingDescriptions: Long, vertexAttributeDescriptionCount: Int, pVertexAttributeDescriptions: Long)
	
	external fun getMemoryZirconHandle(address: Long, device: Long, pGetZirconHandleInfo: Long, pZirconHandle: Long): Int
	
	external fun getMemoryZirconHandleProperties(address: Long, device: Long, handleType: Int, zirconHandle: Long, pMemoryZirconHandleProperties: Long): Int
	
	external fun importSemaphoreZirconHandle(address: Long, device: Long, pImportSemaphoreZirconHandleInfo: Long): Int
	
	external fun getSemaphoreZirconHandle(address: Long, device: Long, pGetZirconHandleInfo: Long, pZirconHandle: Long): Int
	
	external fun createBufferCollection(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pCollection: Long): Int
	
	external fun setBufferCollectionImageConstraints(address: Long, device: Long, collection: Long, pImageConstraintsInfo: Long): Int
	
	external fun setBufferCollectionBufferConstraints(address: Long, device: Long, collection: Long, pBufferConstraintsInfo: Long): Int
	
	external fun destroyBufferCollection(address: Long, device: Long, collection: Long, pAllocator: Long)
	
	external fun getBufferCollectionProperties(address: Long, device: Long, collection: Long, pProperties: Long): Int
	
	external fun getDeviceSubpassShadingMaxWorkgroupSize(address: Long, device: Long, renderpass: Long, pMaxWorkgroupSize: Long): Int
	
	external fun cmdSubpassShading(address: Long, commandBuffer: Long)
	
	external fun cmdBindInvocationMask(address: Long, commandBuffer: Long, imageView: Long, imageLayout: Int)
	
	external fun getMemoryRemoteAddress(address: Long, device: Long, pMemoryGetRemoteAddressInfo: Long, pAddress: Long): Int
	
	external fun cmdSetPatchControlPoints(address: Long, commandBuffer: Long, patchControlPoints: Int)
	
	external fun cmdSetRasterizerDiscardEnable(address: Long, commandBuffer: Long, rasterizerDiscardEnable: Int)
	
	external fun cmdSetDepthBiasEnable(address: Long, commandBuffer: Long, depthBiasEnable: Int)
	
	external fun cmdSetLogicOp(address: Long, commandBuffer: Long, logicOp: Int)
	
	external fun cmdSetPrimitiveRestartEnable(address: Long, commandBuffer: Long, primitiveRestartEnable: Int)
	
	external fun createScreenSurface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceScreenPresentationSupport(address: Long, physicalDevice: Long, queueFamilyIndex: Int, window: Long): Int
	
	external fun cmdSetColorWriteEnable(address: Long, commandBuffer: Long, attachmentCount: Int, pColorWriteEnables: Long)
	
	external fun cmdDrawMulti(address: Long, commandBuffer: Long, drawCount: Int, pVertexInfo: Long, instanceCount: Int, firstInstance: Int, stride: Int)
	
	external fun cmdDrawMultiIndexed(address: Long, commandBuffer: Long, drawCount: Int, pIndexInfo: Long, instanceCount: Int, firstInstance: Int, stride: Int, pVertexOffset: Long)
	
	external fun setDeviceMemoryPriority(address: Long, device: Long, memory: Long, priority: Float)
	
	external fun getDeviceBufferMemoryRequirements(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)
	
	external fun getDeviceImageMemoryRequirements(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)
	
	external fun getDeviceImageSparseMemoryRequirements(address: Long, device: Long, pInfo: Long, pSparseMemoryRequirementCount: Long, pSparseMemoryRequirements: Long)


}



class InstanceCommands(private val instance: InstanceH) {
	
	
	private fun addr(name: String) = Commands.getInstanceProcAddr(instance.address, default.encodeUtf8NT(name).address)
	
	
	
	private val stackPointer = default.push()
	private val destroyInstanceAddr = addr("vkDestroyInstance")
	private val enumeratePhysicalDevicesAddr = addr("vkEnumeratePhysicalDevices")
	private val getPhysicalDeviceFeaturesAddr = addr("vkGetPhysicalDeviceFeatures")
	private val getPhysicalDeviceFormatPropertiesAddr = addr("vkGetPhysicalDeviceFormatProperties")
	private val getPhysicalDeviceImageFormatPropertiesAddr = addr("vkGetPhysicalDeviceImageFormatProperties")
	private val getPhysicalDevicePropertiesAddr = addr("vkGetPhysicalDeviceProperties")
	private val getPhysicalDeviceQueueFamilyPropertiesAddr = addr("vkGetPhysicalDeviceQueueFamilyProperties")
	private val getPhysicalDeviceMemoryPropertiesAddr = addr("vkGetPhysicalDeviceMemoryProperties")
	private val getDeviceProcAddrAddr = addr("vkGetDeviceProcAddr")
	private val createDeviceAddr = addr("vkCreateDevice")
	private val enumerateDeviceExtensionPropertiesAddr = addr("vkEnumerateDeviceExtensionProperties")
	private val enumerateDeviceLayerPropertiesAddr = addr("vkEnumerateDeviceLayerProperties")
	private val getPhysicalDeviceSparseImageFormatPropertiesAddr = addr("vkGetPhysicalDeviceSparseImageFormatProperties")
	private val enumeratePhysicalDeviceGroupsAddr = addr("vkEnumeratePhysicalDeviceGroups")
	private val getPhysicalDeviceFeatures2Addr = addr("vkGetPhysicalDeviceFeatures2")
	private val getPhysicalDeviceProperties2Addr = addr("vkGetPhysicalDeviceProperties2")
	private val getPhysicalDeviceFormatProperties2Addr = addr("vkGetPhysicalDeviceFormatProperties2")
	private val getPhysicalDeviceImageFormatProperties2Addr = addr("vkGetPhysicalDeviceImageFormatProperties2")
	private val getPhysicalDeviceQueueFamilyProperties2Addr = addr("vkGetPhysicalDeviceQueueFamilyProperties2")
	private val getPhysicalDeviceMemoryProperties2Addr = addr("vkGetPhysicalDeviceMemoryProperties2")
	private val getPhysicalDeviceSparseImageFormatProperties2Addr = addr("vkGetPhysicalDeviceSparseImageFormatProperties2")
	private val getPhysicalDeviceExternalBufferPropertiesAddr = addr("vkGetPhysicalDeviceExternalBufferProperties")
	private val getPhysicalDeviceExternalFencePropertiesAddr = addr("vkGetPhysicalDeviceExternalFenceProperties")
	private val getPhysicalDeviceExternalSemaphorePropertiesAddr = addr("vkGetPhysicalDeviceExternalSemaphoreProperties")
	private val destroySurfaceAddr = addr("vkDestroySurfaceKHR")
	private val getPhysicalDeviceSurfaceSupportAddr = addr("vkGetPhysicalDeviceSurfaceSupportKHR")
	private val getPhysicalDeviceSurfaceCapabilitiesAddr = addr("vkGetPhysicalDeviceSurfaceCapabilitiesKHR")
	private val getPhysicalDeviceSurfaceFormatsAddr = addr("vkGetPhysicalDeviceSurfaceFormatsKHR")
	private val getPhysicalDeviceSurfacePresentModesAddr = addr("vkGetPhysicalDeviceSurfacePresentModesKHR")
	private val getPhysicalDevicePresentRectanglesAddr = addr("vkGetPhysicalDevicePresentRectanglesKHR")
	private val getPhysicalDeviceDisplayPropertiesAddr = addr("vkGetPhysicalDeviceDisplayPropertiesKHR")
	private val getPhysicalDeviceDisplayPlanePropertiesAddr = addr("vkGetPhysicalDeviceDisplayPlanePropertiesKHR")
	private val getDisplayPlaneSupportedDisplaysAddr = addr("vkGetDisplayPlaneSupportedDisplaysKHR")
	private val getDisplayModePropertiesAddr = addr("vkGetDisplayModePropertiesKHR")
	private val createDisplayModeAddr = addr("vkCreateDisplayModeKHR")
	private val getDisplayPlaneCapabilitiesAddr = addr("vkGetDisplayPlaneCapabilitiesKHR")
	private val createDisplayPlaneSurfaceAddr = addr("vkCreateDisplayPlaneSurfaceKHR")
	private val createXlibSurfaceAddr = addr("vkCreateXlibSurfaceKHR")
	private val getPhysicalDeviceXlibPresentationSupportAddr = addr("vkGetPhysicalDeviceXlibPresentationSupportKHR")
	private val createXcbSurfaceAddr = addr("vkCreateXcbSurfaceKHR")
	private val getPhysicalDeviceXcbPresentationSupportAddr = addr("vkGetPhysicalDeviceXcbPresentationSupportKHR")
	private val createWaylandSurfaceAddr = addr("vkCreateWaylandSurfaceKHR")
	private val getPhysicalDeviceWaylandPresentationSupportAddr = addr("vkGetPhysicalDeviceWaylandPresentationSupportKHR")
	private val createAndroidSurfaceAddr = addr("vkCreateAndroidSurfaceKHR")
	private val createWin32SurfaceAddr = addr("vkCreateWin32SurfaceKHR")
	private val getPhysicalDeviceWin32PresentationSupportAddr = addr("vkGetPhysicalDeviceWin32PresentationSupportKHR")
	private val getPhysicalDeviceVideoCapabilitiesAddr = addr("vkGetPhysicalDeviceVideoCapabilitiesKHR")
	private val getPhysicalDeviceVideoFormatPropertiesAddr = addr("vkGetPhysicalDeviceVideoFormatPropertiesKHR")
	private val createStreamDescriptorSurfaceAddr = addr("vkCreateStreamDescriptorSurfaceGGP")
	private val createViSurfaceAddr = addr("vkCreateViSurfaceNN")
	private val releaseDisplayAddr = addr("vkReleaseDisplayEXT")
	private val acquireXlibDisplayAddr = addr("vkAcquireXlibDisplayEXT")
	private val getRandROutputDisplayAddr = addr("vkGetRandROutputDisplayEXT")
	private val vkGetPhysicalDeviceSurfaceCapabilities2EXTAddr = addr("vkGetPhysicalDeviceSurfaceCapabilities2EXT")
	private val enumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersAddr = addr("vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR")
	private val getPhysicalDeviceQueueFamilyPerformanceQueryPassesAddr = addr("vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR")
	private val vkGetPhysicalDeviceSurfaceCapabilities2KHRAddr = addr("vkGetPhysicalDeviceSurfaceCapabilities2KHR")
	private val getPhysicalDeviceSurfaceFormats2Addr = addr("vkGetPhysicalDeviceSurfaceFormats2KHR")
	private val getPhysicalDeviceDisplayProperties2Addr = addr("vkGetPhysicalDeviceDisplayProperties2KHR")
	private val getPhysicalDeviceDisplayPlaneProperties2Addr = addr("vkGetPhysicalDeviceDisplayPlaneProperties2KHR")
	private val getDisplayModeProperties2Addr = addr("vkGetDisplayModeProperties2KHR")
	private val getDisplayPlaneCapabilities2Addr = addr("vkGetDisplayPlaneCapabilities2KHR")
	private val createDebugUtilsMessengerAddr = addr("vkCreateDebugUtilsMessengerEXT")
	private val destroyDebugUtilsMessengerAddr = addr("vkDestroyDebugUtilsMessengerEXT")
	private val submitDebugUtilsMessageAddr = addr("vkSubmitDebugUtilsMessageEXT")
	private val getPhysicalDeviceMultisamplePropertiesAddr = addr("vkGetPhysicalDeviceMultisamplePropertiesEXT")
	private val getPhysicalDeviceCalibrateableTimeDomainsAddr = addr("vkGetPhysicalDeviceCalibrateableTimeDomainsEXT")
	private val createImagePipeSurfaceAddr = addr("vkCreateImagePipeSurfaceFUCHSIA")
	private val createMetalSurfaceAddr = addr("vkCreateMetalSurfaceEXT")
	private val getPhysicalDeviceFragmentShadingRatesAddr = addr("vkGetPhysicalDeviceFragmentShadingRatesKHR")
	private val getPhysicalDeviceToolPropertiesAddr = addr("vkGetPhysicalDeviceToolPropertiesEXT")
	private val getPhysicalDeviceCooperativeMatrixPropertiesAddr = addr("vkGetPhysicalDeviceCooperativeMatrixPropertiesNV")
	private val getPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsAddr = addr("vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV")
	private val getPhysicalDeviceSurfacePresentModes2Addr = addr("vkGetPhysicalDeviceSurfacePresentModes2EXT")
	private val createHeadlessSurfaceAddr = addr("vkCreateHeadlessSurfaceEXT")
	private val acquireDrmDisplayAddr = addr("vkAcquireDrmDisplayEXT")
	private val getDrmDisplayAddr = addr("vkGetDrmDisplayEXT")
	private val acquireWinrtDisplayAddr = addr("vkAcquireWinrtDisplayNV")
	private val getWinrtDisplayAddr = addr("vkGetWinrtDisplayNV")
	private val createDirectFBSurfaceAddr = addr("vkCreateDirectFBSurfaceEXT")
	private val getPhysicalDeviceDirectFBPresentationSupportAddr = addr("vkGetPhysicalDeviceDirectFBPresentationSupportEXT")
	private val createScreenSurfaceAddr = addr("vkCreateScreenSurfaceQNX")
	private val getPhysicalDeviceScreenPresentationSupportAddr = addr("vkGetPhysicalDeviceScreenPresentationSupportQNX")
	init { default.pop(stackPointer) }
	
	
	
	fun destroyInstance(pAllocator: AllocationCallbacks?) {
		Commands.destroyInstance(destroyInstanceAddr, instance.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun enumeratePhysicalDevices(pPhysicalDeviceCount: DirectInt, pPhysicalDevices: DirectLongBuffer?): Result {
		return Result(Commands.enumeratePhysicalDevices(enumeratePhysicalDevicesAddr, instance.address, pPhysicalDeviceCount.address, pPhysicalDevices.addressOrNULL))
	}
	
	fun getPhysicalDeviceFeatures(physicalDevice: PhysicalDeviceH, pFeatures: PhysicalDeviceFeatures) {
		Commands.getPhysicalDeviceFeatures(getPhysicalDeviceFeaturesAddr, physicalDevice.address, pFeatures.address)
	}
	
	fun getPhysicalDeviceFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, pFormatProperties: FormatProperties) {
		Commands.getPhysicalDeviceFormatProperties(getPhysicalDeviceFormatPropertiesAddr, physicalDevice.address, format.value, pFormatProperties.address)
	}
	
	fun getPhysicalDeviceImageFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, type: ImageType, tiling: ImageTiling, usage: ImageUsageFlags, flags: ImageCreateFlags, pImageFormatProperties: ImageFormatProperties): Result {
		return Result(Commands.getPhysicalDeviceImageFormatProperties(getPhysicalDeviceImageFormatPropertiesAddr, physicalDevice.address, format.value, type.value, tiling.value, usage.value, flags.value, pImageFormatProperties.address))
	}
	
	fun getPhysicalDeviceProperties(physicalDevice: PhysicalDeviceH, pProperties: PhysicalDeviceProperties) {
		Commands.getPhysicalDeviceProperties(getPhysicalDevicePropertiesAddr, physicalDevice.address, pProperties.address)
	}
	
	fun getPhysicalDeviceQueueFamilyProperties(physicalDevice: PhysicalDeviceH, pQueueFamilyPropertyCount: DirectInt, pQueueFamilyProperties: QueueFamilyProperties.Buffer?) {
		Commands.getPhysicalDeviceQueueFamilyProperties(getPhysicalDeviceQueueFamilyPropertiesAddr, physicalDevice.address, pQueueFamilyPropertyCount.address, pQueueFamilyProperties.addressOrNULL)
	}
	
	fun getPhysicalDeviceMemoryProperties(physicalDevice: PhysicalDeviceH, pMemoryProperties: PhysicalDeviceMemoryProperties) {
		Commands.getPhysicalDeviceMemoryProperties(getPhysicalDeviceMemoryPropertiesAddr, physicalDevice.address, pMemoryProperties.address)
	}
	
	fun getDeviceProcAddr(device: DeviceH, pName: DirectByteBuffer): Long {
		return Commands.getDeviceProcAddr(getDeviceProcAddrAddr, device.address, pName.address)
	}
	
	fun createDevice(physicalDevice: PhysicalDeviceH, pCreateInfo: DeviceCreateInfo, pAllocator: AllocationCallbacks?, pDevice: DirectLong): Result {
		return Result(Commands.createDevice(createDeviceAddr, physicalDevice.address, pCreateInfo.address, pAllocator.addressOrNULL, pDevice.address))
	}
	
	fun enumerateDeviceExtensionProperties(physicalDevice: PhysicalDeviceH, pLayerName: DirectByteBuffer?, pPropertyCount: DirectInt, pProperties: ExtensionProperties.Buffer?): Result {
		return Result(Commands.enumerateDeviceExtensionProperties(enumerateDeviceExtensionPropertiesAddr, physicalDevice.address, pLayerName.addressOrNULL, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun enumerateDeviceLayerProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: LayerProperties.Buffer?): Result {
		return Result(Commands.enumerateDeviceLayerProperties(enumerateDeviceLayerPropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun getPhysicalDeviceSparseImageFormatProperties(physicalDevice: PhysicalDeviceH, format: Format, type: ImageType, samples: SampleCountFlags, usage: ImageUsageFlags, tiling: ImageTiling, pPropertyCount: DirectInt, pProperties: SparseImageFormatProperties.Buffer?) {
		Commands.getPhysicalDeviceSparseImageFormatProperties(getPhysicalDeviceSparseImageFormatPropertiesAddr, physicalDevice.address, format.value, type.value, samples.value, usage.value, tiling.value, pPropertyCount.address, pProperties.addressOrNULL)
	}
	
	fun enumeratePhysicalDeviceGroups(pPhysicalDeviceGroupCount: DirectInt, pPhysicalDeviceGroupProperties: PhysicalDeviceGroupProperties.Buffer?): Result {
		return Result(Commands.enumeratePhysicalDeviceGroups(enumeratePhysicalDeviceGroupsAddr, instance.address, pPhysicalDeviceGroupCount.address, pPhysicalDeviceGroupProperties.addressOrNULL))
	}
	
	fun getPhysicalDeviceFeatures2(physicalDevice: PhysicalDeviceH, pFeatures: PhysicalDeviceFeatures2) {
		Commands.getPhysicalDeviceFeatures2(getPhysicalDeviceFeatures2Addr, physicalDevice.address, pFeatures.address)
	}
	
	fun getPhysicalDeviceProperties2(physicalDevice: PhysicalDeviceH, pProperties: PhysicalDeviceProperties2) {
		Commands.getPhysicalDeviceProperties2(getPhysicalDeviceProperties2Addr, physicalDevice.address, pProperties.address)
	}
	
	fun getPhysicalDeviceFormatProperties2(physicalDevice: PhysicalDeviceH, format: Format, pFormatProperties: FormatProperties2) {
		Commands.getPhysicalDeviceFormatProperties2(getPhysicalDeviceFormatProperties2Addr, physicalDevice.address, format.value, pFormatProperties.address)
	}
	
	fun getPhysicalDeviceImageFormatProperties2(physicalDevice: PhysicalDeviceH, pImageFormatInfo: PhysicalDeviceImageFormatInfo2, pImageFormatProperties: ImageFormatProperties2): Result {
		return Result(Commands.getPhysicalDeviceImageFormatProperties2(getPhysicalDeviceImageFormatProperties2Addr, physicalDevice.address, pImageFormatInfo.address, pImageFormatProperties.address))
	}
	
	fun getPhysicalDeviceQueueFamilyProperties2(physicalDevice: PhysicalDeviceH, pQueueFamilyPropertyCount: DirectInt, pQueueFamilyProperties: QueueFamilyProperties2.Buffer?) {
		Commands.getPhysicalDeviceQueueFamilyProperties2(getPhysicalDeviceQueueFamilyProperties2Addr, physicalDevice.address, pQueueFamilyPropertyCount.address, pQueueFamilyProperties.addressOrNULL)
	}
	
	fun getPhysicalDeviceMemoryProperties2(physicalDevice: PhysicalDeviceH, pMemoryProperties: PhysicalDeviceMemoryProperties2) {
		Commands.getPhysicalDeviceMemoryProperties2(getPhysicalDeviceMemoryProperties2Addr, physicalDevice.address, pMemoryProperties.address)
	}
	
	fun getPhysicalDeviceSparseImageFormatProperties2(physicalDevice: PhysicalDeviceH, pFormatInfo: PhysicalDeviceSparseImageFormatInfo2, pPropertyCount: DirectInt, pProperties: SparseImageFormatProperties2.Buffer?) {
		Commands.getPhysicalDeviceSparseImageFormatProperties2(getPhysicalDeviceSparseImageFormatProperties2Addr, physicalDevice.address, pFormatInfo.address, pPropertyCount.address, pProperties.addressOrNULL)
	}
	
	fun getPhysicalDeviceExternalBufferProperties(physicalDevice: PhysicalDeviceH, pExternalBufferInfo: PhysicalDeviceExternalBufferInfo, pExternalBufferProperties: ExternalBufferProperties) {
		Commands.getPhysicalDeviceExternalBufferProperties(getPhysicalDeviceExternalBufferPropertiesAddr, physicalDevice.address, pExternalBufferInfo.address, pExternalBufferProperties.address)
	}
	
	fun getPhysicalDeviceExternalFenceProperties(physicalDevice: PhysicalDeviceH, pExternalFenceInfo: PhysicalDeviceExternalFenceInfo, pExternalFenceProperties: ExternalFenceProperties) {
		Commands.getPhysicalDeviceExternalFenceProperties(getPhysicalDeviceExternalFencePropertiesAddr, physicalDevice.address, pExternalFenceInfo.address, pExternalFenceProperties.address)
	}
	
	fun getPhysicalDeviceExternalSemaphoreProperties(physicalDevice: PhysicalDeviceH, pExternalSemaphoreInfo: PhysicalDeviceExternalSemaphoreInfo, pExternalSemaphoreProperties: ExternalSemaphoreProperties) {
		Commands.getPhysicalDeviceExternalSemaphoreProperties(getPhysicalDeviceExternalSemaphorePropertiesAddr, physicalDevice.address, pExternalSemaphoreInfo.address, pExternalSemaphoreProperties.address)
	}
	
	fun destroySurface(surface: SurfaceH?, pAllocator: AllocationCallbacks?) {
		Commands.destroySurface(destroySurfaceAddr, instance.address, surface.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun getPhysicalDeviceSurfaceSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, surface: SurfaceH, pSupported: DirectInt): Result {
		return Result(Commands.getPhysicalDeviceSurfaceSupport(getPhysicalDeviceSurfaceSupportAddr, physicalDevice.address, queueFamilyIndex, surface.address, pSupported.address))
	}
	
	fun getPhysicalDeviceSurfaceCapabilities(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pSurfaceCapabilities: SurfaceCapabilities): Result {
		return Result(Commands.getPhysicalDeviceSurfaceCapabilities(getPhysicalDeviceSurfaceCapabilitiesAddr, physicalDevice.address, surface.address, pSurfaceCapabilities.address))
	}
	
	fun getPhysicalDeviceSurfaceFormats(physicalDevice: PhysicalDeviceH, surface: SurfaceH?, pSurfaceFormatCount: DirectInt, pSurfaceFormats: SurfaceFormat.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfaceFormats(getPhysicalDeviceSurfaceFormatsAddr, physicalDevice.address, surface.addressOrNULL, pSurfaceFormatCount.address, pSurfaceFormats.addressOrNULL))
	}
	
	fun getPhysicalDeviceSurfacePresentModes(physicalDevice: PhysicalDeviceH, surface: SurfaceH?, pPresentModeCount: DirectInt, pPresentModes: DirectIntBuffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfacePresentModes(getPhysicalDeviceSurfacePresentModesAddr, physicalDevice.address, surface.addressOrNULL, pPresentModeCount.address, pPresentModes.addressOrNULL))
	}
	
	fun getPhysicalDevicePresentRectangles(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pRectCount: DirectInt, pRects: Rect2D.Buffer?): Result {
		return Result(Commands.getPhysicalDevicePresentRectangles(getPhysicalDevicePresentRectanglesAddr, physicalDevice.address, surface.address, pRectCount.address, pRects.addressOrNULL))
	}
	
	fun getPhysicalDeviceDisplayProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayProperties.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayProperties(getPhysicalDeviceDisplayPropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun getPhysicalDeviceDisplayPlaneProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayPlaneProperties.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayPlaneProperties(getPhysicalDeviceDisplayPlanePropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun getDisplayPlaneSupportedDisplays(physicalDevice: PhysicalDeviceH, planeIndex: Int, pDisplayCount: DirectInt, pDisplays: DirectLongBuffer?): Result {
		return Result(Commands.getDisplayPlaneSupportedDisplays(getDisplayPlaneSupportedDisplaysAddr, physicalDevice.address, planeIndex, pDisplayCount.address, pDisplays.addressOrNULL))
	}
	
	fun getDisplayModeProperties(physicalDevice: PhysicalDeviceH, display: DisplayH, pPropertyCount: DirectInt, pProperties: DisplayModeProperties.Buffer?): Result {
		return Result(Commands.getDisplayModeProperties(getDisplayModePropertiesAddr, physicalDevice.address, display.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun createDisplayMode(physicalDevice: PhysicalDeviceH, display: DisplayH, pCreateInfo: DisplayModeCreateInfo, pAllocator: AllocationCallbacks?, pMode: DirectLong): Result {
		return Result(Commands.createDisplayMode(createDisplayModeAddr, physicalDevice.address, display.address, pCreateInfo.address, pAllocator.addressOrNULL, pMode.address))
	}
	
	fun getDisplayPlaneCapabilities(physicalDevice: PhysicalDeviceH, mode: DisplayModeH, planeIndex: Int, pCapabilities: DisplayPlaneCapabilities): Result {
		return Result(Commands.getDisplayPlaneCapabilities(getDisplayPlaneCapabilitiesAddr, physicalDevice.address, mode.address, planeIndex, pCapabilities.address))
	}
	
	fun createDisplayPlaneSurface(pCreateInfo: DisplaySurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createDisplayPlaneSurface(createDisplayPlaneSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun createXlibSurface(pCreateInfo: XlibSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createXlibSurface(createXlibSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun getPhysicalDeviceXlibPresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, dpy: DirectLong, visualID: Long): Int {
		return Commands.getPhysicalDeviceXlibPresentationSupport(getPhysicalDeviceXlibPresentationSupportAddr, physicalDevice.address, queueFamilyIndex, dpy.address, visualID)
	}
	
	fun createXcbSurface(pCreateInfo: XcbSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createXcbSurface(createXcbSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun getPhysicalDeviceXcbPresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, connection: DirectLong, visual_id: Long): Int {
		return Commands.getPhysicalDeviceXcbPresentationSupport(getPhysicalDeviceXcbPresentationSupportAddr, physicalDevice.address, queueFamilyIndex, connection.address, visual_id)
	}
	
	fun createWaylandSurface(pCreateInfo: WaylandSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createWaylandSurface(createWaylandSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun getPhysicalDeviceWaylandPresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, display: DirectLong): Int {
		return Commands.getPhysicalDeviceWaylandPresentationSupport(getPhysicalDeviceWaylandPresentationSupportAddr, physicalDevice.address, queueFamilyIndex, display.address)
	}
	
	fun createAndroidSurface(pCreateInfo: AndroidSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createAndroidSurface(createAndroidSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun createWin32Surface(pCreateInfo: Win32SurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createWin32Surface(createWin32SurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun getPhysicalDeviceWin32PresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int): Int {
		return Commands.getPhysicalDeviceWin32PresentationSupport(getPhysicalDeviceWin32PresentationSupportAddr, physicalDevice.address, queueFamilyIndex)
	}
	
	fun getPhysicalDeviceVideoCapabilities(physicalDevice: PhysicalDeviceH, pVideoProfile: VideoProfile, pCapabilities: VideoCapabilities): Result {
		return Result(Commands.getPhysicalDeviceVideoCapabilities(getPhysicalDeviceVideoCapabilitiesAddr, physicalDevice.address, pVideoProfile.address, pCapabilities.address))
	}
	
	fun getPhysicalDeviceVideoFormatProperties(physicalDevice: PhysicalDeviceH, pVideoFormatInfo: PhysicalDeviceVideoFormatInfo, pVideoFormatPropertyCount: DirectInt, pVideoFormatProperties: VideoFormatProperties.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceVideoFormatProperties(getPhysicalDeviceVideoFormatPropertiesAddr, physicalDevice.address, pVideoFormatInfo.address, pVideoFormatPropertyCount.address, pVideoFormatProperties.addressOrNULL))
	}
	
	fun createStreamDescriptorSurface(pCreateInfo: StreamDescriptorSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createStreamDescriptorSurface(createStreamDescriptorSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun createViSurface(pCreateInfo: ViSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createViSurface(createViSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun releaseDisplay(physicalDevice: PhysicalDeviceH, display: DisplayH): Result {
		return Result(Commands.releaseDisplay(releaseDisplayAddr, physicalDevice.address, display.address))
	}
	
	fun acquireXlibDisplay(physicalDevice: PhysicalDeviceH, dpy: DirectLong, display: DisplayH): Result {
		return Result(Commands.acquireXlibDisplay(acquireXlibDisplayAddr, physicalDevice.address, dpy.address, display.address))
	}
	
	fun getRandROutputDisplay(physicalDevice: PhysicalDeviceH, dpy: DirectLong, rrOutput: Long, pDisplay: DirectLong): Result {
		return Result(Commands.getRandROutputDisplay(getRandROutputDisplayAddr, physicalDevice.address, dpy.address, rrOutput, pDisplay.address))
	}
	
	fun vkGetPhysicalDeviceSurfaceCapabilities2EXT(physicalDevice: PhysicalDeviceH, surface: SurfaceH, pSurfaceCapabilities: VkSurfaceCapabilities2EXT): Result {
		return Result(Commands.vkGetPhysicalDeviceSurfaceCapabilities2EXT(vkGetPhysicalDeviceSurfaceCapabilities2EXTAddr, physicalDevice.address, surface.address, pSurfaceCapabilities.address))
	}
	
	fun enumeratePhysicalDeviceQueueFamilyPerformanceQueryCounters(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, pCounterCount: DirectInt, pCounters: PerformanceCounter.Buffer?, pCounterDescriptions: PerformanceCounterDescription.Buffer?): Result {
		return Result(Commands.enumeratePhysicalDeviceQueueFamilyPerformanceQueryCounters(enumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersAddr, physicalDevice.address, queueFamilyIndex, pCounterCount.address, pCounters.addressOrNULL, pCounterDescriptions.addressOrNULL))
	}
	
	fun getPhysicalDeviceQueueFamilyPerformanceQueryPasses(physicalDevice: PhysicalDeviceH, pPerformanceQueryCreateInfo: QueryPoolPerformanceCreateInfo, pNumPasses: DirectInt) {
		Commands.getPhysicalDeviceQueueFamilyPerformanceQueryPasses(getPhysicalDeviceQueueFamilyPerformanceQueryPassesAddr, physicalDevice.address, pPerformanceQueryCreateInfo.address, pNumPasses.address)
	}
	
	fun vkGetPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice: PhysicalDeviceH, pSurfaceInfo: PhysicalDeviceSurfaceInfo2, pSurfaceCapabilities: VkSurfaceCapabilities2KHR): Result {
		return Result(Commands.vkGetPhysicalDeviceSurfaceCapabilities2KHR(vkGetPhysicalDeviceSurfaceCapabilities2KHRAddr, physicalDevice.address, pSurfaceInfo.address, pSurfaceCapabilities.address))
	}
	
	fun getPhysicalDeviceSurfaceFormats2(physicalDevice: PhysicalDeviceH, pSurfaceInfo: PhysicalDeviceSurfaceInfo2, pSurfaceFormatCount: DirectInt, pSurfaceFormats: SurfaceFormat2.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfaceFormats2(getPhysicalDeviceSurfaceFormats2Addr, physicalDevice.address, pSurfaceInfo.address, pSurfaceFormatCount.address, pSurfaceFormats.addressOrNULL))
	}
	
	fun getPhysicalDeviceDisplayProperties2(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayProperties2.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayProperties2(getPhysicalDeviceDisplayProperties2Addr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun getPhysicalDeviceDisplayPlaneProperties2(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: DisplayPlaneProperties2.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceDisplayPlaneProperties2(getPhysicalDeviceDisplayPlaneProperties2Addr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun getDisplayModeProperties2(physicalDevice: PhysicalDeviceH, display: DisplayH, pPropertyCount: DirectInt, pProperties: DisplayModeProperties2.Buffer?): Result {
		return Result(Commands.getDisplayModeProperties2(getDisplayModeProperties2Addr, physicalDevice.address, display.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun getDisplayPlaneCapabilities2(physicalDevice: PhysicalDeviceH, pDisplayPlaneInfo: DisplayPlaneInfo2, pCapabilities: DisplayPlaneCapabilities2): Result {
		return Result(Commands.getDisplayPlaneCapabilities2(getDisplayPlaneCapabilities2Addr, physicalDevice.address, pDisplayPlaneInfo.address, pCapabilities.address))
	}
	
	fun createDebugUtilsMessenger(pCreateInfo: DebugUtilsMessengerCreateInfo, pAllocator: AllocationCallbacks?, pMessenger: DirectLong): Result {
		return Result(Commands.createDebugUtilsMessenger(createDebugUtilsMessengerAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pMessenger.address))
	}
	
	fun destroyDebugUtilsMessenger(messenger: DebugUtilsMessengerH?, pAllocator: AllocationCallbacks?) {
		Commands.destroyDebugUtilsMessenger(destroyDebugUtilsMessengerAddr, instance.address, messenger.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun submitDebugUtilsMessage(messageSeverity: DebugUtilsMessageSeverityFlags, messageTypes: DebugUtilsMessageTypeFlags, pCallbackData: DebugUtilsMessengerCallbackData) {
		Commands.submitDebugUtilsMessage(submitDebugUtilsMessageAddr, instance.address, messageSeverity.value, messageTypes.value, pCallbackData.address)
	}
	
	fun getPhysicalDeviceMultisampleProperties(physicalDevice: PhysicalDeviceH, samples: SampleCountFlags, pMultisampleProperties: MultisampleProperties) {
		Commands.getPhysicalDeviceMultisampleProperties(getPhysicalDeviceMultisamplePropertiesAddr, physicalDevice.address, samples.value, pMultisampleProperties.address)
	}
	
	fun getPhysicalDeviceCalibrateableTimeDomains(physicalDevice: PhysicalDeviceH, pTimeDomainCount: DirectInt, pTimeDomains: DirectIntBuffer?): Result {
		return Result(Commands.getPhysicalDeviceCalibrateableTimeDomains(getPhysicalDeviceCalibrateableTimeDomainsAddr, physicalDevice.address, pTimeDomainCount.address, pTimeDomains.addressOrNULL))
	}
	
	fun createImagePipeSurface(pCreateInfo: ImagePipeSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createImagePipeSurface(createImagePipeSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun createMetalSurface(pCreateInfo: MetalSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createMetalSurface(createMetalSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun getPhysicalDeviceFragmentShadingRates(physicalDevice: PhysicalDeviceH, pFragmentShadingRateCount: DirectInt, pFragmentShadingRates: PhysicalDeviceFragmentShadingRate.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceFragmentShadingRates(getPhysicalDeviceFragmentShadingRatesAddr, physicalDevice.address, pFragmentShadingRateCount.address, pFragmentShadingRates.addressOrNULL))
	}
	
	fun getPhysicalDeviceToolProperties(physicalDevice: PhysicalDeviceH, pToolCount: DirectInt, pToolProperties: PhysicalDeviceToolProperties.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceToolProperties(getPhysicalDeviceToolPropertiesAddr, physicalDevice.address, pToolCount.address, pToolProperties.addressOrNULL))
	}
	
	fun getPhysicalDeviceCooperativeMatrixProperties(physicalDevice: PhysicalDeviceH, pPropertyCount: DirectInt, pProperties: CooperativeMatrixProperties.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceCooperativeMatrixProperties(getPhysicalDeviceCooperativeMatrixPropertiesAddr, physicalDevice.address, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun getPhysicalDeviceSupportedFramebufferMixedSamplesCombinations(physicalDevice: PhysicalDeviceH, pCombinationCount: DirectInt, pCombinations: FramebufferMixedSamplesCombination.Buffer?): Result {
		return Result(Commands.getPhysicalDeviceSupportedFramebufferMixedSamplesCombinations(getPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsAddr, physicalDevice.address, pCombinationCount.address, pCombinations.addressOrNULL))
	}
	
	fun getPhysicalDeviceSurfacePresentModes2(physicalDevice: PhysicalDeviceH, pSurfaceInfo: PhysicalDeviceSurfaceInfo2, pPresentModeCount: DirectInt, pPresentModes: DirectIntBuffer?): Result {
		return Result(Commands.getPhysicalDeviceSurfacePresentModes2(getPhysicalDeviceSurfacePresentModes2Addr, physicalDevice.address, pSurfaceInfo.address, pPresentModeCount.address, pPresentModes.addressOrNULL))
	}
	
	fun createHeadlessSurface(pCreateInfo: HeadlessSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createHeadlessSurface(createHeadlessSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun acquireDrmDisplay(physicalDevice: PhysicalDeviceH, drmFd: Int, display: DisplayH): Result {
		return Result(Commands.acquireDrmDisplay(acquireDrmDisplayAddr, physicalDevice.address, drmFd, display.address))
	}
	
	fun getDrmDisplay(physicalDevice: PhysicalDeviceH, drmFd: Int, connectorId: Int, display: DirectLong): Result {
		return Result(Commands.getDrmDisplay(getDrmDisplayAddr, physicalDevice.address, drmFd, connectorId, display.address))
	}
	
	fun acquireWinrtDisplay(physicalDevice: PhysicalDeviceH, display: DisplayH): Result {
		return Result(Commands.acquireWinrtDisplay(acquireWinrtDisplayAddr, physicalDevice.address, display.address))
	}
	
	fun getWinrtDisplay(physicalDevice: PhysicalDeviceH, deviceRelativeId: Int, pDisplay: DirectLong): Result {
		return Result(Commands.getWinrtDisplay(getWinrtDisplayAddr, physicalDevice.address, deviceRelativeId, pDisplay.address))
	}
	
	fun createDirectFBSurface(pCreateInfo: DirectFBSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createDirectFBSurface(createDirectFBSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun getPhysicalDeviceDirectFBPresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, dfb: DirectLong): Int {
		return Commands.getPhysicalDeviceDirectFBPresentationSupport(getPhysicalDeviceDirectFBPresentationSupportAddr, physicalDevice.address, queueFamilyIndex, dfb.address)
	}
	
	fun createScreenSurface(pCreateInfo: ScreenSurfaceCreateInfo, pAllocator: AllocationCallbacks?, pSurface: DirectLong): Result {
		return Result(Commands.createScreenSurface(createScreenSurfaceAddr, instance.address, pCreateInfo.address, pAllocator.addressOrNULL, pSurface.address))
	}
	
	fun getPhysicalDeviceScreenPresentationSupport(physicalDevice: PhysicalDeviceH, queueFamilyIndex: Int, window: DirectLong): Int {
		return Commands.getPhysicalDeviceScreenPresentationSupport(getPhysicalDeviceScreenPresentationSupportAddr, physicalDevice.address, queueFamilyIndex, window.address)
	}


}



class DeviceCommands(private val device: DeviceH, private val instanceCommands: InstanceCommands) {
	
	
	private fun addr(name: String) = instanceCommands.getDeviceProcAddr(device, default.encodeUtf8NT(name))
	
	
	
	private val stackPointer = default.push()
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
	private val createVideoSessionAddr = addr("vkCreateVideoSessionKHR")
	private val destroyVideoSessionAddr = addr("vkDestroyVideoSessionKHR")
	private val getVideoSessionMemoryRequirementsAddr = addr("vkGetVideoSessionMemoryRequirementsKHR")
	private val bindVideoSessionMemoryAddr = addr("vkBindVideoSessionMemoryKHR")
	private val createVideoSessionParametersAddr = addr("vkCreateVideoSessionParametersKHR")
	private val updateVideoSessionParametersAddr = addr("vkUpdateVideoSessionParametersKHR")
	private val destroyVideoSessionParametersAddr = addr("vkDestroyVideoSessionParametersKHR")
	private val cmdBeginVideoCodingAddr = addr("vkCmdBeginVideoCodingKHR")
	private val cmdEndVideoCodingAddr = addr("vkCmdEndVideoCodingKHR")
	private val cmdControlVideoCodingAddr = addr("vkCmdControlVideoCodingKHR")
	private val cmdDecodeVideoAddr = addr("vkCmdDecodeVideoKHR")
	private val cmdBindTransformFeedbackBuffersAddr = addr("vkCmdBindTransformFeedbackBuffersEXT")
	private val cmdBeginTransformFeedbackAddr = addr("vkCmdBeginTransformFeedbackEXT")
	private val cmdEndTransformFeedbackAddr = addr("vkCmdEndTransformFeedbackEXT")
	private val cmdBeginQueryIndexedAddr = addr("vkCmdBeginQueryIndexedEXT")
	private val cmdEndQueryIndexedAddr = addr("vkCmdEndQueryIndexedEXT")
	private val cmdDrawIndirectByteCountAddr = addr("vkCmdDrawIndirectByteCountEXT")
	private val createCuModuleAddr = addr("vkCreateCuModuleNVX")
	private val createCuFunctionAddr = addr("vkCreateCuFunctionNVX")
	private val destroyCuModuleAddr = addr("vkDestroyCuModuleNVX")
	private val destroyCuFunctionAddr = addr("vkDestroyCuFunctionNVX")
	private val cmdCuLaunchKernelAddr = addr("vkCmdCuLaunchKernelNVX")
	private val getImageViewHandleAddr = addr("vkGetImageViewHandleNVX")
	private val getImageViewAddressAddr = addr("vkGetImageViewAddressNVX")
	private val getShaderInfoAddr = addr("vkGetShaderInfoAMD")
	private val cmdBeginRenderingAddr = addr("vkCmdBeginRenderingKHR")
	private val cmdEndRenderingAddr = addr("vkCmdEndRenderingKHR")
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
	private val vkCreateAccelerationStructureKHRAddr = addr("vkCreateAccelerationStructureKHR")
	private val vkDestroyAccelerationStructureKHRAddr = addr("vkDestroyAccelerationStructureKHR")
	private val cmdBuildAccelerationStructuresAddr = addr("vkCmdBuildAccelerationStructuresKHR")
	private val cmdBuildAccelerationStructuresIndirectAddr = addr("vkCmdBuildAccelerationStructuresIndirectKHR")
	private val buildAccelerationStructuresAddr = addr("vkBuildAccelerationStructuresKHR")
	private val copyAccelerationStructureAddr = addr("vkCopyAccelerationStructureKHR")
	private val copyAccelerationStructureToMemoryAddr = addr("vkCopyAccelerationStructureToMemoryKHR")
	private val copyMemoryToAccelerationStructureAddr = addr("vkCopyMemoryToAccelerationStructureKHR")
	private val writeAccelerationStructuresPropertiesAddr = addr("vkWriteAccelerationStructuresPropertiesKHR")
	private val vkCmdCopyAccelerationStructureKHRAddr = addr("vkCmdCopyAccelerationStructureKHR")
	private val cmdCopyAccelerationStructureToMemoryAddr = addr("vkCmdCopyAccelerationStructureToMemoryKHR")
	private val cmdCopyMemoryToAccelerationStructureAddr = addr("vkCmdCopyMemoryToAccelerationStructureKHR")
	private val getAccelerationStructureDeviceAddressAddr = addr("vkGetAccelerationStructureDeviceAddressKHR")
	private val vkCmdWriteAccelerationStructuresPropertiesKHRAddr = addr("vkCmdWriteAccelerationStructuresPropertiesKHR")
	private val getDeviceAccelerationStructureCompatibilityAddr = addr("vkGetDeviceAccelerationStructureCompatibilityKHR")
	private val getAccelerationStructureBuildSizesAddr = addr("vkGetAccelerationStructureBuildSizesKHR")
	private val vkCmdTraceRaysKHRAddr = addr("vkCmdTraceRaysKHR")
	private val vkCreateRayTracingPipelinesKHRAddr = addr("vkCreateRayTracingPipelinesKHR")
	private val getRayTracingShaderGroupHandlesAddr = addr("vkGetRayTracingShaderGroupHandlesKHR")
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
	private val vkCreateAccelerationStructureNVAddr = addr("vkCreateAccelerationStructureNV")
	private val vkDestroyAccelerationStructureNVAddr = addr("vkDestroyAccelerationStructureNV")
	private val getAccelerationStructureMemoryRequirementsAddr = addr("vkGetAccelerationStructureMemoryRequirementsNV")
	private val bindAccelerationStructureMemoryAddr = addr("vkBindAccelerationStructureMemoryNV")
	private val cmdBuildAccelerationStructureAddr = addr("vkCmdBuildAccelerationStructureNV")
	private val vkCmdCopyAccelerationStructureNVAddr = addr("vkCmdCopyAccelerationStructureNV")
	private val vkCmdTraceRaysNVAddr = addr("vkCmdTraceRaysNV")
	private val vkCreateRayTracingPipelinesNVAddr = addr("vkCreateRayTracingPipelinesNV")
	private val getAccelerationStructureHandleAddr = addr("vkGetAccelerationStructureHandleNV")
	private val vkCmdWriteAccelerationStructuresPropertiesNVAddr = addr("vkCmdWriteAccelerationStructuresPropertiesNV")
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
	private val waitForPresentAddr = addr("vkWaitForPresentKHR")
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
	private val cmdEncodeVideoAddr = addr("vkCmdEncodeVideoKHR")
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
	private val cmdSetVertexInputAddr = addr("vkCmdSetVertexInputEXT")
	private val getMemoryZirconHandleAddr = addr("vkGetMemoryZirconHandleFUCHSIA")
	private val getMemoryZirconHandlePropertiesAddr = addr("vkGetMemoryZirconHandlePropertiesFUCHSIA")
	private val importSemaphoreZirconHandleAddr = addr("vkImportSemaphoreZirconHandleFUCHSIA")
	private val getSemaphoreZirconHandleAddr = addr("vkGetSemaphoreZirconHandleFUCHSIA")
	private val createBufferCollectionAddr = addr("vkCreateBufferCollectionFUCHSIA")
	private val setBufferCollectionImageConstraintsAddr = addr("vkSetBufferCollectionImageConstraintsFUCHSIA")
	private val setBufferCollectionBufferConstraintsAddr = addr("vkSetBufferCollectionBufferConstraintsFUCHSIA")
	private val destroyBufferCollectionAddr = addr("vkDestroyBufferCollectionFUCHSIA")
	private val getBufferCollectionPropertiesAddr = addr("vkGetBufferCollectionPropertiesFUCHSIA")
	private val getDeviceSubpassShadingMaxWorkgroupSizeAddr = addr("vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI")
	private val cmdSubpassShadingAddr = addr("vkCmdSubpassShadingHUAWEI")
	private val cmdBindInvocationMaskAddr = addr("vkCmdBindInvocationMaskHUAWEI")
	private val getMemoryRemoteAddressAddr = addr("vkGetMemoryRemoteAddressNV")
	private val cmdSetPatchControlPointsAddr = addr("vkCmdSetPatchControlPointsEXT")
	private val cmdSetRasterizerDiscardEnableAddr = addr("vkCmdSetRasterizerDiscardEnableEXT")
	private val cmdSetDepthBiasEnableAddr = addr("vkCmdSetDepthBiasEnableEXT")
	private val cmdSetLogicOpAddr = addr("vkCmdSetLogicOpEXT")
	private val cmdSetPrimitiveRestartEnableAddr = addr("vkCmdSetPrimitiveRestartEnableEXT")
	private val cmdSetColorWriteEnableAddr = addr("vkCmdSetColorWriteEnableEXT")
	private val cmdDrawMultiAddr = addr("vkCmdDrawMultiEXT")
	private val cmdDrawMultiIndexedAddr = addr("vkCmdDrawMultiIndexedEXT")
	private val setDeviceMemoryPriorityAddr = addr("vkSetDeviceMemoryPriorityEXT")
	private val getDeviceBufferMemoryRequirementsAddr = addr("vkGetDeviceBufferMemoryRequirementsKHR")
	private val getDeviceImageMemoryRequirementsAddr = addr("vkGetDeviceImageMemoryRequirementsKHR")
	private val getDeviceImageSparseMemoryRequirementsAddr = addr("vkGetDeviceImageSparseMemoryRequirementsKHR")
	init { default.pop(stackPointer) }
	
	
	
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
	
	fun createVideoSession(pCreateInfo: VideoSessionCreateInfo, pAllocator: AllocationCallbacks?, pVideoSession: DirectLong): Result {
		return Result(Commands.createVideoSession(createVideoSessionAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pVideoSession.address))
	}
	
	fun destroyVideoSession(videoSession: VideoSessionH, pAllocator: AllocationCallbacks?) {
		Commands.destroyVideoSession(destroyVideoSessionAddr, device.address, videoSession.address, pAllocator.addressOrNULL)
	}
	
	fun getVideoSessionMemoryRequirements(videoSession: VideoSessionH, pVideoSessionMemoryRequirementsCount: DirectInt, pVideoSessionMemoryRequirements: VideoGetMemoryProperties.Buffer?): Result {
		return Result(Commands.getVideoSessionMemoryRequirements(getVideoSessionMemoryRequirementsAddr, device.address, videoSession.address, pVideoSessionMemoryRequirementsCount.address, pVideoSessionMemoryRequirements.addressOrNULL))
	}
	
	fun bindVideoSessionMemory(videoSession: VideoSessionH, videoSessionBindMemoryCount: Int, pVideoSessionBindMemories: VideoBindMemory.Buffer): Result {
		return Result(Commands.bindVideoSessionMemory(bindVideoSessionMemoryAddr, device.address, videoSession.address, videoSessionBindMemoryCount, pVideoSessionBindMemories.address))
	}
	
	fun createVideoSessionParameters(pCreateInfo: VideoSessionParametersCreateInfo, pAllocator: AllocationCallbacks?, pVideoSessionParameters: DirectLong): Result {
		return Result(Commands.createVideoSessionParameters(createVideoSessionParametersAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pVideoSessionParameters.address))
	}
	
	fun updateVideoSessionParameters(videoSessionParameters: VideoSessionParametersH, pUpdateInfo: VideoSessionParametersUpdateInfo): Result {
		return Result(Commands.updateVideoSessionParameters(updateVideoSessionParametersAddr, device.address, videoSessionParameters.address, pUpdateInfo.address))
	}
	
	fun destroyVideoSessionParameters(videoSessionParameters: VideoSessionParametersH, pAllocator: AllocationCallbacks?) {
		Commands.destroyVideoSessionParameters(destroyVideoSessionParametersAddr, device.address, videoSessionParameters.address, pAllocator.addressOrNULL)
	}
	
	fun cmdBeginVideoCoding(commandBuffer: CommandBufferH, pBeginInfo: VideoBeginCodingInfo) {
		Commands.cmdBeginVideoCoding(cmdBeginVideoCodingAddr, commandBuffer.address, pBeginInfo.address)
	}
	
	fun cmdEndVideoCoding(commandBuffer: CommandBufferH, pEndCodingInfo: VideoEndCodingInfo) {
		Commands.cmdEndVideoCoding(cmdEndVideoCodingAddr, commandBuffer.address, pEndCodingInfo.address)
	}
	
	fun cmdControlVideoCoding(commandBuffer: CommandBufferH, pCodingControlInfo: VideoCodingControlInfo) {
		Commands.cmdControlVideoCoding(cmdControlVideoCodingAddr, commandBuffer.address, pCodingControlInfo.address)
	}
	
	fun cmdDecodeVideo(commandBuffer: CommandBufferH, pFrameInfo: VideoDecodeInfo) {
		Commands.cmdDecodeVideo(cmdDecodeVideoAddr, commandBuffer.address, pFrameInfo.address)
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
	
	fun createCuModule(pCreateInfo: CuModuleCreateInfo, pAllocator: AllocationCallbacks?, pModule: DirectLong): Result {
		return Result(Commands.createCuModule(createCuModuleAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pModule.address))
	}
	
	fun createCuFunction(pCreateInfo: CuFunctionCreateInfo, pAllocator: AllocationCallbacks?, pFunction: DirectLong): Result {
		return Result(Commands.createCuFunction(createCuFunctionAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pFunction.address))
	}
	
	fun destroyCuModule(module: CuModuleH, pAllocator: AllocationCallbacks?) {
		Commands.destroyCuModule(destroyCuModuleAddr, device.address, module.address, pAllocator.addressOrNULL)
	}
	
	fun destroyCuFunction(function: CuFunctionH, pAllocator: AllocationCallbacks?) {
		Commands.destroyCuFunction(destroyCuFunctionAddr, device.address, function.address, pAllocator.addressOrNULL)
	}
	
	fun cmdCuLaunchKernel(commandBuffer: CommandBufferH, pLaunchInfo: CuLaunchInfo) {
		Commands.cmdCuLaunchKernel(cmdCuLaunchKernelAddr, commandBuffer.address, pLaunchInfo.address)
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
	
	fun cmdBeginRendering(commandBuffer: CommandBufferH, pRenderingInfo: RenderingInfo) {
		Commands.cmdBeginRendering(cmdBeginRenderingAddr, commandBuffer.address, pRenderingInfo.address)
	}
	
	fun cmdEndRendering(commandBuffer: CommandBufferH) {
		Commands.cmdEndRendering(cmdEndRenderingAddr, commandBuffer.address)
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
	
	fun vkCreateAccelerationStructureKHR(pCreateInfo: VkAccelerationStructureCreateInfoKHR, pAllocator: AllocationCallbacks?, pAccelerationStructure: DirectLong): Result {
		return Result(Commands.vkCreateAccelerationStructureKHR(vkCreateAccelerationStructureKHRAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pAccelerationStructure.address))
	}
	
	fun vkDestroyAccelerationStructureKHR(accelerationStructure: VkAccelerationStructureKHRH?, pAllocator: AllocationCallbacks?) {
		Commands.vkDestroyAccelerationStructureKHR(vkDestroyAccelerationStructureKHRAddr, device.address, accelerationStructure.addressOrNULL, pAllocator.addressOrNULL)
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
	
	fun vkCmdCopyAccelerationStructureKHR(commandBuffer: CommandBufferH, pInfo: CopyAccelerationStructureInfo) {
		Commands.vkCmdCopyAccelerationStructureKHR(vkCmdCopyAccelerationStructureKHRAddr, commandBuffer.address, pInfo.address)
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
	
	fun vkCmdWriteAccelerationStructuresPropertiesKHR(commandBuffer: CommandBufferH, accelerationStructureCount: Int, pAccelerationStructures: DirectLongBuffer, queryType: QueryType, queryPool: QueryPoolH, firstQuery: Int) {
		Commands.vkCmdWriteAccelerationStructuresPropertiesKHR(vkCmdWriteAccelerationStructuresPropertiesKHRAddr, commandBuffer.address, accelerationStructureCount, pAccelerationStructures.address, queryType.value, queryPool.address, firstQuery)
	}
	
	fun getDeviceAccelerationStructureCompatibility(pVersionInfo: AccelerationStructureVersionInfo, pCompatibility: DirectLong) {
		Commands.getDeviceAccelerationStructureCompatibility(getDeviceAccelerationStructureCompatibilityAddr, device.address, pVersionInfo.address, pCompatibility.address)
	}
	
	fun getAccelerationStructureBuildSizes(buildType: AccelerationStructureBuildType, pBuildInfo: AccelerationStructureBuildGeometryInfo, pMaxPrimitiveCounts: DirectIntBuffer?, pSizeInfo: AccelerationStructureBuildSizesInfo) {
		Commands.getAccelerationStructureBuildSizes(getAccelerationStructureBuildSizesAddr, device.address, buildType.value, pBuildInfo.address, pMaxPrimitiveCounts.addressOrNULL, pSizeInfo.address)
	}
	
	fun vkCmdTraceRaysKHR(commandBuffer: CommandBufferH, pRaygenShaderBindingTable: StridedDeviceAddressRegion, pMissShaderBindingTable: StridedDeviceAddressRegion, pHitShaderBindingTable: StridedDeviceAddressRegion, pCallableShaderBindingTable: StridedDeviceAddressRegion, width: Int, height: Int, depth: Int) {
		Commands.vkCmdTraceRaysKHR(vkCmdTraceRaysKHRAddr, commandBuffer.address, pRaygenShaderBindingTable.address, pMissShaderBindingTable.address, pHitShaderBindingTable.address, pCallableShaderBindingTable.address, width, height, depth)
	}
	
	fun vkCreateRayTracingPipelinesKHR(deferredOperation: DeferredOperationH?, pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: VkRayTracingPipelineCreateInfoKHR.Buffer, pAllocator: AllocationCallbacks?, pPipelines: DirectLongBuffer): Result {
		return Result(Commands.vkCreateRayTracingPipelinesKHR(vkCreateRayTracingPipelinesKHRAddr, device.address, deferredOperation.addressOrNULL, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	fun getRayTracingShaderGroupHandles(pipeline: PipelineH, firstGroup: Int, groupCount: Int, dataSize: Long, pData: DirectLong): Result {
		return Result(Commands.getRayTracingShaderGroupHandles(getRayTracingShaderGroupHandlesAddr, device.address, pipeline.address, firstGroup, groupCount, dataSize, pData.address))
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
	
	fun vkCreateAccelerationStructureNV(pCreateInfo: VkAccelerationStructureCreateInfoNV, pAllocator: AllocationCallbacks?, pAccelerationStructure: DirectLong): Result {
		return Result(Commands.vkCreateAccelerationStructureNV(vkCreateAccelerationStructureNVAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pAccelerationStructure.address))
	}
	
	fun vkDestroyAccelerationStructureNV(accelerationStructure: VkAccelerationStructureNVH?, pAllocator: AllocationCallbacks?) {
		Commands.vkDestroyAccelerationStructureNV(vkDestroyAccelerationStructureNVAddr, device.address, accelerationStructure.addressOrNULL, pAllocator.addressOrNULL)
	}
	
	fun getAccelerationStructureMemoryRequirements(pInfo: AccelerationStructureMemoryRequirementsInfo, pMemoryRequirements: MemoryRequirements2) {
		Commands.getAccelerationStructureMemoryRequirements(getAccelerationStructureMemoryRequirementsAddr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	fun bindAccelerationStructureMemory(bindInfoCount: Int, pBindInfos: BindAccelerationStructureMemoryInfo.Buffer): Result {
		return Result(Commands.bindAccelerationStructureMemory(bindAccelerationStructureMemoryAddr, device.address, bindInfoCount, pBindInfos.address))
	}
	
	fun cmdBuildAccelerationStructure(commandBuffer: CommandBufferH, pInfo: AccelerationStructureInfo, instanceData: BufferH?, instanceOffset: Long, update: Int, dst: VkAccelerationStructureNVH, src: VkAccelerationStructureNVH?, scratch: BufferH, scratchOffset: Long) {
		Commands.cmdBuildAccelerationStructure(cmdBuildAccelerationStructureAddr, commandBuffer.address, pInfo.address, instanceData.addressOrNULL, instanceOffset, update, dst.address, src.addressOrNULL, scratch.address, scratchOffset)
	}
	
	fun vkCmdCopyAccelerationStructureNV(commandBuffer: CommandBufferH, dst: VkAccelerationStructureNVH, src: VkAccelerationStructureNVH, mode: CopyAccelerationStructureMode) {
		Commands.vkCmdCopyAccelerationStructureNV(vkCmdCopyAccelerationStructureNVAddr, commandBuffer.address, dst.address, src.address, mode.value)
	}
	
	fun vkCmdTraceRaysNV(commandBuffer: CommandBufferH, raygenShaderBindingTableBuffer: BufferH, raygenShaderBindingOffset: Long, missShaderBindingTableBuffer: BufferH?, missShaderBindingOffset: Long, missShaderBindingStride: Long, hitShaderBindingTableBuffer: BufferH?, hitShaderBindingOffset: Long, hitShaderBindingStride: Long, callableShaderBindingTableBuffer: BufferH?, callableShaderBindingOffset: Long, callableShaderBindingStride: Long, width: Int, height: Int, depth: Int) {
		Commands.vkCmdTraceRaysNV(vkCmdTraceRaysNVAddr, commandBuffer.address, raygenShaderBindingTableBuffer.address, raygenShaderBindingOffset, missShaderBindingTableBuffer.addressOrNULL, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer.addressOrNULL, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer.addressOrNULL, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth)
	}
	
	fun vkCreateRayTracingPipelinesNV(pipelineCache: PipelineCacheH?, createInfoCount: Int, pCreateInfos: VkRayTracingPipelineCreateInfoNV.Buffer, pAllocator: AllocationCallbacks?, pPipelines: DirectLongBuffer): Result {
		return Result(Commands.vkCreateRayTracingPipelinesNV(vkCreateRayTracingPipelinesNVAddr, device.address, pipelineCache.addressOrNULL, createInfoCount, pCreateInfos.address, pAllocator.addressOrNULL, pPipelines.address))
	}
	
	fun getAccelerationStructureHandle(accelerationStructure: VkAccelerationStructureNVH, dataSize: Long, pData: DirectLong): Result {
		return Result(Commands.getAccelerationStructureHandle(getAccelerationStructureHandleAddr, device.address, accelerationStructure.address, dataSize, pData.address))
	}
	
	fun vkCmdWriteAccelerationStructuresPropertiesNV(commandBuffer: CommandBufferH, accelerationStructureCount: Int, pAccelerationStructures: DirectLongBuffer, queryType: QueryType, queryPool: QueryPoolH, firstQuery: Int) {
		Commands.vkCmdWriteAccelerationStructuresPropertiesNV(vkCmdWriteAccelerationStructuresPropertiesNVAddr, commandBuffer.address, accelerationStructureCount, pAccelerationStructures.address, queryType.value, queryPool.address, firstQuery)
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
	
	fun waitForPresent(swapchain: SwapchainH, presentId: Long, timeout: Long): Result {
		return Result(Commands.waitForPresent(waitForPresentAddr, device.address, swapchain.address, presentId, timeout))
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
	
	fun cmdEncodeVideo(commandBuffer: CommandBufferH, pEncodeInfo: VideoEncodeInfo) {
		Commands.cmdEncodeVideo(cmdEncodeVideoAddr, commandBuffer.address, pEncodeInfo.address)
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
	
	fun cmdSetVertexInput(commandBuffer: CommandBufferH, vertexBindingDescriptionCount: Int, pVertexBindingDescriptions: VertexInputBindingDescription2.Buffer, vertexAttributeDescriptionCount: Int, pVertexAttributeDescriptions: VertexInputAttributeDescription2.Buffer) {
		Commands.cmdSetVertexInput(cmdSetVertexInputAddr, commandBuffer.address, vertexBindingDescriptionCount, pVertexBindingDescriptions.address, vertexAttributeDescriptionCount, pVertexAttributeDescriptions.address)
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
	
	fun createBufferCollection(pCreateInfo: BufferCollectionCreateInfo, pAllocator: AllocationCallbacks?, pCollection: DirectLong): Result {
		return Result(Commands.createBufferCollection(createBufferCollectionAddr, device.address, pCreateInfo.address, pAllocator.addressOrNULL, pCollection.address))
	}
	
	fun setBufferCollectionImageConstraints(collection: BufferCollectionH, pImageConstraintsInfo: ImageConstraintsInfo): Result {
		return Result(Commands.setBufferCollectionImageConstraints(setBufferCollectionImageConstraintsAddr, device.address, collection.address, pImageConstraintsInfo.address))
	}
	
	fun setBufferCollectionBufferConstraints(collection: BufferCollectionH, pBufferConstraintsInfo: BufferConstraintsInfo): Result {
		return Result(Commands.setBufferCollectionBufferConstraints(setBufferCollectionBufferConstraintsAddr, device.address, collection.address, pBufferConstraintsInfo.address))
	}
	
	fun destroyBufferCollection(collection: BufferCollectionH, pAllocator: AllocationCallbacks?) {
		Commands.destroyBufferCollection(destroyBufferCollectionAddr, device.address, collection.address, pAllocator.addressOrNULL)
	}
	
	fun getBufferCollectionProperties(collection: BufferCollectionH, pProperties: BufferCollectionProperties): Result {
		return Result(Commands.getBufferCollectionProperties(getBufferCollectionPropertiesAddr, device.address, collection.address, pProperties.address))
	}
	
	fun getDeviceSubpassShadingMaxWorkgroupSize(renderpass: RenderPassH, pMaxWorkgroupSize: Extent2D): Result {
		return Result(Commands.getDeviceSubpassShadingMaxWorkgroupSize(getDeviceSubpassShadingMaxWorkgroupSizeAddr, device.address, renderpass.address, pMaxWorkgroupSize.address))
	}
	
	fun cmdSubpassShading(commandBuffer: CommandBufferH) {
		Commands.cmdSubpassShading(cmdSubpassShadingAddr, commandBuffer.address)
	}
	
	fun cmdBindInvocationMask(commandBuffer: CommandBufferH, imageView: ImageViewH?, imageLayout: ImageLayout) {
		Commands.cmdBindInvocationMask(cmdBindInvocationMaskAddr, commandBuffer.address, imageView.addressOrNULL, imageLayout.value)
	}
	
	fun getMemoryRemoteAddress(pMemoryGetRemoteAddressInfo: MemoryGetRemoteAddressInfo, pAddress: DirectLong): Result {
		return Result(Commands.getMemoryRemoteAddress(getMemoryRemoteAddressAddr, device.address, pMemoryGetRemoteAddressInfo.address, pAddress.address))
	}
	
	fun cmdSetPatchControlPoints(commandBuffer: CommandBufferH, patchControlPoints: Int) {
		Commands.cmdSetPatchControlPoints(cmdSetPatchControlPointsAddr, commandBuffer.address, patchControlPoints)
	}
	
	fun cmdSetRasterizerDiscardEnable(commandBuffer: CommandBufferH, rasterizerDiscardEnable: Int) {
		Commands.cmdSetRasterizerDiscardEnable(cmdSetRasterizerDiscardEnableAddr, commandBuffer.address, rasterizerDiscardEnable)
	}
	
	fun cmdSetDepthBiasEnable(commandBuffer: CommandBufferH, depthBiasEnable: Int) {
		Commands.cmdSetDepthBiasEnable(cmdSetDepthBiasEnableAddr, commandBuffer.address, depthBiasEnable)
	}
	
	fun cmdSetLogicOp(commandBuffer: CommandBufferH, logicOp: LogicOp) {
		Commands.cmdSetLogicOp(cmdSetLogicOpAddr, commandBuffer.address, logicOp.value)
	}
	
	fun cmdSetPrimitiveRestartEnable(commandBuffer: CommandBufferH, primitiveRestartEnable: Int) {
		Commands.cmdSetPrimitiveRestartEnable(cmdSetPrimitiveRestartEnableAddr, commandBuffer.address, primitiveRestartEnable)
	}
	
	fun cmdSetColorWriteEnable(commandBuffer: CommandBufferH, attachmentCount: Int, pColorWriteEnables: DirectIntBuffer) {
		Commands.cmdSetColorWriteEnable(cmdSetColorWriteEnableAddr, commandBuffer.address, attachmentCount, pColorWriteEnables.address)
	}
	
	fun cmdDrawMulti(commandBuffer: CommandBufferH, drawCount: Int, pVertexInfo: MultiDrawInfo.Buffer, instanceCount: Int, firstInstance: Int, stride: Int) {
		Commands.cmdDrawMulti(cmdDrawMultiAddr, commandBuffer.address, drawCount, pVertexInfo.address, instanceCount, firstInstance, stride)
	}
	
	fun cmdDrawMultiIndexed(commandBuffer: CommandBufferH, drawCount: Int, pIndexInfo: MultiDrawIndexedInfo.Buffer, instanceCount: Int, firstInstance: Int, stride: Int, pVertexOffset: DirectInt?) {
		Commands.cmdDrawMultiIndexed(cmdDrawMultiIndexedAddr, commandBuffer.address, drawCount, pIndexInfo.address, instanceCount, firstInstance, stride, pVertexOffset.addressOrNULL)
	}
	
	fun setDeviceMemoryPriority(memory: DeviceMemoryH, priority: Float) {
		Commands.setDeviceMemoryPriority(setDeviceMemoryPriorityAddr, device.address, memory.address, priority)
	}
	
	fun getDeviceBufferMemoryRequirements(pInfo: DeviceBufferMemoryRequirements, pMemoryRequirements: MemoryRequirements2) {
		Commands.getDeviceBufferMemoryRequirements(getDeviceBufferMemoryRequirementsAddr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	fun getDeviceImageMemoryRequirements(pInfo: DeviceImageMemoryRequirements, pMemoryRequirements: MemoryRequirements2) {
		Commands.getDeviceImageMemoryRequirements(getDeviceImageMemoryRequirementsAddr, device.address, pInfo.address, pMemoryRequirements.address)
	}
	
	fun getDeviceImageSparseMemoryRequirements(pInfo: DeviceImageMemoryRequirements, pSparseMemoryRequirementCount: DirectInt, pSparseMemoryRequirements: SparseImageMemoryRequirements2.Buffer?) {
		Commands.getDeviceImageSparseMemoryRequirements(getDeviceImageSparseMemoryRequirementsAddr, device.address, pInfo.address, pSparseMemoryRequirementCount.address, pSparseMemoryRequirements.addressOrNULL)
	}


}



object StandaloneCommands {
	
	
	private fun addr(name: String) = Commands.getInstanceProcAddr(0L, default.encodeUtf8NT(name).address)
	
	
	
	private val stackPointer = default.push()
	private val createInstanceAddr = addr("vkCreateInstance")
	private val enumerateInstanceExtensionPropertiesAddr = addr("vkEnumerateInstanceExtensionProperties")
	private val enumerateInstanceLayerPropertiesAddr = addr("vkEnumerateInstanceLayerProperties")
	private val enumerateInstanceVersionAddr = addr("vkEnumerateInstanceVersion")
	init { default.pop(stackPointer) }
	
	
	
	fun createInstance(pCreateInfo: InstanceCreateInfo, pAllocator: AllocationCallbacks?, pInstance: DirectLong): Result {
		return Result(Commands.createInstance(createInstanceAddr, pCreateInfo.address, pAllocator.addressOrNULL, pInstance.address))
	}
	
	fun enumerateInstanceExtensionProperties(pLayerName: DirectByteBuffer?, pPropertyCount: DirectInt, pProperties: ExtensionProperties.Buffer?): Result {
		return Result(Commands.enumerateInstanceExtensionProperties(enumerateInstanceExtensionPropertiesAddr, pLayerName.addressOrNULL, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun enumerateInstanceLayerProperties(pPropertyCount: DirectInt, pProperties: LayerProperties.Buffer?): Result {
		return Result(Commands.enumerateInstanceLayerProperties(enumerateInstanceLayerPropertiesAddr, pPropertyCount.address, pProperties.addressOrNULL))
	}
	
	fun enumerateInstanceVersion(pApiVersion: DirectInt): Result {
		return Result(Commands.enumerateInstanceVersion(enumerateInstanceVersionAddr, pApiVersion.address))
	}


}