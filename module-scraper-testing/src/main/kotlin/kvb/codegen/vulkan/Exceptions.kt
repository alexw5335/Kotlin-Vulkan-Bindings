package scraper.kvb.codegen.vulkan

import scraper.kvb.codegen.vulkan.xml.XmlElement



class ScrapeException(message: String) : RuntimeException(message)

fun err(message: String): Nothing = throw ScrapeException(message)

fun err(message: String, element: XmlElement): Nothing = err("$message. element=$element")

fun err(element: XmlElement): Nothing = err("invalid element: $element")