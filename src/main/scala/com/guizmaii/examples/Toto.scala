package com.guizmaii.examples

trait Encoder[A] /* <A> */  {
  def encode(a: A): String
}

final case class Person(name: String, age: Int, ami: Person)

object Person {

  // def toJson[A](implicit e: Encoder[A]) = ...

  // class PersoneEncoder implements Encoder[Person] {
  //   override def encode(a: Person): String = ...
  // }

  implicit val encoder: Encoder[Person] = new Encoder[Person] {
    override def encode(a: Person): String =
      s"""
        | {
        |   "name": "${a.name}",
        |   "age": ${a.age},
        | }
      """.stripMargin
  }

  // person1.toJson(Person.encoder)

}


class Klass(int: Int) {

  // static val a = "a"

  val a = "a"
  lazy val lazyA = "a"
  def defA = "a"

  def vieillir: Klass = new Klass(int + 1)

}

object Klass {

  val compA = "a"

  lazy val lazyCompA = "a"

  def f = "a"

}

object Main2 {
  val k = new Klass(1).a
  val k1 = new Klass(2).a
  val k2 = new Klass(3).a

  Klass.compA eq Klass.compA
}
