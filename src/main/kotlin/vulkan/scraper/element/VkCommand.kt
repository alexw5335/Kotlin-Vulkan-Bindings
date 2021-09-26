package vulkan.scraper.element

import vulkan.scraper.VkScraperUtils
import vulkan.scraper.type.VkType

data class VkCommand(override val name	: String,
					 val type			: Type,
					 val returnType		: VkType?,
					 val params			: List<VkVar>,
					 val aliased		: Boolean = false): VkElement {


	override val shortName = VkScraperUtils.commandShortName(name)



	/**
	 * If this command has a return type.
	 */
	val isReturning get() = returnType != null

	/**
	 * The string that should be used to cast the command's return value in JNI.
	 */
	val returnCast get() = if(returnType != null) "(${returnType.primitive.jniName}) " else ""

	/**
	 * If this command is instance-specific and thus must be loaded using vkGetInstanceProcAddr.
	 */
	val isInstanceCommand get() = type == Type.INSTANCE

	/**
	 * If this command is device-specific and thus must be loaded using vkGetDeviceProcAddr.
	 */
	val isDeviceCommand get() = type == Type.DEVICE

	/**
	 * If this command is not tied to an instance nor to a device.
	 */
	val isStandaloneCommand get() = type == Type.STANDALONE



	/**
	 * Commands are either tied to an instance, to a device, or to neither. A command's type is determined by the type
	 * of its first parameter.
	 */
	enum class Type {
		INSTANCE, DEVICE, STANDALONE;
	}


}