package vulkan.generation

import vulkan.scraper.element.VkVar
import vulkan.scraper.type.VkTypeEnum
import vulkan.scraper.type.VkTypeStruct

object VkDocUtils {


	private val VkVar.docType: String get() = when {
		isPointerToArray 	-> type.name + "**"
		isPointer 			-> type.name + "*"
		else 				-> type.name
	}



	private val VkVar.docName: String get() = when {
		isPointer && mustBeNull -> "$name (must be null)"

		isPointerToArray 		-> name

		isArray -> when {
			constLen != null 	-> "$name[$constLen]"
			varLen != null 		-> "$name[$varLen]"
			altLen != null 		-> "$name[$altLen]"
			else 				-> "$name[]"
		}

		mustBeNull	 			-> "$name (reserved, must be zero)"
		else 					-> name
	}



	val VkTypeStruct.formatDoc get() = ArrayList<String>().also { list ->
		val maxLength = members.maxOfOrNull { it.docType.length + 2 } ?: 0

		if(isUnion)
			list.add("    union $name")
		else
			list.add("    struct $name {")

		for(m in members) {
			val type = m.docType
			var string = "        $type"
			repeat(maxLength - type.length) { string += ' ' }
			string += m.docName
			list.add(string)
		}

		list.add("    }")
	}



	val VkTypeEnum.docStrings get() = ArrayList<String>().also { list ->
		val maxLength = entries.maxOfOrNull { it.shortName.length + 2} ?: 0

		list.add("    enum $name {")

		for(e in entries) {
			var string = "        ${e.shortName}"
			repeat(maxLength - e.shortName.length) { string += ' ' }
			string += "= ${e.enumValue}"
			list.add(string)
		}

		list.add("    }")
	}


}