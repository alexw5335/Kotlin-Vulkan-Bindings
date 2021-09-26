// This file has been automatically generated.

@file:Suppress("unused", "FunctionName")

package vulkan.generated.allocation

import memory.allocation.Allocator
import vulkan.generated.struct.*

inline fun Allocator.BaseOutStructure(block: (BaseOutStructure) -> Unit) = BaseOutStructure.calloc(this).also(block)

inline fun Allocator.BaseInStructure(block: (BaseInStructure) -> Unit) = BaseInStructure.calloc(this).also(block)

inline fun Allocator.Offset2D(block: (Offset2D) -> Unit) = Offset2D.calloc(this).also(block)

inline fun Allocator.Offset3D(block: (Offset3D) -> Unit) = Offset3D.calloc(this).also(block)

inline fun Allocator.Offset3D(capacity: Int, block: (Offset3D.Buffer) -> Unit) = Offset3D.calloc(this, capacity).also(block)

inline fun Allocator.Extent2D(block: (Extent2D) -> Unit) = Extent2D.calloc(this).also(block)

inline fun Allocator.Extent3D(block: (Extent3D) -> Unit) = Extent3D.calloc(this).also(block)

inline fun Allocator.Viewport(block: (Viewport) -> Unit) = Viewport.calloc(this).also(block)

inline fun Allocator.Viewport(capacity: Int, block: (Viewport.Buffer) -> Unit) = Viewport.calloc(this, capacity).also(block)

inline fun Allocator.Rect2D(block: (Rect2D) -> Unit) = Rect2D.calloc(this).also(block)

inline fun Allocator.Rect2D(capacity: Int, block: (Rect2D.Buffer) -> Unit) = Rect2D.calloc(this, capacity).also(block)

inline fun Allocator.ClearRect(block: (ClearRect) -> Unit) = ClearRect.calloc(this).also(block)

inline fun Allocator.ClearRect(capacity: Int, block: (ClearRect.Buffer) -> Unit) = ClearRect.calloc(this, capacity).also(block)

inline fun Allocator.ComponentMapping(block: (ComponentMapping) -> Unit) = ComponentMapping.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceProperties(block: (PhysicalDeviceProperties) -> Unit) = PhysicalDeviceProperties.calloc(this).also(block)

inline fun Allocator.ExtensionProperties(block: (ExtensionProperties) -> Unit) = ExtensionProperties.calloc(this).also(block)

inline fun Allocator.ExtensionProperties(capacity: Int, block: (ExtensionProperties.Buffer) -> Unit) = ExtensionProperties.calloc(this, capacity).also(block)

inline fun Allocator.LayerProperties(block: (LayerProperties) -> Unit) = LayerProperties.calloc(this).also(block)

inline fun Allocator.LayerProperties(capacity: Int, block: (LayerProperties.Buffer) -> Unit) = LayerProperties.calloc(this, capacity).also(block)

inline fun Allocator.ApplicationInfo(block: (ApplicationInfo) -> Unit) = ApplicationInfo.calloc(this).also(block)

inline fun Allocator.AllocationCallbacks(block: (AllocationCallbacks) -> Unit) = AllocationCallbacks.calloc(this).also(block)

inline fun Allocator.DeviceQueueCreateInfo(block: (DeviceQueueCreateInfo) -> Unit) = DeviceQueueCreateInfo.calloc(this).also(block)

inline fun Allocator.DeviceQueueCreateInfo(capacity: Int, block: (DeviceQueueCreateInfo.Buffer) -> Unit) = DeviceQueueCreateInfo.calloc(this, capacity).also(block)

inline fun Allocator.DeviceCreateInfo(block: (DeviceCreateInfo) -> Unit) = DeviceCreateInfo.calloc(this).also(block)

inline fun Allocator.InstanceCreateInfo(block: (InstanceCreateInfo) -> Unit) = InstanceCreateInfo.calloc(this).also(block)

inline fun Allocator.QueueFamilyProperties(block: (QueueFamilyProperties) -> Unit) = QueueFamilyProperties.calloc(this).also(block)

inline fun Allocator.QueueFamilyProperties(capacity: Int, block: (QueueFamilyProperties.Buffer) -> Unit) = QueueFamilyProperties.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceMemoryProperties(block: (PhysicalDeviceMemoryProperties) -> Unit) = PhysicalDeviceMemoryProperties.calloc(this).also(block)

inline fun Allocator.MemoryAllocateInfo(block: (MemoryAllocateInfo) -> Unit) = MemoryAllocateInfo.calloc(this).also(block)

inline fun Allocator.MemoryRequirements(block: (MemoryRequirements) -> Unit) = MemoryRequirements.calloc(this).also(block)

inline fun Allocator.SparseImageFormatProperties(block: (SparseImageFormatProperties) -> Unit) = SparseImageFormatProperties.calloc(this).also(block)

inline fun Allocator.SparseImageFormatProperties(capacity: Int, block: (SparseImageFormatProperties.Buffer) -> Unit) = SparseImageFormatProperties.calloc(this, capacity).also(block)

inline fun Allocator.SparseImageMemoryRequirements(block: (SparseImageMemoryRequirements) -> Unit) = SparseImageMemoryRequirements.calloc(this).also(block)

inline fun Allocator.SparseImageMemoryRequirements(capacity: Int, block: (SparseImageMemoryRequirements.Buffer) -> Unit) = SparseImageMemoryRequirements.calloc(this, capacity).also(block)

inline fun Allocator.MemoryType(block: (MemoryType) -> Unit) = MemoryType.calloc(this).also(block)

inline fun Allocator.MemoryType(capacity: Int, block: (MemoryType.Buffer) -> Unit) = MemoryType.calloc(this, capacity).also(block)

inline fun Allocator.MemoryHeap(block: (MemoryHeap) -> Unit) = MemoryHeap.calloc(this).also(block)

inline fun Allocator.MemoryHeap(capacity: Int, block: (MemoryHeap.Buffer) -> Unit) = MemoryHeap.calloc(this, capacity).also(block)

inline fun Allocator.MappedMemoryRange(block: (MappedMemoryRange) -> Unit) = MappedMemoryRange.calloc(this).also(block)

inline fun Allocator.MappedMemoryRange(capacity: Int, block: (MappedMemoryRange.Buffer) -> Unit) = MappedMemoryRange.calloc(this, capacity).also(block)

inline fun Allocator.FormatProperties(block: (FormatProperties) -> Unit) = FormatProperties.calloc(this).also(block)

inline fun Allocator.ImageFormatProperties(block: (ImageFormatProperties) -> Unit) = ImageFormatProperties.calloc(this).also(block)

inline fun Allocator.DescriptorBufferInfo(block: (DescriptorBufferInfo) -> Unit) = DescriptorBufferInfo.calloc(this).also(block)

inline fun Allocator.DescriptorBufferInfo(capacity: Int, block: (DescriptorBufferInfo.Buffer) -> Unit) = DescriptorBufferInfo.calloc(this, capacity).also(block)

inline fun Allocator.DescriptorImageInfo(block: (DescriptorImageInfo) -> Unit) = DescriptorImageInfo.calloc(this).also(block)

inline fun Allocator.DescriptorImageInfo(capacity: Int, block: (DescriptorImageInfo.Buffer) -> Unit) = DescriptorImageInfo.calloc(this, capacity).also(block)

inline fun Allocator.WriteDescriptorSet(block: (WriteDescriptorSet) -> Unit) = WriteDescriptorSet.calloc(this).also(block)

inline fun Allocator.WriteDescriptorSet(capacity: Int, block: (WriteDescriptorSet.Buffer) -> Unit) = WriteDescriptorSet.calloc(this, capacity).also(block)

inline fun Allocator.CopyDescriptorSet(block: (CopyDescriptorSet) -> Unit) = CopyDescriptorSet.calloc(this).also(block)

inline fun Allocator.CopyDescriptorSet(capacity: Int, block: (CopyDescriptorSet.Buffer) -> Unit) = CopyDescriptorSet.calloc(this, capacity).also(block)

inline fun Allocator.BufferCreateInfo(block: (BufferCreateInfo) -> Unit) = BufferCreateInfo.calloc(this).also(block)

inline fun Allocator.BufferViewCreateInfo(block: (BufferViewCreateInfo) -> Unit) = BufferViewCreateInfo.calloc(this).also(block)

inline fun Allocator.ImageSubresource(block: (ImageSubresource) -> Unit) = ImageSubresource.calloc(this).also(block)

inline fun Allocator.ImageSubresourceLayers(block: (ImageSubresourceLayers) -> Unit) = ImageSubresourceLayers.calloc(this).also(block)

inline fun Allocator.ImageSubresourceRange(block: (ImageSubresourceRange) -> Unit) = ImageSubresourceRange.calloc(this).also(block)

inline fun Allocator.ImageSubresourceRange(capacity: Int, block: (ImageSubresourceRange.Buffer) -> Unit) = ImageSubresourceRange.calloc(this, capacity).also(block)

inline fun Allocator.MemoryBarrier(block: (MemoryBarrier) -> Unit) = MemoryBarrier.calloc(this).also(block)

inline fun Allocator.MemoryBarrier(capacity: Int, block: (MemoryBarrier.Buffer) -> Unit) = MemoryBarrier.calloc(this, capacity).also(block)

inline fun Allocator.BufferMemoryBarrier(block: (BufferMemoryBarrier) -> Unit) = BufferMemoryBarrier.calloc(this).also(block)

inline fun Allocator.BufferMemoryBarrier(capacity: Int, block: (BufferMemoryBarrier.Buffer) -> Unit) = BufferMemoryBarrier.calloc(this, capacity).also(block)

inline fun Allocator.ImageMemoryBarrier(block: (ImageMemoryBarrier) -> Unit) = ImageMemoryBarrier.calloc(this).also(block)

inline fun Allocator.ImageMemoryBarrier(capacity: Int, block: (ImageMemoryBarrier.Buffer) -> Unit) = ImageMemoryBarrier.calloc(this, capacity).also(block)

inline fun Allocator.ImageCreateInfo(block: (ImageCreateInfo) -> Unit) = ImageCreateInfo.calloc(this).also(block)

inline fun Allocator.SubresourceLayout(block: (SubresourceLayout) -> Unit) = SubresourceLayout.calloc(this).also(block)

inline fun Allocator.SubresourceLayout(capacity: Int, block: (SubresourceLayout.Buffer) -> Unit) = SubresourceLayout.calloc(this, capacity).also(block)

inline fun Allocator.ImageViewCreateInfo(block: (ImageViewCreateInfo) -> Unit) = ImageViewCreateInfo.calloc(this).also(block)

inline fun Allocator.BufferCopy(block: (BufferCopy) -> Unit) = BufferCopy.calloc(this).also(block)

inline fun Allocator.BufferCopy(capacity: Int, block: (BufferCopy.Buffer) -> Unit) = BufferCopy.calloc(this, capacity).also(block)

inline fun Allocator.SparseMemoryBind(block: (SparseMemoryBind) -> Unit) = SparseMemoryBind.calloc(this).also(block)

inline fun Allocator.SparseMemoryBind(capacity: Int, block: (SparseMemoryBind.Buffer) -> Unit) = SparseMemoryBind.calloc(this, capacity).also(block)

inline fun Allocator.SparseImageMemoryBind(block: (SparseImageMemoryBind) -> Unit) = SparseImageMemoryBind.calloc(this).also(block)

inline fun Allocator.SparseImageMemoryBind(capacity: Int, block: (SparseImageMemoryBind.Buffer) -> Unit) = SparseImageMemoryBind.calloc(this, capacity).also(block)

inline fun Allocator.SparseBufferMemoryBindInfo(block: (SparseBufferMemoryBindInfo) -> Unit) = SparseBufferMemoryBindInfo.calloc(this).also(block)

inline fun Allocator.SparseBufferMemoryBindInfo(capacity: Int, block: (SparseBufferMemoryBindInfo.Buffer) -> Unit) = SparseBufferMemoryBindInfo.calloc(this, capacity).also(block)

inline fun Allocator.SparseImageOpaqueMemoryBindInfo(block: (SparseImageOpaqueMemoryBindInfo) -> Unit) = SparseImageOpaqueMemoryBindInfo.calloc(this).also(block)

inline fun Allocator.SparseImageOpaqueMemoryBindInfo(capacity: Int, block: (SparseImageOpaqueMemoryBindInfo.Buffer) -> Unit) = SparseImageOpaqueMemoryBindInfo.calloc(this, capacity).also(block)

inline fun Allocator.SparseImageMemoryBindInfo(block: (SparseImageMemoryBindInfo) -> Unit) = SparseImageMemoryBindInfo.calloc(this).also(block)

inline fun Allocator.SparseImageMemoryBindInfo(capacity: Int, block: (SparseImageMemoryBindInfo.Buffer) -> Unit) = SparseImageMemoryBindInfo.calloc(this, capacity).also(block)

inline fun Allocator.BindSparseInfo(block: (BindSparseInfo) -> Unit) = BindSparseInfo.calloc(this).also(block)

inline fun Allocator.BindSparseInfo(capacity: Int, block: (BindSparseInfo.Buffer) -> Unit) = BindSparseInfo.calloc(this, capacity).also(block)

inline fun Allocator.ImageCopy(block: (ImageCopy) -> Unit) = ImageCopy.calloc(this).also(block)

inline fun Allocator.ImageCopy(capacity: Int, block: (ImageCopy.Buffer) -> Unit) = ImageCopy.calloc(this, capacity).also(block)

inline fun Allocator.ImageBlit(block: (ImageBlit) -> Unit) = ImageBlit.calloc(this).also(block)

inline fun Allocator.ImageBlit(capacity: Int, block: (ImageBlit.Buffer) -> Unit) = ImageBlit.calloc(this, capacity).also(block)

inline fun Allocator.BufferImageCopy(block: (BufferImageCopy) -> Unit) = BufferImageCopy.calloc(this).also(block)

inline fun Allocator.BufferImageCopy(capacity: Int, block: (BufferImageCopy.Buffer) -> Unit) = BufferImageCopy.calloc(this, capacity).also(block)

inline fun Allocator.ImageResolve(block: (ImageResolve) -> Unit) = ImageResolve.calloc(this).also(block)

inline fun Allocator.ImageResolve(capacity: Int, block: (ImageResolve.Buffer) -> Unit) = ImageResolve.calloc(this, capacity).also(block)

inline fun Allocator.ShaderModuleCreateInfo(block: (ShaderModuleCreateInfo) -> Unit) = ShaderModuleCreateInfo.calloc(this).also(block)

inline fun Allocator.DescriptorSetLayoutBinding(block: (DescriptorSetLayoutBinding) -> Unit) = DescriptorSetLayoutBinding.calloc(this).also(block)

inline fun Allocator.DescriptorSetLayoutBinding(capacity: Int, block: (DescriptorSetLayoutBinding.Buffer) -> Unit) = DescriptorSetLayoutBinding.calloc(this, capacity).also(block)

inline fun Allocator.DescriptorSetLayoutCreateInfo(block: (DescriptorSetLayoutCreateInfo) -> Unit) = DescriptorSetLayoutCreateInfo.calloc(this).also(block)

inline fun Allocator.DescriptorPoolSize(block: (DescriptorPoolSize) -> Unit) = DescriptorPoolSize.calloc(this).also(block)

inline fun Allocator.DescriptorPoolSize(capacity: Int, block: (DescriptorPoolSize.Buffer) -> Unit) = DescriptorPoolSize.calloc(this, capacity).also(block)

inline fun Allocator.DescriptorPoolCreateInfo(block: (DescriptorPoolCreateInfo) -> Unit) = DescriptorPoolCreateInfo.calloc(this).also(block)

inline fun Allocator.DescriptorSetAllocateInfo(block: (DescriptorSetAllocateInfo) -> Unit) = DescriptorSetAllocateInfo.calloc(this).also(block)

inline fun Allocator.SpecializationMapEntry(block: (SpecializationMapEntry) -> Unit) = SpecializationMapEntry.calloc(this).also(block)

inline fun Allocator.SpecializationMapEntry(capacity: Int, block: (SpecializationMapEntry.Buffer) -> Unit) = SpecializationMapEntry.calloc(this, capacity).also(block)

inline fun Allocator.SpecializationInfo(block: (SpecializationInfo) -> Unit) = SpecializationInfo.calloc(this).also(block)

inline fun Allocator.PipelineShaderStageCreateInfo(block: (PipelineShaderStageCreateInfo) -> Unit) = PipelineShaderStageCreateInfo.calloc(this).also(block)

inline fun Allocator.PipelineShaderStageCreateInfo(capacity: Int, block: (PipelineShaderStageCreateInfo.Buffer) -> Unit) = PipelineShaderStageCreateInfo.calloc(this, capacity).also(block)

inline fun Allocator.ComputePipelineCreateInfo(block: (ComputePipelineCreateInfo) -> Unit) = ComputePipelineCreateInfo.calloc(this).also(block)

inline fun Allocator.ComputePipelineCreateInfo(capacity: Int, block: (ComputePipelineCreateInfo.Buffer) -> Unit) = ComputePipelineCreateInfo.calloc(this, capacity).also(block)

inline fun Allocator.VertexInputBindingDescription(block: (VertexInputBindingDescription) -> Unit) = VertexInputBindingDescription.calloc(this).also(block)

