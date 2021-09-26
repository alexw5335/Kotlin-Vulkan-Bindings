package memory

object NativeSizes {


	private external fun long(): Int

	private external fun longLong(): Int

	private external fun longDouble(): Int

	private external fun pointer(): Int

	private external fun sizeT(): Int



	val LONG = long()

	val LONG_LONG = longLong()

	val LONG_DOUBLE = longDouble()

	val POINTER = pointer()

	val SIZE_T = sizeT()


}