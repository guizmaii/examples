package com.guizmaii.examples.api
import com.guizmaii.examples.{Encoder, Person}

final case class PersonRequest(names: List[String])
final case class PersonResponse(name: String, age: Int)

object PersonResponse {

  implicit val encoder: Encoder[PersonResponse] = new Encoder[PersonResponse] {
    override def encode(a: PersonResponse): String =
      s"""
         | {
         |   "name": "${a.name}",
         |   "age": ${a.age},
         | }
      """.stripMargin
  }

}

object MyDB {

  def person(name: String): Person = ???

}

object MyAPI {


  def getPerson(request: PersonRequest): List[PersonResponse] =
    request
      .names
      .map(s => MyDB.person(s))
      .map(person => PersonResponse(name = person.name, age = person.age)) // OUI !
      // .map(person => PersonResponse(person.name, person.age)) // NON !

}