inline fun Allocator.VertexInputBindingDescription(capacity: Int, block: (VertexInputBindingDescription.Buffer) -> Unit) = VertexInputBindingDescription.calloc(this, capacity).also(block)

inline fun Allocator.VertexInputAttributeDescription(block: (VertexInputAttributeDescription) -> Unit) = VertexInputAttributeDescription.calloc(this).also(block)

inline fun Allocator.VertexInputAttributeDescription(capacity: Int, block: (VertexInputAttributeDescription.Buffer) -> Unit) = VertexInputAttributeDescription.calloc(this, capacity).also(block)

inline fun Allocator.PipelineVertexInputStateCreateInfo(block: (PipelineVertexInputStateCreateInfo) -> Unit) = PipelineVertexInputStateCreateInfo.calloc(this).also(block)

inline fun Allocator.PipelineInputAssemblyStateCreateInfo(block: (PipelineInputAssemblyStateCreateInfo) -> Unit) = PipelineInputAssemblyStateCreateInfo.calloc(this).also(block)

inline fun Allocator.PipelineTessellationStateCreateInfo(block: (PipelineTessellationStateCreateInfo) -> Unit) = PipelineTessellationStateCreateInfo.calloc(this).also(block)

inline fun Allocator.PipelineViewportStateCreateInfo(block: (PipelineViewportStateCreateInfo) -> Unit) = PipelineViewportStateCreateInfo.calloc(this).also(block)

inline fun Allocator.PipelineRasterizationStateCreateInfo(block: (PipelineRasterizationStateCreateInfo) -> Unit) = PipelineRasterizationStateCreateInfo.calloc(this).also(block)

inline fun Allocator.PipelineMultisampleStateCreateInfo(block: (PipelineMultisampleStateCreateInfo) -> Unit) = PipelineMultisampleStateCreateInfo.calloc(this).also(block)

inline fun Allocator.PipelineColorBlendAttachmentState(block: (PipelineColorBlendAttachmentState) -> Unit) = PipelineColorBlendAttachmentState.calloc(this).also(block)

inline fun Allocator.PipelineColorBlendAttachmentState(capacity: Int, block: (PipelineColorBlendAttachmentState.Buffer) -> Unit) = PipelineColorBlendAttachmentState.calloc(this, capacity).also(block)

inline fun Allocator.PipelineColorBlendStateCreateInfo(block: (PipelineColorBlendStateCreateInfo) -> Unit) = PipelineColorBlendStateCreateInfo.calloc(this).also(block)

inline fun Allocator.PipelineDynamicStateCreateInfo(block: (PipelineDynamicStateCreateInfo) -> Unit) = PipelineDynamicStateCreateInfo.calloc(this).also(block)

inline fun Allocator.StencilOpState(block: (StencilOpState) -> Unit) = StencilOpState.calloc(this).also(block)

inline fun Allocator.PipelineDepthStencilStateCreateInfo(block: (PipelineDepthStencilStateCreateInfo) -> Unit) = PipelineDepthStencilStateCreateInfo.calloc(this).also(block)

inline fun Allocator.GraphicsPipelineCreateInfo(block: (GraphicsPipelineCreateInfo) -> Unit) = GraphicsPipelineCreateInfo.calloc(this).also(block)

inline fun Allocator.GraphicsPipelineCreateInfo(capacity: Int, block: (GraphicsPipelineCreateInfo.Buffer) -> Unit) = GraphicsPipelineCreateInfo.calloc(this, capacity).also(block)

inline fun Allocator.PipelineCacheCreateInfo(block: (PipelineCacheCreateInfo) -> Unit) = PipelineCacheCreateInfo.calloc(this).also(block)

inline fun Allocator.PushConstantRange(block: (PushConstantRange) -> Unit) = PushConstantRange.calloc(this).also(block)

inline fun Allocator.PushConstantRange(capacity: Int, block: (PushConstantRange.Buffer) -> Unit) = PushConstantRange.calloc(this, capacity).also(block)

inline fun Allocator.PipelineLayoutCreateInfo(block: (PipelineLayoutCreateInfo) -> Unit) = PipelineLayoutCreateInfo.calloc(this).also(block)

inline fun Allocator.SamplerCreateInfo(block: (SamplerCreateInfo) -> Unit) = SamplerCreateInfo.calloc(this).also(block)

inline fun Allocator.CommandPoolCreateInfo(block: (CommandPoolCreateInfo) -> Unit) = CommandPoolCreateInfo.calloc(this).also(block)

inline fun Allocator.CommandBufferAllocateInfo(block: (CommandBufferAllocateInfo) -> Unit) = CommandBufferAllocateInfo.calloc(this).also(block)

inline fun Allocator.CommandBufferInheritanceInfo(block: (CommandBufferInheritanceInfo) -> Unit) = CommandBufferInheritanceInfo.calloc(this).also(block)

inline fun Allocator.CommandBufferBeginInfo(block: (CommandBufferBeginInfo) -> Unit) = CommandBufferBeginInfo.calloc(this).also(block)

inline fun Allocator.RenderPassBeginInfo(block: (RenderPassBeginInfo) -> Unit) = RenderPassBeginInfo.calloc(this).also(block)

inline fun Allocator.ClearColorValue(block: (ClearColorValue) -> Unit) = ClearColorValue.calloc(this).also(block)

inline fun Allocator.ClearDepthStencilValue(block: (ClearDepthStencilValue) -> Unit) = ClearDepthStencilValue.calloc(this).also(block)

inline fun Allocator.ClearValue(block: (ClearValue) -> Unit) = ClearValue.calloc(this).also(block)

inline fun Allocator.ClearValue(capacity: Int, block: (ClearValue.Buffer) -> Unit) = ClearValue.calloc(this, capacity).also(block)

inline fun Allocator.ClearAttachment(block: (ClearAttachment) -> Unit) = ClearAttachment.calloc(this).also(block)

inline fun Allocator.ClearAttachment(capacity: Int, block: (ClearAttachment.Buffer) -> Unit) = ClearAttachment.calloc(this, capacity).also(block)

inline fun Allocator.AttachmentDescription(block: (AttachmentDescription) -> Unit) = AttachmentDescription.calloc(this).also(block)

inline fun Allocator.AttachmentDescription(capacity: Int, block: (AttachmentDescription.Buffer) -> Unit) = AttachmentDescription.calloc(this, capacity).also(block)

inline fun Allocator.AttachmentReference(block: (AttachmentReference) -> Unit) = AttachmentReference.calloc(this).also(block)

inline fun Allocator.AttachmentReference(capacity: Int, block: (AttachmentReference.Buffer) -> Unit) = AttachmentReference.calloc(this, capacity).also(block)

inline fun Allocator.SubpassDescription(block: (SubpassDescription) -> Unit) = SubpassDescription.calloc(this).also(block)

inline fun Allocator.SubpassDescription(capacity: Int, block: (SubpassDescription.Buffer) -> Unit) = SubpassDescription.calloc(this, capacity).also(block)

inline fun Allocator.SubpassDependency(block: (SubpassDependency) -> Unit) = SubpassDependency.calloc(this).also(block)

inline fun Allocator.SubpassDependency(capacity: Int, block: (SubpassDependency.Buffer) -> Unit) = SubpassDependency.calloc(this, capacity).also(block)

inline fun Allocator.RenderPassCreateInfo(block: (RenderPassCreateInfo) -> Unit) = RenderPassCreateInfo.calloc(this).also(block)

inline fun Allocator.EventCreateInfo(block: (EventCreateInfo) -> Unit) = EventCreateInfo.calloc(this).also(block)

inline fun Allocator.FenceCreateInfo(block: (FenceCreateInfo) -> Unit) = FenceCreateInfo.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFeatures(block: (PhysicalDeviceFeatures) -> Unit) = PhysicalDeviceFeatures.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceSparseProperties(block: (PhysicalDeviceSparseProperties) -> Unit) = PhysicalDeviceSparseProperties.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceLimits(block: (PhysicalDeviceLimits) -> Unit) = PhysicalDeviceLimits.calloc(this).also(block)

inline fun Allocator.SemaphoreCreateInfo(block: (SemaphoreCreateInfo) -> Unit) = SemaphoreCreateInfo.calloc(this).also(block)

inline fun Allocator.QueryPoolCreateInfo(block: (QueryPoolCreateInfo) -> Unit) = QueryPoolCreateInfo.calloc(this).also(block)

inline fun Allocator.FramebufferCreateInfo(block: (FramebufferCreateInfo) -> Unit) = FramebufferCreateInfo.calloc(this).also(block)

inline fun Allocator.DrawIndirectCommand(block: (DrawIndirectCommand) -> Unit) = DrawIndirectCommand.calloc(this).also(block)

inline fun Allocator.DrawIndexedIndirectCommand(block: (DrawIndexedIndirectCommand) -> Unit) = DrawIndexedIndirectCommand.calloc(this).also(block)

inline fun Allocator.DispatchIndirectCommand(block: (DispatchIndirectCommand) -> Unit) = DispatchIndirectCommand.calloc(this).also(block)

inline fun Allocator.SubmitInfo(block: (SubmitInfo) -> Unit) = SubmitInfo.calloc(this).also(block)

inline fun Allocator.SubmitInfo(capacity: Int, block: (SubmitInfo.Buffer) -> Unit) = SubmitInfo.calloc(this, capacity).also(block)

inline fun Allocator.DisplayPropertiesKHR(block: (DisplayPropertiesKHR) -> Unit) = DisplayPropertiesKHR.calloc(this).also(block)

inline fun Allocator.DisplayPropertiesKHR(capacity: Int, block: (DisplayPropertiesKHR.Buffer) -> Unit) = DisplayPropertiesKHR.calloc(this, capacity).also(block)

inline fun Allocator.DisplayPlanePropertiesKHR(block: (DisplayPlanePropertiesKHR) -> Unit) = DisplayPlanePropertiesKHR.calloc(this).also(block)

inline fun Allocator.DisplayPlanePropertiesKHR(capacity: Int, block: (DisplayPlanePropertiesKHR.Buffer) -> Unit) = DisplayPlanePropertiesKHR.calloc(this, capacity).also(block)

inline fun Allocator.DisplayModeParametersKHR(block: (DisplayModeParametersKHR) -> Unit) = DisplayModeParametersKHR.calloc(this).also(block)

inline fun Allocator.DisplayModePropertiesKHR(block: (DisplayModePropertiesKHR) -> Unit) = DisplayModePropertiesKHR.calloc(this).also(block)

inline fun Allocator.DisplayModePropertiesKHR(capacity: Int, block: (DisplayModePropertiesKHR.Buffer) -> Unit) = DisplayModePropertiesKHR.calloc(this, capacity).also(block)

inline fun Allocator.DisplayModeCreateInfoKHR(block: (DisplayModeCreateInfoKHR) -> Unit) = DisplayModeCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.DisplayPlaneCapabilitiesKHR(block: (DisplayPlaneCapabilitiesKHR) -> Unit) = DisplayPlaneCapabilitiesKHR.calloc(this).also(block)

inline fun Allocator.DisplaySurfaceCreateInfoKHR(block: (DisplaySurfaceCreateInfoKHR) -> Unit) = DisplaySurfaceCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.DisplayPresentInfoKHR(block: (DisplayPresentInfoKHR) -> Unit) = DisplayPresentInfoKHR.calloc(this).also(block)

inline fun Allocator.SurfaceCapabilitiesKHR(block: (SurfaceCapabilitiesKHR) -> Unit) = SurfaceCapabilitiesKHR.calloc(this).also(block)

inline fun Allocator.AndroidSurfaceCreateInfoKHR(block: (AndroidSurfaceCreateInfoKHR) -> Unit) = AndroidSurfaceCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.ViSurfaceCreateInfoNN(block: (ViSurfaceCreateInfoNN) -> Unit) = ViSurfaceCreateInfoNN.calloc(this).also(block)

inline fun Allocator.WaylandSurfaceCreateInfoKHR(block: (WaylandSurfaceCreateInfoKHR) -> Unit) = WaylandSurfaceCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.Win32SurfaceCreateInfoKHR(block: (Win32SurfaceCreateInfoKHR) -> Unit) = Win32SurfaceCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.XlibSurfaceCreateInfoKHR(block: (XlibSurfaceCreateInfoKHR) -> Unit) = XlibSurfaceCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.XcbSurfaceCreateInfoKHR(block: (XcbSurfaceCreateInfoKHR) -> Unit) = XcbSurfaceCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.DirectFBSurfaceCreateInfoEXT(block: (DirectFBSurfaceCreateInfoEXT) -> Unit) = DirectFBSurfaceCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.ImagePipeSurfaceCreateInfoFUCHSIA(block: (ImagePipeSurfaceCreateInfoFUCHSIA) -> Unit) = ImagePipeSurfaceCreateInfoFUCHSIA.calloc(this).also(block)

inline fun Allocator.StreamDescriptorSurfaceCreateInfoGGP(block: (StreamDescriptorSurfaceCreateInfoGGP) -> Unit) = StreamDescriptorSurfaceCreateInfoGGP.calloc(this).also(block)

inline fun Allocator.ScreenSurfaceCreateInfoQNX(block: (ScreenSurfaceCreateInfoQNX) -> Unit) = ScreenSurfaceCreateInfoQNX.calloc(this).also(block)

inline fun Allocator.SurfaceFormatKHR(block: (SurfaceFormatKHR) -> Unit) = SurfaceFormatKHR.calloc(this).also(block)

inline fun Allocator.SurfaceFormatKHR(capacity: Int, block: (SurfaceFormatKHR.Buffer) -> Unit) = SurfaceFormatKHR.calloc(this, capacity).also(block)

inline fun Allocator.SwapchainCreateInfoKHR(block: (SwapchainCreateInfoKHR) -> Unit) = SwapchainCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.SwapchainCreateInfoKHR(capacity: Int, block: (SwapchainCreateInfoKHR.Buffer) -> Unit) = SwapchainCreateInfoKHR.calloc(this, capacity).also(block)

inline fun Allocator.PresentInfoKHR(block: (PresentInfoKHR) -> Unit) = PresentInfoKHR.calloc(this).also(block)

inline fun Allocator.DebugReportCallbackCreateInfoEXT(block: (DebugReportCallbackCreateInfoEXT) -> Unit) = DebugReportCallbackCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.ValidationFlagsEXT(block: (ValidationFlagsEXT) -> Unit) = ValidationFlagsEXT.calloc(this).also(block)

inline fun Allocator.ValidationFeaturesEXT(block: (ValidationFeaturesEXT) -> Unit) = ValidationFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PipelineRasterizationStateRasterizationOrderAMD(block: (PipelineRasterizationStateRasterizationOrderAMD) -> Unit) = PipelineRasterizationStateRasterizationOrderAMD.calloc(this).also(block)

inline fun Allocator.DebugMarkerObjectNameInfoEXT(block: (DebugMarkerObjectNameInfoEXT) -> Unit) = DebugMarkerObjectNameInfoEXT.calloc(this).also(block)

inline fun Allocator.DebugMarkerObjectTagInfoEXT(block: (DebugMarkerObjectTagInfoEXT) -> Unit) = DebugMarkerObjectTagInfoEXT.calloc(this).also(block)

inline fun Allocator.DebugMarkerMarkerInfoEXT(block: (DebugMarkerMarkerInfoEXT) -> Unit) = DebugMarkerMarkerInfoEXT.calloc(this).also(block)

inline fun Allocator.DedicatedAllocationImageCreateInfoNV(block: (DedicatedAllocationImageCreateInfoNV) -> Unit) = DedicatedAllocationImageCreateInfoNV.calloc(this).also(block)

inline fun Allocator.DedicatedAllocationBufferCreateInfoNV(block: (DedicatedAllocationBufferCreateInfoNV) -> Unit) = DedicatedAllocationBufferCreateInfoNV.calloc(this).also(block)

inline fun Allocator.DedicatedAllocationMemoryAllocateInfoNV(block: (DedicatedAllocationMemoryAllocateInfoNV) -> Unit) = DedicatedAllocationMemoryAllocateInfoNV.calloc(this).also(block)

inline fun Allocator.ExternalImageFormatPropertiesNV(block: (ExternalImageFormatPropertiesNV) -> Unit) = ExternalImageFormatPropertiesNV.calloc(this).also(block)

inline fun Allocator.ExternalMemoryImageCreateInfoNV(block: (ExternalMemoryImageCreateInfoNV) -> Unit) = ExternalMemoryImageCreateInfoNV.calloc(this).also(block)

inline fun Allocator.ExportMemoryAllocateInfoNV(block: (ExportMemoryAllocateInfoNV) -> Unit) = ExportMemoryAllocateInfoNV.calloc(this).also(block)

inline fun Allocator.ImportMemoryWin32HandleInfoNV(block: (ImportMemoryWin32HandleInfoNV) -> Unit) = ImportMemoryWin32HandleInfoNV.calloc(this).also(block)

inline fun Allocator.ExportMemoryWin32HandleInfoNV(block: (ExportMemoryWin32HandleInfoNV) -> Unit) = ExportMemoryWin32HandleInfoNV.calloc(this).also(block)

inline fun Allocator.Win32KeyedMutexAcquireReleaseInfoNV(block: (Win32KeyedMutexAcquireReleaseInfoNV) -> Unit) = Win32KeyedMutexAcquireReleaseInfoNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceDeviceGeneratedCommandsFeaturesNV(block: (PhysicalDeviceDeviceGeneratedCommandsFeaturesNV) -> Unit) = PhysicalDeviceDeviceGeneratedCommandsFeaturesNV.calloc(this).also(block)

