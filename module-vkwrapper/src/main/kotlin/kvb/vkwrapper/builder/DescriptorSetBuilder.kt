package kvb.vkwrapper.builder

import kvb.core.memory.DirectList
import kvb.core.memory.MemStack
import kvb.vkwrapper.handle.DescriptorPool
import kvb.vkwrapper.handle.DescriptorSet
import kvb.vkwrapper.handle.DescriptorSetLayout
import kvb.vulkan.*

class DescriptorSetBuilder(
	private val pool: DescriptorPool,
	private val stack: MemStack
) {

	/*

	Descriptor sets can be bound/updated in bulk for potentially better perfomance.

	- PipelineLayoutCreateInfo
	    - DescriptorSetLayout[]

	- cmdBindDescriptorSets / updateDescriptorSets
	    - DescriptorSet[]
	        - DescriptorSetLayout
	            - DescriptorSetLayoutBinding[]
			- WriteDescriptorSet
				- DescriptorBufferInfo
				- DescriptorImageInfo
			- CopyDescriptorSet

	- DescriptorSet is a 'set' of descriptors.
	- A descriptor describes a resource that a shader can access.
	- A DescriptorSet is bound to an index. Frequently used sets should
	occupy specific indices so that they don't have to be swapped out often.
	- The index of a descriptor set can be explicated in a shader using
	layout(binding = a, set = b). If the set index is not given, then it defaults
	to 0.
	- The 'count' member of DescriptorSetLayoutBinding is used for array descriptors.


	layout(set=0, binding=0) uniform myUniform {
		vec2 pos;
		vec2 rotation;
	};

	layout(set=0, binding=1) texture2D myTexture;

	layout(set=1, binding=0) texture2D myTexture2;

	Each DescriptorSet has a SINGLE DescriptorSetLayout.
	 */



	val bindings = DirectList(stack) { DescriptorSetLayoutBinding(it) { } }

	val writes = DirectList(stack) { WriteDescriptorSet(it) { } }

	val copies = DirectList(stack) { CopyDescriptorSet(it) { } }



	/*
	Layout bindings
	 */



	fun uniform(stage: ShaderStageFlags, count: Int = 1) {
		bindings.buffer[bindings.next].let {
			it.binding = bindings.size
			it.descriptorType = DescriptorType.UNIFORM_BUFFER
			it.descriptorCount = count
			it.stageFlags = stage
		}
	}



	fun vertexUniform() = uniform(ShaderStageFlags.VERTEX)

	fun fragUniform() = uniform(ShaderStageFlags.FRAGMENT)



	/*
	Layouts
	 */



	fun build(): DescriptorSet {

		val set = pool.allocateDescriptorSet(layouts)

		if(writes.size > 0 || copies.size > 0) {
			for(i in 0 until writes.size)
				writes.buffer[i].dstSet = set

			for(i in 0 until copies.size)
				copies.buffer[i].dstSet = set

			pool.device.commands.updateDescriptorSets(writes.size, writes.buffer, copies.size, copies.buffer)
		}

		return set
	}



	/*
	Writes
	 */



	fun uniformBufferWrite(dstArrayElement: Int, descriptorCount: Int, type: DescriptorType) {

	}

	/*
	 struct VkWriteDescriptorSet {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkDescriptorSet          dstSet
 *         uint32_t                 dstBinding
 *         uint32_t                 dstArrayElement
 *         uint32_t                 descriptorCount
 *         VkDescriptorType         descriptorType
 *         VkDescriptorImageInfo*   pImageInfo
 *         VkDescriptorBufferInfo*  pBufferInfo
 *         VkBufferView*            pTexelBufferView
 *     }
	 */



}