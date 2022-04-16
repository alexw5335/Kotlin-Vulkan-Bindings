package kvb.vkwrapper.handle

import kvb.core.memory.addressOrNULL
import kvb.core.memory.stackGet
import kvb.core.memory.stackLazy
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
	Info
	 */



	/**
	 * Member implementation of vkEnumerateDeviceExtensionProperties.
	 */
	val extensions by stackLazy {
		val count = mallocInt()
		commands.enumerateDeviceExtensionProperties(self, null, count, null).check()
		val extensions = ExtensionProperties(count.value) {  }
		commands.enumerateDeviceExtensionProperties(self, null, count, extensions).check()
		extensions.map { it.extensionName.decodeUtf8NT() }
	}



	/**
	 * Member variable implementation of vkGetPhysicalDeviceProperties.
	 */
	val properties by stackLazy {
		val properties = PhysicalDeviceProperties { }
		commands.getPhysicalDeviceProperties(self, properties)
		PhysicalDevicePropertiesP(properties)
	}



	/**
	 * Member variable implementation of vkGetPhysicalDeviceFeatures.
	 */
	val features by stackLazy {
		val features = PhysicalDeviceFeatures { }
		commands.getPhysicalDeviceFeatures(self, features)
		PhysicalDeviceFeaturesP(features)
	}



	/**
	 * Member variable implementation of vkGetPhysicalDeviceMemoryProperties.
	 */
	val memoryProperties by stackLazy {
		val properties = PhysicalDeviceMemoryProperties { }
		commands.getPhysicalDeviceMemoryProperties(self, properties)
		PhysicalDeviceMemoryPropertiesP(properties)
	}



	/**
	 * Member variable implementation of vkGetPhysicalDeviceQueueFamilyProperties.
	 */
	val queueFamilies by stackLazy {
		val count = mallocInt()
		commands.getPhysicalDeviceQueueFamilyProperties(self, count, null)
		val queueFamilies = QueueFamilyProperties(count.value) {  }
		commands.getPhysicalDeviceQueueFamilyProperties(self, count, queueFamilies)
		queueFamilies.mapIndexed { i, p -> QueueFamily(i, self, p) }
	}



	val limits       get() = properties.limits

	val memoryTypes  get() = memoryProperties.memoryTypes

	val isDiscrete   get() = properties.deviceType == PhysicalDeviceType.DISCRETE_GPU

	val isIntegrated get() = properties.deviceType == PhysicalDeviceType.INTEGRATED_GPU

	val isVirtual    get() = properties.deviceType == PhysicalDeviceType.VIRTUAL_GPU

	val isCpu        get() = properties.deviceType == PhysicalDeviceType.CPU



	val combinedSampleCounts = with(limits) {
		framebufferColorSampleCounts *
		framebufferDepthSampleCounts *
		framebufferStencilSampleCounts
	}



	/*
	Surface
	 */



	/**
	 * Implementation of vkGetPhysicalDeviceSurfaceFormatsKHR.
	 */
	fun surfaceFormats(surface: Surface) = stackGet {
		val count = mallocInt()
		commands.getPhysicalDeviceSurfaceFormats(self, surface, count, null).check()
		val formats = SurfaceFormat(count.value) { }
		commands.getPhysicalDeviceSurfaceFormats(self, surface, count, formats).check()
		formats.map(::SurfaceFormatP)
	}



	/**
	 * Implementation of vkGetPhysicalDeviceSurfaceCapabilities.
	 */
	fun surfaceCapabilities(surface: Surface, capabilities: SurfaceCapabilities) {
		commands.getPhysicalDeviceSurfaceCapabilities(this, surface, capabilities).check()
	}



	/**
	 * Implementation of vkGetPhysicalDeviceSurfaceCapabilities.
	 */
	fun surfaceCapabilities(surface: Surface) = stackGet {
		val capabilities = SurfaceCapabilities { }
		commands.getPhysicalDeviceSurfaceCapabilities(self, surface, capabilities).check()
		SurfaceCapabilitiesP(capabilities)
	}



	/**
	 * Implementation of vkGetPhysicalDeviceSurfacePresentModesKHR.
	 */
	fun surfacePresentModes(surface: Surface) = stackGet {
		val count = mallocInt()
		commands.getPhysicalDeviceSurfacePresentModes(self, surface, count, null).check()
		val presentModes = mallocInt(count.value)
		commands.getPhysicalDeviceSurfacePresentModes(self, surface, count, presentModes).check()
		presentModes.map(::_PresentMode)
	}



	/**
	 * Implementation of vkGetPhysicalDeviceSurfaceSupportKHR.
	 */
	fun supportsSurface(queueFamily: QueueFamily, surface: Surface) = stackGet {
		val supported = mallocInt()
		commands.getPhysicalDeviceSurfaceSupport(self, queueFamily.index, surface, supported).check()
		supported.value == VK_TRUE
	}



	/*
	Surface creation
	 */



	/**
	 * Implementation of vkCreateWin32SurfaceKHR.
	 */
	fun createWin32Surface(hinstance: Long, hwnd: Long) = stackGet {
		val info = Win32SurfaceCreateInfo {
			it.hinstance 	= hinstance
			it.hwnd 		= hwnd
		}

		val surface = mallocLong()
		commands.createWin32Surface(info, null, surface).check()
		Surface(surface.value, self)
	}



	/*
	Device creation
	 */



	/**
	 * Convenience implementation of vkCreateDevice.
	 */
	fun createDevice(
		queueFamily : QueueFamily,
		extensions  : Collection<String>       = emptyList(),
		features    : PhysicalDeviceFeatures?  = null
	) = stackGet {
		val queueCI = DeviceQueueCreateInfo {
			it.queueFamilyIndex = queueFamily.index
			it.queueCount = 1
			it.pQueuePriorities = wrapFloat(1.0F).address
		}

		val info = DeviceCreateInfo {
			it.queueCreateInfos = queueCI.asBuffer
			it.pEnabledFeatures = features.addressOrNULL
			it.enabledExtensionNames = encodeUtf8NTList(extensions)
		}

		val device = mallocLong()
		commands.createDevice(self, info, null, device).check()
		Device(device.value, self)
	}



	/*
	Memory types
	 */



	fun chooseMemoryType(
		property1      : MemoryPropertyFlags,
		property2      : MemoryPropertyFlags  = MemoryPropertyFlags(0),
		property3      : MemoryPropertyFlags  = MemoryPropertyFlags(0),
		memoryTypeBits : Int                  = UInt.MAX_VALUE.toInt(),
		failureIndex   : Int                  = -1
	): MemoryTypeP? {
		val validTypes = memoryTypes.filter {
			it.isValid(memoryTypeBits) && it.index > failureIndex
		}

		for(m in validTypes)
			if(m.flags.contains(property1 + property2 + property3))
				return m

		for(m in memoryTypes)
			if(m.flags.contains(property1 + property2))
				return m

		for(m in memoryTypes)
			if(m.flags.contains(property1))
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


	/*
	Formats
	 */



	/**
	 * Persistent implementation of vkGetPhysicalDeviceFormatProperties.
	 */
	fun formatProperties(format: Format) = stackGet {
		val properties = FormatProperties { }
		commands.getPhysicalDeviceFormatProperties(self, format, properties)
		FormatPropertiesP(properties)
	}



}