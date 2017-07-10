package rashjz.info.scala

import java.io.StringReader
//import org.apache.spark.sql.hive.HiveContext
import au.com.bytecode.opencsv.CSVReader
import org.apache.spark.{SparkConf, SparkContext}

import scala.io.Source

/**
  * Created by Rashad on 7/8/2017.
  */
object CVSReader {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("App1").setMaster("local")
    val sc = new SparkContext(conf)
    val path = "C:\\Users\\rasha_000\\Desktop\\ScalaBD\\src\\main\\resources\\file.csv"
    val inputFile = sc.wholeTextFiles(path)
    /*
    //reading from csv file
    val content = Source.fromFile(path).getLines.map(_.split(";"))
    content.foreach(print)
    */
    val data = sc.parallelize(List(("Panda", 3), ("Kay", 6), ("Snail", 2), ("Snail", 7)))

    val linecounter = sc.accumulator(0) // Create an Accumulator[Int] initialized to 0
    data.foreach(line => linecounter += 1)

    print("Counted Lines is  " + linecounter)

    val snailCounters = sc.accumulator(0)
    data.foreach(line => if (line._1.equals("Snail")) {
      snailCounters += 1
    })
    print("Snails Counted Lines is  " + snailCounters)


    val csv = sc.textFile(path)
    val csvdata = csv.map(li => li.split(";").map(elem => elem.trim)) //lines in rows

    val broadcastVar = sc.broadcast(csvdata.collect())

    print(broadcastVar.value.foreach(line => line.foreach(l => print(l+"| ")) ))




    //    data.saveAsSequenceFile("C:\\Users\\rasha_000\\Desktop\\ScalaBD\\src\\main\\resources\\f1")

    //sql spark
    /*
    val hiveCtx = new org.apache.spark.sql.hive.HiveContext(sc)
    val rows = hiveCtx.sql("SELECT name, age FROM users")
    val firstRow = rows.first() println (firstRow.getString(0)) // Field 0 is the name
    */


  }
}