inline fun Allocator.DevicePrivateDataCreateInfoEXT(block: (DevicePrivateDataCreateInfoEXT) -> Unit) = DevicePrivateDataCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PrivateDataSlotCreateInfoEXT(block: (PrivateDataSlotCreateInfoEXT) -> Unit) = PrivateDataSlotCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDevicePrivateDataFeaturesEXT(block: (PhysicalDevicePrivateDataFeaturesEXT) -> Unit) = PhysicalDevicePrivateDataFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceDeviceGeneratedCommandsPropertiesNV(block: (PhysicalDeviceDeviceGeneratedCommandsPropertiesNV) -> Unit) = PhysicalDeviceDeviceGeneratedCommandsPropertiesNV.calloc(this).also(block)

inline fun Allocator.GraphicsShaderGroupCreateInfoNV(block: (GraphicsShaderGroupCreateInfoNV) -> Unit) = GraphicsShaderGroupCreateInfoNV.calloc(this).also(block)

inline fun Allocator.GraphicsShaderGroupCreateInfoNV(capacity: Int, block: (GraphicsShaderGroupCreateInfoNV.Buffer) -> Unit) = GraphicsShaderGroupCreateInfoNV.calloc(this, capacity).also(block)

inline fun Allocator.GraphicsPipelineShaderGroupsCreateInfoNV(block: (GraphicsPipelineShaderGroupsCreateInfoNV) -> Unit) = GraphicsPipelineShaderGroupsCreateInfoNV.calloc(this).also(block)

inline fun Allocator.BindShaderGroupIndirectCommandNV(block: (BindShaderGroupIndirectCommandNV) -> Unit) = BindShaderGroupIndirectCommandNV.calloc(this).also(block)

inline fun Allocator.BindIndexBufferIndirectCommandNV(block: (BindIndexBufferIndirectCommandNV) -> Unit) = BindIndexBufferIndirectCommandNV.calloc(this).also(block)

inline fun Allocator.BindVertexBufferIndirectCommandNV(block: (BindVertexBufferIndirectCommandNV) -> Unit) = BindVertexBufferIndirectCommandNV.calloc(this).also(block)

inline fun Allocator.SetStateFlagsIndirectCommandNV(block: (SetStateFlagsIndirectCommandNV) -> Unit) = SetStateFlagsIndirectCommandNV.calloc(this).also(block)

inline fun Allocator.IndirectCommandsStreamNV(block: (IndirectCommandsStreamNV) -> Unit) = IndirectCommandsStreamNV.calloc(this).also(block)

inline fun Allocator.IndirectCommandsStreamNV(capacity: Int, block: (IndirectCommandsStreamNV.Buffer) -> Unit) = IndirectCommandsStreamNV.calloc(this, capacity).also(block)

inline fun Allocator.IndirectCommandsLayoutTokenNV(block: (IndirectCommandsLayoutTokenNV) -> Unit) = IndirectCommandsLayoutTokenNV.calloc(this).also(block)

inline fun Allocator.IndirectCommandsLayoutTokenNV(capacity: Int, block: (IndirectCommandsLayoutTokenNV.Buffer) -> Unit) = IndirectCommandsLayoutTokenNV.calloc(this, capacity).also(block)

inline fun Allocator.IndirectCommandsLayoutCreateInfoNV(block: (IndirectCommandsLayoutCreateInfoNV) -> Unit) = IndirectCommandsLayoutCreateInfoNV.calloc(this).also(block)

inline fun Allocator.GeneratedCommandsInfoNV(block: (GeneratedCommandsInfoNV) -> Unit) = GeneratedCommandsInfoNV.calloc(this).also(block)

inline fun Allocator.GeneratedCommandsMemoryRequirementsInfoNV(block: (GeneratedCommandsMemoryRequirementsInfoNV) -> Unit) = GeneratedCommandsMemoryRequirementsInfoNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFeatures2(block: (PhysicalDeviceFeatures2) -> Unit) = PhysicalDeviceFeatures2.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceProperties2(block: (PhysicalDeviceProperties2) -> Unit) = PhysicalDeviceProperties2.calloc(this).also(block)

inline fun Allocator.FormatProperties2(block: (FormatProperties2) -> Unit) = FormatProperties2.calloc(this).also(block)

inline fun Allocator.ImageFormatProperties2(block: (ImageFormatProperties2) -> Unit) = ImageFormatProperties2.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceImageFormatInfo2(block: (PhysicalDeviceImageFormatInfo2) -> Unit) = PhysicalDeviceImageFormatInfo2.calloc(this).also(block)

inline fun Allocator.QueueFamilyProperties2(block: (QueueFamilyProperties2) -> Unit) = QueueFamilyProperties2.calloc(this).also(block)

inline fun Allocator.QueueFamilyProperties2(capacity: Int, block: (QueueFamilyProperties2.Buffer) -> Unit) = QueueFamilyProperties2.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceMemoryProperties2(block: (PhysicalDeviceMemoryProperties2) -> Unit) = PhysicalDeviceMemoryProperties2.calloc(this).also(block)

inline fun Allocator.SparseImageFormatProperties2(block: (SparseImageFormatProperties2) -> Unit) = SparseImageFormatProperties2.calloc(this).also(block)

inline fun Allocator.SparseImageFormatProperties2(capacity: Int, block: (SparseImageFormatProperties2.Buffer) -> Unit) = SparseImageFormatProperties2.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceSparseImageFormatInfo2(block: (PhysicalDeviceSparseImageFormatInfo2) -> Unit) = PhysicalDeviceSparseImageFormatInfo2.calloc(this).also(block)

inline fun Allocator.PhysicalDevicePushDescriptorPropertiesKHR(block: (PhysicalDevicePushDescriptorPropertiesKHR) -> Unit) = PhysicalDevicePushDescriptorPropertiesKHR.calloc(this).also(block)

inline fun Allocator.ConformanceVersion(block: (ConformanceVersion) -> Unit) = ConformanceVersion.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceDriverProperties(block: (PhysicalDeviceDriverProperties) -> Unit) = PhysicalDeviceDriverProperties.calloc(this).also(block)

inline fun Allocator.PresentRegionsKHR(block: (PresentRegionsKHR) -> Unit) = PresentRegionsKHR.calloc(this).also(block)

inline fun Allocator.PresentRegionKHR(block: (PresentRegionKHR) -> Unit) = PresentRegionKHR.calloc(this).also(block)

inline fun Allocator.PresentRegionKHR(capacity: Int, block: (PresentRegionKHR.Buffer) -> Unit) = PresentRegionKHR.calloc(this, capacity).also(block)

inline fun Allocator.RectLayerKHR(block: (RectLayerKHR) -> Unit) = RectLayerKHR.calloc(this).also(block)

inline fun Allocator.RectLayerKHR(capacity: Int, block: (RectLayerKHR.Buffer) -> Unit) = RectLayerKHR.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceVariablePointersFeatures(block: (PhysicalDeviceVariablePointersFeatures) -> Unit) = PhysicalDeviceVariablePointersFeatures.calloc(this).also(block)

inline fun Allocator.ExternalMemoryProperties(block: (ExternalMemoryProperties) -> Unit) = ExternalMemoryProperties.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceExternalImageFormatInfo(block: (PhysicalDeviceExternalImageFormatInfo) -> Unit) = PhysicalDeviceExternalImageFormatInfo.calloc(this).also(block)

inline fun Allocator.ExternalImageFormatProperties(block: (ExternalImageFormatProperties) -> Unit) = ExternalImageFormatProperties.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceExternalBufferInfo(block: (PhysicalDeviceExternalBufferInfo) -> Unit) = PhysicalDeviceExternalBufferInfo.calloc(this).also(block)

inline fun Allocator.ExternalBufferProperties(block: (ExternalBufferProperties) -> Unit) = ExternalBufferProperties.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceIDProperties(block: (PhysicalDeviceIDProperties) -> Unit) = PhysicalDeviceIDProperties.calloc(this).also(block)

inline fun Allocator.ExternalMemoryImageCreateInfo(block: (ExternalMemoryImageCreateInfo) -> Unit) = ExternalMemoryImageCreateInfo.calloc(this).also(block)

inline fun Allocator.ExternalMemoryBufferCreateInfo(block: (ExternalMemoryBufferCreateInfo) -> Unit) = ExternalMemoryBufferCreateInfo.calloc(this).also(block)

inline fun Allocator.ExportMemoryAllocateInfo(block: (ExportMemoryAllocateInfo) -> Unit) = ExportMemoryAllocateInfo.calloc(this).also(block)

inline fun Allocator.ImportMemoryWin32HandleInfoKHR(block: (ImportMemoryWin32HandleInfoKHR) -> Unit) = ImportMemoryWin32HandleInfoKHR.calloc(this).also(block)

inline fun Allocator.ExportMemoryWin32HandleInfoKHR(block: (ExportMemoryWin32HandleInfoKHR) -> Unit) = ExportMemoryWin32HandleInfoKHR.calloc(this).also(block)

inline fun Allocator.ImportMemoryZirconHandleInfoFUCHSIA(block: (ImportMemoryZirconHandleInfoFUCHSIA) -> Unit) = ImportMemoryZirconHandleInfoFUCHSIA.calloc(this).also(block)

inline fun Allocator.MemoryZirconHandlePropertiesFUCHSIA(block: (MemoryZirconHandlePropertiesFUCHSIA) -> Unit) = MemoryZirconHandlePropertiesFUCHSIA.calloc(this).also(block)

inline fun Allocator.MemoryGetZirconHandleInfoFUCHSIA(block: (MemoryGetZirconHandleInfoFUCHSIA) -> Unit) = MemoryGetZirconHandleInfoFUCHSIA.calloc(this).also(block)

inline fun Allocator.MemoryWin32HandlePropertiesKHR(block: (MemoryWin32HandlePropertiesKHR) -> Unit) = MemoryWin32HandlePropertiesKHR.calloc(this).also(block)

inline fun Allocator.MemoryGetWin32HandleInfoKHR(block: (MemoryGetWin32HandleInfoKHR) -> Unit) = MemoryGetWin32HandleInfoKHR.calloc(this).also(block)

inline fun Allocator.ImportMemoryFdInfoKHR(block: (ImportMemoryFdInfoKHR) -> Unit) = ImportMemoryFdInfoKHR.calloc(this).also(block)

inline fun Allocator.MemoryFdPropertiesKHR(block: (MemoryFdPropertiesKHR) -> Unit) = MemoryFdPropertiesKHR.calloc(this).also(block)

inline fun Allocator.MemoryGetFdInfoKHR(block: (MemoryGetFdInfoKHR) -> Unit) = MemoryGetFdInfoKHR.calloc(this).also(block)

inline fun Allocator.Win32KeyedMutexAcquireReleaseInfoKHR(block: (Win32KeyedMutexAcquireReleaseInfoKHR) -> Unit) = Win32KeyedMutexAcquireReleaseInfoKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceExternalSemaphoreInfo(block: (PhysicalDeviceExternalSemaphoreInfo) -> Unit) = PhysicalDeviceExternalSemaphoreInfo.calloc(this).also(block)

inline fun Allocator.ExternalSemaphoreProperties(block: (ExternalSemaphoreProperties) -> Unit) = ExternalSemaphoreProperties.calloc(this).also(block)

inline fun Allocator.ExportSemaphoreCreateInfo(block: (ExportSemaphoreCreateInfo) -> Unit) = ExportSemaphoreCreateInfo.calloc(this).also(block)

inline fun Allocator.ImportSemaphoreWin32HandleInfoKHR(block: (ImportSemaphoreWin32HandleInfoKHR) -> Unit) = ImportSemaphoreWin32HandleInfoKHR.calloc(this).also(block)

inline fun Allocator.ExportSemaphoreWin32HandleInfoKHR(block: (ExportSemaphoreWin32HandleInfoKHR) -> Unit) = ExportSemaphoreWin32HandleInfoKHR.calloc(this).also(block)

inline fun Allocator.D3D12FenceSubmitInfoKHR(block: (D3D12FenceSubmitInfoKHR) -> Unit) = D3D12FenceSubmitInfoKHR.calloc(this).also(block)

inline fun Allocator.SemaphoreGetWin32HandleInfoKHR(block: (SemaphoreGetWin32HandleInfoKHR) -> Unit) = SemaphoreGetWin32HandleInfoKHR.calloc(this).also(block)

inline fun Allocator.ImportSemaphoreFdInfoKHR(block: (ImportSemaphoreFdInfoKHR) -> Unit) = ImportSemaphoreFdInfoKHR.calloc(this).also(block)

inline fun Allocator.SemaphoreGetFdInfoKHR(block: (SemaphoreGetFdInfoKHR) -> Unit) = SemaphoreGetFdInfoKHR.calloc(this).also(block)

inline fun Allocator.ImportSemaphoreZirconHandleInfoFUCHSIA(block: (ImportSemaphoreZirconHandleInfoFUCHSIA) -> Unit) = ImportSemaphoreZirconHandleInfoFUCHSIA.calloc(this).also(block)

inline fun Allocator.SemaphoreGetZirconHandleInfoFUCHSIA(block: (SemaphoreGetZirconHandleInfoFUCHSIA) -> Unit) = SemaphoreGetZirconHandleInfoFUCHSIA.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceExternalFenceInfo(block: (PhysicalDeviceExternalFenceInfo) -> Unit) = PhysicalDeviceExternalFenceInfo.calloc(this).also(block)

inline fun Allocator.ExternalFenceProperties(block: (ExternalFenceProperties) -> Unit) = ExternalFenceProperties.calloc(this).also(block)

inline fun Allocator.ExportFenceCreateInfo(block: (ExportFenceCreateInfo) -> Unit) = ExportFenceCreateInfo.calloc(this).also(block)

inline fun Allocator.ImportFenceWin32HandleInfoKHR(block: (ImportFenceWin32HandleInfoKHR) -> Unit) = ImportFenceWin32HandleInfoKHR.calloc(this).also(block)

inline fun Allocator.ExportFenceWin32HandleInfoKHR(block: (ExportFenceWin32HandleInfoKHR) -> Unit) = ExportFenceWin32HandleInfoKHR.calloc(this).also(block)

inline fun Allocator.FenceGetWin32HandleInfoKHR(block: (FenceGetWin32HandleInfoKHR) -> Unit) = FenceGetWin32HandleInfoKHR.calloc(this).also(block)

inline fun Allocator.ImportFenceFdInfoKHR(block: (ImportFenceFdInfoKHR) -> Unit) = ImportFenceFdInfoKHR.calloc(this).also(block)

inline fun Allocator.FenceGetFdInfoKHR(block: (FenceGetFdInfoKHR) -> Unit) = FenceGetFdInfoKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceMultiviewFeatures(block: (PhysicalDeviceMultiviewFeatures) -> Unit) = PhysicalDeviceMultiviewFeatures.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceMultiviewProperties(block: (PhysicalDeviceMultiviewProperties) -> Unit) = PhysicalDeviceMultiviewProperties.calloc(this).also(block)

inline fun Allocator.RenderPassMultiviewCreateInfo(block: (RenderPassMultiviewCreateInfo) -> Unit) = RenderPassMultiviewCreateInfo.calloc(this).also(block)

inline fun Allocator.SurfaceCapabilities2EXT(block: (SurfaceCapabilities2EXT) -> Unit) = SurfaceCapabilities2EXT.calloc(this).also(block)

inline fun Allocator.DisplayPowerInfoEXT(block: (DisplayPowerInfoEXT) -> Unit) = DisplayPowerInfoEXT.calloc(this).also(block)

inline fun Allocator.DeviceEventInfoEXT(block: (DeviceEventInfoEXT) -> Unit) = DeviceEventInfoEXT.calloc(this).also(block)

inline fun Allocator.DisplayEventInfoEXT(block: (DisplayEventInfoEXT) -> Unit) = DisplayEventInfoEXT.calloc(this).also(block)

inline fun Allocator.SwapchainCounterCreateInfoEXT(block: (SwapchainCounterCreateInfoEXT) -> Unit) = SwapchainCounterCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceGroupProperties(block: (PhysicalDeviceGroupProperties) -> Unit) = PhysicalDeviceGroupProperties.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceGroupProperties(capacity: Int, block: (PhysicalDeviceGroupProperties.Buffer) -> Unit) = PhysicalDeviceGroupProperties.calloc(this, capacity).also(block)

inline fun Allocator.MemoryAllocateFlagsInfo(block: (MemoryAllocateFlagsInfo) -> Unit) = MemoryAllocateFlagsInfo.calloc(this).also(block)

inline fun Allocator.BindBufferMemoryInfo(block: (BindBufferMemoryInfo) -> Unit) = BindBufferMemoryInfo.calloc(this).also(block)

inline fun Allocator.BindBufferMemoryInfo(capacity: Int, block: (BindBufferMemoryInfo.Buffer) -> Unit) = BindBufferMemoryInfo.calloc(this, capacity).also(block)

inline fun Allocator.BindBufferMemoryDeviceGroupInfo(block: (BindBufferMemoryDeviceGroupInfo) -> Unit) = BindBufferMemoryDeviceGroupInfo.calloc(this).also(block)

