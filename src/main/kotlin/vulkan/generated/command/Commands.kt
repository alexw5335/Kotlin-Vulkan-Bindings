// This file has been automatically generated.

package vulkan.generated.command

@Suppress("unused")
object Commands {
	
	
	/*
	Address commands
	 */
	
	
	
	external fun getInstanceProcAddr0(instance: Long, pname: Long): Long
	
	external fun getDeviceProcAddr0(device: Long, pname: Long): Long
	
	
	
	/*
	Provided by VK_VERSION_1_0
	 */
	
	
	
	external fun createInstance(address: Long, pCreateInfo: Long, pAllocator: Long, pInstance: Long): Int
	
	external fun destroyInstance(address: Long, instance: Long, pAllocator: Long)
	
	external fun enumeratePhysicalDevices(address: Long, instance: Long, pPhysicalDeviceCount: Long, pPhysicalDevices: Long): Int
	
	external fun getPhysicalDeviceFeatures(address: Long, physicalDevice: Long, pFeatures: Long)
	
	external fun getPhysicalDeviceFormatProperties(address: Long, physicalDevice: Long, format: Int, pFormatProperties: Long)
	
	external fun getPhysicalDeviceImageFormatProperties(address: Long, physicalDevice: Long, format: Int, type: Int, tiling: Int, usage: Int, flags: Int, pImageFormatProperties: Long): Int
	
	external fun getPhysicalDeviceProperties(address: Long, physicalDevice: Long, pProperties: Long)
	
	external fun getPhysicalDeviceQueueFamilyProperties(address: Long, physicalDevice: Long, pQueueFamilyPropertyCount: Long, pQueueFamilyProperties: Long)
	
	external fun getPhysicalDeviceMemoryProperties(address: Long, physicalDevice: Long, pMemoryProperties: Long)
	
	external fun getInstanceProcAddr(address: Long, instance: Long, pName: Long): Long
	
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
	
	
	
	/*
	Provided by VK_VERSION_1_1
	 */
	
	
	
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
	
	
	
	/*
	Provided by VK_VERSION_1_2
	 */
	
	
	
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
	
	
	
	/*
	Provided by VK_KHR_surface
	 */
	
	
	
	external fun destroySurfaceKHR(address: Long, instance: Long, surface: Long, pAllocator: Long)
	
	external fun getPhysicalDeviceSurfaceSupportKHR(address: Long, physicalDevice: Long, queueFamilyIndex: Int, surface: Long, pSupported: Long): Int
	
	external fun getPhysicalDeviceSurfaceCapabilitiesKHR(address: Long, physicalDevice: Long, surface: Long, pSurfaceCapabilities: Long): Int
	
	external fun getPhysicalDeviceSurfaceFormatsKHR(address: Long, physicalDevice: Long, surface: Long, pSurfaceFormatCount: Long, pSurfaceFormats: Long): Int
	
	external fun getPhysicalDeviceSurfacePresentModesKHR(address: Long, physicalDevice: Long, surface: Long, pPresentModeCount: Long, pPresentModes: Long): Int
	
	
	
	/*
	Provided by VK_KHR_swapchain
	 */
	
	
	
	external fun createSwapchainKHR(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pSwapchain: Long): Int
	
	external fun destroySwapchainKHR(address: Long, device: Long, swapchain: Long, pAllocator: Long)
	
	external fun getSwapchainImagesKHR(address: Long, device: Long, swapchain: Long, pSwapchainImageCount: Long, pSwapchainImages: Long): Int
	
	external fun acquireNextImageKHR(address: Long, device: Long, swapchain: Long, timeout: Long, semaphore: Long, fence: Long, pImageIndex: Long): Int
	
	external fun queuePresentKHR(address: Long, queue: Long, pPresentInfo: Long): Int
	
	external fun getDeviceGroupPresentCapabilitiesKHR(address: Long, device: Long, pDeviceGroupPresentCapabilities: Long): Int
	
	external fun getDeviceGroupSurfacePresentModesKHR(address: Long, device: Long, surface: Long, pModes: Long): Int
	
	external fun getPhysicalDevicePresentRectanglesKHR(address: Long, physicalDevice: Long, surface: Long, pRectCount: Long, pRects: Long): Int
	
	external fun acquireNextImage2KHR(address: Long, device: Long, pAcquireInfo: Long, pImageIndex: Long): Int
	
	
	
	/*
	Provided by VK_KHR_display
	 */
	
	
	
