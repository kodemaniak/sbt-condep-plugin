sbtPlugin := true

organization := "com.samskivert"

name := "sbt-condep-plugin"

version := "1.2-SNAPSHOT"

publishMavenStyle := true

publishTo := Some(Resolver.file("Local", file("gh-pages") / "maven" asFile)(
  Patterns(true, Resolver.mavenStyleBasePattern)))

CrossBuilding.crossSbtVersions := Seq("0.11.0", "0.11.1", "0.11.2", "0.11.3")
