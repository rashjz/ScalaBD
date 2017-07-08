package rashjz.info.scala

import java.io.StringReader

import au.com.bytecode.opencsv.CSVReader
import org.apache.spark.{SparkConf, SparkContext}

import scala.io.Source

/**
  * Created by Rashad on 7/8/2017.
  */
object CVSReader {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf() //define spark configuration
      .setMaster("local") //set spark master as local
      .setAppName("ScalaBD") //app name
      .set("spark.executor.memory", "2g") //setting executor memory size
    val sc = new SparkContext(conf)

    //    val input = sc.wholeTextFiles("file://home/holden/salesFiles")
    //    val result = input.mapValues{y =>  val nums = y.split(" ").map(x => x.toDouble)  nums.sum / nums.size.toDouble }
    //    val input = sc.textFile(inputFile)
    //    val result = input.map{ line =>  val reader = new CSVReader(new StringReader(line));  reader.readNext(); }

    val content = Source.fromFile("C:\\Users\\rasha_000\\Desktop\\ScalaBD\\src\\main\\resources\\file.csv").getLines.map(_.split(";"))
    content.foreach(print)


  }
}
