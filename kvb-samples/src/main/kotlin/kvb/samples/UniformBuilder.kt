package kvb.samples

import kvb.core.memory.Allocator
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.handle.DescriptorPool
import kvb.vkwrapper.handle.DescriptorSet
import kvb.vkwrapper.handle.DescriptorSetLayout

class UniformBuilder(private val pool: DescriptorPool, private val allocator: Allocator) {

}



class Uniform(val set: DescriptorSet, val layout: DescriptorSetLayout, val buffer: Buffer)