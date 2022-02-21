package kvb.gui

import javax.swing.text.AttributeSet

open class Base {


	/*
	Dimensions
	 */



	var x = 0F

	var y = 0F

	var width = 0F

	var height = 0F



	/*
	Hierarchy
	 */


	var parent: Base? = null

	var children = ArrayList<Base>()



	/*
	Graphics
	 */



	var model: BaseModel? = null



	/*
	Rendering
	 */



	open fun render(x: Float, y: Float, scale: Float) { }



	fun renderAction(x: Float, y: Float, scale: Float) {
		render(x, y, scale)

		val x2 = transformX(x)
		val y2 = transformY(y)
		val scale2 = transformScale(scale)

		for(c in children)
			c.renderAction(x2, y2, scale2)
	}



	/*
	Transformations
	 */



	open fun transformX(x: Float) = this.x + x

	open fun transformY(y: Float) = this.y + y

	open fun transformScale(scale: Float) = scale


}