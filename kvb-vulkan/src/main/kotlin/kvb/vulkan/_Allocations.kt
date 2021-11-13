// This file has been automatically generated.

// This file's name has been prefixed with '_' so that it appears at the top of the package.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.Allocator

inline fun Allocator.Extent2D(block: (Extent2D) -> Unit) = Extent2D(calloc(8)).apply(block)

inline fun Allocator.Extent3D(block: (Extent3D) -> Unit) = Extent3D(calloc(12)).apply(block)

inline fun Allocator.Offset2D(block: (Offset2D) -> Unit) = Offset2D(calloc(8)).apply(block)

inline fun Allocator.Offset3D(block: (Offset3D) -> Unit) = Offset3D(calloc(12)).apply(block)

inline fun Allocator.Offset3D(capacity: Int, block: (Offset3D.Buffer) -> Unit) = Offset3D.Buffer(calloc(capacity * 12), capacity).apply(block)

inline fun Allocator.Rect2D(block: (Rect2D) -> Unit) = Rect2D(calloc(16)).apply(block)

inline fun Allocator.Rect2D(capacity: Int, block: (Rect2D.Buffer) -> Unit) = Rect2D.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.BaseInStructure(block: (BaseInStructure) -> Unit) = BaseInStructure(calloc(16)).apply(block)

inline fun Allocator.BaseOutStructure(block: (BaseOutStructure) -> Unit) = BaseOutStructure(calloc(16)).apply(block)

inline fun Allocator.BufferMemoryBarrier(block: (BufferMemoryBarrier) -> Unit) = BufferMemoryBarrier(calloc(56)).apply(block).also { it.sType = 44 }

inline fun Allocator.BufferMemoryBarrier(capacity: Int, block: (BufferMemoryBarrier.Buffer) -> Unit) = BufferMemoryBarrier.Buffer(calloc(capacity * 56), capacity).apply(block).apply { forEach { it.sType = 44 } }

inline fun Allocator.DispatchIndirectCommand(block: (DispatchIndirectCommand) -> Unit) = DispatchIndirectCommand(calloc(12)).apply(block)

inline fun Allocator.DrawIndexedIndirectCommand(block: (DrawIndexedIndirectCommand) -> Unit) = DrawIndexedIndirectCommand(calloc(20)).apply(block)

inline fun Allocator.DrawIndirectCommand(block: (DrawIndirectCommand) -> Unit) = DrawIndirectCommand(calloc(16)).apply(block)

inline fun Allocator.ImageMemoryBarrier(block: (ImageMemoryBarrier) -> Unit) = ImageMemoryBarrier(calloc(72)).apply(block).also { it.sType = 45 }

inline fun Allocator.ImageMemoryBarrier(capacity: Int, block: (ImageMemoryBarrier.Buffer) -> Unit) = ImageMemoryBarrier.Buffer(calloc(capacity * 72), capacity).apply(block).apply { forEach { it.sType = 45 } }

inline fun Allocator.MemoryBarrier(block: (MemoryBarrier) -> Unit) = MemoryBarrier(calloc(24)).apply(block).also { it.sType = 46 }

inline fun Allocator.MemoryBarrier(capacity: Int, block: (MemoryBarrier.Buffer) -> Unit) = MemoryBarrier.Buffer(calloc(capacity * 24), capacity).apply(block).apply { forEach { it.sType = 46 } }

inline fun Allocator.AllocationCallbacks(block: (AllocationCallbacks) -> Unit) = AllocationCallbacks(calloc(48)).apply(block)

inline fun Allocator.ApplicationInfo(block: (ApplicationInfo) -> Unit) = ApplicationInfo(calloc(48)).apply(block).also { it.sType = 0 }

inline fun Allocator.FormatProperties(block: (FormatProperties) -> Unit) = FormatProperties(calloc(12)).apply(block)

inline fun Allocator.ImageFormatProperties(block: (ImageFormatProperties) -> Unit) = ImageFormatProperties(calloc(32)).apply(block)

inline fun Allocator.InstanceCreateInfo(block: (InstanceCreateInfo) -> Unit) = InstanceCreateInfo(calloc(64)).apply(block).also { it.sType = 1 }

inline fun Allocator.MemoryHeap(block: (MemoryHeap) -> Unit) = MemoryHeap(calloc(16)).apply(block)

inline fun Allocator.MemoryHeap(capacity: Int, block: (MemoryHeap.Buffer) -> Unit) = MemoryHeap.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.MemoryType(block: (MemoryType) -> Unit) = MemoryType(calloc(8)).apply(block)

inline fun Allocator.MemoryType(capacity: Int, block: (MemoryType.Buffer) -> Unit) = MemoryType.Buffer(calloc(capacity * 8), capacity).apply(block)

inline fun Allocator.PhysicalDeviceFeatures(block: (PhysicalDeviceFeatures) -> Unit) = PhysicalDeviceFeatures(calloc(220)).apply(block)

inline fun Allocator.PhysicalDeviceLimits(block: (PhysicalDeviceLimits) -> Unit) = PhysicalDeviceLimits(calloc(504)).apply(block)

inline fun Allocator.PhysicalDeviceMemoryProperties(block: (PhysicalDeviceMemoryProperties) -> Unit) = PhysicalDeviceMemoryProperties(calloc(520)).apply(block)

inline fun Allocator.PhysicalDeviceProperties(block: (PhysicalDeviceProperties) -> Unit) = PhysicalDeviceProperties(calloc(824)).apply(block)

inline fun Allocator.PhysicalDeviceSparseProperties(block: (PhysicalDeviceSparseProperties) -> Unit) = PhysicalDeviceSparseProperties(calloc(20)).apply(block)

inline fun Allocator.QueueFamilyProperties(block: (QueueFamilyProperties) -> Unit) = QueueFamilyProperties(calloc(24)).apply(block)

inline fun Allocator.QueueFamilyProperties(capacity: Int, block: (QueueFamilyProperties.Buffer) -> Unit) = QueueFamilyProperties.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.DeviceCreateInfo(block: (DeviceCreateInfo) -> Unit) = DeviceCreateInfo(calloc(72)).apply(block).also { it.sType = 3 }

inline fun Allocator.DeviceQueueCreateInfo(block: (DeviceQueueCreateInfo) -> Unit) = DeviceQueueCreateInfo(calloc(40)).apply(block).also { it.sType = 2 }

inline fun Allocator.DeviceQueueCreateInfo(capacity: Int, block: (DeviceQueueCreateInfo.Buffer) -> Unit) = DeviceQueueCreateInfo.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 2 } }

inline fun Allocator.ExtensionProperties(block: (ExtensionProperties) -> Unit) = ExtensionProperties(calloc(260)).apply(block)

inline fun Allocator.ExtensionProperties(capacity: Int, block: (ExtensionProperties.Buffer) -> Unit) = ExtensionProperties.Buffer(calloc(capacity * 260), capacity).apply(block)

inline fun Allocator.LayerProperties(block: (LayerProperties) -> Unit) = LayerProperties(calloc(520)).apply(block)

inline fun Allocator.LayerProperties(capacity: Int, block: (LayerProperties.Buffer) -> Unit) = LayerProperties.Buffer(calloc(capacity * 520), capacity).apply(block)

inline fun Allocator.SubmitInfo(block: (SubmitInfo) -> Unit) = SubmitInfo(calloc(72)).apply(block).also { it.sType = 4 }

inline fun Allocator.SubmitInfo(capacity: Int, block: (SubmitInfo.Buffer) -> Unit) = SubmitInfo.Buffer(calloc(capacity * 72), capacity).apply(block).apply { forEach { it.sType = 4 } }

inline fun Allocator.MappedMemoryRange(block: (MappedMemoryRange) -> Unit) = MappedMemoryRange(calloc(40)).apply(block).also { it.sType = 6 }

inline fun Allocator.MappedMemoryRange(capacity: Int, block: (MappedMemoryRange.Buffer) -> Unit) = MappedMemoryRange.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 6 } }

inline fun Allocator.MemoryAllocateInfo(block: (MemoryAllocateInfo) -> Unit) = MemoryAllocateInfo(calloc(32)).apply(block).also { it.sType = 5 }

inline fun Allocator.MemoryRequirements(block: (MemoryRequirements) -> Unit) = MemoryRequirements(calloc(24)).apply(block)

inline fun Allocator.BindSparseInfo(block: (BindSparseInfo) -> Unit) = BindSparseInfo(calloc(96)).apply(block).also { it.sType = 7 }

inline fun Allocator.BindSparseInfo(capacity: Int, block: (BindSparseInfo.Buffer) -> Unit) = BindSparseInfo.Buffer(calloc(capacity * 96), capacity).apply(block).apply { forEach { it.sType = 7 } }

inline fun Allocator.ImageSubresource(block: (ImageSubresource) -> Unit) = ImageSubresource(calloc(12)).apply(block)

inline fun Allocator.SparseBufferMemoryBindInfo(block: (SparseBufferMemoryBindInfo) -> Unit) = SparseBufferMemoryBindInfo(calloc(24)).apply(block)

inline fun Allocator.SparseBufferMemoryBindInfo(capacity: Int, block: (SparseBufferMemoryBindInfo.Buffer) -> Unit) = SparseBufferMemoryBindInfo.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.SparseImageFormatProperties(block: (SparseImageFormatProperties) -> Unit) = SparseImageFormatProperties(calloc(20)).apply(block)

inline fun Allocator.SparseImageFormatProperties(capacity: Int, block: (SparseImageFormatProperties.Buffer) -> Unit) = SparseImageFormatProperties.Buffer(calloc(capacity * 20), capacity).apply(block)

inline fun Allocator.SparseImageMemoryBind(block: (SparseImageMemoryBind) -> Unit) = SparseImageMemoryBind(calloc(64)).apply(block)

inline fun Allocator.SparseImageMemoryBind(capacity: Int, block: (SparseImageMemoryBind.Buffer) -> Unit) = SparseImageMemoryBind.Buffer(calloc(capacity * 64), capacity).apply(block)

inline fun Allocator.SparseImageMemoryBindInfo(block: (SparseImageMemoryBindInfo) -> Unit) = SparseImageMemoryBindInfo(calloc(24)).apply(block)

inline fun Allocator.SparseImageMemoryBindInfo(capacity: Int, block: (SparseImageMemoryBindInfo.Buffer) -> Unit) = SparseImageMemoryBindInfo.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.SparseImageMemoryRequirements(block: (SparseImageMemoryRequirements) -> Unit) = SparseImageMemoryRequirements(calloc(48)).apply(block)

inline fun Allocator.SparseImageMemoryRequirements(capacity: Int, block: (SparseImageMemoryRequirements.Buffer) -> Unit) = SparseImageMemoryRequirements.Buffer(calloc(capacity * 48), capacity).apply(block)

inline fun Allocator.SparseImageOpaqueMemoryBindInfo(block: (SparseImageOpaqueMemoryBindInfo) -> Unit) = SparseImageOpaqueMemoryBindInfo(calloc(24)).apply(block)

inline fun Allocator.SparseImageOpaqueMemoryBindInfo(capacity: Int, block: (SparseImageOpaqueMemoryBindInfo.Buffer) -> Unit) = SparseImageOpaqueMemoryBindInfo.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.SparseMemoryBind(block: (SparseMemoryBind) -> Unit) = SparseMemoryBind(calloc(40)).apply(block)

inline fun Allocator.SparseMemoryBind(capacity: Int, block: (SparseMemoryBind.Buffer) -> Unit) = SparseMemoryBind.Buffer(calloc(capacity * 40), capacity).apply(block)

inline fun Allocator.FenceCreateInfo(block: (FenceCreateInfo) -> Unit) = FenceCreateInfo(calloc(24)).apply(block).also { it.sType = 8 }

inline fun Allocator.SemaphoreCreateInfo(block: (SemaphoreCreateInfo) -> Unit) = SemaphoreCreateInfo(calloc(24)).apply(block).also { it.sType = 9 }

inline fun Allocator.EventCreateInfo(block: (EventCreateInfo) -> Unit) = EventCreateInfo(calloc(24)).apply(block).also { it.sType = 10 }

inline fun Allocator.QueryPoolCreateInfo(block: (QueryPoolCreateInfo) -> Unit) = QueryPoolCreateInfo(calloc(32)).apply(block).also { it.sType = 11 }

inline fun Allocator.BufferCreateInfo(block: (BufferCreateInfo) -> Unit) = BufferCreateInfo(calloc(56)).apply(block).also { it.sType = 12 }

inline fun Allocator.BufferViewCreateInfo(block: (BufferViewCreateInfo) -> Unit) = BufferViewCreateInfo(calloc(56)).apply(block).also { it.sType = 13 }

inline fun Allocator.ImageCreateInfo(block: (ImageCreateInfo) -> Unit) = ImageCreateInfo(calloc(88)).apply(block).also { it.sType = 14 }

inline fun Allocator.SubresourceLayout(block: (SubresourceLayout) -> Unit) = SubresourceLayout(calloc(40)).apply(block)

inline fun Allocator.SubresourceLayout(capacity: Int, block: (SubresourceLayout.Buffer) -> Unit) = SubresourceLayout.Buffer(calloc(capacity * 40), capacity).apply(block)

inline fun Allocator.ComponentMapping(block: (ComponentMapping) -> Unit) = ComponentMapping(calloc(16)).apply(block)

inline fun Allocator.ImageSubresourceRange(block: (ImageSubresourceRange) -> Unit) = ImageSubresourceRange(calloc(20)).apply(block)

inline fun Allocator.ImageSubresourceRange(capacity: Int, block: (ImageSubresourceRange.Buffer) -> Unit) = ImageSubresourceRange.Buffer(calloc(capacity * 20), capacity).apply(block)

inline fun Allocator.ImageViewCreateInfo(block: (ImageViewCreateInfo) -> Unit) = ImageViewCreateInfo(calloc(80)).apply(block).also { it.sType = 15 }

inline fun Allocator.ShaderModuleCreateInfo(block: (ShaderModuleCreateInfo) -> Unit) = ShaderModuleCreateInfo(calloc(40)).apply(block).also { it.sType = 16 }

inline fun Allocator.PipelineCacheCreateInfo(block: (PipelineCacheCreateInfo) -> Unit) = PipelineCacheCreateInfo(calloc(40)).apply(block).also { it.sType = 17 }

inline fun Allocator.ComputePipelineCreateInfo(block: (ComputePipelineCreateInfo) -> Unit) = ComputePipelineCreateInfo(calloc(96)).apply(block).also { it.sType = 29 }

inline fun Allocator.ComputePipelineCreateInfo(capacity: Int, block: (ComputePipelineCreateInfo.Buffer) -> Unit) = ComputePipelineCreateInfo.Buffer(calloc(capacity * 96), capacity).apply(block).apply { forEach { it.sType = 29 } }

inline fun Allocator.GraphicsPipelineCreateInfo(block: (GraphicsPipelineCreateInfo) -> Unit) = GraphicsPipelineCreateInfo(calloc(144)).apply(block).also { it.sType = 28 }

inline fun Allocator.GraphicsPipelineCreateInfo(capacity: Int, block: (GraphicsPipelineCreateInfo.Buffer) -> Unit) = GraphicsPipelineCreateInfo.Buffer(calloc(capacity * 144), capacity).apply(block).apply { forEach { it.sType = 28 } }

inline fun Allocator.PipelineColorBlendAttachmentState(block: (PipelineColorBlendAttachmentState) -> Unit) = PipelineColorBlendAttachmentState(calloc(32)).apply(block)

inline fun Allocator.PipelineColorBlendAttachmentState(capacity: Int, block: (PipelineColorBlendAttachmentState.Buffer) -> Unit) = PipelineColorBlendAttachmentState.Buffer(calloc(capacity * 32), capacity).apply(block)

inline fun Allocator.PipelineColorBlendStateCreateInfo(block: (PipelineColorBlendStateCreateInfo) -> Unit) = PipelineColorBlendStateCreateInfo(calloc(56)).apply(block).also { it.sType = 26 }

inline fun Allocator.PipelineDepthStencilStateCreateInfo(block: (PipelineDepthStencilStateCreateInfo) -> Unit) = PipelineDepthStencilStateCreateInfo(calloc(104)).apply(block).also { it.sType = 25 }

inline fun Allocator.PipelineDynamicStateCreateInfo(block: (PipelineDynamicStateCreateInfo) -> Unit) = PipelineDynamicStateCreateInfo(calloc(32)).apply(block).also { it.sType = 27 }

inline fun Allocator.PipelineInputAssemblyStateCreateInfo(block: (PipelineInputAssemblyStateCreateInfo) -> Unit) = PipelineInputAssemblyStateCreateInfo(calloc(32)).apply(block).also { it.sType = 20 }

inline fun Allocator.PipelineMultisampleStateCreateInfo(block: (PipelineMultisampleStateCreateInfo) -> Unit) = PipelineMultisampleStateCreateInfo(calloc(48)).apply(block).also { it.sType = 24 }

inline fun Allocator.PipelineRasterizationStateCreateInfo(block: (PipelineRasterizationStateCreateInfo) -> Unit) = PipelineRasterizationStateCreateInfo(calloc(64)).apply(block).also { it.sType = 23 }

inline fun Allocator.PipelineShaderStageCreateInfo(block: (PipelineShaderStageCreateInfo) -> Unit) = PipelineShaderStageCreateInfo(calloc(48)).apply(block).also { it.sType = 18 }

inline fun Allocator.PipelineShaderStageCreateInfo(capacity: Int, block: (PipelineShaderStageCreateInfo.Buffer) -> Unit) = PipelineShaderStageCreateInfo.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 18 } }

inline fun Allocator.PipelineTessellationStateCreateInfo(block: (PipelineTessellationStateCreateInfo) -> Unit) = PipelineTessellationStateCreateInfo(calloc(24)).apply(block).also { it.sType = 21 }

inline fun Allocator.PipelineVertexInputStateCreateInfo(block: (PipelineVertexInputStateCreateInfo) -> Unit) = PipelineVertexInputStateCreateInfo(calloc(48)).apply(block).also { it.sType = 19 }

inline fun Allocator.PipelineViewportStateCreateInfo(block: (PipelineViewportStateCreateInfo) -> Unit) = PipelineViewportStateCreateInfo(calloc(48)).apply(block).also { it.sType = 22 }

inline fun Allocator.SpecializationInfo(block: (SpecializationInfo) -> Unit) = SpecializationInfo(calloc(32)).apply(block)

inline fun Allocator.SpecializationMapEntry(block: (SpecializationMapEntry) -> Unit) = SpecializationMapEntry(calloc(16)).apply(block)

inline fun Allocator.SpecializationMapEntry(capacity: Int, block: (SpecializationMapEntry.Buffer) -> Unit) = SpecializationMapEntry.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.StencilOpState(block: (StencilOpState) -> Unit) = StencilOpState(calloc(28)).apply(block)

inline fun Allocator.VertexInputAttributeDescription(block: (VertexInputAttributeDescription) -> Unit) = VertexInputAttributeDescription(calloc(16)).apply(block)

inline fun Allocator.VertexInputAttributeDescription(capacity: Int, block: (VertexInputAttributeDescription.Buffer) -> Unit) = VertexInputAttributeDescription.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.VertexInputBindingDescription(block: (VertexInputBindingDescription) -> Unit) = VertexInputBindingDescription(calloc(12)).apply(block)

inline fun Allocator.VertexInputBindingDescription(capacity: Int, block: (VertexInputBindingDescription.Buffer) -> Unit) = VertexInputBindingDescription.Buffer(calloc(capacity * 12), capacity).apply(block)

inline fun Allocator.Viewport(block: (Viewport) -> Unit) = Viewport(calloc(24)).apply(block)

