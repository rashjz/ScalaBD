name := "scalaPro"

version := "1.0"

scalaVersion := "2.12.1"
// https://mvnrepository.com/artifact/org.scala-lang.modules/scala-async_2.11

libraryDependencies ++= Seq(
  "org.scala-js" %% "scalajs-test-interface" % "0.6.14",
  "org.scalatest" % "scalatest_2.12" % "3.0.1" % "test",
  "com.novocode" % "junit-interface" % "0.11",
  "org.scala-lang" % "scala-library" % scalaVersion.value,
  "org.scala-lang.modules" % "scala-async_2.12" % "0.9.6"
)