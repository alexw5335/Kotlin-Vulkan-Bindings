package kvb.engine.gui

import kvb.engine.gui.layout.*
import kvb.engine.gui.type.*
import kvb.engine.gui.type.pane.AnchorPane
import kvb.engine.gui.type.pane.Box
import kvb.engine.gui.type.pane.Pane



@DslMarker
annotation class BaseMarker

fun vbox(block: Box.() -> Unit) = Box(Vertical).also(block)

fun hbox(block: Box.() -> Unit) = Box(Horizontal).also(block)

fun anchorPane(block: AnchorPane.() -> Unit) = AnchorPane().also(block)



fun Pane.vbox(block: Box.() -> Unit) = addChild(Box(Vertical), block)

fun Pane.hbox(block: Box.() -> Unit) = addChild(Box(Horizontal), block)

fun Pane.anchorPane(block: AnchorPane.() -> Unit) = addChild(AnchorPane(), block)



fun Pane.button(block: Button.() -> Unit) = addChild(Button(), block)

fun Pane.toggleButton(block: ToggleButton.() -> Unit) = addChild(ToggleButton(), block)

fun Pane.rect(block: RectBase.() -> Unit) = addChild(RectBase(), block)

fun Pane.text(block: TextBase.() -> Unit) = addChild(TextBase(), block)

fun Pane.textBox(block: TextBox.() -> Unit) = addChild(TextBox(), block)