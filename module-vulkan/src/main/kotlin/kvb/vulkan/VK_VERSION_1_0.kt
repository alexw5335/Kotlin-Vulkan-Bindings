// This file has been automatically generated.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateInstance(
 *         VkInstanceCreateInfo*   pCreateInfo
 *         VkAllocationCallbacks*  pAllocator
 *         VkInstance*             pInstance
 *     );
 */
internal external fun createInstance(address: Long, pCreateInfo: Long, pAllocator: Long, pInstance: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyInstance(
 *         VkInstance              instance
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyInstance(address: Long, instance: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkEnumeratePhysicalDevices(
 *         VkInstance         instance
 *         uint32_t*          pPhysicalDeviceCount
 *         VkPhysicalDevice*  pPhysicalDevices
 *     );
 */
internal external fun enumeratePhysicalDevices(address: Long, instance: Long, pPhysicalDeviceCount: Long, pPhysicalDevices: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetPhysicalDeviceFeatures(
 *         VkPhysicalDevice           physicalDevice
 *         VkPhysicalDeviceFeatures*  pFeatures
 *     );
 */
internal external fun getPhysicalDeviceFeatures(address: Long, physicalDevice: Long, pFeatures: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetPhysicalDeviceFormatProperties(
 *         VkPhysicalDevice     physicalDevice
 *         VkFormat             format
 *         VkFormatProperties*  pFormatProperties
 *     );
 */
internal external fun getPhysicalDeviceFormatProperties(address: Long, physicalDevice: Long, format: Int, pFormatProperties: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkGetPhysicalDeviceImageFormatProperties(
 *         VkPhysicalDevice          physicalDevice
 *         VkFormat                  format
 *         VkImageType               type
 *         VkImageTiling             tiling
 *         VkImageUsageFlags         usage
 *         VkImageCreateFlags        flags
 *         VkImageFormatProperties*  pImageFormatProperties
 *     );
 */
internal external fun getPhysicalDeviceImageFormatProperties(address: Long, physicalDevice: Long, format: Int, type: Int, tiling: Int, usage: Int, flags: Int, pImageFormatProperties: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetPhysicalDeviceProperties(
 *         VkPhysicalDevice             physicalDevice
 *         VkPhysicalDeviceProperties*  pProperties
 *     );
 */
internal external fun getPhysicalDeviceProperties(address: Long, physicalDevice: Long, pProperties: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetPhysicalDeviceQueueFamilyProperties(
 *         VkPhysicalDevice          physicalDevice
 *         uint32_t*                 pQueueFamilyPropertyCount
 *         VkQueueFamilyProperties*  pQueueFamilyProperties
 *     );
 */
internal external fun getPhysicalDeviceQueueFamilyProperties(address: Long, physicalDevice: Long, pQueueFamilyPropertyCount: Long, pQueueFamilyProperties: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetPhysicalDeviceMemoryProperties(
 *         VkPhysicalDevice                   physicalDevice
 *         VkPhysicalDeviceMemoryProperties*  pMemoryProperties
 *     );
 */
internal external fun getPhysicalDeviceMemoryProperties(address: Long, physicalDevice: Long, pMemoryProperties: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     PFN_vkVoidFunction vkGetInstanceProcAddr(
 *         VkInstance  instance
 *         char*       pName
 *     );
 */
internal external fun getInstanceProcAddr(address: Long, instance: Long, pName: Long): Long



/**
 *     // provided by VK_VERSION_1_0
 *     PFN_vkVoidFunction vkGetDeviceProcAddr(
 *         VkDevice  device
 *         char*     pName
 *     );
 */
internal external fun getDeviceProcAddr(address: Long, device: Long, pName: Long): Long



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateDevice(
 *         VkPhysicalDevice        physicalDevice
 *         VkDeviceCreateInfo*     pCreateInfo
 *         VkAllocationCallbacks*  pAllocator
 *         VkDevice*               pDevice
 *     );
 */
internal external fun createDevice(address: Long, physicalDevice: Long, pCreateInfo: Long, pAllocator: Long, pDevice: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyDevice(
 *         VkDevice                device
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyDevice(address: Long, device: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkEnumerateInstanceExtensionProperties(
 *         char*                   pLayerName
 *         uint32_t*               pPropertyCount
 *         VkExtensionProperties*  pProperties
 *     );
 */
internal external fun enumerateInstanceExtensionProperties(address: Long, pLayerName: Long, pPropertyCount: Long, pProperties: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkEnumerateDeviceExtensionProperties(
 *         VkPhysicalDevice        physicalDevice
 *         char*                   pLayerName
 *         uint32_t*               pPropertyCount
 *         VkExtensionProperties*  pProperties
 *     );
 */
internal external fun enumerateDeviceExtensionProperties(address: Long, physicalDevice: Long, pLayerName: Long, pPropertyCount: Long, pProperties: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkEnumerateInstanceLayerProperties(
 *         uint32_t*           pPropertyCount
 *         VkLayerProperties*  pProperties
 *     );
 */
internal external fun enumerateInstanceLayerProperties(address: Long, pPropertyCount: Long, pProperties: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkEnumerateDeviceLayerProperties(
 *         VkPhysicalDevice    physicalDevice
 *         uint32_t*           pPropertyCount
 *         VkLayerProperties*  pProperties
 *     );
 */
internal external fun enumerateDeviceLayerProperties(address: Long, physicalDevice: Long, pPropertyCount: Long, pProperties: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetDeviceQueue(
 *         VkDevice  device
 *         uint32_t  queueFamilyIndex
 *         uint32_t  queueIndex
 *         VkQueue*  pQueue
 *     );
 */
internal external fun getDeviceQueue(address: Long, device: Long, queueFamilyIndex: Int, queueIndex: Int, pQueue: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkQueueSubmit(
 *         VkQueue        queue
 *         uint32_t       submitCount
 *         VkSubmitInfo*  pSubmits
 *         VkFence        fence
 *     );
 */
internal external fun queueSubmit(address: Long, queue: Long, submitCount: Int, pSubmits: Long, fence: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkQueueWaitIdle(
 *         VkQueue  queue
 *     );
 */
internal external fun queueWaitIdle(address: Long, queue: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkDeviceWaitIdle(
 *         VkDevice  device
 *     );
 */
internal external fun deviceWaitIdle(address: Long, device: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkAllocateMemory(
 *         VkDevice                device
 *         VkMemoryAllocateInfo*   pAllocateInfo
 *         VkAllocationCallbacks*  pAllocator
 *         VkDeviceMemory*         pMemory
 *     );
 */
internal external fun allocateMemory(address: Long, device: Long, pAllocateInfo: Long, pAllocator: Long, pMemory: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkFreeMemory(
 *         VkDevice                device
 *         VkDeviceMemory          memory
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun freeMemory(address: Long, device: Long, memory: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkMapMemory(
 *         VkDevice          device
 *         VkDeviceMemory    memory
 *         VkDeviceSize      offset
 *         VkDeviceSize      size
 *         VkMemoryMapFlags  flags (reserved, must be zero)
 *         void*             ppData
 *     );
 */
internal external fun mapMemory(address: Long, device: Long, memory: Long, offset: Long, size: Long, flags: Int, ppData: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkUnmapMemory(
 *         VkDevice        device
 *         VkDeviceMemory  memory
 *     );
 */
internal external fun unmapMemory(address: Long, device: Long, memory: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkFlushMappedMemoryRanges(
 *         VkDevice              device
 *         uint32_t              memoryRangeCount
 *         VkMappedMemoryRange*  pMemoryRanges
 *     );
 */
internal external fun flushMappedMemoryRanges(address: Long, device: Long, memoryRangeCount: Int, pMemoryRanges: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkInvalidateMappedMemoryRanges(
 *         VkDevice              device
 *         uint32_t              memoryRangeCount
 *         VkMappedMemoryRange*  pMemoryRanges
 *     );
 */
internal external fun invalidateMappedMemoryRanges(address: Long, device: Long, memoryRangeCount: Int, pMemoryRanges: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetDeviceMemoryCommitment(
 *         VkDevice        device
 *         VkDeviceMemory  memory
 *         VkDeviceSize*   pCommittedMemoryInBytes
 *     );
 */
internal external fun getDeviceMemoryCommitment(address: Long, device: Long, memory: Long, pCommittedMemoryInBytes: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkBindBufferMemory(
 *         VkDevice        device
 *         VkBuffer        buffer
 *         VkDeviceMemory  memory
 *         VkDeviceSize    memoryOffset
 *     );
 */
internal external fun bindBufferMemory(address: Long, device: Long, buffer: Long, memory: Long, memoryOffset: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkBindImageMemory(
 *         VkDevice        device
 *         VkImage         image
 *         VkDeviceMemory  memory
 *         VkDeviceSize    memoryOffset
 *     );
 */
internal external fun bindImageMemory(address: Long, device: Long, image: Long, memory: Long, memoryOffset: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetBufferMemoryRequirements(
 *         VkDevice               device
 *         VkBuffer               buffer
 *         VkMemoryRequirements*  pMemoryRequirements
 *     );
 */
internal external fun getBufferMemoryRequirements(address: Long, device: Long, buffer: Long, pMemoryRequirements: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetImageMemoryRequirements(
 *         VkDevice               device
 *         VkImage                image
 *         VkMemoryRequirements*  pMemoryRequirements
 *     );
 */
internal external fun getImageMemoryRequirements(address: Long, device: Long, image: Long, pMemoryRequirements: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetImageSparseMemoryRequirements(
 *         VkDevice                          device
 *         VkImage                           image
 *         uint32_t*                         pSparseMemoryRequirementCount
 *         VkSparseImageMemoryRequirements*  pSparseMemoryRequirements
 *     );
 */
internal external fun getImageSparseMemoryRequirements(address: Long, device: Long, image: Long, pSparseMemoryRequirementCount: Long, pSparseMemoryRequirements: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetPhysicalDeviceSparseImageFormatProperties(
 *         VkPhysicalDevice                physicalDevice
 *         VkFormat                        format
 *         VkImageType                     type
 *         VkSampleCountFlagBits           samples
 *         VkImageUsageFlags               usage
 *         VkImageTiling                   tiling
 *         uint32_t*                       pPropertyCount
 *         VkSparseImageFormatProperties*  pProperties
 *     );
 */
internal external fun getPhysicalDeviceSparseImageFormatProperties(address: Long, physicalDevice: Long, format: Int, type: Int, samples: Int, usage: Int, tiling: Int, pPropertyCount: Long, pProperties: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkQueueBindSparse(
 *         VkQueue            queue
 *         uint32_t           bindInfoCount
 *         VkBindSparseInfo*  pBindInfo
 *         VkFence            fence
 *     );
 */
internal external fun queueBindSparse(address: Long, queue: Long, bindInfoCount: Int, pBindInfo: Long, fence: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateFence(
 *         VkDevice                device
 *         VkFenceCreateInfo*      pCreateInfo
 *         VkAllocationCallbacks*  pAllocator
 *         VkFence*                pFence
 *     );
 */
internal external fun createFence(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pFence: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyFence(
 *         VkDevice                device
 *         VkFence                 fence
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyFence(address: Long, device: Long, fence: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkResetFences(
 *         VkDevice  device
 *         uint32_t  fenceCount
 *         VkFence*  pFences
 *     );
 */
internal external fun resetFences(address: Long, device: Long, fenceCount: Int, pFences: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkGetFenceStatus(
 *         VkDevice  device
 *         VkFence   fence
 *     );
 */
internal external fun getFenceStatus(address: Long, device: Long, fence: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkWaitForFences(
 *         VkDevice  device
 *         uint32_t  fenceCount
 *         VkFence*  pFences
 *         VkBool32  waitAll
 *         uint64_t  timeout
 *     );
 */
internal external fun waitForFences(address: Long, device: Long, fenceCount: Int, pFences: Long, waitAll: Int, timeout: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateSemaphore(
 *         VkDevice                device
 *         VkSemaphoreCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*  pAllocator
 *         VkSemaphore*            pSemaphore
 *     );
 */
internal external fun createSemaphore(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pSemaphore: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroySemaphore(
 *         VkDevice                device
 *         VkSemaphore             semaphore
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroySemaphore(address: Long, device: Long, semaphore: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateEvent(
 *         VkDevice                device
 *         VkEventCreateInfo*      pCreateInfo
 *         VkAllocationCallbacks*  pAllocator
 *         VkEvent*                pEvent
 *     );
 */
internal external fun createEvent(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pEvent: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyEvent(
 *         VkDevice                device
 *         VkEvent                 event
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyEvent(address: Long, device: Long, event: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkGetEventStatus(
 *         VkDevice  device
 *         VkEvent   event
 *     );
 */
internal external fun getEventStatus(address: Long, device: Long, event: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkSetEvent(
 *         VkDevice  device
 *         VkEvent   event
 *     );
 */
internal external fun setEvent(address: Long, device: Long, event: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkResetEvent(
 *         VkDevice  device
 *         VkEvent   event
 *     );
 */
internal external fun resetEvent(address: Long, device: Long, event: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateQueryPool(
 *         VkDevice                device
 *         VkQueryPoolCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*  pAllocator
 *         VkQueryPool*            pQueryPool
 *     );
 */
internal external fun createQueryPool(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pQueryPool: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyQueryPool(
 *         VkDevice                device
 *         VkQueryPool             queryPool
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyQueryPool(address: Long, device: Long, queryPool: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkGetQueryPoolResults(
 *         VkDevice            device
 *         VkQueryPool         queryPool
 *         uint32_t            firstQuery
 *         uint32_t            queryCount
 *         size_t              dataSize
 *         void*               pData
 *         VkDeviceSize        stride
 *         VkQueryResultFlags  flags
 *     );
 */
internal external fun getQueryPoolResults(address: Long, device: Long, queryPool: Long, firstQuery: Int, queryCount: Int, dataSize: Long, pData: Long, stride: Long, flags: Int): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateBuffer(
 *         VkDevice                device
 *         VkBufferCreateInfo*     pCreateInfo
 *         VkAllocationCallbacks*  pAllocator
 *         VkBuffer*               pBuffer
 *     );
 */
internal external fun createBuffer(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pBuffer: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyBuffer(
 *         VkDevice                device
 *         VkBuffer                buffer
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyBuffer(address: Long, device: Long, buffer: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateBufferView(
 *         VkDevice                 device
 *         VkBufferViewCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*   pAllocator
 *         VkBufferView*            pView
 *     );
 */
internal external fun createBufferView(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pView: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyBufferView(
 *         VkDevice                device
 *         VkBufferView            bufferView
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyBufferView(address: Long, device: Long, bufferView: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateImage(
 *         VkDevice                device
 *         VkImageCreateInfo*      pCreateInfo
 *         VkAllocationCallbacks*  pAllocator
 *         VkImage*                pImage
 *     );
 */
internal external fun createImage(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pImage: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyImage(
 *         VkDevice                device
 *         VkImage                 image
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyImage(address: Long, device: Long, image: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetImageSubresourceLayout(
 *         VkDevice              device
 *         VkImage               image
 *         VkImageSubresource*   pSubresource
 *         VkSubresourceLayout*  pLayout
 *     );
 */
internal external fun getImageSubresourceLayout(address: Long, device: Long, image: Long, pSubresource: Long, pLayout: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateImageView(
 *         VkDevice                device
 *         VkImageViewCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*  pAllocator
 *         VkImageView*            pView
 *     );
 */
internal external fun createImageView(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pView: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyImageView(
 *         VkDevice                device
 *         VkImageView             imageView
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyImageView(address: Long, device: Long, imageView: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateShaderModule(
 *         VkDevice                   device
 *         VkShaderModuleCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*     pAllocator
 *         VkShaderModule*            pShaderModule
 *     );
 */
internal external fun createShaderModule(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pShaderModule: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyShaderModule(
 *         VkDevice                device
 *         VkShaderModule          shaderModule
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyShaderModule(address: Long, device: Long, shaderModule: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreatePipelineCache(
 *         VkDevice                    device
 *         VkPipelineCacheCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*      pAllocator
 *         VkPipelineCache*            pPipelineCache
 *     );
 */
internal external fun createPipelineCache(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pPipelineCache: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyPipelineCache(
 *         VkDevice                device
 *         VkPipelineCache         pipelineCache
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyPipelineCache(address: Long, device: Long, pipelineCache: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkGetPipelineCacheData(
 *         VkDevice         device
 *         VkPipelineCache  pipelineCache
 *         size_t*          pDataSize
 *         void*            pData
 *     );
 */
internal external fun getPipelineCacheData(address: Long, device: Long, pipelineCache: Long, pDataSize: Long, pData: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkMergePipelineCaches(
 *         VkDevice          device
 *         VkPipelineCache   dstCache
 *         uint32_t          srcCacheCount
 *         VkPipelineCache*  pSrcCaches
 *     );
 */
internal external fun mergePipelineCaches(address: Long, device: Long, dstCache: Long, srcCacheCount: Int, pSrcCaches: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateGraphicsPipelines(
 *         VkDevice                       device
 *         VkPipelineCache                pipelineCache
 *         uint32_t                       createInfoCount
 *         VkGraphicsPipelineCreateInfo*  pCreateInfos
 *         VkAllocationCallbacks*         pAllocator
 *         VkPipeline*                    pPipelines
 *     );
 */
internal external fun createGraphicsPipelines(address: Long, device: Long, pipelineCache: Long, createInfoCount: Int, pCreateInfos: Long, pAllocator: Long, pPipelines: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateComputePipelines(
 *         VkDevice                      device
 *         VkPipelineCache               pipelineCache
 *         uint32_t                      createInfoCount
 *         VkComputePipelineCreateInfo*  pCreateInfos
 *         VkAllocationCallbacks*        pAllocator
 *         VkPipeline*                   pPipelines
 *     );
 */
internal external fun createComputePipelines(address: Long, device: Long, pipelineCache: Long, createInfoCount: Int, pCreateInfos: Long, pAllocator: Long, pPipelines: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyPipeline(
 *         VkDevice                device
 *         VkPipeline              pipeline
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyPipeline(address: Long, device: Long, pipeline: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreatePipelineLayout(
 *         VkDevice                     device
 *         VkPipelineLayoutCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*       pAllocator
 *         VkPipelineLayout*            pPipelineLayout
 *     );
 */
internal external fun createPipelineLayout(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pPipelineLayout: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyPipelineLayout(
 *         VkDevice                device
 *         VkPipelineLayout        pipelineLayout
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyPipelineLayout(address: Long, device: Long, pipelineLayout: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateSampler(
 *         VkDevice                device
 *         VkSamplerCreateInfo*    pCreateInfo
 *         VkAllocationCallbacks*  pAllocator
 *         VkSampler*              pSampler
 *     );
 */
internal external fun createSampler(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pSampler: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroySampler(
 *         VkDevice                device
 *         VkSampler               sampler
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroySampler(address: Long, device: Long, sampler: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateDescriptorSetLayout(
 *         VkDevice                          device
 *         VkDescriptorSetLayoutCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*            pAllocator
 *         VkDescriptorSetLayout*            pSetLayout
 *     );
 */
internal external fun createDescriptorSetLayout(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pSetLayout: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyDescriptorSetLayout(
 *         VkDevice                device
 *         VkDescriptorSetLayout   descriptorSetLayout
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyDescriptorSetLayout(address: Long, device: Long, descriptorSetLayout: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateDescriptorPool(
 *         VkDevice                     device
 *         VkDescriptorPoolCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*       pAllocator
 *         VkDescriptorPool*            pDescriptorPool
 *     );
 */
internal external fun createDescriptorPool(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pDescriptorPool: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyDescriptorPool(
 *         VkDevice                device
 *         VkDescriptorPool        descriptorPool
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyDescriptorPool(address: Long, device: Long, descriptorPool: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkResetDescriptorPool(
 *         VkDevice                    device
 *         VkDescriptorPool            descriptorPool
 *         VkDescriptorPoolResetFlags  flags (reserved, must be zero)
 *     );
 */
internal external fun resetDescriptorPool(address: Long, device: Long, descriptorPool: Long, flags: Int): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkAllocateDescriptorSets(
 *         VkDevice                      device
 *         VkDescriptorSetAllocateInfo*  pAllocateInfo
 *         VkDescriptorSet*              pDescriptorSets
 *     );
 */
internal external fun allocateDescriptorSets(address: Long, device: Long, pAllocateInfo: Long, pDescriptorSets: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkFreeDescriptorSets(
 *         VkDevice          device
 *         VkDescriptorPool  descriptorPool
 *         uint32_t          descriptorSetCount
 *         VkDescriptorSet*  pDescriptorSets
 *     );
 */
internal external fun freeDescriptorSets(address: Long, device: Long, descriptorPool: Long, descriptorSetCount: Int, pDescriptorSets: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkUpdateDescriptorSets(
 *         VkDevice               device
 *         uint32_t               descriptorWriteCount
 *         VkWriteDescriptorSet*  pDescriptorWrites
 *         uint32_t               descriptorCopyCount
 *         VkCopyDescriptorSet*   pDescriptorCopies
 *     );
 */
internal external fun updateDescriptorSets(address: Long, device: Long, descriptorWriteCount: Int, pDescriptorWrites: Long, descriptorCopyCount: Int, pDescriptorCopies: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateFramebuffer(
 *         VkDevice                  device
 *         VkFramebufferCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*    pAllocator
 *         VkFramebuffer*            pFramebuffer
 *     );
 */
internal external fun createFramebuffer(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pFramebuffer: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyFramebuffer(
 *         VkDevice                device
 *         VkFramebuffer           framebuffer
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyFramebuffer(address: Long, device: Long, framebuffer: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateRenderPass(
 *         VkDevice                 device
 *         VkRenderPassCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*   pAllocator
 *         VkRenderPass*            pRenderPass
 *     );
 */
internal external fun createRenderPass(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pRenderPass: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyRenderPass(
 *         VkDevice                device
 *         VkRenderPass            renderPass
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyRenderPass(address: Long, device: Long, renderPass: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkGetRenderAreaGranularity(
 *         VkDevice      device
 *         VkRenderPass  renderPass
 *         VkExtent2D*   pGranularity
 *     );
 */
internal external fun getRenderAreaGranularity(address: Long, device: Long, renderPass: Long, pGranularity: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkCreateCommandPool(
 *         VkDevice                  device
 *         VkCommandPoolCreateInfo*  pCreateInfo
 *         VkAllocationCallbacks*    pAllocator
 *         VkCommandPool*            pCommandPool
 *     );
 */
internal external fun createCommandPool(address: Long, device: Long, pCreateInfo: Long, pAllocator: Long, pCommandPool: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkDestroyCommandPool(
 *         VkDevice                device
 *         VkCommandPool           commandPool
 *         VkAllocationCallbacks*  pAllocator
 *     );
 */
internal external fun destroyCommandPool(address: Long, device: Long, commandPool: Long, pAllocator: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkResetCommandPool(
 *         VkDevice                 device
 *         VkCommandPool            commandPool
 *         VkCommandPoolResetFlags  flags
 *     );
 */
internal external fun resetCommandPool(address: Long, device: Long, commandPool: Long, flags: Int): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkAllocateCommandBuffers(
 *         VkDevice                      device
 *         VkCommandBufferAllocateInfo*  pAllocateInfo
 *         VkCommandBuffer*              pCommandBuffers
 *     );
 */
internal external fun allocateCommandBuffers(address: Long, device: Long, pAllocateInfo: Long, pCommandBuffers: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkFreeCommandBuffers(
 *         VkDevice          device
 *         VkCommandPool     commandPool
 *         uint32_t          commandBufferCount
 *         VkCommandBuffer*  pCommandBuffers
 *     );
 */
internal external fun freeCommandBuffers(address: Long, device: Long, commandPool: Long, commandBufferCount: Int, pCommandBuffers: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkBeginCommandBuffer(
 *         VkCommandBuffer            commandBuffer
 *         VkCommandBufferBeginInfo*  pBeginInfo
 *     );
 */
internal external fun beginCommandBuffer(address: Long, commandBuffer: Long, pBeginInfo: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkEndCommandBuffer(
 *         VkCommandBuffer  commandBuffer
 *     );
 */
internal external fun endCommandBuffer(address: Long, commandBuffer: Long): Int



/**
 *     // provided by VK_VERSION_1_0
 *     VkResult vkResetCommandBuffer(
 *         VkCommandBuffer            commandBuffer
 *         VkCommandBufferResetFlags  flags
 *     );
 */
internal external fun resetCommandBuffer(address: Long, commandBuffer: Long, flags: Int): Int



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdBindPipeline(
 *         VkCommandBuffer      commandBuffer
 *         VkPipelineBindPoint  pipelineBindPoint
 *         VkPipeline           pipeline
 *     );
 */
internal external fun cmdBindPipeline(address: Long, commandBuffer: Long, pipelineBindPoint: Int, pipeline: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdSetViewport(
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         firstViewport
 *         uint32_t         viewportCount
 *         VkViewport*      pViewports
 *     );
 */
internal external fun cmdSetViewport(address: Long, commandBuffer: Long, firstViewport: Int, viewportCount: Int, pViewports: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdSetScissor(
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         firstScissor
 *         uint32_t         scissorCount
 *         VkRect2D*        pScissors
 *     );
 */
internal external fun cmdSetScissor(address: Long, commandBuffer: Long, firstScissor: Int, scissorCount: Int, pScissors: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdSetLineWidth(
 *         VkCommandBuffer  commandBuffer
 *         float            lineWidth
 *     );
 */
internal external fun cmdSetLineWidth(address: Long, commandBuffer: Long, lineWidth: Float)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdSetDepthBias(
 *         VkCommandBuffer  commandBuffer
 *         float            depthBiasConstantFactor
 *         float            depthBiasClamp
 *         float            depthBiasSlopeFactor
 *     );
 */
internal external fun cmdSetDepthBias(address: Long, commandBuffer: Long, depthBiasConstantFactor: Float, depthBiasClamp: Float, depthBiasSlopeFactor: Float)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdSetBlendConstants(
 *         VkCommandBuffer  commandBuffer
 *         float            blendConstants[4]
 *     );
 */
internal external fun cmdSetBlendConstants(address: Long, commandBuffer: Long, blendConstants: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdSetDepthBounds(
 *         VkCommandBuffer  commandBuffer
 *         float            minDepthBounds
 *         float            maxDepthBounds
 *     );
 */
internal external fun cmdSetDepthBounds(address: Long, commandBuffer: Long, minDepthBounds: Float, maxDepthBounds: Float)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdSetStencilCompareMask(
 *         VkCommandBuffer     commandBuffer
 *         VkStencilFaceFlags  faceMask
 *         uint32_t            compareMask
 *     );
 */
internal external fun cmdSetStencilCompareMask(address: Long, commandBuffer: Long, faceMask: Int, compareMask: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdSetStencilWriteMask(
 *         VkCommandBuffer     commandBuffer
 *         VkStencilFaceFlags  faceMask
 *         uint32_t            writeMask
 *     );
 */
internal external fun cmdSetStencilWriteMask(address: Long, commandBuffer: Long, faceMask: Int, writeMask: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdSetStencilReference(
 *         VkCommandBuffer     commandBuffer
 *         VkStencilFaceFlags  faceMask
 *         uint32_t            reference
 *     );
 */
internal external fun cmdSetStencilReference(address: Long, commandBuffer: Long, faceMask: Int, reference: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdBindDescriptorSets(
 *         VkCommandBuffer      commandBuffer
 *         VkPipelineBindPoint  pipelineBindPoint
 *         VkPipelineLayout     layout
 *         uint32_t             firstSet
 *         uint32_t             descriptorSetCount
 *         VkDescriptorSet*     pDescriptorSets
 *         uint32_t             dynamicOffsetCount
 *         uint32_t*            pDynamicOffsets
 *     );
 */
internal external fun cmdBindDescriptorSets(address: Long, commandBuffer: Long, pipelineBindPoint: Int, layout: Long, firstSet: Int, descriptorSetCount: Int, pDescriptorSets: Long, dynamicOffsetCount: Int, pDynamicOffsets: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdBindIndexBuffer(
 *         VkCommandBuffer  commandBuffer
 *         VkBuffer         buffer
 *         VkDeviceSize     offset
 *         VkIndexType      indexType
 *     );
 */
internal external fun cmdBindIndexBuffer(address: Long, commandBuffer: Long, buffer: Long, offset: Long, indexType: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdBindVertexBuffers(
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         firstBinding
 *         uint32_t         bindingCount
 *         VkBuffer*        pBuffers
 *         VkDeviceSize*    pOffsets
 *     );
 */
internal external fun cmdBindVertexBuffers(address: Long, commandBuffer: Long, firstBinding: Int, bindingCount: Int, pBuffers: Long, pOffsets: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdDraw(
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         vertexCount
 *         uint32_t         instanceCount
 *         uint32_t         firstVertex
 *         uint32_t         firstInstance
 *     );
 */
internal external fun cmdDraw(address: Long, commandBuffer: Long, vertexCount: Int, instanceCount: Int, firstVertex: Int, firstInstance: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdDrawIndexed(
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         indexCount
 *         uint32_t         instanceCount
 *         uint32_t         firstIndex
 *         int32_t          vertexOffset
 *         uint32_t         firstInstance
 *     );
 */
internal external fun cmdDrawIndexed(address: Long, commandBuffer: Long, indexCount: Int, instanceCount: Int, firstIndex: Int, vertexOffset: Int, firstInstance: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdDrawIndirect(
 *         VkCommandBuffer  commandBuffer
 *         VkBuffer         buffer
 *         VkDeviceSize     offset
 *         uint32_t         drawCount
 *         uint32_t         stride
 *     );
 */
internal external fun cmdDrawIndirect(address: Long, commandBuffer: Long, buffer: Long, offset: Long, drawCount: Int, stride: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdDrawIndexedIndirect(
 *         VkCommandBuffer  commandBuffer
 *         VkBuffer         buffer
 *         VkDeviceSize     offset
 *         uint32_t         drawCount
 *         uint32_t         stride
 *     );
 */
internal external fun cmdDrawIndexedIndirect(address: Long, commandBuffer: Long, buffer: Long, offset: Long, drawCount: Int, stride: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdDispatch(
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         groupCountX
 *         uint32_t         groupCountY
 *         uint32_t         groupCountZ
 *     );
 */
internal external fun cmdDispatch(address: Long, commandBuffer: Long, groupCountX: Int, groupCountY: Int, groupCountZ: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdDispatchIndirect(
 *         VkCommandBuffer  commandBuffer
 *         VkBuffer         buffer
 *         VkDeviceSize     offset
 *     );
 */
internal external fun cmdDispatchIndirect(address: Long, commandBuffer: Long, buffer: Long, offset: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdCopyBuffer(
 *         VkCommandBuffer  commandBuffer
 *         VkBuffer         srcBuffer
 *         VkBuffer         dstBuffer
 *         uint32_t         regionCount
 *         VkBufferCopy*    pRegions
 *     );
 */
internal external fun cmdCopyBuffer(address: Long, commandBuffer: Long, srcBuffer: Long, dstBuffer: Long, regionCount: Int, pRegions: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdCopyImage(
 *         VkCommandBuffer  commandBuffer
 *         VkImage          srcImage
 *         VkImageLayout    srcImageLayout
 *         VkImage          dstImage
 *         VkImageLayout    dstImageLayout
 *         uint32_t         regionCount
 *         VkImageCopy*     pRegions
 *     );
 */
internal external fun cmdCopyImage(address: Long, commandBuffer: Long, srcImage: Long, srcImageLayout: Int, dstImage: Long, dstImageLayout: Int, regionCount: Int, pRegions: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdBlitImage(
 *         VkCommandBuffer  commandBuffer
 *         VkImage          srcImage
 *         VkImageLayout    srcImageLayout
 *         VkImage          dstImage
 *         VkImageLayout    dstImageLayout
 *         uint32_t         regionCount
 *         VkImageBlit*     pRegions
 *         VkFilter         filter
 *     );
 */
internal external fun cmdBlitImage(address: Long, commandBuffer: Long, srcImage: Long, srcImageLayout: Int, dstImage: Long, dstImageLayout: Int, regionCount: Int, pRegions: Long, filter: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdCopyBufferToImage(
 *         VkCommandBuffer     commandBuffer
 *         VkBuffer            srcBuffer
 *         VkImage             dstImage
 *         VkImageLayout       dstImageLayout
 *         uint32_t            regionCount
 *         VkBufferImageCopy*  pRegions
 *     );
 */
internal external fun cmdCopyBufferToImage(address: Long, commandBuffer: Long, srcBuffer: Long, dstImage: Long, dstImageLayout: Int, regionCount: Int, pRegions: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdCopyImageToBuffer(
 *         VkCommandBuffer     commandBuffer
 *         VkImage             srcImage
 *         VkImageLayout       srcImageLayout
 *         VkBuffer            dstBuffer
 *         uint32_t            regionCount
 *         VkBufferImageCopy*  pRegions
 *     );
 */
internal external fun cmdCopyImageToBuffer(address: Long, commandBuffer: Long, srcImage: Long, srcImageLayout: Int, dstBuffer: Long, regionCount: Int, pRegions: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdUpdateBuffer(
 *         VkCommandBuffer  commandBuffer
 *         VkBuffer         dstBuffer
 *         VkDeviceSize     dstOffset
 *         VkDeviceSize     dataSize
 *         void*            pData
 *     );
 */
internal external fun cmdUpdateBuffer(address: Long, commandBuffer: Long, dstBuffer: Long, dstOffset: Long, dataSize: Long, pData: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdFillBuffer(
 *         VkCommandBuffer  commandBuffer
 *         VkBuffer         dstBuffer
 *         VkDeviceSize     dstOffset
 *         VkDeviceSize     size
 *         uint32_t         data
 *     );
 */
internal external fun cmdFillBuffer(address: Long, commandBuffer: Long, dstBuffer: Long, dstOffset: Long, size: Long, data: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdClearColorImage(
 *         VkCommandBuffer           commandBuffer
 *         VkImage                   image
 *         VkImageLayout             imageLayout
 *         VkClearColorValue*        pColor
 *         uint32_t                  rangeCount
 *         VkImageSubresourceRange*  pRanges
 *     );
 */
internal external fun cmdClearColorImage(address: Long, commandBuffer: Long, image: Long, imageLayout: Int, pColor: Long, rangeCount: Int, pRanges: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdClearDepthStencilImage(
 *         VkCommandBuffer            commandBuffer
 *         VkImage                    image
 *         VkImageLayout              imageLayout
 *         VkClearDepthStencilValue*  pDepthStencil
 *         uint32_t                   rangeCount
 *         VkImageSubresourceRange*   pRanges
 *     );
 */
internal external fun cmdClearDepthStencilImage(address: Long, commandBuffer: Long, image: Long, imageLayout: Int, pDepthStencil: Long, rangeCount: Int, pRanges: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdClearAttachments(
 *         VkCommandBuffer     commandBuffer
 *         uint32_t            attachmentCount
 *         VkClearAttachment*  pAttachments
 *         uint32_t            rectCount
 *         VkClearRect*        pRects
 *     );
 */
internal external fun cmdClearAttachments(address: Long, commandBuffer: Long, attachmentCount: Int, pAttachments: Long, rectCount: Int, pRects: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdResolveImage(
 *         VkCommandBuffer  commandBuffer
 *         VkImage          srcImage
 *         VkImageLayout    srcImageLayout
 *         VkImage          dstImage
 *         VkImageLayout    dstImageLayout
 *         uint32_t         regionCount
 *         VkImageResolve*  pRegions
 *     );
 */
internal external fun cmdResolveImage(address: Long, commandBuffer: Long, srcImage: Long, srcImageLayout: Int, dstImage: Long, dstImageLayout: Int, regionCount: Int, pRegions: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdSetEvent(
 *         VkCommandBuffer       commandBuffer
 *         VkEvent               event
 *         VkPipelineStageFlags  stageMask
 *     );
 */
internal external fun cmdSetEvent(address: Long, commandBuffer: Long, event: Long, stageMask: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdResetEvent(
 *         VkCommandBuffer       commandBuffer
 *         VkEvent               event
 *         VkPipelineStageFlags  stageMask
 *     );
 */
internal external fun cmdResetEvent(address: Long, commandBuffer: Long, event: Long, stageMask: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdWaitEvents(
 *         VkCommandBuffer         commandBuffer
 *         uint32_t                eventCount
 *         VkEvent*                pEvents
 *         VkPipelineStageFlags    srcStageMask
 *         VkPipelineStageFlags    dstStageMask
 *         uint32_t                memoryBarrierCount
 *         VkMemoryBarrier*        pMemoryBarriers
 *         uint32_t                bufferMemoryBarrierCount
 *         VkBufferMemoryBarrier*  pBufferMemoryBarriers
 *         uint32_t                imageMemoryBarrierCount
 *         VkImageMemoryBarrier*   pImageMemoryBarriers
 *     );
 */
internal external fun cmdWaitEvents(address: Long, commandBuffer: Long, eventCount: Int, pEvents: Long, srcStageMask: Int, dstStageMask: Int, memoryBarrierCount: Int, pMemoryBarriers: Long, bufferMemoryBarrierCount: Int, pBufferMemoryBarriers: Long, imageMemoryBarrierCount: Int, pImageMemoryBarriers: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdPipelineBarrier(
 *         VkCommandBuffer         commandBuffer
 *         VkPipelineStageFlags    srcStageMask
 *         VkPipelineStageFlags    dstStageMask
 *         VkDependencyFlags       dependencyFlags
 *         uint32_t                memoryBarrierCount
 *         VkMemoryBarrier*        pMemoryBarriers
 *         uint32_t                bufferMemoryBarrierCount
 *         VkBufferMemoryBarrier*  pBufferMemoryBarriers
 *         uint32_t                imageMemoryBarrierCount
 *         VkImageMemoryBarrier*   pImageMemoryBarriers
 *     );
 */
internal external fun cmdPipelineBarrier(address: Long, commandBuffer: Long, srcStageMask: Int, dstStageMask: Int, dependencyFlags: Int, memoryBarrierCount: Int, pMemoryBarriers: Long, bufferMemoryBarrierCount: Int, pBufferMemoryBarriers: Long, imageMemoryBarrierCount: Int, pImageMemoryBarriers: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdBeginQuery(
 *         VkCommandBuffer      commandBuffer
 *         VkQueryPool          queryPool
 *         uint32_t             query
 *         VkQueryControlFlags  flags
 *     );
 */
internal external fun cmdBeginQuery(address: Long, commandBuffer: Long, queryPool: Long, query: Int, flags: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdEndQuery(
 *         VkCommandBuffer  commandBuffer
 *         VkQueryPool      queryPool
 *         uint32_t         query
 *     );
 */
internal external fun cmdEndQuery(address: Long, commandBuffer: Long, queryPool: Long, query: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdResetQueryPool(
 *         VkCommandBuffer  commandBuffer
 *         VkQueryPool      queryPool
 *         uint32_t         firstQuery
 *         uint32_t         queryCount
 *     );
 */
internal external fun cmdResetQueryPool(address: Long, commandBuffer: Long, queryPool: Long, firstQuery: Int, queryCount: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdWriteTimestamp(
 *         VkCommandBuffer          commandBuffer
 *         VkPipelineStageFlagBits  pipelineStage
 *         VkQueryPool              queryPool
 *         uint32_t                 query
 *     );
 */
internal external fun cmdWriteTimestamp(address: Long, commandBuffer: Long, pipelineStage: Int, queryPool: Long, query: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdCopyQueryPoolResults(
 *         VkCommandBuffer     commandBuffer
 *         VkQueryPool         queryPool
 *         uint32_t            firstQuery
 *         uint32_t            queryCount
 *         VkBuffer            dstBuffer
 *         VkDeviceSize        dstOffset
 *         VkDeviceSize        stride
 *         VkQueryResultFlags  flags
 *     );
 */
internal external fun cmdCopyQueryPoolResults(address: Long, commandBuffer: Long, queryPool: Long, firstQuery: Int, queryCount: Int, dstBuffer: Long, dstOffset: Long, stride: Long, flags: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdPushConstants(
 *         VkCommandBuffer     commandBuffer
 *         VkPipelineLayout    layout
 *         VkShaderStageFlags  stageFlags
 *         uint32_t            offset
 *         uint32_t            size
 *         void*               pValues
 *     );
 */
internal external fun cmdPushConstants(address: Long, commandBuffer: Long, layout: Long, stageFlags: Int, offset: Int, size: Int, pValues: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdBeginRenderPass(
 *         VkCommandBuffer         commandBuffer
 *         VkRenderPassBeginInfo*  pRenderPassBegin
 *         VkSubpassContents       contents
 *     );
 */
internal external fun cmdBeginRenderPass(address: Long, commandBuffer: Long, pRenderPassBegin: Long, contents: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdNextSubpass(
 *         VkCommandBuffer    commandBuffer
 *         VkSubpassContents  contents
 *     );
 */
internal external fun cmdNextSubpass(address: Long, commandBuffer: Long, contents: Int)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdEndRenderPass(
 *         VkCommandBuffer  commandBuffer
 *     );
 */
internal external fun cmdEndRenderPass(address: Long, commandBuffer: Long)



/**
 *     // provided by VK_VERSION_1_0
 *     void vkCmdExecuteCommands(
 *         VkCommandBuffer   commandBuffer
 *         uint32_t          commandBufferCount
 *         VkCommandBuffer*  pCommandBuffers
 *     );
 */
internal external fun cmdExecuteCommands(address: Long, commandBuffer: Long, commandBufferCount: Int, pCommandBuffers: Long)



/**
 * Implementation of VkInstance.
 */
open class InstanceH(override val address: Long) : Addressable



/**
 * Implementation of VkPhysicalDevice.
 */
open class PhysicalDeviceH(override val address: Long) : Addressable



/**
 * Implementation of VkDevice.
 */
open class DeviceH(override val address: Long) : Addressable



/**
 * Implementation of VkQueue.
 */
open class QueueH(override val address: Long) : Addressable



/**
 * Implementation of VkDeviceMemory.
 */
open class DeviceMemoryH(override val address: Long) : Addressable



/**
 * Implementation of VkFence.
 */
open class FenceH(override val address: Long) : Addressable



/**
 * Implementation of VkSemaphore.
 */
open class SemaphoreH(override val address: Long) : Addressable



/**
 * Implementation of VkEvent.
 */
open class EventH(override val address: Long) : Addressable



/**
 * Implementation of VkQueryPool.
 */
open class QueryPoolH(override val address: Long) : Addressable



/**
 * Implementation of VkBuffer.
 */
open class BufferH(override val address: Long) : Addressable



/**
 * Implementation of VkBufferView.
 */
open class BufferViewH(override val address: Long) : Addressable



/**
 * Implementation of VkImage.
 */
open class ImageH(override val address: Long) : Addressable



/**
 * Implementation of VkImageView.
 */
open class ImageViewH(override val address: Long) : Addressable



/**
 * Implementation of VkShaderModule.
 */
open class ShaderModuleH(override val address: Long) : Addressable



/**
 * Implementation of VkPipelineCache.
 */
open class PipelineCacheH(override val address: Long) : Addressable



/**
 * Implementation of VkPipeline.
 */
open class PipelineH(override val address: Long) : Addressable



/**
 * Implementation of VkPipelineLayout.
 */
open class PipelineLayoutH(override val address: Long) : Addressable



/**
 * Implementation of VkSampler.
 */
open class SamplerH(override val address: Long) : Addressable



/**
 * Implementation of VkDescriptorPool.
 */
open class DescriptorPoolH(override val address: Long) : Addressable



/**
 * Implementation of VkDescriptorSet.
 */
open class DescriptorSetH(override val address: Long) : Addressable



/**
 * Implementation of VkDescriptorSetLayout.
 */
open class DescriptorSetLayoutH(override val address: Long) : Addressable



/**
 * Implementation of VkFramebuffer.
 */
open class FramebufferH(override val address: Long) : Addressable



/**
 * Implementation of VkRenderPass.
 */
open class RenderPassH(override val address: Long) : Addressable



/**
 * Implementation of VkCommandPool.
 */
open class CommandPoolH(override val address: Long) : Addressable



/**
 * Implementation of VkCommandBuffer.
 */
open class CommandBufferH(override val address: Long) : Addressable



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkResult {
 *         VK_SUCCESS                                             = 0
 *         VK_NOT_READY                                           = 1
 *         VK_TIMEOUT                                             = 2
 *         VK_EVENT_SET                                           = 3
 *         VK_EVENT_RESET                                         = 4
 *         VK_INCOMPLETE                                          = 5
 *         VK_ERROR_OUT_OF_HOST_MEMORY                            = -1
 *         VK_ERROR_OUT_OF_DEVICE_MEMORY                          = -2
 *         VK_ERROR_INITIALIZATION_FAILED                         = -3
 *         VK_ERROR_DEVICE_LOST                                   = -4
 *         VK_ERROR_MEMORY_MAP_FAILED                             = -5
 *         VK_ERROR_LAYER_NOT_PRESENT                             = -6
 *         VK_ERROR_EXTENSION_NOT_PRESENT                         = -7
 *         VK_ERROR_FEATURE_NOT_PRESENT                           = -8
 *         VK_ERROR_INCOMPATIBLE_DRIVER                           = -9
 *         VK_ERROR_TOO_MANY_OBJECTS                              = -10
 *         VK_ERROR_FORMAT_NOT_SUPPORTED                          = -11
 *         VK_ERROR_FRAGMENTED_POOL                               = -12
 *         VK_ERROR_UNKNOWN                                       = -13
 *         VK_ERROR_OUT_OF_POOL_MEMORY                            = -1000069000
 *         VK_ERROR_INVALID_EXTERNAL_HANDLE                       = -1000072003
 *         VK_ERROR_FRAGMENTATION                                 = -1000161000
 *         VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS                = -1000257000
 *         VK_ERROR_SURFACE_LOST_KHR                              = -1000000000
 *         VK_ERROR_NATIVE_WINDOW_IN_USE_KHR                      = -1000000001
 *         VK_SUBOPTIMAL_KHR                                      = 1000001003
 *         VK_ERROR_OUT_OF_DATE_KHR                               = -1000001004
 *         VK_ERROR_INCOMPATIBLE_DISPLAY_KHR                      = -1000003001
 *         VK_ERROR_VALIDATION_FAILED_EXT                         = -1000011001
 *         VK_ERROR_INVALID_SHADER_NV                             = -1000012000
 *         VK_ERROR_OUT_OF_POOL_MEMORY_KHR                        = -1000069000
 *         VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR                   = -1000072003
 *         VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT  = -1000158000
 *         VK_ERROR_FRAGMENTATION_EXT                             = -1000161000
 *         VK_ERROR_NOT_PERMITTED_EXT                             = -1000174001
 *         VK_ERROR_INVALID_DEVICE_ADDRESS_EXT                    = -1000257000
 *         VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT           = -1000255000
 *         VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR            = -1000257000
 *         VK_THREAD_IDLE_KHR                                     = 1000268000
 *         VK_THREAD_DONE_KHR                                     = 1000268001
 *         VK_OPERATION_DEFERRED_KHR                              = 1000268002
 *         VK_OPERATION_NOT_DEFERRED_KHR                          = 1000268003
 *         VK_PIPELINE_COMPILE_REQUIRED_EXT                       = 1000297000
 *         VK_ERROR_PIPELINE_COMPILE_REQUIRED_EXT                 = 1000297000
 *     }
 */
@Suppress("unused")
@JvmInline
value class Result(val value: Int) {
	
	
	companion object {
		
		val SUCCESS = Result(0)
		
		val NOT_READY = Result(1)
		
		val TIMEOUT = Result(2)
		
		val EVENT_SET = Result(3)
		
		val EVENT_RESET = Result(4)
		
		val INCOMPLETE = Result(5)
		
		val ERROR_OUT_OF_HOST_MEMORY = Result(-1)
		
		val ERROR_OUT_OF_DEVICE_MEMORY = Result(-2)
		
		val ERROR_INITIALIZATION_FAILED = Result(-3)
		
		val ERROR_DEVICE_LOST = Result(-4)
		
		val ERROR_MEMORY_MAP_FAILED = Result(-5)
		
		val ERROR_LAYER_NOT_PRESENT = Result(-6)
		
		val ERROR_EXTENSION_NOT_PRESENT = Result(-7)
		
		val ERROR_FEATURE_NOT_PRESENT = Result(-8)
		
		val ERROR_INCOMPATIBLE_DRIVER = Result(-9)
		
		val ERROR_TOO_MANY_OBJECTS = Result(-10)
		
		val ERROR_FORMAT_NOT_SUPPORTED = Result(-11)
		
		val ERROR_FRAGMENTED_POOL = Result(-12)
		
		val ERROR_UNKNOWN = Result(-13)
		
		val ERROR_OUT_OF_POOL_MEMORY = Result(-1000069000)
		
		val ERROR_INVALID_EXTERNAL_HANDLE = Result(-1000072003)
		
		val ERROR_FRAGMENTATION = Result(-1000161000)
		
		val ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS = Result(-1000257000)
		
		val ERROR_SURFACE_LOST = Result(-1000000000)
		
		val ERROR_NATIVE_WINDOW_IN_USE = Result(-1000000001)
		
		val SUBOPTIMAL = Result(1000001003)
		
		val ERROR_OUT_OF_DATE = Result(-1000001004)
	
	}
	
	
	
	override fun toString() = when(value) {
		0 -> "SUCCESS"
		1 -> "NOT_READY"
		2 -> "TIMEOUT"
		3 -> "EVENT_SET"
		4 -> "EVENT_RESET"
		5 -> "INCOMPLETE"
		-1 -> "ERROR_OUT_OF_HOST_MEMORY"
		-2 -> "ERROR_OUT_OF_DEVICE_MEMORY"
		-3 -> "ERROR_INITIALIZATION_FAILED"
		-4 -> "ERROR_DEVICE_LOST"
		-5 -> "ERROR_MEMORY_MAP_FAILED"
		-6 -> "ERROR_LAYER_NOT_PRESENT"
		-7 -> "ERROR_EXTENSION_NOT_PRESENT"
		-8 -> "ERROR_FEATURE_NOT_PRESENT"
		-9 -> "ERROR_INCOMPATIBLE_DRIVER"
		-10 -> "ERROR_TOO_MANY_OBJECTS"
		-11 -> "ERROR_FORMAT_NOT_SUPPORTED"
		-12 -> "ERROR_FRAGMENTED_POOL"
		-13 -> "ERROR_UNKNOWN"
		-1000069000 -> "ERROR_OUT_OF_POOL_MEMORY"
		-1000072003 -> "ERROR_INVALID_EXTERNAL_HANDLE"
		-1000161000 -> "ERROR_FRAGMENTATION"
		-1000257000 -> "ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS"
		-1000000000 -> "ERROR_SURFACE_LOST"
		-1000000001 -> "ERROR_NATIVE_WINDOW_IN_USE"
		1000001003 -> "SUBOPTIMAL"
		-1000001004 -> "ERROR_OUT_OF_DATE"
		else -> "*INVALID*"
	}


}



/**
 *     // provided by VK_VERSION_1_0
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
 *         VK_OBJECT_TYPE_VIDEO_SESSION_KHR                = 1000023000
 *         VK_OBJECT_TYPE_VIDEO_SESSION_PARAMETERS_KHR     = 1000023001
 *         VK_OBJECT_TYPE_CU_MODULE_NVX                    = 1000029000
 *         VK_OBJECT_TYPE_CU_FUNCTION_NVX                  = 1000029001
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
 *         VK_OBJECT_TYPE_BUFFER_COLLECTION_FUCHSIA        = 1000366000
 *     }
 */
@Suppress("unused")
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
		else -> "*INVALID*"
	}


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkVendorId {
 *         VK_VENDOR_ID_VIV       = 0x10001
 *         VK_VENDOR_ID_VSI       = 0x10002
 *         VK_VENDOR_ID_KAZAN     = 0x10003
 *         VK_VENDOR_ID_CODEPLAY  = 0x10004
 *         VK_VENDOR_ID_MESA      = 0x10005
 *         VK_VENDOR_ID_POCL      = 0x10006
 *     }
 */
@Suppress("Unused")
enum class VendorId(val value: Int) {
	
	
	VIV(0x10001),
	
	VSI(0x10002),
	
	KAZAN(0x10003),
	
	CODEPLAY(0x10004),
	
	MESA(0x10005),
	
	POCL(0x10006);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkPipelineCacheHeaderVersion {
 *         VK_PIPELINE_CACHE_HEADER_VERSION_ONE  = 1
 *     }
 */
@Suppress("Unused")
enum class PipelineCacheHeaderVersion(val value: Int) {
	
	
	ONE(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkFormat {
 *         VK_FORMAT_UNDEFINED                                       = 0
 *         VK_FORMAT_R4G4_UNORM_PACK8                                = 1
 *         VK_FORMAT_R4G4B4A4_UNORM_PACK16                           = 2
 *         VK_FORMAT_B4G4R4A4_UNORM_PACK16                           = 3
 *         VK_FORMAT_R5G6B5_UNORM_PACK16                             = 4
 *         VK_FORMAT_B5G6R5_UNORM_PACK16                             = 5
 *         VK_FORMAT_R5G5B5A1_UNORM_PACK16                           = 6
 *         VK_FORMAT_B5G5R5A1_UNORM_PACK16                           = 7
 *         VK_FORMAT_A1R5G5B5_UNORM_PACK16                           = 8
 *         VK_FORMAT_R8_UNORM                                        = 9
 *         VK_FORMAT_R8_SNORM                                        = 10
 *         VK_FORMAT_R8_USCALED                                      = 11
 *         VK_FORMAT_R8_SSCALED                                      = 12
 *         VK_FORMAT_R8_UINT                                         = 13
 *         VK_FORMAT_R8_SINT                                         = 14
 *         VK_FORMAT_R8_SRGB                                         = 15
 *         VK_FORMAT_R8G8_UNORM                                      = 16
 *         VK_FORMAT_R8G8_SNORM                                      = 17
 *         VK_FORMAT_R8G8_USCALED                                    = 18
 *         VK_FORMAT_R8G8_SSCALED                                    = 19
 *         VK_FORMAT_R8G8_UINT                                       = 20
 *         VK_FORMAT_R8G8_SINT                                       = 21
 *         VK_FORMAT_R8G8_SRGB                                       = 22
 *         VK_FORMAT_R8G8B8_UNORM                                    = 23
 *         VK_FORMAT_R8G8B8_SNORM                                    = 24
 *         VK_FORMAT_R8G8B8_USCALED                                  = 25
 *         VK_FORMAT_R8G8B8_SSCALED                                  = 26
 *         VK_FORMAT_R8G8B8_UINT                                     = 27
 *         VK_FORMAT_R8G8B8_SINT                                     = 28
 *         VK_FORMAT_R8G8B8_SRGB                                     = 29
 *         VK_FORMAT_B8G8R8_UNORM                                    = 30
 *         VK_FORMAT_B8G8R8_SNORM                                    = 31
 *         VK_FORMAT_B8G8R8_USCALED                                  = 32
 *         VK_FORMAT_B8G8R8_SSCALED                                  = 33
 *         VK_FORMAT_B8G8R8_UINT                                     = 34
 *         VK_FORMAT_B8G8R8_SINT                                     = 35
 *         VK_FORMAT_B8G8R8_SRGB                                     = 36
 *         VK_FORMAT_R8G8B8A8_UNORM                                  = 37
 *         VK_FORMAT_R8G8B8A8_SNORM                                  = 38
 *         VK_FORMAT_R8G8B8A8_USCALED                                = 39
 *         VK_FORMAT_R8G8B8A8_SSCALED                                = 40
 *         VK_FORMAT_R8G8B8A8_UINT                                   = 41
 *         VK_FORMAT_R8G8B8A8_SINT                                   = 42
 *         VK_FORMAT_R8G8B8A8_SRGB                                   = 43
 *         VK_FORMAT_B8G8R8A8_UNORM                                  = 44
 *         VK_FORMAT_B8G8R8A8_SNORM                                  = 45
 *         VK_FORMAT_B8G8R8A8_USCALED                                = 46
 *         VK_FORMAT_B8G8R8A8_SSCALED                                = 47
 *         VK_FORMAT_B8G8R8A8_UINT                                   = 48
 *         VK_FORMAT_B8G8R8A8_SINT                                   = 49
 *         VK_FORMAT_B8G8R8A8_SRGB                                   = 50
 *         VK_FORMAT_A8B8G8R8_UNORM_PACK32                           = 51
 *         VK_FORMAT_A8B8G8R8_SNORM_PACK32                           = 52
 *         VK_FORMAT_A8B8G8R8_USCALED_PACK32                         = 53
 *         VK_FORMAT_A8B8G8R8_SSCALED_PACK32                         = 54
 *         VK_FORMAT_A8B8G8R8_UINT_PACK32                            = 55
 *         VK_FORMAT_A8B8G8R8_SINT_PACK32                            = 56
 *         VK_FORMAT_A8B8G8R8_SRGB_PACK32                            = 57
 *         VK_FORMAT_A2R10G10B10_UNORM_PACK32                        = 58
 *         VK_FORMAT_A2R10G10B10_SNORM_PACK32                        = 59
 *         VK_FORMAT_A2R10G10B10_USCALED_PACK32                      = 60
 *         VK_FORMAT_A2R10G10B10_SSCALED_PACK32                      = 61
 *         VK_FORMAT_A2R10G10B10_UINT_PACK32                         = 62
 *         VK_FORMAT_A2R10G10B10_SINT_PACK32                         = 63
 *         VK_FORMAT_A2B10G10R10_UNORM_PACK32                        = 64
 *         VK_FORMAT_A2B10G10R10_SNORM_PACK32                        = 65
 *         VK_FORMAT_A2B10G10R10_USCALED_PACK32                      = 66
 *         VK_FORMAT_A2B10G10R10_SSCALED_PACK32                      = 67
 *         VK_FORMAT_A2B10G10R10_UINT_PACK32                         = 68
 *         VK_FORMAT_A2B10G10R10_SINT_PACK32                         = 69
 *         VK_FORMAT_R16_UNORM                                       = 70
 *         VK_FORMAT_R16_SNORM                                       = 71
 *         VK_FORMAT_R16_USCALED                                     = 72
 *         VK_FORMAT_R16_SSCALED                                     = 73
 *         VK_FORMAT_R16_UINT                                        = 74
 *         VK_FORMAT_R16_SINT                                        = 75
 *         VK_FORMAT_R16_SFLOAT                                      = 76
 *         VK_FORMAT_R16G16_UNORM                                    = 77
 *         VK_FORMAT_R16G16_SNORM                                    = 78
 *         VK_FORMAT_R16G16_USCALED                                  = 79
 *         VK_FORMAT_R16G16_SSCALED                                  = 80
 *         VK_FORMAT_R16G16_UINT                                     = 81
 *         VK_FORMAT_R16G16_SINT                                     = 82
 *         VK_FORMAT_R16G16_SFLOAT                                   = 83
 *         VK_FORMAT_R16G16B16_UNORM                                 = 84
 *         VK_FORMAT_R16G16B16_SNORM                                 = 85
 *         VK_FORMAT_R16G16B16_USCALED                               = 86
 *         VK_FORMAT_R16G16B16_SSCALED                               = 87
 *         VK_FORMAT_R16G16B16_UINT                                  = 88
 *         VK_FORMAT_R16G16B16_SINT                                  = 89
 *         VK_FORMAT_R16G16B16_SFLOAT                                = 90
 *         VK_FORMAT_R16G16B16A16_UNORM                              = 91
 *         VK_FORMAT_R16G16B16A16_SNORM                              = 92
 *         VK_FORMAT_R16G16B16A16_USCALED                            = 93
 *         VK_FORMAT_R16G16B16A16_SSCALED                            = 94
 *         VK_FORMAT_R16G16B16A16_UINT                               = 95
 *         VK_FORMAT_R16G16B16A16_SINT                               = 96
 *         VK_FORMAT_R16G16B16A16_SFLOAT                             = 97
 *         VK_FORMAT_R32_UINT                                        = 98
 *         VK_FORMAT_R32_SINT                                        = 99
 *         VK_FORMAT_R32_SFLOAT                                      = 100
 *         VK_FORMAT_R32G32_UINT                                     = 101
 *         VK_FORMAT_R32G32_SINT                                     = 102
 *         VK_FORMAT_R32G32_SFLOAT                                   = 103
 *         VK_FORMAT_R32G32B32_UINT                                  = 104
 *         VK_FORMAT_R32G32B32_SINT                                  = 105
 *         VK_FORMAT_R32G32B32_SFLOAT                                = 106
 *         VK_FORMAT_R32G32B32A32_UINT                               = 107
 *         VK_FORMAT_R32G32B32A32_SINT                               = 108
 *         VK_FORMAT_R32G32B32A32_SFLOAT                             = 109
 *         VK_FORMAT_R64_UINT                                        = 110
 *         VK_FORMAT_R64_SINT                                        = 111
 *         VK_FORMAT_R64_SFLOAT                                      = 112
 *         VK_FORMAT_R64G64_UINT                                     = 113
 *         VK_FORMAT_R64G64_SINT                                     = 114
 *         VK_FORMAT_R64G64_SFLOAT                                   = 115
 *         VK_FORMAT_R64G64B64_UINT                                  = 116
 *         VK_FORMAT_R64G64B64_SINT                                  = 117
 *         VK_FORMAT_R64G64B64_SFLOAT                                = 118
 *         VK_FORMAT_R64G64B64A64_UINT                               = 119
 *         VK_FORMAT_R64G64B64A64_SINT                               = 120
 *         VK_FORMAT_R64G64B64A64_SFLOAT                             = 121
 *         VK_FORMAT_B10G11R11_UFLOAT_PACK32                         = 122
 *         VK_FORMAT_E5B9G9R9_UFLOAT_PACK32                          = 123
 *         VK_FORMAT_D16_UNORM                                       = 124
 *         VK_FORMAT_X8_D24_UNORM_PACK32                             = 125
 *         VK_FORMAT_D32_SFLOAT                                      = 126
 *         VK_FORMAT_S8_UINT                                         = 127
 *         VK_FORMAT_D16_UNORM_S8_UINT                               = 128
 *         VK_FORMAT_D24_UNORM_S8_UINT                               = 129
 *         VK_FORMAT_D32_SFLOAT_S8_UINT                              = 130
 *         VK_FORMAT_BC1_RGB_UNORM_BLOCK                             = 131
 *         VK_FORMAT_BC1_RGB_SRGB_BLOCK                              = 132
 *         VK_FORMAT_BC1_RGBA_UNORM_BLOCK                            = 133
 *         VK_FORMAT_BC1_RGBA_SRGB_BLOCK                             = 134
 *         VK_FORMAT_BC2_UNORM_BLOCK                                 = 135
 *         VK_FORMAT_BC2_SRGB_BLOCK                                  = 136
 *         VK_FORMAT_BC3_UNORM_BLOCK                                 = 137
 *         VK_FORMAT_BC3_SRGB_BLOCK                                  = 138
 *         VK_FORMAT_BC4_UNORM_BLOCK                                 = 139
 *         VK_FORMAT_BC4_SNORM_BLOCK                                 = 140
 *         VK_FORMAT_BC5_UNORM_BLOCK                                 = 141
 *         VK_FORMAT_BC5_SNORM_BLOCK                                 = 142
 *         VK_FORMAT_BC6H_UFLOAT_BLOCK                               = 143
 *         VK_FORMAT_BC6H_SFLOAT_BLOCK                               = 144
 *         VK_FORMAT_BC7_UNORM_BLOCK                                 = 145
 *         VK_FORMAT_BC7_SRGB_BLOCK                                  = 146
 *         VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK                         = 147
 *         VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK                          = 148
 *         VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK                       = 149
 *         VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK                        = 150
 *         VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK                       = 151
 *         VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK                        = 152
 *         VK_FORMAT_EAC_R11_UNORM_BLOCK                             = 153
 *         VK_FORMAT_EAC_R11_SNORM_BLOCK                             = 154
 *         VK_FORMAT_EAC_R11G11_UNORM_BLOCK                          = 155
 *         VK_FORMAT_EAC_R11G11_SNORM_BLOCK                          = 156
 *         VK_FORMAT_ASTC_4x4_UNORM_BLOCK                            = 157
 *         VK_FORMAT_ASTC_4x4_SRGB_BLOCK                             = 158
 *         VK_FORMAT_ASTC_5x4_UNORM_BLOCK                            = 159
 *         VK_FORMAT_ASTC_5x4_SRGB_BLOCK                             = 160
 *         VK_FORMAT_ASTC_5x5_UNORM_BLOCK                            = 161
 *         VK_FORMAT_ASTC_5x5_SRGB_BLOCK                             = 162
 *         VK_FORMAT_ASTC_6x5_UNORM_BLOCK                            = 163
 *         VK_FORMAT_ASTC_6x5_SRGB_BLOCK                             = 164
 *         VK_FORMAT_ASTC_6x6_UNORM_BLOCK                            = 165
 *         VK_FORMAT_ASTC_6x6_SRGB_BLOCK                             = 166
 *         VK_FORMAT_ASTC_8x5_UNORM_BLOCK                            = 167
 *         VK_FORMAT_ASTC_8x5_SRGB_BLOCK                             = 168
 *         VK_FORMAT_ASTC_8x6_UNORM_BLOCK                            = 169
 *         VK_FORMAT_ASTC_8x6_SRGB_BLOCK                             = 170
 *         VK_FORMAT_ASTC_8x8_UNORM_BLOCK                            = 171
 *         VK_FORMAT_ASTC_8x8_SRGB_BLOCK                             = 172
 *         VK_FORMAT_ASTC_10x5_UNORM_BLOCK                           = 173
 *         VK_FORMAT_ASTC_10x5_SRGB_BLOCK                            = 174
 *         VK_FORMAT_ASTC_10x6_UNORM_BLOCK                           = 175
 *         VK_FORMAT_ASTC_10x6_SRGB_BLOCK                            = 176
 *         VK_FORMAT_ASTC_10x8_UNORM_BLOCK                           = 177
 *         VK_FORMAT_ASTC_10x8_SRGB_BLOCK                            = 178
 *         VK_FORMAT_ASTC_10x10_UNORM_BLOCK                          = 179
 *         VK_FORMAT_ASTC_10x10_SRGB_BLOCK                           = 180
 *         VK_FORMAT_ASTC_12x10_UNORM_BLOCK                          = 181
 *         VK_FORMAT_ASTC_12x10_SRGB_BLOCK                           = 182
 *         VK_FORMAT_ASTC_12x12_UNORM_BLOCK                          = 183
 *         VK_FORMAT_ASTC_12x12_SRGB_BLOCK                           = 184
 *         VK_FORMAT_G8B8G8R8_422_UNORM                              = 1000156000
 *         VK_FORMAT_B8G8R8G8_422_UNORM                              = 1000156001
 *         VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM                       = 1000156002
 *         VK_FORMAT_G8_B8R8_2PLANE_420_UNORM                        = 1000156003
 *         VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM                       = 1000156004
 *         VK_FORMAT_G8_B8R8_2PLANE_422_UNORM                        = 1000156005
 *         VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM                       = 1000156006
 *         VK_FORMAT_R10X6_UNORM_PACK16                              = 1000156007
 *         VK_FORMAT_R10X6G10X6_UNORM_2PACK16                        = 1000156008
 *         VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16              = 1000156009
 *         VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16          = 1000156010
 *         VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16          = 1000156011
 *         VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16      = 1000156012
 *         VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16       = 1000156013
 *         VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16      = 1000156014
 *         VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16       = 1000156015
 *         VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16      = 1000156016
 *         VK_FORMAT_R12X4_UNORM_PACK16                              = 1000156017
 *         VK_FORMAT_R12X4G12X4_UNORM_2PACK16                        = 1000156018
 *         VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16              = 1000156019
 *         VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16          = 1000156020
 *         VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16          = 1000156021
 *         VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16      = 1000156022
 *         VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16       = 1000156023
 *         VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16      = 1000156024
 *         VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16       = 1000156025
 *         VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16      = 1000156026
 *         VK_FORMAT_G16B16G16R16_422_UNORM                          = 1000156027
 *         VK_FORMAT_B16G16R16G16_422_UNORM                          = 1000156028
 *         VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM                    = 1000156029
 *         VK_FORMAT_G16_B16R16_2PLANE_420_UNORM                     = 1000156030
 *         VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM                    = 1000156031
 *         VK_FORMAT_G16_B16R16_2PLANE_422_UNORM                     = 1000156032
 *         VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM                    = 1000156033
 *         VK_FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG                     = 1000054000
 *         VK_FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG                     = 1000054001
 *         VK_FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG                     = 1000054002
 *         VK_FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG                     = 1000054003
 *         VK_FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG                      = 1000054004
 *         VK_FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG                      = 1000054005
 *         VK_FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG                      = 1000054006
 *         VK_FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG                      = 1000054007
 *         VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK_EXT                       = 1000066000
 *         VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK_EXT                       = 1000066001
 *         VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK_EXT                       = 1000066002
 *         VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK_EXT                       = 1000066003
 *         VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK_EXT                       = 1000066004
 *         VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK_EXT                       = 1000066005
 *         VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK_EXT                       = 1000066006
 *         VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK_EXT                       = 1000066007
 *         VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK_EXT                      = 1000066008
 *         VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK_EXT                      = 1000066009
 *         VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK_EXT                      = 1000066010
 *         VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK_EXT                     = 1000066011
 *         VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK_EXT                     = 1000066012
 *         VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK_EXT                     = 1000066013
 *         VK_FORMAT_G8B8G8R8_422_UNORM_KHR                          = 1000156000
 *         VK_FORMAT_B8G8R8G8_422_UNORM_KHR                          = 1000156001
 *         VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM_KHR                   = 1000156002
 *         VK_FORMAT_G8_B8R8_2PLANE_420_UNORM_KHR                    = 1000156003
 *         VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM_KHR                   = 1000156004
 *         VK_FORMAT_G8_B8R8_2PLANE_422_UNORM_KHR                    = 1000156005
 *         VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM_KHR                   = 1000156006
 *         VK_FORMAT_R10X6_UNORM_PACK16_KHR                          = 1000156007
 *         VK_FORMAT_R10X6G10X6_UNORM_2PACK16_KHR                    = 1000156008
 *         VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR          = 1000156009
 *         VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR      = 1000156010
 *         VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR      = 1000156011
 *         VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR  = 1000156012
 *         VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR   = 1000156013
 *         VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR  = 1000156014
 *         VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR   = 1000156015
 *         VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR  = 1000156016
 *         VK_FORMAT_R12X4_UNORM_PACK16_KHR                          = 1000156017
 *         VK_FORMAT_R12X4G12X4_UNORM_2PACK16_KHR                    = 1000156018
 *         VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR          = 1000156019
 *         VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR      = 1000156020
 *         VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR      = 1000156021
 *         VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR  = 1000156022
 *         VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR   = 1000156023
 *         VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR  = 1000156024
 *         VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR   = 1000156025
 *         VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR  = 1000156026
 *         VK_FORMAT_G16B16G16R16_422_UNORM_KHR                      = 1000156027
 *         VK_FORMAT_B16G16R16G16_422_UNORM_KHR                      = 1000156028
 *         VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM_KHR                = 1000156029
 *         VK_FORMAT_G16_B16R16_2PLANE_420_UNORM_KHR                 = 1000156030
 *         VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM_KHR                = 1000156031
 *         VK_FORMAT_G16_B16R16_2PLANE_422_UNORM_KHR                 = 1000156032
 *         VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM_KHR                = 1000156033
 *         VK_FORMAT_ASTC_3x3x3_UNORM_BLOCK_EXT                      = 1000288000
 *         VK_FORMAT_ASTC_3x3x3_SRGB_BLOCK_EXT                       = 1000288001
 *         VK_FORMAT_ASTC_3x3x3_SFLOAT_BLOCK_EXT                     = 1000288002
 *         VK_FORMAT_ASTC_4x3x3_UNORM_BLOCK_EXT                      = 1000288003
 *         VK_FORMAT_ASTC_4x3x3_SRGB_BLOCK_EXT                       = 1000288004
 *         VK_FORMAT_ASTC_4x3x3_SFLOAT_BLOCK_EXT                     = 1000288005
 *         VK_FORMAT_ASTC_4x4x3_UNORM_BLOCK_EXT                      = 1000288006
 *         VK_FORMAT_ASTC_4x4x3_SRGB_BLOCK_EXT                       = 1000288007
 *         VK_FORMAT_ASTC_4x4x3_SFLOAT_BLOCK_EXT                     = 1000288008
 *         VK_FORMAT_ASTC_4x4x4_UNORM_BLOCK_EXT                      = 1000288009
 *         VK_FORMAT_ASTC_4x4x4_SRGB_BLOCK_EXT                       = 1000288010
 *         VK_FORMAT_ASTC_4x4x4_SFLOAT_BLOCK_EXT                     = 1000288011
 *         VK_FORMAT_ASTC_5x4x4_UNORM_BLOCK_EXT                      = 1000288012
 *         VK_FORMAT_ASTC_5x4x4_SRGB_BLOCK_EXT                       = 1000288013
 *         VK_FORMAT_ASTC_5x4x4_SFLOAT_BLOCK_EXT                     = 1000288014
 *         VK_FORMAT_ASTC_5x5x4_UNORM_BLOCK_EXT                      = 1000288015
 *         VK_FORMAT_ASTC_5x5x4_SRGB_BLOCK_EXT                       = 1000288016
 *         VK_FORMAT_ASTC_5x5x4_SFLOAT_BLOCK_EXT                     = 1000288017
 *         VK_FORMAT_ASTC_5x5x5_UNORM_BLOCK_EXT                      = 1000288018
 *         VK_FORMAT_ASTC_5x5x5_SRGB_BLOCK_EXT                       = 1000288019
 *         VK_FORMAT_ASTC_5x5x5_SFLOAT_BLOCK_EXT                     = 1000288020
 *         VK_FORMAT_ASTC_6x5x5_UNORM_BLOCK_EXT                      = 1000288021
 *         VK_FORMAT_ASTC_6x5x5_SRGB_BLOCK_EXT                       = 1000288022
 *         VK_FORMAT_ASTC_6x5x5_SFLOAT_BLOCK_EXT                     = 1000288023
 *         VK_FORMAT_ASTC_6x6x5_UNORM_BLOCK_EXT                      = 1000288024
 *         VK_FORMAT_ASTC_6x6x5_SRGB_BLOCK_EXT                       = 1000288025
 *         VK_FORMAT_ASTC_6x6x5_SFLOAT_BLOCK_EXT                     = 1000288026
 *         VK_FORMAT_ASTC_6x6x6_UNORM_BLOCK_EXT                      = 1000288027
 *         VK_FORMAT_ASTC_6x6x6_SRGB_BLOCK_EXT                       = 1000288028
 *         VK_FORMAT_ASTC_6x6x6_SFLOAT_BLOCK_EXT                     = 1000288029
 *         VK_FORMAT_G8_B8R8_2PLANE_444_UNORM_EXT                    = 1000330000
 *         VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16_EXT   = 1000330001
 *         VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16_EXT   = 1000330002
 *         VK_FORMAT_G16_B16R16_2PLANE_444_UNORM_EXT                 = 1000330003
 *         VK_FORMAT_A4R4G4B4_UNORM_PACK16_EXT                       = 1000340000
 *         VK_FORMAT_A4B4G4R4_UNORM_PACK16_EXT                       = 1000340001
 *     }
 */
@Suppress("unused")
@JvmInline
value class Format(val value: Int) {
	
	
	companion object {
		
		val UNDEFINED = Format(0)
		
		val R4G4_UNORM_PACK8 = Format(1)
		
		val R4G4B4A4_UNORM_PACK16 = Format(2)
		
		val B4G4R4A4_UNORM_PACK16 = Format(3)
		
		val R5G6B5_UNORM_PACK16 = Format(4)
		
		val B5G6R5_UNORM_PACK16 = Format(5)
		
		val R5G5B5A1_UNORM_PACK16 = Format(6)
		
		val B5G5R5A1_UNORM_PACK16 = Format(7)
		
		val A1R5G5B5_UNORM_PACK16 = Format(8)
		
		val R8_UNORM = Format(9)
		
		val R8_SNORM = Format(10)
		
		val R8_USCALED = Format(11)
		
		val R8_SSCALED = Format(12)
		
		val R8_UINT = Format(13)
		
		val R8_SINT = Format(14)
		
		val R8_SRGB = Format(15)
		
		val R8G8_UNORM = Format(16)
		
		val R8G8_SNORM = Format(17)
		
		val R8G8_USCALED = Format(18)
		
		val R8G8_SSCALED = Format(19)
		
		val R8G8_UINT = Format(20)
		
		val R8G8_SINT = Format(21)
		
		val R8G8_SRGB = Format(22)
		
		val R8G8B8_UNORM = Format(23)
		
		val R8G8B8_SNORM = Format(24)
		
		val R8G8B8_USCALED = Format(25)
		
		val R8G8B8_SSCALED = Format(26)
		
		val R8G8B8_UINT = Format(27)
		
		val R8G8B8_SINT = Format(28)
		
		val R8G8B8_SRGB = Format(29)
		
		val B8G8R8_UNORM = Format(30)
		
		val B8G8R8_SNORM = Format(31)
		
		val B8G8R8_USCALED = Format(32)
		
		val B8G8R8_SSCALED = Format(33)
		
		val B8G8R8_UINT = Format(34)
		
		val B8G8R8_SINT = Format(35)
		
		val B8G8R8_SRGB = Format(36)
		
		val R8G8B8A8_UNORM = Format(37)
		
		val R8G8B8A8_SNORM = Format(38)
		
		val R8G8B8A8_USCALED = Format(39)
		
		val R8G8B8A8_SSCALED = Format(40)
		
		val R8G8B8A8_UINT = Format(41)
		
		val R8G8B8A8_SINT = Format(42)
		
		val R8G8B8A8_SRGB = Format(43)
		
		val B8G8R8A8_UNORM = Format(44)
		
		val B8G8R8A8_SNORM = Format(45)
		
		val B8G8R8A8_USCALED = Format(46)
		
		val B8G8R8A8_SSCALED = Format(47)
		
		val B8G8R8A8_UINT = Format(48)
		
		val B8G8R8A8_SINT = Format(49)
		
		val B8G8R8A8_SRGB = Format(50)
		
		val A8B8G8R8_UNORM_PACK32 = Format(51)
		
		val A8B8G8R8_SNORM_PACK32 = Format(52)
		
		val A8B8G8R8_USCALED_PACK32 = Format(53)
		
		val A8B8G8R8_SSCALED_PACK32 = Format(54)
		
		val A8B8G8R8_UINT_PACK32 = Format(55)
		
		val A8B8G8R8_SINT_PACK32 = Format(56)
		
		val A8B8G8R8_SRGB_PACK32 = Format(57)
		
		val A2R10G10B10_UNORM_PACK32 = Format(58)
		
		val A2R10G10B10_SNORM_PACK32 = Format(59)
		
		val A2R10G10B10_USCALED_PACK32 = Format(60)
		
		val A2R10G10B10_SSCALED_PACK32 = Format(61)
		
		val A2R10G10B10_UINT_PACK32 = Format(62)
		
		val A2R10G10B10_SINT_PACK32 = Format(63)
		
		val A2B10G10R10_UNORM_PACK32 = Format(64)
		
		val A2B10G10R10_SNORM_PACK32 = Format(65)
		
		val A2B10G10R10_USCALED_PACK32 = Format(66)
		
		val A2B10G10R10_SSCALED_PACK32 = Format(67)
		
		val A2B10G10R10_UINT_PACK32 = Format(68)
		
		val A2B10G10R10_SINT_PACK32 = Format(69)
		
		val R16_UNORM = Format(70)
		
		val R16_SNORM = Format(71)
		
		val R16_USCALED = Format(72)
		
		val R16_SSCALED = Format(73)
		
		val R16_UINT = Format(74)
		
		val R16_SINT = Format(75)
		
		val R16_SFLOAT = Format(76)
		
		val R16G16_UNORM = Format(77)
		
		val R16G16_SNORM = Format(78)
		
		val R16G16_USCALED = Format(79)
		
		val R16G16_SSCALED = Format(80)
		
		val R16G16_UINT = Format(81)
		
		val R16G16_SINT = Format(82)
		
		val R16G16_SFLOAT = Format(83)
		
		val R16G16B16_UNORM = Format(84)
		
		val R16G16B16_SNORM = Format(85)
		
		val R16G16B16_USCALED = Format(86)
		
		val R16G16B16_SSCALED = Format(87)
		
		val R16G16B16_UINT = Format(88)
		
		val R16G16B16_SINT = Format(89)
		
		val R16G16B16_SFLOAT = Format(90)
		
		val R16G16B16A16_UNORM = Format(91)
		
		val R16G16B16A16_SNORM = Format(92)
		
		val R16G16B16A16_USCALED = Format(93)
		
		val R16G16B16A16_SSCALED = Format(94)
		
		val R16G16B16A16_UINT = Format(95)
		
		val R16G16B16A16_SINT = Format(96)
		
		val R16G16B16A16_SFLOAT = Format(97)
		
		val R32_UINT = Format(98)
		
		val R32_SINT = Format(99)
		
		val R32_SFLOAT = Format(100)
		
		val R32G32_UINT = Format(101)
		
		val R32G32_SINT = Format(102)
		
		val R32G32_SFLOAT = Format(103)
		
		val R32G32B32_UINT = Format(104)
		
		val R32G32B32_SINT = Format(105)
		
		val R32G32B32_SFLOAT = Format(106)
		
		val R32G32B32A32_UINT = Format(107)
		
		val R32G32B32A32_SINT = Format(108)
		
		val R32G32B32A32_SFLOAT = Format(109)
		
		val R64_UINT = Format(110)
		
		val R64_SINT = Format(111)
		
		val R64_SFLOAT = Format(112)
		
		val R64G64_UINT = Format(113)
		
		val R64G64_SINT = Format(114)
		
		val R64G64_SFLOAT = Format(115)
		
		val R64G64B64_UINT = Format(116)
		
		val R64G64B64_SINT = Format(117)
		
		val R64G64B64_SFLOAT = Format(118)
		
		val R64G64B64A64_UINT = Format(119)
		
		val R64G64B64A64_SINT = Format(120)
		
		val R64G64B64A64_SFLOAT = Format(121)
		
		val B10G11R11_UFLOAT_PACK32 = Format(122)
		
		val E5B9G9R9_UFLOAT_PACK32 = Format(123)
		
		val D16_UNORM = Format(124)
		
		val X8_D24_UNORM_PACK32 = Format(125)
		
		val D32_SFLOAT = Format(126)
		
		val S8_UINT = Format(127)
		
		val D16_UNORM_S8_UINT = Format(128)
		
		val D24_UNORM_S8_UINT = Format(129)
		
		val D32_SFLOAT_S8_UINT = Format(130)
		
		val BC1_RGB_UNORM_BLOCK = Format(131)
		
		val BC1_RGB_SRGB_BLOCK = Format(132)
		
		val BC1_RGBA_UNORM_BLOCK = Format(133)
		
		val BC1_RGBA_SRGB_BLOCK = Format(134)
		
		val BC2_UNORM_BLOCK = Format(135)
		
		val BC2_SRGB_BLOCK = Format(136)
		
		val BC3_UNORM_BLOCK = Format(137)
		
		val BC3_SRGB_BLOCK = Format(138)
		
		val BC4_UNORM_BLOCK = Format(139)
		
		val BC4_SNORM_BLOCK = Format(140)
		
		val BC5_UNORM_BLOCK = Format(141)
		
		val BC5_SNORM_BLOCK = Format(142)
		
		val BC6H_UFLOAT_BLOCK = Format(143)
		
		val BC6H_SFLOAT_BLOCK = Format(144)
		
		val BC7_UNORM_BLOCK = Format(145)
		
		val BC7_SRGB_BLOCK = Format(146)
		
		val ETC2_R8G8B8_UNORM_BLOCK = Format(147)
		
		val ETC2_R8G8B8_SRGB_BLOCK = Format(148)
		
		val ETC2_R8G8B8A1_UNORM_BLOCK = Format(149)
		
		val ETC2_R8G8B8A1_SRGB_BLOCK = Format(150)
		
		val ETC2_R8G8B8A8_UNORM_BLOCK = Format(151)
		
		val ETC2_R8G8B8A8_SRGB_BLOCK = Format(152)
		
		val EAC_R11_UNORM_BLOCK = Format(153)
		
		val EAC_R11_SNORM_BLOCK = Format(154)
		
		val EAC_R11G11_UNORM_BLOCK = Format(155)
		
		val EAC_R11G11_SNORM_BLOCK = Format(156)
		
		val ASTC_4x4_UNORM_BLOCK = Format(157)
		
		val ASTC_4x4_SRGB_BLOCK = Format(158)
		
		val ASTC_5x4_UNORM_BLOCK = Format(159)
		
		val ASTC_5x4_SRGB_BLOCK = Format(160)
		
		val ASTC_5x5_UNORM_BLOCK = Format(161)
		
		val ASTC_5x5_SRGB_BLOCK = Format(162)
		
		val ASTC_6x5_UNORM_BLOCK = Format(163)
		
		val ASTC_6x5_SRGB_BLOCK = Format(164)
		
		val ASTC_6x6_UNORM_BLOCK = Format(165)
		
		val ASTC_6x6_SRGB_BLOCK = Format(166)
		
		val ASTC_8x5_UNORM_BLOCK = Format(167)
		
		val ASTC_8x5_SRGB_BLOCK = Format(168)
		
		val ASTC_8x6_UNORM_BLOCK = Format(169)
		
		val ASTC_8x6_SRGB_BLOCK = Format(170)
		
		val ASTC_8x8_UNORM_BLOCK = Format(171)
		
		val ASTC_8x8_SRGB_BLOCK = Format(172)
		
		val ASTC_10x5_UNORM_BLOCK = Format(173)
		
		val ASTC_10x5_SRGB_BLOCK = Format(174)
		
		val ASTC_10x6_UNORM_BLOCK = Format(175)
		
		val ASTC_10x6_SRGB_BLOCK = Format(176)
		
		val ASTC_10x8_UNORM_BLOCK = Format(177)
		
		val ASTC_10x8_SRGB_BLOCK = Format(178)
		
		val ASTC_10x10_UNORM_BLOCK = Format(179)
		
		val ASTC_10x10_SRGB_BLOCK = Format(180)
		
		val ASTC_12x10_UNORM_BLOCK = Format(181)
		
		val ASTC_12x10_SRGB_BLOCK = Format(182)
		
		val ASTC_12x12_UNORM_BLOCK = Format(183)
		
		val ASTC_12x12_SRGB_BLOCK = Format(184)
		
		val G8B8G8R8_422_UNORM = Format(1000156000)
		
		val B8G8R8G8_422_UNORM = Format(1000156001)
		
		val G8_B8_R8_3PLANE_420_UNORM = Format(1000156002)
		
		val G8_B8R8_2PLANE_420_UNORM = Format(1000156003)
		
		val G8_B8_R8_3PLANE_422_UNORM = Format(1000156004)
		
		val G8_B8R8_2PLANE_422_UNORM = Format(1000156005)
		
		val G8_B8_R8_3PLANE_444_UNORM = Format(1000156006)
		
		val R10X6_UNORM_PACK16 = Format(1000156007)
		
		val R10X6G10X6_UNORM_2PACK16 = Format(1000156008)
		
		val R10X6G10X6B10X6A10X6_UNORM_4PACK16 = Format(1000156009)
		
		val G10X6B10X6G10X6R10X6_422_UNORM_4PACK16 = Format(1000156010)
		
		val B10X6G10X6R10X6G10X6_422_UNORM_4PACK16 = Format(1000156011)
		
		val G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 = Format(1000156012)
		
		val G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16 = Format(1000156013)
		
		val G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 = Format(1000156014)
		
		val G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16 = Format(1000156015)
		
		val G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 = Format(1000156016)
		
		val R12X4_UNORM_PACK16 = Format(1000156017)
		
		val R12X4G12X4_UNORM_2PACK16 = Format(1000156018)
		
		val R12X4G12X4B12X4A12X4_UNORM_4PACK16 = Format(1000156019)
		
		val G12X4B12X4G12X4R12X4_422_UNORM_4PACK16 = Format(1000156020)
		
		val B12X4G12X4R12X4G12X4_422_UNORM_4PACK16 = Format(1000156021)
		
		val G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 = Format(1000156022)
		
		val G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16 = Format(1000156023)
		
		val G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 = Format(1000156024)
		
		val G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16 = Format(1000156025)
		
		val G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 = Format(1000156026)
		
		val G16B16G16R16_422_UNORM = Format(1000156027)
		
		val B16G16R16G16_422_UNORM = Format(1000156028)
		
		val G16_B16_R16_3PLANE_420_UNORM = Format(1000156029)
		
		val G16_B16R16_2PLANE_420_UNORM = Format(1000156030)
		
		val G16_B16_R16_3PLANE_422_UNORM = Format(1000156031)
		
		val G16_B16R16_2PLANE_422_UNORM = Format(1000156032)
		
		val G16_B16_R16_3PLANE_444_UNORM = Format(1000156033)
	
	}
	
	
	
	override fun toString() = when(value) {
		0 -> "UNDEFINED"
		1 -> "R4G4_UNORM_PACK8"
		2 -> "R4G4B4A4_UNORM_PACK16"
		3 -> "B4G4R4A4_UNORM_PACK16"
		4 -> "R5G6B5_UNORM_PACK16"
		5 -> "B5G6R5_UNORM_PACK16"
		6 -> "R5G5B5A1_UNORM_PACK16"
		7 -> "B5G5R5A1_UNORM_PACK16"
		8 -> "A1R5G5B5_UNORM_PACK16"
		9 -> "R8_UNORM"
		10 -> "R8_SNORM"
		11 -> "R8_USCALED"
		12 -> "R8_SSCALED"
		13 -> "R8_UINT"
		14 -> "R8_SINT"
		15 -> "R8_SRGB"
		16 -> "R8G8_UNORM"
		17 -> "R8G8_SNORM"
		18 -> "R8G8_USCALED"
		19 -> "R8G8_SSCALED"
		20 -> "R8G8_UINT"
		21 -> "R8G8_SINT"
		22 -> "R8G8_SRGB"
		23 -> "R8G8B8_UNORM"
		24 -> "R8G8B8_SNORM"
		25 -> "R8G8B8_USCALED"
		26 -> "R8G8B8_SSCALED"
		27 -> "R8G8B8_UINT"
		28 -> "R8G8B8_SINT"
		29 -> "R8G8B8_SRGB"
		30 -> "B8G8R8_UNORM"
		31 -> "B8G8R8_SNORM"
		32 -> "B8G8R8_USCALED"
		33 -> "B8G8R8_SSCALED"
		34 -> "B8G8R8_UINT"
		35 -> "B8G8R8_SINT"
		36 -> "B8G8R8_SRGB"
		37 -> "R8G8B8A8_UNORM"
		38 -> "R8G8B8A8_SNORM"
		39 -> "R8G8B8A8_USCALED"
		40 -> "R8G8B8A8_SSCALED"
		41 -> "R8G8B8A8_UINT"
		42 -> "R8G8B8A8_SINT"
		43 -> "R8G8B8A8_SRGB"
		44 -> "B8G8R8A8_UNORM"
		45 -> "B8G8R8A8_SNORM"
		46 -> "B8G8R8A8_USCALED"
		47 -> "B8G8R8A8_SSCALED"
		48 -> "B8G8R8A8_UINT"
		49 -> "B8G8R8A8_SINT"
		50 -> "B8G8R8A8_SRGB"
		51 -> "A8B8G8R8_UNORM_PACK32"
		52 -> "A8B8G8R8_SNORM_PACK32"
		53 -> "A8B8G8R8_USCALED_PACK32"
		54 -> "A8B8G8R8_SSCALED_PACK32"
		55 -> "A8B8G8R8_UINT_PACK32"
		56 -> "A8B8G8R8_SINT_PACK32"
		57 -> "A8B8G8R8_SRGB_PACK32"
		58 -> "A2R10G10B10_UNORM_PACK32"
		59 -> "A2R10G10B10_SNORM_PACK32"
		60 -> "A2R10G10B10_USCALED_PACK32"
		61 -> "A2R10G10B10_SSCALED_PACK32"
		62 -> "A2R10G10B10_UINT_PACK32"
		63 -> "A2R10G10B10_SINT_PACK32"
		64 -> "A2B10G10R10_UNORM_PACK32"
		65 -> "A2B10G10R10_SNORM_PACK32"
		66 -> "A2B10G10R10_USCALED_PACK32"
		67 -> "A2B10G10R10_SSCALED_PACK32"
		68 -> "A2B10G10R10_UINT_PACK32"
		69 -> "A2B10G10R10_SINT_PACK32"
		70 -> "R16_UNORM"
		71 -> "R16_SNORM"
		72 -> "R16_USCALED"
		73 -> "R16_SSCALED"
		74 -> "R16_UINT"
		75 -> "R16_SINT"
		76 -> "R16_SFLOAT"
		77 -> "R16G16_UNORM"
		78 -> "R16G16_SNORM"
		79 -> "R16G16_USCALED"
		80 -> "R16G16_SSCALED"
		81 -> "R16G16_UINT"
		82 -> "R16G16_SINT"
		83 -> "R16G16_SFLOAT"
		84 -> "R16G16B16_UNORM"
		85 -> "R16G16B16_SNORM"
		86 -> "R16G16B16_USCALED"
		87 -> "R16G16B16_SSCALED"
		88 -> "R16G16B16_UINT"
		89 -> "R16G16B16_SINT"
		90 -> "R16G16B16_SFLOAT"
		91 -> "R16G16B16A16_UNORM"
		92 -> "R16G16B16A16_SNORM"
		93 -> "R16G16B16A16_USCALED"
		94 -> "R16G16B16A16_SSCALED"
		95 -> "R16G16B16A16_UINT"
		96 -> "R16G16B16A16_SINT"
		97 -> "R16G16B16A16_SFLOAT"
		98 -> "R32_UINT"
		99 -> "R32_SINT"
		100 -> "R32_SFLOAT"
		101 -> "R32G32_UINT"
		102 -> "R32G32_SINT"
		103 -> "R32G32_SFLOAT"
		104 -> "R32G32B32_UINT"
		105 -> "R32G32B32_SINT"
		106 -> "R32G32B32_SFLOAT"
		107 -> "R32G32B32A32_UINT"
		108 -> "R32G32B32A32_SINT"
		109 -> "R32G32B32A32_SFLOAT"
		110 -> "R64_UINT"
		111 -> "R64_SINT"
		112 -> "R64_SFLOAT"
		113 -> "R64G64_UINT"
		114 -> "R64G64_SINT"
		115 -> "R64G64_SFLOAT"
		116 -> "R64G64B64_UINT"
		117 -> "R64G64B64_SINT"
		118 -> "R64G64B64_SFLOAT"
		119 -> "R64G64B64A64_UINT"
		120 -> "R64G64B64A64_SINT"
		121 -> "R64G64B64A64_SFLOAT"
		122 -> "B10G11R11_UFLOAT_PACK32"
		123 -> "E5B9G9R9_UFLOAT_PACK32"
		124 -> "D16_UNORM"
		125 -> "X8_D24_UNORM_PACK32"
		126 -> "D32_SFLOAT"
		127 -> "S8_UINT"
		128 -> "D16_UNORM_S8_UINT"
		129 -> "D24_UNORM_S8_UINT"
		130 -> "D32_SFLOAT_S8_UINT"
		131 -> "BC1_RGB_UNORM_BLOCK"
		132 -> "BC1_RGB_SRGB_BLOCK"
		133 -> "BC1_RGBA_UNORM_BLOCK"
		134 -> "BC1_RGBA_SRGB_BLOCK"
		135 -> "BC2_UNORM_BLOCK"
		136 -> "BC2_SRGB_BLOCK"
		137 -> "BC3_UNORM_BLOCK"
		138 -> "BC3_SRGB_BLOCK"
		139 -> "BC4_UNORM_BLOCK"
		140 -> "BC4_SNORM_BLOCK"
		141 -> "BC5_UNORM_BLOCK"
		142 -> "BC5_SNORM_BLOCK"
		143 -> "BC6H_UFLOAT_BLOCK"
		144 -> "BC6H_SFLOAT_BLOCK"
		145 -> "BC7_UNORM_BLOCK"
		146 -> "BC7_SRGB_BLOCK"
		147 -> "ETC2_R8G8B8_UNORM_BLOCK"
		148 -> "ETC2_R8G8B8_SRGB_BLOCK"
		149 -> "ETC2_R8G8B8A1_UNORM_BLOCK"
		150 -> "ETC2_R8G8B8A1_SRGB_BLOCK"
		151 -> "ETC2_R8G8B8A8_UNORM_BLOCK"
		152 -> "ETC2_R8G8B8A8_SRGB_BLOCK"
		153 -> "EAC_R11_UNORM_BLOCK"
		154 -> "EAC_R11_SNORM_BLOCK"
		155 -> "EAC_R11G11_UNORM_BLOCK"
		156 -> "EAC_R11G11_SNORM_BLOCK"
		157 -> "ASTC_4x4_UNORM_BLOCK"
		158 -> "ASTC_4x4_SRGB_BLOCK"
		159 -> "ASTC_5x4_UNORM_BLOCK"
		160 -> "ASTC_5x4_SRGB_BLOCK"
		161 -> "ASTC_5x5_UNORM_BLOCK"
		162 -> "ASTC_5x5_SRGB_BLOCK"
		163 -> "ASTC_6x5_UNORM_BLOCK"
		164 -> "ASTC_6x5_SRGB_BLOCK"
		165 -> "ASTC_6x6_UNORM_BLOCK"
		166 -> "ASTC_6x6_SRGB_BLOCK"
		167 -> "ASTC_8x5_UNORM_BLOCK"
		168 -> "ASTC_8x5_SRGB_BLOCK"
		169 -> "ASTC_8x6_UNORM_BLOCK"
		170 -> "ASTC_8x6_SRGB_BLOCK"
		171 -> "ASTC_8x8_UNORM_BLOCK"
		172 -> "ASTC_8x8_SRGB_BLOCK"
		173 -> "ASTC_10x5_UNORM_BLOCK"
		174 -> "ASTC_10x5_SRGB_BLOCK"
		175 -> "ASTC_10x6_UNORM_BLOCK"
		176 -> "ASTC_10x6_SRGB_BLOCK"
		177 -> "ASTC_10x8_UNORM_BLOCK"
		178 -> "ASTC_10x8_SRGB_BLOCK"
		179 -> "ASTC_10x10_UNORM_BLOCK"
		180 -> "ASTC_10x10_SRGB_BLOCK"
		181 -> "ASTC_12x10_UNORM_BLOCK"
		182 -> "ASTC_12x10_SRGB_BLOCK"
		183 -> "ASTC_12x12_UNORM_BLOCK"
		184 -> "ASTC_12x12_SRGB_BLOCK"
		1000156000 -> "G8B8G8R8_422_UNORM"
		1000156001 -> "B8G8R8G8_422_UNORM"
		1000156002 -> "G8_B8_R8_3PLANE_420_UNORM"
		1000156003 -> "G8_B8R8_2PLANE_420_UNORM"
		1000156004 -> "G8_B8_R8_3PLANE_422_UNORM"
		1000156005 -> "G8_B8R8_2PLANE_422_UNORM"
		1000156006 -> "G8_B8_R8_3PLANE_444_UNORM"
		1000156007 -> "R10X6_UNORM_PACK16"
		1000156008 -> "R10X6G10X6_UNORM_2PACK16"
		1000156009 -> "R10X6G10X6B10X6A10X6_UNORM_4PACK16"
		1000156010 -> "G10X6B10X6G10X6R10X6_422_UNORM_4PACK16"
		1000156011 -> "B10X6G10X6R10X6G10X6_422_UNORM_4PACK16"
		1000156012 -> "G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16"
		1000156013 -> "G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16"
		1000156014 -> "G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16"
		1000156015 -> "G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16"
		1000156016 -> "G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16"
		1000156017 -> "R12X4_UNORM_PACK16"
		1000156018 -> "R12X4G12X4_UNORM_2PACK16"
		1000156019 -> "R12X4G12X4B12X4A12X4_UNORM_4PACK16"
		1000156020 -> "G12X4B12X4G12X4R12X4_422_UNORM_4PACK16"
		1000156021 -> "B12X4G12X4R12X4G12X4_422_UNORM_4PACK16"
		1000156022 -> "G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16"
		1000156023 -> "G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16"
		1000156024 -> "G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16"
		1000156025 -> "G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16"
		1000156026 -> "G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16"
		1000156027 -> "G16B16G16R16_422_UNORM"
		1000156028 -> "B16G16R16G16_422_UNORM"
		1000156029 -> "G16_B16_R16_3PLANE_420_UNORM"
		1000156030 -> "G16_B16R16_2PLANE_420_UNORM"
		1000156031 -> "G16_B16_R16_3PLANE_422_UNORM"
		1000156032 -> "G16_B16R16_2PLANE_422_UNORM"
		1000156033 -> "G16_B16_R16_3PLANE_444_UNORM"
		else -> "*INVALID*"
	}


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkImageTiling {
 *         VK_IMAGE_TILING_OPTIMAL                  = 0
 *         VK_IMAGE_TILING_LINEAR                   = 1
 *         VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT  = 1000158000
 *     }
 */
@Suppress("Unused")
enum class ImageTiling(val value: Int) {
	
	
	OPTIMAL(0),
	
	LINEAR(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkImageType {
 *         VK_IMAGE_TYPE_1D  = 0
 *         VK_IMAGE_TYPE_2D  = 1
 *         VK_IMAGE_TYPE_3D  = 2
 *     }
 */
@Suppress("Unused")
enum class ImageType(val value: Int) {
	
	
	_1D(0),
	
	_2D(1),
	
	_3D(2);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkInternalAllocationType {
 *         VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE  = 0
 *     }
 */
@Suppress("Unused")
enum class InternalAllocationType(val value: Int) {
	
	
	EXECUTABLE(0);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkPhysicalDeviceType {
 *         VK_PHYSICAL_DEVICE_TYPE_OTHER           = 0
 *         VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU  = 1
 *         VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU    = 2
 *         VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU     = 3
 *         VK_PHYSICAL_DEVICE_TYPE_CPU             = 4
 *     }
 */
@Suppress("Unused")
enum class PhysicalDeviceType(val value: Int) {
	
	
	OTHER(0),
	
	INTEGRATED_GPU(1),
	
	DISCRETE_GPU(2),
	
	VIRTUAL_GPU(3),
	
	CPU(4);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkSystemAllocationScope {
 *         VK_SYSTEM_ALLOCATION_SCOPE_COMMAND   = 0
 *         VK_SYSTEM_ALLOCATION_SCOPE_OBJECT    = 1
 *         VK_SYSTEM_ALLOCATION_SCOPE_CACHE     = 2
 *         VK_SYSTEM_ALLOCATION_SCOPE_DEVICE    = 3
 *         VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE  = 4
 *     }
 */
@Suppress("Unused")
enum class SystemAllocationScope(val value: Int) {
	
	
	COMMAND(0),
	
	OBJECT(1),
	
	CACHE(2),
	
	DEVICE(3),
	
	INSTANCE(4);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkQueryType {
 *         VK_QUERY_TYPE_OCCLUSION                                      = 0
 *         VK_QUERY_TYPE_PIPELINE_STATISTICS                            = 1
 *         VK_QUERY_TYPE_TIMESTAMP                                      = 2
 *         VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR                         = 1000023000
 *         VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT                  = 1000028004
 *         VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR                          = 1000116000
 *         VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR      = 1000150000
 *         VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR  = 1000150001
 *         VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV       = 1000165000
 *         VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL                        = 1000210000
 *         VK_QUERY_TYPE_VIDEO_ENCODE_BITSTREAM_BUFFER_RANGE_KHR        = 1000299000
 *     }
 */
@Suppress("Unused")
enum class QueryType(val value: Int) {
	
	
	OCCLUSION(0),
	
	PIPELINE_STATISTICS(1),
	
	TIMESTAMP(2);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkSharingMode {
 *         VK_SHARING_MODE_EXCLUSIVE   = 0
 *         VK_SHARING_MODE_CONCURRENT  = 1
 *     }
 */
@Suppress("Unused")
enum class SharingMode(val value: Int) {
	
	
	EXCLUSIVE(0),
	
	CONCURRENT(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkImageLayout {
 *         VK_IMAGE_LAYOUT_UNDEFINED                                       = 0
 *         VK_IMAGE_LAYOUT_GENERAL                                         = 1
 *         VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL                        = 2
 *         VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL                = 3
 *         VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL                 = 4
 *         VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL                        = 5
 *         VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL                            = 6
 *         VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL                            = 7
 *         VK_IMAGE_LAYOUT_PREINITIALIZED                                  = 8
 *         VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL      = 1000117000
 *         VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL      = 1000117001
 *         VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL                        = 1000241000
 *         VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL                         = 1000241001
 *         VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL                      = 1000241002
 *         VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL                       = 1000241003
 *         VK_IMAGE_LAYOUT_PRESENT_SRC_KHR                                 = 1000001002
 *         VK_IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR                            = 1000024000
 *         VK_IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR                            = 1000024001
 *         VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR                            = 1000024002
 *         VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR                              = 1000111000
 *         VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR  = 1000117000
 *         VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR  = 1000117001
 *         VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV                         = 1000164003
 *         VK_IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT                = 1000218000
 *         VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR    = 1000164003
 *         VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL_KHR                    = 1000241000
 *         VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR                     = 1000241001
 *         VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL_KHR                  = 1000241002
 *         VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL_KHR                   = 1000241003
 *         VK_IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR                            = 1000299000
 *         VK_IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR                            = 1000299001
 *         VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR                            = 1000299002
 *         VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR                           = 1000314000
 *         VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR                          = 1000314001
 *     }
 */
@Suppress("Unused")
enum class ImageLayout(val value: Int) {
	
	
	UNDEFINED(0),
	
	GENERAL(1),
	
	COLOR_ATTACHMENT_OPTIMAL(2),
	
	DEPTH_STENCIL_ATTACHMENT_OPTIMAL(3),
	
	DEPTH_STENCIL_READ_ONLY_OPTIMAL(4),
	
	SHADER_READ_ONLY_OPTIMAL(5),
	
	TRANSFER_SRC_OPTIMAL(6),
	
	TRANSFER_DST_OPTIMAL(7),
	
	PREINITIALIZED(8),
	
	DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL(1000117000),
	
	DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL(1000117001),
	
	DEPTH_ATTACHMENT_OPTIMAL(1000241000),
	
	DEPTH_READ_ONLY_OPTIMAL(1000241001),
	
	STENCIL_ATTACHMENT_OPTIMAL(1000241002),
	
	STENCIL_READ_ONLY_OPTIMAL(1000241003),
	
	PRESENT_SRC(1000001002);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkComponentSwizzle {
 *         VK_COMPONENT_SWIZZLE_IDENTITY  = 0
 *         VK_COMPONENT_SWIZZLE_ZERO      = 1
 *         VK_COMPONENT_SWIZZLE_ONE       = 2
 *         VK_COMPONENT_SWIZZLE_R         = 3
 *         VK_COMPONENT_SWIZZLE_G         = 4
 *         VK_COMPONENT_SWIZZLE_B         = 5
 *         VK_COMPONENT_SWIZZLE_A         = 6
 *     }
 */
@Suppress("Unused")
enum class ComponentSwizzle(val value: Int) {
	
	
	IDENTITY(0),
	
	ZERO(1),
	
	ONE(2),
	
	R(3),
	
	G(4),
	
	B(5),
	
	A(6);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkImageViewType {
 *         VK_IMAGE_VIEW_TYPE_1D          = 0
 *         VK_IMAGE_VIEW_TYPE_2D          = 1
 *         VK_IMAGE_VIEW_TYPE_3D          = 2
 *         VK_IMAGE_VIEW_TYPE_CUBE        = 3
 *         VK_IMAGE_VIEW_TYPE_1D_ARRAY    = 4
 *         VK_IMAGE_VIEW_TYPE_2D_ARRAY    = 5
 *         VK_IMAGE_VIEW_TYPE_CUBE_ARRAY  = 6
 *     }
 */
@Suppress("Unused")
enum class ImageViewType(val value: Int) {
	
	
	_1D(0),
	
	_2D(1),
	
	_3D(2),
	
	CUBE(3),
	
	_1D_ARRAY(4),
	
	_2D_ARRAY(5),
	
	CUBE_ARRAY(6);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkBlendFactor {
 *         VK_BLEND_FACTOR_ZERO                      = 0
 *         VK_BLEND_FACTOR_ONE                       = 1
 *         VK_BLEND_FACTOR_SRC_COLOR                 = 2
 *         VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR       = 3
 *         VK_BLEND_FACTOR_DST_COLOR                 = 4
 *         VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR       = 5
 *         VK_BLEND_FACTOR_SRC_ALPHA                 = 6
 *         VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA       = 7
 *         VK_BLEND_FACTOR_DST_ALPHA                 = 8
 *         VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA       = 9
 *         VK_BLEND_FACTOR_CONSTANT_COLOR            = 10
 *         VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR  = 11
 *         VK_BLEND_FACTOR_CONSTANT_ALPHA            = 12
 *         VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA  = 13
 *         VK_BLEND_FACTOR_SRC_ALPHA_SATURATE        = 14
 *         VK_BLEND_FACTOR_SRC1_COLOR                = 15
 *         VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR      = 16
 *         VK_BLEND_FACTOR_SRC1_ALPHA                = 17
 *         VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA      = 18
 *     }
 */
@Suppress("Unused")
enum class BlendFactor(val value: Int) {
	
	
	ZERO(0),
	
	ONE(1),
	
	SRC_COLOR(2),
	
	ONE_MINUS_SRC_COLOR(3),
	
	DST_COLOR(4),
	
	ONE_MINUS_DST_COLOR(5),
	
	SRC_ALPHA(6),
	
	ONE_MINUS_SRC_ALPHA(7),
	
	DST_ALPHA(8),
	
	ONE_MINUS_DST_ALPHA(9),
	
	CONSTANT_COLOR(10),
	
	ONE_MINUS_CONSTANT_COLOR(11),
	
	CONSTANT_ALPHA(12),
	
	ONE_MINUS_CONSTANT_ALPHA(13),
	
	SRC_ALPHA_SATURATE(14),
	
	SRC1_COLOR(15),
	
	ONE_MINUS_SRC1_COLOR(16),
	
	SRC1_ALPHA(17),
	
	ONE_MINUS_SRC1_ALPHA(18);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkBlendOp {
 *         VK_BLEND_OP_ADD                     = 0
 *         VK_BLEND_OP_SUBTRACT                = 1
 *         VK_BLEND_OP_REVERSE_SUBTRACT        = 2
 *         VK_BLEND_OP_MIN                     = 3
 *         VK_BLEND_OP_MAX                     = 4
 *         VK_BLEND_OP_ZERO_EXT                = 1000148000
 *         VK_BLEND_OP_SRC_EXT                 = 1000148001
 *         VK_BLEND_OP_DST_EXT                 = 1000148002
 *         VK_BLEND_OP_SRC_OVER_EXT            = 1000148003
 *         VK_BLEND_OP_DST_OVER_EXT            = 1000148004
 *         VK_BLEND_OP_SRC_IN_EXT              = 1000148005
 *         VK_BLEND_OP_DST_IN_EXT              = 1000148006
 *         VK_BLEND_OP_SRC_OUT_EXT             = 1000148007
 *         VK_BLEND_OP_DST_OUT_EXT             = 1000148008
 *         VK_BLEND_OP_SRC_ATOP_EXT            = 1000148009
 *         VK_BLEND_OP_DST_ATOP_EXT            = 1000148010
 *         VK_BLEND_OP_XOR_EXT                 = 1000148011
 *         VK_BLEND_OP_MULTIPLY_EXT            = 1000148012
 *         VK_BLEND_OP_SCREEN_EXT              = 1000148013
 *         VK_BLEND_OP_OVERLAY_EXT             = 1000148014
 *         VK_BLEND_OP_DARKEN_EXT              = 1000148015
 *         VK_BLEND_OP_LIGHTEN_EXT             = 1000148016
 *         VK_BLEND_OP_COLORDODGE_EXT          = 1000148017
 *         VK_BLEND_OP_COLORBURN_EXT           = 1000148018
 *         VK_BLEND_OP_HARDLIGHT_EXT           = 1000148019
 *         VK_BLEND_OP_SOFTLIGHT_EXT           = 1000148020
 *         VK_BLEND_OP_DIFFERENCE_EXT          = 1000148021
 *         VK_BLEND_OP_EXCLUSION_EXT           = 1000148022
 *         VK_BLEND_OP_INVERT_EXT              = 1000148023
 *         VK_BLEND_OP_INVERT_RGB_EXT          = 1000148024
 *         VK_BLEND_OP_LINEARDODGE_EXT         = 1000148025
 *         VK_BLEND_OP_LINEARBURN_EXT          = 1000148026
 *         VK_BLEND_OP_VIVIDLIGHT_EXT          = 1000148027
 *         VK_BLEND_OP_LINEARLIGHT_EXT         = 1000148028
 *         VK_BLEND_OP_PINLIGHT_EXT            = 1000148029
 *         VK_BLEND_OP_HARDMIX_EXT             = 1000148030
 *         VK_BLEND_OP_HSL_HUE_EXT             = 1000148031
 *         VK_BLEND_OP_HSL_SATURATION_EXT      = 1000148032
 *         VK_BLEND_OP_HSL_COLOR_EXT           = 1000148033
 *         VK_BLEND_OP_HSL_LUMINOSITY_EXT      = 1000148034
 *         VK_BLEND_OP_PLUS_EXT                = 1000148035
 *         VK_BLEND_OP_PLUS_CLAMPED_EXT        = 1000148036
 *         VK_BLEND_OP_PLUS_CLAMPED_ALPHA_EXT  = 1000148037
 *         VK_BLEND_OP_PLUS_DARKER_EXT         = 1000148038
 *         VK_BLEND_OP_MINUS_EXT               = 1000148039
 *         VK_BLEND_OP_MINUS_CLAMPED_EXT       = 1000148040
 *         VK_BLEND_OP_CONTRAST_EXT            = 1000148041
 *         VK_BLEND_OP_INVERT_OVG_EXT          = 1000148042
 *         VK_BLEND_OP_RED_EXT                 = 1000148043
 *         VK_BLEND_OP_GREEN_EXT               = 1000148044
 *         VK_BLEND_OP_BLUE_EXT                = 1000148045
 *     }
 */
@Suppress("Unused")
enum class BlendOp(val value: Int) {
	
	
	ADD(0),
	
	SUBTRACT(1),
	
	REVERSE_SUBTRACT(2),
	
	MIN(3),
	
	MAX(4);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkCompareOp {
 *         VK_COMPARE_OP_NEVER             = 0
 *         VK_COMPARE_OP_LESS              = 1
 *         VK_COMPARE_OP_EQUAL             = 2
 *         VK_COMPARE_OP_LESS_OR_EQUAL     = 3
 *         VK_COMPARE_OP_GREATER           = 4
 *         VK_COMPARE_OP_NOT_EQUAL         = 5
 *         VK_COMPARE_OP_GREATER_OR_EQUAL  = 6
 *         VK_COMPARE_OP_ALWAYS            = 7
 *     }
 */
@Suppress("Unused")
enum class CompareOp(val value: Int) {
	
	
	NEVER(0),
	
	LESS(1),
	
	EQUAL(2),
	
	LESS_OR_EQUAL(3),
	
	GREATER(4),
	
	NOT_EQUAL(5),
	
	GREATER_OR_EQUAL(6),
	
	ALWAYS(7);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkDynamicState {
 *         VK_DYNAMIC_STATE_VIEWPORT                             = 0
 *         VK_DYNAMIC_STATE_SCISSOR                              = 1
 *         VK_DYNAMIC_STATE_LINE_WIDTH                           = 2
 *         VK_DYNAMIC_STATE_DEPTH_BIAS                           = 3
 *         VK_DYNAMIC_STATE_BLEND_CONSTANTS                      = 4
 *         VK_DYNAMIC_STATE_DEPTH_BOUNDS                         = 5
 *         VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK                 = 6
 *         VK_DYNAMIC_STATE_STENCIL_WRITE_MASK                   = 7
 *         VK_DYNAMIC_STATE_STENCIL_REFERENCE                    = 8
 *         VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV                = 1000087000
 *         VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT                = 1000099000
 *         VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT                 = 1000143000
 *         VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR  = 1000347000
 *         VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV     = 1000164004
 *         VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV      = 1000164006
 *         VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV                 = 1000205001
 *         VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR            = 1000226000
 *         VK_DYNAMIC_STATE_LINE_STIPPLE_EXT                     = 1000259000
 *         VK_DYNAMIC_STATE_CULL_MODE_EXT                        = 1000267000
 *         VK_DYNAMIC_STATE_FRONT_FACE_EXT                       = 1000267001
 *         VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT               = 1000267002
 *         VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT              = 1000267003
 *         VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT               = 1000267004
 *         VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT      = 1000267005
 *         VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT                = 1000267006
 *         VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT               = 1000267007
 *         VK_DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT                 = 1000267008
 *         VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT         = 1000267009
 *         VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT              = 1000267010
 *         VK_DYNAMIC_STATE_STENCIL_OP_EXT                       = 1000267011
 *         VK_DYNAMIC_STATE_VERTEX_INPUT_EXT                     = 1000352000
 *         VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT             = 1000377000
 *         VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT        = 1000377001
 *         VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT                = 1000377002
 *         VK_DYNAMIC_STATE_LOGIC_OP_EXT                         = 1000377003
 *         VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT         = 1000377004
 *         VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT               = 1000381000
 *     }
 */
@Suppress("Unused")
enum class DynamicState(val value: Int) {
	
	
	VIEWPORT(0),
	
	SCISSOR(1),
	
	LINE_WIDTH(2),
	
	DEPTH_BIAS(3),
	
	BLEND_CONSTANTS(4),
	
	DEPTH_BOUNDS(5),
	
	STENCIL_COMPARE_MASK(6),
	
	STENCIL_WRITE_MASK(7),
	
	STENCIL_REFERENCE(8);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkFrontFace {
 *         VK_FRONT_FACE_COUNTER_CLOCKWISE  = 0
 *         VK_FRONT_FACE_CLOCKWISE          = 1
 *     }
 */
@Suppress("Unused")
enum class FrontFace(val value: Int) {
	
	
	COUNTER_CLOCKWISE(0),
	
	CLOCKWISE(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkLogicOp {
 *         VK_LOGIC_OP_CLEAR          = 0
 *         VK_LOGIC_OP_AND            = 1
 *         VK_LOGIC_OP_AND_REVERSE    = 2
 *         VK_LOGIC_OP_COPY           = 3
 *         VK_LOGIC_OP_AND_INVERTED   = 4
 *         VK_LOGIC_OP_NO_OP          = 5
 *         VK_LOGIC_OP_XOR            = 6
 *         VK_LOGIC_OP_OR             = 7
 *         VK_LOGIC_OP_NOR            = 8
 *         VK_LOGIC_OP_EQUIVALENT     = 9
 *         VK_LOGIC_OP_INVERT         = 10
 *         VK_LOGIC_OP_OR_REVERSE     = 11
 *         VK_LOGIC_OP_COPY_INVERTED  = 12
 *         VK_LOGIC_OP_OR_INVERTED    = 13
 *         VK_LOGIC_OP_NAND           = 14
 *         VK_LOGIC_OP_SET            = 15
 *     }
 */
@Suppress("Unused")
enum class LogicOp(val value: Int) {
	
	
	CLEAR(0),
	
	AND(1),
	
	AND_REVERSE(2),
	
	COPY(3),
	
	AND_INVERTED(4),
	
	NO_OP(5),
	
	XOR(6),
	
	OR(7),
	
	NOR(8),
	
	EQUIVALENT(9),
	
	INVERT(10),
	
	OR_REVERSE(11),
	
	COPY_INVERTED(12),
	
	OR_INVERTED(13),
	
	NAND(14),
	
	SET(15);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkPolygonMode {
 *         VK_POLYGON_MODE_FILL               = 0
 *         VK_POLYGON_MODE_LINE               = 1
 *         VK_POLYGON_MODE_POINT              = 2
 *         VK_POLYGON_MODE_FILL_RECTANGLE_NV  = 1000153000
 *     }
 */
@Suppress("Unused")
enum class PolygonMode(val value: Int) {
	
	
	FILL(0),
	
	LINE(1),
	
	POINT(2);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkPrimitiveTopology {
 *         VK_PRIMITIVE_TOPOLOGY_POINT_LIST                     = 0
 *         VK_PRIMITIVE_TOPOLOGY_LINE_LIST                      = 1
 *         VK_PRIMITIVE_TOPOLOGY_LINE_STRIP                     = 2
 *         VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST                  = 3
 *         VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP                 = 4
 *         VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN                   = 5
 *         VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY       = 6
 *         VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY      = 7
 *         VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY   = 8
 *         VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY  = 9
 *         VK_PRIMITIVE_TOPOLOGY_PATCH_LIST                     = 10
 *     }
 */
@Suppress("Unused")
enum class PrimitiveTopology(val value: Int) {
	
	
	POINT_LIST(0),
	
	LINE_LIST(1),
	
	LINE_STRIP(2),
	
	TRIANGLE_LIST(3),
	
	TRIANGLE_STRIP(4),
	
	TRIANGLE_FAN(5),
	
	LINE_LIST_WITH_ADJACENCY(6),
	
	LINE_STRIP_WITH_ADJACENCY(7),
	
	TRIANGLE_LIST_WITH_ADJACENCY(8),
	
	TRIANGLE_STRIP_WITH_ADJACENCY(9),
	
	PATCH_LIST(10);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkStencilOp {
 *         VK_STENCIL_OP_KEEP                 = 0
 *         VK_STENCIL_OP_ZERO                 = 1
 *         VK_STENCIL_OP_REPLACE              = 2
 *         VK_STENCIL_OP_INCREMENT_AND_CLAMP  = 3
 *         VK_STENCIL_OP_DECREMENT_AND_CLAMP  = 4
 *         VK_STENCIL_OP_INVERT               = 5
 *         VK_STENCIL_OP_INCREMENT_AND_WRAP   = 6
 *         VK_STENCIL_OP_DECREMENT_AND_WRAP   = 7
 *     }
 */
@Suppress("Unused")
enum class StencilOp(val value: Int) {
	
	
	KEEP(0),
	
	ZERO(1),
	
	REPLACE(2),
	
	INCREMENT_AND_CLAMP(3),
	
	DECREMENT_AND_CLAMP(4),
	
	INVERT(5),
	
	INCREMENT_AND_WRAP(6),
	
	DECREMENT_AND_WRAP(7);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkVertexInputRate {
 *         VK_VERTEX_INPUT_RATE_VERTEX    = 0
 *         VK_VERTEX_INPUT_RATE_INSTANCE  = 1
 *     }
 */
@Suppress("Unused")
enum class VertexInputRate(val value: Int) {
	
	
	VERTEX(0),
	
	INSTANCE(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkBorderColor {
 *         VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK  = 0
 *         VK_BORDER_COLOR_INT_TRANSPARENT_BLACK    = 1
 *         VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK       = 2
 *         VK_BORDER_COLOR_INT_OPAQUE_BLACK         = 3
 *         VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE       = 4
 *         VK_BORDER_COLOR_INT_OPAQUE_WHITE         = 5
 *         VK_BORDER_COLOR_FLOAT_CUSTOM_EXT         = 1000287003
 *         VK_BORDER_COLOR_INT_CUSTOM_EXT           = 1000287004
 *     }
 */
@Suppress("Unused")
enum class BorderColor(val value: Int) {
	
	
	FLOAT_TRANSPARENT_BLACK(0),
	
	INT_TRANSPARENT_BLACK(1),
	
	FLOAT_OPAQUE_BLACK(2),
	
	INT_OPAQUE_BLACK(3),
	
	FLOAT_OPAQUE_WHITE(4),
	
	INT_OPAQUE_WHITE(5);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkFilter {
 *         VK_FILTER_NEAREST    = 0
 *         VK_FILTER_LINEAR     = 1
 *         VK_FILTER_CUBIC_IMG  = 1000015000
 *         VK_FILTER_CUBIC_EXT  = 1000015000
 *     }
 */
@Suppress("Unused")
enum class Filter(val value: Int) {
	
	
	NEAREST(0),
	
	LINEAR(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkSamplerAddressMode {
 *         VK_SAMPLER_ADDRESS_MODE_REPEAT                    = 0
 *         VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT           = 1
 *         VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE             = 2
 *         VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER           = 3
 *         VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE      = 4
 *         VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE_KHR  = 4
 *     }
 */
@Suppress("Unused")
enum class SamplerAddressMode(val value: Int) {
	
	
	REPEAT(0),
	
	MIRRORED_REPEAT(1),
	
	CLAMP_TO_EDGE(2),
	
	CLAMP_TO_BORDER(3);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkSamplerMipmapMode {
 *         VK_SAMPLER_MIPMAP_MODE_NEAREST  = 0
 *         VK_SAMPLER_MIPMAP_MODE_LINEAR   = 1
 *     }
 */
@Suppress("Unused")
enum class SamplerMipmapMode(val value: Int) {
	
	
	NEAREST(0),
	
	LINEAR(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkDescriptorType {
 *         VK_DESCRIPTOR_TYPE_SAMPLER                     = 0
 *         VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER      = 1
 *         VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE               = 2
 *         VK_DESCRIPTOR_TYPE_STORAGE_IMAGE               = 3
 *         VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER        = 4
 *         VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER        = 5
 *         VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER              = 6
 *         VK_DESCRIPTOR_TYPE_STORAGE_BUFFER              = 7
 *         VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC      = 8
 *         VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC      = 9
 *         VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT            = 10
 *         VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT    = 1000138000
 *         VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR  = 1000150000
 *         VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV   = 1000165000
 *         VK_DESCRIPTOR_TYPE_MUTABLE_VALVE               = 1000351000
 *     }
 */
@Suppress("Unused")
enum class DescriptorType(val value: Int) {
	
	
	SAMPLER(0),
	
	COMBINED_IMAGE_SAMPLER(1),
	
	SAMPLED_IMAGE(2),
	
	STORAGE_IMAGE(3),
	
	UNIFORM_TEXEL_BUFFER(4),
	
	STORAGE_TEXEL_BUFFER(5),
	
	UNIFORM_BUFFER(6),
	
	STORAGE_BUFFER(7),
	
	UNIFORM_BUFFER_DYNAMIC(8),
	
	STORAGE_BUFFER_DYNAMIC(9),
	
	INPUT_ATTACHMENT(10);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkAttachmentLoadOp {
 *         VK_ATTACHMENT_LOAD_OP_LOAD       = 0
 *         VK_ATTACHMENT_LOAD_OP_CLEAR      = 1
 *         VK_ATTACHMENT_LOAD_OP_DONT_CARE  = 2
 *         VK_ATTACHMENT_LOAD_OP_NONE_EXT   = 1000400000
 *     }
 */
@Suppress("Unused")
enum class AttachmentLoadOp(val value: Int) {
	
	
	LOAD(0),
	
	CLEAR(1),
	
	DONT_CARE(2);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkAttachmentStoreOp {
 *         VK_ATTACHMENT_STORE_OP_STORE      = 0
 *         VK_ATTACHMENT_STORE_OP_DONT_CARE  = 1
 *         VK_ATTACHMENT_STORE_OP_NONE_KHR   = 1000301000
 *         VK_ATTACHMENT_STORE_OP_NONE_QCOM  = 1000301000
 *         VK_ATTACHMENT_STORE_OP_NONE_EXT   = 1000301000
 *     }
 */
@Suppress("Unused")
enum class AttachmentStoreOp(val value: Int) {
	
	
	STORE(0),
	
	DONT_CARE(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkPipelineBindPoint {
 *         VK_PIPELINE_BIND_POINT_GRAPHICS                = 0
 *         VK_PIPELINE_BIND_POINT_COMPUTE                 = 1
 *         VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR         = 1000165000
 *         VK_PIPELINE_BIND_POINT_RAY_TRACING_NV          = 1000165000
 *         VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI  = 1000369003
 *     }
 */
@Suppress("Unused")
enum class PipelineBindPoint(val value: Int) {
	
	
	GRAPHICS(0),
	
	COMPUTE(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkCommandBufferLevel {
 *         VK_COMMAND_BUFFER_LEVEL_PRIMARY    = 0
 *         VK_COMMAND_BUFFER_LEVEL_SECONDARY  = 1
 *     }
 */
@Suppress("Unused")
enum class CommandBufferLevel(val value: Int) {
	
	
	PRIMARY(0),
	
	SECONDARY(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkIndexType {
 *         VK_INDEX_TYPE_UINT16     = 0
 *         VK_INDEX_TYPE_UINT32     = 1
 *         VK_INDEX_TYPE_NONE_KHR   = 1000165000
 *         VK_INDEX_TYPE_NONE_NV    = 1000165000
 *         VK_INDEX_TYPE_UINT8_EXT  = 1000265000
 *     }
 */
@Suppress("Unused")
enum class IndexType(val value: Int) {
	
	
	UINT16(0),
	
	UINT32(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkSubpassContents {
 *         VK_SUBPASS_CONTENTS_INLINE                     = 0
 *         VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS  = 1
 *     }
 */
@Suppress("Unused")
enum class SubpassContents(val value: Int) {
	
	
	INLINE(0),
	
	SECONDARY_COMMAND_BUFFERS(1);


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkFormatFeatureFlagBits {
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT                                                                = 1
 *         VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT                                                                = 2
 *         VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT                                                         = 4
 *         VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT                                                         = 8
 *         VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT                                                         = 16
 *         VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT                                                  = 32
 *         VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT                                                                = 64
 *         VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT                                                             = 128
 *         VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT                                                       = 256
 *         VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT                                                     = 512
 *         VK_FORMAT_FEATURE_BLIT_SRC_BIT                                                                     = 1024
 *         VK_FORMAT_FEATURE_BLIT_DST_BIT                                                                     = 2048
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT                                                  = 4096
 *         VK_FORMAT_FEATURE_TRANSFER_SRC_BIT                                                                 = 16384
 *         VK_FORMAT_FEATURE_TRANSFER_DST_BIT                                                                 = 32768
 *         VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT                                                      = 131072
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT                                 = 262144
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT                = 524288
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT                = 1048576
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT      = 2097152
 *         VK_FORMAT_FEATURE_DISJOINT_BIT                                                                     = 4194304
 *         VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT                                                       = 8388608
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT                                                  = 65536
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG                                               = 8192
 *         VK_FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR                                                      = 33554432
 *         VK_FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR                                                         = 67108864
 *         VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR                                                             = 16384
 *         VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR                                                             = 32768
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT                                              = 65536
 *         VK_FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR                                     = 536870912
 *         VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR                                                  = 131072
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR                             = 262144
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR            = 524288
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR            = 1048576
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR  = 2097152
 *         VK_FORMAT_FEATURE_DISJOINT_BIT_KHR                                                                 = 4194304
 *         VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR                                                   = 8388608
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT                                               = 8192
 *         VK_FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT                                                     = 16777216
 *         VK_FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR                                         = 1073741824
 *         VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR                                                       = 134217728
 *         VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR                                                         = 268435456
 *     }
 */
@Suppress("unused")
@JvmInline
value class FormatFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val SAMPLED_IMAGE = FormatFeatureFlags(1)
		
		val STORAGE_IMAGE = FormatFeatureFlags(2)
		
		val STORAGE_IMAGE_ATOMIC = FormatFeatureFlags(4)
		
		val UNIFORM_TEXEL_BUFFER = FormatFeatureFlags(8)
		
		val STORAGE_TEXEL_BUFFER = FormatFeatureFlags(16)
		
		val STORAGE_TEXEL_BUFFER_ATOMIC = FormatFeatureFlags(32)
		
		val VERTEX_BUFFER = FormatFeatureFlags(64)
		
		val COLOR_ATTACHMENT = FormatFeatureFlags(128)
		
		val COLOR_ATTACHMENT_BLEND = FormatFeatureFlags(256)
		
		val DEPTH_STENCIL_ATTACHMENT = FormatFeatureFlags(512)
		
		val BLIT_SRC = FormatFeatureFlags(1024)
		
		val BLIT_DST = FormatFeatureFlags(2048)
		
		val SAMPLED_IMAGE_FILTER_LINEAR = FormatFeatureFlags(4096)
		
		val TRANSFER_SRC = FormatFeatureFlags(16384)
		
		val TRANSFER_DST = FormatFeatureFlags(32768)
		
		val MIDPOINT_CHROMA_SAMPLES = FormatFeatureFlags(131072)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER = FormatFeatureFlags(262144)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER = FormatFeatureFlags(524288)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT = FormatFeatureFlags(1048576)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE = FormatFeatureFlags(2097152)
		
		val DISJOINT = FormatFeatureFlags(4194304)
		
		val COSITED_CHROMA_SAMPLES = FormatFeatureFlags(8388608)
		
		val SAMPLED_IMAGE_FILTER_MINMAX = FormatFeatureFlags(65536)
	
	}
	
	
	
	operator fun plus(mask: FormatFeatureFlags) = FormatFeatureFlags(value or mask.value)
	
	operator fun contains(mask: FormatFeatureFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkImageCreateFlagBits {
 *         VK_IMAGE_CREATE_SPARSE_BINDING_BIT                         = 1
 *         VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT                       = 2
 *         VK_IMAGE_CREATE_SPARSE_ALIASED_BIT                         = 4
 *         VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT                         = 8
 *         VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT                        = 16
 *         VK_IMAGE_CREATE_ALIAS_BIT                                  = 1024
 *         VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT            = 64
 *         VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT                    = 32
 *         VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT            = 128
 *         VK_IMAGE_CREATE_EXTENDED_USAGE_BIT                         = 256
 *         VK_IMAGE_CREATE_PROTECTED_BIT                              = 2048
 *         VK_IMAGE_CREATE_DISJOINT_BIT                               = 512
 *         VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV                      = 8192
 *         VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR        = 64
 *         VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR                = 32
 *         VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR        = 128
 *         VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR                     = 256
 *         VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT  = 4096
 *         VK_IMAGE_CREATE_DISJOINT_BIT_KHR                           = 512
 *         VK_IMAGE_CREATE_ALIAS_BIT_KHR                              = 1024
 *         VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT                         = 16384
 *         VK_IMAGE_CREATE_RESERVED_16_BIT_AMD                        = 65536
 *         VK_IMAGE_CREATE_RESERVED_394_BIT_EXT                       = 131072
 *         VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM       = 32768
 *     }
 */
@Suppress("unused")
@JvmInline
value class ImageCreateFlags(val value: Int) {
	
	
	companion object {
		
		val SPARSE_BINDING = ImageCreateFlags(1)
		
		val SPARSE_RESIDENCY = ImageCreateFlags(2)
		
		val SPARSE_ALIASED = ImageCreateFlags(4)
		
		val MUTABLE_FORMAT = ImageCreateFlags(8)
		
		val CUBE_COMPATIBLE = ImageCreateFlags(16)
		
		val ALIAS = ImageCreateFlags(1024)
		
		val SPLIT_INSTANCE_BIND_REGIONS = ImageCreateFlags(64)
		
		val _2D_ARRAY_COMPATIBLE = ImageCreateFlags(32)
		
		val BLOCK_TEXEL_VIEW_COMPATIBLE = ImageCreateFlags(128)
		
		val EXTENDED_USAGE = ImageCreateFlags(256)
		
		val PROTECTED = ImageCreateFlags(2048)
		
		val DISJOINT = ImageCreateFlags(512)
	
	}
	
	
	
	operator fun plus(mask: ImageCreateFlags) = ImageCreateFlags(value or mask.value)
	
	operator fun contains(mask: ImageCreateFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkImageUsageFlagBits {
 *         VK_IMAGE_USAGE_TRANSFER_SRC_BIT                          = 1
 *         VK_IMAGE_USAGE_TRANSFER_DST_BIT                          = 2
 *         VK_IMAGE_USAGE_SAMPLED_BIT                               = 4
 *         VK_IMAGE_USAGE_STORAGE_BIT                               = 8
 *         VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT                      = 16
 *         VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT              = 32
 *         VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT                  = 64
 *         VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT                      = 128
 *         VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR                  = 1024
 *         VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR                  = 2048
 *         VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR                  = 4096
 *         VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV                 = 256
 *         VK_IMAGE_USAGE_RESERVED_16_BIT_QCOM                      = 65536
 *         VK_IMAGE_USAGE_RESERVED_17_BIT_QCOM                      = 131072
 *         VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT              = 512
 *         VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR  = 256
 *         VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR                  = 8192
 *         VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR                  = 16384
 *         VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR                  = 32768
 *         VK_IMAGE_USAGE_RESERVED_19_BIT_EXT                       = 524288
 *         VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI                = 262144
 *         VK_IMAGE_USAGE_RESERVED_20_BIT_QCOM                      = 1048576
 *         VK_IMAGE_USAGE_RESERVED_21_BIT_QCOM                      = 2097152
 *     }
 */
@Suppress("unused")
@JvmInline
value class ImageUsageFlags(val value: Int) {
	
	
	companion object {
		
		val TRANSFER_SRC = ImageUsageFlags(1)
		
		val TRANSFER_DST = ImageUsageFlags(2)
		
		val SAMPLED = ImageUsageFlags(4)
		
		val STORAGE = ImageUsageFlags(8)
		
		val COLOR_ATTACHMENT = ImageUsageFlags(16)
		
		val DEPTH_STENCIL_ATTACHMENT = ImageUsageFlags(32)
		
		val TRANSIENT_ATTACHMENT = ImageUsageFlags(64)
		
		val INPUT_ATTACHMENT = ImageUsageFlags(128)
	
	}
	
	
	
	operator fun plus(mask: ImageUsageFlags) = ImageUsageFlags(value or mask.value)
	
	operator fun contains(mask: ImageUsageFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkMemoryHeapFlagBits {
 *         VK_MEMORY_HEAP_DEVICE_LOCAL_BIT        = 1
 *         VK_MEMORY_HEAP_MULTI_INSTANCE_BIT      = 2
 *         VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR  = 2
 *         VK_MEMORY_HEAP_RESERVED_2_BIT_KHR      = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class MemoryHeapFlags(val value: Int) {
	
	
	companion object {
		
		val DEVICE_LOCAL = MemoryHeapFlags(1)
		
		val MULTI_INSTANCE = MemoryHeapFlags(2)
	
	}
	
	
	
	operator fun plus(mask: MemoryHeapFlags) = MemoryHeapFlags(value or mask.value)
	
	operator fun contains(mask: MemoryHeapFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkMemoryPropertyFlagBits {
 *         VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT         = 1
 *         VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT         = 2
 *         VK_MEMORY_PROPERTY_HOST_COHERENT_BIT        = 4
 *         VK_MEMORY_PROPERTY_HOST_CACHED_BIT          = 8
 *         VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT     = 16
 *         VK_MEMORY_PROPERTY_PROTECTED_BIT            = 32
 *         VK_MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD  = 64
 *         VK_MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD  = 128
 *         VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV      = 256
 *     }
 */
@Suppress("unused")
@JvmInline
value class MemoryPropertyFlags(val value: Int) {
	
	
	companion object {
		
		val DEVICE_LOCAL = MemoryPropertyFlags(1)
		
		val HOST_VISIBLE = MemoryPropertyFlags(2)
		
		val HOST_COHERENT = MemoryPropertyFlags(4)
		
		val HOST_CACHED = MemoryPropertyFlags(8)
		
		val LAZILY_ALLOCATED = MemoryPropertyFlags(16)
		
		val PROTECTED = MemoryPropertyFlags(32)
	
	}
	
	
	
	operator fun plus(mask: MemoryPropertyFlags) = MemoryPropertyFlags(value or mask.value)
	
	operator fun contains(mask: MemoryPropertyFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkQueueFlagBits {
 *         VK_QUEUE_GRAPHICS_BIT          = 1
 *         VK_QUEUE_COMPUTE_BIT           = 2
 *         VK_QUEUE_TRANSFER_BIT          = 4
 *         VK_QUEUE_SPARSE_BINDING_BIT    = 8
 *         VK_QUEUE_PROTECTED_BIT         = 16
 *         VK_QUEUE_VIDEO_DECODE_BIT_KHR  = 32
 *         VK_QUEUE_VIDEO_ENCODE_BIT_KHR  = 64
 *         VK_QUEUE_RESERVED_7_BIT_QCOM   = 128
 *     }
 */
@Suppress("unused")
@JvmInline
value class QueueFlags(val value: Int) {
	
	
	companion object {
		
		val GRAPHICS = QueueFlags(1)
		
		val COMPUTE = QueueFlags(2)
		
		val TRANSFER = QueueFlags(4)
		
		val SPARSE_BINDING = QueueFlags(8)
		
		val PROTECTED = QueueFlags(16)
	
	}
	
	
	
	operator fun plus(mask: QueueFlags) = QueueFlags(value or mask.value)
	
	operator fun contains(mask: QueueFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkSampleCountFlagBits {
 *         VK_SAMPLE_COUNT_1_BIT   = 1
 *         VK_SAMPLE_COUNT_2_BIT   = 2
 *         VK_SAMPLE_COUNT_4_BIT   = 4
 *         VK_SAMPLE_COUNT_8_BIT   = 8
 *         VK_SAMPLE_COUNT_16_BIT  = 16
 *         VK_SAMPLE_COUNT_32_BIT  = 32
 *         VK_SAMPLE_COUNT_64_BIT  = 64
 *     }
 */
@Suppress("unused")
@JvmInline
value class SampleCountFlags(val value: Int) {
	
	
	companion object {
		
		val _1 = SampleCountFlags(1)
		
		val _2 = SampleCountFlags(2)
		
		val _4 = SampleCountFlags(4)
		
		val _8 = SampleCountFlags(8)
		
		val _16 = SampleCountFlags(16)
		
		val _32 = SampleCountFlags(32)
		
		val _64 = SampleCountFlags(64)
	
	}
	
	
	
	operator fun plus(mask: SampleCountFlags) = SampleCountFlags(value or mask.value)
	
	operator fun contains(mask: SampleCountFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_1
 *     enum VkDeviceQueueCreateFlagBits {
 *         VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT        = 1
 *         VK_DEVICE_QUEUE_CREATE_RESERVED_1_BIT_QCOM  = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class DeviceQueueCreateFlags(val value: Int) {
	
	
	companion object {
		
		val PROTECTED = DeviceQueueCreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: DeviceQueueCreateFlags) = DeviceQueueCreateFlags(value or mask.value)
	
	operator fun contains(mask: DeviceQueueCreateFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkPipelineStageFlagBits {
 *         VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT                           = 1
 *         VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT                         = 2
 *         VK_PIPELINE_STAGE_VERTEX_INPUT_BIT                          = 4
 *         VK_PIPELINE_STAGE_VERTEX_SHADER_BIT                         = 8
 *         VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT           = 16
 *         VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT        = 32
 *         VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT                       = 64
 *         VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT                       = 128
 *         VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT                  = 256
 *         VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT                   = 512
 *         VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT               = 1024
 *         VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT                        = 2048
 *         VK_PIPELINE_STAGE_TRANSFER_BIT                              = 4096
 *         VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT                        = 8192
 *         VK_PIPELINE_STAGE_HOST_BIT                                  = 16384
 *         VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT                          = 32768
 *         VK_PIPELINE_STAGE_ALL_COMMANDS_BIT                          = 65536
 *         VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT                = 16777216
 *         VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT             = 262144
 *         VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR      = 33554432
 *         VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR                = 2097152
 *         VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV                 = 4194304
 *         VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV                 = 2097152
 *         VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV       = 33554432
 *         VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV                        = 524288
 *         VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV                        = 1048576
 *         VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT          = 8388608
 *         VK_PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR  = 4194304
 *         VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV                 = 131072
 *         VK_PIPELINE_STAGE_NONE_KHR                                  = 0
 *     }
 */
@Suppress("unused")
@JvmInline
value class PipelineStageFlags(val value: Int) {
	
	
	companion object {
		
		val TOP_OF_PIPE = PipelineStageFlags(1)
		
		val DRAW_INDIRECT = PipelineStageFlags(2)
		
		val VERTEX_INPUT = PipelineStageFlags(4)
		
		val VERTEX_SHADER = PipelineStageFlags(8)
		
		val TESSELLATION_CONTROL_SHADER = PipelineStageFlags(16)
		
		val TESSELLATION_EVALUATION_SHADER = PipelineStageFlags(32)
		
		val GEOMETRY_SHADER = PipelineStageFlags(64)
		
		val FRAGMENT_SHADER = PipelineStageFlags(128)
		
		val EARLY_FRAGMENT_TESTS = PipelineStageFlags(256)
		
		val LATE_FRAGMENT_TESTS = PipelineStageFlags(512)
		
		val COLOR_ATTACHMENT_OUTPUT = PipelineStageFlags(1024)
		
		val COMPUTE_SHADER = PipelineStageFlags(2048)
		
		val TRANSFER = PipelineStageFlags(4096)
		
		val BOTTOM_OF_PIPE = PipelineStageFlags(8192)
		
		val HOST = PipelineStageFlags(16384)
		
		val ALL_GRAPHICS = PipelineStageFlags(32768)
		
		val ALL_COMMANDS = PipelineStageFlags(65536)
	
	}
	
	
	
	operator fun plus(mask: PipelineStageFlags) = PipelineStageFlags(value or mask.value)
	
	operator fun contains(mask: PipelineStageFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkImageAspectFlagBits {
 *         VK_IMAGE_ASPECT_COLOR_BIT               = 1
 *         VK_IMAGE_ASPECT_DEPTH_BIT               = 2
 *         VK_IMAGE_ASPECT_STENCIL_BIT             = 4
 *         VK_IMAGE_ASPECT_METADATA_BIT            = 8
 *         VK_IMAGE_ASPECT_PLANE_0_BIT             = 16
 *         VK_IMAGE_ASPECT_PLANE_1_BIT             = 32
 *         VK_IMAGE_ASPECT_PLANE_2_BIT             = 64
 *         VK_IMAGE_ASPECT_PLANE_0_BIT_KHR         = 16
 *         VK_IMAGE_ASPECT_PLANE_1_BIT_KHR         = 32
 *         VK_IMAGE_ASPECT_PLANE_2_BIT_KHR         = 64
 *         VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT  = 128
 *         VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT  = 256
 *         VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT  = 512
 *         VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT  = 1024
 *         VK_IMAGE_ASPECT_NONE_KHR                = 0
 *     }
 */
@Suppress("unused")
@JvmInline
value class ImageAspectFlags(val value: Int) {
	
	
	companion object {
		
		val COLOR = ImageAspectFlags(1)
		
		val DEPTH = ImageAspectFlags(2)
		
		val STENCIL = ImageAspectFlags(4)
		
		val METADATA = ImageAspectFlags(8)
		
		val PLANE_0 = ImageAspectFlags(16)
		
		val PLANE_1 = ImageAspectFlags(32)
		
		val PLANE_2 = ImageAspectFlags(64)
	
	}
	
	
	
	operator fun plus(mask: ImageAspectFlags) = ImageAspectFlags(value or mask.value)
	
	operator fun contains(mask: ImageAspectFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkSparseImageFormatFlagBits {
 *         VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT          = 1
 *         VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT        = 2
 *         VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT  = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class SparseImageFormatFlags(val value: Int) {
	
	
	companion object {
		
		val SINGLE_MIPTAIL = SparseImageFormatFlags(1)
		
		val ALIGNED_MIP_SIZE = SparseImageFormatFlags(2)
		
		val NONSTANDARD_BLOCK_SIZE = SparseImageFormatFlags(4)
	
	}
	
	
	
	operator fun plus(mask: SparseImageFormatFlags) = SparseImageFormatFlags(value or mask.value)
	
	operator fun contains(mask: SparseImageFormatFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkSparseMemoryBindFlagBits {
 *         VK_SPARSE_MEMORY_BIND_METADATA_BIT  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class SparseMemoryBindFlags(val value: Int) {
	
	
	companion object {
		
		val METADATA = SparseMemoryBindFlags(1)
	
	}
	
	
	
	operator fun plus(mask: SparseMemoryBindFlags) = SparseMemoryBindFlags(value or mask.value)
	
	operator fun contains(mask: SparseMemoryBindFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkFenceCreateFlagBits {
 *         VK_FENCE_CREATE_SIGNALED_BIT  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class FenceCreateFlags(val value: Int) {
	
	
	companion object {
		
		val SIGNALED = FenceCreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: FenceCreateFlags) = FenceCreateFlags(value or mask.value)
	
	operator fun contains(mask: FenceCreateFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkQueryPipelineStatisticFlagBits {
 *         VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT                     = 1
 *         VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT                   = 2
 *         VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT                   = 4
 *         VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT                 = 8
 *         VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT                  = 16
 *         VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT                        = 32
 *         VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT                         = 64
 *         VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT                 = 128
 *         VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT         = 256
 *         VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT  = 512
 *         VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT                  = 1024
 *     }
 */
@Suppress("unused")
@JvmInline
value class QueryPipelineStatisticFlags(val value: Int) {
	
	
	companion object {
		
		val INPUT_ASSEMBLY_VERTICES = QueryPipelineStatisticFlags(1)
		
		val INPUT_ASSEMBLY_PRIMITIVES = QueryPipelineStatisticFlags(2)
		
		val VERTEX_SHADER_INVOCATIONS = QueryPipelineStatisticFlags(4)
		
		val GEOMETRY_SHADER_INVOCATIONS = QueryPipelineStatisticFlags(8)
		
		val GEOMETRY_SHADER_PRIMITIVES = QueryPipelineStatisticFlags(16)
		
		val CLIPPING_INVOCATIONS = QueryPipelineStatisticFlags(32)
		
		val CLIPPING_PRIMITIVES = QueryPipelineStatisticFlags(64)
		
		val FRAGMENT_SHADER_INVOCATIONS = QueryPipelineStatisticFlags(128)
		
		val TESSELLATION_CONTROL_SHADER_PATCHES = QueryPipelineStatisticFlags(256)
		
		val TESSELLATION_EVALUATION_SHADER_INVOCATIONS = QueryPipelineStatisticFlags(512)
		
		val COMPUTE_SHADER_INVOCATIONS = QueryPipelineStatisticFlags(1024)
	
	}
	
	
	
	operator fun plus(mask: QueryPipelineStatisticFlags) = QueryPipelineStatisticFlags(value or mask.value)
	
	operator fun contains(mask: QueryPipelineStatisticFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkQueryResultFlagBits {
 *         VK_QUERY_RESULT_64_BIT                 = 1
 *         VK_QUERY_RESULT_WAIT_BIT               = 2
 *         VK_QUERY_RESULT_WITH_AVAILABILITY_BIT  = 4
 *         VK_QUERY_RESULT_PARTIAL_BIT            = 8
 *         VK_QUERY_RESULT_WITH_STATUS_BIT_KHR    = 16
 *     }
 */
@Suppress("unused")
@JvmInline
value class QueryResultFlags(val value: Int) {
	
	
	companion object {
		
		val _64 = QueryResultFlags(1)
		
		val WAIT = QueryResultFlags(2)
		
		val WITH_AVAILABILITY = QueryResultFlags(4)
		
		val PARTIAL = QueryResultFlags(8)
	
	}
	
	
	
	operator fun plus(mask: QueryResultFlags) = QueryResultFlags(value or mask.value)
	
	operator fun contains(mask: QueryResultFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkBufferCreateFlagBits {
 *         VK_BUFFER_CREATE_SPARSE_BINDING_BIT                     = 1
 *         VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT                   = 2
 *         VK_BUFFER_CREATE_SPARSE_ALIASED_BIT                     = 4
 *         VK_BUFFER_CREATE_PROTECTED_BIT                          = 8
 *         VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT      = 16
 *         VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT  = 16
 *         VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR  = 16
 *         VK_BUFFER_CREATE_RESERVED_5_BIT_AMD                     = 32
 *     }
 */
@Suppress("unused")
@JvmInline
value class BufferCreateFlags(val value: Int) {
	
	
	companion object {
		
		val SPARSE_BINDING = BufferCreateFlags(1)
		
		val SPARSE_RESIDENCY = BufferCreateFlags(2)
		
		val SPARSE_ALIASED = BufferCreateFlags(4)
		
		val PROTECTED = BufferCreateFlags(8)
		
		val DEVICE_ADDRESS_CAPTURE_REPLAY = BufferCreateFlags(16)
	
	}
	
	
	
	operator fun plus(mask: BufferCreateFlags) = BufferCreateFlags(value or mask.value)
	
	operator fun contains(mask: BufferCreateFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkBufferUsageFlagBits {
 *         VK_BUFFER_USAGE_TRANSFER_SRC_BIT                                      = 1
 *         VK_BUFFER_USAGE_TRANSFER_DST_BIT                                      = 2
 *         VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT                              = 4
 *         VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT                              = 8
 *         VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT                                    = 16
 *         VK_BUFFER_USAGE_STORAGE_BUFFER_BIT                                    = 32
 *         VK_BUFFER_USAGE_INDEX_BUFFER_BIT                                      = 64
 *         VK_BUFFER_USAGE_VERTEX_BUFFER_BIT                                     = 128
 *         VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT                                   = 256
 *         VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT                             = 131072
 *         VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR                              = 8192
 *         VK_BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR                              = 16384
 *         VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT                     = 2048
 *         VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT             = 4096
 *         VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT                         = 512
 *         VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR  = 524288
 *         VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR                = 1048576
 *         VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR                          = 1024
 *         VK_BUFFER_USAGE_RAY_TRACING_BIT_NV                                    = 1024
 *         VK_BUFFER_USAGE_RESERVED_18_BIT_QCOM                                  = 262144
 *         VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT                         = 131072
 *         VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR                         = 131072
 *         VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR                              = 32768
 *         VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR                              = 65536
 *         VK_BUFFER_USAGE_RESERVED_21_BIT_AMD                                   = 2097152
 *         VK_BUFFER_USAGE_RESERVED_22_BIT_AMD                                   = 4194304
 *     }
 */
@Suppress("unused")
@JvmInline
value class BufferUsageFlags(val value: Int) {
	
	
	companion object {
		
		val TRANSFER_SRC = BufferUsageFlags(1)
		
		val TRANSFER_DST = BufferUsageFlags(2)
		
		val UNIFORM_TEXEL_BUFFER = BufferUsageFlags(4)
		
		val STORAGE_TEXEL_BUFFER = BufferUsageFlags(8)
		
		val UNIFORM_BUFFER = BufferUsageFlags(16)
		
		val STORAGE_BUFFER = BufferUsageFlags(32)
		
		val INDEX_BUFFER = BufferUsageFlags(64)
		
		val VERTEX_BUFFER = BufferUsageFlags(128)
		
		val INDIRECT_BUFFER = BufferUsageFlags(256)
		
		val SHADER_DEVICE_ADDRESS = BufferUsageFlags(131072)
	
	}
	
	
	
	operator fun plus(mask: BufferUsageFlags) = BufferUsageFlags(value or mask.value)
	
	operator fun contains(mask: BufferUsageFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkColorComponentFlagBits {
 *         VK_COLOR_COMPONENT_R_BIT  = 1
 *         VK_COLOR_COMPONENT_G_BIT  = 2
 *         VK_COLOR_COMPONENT_B_BIT  = 4
 *         VK_COLOR_COMPONENT_A_BIT  = 8
 *     }
 */
@Suppress("unused")
@JvmInline
value class ColorComponentFlags(val value: Int) {
	
	
	companion object {
		
		val R = ColorComponentFlags(1)
		
		val G = ColorComponentFlags(2)
		
		val B = ColorComponentFlags(4)
		
		val A = ColorComponentFlags(8)
	
	}
	
	
	
	operator fun plus(mask: ColorComponentFlags) = ColorComponentFlags(value or mask.value)
	
	operator fun contains(mask: ColorComponentFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkCullModeFlagBits {
 *         VK_CULL_MODE_NONE            = 0
 *         VK_CULL_MODE_FRONT_BIT       = 1
 *         VK_CULL_MODE_BACK_BIT        = 2
 *         VK_CULL_MODE_FRONT_AND_BACK  = 0x00000003
 *     }
 */
@Suppress("unused")
@JvmInline
value class CullModeFlags(val value: Int) {
	
	
	companion object {
		
		val NONE = CullModeFlags(0)
		
		val FRONT = CullModeFlags(1)
		
		val BACK = CullModeFlags(2)
		
		val FRONT_AND_BACK = CullModeFlags(0x00000003)
	
	}
	
	
	
	operator fun plus(mask: CullModeFlags) = CullModeFlags(value or mask.value)
	
	operator fun contains(mask: CullModeFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkPipelineCreateFlagBits {
 *         VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT                                      = 1
 *         VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT                                         = 2
 *         VK_PIPELINE_CREATE_DERIVATIVE_BIT                                                = 4
 *         VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT                              = 8
 *         VK_PIPELINE_CREATE_DISPATCH_BASE_BIT                                             = 16
 *         VK_PIPELINE_CREATE_DISPATCH_BASE                                                 = 16
 *         VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR            = 2097152
 *         VK_PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR  = 2097152
 *         VK_PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT             = 4194304
 *         VK_PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT   = 4194304
 *         VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR                          = 8
 *         VK_PIPELINE_CREATE_DISPATCH_BASE_KHR                                             = 16
 *         VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR                   = 16384
 *         VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR               = 32768
 *         VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR                      = 65536
 *         VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR              = 131072
 *         VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR                            = 4096
 *         VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR                                = 8192
 *         VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR        = 524288
 *         VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV                                          = 32
 *         VK_PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR                                    = 64
 *         VK_PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR                      = 128
 *         VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV                                      = 262144
 *         VK_PIPELINE_CREATE_LIBRARY_BIT_KHR                                               = 2048
 *         VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT                     = 256
 *         VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT_EXT                               = 512
 *         VK_PIPELINE_CREATE_RESERVED_23_BIT_AMD                                           = 8388608
 *         VK_PIPELINE_CREATE_RESERVED_10_BIT_AMD                                           = 1024
 *         VK_PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV                               = 1048576
 *     }
 */
@Suppress("unused")
@JvmInline
value class PipelineCreateFlags(val value: Int) {
	
	
	companion object {
		
		val DISABLE_OPTIMIZATION = PipelineCreateFlags(1)
		
		val ALLOW_DERIVATIVES = PipelineCreateFlags(2)
		
		val DERIVATIVE = PipelineCreateFlags(4)
		
		val VIEW_INDEX_FROM_DEVICE_INDEX = PipelineCreateFlags(8)
		
		val DISPATCH_BASE = PipelineCreateFlags(16)
	
	}
	
	
	
	operator fun plus(mask: PipelineCreateFlags) = PipelineCreateFlags(value or mask.value)
	
	operator fun contains(mask: PipelineCreateFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkShaderStageFlagBits {
 *         VK_SHADER_STAGE_VERTEX_BIT                   = 1
 *         VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT     = 2
 *         VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT  = 4
 *         VK_SHADER_STAGE_GEOMETRY_BIT                 = 8
 *         VK_SHADER_STAGE_FRAGMENT_BIT                 = 16
 *         VK_SHADER_STAGE_COMPUTE_BIT                  = 32
 *         VK_SHADER_STAGE_ALL_GRAPHICS                 = 0x0000001F
 *         VK_SHADER_STAGE_ALL                          = 0x7FFFFFFF
 *         VK_SHADER_STAGE_RAYGEN_BIT_KHR               = 256
 *         VK_SHADER_STAGE_ANY_HIT_BIT_KHR              = 512
 *         VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR          = 1024
 *         VK_SHADER_STAGE_MISS_BIT_KHR                 = 2048
 *         VK_SHADER_STAGE_INTERSECTION_BIT_KHR         = 4096
 *         VK_SHADER_STAGE_CALLABLE_BIT_KHR             = 8192
 *         VK_SHADER_STAGE_RAYGEN_BIT_NV                = 256
 *         VK_SHADER_STAGE_ANY_HIT_BIT_NV               = 512
 *         VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV           = 1024
 *         VK_SHADER_STAGE_MISS_BIT_NV                  = 2048
 *         VK_SHADER_STAGE_INTERSECTION_BIT_NV          = 4096
 *         VK_SHADER_STAGE_CALLABLE_BIT_NV              = 8192
 *         VK_SHADER_STAGE_TASK_BIT_NV                  = 64
 *         VK_SHADER_STAGE_MESH_BIT_NV                  = 128
 *         VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI   = 16384
 *     }
 */
@Suppress("unused")
@JvmInline
value class ShaderStageFlags(val value: Int) {
	
	
	companion object {
		
		val VERTEX = ShaderStageFlags(1)
		
		val TESSELLATION_CONTROL = ShaderStageFlags(2)
		
		val TESSELLATION_EVALUATION = ShaderStageFlags(4)
		
		val GEOMETRY = ShaderStageFlags(8)
		
		val FRAGMENT = ShaderStageFlags(16)
		
		val COMPUTE = ShaderStageFlags(32)
		
		val ALL_GRAPHICS = ShaderStageFlags(0x0000001F)
		
		val ALL = ShaderStageFlags(0x7FFFFFFF)
	
	}
	
	
	
	operator fun plus(mask: ShaderStageFlags) = ShaderStageFlags(value or mask.value)
	
	operator fun contains(mask: ShaderStageFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkDescriptorPoolCreateFlagBits {
 *         VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT    = 1
 *         VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT      = 2
 *         VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT  = 2
 *         VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE        = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class DescriptorPoolCreateFlags(val value: Int) {
	
	
	companion object {
		
		val FREE_DESCRIPTOR_SET = DescriptorPoolCreateFlags(1)
		
		val UPDATE_AFTER_BIND = DescriptorPoolCreateFlags(2)
	
	}
	
	
	
	operator fun plus(mask: DescriptorPoolCreateFlags) = DescriptorPoolCreateFlags(value or mask.value)
	
	operator fun contains(mask: DescriptorPoolCreateFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkDescriptorSetLayoutCreateFlagBits {
 *         VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT      = 2
 *         VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR         = 1
 *         VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT  = 2
 *         VK_DESCRIPTOR_SET_LAYOUT_CREATE_RESERVED_4_BIT_AMD              = 16
 *         VK_DESCRIPTOR_SET_LAYOUT_CREATE_RESERVED_3_BIT_AMD              = 8
 *         VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE        = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class DescriptorSetLayoutCreateFlags(val value: Int) {
	
	
	companion object {
		
		val UPDATE_AFTER_BIND_POOL = DescriptorSetLayoutCreateFlags(2)
	
	}
	
	
	
	operator fun plus(mask: DescriptorSetLayoutCreateFlags) = DescriptorSetLayoutCreateFlags(value or mask.value)
	
	operator fun contains(mask: DescriptorSetLayoutCreateFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkAccessFlagBits {
 *         VK_ACCESS_INDIRECT_COMMAND_READ_BIT                      = 1
 *         VK_ACCESS_INDEX_READ_BIT                                 = 2
 *         VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT                      = 4
 *         VK_ACCESS_UNIFORM_READ_BIT                               = 8
 *         VK_ACCESS_INPUT_ATTACHMENT_READ_BIT                      = 16
 *         VK_ACCESS_SHADER_READ_BIT                                = 32
 *         VK_ACCESS_SHADER_WRITE_BIT                               = 64
 *         VK_ACCESS_COLOR_ATTACHMENT_READ_BIT                      = 128
 *         VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT                     = 256
 *         VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT              = 512
 *         VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT             = 1024
 *         VK_ACCESS_TRANSFER_READ_BIT                              = 2048
 *         VK_ACCESS_TRANSFER_WRITE_BIT                             = 4096
 *         VK_ACCESS_HOST_READ_BIT                                  = 8192
 *         VK_ACCESS_HOST_WRITE_BIT                                 = 16384
 *         VK_ACCESS_MEMORY_READ_BIT                                = 32768
 *         VK_ACCESS_MEMORY_WRITE_BIT                               = 65536
 *         VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT               = 33554432
 *         VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT        = 67108864
 *         VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT       = 134217728
 *         VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT             = 1048576
 *         VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT      = 524288
 *         VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR            = 2097152
 *         VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR           = 4194304
 *         VK_ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV                 = 8388608
 *         VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV             = 2097152
 *         VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV            = 4194304
 *         VK_ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT              = 16777216
 *         VK_ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR  = 8388608
 *         VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV                 = 131072
 *         VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV                = 262144
 *         VK_ACCESS_NONE_KHR                                       = 0
 *     }
 */
@Suppress("unused")
@JvmInline
value class AccessFlags(val value: Int) {
	
	
	companion object {
		
		val INDIRECT_COMMAND_READ = AccessFlags(1)
		
		val INDEX_READ = AccessFlags(2)
		
		val VERTEX_ATTRIBUTE_READ = AccessFlags(4)
		
		val UNIFORM_READ = AccessFlags(8)
		
		val INPUT_ATTACHMENT_READ = AccessFlags(16)
		
		val SHADER_READ = AccessFlags(32)
		
		val SHADER_WRITE = AccessFlags(64)
		
		val COLOR_ATTACHMENT_READ = AccessFlags(128)
		
		val COLOR_ATTACHMENT_WRITE = AccessFlags(256)
		
		val DEPTH_STENCIL_ATTACHMENT_READ = AccessFlags(512)
		
		val DEPTH_STENCIL_ATTACHMENT_WRITE = AccessFlags(1024)
		
		val TRANSFER_READ = AccessFlags(2048)
		
		val TRANSFER_WRITE = AccessFlags(4096)
		
		val HOST_READ = AccessFlags(8192)
		
		val HOST_WRITE = AccessFlags(16384)
		
		val MEMORY_READ = AccessFlags(32768)
		
		val MEMORY_WRITE = AccessFlags(65536)
	
	}
	
	
	
	operator fun plus(mask: AccessFlags) = AccessFlags(value or mask.value)
	
	operator fun contains(mask: AccessFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkAttachmentDescriptionFlagBits {
 *         VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class AttachmentDescriptionFlags(val value: Int) {
	
	
	companion object {
		
		val MAY_ALIAS = AttachmentDescriptionFlags(1)
	
	}
	
	
	
	operator fun plus(mask: AttachmentDescriptionFlags) = AttachmentDescriptionFlags(value or mask.value)
	
	operator fun contains(mask: AttachmentDescriptionFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkDependencyFlagBits {
 *         VK_DEPENDENCY_BY_REGION_BIT         = 1
 *         VK_DEPENDENCY_DEVICE_GROUP_BIT      = 4
 *         VK_DEPENDENCY_VIEW_LOCAL_BIT        = 2
 *         VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR    = 2
 *         VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR  = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class DependencyFlags(val value: Int) {
	
	
	companion object {
		
		val BY_REGION = DependencyFlags(1)
		
		val DEVICE_GROUP = DependencyFlags(4)
		
		val VIEW_LOCAL = DependencyFlags(2)
	
	}
	
	
	
	operator fun plus(mask: DependencyFlags) = DependencyFlags(value or mask.value)
	
	operator fun contains(mask: DependencyFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkFramebufferCreateFlagBits {
 *         VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT      = 1
 *         VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT_KHR  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class FramebufferCreateFlags(val value: Int) {
	
	
	companion object {
		
		val IMAGELESS = FramebufferCreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: FramebufferCreateFlags) = FramebufferCreateFlags(value or mask.value)
	
	operator fun contains(mask: FramebufferCreateFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkCommandPoolCreateFlagBits {
 *         VK_COMMAND_POOL_CREATE_TRANSIENT_BIT             = 1
 *         VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT  = 2
 *         VK_COMMAND_POOL_CREATE_PROTECTED_BIT             = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class CommandPoolCreateFlags(val value: Int) {
	
	
	companion object {
		
		val TRANSIENT = CommandPoolCreateFlags(1)
		
		val RESET_COMMAND_BUFFER = CommandPoolCreateFlags(2)
		
		val PROTECTED = CommandPoolCreateFlags(4)
	
	}
	
	
	
	operator fun plus(mask: CommandPoolCreateFlags) = CommandPoolCreateFlags(value or mask.value)
	
	operator fun contains(mask: CommandPoolCreateFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkCommandPoolResetFlagBits {
 *         VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT   = 1
 *         VK_COMMAND_POOL_RESET_RESERVED_1_BIT_COREAVI  = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class CommandPoolResetFlags(val value: Int) {
	
	
	companion object {
		
		val RELEASE_RESOURCES = CommandPoolResetFlags(1)
	
	}
	
	
	
	operator fun plus(mask: CommandPoolResetFlags) = CommandPoolResetFlags(value or mask.value)
	
	operator fun contains(mask: CommandPoolResetFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkCommandBufferResetFlagBits {
 *         VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class CommandBufferResetFlags(val value: Int) {
	
	
	companion object {
		
		val RELEASE_RESOURCES = CommandBufferResetFlags(1)
	
	}
	
	
	
	operator fun plus(mask: CommandBufferResetFlags) = CommandBufferResetFlags(value or mask.value)
	
	operator fun contains(mask: CommandBufferResetFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkCommandBufferUsageFlagBits {
 *         VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT       = 1
 *         VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT  = 2
 *         VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT      = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class CommandBufferUsageFlags(val value: Int) {
	
	
	companion object {
		
		val ONE_TIME_SUBMIT = CommandBufferUsageFlags(1)
		
		val RENDER_PASS_CONTINUE = CommandBufferUsageFlags(2)
		
		val SIMULTANEOUS_USE = CommandBufferUsageFlags(4)
	
	}
	
	
	
	operator fun plus(mask: CommandBufferUsageFlags) = CommandBufferUsageFlags(value or mask.value)
	
	operator fun contains(mask: CommandBufferUsageFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkQueryControlFlagBits {
 *         VK_QUERY_CONTROL_PRECISE_BIT  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class QueryControlFlags(val value: Int) {
	
	
	companion object {
		
		val PRECISE = QueryControlFlags(1)
	
	}
	
	
	
	operator fun plus(mask: QueryControlFlags) = QueryControlFlags(value or mask.value)
	
	operator fun contains(mask: QueryControlFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     enum VkStencilFaceFlagBits {
 *         VK_STENCIL_FACE_FRONT_BIT       = 1
 *         VK_STENCIL_FACE_BACK_BIT        = 2
 *         VK_STENCIL_FACE_FRONT_AND_BACK  = 0x00000003
 *         VK_STENCIL_FRONT_AND_BACK       = 0x00000003
 *     }
 */
@Suppress("unused")
@JvmInline
value class StencilFaceFlags(val value: Int) {
	
	
	companion object {
		
		val FRONT = StencilFaceFlags(1)
		
		val BACK = StencilFaceFlags(2)
		
		val FRONT_AND_BACK = StencilFaceFlags(0x00000003)
	
	}
	
	
	
	operator fun plus(mask: StencilFaceFlags) = StencilFaceFlags(value or mask.value)
	
	operator fun contains(mask: StencilFaceFlags) = value and mask.value == mask.value


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkExtent2D {
 *         uint32_t  width
 *         uint32_t  height
 *     }
 */
@JvmInline
value class Extent2D(override val address: Long) : Addressable {
	
	
	var width: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var height: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkExtent3D {
 *         uint32_t  width
 *         uint32_t  height
 *         uint32_t  depth
 *     }
 */
@JvmInline
value class Extent3D(override val address: Long) : Addressable {
	
	
	var width: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var height: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var depth: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkOffset2D {
 *         int32_t  x
 *         int32_t  y
 *     }
 */
@JvmInline
value class Offset2D(override val address: Long) : Addressable {
	
	
	var x: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var y: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = Offset2D(offset(index))
		
		operator fun set(index: Int, value: Offset2D) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (Offset2D) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (Offset2D) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, Offset2D) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkOffset3D {
 *         int32_t  x
 *         int32_t  y
 *         int32_t  z
 *     }
 */
@JvmInline
value class Offset3D(override val address: Long) : Addressable {
	
	
	var x: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var y: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var z: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 12
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = Offset3D(offset(index))
		
		operator fun set(index: Int, value: Offset3D) = Unsafe.copy(value.address, offset(index), 12)
		
		inline fun forEach(block: (Offset3D) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (Offset3D) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, Offset3D) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkRect2D {
 *         VkOffset2D  offset
 *         VkExtent2D  extent
 *     }
 */
@JvmInline
value class Rect2D(override val address: Long) : Addressable {
	
	
	var offset: Offset2D
		get()      = Offset2D(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 8)
	
	var extent: Extent2D
		get()      = Extent2D(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 8)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = Rect2D(offset(index))
		
		operator fun set(index: Int, value: Rect2D) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (Rect2D) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (Rect2D) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, Rect2D) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkBaseInStructure {
 *         VkStructureType     sType
 *         VkBaseInStructure*  pNext
 *     }
 */
@JvmInline
value class BaseInStructure(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkBaseOutStructure {
 *         VkStructureType      sType
 *         VkBaseOutStructure*  pNext
 *     }
 */
@JvmInline
value class BaseOutStructure(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkBufferMemoryBarrier {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkAccessFlags    srcAccessMask
 *         VkAccessFlags    dstAccessMask
 *         uint32_t         srcQueueFamilyIndex
 *         uint32_t         dstQueueFamilyIndex
 *         VkBuffer         buffer
 *         VkDeviceSize     offset
 *         VkDeviceSize     size
 *     }
 */
@JvmInline
value class BufferMemoryBarrier(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var dstAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var srcQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var dstQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 56
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BufferMemoryBarrier(offset(index))
		
		operator fun set(index: Int, value: BufferMemoryBarrier) = Unsafe.copy(value.address, offset(index), 56)
		
		inline fun forEach(block: (BufferMemoryBarrier) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferMemoryBarrier) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BufferMemoryBarrier) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDispatchIndirectCommand {
 *         uint32_t  x
 *         uint32_t  y
 *         uint32_t  z
 *     }
 */
@JvmInline
value class DispatchIndirectCommand(override val address: Long) : Addressable {
	
	
	var x: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var y: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var z: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDrawIndexedIndirectCommand {
 *         uint32_t  indexCount
 *         uint32_t  instanceCount
 *         uint32_t  firstIndex
 *         int32_t   vertexOffset
 *         uint32_t  firstInstance
 *     }
 */
@JvmInline
value class DrawIndexedIndirectCommand(override val address: Long) : Addressable {
	
	
	var indexCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var instanceCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var firstIndex: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var vertexOffset: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var firstInstance: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDrawIndirectCommand {
 *         uint32_t  vertexCount
 *         uint32_t  instanceCount
 *         uint32_t  firstVertex
 *         uint32_t  firstInstance
 *     }
 */
@JvmInline
value class DrawIndirectCommand(override val address: Long) : Addressable {
	
	
	var vertexCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var instanceCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var firstVertex: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var firstInstance: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkImageMemoryBarrier {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkAccessFlags            srcAccessMask
 *         VkAccessFlags            dstAccessMask
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
value class ImageMemoryBarrier(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var dstAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var oldLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var newLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var srcQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var dstQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)
	
	var subresourceRange: ImageSubresourceRange
		get()      = ImageSubresourceRange(address + 48)
		set(value) = Unsafe.copy(value.address, address + 48, 20)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 72
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageMemoryBarrier(offset(index))
		
		operator fun set(index: Int, value: ImageMemoryBarrier) = Unsafe.copy(value.address, offset(index), 72)
		
		inline fun forEach(block: (ImageMemoryBarrier) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageMemoryBarrier) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageMemoryBarrier) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkMemoryBarrier {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkAccessFlags    srcAccessMask
 *         VkAccessFlags    dstAccessMask
 *     }
 */
@JvmInline
value class MemoryBarrier(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var dstAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = MemoryBarrier(offset(index))
		
		operator fun set(index: Int, value: MemoryBarrier) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (MemoryBarrier) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MemoryBarrier) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, MemoryBarrier) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineCacheHeaderVersionOne {
 *         uint32_t                      headerSize
 *         VkPipelineCacheHeaderVersion  headerVersion
 *         uint32_t                      vendorID
 *         uint32_t                      deviceID
 *         uint8_t                       pipelineCacheUUID[16]
 *     }
 */
@JvmInline
value class PipelineCacheHeaderVersionOne(override val address: Long) : Addressable {
	
	
	var headerSize: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var headerVersion: PipelineCacheHeaderVersion
		get()      = _PipelineCacheHeaderVersion(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var vendorID: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var deviceID: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var pipelineCacheUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + 16, 16)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkAllocationCallbacks {
 *         void*                                 pUserData
 *         PFN_vkAllocationFunction              pfnAllocation
 *         PFN_vkReallocationFunction            pfnReallocation
 *         PFN_vkFreeFunction                    pfnFree
 *         PFN_vkInternalAllocationNotification  pfnInternalAllocation
 *         PFN_vkInternalFreeNotification        pfnInternalFree
 *     }
 */
@JvmInline
value class AllocationCallbacks(override val address: Long) : Addressable {
	
	
	var pUserData: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var pfnAllocation: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pfnReallocation: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var pfnFree: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pfnInternalAllocation: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pfnInternalFree: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkApplicationInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         char*            pApplicationName
 *         uint32_t         applicationVersion
 *         char*            pEngineName
 *         uint32_t         engineVersion
 *         uint32_t         apiVersion
 *     }
 */
@JvmInline
value class ApplicationInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pApplicationName: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var applicationVersion: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pEngineName: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var engineVersion: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var apiVersion: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	
	
	var applicationName:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var engineName:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkFormatProperties {
 *         VkFormatFeatureFlags  linearTilingFeatures
 *         VkFormatFeatureFlags  optimalTilingFeatures
 *         VkFormatFeatureFlags  bufferFeatures
 *     }
 */
@JvmInline
value class FormatProperties(override val address: Long) : Addressable {
	
	
	var linearTilingFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var optimalTilingFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var bufferFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkImageFormatProperties {
 *         VkExtent3D          maxExtent
 *         uint32_t            maxMipLevels
 *         uint32_t            maxArrayLayers
 *         VkSampleCountFlags  sampleCounts
 *         VkDeviceSize        maxResourceSize
 *     }
 */
@JvmInline
value class ImageFormatProperties(override val address: Long) : Addressable {
	
	
	var maxExtent: Extent3D
		get()      = Extent3D(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 12)
	
	var maxMipLevels: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var maxArrayLayers: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var sampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var maxResourceSize: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkInstanceCreateInfo {
 *         VkStructureType        sType
 *         void*                  pNext
 *         VkInstanceCreateFlags  flags (reserved, must be zero)
 *         VkApplicationInfo*     pApplicationInfo
 *         uint32_t               enabledLayerCount
 *         char**                 ppEnabledLayerNames
 *         uint32_t               enabledExtensionCount
 *         char**                 ppEnabledExtensionNames
 *     }
 * 
 *     Valid pNext types:
 *         - VkDebugReportCallbackCreateInfoEXT
 *         - VkValidationFlagsEXT
 *         - VkValidationFeaturesEXT
 *         - VkDebugUtilsMessengerCreateInfoEXT
 */
@JvmInline
value class InstanceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pApplicationInfo: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var enabledLayerCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var ppEnabledLayerNames: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var enabledExtensionCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var ppEnabledExtensionNames: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var applicationInfo: ApplicationInfo
		get()      = ApplicationInfo(Unsafe.getLong(address + 24))
		set(value) { Unsafe.setLong(address + 24, value.address) }
	
	var enabledLayerNames: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), enabledLayerCount)
		set(value) { ppEnabledLayerNames = value.address; enabledLayerCount = value.capacity }
	
	var enabledExtensionNames: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 56), enabledExtensionCount)
		set(value) { ppEnabledExtensionNames = value.address; enabledExtensionCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkMemoryHeap {
 *         VkDeviceSize       size
 *         VkMemoryHeapFlags  flags
 *     }
 */
@JvmInline
value class MemoryHeap(override val address: Long) : Addressable {
	
	
	var size: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var flags: MemoryHeapFlags
		get()      = MemoryHeapFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = MemoryHeap(offset(index))
		
		operator fun set(index: Int, value: MemoryHeap) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (MemoryHeap) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MemoryHeap) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, MemoryHeap) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkMemoryType {
 *         VkMemoryPropertyFlags  propertyFlags
 *         uint32_t               heapIndex
 *     }
 */
@JvmInline
value class MemoryType(override val address: Long) : Addressable {
	
	
	var propertyFlags: MemoryPropertyFlags
		get()      = MemoryPropertyFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var heapIndex: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = MemoryType(offset(index))
		
		operator fun set(index: Int, value: MemoryType) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (MemoryType) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MemoryType) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, MemoryType) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPhysicalDeviceFeatures {
 *         VkBool32  robustBufferAccess
 *         VkBool32  fullDrawIndexUint32
 *         VkBool32  imageCubeArray
 *         VkBool32  independentBlend
 *         VkBool32  geometryShader
 *         VkBool32  tessellationShader
 *         VkBool32  sampleRateShading
 *         VkBool32  dualSrcBlend
 *         VkBool32  logicOp
 *         VkBool32  multiDrawIndirect
 *         VkBool32  drawIndirectFirstInstance
 *         VkBool32  depthClamp
 *         VkBool32  depthBiasClamp
 *         VkBool32  fillModeNonSolid
 *         VkBool32  depthBounds
 *         VkBool32  wideLines
 *         VkBool32  largePoints
 *         VkBool32  alphaToOne
 *         VkBool32  multiViewport
 *         VkBool32  samplerAnisotropy
 *         VkBool32  textureCompressionETC2
 *         VkBool32  textureCompressionASTC_LDR
 *         VkBool32  textureCompressionBC
 *         VkBool32  occlusionQueryPrecise
 *         VkBool32  pipelineStatisticsQuery
 *         VkBool32  vertexPipelineStoresAndAtomics
 *         VkBool32  fragmentStoresAndAtomics
 *         VkBool32  shaderTessellationAndGeometryPointSize
 *         VkBool32  shaderImageGatherExtended
 *         VkBool32  shaderStorageImageExtendedFormats
 *         VkBool32  shaderStorageImageMultisample
 *         VkBool32  shaderStorageImageReadWithoutFormat
 *         VkBool32  shaderStorageImageWriteWithoutFormat
 *         VkBool32  shaderUniformBufferArrayDynamicIndexing
 *         VkBool32  shaderSampledImageArrayDynamicIndexing
 *         VkBool32  shaderStorageBufferArrayDynamicIndexing
 *         VkBool32  shaderStorageImageArrayDynamicIndexing
 *         VkBool32  shaderClipDistance
 *         VkBool32  shaderCullDistance
 *         VkBool32  shaderFloat64
 *         VkBool32  shaderInt64
 *         VkBool32  shaderInt16
 *         VkBool32  shaderResourceResidency
 *         VkBool32  shaderResourceMinLod
 *         VkBool32  sparseBinding
 *         VkBool32  sparseResidencyBuffer
 *         VkBool32  sparseResidencyImage2D
 *         VkBool32  sparseResidencyImage3D
 *         VkBool32  sparseResidency2Samples
 *         VkBool32  sparseResidency4Samples
 *         VkBool32  sparseResidency8Samples
 *         VkBool32  sparseResidency16Samples
 *         VkBool32  sparseResidencyAliased
 *         VkBool32  variableMultisampleRate
 *         VkBool32  inheritedQueries
 *     }
 */
@JvmInline
value class PhysicalDeviceFeatures(override val address: Long) : Addressable {
	
	
	var robustBufferAccess: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var fullDrawIndexUint32: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var imageCubeArray: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var independentBlend: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var geometryShader: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var tessellationShader: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var sampleRateShading: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var dualSrcBlend: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var logicOp: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var multiDrawIndirect: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var drawIndirectFirstInstance: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var depthClamp: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var depthBiasClamp: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var fillModeNonSolid: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var depthBounds: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var wideLines: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var largePoints: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var alphaToOne: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var multiViewport: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var samplerAnisotropy: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var textureCompressionETC2: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var textureCompressionASTC_LDR: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var textureCompressionBC: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var occlusionQueryPrecise: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var pipelineStatisticsQuery: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var vertexPipelineStoresAndAtomics: Int
		get()      = Unsafe.getInt(address + 100)
		set(value) = Unsafe.setInt(address + 100, value)
	
	var fragmentStoresAndAtomics: Int
		get()      = Unsafe.getInt(address + 104)
		set(value) = Unsafe.setInt(address + 104, value)
	
	var shaderTessellationAndGeometryPointSize: Int
		get()      = Unsafe.getInt(address + 108)
		set(value) = Unsafe.setInt(address + 108, value)
	
	var shaderImageGatherExtended: Int
		get()      = Unsafe.getInt(address + 112)
		set(value) = Unsafe.setInt(address + 112, value)
	
	var shaderStorageImageExtendedFormats: Int
		get()      = Unsafe.getInt(address + 116)
		set(value) = Unsafe.setInt(address + 116, value)
	
	var shaderStorageImageMultisample: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var shaderStorageImageReadWithoutFormat: Int
		get()      = Unsafe.getInt(address + 124)
		set(value) = Unsafe.setInt(address + 124, value)
	
	var shaderStorageImageWriteWithoutFormat: Int
		get()      = Unsafe.getInt(address + 128)
		set(value) = Unsafe.setInt(address + 128, value)
	
	var shaderUniformBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 132)
		set(value) = Unsafe.setInt(address + 132, value)
	
	var shaderSampledImageArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 136)
		set(value) = Unsafe.setInt(address + 136, value)
	
	var shaderStorageBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 140)
		set(value) = Unsafe.setInt(address + 140, value)
	
	var shaderStorageImageArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 144)
		set(value) = Unsafe.setInt(address + 144, value)
	
	var shaderClipDistance: Int
		get()      = Unsafe.getInt(address + 148)
		set(value) = Unsafe.setInt(address + 148, value)
	
	var shaderCullDistance: Int
		get()      = Unsafe.getInt(address + 152)
		set(value) = Unsafe.setInt(address + 152, value)
	
	var shaderFloat64: Int
		get()      = Unsafe.getInt(address + 156)
		set(value) = Unsafe.setInt(address + 156, value)
	
	var shaderInt64: Int
		get()      = Unsafe.getInt(address + 160)
		set(value) = Unsafe.setInt(address + 160, value)
	
	var shaderInt16: Int
		get()      = Unsafe.getInt(address + 164)
		set(value) = Unsafe.setInt(address + 164, value)
	
	var shaderResourceResidency: Int
		get()      = Unsafe.getInt(address + 168)
		set(value) = Unsafe.setInt(address + 168, value)
	
	var shaderResourceMinLod: Int
		get()      = Unsafe.getInt(address + 172)
		set(value) = Unsafe.setInt(address + 172, value)
	
	var sparseBinding: Int
		get()      = Unsafe.getInt(address + 176)
		set(value) = Unsafe.setInt(address + 176, value)
	
	var sparseResidencyBuffer: Int
		get()      = Unsafe.getInt(address + 180)
		set(value) = Unsafe.setInt(address + 180, value)
	
	var sparseResidencyImage2D: Int
		get()      = Unsafe.getInt(address + 184)
		set(value) = Unsafe.setInt(address + 184, value)
	
	var sparseResidencyImage3D: Int
		get()      = Unsafe.getInt(address + 188)
		set(value) = Unsafe.setInt(address + 188, value)
	
	var sparseResidency2Samples: Int
		get()      = Unsafe.getInt(address + 192)
		set(value) = Unsafe.setInt(address + 192, value)
	
	var sparseResidency4Samples: Int
		get()      = Unsafe.getInt(address + 196)
		set(value) = Unsafe.setInt(address + 196, value)
	
	var sparseResidency8Samples: Int
		get()      = Unsafe.getInt(address + 200)
		set(value) = Unsafe.setInt(address + 200, value)
	
	var sparseResidency16Samples: Int
		get()      = Unsafe.getInt(address + 204)
		set(value) = Unsafe.setInt(address + 204, value)
	
	var sparseResidencyAliased: Int
		get()      = Unsafe.getInt(address + 208)
		set(value) = Unsafe.setInt(address + 208, value)
	
	var variableMultisampleRate: Int
		get()      = Unsafe.getInt(address + 212)
		set(value) = Unsafe.setInt(address + 212, value)
	
	var inheritedQueries: Int
		get()      = Unsafe.getInt(address + 216)
		set(value) = Unsafe.setInt(address + 216, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPhysicalDeviceLimits {
 *         uint32_t            maxImageDimension1D
 *         uint32_t            maxImageDimension2D
 *         uint32_t            maxImageDimension3D
 *         uint32_t            maxImageDimensionCube
 *         uint32_t            maxImageArrayLayers
 *         uint32_t            maxTexelBufferElements
 *         uint32_t            maxUniformBufferRange
 *         uint32_t            maxStorageBufferRange
 *         uint32_t            maxPushConstantsSize
 *         uint32_t            maxMemoryAllocationCount
 *         uint32_t            maxSamplerAllocationCount
 *         VkDeviceSize        bufferImageGranularity
 *         VkDeviceSize        sparseAddressSpaceSize
 *         uint32_t            maxBoundDescriptorSets
 *         uint32_t            maxPerStageDescriptorSamplers
 *         uint32_t            maxPerStageDescriptorUniformBuffers
 *         uint32_t            maxPerStageDescriptorStorageBuffers
 *         uint32_t            maxPerStageDescriptorSampledImages
 *         uint32_t            maxPerStageDescriptorStorageImages
 *         uint32_t            maxPerStageDescriptorInputAttachments
 *         uint32_t            maxPerStageResources
 *         uint32_t            maxDescriptorSetSamplers
 *         uint32_t            maxDescriptorSetUniformBuffers
 *         uint32_t            maxDescriptorSetUniformBuffersDynamic
 *         uint32_t            maxDescriptorSetStorageBuffers
 *         uint32_t            maxDescriptorSetStorageBuffersDynamic
 *         uint32_t            maxDescriptorSetSampledImages
 *         uint32_t            maxDescriptorSetStorageImages
 *         uint32_t            maxDescriptorSetInputAttachments
 *         uint32_t            maxVertexInputAttributes
 *         uint32_t            maxVertexInputBindings
 *         uint32_t            maxVertexInputAttributeOffset
 *         uint32_t            maxVertexInputBindingStride
 *         uint32_t            maxVertexOutputComponents
 *         uint32_t            maxTessellationGenerationLevel
 *         uint32_t            maxTessellationPatchSize
 *         uint32_t            maxTessellationControlPerVertexInputComponents
 *         uint32_t            maxTessellationControlPerVertexOutputComponents
 *         uint32_t            maxTessellationControlPerPatchOutputComponents
 *         uint32_t            maxTessellationControlTotalOutputComponents
 *         uint32_t            maxTessellationEvaluationInputComponents
 *         uint32_t            maxTessellationEvaluationOutputComponents
 *         uint32_t            maxGeometryShaderInvocations
 *         uint32_t            maxGeometryInputComponents
 *         uint32_t            maxGeometryOutputComponents
 *         uint32_t            maxGeometryOutputVertices
 *         uint32_t            maxGeometryTotalOutputComponents
 *         uint32_t            maxFragmentInputComponents
 *         uint32_t            maxFragmentOutputAttachments
 *         uint32_t            maxFragmentDualSrcAttachments
 *         uint32_t            maxFragmentCombinedOutputResources
 *         uint32_t            maxComputeSharedMemorySize
 *         uint32_t            maxComputeWorkGroupCount[3]
 *         uint32_t            maxComputeWorkGroupInvocations
 *         uint32_t            maxComputeWorkGroupSize[3]
 *         uint32_t            subPixelPrecisionBits
 *         uint32_t            subTexelPrecisionBits
 *         uint32_t            mipmapPrecisionBits
 *         uint32_t            maxDrawIndexedIndexValue
 *         uint32_t            maxDrawIndirectCount
 *         float               maxSamplerLodBias
 *         float               maxSamplerAnisotropy
 *         uint32_t            maxViewports
 *         uint32_t            maxViewportDimensions[2]
 *         float               viewportBoundsRange[2]
 *         uint32_t            viewportSubPixelBits
 *         size_t              minMemoryMapAlignment
 *         VkDeviceSize        minTexelBufferOffsetAlignment
 *         VkDeviceSize        minUniformBufferOffsetAlignment
 *         VkDeviceSize        minStorageBufferOffsetAlignment
 *         int32_t             minTexelOffset
 *         uint32_t            maxTexelOffset
 *         int32_t             minTexelGatherOffset
 *         uint32_t            maxTexelGatherOffset
 *         float               minInterpolationOffset
 *         float               maxInterpolationOffset
 *         uint32_t            subPixelInterpolationOffsetBits
 *         uint32_t            maxFramebufferWidth
 *         uint32_t            maxFramebufferHeight
 *         uint32_t            maxFramebufferLayers
 *         VkSampleCountFlags  framebufferColorSampleCounts
 *         VkSampleCountFlags  framebufferDepthSampleCounts
 *         VkSampleCountFlags  framebufferStencilSampleCounts
 *         VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
 *         uint32_t            maxColorAttachments
 *         VkSampleCountFlags  sampledImageColorSampleCounts
 *         VkSampleCountFlags  sampledImageIntegerSampleCounts
 *         VkSampleCountFlags  sampledImageDepthSampleCounts
 *         VkSampleCountFlags  sampledImageStencilSampleCounts
 *         VkSampleCountFlags  storageImageSampleCounts
 *         uint32_t            maxSampleMaskWords
 *         VkBool32            timestampComputeAndGraphics
 *         float               timestampPeriod
 *         uint32_t            maxClipDistances
 *         uint32_t            maxCullDistances
 *         uint32_t            maxCombinedClipAndCullDistances
 *         uint32_t            discreteQueuePriorities
 *         float               pointSizeRange[2]
 *         float               lineWidthRange[2]
 *         float               pointSizeGranularity
 *         float               lineWidthGranularity
 *         VkBool32            strictLines
 *         VkBool32            standardSampleLocations
 *         VkDeviceSize        optimalBufferCopyOffsetAlignment
 *         VkDeviceSize        optimalBufferCopyRowPitchAlignment
 *         VkDeviceSize        nonCoherentAtomSize
 *     }
 */
@JvmInline
value class PhysicalDeviceLimits(override val address: Long) : Addressable {
	
	
	var maxImageDimension1D: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var maxImageDimension2D: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var maxImageDimension3D: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var maxImageDimensionCube: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var maxImageArrayLayers: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxTexelBufferElements: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxUniformBufferRange: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var maxStorageBufferRange: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var maxPushConstantsSize: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var maxMemoryAllocationCount: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var maxSamplerAllocationCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var bufferImageGranularity: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var sparseAddressSpaceSize: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var maxBoundDescriptorSets: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var maxPerStageDescriptorSamplers: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var maxPerStageDescriptorUniformBuffers: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var maxPerStageDescriptorStorageBuffers: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var maxPerStageDescriptorSampledImages: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var maxPerStageDescriptorStorageImages: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var maxPerStageDescriptorInputAttachments: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var maxPerStageResources: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var maxDescriptorSetSamplers: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var maxDescriptorSetUniformBuffers: Int
		get()      = Unsafe.getInt(address + 100)
		set(value) = Unsafe.setInt(address + 100, value)
	
	var maxDescriptorSetUniformBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 104)
		set(value) = Unsafe.setInt(address + 104, value)
	
	var maxDescriptorSetStorageBuffers: Int
		get()      = Unsafe.getInt(address + 108)
		set(value) = Unsafe.setInt(address + 108, value)
	
	var maxDescriptorSetStorageBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 112)
		set(value) = Unsafe.setInt(address + 112, value)
	
	var maxDescriptorSetSampledImages: Int
		get()      = Unsafe.getInt(address + 116)
		set(value) = Unsafe.setInt(address + 116, value)
	
	var maxDescriptorSetStorageImages: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var maxDescriptorSetInputAttachments: Int
		get()      = Unsafe.getInt(address + 124)
		set(value) = Unsafe.setInt(address + 124, value)
	
	var maxVertexInputAttributes: Int
		get()      = Unsafe.getInt(address + 128)
		set(value) = Unsafe.setInt(address + 128, value)
	
	var maxVertexInputBindings: Int
		get()      = Unsafe.getInt(address + 132)
		set(value) = Unsafe.setInt(address + 132, value)
	
	var maxVertexInputAttributeOffset: Int
		get()      = Unsafe.getInt(address + 136)
		set(value) = Unsafe.setInt(address + 136, value)
	
	var maxVertexInputBindingStride: Int
		get()      = Unsafe.getInt(address + 140)
		set(value) = Unsafe.setInt(address + 140, value)
	
	var maxVertexOutputComponents: Int
		get()      = Unsafe.getInt(address + 144)
		set(value) = Unsafe.setInt(address + 144, value)
	
	var maxTessellationGenerationLevel: Int
		get()      = Unsafe.getInt(address + 148)
		set(value) = Unsafe.setInt(address + 148, value)
	
	var maxTessellationPatchSize: Int
		get()      = Unsafe.getInt(address + 152)
		set(value) = Unsafe.setInt(address + 152, value)
	
	var maxTessellationControlPerVertexInputComponents: Int
		get()      = Unsafe.getInt(address + 156)
		set(value) = Unsafe.setInt(address + 156, value)
	
	var maxTessellationControlPerVertexOutputComponents: Int
		get()      = Unsafe.getInt(address + 160)
		set(value) = Unsafe.setInt(address + 160, value)
	
	var maxTessellationControlPerPatchOutputComponents: Int
		get()      = Unsafe.getInt(address + 164)
		set(value) = Unsafe.setInt(address + 164, value)
	
	var maxTessellationControlTotalOutputComponents: Int
		get()      = Unsafe.getInt(address + 168)
		set(value) = Unsafe.setInt(address + 168, value)
	
	var maxTessellationEvaluationInputComponents: Int
		get()      = Unsafe.getInt(address + 172)
		set(value) = Unsafe.setInt(address + 172, value)
	
	var maxTessellationEvaluationOutputComponents: Int
		get()      = Unsafe.getInt(address + 176)
		set(value) = Unsafe.setInt(address + 176, value)
	
	var maxGeometryShaderInvocations: Int
		get()      = Unsafe.getInt(address + 180)
		set(value) = Unsafe.setInt(address + 180, value)
	
	var maxGeometryInputComponents: Int
		get()      = Unsafe.getInt(address + 184)
		set(value) = Unsafe.setInt(address + 184, value)
	
	var maxGeometryOutputComponents: Int
		get()      = Unsafe.getInt(address + 188)
		set(value) = Unsafe.setInt(address + 188, value)
	
	var maxGeometryOutputVertices: Int
		get()      = Unsafe.getInt(address + 192)
		set(value) = Unsafe.setInt(address + 192, value)
	
	var maxGeometryTotalOutputComponents: Int
		get()      = Unsafe.getInt(address + 196)
		set(value) = Unsafe.setInt(address + 196, value)
	
	var maxFragmentInputComponents: Int
		get()      = Unsafe.getInt(address + 200)
		set(value) = Unsafe.setInt(address + 200, value)
	
	var maxFragmentOutputAttachments: Int
		get()      = Unsafe.getInt(address + 204)
		set(value) = Unsafe.setInt(address + 204, value)
	
	var maxFragmentDualSrcAttachments: Int
		get()      = Unsafe.getInt(address + 208)
		set(value) = Unsafe.setInt(address + 208, value)
	
	var maxFragmentCombinedOutputResources: Int
		get()      = Unsafe.getInt(address + 212)
		set(value) = Unsafe.setInt(address + 212, value)
	
	var maxComputeSharedMemorySize: Int
		get()      = Unsafe.getInt(address + 216)
		set(value) = Unsafe.setInt(address + 216, value)
	
	var maxComputeWorkGroupCount: DirectIntBuffer
		get()      = DirectIntBuffer(address + 220, 3)
		set(value) = Unsafe.copy(value.address, address + 220, value.byteSize)
	
	var maxComputeWorkGroupInvocations: Int
		get()      = Unsafe.getInt(address + 232)
		set(value) = Unsafe.setInt(address + 232, value)
	
	var maxComputeWorkGroupSize: DirectIntBuffer
		get()      = DirectIntBuffer(address + 236, 3)
		set(value) = Unsafe.copy(value.address, address + 236, value.byteSize)
	
	var subPixelPrecisionBits: Int
		get()      = Unsafe.getInt(address + 248)
		set(value) = Unsafe.setInt(address + 248, value)
	
	var subTexelPrecisionBits: Int
		get()      = Unsafe.getInt(address + 252)
		set(value) = Unsafe.setInt(address + 252, value)
	
	var mipmapPrecisionBits: Int
		get()      = Unsafe.getInt(address + 256)
		set(value) = Unsafe.setInt(address + 256, value)
	
	var maxDrawIndexedIndexValue: Int
		get()      = Unsafe.getInt(address + 260)
		set(value) = Unsafe.setInt(address + 260, value)
	
	var maxDrawIndirectCount: Int
		get()      = Unsafe.getInt(address + 264)
		set(value) = Unsafe.setInt(address + 264, value)
	
	var maxSamplerLodBias: Float
		get()      = Unsafe.getFloat(address + 268)
		set(value) = Unsafe.setFloat(address + 268, value)
	
	var maxSamplerAnisotropy: Float
		get()      = Unsafe.getFloat(address + 272)
		set(value) = Unsafe.setFloat(address + 272, value)
	
	var maxViewports: Int
		get()      = Unsafe.getInt(address + 276)
		set(value) = Unsafe.setInt(address + 276, value)
	
	var maxViewportDimensions: DirectIntBuffer
		get()      = DirectIntBuffer(address + 280, 2)
		set(value) = Unsafe.copy(value.address, address + 280, value.byteSize)
	
	var viewportBoundsRange: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 288, 2)
		set(value) = Unsafe.copy(value.address, address + 288, value.byteSize)
	
	var viewportSubPixelBits: Int
		get()      = Unsafe.getInt(address + 296)
		set(value) = Unsafe.setInt(address + 296, value)
	
	var minMemoryMapAlignment: Long
		get()      = Unsafe.getLong(address + 304)
		set(value) = Unsafe.setLong(address + 304, value)
	
	var minTexelBufferOffsetAlignment: Long
		get()      = Unsafe.getLong(address + 312)
		set(value) = Unsafe.setLong(address + 312, value)
	
	var minUniformBufferOffsetAlignment: Long
		get()      = Unsafe.getLong(address + 320)
		set(value) = Unsafe.setLong(address + 320, value)
	
	var minStorageBufferOffsetAlignment: Long
		get()      = Unsafe.getLong(address + 328)
		set(value) = Unsafe.setLong(address + 328, value)
	
	var minTexelOffset: Int
		get()      = Unsafe.getInt(address + 336)
		set(value) = Unsafe.setInt(address + 336, value)
	
	var maxTexelOffset: Int
		get()      = Unsafe.getInt(address + 340)
		set(value) = Unsafe.setInt(address + 340, value)
	
	var minTexelGatherOffset: Int
		get()      = Unsafe.getInt(address + 344)
		set(value) = Unsafe.setInt(address + 344, value)
	
	var maxTexelGatherOffset: Int
		get()      = Unsafe.getInt(address + 348)
		set(value) = Unsafe.setInt(address + 348, value)
	
	var minInterpolationOffset: Float
		get()      = Unsafe.getFloat(address + 352)
		set(value) = Unsafe.setFloat(address + 352, value)
	
	var maxInterpolationOffset: Float
		get()      = Unsafe.getFloat(address + 356)
		set(value) = Unsafe.setFloat(address + 356, value)
	
	var subPixelInterpolationOffsetBits: Int
		get()      = Unsafe.getInt(address + 360)
		set(value) = Unsafe.setInt(address + 360, value)
	
	var maxFramebufferWidth: Int
		get()      = Unsafe.getInt(address + 364)
		set(value) = Unsafe.setInt(address + 364, value)
	
	var maxFramebufferHeight: Int
		get()      = Unsafe.getInt(address + 368)
		set(value) = Unsafe.setInt(address + 368, value)
	
	var maxFramebufferLayers: Int
		get()      = Unsafe.getInt(address + 372)
		set(value) = Unsafe.setInt(address + 372, value)
	
	var framebufferColorSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 376))
		set(value) = Unsafe.setInt(address + 376, value.value)
	
	var framebufferDepthSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 380))
		set(value) = Unsafe.setInt(address + 380, value.value)
	
	var framebufferStencilSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 384))
		set(value) = Unsafe.setInt(address + 384, value.value)
	
	var framebufferNoAttachmentsSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 388))
		set(value) = Unsafe.setInt(address + 388, value.value)
	
	var maxColorAttachments: Int
		get()      = Unsafe.getInt(address + 392)
		set(value) = Unsafe.setInt(address + 392, value)
	
	var sampledImageColorSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 396))
		set(value) = Unsafe.setInt(address + 396, value.value)
	
	var sampledImageIntegerSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 400))
		set(value) = Unsafe.setInt(address + 400, value.value)
	
	var sampledImageDepthSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 404))
		set(value) = Unsafe.setInt(address + 404, value.value)
	
	var sampledImageStencilSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 408))
		set(value) = Unsafe.setInt(address + 408, value.value)
	
	var storageImageSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 412))
		set(value) = Unsafe.setInt(address + 412, value.value)
	
	var maxSampleMaskWords: Int
		get()      = Unsafe.getInt(address + 416)
		set(value) = Unsafe.setInt(address + 416, value)
	
	var timestampComputeAndGraphics: Int
		get()      = Unsafe.getInt(address + 420)
		set(value) = Unsafe.setInt(address + 420, value)
	
	var timestampPeriod: Float
		get()      = Unsafe.getFloat(address + 424)
		set(value) = Unsafe.setFloat(address + 424, value)
	
	var maxClipDistances: Int
		get()      = Unsafe.getInt(address + 428)
		set(value) = Unsafe.setInt(address + 428, value)
	
	var maxCullDistances: Int
		get()      = Unsafe.getInt(address + 432)
		set(value) = Unsafe.setInt(address + 432, value)
	
	var maxCombinedClipAndCullDistances: Int
		get()      = Unsafe.getInt(address + 436)
		set(value) = Unsafe.setInt(address + 436, value)
	
	var discreteQueuePriorities: Int
		get()      = Unsafe.getInt(address + 440)
		set(value) = Unsafe.setInt(address + 440, value)
	
	var pointSizeRange: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 444, 2)
		set(value) = Unsafe.copy(value.address, address + 444, value.byteSize)
	
	var lineWidthRange: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 452, 2)
		set(value) = Unsafe.copy(value.address, address + 452, value.byteSize)
	
	var pointSizeGranularity: Float
		get()      = Unsafe.getFloat(address + 460)
		set(value) = Unsafe.setFloat(address + 460, value)
	
	var lineWidthGranularity: Float
		get()      = Unsafe.getFloat(address + 464)
		set(value) = Unsafe.setFloat(address + 464, value)
	
	var strictLines: Int
		get()      = Unsafe.getInt(address + 468)
		set(value) = Unsafe.setInt(address + 468, value)
	
	var standardSampleLocations: Int
		get()      = Unsafe.getInt(address + 472)
		set(value) = Unsafe.setInt(address + 472, value)
	
	var optimalBufferCopyOffsetAlignment: Long
		get()      = Unsafe.getLong(address + 480)
		set(value) = Unsafe.setLong(address + 480, value)
	
	var optimalBufferCopyRowPitchAlignment: Long
		get()      = Unsafe.getLong(address + 488)
		set(value) = Unsafe.setLong(address + 488, value)
	
	var nonCoherentAtomSize: Long
		get()      = Unsafe.getLong(address + 496)
		set(value) = Unsafe.setLong(address + 496, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPhysicalDeviceMemoryProperties {
 *         uint32_t      memoryTypeCount
 *         VkMemoryType  memoryTypes[32]
 *         uint32_t      memoryHeapCount
 *         VkMemoryHeap  memoryHeaps[16]
 *     }
 */
@JvmInline
value class PhysicalDeviceMemoryProperties(override val address: Long) : Addressable {
	
	
	var memoryTypeCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var memoryTypes: MemoryType.Buffer
		get()      = MemoryType.Buffer(address + 4, 32)
		set(value) = Unsafe.copy(value.address, address + 4, value.byteSize)
	
	var memoryHeapCount: Int
		get()      = Unsafe.getInt(address + 260)
		set(value) = Unsafe.setInt(address + 260, value)
	
	var memoryHeaps: MemoryHeap.Buffer
		get()      = MemoryHeap.Buffer(address + 264, 16)
		set(value) = Unsafe.copy(value.address, address + 264, value.byteSize)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPhysicalDeviceProperties {
 *         uint32_t                          apiVersion
 *         uint32_t                          driverVersion
 *         uint32_t                          vendorID
 *         uint32_t                          deviceID
 *         VkPhysicalDeviceType              deviceType
 *         char                              deviceName[256]
 *         uint8_t                           pipelineCacheUUID[16]
 *         VkPhysicalDeviceLimits            limits
 *         VkPhysicalDeviceSparseProperties  sparseProperties
 *     }
 */
@JvmInline
value class PhysicalDeviceProperties(override val address: Long) : Addressable {
	
	
	var apiVersion: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var driverVersion: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var vendorID: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var deviceID: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var deviceType: PhysicalDeviceType
		get()      = _PhysicalDeviceType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var deviceName: DirectByteBuffer
		get()      = DirectByteBuffer(address + 20, 256)
		set(value) = Unsafe.copy(value.address, address + 20, value.byteSize)
	
	var pipelineCacheUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + 276, 16)
		set(value) = Unsafe.copy(value.address, address + 276, value.byteSize)
	
	var limits: PhysicalDeviceLimits
		get()      = PhysicalDeviceLimits(address + 296)
		set(value) = Unsafe.copy(value.address, address + 296, 504)
	
	var sparseProperties: PhysicalDeviceSparseProperties
		get()      = PhysicalDeviceSparseProperties(address + 800)
		set(value) = Unsafe.copy(value.address, address + 800, 20)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPhysicalDeviceSparseProperties {
 *         VkBool32  residencyStandard2DBlockShape
 *         VkBool32  residencyStandard2DMultisampleBlockShape
 *         VkBool32  residencyStandard3DBlockShape
 *         VkBool32  residencyAlignedMipSize
 *         VkBool32  residencyNonResidentStrict
 *     }
 */
@JvmInline
value class PhysicalDeviceSparseProperties(override val address: Long) : Addressable {
	
	
	var residencyStandard2DBlockShape: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var residencyStandard2DMultisampleBlockShape: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var residencyStandard3DBlockShape: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var residencyAlignedMipSize: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var residencyNonResidentStrict: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkQueueFamilyProperties {
 *         VkQueueFlags  queueFlags
 *         uint32_t      queueCount
 *         uint32_t      timestampValidBits
 *         VkExtent3D    minImageTransferGranularity
 *     }
 */
@JvmInline
value class QueueFamilyProperties(override val address: Long) : Addressable {
	
	
	var queueFlags: QueueFlags
		get()      = QueueFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var queueCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var timestampValidBits: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var minImageTransferGranularity: Extent3D
		get()      = Extent3D(address + 12)
		set(value) = Unsafe.copy(value.address, address + 12, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = QueueFamilyProperties(offset(index))
		
		operator fun set(index: Int, value: QueueFamilyProperties) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (QueueFamilyProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (QueueFamilyProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, QueueFamilyProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDeviceCreateInfo {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkDeviceCreateFlags        flags (reserved, must be zero)
 *         uint32_t                   queueCreateInfoCount
 *         VkDeviceQueueCreateInfo*   pQueueCreateInfos
 *         uint32_t                   enabledLayerCount
 *         char**                     ppEnabledLayerNames
 *         uint32_t                   enabledExtensionCount
 *         char**                     ppEnabledExtensionNames
 *         VkPhysicalDeviceFeatures*  pEnabledFeatures
 *     }
 * 
 *     Valid pNext types:
 *         - VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV
 *         - VkDevicePrivateDataCreateInfoEXT
 *         - VkPhysicalDevicePrivateDataFeaturesEXT
 *         - VkPhysicalDeviceFeatures2
 *         - VkPhysicalDeviceVariablePointersFeatures
 *         - VkPhysicalDeviceMultiviewFeatures
 *         - VkDeviceGroupDeviceCreateInfo
 *         - VkPhysicalDevicePresentIdFeaturesKHR
 *         - VkPhysicalDevicePresentWaitFeaturesKHR
 *         - VkPhysicalDevice16BitStorageFeatures
 *         - VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures
 *         - VkPhysicalDeviceSamplerYcbcrConversionFeatures
 *         - VkPhysicalDeviceProtectedMemoryFeatures
 *         - VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT
 *         - VkPhysicalDeviceMultiDrawFeaturesEXT
 *         - VkPhysicalDeviceInlineUniformBlockFeaturesEXT
 *         - VkPhysicalDeviceMaintenance4FeaturesKHR
 *         - VkPhysicalDeviceShaderDrawParametersFeatures
 *         - VkPhysicalDeviceShaderFloat16Int8Features
 *         - VkPhysicalDeviceHostQueryResetFeatures
 *         - VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT
 *         - VkPhysicalDeviceDeviceMemoryReportFeaturesEXT
 *         - VkDeviceDeviceMemoryReportCreateInfoEXT
 *         - VkPhysicalDeviceDescriptorIndexingFeatures
 *         - VkPhysicalDeviceTimelineSemaphoreFeatures
 *         - VkPhysicalDevice8BitStorageFeatures
 *         - VkPhysicalDeviceConditionalRenderingFeaturesEXT
 *         - VkPhysicalDeviceVulkanMemoryModelFeatures
 *         - VkPhysicalDeviceShaderAtomicInt64Features
 *         - VkPhysicalDeviceShaderAtomicFloatFeaturesEXT
 *         - VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
 *         - VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT
 *         - VkPhysicalDeviceASTCDecodeFeaturesEXT
 *         - VkPhysicalDeviceTransformFeedbackFeaturesEXT
 *         - VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV
 *         - VkPhysicalDeviceExclusiveScissorFeaturesNV
 *         - VkPhysicalDeviceCornerSampledImageFeaturesNV
 *         - VkPhysicalDeviceComputeShaderDerivativesFeaturesNV
 *         - VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV
 *         - VkPhysicalDeviceShaderImageFootprintFeaturesNV
 *         - VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV
 *         - VkPhysicalDeviceShadingRateImageFeaturesNV
 *         - VkPhysicalDeviceInvocationMaskFeaturesHUAWEI
 *         - VkPhysicalDeviceMeshShaderFeaturesNV
 *         - VkPhysicalDeviceAccelerationStructureFeaturesKHR
 *         - VkPhysicalDeviceRayTracingPipelineFeaturesKHR
 *         - VkPhysicalDeviceRayQueryFeaturesKHR
 *         - VkDeviceMemoryOverallocationCreateInfoAMD
 *         - VkPhysicalDeviceFragmentDensityMapFeaturesEXT
 *         - VkPhysicalDeviceFragmentDensityMap2FeaturesEXT
 *         - VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM
 *         - VkPhysicalDeviceScalarBlockLayoutFeatures
 *         - VkPhysicalDeviceUniformBufferStandardLayoutFeatures
 *         - VkPhysicalDeviceDepthClipEnableFeaturesEXT
 *         - VkPhysicalDeviceMemoryPriorityFeaturesEXT
 *         - VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT
 *         - VkPhysicalDeviceBufferDeviceAddressFeatures
 *         - VkPhysicalDeviceBufferDeviceAddressFeaturesEXT
 *         - VkPhysicalDeviceImagelessFramebufferFeatures
 *         - VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT
 *         - VkPhysicalDeviceCooperativeMatrixFeaturesNV
 *         - VkPhysicalDeviceYcbcrImageArraysFeaturesEXT
 *         - VkPhysicalDevicePerformanceQueryFeaturesKHR
 *         - VkPhysicalDeviceCoverageReductionModeFeaturesNV
 *         - VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL
 *         - VkPhysicalDeviceShaderClockFeaturesKHR
 *         - VkPhysicalDeviceIndexTypeUint8FeaturesEXT
 *         - VkPhysicalDeviceShaderSMBuiltinsFeaturesNV
 *         - VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT
 *         - VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures
 *         - VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT
 *         - VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR
 *         - VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT
 *         - VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT
 *         - VkPhysicalDeviceSubgroupSizeControlFeaturesEXT
 *         - VkPhysicalDeviceLineRasterizationFeaturesEXT
 *         - VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT
 *         - VkPhysicalDeviceVulkan11Features
 *         - VkPhysicalDeviceVulkan12Features
 *         - VkPhysicalDeviceCoherentMemoryFeaturesAMD
 *         - VkPhysicalDeviceCustomBorderColorFeaturesEXT
 *         - VkPhysicalDeviceBorderColorSwizzleFeaturesEXT
 *         - VkPhysicalDeviceExtendedDynamicStateFeaturesEXT
 *         - VkPhysicalDeviceExtendedDynamicState2FeaturesEXT
 *         - VkPhysicalDeviceDiagnosticsConfigFeaturesNV
 *         - VkDeviceDiagnosticsConfigCreateInfoNV
 *         - VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR
 *         - VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR
 *         - VkPhysicalDeviceRobustness2FeaturesEXT
 *         - VkPhysicalDeviceImageRobustnessFeaturesEXT
 *         - VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR
 *         - VkPhysicalDevicePortabilitySubsetFeaturesKHR
 *         - VkPhysicalDevice4444FormatsFeaturesEXT
 *         - VkPhysicalDeviceSubpassShadingFeaturesHUAWEI
 *         - VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT
 *         - VkPhysicalDeviceFragmentShadingRateFeaturesKHR
 *         - VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR
 *         - VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV
 *         - VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE
 *         - VkPhysicalDeviceDepthClipControlFeaturesEXT
 *         - VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT
 *         - VkPhysicalDeviceExternalMemoryRDMAFeaturesNV
 *         - VkPhysicalDeviceColorWriteEnableFeaturesEXT
 *         - VkPhysicalDeviceSynchronization2FeaturesKHR
 *         - VkPhysicalDeviceInheritedViewportScissorFeaturesNV
 *         - VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT
 *         - VkPhysicalDeviceProvokingVertexFeaturesEXT
 *         - VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR
 *         - VkPhysicalDeviceRayTracingMotionBlurFeaturesNV
 *         - VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT
 *         - VkPhysicalDeviceDynamicRenderingFeaturesKHR
 *         - VkPhysicalDeviceImageViewMinLodFeaturesEXT
 *         - VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM
 *         - VkPhysicalDeviceLinearColorAttachmentFeaturesNV
 */
@JvmInline
value class DeviceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var queueCreateInfoCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pQueueCreateInfos: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var enabledLayerCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var ppEnabledLayerNames: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var enabledExtensionCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var ppEnabledExtensionNames: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pEnabledFeatures: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	
	
	var queueCreateInfos: DeviceQueueCreateInfo.Buffer
		get()      = DeviceQueueCreateInfo.Buffer(Unsafe.getLong(address + 24), queueCreateInfoCount)
		set(value) { Unsafe.setLong(address + 24, value.address); queueCreateInfoCount = value.capacity }
	
	var enabledLayerNames: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), enabledLayerCount)
		set(value) { ppEnabledLayerNames = value.address; enabledLayerCount = value.capacity }
	
	var enabledExtensionNames: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 56), enabledExtensionCount)
		set(value) { ppEnabledExtensionNames = value.address; enabledExtensionCount = value.capacity }
	
	var enabledFeatures: PhysicalDeviceFeatures
		get()      = PhysicalDeviceFeatures(Unsafe.getLong(address + 64))
		set(value) { Unsafe.setLong(address + 64, value.address) }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDeviceQueueCreateInfo {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkDeviceQueueCreateFlags  flags
 *         uint32_t                  queueFamilyIndex
 *         uint32_t                  queueCount
 *         float*                    pQueuePriorities
 *     }
 * 
 *     Valid pNext types:
 *         - VkDeviceQueueGlobalPriorityCreateInfoEXT
 */
@JvmInline
value class DeviceQueueCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: DeviceQueueCreateFlags
		get()      = DeviceQueueCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var queueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var queueCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pQueuePriorities: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var queuePriorities: DirectFloatBuffer
		get()      = DirectFloatBuffer(Unsafe.getLong(address + 32), queueCount)
		set(value) { Unsafe.setLong(address + 32, value.address); queueCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DeviceQueueCreateInfo(offset(index))
		
		operator fun set(index: Int, value: DeviceQueueCreateInfo) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (DeviceQueueCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DeviceQueueCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DeviceQueueCreateInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkExtensionProperties {
 *         char      extensionName[256]
 *         uint32_t  specVersion
 *     }
 */
@JvmInline
value class ExtensionProperties(override val address: Long) : Addressable {
	
	
	var extensionName: DirectByteBuffer
		get()      = DirectByteBuffer(address + 0, 256)
		set(value) = Unsafe.copy(value.address, address + 0, value.byteSize)
	
	var specVersion: Int
		get()      = Unsafe.getInt(address + 256)
		set(value) = Unsafe.setInt(address + 256, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 260
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ExtensionProperties(offset(index))
		
		operator fun set(index: Int, value: ExtensionProperties) = Unsafe.copy(value.address, offset(index), 260)
		
		inline fun forEach(block: (ExtensionProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ExtensionProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ExtensionProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkLayerProperties {
 *         char      layerName[256]
 *         uint32_t  specVersion
 *         uint32_t  implementationVersion
 *         char      description[256]
 *     }
 */
@JvmInline
value class LayerProperties(override val address: Long) : Addressable {
	
	
	var layerName: DirectByteBuffer
		get()      = DirectByteBuffer(address + 0, 256)
		set(value) = Unsafe.copy(value.address, address + 0, value.byteSize)
	
	var specVersion: Int
		get()      = Unsafe.getInt(address + 256)
		set(value) = Unsafe.setInt(address + 256, value)
	
	var implementationVersion: Int
		get()      = Unsafe.getInt(address + 260)
		set(value) = Unsafe.setInt(address + 260, value)
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + 264, 256)
		set(value) = Unsafe.copy(value.address, address + 264, value.byteSize)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 520
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = LayerProperties(offset(index))
		
		operator fun set(index: Int, value: LayerProperties) = Unsafe.copy(value.address, offset(index), 520)
		
		inline fun forEach(block: (LayerProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (LayerProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, LayerProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSubmitInfo {
 *         VkStructureType        sType
 *         void*                  pNext
 *         uint32_t               waitSemaphoreCount
 *         VkSemaphore*           pWaitSemaphores
 *         VkPipelineStageFlags*  pWaitDstStageMask
 *         uint32_t               commandBufferCount
 *         VkCommandBuffer*       pCommandBuffers
 *         uint32_t               signalSemaphoreCount
 *         VkSemaphore*           pSignalSemaphores
 *     }
 * 
 *     Valid pNext types:
 *         - VkWin32KeyedMutexAcquireReleaseInfoNV
 *         - VkWin32KeyedMutexAcquireReleaseInfoKHR
 *         - VkD3D12FenceSubmitInfoKHR
 *         - VkDeviceGroupSubmitInfo
 *         - VkProtectedSubmitInfo
 *         - VkTimelineSemaphoreSubmitInfo
 *         - VkPerformanceQuerySubmitInfoKHR
 */
@JvmInline
value class SubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var waitSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pWaitSemaphores: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pWaitDstStageMask: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var commandBufferCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pCommandBuffers: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var signalSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var pSignalSemaphores: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	
	
	var waitSemaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), waitSemaphoreCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreCount = value.capacity }
	
	var waitDstStageMask: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 32), waitSemaphoreCount)
		set(value) { Unsafe.setLong(address + 32, value.address); waitSemaphoreCount = value.capacity }
	
	var commandBuffers: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 48), commandBufferCount)
		set(value) { Unsafe.setLong(address + 48, value.address); commandBufferCount = value.capacity }
	
	var signalSemaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 64), signalSemaphoreCount)
		set(value) { Unsafe.setLong(address + 64, value.address); signalSemaphoreCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 72
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubmitInfo(offset(index))
		
		operator fun set(index: Int, value: SubmitInfo) = Unsafe.copy(value.address, offset(index), 72)
		
		inline fun forEach(block: (SubmitInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubmitInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubmitInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkMappedMemoryRange {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceMemory   memory
 *         VkDeviceSize     offset
 *         VkDeviceSize     size
 *     }
 */
@JvmInline
value class MappedMemoryRange(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = MappedMemoryRange(offset(index))
		
		operator fun set(index: Int, value: MappedMemoryRange) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (MappedMemoryRange) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MappedMemoryRange) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, MappedMemoryRange) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkMemoryAllocateInfo {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkDeviceSize     allocationSize
 *         uint32_t         memoryTypeIndex
 *     }
 * 
 *     Valid pNext types:
 *         - VkDedicatedAllocationMemoryAllocateInfoNV
 *         - VkExportMemoryAllocateInfoNV
 *         - VkImportMemoryWin32HandleInfoNV
 *         - VkExportMemoryWin32HandleInfoNV
 *         - VkExportMemoryAllocateInfo
 *         - VkImportMemoryWin32HandleInfoKHR
 *         - VkExportMemoryWin32HandleInfoKHR
 *         - VkImportMemoryZirconHandleInfoFUCHSIA
 *         - VkImportMemoryFdInfoKHR
 *         - VkMemoryAllocateFlagsInfo
 *         - VkMemoryDedicatedAllocateInfo
 *         - VkImportMemoryHostPointerInfoEXT
 *         - VkImportAndroidHardwareBufferInfoANDROID
 *         - VkMemoryPriorityAllocateInfoEXT
 *         - VkMemoryOpaqueCaptureAddressAllocateInfo
 *         - VkImportMemoryBufferCollectionFUCHSIA
 */
@JvmInline
value class MemoryAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var allocationSize: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var memoryTypeIndex: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkMemoryRequirements {
 *         VkDeviceSize  size
 *         VkDeviceSize  alignment
 *         uint32_t      memoryTypeBits
 *     }
 */
@JvmInline
value class MemoryRequirements(override val address: Long) : Addressable {
	
	
	var size: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var alignment: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memoryTypeBits: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkBindSparseInfo {
 *         VkStructureType                     sType
 *         void*                               pNext
 *         uint32_t                            waitSemaphoreCount
 *         VkSemaphore*                        pWaitSemaphores
 *         uint32_t                            bufferBindCount
 *         VkSparseBufferMemoryBindInfo*       pBufferBinds
 *         uint32_t                            imageOpaqueBindCount
 *         VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
 *         uint32_t                            imageBindCount
 *         VkSparseImageMemoryBindInfo*        pImageBinds
 *         uint32_t                            signalSemaphoreCount
 *         VkSemaphore*                        pSignalSemaphores
 *     }
 * 
 *     Valid pNext types:
 *         - VkDeviceGroupBindSparseInfo
 *         - VkTimelineSemaphoreSubmitInfo
 */
@JvmInline
value class BindSparseInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var waitSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pWaitSemaphores: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var bufferBindCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pBufferBinds: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var imageOpaqueBindCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pImageOpaqueBinds: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var imageBindCount: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var pImageBinds: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var signalSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var pSignalSemaphores: Long
		get()      = Unsafe.getLong(address + 88)
		set(value) = Unsafe.setLong(address + 88, value)
	
	
	
	var waitSemaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), waitSemaphoreCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreCount = value.capacity }
	
	var bufferBinds: SparseBufferMemoryBindInfo.Buffer
		get()      = SparseBufferMemoryBindInfo.Buffer(Unsafe.getLong(address + 40), bufferBindCount)
		set(value) { Unsafe.setLong(address + 40, value.address); bufferBindCount = value.capacity }
	
	var imageOpaqueBinds: SparseImageOpaqueMemoryBindInfo.Buffer
		get()      = SparseImageOpaqueMemoryBindInfo.Buffer(Unsafe.getLong(address + 56), imageOpaqueBindCount)
		set(value) { Unsafe.setLong(address + 56, value.address); imageOpaqueBindCount = value.capacity }
	
	var imageBinds: SparseImageMemoryBindInfo.Buffer
		get()      = SparseImageMemoryBindInfo.Buffer(Unsafe.getLong(address + 72), imageBindCount)
		set(value) { Unsafe.setLong(address + 72, value.address); imageBindCount = value.capacity }
	
	var signalSemaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 88), signalSemaphoreCount)
		set(value) { Unsafe.setLong(address + 88, value.address); signalSemaphoreCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 96
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BindSparseInfo(offset(index))
		
		operator fun set(index: Int, value: BindSparseInfo) = Unsafe.copy(value.address, offset(index), 96)
		
		inline fun forEach(block: (BindSparseInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BindSparseInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BindSparseInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkImageSubresource {
 *         VkImageAspectFlags  aspectMask
 *         uint32_t            mipLevel
 *         uint32_t            arrayLayer
 *     }
 */
@JvmInline
value class ImageSubresource(override val address: Long) : Addressable {
	
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var mipLevel: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var arrayLayer: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSparseBufferMemoryBindInfo {
 *         VkBuffer             buffer
 *         uint32_t             bindCount
 *         VkSparseMemoryBind*  pBinds
 *     }
 */
@JvmInline
value class SparseBufferMemoryBindInfo(override val address: Long) : Addressable {
	
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var bindCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var pBinds: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	var binds: SparseMemoryBind.Buffer
		get()      = SparseMemoryBind.Buffer(Unsafe.getLong(address + 16), bindCount)
		set(value) { Unsafe.setLong(address + 16, value.address); bindCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseBufferMemoryBindInfo(offset(index))
		
		operator fun set(index: Int, value: SparseBufferMemoryBindInfo) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (SparseBufferMemoryBindInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseBufferMemoryBindInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseBufferMemoryBindInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSparseImageFormatProperties {
 *         VkImageAspectFlags        aspectMask
 *         VkExtent3D                imageGranularity
 *         VkSparseImageFormatFlags  flags
 *     }
 */
@JvmInline
value class SparseImageFormatProperties(override val address: Long) : Addressable {
	
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var imageGranularity: Extent3D
		get()      = Extent3D(address + 4)
		set(value) = Unsafe.copy(value.address, address + 4, 12)
	
	var flags: SparseImageFormatFlags
		get()      = SparseImageFormatFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 20
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageFormatProperties(offset(index))
		
		operator fun set(index: Int, value: SparseImageFormatProperties) = Unsafe.copy(value.address, offset(index), 20)
		
		inline fun forEach(block: (SparseImageFormatProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageFormatProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageFormatProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSparseImageMemoryBind {
 *         VkImageSubresource       subresource
 *         VkOffset3D               offset
 *         VkExtent3D               extent
 *         VkDeviceMemory           memory
 *         VkDeviceSize             memoryOffset
 *         VkSparseMemoryBindFlags  flags
 *     }
 */
@JvmInline
value class SparseImageMemoryBind(override val address: Long) : Addressable {
	
	
	var subresource: ImageSubresource
		get()      = ImageSubresource(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 12)
	
	var offset: Offset3D
		get()      = Offset3D(address + 12)
		set(value) = Unsafe.copy(value.address, address + 12, 12)
	
	var extent: Extent3D
		get()      = Extent3D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 12)
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var flags: SparseMemoryBindFlags
		get()      = SparseMemoryBindFlags(Unsafe.getInt(address + 56))
		set(value) = Unsafe.setInt(address + 56, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageMemoryBind(offset(index))
		
		operator fun set(index: Int, value: SparseImageMemoryBind) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (SparseImageMemoryBind) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageMemoryBind) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageMemoryBind) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSparseImageMemoryBindInfo {
 *         VkImage                   image
 *         uint32_t                  bindCount
 *         VkSparseImageMemoryBind*  pBinds
 *     }
 */
@JvmInline
value class SparseImageMemoryBindInfo(override val address: Long) : Addressable {
	
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var bindCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var pBinds: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	var binds: SparseImageMemoryBind.Buffer
		get()      = SparseImageMemoryBind.Buffer(Unsafe.getLong(address + 16), bindCount)
		set(value) { Unsafe.setLong(address + 16, value.address); bindCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageMemoryBindInfo(offset(index))
		
		operator fun set(index: Int, value: SparseImageMemoryBindInfo) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (SparseImageMemoryBindInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageMemoryBindInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageMemoryBindInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSparseImageMemoryRequirements {
 *         VkSparseImageFormatProperties  formatProperties
 *         uint32_t                       imageMipTailFirstLod
 *         VkDeviceSize                   imageMipTailSize
 *         VkDeviceSize                   imageMipTailOffset
 *         VkDeviceSize                   imageMipTailStride
 *     }
 */
@JvmInline
value class SparseImageMemoryRequirements(override val address: Long) : Addressable {
	
	
	var formatProperties: SparseImageFormatProperties
		get()      = SparseImageFormatProperties(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 20)
	
	var imageMipTailFirstLod: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var imageMipTailSize: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var imageMipTailOffset: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var imageMipTailStride: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageMemoryRequirements(offset(index))
		
		operator fun set(index: Int, value: SparseImageMemoryRequirements) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (SparseImageMemoryRequirements) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageMemoryRequirements) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageMemoryRequirements) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSparseImageOpaqueMemoryBindInfo {
 *         VkImage              image
 *         uint32_t             bindCount
 *         VkSparseMemoryBind*  pBinds
 *     }
 */
@JvmInline
value class SparseImageOpaqueMemoryBindInfo(override val address: Long) : Addressable {
	
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var bindCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var pBinds: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	var binds: SparseMemoryBind.Buffer
		get()      = SparseMemoryBind.Buffer(Unsafe.getLong(address + 16), bindCount)
		set(value) { Unsafe.setLong(address + 16, value.address); bindCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageOpaqueMemoryBindInfo(offset(index))
		
		operator fun set(index: Int, value: SparseImageOpaqueMemoryBindInfo) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (SparseImageOpaqueMemoryBindInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageOpaqueMemoryBindInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageOpaqueMemoryBindInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSparseMemoryBind {
 *         VkDeviceSize             resourceOffset
 *         VkDeviceSize             size
 *         VkDeviceMemory           memory
 *         VkDeviceSize             memoryOffset
 *         VkSparseMemoryBindFlags  flags
 *     }
 */
@JvmInline
value class SparseMemoryBind(override val address: Long) : Addressable {
	
	
	var resourceOffset: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var flags: SparseMemoryBindFlags
		get()      = SparseMemoryBindFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseMemoryBind(offset(index))
		
		operator fun set(index: Int, value: SparseMemoryBind) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (SparseMemoryBind) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseMemoryBind) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseMemoryBind) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkFenceCreateInfo {
 *         VkStructureType     sType
 *         void*               pNext
 *         VkFenceCreateFlags  flags
 *     }
 * 
 *     Valid pNext types:
 *         - VkExportFenceCreateInfo
 *         - VkExportFenceWin32HandleInfoKHR
 */
@JvmInline
value class FenceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: FenceCreateFlags
		get()      = FenceCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSemaphoreCreateInfo {
 *         VkStructureType         sType
 *         void*                   pNext
 *         VkSemaphoreCreateFlags  flags (reserved, must be zero)
 *     }
 * 
 *     Valid pNext types:
 *         - VkExportSemaphoreCreateInfo
 *         - VkExportSemaphoreWin32HandleInfoKHR
 *         - VkSemaphoreTypeCreateInfo
 */
@JvmInline
value class SemaphoreCreateInfo(override val address: Long) : Addressable {
	
	
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
 *     // provided by VK_VERSION_1_0
 *     struct VkEventCreateInfo {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkEventCreateFlags  flags
 *     }
 */
@JvmInline
value class EventCreateInfo(override val address: Long) : Addressable {
	
	
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
 *     // provided by VK_VERSION_1_0
 *     struct VkQueryPoolCreateInfo {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkQueryPoolCreateFlags         flags (reserved, must be zero)
 *         VkQueryType                    queryType
 *         uint32_t                       queryCount
 *         VkQueryPipelineStatisticFlags  pipelineStatistics
 *     }
 * 
 *     Valid pNext types:
 *         - VkQueryPoolPerformanceCreateInfoKHR
 *         - VkQueryPoolPerformanceQueryCreateInfoINTEL
 *         - VkVideoProfileKHR
 *         - VkVideoDecodeH264ProfileEXT
 *         - VkVideoDecodeH265ProfileEXT
 *         - VkVideoEncodeH264ProfileEXT
 *         - VkVideoEncodeH265ProfileEXT
 */
@JvmInline
value class QueryPoolCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var queryType: QueryType
		get()      = _QueryType(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var queryCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pipelineStatistics: QueryPipelineStatisticFlags
		get()      = QueryPipelineStatisticFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkBufferCreateInfo {
 *         VkStructureType      sType
 *         void*                pNext
 *         VkBufferCreateFlags  flags
 *         VkDeviceSize         size
 *         VkBufferUsageFlags   usage
 *         VkSharingMode        sharingMode
 *         uint32_t             queueFamilyIndexCount
 *         uint32_t*            pQueueFamilyIndices
 *     }
 * 
 *     Valid pNext types:
 *         - VkDedicatedAllocationBufferCreateInfoNV
 *         - VkExternalMemoryBufferCreateInfo
 *         - VkBufferOpaqueCaptureAddressCreateInfo
 *         - VkBufferDeviceAddressCreateInfoEXT
 *         - VkVideoProfilesKHR
 *         - VkVideoProfileKHR
 *         - VkVideoDecodeH264ProfileEXT
 *         - VkVideoDecodeH265ProfileEXT
 *         - VkVideoEncodeH264ProfileEXT
 *         - VkVideoEncodeH265ProfileEXT
 *         - VkBufferCollectionBufferCreateInfoFUCHSIA
 */
@JvmInline
value class BufferCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: BufferCreateFlags
		get()      = BufferCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var usage: BufferUsageFlags
		get()      = BufferUsageFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var sharingMode: SharingMode
		get()      = _SharingMode(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var queueFamilyIndexCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pQueueFamilyIndices: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var queueFamilyIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 48), queueFamilyIndexCount)
		set(value) { Unsafe.setLong(address + 48, value.address); queueFamilyIndexCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkBufferViewCreateInfo {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkBufferViewCreateFlags  flags (reserved, must be zero)
 *         VkBuffer                 buffer
 *         VkFormat                 format
 *         VkDeviceSize             offset
 *         VkDeviceSize             range
 *     }
 */
@JvmInline
value class BufferViewCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var range: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkImageCreateInfo {
 *         VkStructureType        sType
 *         void*                  pNext
 *         VkImageCreateFlags     flags
 *         VkImageType            imageType
 *         VkFormat               format
 *         VkExtent3D             extent
 *         uint32_t               mipLevels
 *         uint32_t               arrayLayers
 *         VkSampleCountFlagBits  samples
 *         VkImageTiling          tiling
 *         VkImageUsageFlags      usage
 *         VkSharingMode          sharingMode
 *         uint32_t               queueFamilyIndexCount
 *         uint32_t*              pQueueFamilyIndices
 *         VkImageLayout          initialLayout
 *     }
 * 
 *     Valid pNext types:
 *         - VkDedicatedAllocationImageCreateInfoNV
 *         - VkExternalMemoryImageCreateInfoNV
 *         - VkExternalMemoryImageCreateInfo
 *         - VkImageSwapchainCreateInfoKHR
 *         - VkImageFormatListCreateInfo
 *         - VkExternalFormatANDROID
 *         - VkImageDrmFormatModifierListCreateInfoEXT
 *         - VkImageDrmFormatModifierExplicitCreateInfoEXT
 *         - VkImageStencilUsageCreateInfo
 *         - VkVideoProfilesKHR
 *         - VkVideoProfileKHR
 *         - VkVideoDecodeH264ProfileEXT
 *         - VkVideoDecodeH265ProfileEXT
 *         - VkVideoEncodeH264ProfileEXT
 *         - VkVideoEncodeH265ProfileEXT
 *         - VkBufferCollectionImageCreateInfoFUCHSIA
 */
@JvmInline
value class ImageCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: ImageCreateFlags
		get()      = ImageCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var imageType: ImageType
		get()      = _ImageType(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var extent: Extent3D
		get()      = Extent3D(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 12)
	
	var mipLevels: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var arrayLayers: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var samples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var tiling: ImageTiling
		get()      = _ImageTiling(Unsafe.getInt(address + 52))
		set(value) = Unsafe.setInt(address + 52, value.value)
	
	var usage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 56))
		set(value) = Unsafe.setInt(address + 56, value.value)
	
	var sharingMode: SharingMode
		get()      = _SharingMode(Unsafe.getInt(address + 60))
		set(value) = Unsafe.setInt(address + 60, value.value)
	
	var queueFamilyIndexCount: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var pQueueFamilyIndices: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var initialLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 80))
		set(value) = Unsafe.setInt(address + 80, value.value)
	
	
	
	var queueFamilyIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 72), queueFamilyIndexCount)
		set(value) { Unsafe.setLong(address + 72, value.address); queueFamilyIndexCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSubresourceLayout {
 *         VkDeviceSize  offset
 *         VkDeviceSize  size
 *         VkDeviceSize  rowPitch
 *         VkDeviceSize  arrayPitch
 *         VkDeviceSize  depthPitch
 *     }
 */
@JvmInline
value class SubresourceLayout(override val address: Long) : Addressable {
	
	
	var offset: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var rowPitch: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var arrayPitch: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var depthPitch: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubresourceLayout(offset(index))
		
		operator fun set(index: Int, value: SubresourceLayout) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (SubresourceLayout) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubresourceLayout) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubresourceLayout) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkComponentMapping {
 *         VkComponentSwizzle  r
 *         VkComponentSwizzle  g
 *         VkComponentSwizzle  b
 *         VkComponentSwizzle  a
 *     }
 */
@JvmInline
value class ComponentMapping(override val address: Long) : Addressable {
	
	
	var r: ComponentSwizzle
		get()      = _ComponentSwizzle(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var g: ComponentSwizzle
		get()      = _ComponentSwizzle(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var b: ComponentSwizzle
		get()      = _ComponentSwizzle(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var a: ComponentSwizzle
		get()      = _ComponentSwizzle(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkImageSubresourceRange {
 *         VkImageAspectFlags  aspectMask
 *         uint32_t            baseMipLevel
 *         uint32_t            levelCount
 *         uint32_t            baseArrayLayer
 *         uint32_t            layerCount
 *     }
 */
@JvmInline
value class ImageSubresourceRange(override val address: Long) : Addressable {
	
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var baseMipLevel: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var levelCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var baseArrayLayer: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var layerCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 20
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageSubresourceRange(offset(index))
		
		operator fun set(index: Int, value: ImageSubresourceRange) = Unsafe.copy(value.address, offset(index), 20)
		
		inline fun forEach(block: (ImageSubresourceRange) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageSubresourceRange) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageSubresourceRange) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkImageViewCreateInfo {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkImageViewCreateFlags   flags
 *         VkImage                  image
 *         VkImageViewType          viewType
 *         VkFormat                 format
 *         VkComponentMapping       components
 *         VkImageSubresourceRange  subresourceRange
 *     }
 * 
 *     Valid pNext types:
 *         - VkImageViewUsageCreateInfo
 *         - VkSamplerYcbcrConversionInfo
 *         - VkImageViewASTCDecodeModeEXT
 *         - VkVideoProfilesKHR
 *         - VkVideoProfileKHR
 *         - VkVideoDecodeH264ProfileEXT
 *         - VkVideoDecodeH265ProfileEXT
 *         - VkVideoEncodeH264ProfileEXT
 *         - VkVideoEncodeH265ProfileEXT
 *         - VkImageViewMinLodCreateInfoEXT
 */
@JvmInline
value class ImageViewCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var viewType: ImageViewType
		get()      = _ImageViewType(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var components: ComponentMapping
		get()      = ComponentMapping(address + 40)
		set(value) = Unsafe.copy(value.address, address + 40, 16)
	
	var subresourceRange: ImageSubresourceRange
		get()      = ImageSubresourceRange(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 20)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkShaderModuleCreateInfo {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkShaderModuleCreateFlags  flags (reserved, must be zero)
 *         size_t                     codeSize
 *         uint32_t*                  pCode
 *     }
 * 
 *     Valid pNext types:
 *         - VkShaderModuleValidationCacheCreateInfoEXT
 */
@JvmInline
value class ShaderModuleCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var codeSize: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pCode: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineCacheCreateInfo {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkPipelineCacheCreateFlags  flags
 *         size_t                      initialDataSize
 *         void*                       pInitialData
 *     }
 */
@JvmInline
value class PipelineCacheCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var initialDataSize: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pInitialData: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var initialData: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 32), initialDataSize.toInt())
		set(value) { Unsafe.setLong(address + 32, value.address); initialDataSize = value.capacity.toLong() }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkComputePipelineCreateInfo {
 *         VkStructureType                  sType
 *         void*                            pNext
 *         VkPipelineCreateFlags            flags
 *         VkPipelineShaderStageCreateInfo  stage
 *         VkPipelineLayout                 layout
 *         VkPipeline                       basePipelineHandle
 *         int32_t                          basePipelineIndex
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineCreationFeedbackCreateInfoEXT
 *         - VkSubpassShadingPipelineCreateInfoHUAWEI
 *         - VkPipelineCompilerControlCreateInfoAMD
 */
@JvmInline
value class ComputePipelineCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: PipelineCreateFlags
		get()      = PipelineCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stage: PipelineShaderStageCreateInfo
		get()      = PipelineShaderStageCreateInfo(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 48)
	
	var layout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getLong(address + 72))
		set(value) = Unsafe.setLong(address + 72, value.address)
	
	var basePipelineHandle: PipelineH
		get()      = PipelineH(Unsafe.getLong(address + 80))
		set(value) = Unsafe.setLong(address + 80, value.address)
	
	var basePipelineIndex: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 96
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ComputePipelineCreateInfo(offset(index))
		
		operator fun set(index: Int, value: ComputePipelineCreateInfo) = Unsafe.copy(value.address, offset(index), 96)
		
		inline fun forEach(block: (ComputePipelineCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ComputePipelineCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ComputePipelineCreateInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkGraphicsPipelineCreateInfo {
 *         VkStructureType                          sType
 *         void*                                    pNext
 *         VkPipelineCreateFlags                    flags
 *         uint32_t                                 stageCount
 *         VkPipelineShaderStageCreateInfo*         pStages
 *         VkPipelineVertexInputStateCreateInfo*    pVertexInputState
 *         VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
 *         VkPipelineTessellationStateCreateInfo*   pTessellationState
 *         VkPipelineViewportStateCreateInfo*       pViewportState
 *         VkPipelineRasterizationStateCreateInfo*  pRasterizationState
 *         VkPipelineMultisampleStateCreateInfo*    pMultisampleState
 *         VkPipelineDepthStencilStateCreateInfo*   pDepthStencilState
 *         VkPipelineColorBlendStateCreateInfo*     pColorBlendState
 *         VkPipelineDynamicStateCreateInfo*        pDynamicState
 *         VkPipelineLayout                         layout
 *         VkRenderPass                             renderPass
 *         uint32_t                                 subpass
 *         VkPipeline                               basePipelineHandle
 *         int32_t                                  basePipelineIndex
 *     }
 * 
 *     Valid pNext types:
 *         - VkGraphicsPipelineShaderGroupsCreateInfoNV
 *         - VkPipelineDiscardRectangleStateCreateInfoEXT
 *         - VkPipelineRepresentativeFragmentTestStateCreateInfoNV
 *         - VkPipelineCreationFeedbackCreateInfoEXT
 *         - VkPipelineCompilerControlCreateInfoAMD
 *         - VkPipelineFragmentShadingRateStateCreateInfoKHR
 *         - VkPipelineFragmentShadingRateEnumStateCreateInfoNV
 *         - VkPipelineRenderingCreateInfoKHR
 *         - VkAttachmentSampleCountInfoAMD
 *         - VkMultiviewPerViewAttributesInfoNVX
 */
@JvmInline
value class GraphicsPipelineCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: PipelineCreateFlags
		get()      = PipelineCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stageCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pStages: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pVertexInputState: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pInputAssemblyState: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var pTessellationState: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var pViewportState: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pRasterizationState: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	var pMultisampleState: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var pDepthStencilState: Long
		get()      = Unsafe.getLong(address + 80)
		set(value) = Unsafe.setLong(address + 80, value)
	
	var pColorBlendState: Long
		get()      = Unsafe.getLong(address + 88)
		set(value) = Unsafe.setLong(address + 88, value)
	
	var pDynamicState: Long
		get()      = Unsafe.getLong(address + 96)
		set(value) = Unsafe.setLong(address + 96, value)
	
	var layout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getLong(address + 104))
		set(value) = Unsafe.setLong(address + 104, value.address)
	
	var renderPass: RenderPassH
		get()      = RenderPassH(Unsafe.getLong(address + 112))
		set(value) = Unsafe.setLong(address + 112, value.address)
	
	var subpass: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var basePipelineHandle: PipelineH
		get()      = PipelineH(Unsafe.getLong(address + 128))
		set(value) = Unsafe.setLong(address + 128, value.address)
	
	var basePipelineIndex: Int
		get()      = Unsafe.getInt(address + 136)
		set(value) = Unsafe.setInt(address + 136, value)
	
	
	
	var stages: PipelineShaderStageCreateInfo.Buffer
		get()      = PipelineShaderStageCreateInfo.Buffer(Unsafe.getLong(address + 24), stageCount)
		set(value) { Unsafe.setLong(address + 24, value.address); stageCount = value.capacity }
	
	var vertexInputState: PipelineVertexInputStateCreateInfo
		get()      = PipelineVertexInputStateCreateInfo(Unsafe.getLong(address + 32))
		set(value) { Unsafe.setLong(address + 32, value.address) }
	
	var inputAssemblyState: PipelineInputAssemblyStateCreateInfo
		get()      = PipelineInputAssemblyStateCreateInfo(Unsafe.getLong(address + 40))
		set(value) { Unsafe.setLong(address + 40, value.address) }
	
	var tessellationState: PipelineTessellationStateCreateInfo
		get()      = PipelineTessellationStateCreateInfo(Unsafe.getLong(address + 48))
		set(value) { Unsafe.setLong(address + 48, value.address) }
	
	var viewportState: PipelineViewportStateCreateInfo
		get()      = PipelineViewportStateCreateInfo(Unsafe.getLong(address + 56))
		set(value) { Unsafe.setLong(address + 56, value.address) }
	
	var rasterizationState: PipelineRasterizationStateCreateInfo
		get()      = PipelineRasterizationStateCreateInfo(Unsafe.getLong(address + 64))
		set(value) { Unsafe.setLong(address + 64, value.address) }
	
	var multisampleState: PipelineMultisampleStateCreateInfo
		get()      = PipelineMultisampleStateCreateInfo(Unsafe.getLong(address + 72))
		set(value) { Unsafe.setLong(address + 72, value.address) }
	
	var depthStencilState: PipelineDepthStencilStateCreateInfo
		get()      = PipelineDepthStencilStateCreateInfo(Unsafe.getLong(address + 80))
		set(value) { Unsafe.setLong(address + 80, value.address) }
	
	var colorBlendState: PipelineColorBlendStateCreateInfo
		get()      = PipelineColorBlendStateCreateInfo(Unsafe.getLong(address + 88))
		set(value) { Unsafe.setLong(address + 88, value.address) }
	
	var dynamicState: PipelineDynamicStateCreateInfo
		get()      = PipelineDynamicStateCreateInfo(Unsafe.getLong(address + 96))
		set(value) { Unsafe.setLong(address + 96, value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 144
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = GraphicsPipelineCreateInfo(offset(index))
		
		operator fun set(index: Int, value: GraphicsPipelineCreateInfo) = Unsafe.copy(value.address, offset(index), 144)
		
		inline fun forEach(block: (GraphicsPipelineCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (GraphicsPipelineCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, GraphicsPipelineCreateInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineColorBlendAttachmentState {
 *         VkBool32               blendEnable
 *         VkBlendFactor          srcColorBlendFactor
 *         VkBlendFactor          dstColorBlendFactor
 *         VkBlendOp              colorBlendOp
 *         VkBlendFactor          srcAlphaBlendFactor
 *         VkBlendFactor          dstAlphaBlendFactor
 *         VkBlendOp              alphaBlendOp
 *         VkColorComponentFlags  colorWriteMask
 *     }
 */
@JvmInline
value class PipelineColorBlendAttachmentState(override val address: Long) : Addressable {
	
	
	var blendEnable: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var srcColorBlendFactor: BlendFactor
		get()      = _BlendFactor(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var dstColorBlendFactor: BlendFactor
		get()      = _BlendFactor(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var colorBlendOp: BlendOp
		get()      = _BlendOp(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	var srcAlphaBlendFactor: BlendFactor
		get()      = _BlendFactor(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var dstAlphaBlendFactor: BlendFactor
		get()      = _BlendFactor(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var alphaBlendOp: BlendOp
		get()      = _BlendOp(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var colorWriteMask: ColorComponentFlags
		get()      = ColorComponentFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 32
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PipelineColorBlendAttachmentState(offset(index))
		
		operator fun set(index: Int, value: PipelineColorBlendAttachmentState) = Unsafe.copy(value.address, offset(index), 32)
		
		inline fun forEach(block: (PipelineColorBlendAttachmentState) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineColorBlendAttachmentState) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PipelineColorBlendAttachmentState) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineColorBlendStateCreateInfo {
 *         VkStructureType                       sType
 *         void*                                 pNext
 *         VkPipelineColorBlendStateCreateFlags  flags
 *         VkBool32                              logicOpEnable
 *         VkLogicOp                             logicOp
 *         uint32_t                              attachmentCount
 *         VkPipelineColorBlendAttachmentState*  pAttachments
 *         float                                 blendConstants[4]
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineColorBlendAdvancedStateCreateInfoEXT
 *         - VkPipelineColorWriteCreateInfoEXT
 */
@JvmInline
value class PipelineColorBlendStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var logicOpEnable: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var logicOp: LogicOp
		get()      = _LogicOp(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var attachmentCount: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var pAttachments: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var blendConstants: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 40, 4)
		set(value) = Unsafe.copy(value.address, address + 40, value.byteSize)
	
	
	
	var attachments: PipelineColorBlendAttachmentState.Buffer
		get()      = PipelineColorBlendAttachmentState.Buffer(Unsafe.getLong(address + 32), attachmentCount)
		set(value) { Unsafe.setLong(address + 32, value.address); attachmentCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineDepthStencilStateCreateInfo {
 *         VkStructureType                         sType
 *         void*                                   pNext (must be null)
 *         VkPipelineDepthStencilStateCreateFlags  flags
 *         VkBool32                                depthTestEnable
 *         VkBool32                                depthWriteEnable
 *         VkCompareOp                             depthCompareOp
 *         VkBool32                                depthBoundsTestEnable
 *         VkBool32                                stencilTestEnable
 *         VkStencilOpState                        front
 *         VkStencilOpState                        back
 *         float                                   minDepthBounds
 *         float                                   maxDepthBounds
 *     }
 */
@JvmInline
value class PipelineDepthStencilStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var depthTestEnable: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var depthWriteEnable: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var depthCompareOp: CompareOp
		get()      = _CompareOp(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var depthBoundsTestEnable: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var stencilTestEnable: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var front: StencilOpState
		get()      = StencilOpState(address + 40)
		set(value) = Unsafe.copy(value.address, address + 40, 28)
	
	var back: StencilOpState
		get()      = StencilOpState(address + 68)
		set(value) = Unsafe.copy(value.address, address + 68, 28)
	
	var minDepthBounds: Float
		get()      = Unsafe.getFloat(address + 96)
		set(value) = Unsafe.setFloat(address + 96, value)
	
	var maxDepthBounds: Float
		get()      = Unsafe.getFloat(address + 100)
		set(value) = Unsafe.setFloat(address + 100, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineDynamicStateCreateInfo {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkPipelineDynamicStateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                           dynamicStateCount
 *         VkDynamicState*                    pDynamicStates
 *     }
 */
@JvmInline
value class PipelineDynamicStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var dynamicStateCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pDynamicStates: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var dynamicStates: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), dynamicStateCount)
		set(value) { Unsafe.setLong(address + 24, value.address); dynamicStateCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineInputAssemblyStateCreateInfo {
 *         VkStructureType                          sType
 *         void*                                    pNext (must be null)
 *         VkPipelineInputAssemblyStateCreateFlags  flags (reserved, must be zero)
 *         VkPrimitiveTopology                      topology
 *         VkBool32                                 primitiveRestartEnable
 *     }
 */
@JvmInline
value class PipelineInputAssemblyStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var topology: PrimitiveTopology
		get()      = _PrimitiveTopology(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var primitiveRestartEnable: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineMultisampleStateCreateInfo {
 *         VkStructureType                        sType
 *         void*                                  pNext
 *         VkPipelineMultisampleStateCreateFlags  flags (reserved, must be zero)
 *         VkSampleCountFlagBits                  rasterizationSamples
 *         VkBool32                               sampleShadingEnable
 *         float                                  minSampleShading
 *         VkSampleMask*                          pSampleMask
 *         VkBool32                               alphaToCoverageEnable
 *         VkBool32                               alphaToOneEnable
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineCoverageToColorStateCreateInfoNV
 *         - VkPipelineSampleLocationsStateCreateInfoEXT
 *         - VkPipelineCoverageModulationStateCreateInfoNV
 *         - VkPipelineCoverageReductionStateCreateInfoNV
 */
@JvmInline
value class PipelineMultisampleStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var rasterizationSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var sampleShadingEnable: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var minSampleShading: Float
		get()      = Unsafe.getFloat(address + 28)
		set(value) = Unsafe.setFloat(address + 28, value)
	
	var pSampleMask: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var alphaToCoverageEnable: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var alphaToOneEnable: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineRasterizationStateCreateInfo {
 *         VkStructureType                          sType
 *         void*                                    pNext
 *         VkPipelineRasterizationStateCreateFlags  flags (reserved, must be zero)
 *         VkBool32                                 depthClampEnable
 *         VkBool32                                 rasterizerDiscardEnable
 *         VkPolygonMode                            polygonMode
 *         VkCullModeFlags                          cullMode
 *         VkFrontFace                              frontFace
 *         VkBool32                                 depthBiasEnable
 *         float                                    depthBiasConstantFactor
 *         float                                    depthBiasClamp
 *         float                                    depthBiasSlopeFactor
 *         float                                    lineWidth
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineRasterizationStateRasterizationOrderAMD
 *         - VkPipelineRasterizationConservativeStateCreateInfoEXT
 *         - VkPipelineRasterizationStateStreamCreateInfoEXT
 *         - VkPipelineRasterizationDepthClipStateCreateInfoEXT
 *         - VkPipelineRasterizationLineStateCreateInfoEXT
 *         - VkPipelineRasterizationProvokingVertexStateCreateInfoEXT
 */
@JvmInline
value class PipelineRasterizationStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var depthClampEnable: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var rasterizerDiscardEnable: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var polygonMode: PolygonMode
		get()      = _PolygonMode(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var cullMode: CullModeFlags
		get()      = CullModeFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var frontFace: FrontFace
		get()      = _FrontFace(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var depthBiasEnable: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var depthBiasConstantFactor: Float
		get()      = Unsafe.getFloat(address + 44)
		set(value) = Unsafe.setFloat(address + 44, value)
	
	var depthBiasClamp: Float
		get()      = Unsafe.getFloat(address + 48)
		set(value) = Unsafe.setFloat(address + 48, value)
	
	var depthBiasSlopeFactor: Float
		get()      = Unsafe.getFloat(address + 52)
		set(value) = Unsafe.setFloat(address + 52, value)
	
	var lineWidth: Float
		get()      = Unsafe.getFloat(address + 56)
		set(value) = Unsafe.setFloat(address + 56, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineShaderStageCreateInfo {
 *         VkStructureType                   sType
 *         void*                             pNext
 *         VkPipelineShaderStageCreateFlags  flags
 *         VkShaderStageFlagBits             stage
 *         VkShaderModule                    module
 *         char*                             pName
 *         VkSpecializationInfo*             pSpecializationInfo
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT
 */
@JvmInline
value class PipelineShaderStageCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var stage: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var module: ShaderModuleH
		get()      = ShaderModuleH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var pName: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pSpecializationInfo: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var name:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var specializationInfo: SpecializationInfo
		get()      = SpecializationInfo(Unsafe.getLong(address + 40))
		set(value) { Unsafe.setLong(address + 40, value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PipelineShaderStageCreateInfo(offset(index))
		
		operator fun set(index: Int, value: PipelineShaderStageCreateInfo) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (PipelineShaderStageCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineShaderStageCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PipelineShaderStageCreateInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineTessellationStateCreateInfo {
 *         VkStructureType                         sType
 *         void*                                   pNext
 *         VkPipelineTessellationStateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                                patchControlPoints
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineTessellationDomainOriginStateCreateInfo
 */
@JvmInline
value class PipelineTessellationStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var patchControlPoints: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineVertexInputStateCreateInfo {
 *         VkStructureType                        sType
 *         void*                                  pNext
 *         VkPipelineVertexInputStateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                               vertexBindingDescriptionCount
 *         VkVertexInputBindingDescription*       pVertexBindingDescriptions
 *         uint32_t                               vertexAttributeDescriptionCount
 *         VkVertexInputAttributeDescription*     pVertexAttributeDescriptions
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineVertexInputDivisorStateCreateInfoEXT
 */
@JvmInline
value class PipelineVertexInputStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var vertexBindingDescriptionCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pVertexBindingDescriptions: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var vertexAttributeDescriptionCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pVertexAttributeDescriptions: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var vertexBindingDescriptions: VertexInputBindingDescription.Buffer
		get()      = VertexInputBindingDescription.Buffer(Unsafe.getLong(address + 24), vertexBindingDescriptionCount)
		set(value) { Unsafe.setLong(address + 24, value.address); vertexBindingDescriptionCount = value.capacity }
	
	var vertexAttributeDescriptions: VertexInputAttributeDescription.Buffer
		get()      = VertexInputAttributeDescription.Buffer(Unsafe.getLong(address + 40), vertexAttributeDescriptionCount)
		set(value) { Unsafe.setLong(address + 40, value.address); vertexAttributeDescriptionCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineViewportStateCreateInfo {
 *         VkStructureType                     sType
 *         void*                               pNext
 *         VkPipelineViewportStateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                            viewportCount
 *         VkViewport*                         pViewports
 *         uint32_t                            scissorCount
 *         VkRect2D*                           pScissors
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineViewportWScalingStateCreateInfoNV
 *         - VkPipelineViewportSwizzleStateCreateInfoNV
 *         - VkPipelineViewportExclusiveScissorStateCreateInfoNV
 *         - VkPipelineViewportShadingRateImageStateCreateInfoNV
 *         - VkPipelineViewportCoarseSampleOrderStateCreateInfoNV
 *         - VkPipelineViewportDepthClipControlCreateInfoEXT
 */
@JvmInline
value class PipelineViewportStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var viewportCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pViewports: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var scissorCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pScissors: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var viewports: Viewport.Buffer
		get()      = Viewport.Buffer(Unsafe.getLong(address + 24), viewportCount)
		set(value) { Unsafe.setLong(address + 24, value.address); viewportCount = value.capacity }
	
	var scissors: Rect2D.Buffer
		get()      = Rect2D.Buffer(Unsafe.getLong(address + 40), scissorCount)
		set(value) { Unsafe.setLong(address + 40, value.address); scissorCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSpecializationInfo {
 *         uint32_t                   mapEntryCount
 *         VkSpecializationMapEntry*  pMapEntries
 *         size_t                     dataSize
 *         void*                      pData
 *     }
 */
@JvmInline
value class SpecializationInfo(override val address: Long) : Addressable {
	
	
	var mapEntryCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pMapEntries: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var dataSize: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var pData: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var mapEntries: SpecializationMapEntry.Buffer
		get()      = SpecializationMapEntry.Buffer(Unsafe.getLong(address + 8), mapEntryCount)
		set(value) { Unsafe.setLong(address + 8, value.address); mapEntryCount = value.capacity }
	
	var data: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), dataSize.toInt())
		set(value) { Unsafe.setLong(address + 24, value.address); dataSize = value.capacity.toLong() }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSpecializationMapEntry {
 *         uint32_t  constantID
 *         uint32_t  offset
 *         size_t    size
 *     }
 */
@JvmInline
value class SpecializationMapEntry(override val address: Long) : Addressable {
	
	
	var constantID: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var offset: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SpecializationMapEntry(offset(index))
		
		operator fun set(index: Int, value: SpecializationMapEntry) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (SpecializationMapEntry) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SpecializationMapEntry) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SpecializationMapEntry) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkStencilOpState {
 *         VkStencilOp  failOp
 *         VkStencilOp  passOp
 *         VkStencilOp  depthFailOp
 *         VkCompareOp  compareOp
 *         uint32_t     compareMask
 *         uint32_t     writeMask
 *         uint32_t     reference
 *     }
 */
@JvmInline
value class StencilOpState(override val address: Long) : Addressable {
	
	
	var failOp: StencilOp
		get()      = _StencilOp(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var passOp: StencilOp
		get()      = _StencilOp(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var depthFailOp: StencilOp
		get()      = _StencilOp(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var compareOp: CompareOp
		get()      = _CompareOp(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	var compareMask: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var writeMask: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var reference: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkVertexInputAttributeDescription {
 *         uint32_t  location
 *         uint32_t  binding
 *         VkFormat  format
 *         uint32_t  offset
 *     }
 */
@JvmInline
value class VertexInputAttributeDescription(override val address: Long) : Addressable {
	
	
	var location: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var binding: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var offset: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = VertexInputAttributeDescription(offset(index))
		
		operator fun set(index: Int, value: VertexInputAttributeDescription) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (VertexInputAttributeDescription) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VertexInputAttributeDescription) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, VertexInputAttributeDescription) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkVertexInputBindingDescription {
 *         uint32_t           binding
 *         uint32_t           stride
 *         VkVertexInputRate  inputRate
 *     }
 */
@JvmInline
value class VertexInputBindingDescription(override val address: Long) : Addressable {
	
	
	var binding: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var stride: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var inputRate: VertexInputRate
		get()      = _VertexInputRate(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 12
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = VertexInputBindingDescription(offset(index))
		
		operator fun set(index: Int, value: VertexInputBindingDescription) = Unsafe.copy(value.address, offset(index), 12)
		
		inline fun forEach(block: (VertexInputBindingDescription) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VertexInputBindingDescription) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, VertexInputBindingDescription) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkViewport {
 *         float  x
 *         float  y
 *         float  width
 *         float  height
 *         float  minDepth
 *         float  maxDepth
 *     }
 */
@JvmInline
value class Viewport(override val address: Long) : Addressable {
	
	
	var x: Float
		get()      = Unsafe.getFloat(address + 0)
		set(value) = Unsafe.setFloat(address + 0, value)
	
	var y: Float
		get()      = Unsafe.getFloat(address + 4)
		set(value) = Unsafe.setFloat(address + 4, value)
	
	var width: Float
		get()      = Unsafe.getFloat(address + 8)
		set(value) = Unsafe.setFloat(address + 8, value)
	
	var height: Float
		get()      = Unsafe.getFloat(address + 12)
		set(value) = Unsafe.setFloat(address + 12, value)
	
	var minDepth: Float
		get()      = Unsafe.getFloat(address + 16)
		set(value) = Unsafe.setFloat(address + 16, value)
	
	var maxDepth: Float
		get()      = Unsafe.getFloat(address + 20)
		set(value) = Unsafe.setFloat(address + 20, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = Viewport(offset(index))
		
		operator fun set(index: Int, value: Viewport) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (Viewport) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (Viewport) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, Viewport) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPipelineLayoutCreateInfo {
 *         VkStructureType              sType
 *         void*                        pNext (must be null)
 *         VkPipelineLayoutCreateFlags  flags (reserved, must be zero)
 *         uint32_t                     setLayoutCount
 *         VkDescriptorSetLayout*       pSetLayouts
 *         uint32_t                     pushConstantRangeCount
 *         VkPushConstantRange*         pPushConstantRanges
 *     }
 */
@JvmInline
value class PipelineLayoutCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var setLayoutCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pSetLayouts: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pushConstantRangeCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pPushConstantRanges: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var setLayouts: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), setLayoutCount)
		set(value) { Unsafe.setLong(address + 24, value.address); setLayoutCount = value.capacity }
	
	var pushConstantRanges: PushConstantRange.Buffer
		get()      = PushConstantRange.Buffer(Unsafe.getLong(address + 40), pushConstantRangeCount)
		set(value) { Unsafe.setLong(address + 40, value.address); pushConstantRangeCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkPushConstantRange {
 *         VkShaderStageFlags  stageFlags
 *         uint32_t            offset
 *         uint32_t            size
 *     }
 */
@JvmInline
value class PushConstantRange(override val address: Long) : Addressable {
	
	
	var stageFlags: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var offset: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var size: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 12
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PushConstantRange(offset(index))
		
		operator fun set(index: Int, value: PushConstantRange) = Unsafe.copy(value.address, offset(index), 12)
		
		inline fun forEach(block: (PushConstantRange) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PushConstantRange) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PushConstantRange) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSamplerCreateInfo {
 *         VkStructureType       sType
 *         void*                 pNext
 *         VkSamplerCreateFlags  flags
 *         VkFilter              magFilter
 *         VkFilter              minFilter
 *         VkSamplerMipmapMode   mipmapMode
 *         VkSamplerAddressMode  addressModeU
 *         VkSamplerAddressMode  addressModeV
 *         VkSamplerAddressMode  addressModeW
 *         float                 mipLodBias
 *         VkBool32              anisotropyEnable
 *         float                 maxAnisotropy
 *         VkBool32              compareEnable
 *         VkCompareOp           compareOp
 *         float                 minLod
 *         float                 maxLod
 *         VkBorderColor         borderColor
 *         VkBool32              unnormalizedCoordinates
 *     }
 * 
 *     Valid pNext types:
 *         - VkSamplerYcbcrConversionInfo
 *         - VkSamplerReductionModeCreateInfo
 *         - VkSamplerCustomBorderColorCreateInfoEXT
 *         - VkSamplerBorderColorComponentMappingCreateInfoEXT
 */
@JvmInline
value class SamplerCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var magFilter: Filter
		get()      = _Filter(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var minFilter: Filter
		get()      = _Filter(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var mipmapMode: SamplerMipmapMode
		get()      = _SamplerMipmapMode(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var addressModeU: SamplerAddressMode
		get()      = _SamplerAddressMode(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var addressModeV: SamplerAddressMode
		get()      = _SamplerAddressMode(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var addressModeW: SamplerAddressMode
		get()      = _SamplerAddressMode(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var mipLodBias: Float
		get()      = Unsafe.getFloat(address + 44)
		set(value) = Unsafe.setFloat(address + 44, value)
	
	var anisotropyEnable: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var maxAnisotropy: Float
		get()      = Unsafe.getFloat(address + 52)
		set(value) = Unsafe.setFloat(address + 52, value)
	
	var compareEnable: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var compareOp: CompareOp
		get()      = _CompareOp(Unsafe.getInt(address + 60))
		set(value) = Unsafe.setInt(address + 60, value.value)
	
	var minLod: Float
		get()      = Unsafe.getFloat(address + 64)
		set(value) = Unsafe.setFloat(address + 64, value)
	
	var maxLod: Float
		get()      = Unsafe.getFloat(address + 68)
		set(value) = Unsafe.setFloat(address + 68, value)
	
	var borderColor: BorderColor
		get()      = _BorderColor(Unsafe.getInt(address + 72))
		set(value) = Unsafe.setInt(address + 72, value.value)
	
	var unnormalizedCoordinates: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkCopyDescriptorSet {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDescriptorSet  srcSet
 *         uint32_t         srcBinding
 *         uint32_t         srcArrayElement
 *         VkDescriptorSet  dstSet
 *         uint32_t         dstBinding
 *         uint32_t         dstArrayElement
 *         uint32_t         descriptorCount
 *     }
 */
@JvmInline
value class CopyDescriptorSet(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcSet: DescriptorSetH
		get()      = DescriptorSetH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var srcBinding: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var srcArrayElement: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var dstSet: DescriptorSetH
		get()      = DescriptorSetH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var dstBinding: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var dstArrayElement: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 56
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = CopyDescriptorSet(offset(index))
		
		operator fun set(index: Int, value: CopyDescriptorSet) = Unsafe.copy(value.address, offset(index), 56)
		
		inline fun forEach(block: (CopyDescriptorSet) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CopyDescriptorSet) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, CopyDescriptorSet) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDescriptorBufferInfo {
 *         VkBuffer      buffer
 *         VkDeviceSize  offset
 *         VkDeviceSize  range
 *     }
 */
@JvmInline
value class DescriptorBufferInfo(override val address: Long) : Addressable {
	
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var range: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DescriptorBufferInfo(offset(index))
		
		operator fun set(index: Int, value: DescriptorBufferInfo) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (DescriptorBufferInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DescriptorBufferInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DescriptorBufferInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDescriptorImageInfo {
 *         VkSampler      sampler
 *         VkImageView    imageView
 *         VkImageLayout  imageLayout
 *     }
 */
@JvmInline
value class DescriptorImageInfo(override val address: Long) : Addressable {
	
	
	var sampler: SamplerH
		get()      = SamplerH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var imageView: ImageViewH
		get()      = ImageViewH(Unsafe.getLong(address + 8))
		set(value) = Unsafe.setLong(address + 8, value.address)
	
	var imageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DescriptorImageInfo(offset(index))
		
		operator fun set(index: Int, value: DescriptorImageInfo) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (DescriptorImageInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DescriptorImageInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DescriptorImageInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDescriptorPoolCreateInfo {
 *         VkStructureType              sType
 *         void*                        pNext
 *         VkDescriptorPoolCreateFlags  flags
 *         uint32_t                     maxSets
 *         uint32_t                     poolSizeCount
 *         VkDescriptorPoolSize*        pPoolSizes
 *     }
 * 
 *     Valid pNext types:
 *         - VkDescriptorPoolInlineUniformBlockCreateInfoEXT
 *         - VkMutableDescriptorTypeCreateInfoVALVE
 */
@JvmInline
value class DescriptorPoolCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: DescriptorPoolCreateFlags
		get()      = DescriptorPoolCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var maxSets: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var poolSizeCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pPoolSizes: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var poolSizes: DescriptorPoolSize.Buffer
		get()      = DescriptorPoolSize.Buffer(Unsafe.getLong(address + 32), poolSizeCount)
		set(value) { Unsafe.setLong(address + 32, value.address); poolSizeCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDescriptorPoolSize {
 *         VkDescriptorType  type
 *         uint32_t          descriptorCount
 *     }
 */
@JvmInline
value class DescriptorPoolSize(override val address: Long) : Addressable {
	
	
	var type: DescriptorType
		get()      = _DescriptorType(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DescriptorPoolSize(offset(index))
		
		operator fun set(index: Int, value: DescriptorPoolSize) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (DescriptorPoolSize) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DescriptorPoolSize) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DescriptorPoolSize) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDescriptorSetAllocateInfo {
 *         VkStructureType         sType
 *         void*                   pNext
 *         VkDescriptorPool        descriptorPool
 *         uint32_t                descriptorSetCount
 *         VkDescriptorSetLayout*  pSetLayouts
 *     }
 * 
 *     Valid pNext types:
 *         - VkDescriptorSetVariableDescriptorCountAllocateInfo
 */
@JvmInline
value class DescriptorSetAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var descriptorPool: DescriptorPoolH
		get()      = DescriptorPoolH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var descriptorSetCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pSetLayouts: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var setLayouts: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 32), descriptorSetCount)
		set(value) { Unsafe.setLong(address + 32, value.address); descriptorSetCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDescriptorSetLayoutBinding {
 *         uint32_t            binding
 *         VkDescriptorType    descriptorType
 *         uint32_t            descriptorCount
 *         VkShaderStageFlags  stageFlags
 *         VkSampler*          pImmutableSamplers
 *     }
 */
@JvmInline
value class DescriptorSetLayoutBinding(override val address: Long) : Addressable {
	
	
	var binding: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var descriptorType: DescriptorType
		get()      = _DescriptorType(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var stageFlags: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	var pImmutableSamplers: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	var immutableSamplers: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 16), descriptorCount)
		set(value) { Unsafe.setLong(address + 16, value.address); descriptorCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DescriptorSetLayoutBinding(offset(index))
		
		operator fun set(index: Int, value: DescriptorSetLayoutBinding) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (DescriptorSetLayoutBinding) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DescriptorSetLayoutBinding) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DescriptorSetLayoutBinding) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkDescriptorSetLayoutCreateInfo {
 *         VkStructureType                   sType
 *         void*                             pNext
 *         VkDescriptorSetLayoutCreateFlags  flags
 *         uint32_t                          bindingCount
 *         VkDescriptorSetLayoutBinding*     pBindings
 *     }
 * 
 *     Valid pNext types:
 *         - VkDescriptorSetLayoutBindingFlagsCreateInfo
 *         - VkMutableDescriptorTypeCreateInfoVALVE
 */
@JvmInline
value class DescriptorSetLayoutCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: DescriptorSetLayoutCreateFlags
		get()      = DescriptorSetLayoutCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var bindingCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pBindings: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var bindings: DescriptorSetLayoutBinding.Buffer
		get()      = DescriptorSetLayoutBinding.Buffer(Unsafe.getLong(address + 24), bindingCount)
		set(value) { Unsafe.setLong(address + 24, value.address); bindingCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkWriteDescriptorSet {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkDescriptorSet          dstSet
 *         uint32_t                 dstBinding
 *         uint32_t                 dstArrayElement
 *         uint32_t                 descriptorCount
 *         VkDescriptorType         descriptorType
 *         VkDescriptorImageInfo*   pImageInfo
 *         VkDescriptorBufferInfo*  pBufferInfo
 *         VkBufferView*            pTexelBufferView
 *     }
 * 
 *     Valid pNext types:
 *         - VkWriteDescriptorSetInlineUniformBlockEXT
 *         - VkWriteDescriptorSetAccelerationStructureKHR
 *         - VkWriteDescriptorSetAccelerationStructureNV
 */
@JvmInline
value class WriteDescriptorSet(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var dstSet: DescriptorSetH
		get()      = DescriptorSetH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var dstBinding: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var dstArrayElement: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var descriptorType: DescriptorType
		get()      = _DescriptorType(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var pImageInfo: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var pBufferInfo: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var pTexelBufferView: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var imageInfo: DescriptorImageInfo.Buffer
		get()      = DescriptorImageInfo.Buffer(Unsafe.getLong(address + 40), descriptorCount)
		set(value) { Unsafe.setLong(address + 40, value.address); descriptorCount = value.capacity }
	
	var bufferInfo: DescriptorBufferInfo.Buffer
		get()      = DescriptorBufferInfo.Buffer(Unsafe.getLong(address + 48), descriptorCount)
		set(value) { Unsafe.setLong(address + 48, value.address); descriptorCount = value.capacity }
	
	var texelBufferView: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 56), descriptorCount)
		set(value) { Unsafe.setLong(address + 56, value.address); descriptorCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = WriteDescriptorSet(offset(index))
		
		operator fun set(index: Int, value: WriteDescriptorSet) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (WriteDescriptorSet) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (WriteDescriptorSet) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, WriteDescriptorSet) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkAttachmentDescription {
 *         VkAttachmentDescriptionFlags  flags
 *         VkFormat                      format
 *         VkSampleCountFlagBits         samples
 *         VkAttachmentLoadOp            loadOp
 *         VkAttachmentStoreOp           storeOp
 *         VkAttachmentLoadOp            stencilLoadOp
 *         VkAttachmentStoreOp           stencilStoreOp
 *         VkImageLayout                 initialLayout
 *         VkImageLayout                 finalLayout
 *     }
 */
@JvmInline
value class AttachmentDescription(override val address: Long) : Addressable {
	
	
	var flags: AttachmentDescriptionFlags
		get()      = AttachmentDescriptionFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var samples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var loadOp: AttachmentLoadOp
		get()      = _AttachmentLoadOp(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	var storeOp: AttachmentStoreOp
		get()      = _AttachmentStoreOp(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stencilLoadOp: AttachmentLoadOp
		get()      = _AttachmentLoadOp(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var stencilStoreOp: AttachmentStoreOp
		get()      = _AttachmentStoreOp(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var initialLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var finalLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 36
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = AttachmentDescription(offset(index))
		
		operator fun set(index: Int, value: AttachmentDescription) = Unsafe.copy(value.address, offset(index), 36)
		
		inline fun forEach(block: (AttachmentDescription) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AttachmentDescription) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, AttachmentDescription) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkAttachmentReference {
 *         uint32_t       attachment
 *         VkImageLayout  layout
 *     }
 */
@JvmInline
value class AttachmentReference(override val address: Long) : Addressable {
	
	
	var attachment: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var layout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = AttachmentReference(offset(index))
		
		operator fun set(index: Int, value: AttachmentReference) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (AttachmentReference) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AttachmentReference) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, AttachmentReference) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkFramebufferCreateInfo {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkFramebufferCreateFlags  flags
 *         VkRenderPass              renderPass
 *         uint32_t                  attachmentCount
 *         VkImageView*              pAttachments
 *         uint32_t                  width
 *         uint32_t                  height
 *         uint32_t                  layers
 *     }
 * 
 *     Valid pNext types:
 *         - VkFramebufferAttachmentsCreateInfo
 */
@JvmInline
value class FramebufferCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: FramebufferCreateFlags
		get()      = FramebufferCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var renderPass: RenderPassH
		get()      = RenderPassH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var attachmentCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pAttachments: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var width: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var height: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var layers: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	
	
	var attachments: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), attachmentCount)
		set(value) { Unsafe.setLong(address + 40, value.address); attachmentCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkRenderPassCreateInfo {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkRenderPassCreateFlags   flags
 *         uint32_t                  attachmentCount
 *         VkAttachmentDescription*  pAttachments
 *         uint32_t                  subpassCount
 *         VkSubpassDescription*     pSubpasses
 *         uint32_t                  dependencyCount
 *         VkSubpassDependency*      pDependencies
 *     }
 * 
 *     Valid pNext types:
 *         - VkRenderPassMultiviewCreateInfo
 *         - VkRenderPassInputAttachmentAspectCreateInfo
 *         - VkRenderPassFragmentDensityMapCreateInfoEXT
 */
@JvmInline
value class RenderPassCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var attachmentCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pAttachments: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var subpassCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pSubpasses: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var dependencyCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pDependencies: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var attachments: AttachmentDescription.Buffer
		get()      = AttachmentDescription.Buffer(Unsafe.getLong(address + 24), attachmentCount)
		set(value) { Unsafe.setLong(address + 24, value.address); attachmentCount = value.capacity }
	
	var subpasses: SubpassDescription.Buffer
		get()      = SubpassDescription.Buffer(Unsafe.getLong(address + 40), subpassCount)
		set(value) { Unsafe.setLong(address + 40, value.address); subpassCount = value.capacity }
	
	var dependencies: SubpassDependency.Buffer
		get()      = SubpassDependency.Buffer(Unsafe.getLong(address + 56), dependencyCount)
		set(value) { Unsafe.setLong(address + 56, value.address); dependencyCount = value.capacity }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSubpassDependency {
 *         uint32_t              srcSubpass
 *         uint32_t              dstSubpass
 *         VkPipelineStageFlags  srcStageMask
 *         VkPipelineStageFlags  dstStageMask
 *         VkAccessFlags         srcAccessMask
 *         VkAccessFlags         dstAccessMask
 *         VkDependencyFlags     dependencyFlags
 *     }
 */
@JvmInline
value class SubpassDependency(override val address: Long) : Addressable {
	
	
	var srcSubpass: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var dstSubpass: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var srcStageMask: PipelineStageFlags
		get()      = PipelineStageFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var dstStageMask: PipelineStageFlags
		get()      = PipelineStageFlags(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	var srcAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var dstAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var dependencyFlags: DependencyFlags
		get()      = DependencyFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 28
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubpassDependency(offset(index))
		
		operator fun set(index: Int, value: SubpassDependency) = Unsafe.copy(value.address, offset(index), 28)
		
		inline fun forEach(block: (SubpassDependency) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubpassDependency) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubpassDependency) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkSubpassDescription {
 *         VkSubpassDescriptionFlags  flags
 *         VkPipelineBindPoint        pipelineBindPoint
 *         uint32_t                   inputAttachmentCount
 *         VkAttachmentReference*     pInputAttachments
 *         uint32_t                   colorAttachmentCount
 *         VkAttachmentReference*     pColorAttachments
 *         VkAttachmentReference*     pResolveAttachments
 *         VkAttachmentReference*     pDepthStencilAttachment
 *         uint32_t                   preserveAttachmentCount
 *         uint32_t*                  pPreserveAttachments
 *     }
 */
@JvmInline
value class SubpassDescription(override val address: Long) : Addressable {
	
	
	var flags: Int
		get() = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = _PipelineBindPoint(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var inputAttachmentCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var pInputAttachments: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pColorAttachments: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pResolveAttachments: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var pDepthStencilAttachment: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var preserveAttachmentCount: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var pPreserveAttachments: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	
	
	var inputAttachments: AttachmentReference.Buffer
		get()      = AttachmentReference.Buffer(Unsafe.getLong(address + 16), inputAttachmentCount)
		set(value) { Unsafe.setLong(address + 16, value.address); inputAttachmentCount = value.capacity }
	
	var colorAttachments: AttachmentReference.Buffer
		get()      = AttachmentReference.Buffer(Unsafe.getLong(address + 32), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 32, value.address); colorAttachmentCount = value.capacity }
	
	var resolveAttachments: AttachmentReference.Buffer
		get()      = AttachmentReference.Buffer(Unsafe.getLong(address + 40), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 40, value.address); colorAttachmentCount = value.capacity }
	
	var depthStencilAttachment: AttachmentReference
		get()      = AttachmentReference(Unsafe.getLong(address + 48))
		set(value) { Unsafe.setLong(address + 48, value.address) }
	
	var preserveAttachments: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 64), preserveAttachmentCount)
		set(value) { Unsafe.setLong(address + 64, value.address); preserveAttachmentCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 72
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubpassDescription(offset(index))
		
		operator fun set(index: Int, value: SubpassDescription) = Unsafe.copy(value.address, offset(index), 72)
		
		inline fun forEach(block: (SubpassDescription) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubpassDescription) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubpassDescription) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkCommandPoolCreateInfo {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkCommandPoolCreateFlags  flags
 *         uint32_t                  queueFamilyIndex
 *     }
 */
@JvmInline
value class CommandPoolCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: CommandPoolCreateFlags
		get()      = CommandPoolCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var queueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkCommandBufferAllocateInfo {
 *         VkStructureType       sType
 *         void*                 pNext (must be null)
 *         VkCommandPool         commandPool
 *         VkCommandBufferLevel  level
 *         uint32_t              commandBufferCount
 *     }
 */
@JvmInline
value class CommandBufferAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var commandPool: CommandPoolH
		get()      = CommandPoolH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var level: CommandBufferLevel
		get()      = _CommandBufferLevel(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var commandBufferCount: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkCommandBufferBeginInfo {
 *         VkStructureType                  sType
 *         void*                            pNext
 *         VkCommandBufferUsageFlags        flags
 *         VkCommandBufferInheritanceInfo*  pInheritanceInfo
 *     }
 * 
 *     Valid pNext types:
 *         - VkDeviceGroupCommandBufferBeginInfo
 */
@JvmInline
value class CommandBufferBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: CommandBufferUsageFlags
		get()      = CommandBufferUsageFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var pInheritanceInfo: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var inheritanceInfo: CommandBufferInheritanceInfo
		get()      = CommandBufferInheritanceInfo(Unsafe.getLong(address + 24))
		set(value) { Unsafe.setLong(address + 24, value.address) }


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkCommandBufferInheritanceInfo {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkRenderPass                   renderPass
 *         uint32_t                       subpass
 *         VkFramebuffer                  framebuffer
 *         VkBool32                       occlusionQueryEnable
 *         VkQueryControlFlags            queryFlags
 *         VkQueryPipelineStatisticFlags  pipelineStatistics
 *     }
 * 
 *     Valid pNext types:
 *         - VkCommandBufferInheritanceConditionalRenderingInfoEXT
 *         - VkCommandBufferInheritanceRenderPassTransformInfoQCOM
 *         - VkCommandBufferInheritanceViewportScissorInfoNV
 *         - VkCommandBufferInheritanceRenderingInfoKHR
 *         - VkAttachmentSampleCountInfoAMD
 *         - VkMultiviewPerViewAttributesInfoNVX
 */
@JvmInline
value class CommandBufferInheritanceInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var renderPass: RenderPassH
		get()      = RenderPassH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var subpass: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var framebuffer: FramebufferH
		get()      = FramebufferH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var occlusionQueryEnable: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var queryFlags: QueryControlFlags
		get()      = QueryControlFlags(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var pipelineStatistics: QueryPipelineStatisticFlags
		get()      = QueryPipelineStatisticFlags(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkBufferCopy {
 *         VkDeviceSize  srcOffset
 *         VkDeviceSize  dstOffset
 *         VkDeviceSize  size
 *     }
 */
@JvmInline
value class BufferCopy(override val address: Long) : Addressable {
	
	
	var srcOffset: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var dstOffset: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BufferCopy(offset(index))
		
		operator fun set(index: Int, value: BufferCopy) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (BufferCopy) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferCopy) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BufferCopy) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkBufferImageCopy {
 *         VkDeviceSize              bufferOffset
 *         uint32_t                  bufferRowLength
 *         uint32_t                  bufferImageHeight
 *         VkImageSubresourceLayers  imageSubresource
 *         VkOffset3D                imageOffset
 *         VkExtent3D                imageExtent
 *     }
 */
@JvmInline
value class BufferImageCopy(override val address: Long) : Addressable {
	
	
	var bufferOffset: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var bufferRowLength: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var bufferImageHeight: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var imageSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 16)
	
	var imageOffset: Offset3D
		get()      = Offset3D(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 12)
	
	var imageExtent: Extent3D
		get()      = Extent3D(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 56
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BufferImageCopy(offset(index))
		
		operator fun set(index: Int, value: BufferImageCopy) = Unsafe.copy(value.address, offset(index), 56)
		
		inline fun forEach(block: (BufferImageCopy) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferImageCopy) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BufferImageCopy) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkClearAttachment {
 *         VkImageAspectFlags  aspectMask
 *         uint32_t            colorAttachment
 *         VkClearValue        clearValue
 *     }
 */
@JvmInline
value class ClearAttachment(override val address: Long) : Addressable {
	
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var colorAttachment: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var clearValue: ClearValue
		get()      = ClearValue(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 16)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ClearAttachment(offset(index))
		
		operator fun set(index: Int, value: ClearAttachment) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (ClearAttachment) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ClearAttachment) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ClearAttachment) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     union VkClearColorValue {
 *         float     float32[4]
 *         int32_t   int32[4]
 *         uint32_t  uint32[4]
 *     }
 */
@JvmInline
value class ClearColorValue(override val address: Long) : Addressable {
	
	
	var float32: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 0, 4)
		set(value) = Unsafe.copy(value.address, address + 0, value.byteSize)
	
	var int32: DirectIntBuffer
		get()      = DirectIntBuffer(address + 0, 4)
		set(value) = Unsafe.copy(value.address, address + 0, value.byteSize)
	
	var uint32: DirectIntBuffer
		get()      = DirectIntBuffer(address + 0, 4)
		set(value) = Unsafe.copy(value.address, address + 0, value.byteSize)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkClearDepthStencilValue {
 *         float     depth
 *         uint32_t  stencil
 *     }
 */
@JvmInline
value class ClearDepthStencilValue(override val address: Long) : Addressable {
	
	
	var depth: Float
		get()      = Unsafe.getFloat(address + 0)
		set(value) = Unsafe.setFloat(address + 0, value)
	
	var stencil: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkClearRect {
 *         VkRect2D  rect
 *         uint32_t  baseArrayLayer
 *         uint32_t  layerCount
 *     }
 */
@JvmInline
value class ClearRect(override val address: Long) : Addressable {
	
	
	var rect: Rect2D
		get()      = Rect2D(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 16)
	
	var baseArrayLayer: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var layerCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ClearRect(offset(index))
		
		operator fun set(index: Int, value: ClearRect) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (ClearRect) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ClearRect) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ClearRect) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     union VkClearValue {
 *         VkClearColorValue         color
 *         VkClearDepthStencilValue  depthStencil
 *     }
 */
@JvmInline
value class ClearValue(override val address: Long) : Addressable {
	
	
	var color: ClearColorValue
		get()      = ClearColorValue(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 16)
	
	var depthStencil: ClearDepthStencilValue
		get()      = ClearDepthStencilValue(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 8)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ClearValue(offset(index))
		
		operator fun set(index: Int, value: ClearValue) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (ClearValue) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ClearValue) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ClearValue) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkImageBlit {
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffsets[2]
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffsets[2]
 *     }
 */
@JvmInline
value class ImageBlit(override val address: Long) : Addressable {
	
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 16)
	
	var srcOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + 16, 2)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 40)
		set(value) = Unsafe.copy(value.address, address + 40, 16)
	
	var dstOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + 56, 2)
		set(value) = Unsafe.copy(value.address, address + 56, value.byteSize)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 80
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageBlit(offset(index))
		
		operator fun set(index: Int, value: ImageBlit) = Unsafe.copy(value.address, offset(index), 80)
		
		inline fun forEach(block: (ImageBlit) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageBlit) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageBlit) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkImageCopy {
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffset
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffset
 *         VkExtent3D                extent
 *     }
 */
@JvmInline
value class ImageCopy(override val address: Long) : Addressable {
	
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 16)
	
	var srcOffset: Offset3D
		get()      = Offset3D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 12)
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 16)
	
	var dstOffset: Offset3D
		get()      = Offset3D(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 12)
	
	var extent: Extent3D
		get()      = Extent3D(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 68
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageCopy(offset(index))
		
		operator fun set(index: Int, value: ImageCopy) = Unsafe.copy(value.address, offset(index), 68)
		
		inline fun forEach(block: (ImageCopy) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageCopy) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageCopy) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkImageResolve {
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffset
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffset
 *         VkExtent3D                extent
 *     }
 */
@JvmInline
value class ImageResolve(override val address: Long) : Addressable {
	
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 16)
	
	var srcOffset: Offset3D
		get()      = Offset3D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 12)
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 16)
	
	var dstOffset: Offset3D
		get()      = Offset3D(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 12)
	
	var extent: Extent3D
		get()      = Extent3D(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 68
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageResolve(offset(index))
		
		operator fun set(index: Int, value: ImageResolve) = Unsafe.copy(value.address, offset(index), 68)
		
		inline fun forEach(block: (ImageResolve) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageResolve) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageResolve) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkImageSubresourceLayers {
 *         VkImageAspectFlags  aspectMask
 *         uint32_t            mipLevel
 *         uint32_t            baseArrayLayer
 *         uint32_t            layerCount
 *     }
 */
@JvmInline
value class ImageSubresourceLayers(override val address: Long) : Addressable {
	
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var mipLevel: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var baseArrayLayer: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var layerCount: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)


}



/**
 *     // provided by VK_VERSION_1_0
 *     struct VkRenderPassBeginInfo {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkRenderPass     renderPass
 *         VkFramebuffer    framebuffer
 *         VkRect2D         renderArea
 *         uint32_t         clearValueCount
 *         VkClearValue*    pClearValues
 *     }
 * 
 *     Valid pNext types:
 *         - VkDeviceGroupRenderPassBeginInfo
 *         - VkRenderPassSampleLocationsBeginInfoEXT
 *         - VkRenderPassAttachmentBeginInfo
 *         - VkRenderPassTransformBeginInfoQCOM
 */
@JvmInline
value class RenderPassBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var renderPass: RenderPassH
		get()      = RenderPassH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var framebuffer: FramebufferH
		get()      = FramebufferH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var renderArea: Rect2D
		get()      = Rect2D(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 16)
	
	var clearValueCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pClearValues: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var clearValues: ClearValue.Buffer
		get()      = ClearValue.Buffer(Unsafe.getLong(address + 56), clearValueCount)
		set(value) { Unsafe.setLong(address + 56, value.address); clearValueCount = value.capacity }


}