// This file has been automatically generated.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

fun _VendorId(value: Int) = when(value) {
	0x10001 -> VendorId.VIV
	0x10002 -> VendorId.VSI
	0x10003 -> VendorId.KAZAN
	0x10004 -> VendorId.CODEPLAY
	0x10005 -> VendorId.MESA
	0x10006 -> VendorId.POCL
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _PipelineCacheHeaderVersion(value: Int) = when(value) {
	1 -> PipelineCacheHeaderVersion.ONE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _ImageTiling(value: Int) = when(value) {
	0 -> ImageTiling.OPTIMAL
	1 -> ImageTiling.LINEAR
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _ImageType(value: Int) = when(value) {
	0 -> ImageType._1D
	1 -> ImageType._2D
	2 -> ImageType._3D
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _InternalAllocationType(value: Int) = when(value) {
	0 -> InternalAllocationType.EXECUTABLE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _PhysicalDeviceType(value: Int) = when(value) {
	0 -> PhysicalDeviceType.OTHER
	1 -> PhysicalDeviceType.INTEGRATED_GPU
	2 -> PhysicalDeviceType.DISCRETE_GPU
	3 -> PhysicalDeviceType.VIRTUAL_GPU
	4 -> PhysicalDeviceType.CPU
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _SystemAllocationScope(value: Int) = when(value) {
	0 -> SystemAllocationScope.COMMAND
	1 -> SystemAllocationScope.OBJECT
	2 -> SystemAllocationScope.CACHE
	3 -> SystemAllocationScope.DEVICE
	4 -> SystemAllocationScope.INSTANCE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _QueryType(value: Int) = when(value) {
	0 -> QueryType.OCCLUSION
	1 -> QueryType.PIPELINE_STATISTICS
	2 -> QueryType.TIMESTAMP
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _SharingMode(value: Int) = when(value) {
	0 -> SharingMode.EXCLUSIVE
	1 -> SharingMode.CONCURRENT
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _ImageLayout(value: Int) = when(value) {
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
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _ComponentSwizzle(value: Int) = when(value) {
	0 -> ComponentSwizzle.IDENTITY
	1 -> ComponentSwizzle.ZERO
	2 -> ComponentSwizzle.ONE
	3 -> ComponentSwizzle.R
	4 -> ComponentSwizzle.G
	5 -> ComponentSwizzle.B
	6 -> ComponentSwizzle.A
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _ImageViewType(value: Int) = when(value) {
	0 -> ImageViewType._1D
	1 -> ImageViewType._2D
	2 -> ImageViewType._3D
	3 -> ImageViewType.CUBE
	4 -> ImageViewType._1D_ARRAY
	5 -> ImageViewType._2D_ARRAY
	6 -> ImageViewType.CUBE_ARRAY
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _BlendFactor(value: Int) = when(value) {
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

fun _BlendOp(value: Int) = when(value) {
	0 -> BlendOp.ADD
	1 -> BlendOp.SUBTRACT
	2 -> BlendOp.REVERSE_SUBTRACT
	3 -> BlendOp.MIN
	4 -> BlendOp.MAX
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _CompareOp(value: Int) = when(value) {
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

fun _DynamicState(value: Int) = when(value) {
	0 -> DynamicState.VIEWPORT
	1 -> DynamicState.SCISSOR
	2 -> DynamicState.LINE_WIDTH
	3 -> DynamicState.DEPTH_BIAS
	4 -> DynamicState.BLEND_CONSTANTS
	5 -> DynamicState.DEPTH_BOUNDS
	6 -> DynamicState.STENCIL_COMPARE_MASK
	7 -> DynamicState.STENCIL_WRITE_MASK
	8 -> DynamicState.STENCIL_REFERENCE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _FrontFace(value: Int) = when(value) {
	0 -> FrontFace.COUNTER_CLOCKWISE
	1 -> FrontFace.CLOCKWISE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _LogicOp(value: Int) = when(value) {
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

fun _PolygonMode(value: Int) = when(value) {
	0 -> PolygonMode.FILL
	1 -> PolygonMode.LINE
	2 -> PolygonMode.POINT
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _PrimitiveTopology(value: Int) = when(value) {
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

fun _StencilOp(value: Int) = when(value) {
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

fun _VertexInputRate(value: Int) = when(value) {
	0 -> VertexInputRate.VERTEX
	1 -> VertexInputRate.INSTANCE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _BorderColor(value: Int) = when(value) {
	0 -> BorderColor.FLOAT_TRANSPARENT_BLACK
	1 -> BorderColor.INT_TRANSPARENT_BLACK
	2 -> BorderColor.FLOAT_OPAQUE_BLACK
	3 -> BorderColor.INT_OPAQUE_BLACK
	4 -> BorderColor.FLOAT_OPAQUE_WHITE
	5 -> BorderColor.INT_OPAQUE_WHITE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _Filter(value: Int) = when(value) {
	0 -> Filter.NEAREST
	1 -> Filter.LINEAR
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _SamplerAddressMode(value: Int) = when(value) {
	0 -> SamplerAddressMode.REPEAT
	1 -> SamplerAddressMode.MIRRORED_REPEAT
	2 -> SamplerAddressMode.CLAMP_TO_EDGE
	3 -> SamplerAddressMode.CLAMP_TO_BORDER
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _SamplerMipmapMode(value: Int) = when(value) {
	0 -> SamplerMipmapMode.NEAREST
	1 -> SamplerMipmapMode.LINEAR
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _DescriptorType(value: Int) = when(value) {
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
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _AttachmentLoadOp(value: Int) = when(value) {
	0 -> AttachmentLoadOp.LOAD
	1 -> AttachmentLoadOp.CLEAR
	2 -> AttachmentLoadOp.DONT_CARE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _AttachmentStoreOp(value: Int) = when(value) {
	0 -> AttachmentStoreOp.STORE
	1 -> AttachmentStoreOp.DONT_CARE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _PipelineBindPoint(value: Int) = when(value) {
	0 -> PipelineBindPoint.GRAPHICS
	1 -> PipelineBindPoint.COMPUTE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _CommandBufferLevel(value: Int) = when(value) {
	0 -> CommandBufferLevel.PRIMARY
	1 -> CommandBufferLevel.SECONDARY
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _IndexType(value: Int) = when(value) {
	0 -> IndexType.UINT16
	1 -> IndexType.UINT32
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _SubpassContents(value: Int) = when(value) {
	0 -> SubpassContents.INLINE
	1 -> SubpassContents.SECONDARY_COMMAND_BUFFERS
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _PointClippingBehavior(value: Int) = when(value) {
	0 -> PointClippingBehavior.ALL_CLIP_PLANES
	1 -> PointClippingBehavior.USER_CLIP_PLANES_ONLY
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _TessellationDomainOrigin(value: Int) = when(value) {
	0 -> TessellationDomainOrigin.UPPER_LEFT
	1 -> TessellationDomainOrigin.LOWER_LEFT
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _SamplerYcbcrModelConversion(value: Int) = when(value) {
	0 -> SamplerYcbcrModelConversion.RGB_IDENTITY
	1 -> SamplerYcbcrModelConversion.YCBCR_IDENTITY
	2 -> SamplerYcbcrModelConversion.YCBCR_709
	3 -> SamplerYcbcrModelConversion.YCBCR_601
	4 -> SamplerYcbcrModelConversion.YCBCR_2020
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _SamplerYcbcrRange(value: Int) = when(value) {
	0 -> SamplerYcbcrRange.ITU_FULL
	1 -> SamplerYcbcrRange.ITU_NARROW
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _ChromaLocation(value: Int) = when(value) {
	0 -> ChromaLocation.COSITED_EVEN
	1 -> ChromaLocation.MIDPOINT
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _DescriptorUpdateTemplateType(value: Int) = when(value) {
	0 -> DescriptorUpdateTemplateType.DESCRIPTOR_SET
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _DriverId(value: Int) = when(value) {
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
	15 -> DriverId.COREAVI_PROPRIETARY
	16 -> DriverId.JUICE_PROPRIETARY
	17 -> DriverId.VERISILICON_PROPRIETARY
	18 -> DriverId.MESA_TURNIP
	19 -> DriverId.MESA_V3DV
	20 -> DriverId.MESA_PANVK
	21 -> DriverId.SAMSUNG_PROPRIETARY
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _ShaderFloatControlsIndependence(value: Int) = when(value) {
	0 -> ShaderFloatControlsIndependence._32_BIT_ONLY
	1 -> ShaderFloatControlsIndependence.ALL
	2 -> ShaderFloatControlsIndependence.NONE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _SamplerReductionMode(value: Int) = when(value) {
	0 -> SamplerReductionMode.WEIGHTED_AVERAGE
	1 -> SamplerReductionMode.MIN
	2 -> SamplerReductionMode.MAX
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _SemaphoreType(value: Int) = when(value) {
	0 -> SemaphoreType.BINARY
	1 -> SemaphoreType.TIMELINE
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _PresentMode(value: Int) = when(value) {
	0 -> PresentMode.IMMEDIATE
	1 -> PresentMode.MAILBOX
	2 -> PresentMode.FIFO
	3 -> PresentMode.FIFO_RELAXED
	else -> throw RuntimeException("Invalid enum: $value")
}

fun _ColorSpace(value: Int) = when(value) {
	0 -> ColorSpace.SRGB_NONLINEAR
	else -> throw RuntimeException("Invalid enum: $value")
}