inline fun Allocator.Viewport(capacity: Int, block: (Viewport.Buffer) -> Unit) = Viewport.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.PipelineLayoutCreateInfo(block: (PipelineLayoutCreateInfo) -> Unit) = PipelineLayoutCreateInfo(calloc(48)).apply(block).also { it.sType = 30 }

inline fun Allocator.PushConstantRange(block: (PushConstantRange) -> Unit) = PushConstantRange(calloc(12)).apply(block)

inline fun Allocator.PushConstantRange(capacity: Int, block: (PushConstantRange.Buffer) -> Unit) = PushConstantRange.Buffer(calloc(capacity * 12), capacity).apply(block)

inline fun Allocator.SamplerCreateInfo(block: (SamplerCreateInfo) -> Unit) = SamplerCreateInfo(calloc(80)).apply(block).also { it.sType = 31 }

inline fun Allocator.CopyDescriptorSet(block: (CopyDescriptorSet) -> Unit) = CopyDescriptorSet(calloc(56)).apply(block).also { it.sType = 36 }

inline fun Allocator.CopyDescriptorSet(capacity: Int, block: (CopyDescriptorSet.Buffer) -> Unit) = CopyDescriptorSet.Buffer(calloc(capacity * 56), capacity).apply(block).apply { forEach { it.sType = 36 } }

inline fun Allocator.DescriptorBufferInfo(block: (DescriptorBufferInfo) -> Unit) = DescriptorBufferInfo(calloc(24)).apply(block)

inline fun Allocator.DescriptorBufferInfo(capacity: Int, block: (DescriptorBufferInfo.Buffer) -> Unit) = DescriptorBufferInfo.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.DescriptorImageInfo(block: (DescriptorImageInfo) -> Unit) = DescriptorImageInfo(calloc(24)).apply(block)

inline fun Allocator.DescriptorImageInfo(capacity: Int, block: (DescriptorImageInfo.Buffer) -> Unit) = DescriptorImageInfo.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.DescriptorPoolCreateInfo(block: (DescriptorPoolCreateInfo) -> Unit) = DescriptorPoolCreateInfo(calloc(40)).apply(block).also { it.sType = 33 }

inline fun Allocator.DescriptorPoolSize(block: (DescriptorPoolSize) -> Unit) = DescriptorPoolSize(calloc(8)).apply(block)

inline fun Allocator.DescriptorPoolSize(capacity: Int, block: (DescriptorPoolSize.Buffer) -> Unit) = DescriptorPoolSize.Buffer(calloc(capacity * 8), capacity).apply(block)

inline fun Allocator.DescriptorSetAllocateInfo(block: (DescriptorSetAllocateInfo) -> Unit) = DescriptorSetAllocateInfo(calloc(40)).apply(block).also { it.sType = 34 }

inline fun Allocator.DescriptorSetLayoutBinding(block: (DescriptorSetLayoutBinding) -> Unit) = DescriptorSetLayoutBinding(calloc(24)).apply(block)

inline fun Allocator.DescriptorSetLayoutBinding(capacity: Int, block: (DescriptorSetLayoutBinding.Buffer) -> Unit) = DescriptorSetLayoutBinding.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.DescriptorSetLayoutCreateInfo(block: (DescriptorSetLayoutCreateInfo) -> Unit) = DescriptorSetLayoutCreateInfo(calloc(32)).apply(block).also { it.sType = 32 }

inline fun Allocator.WriteDescriptorSet(block: (WriteDescriptorSet) -> Unit) = WriteDescriptorSet(calloc(64)).apply(block).also { it.sType = 35 }

inline fun Allocator.WriteDescriptorSet(capacity: Int, block: (WriteDescriptorSet.Buffer) -> Unit) = WriteDescriptorSet.Buffer(calloc(capacity * 64), capacity).apply(block).apply { forEach { it.sType = 35 } }

inline fun Allocator.AttachmentDescription(block: (AttachmentDescription) -> Unit) = AttachmentDescription(calloc(36)).apply(block)

inline fun Allocator.AttachmentDescription(capacity: Int, block: (AttachmentDescription.Buffer) -> Unit) = AttachmentDescription.Buffer(calloc(capacity * 36), capacity).apply(block)

inline fun Allocator.AttachmentReference(block: (AttachmentReference) -> Unit) = AttachmentReference(calloc(8)).apply(block)

inline fun Allocator.AttachmentReference(capacity: Int, block: (AttachmentReference.Buffer) -> Unit) = AttachmentReference.Buffer(calloc(capacity * 8), capacity).apply(block)

inline fun Allocator.FramebufferCreateInfo(block: (FramebufferCreateInfo) -> Unit) = FramebufferCreateInfo(calloc(64)).apply(block).also { it.sType = 37 }

inline fun Allocator.RenderPassCreateInfo(block: (RenderPassCreateInfo) -> Unit) = RenderPassCreateInfo(calloc(64)).apply(block).also { it.sType = 38 }

inline fun Allocator.SubpassDependency(block: (SubpassDependency) -> Unit) = SubpassDependency(calloc(28)).apply(block)

inline fun Allocator.SubpassDependency(capacity: Int, block: (SubpassDependency.Buffer) -> Unit) = SubpassDependency.Buffer(calloc(capacity * 28), capacity).apply(block)

inline fun Allocator.SubpassDescription(block: (SubpassDescription) -> Unit) = SubpassDescription(calloc(72)).apply(block)

inline fun Allocator.SubpassDescription(capacity: Int, block: (SubpassDescription.Buffer) -> Unit) = SubpassDescription.Buffer(calloc(capacity * 72), capacity).apply(block)

inline fun Allocator.CommandPoolCreateInfo(block: (CommandPoolCreateInfo) -> Unit) = CommandPoolCreateInfo(calloc(24)).apply(block).also { it.sType = 39 }

inline fun Allocator.CommandBufferAllocateInfo(block: (CommandBufferAllocateInfo) -> Unit) = CommandBufferAllocateInfo(calloc(32)).apply(block).also { it.sType = 40 }

inline fun Allocator.CommandBufferBeginInfo(block: (CommandBufferBeginInfo) -> Unit) = CommandBufferBeginInfo(calloc(32)).apply(block).also { it.sType = 42 }

inline fun Allocator.CommandBufferInheritanceInfo(block: (CommandBufferInheritanceInfo) -> Unit) = CommandBufferInheritanceInfo(calloc(56)).apply(block).also { it.sType = 41 }

inline fun Allocator.BufferCopy(block: (BufferCopy) -> Unit) = BufferCopy(calloc(24)).apply(block)

inline fun Allocator.BufferCopy(capacity: Int, block: (BufferCopy.Buffer) -> Unit) = BufferCopy.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.BufferImageCopy(block: (BufferImageCopy) -> Unit) = BufferImageCopy(calloc(56)).apply(block)

inline fun Allocator.BufferImageCopy(capacity: Int, block: (BufferImageCopy.Buffer) -> Unit) = BufferImageCopy.Buffer(calloc(capacity * 56), capacity).apply(block)

inline fun Allocator.ClearAttachment(block: (ClearAttachment) -> Unit) = ClearAttachment(calloc(24)).apply(block)

inline fun Allocator.ClearAttachment(capacity: Int, block: (ClearAttachment.Buffer) -> Unit) = ClearAttachment.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.ClearColorValue(block: (ClearColorValue) -> Unit) = ClearColorValue(calloc(16)).apply(block)

inline fun Allocator.ClearDepthStencilValue(block: (ClearDepthStencilValue) -> Unit) = ClearDepthStencilValue(calloc(8)).apply(block)

inline fun Allocator.ClearRect(block: (ClearRect) -> Unit) = ClearRect(calloc(24)).apply(block)

inline fun Allocator.ClearRect(capacity: Int, block: (ClearRect.Buffer) -> Unit) = ClearRect.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.ClearValue(block: (ClearValue) -> Unit) = ClearValue(calloc(16)).apply(block)

inline fun Allocator.ClearValue(capacity: Int, block: (ClearValue.Buffer) -> Unit) = ClearValue.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.ImageBlit(block: (ImageBlit) -> Unit) = ImageBlit(calloc(80)).apply(block)

inline fun Allocator.ImageBlit(capacity: Int, block: (ImageBlit.Buffer) -> Unit) = ImageBlit.Buffer(calloc(capacity * 80), capacity).apply(block)

inline fun Allocator.ImageCopy(block: (ImageCopy) -> Unit) = ImageCopy(calloc(68)).apply(block)

inline fun Allocator.ImageCopy(capacity: Int, block: (ImageCopy.Buffer) -> Unit) = ImageCopy.Buffer(calloc(capacity * 68), capacity).apply(block)

inline fun Allocator.ImageResolve(block: (ImageResolve) -> Unit) = ImageResolve(calloc(68)).apply(block)

inline fun Allocator.ImageResolve(capacity: Int, block: (ImageResolve.Buffer) -> Unit) = ImageResolve.Buffer(calloc(capacity * 68), capacity).apply(block)

inline fun Allocator.ImageSubresourceLayers(block: (ImageSubresourceLayers) -> Unit) = ImageSubresourceLayers(calloc(16)).apply(block)

inline fun Allocator.RenderPassBeginInfo(block: (RenderPassBeginInfo) -> Unit) = RenderPassBeginInfo(calloc(64)).apply(block).also { it.sType = 43 }

inline fun Allocator.PhysicalDeviceSubgroupProperties(block: (PhysicalDeviceSubgroupProperties) -> Unit) = PhysicalDeviceSubgroupProperties(calloc(32)).apply(block).also { it.sType = 1000094000 }

inline fun Allocator.BindBufferMemoryInfo(block: (BindBufferMemoryInfo) -> Unit) = BindBufferMemoryInfo(calloc(40)).apply(block).also { it.sType = 1000157000 }

inline fun Allocator.BindBufferMemoryInfo(capacity: Int, block: (BindBufferMemoryInfo.Buffer) -> Unit) = BindBufferMemoryInfo.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000157000 } }

inline fun Allocator.BindImageMemoryInfo(block: (BindImageMemoryInfo) -> Unit) = BindImageMemoryInfo(calloc(40)).apply(block).also { it.sType = 1000157001 }

inline fun Allocator.BindImageMemoryInfo(capacity: Int, block: (BindImageMemoryInfo.Buffer) -> Unit) = BindImageMemoryInfo.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000157001 } }

inline fun Allocator.PhysicalDevice16BitStorageFeatures(block: (PhysicalDevice16BitStorageFeatures) -> Unit) = PhysicalDevice16BitStorageFeatures(calloc(32)).apply(block).also { it.sType = 1000083000 }

inline fun Allocator.MemoryDedicatedRequirements(block: (MemoryDedicatedRequirements) -> Unit) = MemoryDedicatedRequirements(calloc(24)).apply(block).also { it.sType = 1000127000 }

inline fun Allocator.MemoryDedicatedAllocateInfo(block: (MemoryDedicatedAllocateInfo) -> Unit) = MemoryDedicatedAllocateInfo(calloc(32)).apply(block).also { it.sType = 1000127001 }

inline fun Allocator.MemoryAllocateFlagsInfo(block: (MemoryAllocateFlagsInfo) -> Unit) = MemoryAllocateFlagsInfo(calloc(24)).apply(block).also { it.sType = 1000060000 }

inline fun Allocator.DeviceGroupRenderPassBeginInfo(block: (DeviceGroupRenderPassBeginInfo) -> Unit) = DeviceGroupRenderPassBeginInfo(calloc(32)).apply(block).also { it.sType = 1000060003 }

inline fun Allocator.DeviceGroupCommandBufferBeginInfo(block: (DeviceGroupCommandBufferBeginInfo) -> Unit) = DeviceGroupCommandBufferBeginInfo(calloc(24)).apply(block).also { it.sType = 1000060004 }

inline fun Allocator.DeviceGroupSubmitInfo(block: (DeviceGroupSubmitInfo) -> Unit) = DeviceGroupSubmitInfo(calloc(64)).apply(block).also { it.sType = 1000060005 }

inline fun Allocator.DeviceGroupBindSparseInfo(block: (DeviceGroupBindSparseInfo) -> Unit) = DeviceGroupBindSparseInfo(calloc(24)).apply(block).also { it.sType = 1000060006 }

inline fun Allocator.BindBufferMemoryDeviceGroupInfo(block: (BindBufferMemoryDeviceGroupInfo) -> Unit) = BindBufferMemoryDeviceGroupInfo(calloc(32)).apply(block).also { it.sType = 1000060013 }

inline fun Allocator.BindImageMemoryDeviceGroupInfo(block: (BindImageMemoryDeviceGroupInfo) -> Unit) = BindImageMemoryDeviceGroupInfo(calloc(48)).apply(block).also { it.sType = 1000060014 }

inline fun Allocator.PhysicalDeviceGroupProperties(block: (PhysicalDeviceGroupProperties) -> Unit) = PhysicalDeviceGroupProperties(calloc(288)).apply(block).also { it.sType = 1000070000 }

inline fun Allocator.PhysicalDeviceGroupProperties(capacity: Int, block: (PhysicalDeviceGroupProperties.Buffer) -> Unit) = PhysicalDeviceGroupProperties.Buffer(calloc(capacity * 288), capacity).apply(block).apply { forEach { it.sType = 1000070000 } }

inline fun Allocator.DeviceGroupDeviceCreateInfo(block: (DeviceGroupDeviceCreateInfo) -> Unit) = DeviceGroupDeviceCreateInfo(calloc(32)).apply(block).also { it.sType = 1000070001 }

inline fun Allocator.BufferMemoryRequirementsInfo2(block: (BufferMemoryRequirementsInfo2) -> Unit) = BufferMemoryRequirementsInfo2(calloc(24)).apply(block).also { it.sType = 1000146000 }

inline fun Allocator.ImageMemoryRequirementsInfo2(block: (ImageMemoryRequirementsInfo2) -> Unit) = ImageMemoryRequirementsInfo2(calloc(24)).apply(block).also { it.sType = 1000146001 }

inline fun Allocator.ImageSparseMemoryRequirementsInfo2(block: (ImageSparseMemoryRequirementsInfo2) -> Unit) = ImageSparseMemoryRequirementsInfo2(calloc(24)).apply(block).also { it.sType = 1000146002 }

inline fun Allocator.MemoryRequirements2(block: (MemoryRequirements2) -> Unit) = MemoryRequirements2(calloc(40)).apply(block).also { it.sType = 1000146003 }

inline fun Allocator.SparseImageMemoryRequirements2(block: (SparseImageMemoryRequirements2) -> Unit) = SparseImageMemoryRequirements2(calloc(64)).apply(block).also { it.sType = 1000146004 }

inline fun Allocator.SparseImageMemoryRequirements2(capacity: Int, block: (SparseImageMemoryRequirements2.Buffer) -> Unit) = SparseImageMemoryRequirements2.Buffer(calloc(capacity * 64), capacity).apply(block).apply { forEach { it.sType = 1000146004 } }

inline fun Allocator.PhysicalDeviceFeatures2(block: (PhysicalDeviceFeatures2) -> Unit) = PhysicalDeviceFeatures2(calloc(240)).apply(block).also { it.sType = 1000059000 }

inline fun Allocator.PhysicalDeviceProperties2(block: (PhysicalDeviceProperties2) -> Unit) = PhysicalDeviceProperties2(calloc(840)).apply(block).also { it.sType = 1000059001 }

inline fun Allocator.FormatProperties2(block: (FormatProperties2) -> Unit) = FormatProperties2(calloc(32)).apply(block).also { it.sType = 1000059002 }

inline fun Allocator.ImageFormatProperties2(block: (ImageFormatProperties2) -> Unit) = ImageFormatProperties2(calloc(48)).apply(block).also { it.sType = 1000059003 }

inline fun Allocator.PhysicalDeviceImageFormatInfo2(block: (PhysicalDeviceImageFormatInfo2) -> Unit) = PhysicalDeviceImageFormatInfo2(calloc(40)).apply(block).also { it.sType = 1000059004 }

inline fun Allocator.QueueFamilyProperties2(block: (QueueFamilyProperties2) -> Unit) = QueueFamilyProperties2(calloc(40)).apply(block).also { it.sType = 1000059005 }

inline fun Allocator.QueueFamilyProperties2(capacity: Int, block: (QueueFamilyProperties2.Buffer) -> Unit) = QueueFamilyProperties2.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000059005 } }

inline fun Allocator.PhysicalDeviceMemoryProperties2(block: (PhysicalDeviceMemoryProperties2) -> Unit) = PhysicalDeviceMemoryProperties2(calloc(536)).apply(block).also { it.sType = 1000059006 }

inline fun Allocator.SparseImageFormatProperties2(block: (SparseImageFormatProperties2) -> Unit) = SparseImageFormatProperties2(calloc(40)).apply(block).also { it.sType = 1000059007 }

inline fun Allocator.SparseImageFormatProperties2(capacity: Int, block: (SparseImageFormatProperties2.Buffer) -> Unit) = SparseImageFormatProperties2.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000059007 } }

inline fun Allocator.PhysicalDeviceSparseImageFormatInfo2(block: (PhysicalDeviceSparseImageFormatInfo2) -> Unit) = PhysicalDeviceSparseImageFormatInfo2(calloc(40)).apply(block).also { it.sType = 1000059008 }

inline fun Allocator.PhysicalDevicePointClippingProperties(block: (PhysicalDevicePointClippingProperties) -> Unit) = PhysicalDevicePointClippingProperties(calloc(24)).apply(block).also { it.sType = 1000117000 }

inline fun Allocator.RenderPassInputAttachmentAspectCreateInfo(block: (RenderPassInputAttachmentAspectCreateInfo) -> Unit) = RenderPassInputAttachmentAspectCreateInfo(calloc(32)).apply(block).also { it.sType = 1000117001 }

inline fun Allocator.InputAttachmentAspectReference(block: (InputAttachmentAspectReference) -> Unit) = InputAttachmentAspectReference(calloc(12)).apply(block)

inline fun Allocator.InputAttachmentAspectReference(capacity: Int, block: (InputAttachmentAspectReference.Buffer) -> Unit) = InputAttachmentAspectReference.Buffer(calloc(capacity * 12), capacity).apply(block)

inline fun Allocator.ImageViewUsageCreateInfo(block: (ImageViewUsageCreateInfo) -> Unit) = ImageViewUsageCreateInfo(calloc(24)).apply(block).also { it.sType = 1000117002 }

inline fun Allocator.PipelineTessellationDomainOriginStateCreateInfo(block: (PipelineTessellationDomainOriginStateCreateInfo) -> Unit) = PipelineTessellationDomainOriginStateCreateInfo(calloc(24)).apply(block).also { it.sType = 1000117003 }

inline fun Allocator.RenderPassMultiviewCreateInfo(block: (RenderPassMultiviewCreateInfo) -> Unit) = RenderPassMultiviewCreateInfo(calloc(64)).apply(block).also { it.sType = 1000053000 }

inline fun Allocator.PhysicalDeviceMultiviewFeatures(block: (PhysicalDeviceMultiviewFeatures) -> Unit) = PhysicalDeviceMultiviewFeatures(calloc(32)).apply(block).also { it.sType = 1000053001 }

inline fun Allocator.PhysicalDeviceMultiviewProperties(block: (PhysicalDeviceMultiviewProperties) -> Unit) = PhysicalDeviceMultiviewProperties(calloc(24)).apply(block).also { it.sType = 1000053002 }

inline fun Allocator.PhysicalDeviceVariablePointersFeatures(block: (PhysicalDeviceVariablePointersFeatures) -> Unit) = PhysicalDeviceVariablePointersFeatures(calloc(24)).apply(block).also { it.sType = 1000120000 }

inline fun Allocator.PhysicalDeviceProtectedMemoryFeatures(block: (PhysicalDeviceProtectedMemoryFeatures) -> Unit) = PhysicalDeviceProtectedMemoryFeatures(calloc(24)).apply(block).also { it.sType = 1000145001 }

