package kvb.vkwrapper.persistent

import kvb.vulkan.PhysicalDeviceType
import kvb.vulkan.PhysicalDeviceProperties

/**
 * Persistent implementation of [VkPhysicalDeviceProperties][PhysicalDeviceProperties].
 */
class PhysicalDevicePropertiesP(
	val apiVersion: Int,
	val driverVersion: Int,
	val vendorID: Int,
	val deviceID: Int,
	val deviceType: PhysicalDeviceType,
	val deviceName: String,
	val pipelineCacheUUID: ByteArray,
	val limits: PhysicalDeviceLimitsP,
	val sparseProperties: PhysicalDeviceSparsePropertiesP,
) {


	constructor(struct: PhysicalDeviceProperties) : this(
		struct.apiVersion,
		struct.driverVersion,
		struct.vendorID,
		struct.deviceID,
		struct.deviceType,
		struct.deviceName.decodeUtf8NT(),
		struct.pipelineCacheUUID.asArray,
		PhysicalDeviceLimitsP(struct.limits),
		PhysicalDeviceSparsePropertiesP(struct.sparseProperties)
	)


}