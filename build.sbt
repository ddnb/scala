// General project settings
ThisBuild / organization := "com.lehungio"
ThisBuild / version := "3.0.0"
ThisBuild / scalaVersion := "3.3.3"
ThisBuild / versionScheme := Some("early-semver")

// Define project name
name := "Scala"

// GitHub Packages repository for publishing
publishTo := {
  val githubPackages = "https://maven.pkg.github.com/ddnb/scala"
  if (isSnapshot.value)
    Some("GitHub Packages Snapshots" at githubPackages + "-snapshots")
  else
    Some("GitHub Packages Releases" at githubPackages)
}

// Library dependencies
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % Test

// GihuHub Publish Packages dependency
// https://github.com/ddnb/scala/packages/2301314
// libraryDependencies += "com.lehungio" %% "scala" % "2.0.0"

// Credentials for GitHub Packages (from environment variables)
credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  sys.env.getOrElse("PUBLISHER_GITHUB_USERNAME", ""),
  sys.env.getOrElse("PUBLISHER_GITHUB_TOKEN", "") // https://docs.github.com/en/packages/learn-github-packages/publishing-a-package
)

resolvers += "GitHub Package Registry" at "https://maven.pkg.github.com/ddnb/scala"

// Set publishArtifact for packageDoc and packageSrc correctly using slash syntax
ThisBuild / Compile / packageDoc / publishArtifact := false
ThisBuild / Compile / packageSrc / publishArtifact := true

// Optional: Sign artifacts if required by GitHub Packages
// ThisBuild / useGpg := true