inline fun Allocator.PhysicalDeviceProtectedMemoryProperties(block: (PhysicalDeviceProtectedMemoryProperties) -> Unit) = PhysicalDeviceProtectedMemoryProperties(calloc(24)).apply(block).also { it.sType = 1000145002 }

inline fun Allocator.DeviceQueueInfo2(block: (DeviceQueueInfo2) -> Unit) = DeviceQueueInfo2(calloc(32)).apply(block).also { it.sType = 1000145003 }

inline fun Allocator.ProtectedSubmitInfo(block: (ProtectedSubmitInfo) -> Unit) = ProtectedSubmitInfo(calloc(24)).apply(block).also { it.sType = 1000145000 }

inline fun Allocator.SamplerYcbcrConversionCreateInfo(block: (SamplerYcbcrConversionCreateInfo) -> Unit) = SamplerYcbcrConversionCreateInfo(calloc(64)).apply(block).also { it.sType = 1000156000 }

inline fun Allocator.SamplerYcbcrConversionInfo(block: (SamplerYcbcrConversionInfo) -> Unit) = SamplerYcbcrConversionInfo(calloc(24)).apply(block).also { it.sType = 1000156001 }

inline fun Allocator.BindImagePlaneMemoryInfo(block: (BindImagePlaneMemoryInfo) -> Unit) = BindImagePlaneMemoryInfo(calloc(24)).apply(block).also { it.sType = 1000156002 }

inline fun Allocator.ImagePlaneMemoryRequirementsInfo(block: (ImagePlaneMemoryRequirementsInfo) -> Unit) = ImagePlaneMemoryRequirementsInfo(calloc(24)).apply(block).also { it.sType = 1000156003 }

inline fun Allocator.PhysicalDeviceSamplerYcbcrConversionFeatures(block: (PhysicalDeviceSamplerYcbcrConversionFeatures) -> Unit) = PhysicalDeviceSamplerYcbcrConversionFeatures(calloc(24)).apply(block).also { it.sType = 1000156004 }

inline fun Allocator.SamplerYcbcrConversionImageFormatProperties(block: (SamplerYcbcrConversionImageFormatProperties) -> Unit) = SamplerYcbcrConversionImageFormatProperties(calloc(24)).apply(block).also { it.sType = 1000156005 }

inline fun Allocator.DescriptorUpdateTemplateEntry(block: (DescriptorUpdateTemplateEntry) -> Unit) = DescriptorUpdateTemplateEntry(calloc(32)).apply(block)

inline fun Allocator.DescriptorUpdateTemplateEntry(capacity: Int, block: (DescriptorUpdateTemplateEntry.Buffer) -> Unit) = DescriptorUpdateTemplateEntry.Buffer(calloc(capacity * 32), capacity).apply(block)

inline fun Allocator.DescriptorUpdateTemplateCreateInfo(block: (DescriptorUpdateTemplateCreateInfo) -> Unit) = DescriptorUpdateTemplateCreateInfo(calloc(72)).apply(block).also { it.sType = 1000085000 }

inline fun Allocator.ExternalMemoryProperties(block: (ExternalMemoryProperties) -> Unit) = ExternalMemoryProperties(calloc(12)).apply(block)

inline fun Allocator.PhysicalDeviceExternalImageFormatInfo(block: (PhysicalDeviceExternalImageFormatInfo) -> Unit) = PhysicalDeviceExternalImageFormatInfo(calloc(24)).apply(block).also { it.sType = 1000071000 }

inline fun Allocator.ExternalImageFormatProperties(block: (ExternalImageFormatProperties) -> Unit) = ExternalImageFormatProperties(calloc(32)).apply(block).also { it.sType = 1000071001 }

inline fun Allocator.PhysicalDeviceExternalBufferInfo(block: (PhysicalDeviceExternalBufferInfo) -> Unit) = PhysicalDeviceExternalBufferInfo(calloc(32)).apply(block).also { it.sType = 1000071002 }

inline fun Allocator.ExternalBufferProperties(block: (ExternalBufferProperties) -> Unit) = ExternalBufferProperties(calloc(32)).apply(block).also { it.sType = 1000071003 }

inline fun Allocator.PhysicalDeviceIDProperties(block: (PhysicalDeviceIDProperties) -> Unit) = PhysicalDeviceIDProperties(calloc(64)).apply(block).also { it.sType = 1000071004 }

inline fun Allocator.ExternalMemoryImageCreateInfo(block: (ExternalMemoryImageCreateInfo) -> Unit) = ExternalMemoryImageCreateInfo(calloc(24)).apply(block).also { it.sType = 1000072001 }

inline fun Allocator.ExternalMemoryBufferCreateInfo(block: (ExternalMemoryBufferCreateInfo) -> Unit) = ExternalMemoryBufferCreateInfo(calloc(24)).apply(block).also { it.sType = 1000072000 }

inline fun Allocator.ExportMemoryAllocateInfo(block: (ExportMemoryAllocateInfo) -> Unit) = ExportMemoryAllocateInfo(calloc(24)).apply(block).also { it.sType = 1000072002 }

inline fun Allocator.PhysicalDeviceExternalFenceInfo(block: (PhysicalDeviceExternalFenceInfo) -> Unit) = PhysicalDeviceExternalFenceInfo(calloc(24)).apply(block).also { it.sType = 1000112000 }

inline fun Allocator.ExternalFenceProperties(block: (ExternalFenceProperties) -> Unit) = ExternalFenceProperties(calloc(32)).apply(block).also { it.sType = 1000112001 }

inline fun Allocator.ExportFenceCreateInfo(block: (ExportFenceCreateInfo) -> Unit) = ExportFenceCreateInfo(calloc(24)).apply(block).also { it.sType = 1000113000 }

inline fun Allocator.ExportSemaphoreCreateInfo(block: (ExportSemaphoreCreateInfo) -> Unit) = ExportSemaphoreCreateInfo(calloc(24)).apply(block).also { it.sType = 1000077000 }

inline fun Allocator.PhysicalDeviceExternalSemaphoreInfo(block: (PhysicalDeviceExternalSemaphoreInfo) -> Unit) = PhysicalDeviceExternalSemaphoreInfo(calloc(24)).apply(block).also { it.sType = 1000076000 }

inline fun Allocator.ExternalSemaphoreProperties(block: (ExternalSemaphoreProperties) -> Unit) = ExternalSemaphoreProperties(calloc(32)).apply(block).also { it.sType = 1000076001 }

inline fun Allocator.PhysicalDeviceMaintenance3Properties(block: (PhysicalDeviceMaintenance3Properties) -> Unit) = PhysicalDeviceMaintenance3Properties(calloc(32)).apply(block).also { it.sType = 1000168000 }

inline fun Allocator.DescriptorSetLayoutSupport(block: (DescriptorSetLayoutSupport) -> Unit) = DescriptorSetLayoutSupport(calloc(24)).apply(block).also { it.sType = 1000168001 }

inline fun Allocator.PhysicalDeviceShaderDrawParametersFeatures(block: (PhysicalDeviceShaderDrawParametersFeatures) -> Unit) = PhysicalDeviceShaderDrawParametersFeatures(calloc(24)).apply(block).also { it.sType = 1000063000 }

inline fun Allocator.PhysicalDeviceVulkan11Features(block: (PhysicalDeviceVulkan11Features) -> Unit) = PhysicalDeviceVulkan11Features(calloc(64)).apply(block).also { it.sType = 49 }

inline fun Allocator.PhysicalDeviceVulkan11Properties(block: (PhysicalDeviceVulkan11Properties) -> Unit) = PhysicalDeviceVulkan11Properties(calloc(112)).apply(block).also { it.sType = 50 }

inline fun Allocator.PhysicalDeviceVulkan12Features(block: (PhysicalDeviceVulkan12Features) -> Unit) = PhysicalDeviceVulkan12Features(calloc(208)).apply(block).also { it.sType = 51 }

inline fun Allocator.PhysicalDeviceVulkan12Properties(block: (PhysicalDeviceVulkan12Properties) -> Unit) = PhysicalDeviceVulkan12Properties(calloc(736)).apply(block).also { it.sType = 52 }

inline fun Allocator.ImageFormatListCreateInfo(block: (ImageFormatListCreateInfo) -> Unit) = ImageFormatListCreateInfo(calloc(32)).apply(block).also { it.sType = 1000147000 }

inline fun Allocator.RenderPassCreateInfo2(block: (RenderPassCreateInfo2) -> Unit) = RenderPassCreateInfo2(calloc(80)).apply(block).also { it.sType = 1000109004 }

inline fun Allocator.AttachmentDescription2(block: (AttachmentDescription2) -> Unit) = AttachmentDescription2(calloc(56)).apply(block).also { it.sType = 1000109000 }

inline fun Allocator.AttachmentDescription2(capacity: Int, block: (AttachmentDescription2.Buffer) -> Unit) = AttachmentDescription2.Buffer(calloc(capacity * 56), capacity).apply(block).apply { forEach { it.sType = 1000109000 } }

inline fun Allocator.AttachmentReference2(block: (AttachmentReference2) -> Unit) = AttachmentReference2(calloc(32)).apply(block).also { it.sType = 1000109001 }

inline fun Allocator.AttachmentReference2(capacity: Int, block: (AttachmentReference2.Buffer) -> Unit) = AttachmentReference2.Buffer(calloc(capacity * 32), capacity).apply(block).apply { forEach { it.sType = 1000109001 } }

inline fun Allocator.SubpassDescription2(block: (SubpassDescription2) -> Unit) = SubpassDescription2(calloc(88)).apply(block).also { it.sType = 1000109002 }

inline fun Allocator.SubpassDescription2(capacity: Int, block: (SubpassDescription2.Buffer) -> Unit) = SubpassDescription2.Buffer(calloc(capacity * 88), capacity).apply(block).apply { forEach { it.sType = 1000109002 } }

inline fun Allocator.SubpassDependency2(block: (SubpassDependency2) -> Unit) = SubpassDependency2(calloc(48)).apply(block).also { it.sType = 1000109003 }

inline fun Allocator.SubpassDependency2(capacity: Int, block: (SubpassDependency2.Buffer) -> Unit) = SubpassDependency2.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000109003 } }

inline fun Allocator.SubpassBeginInfo(block: (SubpassBeginInfo) -> Unit) = SubpassBeginInfo(calloc(24)).apply(block).also { it.sType = 1000109005 }

inline fun Allocator.SubpassEndInfo(block: (SubpassEndInfo) -> Unit) = SubpassEndInfo(calloc(16)).apply(block).also { it.sType = 1000109006 }

inline fun Allocator.PhysicalDevice8BitStorageFeatures(block: (PhysicalDevice8BitStorageFeatures) -> Unit) = PhysicalDevice8BitStorageFeatures(calloc(32)).apply(block).also { it.sType = 1000177000 }

inline fun Allocator.ConformanceVersion(block: (ConformanceVersion) -> Unit) = ConformanceVersion(calloc(4)).apply(block)

inline fun Allocator.PhysicalDeviceDriverProperties(block: (PhysicalDeviceDriverProperties) -> Unit) = PhysicalDeviceDriverProperties(calloc(536)).apply(block).also { it.sType = 1000196000 }

inline fun Allocator.PhysicalDeviceShaderAtomicInt64Features(block: (PhysicalDeviceShaderAtomicInt64Features) -> Unit) = PhysicalDeviceShaderAtomicInt64Features(calloc(24)).apply(block).also { it.sType = 1000180000 }

inline fun Allocator.PhysicalDeviceShaderFloat16Int8Features(block: (PhysicalDeviceShaderFloat16Int8Features) -> Unit) = PhysicalDeviceShaderFloat16Int8Features(calloc(24)).apply(block).also { it.sType = 1000082000 }

inline fun Allocator.PhysicalDeviceFloatControlsProperties(block: (PhysicalDeviceFloatControlsProperties) -> Unit) = PhysicalDeviceFloatControlsProperties(calloc(88)).apply(block).also { it.sType = 1000197000 }

inline fun Allocator.DescriptorSetLayoutBindingFlagsCreateInfo(block: (DescriptorSetLayoutBindingFlagsCreateInfo) -> Unit) = DescriptorSetLayoutBindingFlagsCreateInfo(calloc(32)).apply(block).also { it.sType = 1000161000 }

inline fun Allocator.PhysicalDeviceDescriptorIndexingFeatures(block: (PhysicalDeviceDescriptorIndexingFeatures) -> Unit) = PhysicalDeviceDescriptorIndexingFeatures(calloc(96)).apply(block).also { it.sType = 1000161001 }

inline fun Allocator.PhysicalDeviceDescriptorIndexingProperties(block: (PhysicalDeviceDescriptorIndexingProperties) -> Unit) = PhysicalDeviceDescriptorIndexingProperties(calloc(112)).apply(block).also { it.sType = 1000161002 }

inline fun Allocator.DescriptorSetVariableDescriptorCountAllocateInfo(block: (DescriptorSetVariableDescriptorCountAllocateInfo) -> Unit) = DescriptorSetVariableDescriptorCountAllocateInfo(calloc(32)).apply(block).also { it.sType = 1000161003 }

inline fun Allocator.DescriptorSetVariableDescriptorCountLayoutSupport(block: (DescriptorSetVariableDescriptorCountLayoutSupport) -> Unit) = DescriptorSetVariableDescriptorCountLayoutSupport(calloc(24)).apply(block).also { it.sType = 1000161004 }

inline fun Allocator.SubpassDescriptionDepthStencilResolve(block: (SubpassDescriptionDepthStencilResolve) -> Unit) = SubpassDescriptionDepthStencilResolve(calloc(32)).apply(block).also { it.sType = 1000199001 }

inline fun Allocator.PhysicalDeviceDepthStencilResolveProperties(block: (PhysicalDeviceDepthStencilResolveProperties) -> Unit) = PhysicalDeviceDepthStencilResolveProperties(calloc(32)).apply(block).also { it.sType = 1000199000 }

inline fun Allocator.PhysicalDeviceScalarBlockLayoutFeatures(block: (PhysicalDeviceScalarBlockLayoutFeatures) -> Unit) = PhysicalDeviceScalarBlockLayoutFeatures(calloc(24)).apply(block).also { it.sType = 1000221000 }

inline fun Allocator.ImageStencilUsageCreateInfo(block: (ImageStencilUsageCreateInfo) -> Unit) = ImageStencilUsageCreateInfo(calloc(24)).apply(block).also { it.sType = 1000246000 }

inline fun Allocator.SamplerReductionModeCreateInfo(block: (SamplerReductionModeCreateInfo) -> Unit) = SamplerReductionModeCreateInfo(calloc(24)).apply(block).also { it.sType = 1000130001 }

inline fun Allocator.PhysicalDeviceSamplerFilterMinmaxProperties(block: (PhysicalDeviceSamplerFilterMinmaxProperties) -> Unit) = PhysicalDeviceSamplerFilterMinmaxProperties(calloc(24)).apply(block).also { it.sType = 1000130000 }

inline fun Allocator.PhysicalDeviceVulkanMemoryModelFeatures(block: (PhysicalDeviceVulkanMemoryModelFeatures) -> Unit) = PhysicalDeviceVulkanMemoryModelFeatures(calloc(32)).apply(block).also { it.sType = 1000211000 }

inline fun Allocator.PhysicalDeviceImagelessFramebufferFeatures(block: (PhysicalDeviceImagelessFramebufferFeatures) -> Unit) = PhysicalDeviceImagelessFramebufferFeatures(calloc(24)).apply(block).also { it.sType = 1000108000 }

inline fun Allocator.FramebufferAttachmentsCreateInfo(block: (FramebufferAttachmentsCreateInfo) -> Unit) = FramebufferAttachmentsCreateInfo(calloc(32)).apply(block).also { it.sType = 1000108001 }

inline fun Allocator.FramebufferAttachmentImageInfo(block: (FramebufferAttachmentImageInfo) -> Unit) = FramebufferAttachmentImageInfo(calloc(48)).apply(block).also { it.sType = 1000108002 }

inline fun Allocator.FramebufferAttachmentImageInfo(capacity: Int, block: (FramebufferAttachmentImageInfo.Buffer) -> Unit) = FramebufferAttachmentImageInfo.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000108002 } }

inline fun Allocator.RenderPassAttachmentBeginInfo(block: (RenderPassAttachmentBeginInfo) -> Unit) = RenderPassAttachmentBeginInfo(calloc(32)).apply(block).also { it.sType = 1000108003 }

inline fun Allocator.PhysicalDeviceUniformBufferStandardLayoutFeatures(block: (PhysicalDeviceUniformBufferStandardLayoutFeatures) -> Unit) = PhysicalDeviceUniformBufferStandardLayoutFeatures(calloc(24)).apply(block).also { it.sType = 1000253000 }

inline fun Allocator.PhysicalDeviceShaderSubgroupExtendedTypesFeatures(block: (PhysicalDeviceShaderSubgroupExtendedTypesFeatures) -> Unit) = PhysicalDeviceShaderSubgroupExtendedTypesFeatures(calloc(24)).apply(block).also { it.sType = 1000175000 }

inline fun Allocator.PhysicalDeviceSeparateDepthStencilLayoutsFeatures(block: (PhysicalDeviceSeparateDepthStencilLayoutsFeatures) -> Unit) = PhysicalDeviceSeparateDepthStencilLayoutsFeatures(calloc(24)).apply(block).also { it.sType = 1000241000 }

inline fun Allocator.AttachmentReferenceStencilLayout(block: (AttachmentReferenceStencilLayout) -> Unit) = AttachmentReferenceStencilLayout(calloc(24)).apply(block).also { it.sType = 1000241001 }

inline fun Allocator.AttachmentDescriptionStencilLayout(block: (AttachmentDescriptionStencilLayout) -> Unit) = AttachmentDescriptionStencilLayout(calloc(24)).apply(block).also { it.sType = 1000241002 }

inline fun Allocator.PhysicalDeviceHostQueryResetFeatures(block: (PhysicalDeviceHostQueryResetFeatures) -> Unit) = PhysicalDeviceHostQueryResetFeatures(calloc(24)).apply(block).also { it.sType = 1000261000 }

inline fun Allocator.PhysicalDeviceTimelineSemaphoreFeatures(block: (PhysicalDeviceTimelineSemaphoreFeatures) -> Unit) = PhysicalDeviceTimelineSemaphoreFeatures(calloc(24)).apply(block).also { it.sType = 1000207000 }

inline fun Allocator.PhysicalDeviceTimelineSemaphoreProperties(block: (PhysicalDeviceTimelineSemaphoreProperties) -> Unit) = PhysicalDeviceTimelineSemaphoreProperties(calloc(24)).apply(block).also { it.sType = 1000207001 }

inline fun Allocator.SemaphoreTypeCreateInfo(block: (SemaphoreTypeCreateInfo) -> Unit) = SemaphoreTypeCreateInfo(calloc(32)).apply(block).also { it.sType = 1000207002 }

inline fun Allocator.TimelineSemaphoreSubmitInfo(block: (TimelineSemaphoreSubmitInfo) -> Unit) = TimelineSemaphoreSubmitInfo(calloc(48)).apply(block).also { it.sType = 1000207003 }

inline fun Allocator.SemaphoreWaitInfo(block: (SemaphoreWaitInfo) -> Unit) = SemaphoreWaitInfo(calloc(40)).apply(block).also { it.sType = 1000207004 }

inline fun Allocator.SemaphoreSignalInfo(block: (SemaphoreSignalInfo) -> Unit) = SemaphoreSignalInfo(calloc(32)).apply(block).also { it.sType = 1000207005 }

