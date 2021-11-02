gcc -shared "kvb-vulkan/src/main/c/vk_commands.c" ^
-o "natives/windows/vk_commands.dll" ^
-I "natives/include/windows/jni" ^
-I "natives/include/common/vulkan" ^
-D VK_USE_PLATFORM_WIN32_KHR