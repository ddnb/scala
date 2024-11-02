ThisBuild / organization := "com.lehungio"
ThisBuild / version := "0.1.0"
ThisBuild / scalaVersion := "3.3.3"

// Define project name
name := "ScalaChallenges"

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