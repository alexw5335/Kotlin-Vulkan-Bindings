gcc -shared "kvb-vulkan/src/main/c/vk_commands.c" ^
-o "natives/windows/vk_commands.dll" ^
-I "%JAVA_HOME%/include" ^
-I "%JAVA_HOME%/include/win32" ^
-I "%VULKAN_SDK%/include/vulkan" ^
-D VK_USE_PLATFORM_WIN32_KHR