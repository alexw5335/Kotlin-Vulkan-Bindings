// This file has been automatically generated.



#include <jni.h>



#define VK_NO_PROTOTYPES



#ifdef WIN32
	#include <windef.h>
	#include <winbase.h>
	#ifdef VK_USE_PLATFORM_WIN32_KHR
		#include <vk_platform.h>
		#include <vulkan_core.h>
		#include <vulkan_win32.h>
	#else
		#include <vulkan.h>
	#endif
#else
	#include <vulkan.h>
	#include <dlfnc.h>
#endif



PFN_vkGetInstanceProcAddr getInstanceProcAddr;



int initVulkan() {
	#ifdef WIN32
		HMODULE module = LoadLibrary("vulkan-1.dll");
		getInstanceProcAddr = (PFN_vkGetInstanceProcAddr) GetProcAddress(module, "vkGetInstanceProcAddr");
		if(module == NULL) return 0;
	#elif defined(__APPLE__)
		void* module = LoadLibrary("libMoltenVK.dylib", RLTD_NOW | RLTD_LOCAL);
		getInstanceProcAddr = dlsym(module, "vkGetInstanceProcAddr");
		if(module == NULL) return 0;
	#else
		void* module = LoadLibary("libvulkan.so", RLTD_NOW | RLTD_LOCAL);
		getInstanceProcAddr = dlsym(module, "vkGetInstanceProcAddr");
		if(module == NULL) return 0;
	#endif
	if(getInstanceProcAddr == NULL) return 0;
	return 1;
}



JNIEXPORT jboolean JNICALL Java_vulkan_generated_command_Commands_init() {
	return (jboolean) initVulkan();
}



JNIEXPORT jlong JNICALL Java_vulkan_generated_command_Commands_getInstanceProcAddr(
	JNIEnv* env, 
	jobject obj, 
	jlong instance,
	jlong pName
) {
	return (jlong) getInstanceProcAddr((VkInstance) instance, (const char*) pName);
}



