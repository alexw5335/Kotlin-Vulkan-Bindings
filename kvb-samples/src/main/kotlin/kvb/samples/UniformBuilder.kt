package kvb.samples

import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.vkwrapper.handle.DescriptorPool
import kvb.vulkan.*

class UniformBuilder(
	private val pool: DescriptorPool,
	private val allocator: Allocator
) {


	private var bindingCount = 0

	private var bindings = allocator.DescriptorSetLayoutBinding(5)

	private fun ensureBindingsCapacity() {
		if(bindingCount == bindings.capacity) bindings.let { previous ->
			bindings = allocator.DescriptorSetLayoutBinding(bindingCount * 2)
			Unsafe.copy(previous, bindings)
		}
	}


}



class Binding()

interface LayoutMember {
	val offset: Int
}



//class Uniform(val set: DescriptorSet, val layout: DescriptorSetLayout, val buffer: Buffer)