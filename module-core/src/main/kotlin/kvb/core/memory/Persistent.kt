package kvb.core.memory

import kvb.core.CoreConfig

object Persistent : MemStack(Unsafe, CoreConfig.persistentMemorySize) {
}