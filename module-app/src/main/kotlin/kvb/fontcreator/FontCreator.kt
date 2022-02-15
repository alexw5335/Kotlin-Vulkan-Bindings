package kvb.fontcreator

import kvb.app.MemManager
import kvb.vkwrapper.handle.ImageView
import kvb.vkwrapper.handle.Sampler
import kvb.vkwrapper.shader.ShaderCreation
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.*
import kvb.window.WindowManager
import kvb.window.input.Button
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.math.sqrt

object FontCreator {

	
	private val window = WindowManager.create("Binary Font Creator", 0, 0, 700, 700)

	private val context = Context(window)
	
	private const val targetFps = 500

	private const val frameTime = 1_000_000 / targetFps



	private fun render() {
		context.surfaceSystem.onRecord = {
			it.bindPipelineAndDescriptorSets(binaryTexturePipeline)
			it.bindVertexBuffer(context.vertexBuffer)
			it.draw(4)

			if(displayLines) {
				it.bindPipelineAndDescriptorSets(linePipeline)
				it.bindVertexBuffer(context.linesVertexBuffer)
				it.draw((textureWidth - 1 + textureHeight - 1) * 2)
			}
		}

		context.surfaceSystem.record()
		context.surfaceSystem.present()
	}



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

			context.memManager.write(context.stagingBuffer) {
				val meshX = ((window.cursorX - window.clientWidth / 2) + window.clientWidth / 2) * zoom - offsetX
				val meshY = ((window.cursorY - window.clientHeight / 2) + window.clientHeight / 2) * zoom - offsetY
				val meshXIndex = (meshX * (textureWidth.toFloat() / meshWidth)).toInt()
				val meshYIndex = (meshY * (textureHeight.toFloat() / meshHeight)).toInt()

				if(meshXIndex in 0 until textureWidth && meshYIndex in 0 until textureHeight) {
					val colour = if(erase) BLACK else WHITE
					it[meshYIndex * textureWidth + meshXIndex] = colour
					context.memManager.updateImageForShaderRead(context.image, context.stagingBuffer)
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



	init {
		ShaderCreation.compileAll("res/shader/font_creator", "res/shader/font_creator/out")
	}

	val shaderDirectory = ShaderDirectory("res/shader/font_creator/out", context.device)

	val memManager = MemManager(context.device, context.queue)


	val transformUbo = memManager.buffer(4 * 5, BufferUsageFlags.UNIFORM_BUFFER)

	val colourUbo = memManager.buffer(4 * 4, BufferUsageFlags.UNIFORM_BUFFER)



	val transformDescriptor = descriptorPool.createSet(DescriptorType.UNIFORM_BUFFER, ShaderStageFlags.VERTEX).also {
		it.bufferWrite(0, transformUbo)
	}

	val textureDescriptor = descriptorPool.createSet(DescriptorType.COMBINED_IMAGE_SAMPLER, ShaderStageFlags.FRAGMENT)

	val colourDescriptor = descriptorPool.createSet(DescriptorType.UNIFORM_BUFFER, ShaderStageFlags.FRAGMENT).also {
		it.bufferWrite(0, colourUbo)
	}

	val testDescriptor = descriptorPool.createSet(DescriptorType.UNIFORM_BUFFER, ShaderStageFlags.FRAGMENT)



	fun setTexture(sampler: Sampler, imageView: ImageView) {
		textureDescriptor.imageWrite(0, sampler, imageView, ImageLayout.SHADER_READ_ONLY_OPTIMAL)
	}
	

	val binaryTexturePipeline = context.device.buildGraphicsPipeline {
		vertexBinding { vec2(); vec2() }
		renderPass(context.renderPass)
		descriptorSets(0 to context.transformDescriptor, 1 to context.textureDescriptor)
		shaders(context.shaderDirectory["binary_texture"])
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}



	val linePipeline = context.device.buildGraphicsPipeline {
		vertexBinding { vec2() }
		renderPass(context.renderPass)
		descriptorSets(0 to context.transformDescriptor, 1 to context.colourDescriptor)
		shaders(context.shaderDirectory["line"])
		lineList()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}


	
	val textureWidth = 64
	val textureHeight = 64
	val meshWidth = 512F
	val meshHeight = 512F
	var wasPressed = false
	var offsetOriginX = 0F
	var offsetOriginY = 0F
	var cursorOriginX = 0F
	var cursorOriginY = 0F
	var dragging = false
	var displayLines = false
	var erase = false
	var offsetX = 0F
	var offsetY = 0F
	var zoom = 1F
	var BLACK = 0.toByte()
	var WHITE = (-1).toByte()
	var maxZoom = meshWidth / textureHeight
	var minZoom = 0.3F



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



	val sampler = device.createSampler(Filter.NEAREST, Filter.NEAREST)

	val image = memManager.image(textureWidth, textureHeight, ImageUsageFlags { TRANSFER_DST + SAMPLED }, Format.R8_SRGB)

	val imageView = device.createImageView(image)

	val stagingBuffer = memManager.buffer(500_000, BufferUsageFlags.TRANSFER_SRC)



	init {
		memManager.transitionImageForShaderRead(image, stagingBuffer)
		setTexture(sampler, imageView)
	}




	fun save() {
		Files.write(Paths.get("res/binary_font_data.bff"), context.stagingBuffer.data().asArray)
	}



	fun load() {
		val bytes = Files.readAllBytes(Paths.get("res/binary_font_data.bff"))
		context.memManager.write(context.stagingBuffer) {
			it[0] = bytes
		}
		context.memManager.updateImageForShaderRead(context.image, context.stagingBuffer)
	}



	fun run() {
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

			context.memManager.write(context.transformUbo) {
				it[0] = window.clientWidth.toFloat()
				it[4] = window.clientHeight.toFloat()
				it[8] = offsetX
				it[12] = offsetY
				it[16] = zoom
			}

			context.memManager.write(context.colourUbo) {
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