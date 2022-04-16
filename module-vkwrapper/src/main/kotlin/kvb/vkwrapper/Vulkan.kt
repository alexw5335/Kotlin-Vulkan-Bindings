package kvb.vkwrapper

import kvb.core.memory.*
import kvb.vkwrapper.handle.Instance
import kvb.vkwrapper.persistent.*
import kvb.vulkan.*

/**
 * Encapsulates global Vulkan commands that are not associated with an Instance nor with a Device. This object must be
 * initialised from the main thread.
 */
object Vulkan {


	/**
	 * Implementation of vkCreateInstance.
	 */
	fun createInstance(
		appName       : String             = "My App",
		appVersion    : Version            = Version(1, 0, 0),
		engineName    : String             = "My Engine",
		engineVersion : Version            = Version(1, 0, 0),
		apiVersion    : Version            = version,
		layers        : Collection<String> = emptyList(),
		extensions    : Collection<String> = emptyList()
	) = stackGet {
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

		val pointer = mallocLong()
		Commands.createInstance(info, null, pointer).check()
		Instance(pointer.value)
	}



	/**
	 * Implementation of vkEnumerateInstanceVersion.
	 */
	val version by stackLazy {
		val version = mallocInt()
		Commands.enumerateInstanceVersion(version).check()
		Version(version.value)
	}



	/**
	 * Implementation of vkEnumerateInstanceLayerProperties.
	 */
	val layers by stackLazy {
		val count = mallocInt()
		Commands.enumerateInstanceLayerProperties(count, null).check()
		val layers = LayerProperties(count.value) { }
		Commands.enumerateInstanceLayerProperties(count, layers).check()
		layers.map { it.layerName.decodeUtf8NT() }
	}



	/**
	 * Implementation of vkEnumerateInstanceExtensionProperties.
	 */
	val extensions by stackLazy {
		val count = mallocInt()
		Commands.enumerateInstanceExtensionProperties(null, count, null).check()
		val extensions = ExtensionProperties(count.value) {  }
		Commands.enumerateInstanceExtensionProperties(null, count, extensions).check()
		extensions.map { it.extensionName.decodeUtf8NT() }
	}


}