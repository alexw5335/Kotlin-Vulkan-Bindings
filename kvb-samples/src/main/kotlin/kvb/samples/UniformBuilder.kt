package kvb.samples

import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.vkwrapper.handle.DescriptorPool
import kvb.vkwrapper.handle.DescriptorSetLayout
import kvb.vulkan.*

class UniformBuilder(private val pool: DescriptorPool, private val allocator: Allocator) {


	val bindings = DirectList(allocator) { DescriptorSetLayoutBinding(it) }



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


}



class Binding()

interface LayoutMember {
	val offset: Int
}



//class Uniform(val set: DescriptorSet, val layout: DescriptorSetLayout, val buffer: Buffer)