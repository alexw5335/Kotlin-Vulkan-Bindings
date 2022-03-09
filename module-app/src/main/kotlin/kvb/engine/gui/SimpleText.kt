package kvb.engine.gui

import kvb.engine.gui.font.Fonts
import kvb.engine.vulkan.VkContext
import kvb.vkwrapper.handle.Buffer
import kvb.vulkan.BufferUsageFlags

class SimpleText(val text: String, val scale: Float) : Base() {


	val buffer = createBuffer()



	private fun createBuffer(): Buffer {
		val buffer = VkContext.device.createBuffer(text.length * 16L, BufferUsageFlags.VERTEX_BUFFER)
		buffer.bindMemory(GuiGraphics.textAllocator.allocate(buffer))

		buffer.flush { data ->
			var x = 0F
			val y = 0F

			for((i, c) in text.withIndex()) {
				val char = Fonts.font[c]

				data.setFloat(i * 16 + 0, x + char.xOffset * scale)
				data.setFloat(i * 16 + 4, y + char.yOffset * scale)
				data.setLong(i * 16 + 8, char.texture)
				x += (char.width + 1) * scale
			}

			width = x - scale
			height = Fonts.font.size.toFloat()
		}


		return buffer
	}



	override fun renderThis(x: Float, y: Float) {
		GuiGraphics.renderText(x, y, buffer, scale, text.length)
	}


}