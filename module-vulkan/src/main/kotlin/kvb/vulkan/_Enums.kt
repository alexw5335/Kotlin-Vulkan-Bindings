// This file has been automatically generated.

// This file's name has been prefixed with '_' so that it appears at the top of the package.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

internal fun _VendorId(value: Int) = when(value) {
	0x10001 -> VendorId.VIV
	0x10002 -> VendorId.VSI
	0x10003 -> VendorId.KAZAN
	0x10004 -> VendorId.CODEPLAY
	0x10005 -> VendorId.MESA
	0x10006 -> VendorId.POCL
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PipelineCacheHeaderVersion(value: Int) = when(value) {
	1 -> PipelineCacheHeaderVersion.ONE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ImageTiling(value: Int) = when(value) {
	0 -> ImageTiling.OPTIMAL
	1 -> ImageTiling.LINEAR
	1000158000 -> ImageTiling.DRM_FORMAT_MODIFIER
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ImageType(value: Int) = when(value) {
	0 -> ImageType._1D
	1 -> ImageType._2D
	2 -> ImageType._3D
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _InternalAllocationType(value: Int) = when(value) {
	0 -> InternalAllocationType.EXECUTABLE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PhysicalDeviceType(value: Int) = when(value) {
	0 -> PhysicalDeviceType.OTHER
	1 -> PhysicalDeviceType.INTEGRATED_GPU
	2 -> PhysicalDeviceType.DISCRETE_GPU
	3 -> PhysicalDeviceType.VIRTUAL_GPU
	4 -> PhysicalDeviceType.CPU
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _SystemAllocationScope(value: Int) = when(value) {
	0 -> SystemAllocationScope.COMMAND
	1 -> SystemAllocationScope.OBJECT
	2 -> SystemAllocationScope.CACHE
	3 -> SystemAllocationScope.DEVICE
	4 -> SystemAllocationScope.INSTANCE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _QueryType(value: Int) = when(value) {
	0 -> QueryType.OCCLUSION
	1 -> QueryType.PIPELINE_STATISTICS
	2 -> QueryType.TIMESTAMP
	1000028004 -> QueryType.TRANSFORM_FEEDBACK_STREAM
	1000116000 -> QueryType.PERFORMANCE_QUERY_KHR
	1000150000 -> QueryType.ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR
	1000150001 -> QueryType.ACCELERATION_STRUCTURE_SERIALIZATION_SIZE
	1000165000 -> QueryType.ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV
	1000210000 -> QueryType.PERFORMANCE_QUERY_INTEL
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _SharingMode(value: Int) = when(value) {
	0 -> SharingMode.EXCLUSIVE
	1 -> SharingMode.CONCURRENT
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ImageLayout(value: Int) = when(value) {
	0 -> ImageLayout.UNDEFINED
	1 -> ImageLayout.GENERAL
	2 -> ImageLayout.COLOR_ATTACHMENT_OPTIMAL
	3 -> ImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL
	4 -> ImageLayout.DEPTH_STENCIL_READ_ONLY_OPTIMAL
	5 -> ImageLayout.SHADER_READ_ONLY_OPTIMAL
	6 -> ImageLayout.TRANSFER_SRC_OPTIMAL
	7 -> ImageLayout.TRANSFER_DST_OPTIMAL
	8 -> ImageLayout.PREINITIALIZED
	1000117000 -> ImageLayout.DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL
	1000117001 -> ImageLayout.DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL
	1000241000 -> ImageLayout.DEPTH_ATTACHMENT_OPTIMAL
	1000241001 -> ImageLayout.DEPTH_READ_ONLY_OPTIMAL
	1000241002 -> ImageLayout.STENCIL_ATTACHMENT_OPTIMAL
	1000241003 -> ImageLayout.STENCIL_READ_ONLY_OPTIMAL
	1000001002 -> ImageLayout.PRESENT_SRC
	1000111000 -> ImageLayout.SHARED_PRESENT
	1000164003 -> ImageLayout.SHADING_RATE_OPTIMAL
	1000218000 -> ImageLayout.FRAGMENT_DENSITY_MAP_OPTIMAL
	1000314000 -> ImageLayout.READ_ONLY_OPTIMAL
	1000314001 -> ImageLayout.ATTACHMENT_OPTIMAL
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ComponentSwizzle(value: Int) = when(value) {
	0 -> ComponentSwizzle.IDENTITY
	1 -> ComponentSwizzle.ZERO
	2 -> ComponentSwizzle.ONE
	3 -> ComponentSwizzle.R
	4 -> ComponentSwizzle.G
	5 -> ComponentSwizzle.B
	6 -> ComponentSwizzle.A
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ImageViewType(value: Int) = when(value) {
	0 -> ImageViewType._1D
	1 -> ImageViewType._2D
	2 -> ImageViewType._3D
	3 -> ImageViewType.CUBE
	4 -> ImageViewType._1D_ARRAY
	5 -> ImageViewType._2D_ARRAY
	6 -> ImageViewType.CUBE_ARRAY
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _BlendFactor(value: Int) = when(value) {
	0 -> BlendFactor.ZERO
	1 -> BlendFactor.ONE
	2 -> BlendFactor.SRC_COLOR
	3 -> BlendFactor.ONE_MINUS_SRC_COLOR
	4 -> BlendFactor.DST_COLOR
	5 -> BlendFactor.ONE_MINUS_DST_COLOR
	6 -> BlendFactor.SRC_ALPHA
	7 -> BlendFactor.ONE_MINUS_SRC_ALPHA
	8 -> BlendFactor.DST_ALPHA
	9 -> BlendFactor.ONE_MINUS_DST_ALPHA
	10 -> BlendFactor.CONSTANT_COLOR
	11 -> BlendFactor.ONE_MINUS_CONSTANT_COLOR
	12 -> BlendFactor.CONSTANT_ALPHA
	13 -> BlendFactor.ONE_MINUS_CONSTANT_ALPHA
	14 -> BlendFactor.SRC_ALPHA_SATURATE
	15 -> BlendFactor.SRC1_COLOR
	16 -> BlendFactor.ONE_MINUS_SRC1_COLOR
	17 -> BlendFactor.SRC1_ALPHA
	18 -> BlendFactor.ONE_MINUS_SRC1_ALPHA
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _BlendOp(value: Int) = when(value) {
	0 -> BlendOp.ADD
	1 -> BlendOp.SUBTRACT
	2 -> BlendOp.REVERSE_SUBTRACT
	3 -> BlendOp.MIN
	4 -> BlendOp.MAX
	1000148000 -> BlendOp.ZERO
	1000148001 -> BlendOp.SRC
	1000148002 -> BlendOp.DST
	1000148003 -> BlendOp.SRC_OVER
	1000148004 -> BlendOp.DST_OVER
	1000148005 -> BlendOp.SRC_IN
	1000148006 -> BlendOp.DST_IN
	1000148007 -> BlendOp.SRC_OUT
	1000148008 -> BlendOp.DST_OUT
	1000148009 -> BlendOp.SRC_ATOP
	1000148010 -> BlendOp.DST_ATOP
	1000148011 -> BlendOp.XOR
	1000148012 -> BlendOp.MULTIPLY
	1000148013 -> BlendOp.SCREEN
	1000148014 -> BlendOp.OVERLAY
	1000148015 -> BlendOp.DARKEN
	1000148016 -> BlendOp.LIGHTEN
	1000148017 -> BlendOp.COLORDODGE
	1000148018 -> BlendOp.COLORBURN
	1000148019 -> BlendOp.HARDLIGHT
	1000148020 -> BlendOp.SOFTLIGHT
	1000148021 -> BlendOp.DIFFERENCE
	1000148022 -> BlendOp.EXCLUSION
	1000148023 -> BlendOp.INVERT
	1000148024 -> BlendOp.INVERT_RGB
	1000148025 -> BlendOp.LINEARDODGE
	1000148026 -> BlendOp.LINEARBURN
	1000148027 -> BlendOp.VIVIDLIGHT
	1000148028 -> BlendOp.LINEARLIGHT
	1000148029 -> BlendOp.PINLIGHT
	1000148030 -> BlendOp.HARDMIX
	1000148031 -> BlendOp.HSL_HUE
	1000148032 -> BlendOp.HSL_SATURATION
	1000148033 -> BlendOp.HSL_COLOR
	1000148034 -> BlendOp.HSL_LUMINOSITY
	1000148035 -> BlendOp.PLUS
	1000148036 -> BlendOp.PLUS_CLAMPED
	1000148037 -> BlendOp.PLUS_CLAMPED_ALPHA
	1000148038 -> BlendOp.PLUS_DARKER
	1000148039 -> BlendOp.MINUS
	1000148040 -> BlendOp.MINUS_CLAMPED
	1000148041 -> BlendOp.CONTRAST
	1000148042 -> BlendOp.INVERT_OVG
	1000148043 -> BlendOp.RED
	1000148044 -> BlendOp.GREEN
	1000148045 -> BlendOp.BLUE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _CompareOp(value: Int) = when(value) {
	0 -> CompareOp.NEVER
	1 -> CompareOp.LESS
	2 -> CompareOp.EQUAL
	3 -> CompareOp.LESS_OR_EQUAL
	4 -> CompareOp.GREATER
	5 -> CompareOp.NOT_EQUAL
	6 -> CompareOp.GREATER_OR_EQUAL
	7 -> CompareOp.ALWAYS
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _DynamicState(value: Int) = when(value) {
	0 -> DynamicState.VIEWPORT
	1 -> DynamicState.SCISSOR
	2 -> DynamicState.LINE_WIDTH
	3 -> DynamicState.DEPTH_BIAS
	4 -> DynamicState.BLEND_CONSTANTS
	5 -> DynamicState.DEPTH_BOUNDS
	6 -> DynamicState.STENCIL_COMPARE_MASK
	7 -> DynamicState.STENCIL_WRITE_MASK
	8 -> DynamicState.STENCIL_REFERENCE
	1000087000 -> DynamicState.VIEWPORT_W_SCALING
	1000099000 -> DynamicState.DISCARD_RECTANGLE
	1000143000 -> DynamicState.SAMPLE_LOCATIONS
	1000347000 -> DynamicState.RAY_TRACING_PIPELINE_STACK_SIZE
	1000164004 -> DynamicState.VIEWPORT_SHADING_RATE_PALETTE
	1000164006 -> DynamicState.VIEWPORT_COARSE_SAMPLE_ORDER
	1000205001 -> DynamicState.EXCLUSIVE_SCISSOR
	1000226000 -> DynamicState.FRAGMENT_SHADING_RATE
	1000259000 -> DynamicState.LINE_STIPPLE
	1000267000 -> DynamicState.CULL_MODE
	1000267001 -> DynamicState.FRONT_FACE
	1000267002 -> DynamicState.PRIMITIVE_TOPOLOGY
	1000267003 -> DynamicState.VIEWPORT_WITH_COUNT
	1000267004 -> DynamicState.SCISSOR_WITH_COUNT
	1000267005 -> DynamicState.VERTEX_INPUT_BINDING_STRIDE
	1000267006 -> DynamicState.DEPTH_TEST_ENABLE
	1000267007 -> DynamicState.DEPTH_WRITE_ENABLE
	1000267008 -> DynamicState.DEPTH_COMPARE_OP
	1000267009 -> DynamicState.DEPTH_BOUNDS_TEST_ENABLE
	1000267010 -> DynamicState.STENCIL_TEST_ENABLE
	1000267011 -> DynamicState.STENCIL_OP
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _FrontFace(value: Int) = when(value) {
	0 -> FrontFace.COUNTER_CLOCKWISE
	1 -> FrontFace.CLOCKWISE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _LogicOp(value: Int) = when(value) {
	0 -> LogicOp.CLEAR
	1 -> LogicOp.AND
	2 -> LogicOp.AND_REVERSE
	3 -> LogicOp.COPY
	4 -> LogicOp.AND_INVERTED
	5 -> LogicOp.NO_OP
	6 -> LogicOp.XOR
	7 -> LogicOp.OR
	8 -> LogicOp.NOR
	9 -> LogicOp.EQUIVALENT
	10 -> LogicOp.INVERT
	11 -> LogicOp.OR_REVERSE
	12 -> LogicOp.COPY_INVERTED
	13 -> LogicOp.OR_INVERTED
	14 -> LogicOp.NAND
	15 -> LogicOp.SET
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PolygonMode(value: Int) = when(value) {
	0 -> PolygonMode.FILL
	1 -> PolygonMode.LINE
	2 -> PolygonMode.POINT
	1000153000 -> PolygonMode.FILL_RECTANGLE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PrimitiveTopology(value: Int) = when(value) {
	0 -> PrimitiveTopology.POINT_LIST
	1 -> PrimitiveTopology.LINE_LIST
	2 -> PrimitiveTopology.LINE_STRIP
	3 -> PrimitiveTopology.TRIANGLE_LIST
	4 -> PrimitiveTopology.TRIANGLE_STRIP
	5 -> PrimitiveTopology.TRIANGLE_FAN
	6 -> PrimitiveTopology.LINE_LIST_WITH_ADJACENCY
	7 -> PrimitiveTopology.LINE_STRIP_WITH_ADJACENCY
	8 -> PrimitiveTopology.TRIANGLE_LIST_WITH_ADJACENCY
	9 -> PrimitiveTopology.TRIANGLE_STRIP_WITH_ADJACENCY
	10 -> PrimitiveTopology.PATCH_LIST
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _StencilOp(value: Int) = when(value) {
	0 -> StencilOp.KEEP
	1 -> StencilOp.ZERO
	2 -> StencilOp.REPLACE
	3 -> StencilOp.INCREMENT_AND_CLAMP
	4 -> StencilOp.DECREMENT_AND_CLAMP
	5 -> StencilOp.INVERT
	6 -> StencilOp.INCREMENT_AND_WRAP
	7 -> StencilOp.DECREMENT_AND_WRAP
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _VertexInputRate(value: Int) = when(value) {
	0 -> VertexInputRate.VERTEX
	1 -> VertexInputRate.INSTANCE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _BorderColor(value: Int) = when(value) {
	0 -> BorderColor.FLOAT_TRANSPARENT_BLACK
	1 -> BorderColor.INT_TRANSPARENT_BLACK
	2 -> BorderColor.FLOAT_OPAQUE_BLACK
	3 -> BorderColor.INT_OPAQUE_BLACK
	4 -> BorderColor.FLOAT_OPAQUE_WHITE
	5 -> BorderColor.INT_OPAQUE_WHITE
	1000287003 -> BorderColor.FLOAT_CUSTOM
	1000287004 -> BorderColor.INT_CUSTOM
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _Filter(value: Int) = when(value) {
	0 -> Filter.NEAREST
	1 -> Filter.LINEAR
	1000015000 -> Filter.CUBIC
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _SamplerAddressMode(value: Int) = when(value) {
	0 -> SamplerAddressMode.REPEAT
	1 -> SamplerAddressMode.MIRRORED_REPEAT
	2 -> SamplerAddressMode.CLAMP_TO_EDGE
	3 -> SamplerAddressMode.CLAMP_TO_BORDER
	4 -> SamplerAddressMode.MIRROR_CLAMP_TO_EDGE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _SamplerMipmapMode(value: Int) = when(value) {
	0 -> SamplerMipmapMode.NEAREST
	1 -> SamplerMipmapMode.LINEAR
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _DescriptorType(value: Int) = when(value) {
	0 -> DescriptorType.SAMPLER
	1 -> DescriptorType.COMBINED_IMAGE_SAMPLER
	2 -> DescriptorType.SAMPLED_IMAGE
	3 -> DescriptorType.STORAGE_IMAGE
	4 -> DescriptorType.UNIFORM_TEXEL_BUFFER
	5 -> DescriptorType.STORAGE_TEXEL_BUFFER
	6 -> DescriptorType.UNIFORM_BUFFER
	7 -> DescriptorType.STORAGE_BUFFER
	8 -> DescriptorType.UNIFORM_BUFFER_DYNAMIC
	9 -> DescriptorType.STORAGE_BUFFER_DYNAMIC
	10 -> DescriptorType.INPUT_ATTACHMENT
	1000138000 -> DescriptorType.INLINE_UNIFORM_BLOCK
	1000150000 -> DescriptorType.ACCELERATION_STRUCTURE_KHR
	1000165000 -> DescriptorType.ACCELERATION_STRUCTURE_NV
	1000351000 -> DescriptorType.MUTABLE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _AttachmentLoadOp(value: Int) = when(value) {
	0 -> AttachmentLoadOp.LOAD
	1 -> AttachmentLoadOp.CLEAR
	2 -> AttachmentLoadOp.DONT_CARE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _AttachmentStoreOp(value: Int) = when(value) {
	0 -> AttachmentStoreOp.STORE
	1 -> AttachmentStoreOp.DONT_CARE
	1000301000 -> AttachmentStoreOp.NONE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PipelineBindPoint(value: Int) = when(value) {
	0 -> PipelineBindPoint.GRAPHICS
	1 -> PipelineBindPoint.COMPUTE
	1000165000 -> PipelineBindPoint.RAY_TRACING
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _CommandBufferLevel(value: Int) = when(value) {
	0 -> CommandBufferLevel.PRIMARY
	1 -> CommandBufferLevel.SECONDARY
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _IndexType(value: Int) = when(value) {
	0 -> IndexType.UINT16
	1 -> IndexType.UINT32
	1000165000 -> IndexType.NONE
	1000265000 -> IndexType.UINT8
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _SubpassContents(value: Int) = when(value) {
	0 -> SubpassContents.INLINE
	1 -> SubpassContents.SECONDARY_COMMAND_BUFFERS
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PointClippingBehavior(value: Int) = when(value) {
	0 -> PointClippingBehavior.ALL_CLIP_PLANES
	1 -> PointClippingBehavior.USER_CLIP_PLANES_ONLY
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _TessellationDomainOrigin(value: Int) = when(value) {
	0 -> TessellationDomainOrigin.UPPER_LEFT
	1 -> TessellationDomainOrigin.LOWER_LEFT
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _SamplerYcbcrModelConversion(value: Int) = when(value) {
	0 -> SamplerYcbcrModelConversion.RGB_IDENTITY
	1 -> SamplerYcbcrModelConversion.YCBCR_IDENTITY
	2 -> SamplerYcbcrModelConversion.YCBCR_709
	3 -> SamplerYcbcrModelConversion.YCBCR_601
	4 -> SamplerYcbcrModelConversion.YCBCR_2020
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _SamplerYcbcrRange(value: Int) = when(value) {
	0 -> SamplerYcbcrRange.ITU_FULL
	1 -> SamplerYcbcrRange.ITU_NARROW
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ChromaLocation(value: Int) = when(value) {
	0 -> ChromaLocation.COSITED_EVEN
	1 -> ChromaLocation.MIDPOINT
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _DescriptorUpdateTemplateType(value: Int) = when(value) {
	0 -> DescriptorUpdateTemplateType.DESCRIPTOR_SET
	1 -> DescriptorUpdateTemplateType.PUSH_DESCRIPTORS
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _DriverId(value: Int) = when(value) {
	1 -> DriverId.AMD_PROPRIETARY
	2 -> DriverId.AMD_OPEN_SOURCE
	3 -> DriverId.MESA_RADV
	4 -> DriverId.NVIDIA_PROPRIETARY
	5 -> DriverId.INTEL_PROPRIETARY_WINDOWS
	6 -> DriverId.INTEL_OPEN_SOURCE_MESA
	7 -> DriverId.IMAGINATION_PROPRIETARY
	8 -> DriverId.QUALCOMM_PROPRIETARY
	9 -> DriverId.ARM_PROPRIETARY
	10 -> DriverId.GOOGLE_SWIFTSHADER
	11 -> DriverId.GGP_PROPRIETARY
	12 -> DriverId.BROADCOM_PROPRIETARY
	13 -> DriverId.MESA_LLVMPIPE
	14 -> DriverId.MOLTENVK
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ShaderFloatControlsIndependence(value: Int) = when(value) {
	0 -> ShaderFloatControlsIndependence._32_BIT_ONLY
	1 -> ShaderFloatControlsIndependence.ALL
	2 -> ShaderFloatControlsIndependence.NONE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _SamplerReductionMode(value: Int) = when(value) {
	0 -> SamplerReductionMode.WEIGHTED_AVERAGE
	1 -> SamplerReductionMode.MIN
	2 -> SamplerReductionMode.MAX
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _SemaphoreType(value: Int) = when(value) {
	0 -> SemaphoreType.BINARY
	1 -> SemaphoreType.TIMELINE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PresentMode(value: Int) = when(value) {
	0 -> PresentMode.IMMEDIATE
	1 -> PresentMode.MAILBOX
	2 -> PresentMode.FIFO
	3 -> PresentMode.FIFO_RELAXED
	1000111000 -> PresentMode.SHARED_DEMAND_REFRESH
	1000111001 -> PresentMode.SHARED_CONTINUOUS_REFRESH
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ColorSpace(value: Int) = when(value) {
	0 -> ColorSpace.SRGB_NONLINEAR
	1000104001 -> ColorSpace.DISPLAY_P3_NONLINEAR
	1000104002 -> ColorSpace.EXTENDED_SRGB_LINEAR
	1000104003 -> ColorSpace.DISPLAY_P3_LINEAR
	1000104004 -> ColorSpace.DCI_P3_NONLINEAR
	1000104005 -> ColorSpace.BT709_LINEAR
	1000104006 -> ColorSpace.BT709_NONLINEAR
	1000104007 -> ColorSpace.BT2020_LINEAR
	1000104008 -> ColorSpace.HDR10_ST2084
	1000104009 -> ColorSpace.DOLBYVISION
	1000104010 -> ColorSpace.HDR10_HLG
	1000104011 -> ColorSpace.ADOBERGB_LINEAR
	1000104012 -> ColorSpace.ADOBERGB_NONLINEAR
	1000104013 -> ColorSpace.PASS_THROUGH
	1000104014 -> ColorSpace.EXTENDED_SRGB_NONLINEAR
	1000213000 -> ColorSpace.DISPLAY_NATIVE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _RasterizationOrder(value: Int) = when(value) {
	0 -> RasterizationOrder.STRICT
	1 -> RasterizationOrder.RELAXED
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _DebugReportObjectType(value: Int) = when(value) {
	0 -> DebugReportObjectType.UNKNOWN
	1 -> DebugReportObjectType.INSTANCE
	2 -> DebugReportObjectType.PHYSICAL_DEVICE
	3 -> DebugReportObjectType.DEVICE
	4 -> DebugReportObjectType.QUEUE
	5 -> DebugReportObjectType.SEMAPHORE
	6 -> DebugReportObjectType.COMMAND_BUFFER
	7 -> DebugReportObjectType.FENCE
	8 -> DebugReportObjectType.DEVICE_MEMORY
	9 -> DebugReportObjectType.BUFFER
	10 -> DebugReportObjectType.IMAGE
	11 -> DebugReportObjectType.EVENT
	12 -> DebugReportObjectType.QUERY_POOL
	13 -> DebugReportObjectType.BUFFER_VIEW
	14 -> DebugReportObjectType.IMAGE_VIEW
	15 -> DebugReportObjectType.SHADER_MODULE
	16 -> DebugReportObjectType.PIPELINE_CACHE
	17 -> DebugReportObjectType.PIPELINE_LAYOUT
	18 -> DebugReportObjectType.RENDER_PASS
	19 -> DebugReportObjectType.PIPELINE
	20 -> DebugReportObjectType.DESCRIPTOR_SET_LAYOUT
	21 -> DebugReportObjectType.SAMPLER
	22 -> DebugReportObjectType.DESCRIPTOR_POOL
	23 -> DebugReportObjectType.DESCRIPTOR_SET
	24 -> DebugReportObjectType.FRAMEBUFFER
	25 -> DebugReportObjectType.COMMAND_POOL
	26 -> DebugReportObjectType.SURFACE_KHR
	27 -> DebugReportObjectType.SWAPCHAIN_KHR
	28 -> DebugReportObjectType.DEBUG_REPORT_CALLBACK_EXT
	29 -> DebugReportObjectType.DISPLAY_KHR
	30 -> DebugReportObjectType.DISPLAY_MODE_KHR
	33 -> DebugReportObjectType.VALIDATION_CACHE_EXT
	1000150000 -> DebugReportObjectType.ACCELERATION_STRUCTURE_KHR
	1000165000 -> DebugReportObjectType.ACCELERATION_STRUCTURE_NV
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ShaderInfoType(value: Int) = when(value) {
	0 -> ShaderInfoType.STATISTICS
	1 -> ShaderInfoType.BINARY
	2 -> ShaderInfoType.DISASSEMBLY
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _DisplayPowerState(value: Int) = when(value) {
	0 -> DisplayPowerState.OFF
	1 -> DisplayPowerState.SUSPEND
	2 -> DisplayPowerState.ON
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _DeviceEventType(value: Int) = when(value) {
	0 -> DeviceEventType.DISPLAY_HOTPLUG
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _DisplayEventType(value: Int) = when(value) {
	0 -> DisplayEventType.FIRST_PIXEL_OUT
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ViewportCoordinateSwizzle(value: Int) = when(value) {
	0 -> ViewportCoordinateSwizzle.POSITIVE_X
	1 -> ViewportCoordinateSwizzle.NEGATIVE_X
	2 -> ViewportCoordinateSwizzle.POSITIVE_Y
	3 -> ViewportCoordinateSwizzle.NEGATIVE_Y
	4 -> ViewportCoordinateSwizzle.POSITIVE_Z
	5 -> ViewportCoordinateSwizzle.NEGATIVE_Z
	6 -> ViewportCoordinateSwizzle.POSITIVE_W
	7 -> ViewportCoordinateSwizzle.NEGATIVE_W
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _DiscardRectangleMode(value: Int) = when(value) {
	0 -> DiscardRectangleMode.INCLUSIVE
	1 -> DiscardRectangleMode.EXCLUSIVE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ConservativeRasterizationMode(value: Int) = when(value) {
	0 -> ConservativeRasterizationMode.DISABLED
	1 -> ConservativeRasterizationMode.OVERESTIMATE
	2 -> ConservativeRasterizationMode.UNDERESTIMATE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PerformanceCounterScope(value: Int) = when(value) {
	0 -> PerformanceCounterScope.COMMAND_BUFFER
	1 -> PerformanceCounterScope.RENDER_PASS
	2 -> PerformanceCounterScope.COMMAND
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PerformanceCounterStorage(value: Int) = when(value) {
	0 -> PerformanceCounterStorage.INT32
	1 -> PerformanceCounterStorage.INT64
	2 -> PerformanceCounterStorage.UINT32
	3 -> PerformanceCounterStorage.UINT64
	4 -> PerformanceCounterStorage.FLOAT32
	5 -> PerformanceCounterStorage.FLOAT64
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PerformanceCounterUnit(value: Int) = when(value) {
	0 -> PerformanceCounterUnit.GENERIC
	1 -> PerformanceCounterUnit.PERCENTAGE
	2 -> PerformanceCounterUnit.NANOSECONDS
	3 -> PerformanceCounterUnit.BYTES
	4 -> PerformanceCounterUnit.BYTES_PER_SECOND
	5 -> PerformanceCounterUnit.KELVIN
	6 -> PerformanceCounterUnit.WATTS
	7 -> PerformanceCounterUnit.VOLTS
	8 -> PerformanceCounterUnit.AMPS
	9 -> PerformanceCounterUnit.HERTZ
	10 -> PerformanceCounterUnit.CYCLES
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _BlendOverlap(value: Int) = when(value) {
	0 -> BlendOverlap.UNCORRELATED
	1 -> BlendOverlap.DISJOINT
	2 -> BlendOverlap.CONJOINT
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _AccelerationStructureType(value: Int) = when(value) {
	0 -> AccelerationStructureType.TOP_LEVEL
	1 -> AccelerationStructureType.BOTTOM_LEVEL
	2 -> AccelerationStructureType.GENERIC
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _AccelerationStructureBuildType(value: Int) = when(value) {
	0 -> AccelerationStructureBuildType.HOST
	1 -> AccelerationStructureBuildType.DEVICE
	2 -> AccelerationStructureBuildType.HOST_OR_DEVICE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _CopyAccelerationStructureMode(value: Int) = when(value) {
	0 -> CopyAccelerationStructureMode.CLONE
	1 -> CopyAccelerationStructureMode.COMPACT
	2 -> CopyAccelerationStructureMode.SERIALIZE
	3 -> CopyAccelerationStructureMode.DESERIALIZE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _GeometryType(value: Int) = when(value) {
	0 -> GeometryType.TRIANGLES
	1 -> GeometryType.AABBS
	2 -> GeometryType.INSTANCES
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _AccelerationStructureCompatibility(value: Int) = when(value) {
	0 -> AccelerationStructureCompatibility.COMPATIBLE
	1 -> AccelerationStructureCompatibility.INCOMPATIBLE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _BuildAccelerationStructureMode(value: Int) = when(value) {
	0 -> BuildAccelerationStructureMode.BUILD
	1 -> BuildAccelerationStructureMode.UPDATE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _RayTracingShaderGroupType(value: Int) = when(value) {
	0 -> RayTracingShaderGroupType.GENERAL
	1 -> RayTracingShaderGroupType.TRIANGLES_HIT_GROUP
	2 -> RayTracingShaderGroupType.PROCEDURAL_HIT_GROUP
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ShaderGroupShader(value: Int) = when(value) {
	0 -> ShaderGroupShader.GENERAL
	1 -> ShaderGroupShader.CLOSEST_HIT
	2 -> ShaderGroupShader.ANY_HIT
	3 -> ShaderGroupShader.INTERSECTION
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _CoverageModulationMode(value: Int) = when(value) {
	0 -> CoverageModulationMode.NONE
	1 -> CoverageModulationMode.RGB
	2 -> CoverageModulationMode.ALPHA
	3 -> CoverageModulationMode.RGBA
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ValidationCacheHeaderVersion(value: Int) = when(value) {
	1 -> ValidationCacheHeaderVersion.ONE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ShadingRatePaletteEntry(value: Int) = when(value) {
	0 -> ShadingRatePaletteEntry.NO_INVOCATIONS
	1 -> ShadingRatePaletteEntry._16_INVOCATIONS_PER_PIXEL
	2 -> ShadingRatePaletteEntry._8_INVOCATIONS_PER_PIXEL
	3 -> ShadingRatePaletteEntry._4_INVOCATIONS_PER_PIXEL
	4 -> ShadingRatePaletteEntry._2_INVOCATIONS_PER_PIXEL
	5 -> ShadingRatePaletteEntry._1_INVOCATION_PER_PIXEL
	6 -> ShadingRatePaletteEntry._1_INVOCATION_PER_2X1_PIXELS
	7 -> ShadingRatePaletteEntry._1_INVOCATION_PER_1X2_PIXELS
	8 -> ShadingRatePaletteEntry._1_INVOCATION_PER_2X2_PIXELS
	9 -> ShadingRatePaletteEntry._1_INVOCATION_PER_4X2_PIXELS
	10 -> ShadingRatePaletteEntry._1_INVOCATION_PER_2X4_PIXELS
	11 -> ShadingRatePaletteEntry._1_INVOCATION_PER_4X4_PIXELS
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _CoarseSampleOrderType(value: Int) = when(value) {
	0 -> CoarseSampleOrderType.DEFAULT
	1 -> CoarseSampleOrderType.CUSTOM
	2 -> CoarseSampleOrderType.PIXEL_MAJOR
	3 -> CoarseSampleOrderType.SAMPLE_MAJOR
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _AccelerationStructureMemoryRequirementsType(value: Int) = when(value) {
	0 -> AccelerationStructureMemoryRequirementsType.OBJECT
	1 -> AccelerationStructureMemoryRequirementsType.BUILD_SCRATCH
	2 -> AccelerationStructureMemoryRequirementsType.UPDATE_SCRATCH
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _QueueGlobalPriority(value: Int) = when(value) {
	128 -> QueueGlobalPriority.LOW
	256 -> QueueGlobalPriority.MEDIUM
	512 -> QueueGlobalPriority.HIGH
	1024 -> QueueGlobalPriority.REALTIME
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _TimeDomain(value: Int) = when(value) {
	0 -> TimeDomain.DEVICE
	1 -> TimeDomain.CLOCK_MONOTONIC
	2 -> TimeDomain.CLOCK_MONOTONIC_RAW
	3 -> TimeDomain.QUERY_PERFORMANCE_COUNTER
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _MemoryOverallocationBehavior(value: Int) = when(value) {
	0 -> MemoryOverallocationBehavior.DEFAULT
	1 -> MemoryOverallocationBehavior.ALLOWED
	2 -> MemoryOverallocationBehavior.DISALLOWED
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PerformanceConfigurationType(value: Int) = when(value) {
	0 -> PerformanceConfigurationType.COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _QueryPoolSamplingMode(value: Int) = when(value) {
	0 -> QueryPoolSamplingMode.MANUAL
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PerformanceOverrideType(value: Int) = when(value) {
	0 -> PerformanceOverrideType.NULL_HARDWARE
	1 -> PerformanceOverrideType.FLUSH_GPU_CACHES
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PerformanceParameterType(value: Int) = when(value) {
	0 -> PerformanceParameterType.HW_COUNTERS_SUPPORTED
	1 -> PerformanceParameterType.STREAM_MARKER_VALID_BITS
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PerformanceValueType(value: Int) = when(value) {
	0 -> PerformanceValueType.UINT32
	1 -> PerformanceValueType.UINT64
	2 -> PerformanceValueType.FLOAT
	3 -> PerformanceValueType.BOOL
	4 -> PerformanceValueType.STRING
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _FragmentShadingRateCombinerOp(value: Int) = when(value) {
	0 -> FragmentShadingRateCombinerOp.KEEP
	1 -> FragmentShadingRateCombinerOp.REPLACE
	2 -> FragmentShadingRateCombinerOp.MIN
	3 -> FragmentShadingRateCombinerOp.MAX
	4 -> FragmentShadingRateCombinerOp.MUL
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ValidationFeatureEnable(value: Int) = when(value) {
	0 -> ValidationFeatureEnable.GPU_ASSISTED
	1 -> ValidationFeatureEnable.GPU_ASSISTED_RESERVE_BINDING_SLOT
	2 -> ValidationFeatureEnable.BEST_PRACTICES
	3 -> ValidationFeatureEnable.DEBUG_PRINTF
	4 -> ValidationFeatureEnable.SYNCHRONIZATION_VALIDATION
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ValidationFeatureDisable(value: Int) = when(value) {
	0 -> ValidationFeatureDisable.ALL
	1 -> ValidationFeatureDisable.SHADERS
	2 -> ValidationFeatureDisable.THREAD_SAFETY
	3 -> ValidationFeatureDisable.API_PARAMETERS
	4 -> ValidationFeatureDisable.OBJECT_LIFETIMES
	5 -> ValidationFeatureDisable.CORE_CHECKS
	6 -> ValidationFeatureDisable.UNIQUE_HANDLES
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _Scope(value: Int) = when(value) {
	1 -> Scope.DEVICE
	2 -> Scope.WORKGROUP
	3 -> Scope.SUBGROUP
	5 -> Scope.QUEUE_FAMILY
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _ComponentType(value: Int) = when(value) {
	0 -> ComponentType.FLOAT16
	1 -> ComponentType.FLOAT32
	2 -> ComponentType.FLOAT64
	3 -> ComponentType.SINT8
	4 -> ComponentType.SINT16
	5 -> ComponentType.SINT32
	6 -> ComponentType.SINT64
	7 -> ComponentType.UINT8
	8 -> ComponentType.UINT16
	9 -> ComponentType.UINT32
	10 -> ComponentType.UINT64
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _CoverageReductionMode(value: Int) = when(value) {
	0 -> CoverageReductionMode.MERGE
	1 -> CoverageReductionMode.TRUNCATE
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _FullScreenExclusive(value: Int) = when(value) {
	0 -> FullScreenExclusive.DEFAULT
	1 -> FullScreenExclusive.ALLOWED
	2 -> FullScreenExclusive.DISALLOWED
	3 -> FullScreenExclusive.APPLICATION_CONTROLLED
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _LineRasterizationMode(value: Int) = when(value) {
	0 -> LineRasterizationMode.DEFAULT
	1 -> LineRasterizationMode.RECTANGULAR
	2 -> LineRasterizationMode.BRESENHAM
	3 -> LineRasterizationMode.RECTANGULAR_SMOOTH
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _PipelineExecutableStatisticFormat(value: Int) = when(value) {
	0 -> PipelineExecutableStatisticFormat.BOOL32
	1 -> PipelineExecutableStatisticFormat.INT64
	2 -> PipelineExecutableStatisticFormat.UINT64
	3 -> PipelineExecutableStatisticFormat.FLOAT64
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _IndirectCommandsTokenType(value: Int) = when(value) {
	0 -> IndirectCommandsTokenType.SHADER_GROUP
	1 -> IndirectCommandsTokenType.STATE_FLAGS
	2 -> IndirectCommandsTokenType.INDEX_BUFFER
	3 -> IndirectCommandsTokenType.VERTEX_BUFFER
	4 -> IndirectCommandsTokenType.PUSH_CONSTANT
	5 -> IndirectCommandsTokenType.DRAW_INDEXED
	6 -> IndirectCommandsTokenType.DRAW
	7 -> IndirectCommandsTokenType.DRAW_TASKS
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _DeviceMemoryReportEventType(value: Int) = when(value) {
	0 -> DeviceMemoryReportEventType.ALLOCATE
	1 -> DeviceMemoryReportEventType.FREE
	2 -> DeviceMemoryReportEventType.IMPORT
	3 -> DeviceMemoryReportEventType.UNIMPORT
	4 -> DeviceMemoryReportEventType.ALLOCATION_FAILED
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _FragmentShadingRate(value: Int) = when(value) {
	0 -> FragmentShadingRate._1_INVOCATION_PER_PIXEL
	1 -> FragmentShadingRate._1_INVOCATION_PER_1X2_PIXELS
	4 -> FragmentShadingRate._1_INVOCATION_PER_2X1_PIXELS
	5 -> FragmentShadingRate._1_INVOCATION_PER_2X2_PIXELS
	6 -> FragmentShadingRate._1_INVOCATION_PER_2X4_PIXELS
	9 -> FragmentShadingRate._1_INVOCATION_PER_4X2_PIXELS
	10 -> FragmentShadingRate._1_INVOCATION_PER_4X4_PIXELS
	11 -> FragmentShadingRate._2_INVOCATIONS_PER_PIXEL
	12 -> FragmentShadingRate._4_INVOCATIONS_PER_PIXEL
	13 -> FragmentShadingRate._8_INVOCATIONS_PER_PIXEL
	14 -> FragmentShadingRate._16_INVOCATIONS_PER_PIXEL
	15 -> FragmentShadingRate.NO_INVOCATIONS
	else -> throw RuntimeException("Invalid enum: $value")
}

internal fun _FragmentShadingRateType(value: Int) = when(value) {
	0 -> FragmentShadingRateType.FRAGMENT_SIZE
	1 -> FragmentShadingRateType.ENUMS
	else -> throw RuntimeException("Invalid enum: $value")
}