#include <jni.h>
#include <vulkan.h>



VkBool32 printMessage(VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity,
					  VkDebugUtilsMessageTypeFlagsEXT messageTypes,
					  const VkDebugUtilsMessengerCallbackDataEXT* pCallbackData,
					  void* pUserData) {
	char* severity = NULL;

	if(VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT == messageSeverity)
		severity = "ERROR";
	else if(VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT == messageSeverity)
		severity = "INFO";
	else if(VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT == messageSeverity)
		severity = "WARNING";
	else if(VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT == messageSeverity)
		severity = "VERBOSE";

	char *types[3];
	int counter = 0;

	if((VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT & messageTypes) > 0)
		types[counter++] = "GENERAL";
	if((VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT & messageTypes) > 0)
		types[counter++] = "PERFORMANCE";
	if((VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT & messageTypes) > 0)
		types[counter++] = "VALIDATION";

	printf("[%s", severity);

	for(int i = 0; i < counter; i++)
		printf(", %s", types[i]);
	printf("] - ");

	printf("%s\n", pCallbackData->pMessage);

	return 0;
}



JNIEXPORT jlong JNICALL Java_kvb_vkwrapper_DebugUtils_defaultCallbackAddress() {
	return (jlong) printMessage;
}