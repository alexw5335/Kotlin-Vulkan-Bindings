package writer

import writer.procedural.KFunction
import java.io.Writer
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.div
import kotlin.reflect.KClass

/**
 * A [CodeWriter] that can write formatted Kotlin source code.
 */
@Suppress("FunctionName", "unused")
class KWriter(writer: Writer) : CodeWriter(writer) {


	constructor(path: Path) : this(Files.newBufferedWriter(path))

	constructor(path: String) : this(Paths.get(path))



	companion object {

		inline fun write(directory: Path, fileName: String, block: KWriter.() -> Unit) {
			KWriter(directory / "$fileName.kt").use(block)
		}

	}



	/*
	Styles
	 */



	var classStyle = style(3, 2)

	var companionStyle = Style(1, 1)

	var enumsStyle = Style(1, 0)

	var initStyle = Style(0, 0)

	var startStyle = Style(1, 0)



	/*
	Block declarations
	 */



	inline fun class_(signature: String, style: Style = classStyle, block: () -> Unit) = declaration(style) {
		write(signature)
		braced(block)
	}



	inline fun companion_(style: Style = companionStyle, block: () -> Unit) = declaration(style) {
		write("companion object")
		braced(block)
	}



	inline fun companion_(signature: String, style: Style = companionStyle, block: () -> Unit) = declaration(style) {
		write(signature)
		braced(block)
	}



	inline fun function(signature: String, block: () -> Unit) = declaration(noStyle) {
		write(signature)
		braced(block)
	}



	/*
	Non-block declarations
	 */



	fun package_(packageName: String) {
		declaration("package $packageName")
	}



	fun imports(vararg imports: Any?) = declaration {
		for(import in imports) when(import) {
			is String    -> writeln("import $import")
			is KClass<*> -> writeln("import ${import.qualifiedName}")
		}
	}



	fun enums(enums: List<String>) = declaration(enumsStyle) {
		for(i in 0 until enums.size - 1)
			declaration(enums[i] + ',')

		if(enums.isEmpty())
			declaration("; // This enum is empty.")
		else
			declaration(enums.last() + ';')
	}



	fun annotation(annotation: String) {
		declaration("@$annotation")
		spacing = 0
	}



	fun suppress(vararg suppressions: String, label: String? = null) {
		declaration {
			if(label != null) write("@$label:Suppress(") else write("@Suppress(")

			for(i in 0 until suppressions.size - 1)
				write('"' + suppressions[i] + "\", ")

			writeln('"' + suppressions.last() + "\")")
		}

		spacing = 0
	}



	fun suppressFile(vararg suppressions: String) {
		suppress(*suppressions, label = "file")
		spacing = 1
	}



	fun function(signature: String, multilineContents: String) = declaration(noStyle) {
		write(signature)
		braced { writeMultiline(multilineContents) }
	}



	inline fun init_(style: Style = initStyle, block: () -> Unit) = declaration(style) {
		write("init")
		braced(block)
	}



	inline fun start(style: Style = startStyle, block: () -> Unit) {
		declaration(style, block)
		spacing = 1
	}



	/*
	Comments
	 */



	override fun comment(comment: String) {
		declaration("// $comment")
	}



	override fun multilineComment(lines: List<String>) {
		declaration {
			writeln("/*")
			for(l in lines) writeln(l)
			writeln(" */")
		}
	}



	override fun doc(lines: List<String>) {
		declaration {
			writeln("/**")
			for(l in lines) writeln(" * $l")
			writeln(" */")
		}

		spacing = 0
	}



	override fun groupComment(comment: String) {
		multilineComment(listOf(comment))
	}



	/*
	Procedural declarations
	 */



	fun function(function: KFunction) = declaration(noStyle) {
		with(function) {
			for(m in modifiers) {
				write(m)
				write(' ')
			}

			write("fun")
			if(generics != null) write(generics)
			write(' ')
			write(name)
			write('(')

			for((index, param) in params.withIndex()) {
				write(param.first)
				write(": ")
				write(param.second)
				if(index != params.lastIndex) write(", ")
			}

			write(')')

			if(returnType != null) {
				write(": ")
				write(returnType)
			}

			if(contents != null) braced {
				writeMultiline(contents)
			} else {
				newline()
			}
		}
	}


}