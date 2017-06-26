package rashjz.info.scala

import scala.collection.mutable.ArrayBuffer
import scala.math._;

/**
  * Rashad Javadov
  */
object StringTestObject extends App {

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

    //define multi type variable
    var specialRow = (1, "Rashad Javadov", 12.222)
    printf("\n %s has to pay $ %.2f \n", specialRow._2, specialRow._3)

  }
}
