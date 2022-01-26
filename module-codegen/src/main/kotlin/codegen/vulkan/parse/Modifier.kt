package codegen.vulkan.parse

/**
 * A hack to identify modifiers in front of Vulkan parameters. If the Vulkan spec is updated with new combinations of
 * modifiers, then this class must be updated. The [identifier] is how the modifier appears in the vk.xml registry file.
 * The [castName] is used in JNI files to cast java data types to the appropriate Vulkan type.
 */
enum class Modifier(
	val isPointer  : Boolean,
	val identifier : String?,
	val castName   : (String) -> String
) {


	POINTER(  true,  "*",               { "$it*" }),

	POINTER2( true,  "**",              { "$it**" }),

	POINTER3( true,  "const *",         { "const $it*" }),

	POINTER4( true,  "struct *",        { "struct $it*" }),

	POINTER5( true,  "struct **",       { "struct $it**" }),

	POINTER6( true,  "const struct *",  { "const struct $it*" }),

	POINTER7( true,  "const * const*",  { "const $it* const*" }),

	POINTER8( true,  "const * const *", { "const $it* const*" }),

	ARRAY(    false, null,              { "$it*" }),

	NONE(     false, null,              { it });


}