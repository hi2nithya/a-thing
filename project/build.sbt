name := "project"

version := "1.0"

scalaVersion := "2.12.4"


val potassiumVersion = "0.1.0-21914cf9"
resolvers += "Funky-Repo" at "http://team846.github.io/repo"
libraryDependencies += "com.lynbrookrobotics" %% "potassium-core" % potassiumVersion

