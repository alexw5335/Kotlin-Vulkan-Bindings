package scraper

import scraper.xml.XmlElement



/*
Exceptions
 */



class VkScrapeException(message: String) : RuntimeException(message)

fun err(message: String): Nothing = throw VkScrapeException(message)

fun err(message: String, element: XmlElement): Nothing = err("$message. element=$element")

fun err(element: XmlElement): Nothing = err("invalid element: $element")