// General project settings
ThisBuild / organization := "com.lehungio"
ThisBuild / version := "1.0.0-snapshots"
ThisBuild / scalaVersion := "3.3.3"
ThisBuild / versionScheme := Some("early-semver")

// Define project name
name := "ScalaChallenges"

// GitHub Packages repository for publishing
publishTo := {
  val githubPackages = "https://maven.pkg.github.com/lehungio/scala"
  if (isSnapshot.value)
    Some("GitHub Packages Snapshots" at githubPackages + "-snapshots")
  else
    Some("GitHub Packages Releases" at githubPackages)
}

// Library dependencies
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % Test

// Credentials for GitHub Packages (from environment variables)
credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  sys.env.getOrElse("GITHUB_USERNAME", ""),
  sys.env.getOrElse("GITHUB_TOKEN", "")
)

// Set publishArtifact for packageDoc and packageSrc correctly using slash syntax
ThisBuild / Compile / packageDoc / publishArtifact := false
ThisBuild / Compile / packageSrc / publishArtifact := true

// Optional: Sign artifacts if required by GitHub Packages
// ThisBuild / useGpg := true