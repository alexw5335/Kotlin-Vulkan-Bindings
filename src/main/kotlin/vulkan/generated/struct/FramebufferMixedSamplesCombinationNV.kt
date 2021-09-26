// This file has been automatically generated.

package vulkan.generated.struct

import memory.NativeSizes
import memory.type.DirectBuffer
import memory.struct.LayoutBuilder
import memory.allocation.Allocator
import memory.Unsafe
import memory.type.Addressable

import vulkan.generated.enumeration.*
import memory.primitive.*
import vulkan.generated.handle.*

/**
 *     struct VkFramebufferMixedSamplesCombinationNV {
 *         VkStructureType            sType
 *         void*                      pNext (must be null)
 *         VkCoverageReductionModeNV  coverageReductionMode
 *         VkSampleCountFlagBits      rasterizationSamples
 *         VkSampleCountFlags         depthStencilSamples
 *         VkSampleCountFlags         colorSamples
 *     }
 */
@JvmInline
value class FramebufferMixedSamplesCombinationNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var coverageReductionMode: CoverageReductionMode
		get()      = CoverageReductionMode(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var rasterizationSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var depthStencilSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	var colorSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.bitfield) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = FramebufferMixedSamplesCombinationNV(offset(index))
		
		operator fun set(index: Int, value: FramebufferMixedSamplesCombinationNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (FramebufferMixedSamplesCombinationNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (FramebufferMixedSamplesCombinationNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "FramebufferMixedSamplesCombinationNV[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val coverageReductionMode: CoverageReductionMode,
		val rasterizationSamples: SampleCountFlags,
		val depthStencilSamples: SampleCountFlags,
		val colorSamples: SampleCountFlags,
	) {
		override fun toString() = "FramebufferMixedSamplesCombinationNV(" + 
			"sType=$sType, " +
			"coverageReductionMode=$coverageReductionMode, " +
			"rasterizationSamples=$rasterizationSamples, " +
			"depthStencilSamples=$depthStencilSamples, " +
			"colorSamples=$colorSamples)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		coverageReductionMode, 
		rasterizationSamples, 
		depthStencilSamples, 
		colorSamples, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = FramebufferMixedSamplesCombinationNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = FramebufferMixedSamplesCombinationNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.FRAMEBUFFER_MIXED_SAMPLES_COMBINATION
		}
		
		fun calloc(allocator: Allocator) = FramebufferMixedSamplesCombinationNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.FRAMEBUFFER_MIXED_SAMPLES_COMBINATION
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.FRAMEBUFFER_MIXED_SAMPLES_COMBINATION }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.FRAMEBUFFER_MIXED_SAMPLES_COMBINATION }
		}
	
	}


}