package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.core.memory.direct.DirectByteBuffer
import kvb.core.memory.direct.DirectLong
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.persistent.MemoryTypeP
import kvb.vulkan.*

/**
 * For relatively small total allocation size (under 256 MB) the DEVICE_LOCAL with HOST_VISIBLE is the perfect
 * MemoryType for CPU upload to GPU cases: the CPU can directly write into GPU memory which the GPU can then access
 * without reading across the PCIe bus.
 */
class DeviceMemory(
	address    : Long,
	val device : Device,
	val size   : Long,
	val type   : MemoryTypeP
) : DeviceMemoryH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkFreeMemory.
	 */
	fun free() = commands.freeMemory(this, null)



	/*
	Mapping
	 */



	/**
	 * If this memory is currently host-mapped. This is set to true when vkMapMemory is called and set to false when
	 * vkUnmapMemory is called.
	 */
	var mapped = false; private set

	/**
	 * The memory address that was returned by vkMapMemory. Only usable when [mapped] is true.
	 */
	var mappedAddress = 0L; private set

	/**
	 * The memory offset that was given to vkMapMemory. Only usable when [mapped] is true.
	 */
	var mappedOffset = 0L; private set

	/**
	 * The memory size that was given to vkMapMemory. Only usable when [mapped] is true.
	 */
	var mappedSize = 0L; private set



	/**
	 * Implementation of vkMapMemory. Cannot be called if the memory has already been host mapped.
	 */
	fun map(offset: Long, size: Long, data: DirectLong) {
		if(!type.isHostVisible)
			throw VkException("Cannot call vkMapMemory on memory that is not host-visible.")

		if(mapped)
			throw VkException("Cannot call vkMapMemory on a VkDeviceMemory object that has already been host-mapped.")

		commands.mapMemory(self, offset, size, data).check()

		mapped        = true
		mappedAddress = data.value
		mappedOffset  = offset
		mappedSize    = size
	}



	/**
	 * Convenience version of vkMapMemory that returns the pData argument as a [DirectByteBuffer].
	 */
	fun map(offset: Long, size: Long, stack: MemStack = default) = stack.get {
		val data = mallocPointer()
		map(offset, size, data)
		DirectByteBuffer(data.value, if(size == VK_WHOLE_SIZE) self.size - offset else size)
	}



	/**
	 * Convenience version of vkMapMemory that maps the entire memory range and returns a [DirectByteBuffer]
	 * representing the mapped memory range.
	 */
	fun mapWhole(stack: MemStack = default) = map(0L, size, stack)



	/**
	 * Implementation of vkUnmapMemory. The memory must currently be host-mapped.
	 */
	fun unmap() {
		if(!mapped)
			throw VkException("Cannot call vkUnmapMemory on a DeviceMemory that is not currently mapped.")

		commands.unmapMemory(memory = self)

		mapped = false
		mappedAddress = 0L
		mappedOffset = 0L
		mappedSize = 0L
	}



	/**
	 * If the currently mapped memory region contains the given region.
	 */
	fun isMapped(offset: Int, size: Int) = offset >= mappedOffset && offset + size <= mappedOffset + mappedSize



	/*
	Flushing
	 */



	/**
	 * Convenience version of vkFlushMappedMemoryRanges for a single memory range.
	 */
	fun flush(offset: Long, size: Long, stack: MemStack = default) = stack.with {
		if(type.isHostCoherent) return@with

		device.flushMappedMemoryRanges(MappedMemoryRange {
			it.memory = self
			it.offset = device.alignMemOffset(offset)
			it.size   = if(size == VK_WHOLE_SIZE) size else device.alignMemSize(size)
		}.asBuffer)
	}



	/**
	 * Convenience version of vkFlushMappedMemoryRanges that flushes the entire memory range.
	 */
	fun flushWhole(stack: MemStack) = flush(0L, VK_WHOLE_SIZE, stack)


}