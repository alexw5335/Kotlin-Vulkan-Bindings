package kvb.vkwrapper.memory

class VkHeapBuffer(private val allocator: VkHeapAllocator, initialSize: Int) {


	var internal = allocate(initialSize)
		private set



	private fun allocate(size: Int) = allocator.device.createVertexBuffer(size).also(allocator::allocate)



	fun ensureCapacity(capacity: Int) {
		if(internal.size >= capacity)
			return

		allocator.free(internal)
		internal.destroy()
		internal = allocate(capacity)
	}



	fun destroy() {
		allocator.free(internal)
		internal.destroy()
	}


}