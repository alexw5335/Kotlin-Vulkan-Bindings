package kvb.samples.app

import kvb.core.memory.DirectList
import kvb.core.memory.Unsafe
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.DeviceMemory
import kvb.vulkan.MappedMemoryRange

class Context {


	val memoryRanges = DirectList(Unsafe) { MappedMemoryRange(it) {  } }



	fun lazyFlush(memory: DeviceMemory, offset: Long, size: Long) {
		memoryRanges.buffer[memoryRanges.next].let {
			it.memory = memory
			it.offset = offset
			it.size = size
		}
	}



	fun flush(device: Device) {
		if(memoryRanges.isNotEmpty)
			device.commands.flushMappedMemoryRanges(memoryRanges.size, memoryRanges.buffer)
		memoryRanges.reset()
	}


}