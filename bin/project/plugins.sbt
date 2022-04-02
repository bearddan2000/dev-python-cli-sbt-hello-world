lazy val root = (project in file(".")).dependsOn(PythonBuildPlugin)
lazy val PythonBuildPlugin = ProjectRef(uri("https://github.com/s22s/sbt-python-build.git"), "root")
