package memory.type

/**
 * A native memory type that can be referenced at a specific [address].
 */
interface Addressable {


	/**
	 * The virtual memory address of this native object. This value must represent a valid native memory address that
	 * can be passed to and from the JNI.
	 */
	val address: Long



	companion object {

		val Addressable?.addressOrNULL get() = this?.address ?: 0L

	}


}