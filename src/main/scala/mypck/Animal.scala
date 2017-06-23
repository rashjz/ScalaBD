package mypck

/**
  * Created by Rashad Javadov on 6/23/2017.
  */
class Animal() {
  var id: Int = 0
  var name: String = ""
  var sound: String = ""

  def Animal(): Unit = {
    this.id = 0
    this.name = ""
    this.sound = ""
  }

  def getId(): Int = id

  def getName(): String = name

  def getSound: String = sound

  def setId(id: Int) {
    this.id = id
  }

  def setName(name: String) {
    if (name.matches(".*\\d+.*"))
      this.name = name
    else
      this.name = "No name"
  }

  def setSound(sound: String) {
    this.sound = sound
  }

  override def toString: String = {
    return " %s with the id %d say %s".format(this.name, this.id,this.sound)
  }

}
