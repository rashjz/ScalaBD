package rashjz.info.scala

/**
  * Created by Rashad Javadov on 6/22/17.
  */
object IntArrayObject {

  def main(args: Array[String]): Unit = {
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
