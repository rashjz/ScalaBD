package rashjz.info.scala

/**
  * Created by rasha_000 on 6/25/2017.
  */
object RegexObject {
  def main(args: Array[String]) {
    val pattern = "(S|s)cala".r
    val str = "Scala is Scalable and cool"

    println(pattern findFirstIn str)
    println("\n"+(pattern findAllIn str).mkString(","))
    println("\n"+(pattern replaceAllIn (str, "Java")))
  }
}
