package kvb.vkwrapper.builder

import kvb.core.memory.DirectList
import kvb.core.memory.MemStack
import kvb.vkwrapper.handle.*
import kvb.vulkan.*

class DescriptorSetBuilder(private val pool: DescriptorPool, private val stack: MemStack) {

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

	shaders may share common uniforms, e.g. matrices. The LayoutBinding can be shared, but the
	WriteDescriptorSet cannot, since it targets a specific set.

	The purpose of splitting up bindings between multiple sets is so that sets can be reused
	between shaders. So, sets don't have to constantly be unbound and rebound.

	WriteDescriptorSet doesn't need to supply descriptor type nor binding (both are given by the DescriptorSetLayoutBinding).

	val set = pool.buildSet {
		vertexUniform {
			write(uniform, offset, size)
			write(uniform2, offset2, size2)
			write(image, offset3, size3)
		}

		fragmentUniform {
			write(uniform, offset, size)
		}

		uniform(stages = ShaderStageFlags { VERTEX + FRAGMENT }) {

		}
	}

	val sets = pool.buildSets {
		set {
			uniform {
				write()
			}

			uniform {
				write()
			}
		}

		set {

		}
	}

	val set = pool.buildSet {

	}
	
	binding(0) {
		vec2() // location = 0
		vec2() // location = 1, offset = 8
	}


	vertexBinding(0, VertexInputRate.INSTANCE) {
		int(location = 1)
	}

	vertexBinding(0, 20) {
		vertexAttribute(0, 0, Format.R8G8B8A8_SFLOAT, 0)
		vertexAttribute(1, 0, Format.R8G8B8A8_SFLOAT, 32)
	}

	vertexBinding(0) {
		vec4()
		vec4()
	}



	 */



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



	fun binding(type: DescriptorType, count: Int, stages: ShaderStageFlags) {
		bindings.buffer[bindings.next].let {
			it.binding = bindings.size - 1
			it.descriptorType = type
			it.descriptorCount = count
			it.stageFlags = stages
		}
	}



	fun combinedSampler(count: Int, stages: ShaderStageFlags) = binding(DescriptorType.COMBINED_IMAGE_SAMPLER, count, stages)

	fun uniform(count: Int, stages: ShaderStageFlags) = binding(DescriptorType.UNIFORM_BUFFER, count, stages)



	fun vertexUniform(
		buffer          : Buffer,
		offset          : Long = 0,
		size            : Long,
		dstArrayElement : Int = 0,
		count           : Int = 1
	) {
		uniform(count, ShaderStageFlags.VERTEX)
		write(buffer, offset, size, dstArrayElement, count)
	}



	fun fragmentCominedSampler(
		imageLayout     : ImageLayout,
		imageView       : ImageView,
		sampler         : Sampler,
		dstArrayElement : Int = 0,
		count           : Int = 1
	) {
		combinedSampler(count, ShaderStageFlags.FRAGMENT)
		write(sampler, imageView, imageLayout, dstArrayElement)
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



	fun write(
		buffer          : Buffer,
		offset          : Long,
		size            : Long,
		dstArrayElement : Int = 0,
		descriptorCount : Int = 1
	) {
		val binding = bindings.buffer[bindings.size - 1]

		val bufferInfo = stack.DescriptorBufferInfo {
			it.buffer = buffer
			it.offset = offset
			it.range = size
		}

		writes.buffer[writes.next].let {
			it.dstBinding = binding.binding
			it.dstArrayElement = dstArrayElement
			it.descriptorCount = descriptorCount
			it.descriptorType = binding.descriptorType
			it.bufferInfo = bufferInfo.asBuffer
		}
	}



	fun write(
		sampler         : Sampler,
		imageView       : ImageView,
		imageLayout     : ImageLayout,
		dstArrayElement : Int = 0,
		descriptorCount : Int = 1
	) {
		val binding = bindings.buffer[bindings.size - 1]

		val imageInfo = stack.DescriptorImageInfo {
			it.sampler = sampler
			it.imageView = imageView
			it.imageLayout = imageLayout
		}

		writes.buffer[writes.next].let {
			it.dstBinding = binding.binding
			it.dstArrayElement = dstArrayElement
			it.descriptorCount = descriptorCount
			it.descriptorType = binding.descriptorType
			it.imageInfo = imageInfo.asBuffer
		}
	}


}