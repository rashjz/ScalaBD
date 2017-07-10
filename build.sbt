name := "ScalaBD"

version := "1.0"

scalaVersion := "2.11.1"
// https://mvnrepository.com/artifact/org.scala-lang.modules/scala-async_2.11

libraryDependencies ++= Seq(
  "org.scala-js" %% "scalajs-test-interface" % "0.6.14",
  "org.scalatest" % "scalatest_2.11" % "2.1.3" % "test",
  "com.novocode" % "junit-interface" % "0.11",
  "org.scala-lang" % "scala-library" % scalaVersion.value,
  "org.scala-lang.modules" % "scala-async_2.11" % "0.9.6",
  "org.apache.spark" %% "spark-core" % "2.0.2",
  "net.sf.opencsv" % "opencsv" % "2.3"

)