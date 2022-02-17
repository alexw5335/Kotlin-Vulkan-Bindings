package kvb.fontcreator

import kvb.app.MemManager
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectLong
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


	val textureWidth = 128

	val textureHeight = 128

	val meshWidth = 512F

	val meshHeight = 512F

	val sectionWidth = 7

	val sectionHeight = 9

	val numSectionsX = textureWidth / sectionWidth

	val numSectionsY = textureHeight / sectionHeight



	/*
	Transform
	 */



	var offsetX = 0F

	var offsetY = 0F

	var zoom = 1F

	var maxZoom = meshWidth / textureHeight

	var minZoom = 0.1F



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



	val binaryTexturePipeline = context.device.buildGraphicsPipeline {
		vertexBinding { vec2(); vec2() }
		renderPass(context.renderPass)
		descriptorSet(0, transformDescriptor)
		descriptorSet(1, textureDescriptor)
		shaders(shaderDirectory["binary_texture"])
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}



	val linePipeline = context.device.buildGraphicsPipeline {
		vertexBinding { vec2() }
		renderPass(context.renderPass)
		descriptorSet(0, transformDescriptor)
		pushConstant(ShaderStageFlags.FRAGMENT, 0, 16)
		shaders(shaderDirectory["line"])
		lineList()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}




	val fontPipeline = context.device.buildGraphicsPipeline {
		vertexBinding { vec2(); uvec2()  }
		renderPass(context.renderPass)
		descriptorSet(0, transformDescriptor)
		shaders(shaderDirectory["font"])
		pointList()
		simpleBlendAttachment()
		dynamicViewportAndScissor()
	}




	/*
	Vertex buffers
	 */



	fun createFontVertexBuffer(scale: Float, xOffset: Float, yOffset: Float, text: String) = memManager.buffer(text.length * 16, BufferUsageFlags.VERTEX_BUFFER) {
		var index = 0
		var x = xOffset
		val y = yOffset

		for(c in text) {
			val char = globalCharacters.firstOrNull { it.char == c } ?: BinaryCharacter(' ', 0L, 0, 0, 3, 0)

			it[index] = x + char.xOffset * scale
			it[index + 4] = y + char.yOffset * scale
			it[index + 8] = char.texture

			x += (char.width + 1) * scale
			index += 16
		}
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



	val sectionsVertexBuffer = memManager.buffer((numSectionsX - 1 + numSectionsY - 1) * 16, BufferUsageFlags.VERTEX_BUFFER) {
		var index = 0
		val scale = meshWidth / textureWidth

		for(i in 1 until numSectionsX) {
			it[index] = i.toFloat() * scale * sectionWidth
			it[index + 4] = 0F
			it[index + 8] = i.toFloat() * scale * sectionWidth
			it[index + 12] = textureHeight.toFloat() * scale
			index += 16
		}

		for(i in 1 until numSectionsY) {
			it[index] = 0F
			it[index + 4] = i.toFloat() * scale * sectionHeight
			it[index + 8] = textureWidth.toFloat() * scale
			it[index + 12] = i.toFloat() * scale * sectionHeight
			index += 16
		}
	}



	/*
	Update
	 */



	val string = "Testing ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789 abcdefghijklmnopqrstuvwxyz " +
		"[]{}();:' This is a \'test\'; \"The brown fox jumps over the lazy dog\":" +
		" 123456789 - 10 + 14 * 15 = &myPointer - 1_000_000 + 10, although this isn't always the case." +
		" (Test) <Test> {Test} [Test], myArray[7], @Test ~15? // This is a comment. C:\\\\Users |Test| ;test;"


	var fontVertexBuffer = createFontVertexBuffer(2F, 0F, -100F, string)



	fun save() {
		Files.write(Paths.get("res/binary_font_data.bff"), stagingBuffer.data().asArray)
		val data = stagingBuffer.data().asArray

		var index = 0

		val values = LongArray(numSectionsX * numSectionsY)

		for(yIndex in 0 until numSectionsY) {
			for(xIndex in 0 until numSectionsX) {
				var value = 0L

				for(y in 0 until sectionHeight) {
					for(x in 0 until sectionWidth) {
						if(data[(yIndex * sectionHeight + y) * textureWidth + xIndex * sectionWidth + x] == WHITE) {
							value = value or (1L shl (y * sectionWidth + x))
						}
					}
				}
				
				values[index++] = value
			}
		}
		
		var i = 0
		fun texture() = values[i++]

		val characters = listOf(
			BinaryCharacter('A', texture(), 0, 0, 3, 7),
			BinaryCharacter('B', texture(), 0, 0, 3, 7),
			BinaryCharacter('C', texture(), 0, 0, 3, 7),
			BinaryCharacter('D', texture(), 0, 0, 3, 7),
			BinaryCharacter('E', texture(), 0, 0, 3, 7),
			BinaryCharacter('F', texture(), 0, 0, 3, 7),
			BinaryCharacter('G', texture(), 0, 0, 3, 7),
			BinaryCharacter('H', texture(), 0, 0, 3, 7),
			BinaryCharacter('I', texture(), 0, 0, 3, 7),
			BinaryCharacter('J', texture(), 0, 0, 3, 7),
			BinaryCharacter('K', texture(), 0, 0, 3, 7),
			BinaryCharacter('L', texture(), 0, 0, 3, 7),
			BinaryCharacter('M', texture(), 0, 0, 5, 7),
			BinaryCharacter('N', texture(), 0, 0, 3, 7),
			BinaryCharacter('O', texture(), 0, 0, 3, 7),
			BinaryCharacter('P', texture(), 0, 0, 3, 7),
			BinaryCharacter('Q', texture(), 0, 0, 3, 9),
			BinaryCharacter('R', texture(), 0, 0, 3, 7),
			BinaryCharacter('S', texture(), 0, 0, 3, 7),
			BinaryCharacter('T', texture(), 0, 0, 3, 7),
			BinaryCharacter('U', texture(), 0, 0, 3, 7),
			BinaryCharacter('V', texture(), 0, 0, 3, 7),
			BinaryCharacter('W', texture(), 0, 0, 5, 7),
			BinaryCharacter('X', texture(), 0, 0, 3, 7),
			BinaryCharacter('Y', texture(), 0, 0, 3, 7),
			BinaryCharacter('Z', texture(), 0, 0, 3, 7),

			BinaryCharacter('0', texture(), 0, 0, 3, 7),
			BinaryCharacter('1', texture(), 0, 0, 3, 7),
			BinaryCharacter('2', texture(), 0, 0, 3, 7),
			BinaryCharacter('3', texture(), 0, 0, 3, 7),
			BinaryCharacter('4', texture(), 0, 0, 3, 7),
			BinaryCharacter('5', texture(), 0, 0, 3, 7),
			BinaryCharacter('6', texture(), 0, 0, 3, 7),
			BinaryCharacter('7', texture(), 0, 0, 3, 7),
			BinaryCharacter('8', texture(), 0, 0, 3, 7),
			BinaryCharacter('9', texture(), 0, 0, 3, 7),

			BinaryCharacter('a', texture(), 0, 2, 3, 5),
			BinaryCharacter('b', texture(), 0, 0, 3, 7),
			BinaryCharacter('c', texture(), 0, 2, 3, 5),
			BinaryCharacter('d', texture(), 0, 0, 3, 7),
			BinaryCharacter('e', texture(), 0, 2, 3, 5),
			BinaryCharacter('f', texture(), 0, 0, 3, 7),
			BinaryCharacter('g', texture(), 0, 2, 3, 7),
			BinaryCharacter('h', texture(), 0, 0, 3, 7),
			BinaryCharacter('i', texture(), 0, 0, 1, 7),
			BinaryCharacter('j', texture(), 0, 0, 3, 9),
			BinaryCharacter('k', texture(), 0, 0, 3, 7),
			BinaryCharacter('l', texture(), 0, 0, 1, 7),
			BinaryCharacter('m', texture(), 0, 2, 5, 5),
			BinaryCharacter('n', texture(), 0, 2, 3, 5),
			BinaryCharacter('o', texture(), 0, 2, 3, 5),
			BinaryCharacter('p', texture(), 0, 2, 3, 7),
			BinaryCharacter('q', texture(), 0, 2, 3, 7),
			BinaryCharacter('r', texture(), 0, 2, 3, 5),
			BinaryCharacter('s', texture(), 0, 2, 3, 5),
			BinaryCharacter('t', texture(), 0, 0, 3, 7),
			BinaryCharacter('u', texture(), 0, 2, 3, 5),
			BinaryCharacter('v', texture(), 0, 2, 3, 5),
			BinaryCharacter('w', texture(), 0, 2, 5, 5),
			BinaryCharacter('x', texture(), 0, 2, 3, 5),
			BinaryCharacter('y', texture(), 0, 2, 3, 7),
			BinaryCharacter('z', texture(), 0, 2, 3, 5),

			BinaryCharacter('[', texture(), 0, 0, 3, 9),
			BinaryCharacter(']', texture(), 0, 0, 3, 9),
			BinaryCharacter('{', texture(), 0, 0, 3, 9),
			BinaryCharacter('}', texture(), 0, 0, 3, 9),
			BinaryCharacter('(', texture(), 0, 0, 3, 9),
			BinaryCharacter(')', texture(), 0, 0, 3, 9),
			BinaryCharacter('<', texture(), 0, 2, 3, 5),
			BinaryCharacter('>', texture(), 0, 2, 3, 5),
			BinaryCharacter('/', texture(), 0, 0, 3, 9),
			BinaryCharacter('\\', texture(), 0, 0, 3, 9),
			BinaryCharacter('|', texture(), 0, 0, 1, 9),
			BinaryCharacter('?', texture(), 0, 0, 3, 7),
			BinaryCharacter(':', texture(), 0, 2, 1, 5),
			BinaryCharacter(';', texture(), 0, 2, 2, 6),
			BinaryCharacter('"', texture(), 0, 0, 3, 2),
			BinaryCharacter('\'', texture(), 0, 0, 1, 2),
			BinaryCharacter('.', texture(), 0, 6, 1, 1),
			BinaryCharacter(',', texture(), 0, 6, 2, 3),
			BinaryCharacter('!', texture(), 0, 0, 1, 7),
			BinaryCharacter('@', texture(), 0, 0, 7, 9),
			BinaryCharacter('#', texture(), 0, 0, 5, 7),
			BinaryCharacter('$', texture(), 0, 0, 5, 9),
			BinaryCharacter('%', texture(), 0, 0, 5, 7),
			BinaryCharacter('^', texture(), 0, 0, 3, 3),
			BinaryCharacter('&', texture(), 0, 0, 5, 7),
			BinaryCharacter('*', texture(), 0, 0, 5, 5),
			BinaryCharacter('-', texture(), 0, 3, 3, 1),
			BinaryCharacter('_', texture(), 0, 6, 5, 1),
			BinaryCharacter('+', texture(), 0, 2, 3, 3),
			BinaryCharacter('=', texture(), 0, 2, 3, 3),
			BinaryCharacter('`', texture(), 0, 0, 2, 2),
			BinaryCharacter('~', texture(), 0, 2, 5, 3),
			BinaryCharacter(0.toChar(), texture(), 0, 0, 7, 9)
		)

		for(c in characters) {
			val char = when(c.char) {
				0.toChar() -> "0.toChar()"
				'\''       -> "'\\''"
				'\\'       -> "'\\\\'"
				else       -> "'${c.char}'"
			}

			with(c) {
				println("BinaryCharacter($char, $texture, $xOffset, $yOffset, $width, $height),")
			}
		}

		globalCharacters = characters
		fontVertexBuffer = createFontVertexBuffer(1F, 0F, -100F, string)
	}



	fun load() {
		val bytes = Files.readAllBytes(Paths.get("res/binary_font_data.bff"))
		memManager.write(stagingBuffer) {
			it[0] = bytes
		}
		memManager.updateImageForShaderRead(image, stagingBuffer)
	}



	private val lineColour = Unsafe.mallocFloat(4)



	private fun render() {
		context.surfaceSystem.onRecord = {
			it.bindPipelineAndDescriptorSets(binaryTexturePipeline)
			it.bindVertexBuffer(vertexBuffer)
			it.draw(4)

			if(displayLines) {
				it.bindPipelineAndDescriptorSets(linePipeline)

				lineColour.let { it[0] = 0.3F; it[1] = 0.3F; it[2] = 0.3F }
				it.pushConstants(linePipeline.layout, ShaderStageFlags.FRAGMENT, 0, 16, DirectLong(lineColour.address))
				it.bindVertexBuffer(linesVertexBuffer)
				it.draw((textureWidth - 1 + textureHeight - 1) * 2)

				lineColour.let { it[0] = 1F; it[1] = 0F; it[2] = 0F }
				it.pushConstants(linePipeline.layout, ShaderStageFlags.FRAGMENT, 0, 16, DirectLong(lineColour.address))
				it.bindVertexBuffer(sectionsVertexBuffer)
				it.draw((numSectionsX - 1 + numSectionsY - 1) * 2)
			}

			it.bindPipelineAndDescriptorSets(fontPipeline)
			it.bindVertexBuffer(fontVertexBuffer)
			it.draw(fontVertexBuffer.size.toInt() / 16)
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

			render()

			val elapsedMicroseconds = (System.nanoTime() - frameStart) / 1_000

			if(elapsedMicroseconds < frameTime) {
				Thread.sleep((frameTime - elapsedMicroseconds) / 1000)
			}
		}
	}


}