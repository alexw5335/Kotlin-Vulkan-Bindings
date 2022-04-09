package kvb.engine.gui.layout

enum class DualAlignment(val hAlignment: Alignment, val vAlignment: Alignment) {


	TOP_LEFT(Alignment.START, Alignment.START),

	TOP_CENTRE(Alignment.CENTRE, Alignment.START),

	TOP_RIGHT(Alignment.END, Alignment.START),



	CENTRE_LEFT(Alignment.START, Alignment.CENTRE),

	CENTRE_CENTRE(Alignment.CENTRE, Alignment.CENTRE),

	CENTRE_RIGHT(Alignment.END, Alignment.CENTRE),



	BOTTOM_LEFT(Alignment.START, Alignment.END),

	BOTTOM_CENTRE(Alignment.CENTRE, Alignment.END),

	BOTTOM_RIGHT(Alignment.END, Alignment.END);


	fun withHorizontal(hAlignment: Alignment) = of(hAlignment, vAlignment)

	fun withVertical(vAlignment: Alignment) = of(hAlignment, vAlignment)



	companion object {
		val values = values()
		fun of(hAlignment: Alignment, vAlignment: Alignment) = values[vAlignment.ordinal * 3 + hAlignment.ordinal]
	}


}