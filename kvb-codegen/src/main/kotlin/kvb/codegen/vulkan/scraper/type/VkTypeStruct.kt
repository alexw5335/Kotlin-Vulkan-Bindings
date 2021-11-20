package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.vulkan.scraper.element.VkVar
import kvb.codegen.writer.procedural.Primitive
import kvb.core.struct.StructLayout
import kvb.core.struct.StructLayoutBuilder
import kvb.codegen.vulkan.scraper.list.VkElementList

class VkTypeStruct(override val name: String, val isUnion: Boolean) : VkType {



	/*
	Type implementation
	 */



	override val shortName = VkGenUtils.structShortName(name)

	override val primitive = Primitive.LONG

	override lateinit var provider: VkProvider



	/*
	Lateinit
	 */



	/**
	 * The struct members.
	 */
	val members = VkElementList<VkVar>()

	/**
	 * The valid structure type value (if any) of the sType member of this struct.
	 */
	val sType get() = members.firstOrNull()?.sType

	/**
	 * A list of struct types whose instances may be present in the pNext chain.
	 */
	val pNextValues = ArrayList<VkTypeStruct>()

	/**
	 * A list of struct types whose pNext chains can contain an instance of this struct type.
	 */
	val extends = ArrayList<VkTypeStruct>()

	/**
	 * If a Buffer subclass should be generated for this struct.
	 */
	var requiresBuffer = false

	/**
	 * The 64-bit memory layout of this struct.
	 */
	val layout64: StructLayout by lazy {
		StructLayoutBuilder().build(isUnion) {
			for(m in members) {
				when {
					m.isPointer                           -> member(8)
					m.isArray && m.type is VkTypeStruct   -> array(m.type.layout64, m.constLen!!)
					m.isArray                             -> array(m.type.primitive.size, m.constLen!!)
					m.type is VkTypeStruct                -> member(m.type.layout64)
					else                                  -> member(m.type.primitive.size)
				}
			}
		}
	}

	/**
	 * The 64-bit size of this struct.
	 */
	val size64: Int by lazy { layout64.size }


}