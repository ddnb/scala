// import Dependencies._

// ThisBuild / scalaVersion     := "2.13.12"
// ThisBuild / version          := "0.1.0-SNAPSHOT"
// ThisBuild / organization     := "com.lehungio"
// ThisBuild / organizationName := "lehungio"
// ThisBuild / githubOwner      := "lehungio"
// ThisBuild / githubRepository := "scala"

// lazy val root = (project in file("."))
//   .settings(
//     name := "scala",
//     libraryDependencies += munit % Test
//   )

// // See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

ThisBuild / organization := "com.lehungio"
ThisBuild / version := "0.1.0"
ThisBuild / scalaVersion := "3.3.3"

// GitHub Packages repository
publishTo := Some("GitHub Packages" at "https://maven.pkg.github.com/lehungio/scala")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % Test

// Credentials for GitHub
credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  System.getenv("GITHUB_USERNAME"),
  System.getenv("GITHUB_TOKEN")
)
