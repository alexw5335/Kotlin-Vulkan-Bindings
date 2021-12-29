package writer.procedural

object JniGeneration {


	private fun functionName(packageName: String, className: String, functionName: String): String {
		return "Java_" + packageName.replace('.', '_') + '_' + className + '_' + functionName
	}



	private val MODIFIERS    = listOf("JNIEXPORT")

	private val MODIFIERS2   = listOf("JNICALL")

	private val DEFAULT_ARGS = listOf("JNIEnv*" to "env", "jobject" to "obj")



	fun createCFunction(
		packageName  : String,
		className    : String,
		functionName : String,
		returnType   : String?,
		params       : List<Pair<String, String>>,
		contents     : String?
	) = CFunction(
		modifiers  = MODIFIERS,
		returnType = returnType,
		modifiers2 = MODIFIERS2,
		name       = functionName(packageName, className, functionName),
		params     = DEFAULT_ARGS + params,
		contents   = contents
	)


}