package rashjz.info.scala

import org.apache.spark.{SparkContext, SparkConf}

/**
  * Created by Rashad Javadov on 6/26/2017.
  */
object SparkDemo extends App {
  override def main(args: Array[String]) {
    val conf = new SparkConf() //define spark configuration
      .setMaster("local[*]") //set spark master as local
      .setAppName("Test Spark via Scala") //app name
      .set("spark.executor.memory", "2g") //setting executor memory size
    val sc = new SparkContext(conf) //executionStart point

    val lines = sc.parallelize(Seq("Ilkin setir qeyde alindi",
      "Ikinci setir qeyde alindi",
      "Ucuncu setir qeyde alindi"))
    val counts=lines.flatMap(line=>line.split(" "))
      .map(word => (word,1))
      .reduceByKey(_+_)
      counts.foreach(println)
  }
}
