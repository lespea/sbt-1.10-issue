lazy val root = project
  .in(file("."))
  .settings(
    name := "sbt10issue",
    version := "0.1.0",
    scalaVersion := "3.4.1",
    autoScalaLibrary := false,
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test
    )
  )
