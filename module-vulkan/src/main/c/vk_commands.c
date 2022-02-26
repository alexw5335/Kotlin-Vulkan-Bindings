#include <jni.h>



#ifdef WIN32
#define VKAPI_PTR __stdcall
#endif



// Types



typedef jint (*PFN_vkCreateInstance)(jlong pCreateInfo, jlong pAllocator, jlong pInstance);
typedef void (*PFN_vkDestroyInstance)(jlong instance, jlong pAllocator);
typedef jint (*PFN_vkEnumeratePhysicalDevices)(jlong instance, jlong pPhysicalDeviceCount, jlong pPhysicalDevices);
typedef void (*PFN_vkGetPhysicalDeviceFeatures)(jlong physicalDevice, jlong pFeatures);
typedef void (*PFN_vkGetPhysicalDeviceFormatProperties)(jlong physicalDevice, jint format, jlong pFormatProperties);
typedef jint (*PFN_vkGetPhysicalDeviceImageFormatProperties)(jlong physicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jlong pImageFormatProperties);
typedef void (*PFN_vkGetPhysicalDeviceProperties)(jlong physicalDevice, jlong pProperties);
typedef void (*PFN_vkGetPhysicalDeviceQueueFamilyProperties)(jlong physicalDevice, jlong pQueueFamilyPropertyCount, jlong pQueueFamilyProperties);
typedef void (*PFN_vkGetPhysicalDeviceMemoryProperties)(jlong physicalDevice, jlong pMemoryProperties);
typedef jlong (*PFN_vkGetInstanceProcAddr)(jlong instance, jlong pName);
typedef jlong (*PFN_vkGetDeviceProcAddr)(jlong device, jlong pName);
typedef jint (*PFN_vkCreateDevice)(jlong physicalDevice, jlong pCreateInfo, jlong pAllocator, jlong pDevice);
typedef void (*PFN_vkDestroyDevice)(jlong device, jlong pAllocator);
typedef jint (*PFN_vkEnumerateInstanceExtensionProperties)(jlong pLayerName, jlong pPropertyCount, jlong pProperties);
typedef jint (*PFN_vkEnumerateDeviceExtensionProperties)(jlong physicalDevice, jlong pLayerName, jlong pPropertyCount, jlong pProperties);
typedef jint (*PFN_vkEnumerateInstanceLayerProperties)(jlong pPropertyCount, jlong pProperties);
typedef jint (*PFN_vkEnumerateDeviceLayerProperties)(jlong physicalDevice, jlong pPropertyCount, jlong pProperties);
typedef void (*PFN_vkGetDeviceQueue)(jlong device, jint queueFamilyIndex, jint queueIndex, jlong pQueue);
typedef jint (*PFN_vkQueueSubmit)(jlong queue, jint submitCount, jlong pSubmits, jlong fence);
typedef jint (*PFN_vkQueueWaitIdle)(jlong queue);
typedef jint (*PFN_vkDeviceWaitIdle)(jlong device);
typedef jint (*PFN_vkAllocateMemory)(jlong device, jlong pAllocateInfo, jlong pAllocator, jlong pMemory);
typedef void (*PFN_vkFreeMemory)(jlong device, jlong memory, jlong pAllocator);
typedef jint (*PFN_vkMapMemory)(jlong device, jlong memory, jlong offset, jlong size, jint flags, jlong ppData);
typedef void (*PFN_vkUnmapMemory)(jlong device, jlong memory);
typedef jint (*PFN_vkFlushMappedMemoryRanges)(jlong device, jint memoryRangeCount, jlong pMemoryRanges);
typedef jint (*PFN_vkInvalidateMappedMemoryRanges)(jlong device, jint memoryRangeCount, jlong pMemoryRanges);
typedef void (*PFN_vkGetDeviceMemoryCommitment)(jlong device, jlong memory, jlong pCommittedMemoryInBytes);
typedef jint (*PFN_vkBindBufferMemory)(jlong device, jlong buffer, jlong memory, jlong memoryOffset);
typedef jint (*PFN_vkBindImageMemory)(jlong device, jlong image, jlong memory, jlong memoryOffset);
typedef void (*PFN_vkGetBufferMemoryRequirements)(jlong device, jlong buffer, jlong pMemoryRequirements);
typedef void (*PFN_vkGetImageMemoryRequirements)(jlong device, jlong image, jlong pMemoryRequirements);
typedef void (*PFN_vkGetImageSparseMemoryRequirements)(jlong device, jlong image, jlong pSparseMemoryRequirementCount, jlong pSparseMemoryRequirements);
typedef void (*PFN_vkGetPhysicalDeviceSparseImageFormatProperties)(jlong physicalDevice, jint format, jint type, jint samples, jint usage, jint tiling, jlong pPropertyCount, jlong pProperties);
typedef jint (*PFN_vkQueueBindSparse)(jlong queue, jint bindInfoCount, jlong pBindInfo, jlong fence);
typedef jint (*PFN_vkCreateFence)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pFence);
typedef void (*PFN_vkDestroyFence)(jlong device, jlong fence, jlong pAllocator);
typedef jint (*PFN_vkResetFences)(jlong device, jint fenceCount, jlong pFences);
typedef jint (*PFN_vkGetFenceStatus)(jlong device, jlong fence);
typedef jint (*PFN_vkWaitForFences)(jlong device, jint fenceCount, jlong pFences, jint waitAll, jlong timeout);
typedef jint (*PFN_vkCreateSemaphore)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSemaphore);
typedef void (*PFN_vkDestroySemaphore)(jlong device, jlong semaphore, jlong pAllocator);
typedef jint (*PFN_vkCreateEvent)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pEvent);
typedef void (*PFN_vkDestroyEvent)(jlong device, jlong event, jlong pAllocator);
typedef jint (*PFN_vkGetEventStatus)(jlong device, jlong event);
typedef jint (*PFN_vkSetEvent)(jlong device, jlong event);
typedef jint (*PFN_vkResetEvent)(jlong device, jlong event);
typedef jint (*PFN_vkCreateQueryPool)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pQueryPool);
typedef void (*PFN_vkDestroyQueryPool)(jlong device, jlong queryPool, jlong pAllocator);
typedef jint (*PFN_vkGetQueryPoolResults)(jlong device, jlong queryPool, jint firstQuery, jint queryCount, jlong dataSize, jlong pData, jlong stride, jint flags);
typedef jint (*PFN_vkCreateBuffer)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pBuffer);
typedef void (*PFN_vkDestroyBuffer)(jlong device, jlong buffer, jlong pAllocator);
typedef jint (*PFN_vkCreateBufferView)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pView);
typedef void (*PFN_vkDestroyBufferView)(jlong device, jlong bufferView, jlong pAllocator);
typedef jint (*PFN_vkCreateImage)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pImage);
typedef void (*PFN_vkDestroyImage)(jlong device, jlong image, jlong pAllocator);
typedef void (*PFN_vkGetImageSubresourceLayout)(jlong device, jlong image, jlong pSubresource, jlong pLayout);
typedef jint (*PFN_vkCreateImageView)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pView);
typedef void (*PFN_vkDestroyImageView)(jlong device, jlong imageView, jlong pAllocator);
typedef jint (*PFN_vkCreateShaderModule)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pShaderModule);
typedef void (*PFN_vkDestroyShaderModule)(jlong device, jlong shaderModule, jlong pAllocator);
typedef jint (*PFN_vkCreatePipelineCache)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pPipelineCache);
typedef void (*PFN_vkDestroyPipelineCache)(jlong device, jlong pipelineCache, jlong pAllocator);
typedef jint (*PFN_vkGetPipelineCacheData)(jlong device, jlong pipelineCache, jlong pDataSize, jlong pData);
typedef jint (*PFN_vkMergePipelineCaches)(jlong device, jlong dstCache, jint srcCacheCount, jlong pSrcCaches);
typedef jint (*PFN_vkCreateGraphicsPipelines)(jlong device, jlong pipelineCache, jint createInfoCount, jlong pCreateInfos, jlong pAllocator, jlong pPipelines);
typedef jint (*PFN_vkCreateComputePipelines)(jlong device, jlong pipelineCache, jint createInfoCount, jlong pCreateInfos, jlong pAllocator, jlong pPipelines);
typedef void (*PFN_vkDestroyPipeline)(jlong device, jlong pipeline, jlong pAllocator);
typedef jint (*PFN_vkCreatePipelineLayout)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pPipelineLayout);
typedef void (*PFN_vkDestroyPipelineLayout)(jlong device, jlong pipelineLayout, jlong pAllocator);
typedef jint (*PFN_vkCreateSampler)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSampler);
typedef void (*PFN_vkDestroySampler)(jlong device, jlong sampler, jlong pAllocator);
typedef jint (*PFN_vkCreateDescriptorSetLayout)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSetLayout);
typedef void (*PFN_vkDestroyDescriptorSetLayout)(jlong device, jlong descriptorSetLayout, jlong pAllocator);
typedef jint (*PFN_vkCreateDescriptorPool)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pDescriptorPool);
typedef void (*PFN_vkDestroyDescriptorPool)(jlong device, jlong descriptorPool, jlong pAllocator);
typedef jint (*PFN_vkResetDescriptorPool)(jlong device, jlong descriptorPool, jint flags);
typedef jint (*PFN_vkAllocateDescriptorSets)(jlong device, jlong pAllocateInfo, jlong pDescriptorSets);
typedef jint (*PFN_vkFreeDescriptorSets)(jlong device, jlong descriptorPool, jint descriptorSetCount, jlong pDescriptorSets);
typedef void (*PFN_vkUpdateDescriptorSets)(jlong device, jint descriptorWriteCount, jlong pDescriptorWrites, jint descriptorCopyCount, jlong pDescriptorCopies);
typedef jint (*PFN_vkCreateFramebuffer)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pFramebuffer);
typedef void (*PFN_vkDestroyFramebuffer)(jlong device, jlong framebuffer, jlong pAllocator);
typedef jint (*PFN_vkCreateRenderPass)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pRenderPass);
typedef void (*PFN_vkDestroyRenderPass)(jlong device, jlong renderPass, jlong pAllocator);
typedef void (*PFN_vkGetRenderAreaGranularity)(jlong device, jlong renderPass, jlong pGranularity);
typedef jint (*PFN_vkCreateCommandPool)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pCommandPool);
typedef void (*PFN_vkDestroyCommandPool)(jlong device, jlong commandPool, jlong pAllocator);
typedef jint (*PFN_vkResetCommandPool)(jlong device, jlong commandPool, jint flags);
typedef jint (*PFN_vkAllocateCommandBuffers)(jlong device, jlong pAllocateInfo, jlong pCommandBuffers);
typedef void (*PFN_vkFreeCommandBuffers)(jlong device, jlong commandPool, jint commandBufferCount, jlong pCommandBuffers);
typedef jint (*PFN_vkBeginCommandBuffer)(jlong commandBuffer, jlong pBeginInfo);
typedef jint (*PFN_vkEndCommandBuffer)(jlong commandBuffer);
typedef jint (*PFN_vkResetCommandBuffer)(jlong commandBuffer, jint flags);
typedef void (*PFN_vkCmdBindPipeline)(jlong commandBuffer, jint pipelineBindPoint, jlong pipeline);
typedef void (*PFN_vkCmdSetViewport)(jlong commandBuffer, jint firstViewport, jint viewportCount, jlong pViewports);
typedef void (*PFN_vkCmdSetScissor)(jlong commandBuffer, jint firstScissor, jint scissorCount, jlong pScissors);
typedef void (*PFN_vkCmdSetLineWidth)(jlong commandBuffer, jfloat lineWidth);
typedef void (*PFN_vkCmdSetDepthBias)(jlong commandBuffer, jfloat depthBiasConstantFactor, jfloat depthBiasClamp, jfloat depthBiasSlopeFactor);
typedef void (*PFN_vkCmdSetBlendConstants)(jlong commandBuffer, jlong blendConstants);
typedef void (*PFN_vkCmdSetDepthBounds)(jlong commandBuffer, jfloat minDepthBounds, jfloat maxDepthBounds);
typedef void (*PFN_vkCmdSetStencilCompareMask)(jlong commandBuffer, jint faceMask, jint compareMask);
typedef void (*PFN_vkCmdSetStencilWriteMask)(jlong commandBuffer, jint faceMask, jint writeMask);
typedef void (*PFN_vkCmdSetStencilReference)(jlong commandBuffer, jint faceMask, jint reference);
typedef void (*PFN_vkCmdBindDescriptorSets)(jlong commandBuffer, jint pipelineBindPoint, jlong layout, jint firstSet, jint descriptorSetCount, jlong pDescriptorSets, jint dynamicOffsetCount, jlong pDynamicOffsets);
typedef void (*PFN_vkCmdBindIndexBuffer)(jlong commandBuffer, jlong buffer, jlong offset, jint indexType);
typedef void (*PFN_vkCmdBindVertexBuffers)(jlong commandBuffer, jint firstBinding, jint bindingCount, jlong pBuffers, jlong pOffsets);
typedef void (*PFN_vkCmdDraw)(jlong commandBuffer, jint vertexCount, jint instanceCount, jint firstVertex, jint firstInstance);
typedef void (*PFN_vkCmdDrawIndexed)(jlong commandBuffer, jint indexCount, jint instanceCount, jint firstIndex, jint vertexOffset, jint firstInstance);
typedef void (*PFN_vkCmdDrawIndirect)(jlong commandBuffer, jlong buffer, jlong offset, jint drawCount, jint stride);
typedef void (*PFN_vkCmdDrawIndexedIndirect)(jlong commandBuffer, jlong buffer, jlong offset, jint drawCount, jint stride);
typedef void (*PFN_vkCmdDispatch)(jlong commandBuffer, jint groupCountX, jint groupCountY, jint groupCountZ);
typedef void (*PFN_vkCmdDispatchIndirect)(jlong commandBuffer, jlong buffer, jlong offset);
typedef void (*PFN_vkCmdCopyBuffer)(jlong commandBuffer, jlong srcBuffer, jlong dstBuffer, jint regionCount, jlong pRegions);
typedef void (*PFN_vkCmdCopyImage)(jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions);
typedef void (*PFN_vkCmdBlitImage)(jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions, jint filter);
typedef void (*PFN_vkCmdCopyBufferToImage)(jlong commandBuffer, jlong srcBuffer, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions);
typedef void (*PFN_vkCmdCopyImageToBuffer)(jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstBuffer, jint regionCount, jlong pRegions);
typedef void (*PFN_vkCmdUpdateBuffer)(jlong commandBuffer, jlong dstBuffer, jlong dstOffset, jlong dataSize, jlong pData);
typedef void (*PFN_vkCmdFillBuffer)(jlong commandBuffer, jlong dstBuffer, jlong dstOffset, jlong size, jint data);
typedef void (*PFN_vkCmdClearColorImage)(jlong commandBuffer, jlong image, jint imageLayout, jlong pColor, jint rangeCount, jlong pRanges);
typedef void (*PFN_vkCmdClearDepthStencilImage)(jlong commandBuffer, jlong image, jint imageLayout, jlong pDepthStencil, jint rangeCount, jlong pRanges);
typedef void (*PFN_vkCmdClearAttachments)(jlong commandBuffer, jint attachmentCount, jlong pAttachments, jint rectCount, jlong pRects);
typedef void (*PFN_vkCmdResolveImage)(jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions);
typedef void (*PFN_vkCmdSetEvent)(jlong commandBuffer, jlong event, jint stageMask);
typedef void (*PFN_vkCmdResetEvent)(jlong commandBuffer, jlong event, jint stageMask);
typedef void (*PFN_vkCmdWaitEvents)(jlong commandBuffer, jint eventCount, jlong pEvents, jint srcStageMask, jint dstStageMask, jint memoryBarrierCount, jlong pMemoryBarriers, jint bufferMemoryBarrierCount, jlong pBufferMemoryBarriers, jint imageMemoryBarrierCount, jlong pImageMemoryBarriers);
typedef void (*PFN_vkCmdPipelineBarrier)(jlong commandBuffer, jint srcStageMask, jint dstStageMask, jint dependencyFlags, jint memoryBarrierCount, jlong pMemoryBarriers, jint bufferMemoryBarrierCount, jlong pBufferMemoryBarriers, jint imageMemoryBarrierCount, jlong pImageMemoryBarriers);
typedef void (*PFN_vkCmdBeginQuery)(jlong commandBuffer, jlong queryPool, jint query, jint flags);
typedef void (*PFN_vkCmdEndQuery)(jlong commandBuffer, jlong queryPool, jint query);
typedef void (*PFN_vkCmdResetQueryPool)(jlong commandBuffer, jlong queryPool, jint firstQuery, jint queryCount);
typedef void (*PFN_vkCmdWriteTimestamp)(jlong commandBuffer, jint pipelineStage, jlong queryPool, jint query);
typedef void (*PFN_vkCmdCopyQueryPoolResults)(jlong commandBuffer, jlong queryPool, jint firstQuery, jint queryCount, jlong dstBuffer, jlong dstOffset, jlong stride, jint flags);
typedef void (*PFN_vkCmdPushConstants)(jlong commandBuffer, jlong layout, jint stageFlags, jint offset, jint size, jlong pValues);
typedef void (*PFN_vkCmdBeginRenderPass)(jlong commandBuffer, jlong pRenderPassBegin, jint contents);
typedef void (*PFN_vkCmdNextSubpass)(jlong commandBuffer, jint contents);
typedef void (*PFN_vkCmdEndRenderPass)(jlong commandBuffer);
typedef void (*PFN_vkCmdExecuteCommands)(jlong commandBuffer, jint commandBufferCount, jlong pCommandBuffers);
typedef jint (*PFN_vkEnumerateInstanceVersion)(jlong pApiVersion);
typedef jint (*PFN_vkBindBufferMemory2)(jlong device, jint bindInfoCount, jlong pBindInfos);
typedef jint (*PFN_vkBindImageMemory2)(jlong device, jint bindInfoCount, jlong pBindInfos);
typedef void (*PFN_vkGetDeviceGroupPeerMemoryFeatures)(jlong device, jint heapIndex, jint localDeviceIndex, jint remoteDeviceIndex, jlong pPeerMemoryFeatures);
typedef void (*PFN_vkCmdSetDeviceMask)(jlong commandBuffer, jint deviceMask);
typedef void (*PFN_vkCmdDispatchBase)(jlong commandBuffer, jint baseGroupX, jint baseGroupY, jint baseGroupZ, jint groupCountX, jint groupCountY, jint groupCountZ);
typedef jint (*PFN_vkEnumeratePhysicalDeviceGroups)(jlong instance, jlong pPhysicalDeviceGroupCount, jlong pPhysicalDeviceGroupProperties);
typedef void (*PFN_vkGetImageMemoryRequirements2)(jlong device, jlong pInfo, jlong pMemoryRequirements);
typedef void (*PFN_vkGetBufferMemoryRequirements2)(jlong device, jlong pInfo, jlong pMemoryRequirements);
typedef void (*PFN_vkGetImageSparseMemoryRequirements2)(jlong device, jlong pInfo, jlong pSparseMemoryRequirementCount, jlong pSparseMemoryRequirements);
typedef void (*PFN_vkGetPhysicalDeviceFeatures2)(jlong physicalDevice, jlong pFeatures);
typedef void (*PFN_vkGetPhysicalDeviceProperties2)(jlong physicalDevice, jlong pProperties);
typedef void (*PFN_vkGetPhysicalDeviceFormatProperties2)(jlong physicalDevice, jint format, jlong pFormatProperties);
typedef jint (*PFN_vkGetPhysicalDeviceImageFormatProperties2)(jlong physicalDevice, jlong pImageFormatInfo, jlong pImageFormatProperties);
typedef void (*PFN_vkGetPhysicalDeviceQueueFamilyProperties2)(jlong physicalDevice, jlong pQueueFamilyPropertyCount, jlong pQueueFamilyProperties);
typedef void (*PFN_vkGetPhysicalDeviceMemoryProperties2)(jlong physicalDevice, jlong pMemoryProperties);
typedef void (*PFN_vkGetPhysicalDeviceSparseImageFormatProperties2)(jlong physicalDevice, jlong pFormatInfo, jlong pPropertyCount, jlong pProperties);
typedef void (*PFN_vkTrimCommandPool)(jlong device, jlong commandPool, jint flags);
typedef void (*PFN_vkGetDeviceQueue2)(jlong device, jlong pQueueInfo, jlong pQueue);
typedef jint (*PFN_vkCreateSamplerYcbcrConversion)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pYcbcrConversion);
typedef void (*PFN_vkDestroySamplerYcbcrConversion)(jlong device, jlong ycbcrConversion, jlong pAllocator);
typedef jint (*PFN_vkCreateDescriptorUpdateTemplate)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pDescriptorUpdateTemplate);
typedef void (*PFN_vkDestroyDescriptorUpdateTemplate)(jlong device, jlong descriptorUpdateTemplate, jlong pAllocator);
typedef void (*PFN_vkUpdateDescriptorSetWithTemplate)(jlong device, jlong descriptorSet, jlong descriptorUpdateTemplate, jlong pData);
typedef void (*PFN_vkGetPhysicalDeviceExternalBufferProperties)(jlong physicalDevice, jlong pExternalBufferInfo, jlong pExternalBufferProperties);
typedef void (*PFN_vkGetPhysicalDeviceExternalFenceProperties)(jlong physicalDevice, jlong pExternalFenceInfo, jlong pExternalFenceProperties);
typedef void (*PFN_vkGetPhysicalDeviceExternalSemaphoreProperties)(jlong physicalDevice, jlong pExternalSemaphoreInfo, jlong pExternalSemaphoreProperties);
typedef void (*PFN_vkGetDescriptorSetLayoutSupport)(jlong device, jlong pCreateInfo, jlong pSupport);
typedef void (*PFN_vkCmdDrawIndirectCount)(jlong commandBuffer, jlong buffer, jlong offset, jlong countBuffer, jlong countBufferOffset, jint maxDrawCount, jint stride);
typedef void (*PFN_vkCmdDrawIndexedIndirectCount)(jlong commandBuffer, jlong buffer, jlong offset, jlong countBuffer, jlong countBufferOffset, jint maxDrawCount, jint stride);
typedef jint (*PFN_vkCreateRenderPass2)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pRenderPass);
typedef void (*PFN_vkCmdBeginRenderPass2)(jlong commandBuffer, jlong pRenderPassBegin, jlong pSubpassBeginInfo);
typedef void (*PFN_vkCmdNextSubpass2)(jlong commandBuffer, jlong pSubpassBeginInfo, jlong pSubpassEndInfo);
typedef void (*PFN_vkCmdEndRenderPass2)(jlong commandBuffer, jlong pSubpassEndInfo);
typedef void (*PFN_vkResetQueryPool)(jlong device, jlong queryPool, jint firstQuery, jint queryCount);
typedef jint (*PFN_vkGetSemaphoreCounterValue)(jlong device, jlong semaphore, jlong pValue);
typedef jint (*PFN_vkWaitSemaphores)(jlong device, jlong pWaitInfo, jlong timeout);
typedef jint (*PFN_vkSignalSemaphore)(jlong device, jlong pSignalInfo);
typedef jlong (*PFN_vkGetBufferDeviceAddress)(jlong device, jlong pInfo);
typedef jlong (*PFN_vkGetBufferOpaqueCaptureAddress)(jlong device, jlong pInfo);
typedef jlong (*PFN_vkGetDeviceMemoryOpaqueCaptureAddress)(jlong device, jlong pInfo);
typedef void (*PFN_vkDestroySurfaceKHR)(jlong instance, jlong surface, jlong pAllocator);
typedef jint (*PFN_vkGetPhysicalDeviceSurfaceSupportKHR)(jlong physicalDevice, jint queueFamilyIndex, jlong surface, jlong pSupported);
typedef jint (*PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR)(jlong physicalDevice, jlong surface, jlong pSurfaceCapabilities);
typedef jint (*PFN_vkGetPhysicalDeviceSurfaceFormatsKHR)(jlong physicalDevice, jlong surface, jlong pSurfaceFormatCount, jlong pSurfaceFormats);
typedef jint (*PFN_vkGetPhysicalDeviceSurfacePresentModesKHR)(jlong physicalDevice, jlong surface, jlong pPresentModeCount, jlong pPresentModes);
typedef jint (*PFN_vkCreateSwapchainKHR)(jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSwapchain);
typedef void (*PFN_vkDestroySwapchainKHR)(jlong device, jlong swapchain, jlong pAllocator);
typedef jint (*PFN_vkGetSwapchainImagesKHR)(jlong device, jlong swapchain, jlong pSwapchainImageCount, jlong pSwapchainImages);
typedef jint (*PFN_vkAcquireNextImageKHR)(jlong device, jlong swapchain, jlong timeout, jlong semaphore, jlong fence, jlong pImageIndex);
typedef jint (*PFN_vkQueuePresentKHR)(jlong queue, jlong pPresentInfo);
typedef jint (*PFN_vkGetDeviceGroupPresentCapabilitiesKHR)(jlong device, jlong pDeviceGroupPresentCapabilities);
typedef jint (*PFN_vkGetDeviceGroupSurfacePresentModesKHR)(jlong device, jlong surface, jlong pModes);
typedef jint (*PFN_vkGetPhysicalDevicePresentRectanglesKHR)(jlong physicalDevice, jlong surface, jlong pRectCount, jlong pRects);
typedef jint (*PFN_vkAcquireNextImage2KHR)(jlong device, jlong pAcquireInfo, jlong pImageIndex);
typedef jint (*PFN_vkGetPhysicalDeviceDisplayPropertiesKHR)(jlong physicalDevice, jlong pPropertyCount, jlong pProperties);
typedef jint (*PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR)(jlong physicalDevice, jlong pPropertyCount, jlong pProperties);
typedef jint (*PFN_vkGetDisplayPlaneSupportedDisplaysKHR)(jlong physicalDevice, jint planeIndex, jlong pDisplayCount, jlong pDisplays);
typedef jint (*PFN_vkGetDisplayModePropertiesKHR)(jlong physicalDevice, jlong display, jlong pPropertyCount, jlong pProperties);
typedef jint (*PFN_vkCreateDisplayModeKHR)(jlong physicalDevice, jlong display, jlong pCreateInfo, jlong pAllocator, jlong pMode);
typedef jint (*PFN_vkGetDisplayPlaneCapabilitiesKHR)(jlong physicalDevice, jlong mode, jint planeIndex, jlong pCapabilities);
typedef jint (*PFN_vkCreateDisplayPlaneSurfaceKHR)(jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface);
typedef jint (*PFN_vkCreateWin32SurfaceKHR)(jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface);
typedef jint (*PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR)(jlong physicalDevice, jint queueFamilyIndex);
typedef jint (*PFN_vkSetDebugUtilsObjectNameEXT)(jlong device, jlong pNameInfo);
typedef jint (*PFN_vkSetDebugUtilsObjectTagEXT)(jlong device, jlong pTagInfo);
typedef void (*PFN_vkQueueBeginDebugUtilsLabelEXT)(jlong queue, jlong pLabelInfo);
typedef void (*PFN_vkQueueEndDebugUtilsLabelEXT)(jlong queue);
typedef void (*PFN_vkQueueInsertDebugUtilsLabelEXT)(jlong queue, jlong pLabelInfo);
typedef void (*PFN_vkCmdBeginDebugUtilsLabelEXT)(jlong commandBuffer, jlong pLabelInfo);
typedef void (*PFN_vkCmdEndDebugUtilsLabelEXT)(jlong commandBuffer);
typedef void (*PFN_vkCmdInsertDebugUtilsLabelEXT)(jlong commandBuffer, jlong pLabelInfo);
typedef jint (*PFN_vkCreateDebugUtilsMessengerEXT)(jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pMessenger);
typedef void (*PFN_vkDestroyDebugUtilsMessengerEXT)(jlong instance, jlong messenger, jlong pAllocator);
typedef void (*PFN_vkSubmitDebugUtilsMessageEXT)(jlong instance, jint messageSeverity, jint messageTypes, jlong pCallbackData);



