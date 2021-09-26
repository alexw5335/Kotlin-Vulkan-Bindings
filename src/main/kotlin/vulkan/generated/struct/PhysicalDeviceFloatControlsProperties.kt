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
 *     struct VkPhysicalDeviceFloatControlsProperties {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkShaderFloatControlsIndependence  denormBehaviorIndependence
 *         VkShaderFloatControlsIndependence  roundingModeIndependence
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat16
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat32
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat64
 *         VkBool32                           shaderDenormPreserveFloat16
 *         VkBool32                           shaderDenormPreserveFloat32
 *         VkBool32                           shaderDenormPreserveFloat64
 *         VkBool32                           shaderDenormFlushToZeroFloat16
 *         VkBool32                           shaderDenormFlushToZeroFloat32
 *         VkBool32                           shaderDenormFlushToZeroFloat64
 *         VkBool32                           shaderRoundingModeRTEFloat16
 *         VkBool32                           shaderRoundingModeRTEFloat32
 *         VkBool32                           shaderRoundingModeRTEFloat64
 *         VkBool32                           shaderRoundingModeRTZFloat16
 *         VkBool32                           shaderRoundingModeRTZFloat32
 *         VkBool32                           shaderRoundingModeRTZFloat64
 *     }
 */
@JvmInline
value class PhysicalDeviceFloatControlsProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var denormBehaviorIndependence: ShaderFloatControlsIndependence
		get()      = ShaderFloatControlsIndependence(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var roundingModeIndependence: ShaderFloatControlsIndependence
		get()      = ShaderFloatControlsIndependence(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var shaderSignedZeroInfNanPreserveFloat16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var shaderSignedZeroInfNanPreserveFloat32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var shaderSignedZeroInfNanPreserveFloat64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var shaderDenormPreserveFloat16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var shaderDenormPreserveFloat32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var shaderDenormPreserveFloat64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var shaderDenormFlushToZeroFloat16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var shaderDenormFlushToZeroFloat32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var shaderDenormFlushToZeroFloat64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var shaderRoundingModeRTEFloat16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var shaderRoundingModeRTEFloat32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	var shaderRoundingModeRTEFloat64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value) }
	
	var shaderRoundingModeRTZFloat16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value) }
	
	var shaderRoundingModeRTZFloat32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[17])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[17], value) }
	
	var shaderRoundingModeRTZFloat64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[18])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[18], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val denormBehaviorIndependence: ShaderFloatControlsIndependence,
		val roundingModeIndependence: ShaderFloatControlsIndependence,
		val shaderSignedZeroInfNanPreserveFloat16: Int,
		val shaderSignedZeroInfNanPreserveFloat32: Int,
		val shaderSignedZeroInfNanPreserveFloat64: Int,
		val shaderDenormPreserveFloat16: Int,
		val shaderDenormPreserveFloat32: Int,
		val shaderDenormPreserveFloat64: Int,
		val shaderDenormFlushToZeroFloat16: Int,
		val shaderDenormFlushToZeroFloat32: Int,
		val shaderDenormFlushToZeroFloat64: Int,
		val shaderRoundingModeRTEFloat16: Int,
		val shaderRoundingModeRTEFloat32: Int,
		val shaderRoundingModeRTEFloat64: Int,
		val shaderRoundingModeRTZFloat16: Int,
		val shaderRoundingModeRTZFloat32: Int,
		val shaderRoundingModeRTZFloat64: Int,
	) {
		override fun toString() = "PhysicalDeviceFloatControlsProperties(" + 
			"sType=$sType, " +
			"denormBehaviorIndependence=$denormBehaviorIndependence, " +
			"roundingModeIndependence=$roundingModeIndependence, " +
			"shaderSignedZeroInfNanPreserveFloat16=$shaderSignedZeroInfNanPreserveFloat16, " +
			"shaderSignedZeroInfNanPreserveFloat32=$shaderSignedZeroInfNanPreserveFloat32, " +
			"shaderSignedZeroInfNanPreserveFloat64=$shaderSignedZeroInfNanPreserveFloat64, " +
			"shaderDenormPreserveFloat16=$shaderDenormPreserveFloat16, " +
			"shaderDenormPreserveFloat32=$shaderDenormPreserveFloat32, " +
			"shaderDenormPreserveFloat64=$shaderDenormPreserveFloat64, " +
			"shaderDenormFlushToZeroFloat16=$shaderDenormFlushToZeroFloat16, " +
			"shaderDenormFlushToZeroFloat32=$shaderDenormFlushToZeroFloat32, " +
			"shaderDenormFlushToZeroFloat64=$shaderDenormFlushToZeroFloat64, " +
			"shaderRoundingModeRTEFloat16=$shaderRoundingModeRTEFloat16, " +
			"shaderRoundingModeRTEFloat32=$shaderRoundingModeRTEFloat32, " +
			"shaderRoundingModeRTEFloat64=$shaderRoundingModeRTEFloat64, " +
			"shaderRoundingModeRTZFloat16=$shaderRoundingModeRTZFloat16, " +
			"shaderRoundingModeRTZFloat32=$shaderRoundingModeRTZFloat32, " +
			"shaderRoundingModeRTZFloat64=$shaderRoundingModeRTZFloat64)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		denormBehaviorIndependence, 
		roundingModeIndependence, 
		shaderSignedZeroInfNanPreserveFloat16, 
		shaderSignedZeroInfNanPreserveFloat32, 
		shaderSignedZeroInfNanPreserveFloat64, 
		shaderDenormPreserveFloat16, 
		shaderDenormPreserveFloat32, 
		shaderDenormPreserveFloat64, 
		shaderDenormFlushToZeroFloat16, 
		shaderDenormFlushToZeroFloat32, 
		shaderDenormFlushToZeroFloat64, 
		shaderRoundingModeRTEFloat16, 
		shaderRoundingModeRTEFloat32, 
		shaderRoundingModeRTEFloat64, 
		shaderRoundingModeRTZFloat16, 
		shaderRoundingModeRTZFloat32, 
		shaderRoundingModeRTZFloat64, 
	)
	
	
	
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
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceFloatControlsProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceFloatControlsProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceFloatControlsProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES
		}
	
	}


}