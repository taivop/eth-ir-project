package main.scala

object Hi {
  def main(args: Array[String]) = {
    println("Hi!")
    println(LanguageDetector.detect("das ist mein Vater"))
    println(LanguageDetector.detect("I like this bowl of soup"))

    Crawler.report()
  }
}