// Initialisation



#ifdef WIN32
	#include <windef.h>
	#include <winbase.h>
#else
	#include <dlfcn.h>
#endif



PFN_vkGetInstanceProcAddr getInstanceProcAddr;



int load() {
#ifdef WIN32
	HMODULE module = LoadLibrary("vulkan-1.dll");
	getInstanceProcAddr = (PFN_vkGetInstanceProcAddr) GetProcAddress(module, "vkGetInstanceProcAddr");
#elif defined(__APPLE__)
	void* module = dlopen("libMoltenVK.dylib", RTLD_NOW | RTLD_LOCAL);
	getInstanceProcAddr = (PFN_vkGetInstanceProcAddr) dlsym(module, "vkGetInstanceProcAddr");
#else
	void* module = dlopen("libvulkan.so", RTLD_NOW | RTLD_LOCAL);
	getInstanceProcAddr = (PFN_vkGetInstanceProcAddr) dlsym(module, "vkGetInstanceProcAddr");
#endif
	
	return getInstanceProcAddr != NULL;
}



JNIEXPORT jboolean JNICALL Java_kvb_vulkan_Commands_loadVulkan(JNIEnv* env, jobject obj) {
	return (jboolean) load();
}



JNIEXPORT jlong JNICALL Java_kvb_vulkan_Commands_getInstanceProcAddr(JNIEnv* env, jobject obj, jlong instance, jlong pName) {
	return (jlong) getInstanceProcAddr(instance, pName);
}



