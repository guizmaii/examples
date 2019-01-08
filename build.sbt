
organization := "com.guizmaii"
name := "examples"

version := "0.1"

scalaVersion := "2.12.8"

// Commentaire

def toto(int: Int): Int = int + 1

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.14.0" % Test,
  "org.scalactic"  %% "scalactic"  % "3.0.5" % Test
)
