package com.guizmaii.examples

object StringOps {
  implicit class StringOps(s: String) {
    def taille: Int = s.length
  }
}

object IntOps {
  implicit class IntOps(i: Int) {
    def plus_un: Int = i + 1
  }

  implicit val a = "qdqsbdjkqsgfhklqsmldjqsldknqs,;dnsqd;:qsd"

}

// const a = "qsdqsjdqs;,dnqs:;,dqs"

object Main extends App {

  def toto = "toto"

  val a = "a" // JS const
  var b = "b" // JS let - NE PAS UTILISER

  List(1, 2, 3).foldLeft(0)((acc, elem) => /* return */ acc + elem)


  def toot: String = {
    "dsfdf"

    "dfsdfsd"

    if (true) "toot" else "sdqsdq"
  }

}
