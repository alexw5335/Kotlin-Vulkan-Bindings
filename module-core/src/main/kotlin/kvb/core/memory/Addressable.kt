package kvb.core.memory

/**
 * A native memory type that can be referenced at a specific [address].
 */
interface Addressable {


	/**
	 * The virtual memory address of this native object. This value must represent a valid native memory address that
	 * can be passed to and from the JNI.
	 */
	val address: Long


}