package rashjz.info.scala

import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * Created by Rashad Javadov on 6/23/2017.
  */
object FileObject {

  def main(args: Array[String]) {

    fileWriter()

    /*
    Source.fromFile("Demo.txt").foreach {
      print
    }
    */
  }


  def fileWriter(): Unit = {
    val writer = new PrintWriter(new File("test.txt"))
    writer.write("Hello Scala")
    writer.close()
  }

  def consoleReader(): Unit = {
    //reading from console
    print("Please enter your input : ")
    val line = Console.readLine
    println("Thanks, you just typed: " + line)

  }
}
