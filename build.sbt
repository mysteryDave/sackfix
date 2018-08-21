import sbt.Keys.{libraryDependencies, _}

scalacOptions := Seq("-unchecked", "-deprecation")

// Multi project build file.  For val xxx = project, xxx is the name of the project and base dir
lazy val commonSettings = Seq(
	organization := "org.sackfix",
	version := "0.1.0",
	scalaVersion := "2.12.6",
	libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test",
	libraryDependencies += "com.typesafe" % "config" % "1.3.3"
//	coverageEnabled := true
)

lazy val sackfixcommon = (project in file("./sackfix-common")).
	settings(commonSettings: _*).
	settings(
		name := "sackfix-common"
	)

lazy val sackfixcodegen = (project in file("./sackfix-codegen")).
	dependsOn(sackfixcommon).
	settings(commonSettings: _*).
	settings(
		name := "sackfix-codegen",
  	libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.1.0",
		libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.1",
		libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "2.0.3"
	)

val sackfix = (project in file(".")).aggregate(sackfixcommon, sackfixcodegen)

