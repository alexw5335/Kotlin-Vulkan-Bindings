package kvb.engine.gui

import kvb.engine.Engine
import kvb.engine.gui.layout.Alignment
import kvb.engine.gui.layout.Padding
import kvb.engine.gui.model.BaseModel
import kvb.window.input.InputButton

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

	var border = Padding(0F, 0F, 0F, 0F)
		set(value) { field = value; onBorderChanged() }

	var model: BaseModel? = null

	protected val children = ArrayList<Base>()

	var transparent = false

	var active = true

	var parent: Base? = null

	val handlers = ArrayList<Pair<Class<*>, (Any) -> Unit>>()

	protected var shouldAlign = true

	val gui get() = Engine.gui

	val isHovered get() = (!gui.dragging || gui.dragFocus == this) && gui.hovered == this

	val isPressed get() = (!gui.dragging || gui.dragFocus == this) && gui.pressed == this

	var style = BaseStyle.NULL
		set(value) {
			field.remove(this)
			field = value
			field.add(this)
		}

	var focussable = false

	var focusOnPress = true



	/*
	Drag
	 */



	open val draggable get() = false

	open val dragThreshold get() = 25F

	open val dragButtons get() = listOf(InputButton.LEFT_MOUSE)

	open val dragPredicate: () -> Boolean = { InputButton.pressed.containsAll(dragButtons) }

	open val dragFromOrigin get() = false

	open val dragImmediately get() = false



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



	protected open fun onBorderChanged() { }



	/*
	Hierarchy
	 */



	protected fun<T : Base> addChildInternal(child: T) : T {
		children.add(child)

		child.parent?.removeChildInternal(child)
		child.parent = this
		onInteriorChanged()
		return child
	}



	protected fun<T : Base> addChildInternal(child: T, block: T.() -> Unit): T {
		block(child)
		addChildInternal(child)
		return child
	}



	protected fun removeChildInternal(child: Base) {
		children.remove(child)
		child.parent = null
		onInteriorChanged()
	}



	/*
	Events
	 */



	inline fun createEvent(block: (Base) -> BaseEvent) = handleEvent(block(this))



	fun handleEvent(event: BaseEvent) {
		if(event.finished) return

		eventAction(event)

		for(h in handlers)
			if(event.isValid(h.first))
				h.second(event)

		parent?.handleEvent(event)
	}



	protected open fun eventAction(event: BaseEvent) {
		when(event) {
			is PressEvent -> {
				if(event.source == this && gui.focussed != this)
					gui.removeFocus()

				if(focussable && focusOnPress)
					gui.assignFocus(this)
			}
		}
	}



	@Suppress("unchecked_cast")
	inline fun<reified T : BaseEvent> addHandler(noinline handler: (T) -> Unit) {
		handlers.add(T::class.java to handler as (Any) -> Unit)
	}



	/*
	Alignment
	 */



	protected open fun align() { }



	fun alignCycle() {
		if(shouldAlign) align()
		shouldAlign = false
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




	/**
	 * From the parent's coordinates to this base's coordinates.
	 */
	open fun transformX(x: Float) = x + this.x

	/**
	 * From the parent's coordinates to this base's coordinates.
	 */
	open fun transformY(y: Float) = y + this.y

	/**
	 * From this base's coordinates to the parent's coordinates.
	 */
	open fun transformUpX(x: Float) = x - this.x

	/**
	 * From this base's coordinates to the parent's coordinates.
	 */
	open fun transformUpY(y: Float) = y - this.y



	/**
	 * From absolute coordinates to this base's coordinate system.
	 */
	fun transformUpXAbsolute(absoluteX: Float): Float =
		transformUpX(parent?.transformUpXAbsolute(absoluteX) ?: absoluteX)

	/**
	 * From absolute coordinates to this base's coordinate system.
	 */
	fun transformUpYAbsolute(absoluteY: Float): Float =
		transformUpY(parent?.transformUpYAbsolute(absoluteY) ?: absoluteY)



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

	fun alignCentre(child: Base) {
		hAlign(Alignment.CENTRE, child)
		vAlign(Alignment.CENTRE, child)
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