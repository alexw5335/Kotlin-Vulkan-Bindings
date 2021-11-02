package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.element.VkVar
import kvb.codegen.vulkan.scraper.type.VkTypeEnum
import kvb.codegen.vulkan.scraper.type.VkTypeStruct

@Suppress("unused")
object VkDocUtils {


	private val VkVar.docType: String get() = when {
		isPointerToPointerArray -> type.name + "**"
		isPointer               -> type.name + "*"
		else                    -> type.name
	}



	private val VkVar.docName: String get() = when {
		isPointer && mustBeNull -> "$name (must be null)"
		mustBeNull              -> "$name (reserved, must be zero)"

		isPointerToArray -> name

		isArray -> when {
			constLen != null -> "$name[$constLen]"
			varLen != null   -> "$name[$varLen]"
			altLen != null   -> "$name[$altLen]"
			else             -> "$name[]"
		}

		else -> name
	}



	val VkTypeStruct.docStrings get() = ArrayList<String>().also { list ->
		val maxLength = members.maxOfOrNull { it.docType.length + 2 } ?: 0

		if(isUnion)
			list.add("    union $name {")
		else
			list.add("    struct $name {")

		for(m in members) {
			val type = m.docType
			var string = "        ${m.docType}"
			repeat(maxLength - type.length) { string += ' ' }
			string += m.docName
			list.add(string)
		}

		list.add("    }")

		if(pNextValues.isNotEmpty()) {
			list.add("")
			list.add("    Valid pNext types:")
			for(v in pNextValues) {
				list.add("        - ${v.name}")
			}
		}
	}



	val VkTypeEnum.docStrings get() = ArrayList<String>().also { list ->
		val maxLength = entries.maxOfOrNull { it.name.length + 2} ?: 0

		list.add("    enum $name {")

		for(e in entries) {
			var string = "        ${e.name}"
			repeat(maxLength - e.name.length) { string += ' ' }
			string += "= ${e.valueString}"
			list.add(string)
		}

		list.add("    }")
	}


}