inline fun Allocator.PhysicalDeviceBufferDeviceAddressFeatures(block: (PhysicalDeviceBufferDeviceAddressFeatures) -> Unit) = PhysicalDeviceBufferDeviceAddressFeatures(calloc(32)).apply(block).also { it.sType = 1000257000 }

inline fun Allocator.BufferDeviceAddressInfo(block: (BufferDeviceAddressInfo) -> Unit) = BufferDeviceAddressInfo(calloc(24)).apply(block).also { it.sType = 1000244001 }

inline fun Allocator.BufferOpaqueCaptureAddressCreateInfo(block: (BufferOpaqueCaptureAddressCreateInfo) -> Unit) = BufferOpaqueCaptureAddressCreateInfo(calloc(24)).apply(block).also { it.sType = 1000257002 }

inline fun Allocator.MemoryOpaqueCaptureAddressAllocateInfo(block: (MemoryOpaqueCaptureAddressAllocateInfo) -> Unit) = MemoryOpaqueCaptureAddressAllocateInfo(calloc(24)).apply(block).also { it.sType = 1000257003 }

inline fun Allocator.DeviceMemoryOpaqueCaptureAddressInfo(block: (DeviceMemoryOpaqueCaptureAddressInfo) -> Unit) = DeviceMemoryOpaqueCaptureAddressInfo(calloc(24)).apply(block).also { it.sType = 1000257004 }

inline fun Allocator.SurfaceCapabilities(block: (SurfaceCapabilities) -> Unit) = SurfaceCapabilities(calloc(52)).apply(block)

inline fun Allocator.SurfaceFormat(block: (SurfaceFormat) -> Unit) = SurfaceFormat(calloc(8)).apply(block)

inline fun Allocator.SurfaceFormat(capacity: Int, block: (SurfaceFormat.Buffer) -> Unit) = SurfaceFormat.Buffer(calloc(capacity * 8), capacity).apply(block)

inline fun Allocator.SwapchainCreateInfo(block: (SwapchainCreateInfo) -> Unit) = SwapchainCreateInfo(calloc(104)).apply(block).also { it.sType = 1000001000 }

inline fun Allocator.SwapchainCreateInfo(capacity: Int, block: (SwapchainCreateInfo.Buffer) -> Unit) = SwapchainCreateInfo.Buffer(calloc(capacity * 104), capacity).apply(block).apply { forEach { it.sType = 1000001000 } }

inline fun Allocator.PresentInfo(block: (PresentInfo) -> Unit) = PresentInfo(calloc(64)).apply(block).also { it.sType = 1000001001 }

inline fun Allocator.ImageSwapchainCreateInfo(block: (ImageSwapchainCreateInfo) -> Unit) = ImageSwapchainCreateInfo(calloc(24)).apply(block).also { it.sType = 1000060008 }

inline fun Allocator.BindImageMemorySwapchainInfo(block: (BindImageMemorySwapchainInfo) -> Unit) = BindImageMemorySwapchainInfo(calloc(32)).apply(block).also { it.sType = 1000060009 }

inline fun Allocator.AcquireNextImageInfo(block: (AcquireNextImageInfo) -> Unit) = AcquireNextImageInfo(calloc(56)).apply(block).also { it.sType = 1000060010 }

inline fun Allocator.DeviceGroupPresentCapabilities(block: (DeviceGroupPresentCapabilities) -> Unit) = DeviceGroupPresentCapabilities(calloc(152)).apply(block).also { it.sType = 1000060007 }

inline fun Allocator.DeviceGroupPresentInfo(block: (DeviceGroupPresentInfo) -> Unit) = DeviceGroupPresentInfo(calloc(40)).apply(block).also { it.sType = 1000060011 }

inline fun Allocator.DeviceGroupSwapchainCreateInfo(block: (DeviceGroupSwapchainCreateInfo) -> Unit) = DeviceGroupSwapchainCreateInfo(calloc(24)).apply(block).also { it.sType = 1000060012 }

inline fun Allocator.DisplayModeCreateInfo(block: (DisplayModeCreateInfo) -> Unit) = DisplayModeCreateInfo(calloc(32)).apply(block).also { it.sType = 1000002000 }

inline fun Allocator.DisplayModeParameters(block: (DisplayModeParameters) -> Unit) = DisplayModeParameters(calloc(12)).apply(block)

inline fun Allocator.DisplayModeProperties(block: (DisplayModeProperties) -> Unit) = DisplayModeProperties(calloc(24)).apply(block)

inline fun Allocator.DisplayModeProperties(capacity: Int, block: (DisplayModeProperties.Buffer) -> Unit) = DisplayModeProperties.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.DisplayPlaneCapabilities(block: (DisplayPlaneCapabilities) -> Unit) = DisplayPlaneCapabilities(calloc(68)).apply(block)

inline fun Allocator.DisplayPlaneProperties(block: (DisplayPlaneProperties) -> Unit) = DisplayPlaneProperties(calloc(16)).apply(block)

inline fun Allocator.DisplayPlaneProperties(capacity: Int, block: (DisplayPlaneProperties.Buffer) -> Unit) = DisplayPlaneProperties.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.DisplayProperties(block: (DisplayProperties) -> Unit) = DisplayProperties(calloc(48)).apply(block)

inline fun Allocator.DisplayProperties(capacity: Int, block: (DisplayProperties.Buffer) -> Unit) = DisplayProperties.Buffer(calloc(capacity * 48), capacity).apply(block)

inline fun Allocator.DisplaySurfaceCreateInfo(block: (DisplaySurfaceCreateInfo) -> Unit) = DisplaySurfaceCreateInfo(calloc(64)).apply(block).also { it.sType = 1000002001 }

inline fun Allocator.DisplayPresentInfo(block: (DisplayPresentInfo) -> Unit) = DisplayPresentInfo(calloc(56)).apply(block).also { it.sType = 1000003000 }

inline fun Allocator.XlibSurfaceCreateInfo(block: (XlibSurfaceCreateInfo) -> Unit) = XlibSurfaceCreateInfo(calloc(40)).apply(block).also { it.sType = 1000004000 }

inline fun Allocator.XcbSurfaceCreateInfo(block: (XcbSurfaceCreateInfo) -> Unit) = XcbSurfaceCreateInfo(calloc(40)).apply(block).also { it.sType = 1000005000 }

inline fun Allocator.WaylandSurfaceCreateInfo(block: (WaylandSurfaceCreateInfo) -> Unit) = WaylandSurfaceCreateInfo(calloc(40)).apply(block).also { it.sType = 1000006000 }

inline fun Allocator.AndroidSurfaceCreateInfo(block: (AndroidSurfaceCreateInfo) -> Unit) = AndroidSurfaceCreateInfo(calloc(32)).apply(block).also { it.sType = 1000008000 }

inline fun Allocator.Win32SurfaceCreateInfo(block: (Win32SurfaceCreateInfo) -> Unit) = Win32SurfaceCreateInfo(calloc(40)).apply(block).also { it.sType = 1000009000 }

inline fun Allocator.PipelineRasterizationStateRasterizationOrder(block: (PipelineRasterizationStateRasterizationOrder) -> Unit) = PipelineRasterizationStateRasterizationOrder(calloc(24)).apply(block).also { it.sType = 1000018000 }

inline fun Allocator.PhysicalDeviceTransformFeedbackFeatures(block: (PhysicalDeviceTransformFeedbackFeatures) -> Unit) = PhysicalDeviceTransformFeedbackFeatures(calloc(24)).apply(block).also { it.sType = 1000028000 }

inline fun Allocator.PhysicalDeviceTransformFeedbackProperties(block: (PhysicalDeviceTransformFeedbackProperties) -> Unit) = PhysicalDeviceTransformFeedbackProperties(calloc(64)).apply(block).also { it.sType = 1000028001 }

inline fun Allocator.PipelineRasterizationStateStreamCreateInfo(block: (PipelineRasterizationStateStreamCreateInfo) -> Unit) = PipelineRasterizationStateStreamCreateInfo(calloc(24)).apply(block).also { it.sType = 1000028002 }

inline fun Allocator.ImageViewHandleInfo(block: (ImageViewHandleInfo) -> Unit) = ImageViewHandleInfo(calloc(40)).apply(block).also { it.sType = 1000030000 }

inline fun Allocator.ImageViewAddressProperties(block: (ImageViewAddressProperties) -> Unit) = ImageViewAddressProperties(calloc(32)).apply(block).also { it.sType = 1000030001 }

inline fun Allocator.TextureLODGatherFormatProperties(block: (TextureLODGatherFormatProperties) -> Unit) = TextureLODGatherFormatProperties(calloc(24)).apply(block).also { it.sType = 1000041000 }

inline fun Allocator.ShaderResourceUsage(block: (ShaderResourceUsage) -> Unit) = ShaderResourceUsage(calloc(32)).apply(block)

inline fun Allocator.ShaderStatisticsInfo(block: (ShaderStatisticsInfo) -> Unit) = ShaderStatisticsInfo(calloc(72)).apply(block)

inline fun Allocator.StreamDescriptorSurfaceCreateInfo(block: (StreamDescriptorSurfaceCreateInfo) -> Unit) = StreamDescriptorSurfaceCreateInfo(calloc(32)).apply(block).also { it.sType = 1000049000 }

inline fun Allocator.PhysicalDeviceCornerSampledImageFeatures(block: (PhysicalDeviceCornerSampledImageFeatures) -> Unit) = PhysicalDeviceCornerSampledImageFeatures(calloc(24)).apply(block).also { it.sType = 1000050000 }

inline fun Allocator.ViSurfaceCreateInfo(block: (ViSurfaceCreateInfo) -> Unit) = ViSurfaceCreateInfo(calloc(32)).apply(block).also { it.sType = 1000062000 }

inline fun Allocator.PhysicalDeviceTextureCompressionASTCHDRFeatures(block: (PhysicalDeviceTextureCompressionASTCHDRFeatures) -> Unit) = PhysicalDeviceTextureCompressionASTCHDRFeatures(calloc(24)).apply(block).also { it.sType = 1000066000 }

inline fun Allocator.ImageViewASTCDecodeMode(block: (ImageViewASTCDecodeMode) -> Unit) = ImageViewASTCDecodeMode(calloc(24)).apply(block).also { it.sType = 1000067000 }

inline fun Allocator.PhysicalDeviceASTCDecodeFeatures(block: (PhysicalDeviceASTCDecodeFeatures) -> Unit) = PhysicalDeviceASTCDecodeFeatures(calloc(24)).apply(block).also { it.sType = 1000067001 }

inline fun Allocator.ImportMemoryWin32HandleInfo(block: (ImportMemoryWin32HandleInfo) -> Unit) = ImportMemoryWin32HandleInfo(calloc(40)).apply(block).also { it.sType = 1000073000 }

inline fun Allocator.ExportMemoryWin32HandleInfo(block: (ExportMemoryWin32HandleInfo) -> Unit) = ExportMemoryWin32HandleInfo(calloc(40)).apply(block).also { it.sType = 1000073001 }

inline fun Allocator.MemoryWin32HandleProperties(block: (MemoryWin32HandleProperties) -> Unit) = MemoryWin32HandleProperties(calloc(24)).apply(block).also { it.sType = 1000073002 }

inline fun Allocator.MemoryGetWin32HandleInfo(block: (MemoryGetWin32HandleInfo) -> Unit) = MemoryGetWin32HandleInfo(calloc(32)).apply(block).also { it.sType = 1000073003 }

inline fun Allocator.ImportMemoryFdInfo(block: (ImportMemoryFdInfo) -> Unit) = ImportMemoryFdInfo(calloc(24)).apply(block).also { it.sType = 1000074000 }

inline fun Allocator.MemoryFdProperties(block: (MemoryFdProperties) -> Unit) = MemoryFdProperties(calloc(24)).apply(block).also { it.sType = 1000074001 }

inline fun Allocator.MemoryGetFdInfo(block: (MemoryGetFdInfo) -> Unit) = MemoryGetFdInfo(calloc(32)).apply(block).also { it.sType = 1000074002 }

inline fun Allocator.Win32KeyedMutexAcquireReleaseInfo(block: (Win32KeyedMutexAcquireReleaseInfo) -> Unit) = Win32KeyedMutexAcquireReleaseInfo(calloc(72)).apply(block).also { it.sType = 1000075000 }

inline fun Allocator.ImportSemaphoreWin32HandleInfo(block: (ImportSemaphoreWin32HandleInfo) -> Unit) = ImportSemaphoreWin32HandleInfo(calloc(48)).apply(block).also { it.sType = 1000078000 }

inline fun Allocator.ExportSemaphoreWin32HandleInfo(block: (ExportSemaphoreWin32HandleInfo) -> Unit) = ExportSemaphoreWin32HandleInfo(calloc(40)).apply(block).also { it.sType = 1000078001 }

inline fun Allocator.D3D12FenceSubmitInfo(block: (D3D12FenceSubmitInfo) -> Unit) = D3D12FenceSubmitInfo(calloc(48)).apply(block).also { it.sType = 1000078002 }

inline fun Allocator.SemaphoreGetWin32HandleInfo(block: (SemaphoreGetWin32HandleInfo) -> Unit) = SemaphoreGetWin32HandleInfo(calloc(32)).apply(block).also { it.sType = 1000078003 }

inline fun Allocator.ImportSemaphoreFdInfo(block: (ImportSemaphoreFdInfo) -> Unit) = ImportSemaphoreFdInfo(calloc(40)).apply(block).also { it.sType = 1000079000 }

inline fun Allocator.SemaphoreGetFdInfo(block: (SemaphoreGetFdInfo) -> Unit) = SemaphoreGetFdInfo(calloc(32)).apply(block).also { it.sType = 1000079001 }

inline fun Allocator.PhysicalDevicePushDescriptorProperties(block: (PhysicalDevicePushDescriptorProperties) -> Unit) = PhysicalDevicePushDescriptorProperties(calloc(24)).apply(block).also { it.sType = 1000080000 }

inline fun Allocator.ConditionalRenderingBeginInfo(block: (ConditionalRenderingBeginInfo) -> Unit) = ConditionalRenderingBeginInfo(calloc(40)).apply(block).also { it.sType = 1000081002 }

inline fun Allocator.PhysicalDeviceConditionalRenderingFeatures(block: (PhysicalDeviceConditionalRenderingFeatures) -> Unit) = PhysicalDeviceConditionalRenderingFeatures(calloc(24)).apply(block).also { it.sType = 1000081001 }

inline fun Allocator.CommandBufferInheritanceConditionalRenderingInfo(block: (CommandBufferInheritanceConditionalRenderingInfo) -> Unit) = CommandBufferInheritanceConditionalRenderingInfo(calloc(24)).apply(block).also { it.sType = 1000081000 }

inline fun Allocator.PresentRegions(block: (PresentRegions) -> Unit) = PresentRegions(calloc(32)).apply(block).also { it.sType = 1000084000 }

inline fun Allocator.PresentRegion(block: (PresentRegion) -> Unit) = PresentRegion(calloc(16)).apply(block)

inline fun Allocator.PresentRegion(capacity: Int, block: (PresentRegion.Buffer) -> Unit) = PresentRegion.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.RectLayer(block: (RectLayer) -> Unit) = RectLayer(calloc(20)).apply(block)

inline fun Allocator.RectLayer(capacity: Int, block: (RectLayer.Buffer) -> Unit) = RectLayer.Buffer(calloc(capacity * 20), capacity).apply(block)

inline fun Allocator.ViewportWScaling(block: (ViewportWScaling) -> Unit) = ViewportWScaling(calloc(8)).apply(block)

inline fun Allocator.ViewportWScaling(capacity: Int, block: (ViewportWScaling.Buffer) -> Unit) = ViewportWScaling.Buffer(calloc(capacity * 8), capacity).apply(block)

inline fun Allocator.PipelineViewportWScalingStateCreateInfo(block: (PipelineViewportWScalingStateCreateInfo) -> Unit) = PipelineViewportWScalingStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000087000 }

inline fun Allocator.SurfaceCapabilities2EXT(block: (SurfaceCapabilities2EXT) -> Unit) = SurfaceCapabilities2EXT(calloc(72)).apply(block).also { it.sType = 1000090000 }

inline fun Allocator.DisplayPowerInfo(block: (DisplayPowerInfo) -> Unit) = DisplayPowerInfo(calloc(24)).apply(block).also { it.sType = 1000091000 }

inline fun Allocator.DeviceEventInfo(block: (DeviceEventInfo) -> Unit) = DeviceEventInfo(calloc(24)).apply(block).also { it.sType = 1000091001 }

inline fun Allocator.DisplayEventInfo(block: (DisplayEventInfo) -> Unit) = DisplayEventInfo(calloc(24)).apply(block).also { it.sType = 1000091002 }

inline fun Allocator.SwapchainCounterCreateInfo(block: (SwapchainCounterCreateInfo) -> Unit) = SwapchainCounterCreateInfo(calloc(24)).apply(block).also { it.sType = 1000091003 }

inline fun Allocator.RefreshCycleDuration(block: (RefreshCycleDuration) -> Unit) = RefreshCycleDuration(calloc(8)).apply(block)

inline fun Allocator.PastPresentationTiming(block: (PastPresentationTiming) -> Unit) = PastPresentationTiming(calloc(40)).apply(block)

inline fun Allocator.PastPresentationTiming(capacity: Int, block: (PastPresentationTiming.Buffer) -> Unit) = PastPresentationTiming.Buffer(calloc(capacity * 40), capacity).apply(block)

inline fun Allocator.PresentTimesInfo(block: (PresentTimesInfo) -> Unit) = PresentTimesInfo(calloc(32)).apply(block).also { it.sType = 1000092000 }

inline fun Allocator.PresentTime(block: (PresentTime) -> Unit) = PresentTime(calloc(16)).apply(block)

inline fun Allocator.PresentTime(capacity: Int, block: (PresentTime.Buffer) -> Unit) = PresentTime.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.PhysicalDeviceMultiviewPerViewAttributesProperties(block: (PhysicalDeviceMultiviewPerViewAttributesProperties) -> Unit) = PhysicalDeviceMultiviewPerViewAttributesProperties(calloc(24)).apply(block).also { it.sType = 1000097000 }

inline fun Allocator.ViewportSwizzle(block: (ViewportSwizzle) -> Unit) = ViewportSwizzle(calloc(16)).apply(block)

inline fun Allocator.ViewportSwizzle(capacity: Int, block: (ViewportSwizzle.Buffer) -> Unit) = ViewportSwizzle.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.PipelineViewportSwizzleStateCreateInfo(block: (PipelineViewportSwizzleStateCreateInfo) -> Unit) = PipelineViewportSwizzleStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000098000 }

inline fun Allocator.PhysicalDeviceDiscardRectangleProperties(block: (PhysicalDeviceDiscardRectangleProperties) -> Unit) = PhysicalDeviceDiscardRectangleProperties(calloc(24)).apply(block).also { it.sType = 1000099000 }

inline fun Allocator.PipelineDiscardRectangleStateCreateInfo(block: (PipelineDiscardRectangleStateCreateInfo) -> Unit) = PipelineDiscardRectangleStateCreateInfo(calloc(40)).apply(block).also { it.sType = 1000099001 }

inline fun Allocator.PhysicalDeviceConservativeRasterizationProperties(block: (PhysicalDeviceConservativeRasterizationProperties) -> Unit) = PhysicalDeviceConservativeRasterizationProperties(calloc(56)).apply(block).also { it.sType = 1000101000 }

inline fun Allocator.PipelineRasterizationConservativeStateCreateInfo(block: (PipelineRasterizationConservativeStateCreateInfo) -> Unit) = PipelineRasterizationConservativeStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000101001 }

