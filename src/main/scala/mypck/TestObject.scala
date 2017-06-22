package mypck

import scala.collection.mutable.ArrayBuffer
import scala.math._;

/**
  * Rashad Javadov
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


    def getsum(x: Int = 1, y: Int = 1): Int = return x + y

    print("\n getsum is " + getsum(12, 33))

    //play with string array
    val employees = ArrayBuffer[String]()
    employees.insert(0, "Rashad")
    employees.insert(1, "Malik")
    print("\n " + employees)

    //for each style
    for (emp <- employees)
      print("\n Employee : " + emp)

    //playing with  array of int
    val ages = new Array[Int](9)
    for (j <- 0 to (ages.length - 1)) {
      ages(j) = j
      print("\n age is " + ages(j))
    }

    //int array all multiply 2
    val ageMult2 = for (myage <- ages) yield 2 * myage
    ageMult2.foreach(println)
    
    //find values divided to 4
    val ageDiv4 = for (myage <- ages if myage % 4 == 0) yield myage
    ageDiv4.foreach(println)
  }
}
