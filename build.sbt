
lazy val commonSettings = Seq(
organization := "org.halungge",
version := "0.1",
scalaVersion := "2.11.6"
)

lazy val fraction = project.in(file("fraction"))

lazy val root = project.in(file("root"))
	.settings(commonSettings:_*)
	



resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.4" % "test"
	)



