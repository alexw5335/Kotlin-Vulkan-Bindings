package kvb.codegen.writer

import java.io.Writer
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.div

/**
 * A [CodeWriter] that can write formatted NASM-style assembly code.
 */
@Suppress("unused")
class AsmWriter(writer: Writer) : CodeWriter(writer) {
	

	companion object {
		fun write(directory: Path, fileName: String, block: AsmWriter.() -> Unit) {
			AsmWriter(Files.newBufferedWriter(directory / "$fileName.asm")).use(block)
		}
	}




	/*
	Comments
	 */



	override fun comment(comment: String) {
		declaration("; $comment")
	}



	override fun multilineComment(lines: List<String>) {
		declaration {
			for(l in lines) writeln("; $l")
		}
	}



	override fun doc(lines: List<String>) {
		declaration {
			for(l in lines) writeln("; $l")
		}

		spacing = 0
	}


}