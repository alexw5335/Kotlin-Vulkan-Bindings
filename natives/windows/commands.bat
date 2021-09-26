gcc -shared src\main\c\common\commands.c ^
 -o natives\windows\commands.dll ^
 -I "%JAVA_HOME%\include" ^
 -I "%JAVA_HOME%\include\win32" ^
 -I "%VULKAN_SDK%\include\vulkan" ^
 -L "%VULKAN_SDK%\lib" ^
 -l "vulkan-1" ^
 -D VK_USE_PLATFORM_WIN32_KHR ^