package kvb.codegen.vulkan.name

class ShortNameList {


	private val shortToFullNames = HashMap<String, String>()

	private val fullToShortNames = HashMap<String, String>()



	fun add(fullName: String, shortName: String) {
		val conflicting = shortToFullNames[shortName]

		if(conflicting != null) {
			fullToShortNames[conflicting] = conflicting
			fullToShortNames[fullName] = fullName
		} else {
			fullToShortNames[fullName] = shortName
		}

		shortToFullNames[shortName] = fullName
	}



	fun get(fullName: String) = fullToShortNames[fullName] ?: fullName


}