inline fun Allocator.BindImageMemoryInfo(block: (BindImageMemoryInfo) -> Unit) = BindImageMemoryInfo.calloc(this).also(block)

inline fun Allocator.BindImageMemoryInfo(capacity: Int, block: (BindImageMemoryInfo.Buffer) -> Unit) = BindImageMemoryInfo.calloc(this, capacity).also(block)

inline fun Allocator.BindImageMemoryDeviceGroupInfo(block: (BindImageMemoryDeviceGroupInfo) -> Unit) = BindImageMemoryDeviceGroupInfo.calloc(this).also(block)

inline fun Allocator.DeviceGroupRenderPassBeginInfo(block: (DeviceGroupRenderPassBeginInfo) -> Unit) = DeviceGroupRenderPassBeginInfo.calloc(this).also(block)

inline fun Allocator.DeviceGroupCommandBufferBeginInfo(block: (DeviceGroupCommandBufferBeginInfo) -> Unit) = DeviceGroupCommandBufferBeginInfo.calloc(this).also(block)

inline fun Allocator.DeviceGroupSubmitInfo(block: (DeviceGroupSubmitInfo) -> Unit) = DeviceGroupSubmitInfo.calloc(this).also(block)

inline fun Allocator.DeviceGroupBindSparseInfo(block: (DeviceGroupBindSparseInfo) -> Unit) = DeviceGroupBindSparseInfo.calloc(this).also(block)

inline fun Allocator.DeviceGroupPresentCapabilitiesKHR(block: (DeviceGroupPresentCapabilitiesKHR) -> Unit) = DeviceGroupPresentCapabilitiesKHR.calloc(this).also(block)

inline fun Allocator.ImageSwapchainCreateInfoKHR(block: (ImageSwapchainCreateInfoKHR) -> Unit) = ImageSwapchainCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.BindImageMemorySwapchainInfoKHR(block: (BindImageMemorySwapchainInfoKHR) -> Unit) = BindImageMemorySwapchainInfoKHR.calloc(this).also(block)

inline fun Allocator.AcquireNextImageInfoKHR(block: (AcquireNextImageInfoKHR) -> Unit) = AcquireNextImageInfoKHR.calloc(this).also(block)

inline fun Allocator.DeviceGroupPresentInfoKHR(block: (DeviceGroupPresentInfoKHR) -> Unit) = DeviceGroupPresentInfoKHR.calloc(this).also(block)

inline fun Allocator.DeviceGroupDeviceCreateInfo(block: (DeviceGroupDeviceCreateInfo) -> Unit) = DeviceGroupDeviceCreateInfo.calloc(this).also(block)

inline fun Allocator.DeviceGroupSwapchainCreateInfoKHR(block: (DeviceGroupSwapchainCreateInfoKHR) -> Unit) = DeviceGroupSwapchainCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.DescriptorUpdateTemplateEntry(block: (DescriptorUpdateTemplateEntry) -> Unit) = DescriptorUpdateTemplateEntry.calloc(this).also(block)

inline fun Allocator.DescriptorUpdateTemplateEntry(capacity: Int, block: (DescriptorUpdateTemplateEntry.Buffer) -> Unit) = DescriptorUpdateTemplateEntry.calloc(this, capacity).also(block)

inline fun Allocator.DescriptorUpdateTemplateCreateInfo(block: (DescriptorUpdateTemplateCreateInfo) -> Unit) = DescriptorUpdateTemplateCreateInfo.calloc(this).also(block)

inline fun Allocator.XYColorEXT(block: (XYColorEXT) -> Unit) = XYColorEXT.calloc(this).also(block)

inline fun Allocator.HdrMetadataEXT(block: (HdrMetadataEXT) -> Unit) = HdrMetadataEXT.calloc(this).also(block)

inline fun Allocator.HdrMetadataEXT(capacity: Int, block: (HdrMetadataEXT.Buffer) -> Unit) = HdrMetadataEXT.calloc(this, capacity).also(block)

inline fun Allocator.DisplayNativeHdrSurfaceCapabilitiesAMD(block: (DisplayNativeHdrSurfaceCapabilitiesAMD) -> Unit) = DisplayNativeHdrSurfaceCapabilitiesAMD.calloc(this).also(block)

inline fun Allocator.SwapchainDisplayNativeHdrCreateInfoAMD(block: (SwapchainDisplayNativeHdrCreateInfoAMD) -> Unit) = SwapchainDisplayNativeHdrCreateInfoAMD.calloc(this).also(block)

inline fun Allocator.RefreshCycleDurationGOOGLE(block: (RefreshCycleDurationGOOGLE) -> Unit) = RefreshCycleDurationGOOGLE.calloc(this).also(block)

inline fun Allocator.PastPresentationTimingGOOGLE(block: (PastPresentationTimingGOOGLE) -> Unit) = PastPresentationTimingGOOGLE.calloc(this).also(block)

inline fun Allocator.PastPresentationTimingGOOGLE(capacity: Int, block: (PastPresentationTimingGOOGLE.Buffer) -> Unit) = PastPresentationTimingGOOGLE.calloc(this, capacity).also(block)

inline fun Allocator.PresentTimesInfoGOOGLE(block: (PresentTimesInfoGOOGLE) -> Unit) = PresentTimesInfoGOOGLE.calloc(this).also(block)

inline fun Allocator.PresentTimeGOOGLE(block: (PresentTimeGOOGLE) -> Unit) = PresentTimeGOOGLE.calloc(this).also(block)

inline fun Allocator.PresentTimeGOOGLE(capacity: Int, block: (PresentTimeGOOGLE.Buffer) -> Unit) = PresentTimeGOOGLE.calloc(this, capacity).also(block)

inline fun Allocator.IOSSurfaceCreateInfoMVK(block: (IOSSurfaceCreateInfoMVK) -> Unit) = IOSSurfaceCreateInfoMVK.calloc(this).also(block)

inline fun Allocator.MacOSSurfaceCreateInfoMVK(block: (MacOSSurfaceCreateInfoMVK) -> Unit) = MacOSSurfaceCreateInfoMVK.calloc(this).also(block)

inline fun Allocator.MetalSurfaceCreateInfoEXT(block: (MetalSurfaceCreateInfoEXT) -> Unit) = MetalSurfaceCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.ViewportWScalingNV(block: (ViewportWScalingNV) -> Unit) = ViewportWScalingNV.calloc(this).also(block)

inline fun Allocator.ViewportWScalingNV(capacity: Int, block: (ViewportWScalingNV.Buffer) -> Unit) = ViewportWScalingNV.calloc(this, capacity).also(block)

inline fun Allocator.PipelineViewportWScalingStateCreateInfoNV(block: (PipelineViewportWScalingStateCreateInfoNV) -> Unit) = PipelineViewportWScalingStateCreateInfoNV.calloc(this).also(block)

inline fun Allocator.ViewportSwizzleNV(block: (ViewportSwizzleNV) -> Unit) = ViewportSwizzleNV.calloc(this).also(block)

inline fun Allocator.ViewportSwizzleNV(capacity: Int, block: (ViewportSwizzleNV.Buffer) -> Unit) = ViewportSwizzleNV.calloc(this, capacity).also(block)

inline fun Allocator.PipelineViewportSwizzleStateCreateInfoNV(block: (PipelineViewportSwizzleStateCreateInfoNV) -> Unit) = PipelineViewportSwizzleStateCreateInfoNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceDiscardRectanglePropertiesEXT(block: (PhysicalDeviceDiscardRectanglePropertiesEXT) -> Unit) = PhysicalDeviceDiscardRectanglePropertiesEXT.calloc(this).also(block)

inline fun Allocator.PipelineDiscardRectangleStateCreateInfoEXT(block: (PipelineDiscardRectangleStateCreateInfoEXT) -> Unit) = PipelineDiscardRectangleStateCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(block: (PhysicalDeviceMultiviewPerViewAttributesPropertiesNVX) -> Unit) = PhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.calloc(this).also(block)

inline fun Allocator.InputAttachmentAspectReference(block: (InputAttachmentAspectReference) -> Unit) = InputAttachmentAspectReference.calloc(this).also(block)

inline fun Allocator.InputAttachmentAspectReference(capacity: Int, block: (InputAttachmentAspectReference.Buffer) -> Unit) = InputAttachmentAspectReference.calloc(this, capacity).also(block)

inline fun Allocator.RenderPassInputAttachmentAspectCreateInfo(block: (RenderPassInputAttachmentAspectCreateInfo) -> Unit) = RenderPassInputAttachmentAspectCreateInfo.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceSurfaceInfo2KHR(block: (PhysicalDeviceSurfaceInfo2KHR) -> Unit) = PhysicalDeviceSurfaceInfo2KHR.calloc(this).also(block)

inline fun Allocator.SurfaceCapabilities2KHR(block: (SurfaceCapabilities2KHR) -> Unit) = SurfaceCapabilities2KHR.calloc(this).also(block)

inline fun Allocator.SurfaceFormat2KHR(block: (SurfaceFormat2KHR) -> Unit) = SurfaceFormat2KHR.calloc(this).also(block)

inline fun Allocator.SurfaceFormat2KHR(capacity: Int, block: (SurfaceFormat2KHR.Buffer) -> Unit) = SurfaceFormat2KHR.calloc(this, capacity).also(block)

inline fun Allocator.DisplayProperties2KHR(block: (DisplayProperties2KHR) -> Unit) = DisplayProperties2KHR.calloc(this).also(block)

inline fun Allocator.DisplayProperties2KHR(capacity: Int, block: (DisplayProperties2KHR.Buffer) -> Unit) = DisplayProperties2KHR.calloc(this, capacity).also(block)

inline fun Allocator.DisplayPlaneProperties2KHR(block: (DisplayPlaneProperties2KHR) -> Unit) = DisplayPlaneProperties2KHR.calloc(this).also(block)

inline fun Allocator.DisplayPlaneProperties2KHR(capacity: Int, block: (DisplayPlaneProperties2KHR.Buffer) -> Unit) = DisplayPlaneProperties2KHR.calloc(this, capacity).also(block)

inline fun Allocator.DisplayModeProperties2KHR(block: (DisplayModeProperties2KHR) -> Unit) = DisplayModeProperties2KHR.calloc(this).also(block)

inline fun Allocator.DisplayModeProperties2KHR(capacity: Int, block: (DisplayModeProperties2KHR.Buffer) -> Unit) = DisplayModeProperties2KHR.calloc(this, capacity).also(block)

inline fun Allocator.DisplayPlaneInfo2KHR(block: (DisplayPlaneInfo2KHR) -> Unit) = DisplayPlaneInfo2KHR.calloc(this).also(block)

inline fun Allocator.DisplayPlaneCapabilities2KHR(block: (DisplayPlaneCapabilities2KHR) -> Unit) = DisplayPlaneCapabilities2KHR.calloc(this).also(block)

inline fun Allocator.SharedPresentSurfaceCapabilitiesKHR(block: (SharedPresentSurfaceCapabilitiesKHR) -> Unit) = SharedPresentSurfaceCapabilitiesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDevice16BitStorageFeatures(block: (PhysicalDevice16BitStorageFeatures) -> Unit) = PhysicalDevice16BitStorageFeatures.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceSubgroupProperties(block: (PhysicalDeviceSubgroupProperties) -> Unit) = PhysicalDeviceSubgroupProperties.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShaderSubgroupExtendedTypesFeatures(block: (PhysicalDeviceShaderSubgroupExtendedTypesFeatures) -> Unit) = PhysicalDeviceShaderSubgroupExtendedTypesFeatures.calloc(this).also(block)

inline fun Allocator.BufferMemoryRequirementsInfo2(block: (BufferMemoryRequirementsInfo2) -> Unit) = BufferMemoryRequirementsInfo2.calloc(this).also(block)

inline fun Allocator.ImageMemoryRequirementsInfo2(block: (ImageMemoryRequirementsInfo2) -> Unit) = ImageMemoryRequirementsInfo2.calloc(this).also(block)

inline fun Allocator.ImageSparseMemoryRequirementsInfo2(block: (ImageSparseMemoryRequirementsInfo2) -> Unit) = ImageSparseMemoryRequirementsInfo2.calloc(this).also(block)

inline fun Allocator.MemoryRequirements2(block: (MemoryRequirements2) -> Unit) = MemoryRequirements2.calloc(this).also(block)

inline fun Allocator.SparseImageMemoryRequirements2(block: (SparseImageMemoryRequirements2) -> Unit) = SparseImageMemoryRequirements2.calloc(this).also(block)

inline fun Allocator.SparseImageMemoryRequirements2(capacity: Int, block: (SparseImageMemoryRequirements2.Buffer) -> Unit) = SparseImageMemoryRequirements2.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDevicePointClippingProperties(block: (PhysicalDevicePointClippingProperties) -> Unit) = PhysicalDevicePointClippingProperties.calloc(this).also(block)

inline fun Allocator.MemoryDedicatedRequirements(block: (MemoryDedicatedRequirements) -> Unit) = MemoryDedicatedRequirements.calloc(this).also(block)

inline fun Allocator.MemoryDedicatedAllocateInfo(block: (MemoryDedicatedAllocateInfo) -> Unit) = MemoryDedicatedAllocateInfo.calloc(this).also(block)

inline fun Allocator.ImageViewUsageCreateInfo(block: (ImageViewUsageCreateInfo) -> Unit) = ImageViewUsageCreateInfo.calloc(this).also(block)

inline fun Allocator.PipelineTessellationDomainOriginStateCreateInfo(block: (PipelineTessellationDomainOriginStateCreateInfo) -> Unit) = PipelineTessellationDomainOriginStateCreateInfo.calloc(this).also(block)

inline fun Allocator.SamplerYcbcrConversionInfo(block: (SamplerYcbcrConversionInfo) -> Unit) = SamplerYcbcrConversionInfo.calloc(this).also(block)

inline fun Allocator.SamplerYcbcrConversionCreateInfo(block: (SamplerYcbcrConversionCreateInfo) -> Unit) = SamplerYcbcrConversionCreateInfo.calloc(this).also(block)

inline fun Allocator.BindImagePlaneMemoryInfo(block: (BindImagePlaneMemoryInfo) -> Unit) = BindImagePlaneMemoryInfo.calloc(this).also(block)

inline fun Allocator.ImagePlaneMemoryRequirementsInfo(block: (ImagePlaneMemoryRequirementsInfo) -> Unit) = ImagePlaneMemoryRequirementsInfo.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceSamplerYcbcrConversionFeatures(block: (PhysicalDeviceSamplerYcbcrConversionFeatures) -> Unit) = PhysicalDeviceSamplerYcbcrConversionFeatures.calloc(this).also(block)

inline fun Allocator.SamplerYcbcrConversionImageFormatProperties(block: (SamplerYcbcrConversionImageFormatProperties) -> Unit) = SamplerYcbcrConversionImageFormatProperties.calloc(this).also(block)

inline fun Allocator.TextureLODGatherFormatPropertiesAMD(block: (TextureLODGatherFormatPropertiesAMD) -> Unit) = TextureLODGatherFormatPropertiesAMD.calloc(this).also(block)

inline fun Allocator.ConditionalRenderingBeginInfoEXT(block: (ConditionalRenderingBeginInfoEXT) -> Unit) = ConditionalRenderingBeginInfoEXT.calloc(this).also(block)

inline fun Allocator.ProtectedSubmitInfo(block: (ProtectedSubmitInfo) -> Unit) = ProtectedSubmitInfo.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceProtectedMemoryFeatures(block: (PhysicalDeviceProtectedMemoryFeatures) -> Unit) = PhysicalDeviceProtectedMemoryFeatures.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceProtectedMemoryProperties(block: (PhysicalDeviceProtectedMemoryProperties) -> Unit) = PhysicalDeviceProtectedMemoryProperties.calloc(this).also(block)

inline fun Allocator.DeviceQueueInfo2(block: (DeviceQueueInfo2) -> Unit) = DeviceQueueInfo2.calloc(this).also(block)

inline fun Allocator.PipelineCoverageToColorStateCreateInfoNV(block: (PipelineCoverageToColorStateCreateInfoNV) -> Unit) = PipelineCoverageToColorStateCreateInfoNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceSamplerFilterMinmaxProperties(block: (PhysicalDeviceSamplerFilterMinmaxProperties) -> Unit) = PhysicalDeviceSamplerFilterMinmaxProperties.calloc(this).also(block)

inline fun Allocator.SampleLocationEXT(block: (SampleLocationEXT) -> Unit) = SampleLocationEXT.calloc(this).also(block)

inline fun Allocator.SampleLocationEXT(capacity: Int, block: (SampleLocationEXT.Buffer) -> Unit) = SampleLocationEXT.calloc(this, capacity).also(block)

inline fun Allocator.SampleLocationsInfoEXT(block: (SampleLocationsInfoEXT) -> Unit) = SampleLocationsInfoEXT.calloc(this).also(block)

inline fun Allocator.AttachmentSampleLocationsEXT(block: (AttachmentSampleLocationsEXT) -> Unit) = AttachmentSampleLocationsEXT.calloc(this).also(block)

inline fun Allocator.AttachmentSampleLocationsEXT(capacity: Int, block: (AttachmentSampleLocationsEXT.Buffer) -> Unit) = AttachmentSampleLocationsEXT.calloc(this, capacity).also(block)

