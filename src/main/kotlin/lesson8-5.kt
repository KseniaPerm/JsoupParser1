package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {

    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()

    val citations = doc.select(".bzpNIu")
    for (element in citations) {
        val text = element.text()
        println(text)
    }
}