// JNI commands



JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createInstance(JNIEnv* env, jobject obj, jlong address, jlong pCreateInfo, jlong pAllocator, jlong pInstance) {
	return (jint) ((PFN_vkCreateInstance) address) (pCreateInfo, pAllocator, pInstance);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyInstance(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pAllocator) {
	((PFN_vkDestroyInstance) address) (instance, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_enumeratePhysicalDevices(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pPhysicalDeviceCount, jlong pPhysicalDevices) {
	return (jint) ((PFN_vkEnumeratePhysicalDevices) address) (instance, pPhysicalDeviceCount, pPhysicalDevices);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getPhysicalDeviceFeatures(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pFeatures) {
	((PFN_vkGetPhysicalDeviceFeatures) address) (physicalDevice, pFeatures);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getPhysicalDeviceFormatProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint format, jlong pFormatProperties) {
	((PFN_vkGetPhysicalDeviceFormatProperties) address) (physicalDevice, format, pFormatProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getPhysicalDeviceImageFormatProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jlong pImageFormatProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceImageFormatProperties) address) (physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getPhysicalDeviceProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pProperties) {
	((PFN_vkGetPhysicalDeviceProperties) address) (physicalDevice, pProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getPhysicalDeviceQueueFamilyProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pQueueFamilyPropertyCount, jlong pQueueFamilyProperties) {
	((PFN_vkGetPhysicalDeviceQueueFamilyProperties) address) (physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getPhysicalDeviceMemoryProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pMemoryProperties) {
	((PFN_vkGetPhysicalDeviceMemoryProperties) address) (physicalDevice, pMemoryProperties);
}

JNIEXPORT jlong JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getDeviceProcAddr(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pName) {
	return (jlong) ((PFN_vkGetDeviceProcAddr) address) (device, pName);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createDevice(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pCreateInfo, jlong pAllocator, jlong pDevice) {
	return (jint) ((PFN_vkCreateDevice) address) (physicalDevice, pCreateInfo, pAllocator, pDevice);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyDevice(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAllocator) {
	((PFN_vkDestroyDevice) address) (device, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_enumerateInstanceExtensionProperties(JNIEnv* env, jobject obj, jlong address, jlong pLayerName, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkEnumerateInstanceExtensionProperties) address) (pLayerName, pPropertyCount, pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_enumerateDeviceExtensionProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pLayerName, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkEnumerateDeviceExtensionProperties) address) (physicalDevice, pLayerName, pPropertyCount, pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_enumerateInstanceLayerProperties(JNIEnv* env, jobject obj, jlong address, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkEnumerateInstanceLayerProperties) address) (pPropertyCount, pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_enumerateDeviceLayerProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkEnumerateDeviceLayerProperties) address) (physicalDevice, pPropertyCount, pProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getDeviceQueue(JNIEnv* env, jobject obj, jlong address, jlong device, jint queueFamilyIndex, jint queueIndex, jlong pQueue) {
	((PFN_vkGetDeviceQueue) address) (device, queueFamilyIndex, queueIndex, pQueue);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_queueSubmit(JNIEnv* env, jobject obj, jlong address, jlong queue, jint submitCount, jlong pSubmits, jlong fence) {
	return (jint) ((PFN_vkQueueSubmit) address) (queue, submitCount, pSubmits, fence);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_queueWaitIdle(JNIEnv* env, jobject obj, jlong address, jlong queue) {
	return (jint) ((PFN_vkQueueWaitIdle) address) (queue);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_deviceWaitIdle(JNIEnv* env, jobject obj, jlong address, jlong device) {
	return (jint) ((PFN_vkDeviceWaitIdle) address) (device);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_allocateMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAllocateInfo, jlong pAllocator, jlong pMemory) {
	return (jint) ((PFN_vkAllocateMemory) address) (device, pAllocateInfo, pAllocator, pMemory);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_freeMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong memory, jlong pAllocator) {
	((PFN_vkFreeMemory) address) (device, memory, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_mapMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong memory, jlong offset, jlong size, jint flags, jlong ppData) {
	return (jint) ((PFN_vkMapMemory) address) (device, memory, offset, size, flags, ppData);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_unmapMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong memory) {
	((PFN_vkUnmapMemory) address) (device, memory);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_flushMappedMemoryRanges(JNIEnv* env, jobject obj, jlong address, jlong device, jint memoryRangeCount, jlong pMemoryRanges) {
	return (jint) ((PFN_vkFlushMappedMemoryRanges) address) (device, memoryRangeCount, pMemoryRanges);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_invalidateMappedMemoryRanges(JNIEnv* env, jobject obj, jlong address, jlong device, jint memoryRangeCount, jlong pMemoryRanges) {
	return (jint) ((PFN_vkInvalidateMappedMemoryRanges) address) (device, memoryRangeCount, pMemoryRanges);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getDeviceMemoryCommitment(JNIEnv* env, jobject obj, jlong address, jlong device, jlong memory, jlong pCommittedMemoryInBytes) {
	((PFN_vkGetDeviceMemoryCommitment) address) (device, memory, pCommittedMemoryInBytes);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_bindBufferMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong buffer, jlong memory, jlong memoryOffset) {
	return (jint) ((PFN_vkBindBufferMemory) address) (device, buffer, memory, memoryOffset);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_bindImageMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong image, jlong memory, jlong memoryOffset) {
	return (jint) ((PFN_vkBindImageMemory) address) (device, image, memory, memoryOffset);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getBufferMemoryRequirements(JNIEnv* env, jobject obj, jlong address, jlong device, jlong buffer, jlong pMemoryRequirements) {
	((PFN_vkGetBufferMemoryRequirements) address) (device, buffer, pMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getImageMemoryRequirements(JNIEnv* env, jobject obj, jlong address, jlong device, jlong image, jlong pMemoryRequirements) {
	((PFN_vkGetImageMemoryRequirements) address) (device, image, pMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getImageSparseMemoryRequirements(JNIEnv* env, jobject obj, jlong address, jlong device, jlong image, jlong pSparseMemoryRequirementCount, jlong pSparseMemoryRequirements) {
	((PFN_vkGetImageSparseMemoryRequirements) address) (device, image, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getPhysicalDeviceSparseImageFormatProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint format, jint type, jint samples, jint usage, jint tiling, jlong pPropertyCount, jlong pProperties) {
	((PFN_vkGetPhysicalDeviceSparseImageFormatProperties) address) (physicalDevice, format, type, samples, usage, tiling, pPropertyCount, pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_queueBindSparse(JNIEnv* env, jobject obj, jlong address, jlong queue, jint bindInfoCount, jlong pBindInfo, jlong fence) {
	return (jint) ((PFN_vkQueueBindSparse) address) (queue, bindInfoCount, pBindInfo, fence);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createFence(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pFence) {
	return (jint) ((PFN_vkCreateFence) address) (device, pCreateInfo, pAllocator, pFence);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyFence(JNIEnv* env, jobject obj, jlong address, jlong device, jlong fence, jlong pAllocator) {
	((PFN_vkDestroyFence) address) (device, fence, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_resetFences(JNIEnv* env, jobject obj, jlong address, jlong device, jint fenceCount, jlong pFences) {
	return (jint) ((PFN_vkResetFences) address) (device, fenceCount, pFences);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getFenceStatus(JNIEnv* env, jobject obj, jlong address, jlong device, jlong fence) {
	return (jint) ((PFN_vkGetFenceStatus) address) (device, fence);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_waitForFences(JNIEnv* env, jobject obj, jlong address, jlong device, jint fenceCount, jlong pFences, jint waitAll, jlong timeout) {
	return (jint) ((PFN_vkWaitForFences) address) (device, fenceCount, pFences, waitAll, timeout);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createSemaphore(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSemaphore) {
	return (jint) ((PFN_vkCreateSemaphore) address) (device, pCreateInfo, pAllocator, pSemaphore);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroySemaphore(JNIEnv* env, jobject obj, jlong address, jlong device, jlong semaphore, jlong pAllocator) {
	((PFN_vkDestroySemaphore) address) (device, semaphore, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createEvent(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pEvent) {
	return (jint) ((PFN_vkCreateEvent) address) (device, pCreateInfo, pAllocator, pEvent);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyEvent(JNIEnv* env, jobject obj, jlong address, jlong device, jlong event, jlong pAllocator) {
	((PFN_vkDestroyEvent) address) (device, event, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getEventStatus(JNIEnv* env, jobject obj, jlong address, jlong device, jlong event) {
	return (jint) ((PFN_vkGetEventStatus) address) (device, event);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_setEvent(JNIEnv* env, jobject obj, jlong address, jlong device, jlong event) {
	return (jint) ((PFN_vkSetEvent) address) (device, event);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_resetEvent(JNIEnv* env, jobject obj, jlong address, jlong device, jlong event) {
	return (jint) ((PFN_vkResetEvent) address) (device, event);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createQueryPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pQueryPool) {
	return (jint) ((PFN_vkCreateQueryPool) address) (device, pCreateInfo, pAllocator, pQueryPool);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyQueryPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong queryPool, jlong pAllocator) {
	((PFN_vkDestroyQueryPool) address) (device, queryPool, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getQueryPoolResults(JNIEnv* env, jobject obj, jlong address, jlong device, jlong queryPool, jint firstQuery, jint queryCount, jlong dataSize, jlong pData, jlong stride, jint flags) {
	return (jint) ((PFN_vkGetQueryPoolResults) address) (device, queryPool, firstQuery, queryCount, dataSize, pData, stride, flags);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createBuffer(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pBuffer) {
	return (jint) ((PFN_vkCreateBuffer) address) (device, pCreateInfo, pAllocator, pBuffer);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyBuffer(JNIEnv* env, jobject obj, jlong address, jlong device, jlong buffer, jlong pAllocator) {
	((PFN_vkDestroyBuffer) address) (device, buffer, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createBufferView(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pView) {
	return (jint) ((PFN_vkCreateBufferView) address) (device, pCreateInfo, pAllocator, pView);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyBufferView(JNIEnv* env, jobject obj, jlong address, jlong device, jlong bufferView, jlong pAllocator) {
	((PFN_vkDestroyBufferView) address) (device, bufferView, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createImage(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pImage) {
	return (jint) ((PFN_vkCreateImage) address) (device, pCreateInfo, pAllocator, pImage);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyImage(JNIEnv* env, jobject obj, jlong address, jlong device, jlong image, jlong pAllocator) {
	((PFN_vkDestroyImage) address) (device, image, pAllocator);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getImageSubresourceLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong image, jlong pSubresource, jlong pLayout) {
	((PFN_vkGetImageSubresourceLayout) address) (device, image, pSubresource, pLayout);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createImageView(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pView) {
	return (jint) ((PFN_vkCreateImageView) address) (device, pCreateInfo, pAllocator, pView);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyImageView(JNIEnv* env, jobject obj, jlong address, jlong device, jlong imageView, jlong pAllocator) {
	((PFN_vkDestroyImageView) address) (device, imageView, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createShaderModule(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pShaderModule) {
	return (jint) ((PFN_vkCreateShaderModule) address) (device, pCreateInfo, pAllocator, pShaderModule);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyShaderModule(JNIEnv* env, jobject obj, jlong address, jlong device, jlong shaderModule, jlong pAllocator) {
	((PFN_vkDestroyShaderModule) address) (device, shaderModule, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createPipelineCache(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pPipelineCache) {
	return (jint) ((PFN_vkCreatePipelineCache) address) (device, pCreateInfo, pAllocator, pPipelineCache);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyPipelineCache(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipelineCache, jlong pAllocator) {
	((PFN_vkDestroyPipelineCache) address) (device, pipelineCache, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getPipelineCacheData(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipelineCache, jlong pDataSize, jlong pData) {
	return (jint) ((PFN_vkGetPipelineCacheData) address) (device, pipelineCache, pDataSize, pData);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_mergePipelineCaches(JNIEnv* env, jobject obj, jlong address, jlong device, jlong dstCache, jint srcCacheCount, jlong pSrcCaches) {
	return (jint) ((PFN_vkMergePipelineCaches) address) (device, dstCache, srcCacheCount, pSrcCaches);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createGraphicsPipelines(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipelineCache, jint createInfoCount, jlong pCreateInfos, jlong pAllocator, jlong pPipelines) {
	return (jint) ((PFN_vkCreateGraphicsPipelines) address) (device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createComputePipelines(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipelineCache, jint createInfoCount, jlong pCreateInfos, jlong pAllocator, jlong pPipelines) {
	return (jint) ((PFN_vkCreateComputePipelines) address) (device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyPipeline(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipeline, jlong pAllocator) {
	((PFN_vkDestroyPipeline) address) (device, pipeline, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createPipelineLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pPipelineLayout) {
	return (jint) ((PFN_vkCreatePipelineLayout) address) (device, pCreateInfo, pAllocator, pPipelineLayout);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyPipelineLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipelineLayout, jlong pAllocator) {
	((PFN_vkDestroyPipelineLayout) address) (device, pipelineLayout, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createSampler(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSampler) {
	return (jint) ((PFN_vkCreateSampler) address) (device, pCreateInfo, pAllocator, pSampler);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroySampler(JNIEnv* env, jobject obj, jlong address, jlong device, jlong sampler, jlong pAllocator) {
	((PFN_vkDestroySampler) address) (device, sampler, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createDescriptorSetLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSetLayout) {
	return (jint) ((PFN_vkCreateDescriptorSetLayout) address) (device, pCreateInfo, pAllocator, pSetLayout);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyDescriptorSetLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorSetLayout, jlong pAllocator) {
	((PFN_vkDestroyDescriptorSetLayout) address) (device, descriptorSetLayout, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createDescriptorPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pDescriptorPool) {
	return (jint) ((PFN_vkCreateDescriptorPool) address) (device, pCreateInfo, pAllocator, pDescriptorPool);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyDescriptorPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorPool, jlong pAllocator) {
	((PFN_vkDestroyDescriptorPool) address) (device, descriptorPool, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_resetDescriptorPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorPool, jint flags) {
	return (jint) ((PFN_vkResetDescriptorPool) address) (device, descriptorPool, flags);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_allocateDescriptorSets(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAllocateInfo, jlong pDescriptorSets) {
	return (jint) ((PFN_vkAllocateDescriptorSets) address) (device, pAllocateInfo, pDescriptorSets);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_freeDescriptorSets(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorPool, jint descriptorSetCount, jlong pDescriptorSets) {
	return (jint) ((PFN_vkFreeDescriptorSets) address) (device, descriptorPool, descriptorSetCount, pDescriptorSets);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_updateDescriptorSets(JNIEnv* env, jobject obj, jlong address, jlong device, jint descriptorWriteCount, jlong pDescriptorWrites, jint descriptorCopyCount, jlong pDescriptorCopies) {
	((PFN_vkUpdateDescriptorSets) address) (device, descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createFramebuffer(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pFramebuffer) {
	return (jint) ((PFN_vkCreateFramebuffer) address) (device, pCreateInfo, pAllocator, pFramebuffer);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyFramebuffer(JNIEnv* env, jobject obj, jlong address, jlong device, jlong framebuffer, jlong pAllocator) {
	((PFN_vkDestroyFramebuffer) address) (device, framebuffer, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createRenderPass(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pRenderPass) {
	return (jint) ((PFN_vkCreateRenderPass) address) (device, pCreateInfo, pAllocator, pRenderPass);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyRenderPass(JNIEnv* env, jobject obj, jlong address, jlong device, jlong renderPass, jlong pAllocator) {
	((PFN_vkDestroyRenderPass) address) (device, renderPass, pAllocator);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_getRenderAreaGranularity(JNIEnv* env, jobject obj, jlong address, jlong device, jlong renderPass, jlong pGranularity) {
	((PFN_vkGetRenderAreaGranularity) address) (device, renderPass, pGranularity);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_createCommandPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pCommandPool) {
	return (jint) ((PFN_vkCreateCommandPool) address) (device, pCreateInfo, pAllocator, pCommandPool);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_destroyCommandPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong commandPool, jlong pAllocator) {
	((PFN_vkDestroyCommandPool) address) (device, commandPool, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_resetCommandPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong commandPool, jint flags) {
	return (jint) ((PFN_vkResetCommandPool) address) (device, commandPool, flags);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_allocateCommandBuffers(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAllocateInfo, jlong pCommandBuffers) {
	return (jint) ((PFN_vkAllocateCommandBuffers) address) (device, pAllocateInfo, pCommandBuffers);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_freeCommandBuffers(JNIEnv* env, jobject obj, jlong address, jlong device, jlong commandPool, jint commandBufferCount, jlong pCommandBuffers) {
	((PFN_vkFreeCommandBuffers) address) (device, commandPool, commandBufferCount, pCommandBuffers);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_beginCommandBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pBeginInfo) {
	return (jint) ((PFN_vkBeginCommandBuffer) address) (commandBuffer, pBeginInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_endCommandBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer) {
	return (jint) ((PFN_vkEndCommandBuffer) address) (commandBuffer);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_resetCommandBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint flags) {
	return (jint) ((PFN_vkResetCommandBuffer) address) (commandBuffer, flags);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdBindPipeline(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint pipelineBindPoint, jlong pipeline) {
	((PFN_vkCmdBindPipeline) address) (commandBuffer, pipelineBindPoint, pipeline);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdSetViewport(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstViewport, jint viewportCount, jlong pViewports) {
	((PFN_vkCmdSetViewport) address) (commandBuffer, firstViewport, viewportCount, pViewports);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdSetScissor(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstScissor, jint scissorCount, jlong pScissors) {
	((PFN_vkCmdSetScissor) address) (commandBuffer, firstScissor, scissorCount, pScissors);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdSetLineWidth(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jfloat lineWidth) {
	((PFN_vkCmdSetLineWidth) address) (commandBuffer, lineWidth);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdSetDepthBias(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jfloat depthBiasConstantFactor, jfloat depthBiasClamp, jfloat depthBiasSlopeFactor) {
	((PFN_vkCmdSetDepthBias) address) (commandBuffer, depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdSetBlendConstants(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong blendConstants) {
	((PFN_vkCmdSetBlendConstants) address) (commandBuffer, blendConstants);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdSetDepthBounds(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jfloat minDepthBounds, jfloat maxDepthBounds) {
	((PFN_vkCmdSetDepthBounds) address) (commandBuffer, minDepthBounds, maxDepthBounds);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdSetStencilCompareMask(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint faceMask, jint compareMask) {
	((PFN_vkCmdSetStencilCompareMask) address) (commandBuffer, faceMask, compareMask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdSetStencilWriteMask(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint faceMask, jint writeMask) {
	((PFN_vkCmdSetStencilWriteMask) address) (commandBuffer, faceMask, writeMask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdSetStencilReference(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint faceMask, jint reference) {
	((PFN_vkCmdSetStencilReference) address) (commandBuffer, faceMask, reference);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdBindDescriptorSets(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint pipelineBindPoint, jlong layout, jint firstSet, jint descriptorSetCount, jlong pDescriptorSets, jint dynamicOffsetCount, jlong pDynamicOffsets) {
	((PFN_vkCmdBindDescriptorSets) address) (commandBuffer, pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdBindIndexBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jint indexType) {
	((PFN_vkCmdBindIndexBuffer) address) (commandBuffer, buffer, offset, indexType);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdBindVertexBuffers(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstBinding, jint bindingCount, jlong pBuffers, jlong pOffsets) {
	((PFN_vkCmdBindVertexBuffers) address) (commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdDraw(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint vertexCount, jint instanceCount, jint firstVertex, jint firstInstance) {
	((PFN_vkCmdDraw) address) (commandBuffer, vertexCount, instanceCount, firstVertex, firstInstance);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdDrawIndexed(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint indexCount, jint instanceCount, jint firstIndex, jint vertexOffset, jint firstInstance) {
	((PFN_vkCmdDrawIndexed) address) (commandBuffer, indexCount, instanceCount, firstIndex, vertexOffset, firstInstance);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdDrawIndirect(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jint drawCount, jint stride) {
	((PFN_vkCmdDrawIndirect) address) (commandBuffer, buffer, offset, drawCount, stride);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdDrawIndexedIndirect(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jint drawCount, jint stride) {
	((PFN_vkCmdDrawIndexedIndirect) address) (commandBuffer, buffer, offset, drawCount, stride);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdDispatch(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint groupCountX, jint groupCountY, jint groupCountZ) {
	((PFN_vkCmdDispatch) address) (commandBuffer, groupCountX, groupCountY, groupCountZ);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdDispatchIndirect(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset) {
	((PFN_vkCmdDispatchIndirect) address) (commandBuffer, buffer, offset);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdCopyBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcBuffer, jlong dstBuffer, jint regionCount, jlong pRegions) {
	((PFN_vkCmdCopyBuffer) address) (commandBuffer, srcBuffer, dstBuffer, regionCount, pRegions);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdCopyImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions) {
	((PFN_vkCmdCopyImage) address) (commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdBlitImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions, jint filter) {
	((PFN_vkCmdBlitImage) address) (commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdCopyBufferToImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcBuffer, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions) {
	((PFN_vkCmdCopyBufferToImage) address) (commandBuffer, srcBuffer, dstImage, dstImageLayout, regionCount, pRegions);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdCopyImageToBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstBuffer, jint regionCount, jlong pRegions) {
	((PFN_vkCmdCopyImageToBuffer) address) (commandBuffer, srcImage, srcImageLayout, dstBuffer, regionCount, pRegions);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdUpdateBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong dstBuffer, jlong dstOffset, jlong dataSize, jlong pData) {
	((PFN_vkCmdUpdateBuffer) address) (commandBuffer, dstBuffer, dstOffset, dataSize, pData);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdFillBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong dstBuffer, jlong dstOffset, jlong size, jint data) {
	((PFN_vkCmdFillBuffer) address) (commandBuffer, dstBuffer, dstOffset, size, data);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdClearColorImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong image, jint imageLayout, jlong pColor, jint rangeCount, jlong pRanges) {
	((PFN_vkCmdClearColorImage) address) (commandBuffer, image, imageLayout, pColor, rangeCount, pRanges);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdClearDepthStencilImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong image, jint imageLayout, jlong pDepthStencil, jint rangeCount, jlong pRanges) {
	((PFN_vkCmdClearDepthStencilImage) address) (commandBuffer, image, imageLayout, pDepthStencil, rangeCount, pRanges);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdClearAttachments(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint attachmentCount, jlong pAttachments, jint rectCount, jlong pRects) {
	((PFN_vkCmdClearAttachments) address) (commandBuffer, attachmentCount, pAttachments, rectCount, pRects);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdResolveImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions) {
	((PFN_vkCmdResolveImage) address) (commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdSetEvent(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong event, jint stageMask) {
	((PFN_vkCmdSetEvent) address) (commandBuffer, event, stageMask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdResetEvent(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong event, jint stageMask) {
	((PFN_vkCmdResetEvent) address) (commandBuffer, event, stageMask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdWaitEvents(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint eventCount, jlong pEvents, jint srcStageMask, jint dstStageMask, jint memoryBarrierCount, jlong pMemoryBarriers, jint bufferMemoryBarrierCount, jlong pBufferMemoryBarriers, jint imageMemoryBarrierCount, jlong pImageMemoryBarriers) {
	((PFN_vkCmdWaitEvents) address) (commandBuffer, eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdPipelineBarrier(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint srcStageMask, jint dstStageMask, jint dependencyFlags, jint memoryBarrierCount, jlong pMemoryBarriers, jint bufferMemoryBarrierCount, jlong pBufferMemoryBarriers, jint imageMemoryBarrierCount, jlong pImageMemoryBarriers) {
	((PFN_vkCmdPipelineBarrier) address) (commandBuffer, srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdBeginQuery(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong queryPool, jint query, jint flags) {
	((PFN_vkCmdBeginQuery) address) (commandBuffer, queryPool, query, flags);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdEndQuery(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong queryPool, jint query) {
	((PFN_vkCmdEndQuery) address) (commandBuffer, queryPool, query);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdResetQueryPool(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong queryPool, jint firstQuery, jint queryCount) {
	((PFN_vkCmdResetQueryPool) address) (commandBuffer, queryPool, firstQuery, queryCount);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdWriteTimestamp(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint pipelineStage, jlong queryPool, jint query) {
	((PFN_vkCmdWriteTimestamp) address) (commandBuffer, pipelineStage, queryPool, query);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdCopyQueryPoolResults(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong queryPool, jint firstQuery, jint queryCount, jlong dstBuffer, jlong dstOffset, jlong stride, jint flags) {
	((PFN_vkCmdCopyQueryPoolResults) address) (commandBuffer, queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdPushConstants(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong layout, jint stageFlags, jint offset, jint size, jlong pValues) {
	((PFN_vkCmdPushConstants) address) (commandBuffer, layout, stageFlags, offset, size, pValues);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdBeginRenderPass(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pRenderPassBegin, jint contents) {
	((PFN_vkCmdBeginRenderPass) address) (commandBuffer, pRenderPassBegin, contents);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdNextSubpass(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint contents) {
	((PFN_vkCmdNextSubpass) address) (commandBuffer, contents);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdEndRenderPass(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer) {
	((PFN_vkCmdEndRenderPass) address) (commandBuffer);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_10Kt_cmdExecuteCommands(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint commandBufferCount, jlong pCommandBuffers) {
	((PFN_vkCmdExecuteCommands) address) (commandBuffer, commandBufferCount, pCommandBuffers);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_enumerateInstanceVersion(JNIEnv* env, jobject obj, jlong address, jlong pApiVersion) {
	return (jint) ((PFN_vkEnumerateInstanceVersion) address) (pApiVersion);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_bindBufferMemory2(JNIEnv* env, jobject obj, jlong address, jlong device, jint bindInfoCount, jlong pBindInfos) {
	return (jint) ((PFN_vkBindBufferMemory2) address) (device, bindInfoCount, pBindInfos);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_bindImageMemory2(JNIEnv* env, jobject obj, jlong address, jlong device, jint bindInfoCount, jlong pBindInfos) {
	return (jint) ((PFN_vkBindImageMemory2) address) (device, bindInfoCount, pBindInfos);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getDeviceGroupPeerMemoryFeatures(JNIEnv* env, jobject obj, jlong address, jlong device, jint heapIndex, jint localDeviceIndex, jint remoteDeviceIndex, jlong pPeerMemoryFeatures) {
	((PFN_vkGetDeviceGroupPeerMemoryFeatures) address) (device, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_cmdSetDeviceMask(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint deviceMask) {
	((PFN_vkCmdSetDeviceMask) address) (commandBuffer, deviceMask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_cmdDispatchBase(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint baseGroupX, jint baseGroupY, jint baseGroupZ, jint groupCountX, jint groupCountY, jint groupCountZ) {
	((PFN_vkCmdDispatchBase) address) (commandBuffer, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_enumeratePhysicalDeviceGroups(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pPhysicalDeviceGroupCount, jlong pPhysicalDeviceGroupProperties) {
	return (jint) ((PFN_vkEnumeratePhysicalDeviceGroups) address) (instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getImageMemoryRequirements2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo, jlong pMemoryRequirements) {
	((PFN_vkGetImageMemoryRequirements2) address) (device, pInfo, pMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getBufferMemoryRequirements2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo, jlong pMemoryRequirements) {
	((PFN_vkGetBufferMemoryRequirements2) address) (device, pInfo, pMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getImageSparseMemoryRequirements2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo, jlong pSparseMemoryRequirementCount, jlong pSparseMemoryRequirements) {
	((PFN_vkGetImageSparseMemoryRequirements2) address) (device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getPhysicalDeviceFeatures2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pFeatures) {
	((PFN_vkGetPhysicalDeviceFeatures2) address) (physicalDevice, pFeatures);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getPhysicalDeviceProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pProperties) {
	((PFN_vkGetPhysicalDeviceProperties2) address) (physicalDevice, pProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getPhysicalDeviceFormatProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint format, jlong pFormatProperties) {
	((PFN_vkGetPhysicalDeviceFormatProperties2) address) (physicalDevice, format, pFormatProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getPhysicalDeviceImageFormatProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pImageFormatInfo, jlong pImageFormatProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceImageFormatProperties2) address) (physicalDevice, pImageFormatInfo, pImageFormatProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getPhysicalDeviceQueueFamilyProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pQueueFamilyPropertyCount, jlong pQueueFamilyProperties) {
	((PFN_vkGetPhysicalDeviceQueueFamilyProperties2) address) (physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getPhysicalDeviceMemoryProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pMemoryProperties) {
	((PFN_vkGetPhysicalDeviceMemoryProperties2) address) (physicalDevice, pMemoryProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getPhysicalDeviceSparseImageFormatProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pFormatInfo, jlong pPropertyCount, jlong pProperties) {
	((PFN_vkGetPhysicalDeviceSparseImageFormatProperties2) address) (physicalDevice, pFormatInfo, pPropertyCount, pProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_trimCommandPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong commandPool, jint flags) {
	((PFN_vkTrimCommandPool) address) (device, commandPool, flags);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getDeviceQueue2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pQueueInfo, jlong pQueue) {
	((PFN_vkGetDeviceQueue2) address) (device, pQueueInfo, pQueue);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_createSamplerYcbcrConversion(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pYcbcrConversion) {
	return (jint) ((PFN_vkCreateSamplerYcbcrConversion) address) (device, pCreateInfo, pAllocator, pYcbcrConversion);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_destroySamplerYcbcrConversion(JNIEnv* env, jobject obj, jlong address, jlong device, jlong ycbcrConversion, jlong pAllocator) {
	((PFN_vkDestroySamplerYcbcrConversion) address) (device, ycbcrConversion, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_createDescriptorUpdateTemplate(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pDescriptorUpdateTemplate) {
	return (jint) ((PFN_vkCreateDescriptorUpdateTemplate) address) (device, pCreateInfo, pAllocator, pDescriptorUpdateTemplate);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_destroyDescriptorUpdateTemplate(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorUpdateTemplate, jlong pAllocator) {
	((PFN_vkDestroyDescriptorUpdateTemplate) address) (device, descriptorUpdateTemplate, pAllocator);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_updateDescriptorSetWithTemplate(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorSet, jlong descriptorUpdateTemplate, jlong pData) {
	((PFN_vkUpdateDescriptorSetWithTemplate) address) (device, descriptorSet, descriptorUpdateTemplate, pData);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getPhysicalDeviceExternalBufferProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pExternalBufferInfo, jlong pExternalBufferProperties) {
	((PFN_vkGetPhysicalDeviceExternalBufferProperties) address) (physicalDevice, pExternalBufferInfo, pExternalBufferProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getPhysicalDeviceExternalFenceProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pExternalFenceInfo, jlong pExternalFenceProperties) {
	((PFN_vkGetPhysicalDeviceExternalFenceProperties) address) (physicalDevice, pExternalFenceInfo, pExternalFenceProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getPhysicalDeviceExternalSemaphoreProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pExternalSemaphoreInfo, jlong pExternalSemaphoreProperties) {
	((PFN_vkGetPhysicalDeviceExternalSemaphoreProperties) address) (physicalDevice, pExternalSemaphoreInfo, pExternalSemaphoreProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_11Kt_getDescriptorSetLayoutSupport(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pSupport) {
	((PFN_vkGetDescriptorSetLayoutSupport) address) (device, pCreateInfo, pSupport);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_cmdDrawIndirectCount(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jlong countBuffer, jlong countBufferOffset, jint maxDrawCount, jint stride) {
	((PFN_vkCmdDrawIndirectCount) address) (commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_cmdDrawIndexedIndirectCount(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jlong countBuffer, jlong countBufferOffset, jint maxDrawCount, jint stride) {
	((PFN_vkCmdDrawIndexedIndirectCount) address) (commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_createRenderPass2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pRenderPass) {
	return (jint) ((PFN_vkCreateRenderPass2) address) (device, pCreateInfo, pAllocator, pRenderPass);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_cmdBeginRenderPass2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pRenderPassBegin, jlong pSubpassBeginInfo) {
	((PFN_vkCmdBeginRenderPass2) address) (commandBuffer, pRenderPassBegin, pSubpassBeginInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_cmdNextSubpass2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pSubpassBeginInfo, jlong pSubpassEndInfo) {
	((PFN_vkCmdNextSubpass2) address) (commandBuffer, pSubpassBeginInfo, pSubpassEndInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_cmdEndRenderPass2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pSubpassEndInfo) {
	((PFN_vkCmdEndRenderPass2) address) (commandBuffer, pSubpassEndInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_resetQueryPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong queryPool, jint firstQuery, jint queryCount) {
	((PFN_vkResetQueryPool) address) (device, queryPool, firstQuery, queryCount);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_getSemaphoreCounterValue(JNIEnv* env, jobject obj, jlong address, jlong device, jlong semaphore, jlong pValue) {
	return (jint) ((PFN_vkGetSemaphoreCounterValue) address) (device, semaphore, pValue);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_waitSemaphores(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pWaitInfo, jlong timeout) {
	return (jint) ((PFN_vkWaitSemaphores) address) (device, pWaitInfo, timeout);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_signalSemaphore(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pSignalInfo) {
	return (jint) ((PFN_vkSignalSemaphore) address) (device, pSignalInfo);
}

JNIEXPORT jlong JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_getBufferDeviceAddress(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo) {
	return (jlong) ((PFN_vkGetBufferDeviceAddress) address) (device, pInfo);
}

JNIEXPORT jlong JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_getBufferOpaqueCaptureAddress(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo) {
	return (jlong) ((PFN_vkGetBufferOpaqueCaptureAddress) address) (device, pInfo);
}

JNIEXPORT jlong JNICALL Java_kvb_vulkan_VK_1VERSION_11_12Kt_getDeviceMemoryOpaqueCaptureAddress(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo) {
	return (jlong) ((PFN_vkGetDeviceMemoryOpaqueCaptureAddress) address) (device, pInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1KHR_1surfaceKt_destroySurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong surface, jlong pAllocator) {
	((PFN_vkDestroySurfaceKHR) address) (instance, surface, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1surfaceKt_getPhysicalDeviceSurfaceSupport(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint queueFamilyIndex, jlong surface, jlong pSupported) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfaceSupportKHR) address) (physicalDevice, queueFamilyIndex, surface, pSupported);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1surfaceKt_getPhysicalDeviceSurfaceCapabilities(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong surface, jlong pSurfaceCapabilities) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR) address) (physicalDevice, surface, pSurfaceCapabilities);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1surfaceKt_getPhysicalDeviceSurfaceFormats(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong surface, jlong pSurfaceFormatCount, jlong pSurfaceFormats) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfaceFormatsKHR) address) (physicalDevice, surface, pSurfaceFormatCount, pSurfaceFormats);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1surfaceKt_getPhysicalDeviceSurfacePresentModes(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong surface, jlong pPresentModeCount, jlong pPresentModes) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfacePresentModesKHR) address) (physicalDevice, surface, pPresentModeCount, pPresentModes);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1swapchainKt_createSwapchain(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSwapchain) {
	return (jint) ((PFN_vkCreateSwapchainKHR) address) (device, pCreateInfo, pAllocator, pSwapchain);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1KHR_1swapchainKt_destroySwapchain(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain, jlong pAllocator) {
	((PFN_vkDestroySwapchainKHR) address) (device, swapchain, pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1swapchainKt_getSwapchainImages(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain, jlong pSwapchainImageCount, jlong pSwapchainImages) {
	return (jint) ((PFN_vkGetSwapchainImagesKHR) address) (device, swapchain, pSwapchainImageCount, pSwapchainImages);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1swapchainKt_acquireNextImage(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain, jlong timeout, jlong semaphore, jlong fence, jlong pImageIndex) {
	return (jint) ((PFN_vkAcquireNextImageKHR) address) (device, swapchain, timeout, semaphore, fence, pImageIndex);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1swapchainKt_queuePresent(JNIEnv* env, jobject obj, jlong address, jlong queue, jlong pPresentInfo) {
	return (jint) ((PFN_vkQueuePresentKHR) address) (queue, pPresentInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1device_1groupKt_getDeviceGroupPresentCapabilities(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pDeviceGroupPresentCapabilities) {
	return (jint) ((PFN_vkGetDeviceGroupPresentCapabilitiesKHR) address) (device, pDeviceGroupPresentCapabilities);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1device_1groupKt_getDeviceGroupSurfacePresentModes(JNIEnv* env, jobject obj, jlong address, jlong device, jlong surface, jlong pModes) {
	return (jint) ((PFN_vkGetDeviceGroupSurfacePresentModesKHR) address) (device, surface, pModes);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1device_1groupKt_getPhysicalDevicePresentRectangles(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong surface, jlong pRectCount, jlong pRects) {
	return (jint) ((PFN_vkGetPhysicalDevicePresentRectanglesKHR) address) (physicalDevice, surface, pRectCount, pRects);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1device_1groupKt_acquireNextImage2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAcquireInfo, jlong pImageIndex) {
	return (jint) ((PFN_vkAcquireNextImage2KHR) address) (device, pAcquireInfo, pImageIndex);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1displayKt_getPhysicalDeviceDisplayProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceDisplayPropertiesKHR) address) (physicalDevice, pPropertyCount, pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1displayKt_getPhysicalDeviceDisplayPlaneProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR) address) (physicalDevice, pPropertyCount, pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1displayKt_getDisplayPlaneSupportedDisplays(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint planeIndex, jlong pDisplayCount, jlong pDisplays) {
	return (jint) ((PFN_vkGetDisplayPlaneSupportedDisplaysKHR) address) (physicalDevice, planeIndex, pDisplayCount, pDisplays);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1displayKt_getDisplayModeProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong display, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkGetDisplayModePropertiesKHR) address) (physicalDevice, display, pPropertyCount, pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1displayKt_createDisplayMode(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong display, jlong pCreateInfo, jlong pAllocator, jlong pMode) {
	return (jint) ((PFN_vkCreateDisplayModeKHR) address) (physicalDevice, display, pCreateInfo, pAllocator, pMode);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1displayKt_getDisplayPlaneCapabilities(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong mode, jint planeIndex, jlong pCapabilities) {
	return (jint) ((PFN_vkGetDisplayPlaneCapabilitiesKHR) address) (physicalDevice, mode, planeIndex, pCapabilities);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1displayKt_createDisplayPlaneSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateDisplayPlaneSurfaceKHR) address) (instance, pCreateInfo, pAllocator, pSurface);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1win32_1surfaceKt_createWin32Surface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateWin32SurfaceKHR) address) (instance, pCreateInfo, pAllocator, pSurface);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1KHR_1win32_1surfaceKt_getPhysicalDeviceWin32PresentationSupport(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint queueFamilyIndex) {
	return (jint) ((PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR) address) (physicalDevice, queueFamilyIndex);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1EXT_1debug_1utilsKt_setDebugUtilsObjectName(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pNameInfo) {
	return (jint) ((PFN_vkSetDebugUtilsObjectNameEXT) address) (device, pNameInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1EXT_1debug_1utilsKt_setDebugUtilsObjectTag(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pTagInfo) {
	return (jint) ((PFN_vkSetDebugUtilsObjectTagEXT) address) (device, pTagInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1EXT_1debug_1utilsKt_queueBeginDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong queue, jlong pLabelInfo) {
	((PFN_vkQueueBeginDebugUtilsLabelEXT) address) (queue, pLabelInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1EXT_1debug_1utilsKt_queueEndDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong queue) {
	((PFN_vkQueueEndDebugUtilsLabelEXT) address) (queue);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1EXT_1debug_1utilsKt_queueInsertDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong queue, jlong pLabelInfo) {
	((PFN_vkQueueInsertDebugUtilsLabelEXT) address) (queue, pLabelInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1EXT_1debug_1utilsKt_cmdBeginDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pLabelInfo) {
	((PFN_vkCmdBeginDebugUtilsLabelEXT) address) (commandBuffer, pLabelInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1EXT_1debug_1utilsKt_cmdEndDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer) {
	((PFN_vkCmdEndDebugUtilsLabelEXT) address) (commandBuffer);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1EXT_1debug_1utilsKt_cmdInsertDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pLabelInfo) {
	((PFN_vkCmdInsertDebugUtilsLabelEXT) address) (commandBuffer, pLabelInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_VK_1EXT_1debug_1utilsKt_createDebugUtilsMessenger(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pMessenger) {
	return (jint) ((PFN_vkCreateDebugUtilsMessengerEXT) address) (instance, pCreateInfo, pAllocator, pMessenger);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1EXT_1debug_1utilsKt_destroyDebugUtilsMessenger(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong messenger, jlong pAllocator) {
	((PFN_vkDestroyDebugUtilsMessengerEXT) address) (instance, messenger, pAllocator);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_VK_1EXT_1debug_1utilsKt_submitDebugUtilsMessage(JNIEnv* env, jobject obj, jlong address, jlong instance, jint messageSeverity, jint messageTypes, jlong pCallbackData) {
	((PFN_vkSubmitDebugUtilsMessageEXT) address) (instance, messageSeverity, messageTypes, pCallbackData);
}