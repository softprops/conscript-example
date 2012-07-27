name := "conscript-example"

organization := "com.example"

version := "0.1.0-SNAPSHOT"

libraryDependencies <+= (sbtVersion)(
  "org.scala-sbt" %
   "launcher-interface" %
    _ % "provided")
