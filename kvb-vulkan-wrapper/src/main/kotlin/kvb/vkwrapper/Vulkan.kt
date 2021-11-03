package kvb.vkwrapper

import kvb.core.memory.Allocator
import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks
import kvb.core.memory.direct.DirectByteBuffer
import kvb.core.memory.direct.DirectInt
import kvb.vkwrapper.exception.VkCommandException
import kvb.vkwrapper.persistent.ExtensionPropertiesP
import kvb.vkwrapper.persistent.LayerPropertiesP
import kvb.vulkan.*
import kvb.vulkan.command.StandaloneCommands
import kvb.vkwrapper.handle.Instance

/**
 * Encapsulates standalone Vulkan commands that are not associated with an Instance nor with a Device. This object must
 * be initialised from the main thread.
 */
object Vulkan {


	/**
	 * A persistent storage of memory.
	 */
	val mem = MemStack(MemStacks.meta, 1L shl 20) // 1 MB



	/*
	Instance
	 */



	/**
	 * Implementation of vkCreateInstance.
	 */
	fun createInstance(info: InstanceCreateInfo, stack: MemStack = MemStacks.default) = stack.get {
		val instance = mallocPointer()
		StandaloneCommands.createInstance(info, null, instance).check()
		Instance(instance.value)
	}



	/**
	 * Convenience implementation of vkCreateInstance.
	 */
	fun createInstance(
		appName       : String         = "app",
		appVersion    : VkVersion      = VkVersion(1, 0, 0),
		engineName    : String         = "engine",
		engineVersion : VkVersion      = VkVersion(1, 0, 0),
		apiVersion    : VkVersion      = instanceVersion,
		layers        : List<String>   = emptyList(),
		extensions    : List<String>   = emptyList(),
		stack         : MemStack       = MemStacks.default
	) = stack.get {
		val appInfo = ApplicationInfo {
			it.applicationName 		= encodeUtf8NT(appName)
			it.applicationVersion 	= appVersion.value
			it.engineName 			= encodeUtf8NT(engineName)
			it.engineVersion 		= engineVersion.value
			it.apiVersion 			= apiVersion.value
		}

		val info = InstanceCreateInfo {
			it.applicationInfo 			= appInfo
			it.enabledLayerNames 		= encodeUtf8NTList(layers)
			it.enabledExtensionNames 	= encodeUtf8NTList(extensions)
		}

		createInstance(info, stack)
	}



	/*
	Version
	 */



	/**
	 * Persistent member variable implementation of vkEnumerateInstanceVersion.
	 */
	val instanceVersion by lazy { instanceVersion() }



	/**
	 * Implementation of vkEnumerateInstanceVersion.
	 */
	fun instanceVersion(stack: MemStack = MemStacks.default) = stack.get {
		val version = mallocInt()
		StandaloneCommands.enumerateInstanceVersion(version).check()
		VkVersion(version.value)
	}



	/*
	Layers and extensions
	 */



	/**
	 * Persistent member variable implementation of vkEnumerateInstanceLayerProperties.
	 */
	val layers by lazy { layerPropertiesP() }

	/**
	 * Persistent member variable implementation of vkEnumerateInstanceExtensionProperties.
	 */
	val extensions by lazy { extensionPropertiesP("") }



	/*
	Layer properties
	 */



	/**
	 * Implementation of vkEnumerateInstanceLayerProperties.
	 */
	fun layerProperties(count: DirectInt, properties: LayerProperties.Buffer?) {
		StandaloneCommands.enumerateInstanceLayerProperties(count, properties).check()
	}



	/**
	 * Allocator implementation of vkEnumerateInstanceLayerProperties.
	 */
	fun layerProperties(allocator: Allocator, stack: MemStack = MemStacks.default) = stack.get {
		val count = mallocInt()
		layerProperties(count, null)
		val properties = allocator.LayerProperties(count.value) { }
		layerProperties(count, properties)
		properties
	}



	/**
	 * Persistent implementation of vkEnumerateInstanceLayerProperties.
	 */
	fun layerPropertiesP(stack: MemStack = MemStacks.default) = stack.get {
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
	 * Implementation of vkEnumerateInstanceExtensionProperties.
	 */
	fun extensionProperties(layerName: DirectByteBuffer?, count: DirectInt, properties: ExtensionProperties.Buffer?) {
		StandaloneCommands.enumerateInstanceExtensionProperties(layerName, count, properties).check()
	}



	/**
	 * Allocator implementation of vkEnumerateInstanceExtensionProperties.
	 */
	fun extensionProperties(allocator: Allocator, layerName: String, stack: MemStack = MemStacks.default) = stack.get {
		val pLayerName = encodeUtf8NT(layerName)
		val count = mallocInt()
		extensionProperties(pLayerName, count, null)
		val properties = allocator.ExtensionProperties(count.value) { }
		extensionProperties(pLayerName, count, properties)
		properties
	}



	/**
	 * Persistent implementation of vkEnumerateInstanceExtensionProperties.
	 */
	fun extensionPropertiesP(layerName: String, stack: MemStack = MemStacks.default) = stack.get {
		val pLayerName = encodeUtf8NT(layerName)
		val count = mallocInt()
		extensionProperties(pLayerName, count, null)
		val properties = ExtensionProperties(count.value) { }
		extensionProperties(pLayerName, count, properties)
		properties.map { ExtensionPropertiesP(it) }
	}


}