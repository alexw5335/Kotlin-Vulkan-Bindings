package kvb.vkwrapper.handle

import kvb.core.memory.Addressable.Companion.addressOrNULL
import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.core.memory.direct.DirectIntBuffer
import kvb.core.memory.direct.DirectLongBuffer
import kvb.vulkan.*

@Suppress("unused")
class CommandBuffer(address: Long, val commandPool: CommandPool) : CommandBufferH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = commandPool.device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this



	/*
	Begin
	 */



	/**
	 * Implementation of vkBeginCommandBuffer. The [inheritanceInfo] is only used with secondary command buffers.
	 */
	fun begin(
		flags           : CommandBufferUsageFlags        = CommandBufferUsageFlags(0),
		inheritanceInfo : CommandBufferInheritanceInfo?  = null,
		stack           : MemStack                       = default
	) = stack.with {
		commands.beginCommandBuffer(self, CommandBufferBeginInfo {
			it.flags = flags
			it.pInheritanceInfo = inheritanceInfo.addressOrNULL
		})
	}



	/**
	 * Implementation of vkBeginCommandBuffer. Uses [CommandBufferUsageFlags.ONE_TIME_SUBMIT] and no
	 * [CommandBufferInheritanceInfo].
	 */
	fun beginOneTimeSubmit() = begin(CommandBufferUsageFlags.ONE_TIME_SUBMIT)



	/**
	 * Implementation of vkEndCommandBuffer.
	 */
	fun end() = commands.endCommandBuffer(this)



	/*
	Viewport and scissor
	 */



	/**
	 * Implementation of vkCmdSetViewport.
	 */
	fun setViewport(
		viewports		: Viewport.Buffer,
		firstViewport	: Int = 0,
		viewportCount	: Int = viewports.capacity
	) = commands.cmdSetViewport(
		commandBuffer 	= this,
		firstViewport 	= firstViewport,
		pViewports 		= viewports,
		viewportCount 	= viewportCount
	)



	/**
	 * Implementation of vkCmdSetScissor.
	 */
	fun setScissor(
		scissors		: Rect2D.Buffer,
		firstScissor	: Int = 0,
		scissorCount	: Int = scissors.capacity
	) = commands.cmdSetScissor(
		commandBuffer 	= this,
		firstScissor 	= firstScissor,
		pScissors 		= scissors,
		scissorCount 	= scissorCount
	)



	/*
	Render pass
	 */



	/**
	 * Implementation of vkCmdBeginRenderPass.
	 */
	fun beginRenderPass(
		info		: RenderPassBeginInfo,
		contents	: SubpassContents
	) = commands.cmdBeginRenderPass(
		commandBuffer 		= this,
		pRenderPassBegin 	= info,
		contents 			= contents
	)



	/**
	 * Convenience implementation of vkCmdBeginRenderPass. Uses the [framebuffer]'s render area.
	 */
	fun beginRenderPass(
		renderPass  : RenderPass,
		framebuffer : Framebuffer,
		clearValues : ClearValue.Buffer,
		contents    : SubpassContents    = SubpassContents.INLINE,
		stack       : MemStack           = default
	) = stack.with {
		commands.cmdBeginRenderPass(self, RenderPassBeginInfo {
			it.renderPass = renderPass
			it.framebuffer = framebuffer
			it.renderArea.extent.width = framebuffer.width
			it.renderArea.extent.height = framebuffer.height
			it.clearValues = clearValues
		}, contents)
	}



	/**
	 * Implementation of vkCmdEndRenderPass.
	 */
	fun endRenderPass() = commands.cmdEndRenderPass(this)



	/*
	Pipeline binding
	 */



	/**
	 * Implementation of vkCmdBindPipeline.
	 */
	fun bindPipeline(pipeline: Pipeline) = commands.cmdBindPipeline(
		commandBuffer = this,
		pipelineBindPoint = pipeline.bindPoint,
		pipeline = pipeline
	)



	/*
	Vertex buffer binding
	 */



	/**
	 * Implementation of vkCmdBindVertexBuffers.
	 */
	fun bindVertexBuffers(
		firstBinding	: Int,
		bindingCount	: Int,
		buffers			: DirectLongBuffer,
		offsets			: DirectLongBuffer
	) = commands.cmdBindVertexBuffers(
		commandBuffer 	= this,
		firstBinding 	= firstBinding,
		bindingCount 	= bindingCount,
		pBuffers 		= buffers,
		pOffsets 		= offsets
	)



	/**
	 * Convenience implementation of vkCmdBindVertexBuffers. For a single buffer.
	 */
	fun bindVertexBuffer(
		buffer : Buffer,
		offset : Long      = 0,
		stack  : MemStack  = default
	) = stack.with {
		commands.cmdBindVertexBuffers(
			commandBuffer = self,
			firstBinding  = 0,
			bindingCount  = 1,
			pBuffers      = wrapPointer(buffer),
			pOffsets      = wrapLong(offset).asBuffer
		)
	}



	/**
	 * Convenience implementation of vkCmdBindVertexBuffers.
	 */
	fun bindVertexBuffers(
		buffers      : List<Buffer>,
		offsets      : LongArray,
		firstBinding : Int           = 0,
		bindingCount : Int           = buffers.size,
		stack        : MemStack      = default
	) = stack.with {
		commands.cmdBindVertexBuffers(
			commandBuffer = self,
			firstBinding  = firstBinding,
			bindingCount  = bindingCount,
			pBuffers      = wrapPointers(buffers),
			pOffsets      = wrapLongs(offsets)
		)
	}



	/*
	Descriptor set binding
	 */



	/**
	 * Implementation of vkCmdBindDescriptorSets.
	 */
	fun bindDescriptorSets(
		bindPoint      : PipelineBindPoint,
		layout         : PipelineLayout,
		firstSet       : Int,
		descriptorSets : DirectLongBuffer,
		dynamicOffsets : DirectIntBuffer
	) = commands.cmdBindDescriptorSets(
		commandBuffer 		= this,
		pipelineBindPoint 	= bindPoint,
		layout 				= layout,
		firstSet 			= firstSet,
		descriptorSetCount 	= descriptorSets.capacity,
		pDescriptorSets 	= descriptorSets,
		dynamicOffsetCount 	= dynamicOffsets.capacity,
		pDynamicOffsets 	= dynamicOffsets
	)



	/**
	 * Convenience implementation of vkCmdBindDescriptorSets. For binding a single descriptor set with no dynamic
	 * descriptors.
	 */
	fun bindDescriptorSet(
		bindPoint : PipelineBindPoint,
		layout    : PipelineLayout,
		binding   : Int,
		set       : DescriptorSet,
		stack     : MemStack = default
	) = stack.with {
		commands.cmdBindDescriptorSets(
			commandBuffer      = self,
			pipelineBindPoint  = bindPoint,
			layout             = layout,
			firstSet           = binding,
			descriptorSetCount = 1,
			pDescriptorSets    = wrapPointer(set),
			dynamicOffsetCount = 0,
			pDynamicOffsets    = DirectIntBuffer(0, 0)
		)
	}



	/*
	Buffer copy
	 */



	/**
	 * Implementation of vkCmdCopyBuffer.
	 */
	fun copyBuffer(
		src: Buffer,
		dst: Buffer,
		regions: BufferCopy.Buffer
	) = commands.cmdCopyBuffer(
		commandBuffer 	= self,
		srcBuffer 		= src,
		dstBuffer 		= dst,
		regionCount 	= regions.capacity,
		pRegions 		= regions
	)



	/**
	 * Convenience implementation of vkCmdCopyBuffer. For a single copy region.
	 */
	fun copyBuffer(
		src       : Buffer,
		dst       : Buffer,
		srcOffset : Long,
		dstOffset : Long,
		size      : Long,
		stack     : MemStack = default
	) = stack.with {
		commands.cmdCopyBuffer(
			commandBuffer = self,
			srcBuffer     = src,
			dstBuffer     = dst,
			regionCount   = 1,
			pRegions      = BufferCopy {
				it.srcOffset = srcOffset
				it.dstOffset = dstOffset
				it.size = size
			}.asBuffer
		)
	}



	/**
	 * Convenience implementation of vkCopyBufferToImage. For 2D colour images.
	 */
	fun copyBufferToImage2D(
		buffer : Buffer,
		image  : Image,
		layout : ImageLayout,
		width  : Int,
		height : Int,
		stack  : MemStack = default
	) = stack.with {
		val region = BufferImageCopy {
			it.bufferOffset = 0
			it.bufferRowLength = 0
			it.bufferImageHeight = 0
			it.imageSubresource.aspectMask = ImageAspectFlags.COLOR
			it.imageSubresource.mipLevel = 0
			it.imageSubresource.baseArrayLayer = 0
			it.imageSubresource.layerCount = 1
			it.imageOffset.x = 0
			it.imageOffset.y = 0
			it.imageOffset.z = 0
			it.imageExtent.width = width
			it.imageExtent.height = height
			it.imageExtent.depth = 1
		}

		commands.cmdCopyBufferToImage(
			commandBuffer  = self,
			srcBuffer      = buffer,
			dstImage       = image,
			dstImageLayout = layout,
			regionCount    = 1,
			pRegions       = region.asBuffer
		)
	}



	/*
	Pipeline barrier
	 */



	/**
	 * Convenience implementation of vkCmdPipelineBarrier for a single image memory barrier.
	 */
	fun pipelineImageMemoryBarrier(
		srcStages       : PipelineStageFlags,
		dstStages       : PipelineStageFlags,
		barrier         : ImageMemoryBarrier,
		dependencyFlags : DependencyFlags = DependencyFlags(0),
	) = commands.cmdPipelineBarrier(
		commandBuffer            = self,
		srcStageMask             = srcStages,
		dstStageMask             = dstStages,
		dependencyFlags          = dependencyFlags,
		memoryBarrierCount       = 0,
		pMemoryBarriers          = MemoryBarrier.Buffer(0, 0),
		bufferMemoryBarrierCount = 0,
		pBufferMemoryBarriers    = BufferMemoryBarrier.Buffer(0, 0),
		imageMemoryBarrierCount  = 1,
		pImageMemoryBarriers     = barrier.asBuffer
	)



	/*
	Misc. commands
	 */



	fun draw(
		vertexCount		: Int,
		instanceCount	: Int,
		firstVertex		: Int = 0,
		firstInstance	: Int = 0
	) = commands.cmdDraw(
		commandBuffer 	= this,
		vertexCount 	= vertexCount,
		instanceCount 	= instanceCount,
		firstVertex 	= firstVertex,
		firstInstance 	= firstInstance
	)


}