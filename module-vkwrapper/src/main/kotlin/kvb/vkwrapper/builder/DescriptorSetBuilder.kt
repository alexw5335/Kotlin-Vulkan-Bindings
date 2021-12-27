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


	val layouts = ArrayList<DescriptorSetLayout>()

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



	fun layout(block: () -> Unit): DescriptorSetLayout {
		bindings.reset()
		block()

		val layout = pool.device.createDescriptorSetLayout(stack.DescriptorSetLayoutCreateInfo {
			it.pBindings = bindings.address
			it.bindingCount = bindings.size
		}, stack = stack)

		bindings.reset()
		layouts.add(layout)
		return layout
	}



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