inline fun Allocator.PhysicalDeviceDepthClipEnableFeatures(block: (PhysicalDeviceDepthClipEnableFeatures) -> Unit) = PhysicalDeviceDepthClipEnableFeatures(calloc(24)).apply(block).also { it.sType = 1000102000 }

inline fun Allocator.PipelineRasterizationDepthClipStateCreateInfo(block: (PipelineRasterizationDepthClipStateCreateInfo) -> Unit) = PipelineRasterizationDepthClipStateCreateInfo(calloc(24)).apply(block).also { it.sType = 1000102001 }

inline fun Allocator.HdrMetadata(block: (HdrMetadata) -> Unit) = HdrMetadata(calloc(64)).apply(block).also { it.sType = 1000105000 }

inline fun Allocator.HdrMetadata(capacity: Int, block: (HdrMetadata.Buffer) -> Unit) = HdrMetadata.Buffer(calloc(capacity * 64), capacity).apply(block).apply { forEach { it.sType = 1000105000 } }

inline fun Allocator.XYColor(block: (XYColor) -> Unit) = XYColor(calloc(8)).apply(block)

inline fun Allocator.SharedPresentSurfaceCapabilities(block: (SharedPresentSurfaceCapabilities) -> Unit) = SharedPresentSurfaceCapabilities(calloc(24)).apply(block).also { it.sType = 1000111000 }

inline fun Allocator.ImportFenceWin32HandleInfo(block: (ImportFenceWin32HandleInfo) -> Unit) = ImportFenceWin32HandleInfo(calloc(48)).apply(block).also { it.sType = 1000114000 }

inline fun Allocator.ExportFenceWin32HandleInfo(block: (ExportFenceWin32HandleInfo) -> Unit) = ExportFenceWin32HandleInfo(calloc(40)).apply(block).also { it.sType = 1000114001 }

inline fun Allocator.FenceGetWin32HandleInfo(block: (FenceGetWin32HandleInfo) -> Unit) = FenceGetWin32HandleInfo(calloc(32)).apply(block).also { it.sType = 1000114002 }

inline fun Allocator.ImportFenceFdInfo(block: (ImportFenceFdInfo) -> Unit) = ImportFenceFdInfo(calloc(40)).apply(block).also { it.sType = 1000115000 }

inline fun Allocator.FenceGetFdInfo(block: (FenceGetFdInfo) -> Unit) = FenceGetFdInfo(calloc(32)).apply(block).also { it.sType = 1000115001 }

inline fun Allocator.PhysicalDevicePerformanceQueryFeatures(block: (PhysicalDevicePerformanceQueryFeatures) -> Unit) = PhysicalDevicePerformanceQueryFeatures(calloc(24)).apply(block).also { it.sType = 1000116000 }

inline fun Allocator.PhysicalDevicePerformanceQueryProperties(block: (PhysicalDevicePerformanceQueryProperties) -> Unit) = PhysicalDevicePerformanceQueryProperties(calloc(24)).apply(block).also { it.sType = 1000116001 }

inline fun Allocator.PerformanceCounter(block: (PerformanceCounter) -> Unit) = PerformanceCounter(calloc(48)).apply(block).also { it.sType = 1000116005 }

inline fun Allocator.PerformanceCounter(capacity: Int, block: (PerformanceCounter.Buffer) -> Unit) = PerformanceCounter.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000116005 } }

inline fun Allocator.PerformanceCounterDescription(block: (PerformanceCounterDescription) -> Unit) = PerformanceCounterDescription(calloc(792)).apply(block).also { it.sType = 1000116006 }

inline fun Allocator.PerformanceCounterDescription(capacity: Int, block: (PerformanceCounterDescription.Buffer) -> Unit) = PerformanceCounterDescription.Buffer(calloc(capacity * 792), capacity).apply(block).apply { forEach { it.sType = 1000116006 } }

inline fun Allocator.QueryPoolPerformanceCreateInfo(block: (QueryPoolPerformanceCreateInfo) -> Unit) = QueryPoolPerformanceCreateInfo(calloc(32)).apply(block).also { it.sType = 1000116002 }

inline fun Allocator.PerformanceCounterResult(block: (PerformanceCounterResult) -> Unit) = PerformanceCounterResult(calloc(8)).apply(block)

inline fun Allocator.AcquireProfilingLockInfo(block: (AcquireProfilingLockInfo) -> Unit) = AcquireProfilingLockInfo(calloc(32)).apply(block).also { it.sType = 1000116004 }

inline fun Allocator.PerformanceQuerySubmitInfo(block: (PerformanceQuerySubmitInfo) -> Unit) = PerformanceQuerySubmitInfo(calloc(24)).apply(block).also { it.sType = 1000116003 }

inline fun Allocator.PhysicalDeviceSurfaceInfo2(block: (PhysicalDeviceSurfaceInfo2) -> Unit) = PhysicalDeviceSurfaceInfo2(calloc(24)).apply(block).also { it.sType = 1000119000 }

inline fun Allocator.SurfaceCapabilities2KHR(block: (SurfaceCapabilities2KHR) -> Unit) = SurfaceCapabilities2KHR(calloc(72)).apply(block).also { it.sType = 1000119001 }

inline fun Allocator.SurfaceFormat2(block: (SurfaceFormat2) -> Unit) = SurfaceFormat2(calloc(24)).apply(block).also { it.sType = 1000119002 }

inline fun Allocator.SurfaceFormat2(capacity: Int, block: (SurfaceFormat2.Buffer) -> Unit) = SurfaceFormat2.Buffer(calloc(capacity * 24), capacity).apply(block).apply { forEach { it.sType = 1000119002 } }

inline fun Allocator.DisplayProperties2(block: (DisplayProperties2) -> Unit) = DisplayProperties2(calloc(64)).apply(block).also { it.sType = 1000121000 }

inline fun Allocator.DisplayProperties2(capacity: Int, block: (DisplayProperties2.Buffer) -> Unit) = DisplayProperties2.Buffer(calloc(capacity * 64), capacity).apply(block).apply { forEach { it.sType = 1000121000 } }

inline fun Allocator.DisplayPlaneProperties2(block: (DisplayPlaneProperties2) -> Unit) = DisplayPlaneProperties2(calloc(32)).apply(block).also { it.sType = 1000121001 }

inline fun Allocator.DisplayPlaneProperties2(capacity: Int, block: (DisplayPlaneProperties2.Buffer) -> Unit) = DisplayPlaneProperties2.Buffer(calloc(capacity * 32), capacity).apply(block).apply { forEach { it.sType = 1000121001 } }

inline fun Allocator.DisplayModeProperties2(block: (DisplayModeProperties2) -> Unit) = DisplayModeProperties2(calloc(40)).apply(block).also { it.sType = 1000121002 }

inline fun Allocator.DisplayModeProperties2(capacity: Int, block: (DisplayModeProperties2.Buffer) -> Unit) = DisplayModeProperties2.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000121002 } }

inline fun Allocator.DisplayPlaneInfo2(block: (DisplayPlaneInfo2) -> Unit) = DisplayPlaneInfo2(calloc(32)).apply(block).also { it.sType = 1000121003 }

inline fun Allocator.DisplayPlaneCapabilities2(block: (DisplayPlaneCapabilities2) -> Unit) = DisplayPlaneCapabilities2(calloc(88)).apply(block).also { it.sType = 1000121004 }

inline fun Allocator.DebugUtilsLabel(block: (DebugUtilsLabel) -> Unit) = DebugUtilsLabel(calloc(40)).apply(block).also { it.sType = 1000128002 }

inline fun Allocator.DebugUtilsLabel(capacity: Int, block: (DebugUtilsLabel.Buffer) -> Unit) = DebugUtilsLabel.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000128002 } }

inline fun Allocator.DebugUtilsMessengerCallbackData(block: (DebugUtilsMessengerCallbackData) -> Unit) = DebugUtilsMessengerCallbackData(calloc(96)).apply(block).also { it.sType = 1000128003 }

inline fun Allocator.DebugUtilsMessengerCreateInfo(block: (DebugUtilsMessengerCreateInfo) -> Unit) = DebugUtilsMessengerCreateInfo(calloc(48)).apply(block).also { it.sType = 1000128004 }

inline fun Allocator.DebugUtilsObjectNameInfo(block: (DebugUtilsObjectNameInfo) -> Unit) = DebugUtilsObjectNameInfo(calloc(40)).apply(block).also { it.sType = 1000128000 }

inline fun Allocator.DebugUtilsObjectNameInfo(capacity: Int, block: (DebugUtilsObjectNameInfo.Buffer) -> Unit) = DebugUtilsObjectNameInfo.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000128000 } }

inline fun Allocator.DebugUtilsObjectTagInfo(block: (DebugUtilsObjectTagInfo) -> Unit) = DebugUtilsObjectTagInfo(calloc(56)).apply(block).also { it.sType = 1000128001 }

inline fun Allocator.AndroidHardwareBufferUsage(block: (AndroidHardwareBufferUsage) -> Unit) = AndroidHardwareBufferUsage(calloc(24)).apply(block).also { it.sType = 1000129000 }

inline fun Allocator.AndroidHardwareBufferProperties(block: (AndroidHardwareBufferProperties) -> Unit) = AndroidHardwareBufferProperties(calloc(32)).apply(block).also { it.sType = 1000129001 }

inline fun Allocator.AndroidHardwareBufferFormatProperties(block: (AndroidHardwareBufferFormatProperties) -> Unit) = AndroidHardwareBufferFormatProperties(calloc(72)).apply(block).also { it.sType = 1000129002 }

inline fun Allocator.ImportAndroidHardwareBufferInfo(block: (ImportAndroidHardwareBufferInfo) -> Unit) = ImportAndroidHardwareBufferInfo(calloc(24)).apply(block).also { it.sType = 1000129003 }

inline fun Allocator.MemoryGetAndroidHardwareBufferInfo(block: (MemoryGetAndroidHardwareBufferInfo) -> Unit) = MemoryGetAndroidHardwareBufferInfo(calloc(24)).apply(block).also { it.sType = 1000129004 }

inline fun Allocator.ExternalFormat(block: (ExternalFormat) -> Unit) = ExternalFormat(calloc(24)).apply(block).also { it.sType = 1000129005 }

inline fun Allocator.PhysicalDeviceInlineUniformBlockFeatures(block: (PhysicalDeviceInlineUniformBlockFeatures) -> Unit) = PhysicalDeviceInlineUniformBlockFeatures(calloc(24)).apply(block).also { it.sType = 1000138000 }

inline fun Allocator.PhysicalDeviceInlineUniformBlockProperties(block: (PhysicalDeviceInlineUniformBlockProperties) -> Unit) = PhysicalDeviceInlineUniformBlockProperties(calloc(40)).apply(block).also { it.sType = 1000138001 }

inline fun Allocator.WriteDescriptorSetInlineUniformBlock(block: (WriteDescriptorSetInlineUniformBlock) -> Unit) = WriteDescriptorSetInlineUniformBlock(calloc(32)).apply(block).also { it.sType = 1000138002 }

inline fun Allocator.DescriptorPoolInlineUniformBlockCreateInfo(block: (DescriptorPoolInlineUniformBlockCreateInfo) -> Unit) = DescriptorPoolInlineUniformBlockCreateInfo(calloc(24)).apply(block).also { it.sType = 1000138003 }

inline fun Allocator.SampleLocation(block: (SampleLocation) -> Unit) = SampleLocation(calloc(8)).apply(block)

inline fun Allocator.SampleLocation(capacity: Int, block: (SampleLocation.Buffer) -> Unit) = SampleLocation.Buffer(calloc(capacity * 8), capacity).apply(block)

inline fun Allocator.SampleLocationsInfo(block: (SampleLocationsInfo) -> Unit) = SampleLocationsInfo(calloc(40)).apply(block).also { it.sType = 1000143000 }

inline fun Allocator.AttachmentSampleLocations(block: (AttachmentSampleLocations) -> Unit) = AttachmentSampleLocations(calloc(48)).apply(block)

inline fun Allocator.AttachmentSampleLocations(capacity: Int, block: (AttachmentSampleLocations.Buffer) -> Unit) = AttachmentSampleLocations.Buffer(calloc(capacity * 48), capacity).apply(block)

inline fun Allocator.SubpassSampleLocations(block: (SubpassSampleLocations) -> Unit) = SubpassSampleLocations(calloc(48)).apply(block)

inline fun Allocator.SubpassSampleLocations(capacity: Int, block: (SubpassSampleLocations.Buffer) -> Unit) = SubpassSampleLocations.Buffer(calloc(capacity * 48), capacity).apply(block)

inline fun Allocator.RenderPassSampleLocationsBeginInfo(block: (RenderPassSampleLocationsBeginInfo) -> Unit) = RenderPassSampleLocationsBeginInfo(calloc(48)).apply(block).also { it.sType = 1000143001 }

inline fun Allocator.PipelineSampleLocationsStateCreateInfo(block: (PipelineSampleLocationsStateCreateInfo) -> Unit) = PipelineSampleLocationsStateCreateInfo(calloc(64)).apply(block).also { it.sType = 1000143002 }

inline fun Allocator.PhysicalDeviceSampleLocationsProperties(block: (PhysicalDeviceSampleLocationsProperties) -> Unit) = PhysicalDeviceSampleLocationsProperties(calloc(48)).apply(block).also { it.sType = 1000143003 }

inline fun Allocator.MultisampleProperties(block: (MultisampleProperties) -> Unit) = MultisampleProperties(calloc(24)).apply(block).also { it.sType = 1000143004 }

inline fun Allocator.PhysicalDeviceBlendOperationAdvancedFeatures(block: (PhysicalDeviceBlendOperationAdvancedFeatures) -> Unit) = PhysicalDeviceBlendOperationAdvancedFeatures(calloc(24)).apply(block).also { it.sType = 1000148000 }

inline fun Allocator.PhysicalDeviceBlendOperationAdvancedProperties(block: (PhysicalDeviceBlendOperationAdvancedProperties) -> Unit) = PhysicalDeviceBlendOperationAdvancedProperties(calloc(40)).apply(block).also { it.sType = 1000148001 }

inline fun Allocator.PipelineColorBlendAdvancedStateCreateInfo(block: (PipelineColorBlendAdvancedStateCreateInfo) -> Unit) = PipelineColorBlendAdvancedStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000148002 }

inline fun Allocator.PipelineCoverageToColorStateCreateInfo(block: (PipelineCoverageToColorStateCreateInfo) -> Unit) = PipelineCoverageToColorStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000149000 }

inline fun Allocator.DeviceOrHostAddress(block: (DeviceOrHostAddress) -> Unit) = DeviceOrHostAddress(calloc(8)).apply(block)

inline fun Allocator.DeviceOrHostAddressConst(block: (DeviceOrHostAddressConst) -> Unit) = DeviceOrHostAddressConst(calloc(8)).apply(block)

inline fun Allocator.AccelerationStructureBuildRangeInfo(block: (AccelerationStructureBuildRangeInfo) -> Unit) = AccelerationStructureBuildRangeInfo(calloc(16)).apply(block)

inline fun Allocator.AccelerationStructureBuildRangeInfo(capacity: Int, block: (AccelerationStructureBuildRangeInfo.Buffer) -> Unit) = AccelerationStructureBuildRangeInfo.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.AabbPositions(block: (AabbPositions) -> Unit) = AabbPositions(calloc(24)).apply(block)

inline fun Allocator.AccelerationStructureGeometryTrianglesData(block: (AccelerationStructureGeometryTrianglesData) -> Unit) = AccelerationStructureGeometryTrianglesData(calloc(64)).apply(block).also { it.sType = 1000150005 }

inline fun Allocator.TransformMatrix(block: (TransformMatrix) -> Unit) = TransformMatrix(calloc(16)).apply(block)

inline fun Allocator.AccelerationStructureBuildGeometryInfo(block: (AccelerationStructureBuildGeometryInfo) -> Unit) = AccelerationStructureBuildGeometryInfo(calloc(80)).apply(block).also { it.sType = 1000150000 }

inline fun Allocator.AccelerationStructureBuildGeometryInfo(capacity: Int, block: (AccelerationStructureBuildGeometryInfo.Buffer) -> Unit) = AccelerationStructureBuildGeometryInfo.Buffer(calloc(capacity * 80), capacity).apply(block).apply { forEach { it.sType = 1000150000 } }

inline fun Allocator.AccelerationStructureGeometryAabbsData(block: (AccelerationStructureGeometryAabbsData) -> Unit) = AccelerationStructureGeometryAabbsData(calloc(32)).apply(block).also { it.sType = 1000150003 }

inline fun Allocator.AccelerationStructureInstance(block: (AccelerationStructureInstance) -> Unit) = AccelerationStructureInstance(calloc(40)).apply(block)

inline fun Allocator.AccelerationStructureGeometryInstancesData(block: (AccelerationStructureGeometryInstancesData) -> Unit) = AccelerationStructureGeometryInstancesData(calloc(32)).apply(block).also { it.sType = 1000150004 }

inline fun Allocator.AccelerationStructureGeometryData(block: (AccelerationStructureGeometryData) -> Unit) = AccelerationStructureGeometryData(calloc(64)).apply(block)

inline fun Allocator.AccelerationStructureGeometry(block: (AccelerationStructureGeometry) -> Unit) = AccelerationStructureGeometry(calloc(96)).apply(block).also { it.sType = 1000150006 }

inline fun Allocator.AccelerationStructureGeometry(capacity: Int, block: (AccelerationStructureGeometry.Buffer) -> Unit) = AccelerationStructureGeometry.Buffer(calloc(capacity * 96), capacity).apply(block).apply { forEach { it.sType = 1000150006 } }

inline fun Allocator.AccelerationStructureCreateInfoKHR(block: (AccelerationStructureCreateInfoKHR) -> Unit) = AccelerationStructureCreateInfoKHR(calloc(64)).apply(block).also { it.sType = 1000150017 }

inline fun Allocator.WriteDescriptorSetAccelerationStructureKHR(block: (WriteDescriptorSetAccelerationStructureKHR) -> Unit) = WriteDescriptorSetAccelerationStructureKHR(calloc(32)).apply(block).also { it.sType = 1000150007 }

inline fun Allocator.PhysicalDeviceAccelerationStructureFeatures(block: (PhysicalDeviceAccelerationStructureFeatures) -> Unit) = PhysicalDeviceAccelerationStructureFeatures(calloc(40)).apply(block).also { it.sType = 1000150013 }

inline fun Allocator.PhysicalDeviceAccelerationStructureProperties(block: (PhysicalDeviceAccelerationStructureProperties) -> Unit) = PhysicalDeviceAccelerationStructureProperties(calloc(64)).apply(block).also { it.sType = 1000150014 }

inline fun Allocator.AccelerationStructureDeviceAddressInfo(block: (AccelerationStructureDeviceAddressInfo) -> Unit) = AccelerationStructureDeviceAddressInfo(calloc(24)).apply(block).also { it.sType = 1000150002 }

inline fun Allocator.AccelerationStructureVersionInfo(block: (AccelerationStructureVersionInfo) -> Unit) = AccelerationStructureVersionInfo(calloc(24)).apply(block).also { it.sType = 1000150009 }

inline fun Allocator.CopyAccelerationStructureToMemoryInfo(block: (CopyAccelerationStructureToMemoryInfo) -> Unit) = CopyAccelerationStructureToMemoryInfo(calloc(40)).apply(block).also { it.sType = 1000150011 }

inline fun Allocator.CopyMemoryToAccelerationStructureInfo(block: (CopyMemoryToAccelerationStructureInfo) -> Unit) = CopyMemoryToAccelerationStructureInfo(calloc(40)).apply(block).also { it.sType = 1000150012 }

inline fun Allocator.CopyAccelerationStructureInfo(block: (CopyAccelerationStructureInfo) -> Unit) = CopyAccelerationStructureInfo(calloc(40)).apply(block).also { it.sType = 1000150010 }