inline fun Allocator.SubpassSampleLocationsEXT(block: (SubpassSampleLocationsEXT) -> Unit) = SubpassSampleLocationsEXT.calloc(this).also(block)

inline fun Allocator.SubpassSampleLocationsEXT(capacity: Int, block: (SubpassSampleLocationsEXT.Buffer) -> Unit) = SubpassSampleLocationsEXT.calloc(this, capacity).also(block)

inline fun Allocator.RenderPassSampleLocationsBeginInfoEXT(block: (RenderPassSampleLocationsBeginInfoEXT) -> Unit) = RenderPassSampleLocationsBeginInfoEXT.calloc(this).also(block)

inline fun Allocator.PipelineSampleLocationsStateCreateInfoEXT(block: (PipelineSampleLocationsStateCreateInfoEXT) -> Unit) = PipelineSampleLocationsStateCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceSampleLocationsPropertiesEXT(block: (PhysicalDeviceSampleLocationsPropertiesEXT) -> Unit) = PhysicalDeviceSampleLocationsPropertiesEXT.calloc(this).also(block)

inline fun Allocator.MultisamplePropertiesEXT(block: (MultisamplePropertiesEXT) -> Unit) = MultisamplePropertiesEXT.calloc(this).also(block)

inline fun Allocator.SamplerReductionModeCreateInfo(block: (SamplerReductionModeCreateInfo) -> Unit) = SamplerReductionModeCreateInfo.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceBlendOperationAdvancedFeaturesEXT(block: (PhysicalDeviceBlendOperationAdvancedFeaturesEXT) -> Unit) = PhysicalDeviceBlendOperationAdvancedFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceBlendOperationAdvancedPropertiesEXT(block: (PhysicalDeviceBlendOperationAdvancedPropertiesEXT) -> Unit) = PhysicalDeviceBlendOperationAdvancedPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PipelineColorBlendAdvancedStateCreateInfoEXT(block: (PipelineColorBlendAdvancedStateCreateInfoEXT) -> Unit) = PipelineColorBlendAdvancedStateCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceInlineUniformBlockFeaturesEXT(block: (PhysicalDeviceInlineUniformBlockFeaturesEXT) -> Unit) = PhysicalDeviceInlineUniformBlockFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceInlineUniformBlockPropertiesEXT(block: (PhysicalDeviceInlineUniformBlockPropertiesEXT) -> Unit) = PhysicalDeviceInlineUniformBlockPropertiesEXT.calloc(this).also(block)

inline fun Allocator.WriteDescriptorSetInlineUniformBlockEXT(block: (WriteDescriptorSetInlineUniformBlockEXT) -> Unit) = WriteDescriptorSetInlineUniformBlockEXT.calloc(this).also(block)

inline fun Allocator.DescriptorPoolInlineUniformBlockCreateInfoEXT(block: (DescriptorPoolInlineUniformBlockCreateInfoEXT) -> Unit) = DescriptorPoolInlineUniformBlockCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PipelineCoverageModulationStateCreateInfoNV(block: (PipelineCoverageModulationStateCreateInfoNV) -> Unit) = PipelineCoverageModulationStateCreateInfoNV.calloc(this).also(block)

inline fun Allocator.ImageFormatListCreateInfo(block: (ImageFormatListCreateInfo) -> Unit) = ImageFormatListCreateInfo.calloc(this).also(block)

inline fun Allocator.ValidationCacheCreateInfoEXT(block: (ValidationCacheCreateInfoEXT) -> Unit) = ValidationCacheCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.ShaderModuleValidationCacheCreateInfoEXT(block: (ShaderModuleValidationCacheCreateInfoEXT) -> Unit) = ShaderModuleValidationCacheCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceMaintenance3Properties(block: (PhysicalDeviceMaintenance3Properties) -> Unit) = PhysicalDeviceMaintenance3Properties.calloc(this).also(block)

inline fun Allocator.DescriptorSetLayoutSupport(block: (DescriptorSetLayoutSupport) -> Unit) = DescriptorSetLayoutSupport.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShaderDrawParametersFeatures(block: (PhysicalDeviceShaderDrawParametersFeatures) -> Unit) = PhysicalDeviceShaderDrawParametersFeatures.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShaderFloat16Int8Features(block: (PhysicalDeviceShaderFloat16Int8Features) -> Unit) = PhysicalDeviceShaderFloat16Int8Features.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFloatControlsProperties(block: (PhysicalDeviceFloatControlsProperties) -> Unit) = PhysicalDeviceFloatControlsProperties.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceHostQueryResetFeatures(block: (PhysicalDeviceHostQueryResetFeatures) -> Unit) = PhysicalDeviceHostQueryResetFeatures.calloc(this).also(block)

inline fun Allocator.NativeBufferUsage2ANDROID(block: (NativeBufferUsage2ANDROID) -> Unit) = NativeBufferUsage2ANDROID.calloc(this).also(block)

inline fun Allocator.NativeBufferANDROID(block: (NativeBufferANDROID) -> Unit) = NativeBufferANDROID.calloc(this).also(block)

inline fun Allocator.SwapchainImageCreateInfoANDROID(block: (SwapchainImageCreateInfoANDROID) -> Unit) = SwapchainImageCreateInfoANDROID.calloc(this).also(block)

inline fun Allocator.PhysicalDevicePresentationPropertiesANDROID(block: (PhysicalDevicePresentationPropertiesANDROID) -> Unit) = PhysicalDevicePresentationPropertiesANDROID.calloc(this).also(block)

inline fun Allocator.ShaderResourceUsageAMD(block: (ShaderResourceUsageAMD) -> Unit) = ShaderResourceUsageAMD.calloc(this).also(block)

inline fun Allocator.ShaderStatisticsInfoAMD(block: (ShaderStatisticsInfoAMD) -> Unit) = ShaderStatisticsInfoAMD.calloc(this).also(block)

inline fun Allocator.DeviceQueueGlobalPriorityCreateInfoEXT(block: (DeviceQueueGlobalPriorityCreateInfoEXT) -> Unit) = DeviceQueueGlobalPriorityCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.DebugUtilsObjectNameInfoEXT(block: (DebugUtilsObjectNameInfoEXT) -> Unit) = DebugUtilsObjectNameInfoEXT.calloc(this).also(block)

inline fun Allocator.DebugUtilsObjectNameInfoEXT(capacity: Int, block: (DebugUtilsObjectNameInfoEXT.Buffer) -> Unit) = DebugUtilsObjectNameInfoEXT.calloc(this, capacity).also(block)

inline fun Allocator.DebugUtilsObjectTagInfoEXT(block: (DebugUtilsObjectTagInfoEXT) -> Unit) = DebugUtilsObjectTagInfoEXT.calloc(this).also(block)

inline fun Allocator.DebugUtilsLabelEXT(block: (DebugUtilsLabelEXT) -> Unit) = DebugUtilsLabelEXT.calloc(this).also(block)

inline fun Allocator.DebugUtilsLabelEXT(capacity: Int, block: (DebugUtilsLabelEXT.Buffer) -> Unit) = DebugUtilsLabelEXT.calloc(this, capacity).also(block)

inline fun Allocator.DebugUtilsMessengerCreateInfoEXT(block: (DebugUtilsMessengerCreateInfoEXT) -> Unit) = DebugUtilsMessengerCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.DebugUtilsMessengerCallbackDataEXT(block: (DebugUtilsMessengerCallbackDataEXT) -> Unit) = DebugUtilsMessengerCallbackDataEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceDeviceMemoryReportFeaturesEXT(block: (PhysicalDeviceDeviceMemoryReportFeaturesEXT) -> Unit) = PhysicalDeviceDeviceMemoryReportFeaturesEXT.calloc(this).also(block)

inline fun Allocator.DeviceDeviceMemoryReportCreateInfoEXT(block: (DeviceDeviceMemoryReportCreateInfoEXT) -> Unit) = DeviceDeviceMemoryReportCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.DeviceMemoryReportCallbackDataEXT(block: (DeviceMemoryReportCallbackDataEXT) -> Unit) = DeviceMemoryReportCallbackDataEXT.calloc(this).also(block)

inline fun Allocator.ImportMemoryHostPointerInfoEXT(block: (ImportMemoryHostPointerInfoEXT) -> Unit) = ImportMemoryHostPointerInfoEXT.calloc(this).also(block)

inline fun Allocator.MemoryHostPointerPropertiesEXT(block: (MemoryHostPointerPropertiesEXT) -> Unit) = MemoryHostPointerPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceExternalMemoryHostPropertiesEXT(block: (PhysicalDeviceExternalMemoryHostPropertiesEXT) -> Unit) = PhysicalDeviceExternalMemoryHostPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceConservativeRasterizationPropertiesEXT(block: (PhysicalDeviceConservativeRasterizationPropertiesEXT) -> Unit) = PhysicalDeviceConservativeRasterizationPropertiesEXT.calloc(this).also(block)

inline fun Allocator.CalibratedTimestampInfoEXT(block: (CalibratedTimestampInfoEXT) -> Unit) = CalibratedTimestampInfoEXT.calloc(this).also(block)

inline fun Allocator.CalibratedTimestampInfoEXT(capacity: Int, block: (CalibratedTimestampInfoEXT.Buffer) -> Unit) = CalibratedTimestampInfoEXT.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceShaderCorePropertiesAMD(block: (PhysicalDeviceShaderCorePropertiesAMD) -> Unit) = PhysicalDeviceShaderCorePropertiesAMD.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShaderCoreProperties2AMD(block: (PhysicalDeviceShaderCoreProperties2AMD) -> Unit) = PhysicalDeviceShaderCoreProperties2AMD.calloc(this).also(block)

inline fun Allocator.PipelineRasterizationConservativeStateCreateInfoEXT(block: (PipelineRasterizationConservativeStateCreateInfoEXT) -> Unit) = PipelineRasterizationConservativeStateCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceDescriptorIndexingFeatures(block: (PhysicalDeviceDescriptorIndexingFeatures) -> Unit) = PhysicalDeviceDescriptorIndexingFeatures.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceDescriptorIndexingProperties(block: (PhysicalDeviceDescriptorIndexingProperties) -> Unit) = PhysicalDeviceDescriptorIndexingProperties.calloc(this).also(block)

inline fun Allocator.DescriptorSetLayoutBindingFlagsCreateInfo(block: (DescriptorSetLayoutBindingFlagsCreateInfo) -> Unit) = DescriptorSetLayoutBindingFlagsCreateInfo.calloc(this).also(block)

inline fun Allocator.DescriptorSetVariableDescriptorCountAllocateInfo(block: (DescriptorSetVariableDescriptorCountAllocateInfo) -> Unit) = DescriptorSetVariableDescriptorCountAllocateInfo.calloc(this).also(block)

inline fun Allocator.DescriptorSetVariableDescriptorCountLayoutSupport(block: (DescriptorSetVariableDescriptorCountLayoutSupport) -> Unit) = DescriptorSetVariableDescriptorCountLayoutSupport.calloc(this).also(block)

inline fun Allocator.AttachmentDescription2(block: (AttachmentDescription2) -> Unit) = AttachmentDescription2.calloc(this).also(block)

inline fun Allocator.AttachmentDescription2(capacity: Int, block: (AttachmentDescription2.Buffer) -> Unit) = AttachmentDescription2.calloc(this, capacity).also(block)

inline fun Allocator.AttachmentReference2(block: (AttachmentReference2) -> Unit) = AttachmentReference2.calloc(this).also(block)

inline fun Allocator.AttachmentReference2(capacity: Int, block: (AttachmentReference2.Buffer) -> Unit) = AttachmentReference2.calloc(this, capacity).also(block)

inline fun Allocator.SubpassDescription2(block: (SubpassDescription2) -> Unit) = SubpassDescription2.calloc(this).also(block)

inline fun Allocator.SubpassDescription2(capacity: Int, block: (SubpassDescription2.Buffer) -> Unit) = SubpassDescription2.calloc(this, capacity).also(block)

inline fun Allocator.SubpassDependency2(block: (SubpassDependency2) -> Unit) = SubpassDependency2.calloc(this).also(block)

inline fun Allocator.SubpassDependency2(capacity: Int, block: (SubpassDependency2.Buffer) -> Unit) = SubpassDependency2.calloc(this, capacity).also(block)

inline fun Allocator.RenderPassCreateInfo2(block: (RenderPassCreateInfo2) -> Unit) = RenderPassCreateInfo2.calloc(this).also(block)

inline fun Allocator.SubpassBeginInfo(block: (SubpassBeginInfo) -> Unit) = SubpassBeginInfo.calloc(this).also(block)

inline fun Allocator.SubpassEndInfo(block: (SubpassEndInfo) -> Unit) = SubpassEndInfo.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceTimelineSemaphoreFeatures(block: (PhysicalDeviceTimelineSemaphoreFeatures) -> Unit) = PhysicalDeviceTimelineSemaphoreFeatures.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceTimelineSemaphoreProperties(block: (PhysicalDeviceTimelineSemaphoreProperties) -> Unit) = PhysicalDeviceTimelineSemaphoreProperties.calloc(this).also(block)

inline fun Allocator.SemaphoreTypeCreateInfo(block: (SemaphoreTypeCreateInfo) -> Unit) = SemaphoreTypeCreateInfo.calloc(this).also(block)

inline fun Allocator.TimelineSemaphoreSubmitInfo(block: (TimelineSemaphoreSubmitInfo) -> Unit) = TimelineSemaphoreSubmitInfo.calloc(this).also(block)

inline fun Allocator.SemaphoreWaitInfo(block: (SemaphoreWaitInfo) -> Unit) = SemaphoreWaitInfo.calloc(this).also(block)

inline fun Allocator.SemaphoreSignalInfo(block: (SemaphoreSignalInfo) -> Unit) = SemaphoreSignalInfo.calloc(this).also(block)

inline fun Allocator.VertexInputBindingDivisorDescriptionEXT(block: (VertexInputBindingDivisorDescriptionEXT) -> Unit) = VertexInputBindingDivisorDescriptionEXT.calloc(this).also(block)

inline fun Allocator.VertexInputBindingDivisorDescriptionEXT(capacity: Int, block: (VertexInputBindingDivisorDescriptionEXT.Buffer) -> Unit) = VertexInputBindingDivisorDescriptionEXT.calloc(this, capacity).also(block)

inline fun Allocator.PipelineVertexInputDivisorStateCreateInfoEXT(block: (PipelineVertexInputDivisorStateCreateInfoEXT) -> Unit) = PipelineVertexInputDivisorStateCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceVertexAttributeDivisorPropertiesEXT(block: (PhysicalDeviceVertexAttributeDivisorPropertiesEXT) -> Unit) = PhysicalDeviceVertexAttributeDivisorPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDevicePCIBusInfoPropertiesEXT(block: (PhysicalDevicePCIBusInfoPropertiesEXT) -> Unit) = PhysicalDevicePCIBusInfoPropertiesEXT.calloc(this).also(block)

inline fun Allocator.ImportAndroidHardwareBufferInfoANDROID(block: (ImportAndroidHardwareBufferInfoANDROID) -> Unit) = ImportAndroidHardwareBufferInfoANDROID.calloc(this).also(block)

inline fun Allocator.AndroidHardwareBufferUsageANDROID(block: (AndroidHardwareBufferUsageANDROID) -> Unit) = AndroidHardwareBufferUsageANDROID.calloc(this).also(block)

inline fun Allocator.AndroidHardwareBufferPropertiesANDROID(block: (AndroidHardwareBufferPropertiesANDROID) -> Unit) = AndroidHardwareBufferPropertiesANDROID.calloc(this).also(block)

inline fun Allocator.MemoryGetAndroidHardwareBufferInfoANDROID(block: (MemoryGetAndroidHardwareBufferInfoANDROID) -> Unit) = MemoryGetAndroidHardwareBufferInfoANDROID.calloc(this).also(block)

inline fun Allocator.AndroidHardwareBufferFormatPropertiesANDROID(block: (AndroidHardwareBufferFormatPropertiesANDROID) -> Unit) = AndroidHardwareBufferFormatPropertiesANDROID.calloc(this).also(block)

inline fun Allocator.CommandBufferInheritanceConditionalRenderingInfoEXT(block: (CommandBufferInheritanceConditionalRenderingInfoEXT) -> Unit) = CommandBufferInheritanceConditionalRenderingInfoEXT.calloc(this).also(block)

inline fun Allocator.ExternalFormatANDROID(block: (ExternalFormatANDROID) -> Unit) = ExternalFormatANDROID.calloc(this).also(block)

inline fun Allocator.PhysicalDevice8BitStorageFeatures(block: (PhysicalDevice8BitStorageFeatures) -> Unit) = PhysicalDevice8BitStorageFeatures.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceConditionalRenderingFeaturesEXT(block: (PhysicalDeviceConditionalRenderingFeaturesEXT) -> Unit) = PhysicalDeviceConditionalRenderingFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceVulkanMemoryModelFeatures(block: (PhysicalDeviceVulkanMemoryModelFeatures) -> Unit) = PhysicalDeviceVulkanMemoryModelFeatures.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShaderAtomicInt64Features(block: (PhysicalDeviceShaderAtomicInt64Features) -> Unit) = PhysicalDeviceShaderAtomicInt64Features.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShaderAtomicFloatFeaturesEXT(block: (PhysicalDeviceShaderAtomicFloatFeaturesEXT) -> Unit) = PhysicalDeviceShaderAtomicFloatFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceVertexAttributeDivisorFeaturesEXT(block: (PhysicalDeviceVertexAttributeDivisorFeaturesEXT) -> Unit) = PhysicalDeviceVertexAttributeDivisorFeaturesEXT.calloc(this).also(block)

