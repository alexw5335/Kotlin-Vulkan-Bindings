gcc -shared "module-vulkan/src/main/c/vk_commands.c" ^
-o "natives/windows/vk_commands.dll" ^
-I "%JAVA_HOME%/include" ^
-I "%JAVA_HOME%/include/win32"

gcc -shared "module-vkwrapper/src/main/c/debug_utils.c" ^
-o "natives/windows/debug_utils.dll" ^
-I "%JAVA_HOME%/include" ^
-I "%JAVA_HOME%/include/win32" ^
-I "%VULKAN_SDK%/include/vulkan"

gcc -shared "module-core/src/main/c/file_utils.c" ^
-o "natives/windows/file_utils.dll" ^
-I "%JAVA_HOME%/include" ^
-I "%JAVA_HOME%/include/win32"

gcc -shared "module-core/src/main/c/image_reading.c" ^
-o "natives/windows/image_reading.dll" ^
-I "%JAVA_HOME%/include" ^
-I "%JAVA_HOME%/include/win32" ^
-I "module-core/src/main/c"

gcc -shared "module-window/src/main/c/winapi.c" ^
-o "natives/windows/winapi.dll" ^
-I "%JAVA_HOME%/include" ^
-I "%JAVA_HOME%/include/win32"