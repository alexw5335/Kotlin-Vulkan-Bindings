package memory.struct

/**
 * Builder class for creating [StructLayout]s for structs and unions. Use via the [buildStruct] and [buildUnion]
 * companion functions.
 */
class LayoutBuilder private constructor() {


	/*
	Variables
	 */



	/**
	 * The maximum alignment that has been given by calls to [member]. This will be the final alignment of the struct.
	 */
	private var alignment = 0

	/**
	 * The sizes that have been given by calls to [member].
	 */
	private var sizes = IntArray(10)

	/**
	 * The alignments that have been given by calls to [member].
	 */
	private var alignments = IntArray(10)

	/**
	 * The number of sizes that have been added via calls to [member].
	 */
	private var count = 0

	/**
	 * The maximum size that has been given by calls to [member]. This is only used when building a union.
	 */
	private var maxMemberSize = 0



	/*
	Member creation
	 */



	/**
	 * Adds any type of member with a given [alignment] and [size].
	 */
	fun member(alignment: Int, size: Int) {
		if(count == sizes.size)
			sizes = sizes.copyOf(sizes.size * 2)

		if(count == alignments.size)
			alignments = alignments.copyOf(alignments.size * 2)

		if(size > maxMemberSize)
			maxMemberSize = size

		if(alignment > this.alignment)
			this.alignment = alignment

		sizes[count] = size
		alignments[count] = alignment

		count++
	}



	/**
	 * Adds a primitive member.
	 */
	fun member(size: Int) = member(size, size)

	/**
	 * Adds a struct member.
	 */
	fun member(layout: StructLayout) = member(layout.alignment, layout.size)

	/**
	 * Adds an array member.
	 */
	fun array(alignment: Int, length: Int) = member(alignment, alignment * length)

	/**
	 * Adds a struct array member.
	 */
	fun array(layout: StructLayout, length: Int) = member(layout.alignment, length)



	/*
	Building
	 */



	private fun buildStruct() : StructLayout {
		if(count == 0) return EMPTY_LAYOUT

		val offsets = IntArray(count)
		var offset = 0

		for(i in 0 until count) {
			val mod = offset % alignment

			// A member that exceeds the current alignment multiple is placed at the next multiple of alignment.
			if(mod != 0 && mod + alignments[i] > alignment) {
				offset = offset ceilTo alignment
			}

			offsets[i] = offset
			offset += sizes[i]
		}

		// The final size of the struct must also be rounded up to the nearest multiple of alignment.
		return StructLayout(alignment, size = offset ceilTo alignment, offsets)
	}



	private fun buildUnion(): StructLayout {
		if(count == 0) return EMPTY_LAYOUT

		return StructLayout(alignment, size = maxMemberSize ceilTo alignment, IntArray(count))
	}



	/*
	Companion
	 */



	companion object {


		/**
		 * [Builds][buildStruct] and returns a struct [StructLayout] using the members added by the [block].
		 */
		fun buildStruct(block: LayoutBuilder.() -> Unit) = LayoutBuilder().also(block).buildStruct()



		/**
		 * [Builds][buildUnion] and returns a union [StructLayout] using the members added by the [block].
		 */
		fun buildUnion(block: LayoutBuilder.() -> Unit) = LayoutBuilder().also(block).buildUnion()



		/**
		 * The layout that is returned when a struct or union is built when it has no members.
		 */
		private val EMPTY_LAYOUT = StructLayout(0, 0, IntArray(0))



		/**
		 * Rounds this [Int] up to the nearest multiple of the given [alignment] if it was not already a clean multiple.
		 */
		private infix fun Int.ceilTo(alignment: Int): Int {
			return (this + (alignment - 1)) and -alignment
		}


	}


}