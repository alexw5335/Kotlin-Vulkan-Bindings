package scraper.type

import scraper.writer.procedural.Primitive

class VkStruct(
	override val name: String,
	override val genName: String,
	override val shouldGen: Boolean,
	override val primitive: Primitive
) : VkType {


	val members = ArrayList<VkVar>()

	val pNext = ArrayList<VkStruct>()

	val extends = ArrayList<VkStruct>()

	val sType get() = members.first().sType

	var requiresBuffer = false

}