package scraper.type

import scraper.naming.Named

class VkCommand(
	override val name : String,
	val genName       : String,
	val shouldGen     : Boolean,
	val returnType    : VkType?,
	val params        : List<VkVar>
) : Named {


	val type = when {
		name == "vkGetDeviceProcAddr"                  -> Type.INSTANCE
		params.first().type.name == "vkInstance"       -> Type.INSTANCE
		params.first().type.name == "VkPhysicalDevice" -> Type.INSTANCE
		params.first().type.name == "VkDevice"         -> Type.DEVICE
		params.first().type.name == "VkQueue"          -> Type.DEVICE
		params.first().type.name == "VkCommandBuffer"  -> Type.DEVICE
		else                                           -> Type.STANDALONE
	}



	enum class Type {
		INSTANCE, DEVICE, STANDALONE;
	}


}