	external fun getPhysicalDeviceDisplayPropertiesKHR(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getPhysicalDeviceDisplayPlanePropertiesKHR(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getDisplayPlaneSupportedDisplaysKHR(address: Long, physicalDevice: Long, planeIndex: Int, pDisplayCount: Long, pDisplays: Long): Int
	
	external fun getDisplayModePropertiesKHR(address: Long, physicalDevice: Long, display: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun createDisplayModeKHR(address: Long, physicalDevice: Long, display: Long, pCreateInfo: Long, pAllocator: Long, pMode: Long): Int
	
	external fun getDisplayPlaneCapabilitiesKHR(address: Long, physicalDevice: Long, mode: Long, planeIndex: Int, pCapabilities: Long): Int
	
	external fun createDisplayPlaneSurfaceKHR(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	
	
	/*
	Provided by VK_KHR_display_swapchain
	 */
	
	
	
	external fun createSharedSwapchainsKHR(address: Long, device: Long, swapchainCount: Int, pCreateInfos: Long, pAllocator: Long, pSwapchains: Long): Int
	
	
	
	/*
	Provided by VK_KHR_xlib_surface
	 */
	
	
	
	external fun createXlibSurfaceKHR(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceXlibPresentationSupportKHR(address: Long, physicalDevice: Long, queueFamilyIndex: Int, dpy: Long, visualID: Long): Int
	
	
	
	/*
	Provided by VK_KHR_xcb_surface
	 */
	
	
	
	external fun createXcbSurfaceKHR(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceXcbPresentationSupportKHR(address: Long, physicalDevice: Long, queueFamilyIndex: Int, connection: Long, visual_id: Long): Int
	
	
	
	/*
	Provided by VK_KHR_wayland_surface
	 */
	
	
	
	external fun createWaylandSurfaceKHR(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceWaylandPresentationSupportKHR(address: Long, physicalDevice: Long, queueFamilyIndex: Int, display: Long): Int
	
	
	
	/*
	Provided by VK_KHR_android_surface
	 */
	
	
	
	external fun createAndroidSurfaceKHR(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	
	
	/*
	Provided by VK_KHR_win32_surface
	 */
	
	
	
	external fun createWin32SurfaceKHR(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceWin32PresentationSupportKHR(address: Long, physicalDevice: Long, queueFamilyIndex: Int): Int
	
	
	
	/*
	Provided by VK_EXT_debug_report
	 */
	
	
	
	external fun createDebugReportCallbackEXT(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pCallback: Long): Int
	
	external fun destroyDebugReportCallbackEXT(address: Long, instance: Long, callback: Long, pAllocator: Long)
	
	external fun debugReportMessageEXT(address: Long, instance: Long, flags: Int, objectType: Int, _object: Long, location: Long, messageCode: Int, pLayerPrefix: Long, pMessage: Long)
	
	
	
	/*
	Provided by VK_EXT_debug_marker
	 */
	
	
	
	external fun debugMarkerSetObjectTagEXT(address: Long, device: Long, pTagInfo: Long): Int
	
	external fun debugMarkerSetObjectNameEXT(address: Long, device: Long, pNameInfo: Long): Int
	
	external fun cmdDebugMarkerBeginEXT(address: Long, commandBuffer: Long, pMarkerInfo: Long)
	
	external fun cmdDebugMarkerEndEXT(address: Long, commandBuffer: Long)
	
	external fun cmdDebugMarkerInsertEXT(address: Long, commandBuffer: Long, pMarkerInfo: Long)
	
	
	
	/*
	Provided by VK_EXT_transform_feedback
	 */
	
	
	
	external fun cmdBindTransformFeedbackBuffersEXT(address: Long, commandBuffer: Long, firstBinding: Int, bindingCount: Int, pBuffers: Long, pOffsets: Long, pSizes: Long)
	
	external fun cmdBeginTransformFeedbackEXT(address: Long, commandBuffer: Long, firstCounterBuffer: Int, counterBufferCount: Int, pCounterBuffers: Long, pCounterBufferOffsets: Long)
	
	external fun cmdEndTransformFeedbackEXT(address: Long, commandBuffer: Long, firstCounterBuffer: Int, counterBufferCount: Int, pCounterBuffers: Long, pCounterBufferOffsets: Long)
	
	external fun cmdBeginQueryIndexedEXT(address: Long, commandBuffer: Long, queryPool: Long, query: Int, flags: Int, index: Int)
	
	external fun cmdEndQueryIndexedEXT(address: Long, commandBuffer: Long, queryPool: Long, query: Int, index: Int)
	
	external fun cmdDrawIndirectByteCountEXT(address: Long, commandBuffer: Long, instanceCount: Int, firstInstance: Int, counterBuffer: Long, counterBufferOffset: Long, counterOffset: Int, vertexStride: Int)
	
	
	
	/*
	Provided by VK_NVX_image_view_handle
	 */
	
	
	
	external fun getImageViewHandleNVX(address: Long, device: Long, pInfo: Long): Int
	
	external fun getImageViewAddressNVX(address: Long, device: Long, imageView: Long, pProperties: Long): Int
	
	
	
	/*
	Provided by VK_AMD_draw_indirect_count
	 */
	
	
	
	external fun cmdDrawIndirectCountAMD(address: Long, commandBuffer: Long, buffer: Long, offset: Long, countBuffer: Long, countBufferOffset: Long, maxDrawCount: Int, stride: Int)
	
	external fun cmdDrawIndexedIndirectCountAMD(address: Long, commandBuffer: Long, buffer: Long, offset: Long, countBuffer: Long, countBufferOffset: Long, maxDrawCount: Int, stride: Int)
	
	
	
	/*
	Provided by VK_AMD_shader_info
	 */
	
	
	
	external fun getShaderInfoAMD(address: Long, device: Long, pipeline: Long, shaderStage: Int, infoType: Int, pInfoSize: Long, pInfo: Long): Int
	
	
	
	/*
	Provided by VK_GGP_stream_descriptor_surface
	 */
	
	
	
	external fun createStreamDescriptorSurfaceGGP(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	
	
	/*
	Provided by VK_NV_external_memory_capabilities
	 */
	
	
	
	external fun getPhysicalDeviceExternalImageFormatPropertiesNV(address: Long, physicalDevice: Long, format: Int, type: Int, tiling: Int, usage: Int, flags: Int, externalHandleType: Int, pExternalImageFormatProperties: Long): Int
	
	
	
	/*
	Provided by VK_NV_external_memory_win32
	 */
	
	
	
	external fun getMemoryWin32HandleNV(address: Long, device: Long, memory: Long, handleType: Int, pHandle: Long): Int
	
	
	
	/*
	Provided by VK_KHR_get_physical_device_properties2
	 */
	
	
	
	external fun getPhysicalDeviceFeatures2KHR(address: Long, physicalDevice: Long, pFeatures: Long)
	
	external fun getPhysicalDeviceProperties2KHR(address: Long, physicalDevice: Long, pProperties: Long)
	
	external fun getPhysicalDeviceFormatProperties2KHR(address: Long, physicalDevice: Long, format: Int, pFormatProperties: Long)
	
	external fun getPhysicalDeviceImageFormatProperties2KHR(address: Long, physicalDevice: Long, pImageFormatInfo: Long, pImageFormatProperties: Long): Int
	
	external fun getPhysicalDeviceQueueFamilyProperties2KHR(address: Long, physicalDevice: Long, pQueueFamilyPropertyCount: Long, pQueueFamilyProperties: Long)
	
	external fun getPhysicalDeviceMemoryProperties2KHR(address: Long, physicalDevice: Long, pMemoryProperties: Long)
	
	external fun getPhysicalDeviceSparseImageFormatProperties2KHR(address: Long, physicalDevice: Long, pFormatInfo: Long, pPropertyCount: Long, pProperties: Long)
	
	
	
	/*
	Provided by VK_KHR_device_group
	 */
	
	
	
	external fun getDeviceGroupPeerMemoryFeaturesKHR(address: Long, device: Long, heapIndex: Int, localDeviceIndex: Int, remoteDeviceIndex: Int, pPeerMemoryFeatures: Long)
	
	external fun cmdSetDeviceMaskKHR(address: Long, commandBuffer: Long, deviceMask: Int)
	
	external fun cmdDispatchBaseKHR(address: Long, commandBuffer: Long, baseGroupX: Int, baseGroupY: Int, baseGroupZ: Int, groupCountX: Int, groupCountY: Int, groupCountZ: Int)
	
	
	
	/*
	Provided by VK_NN_vi_surface
	 */
	
	
	
	external fun createViSurfaceNN(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	
	
	/*
	Provided by VK_KHR_maintenance1
	 */
	
	
	
	external fun trimCommandPoolKHR(address: Long, device: Long, commandPool: Long, flags: Int)
	
	
	
	/*
	Provided by VK_KHR_device_group_creation
	 */
	
	
	
	external fun enumeratePhysicalDeviceGroupsKHR(address: Long, instance: Long, pPhysicalDeviceGroupCount: Long, pPhysicalDeviceGroupProperties: Long): Int
	
	
	
	/*
	Provided by VK_KHR_external_memory_capabilities
	 */
	
	
	
	external fun getPhysicalDeviceExternalBufferPropertiesKHR(address: Long, physicalDevice: Long, pExternalBufferInfo: Long, pExternalBufferProperties: Long)
	
	
	
	/*
	Provided by VK_KHR_external_memory_win32
	 */
	
	
	
	external fun getMemoryWin32HandleKHR(address: Long, device: Long, pGetWin32HandleInfo: Long, pHandle: Long): Int
	
	external fun getMemoryWin32HandlePropertiesKHR(address: Long, device: Long, handleType: Int, handle: Long, pMemoryWin32HandleProperties: Long): Int
	
	
	
	/*
	Provided by VK_KHR_external_memory_fd
	 */
	
	
	
	external fun getMemoryFdKHR(address: Long, device: Long, pGetFdInfo: Long, pFd: Long): Int
	
	external fun getMemoryFdPropertiesKHR(address: Long, device: Long, handleType: Int, fd: Int, pMemoryFdProperties: Long): Int
	
	
	
	/*
	Provided by VK_KHR_external_semaphore_capabilities
	 */
	
	
	
	external fun getPhysicalDeviceExternalSemaphorePropertiesKHR(address: Long, physicalDevice: Long, pExternalSemaphoreInfo: Long, pExternalSemaphoreProperties: Long)
	
	
	
	/*
	Provided by VK_KHR_external_semaphore_win32
	 */
	
	
	
	external fun importSemaphoreWin32HandleKHR(address: Long, device: Long, pImportSemaphoreWin32HandleInfo: Long): Int
	
	external fun getSemaphoreWin32HandleKHR(address: Long, device: Long, pGetWin32HandleInfo: Long, pHandle: Long): Int
	
	
	
	/*
	Provided by VK_KHR_external_semaphore_fd
	 */
	
	
	
	external fun importSemaphoreFdKHR(address: Long, device: Long, pImportSemaphoreFdInfo: Long): Int
	
	external fun getSemaphoreFdKHR(address: Long, device: Long, pGetFdInfo: Long, pFd: Long): Int
	
	
	
	/*
	Provided by VK_KHR_push_descriptor
	 */
	
	
	
	external fun cmdPushDescriptorSetKHR(address: Long, commandBuffer: Long, pipelineBindPoint: Int, layout: Long, set: Int, descriptorWriteCount: Int, pDescriptorWrites: Long)
	
	external fun cmdPushDescriptorSetWithTemplateKHR(address: Long, commandBuffer: Long, descriptorUpdateTemplate: Long, layout: Long, set: Int, pData: Long)
	
	
	
	/*
	Provided by VK_EXT_conditional_rendering
	 */
	
	
	
	external fun cmdBeginConditionalRenderingEXT(address: Long, commandBuffer: Long, pConditionalRenderingBegin: Long)
	
	external fun cmdEndConditionalRenderingEXT(address: Long, commandBuffer: Long)
	
	
	
	/*
	Provided by VK_KHR_descriptor_update_template
	 */
	
	
	
	external fun createDescriptorUpdateTemplateKHR(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pDescriptorUpdateTemplate: Long): Int
	
	external fun destroyDescriptorUpdateTemplateKHR(address: Long, device: Long, descriptorUpdateTemplate: Long, pAllocator: Long)
	
	external fun updateDescriptorSetWithTemplateKHR(address: Long, device: Long, descriptorSet: Long, descriptorUpdateTemplate: Long, pData: Long)
	
	
	
	/*
	Provided by VK_NV_clip_space_w_scaling
	 */
	
	
	
	external fun cmdSetViewportWScalingNV(address: Long, commandBuffer: Long, firstViewport: Int, viewportCount: Int, pViewportWScalings: Long)
	
	
	
	/*
	Provided by VK_EXT_direct_mode_display
	 */
	
	
	
	external fun releaseDisplayEXT(address: Long, physicalDevice: Long, display: Long): Int
	
	
	
	/*
	Provided by VK_EXT_acquire_xlib_display
	 */
	
	
	
	external fun acquireXlibDisplayEXT(address: Long, physicalDevice: Long, dpy: Long, display: Long): Int
	
	external fun getRandROutputDisplayEXT(address: Long, physicalDevice: Long, dpy: Long, rrOutput: Long, pDisplay: Long): Int
	
	
	
	/*
	Provided by VK_EXT_display_surface_counter
	 */
	
	
	
	external fun getPhysicalDeviceSurfaceCapabilities2EXT(address: Long, physicalDevice: Long, surface: Long, pSurfaceCapabilities: Long): Int
	
	
	
	/*
	Provided by VK_EXT_display_control
	 */
	
	
	
	external fun displayPowerControlEXT(address: Long, device: Long, display: Long, pDisplayPowerInfo: Long): Int
	
	external fun registerDeviceEventEXT(address: Long, device: Long, pDeviceEventInfo: Long, pAllocator: Long, pFence: Long): Int
	
	external fun registerDisplayEventEXT(address: Long, device: Long, display: Long, pDisplayEventInfo: Long, pAllocator: Long, pFence: Long): Int
	
	external fun getSwapchainCounterEXT(address: Long, device: Long, swapchain: Long, counter: Int, pCounterValue: Long): Int
	
	
	
	/*
	Provided by VK_GOOGLE_display_timing
	 */
	
	
	
	external fun getRefreshCycleDurationGOOGLE(address: Long, device: Long, swapchain: Long, pDisplayTimingProperties: Long): Int
	
	external fun getPastPresentationTimingGOOGLE(address: Long, device: Long, swapchain: Long, pPresentationTimingCount: Long, pPresentationTimings: Long): Int
	
	
	
	/*
	Provided by VK_EXT_discard_rectangles
	 */
	
	
	
	external fun cmdSetDiscardRectangleEXT(address: Long, commandBuffer: Long, firstDiscardRectangle: Int, discardRectangleCount: Int, pDiscardRectangles: Long)
	
	
	
	/*
	Provided by VK_EXT_hdr_metadata
	 */
	
	
	
	external fun setHdrMetadataEXT(address: Long, device: Long, swapchainCount: Int, pSwapchains: Long, pMetadata: Long)
	
	
	
	/*
	Provided by VK_KHR_create_renderpass2
	 */
	
	
	
	external fun createRenderPass2KHR(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pRenderPass: Long): Int
	
	external fun cmdBeginRenderPass2KHR(address: Long, commandBuffer: Long, pRenderPassBegin: Long, pSubpassBeginInfo: Long)
	
	external fun cmdNextSubpass2KHR(address: Long, commandBuffer: Long, pSubpassBeginInfo: Long, pSubpassEndInfo: Long)
	
	external fun cmdEndRenderPass2KHR(address: Long, commandBuffer: Long, pSubpassEndInfo: Long)
	
	
	
	/*
	Provided by VK_KHR_shared_presentable_image
	 */
	
	
	
	external fun getSwapchainStatusKHR(address: Long, device: Long, swapchain: Long): Int
	
	
	
	/*
	Provided by VK_KHR_external_fence_capabilities
	 */
	
	
	
	external fun getPhysicalDeviceExternalFencePropertiesKHR(address: Long, physicalDevice: Long, pExternalFenceInfo: Long, pExternalFenceProperties: Long)
	
	
	
	/*
	Provided by VK_KHR_external_fence_win32
	 */
	
	
	
	external fun importFenceWin32HandleKHR(address: Long, device: Long, pImportFenceWin32HandleInfo: Long): Int
	
	external fun getFenceWin32HandleKHR(address: Long, device: Long, pGetWin32HandleInfo: Long, pHandle: Long): Int
	
	
	
	/*
	Provided by VK_KHR_external_fence_fd
	 */
	
	
	
	external fun importFenceFdKHR(address: Long, device: Long, pImportFenceFdInfo: Long): Int
	
	external fun getFenceFdKHR(address: Long, device: Long, pGetFdInfo: Long, pFd: Long): Int
	
	
	
	/*
	Provided by VK_KHR_performance_query
	 */
	
	
	
	external fun enumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(address: Long, physicalDevice: Long, queueFamilyIndex: Int, pCounterCount: Long, pCounters: Long, pCounterDescriptions: Long): Int
	
	external fun getPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(address: Long, physicalDevice: Long, pPerformanceQueryCreateInfo: Long, pNumPasses: Long)
	
	external fun acquireProfilingLockKHR(address: Long, device: Long, pInfo: Long): Int
	
	external fun releaseProfilingLockKHR(address: Long, device: Long)
	
	
	
	/*
	Provided by VK_KHR_get_surface_capabilities2
	 */
	
	
	
	external fun getPhysicalDeviceSurfaceCapabilities2KHR(address: Long, physicalDevice: Long, pSurfaceInfo: Long, pSurfaceCapabilities: Long): Int
	
	external fun getPhysicalDeviceSurfaceFormats2KHR(address: Long, physicalDevice: Long, pSurfaceInfo: Long, pSurfaceFormatCount: Long, pSurfaceFormats: Long): Int
	
	
	
	/*
	Provided by VK_KHR_get_display_properties2
	 */
	
	
	
	external fun getPhysicalDeviceDisplayProperties2KHR(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getPhysicalDeviceDisplayPlaneProperties2KHR(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getDisplayModeProperties2KHR(address: Long, physicalDevice: Long, display: Long, pPropertyCount: Long, pProperties: Long): Int
	
	external fun getDisplayPlaneCapabilities2KHR(address: Long, physicalDevice: Long, pDisplayPlaneInfo: Long, pCapabilities: Long): Int
	
	
	
	/*
	Provided by VK_MVK_ios_surface
	 */
	
	
	
	external fun createIOSSurfaceMVK(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	
	
	/*
	Provided by VK_MVK_macos_surface
	 */
	
	
	
	external fun createMacOSSurfaceMVK(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	
	
	/*
	Provided by VK_EXT_debug_utils
	 */
	
	
	
	external fun setDebugUtilsObjectNameEXT(address: Long, device: Long, pNameInfo: Long): Int
	
	external fun setDebugUtilsObjectTagEXT(address: Long, device: Long, pTagInfo: Long): Int
	
	external fun queueBeginDebugUtilsLabelEXT(address: Long, queue: Long, pLabelInfo: Long)
	
	external fun queueEndDebugUtilsLabelEXT(address: Long, queue: Long)
	
	external fun queueInsertDebugUtilsLabelEXT(address: Long, queue: Long, pLabelInfo: Long)
	
	external fun cmdBeginDebugUtilsLabelEXT(address: Long, commandBuffer: Long, pLabelInfo: Long)
	
	external fun cmdEndDebugUtilsLabelEXT(address: Long, commandBuffer: Long)
	
	external fun cmdInsertDebugUtilsLabelEXT(address: Long, commandBuffer: Long, pLabelInfo: Long)
	
	external fun createDebugUtilsMessengerEXT(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pMessenger: Long): Int
	
	external fun destroyDebugUtilsMessengerEXT(address: Long, instance: Long, messenger: Long, pAllocator: Long)
	
	external fun submitDebugUtilsMessageEXT(address: Long, instance: Long, messageSeverity: Int, messageTypes: Int, pCallbackData: Long)
	
	
	
	/*
	Provided by VK_ANDROID_external_memory_android_hardware_buffer
	 */
	
	
	
	external fun getAndroidHardwareBufferPropertiesANDROID(address: Long, device: Long, buffer: Long, pProperties: Long): Int
	
	external fun getMemoryAndroidHardwareBufferANDROID(address: Long, device: Long, pInfo: Long, pBuffer: Long): Int
	
	
	
	/*
	Provided by VK_EXT_sample_locations
	 */
	
	
	
	external fun cmdSetSampleLocationsEXT(address: Long, commandBuffer: Long, pSampleLocationsInfo: Long)
	
	external fun getPhysicalDeviceMultisamplePropertiesEXT(address: Long, physicalDevice: Long, samples: Int, pMultisampleProperties: Long)
	
	
	
	/*
	Provided by VK_KHR_get_memory_requirements2
	 */
	
	
	
	external fun getImageMemoryRequirements2KHR(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)
	
	external fun getBufferMemoryRequirements2KHR(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)
	
	external fun getImageSparseMemoryRequirements2KHR(address: Long, device: Long, pInfo: Long, pSparseMemoryRequirementCount: Long, pSparseMemoryRequirements: Long)
	
	
	
	/*
	Provided by VK_KHR_acceleration_structure
	 */
	
	
	
	external fun createAccelerationStructureKHR(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pAccelerationStructure: Long): Int
	
	external fun destroyAccelerationStructureKHR(address: Long, device: Long, accelerationStructure: Long, pAllocator: Long)
	
	external fun cmdBuildAccelerationStructuresKHR(address: Long, commandBuffer: Long, infoCount: Int, pInfos: Long, ppBuildRangeInfos: Long)
	
	external fun cmdBuildAccelerationStructuresIndirectKHR(address: Long, commandBuffer: Long, infoCount: Int, pInfos: Long, pIndirectDeviceAddresses: Long, pIndirectStrides: Long, ppMaxPrimitiveCounts: Long)
	
	external fun buildAccelerationStructuresKHR(address: Long, device: Long, deferredOperation: Long, infoCount: Int, pInfos: Long, ppBuildRangeInfos: Long): Int
	
	external fun copyAccelerationStructureKHR(address: Long, device: Long, deferredOperation: Long, pInfo: Long): Int
	
	external fun copyAccelerationStructureToMemoryKHR(address: Long, device: Long, deferredOperation: Long, pInfo: Long): Int
	
	external fun copyMemoryToAccelerationStructureKHR(address: Long, device: Long, deferredOperation: Long, pInfo: Long): Int
	
	external fun writeAccelerationStructuresPropertiesKHR(address: Long, device: Long, accelerationStructureCount: Int, pAccelerationStructures: Long, queryType: Int, dataSize: Long, pData: Long, stride: Long): Int
	
	external fun cmdCopyAccelerationStructureKHR(address: Long, commandBuffer: Long, pInfo: Long)
	
	external fun cmdCopyAccelerationStructureToMemoryKHR(address: Long, commandBuffer: Long, pInfo: Long)
	
	external fun cmdCopyMemoryToAccelerationStructureKHR(address: Long, commandBuffer: Long, pInfo: Long)
	
	external fun getAccelerationStructureDeviceAddressKHR(address: Long, device: Long, pInfo: Long): Long
	
	external fun cmdWriteAccelerationStructuresPropertiesKHR(address: Long, commandBuffer: Long, accelerationStructureCount: Int, pAccelerationStructures: Long, queryType: Int, queryPool: Long, firstQuery: Int)
	
	external fun getDeviceAccelerationStructureCompatibilityKHR(address: Long, device: Long, pVersionInfo: Long, pCompatibility: Long)
	
	external fun getAccelerationStructureBuildSizesKHR(address: Long, device: Long, buildType: Int, pBuildInfo: Long, pMaxPrimitiveCounts: Long, pSizeInfo: Long)
	
	
	
	/*
	Provided by VK_KHR_ray_tracing_pipeline
	 */
	
	
	
	external fun cmdTraceRaysKHR(address: Long, commandBuffer: Long, pRaygenShaderBindingTable: Long, pMissShaderBindingTable: Long, pHitShaderBindingTable: Long, pCallableShaderBindingTable: Long, width: Int, height: Int, depth: Int)
	
	external fun createRayTracingPipelinesKHR(address: Long, device: Long, deferredOperation: Long, pipelineCache: Long, createInfoCount: Int, pCreateInfos: Long, pAllocator: Long, pPipelines: Long): Int
	
	external fun getRayTracingShaderGroupHandlesKHR(address: Long, device: Long, pipeline: Long, firstGroup: Int, groupCount: Int, dataSize: Long, pData: Long): Int
	
	external fun getRayTracingCaptureReplayShaderGroupHandlesKHR(address: Long, device: Long, pipeline: Long, firstGroup: Int, groupCount: Int, dataSize: Long, pData: Long): Int
	
	external fun cmdTraceRaysIndirectKHR(address: Long, commandBuffer: Long, pRaygenShaderBindingTable: Long, pMissShaderBindingTable: Long, pHitShaderBindingTable: Long, pCallableShaderBindingTable: Long, indirectDeviceAddress: Long)
	
	external fun getRayTracingShaderGroupStackSizeKHR(address: Long, device: Long, pipeline: Long, group: Int, groupShader: Int): Long
	
	external fun cmdSetRayTracingPipelineStackSizeKHR(address: Long, commandBuffer: Long, pipelineStackSize: Int)
	
	
	
	/*
	Provided by VK_KHR_sampler_ycbcr_conversion
	 */
	
	
	
	external fun createSamplerYcbcrConversionKHR(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pYcbcrConversion: Long): Int
	
	external fun destroySamplerYcbcrConversionKHR(address: Long, device: Long, ycbcrConversion: Long, pAllocator: Long)
	
	
	
	/*
	Provided by VK_KHR_bind_memory2
	 */
	
	
	
	external fun bindBufferMemory2KHR(address: Long, device: Long, bindInfoCount: Int, pBindInfos: Long): Int
	
	external fun bindImageMemory2KHR(address: Long, device: Long, bindInfoCount: Int, pBindInfos: Long): Int
	
	
	
	/*
	Provided by VK_EXT_image_drm_format_modifier
	 */
	
	
	
	external fun getImageDrmFormatModifierPropertiesEXT(address: Long, device: Long, image: Long, pProperties: Long): Int
	
	
	
	/*
	Provided by VK_EXT_validation_cache
	 */
	
	
	
	external fun createValidationCacheEXT(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pValidationCache: Long): Int
	
	external fun destroyValidationCacheEXT(address: Long, device: Long, validationCache: Long, pAllocator: Long)
	
	external fun mergeValidationCachesEXT(address: Long, device: Long, dstCache: Long, srcCacheCount: Int, pSrcCaches: Long): Int
	
	external fun getValidationCacheDataEXT(address: Long, device: Long, validationCache: Long, pDataSize: Long, pData: Long): Int
	
	
	
	/*
	Provided by VK_NV_shading_rate_image
	 */
	
	
	
	external fun cmdBindShadingRateImageNV(address: Long, commandBuffer: Long, imageView: Long, imageLayout: Int)
	
	external fun cmdSetViewportShadingRatePaletteNV(address: Long, commandBuffer: Long, firstViewport: Int, viewportCount: Int, pShadingRatePalettes: Long)
	
	external fun cmdSetCoarseSampleOrderNV(address: Long, commandBuffer: Long, sampleOrderType: Int, customSampleOrderCount: Int, pCustomSampleOrders: Long)
	
	
	
	/*
	Provided by VK_NV_ray_tracing
	 */
	
	
	
	external fun createAccelerationStructureNV(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pAccelerationStructure: Long): Int
	
	external fun destroyAccelerationStructureNV(address: Long, device: Long, accelerationStructure: Long, pAllocator: Long)
	
	external fun getAccelerationStructureMemoryRequirementsNV(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)
	
	external fun bindAccelerationStructureMemoryNV(address: Long, device: Long, bindInfoCount: Int, pBindInfos: Long): Int
	
	external fun cmdBuildAccelerationStructureNV(address: Long, commandBuffer: Long, pInfo: Long, instanceData: Long, instanceOffset: Long, update: Int, dst: Long, src: Long, scratch: Long, scratchOffset: Long)
	
	external fun cmdCopyAccelerationStructureNV(address: Long, commandBuffer: Long, dst: Long, src: Long, mode: Int)
	
	external fun cmdTraceRaysNV(address: Long, commandBuffer: Long, raygenShaderBindingTableBuffer: Long, raygenShaderBindingOffset: Long, missShaderBindingTableBuffer: Long, missShaderBindingOffset: Long, missShaderBindingStride: Long, hitShaderBindingTableBuffer: Long, hitShaderBindingOffset: Long, hitShaderBindingStride: Long, callableShaderBindingTableBuffer: Long, callableShaderBindingOffset: Long, callableShaderBindingStride: Long, width: Int, height: Int, depth: Int)
	
	external fun createRayTracingPipelinesNV(address: Long, device: Long, pipelineCache: Long, createInfoCount: Int, pCreateInfos: Long, pAllocator: Long, pPipelines: Long): Int
	
	external fun getRayTracingShaderGroupHandlesNV(address: Long, device: Long, pipeline: Long, firstGroup: Int, groupCount: Int, dataSize: Long, pData: Long): Int
	
	external fun getAccelerationStructureHandleNV(address: Long, device: Long, accelerationStructure: Long, dataSize: Long, pData: Long): Int
	
	external fun cmdWriteAccelerationStructuresPropertiesNV(address: Long, commandBuffer: Long, accelerationStructureCount: Int, pAccelerationStructures: Long, queryType: Int, queryPool: Long, firstQuery: Int)
	
	external fun compileDeferredNV(address: Long, device: Long, pipeline: Long, shader: Int): Int
	
	
	
	/*
	Provided by VK_KHR_maintenance3
	 */
	
	
	
	external fun getDescriptorSetLayoutSupportKHR(address: Long, device: Long, pCreateInfo: Long, pSupport: Long)
	
	
	
	/*
	Provided by VK_KHR_draw_indirect_count
	 */
	
	
	
	external fun cmdDrawIndirectCountKHR(address: Long, commandBuffer: Long, buffer: Long, offset: Long, countBuffer: Long, countBufferOffset: Long, maxDrawCount: Int, stride: Int)
	
	external fun cmdDrawIndexedIndirectCountKHR(address: Long, commandBuffer: Long, buffer: Long, offset: Long, countBuffer: Long, countBufferOffset: Long, maxDrawCount: Int, stride: Int)
	
	
	
	/*
	Provided by VK_EXT_external_memory_host
	 */
	
	
	
	external fun getMemoryHostPointerPropertiesEXT(address: Long, device: Long, handleType: Int, pHostPointer: Long, pMemoryHostPointerProperties: Long): Int
	
	
	
	/*
	Provided by VK_AMD_buffer_marker
	 */
	
	
	
	external fun cmdWriteBufferMarkerAMD(address: Long, commandBuffer: Long, pipelineStage: Int, dstBuffer: Long, dstOffset: Long, marker: Int)
	
	
	
	/*
	Provided by VK_EXT_calibrated_timestamps
	 */
	
	
	
	external fun getPhysicalDeviceCalibrateableTimeDomainsEXT(address: Long, physicalDevice: Long, pTimeDomainCount: Long, pTimeDomains: Long): Int
	
	external fun getCalibratedTimestampsEXT(address: Long, device: Long, timestampCount: Int, pTimestampInfos: Long, pTimestamps: Long, pMaxDeviation: Long): Int
	
	
	
	/*
	Provided by VK_NV_mesh_shader
	 */
	
	
	
	external fun cmdDrawMeshTasksNV(address: Long, commandBuffer: Long, taskCount: Int, firstTask: Int)
	
	external fun cmdDrawMeshTasksIndirectNV(address: Long, commandBuffer: Long, buffer: Long, offset: Long, drawCount: Int, stride: Int)
	
	external fun cmdDrawMeshTasksIndirectCountNV(address: Long, commandBuffer: Long, buffer: Long, offset: Long, countBuffer: Long, countBufferOffset: Long, maxDrawCount: Int, stride: Int)
	
	
	
	/*
	Provided by VK_NV_scissor_exclusive
	 */
	
	
	
	external fun cmdSetExclusiveScissorNV(address: Long, commandBuffer: Long, firstExclusiveScissor: Int, exclusiveScissorCount: Int, pExclusiveScissors: Long)
	
	
	
	/*
	Provided by VK_NV_device_diagnostic_checkpoints
	 */
	
	
	
	external fun cmdSetCheckpointNV(address: Long, commandBuffer: Long, pCheckpointMarker: Long)
	
	external fun getQueueCheckpointDataNV(address: Long, queue: Long, pCheckpointDataCount: Long, pCheckpointData: Long)
	
	
	
	/*
	Provided by VK_KHR_timeline_semaphore
	 */
	
	
	
	external fun getSemaphoreCounterValueKHR(address: Long, device: Long, semaphore: Long, pValue: Long): Int
	
	external fun waitSemaphoresKHR(address: Long, device: Long, pWaitInfo: Long, timeout: Long): Int
	
	external fun signalSemaphoreKHR(address: Long, device: Long, pSignalInfo: Long): Int
	
	
	
	/*
	Provided by VK_INTEL_performance_query
	 */
	
	
	
	external fun initializePerformanceApiINTEL(address: Long, device: Long, pInitializeInfo: Long): Int
	
	external fun uninitializePerformanceApiINTEL(address: Long, device: Long)
	
	external fun cmdSetPerformanceMarkerINTEL(address: Long, commandBuffer: Long, pMarkerInfo: Long): Int
	
	external fun cmdSetPerformanceStreamMarkerINTEL(address: Long, commandBuffer: Long, pMarkerInfo: Long): Int
	
	external fun cmdSetPerformanceOverrideINTEL(address: Long, commandBuffer: Long, pOverrideInfo: Long): Int
	
	external fun acquirePerformanceConfigurationINTEL(address: Long, device: Long, pAcquireInfo: Long, pConfiguration: Long): Int
	
	external fun releasePerformanceConfigurationINTEL(address: Long, device: Long, configuration: Long): Int
	
	external fun queueSetPerformanceConfigurationINTEL(address: Long, queue: Long, configuration: Long): Int
	
	external fun getPerformanceParameterINTEL(address: Long, device: Long, parameter: Int, pValue: Long): Int
	
	
	
	/*
	Provided by VK_AMD_display_native_hdr
	 */
	
	
	
	external fun setLocalDimmingAMD(address: Long, device: Long, swapChain: Long, localDimmingEnable: Int)
	
	
	
	/*
	Provided by VK_FUCHSIA_imagepipe_surface
	 */
	
	
	
	external fun createImagePipeSurfaceFUCHSIA(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	
	
	/*
	Provided by VK_EXT_metal_surface
	 */
	
	
	
	external fun createMetalSurfaceEXT(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	
	
	/*
	Provided by VK_KHR_fragment_shading_rate
	 */
	
	
	
	external fun getPhysicalDeviceFragmentShadingRatesKHR(address: Long, physicalDevice: Long, pFragmentShadingRateCount: Long, pFragmentShadingRates: Long): Int
	
	external fun cmdSetFragmentShadingRateKHR(address: Long, commandBuffer: Long, pFragmentSize: Long, combinerOps: Long)
	
	
	
	/*
	Provided by VK_EXT_buffer_device_address
	 */
	
	
	
	external fun getBufferDeviceAddressEXT(address: Long, device: Long, pInfo: Long): Long
	
	
	
	/*
	Provided by VK_EXT_tooling_info
	 */
	
	
	
	external fun getPhysicalDeviceToolPropertiesEXT(address: Long, physicalDevice: Long, pToolCount: Long, pToolProperties: Long): Int
	
	
	
	/*
	Provided by VK_NV_cooperative_matrix
	 */
	
	
	
	external fun getPhysicalDeviceCooperativeMatrixPropertiesNV(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int
	
	
	
	/*
	Provided by VK_NV_coverage_reduction_mode
	 */
	
	
	
	external fun getPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(address: Long, physicalDevice: Long, pCombinationCount: Long, pCombinations: Long): Int
	
	
	
	/*
	Provided by VK_EXT_full_screen_exclusive
	 */
	
	
	
	external fun getPhysicalDeviceSurfacePresentModes2EXT(address: Long, physicalDevice: Long, pSurfaceInfo: Long, pPresentModeCount: Long, pPresentModes: Long): Int
	
	external fun acquireFullScreenExclusiveModeEXT(address: Long, device: Long, swapchain: Long): Int
	
	external fun releaseFullScreenExclusiveModeEXT(address: Long, device: Long, swapchain: Long): Int
	
	external fun getDeviceGroupSurfacePresentModes2EXT(address: Long, device: Long, pSurfaceInfo: Long, pModes: Long): Int
	
	
	
	/*
	Provided by VK_EXT_headless_surface
	 */
	
	
	
	external fun createHeadlessSurfaceEXT(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	
	
	/*
	Provided by VK_KHR_buffer_device_address
	 */
	
	
	
	external fun getBufferDeviceAddressKHR(address: Long, device: Long, pInfo: Long): Long
	
	external fun getBufferOpaqueCaptureAddressKHR(address: Long, device: Long, pInfo: Long): Long
	
	external fun getDeviceMemoryOpaqueCaptureAddressKHR(address: Long, device: Long, pInfo: Long): Long
	
	
	
	/*
	Provided by VK_EXT_line_rasterization
	 */
	
	
	
	external fun cmdSetLineStippleEXT(address: Long, commandBuffer: Long, lineStippleFactor: Int, lineStipplePattern: Short)
	
	
	
	/*
	Provided by VK_EXT_host_query_reset
	 */
	
	
	
	external fun resetQueryPoolEXT(address: Long, device: Long, queryPool: Long, firstQuery: Int, queryCount: Int)
	
	
	
	/*
	Provided by VK_EXT_extended_dynamic_state
	 */
	
	
	
	external fun cmdSetCullModeEXT(address: Long, commandBuffer: Long, cullMode: Int)
	
	external fun cmdSetFrontFaceEXT(address: Long, commandBuffer: Long, frontFace: Int)
	
	external fun cmdSetPrimitiveTopologyEXT(address: Long, commandBuffer: Long, primitiveTopology: Int)
	
	external fun cmdSetViewportWithCountEXT(address: Long, commandBuffer: Long, viewportCount: Int, pViewports: Long)
	
	external fun cmdSetScissorWithCountEXT(address: Long, commandBuffer: Long, scissorCount: Int, pScissors: Long)
	
	external fun cmdBindVertexBuffers2EXT(address: Long, commandBuffer: Long, firstBinding: Int, bindingCount: Int, pBuffers: Long, pOffsets: Long, pSizes: Long, pStrides: Long)
	
	external fun cmdSetDepthTestEnableEXT(address: Long, commandBuffer: Long, depthTestEnable: Int)
	
	external fun cmdSetDepthWriteEnableEXT(address: Long, commandBuffer: Long, depthWriteEnable: Int)
	
	external fun cmdSetDepthCompareOpEXT(address: Long, commandBuffer: Long, depthCompareOp: Int)
	
	external fun cmdSetDepthBoundsTestEnableEXT(address: Long, commandBuffer: Long, depthBoundsTestEnable: Int)
	
	external fun cmdSetStencilTestEnableEXT(address: Long, commandBuffer: Long, stencilTestEnable: Int)
	
	external fun cmdSetStencilOpEXT(address: Long, commandBuffer: Long, faceMask: Int, failOp: Int, passOp: Int, depthFailOp: Int, compareOp: Int)
	
	
	
	/*
	Provided by VK_KHR_deferred_host_operations
	 */
	
	
	
	external fun createDeferredOperationKHR(address: Long, device: Long, pAllocator: Long, pDeferredOperation: Long): Int
	
	external fun destroyDeferredOperationKHR(address: Long, device: Long, operation: Long, pAllocator: Long)
	
	external fun getDeferredOperationMaxConcurrencyKHR(address: Long, device: Long, operation: Long): Int
	
	external fun getDeferredOperationResultKHR(address: Long, device: Long, operation: Long): Int
	
	external fun deferredOperationJoinKHR(address: Long, device: Long, operation: Long): Int
	
	
	
	/*
	Provided by VK_KHR_pipeline_executable_properties
	 */
	
	
	
	external fun getPipelineExecutablePropertiesKHR(address: Long, device: Long, pPipelineInfo: Long, pExecutableCount: Long, pProperties: Long): Int
	
	external fun getPipelineExecutableStatisticsKHR(address: Long, device: Long, pExecutableInfo: Long, pStatisticCount: Long, pStatistics: Long): Int
	
	external fun getPipelineExecutableInternalRepresentationsKHR(address: Long, device: Long, pExecutableInfo: Long, pInternalRepresentationCount: Long, pInternalRepresentations: Long): Int
	
	
	
	/*
	Provided by VK_NV_device_generated_commands
	 */
	
	
	
	external fun getGeneratedCommandsMemoryRequirementsNV(address: Long, device: Long, pInfo: Long, pMemoryRequirements: Long)
	
	external fun cmdPreprocessGeneratedCommandsNV(address: Long, commandBuffer: Long, pGeneratedCommandsInfo: Long)
	
	external fun cmdExecuteGeneratedCommandsNV(address: Long, commandBuffer: Long, isPreprocessed: Int, pGeneratedCommandsInfo: Long)
	
	external fun cmdBindPipelineShaderGroupNV(address: Long, commandBuffer: Long, pipelineBindPoint: Int, pipeline: Long, groupIndex: Int)
	
	external fun createIndirectCommandsLayoutNV(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pIndirectCommandsLayout: Long): Int
	
	external fun destroyIndirectCommandsLayoutNV(address: Long, device: Long, indirectCommandsLayout: Long, pAllocator: Long)
	
	
	
	/*
	Provided by VK_EXT_private_data
	 */
	
	
	
	external fun createPrivateDataSlotEXT(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pPrivateDataSlot: Long): Int
	
	external fun destroyPrivateDataSlotEXT(address: Long, device: Long, privateDataSlot: Long, pAllocator: Long)
	
	external fun setPrivateDataEXT(address: Long, device: Long, objectType: Int, objectHandle: Long, privateDataSlot: Long, data: Long): Int
	
	external fun getPrivateDataEXT(address: Long, device: Long, objectType: Int, objectHandle: Long, privateDataSlot: Long, pData: Long)
	
	
	
	/*
	Provided by VK_KHR_synchronization2
	 */
	
	
	
	external fun cmdSetEvent2KHR(address: Long, commandBuffer: Long, event: Long, pDependencyInfo: Long)
	
	external fun cmdResetEvent2KHR(address: Long, commandBuffer: Long, event: Long, stageMask: Long)
	
	external fun cmdWaitEvents2KHR(address: Long, commandBuffer: Long, eventCount: Int, pEvents: Long, pDependencyInfos: Long)
	
	external fun cmdPipelineBarrier2KHR(address: Long, commandBuffer: Long, pDependencyInfo: Long)
	
	external fun cmdWriteTimestamp2KHR(address: Long, commandBuffer: Long, stage: Long, queryPool: Long, query: Int)
	
	external fun queueSubmit2KHR(address: Long, queue: Long, submitCount: Int, pSubmits: Long, fence: Long): Int
	
	external fun cmdWriteBufferMarker2AMD(address: Long, commandBuffer: Long, stage: Long, dstBuffer: Long, dstOffset: Long, marker: Int)
	
	external fun getQueueCheckpointData2NV(address: Long, queue: Long, pCheckpointDataCount: Long, pCheckpointData: Long)
	
	
	
	/*
	Provided by VK_NV_fragment_shading_rate_enums
	 */
	
	
	
	external fun cmdSetFragmentShadingRateEnumNV(address: Long, commandBuffer: Long, shadingRate: Int, combinerOps: Long)
	
	
	
	/*
	Provided by VK_KHR_copy_commands2
	 */
	
	
	
	external fun cmdCopyBuffer2KHR(address: Long, commandBuffer: Long, pCopyBufferInfo: Long)
	
	external fun cmdCopyImage2KHR(address: Long, commandBuffer: Long, pCopyImageInfo: Long)
	
	external fun cmdCopyBufferToImage2KHR(address: Long, commandBuffer: Long, pCopyBufferToImageInfo: Long)
	
	external fun cmdCopyImageToBuffer2KHR(address: Long, commandBuffer: Long, pCopyImageToBufferInfo: Long)
	
	external fun cmdBlitImage2KHR(address: Long, commandBuffer: Long, pBlitImageInfo: Long)
	
	external fun cmdResolveImage2KHR(address: Long, commandBuffer: Long, pResolveImageInfo: Long)
	
	
	
	/*
	Provided by VK_NV_acquire_winrt_display
	 */
	
	
	
	external fun acquireWinrtDisplayNV(address: Long, physicalDevice: Long, display: Long): Int
	
	external fun getWinrtDisplayNV(address: Long, physicalDevice: Long, deviceRelativeId: Int, pDisplay: Long): Int
	
	
	
	/*
	Provided by VK_EXT_directfb_surface
	 */
	
	
	
	external fun createDirectFBSurfaceEXT(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceDirectFBPresentationSupportEXT(address: Long, physicalDevice: Long, queueFamilyIndex: Int, dfb: Long): Int
	
	
	
	/*
	Provided by VK_FUCHSIA_external_memory
	 */
	
	
	
	external fun getMemoryZirconHandleFUCHSIA(address: Long, device: Long, pGetZirconHandleInfo: Long, pZirconHandle: Long): Int
	
	external fun getMemoryZirconHandlePropertiesFUCHSIA(address: Long, device: Long, handleType: Int, zirconHandle: Long, pMemoryZirconHandleProperties: Long): Int
	
	
	
	/*
	Provided by VK_FUCHSIA_external_semaphore
	 */
	
	
	
	external fun importSemaphoreZirconHandleFUCHSIA(address: Long, device: Long, pImportSemaphoreZirconHandleInfo: Long): Int
	
	external fun getSemaphoreZirconHandleFUCHSIA(address: Long, device: Long, pGetZirconHandleInfo: Long, pZirconHandle: Long): Int
	
	
	
	/*
	Provided by VK_QNX_screen_surface
	 */
	
	
	
	external fun createScreenSurfaceQNX(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int
	
	external fun getPhysicalDeviceScreenPresentationSupportQNX(address: Long, physicalDevice: Long, queueFamilyIndex: Int, window: Long): Int


}