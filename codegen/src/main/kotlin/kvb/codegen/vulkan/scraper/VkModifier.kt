package kvb.codegen.vulkan.scraper

/**
 * A hack to identify modifiers in front of Vulkan parameters. If the Vulkan spec is updated with new combinations of
 * modifiers, then this class must be updated. The [identifier] is how the modifier appears in the vk.xml registry file.
 * The [castName] is used in JNI files to cast java data types to the appropriate Vulkan type.
 */
enum class VkModifier(val isPointer: Boolean, val identifier: String?, val castName: (String) -> String) {


	POINTER(     true,  "*",              { "$it*" }),

	POINTER2(    true,  "**",             { "$it**" }),

	C_POINTER(   true,  "const *",        { "const $it*" }),

	S_POINTER(   true,  "struct *",       { "struct $it*" }),

	S_POINTER2(  true,  "struct **",      { "struct $it**" }),

	C_S_POINTER( true,  "const struct *", { "const struct $it*" }),

	C2_POINTER2( true,  "const * const*", { "const $it* const*" }),

	ARRAY(       false, null,             { "$it*" }),

	NONE(        false, null,             { it });


}