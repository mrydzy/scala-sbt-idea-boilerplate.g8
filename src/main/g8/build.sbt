name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.0.M4" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
