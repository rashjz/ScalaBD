package rashjz.info.scala

import org.apache.spark.{SparkContext, SparkConf}

/**
  * Created by Rashad Javadov on 6/26/2017.
  */
object SparkDemo extends App {

  override def main(args: Array[String]) {

    val conf = new SparkConf() //define spark configuration
      .setMaster("local") //set spark master as local
      .setAppName("ScalaBD") //app name
      .set("spark.executor.memory", "2g") //setting executor memory size
    val sc = new SparkContext(conf) //executionStart point

    //    val lines = sc.parallelize(Seq("Ilkin setir qeyde alindi",
    //      "Ikinci setir qeyde alindi",
    //      "Ucuncu setir qeyde alindi"))

    val lines = sc.textFile("C:/Users/rasha_000/Desktop/ScalaBD/README.md");

    val counts = lines.flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)
    counts.foreach(println)

    val errorRdd = lines.filter(line => line.contains("ERROR"))
    println("Found ERROR on === " + errorRdd.count() + "  line")

   val newerrRDD= errorRdd.map(line => line.addString(new  StringBuilder(" :::::::::: ") ))
    newerrRDD.foreach(println)
    //save line to file
//    errorRdd.saveAsTextFile("C:/Users/rasha_000/Desktop/ScalaBD/data1.txt")

    // int values aggregate func scala example
    val input = sc.parallelize(List(1, 2, 3, 4))
    val result = input.aggregate((0, 0))(
      (acc, value) => (acc._1 + value, acc._2 + 1),
      (acc1, acc2) => (acc1._1 + acc2._1, acc1._2 + acc2._2)
    )
    val avg = result._1 / result._2.toDouble
    print("\n agg " + avg)
  }
}