inline fun Allocator.QueueFamilyCheckpointPropertiesNV(block: (QueueFamilyCheckpointPropertiesNV) -> Unit) = QueueFamilyCheckpointPropertiesNV.calloc(this).also(block)

inline fun Allocator.CheckpointDataNV(block: (CheckpointDataNV) -> Unit) = CheckpointDataNV.calloc(this).also(block)

inline fun Allocator.CheckpointDataNV(capacity: Int, block: (CheckpointDataNV.Buffer) -> Unit) = CheckpointDataNV.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceDepthStencilResolveProperties(block: (PhysicalDeviceDepthStencilResolveProperties) -> Unit) = PhysicalDeviceDepthStencilResolveProperties.calloc(this).also(block)

inline fun Allocator.SubpassDescriptionDepthStencilResolve(block: (SubpassDescriptionDepthStencilResolve) -> Unit) = SubpassDescriptionDepthStencilResolve.calloc(this).also(block)

inline fun Allocator.ImageViewASTCDecodeModeEXT(block: (ImageViewASTCDecodeModeEXT) -> Unit) = ImageViewASTCDecodeModeEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceASTCDecodeFeaturesEXT(block: (PhysicalDeviceASTCDecodeFeaturesEXT) -> Unit) = PhysicalDeviceASTCDecodeFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceTransformFeedbackFeaturesEXT(block: (PhysicalDeviceTransformFeedbackFeaturesEXT) -> Unit) = PhysicalDeviceTransformFeedbackFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceTransformFeedbackPropertiesEXT(block: (PhysicalDeviceTransformFeedbackPropertiesEXT) -> Unit) = PhysicalDeviceTransformFeedbackPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PipelineRasterizationStateStreamCreateInfoEXT(block: (PipelineRasterizationStateStreamCreateInfoEXT) -> Unit) = PipelineRasterizationStateStreamCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceRepresentativeFragmentTestFeaturesNV(block: (PhysicalDeviceRepresentativeFragmentTestFeaturesNV) -> Unit) = PhysicalDeviceRepresentativeFragmentTestFeaturesNV.calloc(this).also(block)

inline fun Allocator.PipelineRepresentativeFragmentTestStateCreateInfoNV(block: (PipelineRepresentativeFragmentTestStateCreateInfoNV) -> Unit) = PipelineRepresentativeFragmentTestStateCreateInfoNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceExclusiveScissorFeaturesNV(block: (PhysicalDeviceExclusiveScissorFeaturesNV) -> Unit) = PhysicalDeviceExclusiveScissorFeaturesNV.calloc(this).also(block)

inline fun Allocator.PipelineViewportExclusiveScissorStateCreateInfoNV(block: (PipelineViewportExclusiveScissorStateCreateInfoNV) -> Unit) = PipelineViewportExclusiveScissorStateCreateInfoNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceCornerSampledImageFeaturesNV(block: (PhysicalDeviceCornerSampledImageFeaturesNV) -> Unit) = PhysicalDeviceCornerSampledImageFeaturesNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceComputeShaderDerivativesFeaturesNV(block: (PhysicalDeviceComputeShaderDerivativesFeaturesNV) -> Unit) = PhysicalDeviceComputeShaderDerivativesFeaturesNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentShaderBarycentricFeaturesNV(block: (PhysicalDeviceFragmentShaderBarycentricFeaturesNV) -> Unit) = PhysicalDeviceFragmentShaderBarycentricFeaturesNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShaderImageFootprintFeaturesNV(block: (PhysicalDeviceShaderImageFootprintFeaturesNV) -> Unit) = PhysicalDeviceShaderImageFootprintFeaturesNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(block: (PhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV) -> Unit) = PhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.calloc(this).also(block)

inline fun Allocator.ShadingRatePaletteNV(block: (ShadingRatePaletteNV) -> Unit) = ShadingRatePaletteNV.calloc(this).also(block)

inline fun Allocator.ShadingRatePaletteNV(capacity: Int, block: (ShadingRatePaletteNV.Buffer) -> Unit) = ShadingRatePaletteNV.calloc(this, capacity).also(block)

inline fun Allocator.PipelineViewportShadingRateImageStateCreateInfoNV(block: (PipelineViewportShadingRateImageStateCreateInfoNV) -> Unit) = PipelineViewportShadingRateImageStateCreateInfoNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShadingRateImageFeaturesNV(block: (PhysicalDeviceShadingRateImageFeaturesNV) -> Unit) = PhysicalDeviceShadingRateImageFeaturesNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShadingRateImagePropertiesNV(block: (PhysicalDeviceShadingRateImagePropertiesNV) -> Unit) = PhysicalDeviceShadingRateImagePropertiesNV.calloc(this).also(block)

inline fun Allocator.CoarseSampleLocationNV(block: (CoarseSampleLocationNV) -> Unit) = CoarseSampleLocationNV.calloc(this).also(block)

inline fun Allocator.CoarseSampleLocationNV(capacity: Int, block: (CoarseSampleLocationNV.Buffer) -> Unit) = CoarseSampleLocationNV.calloc(this, capacity).also(block)

inline fun Allocator.CoarseSampleOrderCustomNV(block: (CoarseSampleOrderCustomNV) -> Unit) = CoarseSampleOrderCustomNV.calloc(this).also(block)

inline fun Allocator.CoarseSampleOrderCustomNV(capacity: Int, block: (CoarseSampleOrderCustomNV.Buffer) -> Unit) = CoarseSampleOrderCustomNV.calloc(this, capacity).also(block)

inline fun Allocator.PipelineViewportCoarseSampleOrderStateCreateInfoNV(block: (PipelineViewportCoarseSampleOrderStateCreateInfoNV) -> Unit) = PipelineViewportCoarseSampleOrderStateCreateInfoNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceMeshShaderFeaturesNV(block: (PhysicalDeviceMeshShaderFeaturesNV) -> Unit) = PhysicalDeviceMeshShaderFeaturesNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceMeshShaderPropertiesNV(block: (PhysicalDeviceMeshShaderPropertiesNV) -> Unit) = PhysicalDeviceMeshShaderPropertiesNV.calloc(this).also(block)

inline fun Allocator.DrawMeshTasksIndirectCommandNV(block: (DrawMeshTasksIndirectCommandNV) -> Unit) = DrawMeshTasksIndirectCommandNV.calloc(this).also(block)

inline fun Allocator.RayTracingShaderGroupCreateInfoNV(block: (RayTracingShaderGroupCreateInfoNV) -> Unit) = RayTracingShaderGroupCreateInfoNV.calloc(this).also(block)

inline fun Allocator.RayTracingShaderGroupCreateInfoNV(capacity: Int, block: (RayTracingShaderGroupCreateInfoNV.Buffer) -> Unit) = RayTracingShaderGroupCreateInfoNV.calloc(this, capacity).also(block)

inline fun Allocator.RayTracingShaderGroupCreateInfoKHR(block: (RayTracingShaderGroupCreateInfoKHR) -> Unit) = RayTracingShaderGroupCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.RayTracingShaderGroupCreateInfoKHR(capacity: Int, block: (RayTracingShaderGroupCreateInfoKHR.Buffer) -> Unit) = RayTracingShaderGroupCreateInfoKHR.calloc(this, capacity).also(block)

inline fun Allocator.RayTracingPipelineCreateInfoNV(block: (RayTracingPipelineCreateInfoNV) -> Unit) = RayTracingPipelineCreateInfoNV.calloc(this).also(block)

inline fun Allocator.RayTracingPipelineCreateInfoNV(capacity: Int, block: (RayTracingPipelineCreateInfoNV.Buffer) -> Unit) = RayTracingPipelineCreateInfoNV.calloc(this, capacity).also(block)

inline fun Allocator.RayTracingPipelineCreateInfoKHR(block: (RayTracingPipelineCreateInfoKHR) -> Unit) = RayTracingPipelineCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.RayTracingPipelineCreateInfoKHR(capacity: Int, block: (RayTracingPipelineCreateInfoKHR.Buffer) -> Unit) = RayTracingPipelineCreateInfoKHR.calloc(this, capacity).also(block)

inline fun Allocator.GeometryTrianglesNV(block: (GeometryTrianglesNV) -> Unit) = GeometryTrianglesNV.calloc(this).also(block)

inline fun Allocator.GeometryAABBNV(block: (GeometryAABBNV) -> Unit) = GeometryAABBNV.calloc(this).also(block)

inline fun Allocator.GeometryDataNV(block: (GeometryDataNV) -> Unit) = GeometryDataNV.calloc(this).also(block)

inline fun Allocator.GeometryNV(block: (GeometryNV) -> Unit) = GeometryNV.calloc(this).also(block)

inline fun Allocator.GeometryNV(capacity: Int, block: (GeometryNV.Buffer) -> Unit) = GeometryNV.calloc(this, capacity).also(block)

inline fun Allocator.AccelerationStructureInfoNV(block: (AccelerationStructureInfoNV) -> Unit) = AccelerationStructureInfoNV.calloc(this).also(block)

inline fun Allocator.AccelerationStructureCreateInfoNV(block: (AccelerationStructureCreateInfoNV) -> Unit) = AccelerationStructureCreateInfoNV.calloc(this).also(block)

inline fun Allocator.BindAccelerationStructureMemoryInfoNV(block: (BindAccelerationStructureMemoryInfoNV) -> Unit) = BindAccelerationStructureMemoryInfoNV.calloc(this).also(block)

inline fun Allocator.BindAccelerationStructureMemoryInfoNV(capacity: Int, block: (BindAccelerationStructureMemoryInfoNV.Buffer) -> Unit) = BindAccelerationStructureMemoryInfoNV.calloc(this, capacity).also(block)

inline fun Allocator.WriteDescriptorSetAccelerationStructureKHR(block: (WriteDescriptorSetAccelerationStructureKHR) -> Unit) = WriteDescriptorSetAccelerationStructureKHR.calloc(this).also(block)

inline fun Allocator.WriteDescriptorSetAccelerationStructureNV(block: (WriteDescriptorSetAccelerationStructureNV) -> Unit) = WriteDescriptorSetAccelerationStructureNV.calloc(this).also(block)

inline fun Allocator.AccelerationStructureMemoryRequirementsInfoNV(block: (AccelerationStructureMemoryRequirementsInfoNV) -> Unit) = AccelerationStructureMemoryRequirementsInfoNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceAccelerationStructureFeaturesKHR(block: (PhysicalDeviceAccelerationStructureFeaturesKHR) -> Unit) = PhysicalDeviceAccelerationStructureFeaturesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceRayTracingPipelineFeaturesKHR(block: (PhysicalDeviceRayTracingPipelineFeaturesKHR) -> Unit) = PhysicalDeviceRayTracingPipelineFeaturesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceRayQueryFeaturesKHR(block: (PhysicalDeviceRayQueryFeaturesKHR) -> Unit) = PhysicalDeviceRayQueryFeaturesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceAccelerationStructurePropertiesKHR(block: (PhysicalDeviceAccelerationStructurePropertiesKHR) -> Unit) = PhysicalDeviceAccelerationStructurePropertiesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceRayTracingPipelinePropertiesKHR(block: (PhysicalDeviceRayTracingPipelinePropertiesKHR) -> Unit) = PhysicalDeviceRayTracingPipelinePropertiesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceRayTracingPropertiesNV(block: (PhysicalDeviceRayTracingPropertiesNV) -> Unit) = PhysicalDeviceRayTracingPropertiesNV.calloc(this).also(block)

inline fun Allocator.StridedDeviceAddressRegionKHR(block: (StridedDeviceAddressRegionKHR) -> Unit) = StridedDeviceAddressRegionKHR.calloc(this).also(block)

inline fun Allocator.TraceRaysIndirectCommandKHR(block: (TraceRaysIndirectCommandKHR) -> Unit) = TraceRaysIndirectCommandKHR.calloc(this).also(block)

inline fun Allocator.DrmFormatModifierPropertiesListEXT(block: (DrmFormatModifierPropertiesListEXT) -> Unit) = DrmFormatModifierPropertiesListEXT.calloc(this).also(block)

inline fun Allocator.DrmFormatModifierPropertiesEXT(block: (DrmFormatModifierPropertiesEXT) -> Unit) = DrmFormatModifierPropertiesEXT.calloc(this).also(block)

inline fun Allocator.DrmFormatModifierPropertiesEXT(capacity: Int, block: (DrmFormatModifierPropertiesEXT.Buffer) -> Unit) = DrmFormatModifierPropertiesEXT.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceImageDrmFormatModifierInfoEXT(block: (PhysicalDeviceImageDrmFormatModifierInfoEXT) -> Unit) = PhysicalDeviceImageDrmFormatModifierInfoEXT.calloc(this).also(block)

inline fun Allocator.ImageDrmFormatModifierListCreateInfoEXT(block: (ImageDrmFormatModifierListCreateInfoEXT) -> Unit) = ImageDrmFormatModifierListCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.ImageDrmFormatModifierExplicitCreateInfoEXT(block: (ImageDrmFormatModifierExplicitCreateInfoEXT) -> Unit) = ImageDrmFormatModifierExplicitCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.ImageDrmFormatModifierPropertiesEXT(block: (ImageDrmFormatModifierPropertiesEXT) -> Unit) = ImageDrmFormatModifierPropertiesEXT.calloc(this).also(block)

inline fun Allocator.ImageStencilUsageCreateInfo(block: (ImageStencilUsageCreateInfo) -> Unit) = ImageStencilUsageCreateInfo.calloc(this).also(block)

inline fun Allocator.DeviceMemoryOverallocationCreateInfoAMD(block: (DeviceMemoryOverallocationCreateInfoAMD) -> Unit) = DeviceMemoryOverallocationCreateInfoAMD.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentDensityMapFeaturesEXT(block: (PhysicalDeviceFragmentDensityMapFeaturesEXT) -> Unit) = PhysicalDeviceFragmentDensityMapFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentDensityMap2FeaturesEXT(block: (PhysicalDeviceFragmentDensityMap2FeaturesEXT) -> Unit) = PhysicalDeviceFragmentDensityMap2FeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentDensityMapPropertiesEXT(block: (PhysicalDeviceFragmentDensityMapPropertiesEXT) -> Unit) = PhysicalDeviceFragmentDensityMapPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentDensityMap2PropertiesEXT(block: (PhysicalDeviceFragmentDensityMap2PropertiesEXT) -> Unit) = PhysicalDeviceFragmentDensityMap2PropertiesEXT.calloc(this).also(block)

inline fun Allocator.RenderPassFragmentDensityMapCreateInfoEXT(block: (RenderPassFragmentDensityMapCreateInfoEXT) -> Unit) = RenderPassFragmentDensityMapCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceScalarBlockLayoutFeatures(block: (PhysicalDeviceScalarBlockLayoutFeatures) -> Unit) = PhysicalDeviceScalarBlockLayoutFeatures.calloc(this).also(block)

inline fun Allocator.SurfaceProtectedCapabilitiesKHR(block: (SurfaceProtectedCapabilitiesKHR) -> Unit) = SurfaceProtectedCapabilitiesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceUniformBufferStandardLayoutFeatures(block: (PhysicalDeviceUniformBufferStandardLayoutFeatures) -> Unit) = PhysicalDeviceUniformBufferStandardLayoutFeatures.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceDepthClipEnableFeaturesEXT(block: (PhysicalDeviceDepthClipEnableFeaturesEXT) -> Unit) = PhysicalDeviceDepthClipEnableFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PipelineRasterizationDepthClipStateCreateInfoEXT(block: (PipelineRasterizationDepthClipStateCreateInfoEXT) -> Unit) = PipelineRasterizationDepthClipStateCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceMemoryBudgetPropertiesEXT(block: (PhysicalDeviceMemoryBudgetPropertiesEXT) -> Unit) = PhysicalDeviceMemoryBudgetPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceMemoryPriorityFeaturesEXT(block: (PhysicalDeviceMemoryPriorityFeaturesEXT) -> Unit) = PhysicalDeviceMemoryPriorityFeaturesEXT.calloc(this).also(block)

inline fun Allocator.MemoryPriorityAllocateInfoEXT(block: (MemoryPriorityAllocateInfoEXT) -> Unit) = MemoryPriorityAllocateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceBufferDeviceAddressFeatures(block: (PhysicalDeviceBufferDeviceAddressFeatures) -> Unit) = PhysicalDeviceBufferDeviceAddressFeatures.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceBufferDeviceAddressFeaturesEXT(block: (PhysicalDeviceBufferDeviceAddressFeaturesEXT) -> Unit) = PhysicalDeviceBufferDeviceAddressFeaturesEXT.calloc(this).also(block)

inline fun Allocator.BufferDeviceAddressInfo(block: (BufferDeviceAddressInfo) -> Unit) = BufferDeviceAddressInfo.calloc(this).also(block)

inline fun Allocator.BufferOpaqueCaptureAddressCreateInfo(block: (BufferOpaqueCaptureAddressCreateInfo) -> Unit) = BufferOpaqueCaptureAddressCreateInfo.calloc(this).also(block)

