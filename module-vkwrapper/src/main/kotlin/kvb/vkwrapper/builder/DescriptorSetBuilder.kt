package kvb.vkwrapper.builder

import kvb.core.memory.DirectList
import kvb.core.memory.MemStack
import kvb.vkwrapper.handle.*
import kvb.vulkan.*

class DescriptorSetBuilder(private val pool: DescriptorPool, private val stack: MemStack) {


	var flags = DescriptorSetLayoutCreateFlags(0)

	private val bindings = DirectList(stack) { DescriptorSetLayoutBinding(it) { } }

	private val writes = DirectList(stack) { WriteDescriptorSet(it) { } }

	private val copies = DirectList(stack) { CopyDescriptorSet(it) { } }



	/*
	Bindings
	 */



	fun binding(
		binding : Int,
		type    : DescriptorType,
		count   : Int,
		stages  : ShaderStageFlags
	) {
		bindings.buffer[bindings.next].let {
			it.binding = binding
			it.descriptorType = type
			it.descriptorCount = count
			it.stageFlags = stages
		}
	}



	fun binding(type: DescriptorType, stages: ShaderStageFlags) {
		binding(bindings.size, type, 1, stages)
	}



	/*
	Build
	 */



	fun build(): DescriptorSet {
		val layoutCI = stack.DescriptorSetLayoutCreateInfo {
			it.flags = flags
			it.bindingCount = bindings.size
			it.pBindings = bindings.address
		}

		val layout = pool.device.createDescriptorSetLayout(layoutCI)
		val set = pool.allocateDescriptorSet(layout)

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



	fun bufferWrite(buffer: Buffer, offset: Long = 0L, size: Long = buffer.size) {
		val binding = bindings.buffer[bindings.size - 1]

		val bufferInfo = stack.DescriptorBufferInfo {
			it.buffer = buffer
			it.offset = offset
			it.range = size
		}

		writes.buffer[writes.next].let {
			it.dstBinding = binding.binding
			it.dstArrayElement = 0
			it.descriptorCount = 1
			it.descriptorType = binding.descriptorType
			it.bufferInfo = bufferInfo.asBuffer
		}
	}



	fun imageWrite(sampler: Sampler, imageView: ImageView, imageLayout: ImageLayout) {
		val binding = bindings.buffer[bindings.size - 1]

		val imageInfo = stack.DescriptorImageInfo {
			it.sampler = sampler
			it.imageView = imageView
			it.imageLayout = imageLayout
		}

		writes.buffer[writes.next].let {
			it.dstBinding      = binding.binding
			it.dstArrayElement = 0
			it.descriptorCount = 1
			it.descriptorType  = binding.descriptorType
			it.imageInfo       = imageInfo.asBuffer
		}
	}


}