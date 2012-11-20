name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$" 

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10.0-RC2" % "2.0.M5" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
