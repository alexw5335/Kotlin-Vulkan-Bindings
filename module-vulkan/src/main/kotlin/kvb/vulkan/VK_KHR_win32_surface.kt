// This file has been automatically generated.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.*
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_win32_surface
 *     VkResult vkCreateWin32SurfaceKHR(
 *         VkInstance                    instance
 *         VkWin32SurfaceCreateInfoKHR*  pCreateInfo
 *         VkAllocationCallbacks*        pAllocator
 *         VkSurfaceKHR*                 pSurface
 *     );
 */
internal external fun createWin32Surface(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pSurface: Long): Int



/**
 *     // provided by VK_KHR_win32_surface
 *     VkBool32 vkGetPhysicalDeviceWin32PresentationSupportKHR(
 *         VkPhysicalDevice  physicalDevice
 *         uint32_t          queueFamilyIndex
 *     );
 */
internal external fun getPhysicalDeviceWin32PresentationSupport(address: Long, physicalDevice: Long, queueFamilyIndex: Int): Int



/**
 *     // provided by VK_KHR_win32_surface
 *     struct VkWin32SurfaceCreateInfoKHR {
 *         VkStructureType               sType
 *         void*                         pNext (must be null)
 *         VkWin32SurfaceCreateFlagsKHR  flags (reserved, must be zero)
 *         HINSTANCE                     hinstance
 *         HWND                          hwnd
 *     }
 */
@JvmInline
value class Win32SurfaceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var hinstance: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var hwnd: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)


}



/**
 * Struct calloc function for [Win32SurfaceCreateInfo].
 */
inline fun Allocator.Win32SurfaceCreateInfo(block: (Win32SurfaceCreateInfo) -> Unit) = Win32SurfaceCreateInfo(calloc(40)).apply(block).also { it.sType = 1000009000 }