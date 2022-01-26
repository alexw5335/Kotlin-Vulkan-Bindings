package kvb.vkwrapper.builder

import kvb.core.memory.Allocator
import kvb.core.memory.DirectList
import kvb.vkwrapper.handle.*
import kvb.vulkan.*
import kvb.vkwrapper.shader.Shader
import kvb.vkwrapper.shader.ShaderCollection
import kvb.vkwrapper.shader.VertexAttribute
import kvb.vkwrapper.shader.VertexBinding

@Suppress("unused")
class GraphicsPipelineBuilder(private val device: Device, private val allocator: Allocator) {


	var flags = PipelineCreateFlags(0)

	var layout: PipelineLayout? = null

	var renderPass: RenderPass? = null

	var subpass: Int = 0



	/*
	Layout
	 */



	fun layout(layout: PipelineLayout) {
		this.layout = layout
	}



	fun emptyLayout() {
		layout(device.createPipelineLayout())
	}



	fun layout(setLayout: DescriptorSetLayout) {
		layout(device.createPipelineLayout(setLayout))
	}



	fun layout(set: DescriptorSet) {
		layout(set.layout)
	}



	fun renderPass(renderPass: RenderPass) {
		this.renderPass = renderPass
	}



	/*
	Shader stages
	 */



	private var shaderStages = LongArray(10)

	private var numShaderStages = 0

	private val shaderStagesBuffer get() = allocator.PipelineShaderStageCreateInfo(numShaderStages) {
		for(i in 0 until numShaderStages) it[i] = PipelineShaderStageCreateInfo(shaderStages[i])
	}



	fun shader(module: ShaderModule, stage: ShaderStageFlags, entryPoint: String = "main") {
		val info = allocator.PipelineShaderStageCreateInfo {
			it.module = module
			it.stage = stage
			it.name = allocator.encodeUtf8NT(entryPoint)
		}

		if(numShaderStages == shaderStages.size)
			shaderStages = shaderStages.copyOf(shaderStages.size*2)

		shaderStages[numShaderStages++] = info.address
	}



	fun shader(shader: Shader, entryPoint: String = shader.defaultEntryPoint) {
		shader(shader.module, shader.stage, entryPoint)
	}



	fun shaders(collection: ShaderCollection) {
		for(shader in collection.shaders)
			shader(shader)

		layout = if(collection.descriptors.isEmpty())
			device.createPipelineLayout()
		else
			device.createPipelineLayout(collection.descriptors.map { it.value.layout })
	}



	fun vertexShader(module: ShaderModule, entryPoint: String = "main") =
		shader(module, ShaderStageFlags.VERTEX, entryPoint)

	fun fragmentShader(module: ShaderModule, entryPoint: String = "main") =
		shader(module, ShaderStageFlags.FRAGMENT, entryPoint)

	fun geometryShader(module: ShaderModule, entryPoint: String = "main") =
		shader(module, ShaderStageFlags.GEOMETRY, entryPoint)

	fun computeShader(module: ShaderModule, entryPoint: String = "main") =
		shader(module, ShaderStageFlags.COMPUTE, entryPoint)

	fun tessellationControlShader(module: ShaderModule, entryPoint: String = "main") =
		shader(module, ShaderStageFlags.TESSELLATION_CONTROL, entryPoint)

	fun tessellationEvaluationShader(module: ShaderModule, entryPoint: String = "main") =
		shader(module, ShaderStageFlags.TESSELLATION_EVALUATION, entryPoint)



	/*
	Vertex input state
	 */



	private val vertexInputState = allocator.PipelineVertexInputStateCreateInfo { }



	val vertexBindings = DirectList(allocator, 5) { VertexInputBindingDescription(it) { } }

	val vertexAttributes = DirectList(allocator, 5) { VertexInputAttributeDescription(it) { } }



	var currentVertexLocation = 0



	fun vertexBinding(binding: Int, stride: Int, inputRate: VertexInputRate) {
		vertexBindings.buffer[vertexBindings.next].let {
			it.binding   = if(binding < 0) vertexBindings.size - 1 else binding
			it.stride    = stride
			it.inputRate = inputRate
		}
		currentVertexLocation = 0
	}



	inline fun vertexBinding(binding: Int = -1, block: VertexInputBindingDescription.() -> Unit) {
		vertexBinding(binding, 0, VertexInputRate.VERTEX)
		block(vertexBindings.buffer[vertexBindings.size - 1])
	}



	fun VertexInputBindingDescription.vertexAttribute(format: Format, size: Int) {
		// WARNING: Some formats require multiple location slots.
		vertexAttributes.buffer[vertexAttributes.next].let {
			it.binding  = binding
			it.location = currentVertexLocation++
			it.offset   = stride
			it.format   = format
		}
		stride += size
	}



	fun VertexInputBindingDescription.vec2() = vertexAttribute(Format.R32G32_SFLOAT, 8)

	fun VertexInputBindingDescription.vec3() = vertexAttribute(Format.R32G32B32_SFLOAT, 12)

