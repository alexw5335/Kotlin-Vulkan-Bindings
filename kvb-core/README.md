# Core

*Note: In order to simplify working with native memory, this library only supports 64-bit JVMs.*

### Native memory access
All native memory accesses are done via sun.misc.Unsafe. Unsafe's functionality is exposed through a 
[wrapper object](src/main/kotlin/kvb/core/memory/Unsafe.kt)of the same name. Unsafe is also used to allocate off-heap 
memory.

### Native memory representation
The library does not use Java's NIO buffers to access native memory. Instead, it uses custom auto-generated classes. 
These classes are prefixed with 'Direct' to differentiate them from normal buffers. Each Java primitive has a 
corresponding Direct and DirectBuffer class, e.g. DirectInt and DirectIntBuffer, which respectively represent a single 
32-bit integer and a contiguous array of 32-bit integers in native memory. These classes have many convenience 
functions that make them similar in usage to normal Kotlin arrays.

### Allocation
Heap allocation via Unsafe or malloc is discouraged. Wherever possible, stack allocation is preferred. This 
functionality is simulated with the [MemStack](src/main/kotlin/kvb/core/memory/MemStack.kt) class. MemStacks 
themselves must initially be heap-allocated.