package kvb.engine.gui

class BaseStyle(val block: Base.() -> Unit) {


	private val bases = ArrayList<Base>()

	fun add(base: Base) {
		bases.add(base)
		block(base)
	}

	fun remove(base: Base) = bases.remove(base)

	fun apply() = bases.forEach(block)



	companion object {
		val NULL = BaseStyle { }
	}


}