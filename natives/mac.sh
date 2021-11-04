#!/bin/bash env

clang -shared "kvb-vulkan/src/main/c/vk_commands.c" \
-o "natives/mac/vk_commands.dylib" \
-I "$JAVA_HOME/include" \
-I "$JAVA_HOME/include/darwin" \
-I "$VULKAN_SDK/include/vulkan" \
-D VK_USE_PLATFORM_METAL_EXT

clang -shared "kvb-vulkan-wrapper/src/main/c/debug_utils.c" \
-o "natives/mac/debug_utils.dylib" \
-I "$JAVA_HOME/include" \
-I "$JAVA_HOME/include/darwin" \
-I "$VULKAN_SDK/include/vulkan"

clang -shared "kvb-core/src/main/c/file_utils.c" \
-o "natives/mac/file_utils.dylib" \
-I "$JAVA_HOME/include" \
-I "$JAVA_HOME/include/darwin"