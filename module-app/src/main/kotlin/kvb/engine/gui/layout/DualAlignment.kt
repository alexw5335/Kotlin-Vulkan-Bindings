package kvb.engine.gui.layout

enum class DualAlignment(val hAlignment: Alignment, val vAlignment: Alignment) {


	TOP_LEFT(Alignment.START, Alignment.START),

	TOP_CENTRE(Alignment.CENTRE, Alignment.START),

	TOP_RIGHT(Alignment.END, Alignment.START),



	CENTRE_LEFT(Alignment.START, Alignment.CENTRE),

	CENTRE(Alignment.CENTRE, Alignment.CENTRE),

	CENTRE_RIGHT(Alignment.END, Alignment.CENTRE),



	BOTTOM_LEFT(Alignment.START, Alignment.END),

	BOTTOM_CENTRE(Alignment.CENTRE, Alignment.END),

	BOTTOM_RIGHT(Alignment.END, Alignment.END);


}