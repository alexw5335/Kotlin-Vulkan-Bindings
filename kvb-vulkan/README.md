*Incomplete README*

# Vulkan bindings

Bindings are generated directly from the
[vk.xml](https://github.com/KhronosGroup/Vulkan-Headers/blob/master/registry/vk.xml) file in the Vulkan Headers
repository. All bindings are found within the [kvb.vulkan](src/main/kotlin/kvb/vulkan) package.

### Generation
The bindings are not organised by version nor by extension provider. All types and commands from the latest version of
Vulkan are generated. Types that are not generated include:
- Aliased types
- Aliased commands
- Bitmasks/enums with no values (e.g. VkMemoryMapFlags)
- Types and commands from deprecated, disabled, or promoted extensions
- The VkStructureType enum

### Naming
All Vulkan types have had their Vk prefix removed. All extension postfixes have been removed except where removal
would cause naming conflicts, e.g. with VkAccelerationStructureKHR and VkAccelerationStructureNV. Handle types are
postfixed with 'H', e.g. 'InstanceH' and 'DeviceH'. This is so that wrapper classes can use the name 'Instance' and
'Device' while extending the handle classes. FlagBits enums are **not** generated. They are represented by their Flags
bitmask. Enums have had their common prefixes removed, so 'VK_ACCESS_INDEX_READ_BIT' becomes 'AccessFlags.INDEX_READ',
and 'VK_PHYSICAL_DEVICE_TYPE_OTHER' becomes 'PhysicalDeviceType.OTHER'.

### Enums

Vulkan enums are represented either by plain enums or by value classes. Value classes are preferred when the enum must
be obtained frequently from its value.

### Bitmasks

All bitmasks are represented by value classes, with their FlagBits enums being stored in a companion object. All 
bitmasks have bitwise functions and inline builder functions. Value classes are not typedefs/typealiases. They define
truly new types that ensure type-safety.

c:
```c
    VkAccessFlags flags = VK_ACCESS_INDEX_READ_BIT | VK_ACCESS_TRANSFER_READ_BIT
```

kotlin:
```kotlin
    val flags = AccessFlags { INDEX_READ + TRANSFER_READ }
```

### Type-safety
Almost all struct members and command parameters have been made type-safe, with the exception of:
- String pointers
- Enum arrays
- Bitmask arrays
- Handle arrays
