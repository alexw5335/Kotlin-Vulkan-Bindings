package kvb.engine.gui

import kvb.engine.gui.layout.*



fun vbox(block: Box.() -> Unit) = Box(VOrientation).also(block)

fun hbox(block: Box.() -> Unit) = Box(HOrientation).also(block)

fun anchorPane(block: AnchorPane.() -> Unit) = AnchorPane().also(block)

fun Pane.vbox(block: Box.() -> Unit) = addChild(Box(VOrientation), block)

fun Pane.hbox(block: Box.() -> Unit) = addChild(Box(HOrientation), block)

fun Pane.anchorPane(block: AnchorPane.() -> Unit) = addChild(AnchorPane(), block)

fun Pane.button(block: SimpleButton.() -> Unit) = addChild(SimpleButton(), block)

fun Pane.toggleButton(block: ToggleButton.() -> Unit) = addChild(ToggleButton(), block)

fun Pane.rect(block: RectBase.() -> Unit) = addChild(RectBase(), block)

fun Pane.text(block: SimpleText.() -> Unit) = addChild(SimpleText(), block)