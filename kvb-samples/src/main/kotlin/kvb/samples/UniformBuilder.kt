package kvb.samples

import kvb.core.memory.Allocator
import kvb.core.memory.DirectList
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.handle.DescriptorPool
import kvb.vulkan.*


class DescriptorSetBuilder(private val pool: DescriptorPool, private val allocator: Allocator) {


	val bindings = DirectList(allocator) { DescriptorSetLayoutBinding(it) { } }

	val writes = DirectList(allocator) { WriteDescriptorSet(it) { } }



	fun uniform(stage: ShaderStageFlags, size: Int) {
		bindings.buffer[bindings.next].let {
			it.binding = bindings.size
			it.descriptorType = DescriptorType.UNIFORM_BUFFER
			it.descriptorCount = 1
			it.stageFlags = stage
		}
	}

	fun vertexUniform(size: Int) = uniform(ShaderStageFlags.VERTEX, size)


}



/**
 * Not a comprehensive builder.
 */
class UniformBuilder(private val pool: DescriptorPool, private val allocator: Allocator) {


	val bindings = DirectList(allocator) { DescriptorSetLayoutBinding(it) { } }

	val writes = DirectList(allocator) { WriteDescriptorSet(it) { } }



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

		// TODO: use inline function to inline generics so that generic struct buffers can be used?
		writes.buffer[writes.next].let {

		}
	}


}



class Binding()

interface LayoutMember {
	val offset: Int
}



//class Uniform(val set: DescriptorSet, val layout: DescriptorSetLayout, val buffer: Buffer)