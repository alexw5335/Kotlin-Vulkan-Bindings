package kvb.engine.gui

import kvb.engine.gui.font.Fonts
import kvb.engine.gui.font.Paragraph
import kvb.engine.gui.font.ParagraphBuilder
import kvb.engine.vulkan.VkContext
import kvb.vkwrapper.handle.Buffer
import kvb.vulkan.BufferUsageFlags
import kotlin.math.round

class SimpleText : Base() {


	var text: String = ""
		set(value) { field = value; shouldAlign = true }

	var scale = 1F
		set(value) { field = value; shouldAlign = true }

	var lineSpacing = 1F
		set(value) { field = value; shouldAlign = true }

	var wrapWidth = 0F
		set(value) { field = value; shouldAlign = true }

	var paragraph: Paragraph? = null
		private set

	var buffer: Buffer? = null
		private set



	override fun align() {
		val paragraph = ParagraphBuilder(Fonts.font, scale, lineSpacing, wrapWidth).build(text)
		if(buffer == null || buffer!!.size < text.length * 16) {
			buffer = VkContext.device.createVertexBuffer(text.length * 16)
			buffer!!.bindMemory(GuiGraphics.textAllocator.allocate(buffer!!))
		}

		buffer!!.flush { data ->
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

		this.paragraph = paragraph
		this.buffer = buffer

		width = paragraph.width
		height = paragraph.height
	}



	override fun renderThis(x: Float, y: Float) {
		buffer?.let {
			GuiGraphics.renderText(round(x), round(y), it, scale, text.length)
		}
	}


}