	fun VertexInputBindingDescription.vec4() = vertexAttribute(Format.R32G32B32A32_SFLOAT, 16)



	/*
	Input assembly state
	 */



	private val inputAssemblyState = allocator.PipelineInputAssemblyStateCreateInfo { }



	var topology: PrimitiveTopology
		get() = inputAssemblyState.topology
		set(value) { inputAssemblyState.topology = value }

	var primitiveRestartEnable: Boolean
		get() = inputAssemblyState.primitiveRestartEnable != 0
		set(value) { inputAssemblyState.primitiveRestartEnable = if(value) 1 else 0 }



	/*
	Tessellation state
	 */



	private val tessellationState = allocator.PipelineTessellationStateCreateInfo { }

	var patchControlPoints: Int
		get() = tessellationState.patchControlPoints
		set(value) { tessellationState.patchControlPoints = value }



	/*
	Viewport state
	 */



	private val viewportState = allocator.PipelineViewportStateCreateInfo { }



	var viewportCount: Int
		get() = viewportState.viewportCount
		set(value) { viewportState.viewportCount = value }

	var scissorCount: Int
		get() = viewportState.scissorCount
		set(value) { viewportState.scissorCount = value }

	var viewports: Viewport.Buffer
		get() = viewportState.viewports
		set(value) { viewportState.viewports = value }

	var scissors: Rect2D.Buffer
		get() = viewportState.scissors
		set(value) { viewportState.scissors = value }



	/*
	Rasterization state
	 */



	private val rasterizationState = allocator.PipelineRasterizationStateCreateInfo {
		it.lineWidth = 1F
	}



	var depthClampEnable
		get() = rasterizationState.depthClampEnable != 0
		set(value) { rasterizationState.depthClampEnable = if(value) 1 else 0 }

	var rasterizerDiscardEnable
		get() = rasterizationState.rasterizerDiscardEnable != 0
		set(value) { rasterizationState.rasterizerDiscardEnable = if(value) 1 else 0 }

	var polygonMode
		get() = rasterizationState.polygonMode
		set(value) { rasterizationState.polygonMode = value }

	var cullMode
		get() = rasterizationState.cullMode
		set(value) { rasterizationState.cullMode = value }

	var frontFace
		get() = rasterizationState.frontFace
		set(value) { rasterizationState.frontFace = value }

	var depthBiasEnable
		get() = rasterizationState.depthBiasEnable != 0
		set(value) { rasterizationState.depthBiasEnable = if(value) 1 else 0 }

	var depthBiasConstantFactor
		get() = rasterizationState.depthBiasConstantFactor
		set(value) { rasterizationState.depthBiasConstantFactor = value }

	var depthBiasSlopeFactor
		get() = rasterizationState.depthBiasSlopeFactor
		set(value) { rasterizationState.depthBiasSlopeFactor = value }

	var lineWidth
		get() = rasterizationState.lineWidth
		set(value) { rasterizationState.lineWidth = value }



	/*
	Multisample state
	 */



	val multisampleState = allocator.PipelineMultisampleStateCreateInfo {
		it.rasterizationSamples = SampleCountFlags._1
	}



	var rasterizationSamples
		get() = multisampleState.rasterizationSamples
		set(value) { multisampleState.rasterizationSamples = value }

	var sampleShadingEnable
		get() = multisampleState.sampleShadingEnable != 0
		set(value) { multisampleState.sampleShadingEnable = if(value) 1 else 0 }

	var minSampleShading
		get() = multisampleState.minSampleShading
		set(value) { multisampleState.minSampleShading = value }

	var alphaToCoverageEnable
		get() = multisampleState.alphaToCoverageEnable != 0
		set(value) { multisampleState.alphaToCoverageEnable = if(value) 1 else 0 }

	var alphaToOneEnable
		get() = multisampleState.alphaToOneEnable != 0
		set(value) { multisampleState.alphaToOneEnable = if(value) 1 else 0 }



	/*
	Depth stencil state
	 */



	private val depthStencilState = allocator.PipelineDepthStencilStateCreateInfo { }



	fun frontStencil(
		failOp      : StencilOp = StencilOp.KEEP,
		passOp      : StencilOp = StencilOp.KEEP,
		depthFailOp : StencilOp = StencilOp.KEEP,
		compareOp   : CompareOp = CompareOp.NEVER,
		compareMask : Int       = UInt.MAX_VALUE.toInt(),
		writeMask   : Int       = UInt.MAX_VALUE.toInt(),
		reference   : Int       = 0
	) {
		depthStencilState.stencilTestEnable = VK_TRUE
		depthStencilState.front.let {
			it.failOp = failOp
			it.passOp = passOp
			it.depthFailOp = depthFailOp
			it.compareOp = compareOp
			it.compareMask = compareMask
			it.writeMask = writeMask
			it.reference = reference
		}
	}



