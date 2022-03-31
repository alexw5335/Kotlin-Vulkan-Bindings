package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.BaseDefaults
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.font.*
import kvb.engine.gui.layout.TextAlignment
import kvb.engine.vulkan.VkContext
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.memory.VkHeapAllocator
import kvb.vkwrapper.memory.VkHeapBuffer
import kotlin.math.round

class TextBase : Base() {


	var text: String = ""
		set(value) { field = value; rebuildParagraph() }

	var font: BinaryFont = Fonts.font
		set(value) { field = value; shouldAlign = true }

	var scale: Int
		get() = font.scale
		set(value) { font = font.scaled(value) }

	var lineSpacing = 1F
		set(value) { field = value; shouldAlign = true }

	var wrapWidth = 0F
		set(value) { field = value; shouldAlign = true }

	var alignment = TextAlignment.LEFT
		set(value) { field = value; shouldAlign = true }

	lateinit var paragraph: Paragraph
		private set

	private val heapBuffer = VkHeapBuffer(GuiGraphics.textAllocator, 256)

	var colour = BaseDefaults.textColour



	private fun rebuildParagraph() {
		paragraph = ParagraphBuilder(text, font, lineSpacing * font.scale, wrapWidth, alignment).build()
		this.width = paragraph.width
		this.height = paragraph.height
	}



	override fun align() {
		rebuildParagraph()

		heapBuffer.ensureCapacity(text.length * 16)
		VkContext.memoryManager.write(heapBuffer.internal, 0, text.length * 16L) {
			GuiGraphics.populateText(paragraph, it)
		}
	}



	override fun renderThis(x: Float, y: Float) {
		GuiGraphics.renderText(round(x), round(y), heapBuffer.internal, font.scale.toFloat(), text.length, colour)
	}


}