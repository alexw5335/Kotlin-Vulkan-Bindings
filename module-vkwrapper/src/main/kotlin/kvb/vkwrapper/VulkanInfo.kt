package kvb.vkwrapper

import kvb.core.memory.*
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.persistent.LayerPropertiesP
import kvb.vulkan.*

/**
 * Encapsulates standalone Vulkan commands that are not associated with an Instance nor with a Device. This object must
 * be initialised from the main thread.
 */
object VulkanInfo {


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
		layers.map { LayerPropertiesP(it) }
	}



	/**
	 * Implementation of vkEnumerateInstanceExtensionProperties.
	 */
	val extensions by stackLazy {
		val count = mallocInt()
		Commands.enumerateInstanceExtensionProperties(null, count, null).check()
		val extensions = ExtensionProperties(count.value) {  }
		Commands.enumerateInstanceExtensionProperties(null, count, extensions).check()
	}


}