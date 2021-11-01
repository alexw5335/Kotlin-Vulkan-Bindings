package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.vulkan.scraper.element.VkVar
import kvb.codegen.writer.procedural.Primitive
import kvb.core.struct.StructLayout
import kvb.core.struct.StructLayoutBuilder
import kvb.codegen.vulkan.scraper.list.VkElementList

class VkTypeStruct(override val name: String, val isUnion: Boolean) : VkType {


	val shortName = VkGenUtils.structShortName(name)



	/*
	Type implementation
	 */



	/**
	 * All structs are generated (Does not take into account extension deprecation, which is handled separately).
	 */
	override val shouldGen = true

	/**
	 * Edge-case for the getAccelerationStructureMemoryRequirementsNV command, which refers to vkMemoryRequirements2KHR
	 * which is an alias for VkMemoryRequirements2. This is the only case where a struct alias is referred to in a
	 * command.
	 */
	override val genName = if(name == "VkMemoryRequirements2KHR") "MemoryRequirements2" else shortName

	/**
	 * No structs are passed by value in Vulkan anyway. If any were, they would be passed by reference through jni.
	 */
	override val primitive = Primitive.LONG



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