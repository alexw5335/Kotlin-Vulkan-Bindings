package kvb.font

import kvb.core.binary.BigEndian
import kvb.core.binary.BinaryReader
import java.nio.file.Paths

fun main() {
	TtfReader(BinaryReader(Paths.get("res/fonts/arial.ttf"), BigEndian)).parse()
}