inline fun Allocator.AccelerationStructureBuildSizesInfo(block: (AccelerationStructureBuildSizesInfo) -> Unit) = AccelerationStructureBuildSizesInfo(calloc(40)).apply(block).also { it.sType = 1000150020 }

inline fun Allocator.RayTracingShaderGroupCreateInfoKHR(block: (RayTracingShaderGroupCreateInfoKHR) -> Unit) = RayTracingShaderGroupCreateInfoKHR(calloc(48)).apply(block).also { it.sType = 1000150016 }

inline fun Allocator.RayTracingShaderGroupCreateInfoKHR(capacity: Int, block: (RayTracingShaderGroupCreateInfoKHR.Buffer) -> Unit) = RayTracingShaderGroupCreateInfoKHR.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000150016 } }

inline fun Allocator.RayTracingPipelineCreateInfoKHR(block: (RayTracingPipelineCreateInfoKHR) -> Unit) = RayTracingPipelineCreateInfoKHR(calloc(104)).apply(block).also { it.sType = 1000150015 }

inline fun Allocator.RayTracingPipelineCreateInfoKHR(capacity: Int, block: (RayTracingPipelineCreateInfoKHR.Buffer) -> Unit) = RayTracingPipelineCreateInfoKHR.Buffer(calloc(capacity * 104), capacity).apply(block).apply { forEach { it.sType = 1000150015 } }

inline fun Allocator.PhysicalDeviceRayTracingPipelineFeatures(block: (PhysicalDeviceRayTracingPipelineFeatures) -> Unit) = PhysicalDeviceRayTracingPipelineFeatures(calloc(40)).apply(block).also { it.sType = 1000347000 }

inline fun Allocator.PhysicalDeviceRayTracingPipelineProperties(block: (PhysicalDeviceRayTracingPipelineProperties) -> Unit) = PhysicalDeviceRayTracingPipelineProperties(calloc(48)).apply(block).also { it.sType = 1000347001 }

inline fun Allocator.StridedDeviceAddressRegion(block: (StridedDeviceAddressRegion) -> Unit) = StridedDeviceAddressRegion(calloc(24)).apply(block)

inline fun Allocator.TraceRaysIndirectCommand(block: (TraceRaysIndirectCommand) -> Unit) = TraceRaysIndirectCommand(calloc(12)).apply(block)

inline fun Allocator.RayTracingPipelineInterfaceCreateInfo(block: (RayTracingPipelineInterfaceCreateInfo) -> Unit) = RayTracingPipelineInterfaceCreateInfo(calloc(24)).apply(block).also { it.sType = 1000150018 }

inline fun Allocator.PhysicalDeviceRayQueryFeatures(block: (PhysicalDeviceRayQueryFeatures) -> Unit) = PhysicalDeviceRayQueryFeatures(calloc(24)).apply(block).also { it.sType = 1000348013 }

inline fun Allocator.PipelineCoverageModulationStateCreateInfo(block: (PipelineCoverageModulationStateCreateInfo) -> Unit) = PipelineCoverageModulationStateCreateInfo(calloc(40)).apply(block).also { it.sType = 1000152000 }

inline fun Allocator.PhysicalDeviceShaderSMBuiltinsProperties(block: (PhysicalDeviceShaderSMBuiltinsProperties) -> Unit) = PhysicalDeviceShaderSMBuiltinsProperties(calloc(24)).apply(block).also { it.sType = 1000154001 }

inline fun Allocator.PhysicalDeviceShaderSMBuiltinsFeatures(block: (PhysicalDeviceShaderSMBuiltinsFeatures) -> Unit) = PhysicalDeviceShaderSMBuiltinsFeatures(calloc(24)).apply(block).also { it.sType = 1000154000 }

inline fun Allocator.DrmFormatModifierPropertiesList(block: (DrmFormatModifierPropertiesList) -> Unit) = DrmFormatModifierPropertiesList(calloc(32)).apply(block).also { it.sType = 1000158000 }

inline fun Allocator.DrmFormatModifierProperties(block: (DrmFormatModifierProperties) -> Unit) = DrmFormatModifierProperties(calloc(16)).apply(block)

inline fun Allocator.DrmFormatModifierProperties(capacity: Int, block: (DrmFormatModifierProperties.Buffer) -> Unit) = DrmFormatModifierProperties.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.PhysicalDeviceImageDrmFormatModifierInfo(block: (PhysicalDeviceImageDrmFormatModifierInfo) -> Unit) = PhysicalDeviceImageDrmFormatModifierInfo(calloc(40)).apply(block).also { it.sType = 1000158002 }

inline fun Allocator.ImageDrmFormatModifierListCreateInfo(block: (ImageDrmFormatModifierListCreateInfo) -> Unit) = ImageDrmFormatModifierListCreateInfo(calloc(32)).apply(block).also { it.sType = 1000158003 }

inline fun Allocator.ImageDrmFormatModifierExplicitCreateInfo(block: (ImageDrmFormatModifierExplicitCreateInfo) -> Unit) = ImageDrmFormatModifierExplicitCreateInfo(calloc(40)).apply(block).also { it.sType = 1000158004 }

inline fun Allocator.ImageDrmFormatModifierProperties(block: (ImageDrmFormatModifierProperties) -> Unit) = ImageDrmFormatModifierProperties(calloc(24)).apply(block).also { it.sType = 1000158005 }

inline fun Allocator.ValidationCacheCreateInfo(block: (ValidationCacheCreateInfo) -> Unit) = ValidationCacheCreateInfo(calloc(40)).apply(block).also { it.sType = 1000160000 }

inline fun Allocator.ShaderModuleValidationCacheCreateInfo(block: (ShaderModuleValidationCacheCreateInfo) -> Unit) = ShaderModuleValidationCacheCreateInfo(calloc(24)).apply(block).also { it.sType = 1000160001 }

inline fun Allocator.PhysicalDevicePortabilitySubsetFeatures(block: (PhysicalDevicePortabilitySubsetFeatures) -> Unit) = PhysicalDevicePortabilitySubsetFeatures(calloc(80)).apply(block).also { it.sType = 1000163000 }

inline fun Allocator.PhysicalDevicePortabilitySubsetProperties(block: (PhysicalDevicePortabilitySubsetProperties) -> Unit) = PhysicalDevicePortabilitySubsetProperties(calloc(24)).apply(block).also { it.sType = 1000163001 }

inline fun Allocator.ShadingRatePalette(block: (ShadingRatePalette) -> Unit) = ShadingRatePalette(calloc(16)).apply(block)

inline fun Allocator.ShadingRatePalette(capacity: Int, block: (ShadingRatePalette.Buffer) -> Unit) = ShadingRatePalette.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.PipelineViewportShadingRateImageStateCreateInfo(block: (PipelineViewportShadingRateImageStateCreateInfo) -> Unit) = PipelineViewportShadingRateImageStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000164000 }

inline fun Allocator.PhysicalDeviceShadingRateImageFeatures(block: (PhysicalDeviceShadingRateImageFeatures) -> Unit) = PhysicalDeviceShadingRateImageFeatures(calloc(24)).apply(block).also { it.sType = 1000164001 }

inline fun Allocator.PhysicalDeviceShadingRateImageProperties(block: (PhysicalDeviceShadingRateImageProperties) -> Unit) = PhysicalDeviceShadingRateImageProperties(calloc(32)).apply(block).also { it.sType = 1000164002 }

inline fun Allocator.CoarseSampleLocation(block: (CoarseSampleLocation) -> Unit) = CoarseSampleLocation(calloc(12)).apply(block)

inline fun Allocator.CoarseSampleLocation(capacity: Int, block: (CoarseSampleLocation.Buffer) -> Unit) = CoarseSampleLocation.Buffer(calloc(capacity * 12), capacity).apply(block)

inline fun Allocator.CoarseSampleOrderCustom(block: (CoarseSampleOrderCustom) -> Unit) = CoarseSampleOrderCustom(calloc(24)).apply(block)

inline fun Allocator.CoarseSampleOrderCustom(capacity: Int, block: (CoarseSampleOrderCustom.Buffer) -> Unit) = CoarseSampleOrderCustom.Buffer(calloc(capacity * 24), capacity).apply(block)

inline fun Allocator.PipelineViewportCoarseSampleOrderStateCreateInfo(block: (PipelineViewportCoarseSampleOrderStateCreateInfo) -> Unit) = PipelineViewportCoarseSampleOrderStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000164005 }

inline fun Allocator.RayTracingShaderGroupCreateInfoNV(block: (RayTracingShaderGroupCreateInfoNV) -> Unit) = RayTracingShaderGroupCreateInfoNV(calloc(40)).apply(block).also { it.sType = 1000165011 }

inline fun Allocator.RayTracingShaderGroupCreateInfoNV(capacity: Int, block: (RayTracingShaderGroupCreateInfoNV.Buffer) -> Unit) = RayTracingShaderGroupCreateInfoNV.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000165011 } }

inline fun Allocator.RayTracingPipelineCreateInfoNV(block: (RayTracingPipelineCreateInfoNV) -> Unit) = RayTracingPipelineCreateInfoNV(calloc(80)).apply(block).also { it.sType = 1000165000 }

inline fun Allocator.RayTracingPipelineCreateInfoNV(capacity: Int, block: (RayTracingPipelineCreateInfoNV.Buffer) -> Unit) = RayTracingPipelineCreateInfoNV.Buffer(calloc(capacity * 80), capacity).apply(block).apply { forEach { it.sType = 1000165000 } }

inline fun Allocator.GeometryTriangles(block: (GeometryTriangles) -> Unit) = GeometryTriangles(calloc(96)).apply(block).also { it.sType = 1000165004 }

inline fun Allocator.GeometryAABB(block: (GeometryAABB) -> Unit) = GeometryAABB(calloc(40)).apply(block).also { it.sType = 1000165005 }

inline fun Allocator.GeometryData(block: (GeometryData) -> Unit) = GeometryData(calloc(136)).apply(block)

inline fun Allocator.Geometry(block: (Geometry) -> Unit) = Geometry(calloc(168)).apply(block).also { it.sType = 1000165003 }

inline fun Allocator.Geometry(capacity: Int, block: (Geometry.Buffer) -> Unit) = Geometry.Buffer(calloc(capacity * 168), capacity).apply(block).apply { forEach { it.sType = 1000165003 } }

inline fun Allocator.AccelerationStructureInfo(block: (AccelerationStructureInfo) -> Unit) = AccelerationStructureInfo(calloc(40)).apply(block).also { it.sType = 1000165012 }

inline fun Allocator.AccelerationStructureCreateInfoNV(block: (AccelerationStructureCreateInfoNV) -> Unit) = AccelerationStructureCreateInfoNV(calloc(64)).apply(block).also { it.sType = 1000165001 }

inline fun Allocator.BindAccelerationStructureMemoryInfo(block: (BindAccelerationStructureMemoryInfo) -> Unit) = BindAccelerationStructureMemoryInfo(calloc(56)).apply(block).also { it.sType = 1000165006 }

inline fun Allocator.BindAccelerationStructureMemoryInfo(capacity: Int, block: (BindAccelerationStructureMemoryInfo.Buffer) -> Unit) = BindAccelerationStructureMemoryInfo.Buffer(calloc(capacity * 56), capacity).apply(block).apply { forEach { it.sType = 1000165006 } }

inline fun Allocator.WriteDescriptorSetAccelerationStructureNV(block: (WriteDescriptorSetAccelerationStructureNV) -> Unit) = WriteDescriptorSetAccelerationStructureNV(calloc(32)).apply(block).also { it.sType = 1000165007 }

inline fun Allocator.AccelerationStructureMemoryRequirementsInfo(block: (AccelerationStructureMemoryRequirementsInfo) -> Unit) = AccelerationStructureMemoryRequirementsInfo(calloc(32)).apply(block).also { it.sType = 1000165008 }

inline fun Allocator.PhysicalDeviceRayTracingProperties(block: (PhysicalDeviceRayTracingProperties) -> Unit) = PhysicalDeviceRayTracingProperties(calloc(64)).apply(block).also { it.sType = 1000165009 }

inline fun Allocator.PhysicalDeviceRepresentativeFragmentTestFeatures(block: (PhysicalDeviceRepresentativeFragmentTestFeatures) -> Unit) = PhysicalDeviceRepresentativeFragmentTestFeatures(calloc(24)).apply(block).also { it.sType = 1000166000 }

inline fun Allocator.PipelineRepresentativeFragmentTestStateCreateInfo(block: (PipelineRepresentativeFragmentTestStateCreateInfo) -> Unit) = PipelineRepresentativeFragmentTestStateCreateInfo(calloc(24)).apply(block).also { it.sType = 1000166001 }

inline fun Allocator.PhysicalDeviceImageViewImageFormatInfo(block: (PhysicalDeviceImageViewImageFormatInfo) -> Unit) = PhysicalDeviceImageViewImageFormatInfo(calloc(24)).apply(block).also { it.sType = 1000170000 }

inline fun Allocator.FilterCubicImageViewImageFormatProperties(block: (FilterCubicImageViewImageFormatProperties) -> Unit) = FilterCubicImageViewImageFormatProperties(calloc(24)).apply(block).also { it.sType = 1000170001 }

inline fun Allocator.DeviceQueueGlobalPriorityCreateInfo(block: (DeviceQueueGlobalPriorityCreateInfo) -> Unit) = DeviceQueueGlobalPriorityCreateInfo(calloc(24)).apply(block).also { it.sType = 1000174000 }

inline fun Allocator.ImportMemoryHostPointerInfo(block: (ImportMemoryHostPointerInfo) -> Unit) = ImportMemoryHostPointerInfo(calloc(32)).apply(block).also { it.sType = 1000178000 }

inline fun Allocator.MemoryHostPointerProperties(block: (MemoryHostPointerProperties) -> Unit) = MemoryHostPointerProperties(calloc(24)).apply(block).also { it.sType = 1000178001 }

inline fun Allocator.PhysicalDeviceExternalMemoryHostProperties(block: (PhysicalDeviceExternalMemoryHostProperties) -> Unit) = PhysicalDeviceExternalMemoryHostProperties(calloc(24)).apply(block).also { it.sType = 1000178002 }

inline fun Allocator.PhysicalDeviceShaderClockFeatures(block: (PhysicalDeviceShaderClockFeatures) -> Unit) = PhysicalDeviceShaderClockFeatures(calloc(24)).apply(block).also { it.sType = 1000181000 }

inline fun Allocator.PipelineCompilerControlCreateInfo(block: (PipelineCompilerControlCreateInfo) -> Unit) = PipelineCompilerControlCreateInfo(calloc(24)).apply(block).also { it.sType = 1000183000 }

inline fun Allocator.CalibratedTimestampInfo(block: (CalibratedTimestampInfo) -> Unit) = CalibratedTimestampInfo(calloc(24)).apply(block).also { it.sType = 1000184000 }

inline fun Allocator.CalibratedTimestampInfo(capacity: Int, block: (CalibratedTimestampInfo.Buffer) -> Unit) = CalibratedTimestampInfo.Buffer(calloc(capacity * 24), capacity).apply(block).apply { forEach { it.sType = 1000184000 } }

inline fun Allocator.PhysicalDeviceShaderCoreProperties(block: (PhysicalDeviceShaderCoreProperties) -> Unit) = PhysicalDeviceShaderCoreProperties(calloc(72)).apply(block).also { it.sType = 1000185000 }

inline fun Allocator.DeviceMemoryOverallocationCreateInfo(block: (DeviceMemoryOverallocationCreateInfo) -> Unit) = DeviceMemoryOverallocationCreateInfo(calloc(24)).apply(block).also { it.sType = 1000189000 }

inline fun Allocator.PhysicalDeviceVertexAttributeDivisorProperties(block: (PhysicalDeviceVertexAttributeDivisorProperties) -> Unit) = PhysicalDeviceVertexAttributeDivisorProperties(calloc(24)).apply(block).also { it.sType = 1000190000 }

inline fun Allocator.VertexInputBindingDivisorDescription(block: (VertexInputBindingDivisorDescription) -> Unit) = VertexInputBindingDivisorDescription(calloc(8)).apply(block)

inline fun Allocator.VertexInputBindingDivisorDescription(capacity: Int, block: (VertexInputBindingDivisorDescription.Buffer) -> Unit) = VertexInputBindingDivisorDescription.Buffer(calloc(capacity * 8), capacity).apply(block)

inline fun Allocator.PipelineVertexInputDivisorStateCreateInfo(block: (PipelineVertexInputDivisorStateCreateInfo) -> Unit) = PipelineVertexInputDivisorStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000190001 }

inline fun Allocator.PhysicalDeviceVertexAttributeDivisorFeatures(block: (PhysicalDeviceVertexAttributeDivisorFeatures) -> Unit) = PhysicalDeviceVertexAttributeDivisorFeatures(calloc(24)).apply(block).also { it.sType = 1000190002 }

inline fun Allocator.PresentFrameToken(block: (PresentFrameToken) -> Unit) = PresentFrameToken(calloc(24)).apply(block).also { it.sType = 1000191000 }

inline fun Allocator.PipelineCreationFeedbackCreateInfo(block: (PipelineCreationFeedbackCreateInfo) -> Unit) = PipelineCreationFeedbackCreateInfo(calloc(40)).apply(block).also { it.sType = 1000192000 }

inline fun Allocator.PipelineCreationFeedback(block: (PipelineCreationFeedback) -> Unit) = PipelineCreationFeedback(calloc(16)).apply(block)

inline fun Allocator.PipelineCreationFeedback(capacity: Int, block: (PipelineCreationFeedback.Buffer) -> Unit) = PipelineCreationFeedback.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.PhysicalDeviceComputeShaderDerivativesFeatures(block: (PhysicalDeviceComputeShaderDerivativesFeatures) -> Unit) = PhysicalDeviceComputeShaderDerivativesFeatures(calloc(24)).apply(block).also { it.sType = 1000201000 }

inline fun Allocator.PhysicalDeviceMeshShaderFeatures(block: (PhysicalDeviceMeshShaderFeatures) -> Unit) = PhysicalDeviceMeshShaderFeatures(calloc(24)).apply(block).also { it.sType = 1000202000 }

inline fun Allocator.PhysicalDeviceMeshShaderProperties(block: (PhysicalDeviceMeshShaderProperties) -> Unit) = PhysicalDeviceMeshShaderProperties(calloc(88)).apply(block).also { it.sType = 1000202001 }

inline fun Allocator.DrawMeshTasksIndirectCommand(block: (DrawMeshTasksIndirectCommand) -> Unit) = DrawMeshTasksIndirectCommand(calloc(8)).apply(block)

inline fun Allocator.PhysicalDeviceFragmentShaderBarycentricFeatures(block: (PhysicalDeviceFragmentShaderBarycentricFeatures) -> Unit) = PhysicalDeviceFragmentShaderBarycentricFeatures(calloc(24)).apply(block).also { it.sType = 1000203000 }

inline fun Allocator.PhysicalDeviceShaderImageFootprintFeatures(block: (PhysicalDeviceShaderImageFootprintFeatures) -> Unit) = PhysicalDeviceShaderImageFootprintFeatures(calloc(24)).apply(block).also { it.sType = 1000204000 }

inline fun Allocator.PipelineViewportExclusiveScissorStateCreateInfo(block: (PipelineViewportExclusiveScissorStateCreateInfo) -> Unit) = PipelineViewportExclusiveScissorStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000205000 }

inline fun Allocator.PhysicalDeviceExclusiveScissorFeatures(block: (PhysicalDeviceExclusiveScissorFeatures) -> Unit) = PhysicalDeviceExclusiveScissorFeatures(calloc(24)).apply(block).also { it.sType = 1000205002 }

