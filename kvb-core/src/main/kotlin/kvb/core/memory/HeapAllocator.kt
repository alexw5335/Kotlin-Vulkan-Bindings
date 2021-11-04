package kvb.core.memory

interface HeapAllocator : Allocator {


	fun free(address: Long)


}