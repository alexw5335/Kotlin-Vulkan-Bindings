package kvb.font

import kvb.core.binary.BigEndian
import kvb.core.binary.BinaryReader
import java.nio.file.Files
import java.nio.file.Paths

fun main() {
	TtfReader(BinaryReader(Files.readAllBytes(Paths.get("res/fonts/arial.ttf")), BigEndian)).parse()
}