inline fun Allocator.QueueFamilyCheckpointProperties(block: (QueueFamilyCheckpointProperties) -> Unit) = QueueFamilyCheckpointProperties(calloc(24)).apply(block).also { it.sType = 1000206001 }

inline fun Allocator.CheckpointData(block: (CheckpointData) -> Unit) = CheckpointData(calloc(32)).apply(block).also { it.sType = 1000206000 }

inline fun Allocator.CheckpointData(capacity: Int, block: (CheckpointData.Buffer) -> Unit) = CheckpointData.Buffer(calloc(capacity * 32), capacity).apply(block).apply { forEach { it.sType = 1000206000 } }

inline fun Allocator.PhysicalDeviceShaderIntegerFunctions2Features(block: (PhysicalDeviceShaderIntegerFunctions2Features) -> Unit) = PhysicalDeviceShaderIntegerFunctions2Features(calloc(24)).apply(block).also { it.sType = 1000209000 }

inline fun Allocator.PerformanceValueData(block: (PerformanceValueData) -> Unit) = PerformanceValueData(calloc(8)).apply(block)

inline fun Allocator.PerformanceValue(block: (PerformanceValue) -> Unit) = PerformanceValue(calloc(16)).apply(block)

inline fun Allocator.InitializePerformanceApiInfo(block: (InitializePerformanceApiInfo) -> Unit) = InitializePerformanceApiInfo(calloc(24)).apply(block).also { it.sType = 1000210001 }

inline fun Allocator.QueryPoolPerformanceQueryCreateInfo(block: (QueryPoolPerformanceQueryCreateInfo) -> Unit) = QueryPoolPerformanceQueryCreateInfo(calloc(24)).apply(block).also { it.sType = 1000210000 }

inline fun Allocator.PerformanceMarkerInfo(block: (PerformanceMarkerInfo) -> Unit) = PerformanceMarkerInfo(calloc(24)).apply(block).also { it.sType = 1000210002 }

inline fun Allocator.PerformanceStreamMarkerInfo(block: (PerformanceStreamMarkerInfo) -> Unit) = PerformanceStreamMarkerInfo(calloc(24)).apply(block).also { it.sType = 1000210003 }

inline fun Allocator.PerformanceOverrideInfo(block: (PerformanceOverrideInfo) -> Unit) = PerformanceOverrideInfo(calloc(32)).apply(block).also { it.sType = 1000210004 }

inline fun Allocator.PerformanceConfigurationAcquireInfo(block: (PerformanceConfigurationAcquireInfo) -> Unit) = PerformanceConfigurationAcquireInfo(calloc(24)).apply(block).also { it.sType = 1000210005 }

inline fun Allocator.PhysicalDevicePCIBusInfoProperties(block: (PhysicalDevicePCIBusInfoProperties) -> Unit) = PhysicalDevicePCIBusInfoProperties(calloc(32)).apply(block).also { it.sType = 1000212000 }

inline fun Allocator.DisplayNativeHdrSurfaceCapabilities(block: (DisplayNativeHdrSurfaceCapabilities) -> Unit) = DisplayNativeHdrSurfaceCapabilities(calloc(24)).apply(block).also { it.sType = 1000213000 }

inline fun Allocator.SwapchainDisplayNativeHdrCreateInfo(block: (SwapchainDisplayNativeHdrCreateInfo) -> Unit) = SwapchainDisplayNativeHdrCreateInfo(calloc(24)).apply(block).also { it.sType = 1000213001 }

inline fun Allocator.ImagePipeSurfaceCreateInfo(block: (ImagePipeSurfaceCreateInfo) -> Unit) = ImagePipeSurfaceCreateInfo(calloc(32)).apply(block).also { it.sType = 1000214000 }

inline fun Allocator.PhysicalDeviceShaderTerminateInvocationFeatures(block: (PhysicalDeviceShaderTerminateInvocationFeatures) -> Unit) = PhysicalDeviceShaderTerminateInvocationFeatures(calloc(24)).apply(block).also { it.sType = 1000215000 }

inline fun Allocator.MetalSurfaceCreateInfo(block: (MetalSurfaceCreateInfo) -> Unit) = MetalSurfaceCreateInfo(calloc(32)).apply(block).also { it.sType = 1000217000 }

inline fun Allocator.PhysicalDeviceFragmentDensityMapFeatures(block: (PhysicalDeviceFragmentDensityMapFeatures) -> Unit) = PhysicalDeviceFragmentDensityMapFeatures(calloc(32)).apply(block).also { it.sType = 1000218000 }

inline fun Allocator.PhysicalDeviceFragmentDensityMapProperties(block: (PhysicalDeviceFragmentDensityMapProperties) -> Unit) = PhysicalDeviceFragmentDensityMapProperties(calloc(40)).apply(block).also { it.sType = 1000218001 }

inline fun Allocator.RenderPassFragmentDensityMapCreateInfo(block: (RenderPassFragmentDensityMapCreateInfo) -> Unit) = RenderPassFragmentDensityMapCreateInfo(calloc(24)).apply(block).also { it.sType = 1000218002 }

inline fun Allocator.PhysicalDeviceSubgroupSizeControlFeatures(block: (PhysicalDeviceSubgroupSizeControlFeatures) -> Unit) = PhysicalDeviceSubgroupSizeControlFeatures(calloc(24)).apply(block).also { it.sType = 1000225002 }

inline fun Allocator.PhysicalDeviceSubgroupSizeControlProperties(block: (PhysicalDeviceSubgroupSizeControlProperties) -> Unit) = PhysicalDeviceSubgroupSizeControlProperties(calloc(32)).apply(block).also { it.sType = 1000225000 }

inline fun Allocator.PipelineShaderStageRequiredSubgroupSizeCreateInfo(block: (PipelineShaderStageRequiredSubgroupSizeCreateInfo) -> Unit) = PipelineShaderStageRequiredSubgroupSizeCreateInfo(calloc(24)).apply(block).also { it.sType = 1000225001 }

inline fun Allocator.FragmentShadingRateAttachmentInfo(block: (FragmentShadingRateAttachmentInfo) -> Unit) = FragmentShadingRateAttachmentInfo(calloc(32)).apply(block).also { it.sType = 1000226000 }

inline fun Allocator.PipelineFragmentShadingRateStateCreateInfo(block: (PipelineFragmentShadingRateStateCreateInfo) -> Unit) = PipelineFragmentShadingRateStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000226001 }

inline fun Allocator.PhysicalDeviceFragmentShadingRateFeatures(block: (PhysicalDeviceFragmentShadingRateFeatures) -> Unit) = PhysicalDeviceFragmentShadingRateFeatures(calloc(32)).apply(block).also { it.sType = 1000226003 }

inline fun Allocator.PhysicalDeviceFragmentShadingRateProperties(block: (PhysicalDeviceFragmentShadingRateProperties) -> Unit) = PhysicalDeviceFragmentShadingRateProperties(calloc(96)).apply(block).also { it.sType = 1000226002 }

inline fun Allocator.PhysicalDeviceFragmentShadingRate(block: (PhysicalDeviceFragmentShadingRate) -> Unit) = PhysicalDeviceFragmentShadingRate(calloc(32)).apply(block).also { it.sType = 1000226004 }

inline fun Allocator.PhysicalDeviceFragmentShadingRate(capacity: Int, block: (PhysicalDeviceFragmentShadingRate.Buffer) -> Unit) = PhysicalDeviceFragmentShadingRate.Buffer(calloc(capacity * 32), capacity).apply(block).apply { forEach { it.sType = 1000226004 } }

inline fun Allocator.PhysicalDeviceShaderCoreProperties2(block: (PhysicalDeviceShaderCoreProperties2) -> Unit) = PhysicalDeviceShaderCoreProperties2(calloc(24)).apply(block).also { it.sType = 1000227000 }

inline fun Allocator.PhysicalDeviceCoherentMemoryFeatures(block: (PhysicalDeviceCoherentMemoryFeatures) -> Unit) = PhysicalDeviceCoherentMemoryFeatures(calloc(24)).apply(block).also { it.sType = 1000229000 }

inline fun Allocator.PhysicalDeviceShaderImageAtomicInt64Features(block: (PhysicalDeviceShaderImageAtomicInt64Features) -> Unit) = PhysicalDeviceShaderImageAtomicInt64Features(calloc(24)).apply(block).also { it.sType = 1000234000 }

inline fun Allocator.PhysicalDeviceMemoryBudgetProperties(block: (PhysicalDeviceMemoryBudgetProperties) -> Unit) = PhysicalDeviceMemoryBudgetProperties(calloc(272)).apply(block).also { it.sType = 1000237000 }

inline fun Allocator.PhysicalDeviceMemoryPriorityFeatures(block: (PhysicalDeviceMemoryPriorityFeatures) -> Unit) = PhysicalDeviceMemoryPriorityFeatures(calloc(24)).apply(block).also { it.sType = 1000238000 }

inline fun Allocator.MemoryPriorityAllocateInfo(block: (MemoryPriorityAllocateInfo) -> Unit) = MemoryPriorityAllocateInfo(calloc(24)).apply(block).also { it.sType = 1000238001 }

inline fun Allocator.SurfaceProtectedCapabilities(block: (SurfaceProtectedCapabilities) -> Unit) = SurfaceProtectedCapabilities(calloc(24)).apply(block).also { it.sType = 1000239000 }

inline fun Allocator.PhysicalDeviceDedicatedAllocationImageAliasingFeatures(block: (PhysicalDeviceDedicatedAllocationImageAliasingFeatures) -> Unit) = PhysicalDeviceDedicatedAllocationImageAliasingFeatures(calloc(24)).apply(block).also { it.sType = 1000240000 }

inline fun Allocator.PhysicalDeviceToolProperties(block: (PhysicalDeviceToolProperties) -> Unit) = PhysicalDeviceToolProperties(calloc(1048)).apply(block).also { it.sType = 1000245000 }

inline fun Allocator.PhysicalDeviceToolProperties(capacity: Int, block: (PhysicalDeviceToolProperties.Buffer) -> Unit) = PhysicalDeviceToolProperties.Buffer(calloc(capacity * 1048), capacity).apply(block).apply { forEach { it.sType = 1000245000 } }

inline fun Allocator.ValidationFeatures(block: (ValidationFeatures) -> Unit) = ValidationFeatures(calloc(48)).apply(block).also { it.sType = 1000247000 }

inline fun Allocator.CooperativeMatrixProperties(block: (CooperativeMatrixProperties) -> Unit) = CooperativeMatrixProperties(calloc(48)).apply(block).also { it.sType = 1000249001 }

inline fun Allocator.CooperativeMatrixProperties(capacity: Int, block: (CooperativeMatrixProperties.Buffer) -> Unit) = CooperativeMatrixProperties.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000249001 } }

inline fun Allocator.PhysicalDeviceCooperativeMatrixFeatures(block: (PhysicalDeviceCooperativeMatrixFeatures) -> Unit) = PhysicalDeviceCooperativeMatrixFeatures(calloc(24)).apply(block).also { it.sType = 1000249000 }

inline fun Allocator.PhysicalDeviceCooperativeMatrixProperties(block: (PhysicalDeviceCooperativeMatrixProperties) -> Unit) = PhysicalDeviceCooperativeMatrixProperties(calloc(24)).apply(block).also { it.sType = 1000249002 }

inline fun Allocator.PhysicalDeviceCoverageReductionModeFeatures(block: (PhysicalDeviceCoverageReductionModeFeatures) -> Unit) = PhysicalDeviceCoverageReductionModeFeatures(calloc(24)).apply(block).also { it.sType = 1000250000 }

inline fun Allocator.PipelineCoverageReductionStateCreateInfo(block: (PipelineCoverageReductionStateCreateInfo) -> Unit) = PipelineCoverageReductionStateCreateInfo(calloc(24)).apply(block).also { it.sType = 1000250001 }

inline fun Allocator.FramebufferMixedSamplesCombination(block: (FramebufferMixedSamplesCombination) -> Unit) = FramebufferMixedSamplesCombination(calloc(32)).apply(block).also { it.sType = 1000250002 }

inline fun Allocator.FramebufferMixedSamplesCombination(capacity: Int, block: (FramebufferMixedSamplesCombination.Buffer) -> Unit) = FramebufferMixedSamplesCombination.Buffer(calloc(capacity * 32), capacity).apply(block).apply { forEach { it.sType = 1000250002 } }

inline fun Allocator.PhysicalDeviceFragmentShaderInterlockFeatures(block: (PhysicalDeviceFragmentShaderInterlockFeatures) -> Unit) = PhysicalDeviceFragmentShaderInterlockFeatures(calloc(32)).apply(block).also { it.sType = 1000251000 }

inline fun Allocator.PhysicalDeviceYcbcrImageArraysFeatures(block: (PhysicalDeviceYcbcrImageArraysFeatures) -> Unit) = PhysicalDeviceYcbcrImageArraysFeatures(calloc(24)).apply(block).also { it.sType = 1000252000 }

inline fun Allocator.SurfaceFullScreenExclusiveInfo(block: (SurfaceFullScreenExclusiveInfo) -> Unit) = SurfaceFullScreenExclusiveInfo(calloc(24)).apply(block).also { it.sType = 1000255000 }

inline fun Allocator.SurfaceCapabilitiesFullScreenExclusive(block: (SurfaceCapabilitiesFullScreenExclusive) -> Unit) = SurfaceCapabilitiesFullScreenExclusive(calloc(24)).apply(block).also { it.sType = 1000255002 }

inline fun Allocator.SurfaceFullScreenExclusiveWin32Info(block: (SurfaceFullScreenExclusiveWin32Info) -> Unit) = SurfaceFullScreenExclusiveWin32Info(calloc(24)).apply(block).also { it.sType = 1000255001 }

inline fun Allocator.HeadlessSurfaceCreateInfo(block: (HeadlessSurfaceCreateInfo) -> Unit) = HeadlessSurfaceCreateInfo(calloc(24)).apply(block).also { it.sType = 1000256000 }

inline fun Allocator.PhysicalDeviceLineRasterizationFeatures(block: (PhysicalDeviceLineRasterizationFeatures) -> Unit) = PhysicalDeviceLineRasterizationFeatures(calloc(40)).apply(block).also { it.sType = 1000259000 }

inline fun Allocator.PhysicalDeviceLineRasterizationProperties(block: (PhysicalDeviceLineRasterizationProperties) -> Unit) = PhysicalDeviceLineRasterizationProperties(calloc(24)).apply(block).also { it.sType = 1000259002 }

inline fun Allocator.PipelineRasterizationLineStateCreateInfo(block: (PipelineRasterizationLineStateCreateInfo) -> Unit) = PipelineRasterizationLineStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000259001 }

inline fun Allocator.PhysicalDeviceShaderAtomicFloatFeatures(block: (PhysicalDeviceShaderAtomicFloatFeatures) -> Unit) = PhysicalDeviceShaderAtomicFloatFeatures(calloc(64)).apply(block).also { it.sType = 1000260000 }

inline fun Allocator.PhysicalDeviceIndexTypeUint8Features(block: (PhysicalDeviceIndexTypeUint8Features) -> Unit) = PhysicalDeviceIndexTypeUint8Features(calloc(24)).apply(block).also { it.sType = 1000265000 }

inline fun Allocator.PhysicalDeviceExtendedDynamicStateFeatures(block: (PhysicalDeviceExtendedDynamicStateFeatures) -> Unit) = PhysicalDeviceExtendedDynamicStateFeatures(calloc(24)).apply(block).also { it.sType = 1000267000 }

inline fun Allocator.PhysicalDevicePipelineExecutablePropertiesFeatures(block: (PhysicalDevicePipelineExecutablePropertiesFeatures) -> Unit) = PhysicalDevicePipelineExecutablePropertiesFeatures(calloc(24)).apply(block).also { it.sType = 1000269000 }

inline fun Allocator.PipelineInfo(block: (PipelineInfo) -> Unit) = PipelineInfo(calloc(24)).apply(block).also { it.sType = 1000269001 }

inline fun Allocator.PipelineExecutableProperties(block: (PipelineExecutableProperties) -> Unit) = PipelineExecutableProperties(calloc(536)).apply(block).also { it.sType = 1000269002 }

inline fun Allocator.PipelineExecutableProperties(capacity: Int, block: (PipelineExecutableProperties.Buffer) -> Unit) = PipelineExecutableProperties.Buffer(calloc(capacity * 536), capacity).apply(block).apply { forEach { it.sType = 1000269002 } }

inline fun Allocator.PipelineExecutableInfo(block: (PipelineExecutableInfo) -> Unit) = PipelineExecutableInfo(calloc(32)).apply(block).also { it.sType = 1000269003 }

inline fun Allocator.PipelineExecutableStatisticValue(block: (PipelineExecutableStatisticValue) -> Unit) = PipelineExecutableStatisticValue(calloc(8)).apply(block)

inline fun Allocator.PipelineExecutableStatistic(block: (PipelineExecutableStatistic) -> Unit) = PipelineExecutableStatistic(calloc(544)).apply(block).also { it.sType = 1000269004 }

inline fun Allocator.PipelineExecutableStatistic(capacity: Int, block: (PipelineExecutableStatistic.Buffer) -> Unit) = PipelineExecutableStatistic.Buffer(calloc(capacity * 544), capacity).apply(block).apply { forEach { it.sType = 1000269004 } }

inline fun Allocator.PipelineExecutableInternalRepresentation(block: (PipelineExecutableInternalRepresentation) -> Unit) = PipelineExecutableInternalRepresentation(calloc(552)).apply(block).also { it.sType = 1000269005 }

inline fun Allocator.PipelineExecutableInternalRepresentation(capacity: Int, block: (PipelineExecutableInternalRepresentation.Buffer) -> Unit) = PipelineExecutableInternalRepresentation.Buffer(calloc(capacity * 552), capacity).apply(block).apply { forEach { it.sType = 1000269005 } }

inline fun Allocator.PhysicalDeviceShaderDemoteToHelperInvocationFeatures(block: (PhysicalDeviceShaderDemoteToHelperInvocationFeatures) -> Unit) = PhysicalDeviceShaderDemoteToHelperInvocationFeatures(calloc(24)).apply(block).also { it.sType = 1000276000 }

inline fun Allocator.PhysicalDeviceDeviceGeneratedCommandsProperties(block: (PhysicalDeviceDeviceGeneratedCommandsProperties) -> Unit) = PhysicalDeviceDeviceGeneratedCommandsProperties(calloc(56)).apply(block).also { it.sType = 1000277000 }

inline fun Allocator.PhysicalDeviceDeviceGeneratedCommandsFeatures(block: (PhysicalDeviceDeviceGeneratedCommandsFeatures) -> Unit) = PhysicalDeviceDeviceGeneratedCommandsFeatures(calloc(24)).apply(block).also { it.sType = 1000277007 }

inline fun Allocator.GraphicsShaderGroupCreateInfo(block: (GraphicsShaderGroupCreateInfo) -> Unit) = GraphicsShaderGroupCreateInfo(calloc(48)).apply(block).also { it.sType = 1000277001 }

inline fun Allocator.GraphicsShaderGroupCreateInfo(capacity: Int, block: (GraphicsShaderGroupCreateInfo.Buffer) -> Unit) = GraphicsShaderGroupCreateInfo.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000277001 } }

inline fun Allocator.GraphicsPipelineShaderGroupsCreateInfo(block: (GraphicsPipelineShaderGroupsCreateInfo) -> Unit) = GraphicsPipelineShaderGroupsCreateInfo(calloc(48)).apply(block).also { it.sType = 1000277002 }

inline fun Allocator.BindShaderGroupIndirectCommand(block: (BindShaderGroupIndirectCommand) -> Unit) = BindShaderGroupIndirectCommand(calloc(4)).apply(block)

