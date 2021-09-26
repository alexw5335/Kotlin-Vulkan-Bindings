package vulkan.scraper.xml

import java.nio.file.Files
import java.nio.file.Paths

/**
 * A simple XML parser for parsing the vk.xml registry file.
 */
class VkXmlParser(private val chars: CharArray) {


	companion object {

		fun parse(file: String) = VkXmlParser(Files.readString(Paths.get(file), Charsets.UTF_8).toCharArray()).parse()

	}



	private var pos = 0



	fun parse(): VkXmlElement {
		pos = 0

		// Skip to the prolog or root element
		while(chars[pos++] != '<') Unit

		// Skip the prolog if it is present
		if(chars[pos] == '?')
			while(chars[pos++] != '>') Unit

		// Skip any comments after prolog
		while(chars[pos] != '<' || chars[pos + 1] == '!') pos++

		return readElement()
	}



	private inline fun readUntil(predicate: (Char) -> Boolean): String {
		val startPos = pos
		while(!predicate(chars[pos])) pos++
		val chars = CharArray(pos - startPos)
		System.arraycopy(this.chars, startPos, chars, 0, chars.size)
		return String(chars)
	}



	private fun appendText(builder: StringBuilder) {
		// Skip leading whitespace
		while(chars[pos].isWhitespace()) pos++

		// Read until the next tag opening
		if(chars[pos] != '<') {
			while(chars[pos] != '<') {
				builder.append(chars[pos++])
			}
		}

		// Skip comments, continue reading between and after comments
		if(chars[pos + 1] == '!') {
			pos += 4 // Skip <!--
			while(chars[pos++] != '-') Unit
			pos += 2 // Skip -->

			appendText(builder)
		}
	}



	private fun readElement(): VkXmlElement {
		while(chars[pos++] != '<') Unit

		val type = readUntil { it.isWhitespace() || it == '>' || it == '/' }

		var attributes: MutableMap<String, String>? = null
		var children: MutableList<VkXmlElement>? = null

		while(true) {
			val char = chars[pos++]

			when {
				// End of opening tag
				char == '>' -> break

				// End of opening tag, no closing tag
				char == '/' -> {
					pos++ // skip '>'
					return VkXmlElement(type, attributes ?: emptyMap(), emptyList(), null)
				}

				char.isWhitespace() -> continue

				// Attribute
				else -> {
					pos--
					val attribName = readUntil { it == ' ' || it == '=' }
					while(chars[pos] != '\'' && chars[pos] != '"') pos++
					if(attributes == null) attributes = HashMap()
					val quotationMark = chars[pos++]
					attributes[attribName] = readUntil { it == quotationMark }
					pos++
				}
			}
		}

		val builder = StringBuilder()

		while(true) {
			// Read the text between child tags and comments
			appendText(builder)

			// next char is '<', either a closing tag or a child's opening tag.
			if(chars[pos + 1] == '/') {
				pos++
				while(chars[pos++] != '>') Unit
				val text = if(builder.isEmpty()) null else builder.toString().trimEnd()
				return VkXmlElement(type, attributes ?: emptyMap(), children ?: emptyList(), text)
			} else {
				if(children == null) children = ArrayList()
				children.add(readElement())
			}
		}
	}


}