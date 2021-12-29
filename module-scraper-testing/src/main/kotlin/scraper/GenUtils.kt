package scraper.scraper

import scraper.err
import scraper.properties.Primitive
import java.util.regex.Pattern

object GenUtils {


	/*
	Naming
	 */



	private val camelCaseRegex = Pattern.compile("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])").toRegex()

	internal val String.camelToSnakeCase get() = replace(camelCaseRegex, "_").uppercase()



	/*
	Primitives
	 */



	/**
	 * A map of C primitive names to Java/JNI [Primitive]s.
	 */
	private val primitiveMap = mapOf(
		"char" to Primitive.BYTE,
		"signed char" to Primitive.BYTE,
		"unsigned char" to Primitive.BYTE,

		"short" to Primitive.SHORT,
		"signed short" to Primitive.SHORT,
		"unsigned short" to Primitive.SHORT,

		"int" to Primitive.INT,
		"signed int" to Primitive.INT,
		"unsigned int" to Primitive.INT,

		"float" to Primitive.FLOAT,
		"double" to Primitive.DOUBLE,

		"int8_t" to Primitive.BYTE,
		"uint8_t" to Primitive.BYTE,
		"int16_t" to Primitive.SHORT,
		"uint16_t" to Primitive.SHORT,
		"int32_t" to Primitive.INT,
		"uint32_t" to Primitive.INT,
		"int64_t" to Primitive.LONG,
		"uint64_t" to Primitive.LONG,

		"void*" to Primitive.LONG,
		"void" to Primitive.LONG,

		"size_t" to Primitive.LONG
	)



	/**
	 * Resolves a C primitive type by its [name], returning a JVM [Primitive] representation.
	 */
	fun resolvePrimitive(name: String) = primitiveMap[name] ?: err("Unrecognised primitive: $name")



	/*
	Native types
	 */




	/**
	 * Maps the names of platform-specific types to the JVM [Primitive] that will be used to represent them. This is
	 * currently an incomplete list. Most of these types are opaque pointers that are represented by [Primitive.LONG].
	 */
	private val nativeTypeMap = mapOf(
		/* Windows */

		// Pointer
		"HWND" to Primitive.LONG,

		// Pointer
		"HINSTANCE" to Primitive.LONG,

		// Long Pointer to Const Wide-Char String (UTF-16LE).
		"LPCWSTR" to Primitive.LONG,

		// Pointer
		"HMONITOR" to Primitive.LONG,

		// Pointer
		"HANDLE" to Primitive.LONG,

		// Struct of DWORD, LPVOID, and BOOL. Only used as a pointer.
		"SECURITY_ATTRIBUTES" to Primitive.LONG,

		// 32-bit unsigned int
		"DWORD" to Primitive.INT,

		/* Apple */

		// Opaque type. Only used as a pointer.
		"CAMetalLayer" to Primitive.LONG,

		/* Android */

		// Opaque type. Only used as a pointer.
		"ANativeWindow" to Primitive.LONG,

		// Opaque type. Only used as a pointer.
		"AHardwareBuffer" to Primitive.LONG,
	)



	/**
	 * Note: Currently returns [Primitive.LONG] by default for types that are not yet implemented in [nativeTypeMap].
	 * This should throw an exception instead when all native types have been implemented.
	 */
	fun resolveNative(name: String) = nativeTypeMap[name] ?: Primitive.LONG


}