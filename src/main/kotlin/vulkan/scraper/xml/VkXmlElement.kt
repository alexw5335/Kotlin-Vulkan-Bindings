package vulkan.scraper.xml

import java.lang.IllegalArgumentException

class VkXmlElement(
	val type       : String,
	val attributes : Map<String, String>,
	val children   : List<VkXmlElement>,
	val text       : String?
) {


	/*
	Elements
	 */



	fun getElement(type: String) = children.first { it.type == type }

	fun getElements(type: String) = children.filter { it.type == type }

	fun getElementOrNull(type: String) = children.firstOrNull { it.type == type }



	/*
	Attributes
	 */



	operator fun get(key: String) = attributes[key]

	fun attrib(key: String) = attributes[key] ?: throw IllegalArgumentException("No attribute '$key' in '$this'")

	val textNotNull get() = text ?: throw IllegalStateException("text is null.")



	/*
	String formatting
	 */



	fun printAll(prefix: String = "") {
		print(prefix)
		println(toString())

		for(c in children)
			c.printAll(prefix + "\t")
	}



	override fun toString() = buildString {
		val reset  = "\u001B[0m"
		val red    = "\u001B[31m"
		val green  = "\u001B[32m"
		val yellow = "\u001B[33m"

		append(type)
		append(' ')

		for((name, value) in attributes)
			append("$red$name$reset=$yellow$value$reset ")

		if(text != null)
			append("$green\"$text\"$reset")
	}


}