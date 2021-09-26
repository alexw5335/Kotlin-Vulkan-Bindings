package vulkan.scraper.type

import memory.Primitive

/**
 * Used for any native type, e.g. HWND, HMODULE, LPCSTR. NOTE: Native types are not fully implemented yet. their sizes
 * may be incorrect. JNI should be used to determine their sizes. Their sizes may have to be determined at runtime.
 * These types will never be made type-safe in structs and commands. Rather, they will always be referred to by their
 * [jniType].
 */
data class VkTypeNative(
	override val name      : String,
	override val primitive : Primitive,
	override val aliased   : Boolean = false
): VkType {


	override val genName = primitive.kName


}