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
 *     struct VkSwapchainCreateInfoKHR {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkSwapchainCreateFlagsKHR      flags
 *         VkSurfaceKHR                   surface
 *         uint32_t                       minImageCount
 *         VkFormat                       imageFormat
 *         VkColorSpaceKHR                imageColorSpace
 *         VkExtent2D                     imageExtent
 *         uint32_t                       imageArrayLayers
 *         VkImageUsageFlags              imageUsage
 *         VkSharingMode                  imageSharingMode
 *         uint32_t                       queueFamilyIndexCount
 *         uint32_t**                     pQueueFamilyIndices
 *         VkSurfaceTransformFlagBitsKHR  preTransform
 *         VkCompositeAlphaFlagBitsKHR    compositeAlpha
 *         VkPresentModeKHR               presentMode
 *         VkBool32                       clipped
 *         VkSwapchainKHR                 oldSwapchain
 *     }
 */
@JvmInline
value class SwapchainCreateInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: SwapchainCreateFlags
		get()      = SwapchainCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var surface: SurfaceH
		get()      = SurfaceH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var minImageCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var imageFormat: Format
		get()      = Format(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.id) }
	
	var imageColorSpace: ColorSpace
		get()      = ColorSpace(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	var imageExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[7])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[7], value.structSize) }
	
	var imageArrayLayers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var imageUsage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + LAYOUT.offsets[9]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value.bitfield) }
	
	var imageSharingMode: SharingMode
		get()      = SharingMode(Unsafe.getInt(address + LAYOUT.offsets[10]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value.id) }
	
	var queueFamilyIndexCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var pQueueFamilyIndices: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[12], value) }
	
	var preTransform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + LAYOUT.offsets[13]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value.bitfield) }
	
	var compositeAlpha: CompositeAlphaFlags
		get()      = CompositeAlphaFlags(Unsafe.getInt(address + LAYOUT.offsets[14]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value.bitfield) }
	
	var presentMode: PresentMode
		get()      = PresentMode(Unsafe.getInt(address + LAYOUT.offsets[15]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value.id) }
	
	var clipped: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value) }
	
	var oldSwapchain: SwapchainH
		get()      = SwapchainH(Unsafe.getNativePointer(address + LAYOUT.offsets[17]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[17], value.address) }
	
	
	
	var queueFamilyIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[12]), queueFamilyIndexCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[12], value.address); queueFamilyIndexCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = SwapchainCreateInfoKHR(offset(index))
		
		operator fun set(index: Int, value: SwapchainCreateInfoKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SwapchainCreateInfoKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SwapchainCreateInfoKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SwapchainCreateInfoKHR[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(Extent2D.LAYOUT)
			member(4)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SwapchainCreateInfoKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SwapchainCreateInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SWAPCHAIN_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = SwapchainCreateInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SWAPCHAIN_CREATE_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SWAPCHAIN_CREATE_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SWAPCHAIN_CREATE_INFO }
		}
	
	}


}