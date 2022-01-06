package codegen.writer

import java.io.Writer
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.div

/**
 * A [CodeWriter] that can write formatted C source code.
 */
@Suppress("unused")
class CWriter(writer: Writer) : CodeWriter(writer) {


	constructor(path: Path) : this(Files.newBufferedWriter(path))

	constructor(path: String) : this(Paths.get(path))



	companion object {

		inline fun write(directory: Path, fileName: String, block: CWriter.() -> Unit) {
			CWriter(directory / "$fileName.c").use(block)
		}

		inline fun writeHeader(directory: Path, fileName: String, block: CWriter.() -> Unit) {
			CWriter(directory / "$fileName.h").use(block)
		}

	}



	/*
	Preprocessor declarations
	 */



	fun includes(includes: Iterable<String>) = declaration {
		for(i in includes)
			writeln("#include <$i>")
	}



	fun includes(vararg includes: String) = declaration {
		for(i in includes)
			writeln("#include <$i>")
	}



	fun define(string: String) {
		declaration("#define $string")
	}



	fun ifdef(string: String) {
		declaration("#ifdef $string")
	}



	fun endif() {
		declaration("#endif")
	}



	fun pragmaOnce() {
		declaration("#pragma once")
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
			for(l in lines) writeln(" * $l")
			writeln(" */")
		}
	}



	override fun doc(lines: List<String>) {
		declaration {
			writeln("/*")
			for(l in lines) writeln(" * $l")
			writeln(" */")
		}

		spacing = 0
	}



	/*
	Block declarations
	 */



	fun function(signature: String, multilineContents: String) = declaration {
		writeln(signature)
		braced { writeMultiline(multilineContents) }
	}



	inline fun function(signature: String, block: () -> Unit) = declaration(noStyle) {
		write(signature)
		braced(block)
	}



	/*
	Procedural declarations
	 */



	fun function(function: CFunction) = declaration(noStyle) {
		with(function) {
			for(m in modifiers) {
				write(m)
				write(' ')
			}

			write(returnType ?: "void")
			write(' ')

			for(m in modifiers2) {
				write(m)
				write(' ')
			}

			write(name)
			write('(')

			for((index, param) in params.withIndex()) {
				write(param.first)
				write(' ')
				write(param.second)
				if(index != params.lastIndex) write(", ")
			}

			write(')')

			if(contents != null) braced {
				writeMultiline(contents)
			} else {
				newline()
			}
		}
	}


}