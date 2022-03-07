package kvb.engine.gui

import kvb.engine.gui.event.*
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



	var model: BaseModel? = null

	protected val children = ArrayList<Base>()

	var transparent = false

	var active = true

	var parent: Base? = null

	val handlers = ArrayList<BaseEventHandler<*>>()

	var padding = Offsets()

	var border = Offsets()

	var margin = Offsets()

	var shouldAlign = false



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

	open fun mouseEnterAction(event: MouseEnterEvent) { }

	open fun mouseExitAction(event: MouseExitEvent) { }

	open fun pressAction(event: PressEvent) { }

	open fun releaseAction(event: ReleaseEvent) { }

	open fun clickAction(event: ClickEvent) { }



	fun hoverEvent(cursorX: Float, cursorY: Float) = HoverEvent(this, cursorX, cursorY).bubble()

	fun mouseEnterEvent(cursorX: Float, cursorY: Float) = MouseEnterEvent(this, cursorX, cursorY).bubble()

	fun mouseExitEvent(cursorX: Float, cursorY: Float) = MouseExitEvent(this, cursorX, cursorY).bubble()

	fun pressEvent(cursorX: Float, cursorY: Float, originX: Float, originY: Float, hovered: Boolean) = PressEvent(this, cursorX, cursorY, originX, originY, hovered).bubble()

	fun releaseEvent(cursorX: Float, cursorY: Float) = ReleaseEvent(this, cursorX, cursorY).bubble()

	fun clickEvent(cursorX: Float, cursorY: Float) = ClickEvent(this, cursorX, cursorY).bubble()




	fun onHover(action: (HoverEvent) -> Unit) = handlers.add(HoverEvent.Handler(action))

	fun onMouseEnter(action: (MouseEnterEvent) -> Unit) = handlers.add(MouseEnterEvent.Handler(action))

	fun onMouseExit(action: (MouseExitEvent) -> Unit) = handlers.add(MouseExitEvent.Handler(action))

	fun onPress(action: (PressEvent) -> Unit) = handlers.add(PressEvent.Handler(action))

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
	Compound dimensions
	 */




	/** The [width] minus the left and right [padding]. I.e. the usable content width. */
	var interiorWidth
		get()      = width - padding.horizontal
		set(value) { width = value + padding.horizontal }

	/** The [height] minus the top and bottom [padding]. I.e. the usable content height. */
	var interiorHeight
		get()      = height - padding.vertical
		set(value) { height = value + padding.vertical }



	/** The [width] plus the left and right [margin] and [border]. */
	var totalWidth
		get()      = width + margin.horizontal + border.horizontal
		set(value) { width = value - margin.horizontal - border.horizontal }

	/** The [height] plus the top and bottom [margin] and [border]. */
	var totalHeight
		get()      = height + margin.vertical + border.vertical
		set(value) { height = value - margin.vertical - border.vertical }


	/*
	Dimensions
	 */



	/**
	 * Getter-setter pair for the top side of the [padding].
	 */
	var Base.paddingTop: Float
		get() = padding.top
		set(value) { padding = padding.withTop(value) }

	/**
	 * Getter-setter pair for the right side of the [padding].
	 */
	var Base.paddingRight: Float
		get() = padding.right
		set(value) { padding = padding.withRight(value) }

	/**
	 * Getter-setter pair for the bottom side of the [padding].
	 */
	var Base.paddingBottom: Float
		get() = padding.bottom
		set(value) { padding = padding.withBottom(value) }

	/**
	 * Getter-setter pair for the left side of the [padding].
	 */
	var Base.paddingLeft: Float
		get() = padding.left
		set(value) { padding = padding.withLeft(value) }



	/**
	 * Getter-setter pair for the top side of the [border].
	 */
	var Base.borderTop: Float
		get() = border.top
		set(value) { border = border.withTop(value) }

	/**
	 * Getter-setter pair for the right side of the [border].
	 */
	var Base.borderRight: Float
		get() = border.right
		set(value) { border = border.withRight(value) }

	/**
	 * Getter-setter pair for the bottom side of the [border].
	 */
	var Base.borderBottom: Float
		get() = border.bottom
		set(value) { border = border.withBottom(value) }

	/**
	 * Getter-setter pair for the left side of the [border].
	 */
	var Base.borderLeft: Float
		get() = border.left
		set(value) { border = border.withLeft(value) }



	/**
	 * Getter-setter pair for the top side of the [margin].
	 */
	var Base.marginTop: Float
		get() = margin.top
		set(value) { margin = margin.withTop(value) }

	/**
	 * Getter-setter pair for the right side of the [margin].
	 */
	var Base.marginRight: Float
		get() = margin.right
		set(value) { margin = margin.withRight(value) }

	/**
	 * Getter-setter pair for the bottom side of the [margin].
	 */
	var Base.marginBottom: Float
		get() = margin.bottom
		set(value) { margin = margin.withBottom(value) }

	/**
	 * Getter-setter pair for the left side of the [margin].
	 */
	var Base.marginLeft: Float
		get() = margin.left
		set(value) { margin = margin.withLeft(value) }


}