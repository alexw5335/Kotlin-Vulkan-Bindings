package kvb.engine.gui

import kvb.engine.gui.event.*
import kvb.engine.gui.layout.*
import kvb.engine.gui.model.BaseModel

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

	var padding = Padding(0F, 0F, 0F, 0F)
		set(value) { field = value; onInteriorChanged() }



	var model: BaseModel? = null

	protected val children = ArrayList<Base>()

	var transparent = false

	var active = true

	var parent: Base? = null

	val handlers = ArrayList<BaseEventHandler<*>>()

	protected var shouldAlign = false



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



	protected fun addChildInternal(child: Base) {
		children.add(child)

		child.parent?.removeChildInternal(child)
		child.parent = this
		onInteriorChanged()
	}



	protected fun removeChildInternal(child: Base) {
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

	open fun pressAction(event: PressEvent) { }

	open fun mouseEnterAction(event: MouseEnterEvent) { }

	open fun mouseExitAction(event: MouseExitEvent) { }

	open fun holdAction(event: HoldEvent) { }

	open fun releaseAction(event: ReleaseEvent) { }

	open fun clickAction(event: ClickEvent) { }



	fun hoverEvent(cursorX: Float, cursorY: Float) = HoverEvent(this, cursorX, cursorY).bubble()

	fun pressEvent(cursorX: Float, cursorY: Float) = PressEvent(this, cursorX, cursorY).bubble()

	fun mouseEnterEvent(cursorX: Float, cursorY: Float) = MouseEnterEvent(this, cursorX, cursorY).bubble()

	fun mouseExitEvent(cursorX: Float, cursorY: Float) = MouseExitEvent(this, cursorX, cursorY).bubble()

	fun holdEvent(cursorX: Float, cursorY: Float, originX: Float, originY: Float, hovered: Boolean) = HoldEvent(this, cursorX, cursorY, originX, originY, hovered).bubble()

	fun releaseEvent(cursorX: Float, cursorY: Float) = ReleaseEvent(this, cursorX, cursorY).bubble()

	fun clickEvent(cursorX: Float, cursorY: Float) = ClickEvent(this, cursorX, cursorY).bubble()



	fun onHover(action: (HoverEvent) -> Unit) = handlers.add(HoverEvent.Handler(action))

	fun onPress(action: (PressEvent) -> Unit) = handlers.add(PressEvent.Handler(action))

	fun onMouseEnter(action: (MouseEnterEvent) -> Unit) = handlers.add(MouseEnterEvent.Handler(action))

	fun onMouseExit(action: (MouseExitEvent) -> Unit) = handlers.add(MouseExitEvent.Handler(action))

	fun onHold(action: (HoldEvent) -> Unit) = handlers.add(HoldEvent.Handler(action))

	fun onRelease(action: (ReleaseEvent) -> Unit) = handlers.add(ReleaseEvent.Handler(action))

	fun onClick(action: (ClickEvent) -> Unit) = handlers.add(ClickEvent.Handler(action))



	/*
	Alignment
	 */



	protected open fun align() { }



	fun alignCycle() {
		if(shouldAlign) align()
		for(c in children) c.alignCycle()
	}


	/*
	Update
	 */



	protected open fun update() { }



	fun updateCycle() {
		update()

		for(child in children)
			child.updateCycle()
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



	/*
	Alignment
	 */



	fun hAlign(alignment: Alignment, child: Base) = when(alignment) {
		Alignment.START  -> child.x = padding.left
		Alignment.END    -> child.x = width - padding.right - child.width
		Alignment.CENTRE -> child.x = (width - child.width) / 2
	}

	fun vAlign(alignment: Alignment, child: Base) = when(alignment) {
		Alignment.START  -> child.y = padding.top
		Alignment.END    -> child.y = height - padding.top - child.height
		Alignment.CENTRE -> child.y = (height - child.height) / 2
	}



	/*
	Dimensions
	 */



	var interiorWidth
		get()      = width - padding.horizontal
		set(value) { width = value + padding.left + padding.right }

	var interiorHeight
		get()      = height - padding.vertical
		set(value) { height = value + padding.top + padding.bottom }



	var paddingTop: Float
		get() = padding.top
		set(value) { padding = padding.withTop(value) }

	var paddingRight: Float
		get() = padding.right
		set(value) { padding = padding.withRight(value) }

	var paddingBottom: Float
		get() = padding.bottom
		set(value) { padding = padding.withBottom(value) }

	var paddingLeft: Float
		get() = padding.left
		set(value) { padding = padding.withLeft(value) }


}