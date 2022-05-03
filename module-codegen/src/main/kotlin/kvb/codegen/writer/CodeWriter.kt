package kvb.codegen.writer

import java.io.Writer
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.div

@Suppress("Unused")
open class CodeWriter(private val writer: Writer) : AutoCloseable by writer {


	companion object {
		fun write(directory: Path, fileName: String, block: CodeWriter.() -> Unit) {
			CodeWriter(Files.newBufferedWriter(directory / fileName)).use(block)
		}
	}



	var atNewline = false

	var indent = 0

	var spacing = 0

	var currentStyle = Style(1, 1)



	class Style(val decSpacing: Int, val braceSpacing: Int)

	fun style(decSpacing: Int, braceSpacing: Int = 0) = Style(decSpacing, braceSpacing)



	/*
	Newline
	 */



	private fun checkNewline() {
		if(atNewline) {
			writer.write('\n'.code)
			for(i in 0 until indent)
				writer.write('\t'.code)
			atNewline = false
		}
	}

	fun newline() {
		checkNewline()
		atNewline = true
	}

	fun newlines(count: Int) {
		for(i in 0 until count)
			newline()
	}

	fun resetNewline() {
		atNewline = false
	}



	/*
	Basic writing
	 */



	fun write(string: String) {
		checkNewline()
		writer.write(string)
	}

	fun write(char: Char) {
		checkNewline()
		writer.write(char.code)
	}

	fun writeln(string: String) {
		write(string)
		newline()
	}

	fun writeln(char: Char) {
		write(char)
		newline()
	}

	fun writeMultiline(string: String) {
		string.trimIndent().lines().forEach(::writeln)
	}



	/*
	Declarations
	 */



	fun styled(style: Style, block: () -> Unit) {
		val prev = currentStyle
		currentStyle = style
		block()
		currentStyle = prev
	}

	fun indented(block: () -> Unit) {
		indent++
		block()
		indent--
	}

	fun indentedDeclaration(signature: String, block: () -> Unit) {
		declaration {
			writeln(signature)
			indented(block)
		}
	}

	fun braced(block: () -> Unit) {
		writeln(" {")
		indented(block)
		newlines(currentStyle.braceSpacing)
		writeln('}')
	}

	fun declaration(style: Style = currentStyle, block: () -> Unit) {
		styled(style) {
			newlines(spacing)
			spacing = style.braceSpacing
			block()
		}

		spacing = currentStyle.decSpacing
	}

	fun declaration(line: String) = declaration {
		writeln(line)
	}

	fun multilineDeclaration(lines: String) = declaration {
		writeMultiline(lines)
	}

	fun group(spacing: Int, block: () -> Unit) {
		declaration(Style(spacing, 0), block)
	}

	fun group(comment: String, spacing: Int, block: () -> Unit) {
		groupComment(comment)
		group(spacing, block)
	}



	/*
	Comments
	 */



	open fun comment(comment: String) { }

	open fun multilineComment(lines: List<String>) { }

	open fun multilineComment(singleLine: String) = multilineComment(listOf(singleLine))

	open fun doc(lines: List<String>) { }

	open fun doc(singleLine: String) = doc(listOf(singleLine))

	open fun autogenComment() = comment("This file has been automatically generated.")

	open fun groupComment(comment: String) = comment(comment)


}