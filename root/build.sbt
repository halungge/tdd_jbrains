version := "0.2"

scalaVersion := "2.11.6"

exportJars := true

name := "tdd_jbrains"


resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.4" % "test",
	"org.halungge" %% "fraction" % "0.1.0-SNAPSHOT"
	)