	fun backStencil(
		failOp      : StencilOp = StencilOp.KEEP,
		passOp      : StencilOp = StencilOp.KEEP,
		depthFailOp : StencilOp = StencilOp.KEEP,
		compareOp   : CompareOp = CompareOp.NEVER,
		compareMask : Int       = UInt.MAX_VALUE.toInt(),
		writeMask   : Int       = UInt.MAX_VALUE.toInt(),
		reference   : Int       = 0
	) {
		depthStencilState.stencilTestEnable = VK_TRUE
		depthStencilState.back.let {
			it.failOp = failOp
			it.passOp = passOp
			it.depthFailOp = depthFailOp
			it.compareOp = compareOp
			it.compareMask = compareMask
			it.writeMask = writeMask
			it.reference = reference
		}
	}



	fun singleStencil(
		failOp      : StencilOp = StencilOp.KEEP,
		passOp      : StencilOp = StencilOp.KEEP,
		depthFailOp : StencilOp = StencilOp.KEEP,
		compareOp   : CompareOp = CompareOp.NEVER,
		compareMask : Int       = UInt.MAX_VALUE.toInt(),
		writeMask   : Int       = UInt.MAX_VALUE.toInt(),
		reference   : Int       = 0
	) {
		frontStencil(failOp, passOp, depthFailOp, compareOp, compareMask, writeMask, reference)
		backStencil(failOp, passOp, depthFailOp, compareOp, compareMask, writeMask, reference)
	}



	var depthTestEnable
		get() = depthStencilState.depthBoundsTestEnable != 0
		set(value) { depthStencilState.depthTestEnable = if(value) 1 else 0 }

	var depthWriteEnable
		get() = depthStencilState.depthWriteEnable != 0
		set(value) { depthStencilState.depthWriteEnable = if(value) 1 else 0 }

	var depthCompareOp
		get() = depthStencilState.depthCompareOp
		set(value) { depthStencilState.depthCompareOp = value }

	var depthBoundsTestEnable
		get() = depthStencilState.depthBoundsTestEnable != 0
		set(value) { depthStencilState.depthBoundsTestEnable = if(value) 1 else 0 }

	var stencilTestEnable
		get() = depthStencilState.stencilTestEnable != 0
		set(value) { depthStencilState.stencilTestEnable = if(value) 1 else 0 }

	var front
		get() = depthStencilState.front
		set(value) { depthStencilState.front = value }

	var back
		get() = depthStencilState.back
		set(value) { depthStencilState.back = value }

	var minDepthBounds
		get() = depthStencilState.minDepthBounds
		set(value) { depthStencilState.minDepthBounds = value }

	var maxDepthBounds
		get() = depthStencilState.maxDepthBounds
		set(value) { depthStencilState.maxDepthBounds = value }



	/*
	Colour blend state
	 */



	val colourBlendState = allocator.PipelineColorBlendStateCreateInfo { }



	var colourAttachments
		get() = colourBlendState.attachments
		set(value) { colourBlendState.attachments = value }



	fun singleColourBlendAttachment() {
		colourBlendState.attachmentCount = 1
		colourBlendState.pAttachments = allocator.PipelineColorBlendAttachmentState {
			it.colorWriteMask = ColorComponentFlags { R + G + B + A }
		}.address
	}



	/*
	Dynamic state
	 */



	val dynamicState = allocator.PipelineDynamicStateCreateInfo {
		it.dynamicStates = allocator.mallocInt(32)
		it.dynamicStateCount = 0
	}

	fun addDynamicState(state: DynamicState) {
		if(dynamicState.dynamicStateCount >= 32) throw IllegalStateException("Illegal number of dynamic states.")
		dynamicState.dynamicStates[dynamicState.dynamicStateCount++] = state.value
	}

	fun dynamicViewportAndScissor() {
		addDynamicState(DynamicState.VIEWPORT)
		addDynamicState(DynamicState.SCISSOR)
		viewportState.viewportCount = 1
		viewportState.scissorCount = 1
	}



	/*
	Building
	 */



	fun build() = allocator.GraphicsPipelineCreateInfo {
		vertexInputState.vertexBindingDescriptionCount = vertexBindings.size
		vertexInputState.pVertexBindingDescriptions = vertexBindings.buffer.address
		vertexInputState.vertexAttributeDescriptionCount = vertexAttributes.size
		vertexInputState.pVertexAttributeDescriptions = vertexAttributes.buffer.address

		it.flags 				= flags
		it.stages 				= shaderStagesBuffer
		it.vertexInputState 	= vertexInputState
		it.inputAssemblyState 	= inputAssemblyState
		it.tessellationState 	= tessellationState
		it.viewportState 		= viewportState
		it.rasterizationState 	= rasterizationState
		it.multisampleState 	= multisampleState
		it.depthStencilState 	= depthStencilState
		it.colorBlendState 		= colourBlendState
		it.dynamicState 		= dynamicState
		it.layout 				= layout ?: error("Graphics pipeline must contain a pipeline layout.")
		it.renderPass 			= renderPass ?: error("Graphics pipeline must contain a render pass.")
		it.subpass 				= subpass
	}


}