inline fun Allocator.BindIndexBufferIndirectCommand(block: (BindIndexBufferIndirectCommand) -> Unit) = BindIndexBufferIndirectCommand(calloc(16)).apply(block)

inline fun Allocator.BindVertexBufferIndirectCommand(block: (BindVertexBufferIndirectCommand) -> Unit) = BindVertexBufferIndirectCommand(calloc(16)).apply(block)

inline fun Allocator.SetStateFlagsIndirectCommand(block: (SetStateFlagsIndirectCommand) -> Unit) = SetStateFlagsIndirectCommand(calloc(4)).apply(block)

inline fun Allocator.IndirectCommandsStream(block: (IndirectCommandsStream) -> Unit) = IndirectCommandsStream(calloc(16)).apply(block)

inline fun Allocator.IndirectCommandsStream(capacity: Int, block: (IndirectCommandsStream.Buffer) -> Unit) = IndirectCommandsStream.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.IndirectCommandsLayoutToken(block: (IndirectCommandsLayoutToken) -> Unit) = IndirectCommandsLayoutToken(calloc(88)).apply(block).also { it.sType = 1000277003 }

inline fun Allocator.IndirectCommandsLayoutToken(capacity: Int, block: (IndirectCommandsLayoutToken.Buffer) -> Unit) = IndirectCommandsLayoutToken.Buffer(calloc(capacity * 88), capacity).apply(block).apply { forEach { it.sType = 1000277003 } }

inline fun Allocator.IndirectCommandsLayoutCreateInfo(block: (IndirectCommandsLayoutCreateInfo) -> Unit) = IndirectCommandsLayoutCreateInfo(calloc(56)).apply(block).also { it.sType = 1000277004 }

inline fun Allocator.GeneratedCommandsInfo(block: (GeneratedCommandsInfo) -> Unit) = GeneratedCommandsInfo(calloc(120)).apply(block).also { it.sType = 1000277005 }

inline fun Allocator.GeneratedCommandsMemoryRequirementsInfo(block: (GeneratedCommandsMemoryRequirementsInfo) -> Unit) = GeneratedCommandsMemoryRequirementsInfo(calloc(48)).apply(block).also { it.sType = 1000277006 }

inline fun Allocator.PhysicalDeviceTexelBufferAlignmentFeatures(block: (PhysicalDeviceTexelBufferAlignmentFeatures) -> Unit) = PhysicalDeviceTexelBufferAlignmentFeatures(calloc(24)).apply(block).also { it.sType = 1000281000 }

inline fun Allocator.PhysicalDeviceTexelBufferAlignmentProperties(block: (PhysicalDeviceTexelBufferAlignmentProperties) -> Unit) = PhysicalDeviceTexelBufferAlignmentProperties(calloc(48)).apply(block).also { it.sType = 1000281001 }

inline fun Allocator.RenderPassTransformBeginInfo(block: (RenderPassTransformBeginInfo) -> Unit) = RenderPassTransformBeginInfo(calloc(24)).apply(block).also { it.sType = 1000282001 }

inline fun Allocator.CommandBufferInheritanceRenderPassTransformInfo(block: (CommandBufferInheritanceRenderPassTransformInfo) -> Unit) = CommandBufferInheritanceRenderPassTransformInfo(calloc(40)).apply(block).also { it.sType = 1000282000 }

inline fun Allocator.PhysicalDeviceDeviceMemoryReportFeatures(block: (PhysicalDeviceDeviceMemoryReportFeatures) -> Unit) = PhysicalDeviceDeviceMemoryReportFeatures(calloc(24)).apply(block).also { it.sType = 1000284000 }

inline fun Allocator.DeviceDeviceMemoryReportCreateInfo(block: (DeviceDeviceMemoryReportCreateInfo) -> Unit) = DeviceDeviceMemoryReportCreateInfo(calloc(40)).apply(block).also { it.sType = 1000284001 }

inline fun Allocator.DeviceMemoryReportCallbackData(block: (DeviceMemoryReportCallbackData) -> Unit) = DeviceMemoryReportCallbackData(calloc(64)).apply(block).also { it.sType = 1000284002 }

inline fun Allocator.PhysicalDeviceRobustness2Features(block: (PhysicalDeviceRobustness2Features) -> Unit) = PhysicalDeviceRobustness2Features(calloc(32)).apply(block).also { it.sType = 1000286000 }

inline fun Allocator.PhysicalDeviceRobustness2Properties(block: (PhysicalDeviceRobustness2Properties) -> Unit) = PhysicalDeviceRobustness2Properties(calloc(32)).apply(block).also { it.sType = 1000286001 }

inline fun Allocator.SamplerCustomBorderColorCreateInfo(block: (SamplerCustomBorderColorCreateInfo) -> Unit) = SamplerCustomBorderColorCreateInfo(calloc(40)).apply(block).also { it.sType = 1000287000 }

inline fun Allocator.PhysicalDeviceCustomBorderColorProperties(block: (PhysicalDeviceCustomBorderColorProperties) -> Unit) = PhysicalDeviceCustomBorderColorProperties(calloc(24)).apply(block).also { it.sType = 1000287001 }

inline fun Allocator.PhysicalDeviceCustomBorderColorFeatures(block: (PhysicalDeviceCustomBorderColorFeatures) -> Unit) = PhysicalDeviceCustomBorderColorFeatures(calloc(24)).apply(block).also { it.sType = 1000287002 }

inline fun Allocator.PipelineLibraryCreateInfo(block: (PipelineLibraryCreateInfo) -> Unit) = PipelineLibraryCreateInfo(calloc(32)).apply(block).also { it.sType = 1000290000 }

inline fun Allocator.PhysicalDevicePrivateDataFeatures(block: (PhysicalDevicePrivateDataFeatures) -> Unit) = PhysicalDevicePrivateDataFeatures(calloc(24)).apply(block).also { it.sType = 1000295000 }

inline fun Allocator.DevicePrivateDataCreateInfo(block: (DevicePrivateDataCreateInfo) -> Unit) = DevicePrivateDataCreateInfo(calloc(24)).apply(block).also { it.sType = 1000295001 }

inline fun Allocator.PrivateDataSlotCreateInfo(block: (PrivateDataSlotCreateInfo) -> Unit) = PrivateDataSlotCreateInfo(calloc(24)).apply(block).also { it.sType = 1000295002 }

inline fun Allocator.PhysicalDevicePipelineCreationCacheControlFeatures(block: (PhysicalDevicePipelineCreationCacheControlFeatures) -> Unit) = PhysicalDevicePipelineCreationCacheControlFeatures(calloc(24)).apply(block).also { it.sType = 1000297000 }

inline fun Allocator.PhysicalDeviceDiagnosticsConfigFeatures(block: (PhysicalDeviceDiagnosticsConfigFeatures) -> Unit) = PhysicalDeviceDiagnosticsConfigFeatures(calloc(24)).apply(block).also { it.sType = 1000300000 }

inline fun Allocator.DeviceDiagnosticsConfigCreateInfo(block: (DeviceDiagnosticsConfigCreateInfo) -> Unit) = DeviceDiagnosticsConfigCreateInfo(calloc(24)).apply(block).also { it.sType = 1000300001 }

inline fun Allocator.MemoryBarrier2(block: (MemoryBarrier2) -> Unit) = MemoryBarrier2(calloc(48)).apply(block).also { it.sType = 1000314000 }

inline fun Allocator.MemoryBarrier2(capacity: Int, block: (MemoryBarrier2.Buffer) -> Unit) = MemoryBarrier2.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000314000 } }

inline fun Allocator.BufferMemoryBarrier2(block: (BufferMemoryBarrier2) -> Unit) = BufferMemoryBarrier2(calloc(80)).apply(block).also { it.sType = 1000314001 }

inline fun Allocator.BufferMemoryBarrier2(capacity: Int, block: (BufferMemoryBarrier2.Buffer) -> Unit) = BufferMemoryBarrier2.Buffer(calloc(capacity * 80), capacity).apply(block).apply { forEach { it.sType = 1000314001 } }

inline fun Allocator.ImageMemoryBarrier2(block: (ImageMemoryBarrier2) -> Unit) = ImageMemoryBarrier2(calloc(96)).apply(block).also { it.sType = 1000314002 }

inline fun Allocator.ImageMemoryBarrier2(capacity: Int, block: (ImageMemoryBarrier2.Buffer) -> Unit) = ImageMemoryBarrier2.Buffer(calloc(capacity * 96), capacity).apply(block).apply { forEach { it.sType = 1000314002 } }

inline fun Allocator.DependencyInfo(block: (DependencyInfo) -> Unit) = DependencyInfo(calloc(64)).apply(block).also { it.sType = 1000314003 }

inline fun Allocator.DependencyInfo(capacity: Int, block: (DependencyInfo.Buffer) -> Unit) = DependencyInfo.Buffer(calloc(capacity * 64), capacity).apply(block).apply { forEach { it.sType = 1000314003 } }

inline fun Allocator.SubmitInfo2(block: (SubmitInfo2) -> Unit) = SubmitInfo2(calloc(64)).apply(block).also { it.sType = 1000314004 }

inline fun Allocator.SubmitInfo2(capacity: Int, block: (SubmitInfo2.Buffer) -> Unit) = SubmitInfo2.Buffer(calloc(capacity * 64), capacity).apply(block).apply { forEach { it.sType = 1000314004 } }

inline fun Allocator.SemaphoreSubmitInfo(block: (SemaphoreSubmitInfo) -> Unit) = SemaphoreSubmitInfo(calloc(48)).apply(block).also { it.sType = 1000314005 }

inline fun Allocator.SemaphoreSubmitInfo(capacity: Int, block: (SemaphoreSubmitInfo.Buffer) -> Unit) = SemaphoreSubmitInfo.Buffer(calloc(capacity * 48), capacity).apply(block).apply { forEach { it.sType = 1000314005 } }

inline fun Allocator.CommandBufferSubmitInfo(block: (CommandBufferSubmitInfo) -> Unit) = CommandBufferSubmitInfo(calloc(32)).apply(block).also { it.sType = 1000314006 }

inline fun Allocator.CommandBufferSubmitInfo(capacity: Int, block: (CommandBufferSubmitInfo.Buffer) -> Unit) = CommandBufferSubmitInfo.Buffer(calloc(capacity * 32), capacity).apply(block).apply { forEach { it.sType = 1000314006 } }

inline fun Allocator.PhysicalDeviceSynchronization2Features(block: (PhysicalDeviceSynchronization2Features) -> Unit) = PhysicalDeviceSynchronization2Features(calloc(24)).apply(block).also { it.sType = 1000314007 }

inline fun Allocator.QueueFamilyCheckpointProperties2(block: (QueueFamilyCheckpointProperties2) -> Unit) = QueueFamilyCheckpointProperties2(calloc(24)).apply(block).also { it.sType = 1000314008 }

inline fun Allocator.CheckpointData2(block: (CheckpointData2) -> Unit) = CheckpointData2(calloc(32)).apply(block).also { it.sType = 1000314009 }

inline fun Allocator.CheckpointData2(capacity: Int, block: (CheckpointData2.Buffer) -> Unit) = CheckpointData2.Buffer(calloc(capacity * 32), capacity).apply(block).apply { forEach { it.sType = 1000314009 } }

inline fun Allocator.PhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(block: (PhysicalDeviceZeroInitializeWorkgroupMemoryFeatures) -> Unit) = PhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(calloc(24)).apply(block).also { it.sType = 1000325000 }

inline fun Allocator.PhysicalDeviceFragmentShadingRateEnumsFeatures(block: (PhysicalDeviceFragmentShadingRateEnumsFeatures) -> Unit) = PhysicalDeviceFragmentShadingRateEnumsFeatures(calloc(32)).apply(block).also { it.sType = 1000326001 }

inline fun Allocator.PhysicalDeviceFragmentShadingRateEnumsProperties(block: (PhysicalDeviceFragmentShadingRateEnumsProperties) -> Unit) = PhysicalDeviceFragmentShadingRateEnumsProperties(calloc(24)).apply(block).also { it.sType = 1000326000 }

inline fun Allocator.PipelineFragmentShadingRateEnumStateCreateInfo(block: (PipelineFragmentShadingRateEnumStateCreateInfo) -> Unit) = PipelineFragmentShadingRateEnumStateCreateInfo(calloc(32)).apply(block).also { it.sType = 1000326002 }

inline fun Allocator.PhysicalDeviceFragmentDensityMap2Features(block: (PhysicalDeviceFragmentDensityMap2Features) -> Unit) = PhysicalDeviceFragmentDensityMap2Features(calloc(24)).apply(block).also { it.sType = 1000332000 }

inline fun Allocator.PhysicalDeviceFragmentDensityMap2Properties(block: (PhysicalDeviceFragmentDensityMap2Properties) -> Unit) = PhysicalDeviceFragmentDensityMap2Properties(calloc(32)).apply(block).also { it.sType = 1000332001 }

inline fun Allocator.CopyCommandTransformInfo(block: (CopyCommandTransformInfo) -> Unit) = CopyCommandTransformInfo(calloc(24)).apply(block).also { it.sType = 1000333000 }

inline fun Allocator.PhysicalDeviceImageRobustnessFeatures(block: (PhysicalDeviceImageRobustnessFeatures) -> Unit) = PhysicalDeviceImageRobustnessFeatures(calloc(24)).apply(block).also { it.sType = 1000335000 }

inline fun Allocator.PhysicalDeviceWorkgroupMemoryExplicitLayoutFeatures(block: (PhysicalDeviceWorkgroupMemoryExplicitLayoutFeatures) -> Unit) = PhysicalDeviceWorkgroupMemoryExplicitLayoutFeatures(calloc(32)).apply(block).also { it.sType = 1000336000 }

inline fun Allocator.CopyBufferInfo2(block: (CopyBufferInfo2) -> Unit) = CopyBufferInfo2(calloc(48)).apply(block).also { it.sType = 1000337000 }

inline fun Allocator.CopyImageInfo2(block: (CopyImageInfo2) -> Unit) = CopyImageInfo2(calloc(56)).apply(block).also { it.sType = 1000337001 }

inline fun Allocator.CopyBufferToImageInfo2(block: (CopyBufferToImageInfo2) -> Unit) = CopyBufferToImageInfo2(calloc(48)).apply(block).also { it.sType = 1000337002 }

inline fun Allocator.CopyImageToBufferInfo2(block: (CopyImageToBufferInfo2) -> Unit) = CopyImageToBufferInfo2(calloc(56)).apply(block).also { it.sType = 1000337003 }

inline fun Allocator.BlitImageInfo2(block: (BlitImageInfo2) -> Unit) = BlitImageInfo2(calloc(64)).apply(block).also { it.sType = 1000337004 }

inline fun Allocator.ResolveImageInfo2(block: (ResolveImageInfo2) -> Unit) = ResolveImageInfo2(calloc(56)).apply(block).also { it.sType = 1000337005 }

inline fun Allocator.BufferCopy2(block: (BufferCopy2) -> Unit) = BufferCopy2(calloc(40)).apply(block).also { it.sType = 1000337006 }

inline fun Allocator.BufferCopy2(capacity: Int, block: (BufferCopy2.Buffer) -> Unit) = BufferCopy2.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000337006 } }

inline fun Allocator.ImageCopy2(block: (ImageCopy2) -> Unit) = ImageCopy2(calloc(88)).apply(block).also { it.sType = 1000337007 }

inline fun Allocator.ImageCopy2(capacity: Int, block: (ImageCopy2.Buffer) -> Unit) = ImageCopy2.Buffer(calloc(capacity * 88), capacity).apply(block).apply { forEach { it.sType = 1000337007 } }

inline fun Allocator.ImageBlit2(block: (ImageBlit2) -> Unit) = ImageBlit2(calloc(96)).apply(block).also { it.sType = 1000337008 }

inline fun Allocator.ImageBlit2(capacity: Int, block: (ImageBlit2.Buffer) -> Unit) = ImageBlit2.Buffer(calloc(capacity * 96), capacity).apply(block).apply { forEach { it.sType = 1000337008 } }

inline fun Allocator.BufferImageCopy2(block: (BufferImageCopy2) -> Unit) = BufferImageCopy2(calloc(72)).apply(block).also { it.sType = 1000337009 }

inline fun Allocator.BufferImageCopy2(capacity: Int, block: (BufferImageCopy2.Buffer) -> Unit) = BufferImageCopy2.Buffer(calloc(capacity * 72), capacity).apply(block).apply { forEach { it.sType = 1000337009 } }

inline fun Allocator.ImageResolve2(block: (ImageResolve2) -> Unit) = ImageResolve2(calloc(88)).apply(block).also { it.sType = 1000337010 }

inline fun Allocator.ImageResolve2(capacity: Int, block: (ImageResolve2.Buffer) -> Unit) = ImageResolve2.Buffer(calloc(capacity * 88), capacity).apply(block).apply { forEach { it.sType = 1000337010 } }

inline fun Allocator.PhysicalDevice4444FormatsFeatures(block: (PhysicalDevice4444FormatsFeatures) -> Unit) = PhysicalDevice4444FormatsFeatures(calloc(24)).apply(block).also { it.sType = 1000340000 }

inline fun Allocator.DirectFBSurfaceCreateInfo(block: (DirectFBSurfaceCreateInfo) -> Unit) = DirectFBSurfaceCreateInfo(calloc(40)).apply(block).also { it.sType = 1000346000 }

inline fun Allocator.PhysicalDeviceMutableDescriptorTypeFeatures(block: (PhysicalDeviceMutableDescriptorTypeFeatures) -> Unit) = PhysicalDeviceMutableDescriptorTypeFeatures(calloc(24)).apply(block).also { it.sType = 1000351000 }

inline fun Allocator.MutableDescriptorTypeList(block: (MutableDescriptorTypeList) -> Unit) = MutableDescriptorTypeList(calloc(16)).apply(block)

inline fun Allocator.MutableDescriptorTypeList(capacity: Int, block: (MutableDescriptorTypeList.Buffer) -> Unit) = MutableDescriptorTypeList.Buffer(calloc(capacity * 16), capacity).apply(block)

inline fun Allocator.MutableDescriptorTypeCreateInfo(block: (MutableDescriptorTypeCreateInfo) -> Unit) = MutableDescriptorTypeCreateInfo(calloc(32)).apply(block).also { it.sType = 1000351002 }

inline fun Allocator.ImportMemoryZirconHandleInfo(block: (ImportMemoryZirconHandleInfo) -> Unit) = ImportMemoryZirconHandleInfo(calloc(32)).apply(block).also { it.sType = 1000364000 }

inline fun Allocator.MemoryZirconHandleProperties(block: (MemoryZirconHandleProperties) -> Unit) = MemoryZirconHandleProperties(calloc(24)).apply(block).also { it.sType = 1000364001 }

inline fun Allocator.MemoryGetZirconHandleInfo(block: (MemoryGetZirconHandleInfo) -> Unit) = MemoryGetZirconHandleInfo(calloc(32)).apply(block).also { it.sType = 1000364002 }

inline fun Allocator.ImportSemaphoreZirconHandleInfo(block: (ImportSemaphoreZirconHandleInfo) -> Unit) = ImportSemaphoreZirconHandleInfo(calloc(40)).apply(block).also { it.sType = 1000365000 }

inline fun Allocator.SemaphoreGetZirconHandleInfo(block: (SemaphoreGetZirconHandleInfo) -> Unit) = SemaphoreGetZirconHandleInfo(calloc(32)).apply(block).also { it.sType = 1000365001 }

inline fun Allocator.ScreenSurfaceCreateInfoQ(block: (ScreenSurfaceCreateInfoQ) -> Unit) = ScreenSurfaceCreateInfoQ(calloc(40)).apply(block).also { it.sType = 1000378000 }