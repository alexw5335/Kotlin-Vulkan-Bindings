// This file has been automatically generated.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.Allocator

inline fun Allocator.Extent2D(block: (Extent2D) -> Unit) = Extent2D(calloc(8)).apply(block)

inline fun Allocator.Extent3D(block: (Extent3D) -> Unit) = Extent3D(calloc(12)).apply(block)

inline fun Allocator.Offset2D(block: (Offset2D) -> Unit) = Offset2D(calloc(8)).apply(block)

inline fun Allocator.Offset2D(capacity: Int, block: (Offset2D.Buffer) -> Unit) = Offset2D.Buffer(calloc(capacity * 8), capacity).apply(block)

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

inline fun Allocator.PipelineCacheHeaderVersionOne(block: (PipelineCacheHeaderVersionOne) -> Unit) = PipelineCacheHeaderVersionOne(calloc(32)).apply(block)

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

inline fun Allocator.Win32SurfaceCreateInfo(block: (Win32SurfaceCreateInfo) -> Unit) = Win32SurfaceCreateInfo(calloc(40)).apply(block).also { it.sType = 1000009000 }

inline fun Allocator.DebugUtilsLabel(block: (DebugUtilsLabel) -> Unit) = DebugUtilsLabel(calloc(40)).apply(block).also { it.sType = 1000128002 }

inline fun Allocator.DebugUtilsLabel(capacity: Int, block: (DebugUtilsLabel.Buffer) -> Unit) = DebugUtilsLabel.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000128002 } }

inline fun Allocator.DebugUtilsMessengerCallbackData(block: (DebugUtilsMessengerCallbackData) -> Unit) = DebugUtilsMessengerCallbackData(calloc(96)).apply(block).also { it.sType = 1000128003 }

inline fun Allocator.DebugUtilsMessengerCreateInfo(block: (DebugUtilsMessengerCreateInfo) -> Unit) = DebugUtilsMessengerCreateInfo(calloc(48)).apply(block).also { it.sType = 1000128004 }

inline fun Allocator.DebugUtilsObjectNameInfo(block: (DebugUtilsObjectNameInfo) -> Unit) = DebugUtilsObjectNameInfo(calloc(40)).apply(block).also { it.sType = 1000128000 }

inline fun Allocator.DebugUtilsObjectNameInfo(capacity: Int, block: (DebugUtilsObjectNameInfo.Buffer) -> Unit) = DebugUtilsObjectNameInfo.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000128000 } }

inline fun Allocator.DebugUtilsObjectTagInfo(block: (DebugUtilsObjectTagInfo) -> Unit) = DebugUtilsObjectTagInfo(calloc(56)).apply(block).also { it.sType = 1000128001 }