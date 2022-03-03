package kvb.engine.gui

abstract class Pane : Base() {


	val externalChildren = ArrayList<Base>()



	fun addChild(child: Base) {
		externalChildren.add(child)
		addChildInternal(child)
	}



	fun removeChild(child: Base) {
		externalChildren.remove(child)
		removeChildInternal(child)
	}


}