package kvb.engine.gui

import kvb.engine.gui.event.*

open class Base {


	/*
	Variables
	 */



	var x = 0F

	var y = 0F

	var width = 0F
		set(value) { field = value; onSizeChanged() }

	var height = 0F
		set(value) { field = value; onSizeChanged() }



	var model: BaseModel? = null

	protected val children = ArrayList<Base>()

	var transparent = false

	var active = true

	var parent: Base? = null

	val handlers = ArrayList<BaseEventHandler<*>>()

	var padding = Offsets()

	var border = Offsets()

	var margin = Offsets()

	private var shouldAlign = false



	/*
	Changes
	 */



	protected open fun onSizeChanged() {
		parent?.onInteriorChanged()
		shouldAlign = true
	}



	protected open fun onInteriorChanged() {
		shouldAlign = true
	}



	/*
	Hierarchy
	 */



	fun addChildInternal(child: Base) {
		children.add(child)

		child.parent?.removeChildInternal(child)
		child.parent = this
		onInteriorChanged()
	}



	fun removeChildInternal(child: Base) {
		children.remove(child)
		child.parent = null
		onInteriorChanged()
	}



	/*
	Events
	 */



	fun handleEvent(event: BaseEvent) {
		event.handleAction(this)
		handlers.forEach(event::tryHandler)
	}



	open fun hoverAction(event: HoverEvent) { }

	open fun mouseEnterAction(event: MouseEnterEvent) { }

	open fun mouseExitAction(event: MouseExitEvent) { }



	fun hoverEvent(cursorX: Float, cursorY: Float) = HoverEvent(this, cursorX, cursorY).bubble()

	fun mouseEnterEvent(cursorX: Float, cursorY: Float) = MouseEnterEvent(this, cursorX, cursorY).bubble()

	fun mouseExitEvent(cursorX: Float, cursorY: Float) = MouseExitEvent(this, cursorX, cursorY).bubble()



	fun onHover(action: (HoverEvent) -> Unit) = handlers.add(HoverEvent.Handler(action))

	fun onMouseEnter(action: (MouseEnterEvent) -> Unit) = handlers.add(MouseEnterEvent.Handler(action))

	fun onMouseExit(action: (MouseExitEvent) -> Unit) = handlers.add(MouseExitEvent.Handler(action))



	/*
	Alignment
	 */



	protected open fun align() { }



	fun alignCycle() {
		align()
		for(c in children) c.alignCycle()
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