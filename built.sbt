name := "scala"

version := "1.0"

scalaVersion := "2.12.5"

lazy val root = (project in file(".")).enablePlugins(JavaAppPackaging)

//rename zip file created from `dist` command
packageName in Universal := "scala"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"