package kvb.engine.gui

import kvb.engine.gui.event.BaseEvent
import kvb.engine.gui.event.BaseEventHandler

open class Base {


	/*
	Variables
	 */



	var x = 0F

	var y = 0F

	var width = 0F

	var height = 0F

	var model: BaseModel? = null

	val children = ArrayList<Base>()

	var transparent = false

	var active = true

	var parent: Base? = null

	val handlers = ArrayList<BaseEventHandler>()



	fun addChild(child: Base) {
		children.add(child)

		child.parent?.removeChild(child)
		child.parent = this
	}



	fun removeChild(child: Base) {
		children.remove(child)
		child.parent = null
	}



	fun handleEvent(event: BaseEvent) {
		for(h in handlers) event.tryHandler(h)
		event.handleAction(this)
	}



	/*
	Transformations
	 */



	open fun transformX(x: Float) = x + this.x

	open fun transformY(y: Float) = y + this.y

	open fun transformUpX(x: Float) = x - this.x

	open fun transformUpY(y: Float) = y - this.y



	/*
	Collisions
	 */



	fun boxContains(x: Float, y: Float) =
		x >= this.x && x <= this.x + width &&
		y >= this.y && y <= this.y + height



	open fun contains(x: Float, y: Float) = boxContains(x, y)



	fun checkCollision(x: Float, y: Float): Base? {
		if(!active || !contains(x, y)) return null

		val newX = transformUpX(x)
		val newY = transformUpY(y)

		for(base in children)
			base.checkCollision(newX, newY)?.let { return it }

		if(transparent) return null

		return this
	}



	/*
	Rendering
	 */



	open fun renderThis(x: Float, y: Float) {
		model?.render(this, x, y)
	}



	open fun render(x: Float, y: Float) {
		renderThis(this.x + x, this.y + y)

		val newX = transformX(x)
		val newY = transformY(y)

		for(base in children)
			base.render(newX, newY)
	}


}