inline fun Allocator.BufferDeviceAddressCreateInfoEXT(block: (BufferDeviceAddressCreateInfoEXT) -> Unit) = BufferDeviceAddressCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceImageViewImageFormatInfoEXT(block: (PhysicalDeviceImageViewImageFormatInfoEXT) -> Unit) = PhysicalDeviceImageViewImageFormatInfoEXT.calloc(this).also(block)

inline fun Allocator.FilterCubicImageViewImageFormatPropertiesEXT(block: (FilterCubicImageViewImageFormatPropertiesEXT) -> Unit) = FilterCubicImageViewImageFormatPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceImagelessFramebufferFeatures(block: (PhysicalDeviceImagelessFramebufferFeatures) -> Unit) = PhysicalDeviceImagelessFramebufferFeatures.calloc(this).also(block)

inline fun Allocator.FramebufferAttachmentsCreateInfo(block: (FramebufferAttachmentsCreateInfo) -> Unit) = FramebufferAttachmentsCreateInfo.calloc(this).also(block)

inline fun Allocator.FramebufferAttachmentImageInfo(block: (FramebufferAttachmentImageInfo) -> Unit) = FramebufferAttachmentImageInfo.calloc(this).also(block)

inline fun Allocator.FramebufferAttachmentImageInfo(capacity: Int, block: (FramebufferAttachmentImageInfo.Buffer) -> Unit) = FramebufferAttachmentImageInfo.calloc(this, capacity).also(block)

inline fun Allocator.RenderPassAttachmentBeginInfo(block: (RenderPassAttachmentBeginInfo) -> Unit) = RenderPassAttachmentBeginInfo.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(block: (PhysicalDeviceTextureCompressionASTCHDRFeaturesEXT) -> Unit) = PhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceCooperativeMatrixFeaturesNV(block: (PhysicalDeviceCooperativeMatrixFeaturesNV) -> Unit) = PhysicalDeviceCooperativeMatrixFeaturesNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceCooperativeMatrixPropertiesNV(block: (PhysicalDeviceCooperativeMatrixPropertiesNV) -> Unit) = PhysicalDeviceCooperativeMatrixPropertiesNV.calloc(this).also(block)

inline fun Allocator.CooperativeMatrixPropertiesNV(block: (CooperativeMatrixPropertiesNV) -> Unit) = CooperativeMatrixPropertiesNV.calloc(this).also(block)

inline fun Allocator.CooperativeMatrixPropertiesNV(capacity: Int, block: (CooperativeMatrixPropertiesNV.Buffer) -> Unit) = CooperativeMatrixPropertiesNV.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceYcbcrImageArraysFeaturesEXT(block: (PhysicalDeviceYcbcrImageArraysFeaturesEXT) -> Unit) = PhysicalDeviceYcbcrImageArraysFeaturesEXT.calloc(this).also(block)

inline fun Allocator.ImageViewHandleInfoNVX(block: (ImageViewHandleInfoNVX) -> Unit) = ImageViewHandleInfoNVX.calloc(this).also(block)

inline fun Allocator.ImageViewAddressPropertiesNVX(block: (ImageViewAddressPropertiesNVX) -> Unit) = ImageViewAddressPropertiesNVX.calloc(this).also(block)

inline fun Allocator.PresentFrameTokenGGP(block: (PresentFrameTokenGGP) -> Unit) = PresentFrameTokenGGP.calloc(this).also(block)

inline fun Allocator.PipelineCreationFeedbackEXT(block: (PipelineCreationFeedbackEXT) -> Unit) = PipelineCreationFeedbackEXT.calloc(this).also(block)

inline fun Allocator.PipelineCreationFeedbackEXT(capacity: Int, block: (PipelineCreationFeedbackEXT.Buffer) -> Unit) = PipelineCreationFeedbackEXT.calloc(this, capacity).also(block)

inline fun Allocator.PipelineCreationFeedbackCreateInfoEXT(block: (PipelineCreationFeedbackCreateInfoEXT) -> Unit) = PipelineCreationFeedbackCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.SurfaceFullScreenExclusiveInfoEXT(block: (SurfaceFullScreenExclusiveInfoEXT) -> Unit) = SurfaceFullScreenExclusiveInfoEXT.calloc(this).also(block)

inline fun Allocator.SurfaceFullScreenExclusiveWin32InfoEXT(block: (SurfaceFullScreenExclusiveWin32InfoEXT) -> Unit) = SurfaceFullScreenExclusiveWin32InfoEXT.calloc(this).also(block)

inline fun Allocator.SurfaceCapabilitiesFullScreenExclusiveEXT(block: (SurfaceCapabilitiesFullScreenExclusiveEXT) -> Unit) = SurfaceCapabilitiesFullScreenExclusiveEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDevicePerformanceQueryFeaturesKHR(block: (PhysicalDevicePerformanceQueryFeaturesKHR) -> Unit) = PhysicalDevicePerformanceQueryFeaturesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDevicePerformanceQueryPropertiesKHR(block: (PhysicalDevicePerformanceQueryPropertiesKHR) -> Unit) = PhysicalDevicePerformanceQueryPropertiesKHR.calloc(this).also(block)

inline fun Allocator.PerformanceCounterKHR(block: (PerformanceCounterKHR) -> Unit) = PerformanceCounterKHR.calloc(this).also(block)

inline fun Allocator.PerformanceCounterKHR(capacity: Int, block: (PerformanceCounterKHR.Buffer) -> Unit) = PerformanceCounterKHR.calloc(this, capacity).also(block)

inline fun Allocator.PerformanceCounterDescriptionKHR(block: (PerformanceCounterDescriptionKHR) -> Unit) = PerformanceCounterDescriptionKHR.calloc(this).also(block)

inline fun Allocator.PerformanceCounterDescriptionKHR(capacity: Int, block: (PerformanceCounterDescriptionKHR.Buffer) -> Unit) = PerformanceCounterDescriptionKHR.calloc(this, capacity).also(block)

inline fun Allocator.QueryPoolPerformanceCreateInfoKHR(block: (QueryPoolPerformanceCreateInfoKHR) -> Unit) = QueryPoolPerformanceCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.PerformanceCounterResultKHR(block: (PerformanceCounterResultKHR) -> Unit) = PerformanceCounterResultKHR.calloc(this).also(block)

inline fun Allocator.AcquireProfilingLockInfoKHR(block: (AcquireProfilingLockInfoKHR) -> Unit) = AcquireProfilingLockInfoKHR.calloc(this).also(block)

inline fun Allocator.PerformanceQuerySubmitInfoKHR(block: (PerformanceQuerySubmitInfoKHR) -> Unit) = PerformanceQuerySubmitInfoKHR.calloc(this).also(block)

inline fun Allocator.HeadlessSurfaceCreateInfoEXT(block: (HeadlessSurfaceCreateInfoEXT) -> Unit) = HeadlessSurfaceCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceCoverageReductionModeFeaturesNV(block: (PhysicalDeviceCoverageReductionModeFeaturesNV) -> Unit) = PhysicalDeviceCoverageReductionModeFeaturesNV.calloc(this).also(block)

inline fun Allocator.PipelineCoverageReductionStateCreateInfoNV(block: (PipelineCoverageReductionStateCreateInfoNV) -> Unit) = PipelineCoverageReductionStateCreateInfoNV.calloc(this).also(block)

inline fun Allocator.FramebufferMixedSamplesCombinationNV(block: (FramebufferMixedSamplesCombinationNV) -> Unit) = FramebufferMixedSamplesCombinationNV.calloc(this).also(block)

inline fun Allocator.FramebufferMixedSamplesCombinationNV(capacity: Int, block: (FramebufferMixedSamplesCombinationNV.Buffer) -> Unit) = FramebufferMixedSamplesCombinationNV.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(block: (PhysicalDeviceShaderIntegerFunctions2FeaturesINTEL) -> Unit) = PhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.calloc(this).also(block)

inline fun Allocator.PerformanceValueDataINTEL(block: (PerformanceValueDataINTEL) -> Unit) = PerformanceValueDataINTEL.calloc(this).also(block)

inline fun Allocator.PerformanceValueINTEL(block: (PerformanceValueINTEL) -> Unit) = PerformanceValueINTEL.calloc(this).also(block)

inline fun Allocator.InitializePerformanceApiInfoINTEL(block: (InitializePerformanceApiInfoINTEL) -> Unit) = InitializePerformanceApiInfoINTEL.calloc(this).also(block)

inline fun Allocator.QueryPoolPerformanceQueryCreateInfoINTEL(block: (QueryPoolPerformanceQueryCreateInfoINTEL) -> Unit) = QueryPoolPerformanceQueryCreateInfoINTEL.calloc(this).also(block)

inline fun Allocator.PerformanceMarkerInfoINTEL(block: (PerformanceMarkerInfoINTEL) -> Unit) = PerformanceMarkerInfoINTEL.calloc(this).also(block)

inline fun Allocator.PerformanceStreamMarkerInfoINTEL(block: (PerformanceStreamMarkerInfoINTEL) -> Unit) = PerformanceStreamMarkerInfoINTEL.calloc(this).also(block)

inline fun Allocator.PerformanceOverrideInfoINTEL(block: (PerformanceOverrideInfoINTEL) -> Unit) = PerformanceOverrideInfoINTEL.calloc(this).also(block)

inline fun Allocator.PerformanceConfigurationAcquireInfoINTEL(block: (PerformanceConfigurationAcquireInfoINTEL) -> Unit) = PerformanceConfigurationAcquireInfoINTEL.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShaderClockFeaturesKHR(block: (PhysicalDeviceShaderClockFeaturesKHR) -> Unit) = PhysicalDeviceShaderClockFeaturesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceIndexTypeUint8FeaturesEXT(block: (PhysicalDeviceIndexTypeUint8FeaturesEXT) -> Unit) = PhysicalDeviceIndexTypeUint8FeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShaderSMBuiltinsPropertiesNV(block: (PhysicalDeviceShaderSMBuiltinsPropertiesNV) -> Unit) = PhysicalDeviceShaderSMBuiltinsPropertiesNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShaderSMBuiltinsFeaturesNV(block: (PhysicalDeviceShaderSMBuiltinsFeaturesNV) -> Unit) = PhysicalDeviceShaderSMBuiltinsFeaturesNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentShaderInterlockFeaturesEXT(block: (PhysicalDeviceFragmentShaderInterlockFeaturesEXT) -> Unit) = PhysicalDeviceFragmentShaderInterlockFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceSeparateDepthStencilLayoutsFeatures(block: (PhysicalDeviceSeparateDepthStencilLayoutsFeatures) -> Unit) = PhysicalDeviceSeparateDepthStencilLayoutsFeatures.calloc(this).also(block)

inline fun Allocator.AttachmentReferenceStencilLayout(block: (AttachmentReferenceStencilLayout) -> Unit) = AttachmentReferenceStencilLayout.calloc(this).also(block)

inline fun Allocator.AttachmentDescriptionStencilLayout(block: (AttachmentDescriptionStencilLayout) -> Unit) = AttachmentDescriptionStencilLayout.calloc(this).also(block)

inline fun Allocator.PhysicalDevicePipelineExecutablePropertiesFeaturesKHR(block: (PhysicalDevicePipelineExecutablePropertiesFeaturesKHR) -> Unit) = PhysicalDevicePipelineExecutablePropertiesFeaturesKHR.calloc(this).also(block)

inline fun Allocator.PipelineInfoKHR(block: (PipelineInfoKHR) -> Unit) = PipelineInfoKHR.calloc(this).also(block)

inline fun Allocator.PipelineExecutablePropertiesKHR(block: (PipelineExecutablePropertiesKHR) -> Unit) = PipelineExecutablePropertiesKHR.calloc(this).also(block)

inline fun Allocator.PipelineExecutablePropertiesKHR(capacity: Int, block: (PipelineExecutablePropertiesKHR.Buffer) -> Unit) = PipelineExecutablePropertiesKHR.calloc(this, capacity).also(block)

inline fun Allocator.PipelineExecutableInfoKHR(block: (PipelineExecutableInfoKHR) -> Unit) = PipelineExecutableInfoKHR.calloc(this).also(block)

inline fun Allocator.PipelineExecutableStatisticValueKHR(block: (PipelineExecutableStatisticValueKHR) -> Unit) = PipelineExecutableStatisticValueKHR.calloc(this).also(block)

inline fun Allocator.PipelineExecutableStatisticKHR(block: (PipelineExecutableStatisticKHR) -> Unit) = PipelineExecutableStatisticKHR.calloc(this).also(block)

inline fun Allocator.PipelineExecutableStatisticKHR(capacity: Int, block: (PipelineExecutableStatisticKHR.Buffer) -> Unit) = PipelineExecutableStatisticKHR.calloc(this, capacity).also(block)

inline fun Allocator.PipelineExecutableInternalRepresentationKHR(block: (PipelineExecutableInternalRepresentationKHR) -> Unit) = PipelineExecutableInternalRepresentationKHR.calloc(this).also(block)

inline fun Allocator.PipelineExecutableInternalRepresentationKHR(capacity: Int, block: (PipelineExecutableInternalRepresentationKHR.Buffer) -> Unit) = PipelineExecutableInternalRepresentationKHR.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(block: (PhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT) -> Unit) = PhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceTexelBufferAlignmentFeaturesEXT(block: (PhysicalDeviceTexelBufferAlignmentFeaturesEXT) -> Unit) = PhysicalDeviceTexelBufferAlignmentFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceTexelBufferAlignmentPropertiesEXT(block: (PhysicalDeviceTexelBufferAlignmentPropertiesEXT) -> Unit) = PhysicalDeviceTexelBufferAlignmentPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceSubgroupSizeControlFeaturesEXT(block: (PhysicalDeviceSubgroupSizeControlFeaturesEXT) -> Unit) = PhysicalDeviceSubgroupSizeControlFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceSubgroupSizeControlPropertiesEXT(block: (PhysicalDeviceSubgroupSizeControlPropertiesEXT) -> Unit) = PhysicalDeviceSubgroupSizeControlPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(block: (PipelineShaderStageRequiredSubgroupSizeCreateInfoEXT) -> Unit) = PipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.MemoryOpaqueCaptureAddressAllocateInfo(block: (MemoryOpaqueCaptureAddressAllocateInfo) -> Unit) = MemoryOpaqueCaptureAddressAllocateInfo.calloc(this).also(block)

inline fun Allocator.DeviceMemoryOpaqueCaptureAddressInfo(block: (DeviceMemoryOpaqueCaptureAddressInfo) -> Unit) = DeviceMemoryOpaqueCaptureAddressInfo.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceLineRasterizationFeaturesEXT(block: (PhysicalDeviceLineRasterizationFeaturesEXT) -> Unit) = PhysicalDeviceLineRasterizationFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceLineRasterizationPropertiesEXT(block: (PhysicalDeviceLineRasterizationPropertiesEXT) -> Unit) = PhysicalDeviceLineRasterizationPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PipelineRasterizationLineStateCreateInfoEXT(block: (PipelineRasterizationLineStateCreateInfoEXT) -> Unit) = PipelineRasterizationLineStateCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDevicePipelineCreationCacheControlFeaturesEXT(block: (PhysicalDevicePipelineCreationCacheControlFeaturesEXT) -> Unit) = PhysicalDevicePipelineCreationCacheControlFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceVulkan11Features(block: (PhysicalDeviceVulkan11Features) -> Unit) = PhysicalDeviceVulkan11Features.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceVulkan11Properties(block: (PhysicalDeviceVulkan11Properties) -> Unit) = PhysicalDeviceVulkan11Properties.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceVulkan12Features(block: (PhysicalDeviceVulkan12Features) -> Unit) = PhysicalDeviceVulkan12Features.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceVulkan12Properties(block: (PhysicalDeviceVulkan12Properties) -> Unit) = PhysicalDeviceVulkan12Properties.calloc(this).also(block)

inline fun Allocator.PipelineCompilerControlCreateInfoAMD(block: (PipelineCompilerControlCreateInfoAMD) -> Unit) = PipelineCompilerControlCreateInfoAMD.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceCoherentMemoryFeaturesAMD(block: (PhysicalDeviceCoherentMemoryFeaturesAMD) -> Unit) = PhysicalDeviceCoherentMemoryFeaturesAMD.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceToolPropertiesEXT(block: (PhysicalDeviceToolPropertiesEXT) -> Unit) = PhysicalDeviceToolPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceToolPropertiesEXT(capacity: Int, block: (PhysicalDeviceToolPropertiesEXT.Buffer) -> Unit) = PhysicalDeviceToolPropertiesEXT.calloc(this, capacity).also(block)

inline fun Allocator.SamplerCustomBorderColorCreateInfoEXT(block: (SamplerCustomBorderColorCreateInfoEXT) -> Unit) = SamplerCustomBorderColorCreateInfoEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceCustomBorderColorPropertiesEXT(block: (PhysicalDeviceCustomBorderColorPropertiesEXT) -> Unit) = PhysicalDeviceCustomBorderColorPropertiesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceCustomBorderColorFeaturesEXT(block: (PhysicalDeviceCustomBorderColorFeaturesEXT) -> Unit) = PhysicalDeviceCustomBorderColorFeaturesEXT.calloc(this).also(block)

