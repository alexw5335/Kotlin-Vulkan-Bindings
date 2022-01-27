package kvb.vkwrapper.handle

import kvb.core.memory.Addressable.Companion.addressOrNULL
import kvb.core.memory.Allocator
import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.core.memory.direct.DirectByteBuffer
import kvb.core.memory.direct.DirectInt
import kvb.core.memory.direct.DirectIntBuffer
import kvb.vkwrapper.persistent.*
import kvb.vulkan.*

@Suppress("MemberVisibilityCanBePrivate", "unused")
class PhysicalDevice(address: Long, val instance: Instance) : PhysicalDeviceH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = instance.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this



	/*
	Property variables
	 */



	/**
	 * Member implementation of vkEnumerateDeviceLayerProperties.
	 */
	val layers by lazy { layerPropertiesP() }



	/**
	 * Member implementation of vkEnumerateDeviceExtensionProperties.
	 */
	val extensions by lazy { extensionPropertiesP("") }



	/**
	 * Member variable implementation of vkGetPhysicalDeviceProperties.
	 */
	val properties: PhysicalDevicePropertiesP by lazy { propertiesP() }



	/**
	 * Wrapper for [PhysicalDeviceProperties.limits].
	 */
	val limits get() = properties.limits



	/**
	 * Member variable implementation of vkGetPhysicalDeviceFeatures.
	 */
	val features by lazy { featuresP() }



	/**
	 * Member variable implementation of vkGetPhysicalDeviceMemoryProperties.
	 */
	val memoryProperties = memoryPropertiesP()



	/**
	 * Member variable implementation of vkGetPhysicalDeviceQueueFamilyProperties.
	 */
	val queueFamilies = queueFamilyPropertiesP()



	/**
	 * Wrapper for [PhysicalDeviceMemoryProperties.memoryTypes].
	 */
	val memoryTypes = memoryProperties.memoryTypes



	/*
	Layer properties
	 */



	/**
	 * Implementation of vkEnumerateDeviceLayerProperties.
	 */
	fun layerProperties(count: DirectInt, properties: LayerProperties.Buffer?) {
		commands.enumerateDeviceLayerProperties(this, count, properties).check()
	}



	/**
	 * Allocator implementation of vkEnumerateDeviceLayerProperties.
	 */
	fun layerProperties(allocator: Allocator, stack: MemStack = default) = stack.get {
		val count = mallocInt()
		layerProperties(count, null)
		val properties = allocator.LayerProperties(count.value) { }
		layerProperties(count, properties)
		properties
	}



	/**
	 * Persistent implementation of vkEnumerateDeviceLayerProperties.
	 */
	fun layerPropertiesP(stack: MemStack = default) = stack.get {
		val count = mallocInt()
		layerProperties(count, null)
		val properties = LayerProperties(count.value) { }
		layerProperties(count, properties)
		properties.map { LayerPropertiesP(it) }
	}



	/*
	Extension properties
	 */



	/**
	 * Implementation of vkEnumerateDeviceExtensionProperties.
	 */
	fun extensionProperties(layerName: DirectByteBuffer?, count: DirectInt, properties: ExtensionProperties.Buffer?) {
		commands.enumerateDeviceExtensionProperties(this, layerName, count, properties).check()
	}



	/**
	 * Allocator implementation of vkEnumerateDeviceExtensionProperties.
	 */
	fun extensionProperties(allocator: Allocator, layerName: String, stack: MemStack = default) = stack.get {
		val pLayerName = encodeUtf8NT(layerName)
		val count = mallocInt()
		extensionProperties(pLayerName, count, null)
		val properties = allocator.ExtensionProperties(count.value) { }
		extensionProperties(pLayerName, count, properties)
		properties
	}



	/**
	 * Persistent implementation of vkEnumerateDeviceExtensionProperties.
	 */
	fun extensionPropertiesP(layerName: String, stack: MemStack = default) = stack.get {
		val pLayerName = encodeUtf8NT(layerName)
		val count = mallocInt()
		extensionProperties(pLayerName, count, null)
		val properties = ExtensionProperties(count.value) { }
		extensionProperties(pLayerName, count, properties)
		properties.map { ExtensionPropertiesP(it) }
	}



	/*
	Properties
	 */



	/**
	 * Implementation of vkGetPhysicalDeviceProperties.
	 */
	fun properties(properties: PhysicalDeviceProperties) {
		commands.getPhysicalDeviceProperties(self, properties)
	}



	/**
	 * Allocator implementation of vkGetPhysicalDeviceProperties.
	 */
	fun properties(allocator: Allocator): PhysicalDeviceProperties {
		val properties = allocator.PhysicalDeviceProperties { }
		properties(properties)
		return properties
	}



	/**
	 * Persistent implementation of vkGetPhysicalDeviceProperties.
	 */
	fun propertiesP(stack: MemStack = default) = stack.get {
		val properties = PhysicalDeviceProperties { }
		properties(properties)
		PhysicalDevicePropertiesP(properties)
	}



	/*
	Memory properties
	 */



	/**
	 * Implementation of vkGetPhysicalDeviceMemoryProperties.
	 */
	fun memoryProperties(properties: PhysicalDeviceMemoryProperties) {
		commands.getPhysicalDeviceMemoryProperties(self, properties)
	}



	/**
	 * Allocator implementation of vkGetPhysicalDeviceMemoryProperties.
	 */
	fun memoryProperties(allocator: Allocator): PhysicalDeviceMemoryProperties {
		val memoryProperties = allocator.PhysicalDeviceMemoryProperties { }
		commands.getPhysicalDeviceMemoryProperties(self, memoryProperties)
		return memoryProperties
	}



	/**
	 * Persistent implementation of vkGetPhysicalDeviceMemoryProperties.
	 */
	fun memoryPropertiesP(stack: MemStack = default) = stack.get {
		val memoryProperties = PhysicalDeviceMemoryProperties { }
		commands.getPhysicalDeviceMemoryProperties(self, memoryProperties)
		PhysicalDeviceMemoryPropertiesP(memoryProperties)
	}



	/*
	Features
	 */



	/**
	 * Implementation of vkGetPhysicalDeviceFeatures.
	 */
	fun features(features: PhysicalDeviceFeatures) {
		commands.getPhysicalDeviceFeatures(self, features)
	}



	/**
	 * Allocator implementation of vkGetPhysicalDeviceFeatures.
	 */
	fun features(allocator: Allocator): PhysicalDeviceFeatures {
		val features = allocator.PhysicalDeviceFeatures { }
		features(features)
		return features
	}



	/**
	 * Persistent implementation of vkGetPhysicalDeviceFeatures.
	 */
	fun featuresP(stack: MemStack = default) = stack.get {
		val features = PhysicalDeviceFeatures { }
		features(features)
		PhysicalDeviceFeaturesP(features)
	}



	/*
	Queue family properties
	 */



	/**
	 * Implementation of vkGetPhysicalDeviceQueueFamilyProperties.
	 */
	fun queueFamilyProperties(count: DirectInt, properties: QueueFamilyProperties.Buffer?) {
		commands.getPhysicalDeviceQueueFamilyProperties(this, count, properties)
	}



	/**
	 * Allocator implementation of vkGetPhysicalDeviceQueueFamilyProperties.
	 */
	fun queueFamilyProperties(allocator: Allocator, stack: MemStack) = stack.get {
		val count = stack.mallocInt()
		queueFamilyProperties(count, null)
		val properties = allocator.QueueFamilyProperties(count.value) { }
		queueFamilyProperties(count, properties)
		properties
	}



	/**
	 * Persistent implementation of vkGetPhysicalDeviceQueueFamilyProperties.
	 */
	fun queueFamilyPropertiesP(stack: MemStack = default) = stack.get {
		val count = mallocInt()
		queueFamilyProperties(count, null)
		val properties = QueueFamilyProperties(count.value) { }
		queueFamilyProperties(count, properties)
		properties.asList.mapIndexed { i, p -> QueueFamilyPropertiesP(i, self, p) }
	}



	/*
	Format properties
	 */



	/**
	 * Implementation of vkGetPhysicalDeviceFormatProperties.
	 */
	fun formatProperties(format: Format, properties: FormatProperties) {
		commands.getPhysicalDeviceFormatProperties(this, format, properties)
	}



	/**
	 * Allocator implementation of vkGetPhysicalDeviceFormatProperties.
	 */
	fun formatFeatures(allocator: Allocator, format: Format): FormatProperties {
		val properties = allocator.FormatProperties { }
		formatProperties(format, properties)
		return properties
	}



	/**
	 * Persistent implementation of vkGetPhysicalDeviceFormatProperties.
	 */
	fun formatFeaturesP(format: Format, stack: MemStack = default) = stack.get {
		val properties = FormatProperties { }
		formatProperties(format, properties)
		FormatPropertiesP(properties)
	}



	/*
	Surface formats
	 */



	/**
	 * Implementation of vkGetPhysicalDeviceSurfaceFormatsKHR.
	 */
	fun surfaceFormats(surface: Surface, count: DirectInt, formats: SurfaceFormat.Buffer?) {
		commands.getPhysicalDeviceSurfaceFormats(self, surface, count, formats).check()
	}



	/**
	 * Allocator implementation of vkGetPhysicalDeviceSurfaceFormatsKHR.
	 */
	fun surfaceFormats(allocator: Allocator, surface: Surface, stack: MemStack) = stack.get {
		val count = stack.mallocInt()
		surfaceFormats(surface, count, null)
		val formats = allocator.SurfaceFormat(count.value) { }
		surfaceFormats(surface, count, formats)
		formats
	}



	/**
	 * Persistent implementation of vkGetPhysicalDeviceSurfaceFormatsKHR.
	 */
	fun surfaceFormatsP(surface: Surface, stack: MemStack = default) = stack.get {
		val count = mallocInt()
		surfaceFormats(surface, count, null)
		val formats = SurfaceFormat(count.value) { }
		surfaceFormats(surface, count, formats)
		formats.map(::SurfaceFormatP)
	}



	/**
	 * Convenience implementation of vkGetPhysicalDeviceSurfaceFormatsKHR that returns a list of [VkFormat][Format]
	 * rather than a list of [VkSurfaceFormatKHR][SurfaceFormat].
	 */
	fun surfaceFormatsCondensed(surface: Surface, stack: MemStack = default) = stack.get {
		val count = mallocInt()
		surfaceFormats(surface, count, null)
		val formats = SurfaceFormat(count.value) { }
		surfaceFormats(surface, count, formats)
		formats.map { it.format }
	}



	/*
	Surface capabilities
	 */



	/**
	 * Implementation of vkGetPhysicalDeviceSurfaceCapabilities
	 */
	fun surfaceCapabilities(surface: Surface, capabilities: SurfaceCapabilities) {
		commands.getPhysicalDeviceSurfaceCapabilities(this, surface, capabilities).check()
	}



	/**
	 * Allocator implementation of vkGetPhysicalDeviceSurfaceCapabilities
	 */
	fun surfaceCapabilities(allocator: Allocator, surface: Surface): SurfaceCapabilities {
		val capabilities = allocator.SurfaceCapabilities { }
		surfaceCapabilities(surface, capabilities)
		return capabilities
	}



	/**
	 * Persistent implementation of vkGetPhysicalDeviceSurfaceCapabilities.
	 */
	fun surfaceCapabilitiesP(surface: Surface, stack: MemStack = default) = stack.get {
		val capabilities = SurfaceCapabilities { }
		surfaceCapabilities(surface, capabilities)
		SurfaceCapabilitiesP(capabilities)
	}



	/*
	Surface present modes
	 */



	/**
	 * Implementation of vkGetPhysicalDeviceSurfacePresentModesKHR.
	 */
	fun surfacePresentModes(surface: Surface, count: DirectInt, presentModes: DirectIntBuffer?) {
		commands.getPhysicalDeviceSurfacePresentModes(self, surface, count, presentModes).check()
	}



	/**
	 * Allocator implementation of vkGetPhysicalDeviceSurfacePresentModesKHR.
	 */
	fun surfacePresentModes(allocator: Allocator, surface: Surface, stack: MemStack) = stack.get {
		val count = stack.mallocInt()
		surfacePresentModes(surface, count, null)
		val presentModes = allocator.mallocInt(count.value)
		surfacePresentModes(surface, count, presentModes)
		presentModes
	}



	/**
	 * Persistent implementation of vkGetPhysicalDeviceSurfacePresentModesKHR.
	 */
	fun surfacePresentModesP(surface: Surface, stack: MemStack = default) = stack.get {
		val count = mallocInt()
		surfacePresentModes(surface, count, null)
		val presentModes = mallocInt(count.value)
		surfacePresentModes(surface, count, presentModes)
		presentModes.map { mode -> PresentMode.values().first { it.value == mode } }
	}



	/*
	Surface support
	 */



	/**
	 * Implementation of vkGetPhysicalDeviceSurfaceSupportKHR.
	 */
	fun supportsSurface(queueFamilyIndex: Int, surface: Surface, supported: DirectInt) {
		commands.getPhysicalDeviceSurfaceSupport(self, queueFamilyIndex, surface, supported).check()
	}



	/**
	 * Persistent implementation of vkGetPhysicalDeviceSurfaceSupport.
	 */
	fun supportsSurface(queueFamilyIndex: Int, surface: Surface, stack: MemStack = default) = stack.get {
		val supported = mallocInt()
		supportsSurface(queueFamilyIndex, surface, supported)
		supported.value != 0
	}



	/*
	Surface creation
	 */



	/**
	 * Implementation of vkCreateWin32SurfaceKHR.
	 */
	fun createWin32Surface(info: Win32SurfaceCreateInfo, stack: MemStack = default) = stack.get {
		val surface = mallocPointer()
		commands.createWin32Surface(info, null, surface).check()
		Surface(surface.value, self)
	}



	/**
	 * Convenience version of vkCreateWin32SurfaceKHR. Creates a [Surface] that is tied to a native Win32 window.
	 */
	fun createWin32Surface(hinstance: Long, hwnd: Long, stack: MemStack = default) = stack.get {
		val info = Win32SurfaceCreateInfo {
			it.hinstance 	= hinstance
			it.hwnd 		= hwnd
		}

		createWin32Surface(info)
	}



	/*
	Device creation
	 */



	/**
	 * Implementation of vkCreateDevice.
	 */
	fun createDevice(info: DeviceCreateInfo, stack: MemStack = default) = stack.get {
		val device = mallocPointer()
		commands.createDevice(self, info, null, device).check()
		Device(device.value, self)
	}



	/**
	 * Convenience implementation of vkCreateDevice.
	 */
	fun createDevice(
		queues                : List<Pair<QueueFamilyPropertiesP, Int>>  = emptyList(),
		enabledExtensionNames : Collection<String>                       = emptyList(),
		enabledFeatures       : PhysicalDeviceFeatures?                  = null,
		stack                 : MemStack                                 = default
	) = stack.get {
		createDevice(DeviceCreateInfo { deviceCI ->
			deviceCI.enabledExtensionNames = encodeUtf8NTList(enabledExtensionNames)
			deviceCI.pEnabledFeatures = enabledFeatures.addressOrNULL
			deviceCI.queueCreateInfos = DeviceQueueCreateInfo(queues.size) { queueCIs ->
				for(index in queues.indices) {
					queueCIs[index].let {
						it.queueFamilyIndex = queues[index].first.index
						it.queueCount       = queues[index].second
						it.queuePriorities  = mallocFloat(queues[index].second).apply { fill(1.0F) }
					}
				}
			}
		})
	}



	/*
	Memory types
	 */



	fun chooseMemoryType(
		requiredFlags  : MemoryPropertyFlags,
		preferredFlags : MemoryPropertyFlags  = MemoryPropertyFlags(0),
		memoryTypeBits : Int                  = UInt.MAX_VALUE.toInt(),
		failureIndex   : Int                  = -1
	): MemoryTypeP? {
		for(m in memoryTypes)
			if(m.isValid(memoryTypeBits) && m.index > failureIndex && m.flags.contains(requiredFlags + preferredFlags))
				return m

		for(m in memoryTypes)
			if(m.isValid(memoryTypeBits) && m.index > failureIndex && m.flags.contains(requiredFlags))
				return m

		return null
	}



	/*
	Misc.
	 */



	fun alignDownToNonCoherentAtomSize(value: Long): Long {
		val alignment = properties.limits.nonCoherentAtomSize
		return value and (alignment - 1).inv()
	}


	
	fun alignUpToNonCoherentAtomSize(value: Long): Long {
		val alignment = properties.limits.nonCoherentAtomSize
		return (value + (alignment - 1)) and -alignment
	}


}