package kvb.engine.gui

import kvb.engine.gui.font.Fonts
import kvb.engine.gui.font.ParagraphBuilder
import kvb.engine.vulkan.VkContext
import kvb.vkwrapper.handle.Buffer
import kvb.vulkan.BufferUsageFlags

class SimpleText(
	val text: String,
	val scale: Float,
	val lineSpacing: Float,
	val wrapWidth: Float
) : Base() {


	val paragraph = ParagraphBuilder(Fonts.font, scale, lineSpacing, wrapWidth).build(text)

	val buffer = createBuffer()



	init {
		width = paragraph.width
		height = paragraph.height
	}



	private fun createBuffer(): Buffer {
		val buffer = VkContext.device.createBuffer(text.length * 16L, BufferUsageFlags.VERTEX_BUFFER)
		buffer.bindMemory(GuiGraphics.textAllocator.allocate(buffer))

		buffer.flush { data ->
			var i = 0
			for(line in paragraph.lines) {
				var x = 0F

				for(binaryChar in line.chars) {
					data.setFloat(i, x)
					data.setFloat(i + 4, line.y + binaryChar.yOffset * scale)
					data.setLong(i + 8, binaryChar.texture)
					x += binaryChar.width * scale + scale
					i += 16
				}
			}
		}

		return buffer
	}



	override fun renderThis(x: Float, y: Float) {
		GuiGraphics.renderText(x, y, buffer, scale, text.length)
	}


}