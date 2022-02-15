package kvb.fontcreator

import kvb.app.MemManager
import kvb.vkwrapper.shader.ShaderCreation
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.*
import kvb.window.WindowManager
import kvb.window.input.Button
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.math.sqrt

object FontCreator {


	init {
		ShaderCreation.compileAll("res/shader/font_creator", "res/shader/font_creator/out")
	}



	val window = WindowManager.create("Binary Font Creator", 0, 0, 700, 700)

	val context = Context(window)

	val shaderDirectory = ShaderDirectory("res/shader/font_creator/out", context.device)

	val memManager = MemManager(context.device, context.queue)



	/*
	Render
	 */



	val targetFps = 500

	val frameTime = 1_000_000 / targetFps



	/*
	Mesh dimensions
	 */


	val textureWidth = 64

	val textureHeight = 64

	val meshWidth = 512F

	val meshHeight = 512F



	/*
	Transform
	 */



	var offsetX = 0F

	var offsetY = 0F

	var zoom = 1F

	var maxZoom = meshWidth / textureHeight

	var minZoom = 0.3F



	/*
	Editing
	 */



	var displayLines = false

	var erase = false

	val BLACK = 0.toByte()

	val WHITE = (-1).toByte()



	/*
	Mouse
	 */



	var wasPressed = false

	var offsetOriginX = 0F

	var offsetOriginY = 0F

	var cursorOriginX = 0F

	var cursorOriginY = 0F

	var dragging = false



	private fun onMouseHold(button: Button) {
		if(button == Button.RIGHT_MOUSE) {
			if(!wasPressed) {
				offsetOriginX = offsetX
				offsetOriginY = offsetY
				cursorOriginX = window.cursorX.toFloat()
				cursorOriginY = window.cursorY.toFloat()
			}

			wasPressed = true

			if(!dragging) {
				val xdif = window.cursorX - cursorOriginX
				val ydif = window.cursorY - cursorOriginY
				val distance = sqrt(xdif * xdif + ydif * ydif)
				if(distance > 2F) dragging = true
			}

			if(dragging) {
				offsetX = offsetOriginX + (window.cursorX - cursorOriginX) * zoom
				offsetY = offsetOriginY + (window.cursorY - cursorOriginY) * zoom
			}

			return
		}

		if(button == Button.LEFT_MOUSE) {
			if(dragging) return

			memManager.write(stagingBuffer) {
				val meshX = ((window.cursorX - window.clientWidth / 2) + window.clientWidth / 2) * zoom - offsetX
				val meshY = ((window.cursorY - window.clientHeight / 2) + window.clientHeight / 2) * zoom - offsetY
				val meshXIndex = (meshX * (textureWidth.toFloat() / meshWidth)).toInt()
				val meshYIndex = (meshY * (textureHeight.toFloat() / meshHeight)).toInt()

				if(meshXIndex in 0 until textureWidth && meshYIndex in 0 until textureHeight) {
					val colour = if(erase) BLACK else WHITE
					it[meshYIndex * textureWidth + meshXIndex] = colour
					memManager.updateImageForShaderRead(image, stagingBuffer)
				}
			}
		}
	}



	private fun onKeyPress(button: Button) {
		if(button == Button.E)
			erase = true
	}



	private fun onKeyRelease(button: Button) {
		when(button) {
			Button.Q -> displayLines = !displayLines
			Button.E -> erase = false
			Button.B -> save()
			Button.N -> load()
			else -> { }
		}
	}



	private fun onScroll(scroll: Int) {
		if(dragging) return
		var zoomDelta = -scroll/1200F
		if(zoom + zoomDelta > maxZoom) zoomDelta = maxZoom - zoom
		else if(zoom + zoomDelta < minZoom) zoomDelta = minZoom - zoom
		zoom += zoomDelta

		offsetX += (window.clientWidth / 2 - window.cursorX) * -zoomDelta
		offsetY += (window.clientHeight / 2 - window.cursorY) * -zoomDelta
		offsetX += zoomDelta * window.clientWidth / 2F
		offsetY += zoomDelta * window.clientHeight / 2F
	}



	/*
	Pipelines
	 */



	val transformUbo = memManager.buffer(4 * 5, BufferUsageFlags.UNIFORM_BUFFER)

	val colourUbo = memManager.buffer(4 * 4, BufferUsageFlags.UNIFORM_BUFFER)

	val sampler = context.device.createSampler(Filter.NEAREST, Filter.NEAREST)

	val image = memManager.image(textureWidth, textureHeight, ImageUsageFlags { TRANSFER_DST + SAMPLED }, Format.R8_SRGB)

	val imageView = context.device.createImageView(image)

	val stagingBuffer = memManager.buffer(500_000, BufferUsageFlags.TRANSFER_SRC)



	val transformDescriptor = context.descriptorPool.createSet(
		DescriptorType.UNIFORM_BUFFER,
		ShaderStageFlags.VERTEX,
		transformUbo
	)

	val textureDescriptor = context.descriptorPool.createSet(
		DescriptorType.COMBINED_IMAGE_SAMPLER,
		ShaderStageFlags.FRAGMENT,
		sampler,
		imageView,
		ImageLayout.SHADER_READ_ONLY_OPTIMAL
	)

