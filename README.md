*This project is a work in progress*

# Kotlin Vulkan bindings

Autogenerated bindings for the Vulkan graphics API in Kotlin, plus native memory management 
utilities.

This library does not use [LWJGL](https://github.com/LWJGL/lwjgl3). It is 
instead intended to be an alternative to LWJGL's Vulkan bindings that takes 
advantage of Kotlin-specific features. Due to the use of Kotlin's inline 
classes and functions, this library *cannot reasonably be used from Java*.

All Vulkan bindings are automatically generated from the 
[Vulkan API registry](https://github.com/KhronosGroup/Vulkan-Headers/tree/master/registry). 
Specifically, from the registry/vk.xml file.

For a detailed overview of the bindings themselves, see the [README](kvb-vulkan/README.md) in the bindings module.

For a detailed overview of how the library handles native off-heap memory, see the [README](kvb-core/README.md) in 
the core module.

## Modules
The library is separated into gradle submodules:

- **core**: Native memory management and platform-specific native library loading
- **vulkan-bindings**: Raw (but mostly type-safe), autogenerated bindings for Vulkan.
- **codegen**: Code generation for vulkan-bindings and core. Should not be used as a dependency.
- **vulkan-wrapper**: A thin wrapper around vulkan-bindings.
- **window**: A simple platform-agnostic windowing system.
- **samples**: Testing for vulkan-wrapper.

Only **core** and **vulkan-bindings** are needed in order to use the library. More detailed summaries can be found in
the individual READMEs in the module folders.



## Overview

### Allocation
Off-heap memory is allocated using the [Allocator](kvb-core/src/main/kotlin/kvb/core/memory/Allocator.kt) interface, which
can describe either heap or linear allocators. This library encourages stack allocation wherever possible. Native stack 
allocation is simulated using the [MemStack](kvb-core/src/main/kotlin/kvb/core/memory/MemStack.kt) class. Struct 
allocations in **kvb-vulkan-bindings** are done using inline functions that take an Allocator as a receiver parameter.



### Sample

Using the bindings:

```kotlin
import kvb.vulkan.*
import kvb.core.memory.MemStacks

fun createInstance() = MemStacks.get {
    val pInstance = mallocPointer()
	
    val appInfo = ApplicationInfo {
        it.applicationName    = encodeUtf8NT("My application")
        it.applicationVersion = VkVersion(1, 0, 0).value
        it.engineName         = encodeUtf8NT("My engine")
        it.engineVersion      = VkVersion(1, 0, 0).value
        it.apiVersion         = VkVersion(1, 2, 0).value
    }
	
    val info = InstanceCreateInfo {
        it.applicationInfo       = appInfo
        it.enabledLayerNames     = encodeUtf8NTList("VK_LAYER_KHRONOS_validation")
        it.enabledExtensionNames = encodeUtf8NTList(listOf("VK_KHR_surface", "VK_KHR_surface_win32"))
    }
	
    StandaloneCommands.createInstance(info, null, pInstance).check()
	
    pInstance.value
}
```

Using the wrapper:

```kotlin
    import kvb.vkwrapper.Vulkan
    import kvb.vulkan.VkVersion

    fun createInstance() = Vulkan.createInstance(
        appName       = "My app",
        appVersion    = VkVersion(1, 0, 0),
        engineName    = "My engine",
        engineVersion = VkVersion(1, 0, 0),
        apiVersion    = VkVersion(1, 2, 0),
        layers        = listOf("VK_LAYER_KHRONOS_validation"),
        extensions    = listOf("VK_KHR_surface", "VK_KHR_surface_win32")
    )
```