inline fun Allocator.DeviceOrHostAddressKHR(block: (DeviceOrHostAddressKHR) -> Unit) = DeviceOrHostAddressKHR.calloc(this).also(block)

inline fun Allocator.DeviceOrHostAddressConstKHR(block: (DeviceOrHostAddressConstKHR) -> Unit) = DeviceOrHostAddressConstKHR.calloc(this).also(block)

inline fun Allocator.AccelerationStructureGeometryTrianglesDataKHR(block: (AccelerationStructureGeometryTrianglesDataKHR) -> Unit) = AccelerationStructureGeometryTrianglesDataKHR.calloc(this).also(block)

inline fun Allocator.AccelerationStructureGeometryAabbsDataKHR(block: (AccelerationStructureGeometryAabbsDataKHR) -> Unit) = AccelerationStructureGeometryAabbsDataKHR.calloc(this).also(block)

inline fun Allocator.AccelerationStructureGeometryInstancesDataKHR(block: (AccelerationStructureGeometryInstancesDataKHR) -> Unit) = AccelerationStructureGeometryInstancesDataKHR.calloc(this).also(block)

inline fun Allocator.AccelerationStructureGeometryDataKHR(block: (AccelerationStructureGeometryDataKHR) -> Unit) = AccelerationStructureGeometryDataKHR.calloc(this).also(block)

inline fun Allocator.AccelerationStructureGeometryKHR(block: (AccelerationStructureGeometryKHR) -> Unit) = AccelerationStructureGeometryKHR.calloc(this).also(block)

inline fun Allocator.AccelerationStructureGeometryKHR(capacity: Int, block: (AccelerationStructureGeometryKHR.Buffer) -> Unit) = AccelerationStructureGeometryKHR.calloc(this, capacity).also(block)

inline fun Allocator.AccelerationStructureBuildGeometryInfoKHR(block: (AccelerationStructureBuildGeometryInfoKHR) -> Unit) = AccelerationStructureBuildGeometryInfoKHR.calloc(this).also(block)

inline fun Allocator.AccelerationStructureBuildGeometryInfoKHR(capacity: Int, block: (AccelerationStructureBuildGeometryInfoKHR.Buffer) -> Unit) = AccelerationStructureBuildGeometryInfoKHR.calloc(this, capacity).also(block)

inline fun Allocator.AccelerationStructureBuildRangeInfoKHR(block: (AccelerationStructureBuildRangeInfoKHR) -> Unit) = AccelerationStructureBuildRangeInfoKHR.calloc(this).also(block)

inline fun Allocator.AccelerationStructureBuildRangeInfoKHR(capacity: Int, block: (AccelerationStructureBuildRangeInfoKHR.Buffer) -> Unit) = AccelerationStructureBuildRangeInfoKHR.calloc(this, capacity).also(block)

inline fun Allocator.AccelerationStructureCreateInfoKHR(block: (AccelerationStructureCreateInfoKHR) -> Unit) = AccelerationStructureCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.AabbPositionsKHR(block: (AabbPositionsKHR) -> Unit) = AabbPositionsKHR.calloc(this).also(block)

inline fun Allocator.TransformMatrixKHR(block: (TransformMatrixKHR) -> Unit) = TransformMatrixKHR.calloc(this).also(block)

inline fun Allocator.AccelerationStructureInstanceKHR(block: (AccelerationStructureInstanceKHR) -> Unit) = AccelerationStructureInstanceKHR.calloc(this).also(block)

inline fun Allocator.AccelerationStructureDeviceAddressInfoKHR(block: (AccelerationStructureDeviceAddressInfoKHR) -> Unit) = AccelerationStructureDeviceAddressInfoKHR.calloc(this).also(block)

inline fun Allocator.AccelerationStructureVersionInfoKHR(block: (AccelerationStructureVersionInfoKHR) -> Unit) = AccelerationStructureVersionInfoKHR.calloc(this).also(block)

inline fun Allocator.CopyAccelerationStructureInfoKHR(block: (CopyAccelerationStructureInfoKHR) -> Unit) = CopyAccelerationStructureInfoKHR.calloc(this).also(block)

inline fun Allocator.CopyAccelerationStructureToMemoryInfoKHR(block: (CopyAccelerationStructureToMemoryInfoKHR) -> Unit) = CopyAccelerationStructureToMemoryInfoKHR.calloc(this).also(block)

inline fun Allocator.CopyMemoryToAccelerationStructureInfoKHR(block: (CopyMemoryToAccelerationStructureInfoKHR) -> Unit) = CopyMemoryToAccelerationStructureInfoKHR.calloc(this).also(block)

inline fun Allocator.RayTracingPipelineInterfaceCreateInfoKHR(block: (RayTracingPipelineInterfaceCreateInfoKHR) -> Unit) = RayTracingPipelineInterfaceCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.PipelineLibraryCreateInfoKHR(block: (PipelineLibraryCreateInfoKHR) -> Unit) = PipelineLibraryCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceExtendedDynamicStateFeaturesEXT(block: (PhysicalDeviceExtendedDynamicStateFeaturesEXT) -> Unit) = PhysicalDeviceExtendedDynamicStateFeaturesEXT.calloc(this).also(block)

inline fun Allocator.RenderPassTransformBeginInfoQCOM(block: (RenderPassTransformBeginInfoQCOM) -> Unit) = RenderPassTransformBeginInfoQCOM.calloc(this).also(block)

inline fun Allocator.CopyCommandTransformInfoQCOM(block: (CopyCommandTransformInfoQCOM) -> Unit) = CopyCommandTransformInfoQCOM.calloc(this).also(block)

inline fun Allocator.CommandBufferInheritanceRenderPassTransformInfoQCOM(block: (CommandBufferInheritanceRenderPassTransformInfoQCOM) -> Unit) = CommandBufferInheritanceRenderPassTransformInfoQCOM.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceDiagnosticsConfigFeaturesNV(block: (PhysicalDeviceDiagnosticsConfigFeaturesNV) -> Unit) = PhysicalDeviceDiagnosticsConfigFeaturesNV.calloc(this).also(block)

inline fun Allocator.DeviceDiagnosticsConfigCreateInfoNV(block: (DeviceDiagnosticsConfigCreateInfoNV) -> Unit) = DeviceDiagnosticsConfigCreateInfoNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(block: (PhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR) -> Unit) = PhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceRobustness2FeaturesEXT(block: (PhysicalDeviceRobustness2FeaturesEXT) -> Unit) = PhysicalDeviceRobustness2FeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceRobustness2PropertiesEXT(block: (PhysicalDeviceRobustness2PropertiesEXT) -> Unit) = PhysicalDeviceRobustness2PropertiesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceImageRobustnessFeaturesEXT(block: (PhysicalDeviceImageRobustnessFeaturesEXT) -> Unit) = PhysicalDeviceImageRobustnessFeaturesEXT.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(block: (PhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR) -> Unit) = PhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDevicePortabilitySubsetFeaturesKHR(block: (PhysicalDevicePortabilitySubsetFeaturesKHR) -> Unit) = PhysicalDevicePortabilitySubsetFeaturesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDevicePortabilitySubsetPropertiesKHR(block: (PhysicalDevicePortabilitySubsetPropertiesKHR) -> Unit) = PhysicalDevicePortabilitySubsetPropertiesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDevice4444FormatsFeaturesEXT(block: (PhysicalDevice4444FormatsFeaturesEXT) -> Unit) = PhysicalDevice4444FormatsFeaturesEXT.calloc(this).also(block)

inline fun Allocator.BufferCopy2KHR(block: (BufferCopy2KHR) -> Unit) = BufferCopy2KHR.calloc(this).also(block)

inline fun Allocator.BufferCopy2KHR(capacity: Int, block: (BufferCopy2KHR.Buffer) -> Unit) = BufferCopy2KHR.calloc(this, capacity).also(block)

inline fun Allocator.ImageCopy2KHR(block: (ImageCopy2KHR) -> Unit) = ImageCopy2KHR.calloc(this).also(block)

inline fun Allocator.ImageCopy2KHR(capacity: Int, block: (ImageCopy2KHR.Buffer) -> Unit) = ImageCopy2KHR.calloc(this, capacity).also(block)

inline fun Allocator.ImageBlit2KHR(block: (ImageBlit2KHR) -> Unit) = ImageBlit2KHR.calloc(this).also(block)

inline fun Allocator.ImageBlit2KHR(capacity: Int, block: (ImageBlit2KHR.Buffer) -> Unit) = ImageBlit2KHR.calloc(this, capacity).also(block)

inline fun Allocator.BufferImageCopy2KHR(block: (BufferImageCopy2KHR) -> Unit) = BufferImageCopy2KHR.calloc(this).also(block)

inline fun Allocator.BufferImageCopy2KHR(capacity: Int, block: (BufferImageCopy2KHR.Buffer) -> Unit) = BufferImageCopy2KHR.calloc(this, capacity).also(block)

inline fun Allocator.ImageResolve2KHR(block: (ImageResolve2KHR) -> Unit) = ImageResolve2KHR.calloc(this).also(block)

inline fun Allocator.ImageResolve2KHR(capacity: Int, block: (ImageResolve2KHR.Buffer) -> Unit) = ImageResolve2KHR.calloc(this, capacity).also(block)

inline fun Allocator.CopyBufferInfo2KHR(block: (CopyBufferInfo2KHR) -> Unit) = CopyBufferInfo2KHR.calloc(this).also(block)

inline fun Allocator.CopyImageInfo2KHR(block: (CopyImageInfo2KHR) -> Unit) = CopyImageInfo2KHR.calloc(this).also(block)

inline fun Allocator.BlitImageInfo2KHR(block: (BlitImageInfo2KHR) -> Unit) = BlitImageInfo2KHR.calloc(this).also(block)

inline fun Allocator.CopyBufferToImageInfo2KHR(block: (CopyBufferToImageInfo2KHR) -> Unit) = CopyBufferToImageInfo2KHR.calloc(this).also(block)

inline fun Allocator.CopyImageToBufferInfo2KHR(block: (CopyImageToBufferInfo2KHR) -> Unit) = CopyImageToBufferInfo2KHR.calloc(this).also(block)

inline fun Allocator.ResolveImageInfo2KHR(block: (ResolveImageInfo2KHR) -> Unit) = ResolveImageInfo2KHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceShaderImageAtomicInt64FeaturesEXT(block: (PhysicalDeviceShaderImageAtomicInt64FeaturesEXT) -> Unit) = PhysicalDeviceShaderImageAtomicInt64FeaturesEXT.calloc(this).also(block)

inline fun Allocator.FragmentShadingRateAttachmentInfoKHR(block: (FragmentShadingRateAttachmentInfoKHR) -> Unit) = FragmentShadingRateAttachmentInfoKHR.calloc(this).also(block)

inline fun Allocator.PipelineFragmentShadingRateStateCreateInfoKHR(block: (PipelineFragmentShadingRateStateCreateInfoKHR) -> Unit) = PipelineFragmentShadingRateStateCreateInfoKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentShadingRateFeaturesKHR(block: (PhysicalDeviceFragmentShadingRateFeaturesKHR) -> Unit) = PhysicalDeviceFragmentShadingRateFeaturesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentShadingRatePropertiesKHR(block: (PhysicalDeviceFragmentShadingRatePropertiesKHR) -> Unit) = PhysicalDeviceFragmentShadingRatePropertiesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentShadingRateKHR(block: (PhysicalDeviceFragmentShadingRateKHR) -> Unit) = PhysicalDeviceFragmentShadingRateKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentShadingRateKHR(capacity: Int, block: (PhysicalDeviceFragmentShadingRateKHR.Buffer) -> Unit) = PhysicalDeviceFragmentShadingRateKHR.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceShaderTerminateInvocationFeaturesKHR(block: (PhysicalDeviceShaderTerminateInvocationFeaturesKHR) -> Unit) = PhysicalDeviceShaderTerminateInvocationFeaturesKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentShadingRateEnumsFeaturesNV(block: (PhysicalDeviceFragmentShadingRateEnumsFeaturesNV) -> Unit) = PhysicalDeviceFragmentShadingRateEnumsFeaturesNV.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceFragmentShadingRateEnumsPropertiesNV(block: (PhysicalDeviceFragmentShadingRateEnumsPropertiesNV) -> Unit) = PhysicalDeviceFragmentShadingRateEnumsPropertiesNV.calloc(this).also(block)

inline fun Allocator.PipelineFragmentShadingRateEnumStateCreateInfoNV(block: (PipelineFragmentShadingRateEnumStateCreateInfoNV) -> Unit) = PipelineFragmentShadingRateEnumStateCreateInfoNV.calloc(this).also(block)

inline fun Allocator.AccelerationStructureBuildSizesInfoKHR(block: (AccelerationStructureBuildSizesInfoKHR) -> Unit) = AccelerationStructureBuildSizesInfoKHR.calloc(this).also(block)

inline fun Allocator.PhysicalDeviceMutableDescriptorTypeFeaturesVALVE(block: (PhysicalDeviceMutableDescriptorTypeFeaturesVALVE) -> Unit) = PhysicalDeviceMutableDescriptorTypeFeaturesVALVE.calloc(this).also(block)

inline fun Allocator.MutableDescriptorTypeListVALVE(block: (MutableDescriptorTypeListVALVE) -> Unit) = MutableDescriptorTypeListVALVE.calloc(this).also(block)

inline fun Allocator.MutableDescriptorTypeListVALVE(capacity: Int, block: (MutableDescriptorTypeListVALVE.Buffer) -> Unit) = MutableDescriptorTypeListVALVE.calloc(this, capacity).also(block)

inline fun Allocator.MutableDescriptorTypeCreateInfoVALVE(block: (MutableDescriptorTypeCreateInfoVALVE) -> Unit) = MutableDescriptorTypeCreateInfoVALVE.calloc(this).also(block)

inline fun Allocator.MemoryBarrier2KHR(block: (MemoryBarrier2KHR) -> Unit) = MemoryBarrier2KHR.calloc(this).also(block)

inline fun Allocator.MemoryBarrier2KHR(capacity: Int, block: (MemoryBarrier2KHR.Buffer) -> Unit) = MemoryBarrier2KHR.calloc(this, capacity).also(block)

inline fun Allocator.ImageMemoryBarrier2KHR(block: (ImageMemoryBarrier2KHR) -> Unit) = ImageMemoryBarrier2KHR.calloc(this).also(block)

inline fun Allocator.ImageMemoryBarrier2KHR(capacity: Int, block: (ImageMemoryBarrier2KHR.Buffer) -> Unit) = ImageMemoryBarrier2KHR.calloc(this, capacity).also(block)

inline fun Allocator.BufferMemoryBarrier2KHR(block: (BufferMemoryBarrier2KHR) -> Unit) = BufferMemoryBarrier2KHR.calloc(this).also(block)

inline fun Allocator.BufferMemoryBarrier2KHR(capacity: Int, block: (BufferMemoryBarrier2KHR.Buffer) -> Unit) = BufferMemoryBarrier2KHR.calloc(this, capacity).also(block)

inline fun Allocator.DependencyInfoKHR(block: (DependencyInfoKHR) -> Unit) = DependencyInfoKHR.calloc(this).also(block)

inline fun Allocator.DependencyInfoKHR(capacity: Int, block: (DependencyInfoKHR.Buffer) -> Unit) = DependencyInfoKHR.calloc(this, capacity).also(block)

inline fun Allocator.SemaphoreSubmitInfoKHR(block: (SemaphoreSubmitInfoKHR) -> Unit) = SemaphoreSubmitInfoKHR.calloc(this).also(block)

inline fun Allocator.SemaphoreSubmitInfoKHR(capacity: Int, block: (SemaphoreSubmitInfoKHR.Buffer) -> Unit) = SemaphoreSubmitInfoKHR.calloc(this, capacity).also(block)

inline fun Allocator.CommandBufferSubmitInfoKHR(block: (CommandBufferSubmitInfoKHR) -> Unit) = CommandBufferSubmitInfoKHR.calloc(this).also(block)

inline fun Allocator.CommandBufferSubmitInfoKHR(capacity: Int, block: (CommandBufferSubmitInfoKHR.Buffer) -> Unit) = CommandBufferSubmitInfoKHR.calloc(this, capacity).also(block)

inline fun Allocator.SubmitInfo2KHR(block: (SubmitInfo2KHR) -> Unit) = SubmitInfo2KHR.calloc(this).also(block)

inline fun Allocator.SubmitInfo2KHR(capacity: Int, block: (SubmitInfo2KHR.Buffer) -> Unit) = SubmitInfo2KHR.calloc(this, capacity).also(block)

inline fun Allocator.QueueFamilyCheckpointProperties2NV(block: (QueueFamilyCheckpointProperties2NV) -> Unit) = QueueFamilyCheckpointProperties2NV.calloc(this).also(block)

inline fun Allocator.CheckpointData2NV(block: (CheckpointData2NV) -> Unit) = CheckpointData2NV.calloc(this).also(block)

inline fun Allocator.CheckpointData2NV(capacity: Int, block: (CheckpointData2NV.Buffer) -> Unit) = CheckpointData2NV.calloc(this, capacity).also(block)

inline fun Allocator.PhysicalDeviceSynchronization2FeaturesKHR(block: (PhysicalDeviceSynchronization2FeaturesKHR) -> Unit) = PhysicalDeviceSynchronization2FeaturesKHR.calloc(this).also(block)