	val lineColourDescriptor = context.descriptorPool.createSet(
		DescriptorType.UNIFORM_BUFFER,
		ShaderStageFlags.FRAGMENT,
		colourUbo
	)



	val binaryTexturePipeline = context.device.buildGraphicsPipeline {
		vertexBinding { vec2(); vec2() }
		renderPass(context.renderPass)
		descriptorSets(0 to transformDescriptor, 1 to textureDescriptor)
		shaders(shaderDirectory["binary_texture"])
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}



	val linePipeline = context.device.buildGraphicsPipeline {
		vertexBinding { vec2() }
		renderPass(context.renderPass)
		descriptorSets(0 to transformDescriptor, 1 to lineColourDescriptor)
		shaders(shaderDirectory["line"])
		lineList()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}




	val fontPipeline = context.device.buildGraphicsPipeline {
		vertexBinding { vec4(); u32() }
		renderPass(context.renderPass)
		descriptorSets(0 to transformDescriptor)
		shaders(shaderDirectory["font"])
		pointList()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}




	/*
	Vertex buffers
	 */



	val fontVertexBuffer = memManager.buffer(20, BufferUsageFlags.VERTEX_BUFFER) {
		it[0] = 0F
		it[4] = 0F
		it[8] = 400F
		it[12] = 400F

		it[16] = byteArrayOf(
			0b00010101,
			0b00010101,
			0b00010101,
			0b00010101
		)
	}



	val vertexBuffer = memManager.buffer(BufferUsageFlags.VERTEX_BUFFER, floatArrayOf(
		0F, 0F, 0F, 0F,
		meshWidth, 0F, 1F, 0F,
		0F, meshHeight, 0F, 1F,
		meshWidth, meshHeight, 1F, 1F
	))



	val linesVertexBuffer = memManager.buffer((textureWidth - 1 + textureHeight - 1) * 16, BufferUsageFlags.VERTEX_BUFFER) {
		var index = 0
		val scale = meshWidth / textureWidth

		for(i in 1 until textureWidth) {
			it[index] = i.toFloat() * scale
			it[index + 4] = 0F
			it[index + 8] = i.toFloat() * scale
			it[index + 12] = textureHeight.toFloat() * scale
			index += 16
		}

		for(i in 1 until textureHeight) {
			it[index] = 0F
			it[index + 4] = i.toFloat() * scale
			it[index + 8] = textureWidth.toFloat() * scale
			it[index + 12] = i.toFloat() * scale
			index += 16
		}
	}



	/*
	Update
	 */

	

	fun save() {
		Files.write(Paths.get("res/binary_font_data.bff"), stagingBuffer.data().asArray)
	}



	fun load() {
		val bytes = Files.readAllBytes(Paths.get("res/binary_font_data.bff"))
		memManager.write(stagingBuffer) {
			it[0] = bytes
		}
		memManager.updateImageForShaderRead(image, stagingBuffer)
	}




	private fun render() {
		context.surfaceSystem.onRecord = {
			//it.bindPipelineAndDescriptorSets(binaryTexturePipeline)
			//it.bindVertexBuffer(vertexBuffer)
			//it.draw(4)

			//if(displayLines) {
			//	it.bindPipelineAndDescriptorSets(linePipeline)
			//	it.bindVertexBuffer(linesVertexBuffer)
			//	it.draw((textureWidth - 1 + textureHeight - 1) * 2)
			//}

			it.bindPipelineAndDescriptorSets(fontPipeline)
			it.bindVertexBuffer(fontVertexBuffer)
			it.draw(1)
		}

		context.surfaceSystem.record()
		context.surfaceSystem.present()
	}



	fun run() {
		memManager.transitionImageForShaderRead(image, stagingBuffer)
		context.surfaceSystem.clearValues[0].rgba(0.1F, 0.5F, 0.2F, 1.0F)
		window.show()
		window.onMouseHold  = ::onMouseHold
		window.onKeyPress   = ::onKeyPress
		window.onKeyRelease = ::onKeyRelease
		window.onScroll     = ::onScroll

		offsetX = (window.clientWidth - meshWidth) / 2F
		offsetY = (window.clientHeight - meshHeight) / 2F

		while(true) {
			val frameStart = System.nanoTime()

			WindowManager.pollEvents()
			if(WindowManager.windows.isEmpty()) break

			if(!Button.RIGHT_MOUSE.isPressed) {
				wasPressed = false
				dragging = false
			}

			memManager.write(transformUbo) {
				it[0] = window.clientWidth.toFloat()
				it[4] = window.clientHeight.toFloat()
				it[8] = offsetX
				it[12] = offsetY
				it[16] = zoom
			}

			memManager.write(colourUbo) {
				val alpha = if(displayLines) 0.4F else 0.0F
				it[0] = alpha
				it[4] = alpha
				it[8] = alpha
				it[12] = alpha
			}

			render()

			val elapsedMicroseconds = (System.nanoTime() - frameStart) / 1_000

			if(elapsedMicroseconds < frameTime) {
				Thread.sleep((frameTime - elapsedMicroseconds) / 1000)
			}
		}
	}


}