// Provided by VK_VERSION_1_0



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createInstance(JNIEnv* env, jobject obj, jlong address, jlong pCreateInfo, jlong pAllocator, jlong pInstance) {
	return (jint) ((PFN_vkCreateInstance) address) ((const VkInstanceCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkInstance*) pInstance);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyInstance(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pAllocator) {
	((PFN_vkDestroyInstance) address) ((VkInstance) instance, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_enumeratePhysicalDevices(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pPhysicalDeviceCount, jlong pPhysicalDevices) {
	return (jint) ((PFN_vkEnumeratePhysicalDevices) address) ((VkInstance) instance, (uint32_t*) pPhysicalDeviceCount, (VkPhysicalDevice*) pPhysicalDevices);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceFeatures(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pFeatures) {
	((PFN_vkGetPhysicalDeviceFeatures) address) ((VkPhysicalDevice) physicalDevice, (VkPhysicalDeviceFeatures*) pFeatures);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceFormatProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint format, jlong pFormatProperties) {
	((PFN_vkGetPhysicalDeviceFormatProperties) address) ((VkPhysicalDevice) physicalDevice, (VkFormat) format, (VkFormatProperties*) pFormatProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceImageFormatProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jlong pImageFormatProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceImageFormatProperties) address) ((VkPhysicalDevice) physicalDevice, (VkFormat) format, (VkImageType) type, (VkImageTiling) tiling, (VkImageUsageFlags) usage, (VkImageCreateFlags) flags, (VkImageFormatProperties*) pImageFormatProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pProperties) {
	((PFN_vkGetPhysicalDeviceProperties) address) ((VkPhysicalDevice) physicalDevice, (VkPhysicalDeviceProperties*) pProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceQueueFamilyProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pQueueFamilyPropertyCount, jlong pQueueFamilyProperties) {
	((PFN_vkGetPhysicalDeviceQueueFamilyProperties) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pQueueFamilyPropertyCount, (VkQueueFamilyProperties*) pQueueFamilyProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceMemoryProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pMemoryProperties) {
	((PFN_vkGetPhysicalDeviceMemoryProperties) address) ((VkPhysicalDevice) physicalDevice, (VkPhysicalDeviceMemoryProperties*) pMemoryProperties);
}

JNIEXPORT jlong JNICALL Java_kvb_vulkan_command_Commands_getDeviceProcAddr(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pName) {
	return (jlong) ((PFN_vkGetDeviceProcAddr) address) ((VkDevice) device, (const char*) pName);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createDevice(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pCreateInfo, jlong pAllocator, jlong pDevice) {
	return (jint) ((PFN_vkCreateDevice) address) ((VkPhysicalDevice) physicalDevice, (const VkDeviceCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkDevice*) pDevice);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyDevice(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAllocator) {
	((PFN_vkDestroyDevice) address) ((VkDevice) device, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_enumerateInstanceExtensionProperties(JNIEnv* env, jobject obj, jlong address, jlong pLayerName, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkEnumerateInstanceExtensionProperties) address) ((const char*) pLayerName, (uint32_t*) pPropertyCount, (VkExtensionProperties*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_enumerateDeviceExtensionProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pLayerName, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkEnumerateDeviceExtensionProperties) address) ((VkPhysicalDevice) physicalDevice, (const char*) pLayerName, (uint32_t*) pPropertyCount, (VkExtensionProperties*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_enumerateInstanceLayerProperties(JNIEnv* env, jobject obj, jlong address, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkEnumerateInstanceLayerProperties) address) ((uint32_t*) pPropertyCount, (VkLayerProperties*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_enumerateDeviceLayerProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkEnumerateDeviceLayerProperties) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pPropertyCount, (VkLayerProperties*) pProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getDeviceQueue(JNIEnv* env, jobject obj, jlong address, jlong device, jint queueFamilyIndex, jint queueIndex, jlong pQueue) {
	((PFN_vkGetDeviceQueue) address) ((VkDevice) device, (uint32_t) queueFamilyIndex, (uint32_t) queueIndex, (VkQueue*) pQueue);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_queueSubmit(JNIEnv* env, jobject obj, jlong address, jlong queue, jint submitCount, jlong pSubmits, jlong fence) {
	return (jint) ((PFN_vkQueueSubmit) address) ((VkQueue) queue, (uint32_t) submitCount, (const VkSubmitInfo*) pSubmits, (VkFence) fence);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_queueWaitIdle(JNIEnv* env, jobject obj, jlong address, jlong queue) {
	return (jint) ((PFN_vkQueueWaitIdle) address) ((VkQueue) queue);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_deviceWaitIdle(JNIEnv* env, jobject obj, jlong address, jlong device) {
	return (jint) ((PFN_vkDeviceWaitIdle) address) ((VkDevice) device);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_allocateMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAllocateInfo, jlong pAllocator, jlong pMemory) {
	return (jint) ((PFN_vkAllocateMemory) address) ((VkDevice) device, (const VkMemoryAllocateInfo*) pAllocateInfo, (const VkAllocationCallbacks*) pAllocator, (VkDeviceMemory*) pMemory);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_freeMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong memory, jlong pAllocator) {
	((PFN_vkFreeMemory) address) ((VkDevice) device, (VkDeviceMemory) memory, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_mapMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong memory, jlong offset, jlong size, jint flags, jlong ppData) {
	return (jint) ((PFN_vkMapMemory) address) ((VkDevice) device, (VkDeviceMemory) memory, (VkDeviceSize) offset, (VkDeviceSize) size, (VkMemoryMapFlags) flags, (void**) ppData);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_unmapMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong memory) {
	((PFN_vkUnmapMemory) address) ((VkDevice) device, (VkDeviceMemory) memory);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_flushMappedMemoryRanges(JNIEnv* env, jobject obj, jlong address, jlong device, jint memoryRangeCount, jlong pMemoryRanges) {
	return (jint) ((PFN_vkFlushMappedMemoryRanges) address) ((VkDevice) device, (uint32_t) memoryRangeCount, (const VkMappedMemoryRange*) pMemoryRanges);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_invalidateMappedMemoryRanges(JNIEnv* env, jobject obj, jlong address, jlong device, jint memoryRangeCount, jlong pMemoryRanges) {
	return (jint) ((PFN_vkInvalidateMappedMemoryRanges) address) ((VkDevice) device, (uint32_t) memoryRangeCount, (const VkMappedMemoryRange*) pMemoryRanges);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getDeviceMemoryCommitment(JNIEnv* env, jobject obj, jlong address, jlong device, jlong memory, jlong pCommittedMemoryInBytes) {
	((PFN_vkGetDeviceMemoryCommitment) address) ((VkDevice) device, (VkDeviceMemory) memory, (VkDeviceSize*) pCommittedMemoryInBytes);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_bindBufferMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong buffer, jlong memory, jlong memoryOffset) {
	return (jint) ((PFN_vkBindBufferMemory) address) ((VkDevice) device, (VkBuffer) buffer, (VkDeviceMemory) memory, (VkDeviceSize) memoryOffset);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_bindImageMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong image, jlong memory, jlong memoryOffset) {
	return (jint) ((PFN_vkBindImageMemory) address) ((VkDevice) device, (VkImage) image, (VkDeviceMemory) memory, (VkDeviceSize) memoryOffset);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getBufferMemoryRequirements(JNIEnv* env, jobject obj, jlong address, jlong device, jlong buffer, jlong pMemoryRequirements) {
	((PFN_vkGetBufferMemoryRequirements) address) ((VkDevice) device, (VkBuffer) buffer, (VkMemoryRequirements*) pMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getImageMemoryRequirements(JNIEnv* env, jobject obj, jlong address, jlong device, jlong image, jlong pMemoryRequirements) {
	((PFN_vkGetImageMemoryRequirements) address) ((VkDevice) device, (VkImage) image, (VkMemoryRequirements*) pMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getImageSparseMemoryRequirements(JNIEnv* env, jobject obj, jlong address, jlong device, jlong image, jlong pSparseMemoryRequirementCount, jlong pSparseMemoryRequirements) {
	((PFN_vkGetImageSparseMemoryRequirements) address) ((VkDevice) device, (VkImage) image, (uint32_t*) pSparseMemoryRequirementCount, (VkSparseImageMemoryRequirements*) pSparseMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceSparseImageFormatProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint format, jint type, jint samples, jint usage, jint tiling, jlong pPropertyCount, jlong pProperties) {
	((PFN_vkGetPhysicalDeviceSparseImageFormatProperties) address) ((VkPhysicalDevice) physicalDevice, (VkFormat) format, (VkImageType) type, (VkSampleCountFlagBits) samples, (VkImageUsageFlags) usage, (VkImageTiling) tiling, (uint32_t*) pPropertyCount, (VkSparseImageFormatProperties*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_queueBindSparse(JNIEnv* env, jobject obj, jlong address, jlong queue, jint bindInfoCount, jlong pBindInfo, jlong fence) {
	return (jint) ((PFN_vkQueueBindSparse) address) ((VkQueue) queue, (uint32_t) bindInfoCount, (const VkBindSparseInfo*) pBindInfo, (VkFence) fence);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createFence(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pFence) {
	return (jint) ((PFN_vkCreateFence) address) ((VkDevice) device, (const VkFenceCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkFence*) pFence);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyFence(JNIEnv* env, jobject obj, jlong address, jlong device, jlong fence, jlong pAllocator) {
	((PFN_vkDestroyFence) address) ((VkDevice) device, (VkFence) fence, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_resetFences(JNIEnv* env, jobject obj, jlong address, jlong device, jint fenceCount, jlong pFences) {
	return (jint) ((PFN_vkResetFences) address) ((VkDevice) device, (uint32_t) fenceCount, (const VkFence*) pFences);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getFenceStatus(JNIEnv* env, jobject obj, jlong address, jlong device, jlong fence) {
	return (jint) ((PFN_vkGetFenceStatus) address) ((VkDevice) device, (VkFence) fence);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_waitForFences(JNIEnv* env, jobject obj, jlong address, jlong device, jint fenceCount, jlong pFences, jint waitAll, jlong timeout) {
	return (jint) ((PFN_vkWaitForFences) address) ((VkDevice) device, (uint32_t) fenceCount, (const VkFence*) pFences, (VkBool32) waitAll, (uint64_t) timeout);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createSemaphore(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSemaphore) {
	return (jint) ((PFN_vkCreateSemaphore) address) ((VkDevice) device, (const VkSemaphoreCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSemaphore*) pSemaphore);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroySemaphore(JNIEnv* env, jobject obj, jlong address, jlong device, jlong semaphore, jlong pAllocator) {
	((PFN_vkDestroySemaphore) address) ((VkDevice) device, (VkSemaphore) semaphore, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createEvent(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pEvent) {
	return (jint) ((PFN_vkCreateEvent) address) ((VkDevice) device, (const VkEventCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkEvent*) pEvent);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyEvent(JNIEnv* env, jobject obj, jlong address, jlong device, jlong event, jlong pAllocator) {
	((PFN_vkDestroyEvent) address) ((VkDevice) device, (VkEvent) event, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getEventStatus(JNIEnv* env, jobject obj, jlong address, jlong device, jlong event) {
	return (jint) ((PFN_vkGetEventStatus) address) ((VkDevice) device, (VkEvent) event);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_setEvent(JNIEnv* env, jobject obj, jlong address, jlong device, jlong event) {
	return (jint) ((PFN_vkSetEvent) address) ((VkDevice) device, (VkEvent) event);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_resetEvent(JNIEnv* env, jobject obj, jlong address, jlong device, jlong event) {
	return (jint) ((PFN_vkResetEvent) address) ((VkDevice) device, (VkEvent) event);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createQueryPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pQueryPool) {
	return (jint) ((PFN_vkCreateQueryPool) address) ((VkDevice) device, (const VkQueryPoolCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkQueryPool*) pQueryPool);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyQueryPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong queryPool, jlong pAllocator) {
	((PFN_vkDestroyQueryPool) address) ((VkDevice) device, (VkQueryPool) queryPool, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getQueryPoolResults(JNIEnv* env, jobject obj, jlong address, jlong device, jlong queryPool, jint firstQuery, jint queryCount, jlong dataSize, jlong pData, jlong stride, jint flags) {
	return (jint) ((PFN_vkGetQueryPoolResults) address) ((VkDevice) device, (VkQueryPool) queryPool, (uint32_t) firstQuery, (uint32_t) queryCount, (size_t) dataSize, (void*) pData, (VkDeviceSize) stride, (VkQueryResultFlags) flags);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createBuffer(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pBuffer) {
	return (jint) ((PFN_vkCreateBuffer) address) ((VkDevice) device, (const VkBufferCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkBuffer*) pBuffer);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyBuffer(JNIEnv* env, jobject obj, jlong address, jlong device, jlong buffer, jlong pAllocator) {
	((PFN_vkDestroyBuffer) address) ((VkDevice) device, (VkBuffer) buffer, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createBufferView(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pView) {
	return (jint) ((PFN_vkCreateBufferView) address) ((VkDevice) device, (const VkBufferViewCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkBufferView*) pView);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyBufferView(JNIEnv* env, jobject obj, jlong address, jlong device, jlong bufferView, jlong pAllocator) {
	((PFN_vkDestroyBufferView) address) ((VkDevice) device, (VkBufferView) bufferView, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createImage(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pImage) {
	return (jint) ((PFN_vkCreateImage) address) ((VkDevice) device, (const VkImageCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkImage*) pImage);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyImage(JNIEnv* env, jobject obj, jlong address, jlong device, jlong image, jlong pAllocator) {
	((PFN_vkDestroyImage) address) ((VkDevice) device, (VkImage) image, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getImageSubresourceLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong image, jlong pSubresource, jlong pLayout) {
	((PFN_vkGetImageSubresourceLayout) address) ((VkDevice) device, (VkImage) image, (const VkImageSubresource*) pSubresource, (VkSubresourceLayout*) pLayout);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createImageView(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pView) {
	return (jint) ((PFN_vkCreateImageView) address) ((VkDevice) device, (const VkImageViewCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkImageView*) pView);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyImageView(JNIEnv* env, jobject obj, jlong address, jlong device, jlong imageView, jlong pAllocator) {
	((PFN_vkDestroyImageView) address) ((VkDevice) device, (VkImageView) imageView, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createShaderModule(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pShaderModule) {
	return (jint) ((PFN_vkCreateShaderModule) address) ((VkDevice) device, (const VkShaderModuleCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkShaderModule*) pShaderModule);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyShaderModule(JNIEnv* env, jobject obj, jlong address, jlong device, jlong shaderModule, jlong pAllocator) {
	((PFN_vkDestroyShaderModule) address) ((VkDevice) device, (VkShaderModule) shaderModule, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createPipelineCache(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pPipelineCache) {
	return (jint) ((PFN_vkCreatePipelineCache) address) ((VkDevice) device, (const VkPipelineCacheCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkPipelineCache*) pPipelineCache);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyPipelineCache(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipelineCache, jlong pAllocator) {
	((PFN_vkDestroyPipelineCache) address) ((VkDevice) device, (VkPipelineCache) pipelineCache, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPipelineCacheData(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipelineCache, jlong pDataSize, jlong pData) {
	return (jint) ((PFN_vkGetPipelineCacheData) address) ((VkDevice) device, (VkPipelineCache) pipelineCache, (size_t*) pDataSize, (void*) pData);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_mergePipelineCaches(JNIEnv* env, jobject obj, jlong address, jlong device, jlong dstCache, jint srcCacheCount, jlong pSrcCaches) {
	return (jint) ((PFN_vkMergePipelineCaches) address) ((VkDevice) device, (VkPipelineCache) dstCache, (uint32_t) srcCacheCount, (const VkPipelineCache*) pSrcCaches);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createGraphicsPipelines(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipelineCache, jint createInfoCount, jlong pCreateInfos, jlong pAllocator, jlong pPipelines) {
	return (jint) ((PFN_vkCreateGraphicsPipelines) address) ((VkDevice) device, (VkPipelineCache) pipelineCache, (uint32_t) createInfoCount, (const VkGraphicsPipelineCreateInfo*) pCreateInfos, (const VkAllocationCallbacks*) pAllocator, (VkPipeline*) pPipelines);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createComputePipelines(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipelineCache, jint createInfoCount, jlong pCreateInfos, jlong pAllocator, jlong pPipelines) {
	return (jint) ((PFN_vkCreateComputePipelines) address) ((VkDevice) device, (VkPipelineCache) pipelineCache, (uint32_t) createInfoCount, (const VkComputePipelineCreateInfo*) pCreateInfos, (const VkAllocationCallbacks*) pAllocator, (VkPipeline*) pPipelines);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyPipeline(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipeline, jlong pAllocator) {
	((PFN_vkDestroyPipeline) address) ((VkDevice) device, (VkPipeline) pipeline, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createPipelineLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pPipelineLayout) {
	return (jint) ((PFN_vkCreatePipelineLayout) address) ((VkDevice) device, (const VkPipelineLayoutCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkPipelineLayout*) pPipelineLayout);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyPipelineLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipelineLayout, jlong pAllocator) {
	((PFN_vkDestroyPipelineLayout) address) ((VkDevice) device, (VkPipelineLayout) pipelineLayout, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createSampler(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSampler) {
	return (jint) ((PFN_vkCreateSampler) address) ((VkDevice) device, (const VkSamplerCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSampler*) pSampler);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroySampler(JNIEnv* env, jobject obj, jlong address, jlong device, jlong sampler, jlong pAllocator) {
	((PFN_vkDestroySampler) address) ((VkDevice) device, (VkSampler) sampler, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createDescriptorSetLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSetLayout) {
	return (jint) ((PFN_vkCreateDescriptorSetLayout) address) ((VkDevice) device, (const VkDescriptorSetLayoutCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkDescriptorSetLayout*) pSetLayout);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyDescriptorSetLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorSetLayout, jlong pAllocator) {
	((PFN_vkDestroyDescriptorSetLayout) address) ((VkDevice) device, (VkDescriptorSetLayout) descriptorSetLayout, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createDescriptorPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pDescriptorPool) {
	return (jint) ((PFN_vkCreateDescriptorPool) address) ((VkDevice) device, (const VkDescriptorPoolCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkDescriptorPool*) pDescriptorPool);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyDescriptorPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorPool, jlong pAllocator) {
	((PFN_vkDestroyDescriptorPool) address) ((VkDevice) device, (VkDescriptorPool) descriptorPool, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_resetDescriptorPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorPool, jint flags) {
	return (jint) ((PFN_vkResetDescriptorPool) address) ((VkDevice) device, (VkDescriptorPool) descriptorPool, (VkDescriptorPoolResetFlags) flags);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_allocateDescriptorSets(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAllocateInfo, jlong pDescriptorSets) {
	return (jint) ((PFN_vkAllocateDescriptorSets) address) ((VkDevice) device, (const VkDescriptorSetAllocateInfo*) pAllocateInfo, (VkDescriptorSet*) pDescriptorSets);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_freeDescriptorSets(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorPool, jint descriptorSetCount, jlong pDescriptorSets) {
	return (jint) ((PFN_vkFreeDescriptorSets) address) ((VkDevice) device, (VkDescriptorPool) descriptorPool, (uint32_t) descriptorSetCount, (const VkDescriptorSet*) pDescriptorSets);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_updateDescriptorSets(JNIEnv* env, jobject obj, jlong address, jlong device, jint descriptorWriteCount, jlong pDescriptorWrites, jint descriptorCopyCount, jlong pDescriptorCopies) {
	((PFN_vkUpdateDescriptorSets) address) ((VkDevice) device, (uint32_t) descriptorWriteCount, (const VkWriteDescriptorSet*) pDescriptorWrites, (uint32_t) descriptorCopyCount, (const VkCopyDescriptorSet*) pDescriptorCopies);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createFramebuffer(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pFramebuffer) {
	return (jint) ((PFN_vkCreateFramebuffer) address) ((VkDevice) device, (const VkFramebufferCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkFramebuffer*) pFramebuffer);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyFramebuffer(JNIEnv* env, jobject obj, jlong address, jlong device, jlong framebuffer, jlong pAllocator) {
	((PFN_vkDestroyFramebuffer) address) ((VkDevice) device, (VkFramebuffer) framebuffer, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createRenderPass(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pRenderPass) {
	return (jint) ((PFN_vkCreateRenderPass) address) ((VkDevice) device, (const VkRenderPassCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkRenderPass*) pRenderPass);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyRenderPass(JNIEnv* env, jobject obj, jlong address, jlong device, jlong renderPass, jlong pAllocator) {
	((PFN_vkDestroyRenderPass) address) ((VkDevice) device, (VkRenderPass) renderPass, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getRenderAreaGranularity(JNIEnv* env, jobject obj, jlong address, jlong device, jlong renderPass, jlong pGranularity) {
	((PFN_vkGetRenderAreaGranularity) address) ((VkDevice) device, (VkRenderPass) renderPass, (VkExtent2D*) pGranularity);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createCommandPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pCommandPool) {
	return (jint) ((PFN_vkCreateCommandPool) address) ((VkDevice) device, (const VkCommandPoolCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkCommandPool*) pCommandPool);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyCommandPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong commandPool, jlong pAllocator) {
	((PFN_vkDestroyCommandPool) address) ((VkDevice) device, (VkCommandPool) commandPool, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_resetCommandPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong commandPool, jint flags) {
	return (jint) ((PFN_vkResetCommandPool) address) ((VkDevice) device, (VkCommandPool) commandPool, (VkCommandPoolResetFlags) flags);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_allocateCommandBuffers(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAllocateInfo, jlong pCommandBuffers) {
	return (jint) ((PFN_vkAllocateCommandBuffers) address) ((VkDevice) device, (const VkCommandBufferAllocateInfo*) pAllocateInfo, (VkCommandBuffer*) pCommandBuffers);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_freeCommandBuffers(JNIEnv* env, jobject obj, jlong address, jlong device, jlong commandPool, jint commandBufferCount, jlong pCommandBuffers) {
	((PFN_vkFreeCommandBuffers) address) ((VkDevice) device, (VkCommandPool) commandPool, (uint32_t) commandBufferCount, (const VkCommandBuffer*) pCommandBuffers);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_beginCommandBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pBeginInfo) {
	return (jint) ((PFN_vkBeginCommandBuffer) address) ((VkCommandBuffer) commandBuffer, (const VkCommandBufferBeginInfo*) pBeginInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_endCommandBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer) {
	return (jint) ((PFN_vkEndCommandBuffer) address) ((VkCommandBuffer) commandBuffer);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_resetCommandBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint flags) {
	return (jint) ((PFN_vkResetCommandBuffer) address) ((VkCommandBuffer) commandBuffer, (VkCommandBufferResetFlags) flags);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBindPipeline(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint pipelineBindPoint, jlong pipeline) {
	((PFN_vkCmdBindPipeline) address) ((VkCommandBuffer) commandBuffer, (VkPipelineBindPoint) pipelineBindPoint, (VkPipeline) pipeline);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetViewport(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstViewport, jint viewportCount, jlong pViewports) {
	((PFN_vkCmdSetViewport) address) ((VkCommandBuffer) commandBuffer, (uint32_t) firstViewport, (uint32_t) viewportCount, (const VkViewport*) pViewports);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetScissor(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstScissor, jint scissorCount, jlong pScissors) {
	((PFN_vkCmdSetScissor) address) ((VkCommandBuffer) commandBuffer, (uint32_t) firstScissor, (uint32_t) scissorCount, (const VkRect2D*) pScissors);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetLineWidth(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jfloat lineWidth) {
	((PFN_vkCmdSetLineWidth) address) ((VkCommandBuffer) commandBuffer, (float) lineWidth);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetDepthBias(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jfloat depthBiasConstantFactor, jfloat depthBiasClamp, jfloat depthBiasSlopeFactor) {
	((PFN_vkCmdSetDepthBias) address) ((VkCommandBuffer) commandBuffer, (float) depthBiasConstantFactor, (float) depthBiasClamp, (float) depthBiasSlopeFactor);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetBlendConstants(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong blendConstants) {
	((PFN_vkCmdSetBlendConstants) address) ((VkCommandBuffer) commandBuffer, (float*) blendConstants);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetDepthBounds(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jfloat minDepthBounds, jfloat maxDepthBounds) {
	((PFN_vkCmdSetDepthBounds) address) ((VkCommandBuffer) commandBuffer, (float) minDepthBounds, (float) maxDepthBounds);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetStencilCompareMask(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint faceMask, jint compareMask) {
	((PFN_vkCmdSetStencilCompareMask) address) ((VkCommandBuffer) commandBuffer, (VkStencilFaceFlags) faceMask, (uint32_t) compareMask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetStencilWriteMask(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint faceMask, jint writeMask) {
	((PFN_vkCmdSetStencilWriteMask) address) ((VkCommandBuffer) commandBuffer, (VkStencilFaceFlags) faceMask, (uint32_t) writeMask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetStencilReference(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint faceMask, jint reference) {
	((PFN_vkCmdSetStencilReference) address) ((VkCommandBuffer) commandBuffer, (VkStencilFaceFlags) faceMask, (uint32_t) reference);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBindDescriptorSets(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint pipelineBindPoint, jlong layout, jint firstSet, jint descriptorSetCount, jlong pDescriptorSets, jint dynamicOffsetCount, jlong pDynamicOffsets) {
	((PFN_vkCmdBindDescriptorSets) address) ((VkCommandBuffer) commandBuffer, (VkPipelineBindPoint) pipelineBindPoint, (VkPipelineLayout) layout, (uint32_t) firstSet, (uint32_t) descriptorSetCount, (const VkDescriptorSet*) pDescriptorSets, (uint32_t) dynamicOffsetCount, (const uint32_t*) pDynamicOffsets);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBindIndexBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jint indexType) {
	((PFN_vkCmdBindIndexBuffer) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) buffer, (VkDeviceSize) offset, (VkIndexType) indexType);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBindVertexBuffers(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstBinding, jint bindingCount, jlong pBuffers, jlong pOffsets) {
	((PFN_vkCmdBindVertexBuffers) address) ((VkCommandBuffer) commandBuffer, (uint32_t) firstBinding, (uint32_t) bindingCount, (const VkBuffer*) pBuffers, (const VkDeviceSize*) pOffsets);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDraw(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint vertexCount, jint instanceCount, jint firstVertex, jint firstInstance) {
	((PFN_vkCmdDraw) address) ((VkCommandBuffer) commandBuffer, (uint32_t) vertexCount, (uint32_t) instanceCount, (uint32_t) firstVertex, (uint32_t) firstInstance);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDrawIndexed(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint indexCount, jint instanceCount, jint firstIndex, jint vertexOffset, jint firstInstance) {
	((PFN_vkCmdDrawIndexed) address) ((VkCommandBuffer) commandBuffer, (uint32_t) indexCount, (uint32_t) instanceCount, (uint32_t) firstIndex, (int32_t) vertexOffset, (uint32_t) firstInstance);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDrawIndirect(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jint drawCount, jint stride) {
	((PFN_vkCmdDrawIndirect) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) buffer, (VkDeviceSize) offset, (uint32_t) drawCount, (uint32_t) stride);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDrawIndexedIndirect(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jint drawCount, jint stride) {
	((PFN_vkCmdDrawIndexedIndirect) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) buffer, (VkDeviceSize) offset, (uint32_t) drawCount, (uint32_t) stride);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDispatch(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint groupCountX, jint groupCountY, jint groupCountZ) {
	((PFN_vkCmdDispatch) address) ((VkCommandBuffer) commandBuffer, (uint32_t) groupCountX, (uint32_t) groupCountY, (uint32_t) groupCountZ);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDispatchIndirect(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset) {
	((PFN_vkCmdDispatchIndirect) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) buffer, (VkDeviceSize) offset);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcBuffer, jlong dstBuffer, jint regionCount, jlong pRegions) {
	((PFN_vkCmdCopyBuffer) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) srcBuffer, (VkBuffer) dstBuffer, (uint32_t) regionCount, (const VkBufferCopy*) pRegions);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions) {
	((PFN_vkCmdCopyImage) address) ((VkCommandBuffer) commandBuffer, (VkImage) srcImage, (VkImageLayout) srcImageLayout, (VkImage) dstImage, (VkImageLayout) dstImageLayout, (uint32_t) regionCount, (const VkImageCopy*) pRegions);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBlitImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions, jint filter) {
	((PFN_vkCmdBlitImage) address) ((VkCommandBuffer) commandBuffer, (VkImage) srcImage, (VkImageLayout) srcImageLayout, (VkImage) dstImage, (VkImageLayout) dstImageLayout, (uint32_t) regionCount, (const VkImageBlit*) pRegions, (VkFilter) filter);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyBufferToImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcBuffer, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions) {
	((PFN_vkCmdCopyBufferToImage) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) srcBuffer, (VkImage) dstImage, (VkImageLayout) dstImageLayout, (uint32_t) regionCount, (const VkBufferImageCopy*) pRegions);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyImageToBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstBuffer, jint regionCount, jlong pRegions) {
	((PFN_vkCmdCopyImageToBuffer) address) ((VkCommandBuffer) commandBuffer, (VkImage) srcImage, (VkImageLayout) srcImageLayout, (VkBuffer) dstBuffer, (uint32_t) regionCount, (const VkBufferImageCopy*) pRegions);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdUpdateBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong dstBuffer, jlong dstOffset, jlong dataSize, jlong pData) {
	((PFN_vkCmdUpdateBuffer) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) dstBuffer, (VkDeviceSize) dstOffset, (VkDeviceSize) dataSize, (const void*) pData);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdFillBuffer(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong dstBuffer, jlong dstOffset, jlong size, jint data) {
	((PFN_vkCmdFillBuffer) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) dstBuffer, (VkDeviceSize) dstOffset, (VkDeviceSize) size, (uint32_t) data);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdClearColorImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong image, jint imageLayout, jlong pColor, jint rangeCount, jlong pRanges) {
	((PFN_vkCmdClearColorImage) address) ((VkCommandBuffer) commandBuffer, (VkImage) image, (VkImageLayout) imageLayout, (const VkClearColorValue*) pColor, (uint32_t) rangeCount, (const VkImageSubresourceRange*) pRanges);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdClearDepthStencilImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong image, jint imageLayout, jlong pDepthStencil, jint rangeCount, jlong pRanges) {
	((PFN_vkCmdClearDepthStencilImage) address) ((VkCommandBuffer) commandBuffer, (VkImage) image, (VkImageLayout) imageLayout, (const VkClearDepthStencilValue*) pDepthStencil, (uint32_t) rangeCount, (const VkImageSubresourceRange*) pRanges);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdClearAttachments(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint attachmentCount, jlong pAttachments, jint rectCount, jlong pRects) {
	((PFN_vkCmdClearAttachments) address) ((VkCommandBuffer) commandBuffer, (uint32_t) attachmentCount, (const VkClearAttachment*) pAttachments, (uint32_t) rectCount, (const VkClearRect*) pRects);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdResolveImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions) {
	((PFN_vkCmdResolveImage) address) ((VkCommandBuffer) commandBuffer, (VkImage) srcImage, (VkImageLayout) srcImageLayout, (VkImage) dstImage, (VkImageLayout) dstImageLayout, (uint32_t) regionCount, (const VkImageResolve*) pRegions);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetEvent(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong event, jint stageMask) {
	((PFN_vkCmdSetEvent) address) ((VkCommandBuffer) commandBuffer, (VkEvent) event, (VkPipelineStageFlags) stageMask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdResetEvent(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong event, jint stageMask) {
	((PFN_vkCmdResetEvent) address) ((VkCommandBuffer) commandBuffer, (VkEvent) event, (VkPipelineStageFlags) stageMask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdWaitEvents(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint eventCount, jlong pEvents, jint srcStageMask, jint dstStageMask, jint memoryBarrierCount, jlong pMemoryBarriers, jint bufferMemoryBarrierCount, jlong pBufferMemoryBarriers, jint imageMemoryBarrierCount, jlong pImageMemoryBarriers) {
	((PFN_vkCmdWaitEvents) address) ((VkCommandBuffer) commandBuffer, (uint32_t) eventCount, (const VkEvent*) pEvents, (VkPipelineStageFlags) srcStageMask, (VkPipelineStageFlags) dstStageMask, (uint32_t) memoryBarrierCount, (const VkMemoryBarrier*) pMemoryBarriers, (uint32_t) bufferMemoryBarrierCount, (const VkBufferMemoryBarrier*) pBufferMemoryBarriers, (uint32_t) imageMemoryBarrierCount, (const VkImageMemoryBarrier*) pImageMemoryBarriers);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdPipelineBarrier(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint srcStageMask, jint dstStageMask, jint dependencyFlags, jint memoryBarrierCount, jlong pMemoryBarriers, jint bufferMemoryBarrierCount, jlong pBufferMemoryBarriers, jint imageMemoryBarrierCount, jlong pImageMemoryBarriers) {
	((PFN_vkCmdPipelineBarrier) address) ((VkCommandBuffer) commandBuffer, (VkPipelineStageFlags) srcStageMask, (VkPipelineStageFlags) dstStageMask, (VkDependencyFlags) dependencyFlags, (uint32_t) memoryBarrierCount, (const VkMemoryBarrier*) pMemoryBarriers, (uint32_t) bufferMemoryBarrierCount, (const VkBufferMemoryBarrier*) pBufferMemoryBarriers, (uint32_t) imageMemoryBarrierCount, (const VkImageMemoryBarrier*) pImageMemoryBarriers);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBeginQuery(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong queryPool, jint query, jint flags) {
	((PFN_vkCmdBeginQuery) address) ((VkCommandBuffer) commandBuffer, (VkQueryPool) queryPool, (uint32_t) query, (VkQueryControlFlags) flags);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdEndQuery(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong queryPool, jint query) {
	((PFN_vkCmdEndQuery) address) ((VkCommandBuffer) commandBuffer, (VkQueryPool) queryPool, (uint32_t) query);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdResetQueryPool(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong queryPool, jint firstQuery, jint queryCount) {
	((PFN_vkCmdResetQueryPool) address) ((VkCommandBuffer) commandBuffer, (VkQueryPool) queryPool, (uint32_t) firstQuery, (uint32_t) queryCount);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdWriteTimestamp(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint pipelineStage, jlong queryPool, jint query) {
	((PFN_vkCmdWriteTimestamp) address) ((VkCommandBuffer) commandBuffer, (VkPipelineStageFlagBits) pipelineStage, (VkQueryPool) queryPool, (uint32_t) query);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyQueryPoolResults(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong queryPool, jint firstQuery, jint queryCount, jlong dstBuffer, jlong dstOffset, jlong stride, jint flags) {
	((PFN_vkCmdCopyQueryPoolResults) address) ((VkCommandBuffer) commandBuffer, (VkQueryPool) queryPool, (uint32_t) firstQuery, (uint32_t) queryCount, (VkBuffer) dstBuffer, (VkDeviceSize) dstOffset, (VkDeviceSize) stride, (VkQueryResultFlags) flags);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdPushConstants(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong layout, jint stageFlags, jint offset, jint size, jlong pValues) {
	((PFN_vkCmdPushConstants) address) ((VkCommandBuffer) commandBuffer, (VkPipelineLayout) layout, (VkShaderStageFlags) stageFlags, (uint32_t) offset, (uint32_t) size, (const void*) pValues);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBeginRenderPass(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pRenderPassBegin, jint contents) {
	((PFN_vkCmdBeginRenderPass) address) ((VkCommandBuffer) commandBuffer, (const VkRenderPassBeginInfo*) pRenderPassBegin, (VkSubpassContents) contents);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdNextSubpass(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint contents) {
	((PFN_vkCmdNextSubpass) address) ((VkCommandBuffer) commandBuffer, (VkSubpassContents) contents);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdEndRenderPass(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer) {
	((PFN_vkCmdEndRenderPass) address) ((VkCommandBuffer) commandBuffer);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdExecuteCommands(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint commandBufferCount, jlong pCommandBuffers) {
	((PFN_vkCmdExecuteCommands) address) ((VkCommandBuffer) commandBuffer, (uint32_t) commandBufferCount, (const VkCommandBuffer*) pCommandBuffers);
}



// Provided by VK_VERSION_1_1



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_enumerateInstanceVersion(JNIEnv* env, jobject obj, jlong address, jlong pApiVersion) {
	return (jint) ((PFN_vkEnumerateInstanceVersion) address) ((uint32_t*) pApiVersion);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_bindBufferMemory2(JNIEnv* env, jobject obj, jlong address, jlong device, jint bindInfoCount, jlong pBindInfos) {
	return (jint) ((PFN_vkBindBufferMemory2) address) ((VkDevice) device, (uint32_t) bindInfoCount, (const VkBindBufferMemoryInfo*) pBindInfos);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_bindImageMemory2(JNIEnv* env, jobject obj, jlong address, jlong device, jint bindInfoCount, jlong pBindInfos) {
	return (jint) ((PFN_vkBindImageMemory2) address) ((VkDevice) device, (uint32_t) bindInfoCount, (const VkBindImageMemoryInfo*) pBindInfos);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getDeviceGroupPeerMemoryFeatures(JNIEnv* env, jobject obj, jlong address, jlong device, jint heapIndex, jint localDeviceIndex, jint remoteDeviceIndex, jlong pPeerMemoryFeatures) {
	((PFN_vkGetDeviceGroupPeerMemoryFeatures) address) ((VkDevice) device, (uint32_t) heapIndex, (uint32_t) localDeviceIndex, (uint32_t) remoteDeviceIndex, (VkPeerMemoryFeatureFlags*) pPeerMemoryFeatures);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetDeviceMask(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint deviceMask) {
	((PFN_vkCmdSetDeviceMask) address) ((VkCommandBuffer) commandBuffer, (uint32_t) deviceMask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDispatchBase(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint baseGroupX, jint baseGroupY, jint baseGroupZ, jint groupCountX, jint groupCountY, jint groupCountZ) {
	((PFN_vkCmdDispatchBase) address) ((VkCommandBuffer) commandBuffer, (uint32_t) baseGroupX, (uint32_t) baseGroupY, (uint32_t) baseGroupZ, (uint32_t) groupCountX, (uint32_t) groupCountY, (uint32_t) groupCountZ);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_enumeratePhysicalDeviceGroups(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pPhysicalDeviceGroupCount, jlong pPhysicalDeviceGroupProperties) {
	return (jint) ((PFN_vkEnumeratePhysicalDeviceGroups) address) ((VkInstance) instance, (uint32_t*) pPhysicalDeviceGroupCount, (VkPhysicalDeviceGroupProperties*) pPhysicalDeviceGroupProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getImageMemoryRequirements2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo, jlong pMemoryRequirements) {
	((PFN_vkGetImageMemoryRequirements2) address) ((VkDevice) device, (const VkImageMemoryRequirementsInfo2*) pInfo, (VkMemoryRequirements2*) pMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getBufferMemoryRequirements2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo, jlong pMemoryRequirements) {
	((PFN_vkGetBufferMemoryRequirements2) address) ((VkDevice) device, (const VkBufferMemoryRequirementsInfo2*) pInfo, (VkMemoryRequirements2*) pMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getImageSparseMemoryRequirements2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo, jlong pSparseMemoryRequirementCount, jlong pSparseMemoryRequirements) {
	((PFN_vkGetImageSparseMemoryRequirements2) address) ((VkDevice) device, (const VkImageSparseMemoryRequirementsInfo2*) pInfo, (uint32_t*) pSparseMemoryRequirementCount, (VkSparseImageMemoryRequirements2*) pSparseMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceFeatures2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pFeatures) {
	((PFN_vkGetPhysicalDeviceFeatures2) address) ((VkPhysicalDevice) physicalDevice, (VkPhysicalDeviceFeatures2*) pFeatures);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pProperties) {
	((PFN_vkGetPhysicalDeviceProperties2) address) ((VkPhysicalDevice) physicalDevice, (VkPhysicalDeviceProperties2*) pProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceFormatProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint format, jlong pFormatProperties) {
	((PFN_vkGetPhysicalDeviceFormatProperties2) address) ((VkPhysicalDevice) physicalDevice, (VkFormat) format, (VkFormatProperties2*) pFormatProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceImageFormatProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pImageFormatInfo, jlong pImageFormatProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceImageFormatProperties2) address) ((VkPhysicalDevice) physicalDevice, (const VkPhysicalDeviceImageFormatInfo2*) pImageFormatInfo, (VkImageFormatProperties2*) pImageFormatProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceQueueFamilyProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pQueueFamilyPropertyCount, jlong pQueueFamilyProperties) {
	((PFN_vkGetPhysicalDeviceQueueFamilyProperties2) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pQueueFamilyPropertyCount, (VkQueueFamilyProperties2*) pQueueFamilyProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceMemoryProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pMemoryProperties) {
	((PFN_vkGetPhysicalDeviceMemoryProperties2) address) ((VkPhysicalDevice) physicalDevice, (VkPhysicalDeviceMemoryProperties2*) pMemoryProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceSparseImageFormatProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pFormatInfo, jlong pPropertyCount, jlong pProperties) {
	((PFN_vkGetPhysicalDeviceSparseImageFormatProperties2) address) ((VkPhysicalDevice) physicalDevice, (const VkPhysicalDeviceSparseImageFormatInfo2*) pFormatInfo, (uint32_t*) pPropertyCount, (VkSparseImageFormatProperties2*) pProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_trimCommandPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong commandPool, jint flags) {
	((PFN_vkTrimCommandPool) address) ((VkDevice) device, (VkCommandPool) commandPool, (VkCommandPoolTrimFlags) flags);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getDeviceQueue2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pQueueInfo, jlong pQueue) {
	((PFN_vkGetDeviceQueue2) address) ((VkDevice) device, (const VkDeviceQueueInfo2*) pQueueInfo, (VkQueue*) pQueue);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createSamplerYcbcrConversion(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pYcbcrConversion) {
	return (jint) ((PFN_vkCreateSamplerYcbcrConversion) address) ((VkDevice) device, (const VkSamplerYcbcrConversionCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSamplerYcbcrConversion*) pYcbcrConversion);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroySamplerYcbcrConversion(JNIEnv* env, jobject obj, jlong address, jlong device, jlong ycbcrConversion, jlong pAllocator) {
	((PFN_vkDestroySamplerYcbcrConversion) address) ((VkDevice) device, (VkSamplerYcbcrConversion) ycbcrConversion, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createDescriptorUpdateTemplate(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pDescriptorUpdateTemplate) {
	return (jint) ((PFN_vkCreateDescriptorUpdateTemplate) address) ((VkDevice) device, (const VkDescriptorUpdateTemplateCreateInfo*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkDescriptorUpdateTemplate*) pDescriptorUpdateTemplate);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyDescriptorUpdateTemplate(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorUpdateTemplate, jlong pAllocator) {
	((PFN_vkDestroyDescriptorUpdateTemplate) address) ((VkDevice) device, (VkDescriptorUpdateTemplate) descriptorUpdateTemplate, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_updateDescriptorSetWithTemplate(JNIEnv* env, jobject obj, jlong address, jlong device, jlong descriptorSet, jlong descriptorUpdateTemplate, jlong pData) {
	((PFN_vkUpdateDescriptorSetWithTemplate) address) ((VkDevice) device, (VkDescriptorSet) descriptorSet, (VkDescriptorUpdateTemplate) descriptorUpdateTemplate, (const void*) pData);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceExternalBufferProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pExternalBufferInfo, jlong pExternalBufferProperties) {
	((PFN_vkGetPhysicalDeviceExternalBufferProperties) address) ((VkPhysicalDevice) physicalDevice, (const VkPhysicalDeviceExternalBufferInfo*) pExternalBufferInfo, (VkExternalBufferProperties*) pExternalBufferProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceExternalFenceProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pExternalFenceInfo, jlong pExternalFenceProperties) {
	((PFN_vkGetPhysicalDeviceExternalFenceProperties) address) ((VkPhysicalDevice) physicalDevice, (const VkPhysicalDeviceExternalFenceInfo*) pExternalFenceInfo, (VkExternalFenceProperties*) pExternalFenceProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceExternalSemaphoreProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pExternalSemaphoreInfo, jlong pExternalSemaphoreProperties) {
	((PFN_vkGetPhysicalDeviceExternalSemaphoreProperties) address) ((VkPhysicalDevice) physicalDevice, (const VkPhysicalDeviceExternalSemaphoreInfo*) pExternalSemaphoreInfo, (VkExternalSemaphoreProperties*) pExternalSemaphoreProperties);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getDescriptorSetLayoutSupport(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pSupport) {
	((PFN_vkGetDescriptorSetLayoutSupport) address) ((VkDevice) device, (const VkDescriptorSetLayoutCreateInfo*) pCreateInfo, (VkDescriptorSetLayoutSupport*) pSupport);
}



// Provided by VK_VERSION_1_2



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDrawIndirectCount(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jlong countBuffer, jlong countBufferOffset, jint maxDrawCount, jint stride) {
	((PFN_vkCmdDrawIndirectCount) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) buffer, (VkDeviceSize) offset, (VkBuffer) countBuffer, (VkDeviceSize) countBufferOffset, (uint32_t) maxDrawCount, (uint32_t) stride);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDrawIndexedIndirectCount(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jlong countBuffer, jlong countBufferOffset, jint maxDrawCount, jint stride) {
	((PFN_vkCmdDrawIndexedIndirectCount) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) buffer, (VkDeviceSize) offset, (VkBuffer) countBuffer, (VkDeviceSize) countBufferOffset, (uint32_t) maxDrawCount, (uint32_t) stride);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createRenderPass2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pRenderPass) {
	return (jint) ((PFN_vkCreateRenderPass2) address) ((VkDevice) device, (const VkRenderPassCreateInfo2*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkRenderPass*) pRenderPass);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBeginRenderPass2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pRenderPassBegin, jlong pSubpassBeginInfo) {
	((PFN_vkCmdBeginRenderPass2) address) ((VkCommandBuffer) commandBuffer, (const VkRenderPassBeginInfo*) pRenderPassBegin, (const VkSubpassBeginInfo*) pSubpassBeginInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdNextSubpass2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pSubpassBeginInfo, jlong pSubpassEndInfo) {
	((PFN_vkCmdNextSubpass2) address) ((VkCommandBuffer) commandBuffer, (const VkSubpassBeginInfo*) pSubpassBeginInfo, (const VkSubpassEndInfo*) pSubpassEndInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdEndRenderPass2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pSubpassEndInfo) {
	((PFN_vkCmdEndRenderPass2) address) ((VkCommandBuffer) commandBuffer, (const VkSubpassEndInfo*) pSubpassEndInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_resetQueryPool(JNIEnv* env, jobject obj, jlong address, jlong device, jlong queryPool, jint firstQuery, jint queryCount) {
	((PFN_vkResetQueryPool) address) ((VkDevice) device, (VkQueryPool) queryPool, (uint32_t) firstQuery, (uint32_t) queryCount);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getSemaphoreCounterValue(JNIEnv* env, jobject obj, jlong address, jlong device, jlong semaphore, jlong pValue) {
	return (jint) ((PFN_vkGetSemaphoreCounterValue) address) ((VkDevice) device, (VkSemaphore) semaphore, (uint64_t*) pValue);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_waitSemaphores(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pWaitInfo, jlong timeout) {
	return (jint) ((PFN_vkWaitSemaphores) address) ((VkDevice) device, (const VkSemaphoreWaitInfo*) pWaitInfo, (uint64_t) timeout);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_signalSemaphore(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pSignalInfo) {
	return (jint) ((PFN_vkSignalSemaphore) address) ((VkDevice) device, (const VkSemaphoreSignalInfo*) pSignalInfo);
}

JNIEXPORT jlong JNICALL Java_kvb_vulkan_command_Commands_getBufferDeviceAddress(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo) {
	return (jlong) ((PFN_vkGetBufferDeviceAddress) address) ((VkDevice) device, (const VkBufferDeviceAddressInfo*) pInfo);
}

JNIEXPORT jlong JNICALL Java_kvb_vulkan_command_Commands_getBufferOpaqueCaptureAddress(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo) {
	return (jlong) ((PFN_vkGetBufferOpaqueCaptureAddress) address) ((VkDevice) device, (const VkBufferDeviceAddressInfo*) pInfo);
}

JNIEXPORT jlong JNICALL Java_kvb_vulkan_command_Commands_getDeviceMemoryOpaqueCaptureAddress(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo) {
	return (jlong) ((PFN_vkGetDeviceMemoryOpaqueCaptureAddress) address) ((VkDevice) device, (const VkDeviceMemoryOpaqueCaptureAddressInfo*) pInfo);
}



// Provided by VK_KHR_surface



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroySurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong surface, jlong pAllocator) {
	((PFN_vkDestroySurfaceKHR) address) ((VkInstance) instance, (VkSurfaceKHR) surface, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceSurfaceSupport(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint queueFamilyIndex, jlong surface, jlong pSupported) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfaceSupportKHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t) queueFamilyIndex, (VkSurfaceKHR) surface, (VkBool32*) pSupported);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceSurfaceCapabilities(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong surface, jlong pSurfaceCapabilities) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR) address) ((VkPhysicalDevice) physicalDevice, (VkSurfaceKHR) surface, (VkSurfaceCapabilitiesKHR*) pSurfaceCapabilities);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceSurfaceFormats(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong surface, jlong pSurfaceFormatCount, jlong pSurfaceFormats) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfaceFormatsKHR) address) ((VkPhysicalDevice) physicalDevice, (VkSurfaceKHR) surface, (uint32_t*) pSurfaceFormatCount, (VkSurfaceFormatKHR*) pSurfaceFormats);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceSurfacePresentModes(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong surface, jlong pPresentModeCount, jlong pPresentModes) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfacePresentModesKHR) address) ((VkPhysicalDevice) physicalDevice, (VkSurfaceKHR) surface, (uint32_t*) pPresentModeCount, (VkPresentModeKHR*) pPresentModes);
}



// Provided by VK_KHR_swapchain



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createSwapchain(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSwapchain) {
	return (jint) ((PFN_vkCreateSwapchainKHR) address) ((VkDevice) device, (const VkSwapchainCreateInfoKHR*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSwapchainKHR*) pSwapchain);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroySwapchain(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain, jlong pAllocator) {
	((PFN_vkDestroySwapchainKHR) address) ((VkDevice) device, (VkSwapchainKHR) swapchain, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getSwapchainImages(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain, jlong pSwapchainImageCount, jlong pSwapchainImages) {
	return (jint) ((PFN_vkGetSwapchainImagesKHR) address) ((VkDevice) device, (VkSwapchainKHR) swapchain, (uint32_t*) pSwapchainImageCount, (VkImage*) pSwapchainImages);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_acquireNextImage(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain, jlong timeout, jlong semaphore, jlong fence, jlong pImageIndex) {
	return (jint) ((PFN_vkAcquireNextImageKHR) address) ((VkDevice) device, (VkSwapchainKHR) swapchain, (uint64_t) timeout, (VkSemaphore) semaphore, (VkFence) fence, (uint32_t*) pImageIndex);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_queuePresent(JNIEnv* env, jobject obj, jlong address, jlong queue, jlong pPresentInfo) {
	return (jint) ((PFN_vkQueuePresentKHR) address) ((VkQueue) queue, (const VkPresentInfoKHR*) pPresentInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getDeviceGroupPresentCapabilities(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pDeviceGroupPresentCapabilities) {
	return (jint) ((PFN_vkGetDeviceGroupPresentCapabilitiesKHR) address) ((VkDevice) device, (VkDeviceGroupPresentCapabilitiesKHR*) pDeviceGroupPresentCapabilities);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getDeviceGroupSurfacePresentModes(JNIEnv* env, jobject obj, jlong address, jlong device, jlong surface, jlong pModes) {
	return (jint) ((PFN_vkGetDeviceGroupSurfacePresentModesKHR) address) ((VkDevice) device, (VkSurfaceKHR) surface, (VkDeviceGroupPresentModeFlagsKHR*) pModes);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDevicePresentRectangles(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong surface, jlong pRectCount, jlong pRects) {
	return (jint) ((PFN_vkGetPhysicalDevicePresentRectanglesKHR) address) ((VkPhysicalDevice) physicalDevice, (VkSurfaceKHR) surface, (uint32_t*) pRectCount, (VkRect2D*) pRects);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_acquireNextImage2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAcquireInfo, jlong pImageIndex) {
	return (jint) ((PFN_vkAcquireNextImage2KHR) address) ((VkDevice) device, (const VkAcquireNextImageInfoKHR*) pAcquireInfo, (uint32_t*) pImageIndex);
}



// Provided by VK_KHR_display



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceDisplayProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceDisplayPropertiesKHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pPropertyCount, (VkDisplayPropertiesKHR*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceDisplayPlaneProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pPropertyCount, (VkDisplayPlanePropertiesKHR*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getDisplayPlaneSupportedDisplays(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint planeIndex, jlong pDisplayCount, jlong pDisplays) {
	return (jint) ((PFN_vkGetDisplayPlaneSupportedDisplaysKHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t) planeIndex, (uint32_t*) pDisplayCount, (VkDisplayKHR*) pDisplays);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getDisplayModeProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong display, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkGetDisplayModePropertiesKHR) address) ((VkPhysicalDevice) physicalDevice, (VkDisplayKHR) display, (uint32_t*) pPropertyCount, (VkDisplayModePropertiesKHR*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createDisplayMode(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong display, jlong pCreateInfo, jlong pAllocator, jlong pMode) {
	return (jint) ((PFN_vkCreateDisplayModeKHR) address) ((VkPhysicalDevice) physicalDevice, (VkDisplayKHR) display, (const VkDisplayModeCreateInfoKHR*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkDisplayModeKHR*) pMode);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getDisplayPlaneCapabilities(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong mode, jint planeIndex, jlong pCapabilities) {
	return (jint) ((PFN_vkGetDisplayPlaneCapabilitiesKHR) address) ((VkPhysicalDevice) physicalDevice, (VkDisplayModeKHR) mode, (uint32_t) planeIndex, (VkDisplayPlaneCapabilitiesKHR*) pCapabilities);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createDisplayPlaneSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateDisplayPlaneSurfaceKHR) address) ((VkInstance) instance, (const VkDisplaySurfaceCreateInfoKHR*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}



// Provided by VK_KHR_display_swapchain



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createSharedSwapchains(JNIEnv* env, jobject obj, jlong address, jlong device, jint swapchainCount, jlong pCreateInfos, jlong pAllocator, jlong pSwapchains) {
	return (jint) ((PFN_vkCreateSharedSwapchainsKHR) address) ((VkDevice) device, (uint32_t) swapchainCount, (const VkSwapchainCreateInfoKHR*) pCreateInfos, (const VkAllocationCallbacks*) pAllocator, (VkSwapchainKHR*) pSwapchains);
}



// Provided by VK_KHR_xlib_surface



#ifdef VK_USE_PLATFORM_XLIB_KHR

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createXlibSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateXlibSurfaceKHR) address) ((VkInstance) instance, (const VkXlibSurfaceCreateInfoKHR*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceXlibPresentationSupport(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint queueFamilyIndex, jlong dpy, jlong visualID) {
	return (jint) ((PFN_vkGetPhysicalDeviceXlibPresentationSupportKHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t) queueFamilyIndex, (Display*) dpy, (VisualID) visualID);
}

#endif



// Provided by VK_KHR_xcb_surface



#ifdef VK_USE_PLATFORM_XCB_KHR

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createXcbSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateXcbSurfaceKHR) address) ((VkInstance) instance, (const VkXcbSurfaceCreateInfoKHR*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceXcbPresentationSupport(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint queueFamilyIndex, jlong connection, jlong visual_id) {
	return (jint) ((PFN_vkGetPhysicalDeviceXcbPresentationSupportKHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t) queueFamilyIndex, (xcb_connection_t*) connection, (xcb_visualid_t) visual_id);
}

#endif



// Provided by VK_KHR_wayland_surface



#ifdef VK_USE_PLATFORM_WAYLAND_KHR

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createWaylandSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateWaylandSurfaceKHR) address) ((VkInstance) instance, (const VkWaylandSurfaceCreateInfoKHR*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceWaylandPresentationSupport(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint queueFamilyIndex, jlong display) {
	return (jint) ((PFN_vkGetPhysicalDeviceWaylandPresentationSupportKHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t) queueFamilyIndex, (struct wl_display*) display);
}

#endif



// Provided by VK_KHR_android_surface



#ifdef VK_USE_PLATFORM_ANDROID_KHR

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createAndroidSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateAndroidSurfaceKHR) address) ((VkInstance) instance, (const VkAndroidSurfaceCreateInfoKHR*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}

#endif



// Provided by VK_KHR_win32_surface



#ifdef VK_USE_PLATFORM_WIN32_KHR

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createWin32Surface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateWin32SurfaceKHR) address) ((VkInstance) instance, (const VkWin32SurfaceCreateInfoKHR*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceWin32PresentationSupport(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint queueFamilyIndex) {
	return (jint) ((PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t) queueFamilyIndex);
}

#endif



// Provided by VK_EXT_transform_feedback



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBindTransformFeedbackBuffers(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstBinding, jint bindingCount, jlong pBuffers, jlong pOffsets, jlong pSizes) {
	((PFN_vkCmdBindTransformFeedbackBuffersEXT) address) ((VkCommandBuffer) commandBuffer, (uint32_t) firstBinding, (uint32_t) bindingCount, (const VkBuffer*) pBuffers, (const VkDeviceSize*) pOffsets, (const VkDeviceSize*) pSizes);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBeginTransformFeedback(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstCounterBuffer, jint counterBufferCount, jlong pCounterBuffers, jlong pCounterBufferOffsets) {
	((PFN_vkCmdBeginTransformFeedbackEXT) address) ((VkCommandBuffer) commandBuffer, (uint32_t) firstCounterBuffer, (uint32_t) counterBufferCount, (const VkBuffer*) pCounterBuffers, (const VkDeviceSize*) pCounterBufferOffsets);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdEndTransformFeedback(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstCounterBuffer, jint counterBufferCount, jlong pCounterBuffers, jlong pCounterBufferOffsets) {
	((PFN_vkCmdEndTransformFeedbackEXT) address) ((VkCommandBuffer) commandBuffer, (uint32_t) firstCounterBuffer, (uint32_t) counterBufferCount, (const VkBuffer*) pCounterBuffers, (const VkDeviceSize*) pCounterBufferOffsets);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBeginQueryIndexed(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong queryPool, jint query, jint flags, jint index) {
	((PFN_vkCmdBeginQueryIndexedEXT) address) ((VkCommandBuffer) commandBuffer, (VkQueryPool) queryPool, (uint32_t) query, (VkQueryControlFlags) flags, (uint32_t) index);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdEndQueryIndexed(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong queryPool, jint query, jint index) {
	((PFN_vkCmdEndQueryIndexedEXT) address) ((VkCommandBuffer) commandBuffer, (VkQueryPool) queryPool, (uint32_t) query, (uint32_t) index);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDrawIndirectByteCount(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint instanceCount, jint firstInstance, jlong counterBuffer, jlong counterBufferOffset, jint counterOffset, jint vertexStride) {
	((PFN_vkCmdDrawIndirectByteCountEXT) address) ((VkCommandBuffer) commandBuffer, (uint32_t) instanceCount, (uint32_t) firstInstance, (VkBuffer) counterBuffer, (VkDeviceSize) counterBufferOffset, (uint32_t) counterOffset, (uint32_t) vertexStride);
}



// Provided by VK_NVX_image_view_handle



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getImageViewHandle(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo) {
	return (jint) ((PFN_vkGetImageViewHandleNVX) address) ((VkDevice) device, (const VkImageViewHandleInfoNVX*) pInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getImageViewAddress(JNIEnv* env, jobject obj, jlong address, jlong device, jlong imageView, jlong pProperties) {
	return (jint) ((PFN_vkGetImageViewAddressNVX) address) ((VkDevice) device, (VkImageView) imageView, (VkImageViewAddressPropertiesNVX*) pProperties);
}



// Provided by VK_AMD_shader_info



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getShaderInfo(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipeline, jint shaderStage, jint infoType, jlong pInfoSize, jlong pInfo) {
	return (jint) ((PFN_vkGetShaderInfoAMD) address) ((VkDevice) device, (VkPipeline) pipeline, (VkShaderStageFlagBits) shaderStage, (VkShaderInfoTypeAMD) infoType, (size_t*) pInfoSize, (void*) pInfo);
}



// Provided by VK_GGP_stream_descriptor_surface



#ifdef VK_USE_PLATFORM_GGP

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createStreamDescriptorSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateStreamDescriptorSurfaceGGP) address) ((VkInstance) instance, (const VkStreamDescriptorSurfaceCreateInfoGGP*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}

#endif



// Provided by VK_NN_vi_surface



#ifdef VK_USE_PLATFORM_VI_NN

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createViSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateViSurfaceNN) address) ((VkInstance) instance, (const VkViSurfaceCreateInfoNN*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}

#endif



// Provided by VK_KHR_external_memory_win32



#ifdef VK_USE_PLATFORM_WIN32_KHR

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getMemoryWin32Handle(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pGetWin32HandleInfo, jlong pHandle) {
	return (jint) ((PFN_vkGetMemoryWin32HandleKHR) address) ((VkDevice) device, (const VkMemoryGetWin32HandleInfoKHR*) pGetWin32HandleInfo, (HANDLE*) pHandle);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getMemoryWin32HandleProperties(JNIEnv* env, jobject obj, jlong address, jlong device, jint handleType, jlong handle, jlong pMemoryWin32HandleProperties) {
	return (jint) ((PFN_vkGetMemoryWin32HandlePropertiesKHR) address) ((VkDevice) device, (VkExternalMemoryHandleTypeFlagBits) handleType, (HANDLE) handle, (VkMemoryWin32HandlePropertiesKHR*) pMemoryWin32HandleProperties);
}

#endif



// Provided by VK_KHR_external_memory_fd



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getMemoryFd(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pGetFdInfo, jlong pFd) {
	return (jint) ((PFN_vkGetMemoryFdKHR) address) ((VkDevice) device, (const VkMemoryGetFdInfoKHR*) pGetFdInfo, (int*) pFd);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getMemoryFdProperties(JNIEnv* env, jobject obj, jlong address, jlong device, jint handleType, jint fd, jlong pMemoryFdProperties) {
	return (jint) ((PFN_vkGetMemoryFdPropertiesKHR) address) ((VkDevice) device, (VkExternalMemoryHandleTypeFlagBits) handleType, (int) fd, (VkMemoryFdPropertiesKHR*) pMemoryFdProperties);
}



// Provided by VK_KHR_external_semaphore_win32



#ifdef VK_USE_PLATFORM_WIN32_KHR

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_importSemaphoreWin32Handle(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pImportSemaphoreWin32HandleInfo) {
	return (jint) ((PFN_vkImportSemaphoreWin32HandleKHR) address) ((VkDevice) device, (const VkImportSemaphoreWin32HandleInfoKHR*) pImportSemaphoreWin32HandleInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getSemaphoreWin32Handle(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pGetWin32HandleInfo, jlong pHandle) {
	return (jint) ((PFN_vkGetSemaphoreWin32HandleKHR) address) ((VkDevice) device, (const VkSemaphoreGetWin32HandleInfoKHR*) pGetWin32HandleInfo, (HANDLE*) pHandle);
}

#endif



// Provided by VK_KHR_external_semaphore_fd



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_importSemaphoreFd(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pImportSemaphoreFdInfo) {
	return (jint) ((PFN_vkImportSemaphoreFdKHR) address) ((VkDevice) device, (const VkImportSemaphoreFdInfoKHR*) pImportSemaphoreFdInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getSemaphoreFd(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pGetFdInfo, jlong pFd) {
	return (jint) ((PFN_vkGetSemaphoreFdKHR) address) ((VkDevice) device, (const VkSemaphoreGetFdInfoKHR*) pGetFdInfo, (int*) pFd);
}



// Provided by VK_KHR_push_descriptor



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdPushDescriptorSet(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint pipelineBindPoint, jlong layout, jint set, jint descriptorWriteCount, jlong pDescriptorWrites) {
	((PFN_vkCmdPushDescriptorSetKHR) address) ((VkCommandBuffer) commandBuffer, (VkPipelineBindPoint) pipelineBindPoint, (VkPipelineLayout) layout, (uint32_t) set, (uint32_t) descriptorWriteCount, (const VkWriteDescriptorSet*) pDescriptorWrites);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdPushDescriptorSetWithTemplate(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong descriptorUpdateTemplate, jlong layout, jint set, jlong pData) {
	((PFN_vkCmdPushDescriptorSetWithTemplateKHR) address) ((VkCommandBuffer) commandBuffer, (VkDescriptorUpdateTemplate) descriptorUpdateTemplate, (VkPipelineLayout) layout, (uint32_t) set, (const void*) pData);
}



// Provided by VK_EXT_conditional_rendering



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBeginConditionalRendering(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pConditionalRenderingBegin) {
	((PFN_vkCmdBeginConditionalRenderingEXT) address) ((VkCommandBuffer) commandBuffer, (const VkConditionalRenderingBeginInfoEXT*) pConditionalRenderingBegin);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdEndConditionalRendering(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer) {
	((PFN_vkCmdEndConditionalRenderingEXT) address) ((VkCommandBuffer) commandBuffer);
}



// Provided by VK_NV_clip_space_w_scaling



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetViewportWScaling(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstViewport, jint viewportCount, jlong pViewportWScalings) {
	((PFN_vkCmdSetViewportWScalingNV) address) ((VkCommandBuffer) commandBuffer, (uint32_t) firstViewport, (uint32_t) viewportCount, (const VkViewportWScalingNV*) pViewportWScalings);
}



// Provided by VK_EXT_direct_mode_display



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_releaseDisplay(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong display) {
	return (jint) ((PFN_vkReleaseDisplayEXT) address) ((VkPhysicalDevice) physicalDevice, (VkDisplayKHR) display);
}



// Provided by VK_EXT_acquire_xlib_display



#ifdef VK_USE_PLATFORM_XLIB_XRANDR_EXT

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_acquireXlibDisplay(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong dpy, jlong display) {
	return (jint) ((PFN_vkAcquireXlibDisplayEXT) address) ((VkPhysicalDevice) physicalDevice, (Display*) dpy, (VkDisplayKHR) display);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getRandROutputDisplay(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong dpy, jlong rrOutput, jlong pDisplay) {
	return (jint) ((PFN_vkGetRandROutputDisplayEXT) address) ((VkPhysicalDevice) physicalDevice, (Display*) dpy, (RROutput) rrOutput, (VkDisplayKHR*) pDisplay);
}

#endif



// Provided by VK_EXT_display_surface_counter



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceSurfaceCapabilities2EXT(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong surface, jlong pSurfaceCapabilities) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT) address) ((VkPhysicalDevice) physicalDevice, (VkSurfaceKHR) surface, (VkSurfaceCapabilities2EXT*) pSurfaceCapabilities);
}



// Provided by VK_EXT_display_control



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_displayPowerControl(JNIEnv* env, jobject obj, jlong address, jlong device, jlong display, jlong pDisplayPowerInfo) {
	return (jint) ((PFN_vkDisplayPowerControlEXT) address) ((VkDevice) device, (VkDisplayKHR) display, (const VkDisplayPowerInfoEXT*) pDisplayPowerInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_registerDeviceEvent(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pDeviceEventInfo, jlong pAllocator, jlong pFence) {
	return (jint) ((PFN_vkRegisterDeviceEventEXT) address) ((VkDevice) device, (const VkDeviceEventInfoEXT*) pDeviceEventInfo, (const VkAllocationCallbacks*) pAllocator, (VkFence*) pFence);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_registerDisplayEvent(JNIEnv* env, jobject obj, jlong address, jlong device, jlong display, jlong pDisplayEventInfo, jlong pAllocator, jlong pFence) {
	return (jint) ((PFN_vkRegisterDisplayEventEXT) address) ((VkDevice) device, (VkDisplayKHR) display, (const VkDisplayEventInfoEXT*) pDisplayEventInfo, (const VkAllocationCallbacks*) pAllocator, (VkFence*) pFence);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getSwapchainCounter(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain, jint counter, jlong pCounterValue) {
	return (jint) ((PFN_vkGetSwapchainCounterEXT) address) ((VkDevice) device, (VkSwapchainKHR) swapchain, (VkSurfaceCounterFlagBitsEXT) counter, (uint64_t*) pCounterValue);
}



// Provided by VK_GOOGLE_display_timing



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getRefreshCycleDuration(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain, jlong pDisplayTimingProperties) {
	return (jint) ((PFN_vkGetRefreshCycleDurationGOOGLE) address) ((VkDevice) device, (VkSwapchainKHR) swapchain, (VkRefreshCycleDurationGOOGLE*) pDisplayTimingProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPastPresentationTiming(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain, jlong pPresentationTimingCount, jlong pPresentationTimings) {
	return (jint) ((PFN_vkGetPastPresentationTimingGOOGLE) address) ((VkDevice) device, (VkSwapchainKHR) swapchain, (uint32_t*) pPresentationTimingCount, (VkPastPresentationTimingGOOGLE*) pPresentationTimings);
}



// Provided by VK_EXT_discard_rectangles



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetDiscardRectangle(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstDiscardRectangle, jint discardRectangleCount, jlong pDiscardRectangles) {
	((PFN_vkCmdSetDiscardRectangleEXT) address) ((VkCommandBuffer) commandBuffer, (uint32_t) firstDiscardRectangle, (uint32_t) discardRectangleCount, (const VkRect2D*) pDiscardRectangles);
}



// Provided by VK_EXT_hdr_metadata



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_setHdrMetadata(JNIEnv* env, jobject obj, jlong address, jlong device, jint swapchainCount, jlong pSwapchains, jlong pMetadata) {
	((PFN_vkSetHdrMetadataEXT) address) ((VkDevice) device, (uint32_t) swapchainCount, (const VkSwapchainKHR*) pSwapchains, (const VkHdrMetadataEXT*) pMetadata);
}



// Provided by VK_KHR_shared_presentable_image



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getSwapchainStatus(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain) {
	return (jint) ((PFN_vkGetSwapchainStatusKHR) address) ((VkDevice) device, (VkSwapchainKHR) swapchain);
}



// Provided by VK_KHR_external_fence_win32



#ifdef VK_USE_PLATFORM_WIN32_KHR

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_importFenceWin32Handle(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pImportFenceWin32HandleInfo) {
	return (jint) ((PFN_vkImportFenceWin32HandleKHR) address) ((VkDevice) device, (const VkImportFenceWin32HandleInfoKHR*) pImportFenceWin32HandleInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getFenceWin32Handle(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pGetWin32HandleInfo, jlong pHandle) {
	return (jint) ((PFN_vkGetFenceWin32HandleKHR) address) ((VkDevice) device, (const VkFenceGetWin32HandleInfoKHR*) pGetWin32HandleInfo, (HANDLE*) pHandle);
}

#endif



// Provided by VK_KHR_external_fence_fd



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_importFenceFd(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pImportFenceFdInfo) {
	return (jint) ((PFN_vkImportFenceFdKHR) address) ((VkDevice) device, (const VkImportFenceFdInfoKHR*) pImportFenceFdInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getFenceFd(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pGetFdInfo, jlong pFd) {
	return (jint) ((PFN_vkGetFenceFdKHR) address) ((VkDevice) device, (const VkFenceGetFdInfoKHR*) pGetFdInfo, (int*) pFd);
}



// Provided by VK_KHR_performance_query



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_enumeratePhysicalDeviceQueueFamilyPerformanceQueryCounters(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint queueFamilyIndex, jlong pCounterCount, jlong pCounters, jlong pCounterDescriptions) {
	return (jint) ((PFN_vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t) queueFamilyIndex, (uint32_t*) pCounterCount, (VkPerformanceCounterKHR*) pCounters, (VkPerformanceCounterDescriptionKHR*) pCounterDescriptions);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceQueueFamilyPerformanceQueryPasses(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pPerformanceQueryCreateInfo, jlong pNumPasses) {
	((PFN_vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR) address) ((VkPhysicalDevice) physicalDevice, (const VkQueryPoolPerformanceCreateInfoKHR*) pPerformanceQueryCreateInfo, (uint32_t*) pNumPasses);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_acquireProfilingLock(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo) {
	return (jint) ((PFN_vkAcquireProfilingLockKHR) address) ((VkDevice) device, (const VkAcquireProfilingLockInfoKHR*) pInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_releaseProfilingLock(JNIEnv* env, jobject obj, jlong address, jlong device) {
	((PFN_vkReleaseProfilingLockKHR) address) ((VkDevice) device);
}



// Provided by VK_KHR_get_surface_capabilities2



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceSurfaceCapabilities2KHR(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pSurfaceInfo, jlong pSurfaceCapabilities) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR) address) ((VkPhysicalDevice) physicalDevice, (const VkPhysicalDeviceSurfaceInfo2KHR*) pSurfaceInfo, (VkSurfaceCapabilities2KHR*) pSurfaceCapabilities);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceSurfaceFormats2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pSurfaceInfo, jlong pSurfaceFormatCount, jlong pSurfaceFormats) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfaceFormats2KHR) address) ((VkPhysicalDevice) physicalDevice, (const VkPhysicalDeviceSurfaceInfo2KHR*) pSurfaceInfo, (uint32_t*) pSurfaceFormatCount, (VkSurfaceFormat2KHR*) pSurfaceFormats);
}



// Provided by VK_KHR_get_display_properties2



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceDisplayProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceDisplayProperties2KHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pPropertyCount, (VkDisplayProperties2KHR*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceDisplayPlaneProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pPropertyCount, (VkDisplayPlaneProperties2KHR*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getDisplayModeProperties2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong display, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkGetDisplayModeProperties2KHR) address) ((VkPhysicalDevice) physicalDevice, (VkDisplayKHR) display, (uint32_t*) pPropertyCount, (VkDisplayModeProperties2KHR*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getDisplayPlaneCapabilities2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pDisplayPlaneInfo, jlong pCapabilities) {
	return (jint) ((PFN_vkGetDisplayPlaneCapabilities2KHR) address) ((VkPhysicalDevice) physicalDevice, (const VkDisplayPlaneInfo2KHR*) pDisplayPlaneInfo, (VkDisplayPlaneCapabilities2KHR*) pCapabilities);
}



// Provided by VK_EXT_debug_utils



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_setDebugUtilsObjectName(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pNameInfo) {
	return (jint) ((PFN_vkSetDebugUtilsObjectNameEXT) address) ((VkDevice) device, (const VkDebugUtilsObjectNameInfoEXT*) pNameInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_setDebugUtilsObjectTag(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pTagInfo) {
	return (jint) ((PFN_vkSetDebugUtilsObjectTagEXT) address) ((VkDevice) device, (const VkDebugUtilsObjectTagInfoEXT*) pTagInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_queueBeginDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong queue, jlong pLabelInfo) {
	((PFN_vkQueueBeginDebugUtilsLabelEXT) address) ((VkQueue) queue, (const VkDebugUtilsLabelEXT*) pLabelInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_queueEndDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong queue) {
	((PFN_vkQueueEndDebugUtilsLabelEXT) address) ((VkQueue) queue);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_queueInsertDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong queue, jlong pLabelInfo) {
	((PFN_vkQueueInsertDebugUtilsLabelEXT) address) ((VkQueue) queue, (const VkDebugUtilsLabelEXT*) pLabelInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBeginDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pLabelInfo) {
	((PFN_vkCmdBeginDebugUtilsLabelEXT) address) ((VkCommandBuffer) commandBuffer, (const VkDebugUtilsLabelEXT*) pLabelInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdEndDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer) {
	((PFN_vkCmdEndDebugUtilsLabelEXT) address) ((VkCommandBuffer) commandBuffer);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdInsertDebugUtilsLabel(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pLabelInfo) {
	((PFN_vkCmdInsertDebugUtilsLabelEXT) address) ((VkCommandBuffer) commandBuffer, (const VkDebugUtilsLabelEXT*) pLabelInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createDebugUtilsMessenger(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pMessenger) {
	return (jint) ((PFN_vkCreateDebugUtilsMessengerEXT) address) ((VkInstance) instance, (const VkDebugUtilsMessengerCreateInfoEXT*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkDebugUtilsMessengerEXT*) pMessenger);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyDebugUtilsMessenger(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong messenger, jlong pAllocator) {
	((PFN_vkDestroyDebugUtilsMessengerEXT) address) ((VkInstance) instance, (VkDebugUtilsMessengerEXT) messenger, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_submitDebugUtilsMessage(JNIEnv* env, jobject obj, jlong address, jlong instance, jint messageSeverity, jint messageTypes, jlong pCallbackData) {
	((PFN_vkSubmitDebugUtilsMessageEXT) address) ((VkInstance) instance, (VkDebugUtilsMessageSeverityFlagBitsEXT) messageSeverity, (VkDebugUtilsMessageTypeFlagsEXT) messageTypes, (const VkDebugUtilsMessengerCallbackDataEXT*) pCallbackData);
}



// Provided by VK_ANDROID_external_memory_android_hardware_buffer



#ifdef VK_USE_PLATFORM_ANDROID_KHR

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getAndroidHardwareBufferProperties(JNIEnv* env, jobject obj, jlong address, jlong device, jlong buffer, jlong pProperties) {
	return (jint) ((PFN_vkGetAndroidHardwareBufferPropertiesANDROID) address) ((VkDevice) device, (const struct AHardwareBuffer*) buffer, (VkAndroidHardwareBufferPropertiesANDROID*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getMemoryAndroidHardwareBuffer(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo, jlong pBuffer) {
	return (jint) ((PFN_vkGetMemoryAndroidHardwareBufferANDROID) address) ((VkDevice) device, (const VkMemoryGetAndroidHardwareBufferInfoANDROID*) pInfo, (struct AHardwareBuffer**) pBuffer);
}

#endif



// Provided by VK_EXT_sample_locations



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetSampleLocations(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pSampleLocationsInfo) {
	((PFN_vkCmdSetSampleLocationsEXT) address) ((VkCommandBuffer) commandBuffer, (const VkSampleLocationsInfoEXT*) pSampleLocationsInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceMultisampleProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint samples, jlong pMultisampleProperties) {
	((PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT) address) ((VkPhysicalDevice) physicalDevice, (VkSampleCountFlagBits) samples, (VkMultisamplePropertiesEXT*) pMultisampleProperties);
}



// Provided by VK_KHR_acceleration_structure



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createAccelerationStructureKHR(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pAccelerationStructure) {
	return (jint) ((PFN_vkCreateAccelerationStructureKHR) address) ((VkDevice) device, (const VkAccelerationStructureCreateInfoKHR*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkAccelerationStructureKHR*) pAccelerationStructure);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyAccelerationStructureKHR(JNIEnv* env, jobject obj, jlong address, jlong device, jlong accelerationStructure, jlong pAllocator) {
	((PFN_vkDestroyAccelerationStructureKHR) address) ((VkDevice) device, (VkAccelerationStructureKHR) accelerationStructure, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBuildAccelerationStructures(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint infoCount, jlong pInfos, jlong ppBuildRangeInfos) {
	((PFN_vkCmdBuildAccelerationStructuresKHR) address) ((VkCommandBuffer) commandBuffer, (uint32_t) infoCount, (const VkAccelerationStructureBuildGeometryInfoKHR*) pInfos, (const VkAccelerationStructureBuildRangeInfoKHR* const*) ppBuildRangeInfos);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBuildAccelerationStructuresIndirect(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint infoCount, jlong pInfos, jlong pIndirectDeviceAddresses, jlong pIndirectStrides, jlong ppMaxPrimitiveCounts) {
	((PFN_vkCmdBuildAccelerationStructuresIndirectKHR) address) ((VkCommandBuffer) commandBuffer, (uint32_t) infoCount, (const VkAccelerationStructureBuildGeometryInfoKHR*) pInfos, (const VkDeviceAddress*) pIndirectDeviceAddresses, (const uint32_t*) pIndirectStrides, (const uint32_t* const*) ppMaxPrimitiveCounts);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_buildAccelerationStructures(JNIEnv* env, jobject obj, jlong address, jlong device, jlong deferredOperation, jint infoCount, jlong pInfos, jlong ppBuildRangeInfos) {
	return (jint) ((PFN_vkBuildAccelerationStructuresKHR) address) ((VkDevice) device, (VkDeferredOperationKHR) deferredOperation, (uint32_t) infoCount, (const VkAccelerationStructureBuildGeometryInfoKHR*) pInfos, (const VkAccelerationStructureBuildRangeInfoKHR* const*) ppBuildRangeInfos);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_copyAccelerationStructure(JNIEnv* env, jobject obj, jlong address, jlong device, jlong deferredOperation, jlong pInfo) {
	return (jint) ((PFN_vkCopyAccelerationStructureKHR) address) ((VkDevice) device, (VkDeferredOperationKHR) deferredOperation, (const VkCopyAccelerationStructureInfoKHR*) pInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_copyAccelerationStructureToMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jlong deferredOperation, jlong pInfo) {
	return (jint) ((PFN_vkCopyAccelerationStructureToMemoryKHR) address) ((VkDevice) device, (VkDeferredOperationKHR) deferredOperation, (const VkCopyAccelerationStructureToMemoryInfoKHR*) pInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_copyMemoryToAccelerationStructure(JNIEnv* env, jobject obj, jlong address, jlong device, jlong deferredOperation, jlong pInfo) {
	return (jint) ((PFN_vkCopyMemoryToAccelerationStructureKHR) address) ((VkDevice) device, (VkDeferredOperationKHR) deferredOperation, (const VkCopyMemoryToAccelerationStructureInfoKHR*) pInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_writeAccelerationStructuresProperties(JNIEnv* env, jobject obj, jlong address, jlong device, jint accelerationStructureCount, jlong pAccelerationStructures, jint queryType, jlong dataSize, jlong pData, jlong stride) {
	return (jint) ((PFN_vkWriteAccelerationStructuresPropertiesKHR) address) ((VkDevice) device, (uint32_t) accelerationStructureCount, (const VkAccelerationStructureKHR*) pAccelerationStructures, (VkQueryType) queryType, (size_t) dataSize, (void*) pData, (size_t) stride);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyAccelerationStructureKHR(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pInfo) {
	((PFN_vkCmdCopyAccelerationStructureKHR) address) ((VkCommandBuffer) commandBuffer, (const VkCopyAccelerationStructureInfoKHR*) pInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyAccelerationStructureToMemory(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pInfo) {
	((PFN_vkCmdCopyAccelerationStructureToMemoryKHR) address) ((VkCommandBuffer) commandBuffer, (const VkCopyAccelerationStructureToMemoryInfoKHR*) pInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyMemoryToAccelerationStructure(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pInfo) {
	((PFN_vkCmdCopyMemoryToAccelerationStructureKHR) address) ((VkCommandBuffer) commandBuffer, (const VkCopyMemoryToAccelerationStructureInfoKHR*) pInfo);
}

JNIEXPORT jlong JNICALL Java_kvb_vulkan_command_Commands_getAccelerationStructureDeviceAddress(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo) {
	return (jlong) ((PFN_vkGetAccelerationStructureDeviceAddressKHR) address) ((VkDevice) device, (const VkAccelerationStructureDeviceAddressInfoKHR*) pInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdWriteAccelerationStructuresPropertiesKHR(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint accelerationStructureCount, jlong pAccelerationStructures, jint queryType, jlong queryPool, jint firstQuery) {
	((PFN_vkCmdWriteAccelerationStructuresPropertiesKHR) address) ((VkCommandBuffer) commandBuffer, (uint32_t) accelerationStructureCount, (const VkAccelerationStructureKHR*) pAccelerationStructures, (VkQueryType) queryType, (VkQueryPool) queryPool, (uint32_t) firstQuery);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getDeviceAccelerationStructureCompatibility(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pVersionInfo, jlong pCompatibility) {
	((PFN_vkGetDeviceAccelerationStructureCompatibilityKHR) address) ((VkDevice) device, (const VkAccelerationStructureVersionInfoKHR*) pVersionInfo, (VkAccelerationStructureCompatibilityKHR*) pCompatibility);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getAccelerationStructureBuildSizes(JNIEnv* env, jobject obj, jlong address, jlong device, jint buildType, jlong pBuildInfo, jlong pMaxPrimitiveCounts, jlong pSizeInfo) {
	((PFN_vkGetAccelerationStructureBuildSizesKHR) address) ((VkDevice) device, (VkAccelerationStructureBuildTypeKHR) buildType, (const VkAccelerationStructureBuildGeometryInfoKHR*) pBuildInfo, (const uint32_t*) pMaxPrimitiveCounts, (VkAccelerationStructureBuildSizesInfoKHR*) pSizeInfo);
}



// Provided by VK_KHR_ray_tracing_pipeline



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdTraceRaysKHR(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pRaygenShaderBindingTable, jlong pMissShaderBindingTable, jlong pHitShaderBindingTable, jlong pCallableShaderBindingTable, jint width, jint height, jint depth) {
	((PFN_vkCmdTraceRaysKHR) address) ((VkCommandBuffer) commandBuffer, (const VkStridedDeviceAddressRegionKHR*) pRaygenShaderBindingTable, (const VkStridedDeviceAddressRegionKHR*) pMissShaderBindingTable, (const VkStridedDeviceAddressRegionKHR*) pHitShaderBindingTable, (const VkStridedDeviceAddressRegionKHR*) pCallableShaderBindingTable, (uint32_t) width, (uint32_t) height, (uint32_t) depth);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createRayTracingPipelinesKHR(JNIEnv* env, jobject obj, jlong address, jlong device, jlong deferredOperation, jlong pipelineCache, jint createInfoCount, jlong pCreateInfos, jlong pAllocator, jlong pPipelines) {
	return (jint) ((PFN_vkCreateRayTracingPipelinesKHR) address) ((VkDevice) device, (VkDeferredOperationKHR) deferredOperation, (VkPipelineCache) pipelineCache, (uint32_t) createInfoCount, (const VkRayTracingPipelineCreateInfoKHR*) pCreateInfos, (const VkAllocationCallbacks*) pAllocator, (VkPipeline*) pPipelines);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getRayTracingShaderGroupHandlesKHR(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipeline, jint firstGroup, jint groupCount, jlong dataSize, jlong pData) {
	return (jint) ((PFN_vkGetRayTracingShaderGroupHandlesKHR) address) ((VkDevice) device, (VkPipeline) pipeline, (uint32_t) firstGroup, (uint32_t) groupCount, (size_t) dataSize, (void*) pData);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getRayTracingCaptureReplayShaderGroupHandles(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipeline, jint firstGroup, jint groupCount, jlong dataSize, jlong pData) {
	return (jint) ((PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR) address) ((VkDevice) device, (VkPipeline) pipeline, (uint32_t) firstGroup, (uint32_t) groupCount, (size_t) dataSize, (void*) pData);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdTraceRaysIndirect(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pRaygenShaderBindingTable, jlong pMissShaderBindingTable, jlong pHitShaderBindingTable, jlong pCallableShaderBindingTable, jlong indirectDeviceAddress) {
	((PFN_vkCmdTraceRaysIndirectKHR) address) ((VkCommandBuffer) commandBuffer, (const VkStridedDeviceAddressRegionKHR*) pRaygenShaderBindingTable, (const VkStridedDeviceAddressRegionKHR*) pMissShaderBindingTable, (const VkStridedDeviceAddressRegionKHR*) pHitShaderBindingTable, (const VkStridedDeviceAddressRegionKHR*) pCallableShaderBindingTable, (VkDeviceAddress) indirectDeviceAddress);
}

JNIEXPORT jlong JNICALL Java_kvb_vulkan_command_Commands_getRayTracingShaderGroupStackSize(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipeline, jint group, jint groupShader) {
	return (jlong) ((PFN_vkGetRayTracingShaderGroupStackSizeKHR) address) ((VkDevice) device, (VkPipeline) pipeline, (uint32_t) group, (VkShaderGroupShaderKHR) groupShader);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetRayTracingPipelineStackSize(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint pipelineStackSize) {
	((PFN_vkCmdSetRayTracingPipelineStackSizeKHR) address) ((VkCommandBuffer) commandBuffer, (uint32_t) pipelineStackSize);
}



// Provided by VK_EXT_image_drm_format_modifier



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getImageDrmFormatModifierProperties(JNIEnv* env, jobject obj, jlong address, jlong device, jlong image, jlong pProperties) {
	return (jint) ((PFN_vkGetImageDrmFormatModifierPropertiesEXT) address) ((VkDevice) device, (VkImage) image, (VkImageDrmFormatModifierPropertiesEXT*) pProperties);
}



// Provided by VK_EXT_validation_cache



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createValidationCache(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pValidationCache) {
	return (jint) ((PFN_vkCreateValidationCacheEXT) address) ((VkDevice) device, (const VkValidationCacheCreateInfoEXT*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkValidationCacheEXT*) pValidationCache);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyValidationCache(JNIEnv* env, jobject obj, jlong address, jlong device, jlong validationCache, jlong pAllocator) {
	((PFN_vkDestroyValidationCacheEXT) address) ((VkDevice) device, (VkValidationCacheEXT) validationCache, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_mergeValidationCaches(JNIEnv* env, jobject obj, jlong address, jlong device, jlong dstCache, jint srcCacheCount, jlong pSrcCaches) {
	return (jint) ((PFN_vkMergeValidationCachesEXT) address) ((VkDevice) device, (VkValidationCacheEXT) dstCache, (uint32_t) srcCacheCount, (const VkValidationCacheEXT*) pSrcCaches);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getValidationCacheData(JNIEnv* env, jobject obj, jlong address, jlong device, jlong validationCache, jlong pDataSize, jlong pData) {
	return (jint) ((PFN_vkGetValidationCacheDataEXT) address) ((VkDevice) device, (VkValidationCacheEXT) validationCache, (size_t*) pDataSize, (void*) pData);
}



// Provided by VK_NV_shading_rate_image



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBindShadingRateImage(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong imageView, jint imageLayout) {
	((PFN_vkCmdBindShadingRateImageNV) address) ((VkCommandBuffer) commandBuffer, (VkImageView) imageView, (VkImageLayout) imageLayout);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetViewportShadingRatePalette(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstViewport, jint viewportCount, jlong pShadingRatePalettes) {
	((PFN_vkCmdSetViewportShadingRatePaletteNV) address) ((VkCommandBuffer) commandBuffer, (uint32_t) firstViewport, (uint32_t) viewportCount, (const VkShadingRatePaletteNV*) pShadingRatePalettes);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetCoarseSampleOrder(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint sampleOrderType, jint customSampleOrderCount, jlong pCustomSampleOrders) {
	((PFN_vkCmdSetCoarseSampleOrderNV) address) ((VkCommandBuffer) commandBuffer, (VkCoarseSampleOrderTypeNV) sampleOrderType, (uint32_t) customSampleOrderCount, (const VkCoarseSampleOrderCustomNV*) pCustomSampleOrders);
}



// Provided by VK_NV_ray_tracing



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createAccelerationStructureNV(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pAccelerationStructure) {
	return (jint) ((PFN_vkCreateAccelerationStructureNV) address) ((VkDevice) device, (const VkAccelerationStructureCreateInfoNV*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkAccelerationStructureNV*) pAccelerationStructure);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyAccelerationStructureNV(JNIEnv* env, jobject obj, jlong address, jlong device, jlong accelerationStructure, jlong pAllocator) {
	((PFN_vkDestroyAccelerationStructureNV) address) ((VkDevice) device, (VkAccelerationStructureNV) accelerationStructure, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getAccelerationStructureMemoryRequirements(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo, jlong pMemoryRequirements) {
	((PFN_vkGetAccelerationStructureMemoryRequirementsNV) address) ((VkDevice) device, (const VkAccelerationStructureMemoryRequirementsInfoNV*) pInfo, (VkMemoryRequirements2*) pMemoryRequirements);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_bindAccelerationStructureMemory(JNIEnv* env, jobject obj, jlong address, jlong device, jint bindInfoCount, jlong pBindInfos) {
	return (jint) ((PFN_vkBindAccelerationStructureMemoryNV) address) ((VkDevice) device, (uint32_t) bindInfoCount, (const VkBindAccelerationStructureMemoryInfoNV*) pBindInfos);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBuildAccelerationStructure(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pInfo, jlong instanceData, jlong instanceOffset, jint update, jlong dst, jlong src, jlong scratch, jlong scratchOffset) {
	((PFN_vkCmdBuildAccelerationStructureNV) address) ((VkCommandBuffer) commandBuffer, (const VkAccelerationStructureInfoNV*) pInfo, (VkBuffer) instanceData, (VkDeviceSize) instanceOffset, (VkBool32) update, (VkAccelerationStructureNV) dst, (VkAccelerationStructureNV) src, (VkBuffer) scratch, (VkDeviceSize) scratchOffset);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyAccelerationStructureNV(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong dst, jlong src, jint mode) {
	((PFN_vkCmdCopyAccelerationStructureNV) address) ((VkCommandBuffer) commandBuffer, (VkAccelerationStructureNV) dst, (VkAccelerationStructureNV) src, (VkCopyAccelerationStructureModeKHR) mode);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdTraceRaysNV(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong raygenShaderBindingTableBuffer, jlong raygenShaderBindingOffset, jlong missShaderBindingTableBuffer, jlong missShaderBindingOffset, jlong missShaderBindingStride, jlong hitShaderBindingTableBuffer, jlong hitShaderBindingOffset, jlong hitShaderBindingStride, jlong callableShaderBindingTableBuffer, jlong callableShaderBindingOffset, jlong callableShaderBindingStride, jint width, jint height, jint depth) {
	((PFN_vkCmdTraceRaysNV) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) raygenShaderBindingTableBuffer, (VkDeviceSize) raygenShaderBindingOffset, (VkBuffer) missShaderBindingTableBuffer, (VkDeviceSize) missShaderBindingOffset, (VkDeviceSize) missShaderBindingStride, (VkBuffer) hitShaderBindingTableBuffer, (VkDeviceSize) hitShaderBindingOffset, (VkDeviceSize) hitShaderBindingStride, (VkBuffer) callableShaderBindingTableBuffer, (VkDeviceSize) callableShaderBindingOffset, (VkDeviceSize) callableShaderBindingStride, (uint32_t) width, (uint32_t) height, (uint32_t) depth);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createRayTracingPipelinesNV(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipelineCache, jint createInfoCount, jlong pCreateInfos, jlong pAllocator, jlong pPipelines) {
	return (jint) ((PFN_vkCreateRayTracingPipelinesNV) address) ((VkDevice) device, (VkPipelineCache) pipelineCache, (uint32_t) createInfoCount, (const VkRayTracingPipelineCreateInfoNV*) pCreateInfos, (const VkAllocationCallbacks*) pAllocator, (VkPipeline*) pPipelines);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getAccelerationStructureHandle(JNIEnv* env, jobject obj, jlong address, jlong device, jlong accelerationStructure, jlong dataSize, jlong pData) {
	return (jint) ((PFN_vkGetAccelerationStructureHandleNV) address) ((VkDevice) device, (VkAccelerationStructureNV) accelerationStructure, (size_t) dataSize, (void*) pData);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdWriteAccelerationStructuresPropertiesNV(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint accelerationStructureCount, jlong pAccelerationStructures, jint queryType, jlong queryPool, jint firstQuery) {
	((PFN_vkCmdWriteAccelerationStructuresPropertiesNV) address) ((VkCommandBuffer) commandBuffer, (uint32_t) accelerationStructureCount, (const VkAccelerationStructureNV*) pAccelerationStructures, (VkQueryType) queryType, (VkQueryPool) queryPool, (uint32_t) firstQuery);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_compileDeferred(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pipeline, jint shader) {
	return (jint) ((PFN_vkCompileDeferredNV) address) ((VkDevice) device, (VkPipeline) pipeline, (uint32_t) shader);
}



// Provided by VK_EXT_external_memory_host



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getMemoryHostPointerProperties(JNIEnv* env, jobject obj, jlong address, jlong device, jint handleType, jlong pHostPointer, jlong pMemoryHostPointerProperties) {
	return (jint) ((PFN_vkGetMemoryHostPointerPropertiesEXT) address) ((VkDevice) device, (VkExternalMemoryHandleTypeFlagBits) handleType, (const void*) pHostPointer, (VkMemoryHostPointerPropertiesEXT*) pMemoryHostPointerProperties);
}



// Provided by VK_AMD_buffer_marker



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdWriteBufferMarker(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint pipelineStage, jlong dstBuffer, jlong dstOffset, jint marker) {
	((PFN_vkCmdWriteBufferMarkerAMD) address) ((VkCommandBuffer) commandBuffer, (VkPipelineStageFlagBits) pipelineStage, (VkBuffer) dstBuffer, (VkDeviceSize) dstOffset, (uint32_t) marker);
}



// Provided by VK_EXT_calibrated_timestamps



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceCalibrateableTimeDomains(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pTimeDomainCount, jlong pTimeDomains) {
	return (jint) ((PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pTimeDomainCount, (VkTimeDomainEXT*) pTimeDomains);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getCalibratedTimestamps(JNIEnv* env, jobject obj, jlong address, jlong device, jint timestampCount, jlong pTimestampInfos, jlong pTimestamps, jlong pMaxDeviation) {
	return (jint) ((PFN_vkGetCalibratedTimestampsEXT) address) ((VkDevice) device, (uint32_t) timestampCount, (const VkCalibratedTimestampInfoEXT*) pTimestampInfos, (uint64_t*) pTimestamps, (uint64_t*) pMaxDeviation);
}



// Provided by VK_NV_mesh_shader



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDrawMeshTasks(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint taskCount, jint firstTask) {
	((PFN_vkCmdDrawMeshTasksNV) address) ((VkCommandBuffer) commandBuffer, (uint32_t) taskCount, (uint32_t) firstTask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDrawMeshTasksIndirect(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jint drawCount, jint stride) {
	((PFN_vkCmdDrawMeshTasksIndirectNV) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) buffer, (VkDeviceSize) offset, (uint32_t) drawCount, (uint32_t) stride);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdDrawMeshTasksIndirectCount(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jlong countBuffer, jlong countBufferOffset, jint maxDrawCount, jint stride) {
	((PFN_vkCmdDrawMeshTasksIndirectCountNV) address) ((VkCommandBuffer) commandBuffer, (VkBuffer) buffer, (VkDeviceSize) offset, (VkBuffer) countBuffer, (VkDeviceSize) countBufferOffset, (uint32_t) maxDrawCount, (uint32_t) stride);
}



// Provided by VK_NV_scissor_exclusive



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetExclusiveScissor(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstExclusiveScissor, jint exclusiveScissorCount, jlong pExclusiveScissors) {
	((PFN_vkCmdSetExclusiveScissorNV) address) ((VkCommandBuffer) commandBuffer, (uint32_t) firstExclusiveScissor, (uint32_t) exclusiveScissorCount, (const VkRect2D*) pExclusiveScissors);
}



// Provided by VK_NV_device_diagnostic_checkpoints



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetCheckpoint(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pCheckpointMarker) {
	((PFN_vkCmdSetCheckpointNV) address) ((VkCommandBuffer) commandBuffer, (const void*) pCheckpointMarker);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getQueueCheckpointData(JNIEnv* env, jobject obj, jlong address, jlong queue, jlong pCheckpointDataCount, jlong pCheckpointData) {
	((PFN_vkGetQueueCheckpointDataNV) address) ((VkQueue) queue, (uint32_t*) pCheckpointDataCount, (VkCheckpointDataNV*) pCheckpointData);
}



// Provided by VK_INTEL_performance_query



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_initializePerformanceApi(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInitializeInfo) {
	return (jint) ((PFN_vkInitializePerformanceApiINTEL) address) ((VkDevice) device, (const VkInitializePerformanceApiInfoINTEL*) pInitializeInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_uninitializePerformanceApi(JNIEnv* env, jobject obj, jlong address, jlong device) {
	((PFN_vkUninitializePerformanceApiINTEL) address) ((VkDevice) device);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_cmdSetPerformanceMarker(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pMarkerInfo) {
	return (jint) ((PFN_vkCmdSetPerformanceMarkerINTEL) address) ((VkCommandBuffer) commandBuffer, (const VkPerformanceMarkerInfoINTEL*) pMarkerInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_cmdSetPerformanceStreamMarker(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pMarkerInfo) {
	return (jint) ((PFN_vkCmdSetPerformanceStreamMarkerINTEL) address) ((VkCommandBuffer) commandBuffer, (const VkPerformanceStreamMarkerInfoINTEL*) pMarkerInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_cmdSetPerformanceOverride(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pOverrideInfo) {
	return (jint) ((PFN_vkCmdSetPerformanceOverrideINTEL) address) ((VkCommandBuffer) commandBuffer, (const VkPerformanceOverrideInfoINTEL*) pOverrideInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_acquirePerformanceConfiguration(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAcquireInfo, jlong pConfiguration) {
	return (jint) ((PFN_vkAcquirePerformanceConfigurationINTEL) address) ((VkDevice) device, (const VkPerformanceConfigurationAcquireInfoINTEL*) pAcquireInfo, (VkPerformanceConfigurationINTEL*) pConfiguration);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_releasePerformanceConfiguration(JNIEnv* env, jobject obj, jlong address, jlong device, jlong configuration) {
	return (jint) ((PFN_vkReleasePerformanceConfigurationINTEL) address) ((VkDevice) device, (VkPerformanceConfigurationINTEL) configuration);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_queueSetPerformanceConfiguration(JNIEnv* env, jobject obj, jlong address, jlong queue, jlong configuration) {
	return (jint) ((PFN_vkQueueSetPerformanceConfigurationINTEL) address) ((VkQueue) queue, (VkPerformanceConfigurationINTEL) configuration);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPerformanceParameter(JNIEnv* env, jobject obj, jlong address, jlong device, jint parameter, jlong pValue) {
	return (jint) ((PFN_vkGetPerformanceParameterINTEL) address) ((VkDevice) device, (VkPerformanceParameterTypeINTEL) parameter, (VkPerformanceValueINTEL*) pValue);
}



// Provided by VK_AMD_display_native_hdr



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_setLocalDimming(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapChain, jint localDimmingEnable) {
	((PFN_vkSetLocalDimmingAMD) address) ((VkDevice) device, (VkSwapchainKHR) swapChain, (VkBool32) localDimmingEnable);
}



// Provided by VK_FUCHSIA_imagepipe_surface



#ifdef VK_USE_PLATFORM_FUCHSIA

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createImagePipeSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateImagePipeSurfaceFUCHSIA) address) ((VkInstance) instance, (const VkImagePipeSurfaceCreateInfoFUCHSIA*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}

#endif



// Provided by VK_EXT_metal_surface



#ifdef VK_USE_PLATFORM_METAL_EXT

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createMetalSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateMetalSurfaceEXT) address) ((VkInstance) instance, (const VkMetalSurfaceCreateInfoEXT*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}

#endif



// Provided by VK_KHR_fragment_shading_rate



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceFragmentShadingRates(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pFragmentShadingRateCount, jlong pFragmentShadingRates) {
	return (jint) ((PFN_vkGetPhysicalDeviceFragmentShadingRatesKHR) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pFragmentShadingRateCount, (VkPhysicalDeviceFragmentShadingRateKHR*) pFragmentShadingRates);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetFragmentShadingRate(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pFragmentSize, jlong combinerOps) {
	((PFN_vkCmdSetFragmentShadingRateKHR) address) ((VkCommandBuffer) commandBuffer, (const VkExtent2D*) pFragmentSize, (VkFragmentShadingRateCombinerOpKHR*) combinerOps);
}



// Provided by VK_EXT_tooling_info



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceToolProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pToolCount, jlong pToolProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceToolPropertiesEXT) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pToolCount, (VkPhysicalDeviceToolPropertiesEXT*) pToolProperties);
}



// Provided by VK_NV_cooperative_matrix



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceCooperativeMatrixProperties(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties) {
	return (jint) ((PFN_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pPropertyCount, (VkCooperativeMatrixPropertiesNV*) pProperties);
}



// Provided by VK_NV_coverage_reduction_mode



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceSupportedFramebufferMixedSamplesCombinations(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pCombinationCount, jlong pCombinations) {
	return (jint) ((PFN_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV) address) ((VkPhysicalDevice) physicalDevice, (uint32_t*) pCombinationCount, (VkFramebufferMixedSamplesCombinationNV*) pCombinations);
}



// Provided by VK_EXT_full_screen_exclusive



#ifdef VK_USE_PLATFORM_WIN32_KHR

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceSurfacePresentModes2(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong pSurfaceInfo, jlong pPresentModeCount, jlong pPresentModes) {
	return (jint) ((PFN_vkGetPhysicalDeviceSurfacePresentModes2EXT) address) ((VkPhysicalDevice) physicalDevice, (const VkPhysicalDeviceSurfaceInfo2KHR*) pSurfaceInfo, (uint32_t*) pPresentModeCount, (VkPresentModeKHR*) pPresentModes);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_acquireFullScreenExclusiveMode(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain) {
	return (jint) ((PFN_vkAcquireFullScreenExclusiveModeEXT) address) ((VkDevice) device, (VkSwapchainKHR) swapchain);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_releaseFullScreenExclusiveMode(JNIEnv* env, jobject obj, jlong address, jlong device, jlong swapchain) {
	return (jint) ((PFN_vkReleaseFullScreenExclusiveModeEXT) address) ((VkDevice) device, (VkSwapchainKHR) swapchain);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getDeviceGroupSurfacePresentModes2(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pSurfaceInfo, jlong pModes) {
	return (jint) ((PFN_vkGetDeviceGroupSurfacePresentModes2EXT) address) ((VkDevice) device, (const VkPhysicalDeviceSurfaceInfo2KHR*) pSurfaceInfo, (VkDeviceGroupPresentModeFlagsKHR*) pModes);
}

#endif



// Provided by VK_EXT_headless_surface



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createHeadlessSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateHeadlessSurfaceEXT) address) ((VkInstance) instance, (const VkHeadlessSurfaceCreateInfoEXT*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}



// Provided by VK_EXT_line_rasterization



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetLineStipple(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint lineStippleFactor, jshort lineStipplePattern) {
	((PFN_vkCmdSetLineStippleEXT) address) ((VkCommandBuffer) commandBuffer, (uint32_t) lineStippleFactor, (uint16_t) lineStipplePattern);
}



// Provided by VK_EXT_extended_dynamic_state



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetCullMode(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint cullMode) {
	((PFN_vkCmdSetCullModeEXT) address) ((VkCommandBuffer) commandBuffer, (VkCullModeFlags) cullMode);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetFrontFace(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint frontFace) {
	((PFN_vkCmdSetFrontFaceEXT) address) ((VkCommandBuffer) commandBuffer, (VkFrontFace) frontFace);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetPrimitiveTopology(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint primitiveTopology) {
	((PFN_vkCmdSetPrimitiveTopologyEXT) address) ((VkCommandBuffer) commandBuffer, (VkPrimitiveTopology) primitiveTopology);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetViewportWithCount(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint viewportCount, jlong pViewports) {
	((PFN_vkCmdSetViewportWithCountEXT) address) ((VkCommandBuffer) commandBuffer, (uint32_t) viewportCount, (const VkViewport*) pViewports);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetScissorWithCount(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint scissorCount, jlong pScissors) {
	((PFN_vkCmdSetScissorWithCountEXT) address) ((VkCommandBuffer) commandBuffer, (uint32_t) scissorCount, (const VkRect2D*) pScissors);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBindVertexBuffers2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint firstBinding, jint bindingCount, jlong pBuffers, jlong pOffsets, jlong pSizes, jlong pStrides) {
	((PFN_vkCmdBindVertexBuffers2EXT) address) ((VkCommandBuffer) commandBuffer, (uint32_t) firstBinding, (uint32_t) bindingCount, (const VkBuffer*) pBuffers, (const VkDeviceSize*) pOffsets, (const VkDeviceSize*) pSizes, (const VkDeviceSize*) pStrides);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetDepthTestEnable(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint depthTestEnable) {
	((PFN_vkCmdSetDepthTestEnableEXT) address) ((VkCommandBuffer) commandBuffer, (VkBool32) depthTestEnable);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetDepthWriteEnable(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint depthWriteEnable) {
	((PFN_vkCmdSetDepthWriteEnableEXT) address) ((VkCommandBuffer) commandBuffer, (VkBool32) depthWriteEnable);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetDepthCompareOp(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint depthCompareOp) {
	((PFN_vkCmdSetDepthCompareOpEXT) address) ((VkCommandBuffer) commandBuffer, (VkCompareOp) depthCompareOp);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetDepthBoundsTestEnable(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint depthBoundsTestEnable) {
	((PFN_vkCmdSetDepthBoundsTestEnableEXT) address) ((VkCommandBuffer) commandBuffer, (VkBool32) depthBoundsTestEnable);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetStencilTestEnable(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint stencilTestEnable) {
	((PFN_vkCmdSetStencilTestEnableEXT) address) ((VkCommandBuffer) commandBuffer, (VkBool32) stencilTestEnable);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetStencilOp(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint faceMask, jint failOp, jint passOp, jint depthFailOp, jint compareOp) {
	((PFN_vkCmdSetStencilOpEXT) address) ((VkCommandBuffer) commandBuffer, (VkStencilFaceFlags) faceMask, (VkStencilOp) failOp, (VkStencilOp) passOp, (VkStencilOp) depthFailOp, (VkCompareOp) compareOp);
}



// Provided by VK_KHR_deferred_host_operations



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createDeferredOperation(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pAllocator, jlong pDeferredOperation) {
	return (jint) ((PFN_vkCreateDeferredOperationKHR) address) ((VkDevice) device, (const VkAllocationCallbacks*) pAllocator, (VkDeferredOperationKHR*) pDeferredOperation);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyDeferredOperation(JNIEnv* env, jobject obj, jlong address, jlong device, jlong operation, jlong pAllocator) {
	((PFN_vkDestroyDeferredOperationKHR) address) ((VkDevice) device, (VkDeferredOperationKHR) operation, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getDeferredOperationMaxConcurrency(JNIEnv* env, jobject obj, jlong address, jlong device, jlong operation) {
	return (jint) ((PFN_vkGetDeferredOperationMaxConcurrencyKHR) address) ((VkDevice) device, (VkDeferredOperationKHR) operation);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getDeferredOperationResult(JNIEnv* env, jobject obj, jlong address, jlong device, jlong operation) {
	return (jint) ((PFN_vkGetDeferredOperationResultKHR) address) ((VkDevice) device, (VkDeferredOperationKHR) operation);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_deferredOperationJoin(JNIEnv* env, jobject obj, jlong address, jlong device, jlong operation) {
	return (jint) ((PFN_vkDeferredOperationJoinKHR) address) ((VkDevice) device, (VkDeferredOperationKHR) operation);
}



// Provided by VK_KHR_pipeline_executable_properties



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPipelineExecutableProperties(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pPipelineInfo, jlong pExecutableCount, jlong pProperties) {
	return (jint) ((PFN_vkGetPipelineExecutablePropertiesKHR) address) ((VkDevice) device, (const VkPipelineInfoKHR*) pPipelineInfo, (uint32_t*) pExecutableCount, (VkPipelineExecutablePropertiesKHR*) pProperties);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPipelineExecutableStatistics(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pExecutableInfo, jlong pStatisticCount, jlong pStatistics) {
	return (jint) ((PFN_vkGetPipelineExecutableStatisticsKHR) address) ((VkDevice) device, (const VkPipelineExecutableInfoKHR*) pExecutableInfo, (uint32_t*) pStatisticCount, (VkPipelineExecutableStatisticKHR*) pStatistics);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPipelineExecutableInternalRepresentations(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pExecutableInfo, jlong pInternalRepresentationCount, jlong pInternalRepresentations) {
	return (jint) ((PFN_vkGetPipelineExecutableInternalRepresentationsKHR) address) ((VkDevice) device, (const VkPipelineExecutableInfoKHR*) pExecutableInfo, (uint32_t*) pInternalRepresentationCount, (VkPipelineExecutableInternalRepresentationKHR*) pInternalRepresentations);
}



// Provided by VK_NV_device_generated_commands



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getGeneratedCommandsMemoryRequirements(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pInfo, jlong pMemoryRequirements) {
	((PFN_vkGetGeneratedCommandsMemoryRequirementsNV) address) ((VkDevice) device, (const VkGeneratedCommandsMemoryRequirementsInfoNV*) pInfo, (VkMemoryRequirements2*) pMemoryRequirements);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdPreprocessGeneratedCommands(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pGeneratedCommandsInfo) {
	((PFN_vkCmdPreprocessGeneratedCommandsNV) address) ((VkCommandBuffer) commandBuffer, (const VkGeneratedCommandsInfoNV*) pGeneratedCommandsInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdExecuteGeneratedCommands(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint isPreprocessed, jlong pGeneratedCommandsInfo) {
	((PFN_vkCmdExecuteGeneratedCommandsNV) address) ((VkCommandBuffer) commandBuffer, (VkBool32) isPreprocessed, (const VkGeneratedCommandsInfoNV*) pGeneratedCommandsInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBindPipelineShaderGroup(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint pipelineBindPoint, jlong pipeline, jint groupIndex) {
	((PFN_vkCmdBindPipelineShaderGroupNV) address) ((VkCommandBuffer) commandBuffer, (VkPipelineBindPoint) pipelineBindPoint, (VkPipeline) pipeline, (uint32_t) groupIndex);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createIndirectCommandsLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pIndirectCommandsLayout) {
	return (jint) ((PFN_vkCreateIndirectCommandsLayoutNV) address) ((VkDevice) device, (const VkIndirectCommandsLayoutCreateInfoNV*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkIndirectCommandsLayoutNV*) pIndirectCommandsLayout);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyIndirectCommandsLayout(JNIEnv* env, jobject obj, jlong address, jlong device, jlong indirectCommandsLayout, jlong pAllocator) {
	((PFN_vkDestroyIndirectCommandsLayoutNV) address) ((VkDevice) device, (VkIndirectCommandsLayoutNV) indirectCommandsLayout, (const VkAllocationCallbacks*) pAllocator);
}



// Provided by VK_EXT_private_data



JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createPrivateDataSlot(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pPrivateDataSlot) {
	return (jint) ((PFN_vkCreatePrivateDataSlotEXT) address) ((VkDevice) device, (const VkPrivateDataSlotCreateInfoEXT*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkPrivateDataSlotEXT*) pPrivateDataSlot);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_destroyPrivateDataSlot(JNIEnv* env, jobject obj, jlong address, jlong device, jlong privateDataSlot, jlong pAllocator) {
	((PFN_vkDestroyPrivateDataSlotEXT) address) ((VkDevice) device, (VkPrivateDataSlotEXT) privateDataSlot, (const VkAllocationCallbacks*) pAllocator);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_setPrivateData(JNIEnv* env, jobject obj, jlong address, jlong device, jint objectType, jlong objectHandle, jlong privateDataSlot, jlong data) {
	return (jint) ((PFN_vkSetPrivateDataEXT) address) ((VkDevice) device, (VkObjectType) objectType, (uint64_t) objectHandle, (VkPrivateDataSlotEXT) privateDataSlot, (uint64_t) data);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getPrivateData(JNIEnv* env, jobject obj, jlong address, jlong device, jint objectType, jlong objectHandle, jlong privateDataSlot, jlong pData) {
	((PFN_vkGetPrivateDataEXT) address) ((VkDevice) device, (VkObjectType) objectType, (uint64_t) objectHandle, (VkPrivateDataSlotEXT) privateDataSlot, (uint64_t*) pData);
}



// Provided by VK_KHR_synchronization2



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetEvent2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong event, jlong pDependencyInfo) {
	((PFN_vkCmdSetEvent2KHR) address) ((VkCommandBuffer) commandBuffer, (VkEvent) event, (const VkDependencyInfoKHR*) pDependencyInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdResetEvent2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong event, jlong stageMask) {
	((PFN_vkCmdResetEvent2KHR) address) ((VkCommandBuffer) commandBuffer, (VkEvent) event, (VkPipelineStageFlags2KHR) stageMask);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdWaitEvents2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint eventCount, jlong pEvents, jlong pDependencyInfos) {
	((PFN_vkCmdWaitEvents2KHR) address) ((VkCommandBuffer) commandBuffer, (uint32_t) eventCount, (const VkEvent*) pEvents, (const VkDependencyInfoKHR*) pDependencyInfos);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdPipelineBarrier2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pDependencyInfo) {
	((PFN_vkCmdPipelineBarrier2KHR) address) ((VkCommandBuffer) commandBuffer, (const VkDependencyInfoKHR*) pDependencyInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdWriteTimestamp2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong stage, jlong queryPool, jint query) {
	((PFN_vkCmdWriteTimestamp2KHR) address) ((VkCommandBuffer) commandBuffer, (VkPipelineStageFlags2KHR) stage, (VkQueryPool) queryPool, (uint32_t) query);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_queueSubmit2(JNIEnv* env, jobject obj, jlong address, jlong queue, jint submitCount, jlong pSubmits, jlong fence) {
	return (jint) ((PFN_vkQueueSubmit2KHR) address) ((VkQueue) queue, (uint32_t) submitCount, (const VkSubmitInfo2KHR*) pSubmits, (VkFence) fence);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdWriteBufferMarker2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong stage, jlong dstBuffer, jlong dstOffset, jint marker) {
	((PFN_vkCmdWriteBufferMarker2AMD) address) ((VkCommandBuffer) commandBuffer, (VkPipelineStageFlags2KHR) stage, (VkBuffer) dstBuffer, (VkDeviceSize) dstOffset, (uint32_t) marker);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_getQueueCheckpointData2(JNIEnv* env, jobject obj, jlong address, jlong queue, jlong pCheckpointDataCount, jlong pCheckpointData) {
	((PFN_vkGetQueueCheckpointData2NV) address) ((VkQueue) queue, (uint32_t*) pCheckpointDataCount, (VkCheckpointData2NV*) pCheckpointData);
}



// Provided by VK_NV_fragment_shading_rate_enums



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdSetFragmentShadingRateEnum(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jint shadingRate, jlong combinerOps) {
	((PFN_vkCmdSetFragmentShadingRateEnumNV) address) ((VkCommandBuffer) commandBuffer, (VkFragmentShadingRateNV) shadingRate, (VkFragmentShadingRateCombinerOpKHR*) combinerOps);
}



// Provided by VK_KHR_copy_commands2



JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyBuffer2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pCopyBufferInfo) {
	((PFN_vkCmdCopyBuffer2KHR) address) ((VkCommandBuffer) commandBuffer, (const VkCopyBufferInfo2KHR*) pCopyBufferInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyImage2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pCopyImageInfo) {
	((PFN_vkCmdCopyImage2KHR) address) ((VkCommandBuffer) commandBuffer, (const VkCopyImageInfo2KHR*) pCopyImageInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyBufferToImage2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pCopyBufferToImageInfo) {
	((PFN_vkCmdCopyBufferToImage2KHR) address) ((VkCommandBuffer) commandBuffer, (const VkCopyBufferToImageInfo2KHR*) pCopyBufferToImageInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdCopyImageToBuffer2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pCopyImageToBufferInfo) {
	((PFN_vkCmdCopyImageToBuffer2KHR) address) ((VkCommandBuffer) commandBuffer, (const VkCopyImageToBufferInfo2KHR*) pCopyImageToBufferInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdBlitImage2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pBlitImageInfo) {
	((PFN_vkCmdBlitImage2KHR) address) ((VkCommandBuffer) commandBuffer, (const VkBlitImageInfo2KHR*) pBlitImageInfo);
}

JNIEXPORT void JNICALL Java_kvb_vulkan_command_Commands_cmdResolveImage2(JNIEnv* env, jobject obj, jlong address, jlong commandBuffer, jlong pResolveImageInfo) {
	((PFN_vkCmdResolveImage2KHR) address) ((VkCommandBuffer) commandBuffer, (const VkResolveImageInfo2KHR*) pResolveImageInfo);
}



// Provided by VK_NV_acquire_winrt_display



#ifdef VK_USE_PLATFORM_WIN32_KHR

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_acquireWinrtDisplay(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jlong display) {
	return (jint) ((PFN_vkAcquireWinrtDisplayNV) address) ((VkPhysicalDevice) physicalDevice, (VkDisplayKHR) display);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getWinrtDisplay(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint deviceRelativeId, jlong pDisplay) {
	return (jint) ((PFN_vkGetWinrtDisplayNV) address) ((VkPhysicalDevice) physicalDevice, (uint32_t) deviceRelativeId, (VkDisplayKHR*) pDisplay);
}

#endif



// Provided by VK_EXT_directfb_surface



#ifdef VK_USE_PLATFORM_DIRECTFB_EXT

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createDirectFBSurface(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateDirectFBSurfaceEXT) address) ((VkInstance) instance, (const VkDirectFBSurfaceCreateInfoEXT*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceDirectFBPresentationSupport(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint queueFamilyIndex, jlong dfb) {
	return (jint) ((PFN_vkGetPhysicalDeviceDirectFBPresentationSupportEXT) address) ((VkPhysicalDevice) physicalDevice, (uint32_t) queueFamilyIndex, (IDirectFB*) dfb);
}

#endif



// Provided by VK_FUCHSIA_external_memory



#ifdef VK_USE_PLATFORM_FUCHSIA

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getMemoryZirconHandle(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pGetZirconHandleInfo, jlong pZirconHandle) {
	return (jint) ((PFN_vkGetMemoryZirconHandleFUCHSIA) address) ((VkDevice) device, (const VkMemoryGetZirconHandleInfoFUCHSIA*) pGetZirconHandleInfo, (zx_handle_t*) pZirconHandle);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getMemoryZirconHandleProperties(JNIEnv* env, jobject obj, jlong address, jlong device, jint handleType, jlong zirconHandle, jlong pMemoryZirconHandleProperties) {
	return (jint) ((PFN_vkGetMemoryZirconHandlePropertiesFUCHSIA) address) ((VkDevice) device, (VkExternalMemoryHandleTypeFlagBits) handleType, (zx_handle_t) zirconHandle, (VkMemoryZirconHandlePropertiesFUCHSIA*) pMemoryZirconHandleProperties);
}

#endif



// Provided by VK_FUCHSIA_external_semaphore



#ifdef VK_USE_PLATFORM_FUCHSIA

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_importSemaphoreZirconHandle(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pImportSemaphoreZirconHandleInfo) {
	return (jint) ((PFN_vkImportSemaphoreZirconHandleFUCHSIA) address) ((VkDevice) device, (const VkImportSemaphoreZirconHandleInfoFUCHSIA*) pImportSemaphoreZirconHandleInfo);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getSemaphoreZirconHandle(JNIEnv* env, jobject obj, jlong address, jlong device, jlong pGetZirconHandleInfo, jlong pZirconHandle) {
	return (jint) ((PFN_vkGetSemaphoreZirconHandleFUCHSIA) address) ((VkDevice) device, (const VkSemaphoreGetZirconHandleInfoFUCHSIA*) pGetZirconHandleInfo, (zx_handle_t*) pZirconHandle);
}

#endif



// Provided by VK_QNX_screen_surface



#ifdef VK_USE_PLATFORM_SCREEN_QNX

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_createScreenSurfaceQ(JNIEnv* env, jobject obj, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface) {
	return (jint) ((PFN_vkCreateScreenSurfaceQNX) address) ((VkInstance) instance, (const VkScreenSurfaceCreateInfoQNX*) pCreateInfo, (const VkAllocationCallbacks*) pAllocator, (VkSurfaceKHR*) pSurface);
}

JNIEXPORT jint JNICALL Java_kvb_vulkan_command_Commands_getPhysicalDeviceScreenPresentationSupportQ(JNIEnv* env, jobject obj, jlong address, jlong physicalDevice, jint queueFamilyIndex, jlong window) {
	return (jint) ((PFN_vkGetPhysicalDeviceScreenPresentationSupportQNX) address) ((VkPhysicalDevice) physicalDevice, (uint32_t) queueFamilyIndex, (struct _screen_window*) window);
}

#endif