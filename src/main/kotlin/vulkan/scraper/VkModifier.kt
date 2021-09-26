package vulkan.scraper

/**
 * A hack to identify modifiers in front of Vulkan parameters. If the Vulkan spec is updated with new combinations of
 * modifiers, then this class must be updated. The [identifier] is how the modifier appears in the vk.xml registry file.
 * The [castName] is used in JNI files to cast java data types to the appropriate Vulkan type.
 */
enum class VkModifier(val identifier: String?, val castName: (String) -> String) {


	POINTER(                     "*",                { "$it*" }),

	POINTER_POINTER(             "**",               { "$it**" }),

	CONST_POINTER(               "const *",          { "const $it*" }),

	STRUCT_POINTER(              "struct *",         { "struct $it*" }),

	STRUCT_POINTER_POINTER(      "struct **",        { "struct $it**" }),

	CONST_STRUCT_POINTER(        "const struct *",   { "const struct $it*" }),

	CONST_POINTER_CONST_POINTER( "const * const*",   { "const $it* const*" }),

	ARRAY(                       null,               { "$it*" }),

	CONST_ARRAY(                 null, 				 { "const $it*" }),

	NONE(                        null, 				 { it });


}