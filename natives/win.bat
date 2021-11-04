gcc -shared "kvb-vulkan/src/main/c/vk_commands.c" ^
-o "natives/windows/vk_commands.dll" ^
-I "%JAVA_HOME%/include" ^
-I "%JAVA_HOME%/include/win32" ^
-I "%VULKAN_SDK%/include/vulkan" ^
-D VK_USE_PLATFORM_WIN32_KHR

gcc -shared "kvb-vulkan-wrapper/src/main/c/debug_utils.c" ^
-o "natives/windows/debug_utils.dll" ^
-I "%JAVA_HOME%/include" ^
-I "%JAVA_HOME%/include/win32" ^
-I "%VULKAN_SDK%/include/vulkan"

gcc -shared "kvb-core/src/main/c/file_utils.c" ^
-o "natives/windows/file_utils.dll" ^
-I "%JAVA_HOME%/include" ^
-I "%JAVA_HOME%/include/win32"

gcc -shared "kvb-window/src/main/c/winapi.c" ^
-o "natives/windows/winapi.dll" ^
-I "%JAVA_HOME%/include" ^
-I "%JAVA_HOME%/include/win32"