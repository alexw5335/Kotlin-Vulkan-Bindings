package kvb.fontcreator

import kvb.vulkan.*
import kvb.window.WindowManager
import kvb.window.input.Button
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.math.sqrt

object FontCreator {


	private const val targetFps = 500

	private const val frameTime = 1_000_000 / targetFps



	private fun render() {
		Context.surfaceSystem.onRecord = {
/*			Context.binaryTexturePipeline.bindFully(it)
			it.bindVertexBuffer(Context.vertexBuffer)
			it.draw(4)

			if(displayLines) {
				Context.linePipeline.bindFully(it)
				it.bindVertexBuffer(Context.linesVertexBuffer)
				it.draw((Context.textureWidth - 1 + Context.textureHeight - 1) * 2)
			}*/

			it.bindPipelineAndDescriptorSets(Context.textPipeline)
			it.bindVertexBuffer(textBuffer)
			it.draw(6)
		}

		Context.surfaceSystem.record()
		Context.surfaceSystem.present()
	}



	private fun onMouseHold(button: Button) {
		if(button == Button.RIGHT_MOUSE) {
			if(!wasPressed) {
				offsetOriginX = offsetX
				offsetOriginY = offsetY
				cursorOriginX = Context.window.cursorX.toFloat()
				cursorOriginY = Context.window.cursorY.toFloat()
			}

			wasPressed = true

			if(!dragging) {
				val xdif = Context.window.cursorX - cursorOriginX
				val ydif = Context.window.cursorY - cursorOriginY
				val distance = sqrt(xdif * xdif + ydif * ydif)
				if(distance > 2F) dragging = true
			}

			if(dragging) {
				offsetX = offsetOriginX + (Context.window.cursorX - cursorOriginX) * zoom
				offsetY = offsetOriginY + (Context.window.cursorY - cursorOriginY) * zoom
			}

			return
		}

		if(button == Button.LEFT_MOUSE) {
			if(dragging) return

			with(Context) {
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

		offsetX += (Context.window.clientWidth / 2 - Context.window.cursorX) * -zoomDelta
		offsetY += (Context.window.clientHeight / 2 - Context.window.cursorY) * -zoomDelta
		offsetX += zoomDelta * Context.window.clientWidth / 2F
		offsetY += zoomDelta * Context.window.clientHeight / 2F
	}


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
	var maxZoom = Context.meshWidth / Context.textureHeight
	var minZoom = 0.5F



	val characters = listOf(
		BinaryCharacter('A', 0, 0, 5, 7, 0),
		BinaryCharacter('B', 6, 0, 5, 7, 0),
		BinaryCharacter('C', 12, 0, 5, 7, 0),
		BinaryCharacter('D', 18, 0, 5, 7, 0),
		BinaryCharacter('E', 24, 0, 5, 7, 0),
		BinaryCharacter('F', 30, 0, 5, 7, 0),
		BinaryCharacter('G', 36, 0, 5, 7, 0),
		BinaryCharacter('H', 42, 0, 5, 7, 0),
		BinaryCharacter('I', 48, 0, 5, 7, 0),
		BinaryCharacter('J', 56, 0, 5, 7, 0),
		BinaryCharacter('K', 0, 8, 5, 7, 0),
		BinaryCharacter('L', 6, 8, 5, 7, 0),
		BinaryCharacter('M', 12, 8, 5, 7, 0),
		BinaryCharacter('N', 18, 8, 5, 7, 0),
		BinaryCharacter('O', 24, 8, 5, 7, 0),
		BinaryCharacter('P', 30, 8, 5, 7, 0),
		BinaryCharacter('Q', 36, 8, 5, 7, 0),
		BinaryCharacter('R', 42, 8, 5, 7, 0),
		BinaryCharacter('S', 48, 8, 5, 7, 0),
		BinaryCharacter('T', 56, 8, 5, 7, 0),
		BinaryCharacter('U', 0, 16, 5, 7, 0),
		BinaryCharacter('V', 6, 16, 5, 7, 0),
		BinaryCharacter('W', 12, 16, 5, 7, 0),
		BinaryCharacter('X', 18, 16, 5, 7, 0),
		BinaryCharacter('Y', 24, 16, 5, 7, 0),
		BinaryCharacter('Z', 30, 16, 5, 7, 0),

		BinaryCharacter('1', 12, 30, 5, 7, 0),
		BinaryCharacter('2', 18, 30, 5, 7, 0),
		BinaryCharacter('3', 24, 30, 5, 7, 0),
		BinaryCharacter('4', 30, 30, 5, 7, 0),
		BinaryCharacter('5', 36, 30, 5, 7, 0),
		BinaryCharacter('6', 42, 30, 5, 7, 0),
		BinaryCharacter('7', 48, 30, 5, 7, 0),
		BinaryCharacter('8', 56, 30, 5, 7, 0),
		BinaryCharacter('9', 0, 38, 5, 7, 0),
		BinaryCharacter('0', 8, 38, 5, 7, 0),
	)



	val textBuffer = Context.memManager.vertexBuffer(floatArrayOf(
		0F, 0F, 0F, 0F,
		200F, 0F, 8F, 0F,
		0F, 200F, 0F, 8F,

		0F, 200F, 0F, 8F,
		200F, 200F, 8F, 8F,
		200F, 0F, 8F, 0F,
	))

	val textData = Context.memManager.uniformBuffer(byteArrayOf(
		0b11111111.toByte(),
		0b11111111.toByte(),
		0b11111111.toByte(),
		0b11111111.toByte(),

		0b11111111.toByte(),
		0b11111111.toByte(),
		0b11000000.toByte(),
		0b10000000.toByte(),

		0b11111111.toByte(),
		0b11111111.toByte(),
		0b11111111.toByte(),
		0b11111111.toByte(),

		0b11111111.toByte(),
		0b11111111.toByte(),
		0b11111111.toByte(),
		0b11111111.toByte(),

		0b11111111.toByte(),
		0b11111111.toByte(),
		0b11111111.toByte(),
		0b11111111.toByte(),
	))


	init {
		Context.testDescriptor.bufferWrite(0, textData)
	}


/*	val binaryData = Files.readAllBytes(Paths.get("res/binary_font_data.bff"))

	val binaryImage = Context.device.createImage2D(64, 64, ImageUsageFlags { TRANSFER_DST + SAMPLED })

	val binaryImageView = Context.device.createImageView(binaryImage)


	fun createTextBuffer(string: String) {
		val buffer = Context.memManager.vertexBuffer(string.length * 6 * 2 * 4) { byteBuffer ->
			byteBuffer.asFloatBuffer.let {
				var index = 0
				var x = 0F
				for(c in string) {
					val character = characters.first { char -> char.char == 'c' }
					it[index++] = x + character.x
					it[index++] = character.yOffset.toFloat()
					it[index++] = character.x.toFloat() / Context.textureWidth.toFloat()
					it[index++] = character.y.toFloat() / Context.textureHeight.toFloat()

					it[index++] = x + character.x + character.width
					it[index++] = character.yOffset.toFloat()
					it[index++] = (character.x.toFloat() + character.width) / Context.textureWidth.toFloat()
					it[index++] = (character.y.toFloat() + character.height) / Context.textureHeight.toFloat()
				}
			}
		}
	}



	init {
		Context.memManager.write(Context.stagingBuffer) { it[0] = binaryData }
		Context.memManager.transitionImageForShaderRead(binaryImage, Context.stagingBuffer)
	}*/




	fun save() {
		//val bytes = Context.stagingBuffer.data().asArray
		//Files.write(Paths.get("res/binary_font_data.bff"), bytes)
/*		val fullBytes = ByteArray(2 + characters.size * 6 + bytes.size)
		fullBytes[0] = Context.textureWidth.toByte()
		fullBytes[1] = Context.textureHeight.toByte()
		for((i, c) in characters.withIndex()) {
			fullBytes[2 + i * 6] = c.char.code.toByte()
			fullBytes[2 + i * 6 + 1] = c.x.toByte()
			fullBytes[2 + i * 6 + 2] = c.y.toByte()
			fullBytes[2 + i * 6 + 3] = c.width.toByte()
			fullBytes[2 + i * 6 + 4] = c.height.toByte()
			fullBytes[2 + i * 6 + 5] = c.yOffset.toByte()
		}
		System.arraycopy(bytes, 0, fullBytes, characters.size * 6, bytes.size)
		Files.write(Paths.get("res/binary_font_data_full.bff"), fullBytes)*/
	}



	fun load() {
		val bytes = Files.readAllBytes(Paths.get("res/binary_font_data.bff"))
		Context.memManager.write(Context.stagingBuffer) {
			it[0] = bytes
		}
		Context.memManager.updateImageForShaderRead(Context.image, Context.stagingBuffer)
	}



	fun run() {
		Context.window.show()
		Context.surfaceSystem.clearValues[0].rgba(0.1F, 0.5F, 0.2F, 1.0F)
		Context.window.onMouseHold = ::onMouseHold
		Context.window.onKeyPress = ::onKeyPress
		Context.window.onKeyRelease = ::onKeyRelease
		Context.window.onScroll = ::onScroll

		offsetX = (Context.window.clientWidth - Context.meshWidth) / 2F
		offsetY = (Context.window.clientHeight - Context.meshHeight) / 2F

		while(true) {
			val frameStart = System.nanoTime()

			WindowManager.pollEvents()
			if(WindowManager.windows.isEmpty()) break

			if(!Button.RIGHT_MOUSE.isPressed) {
				wasPressed = false
				dragging = false
			}

			Context.memManager.write(Context.transformUbo) {
				it[0] = Context.window.clientWidth.toFloat()
				it[4] = Context.window.clientHeight.toFloat()
				it[8] = offsetX
				it[12] = offsetY
				it[16] = zoom
			}

			Context.memManager.write(Context.colourUbo) {
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