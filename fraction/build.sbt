name := "fraction"

organization      := "org.halungge"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.6"

exportJars := true

publishMavenStyle := true


resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.4" % "test"
	)