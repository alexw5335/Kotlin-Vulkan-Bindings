package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.font.Fonts
import kvb.engine.gui.font.Paragraph
import kvb.engine.gui.font.ParagraphBuilder
import kvb.engine.vulkan.VkContext
import kvb.vkwrapper.handle.Buffer
import kotlin.math.round

class TextBase : Base() {


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
		paragraph = ParagraphBuilder(Fonts.font, scale, lineSpacing, wrapWidth).build(text)
		this.width = paragraph!!.width
		this.height = paragraph!!.height

		if(text.isEmpty()) {
			if(buffer != null)
				GuiGraphics.textAllocator.free(buffer!!)

			buffer = null
			return
		}

		if(buffer == null || buffer!!.size < text.length * 16) {
			if(buffer != null) {
				GuiGraphics.textAllocator.free(buffer!!.memory, buffer!!.offset)
			}
			buffer = VkContext.device.createVertexBuffer(text.length * 16)
			GuiGraphics.textAllocator.allocate(buffer!!)
		}

		VkContext.memoryManager.write(buffer!!, 0, text.length * 16L) { data ->
			var i = 0
			for(line in paragraph!!.lines) {
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
	}



	override fun renderThis(x: Float, y: Float) {
		buffer?.let {
			GuiGraphics.renderText(round(x), round(y), it, scale, text.length)
		}
	}


}