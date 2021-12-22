package kvb.samples.sample0

import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.random.Random

object Circles {


	const val numSections = 100

	const val angle = 2 * PI.toFloat() / numSections

	const val xRadius = 300F

	const val yRadius = 300F

	const val centreX = 0F

	const val centreY = 0F



	val vertices = FloatArray(5 * (numSections + 2)).also {
		it[0] = centreX
		it[1] = centreY
		it[2] = 1.0F
		it[3] = 0F
		it[4] = 0F

		val r = Random.nextFloat()
		val g = Random.nextFloat()
		val b = Random.nextFloat()

		var arrayIndex = 5

		for(sectionIndex in 0..numSections) {
			it[arrayIndex++] = centreX + xRadius * cos(angle*sectionIndex)
			it[arrayIndex++] = centreY + yRadius * sin(angle*sectionIndex)
			it[arrayIndex++] = r
			it[arrayIndex++] = g
			it[arrayIndex++] = b
		}
	}


}