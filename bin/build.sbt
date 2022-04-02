lazy val root = (project in file("."))
  .enablePlugins(PythonBuildPlugin)
  .settings(

  // Project name (artifact name in Maven)
  name := "(python-cli-sbt)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Python Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  mainClass := Some("main")
)
