package mypck

import scala.math._;

/**
  * Created by rasha_000 on 6/20/2017.
  */
object TestObject extends App {

  print("Salam Resad ");
  val t1 = sqrt(16) + 2

  if (t1 > 6 && t1 < 6) {
    println(" t1 in not equal to 6")
  } else {
    println("t1  equals to " + t1)
  }

  override def main(args: Array[String]): Unit = {
    var i = 0
    while (i < 5) {
      print(i)
      i += 1
    }
  }
}
