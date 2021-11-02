package kvb.codegen.vulkan.scraper

import kvb.codegen.writer.procedural.Primitive
import kvb.codegen.vulkan.scraper.xml.VkXmlElement

object VkScraperUtils {


	/*
	Exceptions
	 */



	class VkScrapeException(message: String) : RuntimeException(message)

	fun err(message: String): Nothing = throw VkScrapeException(message)

	fun err(message: String, element: VkXmlElement): Nothing = err("$message. element=$element")

	fun err(element: VkXmlElement): Nothing = err("invalid element: $element")



	/*
	Primitives
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

		"size_t" to Primitive.LONG
	)



	fun resolvePrimitive(name: String) = primitiveMap[name] ?: err("Unrecognised primitive: $name")



	/*
	Native types
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



	fun resolveNativeType(name: String) = nativeTypeMap[name] ?: Primitive.LONG


}