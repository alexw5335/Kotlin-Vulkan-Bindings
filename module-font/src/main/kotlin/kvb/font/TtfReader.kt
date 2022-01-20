package kvb.font

import kvb.core.binary.BinaryReader
import java.lang.Integer.min

class TtfReader(private val reader: BinaryReader) {


	val numCodepoints = 127

	private var cmapOffset = 0
	private var glyfOffset = 0
	private var headOffset = 0
	private var hheaOffset = 0
	private var hmtxOffset = 0
	private var locaOffset = 0
	private var maxpOffset = 0

	private var unitsPerEM = 0
	private var indexToLocFormat = 0
	private var numGlyphs = 0
	private var ascent = 0
	private var descent = 0
	private var lineGap = 0
	private var numHMetrics = 0
	private var lastAdvanceWidth = 0
	private lateinit var glyphOffsets: IntArray
	private val codepointMap = IntArray(numCodepoints)




	fun parse() {
		parseTableDirectory()
		parseHead()
		parseMaxp()
		parseHhea()
		parseHmtx()
		parseLoca()
		parseCmap()

		for(i in codepointMap.indices) {
			println("$i -> ${codepointMap[i]}")
		}
	}



	private fun parseTableDirectory() {
		reader.pos += 4
		val numTables = reader.u16()
		reader.pos += 6

		for(i in 0 until numTables) {
			val tag = reader.ascii4()
			reader.pos += 4
			val offset = reader.u32()
			reader.pos += 4

			when(tag) {
				"cmap" -> cmapOffset = offset
				"glyf" -> glyfOffset = offset
				"head" -> headOffset = offset
				"hhea" -> hheaOffset = offset
				"hmtx" -> hmtxOffset = offset
				"loca" -> locaOffset = offset
				"maxp" -> maxpOffset = offset
			}
		}
	}



	private fun parseHead() {
		reader.pos = headOffset
		reader.pos += 18
		unitsPerEM = reader.u16()
		reader.pos += 30
		indexToLocFormat = reader.s16()
	}



	private fun parseMaxp() {
		reader.pos = maxpOffset
		reader.pos += 4
		numGlyphs = reader.u16()
	}



	private fun parseHhea() {
		reader.pos = hheaOffset
		reader.pos += 4
		ascent = reader.s16()
		descent = reader.s16()
		lineGap = reader.s16()
		reader.pos += 8
		reader.pos += 16
		numHMetrics = reader.u16()
	}



	private fun parseHmtx() {
		reader.pos = hmtxOffset + (numHMetrics - 1) * 4
		lastAdvanceWidth = reader.u16()
	}



	private fun parseLoca() {
		reader.pos = locaOffset

		glyphOffsets = if(indexToLocFormat == 0)
			IntArray(numGlyphs) { reader.u16() * 2 }
		else
			IntArray(numGlyphs) { reader.u32() }
	}



	private fun parseCmap() {
		reader.pos = cmapOffset
		reader.pos += 2
		val numTables = reader.u16()

		for(i in 0 until numTables) {
			reader.pos = cmapOffset + 4 + i * 8 + 4
			reader.pos = cmapOffset + reader.u32()
			val format = reader.u16()
			reader.pos += 4

			if(format == 4) {
				parseCmap4()
				return
			}
		}

		throw RuntimeException("No valid cmap formats found")
	}



	private fun parseCmap4() {
		val segCount = reader.u16() / 2
		reader.pos += 6

		val endCodes = IntArray(segCount) { reader.u16() }

		reader.pos += 2

		val startCodes = IntArray(segCount) { reader.u16() }
		val idDeltas = IntArray(segCount) { reader.s16() }
		val idRangeOffsets = IntArray(segCount) { reader.u16() }
		val glyphIdsOffset = reader.pos

		for(i in 0 until segCount) {
			val start = startCodes[i]
			val end = endCodes[i]
			val delta = idDeltas[i]
			val offset = idRangeOffsets[i]

			if(start >= numCodepoints) break

			for(c in start until min(end + 1, numCodepoints)) {
				if(offset == 0) {
					codepointMap[c] = (c + delta) % 65535
				} else {
					reader.pos = glyphIdsOffset + (offset + c - start) * 2
					var glyphId = reader.u16()
					if(glyphId != 0)
						glyphId = (glyphId + delta) % 65535
					codepointMap[c] = glyphId
				}
			}
		}
	}


}