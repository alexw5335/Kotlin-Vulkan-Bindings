package kvb.samples

import kvb.core.memory.Allocator

class StructList<T>(
	private val allocator: Allocator,
	private val create: Allocator.() -> T,
)