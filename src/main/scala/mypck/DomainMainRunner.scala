/**
  * Created by Rashad Javadov on 6/23/2017.
  */
package mypck

object DomainMainRunner {

  def main(args: Array[String]): Unit = {
    val dog = new Animal()
    dog.setId(0)
    dog.setSound("Bark")
    dog.setName("Bob1")

    print(dog.toString)
  }
}
